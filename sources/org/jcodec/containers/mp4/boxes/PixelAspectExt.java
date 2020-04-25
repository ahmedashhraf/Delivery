package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.model.Rational;

public class PixelAspectExt extends Box {
    private int hSpacing;
    private int vSpacing;

    public PixelAspectExt(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "pasp";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(this.hSpacing);
        byteBuffer.putInt(this.vSpacing);
    }

    public Rational getRational() {
        return new Rational(this.hSpacing, this.vSpacing);
    }

    public int gethSpacing() {
        return this.hSpacing;
    }

    public int getvSpacing() {
        return this.vSpacing;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.hSpacing = byteBuffer.getInt();
        this.vSpacing = byteBuffer.getInt();
    }

    public PixelAspectExt() {
        super(new Header(fourcc()));
    }

    public PixelAspectExt(Rational rational) {
        this();
        this.hSpacing = rational.getNum();
        this.vSpacing = rational.getDen();
    }
}
