package kotlin.p504e1;

import java.lang.Comparable;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, mo24990d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", "start", "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-runtime"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.e1.g */
/* compiled from: Range.kt */
public interface C14519g<T extends Comparable<? super T>> {

    /* renamed from: kotlin.e1.g$a */
    /* compiled from: Range.kt */
    public static final class C14520a {
        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m62859a(C14519g<T> gVar, @C6003d T t) {
            C14445h0.m62478f(t, "value");
            return t.compareTo(gVar.mo45695b()) >= 0 && t.compareTo(gVar.mo45696c()) <= 0;
        }

        /* renamed from: a */
        public static <T extends Comparable<? super T>> boolean m62858a(C14519g<T> gVar) {
            return gVar.mo45695b().compareTo(gVar.mo45696c()) > 0;
        }
    }

    /* renamed from: a */
    boolean mo45694a(@C6003d T t);

    @C6003d
    /* renamed from: b */
    T mo45695b();

    @C6003d
    /* renamed from: c */
    T mo45696c();

    boolean isEmpty();
}
