package p076c.p112d.p113a.p130b.p131a.p225a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C5742h;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.j */
final class C6156j extends C6157k<Void> {
    C6156j(C6153g gVar, C7205o<Void> oVar) {
        super(gVar, new C5742h("OnCompleteUpdateCallback"), oVar);
    }

    /* renamed from: a */
    public final void mo25051a(Bundle bundle) throws RemoteException {
        super.mo25051a(bundle);
        if (C6153g.m28256b(bundle) != 0) {
            this.f17352N.mo28633a((Exception) new InstallException(C6153g.m28256b(bundle)));
        } else {
            this.f17352N.mo28634a(null);
        }
    }
}
