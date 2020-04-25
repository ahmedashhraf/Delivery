package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
abstract class C5074z6<T, B> {
    C5074z6() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract B mo18829a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo18830a(B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18831a(B b, int i, int i2);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18832a(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18833a(B b, int i, C5070z2 z2Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18834a(B b, int i, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18835a(T t, C5036w7 w7Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo18836a(Object obj, T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo18837a(C4808i6 i6Var);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo19774a(B b, C4808i6 i6Var) throws IOException {
        int i = i6Var.mo19091i();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mo18832a(b, i2, i6Var.mo19102o());
            return true;
        } else if (i3 == 1) {
            mo18839b(b, i2, i6Var.mo19075b());
            return true;
        } else if (i3 == 2) {
            mo18833a(b, i2, i6Var.mo19083e());
            return true;
        } else if (i3 == 3) {
            Object a = mo18829a();
            int i4 = 4 | (i2 << 3);
            while (i6Var.mo19070a() != Integer.MAX_VALUE) {
                if (!mo19774a((B) a, i6Var)) {
                    break;
                }
            }
            if (i4 == i6Var.mo19091i()) {
                mo18834a(b, i2, (T) mo18830a((B) a));
                return true;
            }
            throw zzfn.m22032g();
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                mo18831a(b, i2, i6Var.mo19085f());
                return true;
            }
            throw zzfn.m22033h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract T mo18838b(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo18839b(B b, int i, long j);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo18840b(T t, C5036w7 w7Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo18841b(Object obj, B b);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract B mo18842c(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract T mo18843c(T t, T t2);

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public abstract void mo18844d(Object obj);

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract int mo18845e(T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract int mo18846f(T t);
}
