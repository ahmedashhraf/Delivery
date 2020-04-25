package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;

/* renamed from: com.google.android.gms.tasks.l */
public class C5562l<TResult> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5556i0<TResult> f15870a = new C5556i0<>();

    public C5562l() {
    }

    /* renamed from: a */
    public void mo22019a(TResult tresult) {
        this.f15870a.mo22005a(tresult);
    }

    /* renamed from: b */
    public boolean mo22021b(TResult tresult) {
        return this.f15870a.mo22010b(tresult);
    }

    /* renamed from: a */
    public void mo22018a(@C0193h0 Exception exc) {
        this.f15870a.mo22004a(exc);
    }

    /* renamed from: b */
    public boolean mo22020b(@C0193h0 Exception exc) {
        return this.f15870a.mo22009b(exc);
    }

    public C5562l(@C0193h0 C5539a aVar) {
        aVar.mo21971a(new C5552g0(this));
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<TResult> mo22017a() {
        return this.f15870a;
    }
}
