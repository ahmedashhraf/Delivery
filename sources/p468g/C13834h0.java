package p468g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.util.TLSUtils;

/* renamed from: g.h0 */
/* compiled from: TlsVersion */
public enum C13834h0 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2(TLSUtils.PROTO_TLSV1_2),
    TLS_1_1(TLSUtils.PROTO_TLSV1_1),
    TLS_1_0(TLSUtils.PROTO_TLSV1),
    SSL_3_0(TLSUtils.PROTO_SSL3);
    
    final String javaName;

    private C13834h0(String str) {
        this.javaName = str;
    }

    /* renamed from: a */
    static List<C13834h0> m59088a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String b : strArr) {
            arrayList.add(m59089b(b));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0076  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p468g.C13834h0 m59089b(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 79201641(0x4b88569, float:4.338071E-36)
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == r1) goto L_0x003e
            r1 = 79923350(0x4c38896, float:4.5969714E-36)
            if (r0 == r1) goto L_0x0034
            switch(r0) {
                case -503070503: goto L_0x002a;
                case -503070502: goto L_0x0020;
                case -503070501: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x0048
        L_0x0016:
            java.lang.String r0 = "TLSv1.3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 0
            goto L_0x0049
        L_0x0020:
            java.lang.String r0 = "TLSv1.2"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 1
            goto L_0x0049
        L_0x002a:
            java.lang.String r0 = "TLSv1.1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 2
            goto L_0x0049
        L_0x0034:
            java.lang.String r0 = "TLSv1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 3
            goto L_0x0049
        L_0x003e:
            java.lang.String r0 = "SSLv3"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0048
            r0 = 4
            goto L_0x0049
        L_0x0048:
            r0 = -1
        L_0x0049:
            if (r0 == 0) goto L_0x0076
            if (r0 == r5) goto L_0x0073
            if (r0 == r4) goto L_0x0070
            if (r0 == r3) goto L_0x006d
            if (r0 != r2) goto L_0x0056
            g.h0 r6 = SSL_3_0
            return r6
        L_0x0056:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected TLS version: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L_0x006d:
            g.h0 r6 = TLS_1_0
            return r6
        L_0x0070:
            g.h0 r6 = TLS_1_1
            return r6
        L_0x0073:
            g.h0 r6 = TLS_1_2
            return r6
        L_0x0076:
            g.h0 r6 = TLS_1_3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p468g.C13834h0.m59089b(java.lang.String):g.h0");
    }

    /* renamed from: d */
    public String mo43481d() {
        return this.javaName;
    }
}
