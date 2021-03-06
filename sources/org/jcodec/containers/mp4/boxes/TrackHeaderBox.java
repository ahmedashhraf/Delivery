package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.containers.mp4.TimeUtil;

public class TrackHeaderBox extends FullBox {
    private long altGroup;
    private long created;
    private long duration;
    private float height;
    private short layer;
    private int[] matrix;
    private long modified;
    private int trackId;
    private float volume;
    private float width;

    public TrackHeaderBox(int i, long j, float f, float f2, long j2, long j3, float f3, short s, long j4, int[] iArr) {
        super(new Header(fourcc()));
        this.trackId = i;
        this.duration = j;
        this.width = f;
        this.height = f2;
        this.created = j2;
        this.modified = j3;
        this.volume = f3;
        this.layer = s;
        this.altGroup = j4;
        this.matrix = iArr;
    }

    public static String fourcc() {
        return "tkhd";
    }

    private void readMatrix(ByteBuffer byteBuffer) {
        this.matrix = new int[9];
        for (int i = 0; i < 9; i++) {
            this.matrix[i] = byteBuffer.getInt();
        }
    }

    private float readVolume(ByteBuffer byteBuffer) {
        double d = (double) byteBuffer.getShort();
        Double.isNaN(d);
        return (float) (d / 256.0d);
    }

    private void writeMatrix(ByteBuffer byteBuffer) {
        for (int i = 0; i < 9; i++) {
            byteBuffer.putInt(this.matrix[i]);
        }
    }

    private void writeVolume(ByteBuffer byteBuffer) {
        double d = (double) this.volume;
        Double.isNaN(d);
        byteBuffer.putShort((short) ((int) (d * 256.0d)));
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putInt(TimeUtil.toMovTime(this.created));
        byteBuffer.putInt(TimeUtil.toMovTime(this.modified));
        byteBuffer.putInt(this.trackId);
        byteBuffer.putInt(0);
        byteBuffer.putInt((int) this.duration);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
        byteBuffer.putShort(this.layer);
        byteBuffer.putShort((short) ((int) this.altGroup));
        writeVolume(byteBuffer);
        byteBuffer.putShort(0);
        writeMatrix(byteBuffer);
        byteBuffer.putInt((int) (this.width * 65536.0f));
        byteBuffer.putInt((int) (this.height * 65536.0f));
    }

    public long getAltGroup() {
        return this.altGroup;
    }

    public long getCreated() {
        return this.created;
    }

    public long getDuration() {
        return this.duration;
    }

    public float getHeight() {
        return this.height;
    }

    public short getLayer() {
        return this.layer;
    }

    public int[] getMatrix() {
        return this.matrix;
    }

    public long getModified() {
        return this.modified;
    }

    public int getNo() {
        return this.trackId;
    }

    public int getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public float getWidth() {
        return this.width;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        if (this.version == 0) {
            this.created = TimeUtil.fromMovTime(byteBuffer.getInt());
            this.modified = TimeUtil.fromMovTime(byteBuffer.getInt());
        } else {
            this.created = TimeUtil.fromMovTime((int) byteBuffer.getLong());
            this.modified = TimeUtil.fromMovTime((int) byteBuffer.getLong());
        }
        this.trackId = byteBuffer.getInt();
        byteBuffer.getInt();
        if (this.version == 0) {
            this.duration = (long) byteBuffer.getInt();
        } else {
            this.duration = byteBuffer.getLong();
        }
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.layer = byteBuffer.getShort();
        this.altGroup = (long) byteBuffer.getShort();
        this.volume = readVolume(byteBuffer);
        byteBuffer.getShort();
        readMatrix(byteBuffer);
        this.width = ((float) byteBuffer.getInt()) / 65536.0f;
        this.height = ((float) byteBuffer.getInt()) / 65536.0f;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setNo(int i) {
        this.trackId = i;
    }

    public void setWidth(float f) {
        this.width = f;
    }

    public TrackHeaderBox() {
        super(new Header(fourcc()));
    }
}
