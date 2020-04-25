package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jcodec.common.Assert;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.Tuple;
import org.jcodec.common.Tuple.C15538_2;
import org.jcodec.common.Tuple.Mapper;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Atom;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.BoxFactory;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieFragmentBox;
import org.jcodec.containers.mp4.boxes.NodeBox;

public class InplaceMP4Editor {

    /* renamed from: org.jcodec.movtool.InplaceMP4Editor$a */
    class C15571a implements Mapper<Atom, Long> {
        C15571a() {
        }

        /* renamed from: a */
        public Long map(Atom atom) {
            return Long.valueOf(atom.getOffset());
        }
    }

    private List<C15538_2<Atom, ByteBuffer>> doTheFix(SeekableByteChannel seekableByteChannel, MP4Edit mP4Edit) throws IOException {
        Atom moov = getMoov(seekableByteChannel);
        Assert.assertNotNull(moov);
        ByteBuffer fetchBox = fetchBox(seekableByteChannel, moov);
        MovieBox movieBox = (MovieBox) parseBox(fetchBox);
        LinkedList linkedList = new LinkedList();
        if (Box.findFirst(movieBox, "mvex") != null) {
            LinkedList<C15538_2> linkedList2 = new LinkedList<>();
            for (Atom atom : getFragments(seekableByteChannel)) {
                ByteBuffer fetchBox2 = fetchBox(seekableByteChannel, atom);
                linkedList.add(Tuple.m68660_2(atom, fetchBox2));
                MovieFragmentBox movieFragmentBox = (MovieFragmentBox) parseBox(fetchBox2);
                movieFragmentBox.setMovie(movieBox);
                linkedList2.add(Tuple.m68660_2(fetchBox2, movieFragmentBox));
            }
            mP4Edit.apply(movieBox, (MovieFragmentBox[]) Tuple._2_project1(linkedList2).toArray(new MovieFragmentBox[0]));
            for (C15538_2 _2 : linkedList2) {
                if (!rewriteBox((ByteBuffer) _2.f44796v0, (Box) _2.f44797v1)) {
                    return null;
                }
            }
        } else {
            mP4Edit.apply(movieBox);
        }
        if (!rewriteBox(fetchBox, movieBox)) {
            return null;
        }
        linkedList.add(Tuple.m68660_2(moov, fetchBox));
        return linkedList;
    }

    private ByteBuffer fetchBox(SeekableByteChannel seekableByteChannel, Atom atom) throws IOException {
        seekableByteChannel.position(atom.getOffset());
        return NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) atom.getHeader().getSize());
    }

    private List<Atom> getFragments(SeekableByteChannel seekableByteChannel) throws IOException {
        LinkedList linkedList = new LinkedList();
        for (Atom atom : MP4Util.getRootAtoms(seekableByteChannel)) {
            if ("moof".equals(atom.getHeader().getFourcc())) {
                linkedList.add(atom);
            }
        }
        return linkedList;
    }

    private Atom getMoov(SeekableByteChannel seekableByteChannel) throws IOException {
        for (Atom atom : MP4Util.getRootAtoms(seekableByteChannel)) {
            if ("moov".equals(atom.getHeader().getFourcc())) {
                return atom;
            }
        }
        return null;
    }

    private Box parseBox(ByteBuffer byteBuffer) {
        return NodeBox.parseBox(byteBuffer, Header.read(byteBuffer), BoxFactory.getDefault());
    }

    private void replaceBox(SeekableByteChannel seekableByteChannel, Atom atom, ByteBuffer byteBuffer) throws IOException {
        seekableByteChannel.position(atom.getOffset());
        seekableByteChannel.write(byteBuffer);
    }

    private boolean rewriteBox(ByteBuffer byteBuffer, Box box) {
        try {
            byteBuffer.clear();
            box.write(byteBuffer);
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() < 8) {
                    return false;
                }
                byteBuffer.putInt(byteBuffer.remaining());
                byteBuffer.put(new byte[]{102, 114, 101, 101});
            }
            byteBuffer.flip();
            return true;
        } catch (BufferOverflowException unused) {
            return false;
        }
    }

    public boolean copy(File file, File file2, MP4Edit mP4Edit) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        boolean z;
        FileChannelWrapper fileChannelWrapper2 = null;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(file);
            try {
                fileChannelWrapper2 = NIOUtils.writableFileChannel(file2);
                List doTheFix = doTheFix(fileChannelWrapper, mP4Edit);
                if (doTheFix == null) {
                    z = false;
                } else {
                    Map asMap = Tuple.asMap((Iterable<C15538_2<T0, T1>>) Tuple._2map0(doTheFix, new C15571a()));
                    for (Atom atom : MP4Util.getRootAtoms(fileChannelWrapper)) {
                        ByteBuffer byteBuffer = (ByteBuffer) asMap.get(Long.valueOf(atom.getOffset()));
                        if (byteBuffer != null) {
                            fileChannelWrapper2.write(byteBuffer);
                        } else {
                            atom.copy(fileChannelWrapper, fileChannelWrapper2);
                        }
                    }
                    z = true;
                }
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
                return z;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
            throw th;
        }
    }

    public boolean modify(File file, MP4Edit mP4Edit) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        boolean z;
        try {
            fileChannelWrapper = NIOUtils.rwFileChannel(file);
            try {
                List<C15538_2> doTheFix = doTheFix(fileChannelWrapper, mP4Edit);
                if (doTheFix == null) {
                    z = false;
                } else {
                    for (C15538_2 _2 : doTheFix) {
                        replaceBox(fileChannelWrapper, (Atom) _2.f44796v0, (ByteBuffer) _2.f44797v1);
                    }
                    z = true;
                }
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                return z;
            } catch (Throwable th) {
                th = th;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileChannelWrapper = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            throw th;
        }
    }

    public boolean replace(File file, MP4Edit mP4Edit) throws IOException {
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(file.getName());
        File file2 = new File(parentFile, sb.toString());
        if (!copy(file, file2, mP4Edit)) {
            return false;
        }
        file2.renameTo(file);
        return true;
    }
}
