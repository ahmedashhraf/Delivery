package com.google.common.cache;

import com.google.common.base.C7397x;
import java.util.concurrent.Executor;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.cache.p */
/* compiled from: RemovalListeners */
public final class C7518p {

    /* renamed from: com.google.common.cache.p$a */
    /* compiled from: RemovalListeners */
    static class C7519a implements C7517o<K, V> {

        /* renamed from: a */
        final /* synthetic */ Executor f21044a;

        /* renamed from: b */
        final /* synthetic */ C7517o f21045b;

        /* renamed from: com.google.common.cache.p$a$a */
        /* compiled from: RemovalListeners */
        class C7520a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7521q f21046a;

            C7520a(C7521q qVar) {
                this.f21046a = qVar;
            }

            public void run() {
                C7519a.this.f21045b.mo23202a(this.f21046a);
            }
        }

        C7519a(Executor executor, C7517o oVar) {
            this.f21044a = executor;
            this.f21045b = oVar;
        }

        /* renamed from: a */
        public void mo23202a(C7521q<K, V> qVar) {
            this.f21044a.execute(new C7520a(qVar));
        }
    }

    private C7518p() {
    }

    /* renamed from: a */
    public static <K, V> C7517o<K, V> m36173a(C7517o<K, V> oVar, Executor executor) {
        C7397x.m35664a(oVar);
        C7397x.m35664a(executor);
        return new C7519a(executor, oVar);
    }
}
