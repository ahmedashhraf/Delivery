package kotlin.p217i1;

import java.io.Serializable;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C6050b0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14421c0;
import kotlin.p214b1.p216u.C14443g1;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p217i1.C14685p.C14686a;
import kotlin.p505f1.C14543e;
import kotlin.p506g1.C14594m;
import org.jivesoftware.smackx.xdata.FormField.Option;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020+H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, mo24990d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", "transform", "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.o */
/* compiled from: Regex.kt */
public final class C14679o implements Serializable {

    /* renamed from: N */
    public static final C14680a f42907N = new C14680a(null);

    /* renamed from: a */
    private Set<? extends C14688q> f42908a;

    /* renamed from: b */
    private final Pattern f42909b;

    /* renamed from: kotlin.i1.o$a */
    /* compiled from: Regex.kt */
    public static final class C14680a {
        private C14680a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final int m63633a(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @C6003d
        /* renamed from: b */
        public final String mo45932b(@C6003d String str) {
            C14445h0.m62478f(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            C14445h0.m62453a((Object) quoteReplacement, "Matcher.quoteReplacement(literal)");
            return quoteReplacement;
        }

        @C6003d
        /* renamed from: c */
        public final C14679o mo45933c(@C6003d String str) {
            C14445h0.m62478f(str, "literal");
            return new C14679o(str, C14688q.LITERAL);
        }

        public /* synthetic */ C14680a(C14487u uVar) {
            this();
        }

        @C6003d
        /* renamed from: a */
        public final String mo45931a(@C6003d String str) {
            C14445h0.m62478f(str, "literal");
            String quote = Pattern.quote(str);
            C14445h0.m62453a((Object) quote, "Pattern.quote(literal)");
            return quote;
        }
    }

    @C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo24990d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
    /* renamed from: kotlin.i1.o$b */
    /* compiled from: Regex.kt */
    private static final class C14681b implements Serializable {

        /* renamed from: N */
        public static final C14682a f42910N = new C14682a(null);
        private static final long serialVersionUID = 0;
        @C6003d

        /* renamed from: a */
        private final String f42911a;

        /* renamed from: b */
        private final int f42912b;

        /* renamed from: kotlin.i1.o$b$a */
        /* compiled from: Regex.kt */
        public static final class C14682a {
            private C14682a() {
            }

            public /* synthetic */ C14682a(C14487u uVar) {
                this();
            }
        }

        public C14681b(@C6003d String str, int i) {
            C14445h0.m62478f(str, "pattern");
            this.f42911a = str;
            this.f42912b = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f42911a, this.f42912b);
            C14445h0.m62453a((Object) compile, "Pattern.compile(pattern, flags)");
            return new C14679o(compile);
        }

        /* renamed from: a */
        public final int mo45934a() {
            return this.f42912b;
        }

        @C6003d
        /* renamed from: d */
        public final String mo45935d() {
            return this.f42911a;
        }
    }

    /* renamed from: kotlin.i1.o$c */
    /* compiled from: Regex.kt */
    static final class C14683c extends C14448i0 implements C6069a<C14672m> {

        /* renamed from: N */
        final /* synthetic */ int f42913N;

        /* renamed from: a */
        final /* synthetic */ C14679o f42914a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f42915b;

        C14683c(C14679o oVar, CharSequence charSequence, int i) {
            this.f42914a = oVar;
            this.f42915b = charSequence;
            this.f42913N = i;
            super(0);
        }

        @C6004e
        /* renamed from: p */
        public final C14672m m63641p() {
            return this.f42914a.mo45921a(this.f42915b, this.f42913N);
        }
    }

    /* renamed from: kotlin.i1.o$d */
    /* compiled from: Regex.kt */
    static final class C14684d extends C14421c0 implements C6080l<C14672m, C14672m> {

        /* renamed from: P */
        public static final C14684d f42916P = new C14684d();

        C14684d() {
            super(1);
        }

        @C6004e
        /* renamed from: a */
        public final C14672m invoke(@C6003d C14672m mVar) {
            C14445h0.m62478f(mVar, "p1");
            return mVar.next();
        }

        public final String getName() {
            return "next";
        }

        /* renamed from: t */
        public final C14543e mo45536t() {
            return C14443g1.m62440b(C14672m.class);
        }

        /* renamed from: v */
        public final String mo45537v() {
            return "next()Lkotlin/text/MatchResult;";
        }
    }

    @C6050b0
    public C14679o(@C6003d Pattern pattern) {
        C14445h0.m62478f(pattern, "nativePattern");
        this.f42909b = pattern;
    }

    private final Object writeReplace() {
        String pattern = this.f42909b.pattern();
        C14445h0.m62453a((Object) pattern, "nativePattern.pattern()");
        return new C14681b(pattern, this.f42909b.flags());
    }

    @C6003d
    /* renamed from: a */
    public final Set<C14688q> mo45920a() {
        Set<? extends C14688q> set = this.f42908a;
        if (set != null) {
            return set;
        }
        int flags = this.f42909b.flags();
        EnumSet allOf = EnumSet.allOf(C14688q.class);
        C6135x.m28192b((Iterable<? extends T>) allOf, (C6080l<? super T, Boolean>) new C14686a<Object,Boolean>(flags));
        Set<? extends C14688q> unmodifiableSet = Collections.unmodifiableSet(allOf);
        C14445h0.m62453a((Object) unmodifiableSet, "Collections.unmodifiable… == it.value }\n        })");
        this.f42908a = unmodifiableSet;
        return unmodifiableSet;
    }

    @C6003d
    /* renamed from: b */
    public final C14594m<C14672m> mo45924b(@C6003d CharSequence charSequence, int i) {
        C14445h0.m62478f(charSequence, "input");
        return C14596o.m63180a((C6069a<? extends T>) new C14683c<Object>(this, charSequence, i), (C6080l<? super T, ? extends T>) C14684d.f42916P);
    }

    /* renamed from: c */
    public final boolean mo45927c(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "input");
        return this.f42909b.matcher(charSequence).matches();
    }

    @C6003d
    /* renamed from: d */
    public final String mo45928d() {
        String pattern = this.f42909b.pattern();
        C14445h0.m62453a((Object) pattern, "nativePattern.pattern()");
        return pattern;
    }

    @C6003d
    /* renamed from: e */
    public final Pattern mo45929e() {
        return this.f42909b;
    }

    @C6003d
    public String toString() {
        String pattern = this.f42909b.toString();
        C14445h0.m62453a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    public C14679o(@C6003d String str) {
        C14445h0.m62478f(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C14445h0.m62453a((Object) compile, "Pattern.compile(pattern)");
        this(compile);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ C14594m m63619b(C14679o oVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oVar.mo45924b(charSequence, i);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ List m63620c(C14679o oVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oVar.mo45926c(charSequence, i);
    }

    public C14679o(@C6003d String str, @C6003d C14688q qVar) {
        C14445h0.m62478f(str, "pattern");
        C14445h0.m62478f(qVar, Option.ELEMENT);
        Pattern compile = Pattern.compile(str, f42907N.m63633a(qVar.getValue()));
        C14445h0.m62453a((Object) compile, "Pattern.compile(pattern,…nicodeCase(option.value))");
        this(compile);
    }

    @C6004e
    /* renamed from: b */
    public final C14672m mo45925b(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "input");
        Matcher matcher = this.f42909b.matcher(charSequence);
        C14445h0.m62453a((Object) matcher, "nativePattern.matcher(input)");
        return C14685p.m63655b(matcher, charSequence);
    }

    @C6003d
    /* renamed from: c */
    public final List<String> mo45926c(@C6003d CharSequence charSequence, int i) {
        C14445h0.m62478f(charSequence, "input");
        if (i >= 0) {
            Pattern pattern = this.f42909b;
            if (i == 0) {
                i = -1;
            }
            String[] split = pattern.split(charSequence, i);
            C14445h0.m62453a((Object) split, "nativePattern.split(inpu…imit == 0) -1 else limit)");
            return C14794o.m64862c((T[]) split);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public C14679o(@C6003d String str, @C6003d Set<? extends C14688q> set) {
        C14445h0.m62478f(str, "pattern");
        C14445h0.m62478f(set, "options");
        Pattern compile = Pattern.compile(str, f42907N.m63633a(C14685p.m63651b((Iterable<? extends C14668i>) set)));
        C14445h0.m62453a((Object) compile, "Pattern.compile(pattern,…odeCase(options.toInt()))");
        this(compile);
    }

    @C6003d
    /* renamed from: b */
    public final String mo45923b(@C6003d CharSequence charSequence, @C6003d String str) {
        C14445h0.m62478f(charSequence, "input");
        C14445h0.m62478f(str, "replacement");
        String replaceFirst = this.f42909b.matcher(charSequence).replaceFirst(str);
        C14445h0.m62453a((Object) replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    /* renamed from: a */
    public final boolean mo45922a(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "input");
        return this.f42909b.matcher(charSequence).find();
    }

    @C6004e
    /* renamed from: a */
    public final C14672m mo45921a(@C6003d CharSequence charSequence, int i) {
        C14445h0.m62478f(charSequence, "input");
        Matcher matcher = this.f42909b.matcher(charSequence);
        C14445h0.m62453a((Object) matcher, "nativePattern.matcher(input)");
        return C14685p.m63654b(matcher, i, charSequence);
    }

    @C6004e
    /* renamed from: a */
    public static /* synthetic */ C14672m m63618a(C14679o oVar, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oVar.mo45921a(charSequence, i);
    }

    @C6003d
    /* renamed from: a */
    public final String mo45918a(@C6003d CharSequence charSequence, @C6003d String str) {
        C14445h0.m62478f(charSequence, "input");
        C14445h0.m62478f(str, "replacement");
        String replaceAll = this.f42909b.matcher(charSequence).replaceAll(str);
        C14445h0.m62453a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @C6003d
    /* renamed from: a */
    public final String mo45919a(@C6003d CharSequence charSequence, @C6003d C6080l<? super C14672m, ? extends CharSequence> lVar) {
        C14445h0.m62478f(charSequence, "input");
        C14445h0.m62478f(lVar, "transform");
        int i = 0;
        C14672m a = m63618a(this, charSequence, 0, 2, null);
        if (a == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            if (a == null) {
                C14445h0.m62474e();
            }
            sb.append(charSequence, i, a.mo45901d().mo45695b().intValue());
            sb.append((CharSequence) lVar.invoke(a));
            i = a.mo45901d().mo45696c().intValue() + 1;
            a = a.next();
            if (i >= length) {
                break;
            }
        } while (a != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C14445h0.m62453a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
