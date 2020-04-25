package p076c.p112d.p113a.p130b.p131a.p225a;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7152y0;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.i */
final class C6155i extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ C7205o f17349N;

    /* renamed from: O */
    private final /* synthetic */ C6153g f17350O;

    /* renamed from: b */
    private final /* synthetic */ String f17351b;

    C6155i(C6153g gVar, C7205o oVar, String str, C7205o oVar2) {
        this.f17350O = gVar;
        this.f17351b = str;
        this.f17349N = oVar2;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7152y0) this.f17350O.f17343a.mo28497b()).mo28492a(this.f17350O.f17344b, this.f17350O.m28260c(this.f17351b), new C6159m(this.f17350O, this.f17349N, this.f17351b));
        } catch (RemoteException e) {
            C6153g.f17341d.mo23044a((Throwable) e, "requestUpdateInfo(%s)", this.f17351b);
            this.f17349N.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
