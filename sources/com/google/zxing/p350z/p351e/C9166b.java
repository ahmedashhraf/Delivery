package com.google.zxing.p350z.p351e;

import com.google.zxing.p350z.C9161a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.zxing.z.e.b */
/* compiled from: BarcodeValue */
final class C9166b {

    /* renamed from: a */
    private final Map<Integer, Integer> f24051a = new HashMap();

    C9166b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo33212a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Entry entry : this.f24051a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i) {
                i = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C9161a.m42809a((Collection<Integer>) arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33213b(int i) {
        Integer num = (Integer) this.f24051a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(0);
        }
        this.f24051a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    /* renamed from: a */
    public Integer mo33211a(int i) {
        return (Integer) this.f24051a.get(Integer.valueOf(i));
    }
}
