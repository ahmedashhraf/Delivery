package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.tasks.C5562l;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.s */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4195s<A extends C4061b, L> {

    /* renamed from: a */
    private final C4167n<L> f13132a;

    /* renamed from: b */
    private final Feature[] f13133b;

    /* renamed from: c */
    private final boolean f13134c;

    @C4056a
    protected C4195s(C4167n<L> nVar) {
        this.f13132a = nVar;
        this.f13133b = null;
        this.f13134c = false;
    }

    @C4056a
    /* renamed from: a */
    public void mo17955a() {
        this.f13132a.mo17930a();
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract void mo17829a(A a, C5562l<Void> lVar) throws RemoteException;

    @C4056a
    /* renamed from: b */
    public C4168a<L> mo17956b() {
        return this.f13132a.mo17932b();
    }

    @C4056a
    @C0195i0
    /* renamed from: c */
    public Feature[] mo17957c() {
        return this.f13133b;
    }

    /* renamed from: d */
    public final boolean mo17958d() {
        return this.f13134c;
    }

    @C4056a
    protected C4195s(C4167n<L> nVar, Feature[] featureArr, boolean z) {
        this.f13132a = nVar;
        this.f13133b = featureArr;
        this.f13134c = z;
    }
}
