package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.k3 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
class C4832k3 extends C4787h3 {

    /* renamed from: P */
    protected final byte[] f14238P;

    C4832k3(byte[] bArr) {
        if (bArr != null) {
            this.f14238P = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public byte mo18882a(int i) {
        return this.f14238P[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public byte mo18884e(int i) {
        return this.f14238P[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5070z2) || mo18883a() != ((C5070z2) obj).mo18883a()) {
            return false;
        }
        if (mo18883a() == 0) {
            return true;
        }
        if (!(obj instanceof C4832k3)) {
            return obj.equals(this);
        }
        C4832k3 k3Var = (C4832k3) obj;
        int f = mo19762f();
        int f2 = k3Var.mo19762f();
        if (f == 0 || f2 == 0 || f == f2) {
            return mo19026a((C5070z2) k3Var, 0, mo18883a());
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public int mo18885l() {
        return 0;
    }

    /* renamed from: a */
    public int mo18883a() {
        return this.f14238P.length;
    }

    /* renamed from: e */
    public final boolean mo19165e() {
        int l = mo18885l();
        return C4809i7.m20371a(this.f14238P, l, mo18883a() + l);
    }

    /* renamed from: a */
    public final C5070z2 mo19162a(int i, int i2) {
        int b = C5070z2.m21871b(0, i2, mo18883a());
        if (b == 0) {
            return C5070z2.f14557b;
        }
        return new C4709c3(this.f14238P, mo18885l(), b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19164a(C5031w2 w2Var) throws IOException {
        w2Var.mo19726a(this.f14238P, mo18885l(), mo18883a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo19163a(Charset charset) {
        return new String(this.f14238P, mo18885l(), mo18883a(), charset);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo19026a(C5070z2 z2Var, int i, int i2) {
        if (i2 > z2Var.mo18883a()) {
            int a = mo18883a();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > z2Var.mo18883a()) {
            int a2 = z2Var.mo18883a();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(a2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(z2Var instanceof C4832k3)) {
            return z2Var.mo19162a(0, i2).equals(mo19162a(0, i2));
        } else {
            C4832k3 k3Var = (C4832k3) z2Var;
            byte[] bArr = this.f14238P;
            byte[] bArr2 = k3Var.f14238P;
            int l = mo18885l() + i2;
            int l2 = mo18885l();
            int l3 = k3Var.mo18885l();
            while (l2 < l) {
                if (bArr[l2] != bArr2[l3]) {
                    return false;
                }
                l2++;
                l3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo19161a(int i, int i2, int i3) {
        return C4819j4.m20391a(i, this.f14238P, mo18885l(), i3);
    }
}
