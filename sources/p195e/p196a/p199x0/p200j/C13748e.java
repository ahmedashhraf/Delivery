package p195e.p196a.p199x0.p200j;

import java.util.concurrent.CountDownLatch;
import p195e.p196a.p199x0.p463g.C13685j;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;

/* renamed from: e.a.x0.j.e */
/* compiled from: BlockingHelper */
public final class C13748e {
    private C13748e() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static void m58702a(CountDownLatch countDownLatch, C12314c cVar) {
        if (countDownLatch.getCount() != 0) {
            try {
                m58701a();
                countDownLatch.await();
            } catch (InterruptedException e) {
                cVar.dispose();
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m58701a() {
        if (!C12205a.m54943y()) {
            return;
        }
        if ((Thread.currentThread() instanceof C13685j) || C12205a.m54858B()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
