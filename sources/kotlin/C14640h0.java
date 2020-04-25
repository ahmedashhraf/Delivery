package kotlin;

import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14427e0;

/* renamed from: kotlin.h0 */
/* compiled from: Synchronized.kt */
class C14640h0 extends C14574g0 {
    @C6041f
    /* renamed from: a */
    private static final <R> R m63381a(Object obj, C6069a<? extends R> aVar) {
        R p;
        synchronized (obj) {
            try {
                p = aVar.mo24947p();
            } finally {
                C14427e0.m62417b(1);
                C14427e0.m62414a(1);
            }
        }
        C14427e0.m62414a(1);
        return p;
    }
}
