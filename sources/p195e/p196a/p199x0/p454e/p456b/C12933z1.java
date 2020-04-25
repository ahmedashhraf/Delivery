package p195e.p196a.p199x0.p454e.p456b;

import p195e.p196a.C12295p;
import p195e.p196a.C5929l;
import p195e.p196a.p439b1.C12205a;
import p205i.p211e.C14062c;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.b.z1 */
/* compiled from: FlowableLift */
public final class C12933z1<R, T> extends C12511a<T, R> {

    /* renamed from: N */
    final C12295p<? extends R, ? super T> f37290N;

    public C12933z1(C5929l<T> lVar, C12295p<? extends R, ? super T> pVar) {
        super(lVar);
        this.f37290N = pVar;
    }

    /* renamed from: e */
    public void mo24499e(C14062c<? super R> cVar) {
        try {
            C14062c a = this.f37290N.mo42049a(cVar);
            if (a != null) {
                this.f35814b.mo24397a(a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Operator ");
            sb.append(this.f37290N);
            sb.append(" returned a null Subscriber");
            throw new NullPointerException(sb.toString());
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12205a.m54894b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
