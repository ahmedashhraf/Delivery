package p076c.p112d.p113a.p130b.p131a.p225a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C5742h;
import com.google.android.play.core.internal.C7126b1;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.k */
class C6157k<T> extends C7126b1 {

    /* renamed from: N */
    final C7205o<T> f17352N;

    /* renamed from: O */
    private final /* synthetic */ C6153g f17353O;

    /* renamed from: b */
    private final C5742h f17354b;

    C6157k(C6153g gVar, C5742h hVar, C7205o<T> oVar) {
        this.f17353O = gVar;
        this.f17354b = hVar;
        this.f17352N = oVar;
    }

    /* renamed from: a */
    public void mo25051a(Bundle bundle) throws RemoteException {
        this.f17353O.f17343a.mo28495a();
        this.f17354b.mo23043a("onCompleteUpdate", new Object[0]);
    }

    /* renamed from: e */
    public void mo25052e(Bundle bundle) throws RemoteException {
        this.f17353O.f17343a.mo28495a();
        this.f17354b.mo23043a("onRequestInfo", new Object[0]);
    }
}
