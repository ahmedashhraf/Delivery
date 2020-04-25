package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C4137i.C4138a;

/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4197s1 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f13136a;

    /* renamed from: b */
    private final /* synthetic */ C4139b f13137b;

    C4197s1(C4139b bVar, ConnectionResult connectionResult) {
        this.f13137b = bVar;
        this.f13136a = connectionResult;
    }

    public final void run() {
        C4138a aVar = (C4138a) C4137i.this.f12965i.get(this.f13137b.f12984b);
        if (aVar != null) {
            if (this.f13136a.mo17580R()) {
                this.f13137b.f12987e = true;
                if (this.f13137b.f12983a.mo17646o()) {
                    this.f13137b.m17912a();
                    return;
                }
                try {
                    this.f13137b.f12983a.mo17636a(null, this.f13137b.f12983a.mo17640g());
                } catch (SecurityException unused) {
                    aVar.mo17767a(new ConnectionResult(10));
                }
            } else {
                aVar.mo17767a(this.f13136a);
            }
        }
    }
}
