package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4801i4.C4803b;
import com.google.android.gms.internal.measurement.C4801i4.C4806e;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
final class C5047x5<T> implements C4790h6<T> {

    /* renamed from: a */
    private final C4945r5 f14509a;

    /* renamed from: b */
    private final C5074z6<?, ?> f14510b;

    /* renamed from: c */
    private final boolean f14511c;

    /* renamed from: d */
    private final C5032w3<?> f14512d;

    private C5047x5(C5074z6<?, ?> z6Var, C5032w3<?> w3Var, C4945r5 r5Var) {
        this.f14510b = z6Var;
        this.f14511c = w3Var.mo19717a(r5Var);
        this.f14512d = w3Var;
        this.f14509a = r5Var;
    }

    /* renamed from: a */
    static <T> C5047x5<T> m21797a(C5074z6<?, ?> z6Var, C5032w3<?> w3Var, C4945r5 r5Var) {
        return new C5047x5<>(z6Var, w3Var, r5Var);
    }

    /* renamed from: b */
    public final void mo19034b(T t, T t2) {
        C4821j6.m20417a(this.f14510b, t, t2);
        if (this.f14511c) {
            C4821j6.m20416a(this.f14512d, t, t2);
        }
    }

    /* renamed from: c */
    public final void mo19036c(T t) {
        this.f14510b.mo18844d(t);
        this.f14512d.mo19719c(t);
    }

    /* renamed from: d */
    public final int mo19037d(T t) {
        C5074z6<?, ?> z6Var = this.f14510b;
        int e = z6Var.mo18845e(z6Var.mo18838b(t)) + 0;
        return this.f14511c ? e + this.f14512d.mo19711a((Object) t).mo19747f() : e;
    }

    /* renamed from: a */
    public final T mo19029a() {
        return this.f14509a.mo19046c().mo19057F();
    }

    /* renamed from: a */
    public final boolean mo19033a(T t, T t2) {
        if (!this.f14510b.mo18838b(t).equals(this.f14510b.mo18838b(t2))) {
            return false;
        }
        if (this.f14511c) {
            return this.f14512d.mo19711a((Object) t).equals(this.f14512d.mo19711a((Object) t2));
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo19035b(T t) {
        return this.f14512d.mo19711a((Object) t).mo19745e();
    }

    /* renamed from: a */
    public final int mo19028a(T t) {
        int hashCode = this.f14510b.mo18838b(t).hashCode();
        return this.f14511c ? (hashCode * 53) + this.f14512d.mo19711a((Object) t).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final void mo19031a(T t, C5036w7 w7Var) throws IOException {
        Iterator c = this.f14512d.mo19711a((Object) t).mo19742c();
        while (c.hasNext()) {
            Entry entry = (Entry) c.next();
            C5071z3 z3Var = (C5071z3) entry.getKey();
            if (z3Var.mo19771l() != C4996t7.MESSAGE || z3Var.zzd() || z3Var.zze()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof C4993t4) {
                w7Var.mo19408a(z3Var.mo19767a(), (Object) ((C4993t4) entry).mo19689a().mo19722b());
            } else {
                w7Var.mo19408a(z3Var.mo19767a(), entry.getValue());
            }
        }
        C5074z6<?, ?> z6Var = this.f14510b;
        z6Var.mo18840b(z6Var.mo18838b(t), w7Var);
    }

    /* renamed from: a */
    public final void mo19032a(T t, byte[] bArr, int i, int i2, C5004u2 u2Var) throws IOException {
        C4801i4 i4Var = (C4801i4) t;
        C4699b7 b7Var = i4Var.zzb;
        if (b7Var == C4699b7.m19962d()) {
            b7Var = C4699b7.m19963e();
            i4Var.zzb = b7Var;
        }
        ((C4803b) t).mo19068a();
        C4806e eVar = null;
        while (i < i2) {
            int a = C5018v2.m21625a(bArr, i, u2Var);
            int i3 = u2Var.f14433a;
            if (i3 == 11) {
                int i4 = 0;
                Object obj = null;
                while (a < i2) {
                    a = C5018v2.m21625a(bArr, a, u2Var);
                    int i5 = u2Var.f14433a;
                    int i6 = i5 >>> 3;
                    int i7 = i5 & 7;
                    if (i6 != 2) {
                        if (i6 == 3) {
                            if (eVar != null) {
                                C4712c6.m19997a();
                                throw new NoSuchMethodError();
                            } else if (i7 == 2) {
                                a = C5018v2.m21632e(bArr, a, u2Var);
                                obj = (C5070z2) u2Var.f14435c;
                            }
                        }
                    } else if (i7 == 0) {
                        a = C5018v2.m21625a(bArr, a, u2Var);
                        i4 = u2Var.f14433a;
                        eVar = (C4806e) this.f14512d.mo19713a(u2Var.f14436d, this.f14509a, i4);
                    }
                    if (i5 == 12) {
                        break;
                    }
                    a = C5018v2.m21618a(i5, bArr, a, i2, u2Var);
                }
                if (obj != null) {
                    b7Var.mo18865a((i4 << 3) | 2, obj);
                }
                i = a;
            } else if ((i3 & 7) == 2) {
                eVar = (C4806e) this.f14512d.mo19713a(u2Var.f14436d, this.f14509a, i3 >>> 3);
                if (eVar == null) {
                    i = C5018v2.m21616a(i3, bArr, a, i2, b7Var, u2Var);
                } else {
                    C4712c6.m19997a();
                    throw new NoSuchMethodError();
                }
            } else {
                i = C5018v2.m21618a(i3, bArr, a, i2, u2Var);
            }
        }
        if (i != i2) {
            throw zzfn.m22034i();
        }
    }

    /* renamed from: a */
    public final void mo19030a(T t, C4808i6 i6Var, C5005u3 u3Var) throws IOException {
        boolean z;
        C5074z6<?, ?> z6Var = this.f14510b;
        C5032w3<?> w3Var = this.f14512d;
        Object c = z6Var.mo18842c(t);
        C5045x3 b = w3Var.mo19718b(t);
        do {
            try {
                if (i6Var.mo19070a() == Integer.MAX_VALUE) {
                    z6Var.mo18841b((Object) t, c);
                    return;
                }
                int i = i6Var.mo19091i();
                if (i == 11) {
                    int i2 = 0;
                    Object obj = null;
                    C5070z2 z2Var = null;
                    while (i6Var.mo19070a() != Integer.MAX_VALUE) {
                        int i3 = i6Var.mo19091i();
                        if (i3 == 16) {
                            i2 = i6Var.mo19100n();
                            obj = w3Var.mo19713a(u3Var, this.f14509a, i2);
                        } else if (i3 == 26) {
                            if (obj != null) {
                                w3Var.mo19714a(i6Var, obj, u3Var, b);
                            } else {
                                z2Var = i6Var.mo19083e();
                            }
                        } else if (!i6Var.mo19097l()) {
                            break;
                        }
                    }
                    if (i6Var.mo19091i() != 12) {
                        throw zzfn.m22032g();
                    } else if (z2Var != null) {
                        if (obj != null) {
                            w3Var.mo19716a(z2Var, obj, u3Var, b);
                        } else {
                            z6Var.mo18833a(c, i2, z2Var);
                        }
                    }
                } else if ((i & 7) == 2) {
                    Object a = w3Var.mo19713a(u3Var, this.f14509a, i >>> 3);
                    if (a != null) {
                        w3Var.mo19714a(i6Var, a, u3Var, b);
                    } else {
                        z = z6Var.mo19774a(c, i6Var);
                        continue;
                    }
                } else {
                    z = i6Var.mo19097l();
                    continue;
                }
                z = true;
                continue;
            } finally {
                z6Var.mo18841b((Object) t, c);
            }
        } while (z);
    }
}
