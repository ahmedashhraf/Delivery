package kotlin.p217i1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C14854w;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p504e1.C14525k;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BJ\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012+\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002R3\u0010\b\u001a'\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n0\t¢\u0006\u0002\b\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo24990d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.h */
/* compiled from: Strings.kt */
final class C14666h implements C14594m<C14525k> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f42886a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f42887b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f42888c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C6084p<CharSequence, Integer, C14854w<Integer, Integer>> f42889d;

    /* renamed from: kotlin.i1.h$a */
    /* compiled from: Strings.kt */
    public static final class C14667a implements Iterator<C14525k>, C14464a {

        /* renamed from: N */
        private int f42890N;
        @C6004e

        /* renamed from: O */
        private C14525k f42891O;

        /* renamed from: P */
        private int f42892P;

        /* renamed from: Q */
        final /* synthetic */ C14666h f42893Q;

        /* renamed from: a */
        private int f42894a = -1;

        /* renamed from: b */
        private int f42895b;

        C14667a(C14666h hVar) {
            this.f42893Q = hVar;
            this.f42895b = C14534q.m62903a(hVar.f42887b, 0, hVar.f42886a.length());
            this.f42890N = this.f42895b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
            if (r6.f42892P < kotlin.p217i1.C14666h.m63567c(r6.f42893Q)) goto L_0x0025;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m63569i() {
            /*
                r6 = this;
                int r0 = r6.f42890N
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f42894a = r1
                r0 = 0
                r6.f42891O = r0
                goto L_0x00a2
            L_0x000c:
                kotlin.i1.h r0 = r6.f42893Q
                int r0 = r0.f42888c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0025
                int r0 = r6.f42892P
                int r0 = r0 + r3
                r6.f42892P = r0
                int r0 = r6.f42892P
                kotlin.i1.h r4 = r6.f42893Q
                int r4 = r4.f42888c
                if (r0 >= r4) goto L_0x0033
            L_0x0025:
                int r0 = r6.f42890N
                kotlin.i1.h r4 = r6.f42893Q
                java.lang.CharSequence r4 = r4.f42886a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0049
            L_0x0033:
                int r0 = r6.f42895b
                kotlin.e1.k r1 = new kotlin.e1.k
                kotlin.i1.h r4 = r6.f42893Q
                java.lang.CharSequence r4 = r4.f42886a
                int r4 = kotlin.p217i1.C6112z.m28036c(r4)
                r1.<init>(r0, r4)
                r6.f42891O = r1
                r6.f42890N = r2
                goto L_0x00a0
            L_0x0049:
                kotlin.i1.h r0 = r6.f42893Q
                kotlin.b1.t.p r0 = r0.f42889d
                kotlin.i1.h r4 = r6.f42893Q
                java.lang.CharSequence r4 = r4.f42886a
                int r5 = r6.f42890N
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo24962d(r4, r5)
                kotlin.w r0 = (kotlin.C14854w) r0
                if (r0 != 0) goto L_0x0079
                int r0 = r6.f42895b
                kotlin.e1.k r1 = new kotlin.e1.k
                kotlin.i1.h r4 = r6.f42893Q
                java.lang.CharSequence r4 = r4.f42886a
                int r4 = kotlin.p217i1.C6112z.m28036c(r4)
                r1.<init>(r0, r4)
                r6.f42891O = r1
                r6.f42890N = r2
                goto L_0x00a0
            L_0x0079:
                java.lang.Object r2 = r0.mo46304a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo46306d()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f42895b
                kotlin.e1.k r4 = kotlin.p504e1.C14534q.m62992d(r4, r2)
                r6.f42891O = r4
                int r2 = r2 + r0
                r6.f42895b = r2
                int r2 = r6.f42895b
                if (r0 != 0) goto L_0x009d
                r1 = 1
            L_0x009d:
                int r2 = r2 + r1
                r6.f42890N = r2
            L_0x00a0:
                r6.f42894a = r3
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p217i1.C14666h.C14667a.m63569i():void");
        }

        /* renamed from: a */
        public final void mo45874a(@C6004e C14525k kVar) {
            this.f42891O = kVar;
        }

        /* renamed from: b */
        public final void mo45876b(int i) {
            this.f42895b = i;
        }

        /* renamed from: c */
        public final int mo45877c() {
            return this.f42895b;
        }

        /* renamed from: d */
        public final void mo45880d(int i) {
            this.f42894a = i;
        }

        /* renamed from: g */
        public final int mo45881g() {
            return this.f42890N;
        }

        /* renamed from: h */
        public final int mo45882h() {
            return this.f42894a;
        }

        public boolean hasNext() {
            if (this.f42894a == -1) {
                m63569i();
            }
            return this.f42894a == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: a */
        public final void mo45873a(int i) {
            this.f42892P = i;
        }

        /* renamed from: b */
        public final int mo45875b() {
            return this.f42892P;
        }

        /* renamed from: c */
        public final void mo45878c(int i) {
            this.f42890N = i;
        }

        @C6004e
        /* renamed from: d */
        public final C14525k mo45879d() {
            return this.f42891O;
        }

        @C6003d
        public C14525k next() {
            if (this.f42894a == -1) {
                m63569i();
            }
            if (this.f42894a != 0) {
                C14525k kVar = this.f42891O;
                if (kVar != null) {
                    this.f42891O = null;
                    this.f42894a = -1;
                    return kVar;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }
    }

    public C14666h(@C6003d CharSequence charSequence, int i, int i2, @C6003d C6084p<? super CharSequence, ? super Integer, C14854w<Integer, Integer>> pVar) {
        C14445h0.m62478f(charSequence, "input");
        C14445h0.m62478f(pVar, "getNextMatch");
        this.f42886a = charSequence;
        this.f42887b = i;
        this.f42888c = i2;
        this.f42889d = pVar;
    }

    @C6003d
    public Iterator<C14525k> iterator() {
        return new C14667a(this);
    }
}
