package p195e.p196a.p199x0.p465i;

import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p452c.C12403l;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;

/* renamed from: e.a.x0.i.g */
/* compiled from: EmptySubscription */
public enum C13739g implements C12403l<Object> {
    INSTANCE;

    /* renamed from: a */
    public static void m58655a(Throwable th, C14062c<?> cVar) {
        cVar.mo41788a((C14063d) INSTANCE);
        cVar.onError(th);
    }

    /* renamed from: a */
    public int mo41855a(int i) {
        return i & 2;
    }

    /* renamed from: c */
    public void mo41813c(long j) {
        C13742j.m58678b(j);
    }

    public void cancel() {
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @C5938g
    public Object poll() {
        return null;
    }

    public String toString() {
        return "EmptySubscription";
    }

    /* renamed from: a */
    public static void m58654a(C14062c<?> cVar) {
        cVar.mo41788a((C14063d) INSTANCE);
        cVar.onComplete();
    }

    /* renamed from: a */
    public boolean mo42104a(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
