package org.apache.http.p550k0;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: org.apache.http.k0.g */
/* compiled from: VersionInfo */
public class C15459g {

    /* renamed from: f */
    public static final String f44623f = "UNAVAILABLE";

    /* renamed from: g */
    public static final String f44624g = "version.properties";

    /* renamed from: h */
    public static final String f44625h = "info.module";

    /* renamed from: i */
    public static final String f44626i = "info.release";

    /* renamed from: j */
    public static final String f44627j = "info.timestamp";

    /* renamed from: a */
    private final String f44628a;

    /* renamed from: b */
    private final String f44629b;

    /* renamed from: c */
    private final String f44630c;

    /* renamed from: d */
    private final String f44631d;

    /* renamed from: e */
    private final String f44632e;

    protected C15459g(String str, String str2, String str3, String str4, String str5) {
        if (str != null) {
            this.f44628a = str;
            String str6 = f44623f;
            if (str2 == null) {
                str2 = str6;
            }
            this.f44629b = str2;
            if (str3 == null) {
                str3 = str6;
            }
            this.f44630c = str3;
            if (str4 == null) {
                str4 = str6;
            }
            this.f44631d = str4;
            if (str5 != null) {
                str6 = str5;
            }
            this.f44632e = str6;
            return;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }

    /* renamed from: a */
    public final String mo47775a() {
        return this.f44632e;
    }

    /* renamed from: b */
    public final String mo47776b() {
        return this.f44629b;
    }

    /* renamed from: c */
    public final String mo47777c() {
        return this.f44628a;
    }

    /* renamed from: d */
    public final String mo47778d() {
        return this.f44630c;
    }

    /* renamed from: e */
    public final String mo47779e() {
        return this.f44631d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(this.f44628a.length() + 20 + this.f44629b.length() + this.f44630c.length() + this.f44631d.length() + this.f44632e.length());
        stringBuffer.append("VersionInfo(");
        stringBuffer.append(this.f44628a);
        stringBuffer.append(':');
        stringBuffer.append(this.f44629b);
        String str = this.f44630c;
        String str2 = f44623f;
        if (!str2.equals(str)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f44630c);
        }
        if (!str2.equals(this.f44631d)) {
            stringBuffer.append(':');
            stringBuffer.append(this.f44631d);
        }
        stringBuffer.append(')');
        if (!str2.equals(this.f44632e)) {
            stringBuffer.append('@');
            stringBuffer.append(this.f44632e);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final C15459g[] m68511a(String[] strArr, ClassLoader classLoader) {
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String a : strArr) {
                C15459g a2 = m68509a(a, classLoader);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return (C15459g[]) arrayList.toArray(new C15459g[arrayList.size()]);
        }
        throw new IllegalArgumentException("Package identifier list must not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.apache.http.p550k0.C15459g m68509a(java.lang.String r4, java.lang.ClassLoader r5) {
        /*
            if (r4 == 0) goto L_0x004c
            if (r5 != 0) goto L_0x000c
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r5 = r5.getContextClassLoader()
        L_0x000c:
            r0 = 0
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ IOException -> 0x0044 }
            r1.<init>()     // Catch:{ IOException -> 0x0044 }
            r2 = 46
            r3 = 47
            java.lang.String r2 = r4.replace(r2, r3)     // Catch:{ IOException -> 0x0044 }
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r2 = "version.properties"
            r1.append(r2)     // Catch:{ IOException -> 0x0044 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0044 }
            java.io.InputStream r1 = r5.getResourceAsStream(r1)     // Catch:{ IOException -> 0x0044 }
            if (r1 == 0) goto L_0x0044
            java.util.Properties r2 = new java.util.Properties     // Catch:{ all -> 0x003f }
            r2.<init>()     // Catch:{ all -> 0x003f }
            r2.load(r1)     // Catch:{ all -> 0x003f }
            r1.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x0045
        L_0x003d:
            goto L_0x0045
        L_0x003f:
            r2 = move-exception
            r1.close()     // Catch:{ IOException -> 0x0044 }
            throw r2     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            r2 = r0
        L_0x0045:
            if (r2 == 0) goto L_0x004b
            org.apache.http.k0.g r0 = m68510a(r4, r2, r5)
        L_0x004b:
            return r0
        L_0x004c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Package identifier must not be null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.p550k0.C15459g.m68509a(java.lang.String, java.lang.ClassLoader):org.apache.http.k0.g");
    }

    /* renamed from: a */
    protected static final C15459g m68510a(String str, Map map, ClassLoader classLoader) {
        String str2;
        String str3;
        String str4;
        if (str != null) {
            String str5 = null;
            if (map != null) {
                String str6 = (String) map.get(f44625h);
                if (str6 != null && str6.length() < 1) {
                    str6 = null;
                }
                String str7 = (String) map.get(f44626i);
                if (str7 != null && (str7.length() < 1 || str7.equals("${pom.version}"))) {
                    str7 = null;
                }
                String str8 = (String) map.get(f44627j);
                str2 = (str8 == null || (str8.length() >= 1 && !str8.equals("${mvn.timestamp}"))) ? str8 : null;
                str4 = str6;
                str3 = str7;
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
            }
            if (classLoader != null) {
                str5 = classLoader.toString();
            }
            C15459g gVar = new C15459g(str, str4, str3, str2, str5);
            return gVar;
        }
        throw new IllegalArgumentException("Package identifier must not be null.");
    }
}
