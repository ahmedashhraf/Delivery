package com.google.common.eventbus;

import com.google.common.base.C7397x;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p076c.p112d.p148d.p149a.C2775a;
import p212io.branch.referral.C6009d;

@C2775a
public class AsyncEventBus extends EventBus {
    private final ConcurrentLinkedQueue<C8333d> eventsToDispatch = new ConcurrentLinkedQueue<>();
    private final Executor executor;

    /* renamed from: com.google.common.eventbus.AsyncEventBus$a */
    class C8329a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f22222a;

        /* renamed from: b */
        final /* synthetic */ C8339d f22223b;

        C8329a(Object obj, C8339d dVar) {
            this.f22222a = obj;
            this.f22223b = dVar;
        }

        public void run() {
            AsyncEventBus.super.dispatch(this.f22222a, this.f22223b);
        }
    }

    public AsyncEventBus(String str, Executor executor2) {
        super(str);
        this.executor = (Executor) C7397x.m35664a(executor2);
    }

    /* access modifiers changed from: 0000 */
    public void dispatch(Object obj, C8339d dVar) {
        C7397x.m35664a(obj);
        C7397x.m35664a(dVar);
        this.executor.execute(new C8329a(obj, dVar));
    }

    /* access modifiers changed from: protected */
    public void dispatchQueuedEvents() {
        while (true) {
            C8333d dVar = (C8333d) this.eventsToDispatch.poll();
            if (dVar != null) {
                dispatch(dVar.f22226a, dVar.f22227b);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void enqueueEvent(Object obj, C8339d dVar) {
        this.eventsToDispatch.offer(new C8333d(obj, dVar));
    }

    public AsyncEventBus(Executor executor2, C8341g gVar) {
        super(gVar);
        this.executor = (Executor) C7397x.m35664a(executor2);
    }

    public AsyncEventBus(Executor executor2) {
        super(C6009d.f17209I);
        this.executor = (Executor) C7397x.m35664a(executor2);
    }
}
