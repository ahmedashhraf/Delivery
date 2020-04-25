package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public abstract class C5070z2 implements Serializable, Iterable<Byte> {

    /* renamed from: N */
    private static final C4773g3 f14555N = (C4955s2.m21100a() ? new C4818j3(null) : new C4723d3(null));

    /* renamed from: O */
    private static final Comparator<C5070z2> f14556O = new C4695b3();

    /* renamed from: b */
    public static final C5070z2 f14557b = new C4832k3(C4819j4.f14220c);

    /* renamed from: a */
    private int f14558a = 0;

    C5070z2() {
    }

    /* renamed from: a */
    public static C5070z2 m21869a(byte[] bArr, int i, int i2) {
        m21871b(i, i + i2, bArr.length);
        return new C4832k3(f14555N.mo18906a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m21870b(byte b) {
        return b & 255;
    }

    /* renamed from: b */
    static int m21871b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: c */
    public static C5070z2 m21872c(String str) {
        return new C4832k3(str.getBytes(C4819j4.f14218a));
    }

    /* renamed from: f */
    static C4800i3 m21873f(int i) {
        return new C4800i3(i, null);
    }

    /* renamed from: a */
    public abstract byte mo18882a(int i);

    /* renamed from: a */
    public abstract int mo18883a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo19161a(int i, int i2, int i3);

    /* renamed from: a */
    public abstract C5070z2 mo19162a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo19163a(Charset charset);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo19164a(C5031w2 w2Var) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract byte mo18884e(int i);

    /* renamed from: e */
    public abstract boolean mo19165e();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f14558a;
        if (i == 0) {
            int a = mo18883a();
            i = mo19161a(a, 0, a);
            if (i == 0) {
                i = 1;
            }
            this.f14558a = i;
        }
        return i;
    }

    /* renamed from: i */
    public final String mo19764i() {
        return mo18883a() == 0 ? "" : mo19163a(C4819j4.f14218a);
    }

    public /* synthetic */ Iterator iterator() {
        return new C5057y2(this);
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(mo18883a())});
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo19762f() {
        return this.f14558a;
    }

    /* renamed from: a */
    static C5070z2 m21868a(byte[] bArr) {
        return new C4832k3(bArr);
    }
}
