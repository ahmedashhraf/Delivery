package kotlin.p219v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C14731m0;
import kotlin.C14854w;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;

/* renamed from: kotlin.v0.n */
/* compiled from: Arrays.kt */
class C14793n extends C14791m {
    @C6003d
    /* renamed from: a */
    public static final <T, R> C14854w<List<T>, List<R>> m64075a(@C6003d C14854w<? extends T, ? extends R>[] wVarArr) {
        C14445h0.m62478f(wVarArr, "$receiver");
        ArrayList arrayList = new ArrayList(wVarArr.length);
        ArrayList arrayList2 = new ArrayList(wVarArr.length);
        for (C14854w<? extends T, ? extends R> wVar : wVarArr) {
            arrayList.add(wVar.mo46307e());
            arrayList2.add(wVar.mo46309f());
        }
        return C14731m0.m63872a(arrayList, arrayList2);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> List<T> m64074a(@C6003d T[][] tArr) {
        C14445h0.m62478f(tArr, "$receiver");
        int i = 0;
        for (T[] length : tArr) {
            i += length.length;
        }
        ArrayList arrayList = new ArrayList(i);
        for (T[] a : tArr) {
            C6135x.m28184a((Collection<? super T>) arrayList, a);
        }
        return arrayList;
    }
}
