package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;

public class NameBox extends Box {
    private String name;

    public NameBox(String str) {
        this();
        this.name = str;
    }

    public static String fourcc() {
        return "name";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(JCodecUtil.asciiString(this.name));
        byteBuffer.putInt(0);
    }

    public String getName() {
        return this.name;
    }

    public void parse(ByteBuffer byteBuffer) {
        this.name = NIOUtils.readNullTermString(byteBuffer);
    }

    public NameBox() {
        super(new Header(fourcc()));
    }

    private NameBox(Header header) {
        super(header);
    }
}
