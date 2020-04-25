package kotlin.p213a1.p499q;

import kotlin.C6096e0;
import kotlin.C6101i;
import kotlin.C6121u;
import kotlin.p213a1.C6037b;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6037b
@C6096e0(version = "1.2")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'J\b\u0010\f\u001a\u00020\rH'¨\u0006\u000e"}, mo24990d2 = {"Lkotlin/internal/contracts/ContractBuilder;", "", "callsInPlace", "Lkotlin/internal/contracts/CallsInPlace;", "R", "lambda", "Lkotlin/Function;", "kind", "Lkotlin/internal/contracts/InvocationKind;", "returns", "Lkotlin/internal/contracts/Returns;", "value", "returnsNotNull", "Lkotlin/internal/contracts/ReturnsNotNull;", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.a1.q.c */
/* compiled from: ContractBuilder.kt */
public interface C14406c {

    /* renamed from: kotlin.a1.q.c$a */
    /* compiled from: ContractBuilder.kt */
    public static final class C14407a {
        @C6003d
        @C6037b
        /* renamed from: a */
        public static /* synthetic */ C14404a m62382a(C14406c cVar, C6101i iVar, C14410f fVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    fVar = C14410f.UNKNOWN;
                }
                return cVar.mo45521a(iVar, fVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
        }
    }

    @C6003d
    @C6037b
    /* renamed from: a */
    <R> C14404a mo45521a(@C6003d C6101i<? extends R> iVar, @C6003d C14410f fVar);

    @C6003d
    @C6037b
    /* renamed from: a */
    C14411g mo45522a();

    @C6003d
    @C6037b
    /* renamed from: a */
    C14411g mo45523a(@C6004e Object obj);

    @C6003d
    @C6037b
    /* renamed from: b */
    C14412h mo45524b();
}
