package org.apache.http.p541f0.p542m.p543n;

import java.lang.ref.ReferenceQueue;

@Deprecated
/* renamed from: org.apache.http.f0.m.n.h */
/* compiled from: RefQueueWorker */
public class C15289h implements Runnable {

    /* renamed from: N */
    protected volatile Thread f44281N;

    /* renamed from: a */
    protected final ReferenceQueue<?> f44282a;

    /* renamed from: b */
    protected final C15288g f44283b;

    public C15289h(ReferenceQueue<?> referenceQueue, C15288g gVar) {
        if (referenceQueue == null) {
            throw new IllegalArgumentException("Queue must not be null.");
        } else if (gVar != null) {
            this.f44282a = referenceQueue;
            this.f44283b = gVar;
        } else {
            throw new IllegalArgumentException("Handler must not be null.");
        }
    }

    /* renamed from: a */
    public void mo47333a() {
        Thread thread = this.f44281N;
        if (thread != null) {
            this.f44281N = null;
            thread.interrupt();
        }
    }

    public void run() {
        if (this.f44281N == null) {
            this.f44281N = Thread.currentThread();
        }
        while (this.f44281N == Thread.currentThread()) {
            try {
                this.f44283b.mo47306a(this.f44282a.remove());
            } catch (InterruptedException unused) {
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RefQueueWorker::");
        sb.append(this.f44281N);
        return sb.toString();
    }
}
