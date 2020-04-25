package kotlin.p220y0.p221a;

import java.util.Iterator;
import kotlin.C14737p0;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.p222n.C6138b;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\n0\t\"\u0004\b\u0000\u0010\n2-\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aK\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\n0\u0014\"\u0004\b\u0000\u0010\n2-\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\"\u0012\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0004\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0006\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000\"\u0012\u0010\u0007\u001a\u00060\u0001j\u0002`\u0002XT¢\u0006\u0002\n\u0000*\f\b\u0002\u0010\u0016\"\u00020\u00012\u00020\u0001\u0002\u0004\n\u0002\b\t¨\u0006\u0017"}, mo24990d2 = {"State_Done", "", "Lkotlin/coroutines/experimental/State;", "State_Failed", "State_ManyNotReady", "State_ManyReady", "State_NotReady", "State_Ready", "buildIterator", "", "T", "builderAction", "Lkotlin/Function2;", "Lkotlin/coroutines/experimental/SequenceBuilder;", "Lkotlin/coroutines/experimental/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Ljava/util/Iterator;", "buildSequence", "Lkotlin/sequences/Sequence;", "(Lkotlin/jvm/functions/Function2;)Lkotlin/sequences/Sequence;", "State", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/coroutines/experimental/SequenceBuilderKt")
/* renamed from: kotlin.y0.a.m */
/* compiled from: SequenceBuilder.kt */
class C14902m {

    /* renamed from: a */
    private static final int f43146a = 0;

    /* renamed from: b */
    private static final int f43147b = 1;

    /* renamed from: c */
    private static final int f43148c = 2;

    /* renamed from: d */
    private static final int f43149d = 3;

    /* renamed from: e */
    private static final int f43150e = 4;

    /* renamed from: f */
    private static final int f43151f = 5;

    /* renamed from: kotlin.y0.a.m$a */
    /* compiled from: Sequences.kt */
    public static final class C14903a implements C14594m<T> {

        /* renamed from: a */
        final /* synthetic */ C6084p f43152a;

        public C14903a(C6084p pVar) {
            this.f43152a = pVar;
        }

        @C6003d
        public Iterator<T> iterator() {
            return C14902m.m66013a(this.f43152a);
        }
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: a */
    public static <T> Iterator<T> m66013a(@C6003d C6084p<? super C14899j<? super T>, ? super C14884c<? super C14737p0>, ? extends Object> pVar) {
        C14445h0.m62478f(pVar, "builderAction");
        C14900k kVar = new C14900k();
        kVar.mo46359a(C6138b.m28209a(pVar, kVar, kVar));
        return kVar;
    }

    @C6003d
    @C6096e0(version = "1.1")
    /* renamed from: b */
    public static <T> C14594m<T> m66014b(@C6003d C6084p<? super C14899j<? super T>, ? super C14884c<? super C14737p0>, ? extends Object> pVar) {
        C14445h0.m62478f(pVar, "builderAction");
        return new C14903a(pVar);
    }
}
