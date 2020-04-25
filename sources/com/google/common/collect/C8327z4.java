package com.google.common.collect;

import com.google.common.base.C7397x;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.z4 */
/* compiled from: RegularImmutableList */
class C8327z4<E> extends C8257x2<E> {

    /* renamed from: N */
    private final transient int f22214N;

    /* renamed from: O */
    private final transient int f22215O;

    /* renamed from: P */
    private final transient Object[] f22216P;

    C8327z4(Object[] objArr, int i, int i2) {
        this.f22214N = i;
        this.f22215O = i2;
        this.f22216P = objArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo29839a(Object[] objArr, int i) {
        System.arraycopy(this.f22216P, this.f22214N, objArr, i, this.f22215O);
        return i + this.f22215O;
    }

    public E get(int i) {
        C7397x.m35663a(i, this.f22215O);
        return this.f22216P[i + this.f22214N];
    }

    public int indexOf(@C5952h Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < this.f22215O; i++) {
            if (this.f22216P[this.f22214N + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo29686j() {
        return this.f22215O != this.f22216P.length;
    }

    public int lastIndexOf(@C5952h Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = this.f22215O - 1; i >= 0; i--) {
            if (this.f22216P[this.f22214N + i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.f22215O;
    }

    public C8062m6<E> listIterator(int i) {
        return C8178t3.m39093a((T[]) this.f22216P, this.f22214N, this.f22215O, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8257x2<E> mo30618a(int i, int i2) {
        return new C8327z4(this.f22216P, this.f22214N + i, i2 - i);
    }

    C8327z4(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }
}
