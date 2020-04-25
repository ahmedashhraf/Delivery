package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.NIOUtils;

public class TimecodeMediaInfoBox extends FullBox {
    private short[] bgcolor;
    private short[] color;
    private short face;
    private short font;
    private String name;
    private short size;

    public TimecodeMediaInfoBox(short s, short s2, short s3, short[] sArr, short[] sArr2, String str) {
        this(new Header(fourcc()));
        this.font = s;
        this.face = s2;
        this.size = s3;
        this.color = sArr;
        this.bgcolor = sArr2;
        this.name = str;
    }

    public static String fourcc() {
        return "tcmi";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.putShort(this.font);
        byteBuffer.putShort(this.face);
        byteBuffer.putShort(this.size);
        byteBuffer.putShort(0);
        byteBuffer.putShort(this.color[0]);
        byteBuffer.putShort(this.color[1]);
        byteBuffer.putShort(this.color[2]);
        byteBuffer.putShort(this.bgcolor[0]);
        byteBuffer.putShort(this.bgcolor[1]);
        byteBuffer.putShort(this.bgcolor[2]);
        NIOUtils.writePascalString(byteBuffer, this.name);
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.font = byteBuffer.getShort();
        this.face = byteBuffer.getShort();
        this.size = byteBuffer.getShort();
        byteBuffer.getShort();
        this.color[0] = byteBuffer.getShort();
        this.color[1] = byteBuffer.getShort();
        this.color[2] = byteBuffer.getShort();
        this.bgcolor[0] = byteBuffer.getShort();
        this.bgcolor[1] = byteBuffer.getShort();
        this.bgcolor[2] = byteBuffer.getShort();
        this.name = NIOUtils.readPascalString(byteBuffer);
    }

    public TimecodeMediaInfoBox(Header header) {
        super(header);
        this.color = new short[3];
        this.bgcolor = new short[3];
    }
}
