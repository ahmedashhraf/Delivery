package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.C15133c;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.p224d0.C6145c;
import org.apache.http.p547h0.C15341r;
import org.apache.http.p550k0.C15454b;

@C6145c
/* renamed from: org.apache.http.impl.cookie.m */
/* compiled from: BrowserCompatSpec */
public class C15407m extends C15409o {
    @Deprecated

    /* renamed from: c */
    protected static final String[] f44533c;

    /* renamed from: d */
    private static final String[] f44534d;

    /* renamed from: b */
    private final String[] f44535b;

    static {
        String str = "EEE, dd MMM yyyy HH:mm:ss zzz";
        String str2 = C15410p.f44537b;
        String str3 = C15410p.f44538c;
        String str4 = "EEE, dd-MMM-yyyy HH:mm:ss z";
        String str5 = "EEE, dd-MMM-yyyy HH-mm-ss z";
        String str6 = "EEE, dd MMM yy HH:mm:ss z";
        String str7 = "EEE dd-MMM-yyyy HH:mm:ss z";
        f44533c = new String[]{str, str2, str3, str4, str5, str6, str7, "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
        f44534d = new String[]{str, str2, str3, str4, str5, str6, str7, "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    }

    public C15407m(String[] strArr) {
        if (strArr != null) {
            this.f44535b = (String[]) strArr.clone();
        } else {
            this.f44535b = f44534d;
        }
        mo47666a(C15222a.f44141w, new C15403i());
        mo47666a(C15222a.f44142x, new C15398f());
        mo47666a(C15222a.f44143y, new C15402h());
        mo47666a(C15222a.f44144z, new C15404j());
        mo47666a(C15222a.f44135A, new C15396e());
        mo47666a(C15222a.f44136B, new C15400g(this.f44535b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<org.apache.http.cookie.C15223b> mo47126a(org.apache.http.C15133c r7, org.apache.http.cookie.C15226e r8) throws org.apache.http.cookie.MalformedCookieException {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b8
            if (r8 == 0) goto L_0x00b0
            java.lang.String r0 = r7.getName()
            java.lang.String r1 = r7.getValue()
            java.lang.String r2 = "Set-Cookie"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0090
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r0 = r1.toLowerCase(r0)
            java.lang.String r2 = "expires="
            int r0 = r0.indexOf(r2)
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 == r3) goto L_0x003e
            int r0 = r0 + 8
            r5 = 59
            int r5 = r1.indexOf(r5, r0)
            if (r5 != r3) goto L_0x0033
            int r5 = r1.length()
        L_0x0033:
            java.lang.String r0 = r1.substring(r0, r5)     // Catch:{ DateParseException -> 0x003e }
            java.lang.String[] r1 = r6.f44535b     // Catch:{ DateParseException -> 0x003e }
            org.apache.http.impl.cookie.C15410p.m68325a(r0, r1)     // Catch:{ DateParseException -> 0x003e }
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 == 0) goto L_0x0087
            org.apache.http.impl.cookie.r r0 = org.apache.http.impl.cookie.C15414r.f44543b
            boolean r1 = r7 instanceof org.apache.http.C15131b
            if (r1 == 0) goto L_0x005b
            org.apache.http.b r7 = (org.apache.http.C15131b) r7
            org.apache.http.k0.b r1 = r7.mo46910c()
            org.apache.http.h0.x r3 = new org.apache.http.h0.x
            int r7 = r7.mo46911d()
            int r5 = r1.mo47772f()
            r3.<init>(r7, r5)
            goto L_0x0076
        L_0x005b:
            java.lang.String r7 = r7.getValue()
            if (r7 == 0) goto L_0x007f
            org.apache.http.k0.b r1 = new org.apache.http.k0.b
            int r3 = r7.length()
            r1.<init>(r3)
            r1.mo47757a(r7)
            org.apache.http.h0.x r3 = new org.apache.http.h0.x
            int r7 = r1.mo47772f()
            r3.<init>(r4, r7)
        L_0x0076:
            org.apache.http.d[] r7 = new org.apache.http.C15236d[r2]
            org.apache.http.d r0 = r0.mo47679a(r1, r3)
            r7[r4] = r0
            goto L_0x008b
        L_0x007f:
            org.apache.http.cookie.MalformedCookieException r7 = new org.apache.http.cookie.MalformedCookieException
            java.lang.String r8 = "Header value is null"
            r7.<init>(r8)
            throw r7
        L_0x0087:
            org.apache.http.d[] r7 = r7.mo46915b()
        L_0x008b:
            java.util.List r7 = r6.mo47673a(r7, r8)
            return r7
        L_0x0090:
            org.apache.http.cookie.MalformedCookieException r8 = new org.apache.http.cookie.MalformedCookieException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unrecognized cookie header '"
            r0.append(r1)
            java.lang.String r7 = r7.toString()
            r0.append(r7)
            java.lang.String r7 = "'"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L_0x00b0:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Cookie origin may not be null"
            r7.<init>(r8)
            throw r7
        L_0x00b8:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Header may not be null"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.C15407m.mo47126a(org.apache.http.c, org.apache.http.cookie.e):java.util.List");
    }

    /* renamed from: a */
    public C15133c mo47127a() {
        return null;
    }

    /* renamed from: b */
    public int mo47129b() {
        return 0;
    }

    public String toString() {
        return C15160e.f44032a;
    }

    public C15407m() {
        this(null);
    }

    /* renamed from: a */
    public List<C15133c> mo47125a(List<C15223b> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            C15454b bVar = new C15454b(list.size() * 20);
            bVar.mo47757a("Cookie");
            bVar.mo47757a(": ");
            for (int i = 0; i < list.size(); i++) {
                C15223b bVar2 = (C15223b) list.get(i);
                if (i > 0) {
                    bVar.mo47757a("; ");
                }
                bVar.mo47757a(bVar2.getName());
                bVar.mo47757a("=");
                String value = bVar2.getValue();
                if (value != null) {
                    bVar.mo47757a(value);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new C15341r(bVar));
            return arrayList;
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }
}
