package kotlin.p504e1;

import java.lang.Comparable;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, mo24990d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.f */
/* compiled from: Ranges.kt */
public interface C14517f<T extends Comparable<? super T>> extends C14519g<T> {

    /* renamed from: kotlin.e1.f$a */
    /* compiled from: Ranges.kt */
    public static final class C14518a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m62854a(C14517f<T> fVar, @C6003d T t) {
            C14445h0.m62478f(t, "value");
            return fVar.mo45700a(fVar.mo45695b(), t) && fVar.mo45700a(t, fVar.mo45696c());
        }

        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m62853a(C14517f<T> fVar) {
            return !fVar.mo45700a(fVar.mo45695b(), fVar.mo45696c());
        }
    }

    /* renamed from: a */
    boolean mo45694a(@C6003d T t);

    /* renamed from: a */
    boolean mo45700a(@C6003d T t, @C6003d T t2);

    boolean isEmpty();
}
