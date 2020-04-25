package kotlin.p217i1;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p504e1.C14525k;
import p053b.p063d.p064b.C2108a;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0014\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\b\u001a\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0002¨\u0006\u0014"}, mo24990d2 = {"fromInt", "", "T", "Lkotlin/text/FlagEnum;", "", "value", "", "findNext", "Lkotlin/text/MatchResult;", "Ljava/util/regex/Matcher;", "from", "input", "", "matchEntire", "range", "Lkotlin/ranges/IntRange;", "Ljava/util/regex/MatchResult;", "groupIndex", "toInt", "", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.p */
/* compiled from: Regex.kt */
public final class C14685p {

    /* renamed from: kotlin.i1.p$a */
    /* compiled from: Regex.kt */
    public static final class C14686a extends C14448i0 implements C6080l<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f42917a;

        public C14686a(int i) {
            this.f42917a = i;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo45937a(T t) {
            C14668i iVar = (C14668i) t;
            return (this.f42917a & iVar.mo45886d()) == iVar.getValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo45937a((Enum) obj));
        }
    }

    /* renamed from: kotlin.i1.p$b */
    /* compiled from: Regex.kt */
    public static final class C14687b extends C14448i0 implements C6080l<T, Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f42918a;

        public C14687b(int i) {
            this.f42918a = i;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo45938a(T t) {
            C14668i iVar = (C14668i) t;
            return (this.f42918a & iVar.mo45886d()) == iVar.getValue();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(mo45938a((Enum) obj));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14672m m63654b(@C6003d Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C14675n(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14672m m63655b(@C6003d Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C14675n(matcher, charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14525k m63652b(@C6003d MatchResult matchResult) {
        return C14534q.m62992d(matchResult.start(), matchResult.end());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14525k m63653b(@C6003d MatchResult matchResult, int i) {
        return C14534q.m62992d(matchResult.start(i), matchResult.end(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m63651b(@C6003d Iterable<? extends C14668i> iterable) {
        int i = 0;
        for (C14668i value : iterable) {
            i |= value.getValue();
        }
        return i;
    }

    /* renamed from: a */
    private static final <T extends Enum<T> & C14668i> Set<T> m63646a(int i) {
        C14445h0.m62450a(4, C2108a.f8183X4);
        EnumSet allOf = EnumSet.allOf(Enum.class);
        C6135x.m28192b((Iterable<? extends T>) allOf, (C6080l<? super T, Boolean>) new C14687b<Object,Boolean>(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C14445h0.m62453a((Object) unmodifiableSet, "Collections.unmodifiable… == it.value }\n        })");
        return unmodifiableSet;
    }
}
