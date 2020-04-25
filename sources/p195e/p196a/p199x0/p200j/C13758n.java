package p195e.p196a.p199x0.p200j;

import java.util.ArrayList;

/* renamed from: e.a.x0.j.n */
/* compiled from: LinkedArrayList */
public class C13758n {

    /* renamed from: N */
    Object[] f39802N;

    /* renamed from: O */
    volatile int f39803O;

    /* renamed from: P */
    int f39804P;

    /* renamed from: a */
    final int f39805a;

    /* renamed from: b */
    Object[] f39806b;

    public C13758n(int i) {
        this.f39805a = i;
    }

    /* renamed from: a */
    public Object[] mo43148a() {
        return this.f39806b;
    }

    /* renamed from: b */
    public int mo43149b() {
        return this.f39803O;
    }

    /* renamed from: c */
    public void mo43150c(Object obj) {
        if (this.f39803O == 0) {
            this.f39806b = new Object[(this.f39805a + 1)];
            Object[] objArr = this.f39806b;
            this.f39802N = objArr;
            objArr[0] = obj;
            this.f39804P = 1;
            this.f39803O = 1;
            return;
        }
        int i = this.f39804P;
        int i2 = this.f39805a;
        if (i == i2) {
            Object[] objArr2 = new Object[(i2 + 1)];
            objArr2[0] = obj;
            this.f39802N[i2] = objArr2;
            this.f39802N = objArr2;
            this.f39804P = 1;
            this.f39803O++;
            return;
        }
        this.f39802N[i] = obj;
        this.f39804P = i + 1;
        this.f39803O++;
    }

    public String toString() {
        int i = this.f39805a;
        int i2 = this.f39803O;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] a = mo43148a();
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(a[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    a = a[i];
                }
            }
            return arrayList.toString();
        }
    }
}
