package com.fasterxml.jackson.core.p162w;

import com.fasterxml.jackson.core.C3804o;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.regex.Pattern;

/* renamed from: com.fasterxml.jackson.core.w.k */
/* compiled from: VersionUtil */
public class C3870k {

    /* renamed from: b */
    public static final String f12264b = "VERSION.txt";

    /* renamed from: c */
    private static final Pattern f12265c = Pattern.compile("[-_./;:]");

    /* renamed from: a */
    private final C3804o f12266a;

    protected C3870k() {
        C3804o oVar;
        try {
            oVar = m16928a(getClass());
        } catch (Exception unused) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append("ERROR: Failed to load Version information for bundle (via ");
            sb.append(getClass().getName());
            sb.append(").");
            printStream.println(sb.toString());
            oVar = null;
        }
        if (oVar == null) {
            oVar = C3804o.m16119p();
        }
        this.f12266a = oVar;
    }

    /* renamed from: b */
    protected static int m16932b(String str) {
        String str2 = str.toString();
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (charAt > '9' || charAt < '0') {
                break;
            }
            i = (i * 10) + (charAt - '0');
        }
        return i;
    }

    /* renamed from: a */
    public C3804o mo17137a() {
        return this.f12266a;
    }

    /* renamed from: a */
    public static C3804o m16928a(Class<?> cls) {
        InputStream resourceAsStream;
        String str;
        String str2;
        C3804o oVar = null;
        try {
            resourceAsStream = cls.getResourceAsStream(f12264b);
            if (resourceAsStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    str = bufferedReader.readLine();
                    if (str != null) {
                        str = str.trim();
                        str2 = bufferedReader.readLine();
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                    str = null;
                }
                oVar = m16931a(readLine, str, str2);
                resourceAsStream.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        } catch (IOException unused) {
        } catch (Throwable th) {
            resourceAsStream.close();
            throw th;
        }
        return oVar == null ? C3804o.m16119p() : oVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0051 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fasterxml.jackson.core.C3804o m16929a(java.lang.ClassLoader r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "META-INF/maven/"
            r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.String r2 = "\\."
            java.lang.String r4 = r4.replaceAll(r2, r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r4 = "/pom.properties"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.io.InputStream r3 = r3.getResourceAsStream(r4)
            if (r3 == 0) goto L_0x0054
            java.util.Properties r4 = new java.util.Properties     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r4.<init>()     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r4.load(r3)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            java.lang.String r5 = "version"
            java.lang.String r5 = r4.getProperty(r5)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            java.lang.String r0 = "artifactId"
            java.lang.String r0 = r4.getProperty(r0)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            java.lang.String r1 = "groupId"
            java.lang.String r4 = r4.getProperty(r1)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            com.fasterxml.jackson.core.o r4 = m16931a(r5, r4, r0)     // Catch:{ IOException -> 0x0051, all -> 0x004c }
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r4
        L_0x004c:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r4
        L_0x0051:
            r3.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            com.fasterxml.jackson.core.o r3 = com.fasterxml.jackson.core.C3804o.m16119p()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.p162w.C3870k.m16929a(java.lang.ClassLoader, java.lang.String, java.lang.String):com.fasterxml.jackson.core.o");
    }

    @Deprecated
    /* renamed from: a */
    public static C3804o m16930a(String str) {
        return m16931a(str, (String) null, (String) null);
    }

    /* renamed from: a */
    public static C3804o m16931a(String str, String str2, String str3) {
        String str4 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        String[] split = f12265c.split(trim);
        int b = m16932b(split[0]);
        int b2 = split.length > 1 ? m16932b(split[1]) : 0;
        int b3 = split.length > 2 ? m16932b(split[2]) : 0;
        if (split.length > 3) {
            str4 = split[3];
        }
        C3804o oVar = new C3804o(b, b2, b3, str4, str2, str3);
        return oVar;
    }
}
