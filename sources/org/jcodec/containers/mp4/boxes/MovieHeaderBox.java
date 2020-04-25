package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;
import org.jcodec.containers.mp4.TimeUtil;

public class MovieHeaderBox extends FullBox {
    private long created;
    private long duration;
    private int[] matrix;
    private long modified;
    private int nextTrackId;
    private float rate;
    private int timescale;
    private float volume;

    public MovieHeaderBox(int i, long j, float f, float f2, long j2, long j3, int[] iArr, int i2) {
        super(new Header(fourcc()));
        this.timescale = i;
        this.duration = j;
        this.rate = f;
        this.volume = f2;
        this.created = j2;
        this.modified = j3;
        this.matrix = iArr;
        this.nextTrackId = i2;
    }

    public static String fourcc() {
        return "mvhd";
    }

    private int[] readMatrix(ByteBuffer byteBuffer) {
        int[] iArr = new int[9];
        for (int i = 0; i < 9; i++) {
            iArr[i] = byteBuffer.getInt();
        }
        return iArr;
    }

    private float readRate(ByteBuffer byteBuffer) {
        return ((float) byteBuffer.getInt()) / 65536.0f;
    }

    private float readVolume(ByteBuffer byteBuffer) {
        return ((float) byteBuffer.getShort()) / 256.0f;
    }

    private void writeFixed1616(ByteBuffer byteBuffer, float f) {
        double d = (double) f;
        Double.isNaN(d);
        byteBuffer.putInt((int) (d * 65536.0d));
    }

    private void writeFixed88(ByteBuffer byteBuffer, float f) {
        double d = (double) f;
        Double.isNaN(d);
        byteBuffer.putShort((short) ((int) (d * 256.0d)));
    }

    private void writeMatrix(ByteBuffer byteBuffer) {
        for (int i = 0; i < Math.min(9, this.matrix.length); i++) {
            byteBuffer.putInt(this.matrix[i]);
        }
        for (int min = Math.min(9, this.matrix.length); min < 9; min++) {
            byteBuffer.putInt(0);
        }
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(TimeUtil.toMovTime(this.created));
        byteBuffer.putInt(TimeUtil.toMovTime(this.modified));
        byteBuffer.putInt(this.timescale);
        byteBuffer.putInt((int) this.duration);
        writeFixed1616(byteBuffer, this.rate);
        writeFixed88(byteBuffer, this.volume);
        byteBuffer.put(new byte[10]);
        writeMatrix(byteBuffer);
        byteBuffer.put(new byte[24]);
        byteBuffer.putInt(this.nextTrackId);
    }

    public long getCreated() {
        return this.created;
    }

    public long getDuration() {
        return this.duration;
    }

    public int[] getMatrix() {
        return this.matrix;
    }

    public long getModified() {
        return this.modified;
    }

    public int getNextTrackId() {
        return this.nextTrackId;
    }

    public float getRate() {
        return this.rate;
    }

    public int getTimescale() {
        return this.timescale;
    }

    public float getVolume() {
        return this.volume;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        byte b = this.version;
        if (b == 0) {
            this.created = TimeUtil.fromMovTime(byteBuffer.getInt());
            this.modified = TimeUtil.fromMovTime(byteBuffer.getInt());
            this.timescale = byteBuffer.getInt();
            this.duration = (long) byteBuffer.getInt();
        } else if (b == 1) {
            this.created = TimeUtil.fromMovTime((int) byteBuffer.getLong());
            this.modified = TimeUtil.fromMovTime((int) byteBuffer.getLong());
            this.timescale = byteBuffer.getInt();
            this.duration = byteBuffer.getLong();
        } else {
            throw new RuntimeException("Unsupported version");
        }
        this.rate = readRate(byteBuffer);
        this.volume = readVolume(byteBuffer);
        NIOUtils.skip(byteBuffer, 10);
        this.matrix = readMatrix(byteBuffer);
        NIOUtils.skip(byteBuffer, 24);
        this.nextTrackId = byteBuffer.getInt();
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setNextTrackId(int i) {
        this.nextTrackId = i;
    }

    public void setTimescale(int i) {
        this.timescale = i;
    }

    public MovieHeaderBox() {
        super(new Header(fourcc()));
    }
}
