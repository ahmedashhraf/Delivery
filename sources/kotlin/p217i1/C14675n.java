package kotlin.p217i1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.C6121u;
import kotlin.p213a1.C14401k;
import kotlin.p213a1.C14402l;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p217i1.C14672m.C14673a;
import kotlin.p217i1.C14672m.C14674b;
import kotlin.p219v0.C14744a;
import kotlin.p219v0.C14755d;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, mo24990d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.n */
/* compiled from: Regex.kt */
final class C14675n implements C14672m {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MatchResult f42899a = this.f42902d.toMatchResult();
    @C6003d

    /* renamed from: b */
    private final C14670k f42900b = new C14677b(this);

    /* renamed from: c */
    private List<String> f42901c;

    /* renamed from: d */
    private final Matcher f42902d;

    /* renamed from: e */
    private final CharSequence f42903e;

    /* renamed from: kotlin.i1.n$a */
    /* compiled from: Regex.kt */
    public static final class C14676a extends C14755d<String> {

        /* renamed from: b */
        final /* synthetic */ C14675n f42904b;

        C14676a(C14675n nVar) {
            this.f42904b = nVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo45906a(String str) {
            return super.contains(str);
        }

        /* renamed from: b */
        public int mo45907b() {
            return this.f42904b.f42899a.groupCount() + 1;
        }

        /* renamed from: c */
        public /* bridge */ int mo45908c(String str) {
            return super.indexOf(str);
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return mo45906a((String) obj);
            }
            return false;
        }

        /* renamed from: d */
        public /* bridge */ int mo45910d(String str) {
            return super.lastIndexOf(str);
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return mo45908c((String) obj);
            }
            return -1;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return mo45910d((String) obj);
            }
            return -1;
        }

        @C6003d
        public String get(int i) {
            String group = this.f42904b.f42899a.group(i);
            return group != null ? group : "";
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0013\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, mo24990d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "(Lkotlin/text/MatcherMatchResult;)V", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.i1.n$b */
    /* compiled from: Regex.kt */
    public static final class C14677b extends C14744a<C14669j> implements C14671l {

        /* renamed from: a */
        final /* synthetic */ C14675n f42905a;

        /* renamed from: kotlin.i1.n$b$a */
        /* compiled from: Regex.kt */
        static final class C14678a extends C14448i0 implements C6080l<Integer, C14669j> {

            /* renamed from: a */
            final /* synthetic */ C14677b f42906a;

            C14678a(C14677b bVar) {
                this.f42906a = bVar;
                super(1);
            }

            @C6004e
            /* renamed from: a */
            public final C14669j mo45917a(int i) {
                return this.f42906a.get(i);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return mo45917a(((Number) obj).intValue());
            }
        }

        C14677b(C14675n nVar) {
            this.f42905a = nVar;
        }

        /* renamed from: a */
        public /* bridge */ boolean mo45914a(C14669j jVar) {
            return super.contains(jVar);
        }

        /* renamed from: b */
        public int mo45907b() {
            return this.f42905a.f42899a.groupCount() + 1;
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (obj != null ? obj instanceof C14669j : true) {
                return mo45914a((C14669j) obj);
            }
            return false;
        }

        @C6004e
        public C14669j get(int i) {
            MatchResult a = this.f42905a.f42899a;
            C14445h0.m62453a((Object) a, "matchResult");
            C14525k a2 = C14685p.m63653b(a, i);
            if (a2.mo45695b().intValue() < 0) {
                return null;
            }
            String group = this.f42905a.f42899a.group(i);
            C14445h0.m62453a((Object) group, "matchResult.group(index)");
            return new C14669j(group, a2);
        }

        public boolean isEmpty() {
            return false;
        }

        @C6003d
        public Iterator<C14669j> iterator() {
            return C14604p.m63321v(C14848z.m65787h((Iterable<? extends T>) C6129u.m28149b((Collection<?>) this)), new C14678a(this)).iterator();
        }

        @C6004e
        /* renamed from: b */
        public C14669j mo45897b(@C6003d String str) {
            C14445h0.m62478f(str, "name");
            C14401k kVar = C14402l.f42533a;
            MatchResult a = this.f42905a.f42899a;
            C14445h0.m62453a((Object) a, "matchResult");
            return kVar.mo45519a(a, str);
        }
    }

    public C14675n(@C6003d Matcher matcher, @C6003d CharSequence charSequence) {
        C14445h0.m62478f(matcher, "matcher");
        C14445h0.m62478f(charSequence, "input");
        this.f42902d = matcher;
        this.f42903e = charSequence;
    }

    @C6003d
    /* renamed from: b */
    public List<String> mo45899b() {
        if (this.f42901c == null) {
            this.f42901c = new C14676a(this);
        }
        List<String> list = this.f42901c;
        if (list == null) {
            C14445h0.m62474e();
        }
        return list;
    }

    @C6003d
    /* renamed from: c */
    public C14670k mo45900c() {
        return this.f42900b;
    }

    @C6003d
    /* renamed from: d */
    public C14525k mo45901d() {
        MatchResult matchResult = this.f42899a;
        C14445h0.m62453a((Object) matchResult, "matchResult");
        return C14685p.m63652b(matchResult);
    }

    @C6003d
    public String getValue() {
        String group = this.f42899a.group();
        C14445h0.m62453a((Object) group, "matchResult.group()");
        return group;
    }

    @C6004e
    public C14672m next() {
        int end = this.f42899a.end() + (this.f42899a.end() == this.f42899a.start() ? 1 : 0);
        if (end <= this.f42903e.length()) {
            return C14685p.m63654b(this.f42902d, end, this.f42903e);
        }
        return null;
    }

    @C6003d
    /* renamed from: a */
    public C14674b mo45898a() {
        return C14673a.m63592a(this);
    }
}
