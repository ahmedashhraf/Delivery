package com.google.zxing.p346y.p347c0;

import com.google.zxing.NotFoundException;
import com.google.zxing.p335u.p336m.C9055a;
import com.google.zxing.p346y.C9152r;

/* renamed from: com.google.zxing.y.c0.a */
/* compiled from: AbstractRSSReader */
public abstract class C9107a extends C9152r {

    /* renamed from: g */
    private static final float f23875g = 0.2f;

    /* renamed from: h */
    private static final float f23876h = 0.45f;

    /* renamed from: i */
    private static final float f23877i = 0.7916667f;

    /* renamed from: j */
    private static final float f23878j = 0.89285713f;

    /* renamed from: a */
    private final int[] f23879a = new int[4];

    /* renamed from: b */
    private final int[] f23880b = new int[8];

    /* renamed from: c */
    private final float[] f23881c = new float[4];

    /* renamed from: d */
    private final float[] f23882d = new float[4];

    /* renamed from: e */
    private final int[] f23883e;

    /* renamed from: f */
    private final int[] f23884f;

    protected C9107a() {
        int[] iArr = this.f23880b;
        this.f23883e = new int[(iArr.length / 2)];
        this.f23884f = new int[(iArr.length / 2)];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int[] mo33120a() {
        return this.f23880b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] mo33121b() {
        return this.f23879a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int[] mo33122c() {
        return this.f23884f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final float[] mo33123d() {
        return this.f23882d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int[] mo33124e() {
        return this.f23883e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final float[] mo33125f() {
        return this.f23881c;
    }

    /* renamed from: a */
    protected static int m42588a(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (C9152r.m42762a(iArr, iArr2[i], (float) f23876h) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.m41712a();
    }

    /* renamed from: b */
    protected static void m42590b(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    @Deprecated
    /* renamed from: a */
    protected static int m42587a(int[] iArr) {
        return C9055a.m42371a(iArr);
    }

    /* renamed from: a */
    protected static void m42589a(int[] iArr, float[] fArr) {
        float f = fArr[0];
        int i = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: b */
    protected static boolean m42591b(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= f23877i && f <= f23878j) {
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            for (int i4 : iArr) {
                if (i4 > i2) {
                    i2 = i4;
                }
                if (i4 < i3) {
                    i3 = i4;
                }
            }
            if (i2 < i3 * 10) {
                return true;
            }
        }
        return false;
    }
}
