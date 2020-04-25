package kotlin.p217i1;

import java.util.List;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo24990d2 = {"Lkotlin/text/MatchResult;", "", "destructured", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "Destructured", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.m */
/* compiled from: MatchResult.kt */
public interface C14672m {

    /* renamed from: kotlin.i1.m$a */
    /* compiled from: MatchResult.kt */
    public static final class C14673a {
        @C6003d
        /* renamed from: a */
        public static C14674b m63592a(C14672m mVar) {
            return new C14674b(mVar);
        }
    }

    /* renamed from: kotlin.i1.m$b */
    /* compiled from: MatchResult.kt */
    public static final class C14674b {
        @C6003d

        /* renamed from: a */
        private final C14672m f42898a;

        public C14674b(@C6003d C14672m mVar) {
            C14445h0.m62478f(mVar, "match");
            this.f42898a = mVar;
        }

        @C6041f
        /* renamed from: c */
        private final String m63593c() {
            return (String) mo45904a().mo45899b().get(1);
        }

        @C6041f
        /* renamed from: d */
        private final String m63594d() {
            return (String) mo45904a().mo45899b().get(10);
        }

        @C6041f
        /* renamed from: e */
        private final String m63595e() {
            return (String) mo45904a().mo45899b().get(2);
        }

        @C6041f
        /* renamed from: f */
        private final String m63596f() {
            return (String) mo45904a().mo45899b().get(3);
        }

        @C6041f
        /* renamed from: g */
        private final String m63597g() {
            return (String) mo45904a().mo45899b().get(4);
        }

        @C6041f
        /* renamed from: h */
        private final String m63598h() {
            return (String) mo45904a().mo45899b().get(5);
        }

        @C6041f
        /* renamed from: i */
        private final String m63599i() {
            return (String) mo45904a().mo45899b().get(6);
        }

        @C6041f
        /* renamed from: j */
        private final String m63600j() {
            return (String) mo45904a().mo45899b().get(7);
        }

        @C6041f
        /* renamed from: k */
        private final String m63601k() {
            return (String) mo45904a().mo45899b().get(8);
        }

        @C6041f
        /* renamed from: l */
        private final String m63602l() {
            return (String) mo45904a().mo45899b().get(9);
        }

        @C6003d
        /* renamed from: a */
        public final C14672m mo45904a() {
            return this.f42898a;
        }

        @C6003d
        /* renamed from: b */
        public final List<String> mo45905b() {
            return this.f42898a.mo45899b().subList(1, this.f42898a.mo45899b().size());
        }
    }

    @C6003d
    /* renamed from: a */
    C14674b mo45898a();

    @C6003d
    /* renamed from: b */
    List<String> mo45899b();

    @C6003d
    /* renamed from: c */
    C14670k mo45900c();

    @C6003d
    /* renamed from: d */
    C14525k mo45901d();

    @C6003d
    String getValue();

    @C6004e
    C14672m next();
}
