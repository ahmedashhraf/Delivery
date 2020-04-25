package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;

public class HandlerBox extends FullBox {
    private int componentFlags;
    private int componentFlagsMask;
    private String componentManufacturer;
    private String componentName;
    private String componentSubType;
    private String componentType;

    public HandlerBox(String str, String str2, String str3, int i, int i2) {
        super(new Header("hdlr"));
        this.componentType = str;
        this.componentSubType = str2;
        this.componentManufacturer = str3;
        this.componentFlags = i;
        this.componentFlagsMask = i2;
        this.componentName = "";
    }

    public static String fourcc() {
        return "hdlr";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        byteBuffer.put(JCodecUtil.asciiString(this.componentType));
        byteBuffer.put(JCodecUtil.asciiString(this.componentSubType));
        byteBuffer.put(JCodecUtil.asciiString(this.componentManufacturer));
        byteBuffer.putInt(this.componentFlags);
        byteBuffer.putInt(this.componentFlagsMask);
        String str = this.componentName;
        if (str != null) {
            byteBuffer.put(JCodecUtil.asciiString(str));
        }
    }

    public int getComponentFlags() {
        return this.componentFlags;
    }

    public int getComponentFlagsMask() {
        return this.componentFlagsMask;
    }

    public String getComponentManufacturer() {
        return this.componentManufacturer;
    }

    public String getComponentSubType() {
        return this.componentSubType;
    }

    public String getComponentType() {
        return this.componentType;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        this.componentType = NIOUtils.readString(byteBuffer, 4);
        this.componentSubType = NIOUtils.readString(byteBuffer, 4);
        this.componentManufacturer = NIOUtils.readString(byteBuffer, 4);
        this.componentFlags = byteBuffer.getInt();
        this.componentFlagsMask = byteBuffer.getInt();
        this.componentName = NIOUtils.readString(byteBuffer, byteBuffer.remaining());
    }

    public HandlerBox() {
        super(new Header(fourcc()));
    }
}
