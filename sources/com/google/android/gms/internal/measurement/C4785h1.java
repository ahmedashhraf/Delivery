package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.h1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final /* synthetic */ class C4785h1 {
    /* renamed from: a */
    public static <V> V m20254a(C4771g1<V> g1Var) {
        long clearCallingIdentity;
        try {
            return g1Var.mo18904a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = g1Var.mo18904a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
