package p195e.p196a.p199x0.p454e.p458d;

import java.util.concurrent.Callable;
import p195e.p196a.C12268f;
import p195e.p196a.C12280i0;
import p195e.p196a.C5927i;
import p195e.p196a.C5930q0;
import p195e.p196a.C5941y;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p450a.C12348e;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p199x0.p454e.p457c.C13019l1;
import p195e.p196a.p199x0.p454e.p461g.C13631r0;
import p195e.p196a.p449w0.C12339o;
import p212io.reactivex.exceptions.C14398a;

@C5936e
/* renamed from: e.a.x0.e.d.m */
/* compiled from: ScalarXMapZHelper */
final class C13130m {
    private C13130m() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    static <T> boolean m57219a(Object obj, C12339o<? super T, ? extends C5927i> oVar, C12268f fVar) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C5927i iVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                iVar = (C5927i) C12390b.m55563a(oVar.apply(call), "The mapper returned a null CompletableSource");
            }
            if (iVar == null) {
                C12348e.m55472a(fVar);
            } else {
                iVar.mo24122a(fVar);
            }
            return true;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55475a(th, fVar);
            return true;
        }
    }

    /* renamed from: b */
    static <T, R> boolean m57221b(Object obj, C12339o<? super T, ? extends C5930q0<? extends R>> oVar, C12280i0<? super R> i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C5930q0 q0Var = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                q0Var = (C5930q0) C12390b.m55563a(oVar.apply(call), "The mapper returned a null SingleSource");
            }
            if (q0Var == null) {
                C12348e.m55473a(i0Var);
            } else {
                q0Var.mo24192a(C13631r0.m58386g(i0Var));
            }
            return true;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
            return true;
        }
    }

    /* renamed from: a */
    static <T, R> boolean m57220a(Object obj, C12339o<? super T, ? extends C5941y<? extends R>> oVar, C12280i0<? super R> i0Var) {
        if (!(obj instanceof Callable)) {
            return false;
        }
        C5941y yVar = null;
        try {
            Object call = ((Callable) obj).call();
            if (call != null) {
                yVar = (C5941y) C12390b.m55563a(oVar.apply(call), "The mapper returned a null MaybeSource");
            }
            if (yVar == null) {
                C12348e.m55473a(i0Var);
            } else {
                yVar.mo24639a(C13019l1.m56978g(i0Var));
            }
            return true;
        } catch (Throwable th) {
            C14398a.m62357b(th);
            C12348e.m55476a(th, i0Var);
            return true;
        }
    }
}
