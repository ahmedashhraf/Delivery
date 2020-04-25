package kotlin.p507h1;

import kotlin.C14737p0;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

@C6055e(name = "TimingKt")
/* renamed from: kotlin.h1.b */
/* compiled from: Timing.kt */
public final class C14642b {
    /* renamed from: a */
    public static final long m63383a(@C6003d C6069a<C14737p0> aVar) {
        C14445h0.m62478f(aVar, "block");
        long nanoTime = System.nanoTime();
        aVar.mo24947p();
        return System.nanoTime() - nanoTime;
    }

    /* renamed from: b */
    public static final long m63384b(@C6003d C6069a<C14737p0> aVar) {
        C14445h0.m62478f(aVar, "block");
        long currentTimeMillis = System.currentTimeMillis();
        aVar.mo24947p();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
