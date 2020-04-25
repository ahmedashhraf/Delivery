package com.google.zxing.p337v.p339d;

import com.google.zxing.C8987p;
import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.C9044b;
import com.google.zxing.p335u.C9049g;
import com.google.zxing.p335u.C9051i;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p335u.p336m.C9057c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.zxing.v.d.a */
/* compiled from: Detector */
public final class C9070a {

    /* renamed from: a */
    private final C9044b f23748a;

    /* renamed from: b */
    private final C9057c f23749b;

    /* renamed from: com.google.zxing.v.d.a$b */
    /* compiled from: Detector */
    private static final class C9072b {

        /* renamed from: a */
        private final C8987p f23750a;

        /* renamed from: b */
        private final C8987p f23751b;

        /* renamed from: c */
        private final int f23752c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8987p mo33058a() {
            return this.f23750a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C8987p mo33059b() {
            return this.f23751b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo33060c() {
            return this.f23752c;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f23750a);
            sb.append("/");
            sb.append(this.f23751b);
            sb.append('/');
            sb.append(this.f23752c);
            return sb.toString();
        }

        private C9072b(C8987p pVar, C8987p pVar2, int i) {
            this.f23750a = pVar;
            this.f23751b = pVar2;
            this.f23752c = i;
        }
    }

    /* renamed from: com.google.zxing.v.d.a$c */
    /* compiled from: Detector */
    private static final class C9073c implements Serializable, Comparator<C9072b> {
        private C9073c() {
        }

        /* renamed from: a */
        public int compare(C9072b bVar, C9072b bVar2) {
            return bVar.mo33060c() - bVar2.mo33060c();
        }
    }

    public C9070a(C9044b bVar) throws NotFoundException {
        this.f23748a = bVar;
        this.f23749b = new C9057c(bVar);
    }

    /* renamed from: b */
    private C9072b m42431b(C8987p pVar, C8987p pVar2) {
        int a = (int) pVar.mo32830a();
        int b = (int) pVar.mo32831b();
        int a2 = (int) pVar2.mo32830a();
        int b2 = (int) pVar2.mo32831b();
        int i = 0;
        int i2 = 1;
        boolean z = Math.abs(b2 - b) > Math.abs(a2 - a);
        if (z) {
            int i3 = b;
            b = a;
            a = i3;
            int i4 = b2;
            b2 = a2;
            a2 = i4;
        }
        int abs = Math.abs(a2 - a);
        int abs2 = Math.abs(b2 - b);
        int i5 = (-abs) / 2;
        int i6 = b < b2 ? 1 : -1;
        if (a >= a2) {
            i2 = -1;
        }
        boolean b3 = this.f23748a.mo32995b(z ? b : a, z ? a : b);
        while (a != a2) {
            boolean b4 = this.f23748a.mo32995b(z ? b : a, z ? a : b);
            if (b4 != b3) {
                i++;
                b3 = b4;
            }
            i5 += abs2;
            if (i5 > 0) {
                if (b == b2) {
                    break;
                }
                b += i6;
                i5 -= abs;
            }
            a += i2;
        }
        return new C9072b(pVar, pVar2, i);
    }

    /* renamed from: a */
    public C9049g mo33057a() throws NotFoundException {
        C8987p pVar;
        C9044b bVar;
        C8987p pVar2;
        C8987p[] a = this.f23749b.mo33038a();
        C8987p pVar3 = a[0];
        C8987p pVar4 = a[1];
        C8987p pVar5 = a[2];
        C8987p pVar6 = a[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(m42431b(pVar3, pVar4));
        arrayList.add(m42431b(pVar3, pVar5));
        arrayList.add(m42431b(pVar4, pVar6));
        arrayList.add(m42431b(pVar5, pVar6));
        C8987p pVar7 = null;
        Collections.sort(arrayList, new C9073c());
        C9072b bVar2 = (C9072b) arrayList.get(0);
        C9072b bVar3 = (C9072b) arrayList.get(1);
        HashMap hashMap = new HashMap();
        m42429a((Map<C8987p, Integer>) hashMap, bVar2.mo33058a());
        m42429a((Map<C8987p, Integer>) hashMap, bVar2.mo33059b());
        m42429a((Map<C8987p, Integer>) hashMap, bVar3.mo33058a());
        m42429a((Map<C8987p, Integer>) hashMap, bVar3.mo33059b());
        C8987p pVar8 = null;
        C8987p pVar9 = null;
        for (Entry entry : hashMap.entrySet()) {
            C8987p pVar10 = (C8987p) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                pVar8 = pVar10;
            } else if (pVar7 == null) {
                pVar7 = pVar10;
            } else {
                pVar9 = pVar10;
            }
        }
        if (pVar7 == null || pVar8 == null || pVar9 == null) {
            throw NotFoundException.m41712a();
        }
        C8987p[] pVarArr = {pVar7, pVar8, pVar9};
        C8987p.m41992a(pVarArr);
        C8987p pVar11 = pVarArr[0];
        C8987p pVar12 = pVarArr[1];
        C8987p pVar13 = pVarArr[2];
        C8987p pVar14 = !hashMap.containsKey(pVar3) ? pVar3 : !hashMap.containsKey(pVar4) ? pVar4 : !hashMap.containsKey(pVar5) ? pVar5 : pVar6;
        int c = m42431b(pVar13, pVar14).mo33060c();
        int c2 = m42431b(pVar11, pVar14).mo33060c();
        if ((c & 1) == 1) {
            c++;
        }
        int i = c + 2;
        if ((c2 & 1) == 1) {
            c2++;
        }
        int i2 = c2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            pVar = pVar13;
            C8987p a2 = m42427a(pVar12, pVar11, pVar13, pVar14, i, i2);
            if (a2 == null) {
                a2 = pVar14;
            }
            int c3 = m42431b(pVar, pVar2).mo33060c();
            int c4 = m42431b(pVar11, pVar2).mo33060c();
            if ((c3 & 1) == 1) {
                c3++;
            }
            int i3 = c3;
            if ((c4 & 1) == 1) {
                c4++;
            }
            bVar = m42428a(this.f23748a, pVar, pVar12, pVar11, pVar2, i3, c4);
        } else {
            pVar2 = m42426a(pVar12, pVar11, pVar13, pVar14, Math.min(i2, i));
            if (pVar2 == null) {
                pVar2 = pVar14;
            }
            int max = Math.max(m42431b(pVar13, pVar2).mo33060c(), m42431b(pVar11, pVar2).mo33060c()) + 1;
            if ((max & 1) == 1) {
                max++;
            }
            int i4 = max;
            bVar = m42428a(this.f23748a, pVar13, pVar12, pVar11, pVar2, i4, i4);
            pVar = pVar13;
        }
        return new C9049g(bVar, new C8987p[]{pVar, pVar12, pVar11, pVar2});
    }

    /* renamed from: a */
    private C8987p m42427a(C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4, int i, int i2) {
        float a = ((float) m42425a(pVar, pVar2)) / ((float) i);
        float a2 = (float) m42425a(pVar3, pVar4);
        C8987p pVar5 = new C8987p(pVar4.mo32830a() + (((pVar4.mo32830a() - pVar3.mo32830a()) / a2) * a), pVar4.mo32831b() + (a * ((pVar4.mo32831b() - pVar3.mo32831b()) / a2)));
        float a3 = ((float) m42425a(pVar, pVar3)) / ((float) i2);
        float a4 = (float) m42425a(pVar2, pVar4);
        C8987p pVar6 = new C8987p(pVar4.mo32830a() + (((pVar4.mo32830a() - pVar2.mo32830a()) / a4) * a3), pVar4.mo32831b() + (a3 * ((pVar4.mo32831b() - pVar2.mo32831b()) / a4)));
        if (m42430a(pVar5)) {
            return (m42430a(pVar6) && Math.abs(i - m42431b(pVar3, pVar5).mo33060c()) + Math.abs(i2 - m42431b(pVar2, pVar5).mo33060c()) > Math.abs(i - m42431b(pVar3, pVar6).mo33060c()) + Math.abs(i2 - m42431b(pVar2, pVar6).mo33060c())) ? pVar6 : pVar5;
        }
        if (m42430a(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: a */
    private C8987p m42426a(C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4, int i) {
        float f = (float) i;
        float a = ((float) m42425a(pVar, pVar2)) / f;
        float a2 = (float) m42425a(pVar3, pVar4);
        C8987p pVar5 = new C8987p(pVar4.mo32830a() + (((pVar4.mo32830a() - pVar3.mo32830a()) / a2) * a), pVar4.mo32831b() + (a * ((pVar4.mo32831b() - pVar3.mo32831b()) / a2)));
        float a3 = ((float) m42425a(pVar, pVar3)) / f;
        float a4 = (float) m42425a(pVar2, pVar4);
        C8987p pVar6 = new C8987p(pVar4.mo32830a() + (((pVar4.mo32830a() - pVar2.mo32830a()) / a4) * a3), pVar4.mo32831b() + (a3 * ((pVar4.mo32831b() - pVar2.mo32831b()) / a4)));
        if (m42430a(pVar5)) {
            return (m42430a(pVar6) && Math.abs(m42431b(pVar3, pVar5).mo33060c() - m42431b(pVar2, pVar5).mo33060c()) > Math.abs(m42431b(pVar3, pVar6).mo33060c() - m42431b(pVar2, pVar6).mo33060c())) ? pVar6 : pVar5;
        }
        if (m42430a(pVar6)) {
            return pVar6;
        }
        return null;
    }

    /* renamed from: a */
    private boolean m42430a(C8987p pVar) {
        return pVar.mo32830a() >= 0.0f && pVar.mo32830a() < ((float) this.f23748a.mo33005h()) && pVar.mo32831b() > 0.0f && pVar.mo32831b() < ((float) this.f23748a.mo33001e());
    }

    /* renamed from: a */
    private static int m42425a(C8987p pVar, C8987p pVar2) {
        return C9055a.m42370a(C8987p.m41990a(pVar, pVar2));
    }

    /* renamed from: a */
    private static void m42429a(Map<C8987p, Integer> map, C8987p pVar) {
        Integer num = (Integer) map.get(pVar);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        map.put(pVar, Integer.valueOf(i));
    }

    /* renamed from: a */
    private static C9044b m42428a(C9044b bVar, C8987p pVar, C8987p pVar2, C8987p pVar3, C8987p pVar4, int i, int i2) throws NotFoundException {
        float f = ((float) i) - 0.5f;
        float f2 = ((float) i2) - 0.5f;
        return C9051i.m42349a().mo33029a(bVar, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, pVar.mo32830a(), pVar.mo32831b(), pVar4.mo32830a(), pVar4.mo32831b(), pVar3.mo32830a(), pVar3.mo32831b(), pVar2.mo32830a(), pVar2.mo32831b());
    }
}
