package p076c.p112d.p113a.p114a.p118d.p120b;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4093a0;
import com.google.android.gms.common.api.internal.C4230z;
import com.google.android.gms.tasks.C5562l;

/* renamed from: c.d.a.a.d.b.m */
abstract class C2594m extends C4230z<C2590i, Void> {

    /* renamed from: c */
    private C5562l<Void> f9695c;

    private C2594m() {
    }

    /* synthetic */ C2594m(C2592k kVar) {
        this();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10087a(C2586e eVar) throws RemoteException;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10088a(Status status) {
        C4093a0.m17711a(status, this.f9695c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ void mo10089a(C4061b bVar, C5562l lVar) throws RemoteException {
        C2590i iVar = (C2590i) bVar;
        this.f9695c = lVar;
        mo10087a((C2586e) iVar.mo18262z());
    }
}
