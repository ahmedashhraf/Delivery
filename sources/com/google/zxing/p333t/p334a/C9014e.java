package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.ArrayList;

/* renamed from: com.google.zxing.t.a.e */
/* compiled from: BizcardResultParser */
public final class C9014e extends C9006a {
    /* renamed from: a */
    public C9012d m42125a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        if (!b.startsWith("BIZCARD:")) {
            return null;
        }
        String a = m42122a(C9006a.m42084b("N:", b, true), C9006a.m42084b("X:", b, true));
        String b2 = C9006a.m42084b("T:", b, true);
        String b3 = C9006a.m42084b("C:", b, true);
        C9012d dVar = new C9012d(C9037u.m42251a(a), null, null, m42123a(C9006a.m42084b("B:", b, true), C9006a.m42084b("M:", b, true), C9006a.m42084b("F:", b, true)), null, C9037u.m42251a(C9006a.m42084b("E:", b, true)), null, null, null, C9006a.m42083a("A:", b, true), null, b3, null, b2, null, null);
        return dVar;
    }

    /* renamed from: a */
    private static String[] m42123a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList(3);
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        if (str3 != null) {
            arrayList.add(str3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[size]);
    }

    /* renamed from: a */
    private static String m42122a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        sb.append(str2);
        return sb.toString();
    }
}
