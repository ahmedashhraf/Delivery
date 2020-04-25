package org.jcodec.containers.mp4.boxes;

import java.util.HashMap;
import java.util.Map;

public class WaveExtension extends NodeBox {
    private static final MyFactory FACTORY = new MyFactory();

    public static class MyFactory extends BoxFactory {
        private Map<String, Class<? extends Box>> mappings = new HashMap();

        public MyFactory() {
            this.mappings.put(FormatBox.fourcc(), FormatBox.class);
            this.mappings.put(EndianBox.fourcc(), EndianBox.class);
        }

        public Class<? extends Box> toClass(String str) {
            return (Class) this.mappings.get(str);
        }
    }

    public WaveExtension(Header header) {
        super(header);
    }

    public static String fourcc() {
        return "wave";
    }
}
