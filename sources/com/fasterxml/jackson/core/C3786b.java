package com.fasterxml.jackson.core;

import p205i.p489f.C14069f;

/* renamed from: com.fasterxml.jackson.core.b */
/* compiled from: Base64Variants */
public final class C3786b {

    /* renamed from: a */
    static final String f11814a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    /* renamed from: b */
    public static final C3785a f11815b;

    /* renamed from: c */
    public static final C3785a f11816c = new C3785a(f11815b, "MIME-NO-LINEFEEDS", Integer.MAX_VALUE);

    /* renamed from: d */
    public static final C3785a f11817d;

    /* renamed from: e */
    public static final C3785a f11818e;

    static {
        C3785a aVar = new C3785a("MIME", f11814a, true, '=', 76);
        f11815b = aVar;
        C3785a aVar2 = new C3785a(f11815b, "PEM", true, '=', 64);
        f11817d = aVar2;
        StringBuffer stringBuffer = new StringBuffer(f11814a);
        stringBuffer.setCharAt(stringBuffer.indexOf(C14069f.f41344H), '-');
        stringBuffer.setCharAt(stringBuffer.indexOf("/"), '_');
        C3785a aVar3 = new C3785a("MODIFIED-FOR-URL", stringBuffer.toString(), false, 0, Integer.MAX_VALUE);
        f11818e = aVar3;
    }

    /* renamed from: a */
    public static C3785a m15845a() {
        return f11816c;
    }

    /* renamed from: a */
    public static C3785a m15846a(String str) throws IllegalArgumentException {
        String str2;
        if (f11815b.f11808O.equals(str)) {
            return f11815b;
        }
        if (f11816c.f11808O.equals(str)) {
            return f11816c;
        }
        if (f11817d.f11808O.equals(str)) {
            return f11817d;
        }
        if (f11818e.f11808O.equals(str)) {
            return f11818e;
        }
        if (str == null) {
            str2 = "<null>";
        } else {
            StringBuilder sb = new StringBuilder();
            String str3 = "'";
            sb.append(str3);
            sb.append(str);
            sb.append(str3);
            str2 = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No Base64Variant with name ");
        sb2.append(str2);
        throw new IllegalArgumentException(sb2.toString());
    }
}
