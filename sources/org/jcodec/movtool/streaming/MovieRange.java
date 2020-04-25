package org.jcodec.movtool.streaming;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;

public class MovieRange extends InputStream {
    private ByteBuffer chunkData;
    private int chunkNo;
    private VirtualMovie movie;
    private long remaining;

    public MovieRange(VirtualMovie virtualMovie, long j, long j2) throws IOException {
        if (j2 >= j) {
            this.movie = virtualMovie;
            MovieSegment packetAt = virtualMovie.getPacketAt(j);
            this.remaining = (j2 - j) + 1;
            if (packetAt != null) {
                this.chunkData = checkDataLen(packetAt.getData(), packetAt.getDataLen());
                this.chunkNo = packetAt.getNo();
                NIOUtils.skip(this.chunkData, (int) (j - packetAt.getPos()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("from < to");
    }

    static ByteBuffer checkDataLen(ByteBuffer byteBuffer, int i) throws IOException {
        String str = "WARN: packet expected data len != actual data len ";
        if (byteBuffer == null) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            sb.append(" != 0");
            printStream.println(sb.toString());
            return ByteBuffer.allocate(i);
        }
        if (byteBuffer.remaining() != i) {
            PrintStream printStream2 = System.err;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i);
            sb2.append(" != ");
            sb2.append(byteBuffer.remaining());
            printStream2.println(sb2.toString());
            int max = Math.max(0, i);
            if (max < byteBuffer.remaining() || byteBuffer.capacity() - byteBuffer.position() >= max) {
                byteBuffer.limit(byteBuffer.position() + max);
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(max);
                allocate.put(byteBuffer);
                allocate.clear();
                return allocate;
            }
        }
        return byteBuffer;
    }

    private void tryFetch() throws IOException {
        ByteBuffer byteBuffer = this.chunkData;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            MovieSegment packetByNo = this.movie.getPacketByNo(this.chunkNo + 1);
            if (packetByNo != null) {
                this.chunkData = checkDataLen(packetByNo.getData(), packetByNo.getDataLen());
                this.chunkNo = packetByNo.getNo();
                return;
            }
            this.chunkData = null;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        tryFetch();
        if (this.chunkData != null) {
            long j = this.remaining;
            if (j != 0) {
                int min = (int) Math.min(j, (long) i2);
                int i3 = 0;
                while (min > 0) {
                    int min2 = Math.min(this.chunkData.remaining(), min);
                    this.chunkData.get(bArr, i, min2);
                    i3 += min2;
                    min -= min2;
                    i += min2;
                    tryFetch();
                    if (this.chunkData == null) {
                        break;
                    }
                }
                this.remaining -= (long) i3;
                return i3;
            }
        }
        return -1;
    }

    public int read() throws IOException {
        tryFetch();
        ByteBuffer byteBuffer = this.chunkData;
        if (byteBuffer != null) {
            long j = this.remaining;
            if (j != 0) {
                this.remaining = j - 1;
                return byteBuffer.get() & 255;
            }
        }
        return -1;
    }
}
