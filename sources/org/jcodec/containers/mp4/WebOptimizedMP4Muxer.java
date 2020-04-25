package org.jcodec.containers.mp4;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.logging.Logger;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsets64Box;
import org.jcodec.containers.mp4.boxes.ChunkOffsetsBox;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.SampleToChunkBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.muxer.MP4Muxer;

public class WebOptimizedMP4Muxer extends MP4Muxer {
    private ByteBuffer header;
    private long headerPos;

    public WebOptimizedMP4Muxer(SeekableByteChannel seekableByteChannel, Brand brand, int i) throws IOException {
        super(seekableByteChannel, brand);
        this.headerPos = seekableByteChannel.position() - 24;
        seekableByteChannel.position(this.headerPos);
        this.header = ByteBuffer.allocate(i);
        seekableByteChannel.write(this.header);
        this.header.clear();
        new Header("wide", 8).write(seekableByteChannel);
        new Header("mdat", 1).write(seekableByteChannel);
        this.mdatOffset = seekableByteChannel.position();
        NIOUtils.writeLong(seekableByteChannel, 0);
    }

    public static WebOptimizedMP4Muxer withOldHeader(SeekableByteChannel seekableByteChannel, Brand brand, MovieBox movieBox) throws IOException {
        int i;
        int i2;
        int size = (int) movieBox.getHeader().getSize();
        TrakBox videoTrack = movieBox.getVideoTrack();
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        int length = (size - (((SampleToChunkBox) Box.findFirst(videoTrack, SampleToChunkBox.class, str, str2, str3, "stsc")).getSampleToChunk().length * 12)) + 12;
        ChunkOffsetsBox chunkOffsetsBox = (ChunkOffsetsBox) Box.findFirst(videoTrack, ChunkOffsetsBox.class, str, str2, str3, "stco");
        if (chunkOffsetsBox != null) {
            i2 = length - (chunkOffsetsBox.getChunkOffsets().length << 2);
            i = videoTrack.getFrameCount();
        } else {
            i2 = length - (((ChunkOffsets64Box) Box.findFirst(videoTrack, ChunkOffsets64Box.class, str, str2, str3, "co64")).getChunkOffsets().length << 3);
            i = videoTrack.getFrameCount();
        }
        int i3 = i2 + (i << 3);
        return new WebOptimizedMP4Muxer(seekableByteChannel, brand, i3 + (i3 >> 1));
    }

    public void storeHeader(MovieBox movieBox) throws IOException {
        String str = "free";
        long position = this.out.position();
        long j = this.mdatOffset;
        long j2 = (position - j) + 8;
        this.out.position(j);
        NIOUtils.writeLong(this.out, j2);
        this.out.position(this.headerPos);
        try {
            movieBox.write(this.header);
            this.header.flip();
            int capacity = this.header.capacity() - this.header.limit();
            if (capacity < 8) {
                this.header.duplicate().putInt(this.header.capacity());
            }
            this.out.write(this.header);
            if (capacity >= 8) {
                new Header(str, (long) capacity).write(this.out);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            Logger.warn("Could not web-optimize, header is bigger then allocated space.");
            new Header(str, (long) this.header.remaining()).write(this.out);
            this.out.position(position);
            MP4Util.writeMovie(this.out, movieBox);
        }
    }
}
