package com.google.zxing.p333t.p334a;

import java.util.List;

/* renamed from: com.google.zxing.t.a.g0 */
/* compiled from: VEventResultParser */
public final class C9019g0 extends C9037u {
    /* renamed from: b */
    private static String[] m42160b(CharSequence charSequence, String str, boolean z) {
        List b = C9017f0.m42138b(charSequence, str, z, false);
        if (b == null || b.isEmpty()) {
            return null;
        }
        int size = b.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = (String) ((List) b.get(i)).get(0);
        }
        return strArr;
    }

    /* renamed from: e */
    private static String m42161e(String str) {
        if (str != null) {
            return (str.startsWith("mailto:") || str.startsWith("MAILTO:")) ? str.substring(7) : str;
        }
        return str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.p333t.p334a.C9018g m42163a(com.google.zxing.C8985n r18) {
        /*
            r17 = this;
            java.lang.String r0 = com.google.zxing.p333t.p334a.C9037u.m42253b(r18)
            java.lang.String r1 = "BEGIN:VEVENT"
            int r1 = r0.indexOf(r1)
            r2 = 0
            if (r1 >= 0) goto L_0x000e
            return r2
        L_0x000e:
            r1 = 1
            java.lang.String r3 = "SUMMARY"
            java.lang.String r5 = m42159a(r3, r0, r1)
            java.lang.String r3 = "DTSTART"
            java.lang.String r6 = m42159a(r3, r0, r1)
            if (r6 != 0) goto L_0x001e
            return r2
        L_0x001e:
            java.lang.String r3 = "DTEND"
            java.lang.String r7 = m42159a(r3, r0, r1)
            java.lang.String r3 = "DURATION"
            java.lang.String r8 = m42159a(r3, r0, r1)
            java.lang.String r3 = "LOCATION"
            java.lang.String r9 = m42159a(r3, r0, r1)
            java.lang.String r3 = "ORGANIZER"
            java.lang.String r3 = m42159a(r3, r0, r1)
            java.lang.String r10 = m42161e(r3)
            java.lang.String r3 = "ATTENDEE"
            java.lang.String[] r11 = m42160b(r3, r0, r1)
            r3 = 0
            if (r11 == 0) goto L_0x0052
            r4 = 0
        L_0x0044:
            int r12 = r11.length
            if (r4 >= r12) goto L_0x0052
            r12 = r11[r4]
            java.lang.String r12 = m42161e(r12)
            r11[r4] = r12
            int r4 = r4 + 1
            goto L_0x0044
        L_0x0052:
            java.lang.String r4 = "DESCRIPTION"
            java.lang.String r12 = m42159a(r4, r0, r1)
            java.lang.String r4 = "GEO"
            java.lang.String r0 = m42159a(r4, r0, r1)
            r13 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0064
            r15 = r13
            goto L_0x007f
        L_0x0064:
            r4 = 59
            int r4 = r0.indexOf(r4)
            if (r4 >= 0) goto L_0x006d
            return r2
        L_0x006d:
            java.lang.String r3 = r0.substring(r3, r4)     // Catch:{ NumberFormatException -> 0x0086 }
            double r13 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x0086 }
            int r4 = r4 + r1
            java.lang.String r0 = r0.substring(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x0086 }
            r15 = r0
        L_0x007f:
            com.google.zxing.t.a.g r0 = new com.google.zxing.t.a.g     // Catch:{  }
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)     // Catch:{  }
            return r0
        L_0x0086:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.p333t.p334a.C9019g0.m42163a(com.google.zxing.n):com.google.zxing.t.a.g");
    }

    /* renamed from: a */
    private static String m42159a(CharSequence charSequence, String str, boolean z) {
        List a = C9017f0.m42132a(charSequence, str, z, false);
        if (a == null || a.isEmpty()) {
            return null;
        }
        return (String) a.get(0);
    }
}
