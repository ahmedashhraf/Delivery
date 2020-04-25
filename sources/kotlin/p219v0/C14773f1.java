package kotlin.p219v0;

import java.util.Iterator;
import java.util.List;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p220y0.p221a.C14884c;
import kotlin.p220y0.p221a.C14899j;
import kotlin.p220y0.p221a.p511o.p512a.C14905a;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, mo24990d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.f1 */
/* compiled from: SlidingWindow.kt */
public final class C14773f1 {

    /* renamed from: kotlin.v0.f1$a */
    /* compiled from: SlidingWindow.kt */
    static final class C14774a extends C14905a implements C6084p<C14899j<? super List<? extends T>>, C14884c<? super C14737p0>, Object> {

        /* renamed from: P */
        private C14899j f43018P;

        /* renamed from: Q */
        Object f43019Q;

        /* renamed from: R */
        Object f43020R;

        /* renamed from: S */
        Object f43021S;

        /* renamed from: T */
        Object f43022T;

        /* renamed from: U */
        int f43023U;

        /* renamed from: V */
        int f43024V;

        /* renamed from: W */
        final /* synthetic */ int f43025W;

        /* renamed from: X */
        final /* synthetic */ int f43026X;

        /* renamed from: Y */
        final /* synthetic */ Iterator f43027Y;

        /* renamed from: Z */
        final /* synthetic */ boolean f43028Z;

        /* renamed from: a0 */
        final /* synthetic */ boolean f43029a0;

        C14774a(int i, int i2, Iterator it, boolean z, boolean z2, C14884c cVar) {
            this.f43025W = i;
            this.f43026X = i2;
            this.f43027Y = it;
            this.f43028Z = z;
            this.f43029a0 = z2;
            super(2, cVar);
        }

        /* JADX WARNING: type inference failed for: r10v3, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r10v4 */
        /* JADX WARNING: type inference failed for: r7v8, types: [java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r7v9 */
        /* JADX WARNING: type inference failed for: r7v11, types: [kotlin.v0.a1] */
        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r10v5 */
        /* JADX WARNING: type inference failed for: r7v14 */
        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00bf  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00ec A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x00c8 A[SYNTHETIC] */
        @p205i.p209c.p210a.C6004e
        /* renamed from: a */
        public final java.lang.Object mo45823a(@p205i.p209c.p210a.C6004e java.lang.Object r13, @p205i.p209c.p210a.C6004e java.lang.Throwable r14) {
            /*
                r12 = this;
                java.lang.Object r13 = kotlin.p220y0.p221a.p222n.C6138b.m28215c()
                int r0 = r12.f43155a
                r1 = 5
                r2 = 4
                r3 = 3
                r4 = 1
                r5 = 2
                if (r0 == 0) goto L_0x006c
                if (r0 == r4) goto L_0x0057
                if (r0 == r5) goto L_0x004e
                if (r0 == r3) goto L_0x0039
                if (r0 == r2) goto L_0x0028
                if (r0 != r1) goto L_0x0020
                java.lang.Object r13 = r12.f43019Q
                kotlin.v0.a1 r13 = (kotlin.p219v0.C14747a1) r13
                if (r14 != 0) goto L_0x001f
                goto L_0x017e
            L_0x001f:
                throw r14
            L_0x0020:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L_0x0028:
                java.lang.Object r0 = r12.f43020R
                kotlin.v0.a1 r0 = (kotlin.p219v0.C14747a1) r0
                int r3 = r12.f43023U
                java.lang.Object r6 = r12.f43019Q
                kotlin.y0.a.j r6 = (kotlin.p220y0.p221a.C14899j) r6
                if (r14 != 0) goto L_0x0038
                r14 = r13
                r13 = r12
                goto L_0x0161
            L_0x0038:
                throw r14
            L_0x0039:
                java.lang.Object r0 = r12.f43022T
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r6 = r12.f43020R
                kotlin.v0.a1 r6 = (kotlin.p219v0.C14747a1) r6
                int r7 = r12.f43023U
                java.lang.Object r8 = r12.f43019Q
                kotlin.y0.a.j r8 = (kotlin.p220y0.p221a.C14899j) r8
                if (r14 != 0) goto L_0x004d
                r14 = r13
                r13 = r12
                goto L_0x012f
            L_0x004d:
                throw r14
            L_0x004e:
                java.lang.Object r13 = r12.f43019Q
                java.util.ArrayList r13 = (java.util.ArrayList) r13
                if (r14 != 0) goto L_0x0056
                goto L_0x017e
            L_0x0056:
                throw r14
            L_0x0057:
                java.lang.Object r0 = r12.f43022T
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r1 = r12.f43020R
                java.util.ArrayList r1 = (java.util.ArrayList) r1
                int r2 = r12.f43023U
                java.lang.Object r3 = r12.f43019Q
                kotlin.y0.a.j r3 = (kotlin.p220y0.p221a.C14899j) r3
                if (r14 != 0) goto L_0x006b
                r6 = r13
                r14 = r2
                r13 = r12
                goto L_0x00b7
            L_0x006b:
                throw r14
            L_0x006c:
                if (r14 != 0) goto L_0x0181
                kotlin.y0.a.j r14 = r12.f43018P
                int r0 = r12.f43025W
                int r6 = r12.f43026X
                int r0 = r0 - r6
                if (r0 < 0) goto L_0x00ed
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r6)
                r2 = 0
                java.util.Iterator r3 = r12.f43027Y
                r6 = r13
                r13 = r12
                r11 = r3
                r3 = r14
                r14 = r0
                r0 = r11
            L_0x0085:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto L_0x00c8
                java.lang.Object r7 = r0.next()
                if (r2 <= 0) goto L_0x0094
                int r2 = r2 + -1
                goto L_0x0085
            L_0x0094:
                r1.add(r7)
                int r8 = r1.size()
                int r9 = r13.f43026X
                if (r8 != r9) goto L_0x0085
                r13.f43019Q = r3
                r13.f43023U = r14
                r13.f43020R = r1
                r13.f43024V = r2
                r13.f43021S = r7
                r13.f43022T = r0
                r13.f43155a = r4
                java.lang.Object r2 = r3.mo46355a(r1, r13)
                kotlin.p214b1.p216u.C14427e0.m62418c(r5)
                if (r2 != r6) goto L_0x00b7
                return r6
            L_0x00b7:
                boolean r2 = r13.f43028Z
                if (r2 == 0) goto L_0x00bf
                r1.clear()
                goto L_0x00c6
            L_0x00bf:
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r13.f43026X
                r1.<init>(r2)
            L_0x00c6:
                r2 = r14
                goto L_0x0085
            L_0x00c8:
                boolean r0 = r1.isEmpty()
                r0 = r0 ^ r4
                if (r0 == 0) goto L_0x017e
                boolean r0 = r13.f43029a0
                if (r0 != 0) goto L_0x00db
                int r0 = r1.size()
                int r4 = r13.f43026X
                if (r0 != r4) goto L_0x017e
            L_0x00db:
                r13.f43023U = r14
                r13.f43019Q = r1
                r13.f43024V = r2
                r13.f43155a = r5
                java.lang.Object r13 = r3.mo46355a(r1, r13)
                kotlin.p214b1.p216u.C14427e0.m62418c(r5)
                if (r13 != r6) goto L_0x017e
                return r6
            L_0x00ed:
                kotlin.v0.a1 r7 = new kotlin.v0.a1
                r7.<init>(r6)
                java.util.Iterator r6 = r12.f43027Y
                r8 = r14
                r14 = r13
                r13 = r12
                r11 = r7
                r7 = r0
                r0 = r6
                r6 = r11
            L_0x00fb:
                boolean r9 = r0.hasNext()
                if (r9 == 0) goto L_0x0135
                java.lang.Object r9 = r0.next()
                r6.add(r9)
                boolean r10 = r6.mo46013e()
                if (r10 == 0) goto L_0x00fb
                boolean r10 = r13.f43028Z
                if (r10 == 0) goto L_0x0114
                r10 = r6
                goto L_0x0119
            L_0x0114:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>(r6)
            L_0x0119:
                r13.f43019Q = r8
                r13.f43023U = r7
                r13.f43020R = r6
                r13.f43021S = r9
                r13.f43022T = r0
                r13.f43155a = r3
                java.lang.Object r9 = r8.mo46355a(r10, r13)
                kotlin.p214b1.p216u.C14427e0.m62418c(r5)
                if (r9 != r14) goto L_0x012f
                return r14
            L_0x012f:
                int r9 = r13.f43025W
                r6.mo46011b(r9)
                goto L_0x00fb
            L_0x0135:
                boolean r0 = r13.f43029a0
                if (r0 == 0) goto L_0x017e
                r0 = r6
                r3 = r7
                r6 = r8
            L_0x013c:
                int r7 = r0.size()
                int r8 = r13.f43025W
                if (r7 <= r8) goto L_0x0167
                boolean r7 = r13.f43028Z
                if (r7 == 0) goto L_0x014a
                r7 = r0
                goto L_0x014f
            L_0x014a:
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>(r0)
            L_0x014f:
                r13.f43019Q = r6
                r13.f43023U = r3
                r13.f43020R = r0
                r13.f43155a = r2
                java.lang.Object r7 = r6.mo46355a(r7, r13)
                kotlin.p214b1.p216u.C14427e0.m62418c(r5)
                if (r7 != r14) goto L_0x0161
                return r14
            L_0x0161:
                int r7 = r13.f43025W
                r0.mo46011b(r7)
                goto L_0x013c
            L_0x0167:
                boolean r2 = r0.isEmpty()
                r2 = r2 ^ r4
                if (r2 == 0) goto L_0x017e
                r13.f43023U = r3
                r13.f43019Q = r0
                r13.f43155a = r1
                java.lang.Object r13 = r6.mo46355a(r0, r13)
                kotlin.p214b1.p216u.C14427e0.m62418c(r5)
                if (r13 != r14) goto L_0x017e
                return r14
            L_0x017e:
                kotlin.p0 r13 = kotlin.C14737p0.f42983a
                return r13
            L_0x0181:
                goto L_0x0183
            L_0x0182:
                throw r14
            L_0x0183:
                goto L_0x0182
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p219v0.C14773f1.C14774a.mo45823a(java.lang.Object, java.lang.Throwable):java.lang.Object");
        }

        @C6003d
        /* renamed from: a */
        public final C14884c<C14737p0> mo45824a(@C6003d C14899j<? super List<? extends T>> jVar, @C6003d C14884c<? super C14737p0> cVar) {
            C14445h0.m62478f(jVar, "$receiver");
            C14445h0.m62478f(cVar, "continuation");
            C14774a aVar = new C14774a(this.f43025W, this.f43026X, this.f43027Y, this.f43028Z, this.f43029a0, cVar);
            aVar.f43018P = jVar;
            return aVar;
        }

        @C6004e
        /* renamed from: b */
        public final Object mo24962d(@C6003d C14899j<? super List<? extends T>> jVar, @C6003d C14884c<? super C14737p0> cVar) {
            C14445h0.m62478f(jVar, "$receiver");
            C14445h0.m62478f(cVar, "continuation");
            return ((C14774a) mo45824a(jVar, cVar)).mo45823a((Object) C14737p0.f42983a, (Throwable) null);
        }
    }

    /* renamed from: kotlin.v0.f1$b */
    /* compiled from: Sequences.kt */
    public static final class C14775b implements C14594m<List<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C14594m f43030a;

        /* renamed from: b */
        final /* synthetic */ int f43031b;

        /* renamed from: c */
        final /* synthetic */ int f43032c;

        /* renamed from: d */
        final /* synthetic */ boolean f43033d;

        /* renamed from: e */
        final /* synthetic */ boolean f43034e;

        public C14775b(C14594m mVar, int i, int i2, boolean z, boolean z2) {
            this.f43030a = mVar;
            this.f43031b = i;
            this.f43032c = i2;
            this.f43033d = z;
            this.f43034e = z2;
        }

        @C6003d
        public Iterator<List<? extends T>> iterator() {
            return C14773f1.m64017a(this.f43030a.iterator(), this.f43031b, this.f43032c, this.f43033d, this.f43034e);
        }
    }

    /* renamed from: a */
    public static final void m64019a(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            String str2 = " must be greater than zero.";
            if (i != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(str2);
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size ");
                sb2.append(i);
                sb2.append(str2);
                str = sb2.toString();
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14594m<List<T>> m64018a(@C6003d C14594m<? extends T> mVar, int i, int i2, boolean z, boolean z2) {
        C14445h0.m62478f(mVar, "$receiver");
        m64019a(i, i2);
        C14775b bVar = new C14775b(mVar, i, i2, z, z2);
        return bVar;
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Iterator<List<T>> m64017a(@C6003d Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        C14445h0.m62478f(it, "iterator");
        if (!it.hasNext()) {
            return C14750b0.f42997a;
        }
        C14774a aVar = new C14774a(i2, i, it, z2, z, null);
        return C14902m.m66013a(aVar);
    }
}
