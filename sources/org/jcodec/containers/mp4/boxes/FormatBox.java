package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import org.jcodec.common.JCodecUtil;
import org.jcodec.common.NIOUtils;

public class FormatBox extends Box {
    private String fmt;

    public FormatBox(Box box) {
        super(box);
    }

    public static String fourcc() {
        return "frma";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.put(JCodecUtil.asciiString(this.fmt));
    }

    public void parse(ByteBuffer byteBuffer) {
        this.fmt = NIOUtils.readString(byteBuffer, 4);
    }

    public FormatBox(Header header) {
        super(header);
    }

    public FormatBox(String str) {
        super(new Header(fourcc()));
        this.fmt = str;
    }
}
