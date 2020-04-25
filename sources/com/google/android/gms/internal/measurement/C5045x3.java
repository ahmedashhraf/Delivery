package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C5071z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5045x3<T extends C5071z3<T>> {

    /* renamed from: d */
    private static final C5045x3 f14505d = new C5045x3(true);

    /* renamed from: a */
    final C4875m6<T, Object> f14506a;

    /* renamed from: b */
    private boolean f14507b;

    /* renamed from: c */
    private boolean f14508c;

    private C5045x3() {
        this.f14506a = C4875m6.m20684b(16);
    }

    /* renamed from: g */
    public static <T extends C5071z3<T>> C5045x3<T> m21785g() {
        return f14505d;
    }

    /* renamed from: a */
    public final void mo19739a() {
        if (!this.f14507b) {
            this.f14506a.mo19268a();
            this.f14507b = true;
        }
    }

    /* renamed from: b */
    public final boolean mo19741b() {
        return this.f14507b;
    }

    /* renamed from: c */
    public final Iterator<Entry<T, Object>> mo19742c() {
        if (this.f14508c) {
            return new C5033w4(this.f14506a.entrySet().iterator());
        }
        return this.f14506a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        C5045x3 x3Var = new C5045x3();
        for (int i = 0; i < this.f14506a.mo19300c(); i++) {
            Entry a = this.f14506a.mo19298a(i);
            x3Var.m21782b((T) (C5071z3) a.getKey(), a.getValue());
        }
        for (Entry entry : this.f14506a.mo19303d()) {
            x3Var.m21782b((T) (C5071z3) entry.getKey(), entry.getValue());
        }
        x3Var.f14508c = this.f14508c;
        return x3Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Iterator<Entry<T, Object>> mo19744d() {
        if (this.f14508c) {
            return new C5033w4(this.f14506a.mo19304e().iterator());
        }
        return this.f14506a.mo19304e().iterator();
    }

    /* renamed from: e */
    public final boolean mo19745e() {
        for (int i = 0; i < this.f14506a.mo19300c(); i++) {
            if (!m21780a(this.f14506a.mo19298a(i))) {
                return false;
            }
        }
        for (Entry a : this.f14506a.mo19303d()) {
            if (!m21780a(a)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5045x3)) {
            return false;
        }
        return this.f14506a.equals(((C5045x3) obj).f14506a);
    }

    /* renamed from: f */
    public final int mo19747f() {
        int i = 0;
        for (int i2 = 0; i2 < this.f14506a.mo19300c(); i2++) {
            i += m21784c(this.f14506a.mo19298a(i2));
        }
        for (Entry c : this.f14506a.mo19303d()) {
            i += m21784c(c);
        }
        return i;
    }

    public final int hashCode() {
        return this.f14506a.hashCode();
    }

    /* renamed from: b */
    private final void m21782b(T t, Object obj) {
        if (!t.zzd()) {
            m21778a(t.mo19770i(), obj);
            r6 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                m21778a(t.mo19770i(), obj2);
            }
            r6 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r6 instanceof C4944r4) {
            this.f14508c = true;
        }
        this.f14506a.put(t, r6);
    }

    private C5045x3(boolean z) {
        this(C4875m6.m20684b(0));
        mo19739a();
    }

    /* renamed from: a */
    private final Object m21776a(T t) {
        Object obj = this.f14506a.get(t);
        return obj instanceof C4944r4 ? C4944r4.m21082c() : obj;
    }

    /* renamed from: c */
    private static int m21784c(Entry<T, Object> entry) {
        C5071z3 z3Var = (C5071z3) entry.getKey();
        Object value = entry.getValue();
        if (z3Var.mo19771l() != C4996t7.MESSAGE || z3Var.zzd() || z3Var.zze()) {
            return m21775a(z3Var, value);
        }
        if (value instanceof C4944r4) {
            return zzek.m21930b(((C5071z3) entry.getKey()).mo19767a(), (C5020v4) (C4944r4) value);
        }
        return zzek.m21928b(((C5071z3) entry.getKey()).mo19767a(), (C4945r5) value);
    }

    private C5045x3(C4875m6<T, Object> m6Var) {
        this.f14506a = m6Var;
        mo19739a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C4873m4) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r3 instanceof com.google.android.gms.internal.measurement.C4944r4) == false) goto L_0x0014;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21778a(com.google.android.gms.internal.measurement.C4934q7 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.measurement.C4819j4.m20394a(r3)
            int[] r0 = com.google.android.gms.internal.measurement.C4682a4.f13968a
            com.google.android.gms.internal.measurement.t7 r2 = r2.mo19396a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r0 = 0
            goto L_0x0042
        L_0x0016:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4945r5
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4944r4
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x001f:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C4873m4
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0028:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.C5070z2
            if (r2 != 0) goto L_0x0042
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0014
            goto L_0x0042
        L_0x0031:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0042:
            if (r0 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004e
        L_0x004d:
            throw r2
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5045x3.m21778a(com.google.android.gms.internal.measurement.q7, java.lang.Object):void");
    }

    /* renamed from: b */
    private final void m21783b(Entry<T, Object> entry) {
        Object obj;
        C5071z3 z3Var = (C5071z3) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C4944r4) {
            value = C4944r4.m21082c();
        }
        if (z3Var.zzd()) {
            Object a = m21776a((T) z3Var);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m21777a(a2));
            }
            this.f14506a.put(z3Var, a);
        } else if (z3Var.mo19771l() == C4996t7.MESSAGE) {
            Object a3 = m21776a((T) z3Var);
            if (a3 == null) {
                this.f14506a.put(z3Var, m21777a(value));
                return;
            }
            if (a3 instanceof C5034w5) {
                obj = z3Var.mo19769a((C5034w5) a3, (C5034w5) value);
            } else {
                obj = z3Var.mo19768a(((C4945r5) a3).mo19047d(), (C4945r5) value).mo19056B();
            }
            this.f14506a.put(z3Var, obj);
        } else {
            this.f14506a.put(z3Var, m21777a(value));
        }
    }

    /* renamed from: a */
    private static <T extends C5071z3<T>> boolean m21780a(Entry<T, Object> entry) {
        C5071z3 z3Var = (C5071z3) entry.getKey();
        if (z3Var.mo19771l() == C4996t7.MESSAGE) {
            if (z3Var.zzd()) {
                for (C4945r5 k : (List) entry.getValue()) {
                    if (!k.mo19054k()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C4945r5) {
                    if (!((C4945r5) value).mo19054k()) {
                        return false;
                    }
                } else if (value instanceof C4944r4) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo19740a(C5045x3<T> x3Var) {
        for (int i = 0; i < x3Var.f14506a.mo19300c(); i++) {
            m21783b(x3Var.f14506a.mo19298a(i));
        }
        for (Entry b : x3Var.f14506a.mo19303d()) {
            m21783b(b);
        }
    }

    /* renamed from: a */
    private static Object m21777a(Object obj) {
        if (obj instanceof C5034w5) {
            return ((C5034w5) obj).mo19730a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private static int m21781b(C4934q7 q7Var, Object obj) {
        switch (C4682a4.f13969b[q7Var.ordinal()]) {
            case 1:
                return zzek.m21924b(((Double) obj).doubleValue());
            case 2:
                return zzek.m21925b(((Float) obj).floatValue());
            case 3:
                return zzek.m21944d(((Long) obj).longValue());
            case 4:
                return zzek.m21947e(((Long) obj).longValue());
            case 5:
                return zzek.m21948f(((Integer) obj).intValue());
            case 6:
                return zzek.m21955g(((Long) obj).longValue());
            case 7:
                return zzek.m21960i(((Integer) obj).intValue());
            case 8:
                return zzek.m21936b(((Boolean) obj).booleanValue());
            case 9:
                return zzek.m21940c((C4945r5) obj);
            case 10:
                if (obj instanceof C4944r4) {
                    return zzek.m21922a((C5020v4) (C4944r4) obj);
                }
                return zzek.m21933b((C4945r5) obj);
            case 11:
                if (obj instanceof C5070z2) {
                    return zzek.m21934b((C5070z2) obj);
                }
                return zzek.m21935b((String) obj);
            case 12:
                if (obj instanceof C5070z2) {
                    return zzek.m21934b((C5070z2) obj);
                }
                return zzek.m21937b((byte[]) obj);
            case 13:
                return zzek.m21952g(((Integer) obj).intValue());
            case 14:
                return zzek.m21963j(((Integer) obj).intValue());
            case 15:
                return zzek.m21959h(((Long) obj).longValue());
            case 16:
                return zzek.m21956h(((Integer) obj).intValue());
            case 17:
                return zzek.m21951f(((Long) obj).longValue());
            case 18:
                if (obj instanceof C4873m4) {
                    return zzek.m21965k(((C4873m4) obj).mo19235a());
                }
                return zzek.m21965k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    static void m21779a(zzek zzek, C4934q7 q7Var, int i, Object obj) throws IOException {
        if (q7Var == C4934q7.GROUP) {
            C4945r5 r5Var = (C4945r5) obj;
            C4819j4.m20397a(r5Var);
            zzek.mo19782a(i, 3);
            r5Var.mo19044a(zzek);
            zzek.mo19782a(i, 4);
            return;
        }
        zzek.mo19782a(i, q7Var.mo19397i());
        switch (C4682a4.f13969b[q7Var.ordinal()]) {
            case 1:
                zzek.mo19777a(((Double) obj).doubleValue());
                break;
            case 2:
                zzek.mo19778a(((Float) obj).floatValue());
                return;
            case 3:
                zzek.mo19789a(((Long) obj).longValue());
                return;
            case 4:
                zzek.mo19789a(((Long) obj).longValue());
                return;
            case 5:
                zzek.mo19779a(((Integer) obj).intValue());
                return;
            case 6:
                zzek.mo19805c(((Long) obj).longValue());
                return;
            case 7:
                zzek.mo19806d(((Integer) obj).intValue());
                return;
            case 8:
                zzek.mo19794a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((C4945r5) obj).mo19044a(zzek);
                return;
            case 10:
                zzek.mo19790a((C4945r5) obj);
                return;
            case 11:
                if (obj instanceof C5070z2) {
                    zzek.mo19791a((C5070z2) obj);
                    return;
                } else {
                    zzek.mo19792a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C5070z2) {
                    zzek.mo19791a((C5070z2) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzek.mo19801b(bArr, 0, bArr.length);
                return;
            case 13:
                zzek.mo19796b(((Integer) obj).intValue());
                return;
            case 14:
                zzek.mo19806d(((Integer) obj).intValue());
                return;
            case 15:
                zzek.mo19805c(((Long) obj).longValue());
                return;
            case 16:
                zzek.mo19802c(((Integer) obj).intValue());
                return;
            case 17:
                zzek.mo19800b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof C4873m4)) {
                    zzek.mo19779a(((Integer) obj).intValue());
                    break;
                } else {
                    zzek.mo19779a(((C4873m4) obj).mo19235a());
                    return;
                }
        }
    }

    /* renamed from: a */
    static int m21774a(C4934q7 q7Var, int i, Object obj) {
        int e = zzek.m21945e(i);
        if (q7Var == C4934q7.GROUP) {
            C4819j4.m20397a((C4945r5) obj);
            e <<= 1;
        }
        return e + m21781b(q7Var, obj);
    }

    /* renamed from: a */
    public static int m21775a(C5071z3<?> z3Var, Object obj) {
        C4934q7 i = z3Var.mo19770i();
        int a = z3Var.mo19767a();
        if (!z3Var.zzd()) {
            return m21774a(i, a, obj);
        }
        int i2 = 0;
        if (z3Var.zze()) {
            for (Object b : (List) obj) {
                i2 += m21781b(i, b);
            }
            return zzek.m21945e(a) + i2 + zzek.m21967l(i2);
        }
        for (Object a2 : (List) obj) {
            i2 += m21774a(i, a, a2);
        }
        return i2;
    }
}
