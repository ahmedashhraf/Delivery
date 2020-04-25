package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;

/* renamed from: com.google.zxing.t.a.c */
/* compiled from: AddressBookDoCoMoResultParser */
public final class C9010c extends C9006a {
    /* renamed from: e */
    private static String m42093e(String str) {
        int indexOf = str.indexOf(44);
        if (indexOf < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(indexOf + 1));
        sb.append(' ');
        sb.append(str.substring(0, indexOf));
        return sb.toString();
    }

    /* renamed from: a */
    public C9012d m42095a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("MECARD:")) {
            return null;
        }
        String[] a = C9006a.m42083a("N:", b, true);
        if (a == null) {
            return null;
        }
        String e = m42093e(a[0]);
        String b2 = C9006a.m42084b("SOUND:", b, true);
        String[] a2 = C9006a.m42083a("TEL:", b, true);
        String[] a3 = C9006a.m42083a("EMAIL:", b, true);
        String b3 = C9006a.m42084b("NOTE:", b, false);
        String[] a4 = C9006a.m42083a("ADR:", b, true);
        String b4 = C9006a.m42084b("BDAY:", b, true);
        String str = !C9037u.m42256b(b4, 8) ? null : b4;
        C9012d dVar = new C9012d(C9037u.m42251a(e), null, b2, a2, null, a3, null, null, b3, a4, null, C9006a.m42084b("ORG:", b, true), str, null, C9006a.m42083a("URL:", b, true), null);
        return dVar;
    }
}
