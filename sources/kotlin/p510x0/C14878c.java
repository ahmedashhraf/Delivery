package kotlin.p510x0;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.C14737p0;
import kotlin.C6050b0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6080l;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aJ\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001aL\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aJ\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001aL\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a$\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a0\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a0\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b\u001a8\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\b¨\u0006\u0016"}, mo24990d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", "period", "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "TimersKt")
/* renamed from: kotlin.x0.c */
/* compiled from: Timer.kt */
public final class C14878c {

    /* renamed from: kotlin.x0.c$a */
    /* compiled from: Timer.kt */
    public static final class C14879a extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ C6080l f43126a;

        public C14879a(C6080l lVar) {
            this.f43126a = lVar;
        }

        public void run() {
            this.f43126a.invoke(this);
        }
    }

    @C6041f
    /* renamed from: a */
    private static final TimerTask m65932a(@C6003d Timer timer, long j, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.schedule(aVar, j);
        return aVar;
    }

    @C6041f
    /* renamed from: b */
    private static final TimerTask m65940b(@C6003d Timer timer, long j, long j2, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.scheduleAtFixedRate(aVar, j, j2);
        return aVar;
    }

    @C6041f
    /* renamed from: a */
    private static final TimerTask m65934a(@C6003d Timer timer, Date date, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @C6041f
    /* renamed from: b */
    private static final TimerTask m65941b(@C6003d Timer timer, Date date, long j, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j);
        return aVar;
    }

    @C6041f
    /* renamed from: a */
    private static final TimerTask m65931a(@C6003d Timer timer, long j, long j2, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.schedule(aVar, j, j2);
        return aVar;
    }

    @C6041f
    /* renamed from: b */
    private static final Timer m65936b(String str, boolean z, long j, long j2, C6080l<? super TimerTask, C14737p0> lVar) {
        Timer a = m65926a(str, z);
        a.schedule(new C14879a(lVar), j, j2);
        return a;
    }

    @C6041f
    /* renamed from: a */
    private static final TimerTask m65933a(@C6003d Timer timer, Date date, long j, C6080l<? super TimerTask, C14737p0> lVar) {
        C14879a aVar = new C14879a(lVar);
        timer.schedule(aVar, date, j);
        return aVar;
    }

    @C6041f
    /* renamed from: b */
    private static final Timer m65938b(String str, boolean z, Date date, long j, C6080l<? super TimerTask, C14737p0> lVar) {
        Timer a = m65926a(str, z);
        a.schedule(new C14879a(lVar), date, j);
        return a;
    }

    @C6003d
    @C6050b0
    /* renamed from: a */
    public static final Timer m65926a(@C6004e String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @C6041f
    /* renamed from: b */
    static /* synthetic */ Timer m65937b(String str, boolean z, long j, long j2, C6080l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        long j3 = j;
        Timer a = m65926a(str, z);
        a.schedule(new C14879a(lVar), j3, j2);
        return a;
    }

    @C6041f
    /* renamed from: a */
    private static final Timer m65927a(String str, boolean z, long j, long j2, C6080l<? super TimerTask, C14737p0> lVar) {
        Timer a = m65926a(str, z);
        a.scheduleAtFixedRate(new C14879a(lVar), j, j2);
        return a;
    }

    @C6041f
    /* renamed from: b */
    static /* synthetic */ Timer m65939b(String str, boolean z, Date date, long j, C6080l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Timer a = m65926a(str, z);
        a.schedule(new C14879a(lVar), date, j);
        return a;
    }

    @C6041f
    /* renamed from: a */
    private static final Timer m65929a(String str, boolean z, Date date, long j, C6080l<? super TimerTask, C14737p0> lVar) {
        Timer a = m65926a(str, z);
        a.scheduleAtFixedRate(new C14879a(lVar), date, j);
        return a;
    }

    @C6041f
    /* renamed from: a */
    private static final TimerTask m65935a(C6080l<? super TimerTask, C14737p0> lVar) {
        return new C14879a(lVar);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ Timer m65928a(String str, boolean z, long j, long j2, C6080l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        long j3 = j;
        Timer a = m65926a(str, z);
        a.scheduleAtFixedRate(new C14879a(lVar), j3, j2);
        return a;
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ Timer m65930a(String str, boolean z, Date date, long j, C6080l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Timer a = m65926a(str, z);
        a.scheduleAtFixedRate(new C14879a(lVar), date, j);
        return a;
    }
}
