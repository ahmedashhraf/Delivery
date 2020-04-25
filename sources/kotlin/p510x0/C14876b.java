package kotlin.p510x0;

import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u001a0\u0010\u000e\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u0010*\b\u0012\u0004\u0012\u0002H\u000f0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\fH\b¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, mo24990d2 = {"thread", "Ljava/lang/Thread;", "start", "", "isDaemon", "contextClassLoader", "Ljava/lang/ClassLoader;", "name", "", "priority", "", "block", "Lkotlin/Function0;", "", "getOrSet", "T", "", "Ljava/lang/ThreadLocal;", "default", "(Ljava/lang/ThreadLocal;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "ThreadsKt")
/* renamed from: kotlin.x0.b */
/* compiled from: Thread.kt */
public final class C14876b {

    /* renamed from: kotlin.x0.b$a */
    /* compiled from: Thread.kt */
    public static final class C14877a extends Thread {

        /* renamed from: a */
        final /* synthetic */ C6069a f43125a;

        C14877a(C6069a aVar) {
            this.f43125a = aVar;
        }

        public void run() {
            this.f43125a.mo24947p();
        }
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ Thread m65925a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C6069a aVar, int i2, Object obj) {
        return m65924a((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? null : classLoader, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? -1 : i, aVar);
    }

    @C6003d
    /* renamed from: a */
    public static final Thread m65924a(boolean z, boolean z2, @C6004e ClassLoader classLoader, @C6004e String str, int i, @C6003d C6069a<C14737p0> aVar) {
        C14445h0.m62478f(aVar, "block");
        C14877a aVar2 = new C14877a(aVar);
        if (z2) {
            aVar2.setDaemon(true);
        }
        if (i > 0) {
            aVar2.setPriority(i);
        }
        if (str != null) {
            aVar2.setName(str);
        }
        if (classLoader != null) {
            aVar2.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar2.start();
        }
        return aVar2;
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T m65923a(@C6003d ThreadLocal<T> threadLocal, C6069a<? extends T> aVar) {
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T p = aVar.mo24947p();
        threadLocal.set(p);
        return p;
    }
}
