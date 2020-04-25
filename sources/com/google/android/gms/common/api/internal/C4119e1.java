package com.google.android.gms.common.api.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.auth.api.signin.internal.C3997b;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.C4247r;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.e1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4119e1 implements C4247r<Status> {

    /* renamed from: a */
    private final /* synthetic */ C4226y f12924a;

    /* renamed from: b */
    private final /* synthetic */ boolean f12925b;

    /* renamed from: c */
    private final /* synthetic */ C4086i f12926c;

    /* renamed from: d */
    private final /* synthetic */ C4232z0 f12927d;

    C4119e1(C4232z0 z0Var, C4226y yVar, boolean z, C4086i iVar) {
        this.f12927d = z0Var;
        this.f12924a = yVar;
        this.f12925b = z;
        this.f12926c = iVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17815a(@C0193h0 C4246q qVar) {
        Status status = (Status) qVar;
        C3997b.m17378a(this.f12927d.f13202j).mo17524e();
        if (status.mo17617T() && this.f12927d.mo17718g()) {
            this.f12927d.mo17721j();
        }
        this.f12924a.mo17744a(status);
        if (this.f12925b) {
            this.f12926c.mo17715d();
        }
    }
}
