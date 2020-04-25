package org.jcodec.containers.mp4.boxes;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class DataRefBox extends NodeBox {
    private static final MyFactory FACTORY = new MyFactory();

    public static class MyFactory extends BoxFactory {
        private Map<String, Class<? extends Box>> mappings = new HashMap();

        public MyFactory() {
            Class<AliasBox> cls = AliasBox.class;
            this.mappings.put(UrlBox.fourcc(), UrlBox.class);
            this.mappings.put(AliasBox.fourcc(), cls);
            this.mappings.put("cios", cls);
        }

        public Class<? extends Box> toClass(String str) {
            return (Class) this.mappings.get(str);
        }
    }

    public DataRefBox() {
        this(new Header(fourcc()));
    }

    public static String fourcc() {
        return "dref";
    }

    public void doWrite(ByteBuffer byteBuffer) {
        byteBuffer.putInt(0);
        byteBuffer.putInt(this.boxes.size());
        super.doWrite(byteBuffer);
    }

    public void parse(ByteBuffer byteBuffer) {
        byteBuffer.getInt();
        byteBuffer.getInt();
        super.parse(byteBuffer);
    }

    private DataRefBox(Header header) {
        super(header);
        this.factory = FACTORY;
    }
}
