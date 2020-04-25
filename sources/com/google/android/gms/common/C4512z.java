package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.z */
abstract class C4512z extends C4510x {

    /* renamed from: O */
    private static final WeakReference<byte[]> f13775O = new WeakReference<>(null);

    /* renamed from: N */
    private WeakReference<byte[]> f13776N = f13775O;

    C4512z(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G0 */
    public final byte[] mo18575G0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f13776N.get();
            if (bArr == null) {
                bArr = zzd();
                this.f13776N = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] zzd();
}
