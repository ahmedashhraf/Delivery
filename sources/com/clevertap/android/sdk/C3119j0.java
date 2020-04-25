package com.clevertap.android.sdk;

import com.mrsool.utils.C11644i;

/* renamed from: com.clevertap.android.sdk.j0 */
/* compiled from: CTInboxMessageType */
enum C3119j0 {
    SimpleMessage(C11644i.f33182R4),
    IconMessage("message-icon"),
    CarouselMessage("carousel"),
    CarouselImageMessage("carousel-image");
    
    private final String inboxMessageType;

    private C3119j0(String str) {
        this.inboxMessageType = str;
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.clevertap.android.sdk.C3119j0 m14982b(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1799711058: goto L_0x0029;
                case -1332589953: goto L_0x001f;
                case -902286926: goto L_0x0015;
                case 2908512: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "carousel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "simple"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "message-icon"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "carousel-image"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0047
            if (r4 == r3) goto L_0x0044
            if (r4 == r2) goto L_0x0041
            if (r4 == r1) goto L_0x003e
            r4 = 0
            return r4
        L_0x003e:
            com.clevertap.android.sdk.j0 r4 = CarouselImageMessage
            return r4
        L_0x0041:
            com.clevertap.android.sdk.j0 r4 = CarouselMessage
            return r4
        L_0x0044:
            com.clevertap.android.sdk.j0 r4 = IconMessage
            return r4
        L_0x0047:
            com.clevertap.android.sdk.j0 r4 = SimpleMessage
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3119j0.m14982b(java.lang.String):com.clevertap.android.sdk.j0");
    }

    public String toString() {
        return this.inboxMessageType;
    }
}
