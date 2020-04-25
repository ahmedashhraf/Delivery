package org.jcodec.scale;

import java.util.HashMap;
import java.util.Map;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.model.Picture;

public class ColorUtil {
    private static Map<ColorSpace, Map<ColorSpace, Transform>> map = new HashMap();

    public static class Idential implements Transform {
        public void transform(Picture picture, Picture picture2) {
            for (int i = 0; i < 3; i++) {
                System.arraycopy(picture.getPlaneData(i), 0, picture2.getPlaneData(i), 0, Math.min(picture.getPlaneWidth(i) * picture.getPlaneHeight(i), picture2.getPlaneWidth(i) * picture2.getPlaneHeight(i)));
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ColorSpace.RGB, new Idential());
        hashMap.put(ColorSpace.YUV420, new RgbToYuv420p(0, 0));
        hashMap.put(ColorSpace.YUV420J, new RgbToYuv420j());
        hashMap.put(ColorSpace.YUV422, new RgbToYuv422p(0, 0));
        hashMap.put(ColorSpace.YUV422_10, new RgbToYuv422p(2, 0));
        map.put(ColorSpace.RGB, hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(ColorSpace.YUV420, new Idential());
        hashMap2.put(ColorSpace.RGB, new Yuv420pToRgb(0, 0));
        hashMap2.put(ColorSpace.YUV422, new Yuv420pToYuv422p(0, 0));
        hashMap2.put(ColorSpace.YUV422_10, new Yuv420pToYuv422p(0, 2));
        map.put(ColorSpace.YUV420, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(ColorSpace.YUV422, new Idential());
        hashMap3.put(ColorSpace.RGB, new Yuv422pToRgb(0, 0));
        hashMap3.put(ColorSpace.YUV420, new Yuv422pToYuv420p(0, 0));
        hashMap3.put(ColorSpace.YUV420J, new Yuv422pToYuv420j(0, 0));
        map.put(ColorSpace.YUV422, hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(ColorSpace.YUV422_10, new Idential());
        hashMap4.put(ColorSpace.RGB, new Yuv422pToRgb(2, 0));
        hashMap4.put(ColorSpace.YUV420, new Yuv422pToYuv420p(0, 2));
        hashMap4.put(ColorSpace.YUV420J, new Yuv422pToYuv420j(0, 2));
        map.put(ColorSpace.YUV422_10, hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(ColorSpace.YUV444, new Idential());
        hashMap5.put(ColorSpace.RGB, new Yuv444pToRgb(0, 0));
        hashMap5.put(ColorSpace.YUV420, new Yuv444pToYuv420p(0, 0));
        map.put(ColorSpace.YUV444, hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put(ColorSpace.YUV444_10, new Idential());
        hashMap6.put(ColorSpace.RGB, new Yuv444pToRgb(2, 0));
        hashMap6.put(ColorSpace.YUV420, new Yuv444pToYuv420p(0, 2));
        map.put(ColorSpace.YUV444_10, hashMap6);
        HashMap hashMap7 = new HashMap();
        hashMap7.put(ColorSpace.YUV420J, new Idential());
        hashMap7.put(ColorSpace.RGB, new Yuv420jToRgb());
        hashMap7.put(ColorSpace.YUV420, new Yuv420jToYuv420());
        map.put(ColorSpace.YUV420J, hashMap7);
        HashMap hashMap8 = new HashMap();
        hashMap8.put(ColorSpace.YUV422J, new Idential());
        hashMap8.put(ColorSpace.RGB, new Yuv422jToRgb());
        hashMap8.put(ColorSpace.YUV420, new Yuv422jToYuv420p());
        hashMap8.put(ColorSpace.YUV420J, new Yuv422pToYuv420p(0, 0));
        map.put(ColorSpace.YUV422J, hashMap8);
        HashMap hashMap9 = new HashMap();
        hashMap9.put(ColorSpace.YUV444J, new Idential());
        hashMap9.put(ColorSpace.RGB, new Yuv444jToRgb());
        hashMap9.put(ColorSpace.YUV420, new Yuv444jToYuv420p());
        hashMap9.put(ColorSpace.YUV420J, new Yuv444pToYuv420p(0, 0));
        map.put(ColorSpace.YUV444J, hashMap9);
    }

    public static Transform getTransform(ColorSpace colorSpace, ColorSpace colorSpace2) {
        Map map2 = (Map) map.get(colorSpace);
        if (map2 == null) {
            return null;
        }
        return (Transform) map2.get(colorSpace2);
    }
}
