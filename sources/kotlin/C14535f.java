package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import kotlin.p213a1.C14402l;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.f */
/* compiled from: Exceptions.kt */
class C14535f {
    @C6041f
    /* renamed from: a */
    private static final void m63008a(@C6003d Throwable th, PrintWriter printWriter) {
        if (th != null) {
            th.printStackTrace(printWriter);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    @C6041f
    /* renamed from: b */
    private static final void m63011b(@C6003d Throwable th) {
        if (th != null) {
            th.printStackTrace();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    /* renamed from: c */
    public static /* synthetic */ void m63012c(Throwable th) {
    }

    @C6041f
    /* renamed from: a */
    private static final void m63007a(@C6003d Throwable th, PrintStream printStream) {
        if (th != null) {
            th.printStackTrace(printStream);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Throwable");
    }

    @C6003d
    /* renamed from: a */
    public static final StackTraceElement[] m63010a(@C6003d Throwable th) {
        C14445h0.m62478f(th, "$receiver");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace == null) {
            C14445h0.m62474e();
        }
        return stackTrace;
    }

    /* renamed from: a */
    public static void m63009a(@C6003d Throwable th, @C6003d Throwable th2) {
        C14445h0.m62478f(th, "$receiver");
        C14445h0.m62478f(th2, "exception");
        C14402l.f42533a.mo45520a(th, th2);
    }
}
