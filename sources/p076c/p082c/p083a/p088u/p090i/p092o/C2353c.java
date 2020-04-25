package p076c.p082c.p083a.p088u.p090i.p092o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p076c.p082c.p083a.p088u.C2272c;

/* renamed from: c.c.a.u.i.o.c */
/* compiled from: DiskCacheWriteLocker */
final class C2353c {

    /* renamed from: a */
    private final Map<C2272c, C2355b> f9270a = new HashMap();

    /* renamed from: b */
    private final C2356c f9271b = new C2356c();

    /* renamed from: c.c.a.u.i.o.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C2355b {

        /* renamed from: a */
        final Lock f9272a;

        /* renamed from: b */
        int f9273b;

        private C2355b() {
            this.f9272a = new ReentrantLock();
        }
    }

    /* renamed from: c.c.a.u.i.o.c$c */
    /* compiled from: DiskCacheWriteLocker */
    private static class C2356c {

        /* renamed from: b */
        private static final int f9274b = 10;

        /* renamed from: a */
        private final Queue<C2355b> f9275a;

        private C2356c() {
            this.f9275a = new ArrayDeque();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2355b mo9765a() {
            C2355b bVar;
            synchronized (this.f9275a) {
                bVar = (C2355b) this.f9275a.poll();
            }
            return bVar == null ? new C2355b() : bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9766a(C2355b bVar) {
            synchronized (this.f9275a) {
                if (this.f9275a.size() < 10) {
                    this.f9275a.offer(bVar);
                }
            }
        }
    }

    C2353c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9763a(C2272c cVar) {
        C2355b bVar;
        synchronized (this) {
            bVar = (C2355b) this.f9270a.get(cVar);
            if (bVar == null) {
                bVar = this.f9271b.mo9765a();
                this.f9270a.put(cVar, bVar);
            }
            bVar.f9273b++;
        }
        bVar.f9272a.lock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9764b(C2272c cVar) {
        C2355b bVar;
        synchronized (this) {
            bVar = (C2355b) this.f9270a.get(cVar);
            if (bVar != null) {
                if (bVar.f9273b > 0) {
                    int i = bVar.f9273b - 1;
                    bVar.f9273b = i;
                    if (i == 0) {
                        C2355b bVar2 = (C2355b) this.f9270a.remove(cVar);
                        if (bVar2.equals(bVar)) {
                            this.f9271b.mo9766a(bVar2);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Removed the wrong lock, expected to remove: ");
                            sb.append(bVar);
                            sb.append(", but actually removed: ");
                            sb.append(bVar2);
                            sb.append(", key: ");
                            sb.append(cVar);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot release a lock that is not held, key: ");
            sb2.append(cVar);
            sb2.append(", interestedThreads: ");
            sb2.append(bVar == null ? 0 : bVar.f9273b);
            throw new IllegalArgumentException(sb2.toString());
        }
        bVar.f9272a.unlock();
    }
}
