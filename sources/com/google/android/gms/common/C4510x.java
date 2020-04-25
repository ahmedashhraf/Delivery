package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4339h1;
import com.google.android.gms.common.internal.C4342i1;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.x */
abstract class C4510x extends C4342i1 {

    /* renamed from: b */
    private int f13773b;

    protected C4510x(byte[] bArr) {
        C4300a0.m18627a(bArr.length == 25);
        this.f13773b = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m19434a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G0 */
    public abstract byte[] mo18575G0();

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C4339h1)) {
            try {
                C4339h1 h1Var = (C4339h1) obj;
                if (h1Var.mo18325l() != hashCode()) {
                    return false;
                }
                C4519d i = h1Var.mo18324i();
                if (i == null) {
                    return false;
                }
                return Arrays.equals(mo18575G0(), (byte[]) C4523f.m19512d(i));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f13773b;
    }

    /* renamed from: i */
    public final C4519d mo18324i() {
        return C4523f.m19511a(mo18575G0());
    }

    /* renamed from: l */
    public final int mo18325l() {
        return hashCode();
    }
}
