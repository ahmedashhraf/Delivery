package org.jcodec.codecs.y4m;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.ReadableByteChannel;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.StringUtils;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;

public class Y4MDecoder {
    private int bufSize;
    private Rational fps;
    private int height;
    private String invalidFormat;

    /* renamed from: is */
    private FileChannel f44791is;
    private int width;

    public Y4MDecoder(SeekableByteChannel seekableByteChannel) throws IOException {
        ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, 2048);
        String[] split = StringUtils.split(readLine(fetchFrom), ' ');
        if (!"YUV4MPEG2".equals(split[0])) {
            this.invalidFormat = "Not yuv4mpeg stream";
            return;
        }
        String find = find(split, 'C');
        if (find == null || find.startsWith("420")) {
            this.width = Integer.parseInt(find(split, 'W'));
            this.height = Integer.parseInt(find(split, 'H'));
            String find2 = find(split, 'F');
            if (find2 != null) {
                String[] split2 = StringUtils.split(find2, ':');
                this.fps = new Rational(Integer.parseInt(split2[0]), Integer.parseInt(split2[1]));
            }
            seekableByteChannel.position((long) fetchFrom.position());
            this.bufSize = this.width * this.height * 2;
            return;
        }
        this.invalidFormat = "Only yuv420p is supported";
    }

    private static String find(String[] strArr, char c) {
        for (String str : strArr) {
            if (str.charAt(0) == c) {
                return str.substring(1);
            }
        }
        return null;
    }

    private static String readLine(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (byteBuffer.hasRemaining()) {
            if (byteBuffer.get() == 10) {
                break;
            }
        }
        if (byteBuffer.hasRemaining()) {
            duplicate.limit(byteBuffer.position() - 1);
        }
        return new String(NIOUtils.toArray(duplicate));
    }

    /* access modifiers changed from: 0000 */
    public void copy(ByteBuffer byteBuffer, int[] iArr) {
        int i = 0;
        while (byteBuffer.hasRemaining()) {
            iArr[i] = byteBuffer.get() & 255;
            i++;
        }
    }

    public Rational getFps() {
        return this.fps;
    }

    public int getHeight() {
        return this.height;
    }

    public Size getSize() {
        return new Size(this.width, this.height);
    }

    public int getWidth() {
        return this.width;
    }

    public Picture nextFrame(int[][] iArr) throws IOException {
        if (this.invalidFormat == null) {
            long position = this.f44791is.position();
            ByteBuffer fetchFrom = NIOUtils.fetchFrom((ReadableByteChannel) this.f44791is, 2048);
            String readLine = readLine(fetchFrom);
            if (readLine == null || !readLine.startsWith("FRAME")) {
                return null;
            }
            MappedByteBuffer map = this.f44791is.map(MapMode.READ_ONLY, ((long) fetchFrom.position()) + position, (long) this.bufSize);
            this.f44791is.position(position + ((long) fetchFrom.position()) + ((long) this.bufSize));
            Picture create = Picture.create(this.width, this.height, ColorSpace.YUV420);
            copy(map, create.getPlaneData(0));
            copy(map, create.getPlaneData(1));
            copy(map, create.getPlaneData(2));
            return create;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid input: ");
        sb.append(this.invalidFormat);
        throw new RuntimeException(sb.toString());
    }
}
