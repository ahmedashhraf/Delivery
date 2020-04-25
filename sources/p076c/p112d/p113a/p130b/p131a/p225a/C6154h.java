package p076c.p112d.p113a.p130b.p131a.p225a;

import android.os.RemoteException;
import com.google.android.play.core.internal.C7130d1;
import com.google.android.play.core.internal.C7152y0;
import com.google.android.play.core.tasks.C7205o;

/* renamed from: c.d.a.b.a.a.h */
final class C6154h extends C7130d1 {

    /* renamed from: N */
    private final /* synthetic */ String f17346N;

    /* renamed from: O */
    private final /* synthetic */ C6153g f17347O;

    /* renamed from: b */
    private final /* synthetic */ C7205o f17348b;

    C6154h(C6153g gVar, C7205o oVar, C7205o oVar2, String str) {
        this.f17347O = gVar;
        this.f17348b = oVar2;
        this.f17346N = str;
        super(oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25050a() {
        try {
            ((C7152y0) this.f17347O.f17343a.mo28497b()).mo28493b(this.f17347O.f17344b, C6153g.m28259c(), new C6156j(this.f17347O, this.f17348b));
        } catch (RemoteException e) {
            C6153g.f17341d.mo23044a((Throwable) e, "completeUpdate(%s)", this.f17346N);
            this.f17348b.mo28633a((Exception) new RuntimeException(e));
        }
    }
}
