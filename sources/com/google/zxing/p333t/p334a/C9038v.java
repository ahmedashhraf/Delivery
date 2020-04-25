package com.google.zxing.p333t.p334a;

import com.google.zxing.C8985n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.zxing.t.a.v */
/* compiled from: SMSMMSResultParser */
public final class C9038v extends C9037u {
    /* renamed from: a */
    public C9039w m42263a(C8985n nVar) {
        String str;
        String str2;
        String b = C9037u.m42253b(nVar);
        String str3 = null;
        if (!b.startsWith("sms:") && !b.startsWith("SMS:") && !b.startsWith("mms:") && !b.startsWith("MMS:")) {
            return null;
        }
        Map b2 = C9037u.m42255b(b);
        boolean z = false;
        if (b2 == null || b2.isEmpty()) {
            str = null;
        } else {
            str3 = (String) b2.get("subject");
            str = (String) b2.get("body");
            z = true;
        }
        int indexOf = b.indexOf(63, 4);
        if (indexOf < 0 || !z) {
            str2 = b.substring(4);
        } else {
            str2 = b.substring(4, indexOf);
        }
        int i = -1;
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        while (true) {
            int i2 = i + 1;
            int indexOf2 = str2.indexOf(44, i2);
            if (indexOf2 > i) {
                m42261a(arrayList, arrayList2, str2.substring(i2, indexOf2));
                i = indexOf2;
            } else {
                m42261a(arrayList, arrayList2, str2.substring(i2));
                return new C9039w((String[]) arrayList.toArray(new String[arrayList.size()]), (String[]) arrayList2.toArray(new String[arrayList2.size()]), str3, str);
            }
        }
    }

    /* renamed from: a */
    private static void m42261a(Collection<String> collection, Collection<String> collection2, String str) {
        int indexOf = str.indexOf(59);
        String str2 = null;
        if (indexOf < 0) {
            collection.add(str);
            collection2.add(null);
            return;
        }
        collection.add(str.substring(0, indexOf));
        String substring = str.substring(indexOf + 1);
        if (substring.startsWith("via=")) {
            str2 = substring.substring(4);
        }
        collection2.add(str2);
    }
}
