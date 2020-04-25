package kotlin.p217i1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C14730m;
import kotlin.C14734o;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14417a1;
import kotlin.p214b1.p216u.C14419b1;
import kotlin.p214b1.p216u.C14443g1;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p505f1.C14557l;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0001\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, mo24990d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.a */
/* compiled from: CharCategory.kt */
public enum C14643a {
    UNASSIGNED(0, "Cn"),
    UPPERCASE_LETTER(1, "Lu"),
    LOWERCASE_LETTER(2, "Ll"),
    TITLECASE_LETTER(3, "Lt"),
    MODIFIER_LETTER(4, "Lm"),
    OTHER_LETTER(5, "Lo"),
    NON_SPACING_MARK(6, "Mn"),
    ENCLOSING_MARK(7, "Me"),
    COMBINING_SPACING_MARK(8, "Mc"),
    DECIMAL_DIGIT_NUMBER(9, "Nd"),
    LETTER_NUMBER(10, "Nl"),
    OTHER_NUMBER(11, "No"),
    SPACE_SEPARATOR(12, "Zs"),
    LINE_SEPARATOR(13, "Zl"),
    PARAGRAPH_SEPARATOR(14, "Zp"),
    CONTROL(15, "Cc"),
    FORMAT(16, "Cf"),
    PRIVATE_USE(18, "Co"),
    SURROGATE(19, "Cs"),
    DASH_PUNCTUATION(20, "Pd"),
    START_PUNCTUATION(21, "Ps"),
    END_PUNCTUATION(22, "Pe"),
    CONNECTOR_PUNCTUATION(23, "Pc"),
    OTHER_PUNCTUATION(24, "Po"),
    MATH_SYMBOL(25, "Sm"),
    CURRENCY_SYMBOL(26, "Sc"),
    MODIFIER_SYMBOL(27, "Sk"),
    OTHER_SYMBOL(28, "So"),
    INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
    FINAL_QUOTE_PUNCTUATION(30, "Pf");
    
    public static final C14645b Companion = null;
    /* access modifiers changed from: private */
    public static final C14730m categoryMap$delegate = null;
    @C6003d
    private final String code;
    private final int value;

    /* renamed from: kotlin.i1.a$a */
    /* compiled from: CharCategory.kt */
    static final class C14644a extends C14448i0 implements C6069a<Map<Integer, ? extends C14643a>> {

        /* renamed from: a */
        public static final C14644a f42819a = null;

        static {
            f42819a = new C14644a();
        }

        C14644a() {
            super(0);
        }

        @C6003d
        /* renamed from: p */
        public final Map<Integer, C14643a> m63390p() {
            C14643a[] values = C14643a.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C14534q.m62902a(C14841t0.m65538a(values.length), 16));
            for (C14643a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.mo45860e()), aVar);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: kotlin.i1.a$b */
    /* compiled from: CharCategory.kt */
    public static final class C14645b {

        /* renamed from: a */
        static final /* synthetic */ C14557l[] f42820a = null;

        static {
            f42820a = new C14557l[]{C14443g1.m62437a((C14417a1) new C14419b1(C14443g1.m62440b(C14645b.class), "categoryMap", "getCategoryMap()Ljava/util/Map;"))};
        }

        private C14645b() {
        }

        /* renamed from: a */
        private final Map<Integer, C14643a> m63391a() {
            C14730m f = C14643a.categoryMap$delegate;
            C14557l lVar = f42820a[0];
            return (Map) f.getValue();
        }

        @C6003d
        /* renamed from: a */
        public final C14643a mo45861a(int i) {
            C14643a aVar = (C14643a) m63391a().get(Integer.valueOf(i));
            if (aVar != null) {
                return aVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Category #");
            sb.append(i);
            sb.append(" is not defined.");
            throw new IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ C14645b(C14487u uVar) {
            this();
        }
    }

    static {
        Companion = new C14645b(null);
        categoryMap$delegate = C14734o.m63889a((C6069a<? extends T>) C14644a.f42819a);
    }

    protected C14643a(int i, @C6003d String str) {
        C14445h0.m62478f(str, XHTMLText.CODE);
        this.value = i;
        this.code = str;
    }

    /* renamed from: a */
    public final boolean mo45858a(char c) {
        return Character.getType(c) == this.value;
    }

    @C6003d
    /* renamed from: d */
    public final String mo45859d() {
        return this.code;
    }

    /* renamed from: e */
    public final int mo45860e() {
        return this.value;
    }
}
