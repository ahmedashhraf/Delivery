package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import androidx.annotation.C0221u;
import androidx.core.content.C0846e;
import p201f.p202a.C5952h;

/* renamed from: com.google.android.gms.internal.measurement.j1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4816j1 implements C4735e1 {
    @C0221u("GservicesLoader.class")

    /* renamed from: c */
    private static C4816j1 f14214c;
    @C5952h

    /* renamed from: a */
    private final Context f14215a;
    @C5952h

    /* renamed from: b */
    private final ContentObserver f14216b;

    private C4816j1(Context context) {
        this.f14215a = context;
        this.f14216b = new C4857l1(this, null);
        context.getContentResolver().registerContentObserver(C5055y0.f14518a, true, this.f14216b);
    }

    /* renamed from: a */
    static C4816j1 m20384a(Context context) {
        C4816j1 j1Var;
        synchronized (C4816j1.class) {
            if (f14214c == null) {
                f14214c = C0846e.m4944b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4816j1(context) : new C4816j1();
            }
            j1Var = f14214c;
        }
        return j1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo18931a(String str) {
        if (this.f14215a == null) {
            return null;
        }
        try {
            return (String) C4785h1.m20254a(new C4798i1(this, str));
        } catch (IllegalStateException | SecurityException unused) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo19152b(String str) {
        return C5055y0.m21819a(this.f14215a.getContentResolver(), str, (String) null);
    }

    private C4816j1() {
        this.f14215a = null;
        this.f14216b = null;
    }

    /* renamed from: a */
    static synchronized void m20385a() {
        synchronized (C4816j1.class) {
            if (!(f14214c == null || f14214c.f14215a == null || f14214c.f14216b == null)) {
                f14214c.f14215a.getContentResolver().unregisterContentObserver(f14214c.f14216b);
            }
            f14214c = null;
        }
    }
}
