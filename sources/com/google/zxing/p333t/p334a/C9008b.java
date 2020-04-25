package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.zxing.t.a.b */
/* compiled from: AddressBookAUResultParser */
public final class C9008b extends C9037u {
    /* renamed from: a */
    public C9012d m42089a(C8985n nVar) {
        String b = C9037u.m42253b(nVar);
        String[] strArr = null;
        if (!b.contains("MEMORY") || !b.contains("\r\n")) {
            return null;
        }
        String b2 = C9037u.m42254b("NAME1:", b, 13, true);
        String b3 = C9037u.m42254b("NAME2:", b, 13, true);
        String[] a = m42087a("TEL", 3, b, true);
        String[] a2 = m42087a("MAIL", 3, b, true);
        String b4 = C9037u.m42254b("MEMORY:", b, 13, false);
        String b5 = C9037u.m42254b("ADD:", b, 13, true);
        if (b5 != null) {
            strArr = new String[]{b5};
        }
        C9012d dVar = new C9012d(C9037u.m42251a(b2), null, b3, a, null, a2, null, null, b4, strArr, null, null, null, null, null, null);
        return dVar;
    }

    /* renamed from: a */
    private static String[] m42087a(String str, int i, String str2, boolean z) {
        List list = null;
        for (int i2 = 1; i2 <= i; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i2);
            sb.append(':');
            String b = C9037u.m42254b(sb.toString(), str2, 13, z);
            if (b == null) {
                break;
            }
            if (list == null) {
                list = new ArrayList(i);
            }
            list.add(b);
        }
        if (list == null) {
            return null;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}
