package p195e.p196a.p199x0.p465i;

import java.util.concurrent.atomic.AtomicBoolean;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.i.e */
/* compiled from: BooleanSubscription */
public final class C13737e extends AtomicBoolean implements C14063d {
    private static final long serialVersionUID = -8127758972444290902L;

    /* renamed from: a */
    public boolean mo43121a() {
        return get();
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        C13742j.m58678b(j);
    }

    public void cancel() {
        lazySet(true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BooleanSubscription(cancelled=");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
