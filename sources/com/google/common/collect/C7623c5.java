package com.google.common.collect;

import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2778d;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.c5 */
/* compiled from: RegularImmutableSet */
final class C7623c5<E> extends C7859g3<E> {

    /* renamed from: P */
    private final Object[] f21207P;
    @C2778d

    /* renamed from: Q */
    final transient Object[] f21208Q;

    /* renamed from: R */
    private final transient int f21209R;

    /* renamed from: S */
    private final transient int f21210S;

    C7623c5(Object[] objArr, int i, Object[] objArr2, int i2) {
        this.f21207P = objArr;
        this.f21208Q = objArr2;
        this.f21209R = i2;
        this.f21210S = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        Object[] objArr2 = this.f21207P;
        System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
        return i + this.f21207P.length;
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int a = C8093p2.m38750a(obj.hashCode());
        while (true) {
            Object obj2 = this.f21208Q[this.f21209R & a];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8257x2<E> mo29646f() {
        return new C8274x4((C8175t2<E>) this, this.f21207P);
    }

    public int hashCode() {
        return this.f21210S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo29841k() {
        return true;
    }

    public int size() {
        return this.f21207P.length;
    }

    public C8023l6<E> iterator() {
        return C8178t3.m39111b((T[]) this.f21207P);
    }
}
