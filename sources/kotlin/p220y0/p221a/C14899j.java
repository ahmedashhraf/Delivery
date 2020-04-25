package kotlin.p220y0.p221a;

import java.util.Collection;
import java.util.Iterator;
import kotlin.C14737p0;
import kotlin.C6096e0;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6137h
@C6096e0(version = "1.1")
/* renamed from: kotlin.y0.a.j */
/* compiled from: SequenceBuilder.kt */
public abstract class C14899j<T> {
    @C6004e
    /* renamed from: a */
    public final Object mo46354a(@C6003d Iterable<? extends T> iterable, @C6003d C14884c<? super C14737p0> cVar) {
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            return mo46356a(iterable.iterator(), cVar);
        }
        return C14737p0.f42983a;
    }

    @C6004e
    /* renamed from: a */
    public abstract Object mo46355a(T t, @C6003d C14884c<? super C14737p0> cVar);

    @C6004e
    /* renamed from: a */
    public abstract Object mo46356a(@C6003d Iterator<? extends T> it, @C6003d C14884c<? super C14737p0> cVar);

    @C6004e
    /* renamed from: a */
    public final Object mo46357a(@C6003d C14594m<? extends T> mVar, @C6003d C14884c<? super C14737p0> cVar) {
        return mo46356a(mVar.iterator(), cVar);
    }
}
