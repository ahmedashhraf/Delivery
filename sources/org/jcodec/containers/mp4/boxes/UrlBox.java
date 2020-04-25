package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jcodec.common.NIOUtils;

public class UrlBox extends FullBox {
    private String url;

    public UrlBox(String str) {
        super(new Header(fourcc()));
        this.url = str;
    }

    public static String fourcc() {
        return "url ";
    }

    /* access modifiers changed from: protected */
    public void doWrite(ByteBuffer byteBuffer) {
        super.doWrite(byteBuffer);
        Charset forName = Charset.forName("utf-8");
        String str = this.url;
        if (str != null) {
            NIOUtils.write(byteBuffer, ByteBuffer.wrap(str.getBytes(forName)));
            byteBuffer.put(0);
        }
    }

    public String getUrl() {
        return this.url;
    }

    public void parse(ByteBuffer byteBuffer) {
        super.parse(byteBuffer);
        if ((this.flags & 1) == 0) {
            this.url = NIOUtils.readNullTermString(byteBuffer, Charset.forName("utf-8"));
        }
    }

    public UrlBox(Header header) {
        super(header);
    }
}
