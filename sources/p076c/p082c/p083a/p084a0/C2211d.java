package p076c.p082c.p083a.p084a0;

import java.util.Arrays;
import p076c.p082c.p083a.C2236n.C2240d;

/* renamed from: c.c.a.a0.d */
/* compiled from: FixedPreloadSizeProvider */
public class C2211d<T> implements C2240d<T> {

    /* renamed from: a */
    private final int[] f8762a;

    public C2211d(int i, int i2) {
        this.f8762a = new int[]{i, i2};
    }

    /* renamed from: a */
    public int[] mo9380a(T t, int i, int i2) {
        int[] iArr = this.f8762a;
        return Arrays.copyOf(iArr, iArr.length);
    }
}
