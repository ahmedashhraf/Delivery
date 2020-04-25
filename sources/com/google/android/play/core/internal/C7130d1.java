package com.google.android.play.core.internal;

import com.google.android.play.core.tasks.C7205o;

/* renamed from: com.google.android.play.core.internal.d1 */
public abstract class C7130d1 implements Runnable {

    /* renamed from: a */
    private final C7205o<?> f20236a;

    C7130d1() {
        this.f20236a = null;
    }

    public C7130d1(C7205o<?> oVar) {
        this.f20236a = oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25050a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C7205o<?> mo28499b() {
        return this.f20236a;
    }

    public final void run() {
        try {
            mo25050a();
        } catch (Exception e) {
            C7205o<?> oVar = this.f20236a;
            if (oVar != null) {
                oVar.mo28633a(e);
            }
        }
    }
}
