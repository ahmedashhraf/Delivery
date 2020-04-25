package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.Chunk;
import org.jcodec.containers.mp4.ChunkReader;
import org.jcodec.containers.mp4.ChunkWriter;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.boxes.AliasBox;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.DataRefBox;
import org.jcodec.containers.mp4.boxes.FileTypeBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.boxes.UrlBox;

public class Flattern {
    public List<ProgressListener> listeners = new ArrayList();

    public interface ProgressListener {
        void trigger(int i);
    }

    private int calcProgress(int i, int i2, int i3) {
        int i4 = (i2 * 100) / i;
        if (i3 >= i4) {
            return i3;
        }
        for (ProgressListener trigger : this.listeners) {
            trigger.trigger(i4);
        }
        return i4;
    }

    private int calcSpaceReq(MovieBox movieBox) {
        int i = 0;
        for (TrakBox findFirst : movieBox.getTracks()) {
            ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(findFirst, ChunkOffsetsBox.class, "mdia", "minf", "stbl", "stco");
            if (chunkOffsetsBox != null) {
                i += chunkOffsetsBox.getChunkOffsets().length * 4;
            }
        }
        return i;
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 2) {
            System.out.println("Syntax: self <ref movie> <out movie>");
            System.exit(-1);
        }
        File file = new File(strArr[1]);
        file.delete();
        FileChannelWrapper fileChannelWrapper = null;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(new File(strArr[0]));
            new Flattern().flattern(MP4Util.parseMovie((SeekableByteChannel) fileChannelWrapper), file);
        } finally {
            if (fileChannelWrapper != null) {
                fileChannelWrapper.close();
            }
        }
    }

    public void addProgressListener(ProgressListener progressListener) {
        this.listeners.add(progressListener);
    }

    public void flattern(MovieBox movieBox, SeekableByteChannel seekableByteChannel) throws IOException {
        long j;
        ChunkWriter[] chunkWriterArr;
        ChunkWriter[] chunkWriterArr2;
        ChunkReader[] chunkReaderArr;
        long j2;
        int i;
        int i2;
        SeekableByteChannel[][] seekableByteChannelArr;
        MovieBox movieBox2 = movieBox;
        SeekableByteChannel seekableByteChannel2 = seekableByteChannel;
        if (movieBox2.isPureRefMovie(movieBox2)) {
            ByteBuffer allocate = ByteBuffer.allocate(16777216);
            String str = "qt  ";
            new FileTypeBox(str, 537199360, Arrays.asList(new String[]{str})).write(allocate);
            long position = (long) allocate.position();
            movieBox2.write(allocate);
            int calcSpaceReq = calcSpaceReq(movieBox);
            new Header("free", (long) (calcSpaceReq + 8)).write(allocate);
            NIOUtils.skip(allocate, calcSpaceReq);
            long position2 = (long) allocate.position();
            new Header("mdat", 4294967297L).write(allocate);
            allocate.flip();
            seekableByteChannel2.write(allocate);
            SeekableByteChannel[][] inputs = getInputs(movieBox);
            TrakBox[] tracks = movieBox.getTracks();
            ChunkReader[] chunkReaderArr2 = new ChunkReader[tracks.length];
            ChunkWriter[] chunkWriterArr3 = new ChunkWriter[tracks.length];
            Chunk[] chunkArr = new Chunk[tracks.length];
            long[] jArr = new long[tracks.length];
            int i3 = 0;
            int i4 = 0;
            while (i3 < tracks.length) {
                chunkReaderArr2[i3] = new ChunkReader(tracks[i3]);
                int size = i4 + chunkReaderArr2[i3].size();
                chunkWriterArr3[i3] = new ChunkWriter(tracks[i3], inputs[i3], seekableByteChannel2);
                chunkArr[i3] = chunkReaderArr2[i3].next();
                if (tracks[i3].isVideo()) {
                    seekableByteChannelArr = inputs;
                    jArr[i3] = (long) (movieBox.getTimescale() * 2);
                } else {
                    seekableByteChannelArr = inputs;
                }
                i3++;
                seekableByteChannel2 = seekableByteChannel;
                inputs = seekableByteChannelArr;
                i4 = size;
            }
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = 0;
                int i8 = -1;
                while (i7 < chunkReaderArr2.length) {
                    if (chunkArr[i7] == null) {
                        i2 = i5;
                        i = i6;
                        j2 = position;
                        chunkReaderArr = chunkReaderArr2;
                        chunkWriterArr2 = chunkWriterArr3;
                    } else {
                        if (i8 == -1) {
                            i2 = i5;
                            i = i6;
                            j2 = position;
                            chunkReaderArr = chunkReaderArr2;
                            chunkWriterArr2 = chunkWriterArr3;
                        } else {
                            i2 = i5;
                            i = i6;
                            j2 = position;
                            chunkReaderArr = chunkReaderArr2;
                            chunkWriterArr2 = chunkWriterArr3;
                            if (movieBox2.rescale(chunkArr[i7].getStartTv(), (long) tracks[i7].getTimescale()) + jArr[i7] >= movieBox2.rescale(chunkArr[i8].getStartTv(), (long) tracks[i8].getTimescale()) + jArr[i8]) {
                            }
                        }
                        i8 = i7;
                    }
                    i7++;
                    i5 = i2;
                    i6 = i;
                    position = j2;
                    chunkReaderArr2 = chunkReaderArr;
                    chunkWriterArr3 = chunkWriterArr2;
                }
                int i9 = i5;
                int i10 = i6;
                j = position;
                ChunkReader[] chunkReaderArr3 = chunkReaderArr2;
                chunkWriterArr = chunkWriterArr3;
                if (i8 == -1) {
                    break;
                }
                SeekableByteChannel seekableByteChannel3 = seekableByteChannel;
                long j3 = j;
                chunkWriterArr[i8].write(chunkArr[i8]);
                chunkArr[i8] = chunkReaderArr3[i8].next();
                int i11 = i9 + 1;
                i5 = i11;
                position = j3;
                i6 = calcProgress(i4, i11, i10);
                chunkReaderArr2 = chunkReaderArr3;
                chunkWriterArr3 = chunkWriterArr;
            }
            long position3 = seekableByteChannel.position() - position2;
            for (int i12 = 0; i12 < tracks.length; i12++) {
                chunkWriterArr[i12].apply();
            }
            SeekableByteChannel seekableByteChannel4 = seekableByteChannel;
            seekableByteChannel4.position(j);
            MP4Util.writeMovie(seekableByteChannel4, movieBox2);
            long position4 = position2 - seekableByteChannel.position();
            if (position4 >= 0) {
                seekableByteChannel4.write((ByteBuffer) ByteBuffer.allocate(8).putInt((int) position4).put(new byte[]{102, 114, 101, 101}).flip());
                seekableByteChannel4.position(position2 + 8);
                seekableByteChannel4.write(ByteBuffer.allocate(8).putLong(position3));
                return;
            }
            throw new RuntimeException("Not enough space to write the header");
        }
        throw new IllegalArgumentException("movie should be reference");
    }

    /* access modifiers changed from: protected */
    public SeekableByteChannel[][] getInputs(MovieBox movieBox) throws IOException {
        TrakBox[] tracks = movieBox.getTracks();
        SeekableByteChannel[][] seekableByteChannelArr = new SeekableByteChannel[tracks.length][];
        int i = 0;
        while (i < tracks.length) {
            DataRefBox dataRefBox = (DataRefBox) Box.findFirst(tracks[i], DataRefBox.class, "mdia", "minf", "dinf", "dref");
            if (dataRefBox != null) {
                List boxes = dataRefBox.getBoxes();
                SeekableByteChannel[] seekableByteChannelArr2 = new SeekableByteChannel[boxes.size()];
                SeekableByteChannel[] seekableByteChannelArr3 = new SeekableByteChannel[boxes.size()];
                for (int i2 = 0; i2 < seekableByteChannelArr2.length; i2++) {
                    seekableByteChannelArr3[i2] = resolveDataRef((Box) boxes.get(i2));
                }
                seekableByteChannelArr[i] = seekableByteChannelArr3;
                i++;
            } else {
                throw new RuntimeException("No data references");
            }
        }
        return seekableByteChannelArr;
    }

    public SeekableByteChannel resolveDataRef(Box box) throws IOException {
        if (box instanceof UrlBox) {
            String url = ((UrlBox) box).getUrl();
            if (url.startsWith("file://")) {
                return NIOUtils.readableFileChannel(new File(url.substring(7)));
            }
            throw new RuntimeException("Only file:// urls are supported in data reference");
        } else if (box instanceof AliasBox) {
            String unixPath = ((AliasBox) box).getUnixPath();
            if (unixPath != null) {
                return NIOUtils.readableFileChannel(new File(unixPath));
            }
            throw new RuntimeException("Could not resolve alias");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(box.getHeader().getFourcc());
            sb.append(" dataref type is not supported");
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void flattern(org.jcodec.containers.mp4.boxes.MovieBox r1, java.io.File r2) throws java.io.IOException {
        /*
            r0 = this;
            r2.delete()
            org.jcodec.common.FileChannelWrapper r2 = org.jcodec.common.NIOUtils.writableFileChannel(r2)     // Catch:{ all -> 0x0012 }
            r0.flattern(r1, r2)     // Catch:{ all -> 0x0010 }
            if (r2 == 0) goto L_0x000f
            r2.close()
        L_0x000f:
            return
        L_0x0010:
            r1 = move-exception
            goto L_0x0014
        L_0x0012:
            r1 = move-exception
            r2 = 0
        L_0x0014:
            if (r2 == 0) goto L_0x0019
            r2.close()
        L_0x0019:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.Flattern.flattern(org.jcodec.containers.mp4.boxes.MovieBox, java.io.File):void");
    }
}
