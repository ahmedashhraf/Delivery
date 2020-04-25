package org.jcodec.containers.mp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.jcodec.common.Codec;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.BoxFactory;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieFragmentBox;
import org.jcodec.containers.mp4.boxes.NodeBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class MP4Util {
    private static Map<Codec, String> codecMapping = new HashMap();

    public static class Atom {
        private Header header;
        private long offset;

        public Atom(Header header2, long j) {
            this.header = header2;
            this.offset = j;
        }

        public void copy(SeekableByteChannel seekableByteChannel, WritableByteChannel writableByteChannel) throws IOException {
            seekableByteChannel.position(this.offset);
            NIOUtils.copy(seekableByteChannel, writableByteChannel, this.header.getSize());
        }

        public Header getHeader() {
            return this.header;
        }

        public long getOffset() {
            return this.offset;
        }

        public Box parseBox(SeekableByteChannel seekableByteChannel) throws IOException {
            seekableByteChannel.position(this.offset + this.header.headerSize());
            return NodeBox.parseBox(NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) this.header.getSize()), this.header, BoxFactory.getDefault());
        }
    }

    static {
        codecMapping.put(Codec.MPEG2, "m2v1");
        codecMapping.put(Codec.H264, "avc1");
        codecMapping.put(Codec.J2K, "mjp2");
    }

    public static Atom atom(SeekableByteChannel seekableByteChannel) throws IOException {
        long position = seekableByteChannel.position();
        Header read = Header.read(NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, 16));
        if (read == null) {
            return null;
        }
        return new Atom(read, position);
    }

    public static Box cloneBox(Box box, int i) {
        return cloneBox(box, i, BoxFactory.getDefault());
    }

    public static MovieBox createRefMovie(SeekableByteChannel seekableByteChannel, String str) throws IOException {
        MovieBox parseMovie = parseMovie(seekableByteChannel);
        for (TrakBox dataRef : parseMovie.getTracks()) {
            dataRef.setDataRef(str);
        }
        return parseMovie;
    }

    public static String getFourcc(Codec codec) {
        return (String) codecMapping.get(codec);
    }

    public static List<Atom> getRootAtoms(SeekableByteChannel seekableByteChannel) throws IOException {
        long j = 0;
        seekableByteChannel.position(0);
        ArrayList arrayList = new ArrayList();
        while (j < seekableByteChannel.size()) {
            seekableByteChannel.position(j);
            Header read = Header.read(NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, 16));
            if (read == null) {
                break;
            }
            arrayList.add(new Atom(read, j));
            j += read.getSize();
        }
        return arrayList;
    }

    public static MovieBox parseMovie(SeekableByteChannel seekableByteChannel) throws IOException {
        for (Atom atom : getRootAtoms(seekableByteChannel)) {
            if ("moov".equals(atom.getHeader().getFourcc())) {
                return (MovieBox) atom.parseBox(seekableByteChannel);
            }
        }
        return null;
    }

    public static List<MovieFragmentBox> parseMovieFragments(SeekableByteChannel seekableByteChannel) throws IOException {
        LinkedList linkedList = new LinkedList();
        MovieBox movieBox = null;
        for (Atom atom : getRootAtoms(seekableByteChannel)) {
            if ("moov".equals(atom.getHeader().getFourcc())) {
                movieBox = (MovieBox) atom.parseBox(seekableByteChannel);
            } else {
                if ("moof".equalsIgnoreCase(atom.getHeader().getFourcc())) {
                    linkedList.add((MovieFragmentBox) atom.parseBox(seekableByteChannel));
                }
            }
        }
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((MovieFragmentBox) it.next()).setMovie(movieBox);
        }
        return linkedList;
    }

    public static ByteBuffer writeBox(Box box, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        box.write(allocate);
        allocate.flip();
        return allocate;
    }

    public static void writeMovie(File file, MovieBox movieBox) throws IOException {
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileInputStream(file).getChannel();
            writeMovie(file, movieBox);
        } finally {
            fileChannel.close();
        }
    }

    public static Box cloneBox(Box box, int i, BoxFactory boxFactory) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        box.write(allocate);
        allocate.flip();
        return NodeBox.parseChildBox(allocate, boxFactory);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jcodec.containers.mp4.boxes.MovieBox createRefMovie(java.io.File r3) throws java.io.IOException {
        /*
            org.jcodec.common.FileChannelWrapper r0 = org.jcodec.common.NIOUtils.readableFileChannel(r3)     // Catch:{ all -> 0x0025 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            r1.<init>()     // Catch:{ all -> 0x0023 }
            java.lang.String r2 = "file://"
            r1.append(r2)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r3.getCanonicalPath()     // Catch:{ all -> 0x0023 }
            r1.append(r3)     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0023 }
            org.jcodec.containers.mp4.boxes.MovieBox r3 = createRefMovie(r0, r3)     // Catch:{ all -> 0x0023 }
            if (r0 == 0) goto L_0x0022
            r0.close()
        L_0x0022:
            return r3
        L_0x0023:
            r3 = move-exception
            goto L_0x0027
        L_0x0025:
            r3 = move-exception
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            r0.close()
        L_0x002c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.MP4Util.createRefMovie(java.io.File):org.jcodec.containers.mp4.boxes.MovieBox");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.jcodec.containers.mp4.boxes.MovieBox parseMovie(java.io.File r1) throws java.io.IOException {
        /*
            org.jcodec.common.FileChannelWrapper r1 = org.jcodec.common.NIOUtils.readableFileChannel(r1)     // Catch:{ all -> 0x0010 }
            org.jcodec.containers.mp4.boxes.MovieBox r0 = parseMovie(r1)     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x000d
            r1.close()
        L_0x000d:
            return r0
        L_0x000e:
            r0 = move-exception
            goto L_0x0012
        L_0x0010:
            r0 = move-exception
            r1 = 0
        L_0x0012:
            if (r1 == 0) goto L_0x0017
            r1.close()
        L_0x0017:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.MP4Util.parseMovie(java.io.File):org.jcodec.containers.mp4.boxes.MovieBox");
    }

    public static void writeMovie(SeekableByteChannel seekableByteChannel, MovieBox movieBox) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(16777216);
        movieBox.write(allocate);
        allocate.flip();
        seekableByteChannel.write(allocate);
    }
}
