package p076c.p112d.p113a.p130b.p131a.p225a;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.C5742h;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.m */
final class C6159m extends C6157k<C6147a> {

    /* renamed from: P */
    private final String f17361P;

    C6159m(C6153g gVar, C7205o<C6147a> oVar, String str) {
        super(gVar, new C5742h("OnRequestInstallCallback"), oVar);
        this.f17361P = str;
    }

    /* renamed from: e */
    public final void mo25052e(Bundle bundle) throws RemoteException {
        super.mo25052e(bundle);
        if (C6153g.m28256b(bundle) == 0 || C6153g.m28256b(bundle) == 1) {
            this.f17352N.mo28634a(C6153g.m28258b(bundle, this.f17361P));
        } else {
            this.f17352N.mo28633a((Exception) new InstallException(C6153g.m28256b(bundle)));
        }
    }
}
