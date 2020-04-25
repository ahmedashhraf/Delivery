package org.jcodec.codecs.mpeg4.p553es;

import java.util.HashMap;
import java.util.Map;

/* renamed from: org.jcodec.codecs.mpeg4.es.DescriptorFactory */
public class DescriptorFactory {
    private static Map<Integer, Class<? extends Descriptor>> map = new HashMap();

    static {
        map.put(Integer.valueOf(C15532ES.tag()), C15532ES.class);
        map.put(Integer.valueOf(C15533SL.tag()), C15533SL.class);
        map.put(Integer.valueOf(DecoderConfig.tag()), DecoderConfig.class);
        map.put(Integer.valueOf(DecoderSpecific.tag()), DecoderSpecific.class);
    }

    public Class<? extends Descriptor> byTag(int i) {
        return (Class) map.get(Integer.valueOf(i));
    }
}
