package com.google.android.gms.internal.location;

import android.os.Looper;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.internal.location.k0 */
public final class C4646k0 {
    /* renamed from: a */
    public static Looper m19776a() {
        C4300a0.m18632b(Looper.myLooper() != null, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }

    /* renamed from: a */
    public static Looper m19777a(@C0195i0 Looper looper) {
        return looper != null ? looper : m19776a();
    }
}
