package com.facebook.drawee.backends.pipeline.info;

import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;

public class ImageOriginUtils {
    private ImageOriginUtils() {
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int mapProducerNameToImageOrigin(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = -1
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1914072202: goto L_0x0036;
                case -1307634203: goto L_0x002c;
                case -1224383234: goto L_0x0022;
                case 656304759: goto L_0x0018;
                case 957714404: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r0 = "BitmapMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r0 = "DiskCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r0 = "NetworkFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 2
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "BitmapMemoryCacheGetProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0040
            r7 = 0
            goto L_0x0041
        L_0x0040:
            r7 = -1
        L_0x0041:
            if (r7 == 0) goto L_0x004f
            if (r7 == r6) goto L_0x004f
            if (r7 == r5) goto L_0x004e
            if (r7 == r4) goto L_0x004d
            if (r7 == r2) goto L_0x004c
            return r3
        L_0x004c:
            return r1
        L_0x004d:
            return r6
        L_0x004e:
            return r5
        L_0x004f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.backends.pipeline.info.ImageOriginUtils.mapProducerNameToImageOrigin(java.lang.String):int");
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "unknown" : "memory_bitmap" : "memory_encoded" : "disk" : Network.TYPE_NETWORK;
    }
}
