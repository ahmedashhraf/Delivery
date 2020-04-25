package org.apache.http.p541f0.p542m.p543n;

import java.util.Date;
import java.util.concurrent.locks.Condition;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.f0.m.n.k */
/* compiled from: WaitingThread */
public class C15293k {

    /* renamed from: a */
    private final Condition f44297a;

    /* renamed from: b */
    private final C15290i f44298b;

    /* renamed from: c */
    private Thread f44299c;

    /* renamed from: d */
    private boolean f44300d;

    public C15293k(Condition condition, C15290i iVar) {
        if (condition != null) {
            this.f44297a = condition;
            this.f44298b = iVar;
            return;
        }
        throw new IllegalArgumentException("Condition must not be null.");
    }

    /* renamed from: a */
    public final Condition mo47355a() {
        return this.f44297a;
    }

    /* renamed from: b */
    public final C15290i mo47357b() {
        return this.f44298b;
    }

    /* renamed from: c */
    public final Thread mo47358c() {
        return this.f44299c;
    }

    /* renamed from: d */
    public void mo47359d() {
        this.f44300d = true;
        this.f44297a.signalAll();
    }

    /* renamed from: e */
    public void mo47360e() {
        if (this.f44299c != null) {
            this.f44297a.signalAll();
            return;
        }
        throw new IllegalStateException("Nobody waiting on this object.");
    }

    /* renamed from: a */
    public boolean mo47356a(Date date) throws InterruptedException {
        boolean z;
        if (this.f44299c == null) {
            String str = "Operation interrupted";
            if (!this.f44300d) {
                this.f44299c = Thread.currentThread();
                if (date != null) {
                    try {
                        z = this.f44297a.awaitUntil(date);
                    } catch (Throwable th) {
                        this.f44299c = null;
                        throw th;
                    }
                } else {
                    this.f44297a.await();
                    z = true;
                }
                if (!this.f44300d) {
                    this.f44299c = null;
                    return z;
                }
                throw new InterruptedException(str);
            }
            throw new InterruptedException(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("A thread is already waiting on this object.\ncaller: ");
        sb.append(Thread.currentThread());
        sb.append("\nwaiter: ");
        sb.append(this.f44299c);
        throw new IllegalStateException(sb.toString());
    }
}
