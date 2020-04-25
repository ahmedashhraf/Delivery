package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import com.google.common.base.C5785c;
import java.util.Arrays;
import java.util.BitSet;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2717c;
import p201f.p202a.C5944c;

@C2715a
@C2716b(emulated = true)
/* renamed from: c.d.b.a.e.a.a.a.b.c */
/* compiled from: CharMatcher */
public abstract class C2719c implements C2751l<Character> {

    /* renamed from: b */
    public static final C2719c f9840b = new C2726g();

    /* renamed from: c */
    public static final C2719c f9841c = m13126a(0, (char) C5785c.f16681N, "CharMatcher.ASCII");

    /* renamed from: d */
    private static final String f9842d = "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０";

    /* renamed from: e */
    private static final String f9843e;

    /* renamed from: f */
    public static final C2719c f9844f;

    /* renamed from: g */
    public static final C2719c f9845g = new C2727h("CharMatcher.JAVA_DIGIT");

    /* renamed from: h */
    public static final C2719c f9846h = new C2728i("CharMatcher.JAVA_LETTER");

    /* renamed from: i */
    public static final C2719c f9847i = new C2729j("CharMatcher.JAVA_LETTER_OR_DIGIT");

    /* renamed from: j */
    public static final C2719c f9848j = new C2730k("CharMatcher.JAVA_UPPER_CASE");

    /* renamed from: k */
    public static final C2719c f9849k = new C2731l("CharMatcher.JAVA_LOWER_CASE");

    /* renamed from: l */
    public static final C2719c f9850l = m13125a(0, 31).mo10406b(m13125a((char) C5785c.f16681N, 159)).mo10397a("CharMatcher.JAVA_ISO_CONTROL");

    /* renamed from: m */
    public static final C2719c f9851m = new C2741v("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());

    /* renamed from: n */
    public static final C2719c f9852n = new C2741v("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());

    /* renamed from: o */
    public static final C2719c f9853o = new C2732m("CharMatcher.ANY");

    /* renamed from: p */
    public static final C2719c f9854p = new C2733n("CharMatcher.NONE");

    /* renamed from: q */
    private static final int f9855q = 65536;

    /* renamed from: r */
    static final String f9856r = " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　";

    /* renamed from: s */
    static final int f9857s = 1682554634;

    /* renamed from: t */
    static final int f9858t = Integer.numberOfLeadingZeros(31);

    /* renamed from: u */
    public static final C2719c f9859u = new C2725f("WHITESPACE");

    /* renamed from: a */
    final String f9860a;

    /* renamed from: c.d.b.a.e.a.a.a.b.c$a */
    /* compiled from: CharMatcher */
    static class C2720a extends C2737r {

        /* renamed from: v */
        final /* synthetic */ char f9861v;

        C2720a(String str, char c) {
            this.f9861v = c;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return c != this.f9861v;
        }

        /* renamed from: b */
        public C2719c mo10406b(C2719c cVar) {
            return cVar.mo10401a(this.f9861v) ? C2719c.f9853o : this;
        }

        /* renamed from: a */
        public C2719c mo10396a(C2719c cVar) {
            return cVar.mo10401a(this.f9861v) ? C2719c.super.mo10396a(cVar) : cVar;
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            bitSet.set(0, this.f9861v);
            bitSet.set(this.f9861v + 1, 65536);
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return C2719c.m13131b(this.f9861v);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$b */
    /* compiled from: CharMatcher */
    static class C2721b extends C2719c {

        /* renamed from: v */
        final /* synthetic */ char[] f9862v;

        C2721b(String str, char[] cArr) {
            this.f9862v = cArr;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Arrays.binarySearch(this.f9862v, c) >= 0;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            for (char c : this.f9862v) {
                bitSet.set(c);
            }
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$c */
    /* compiled from: CharMatcher */
    static class C2722c extends C2737r {

        /* renamed from: v */
        final /* synthetic */ char f9863v;

        /* renamed from: w */
        final /* synthetic */ char f9864w;

        C2722c(String str, char c, char c2) {
            this.f9863v = c;
            this.f9864w = c2;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return c == this.f9863v || c == this.f9864w;
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            bitSet.set(this.f9863v);
            bitSet.set(this.f9864w);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$d */
    /* compiled from: CharMatcher */
    static class C2723d extends C2737r {

        /* renamed from: v */
        final /* synthetic */ char f9865v;

        /* renamed from: w */
        final /* synthetic */ char f9866w;

        C2723d(String str, char c, char c2) {
            this.f9865v = c;
            this.f9866w = c2;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return this.f9865v <= c && c <= this.f9866w;
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            bitSet.set(this.f9865v, this.f9866w + 1);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$e */
    /* compiled from: CharMatcher */
    static class C2724e extends C2719c {

        /* renamed from: v */
        final /* synthetic */ C2751l f9867v;

        C2724e(String str, C2751l lVar) {
            this.f9867v = lVar;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return this.f9867v.apply(Character.valueOf(c));
        }

        /* renamed from: a */
        public boolean apply(Character ch) {
            return this.f9867v.apply(C6329k.m29434a(ch));
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$f */
    /* compiled from: CharMatcher */
    static class C2725f extends C2737r {
        C2725f(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return C2719c.f9856r.charAt((C2719c.f9857s * c) >>> C2719c.f9858t) == c;
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(C2719c.f9856r.charAt(i));
            }
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$g */
    /* compiled from: CharMatcher */
    static class C2726g extends C2719c {
        C2726g() {
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            boolean z = true;
            if (!(c == ' ' || c == 133 || c == 5760)) {
                if (c == 8199) {
                    return false;
                }
                if (!(c == 8287 || c == 12288 || c == 8232 || c == 8233)) {
                    switch (c) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            if (c < 8192 || c > 8202) {
                                z = false;
                            }
                            return z;
                    }
                }
            }
            return true;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        public String toString() {
            return "CharMatcher.BREAKING_WHITESPACE";
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$h */
    /* compiled from: CharMatcher */
    static class C2727h extends C2719c {
        C2727h(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Character.isDigit(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$i */
    /* compiled from: CharMatcher */
    static class C2728i extends C2719c {
        C2728i(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Character.isLetter(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$j */
    /* compiled from: CharMatcher */
    static class C2729j extends C2719c {
        C2729j(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Character.isLetterOrDigit(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$k */
    /* compiled from: CharMatcher */
    static class C2730k extends C2719c {
        C2730k(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Character.isUpperCase(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$l */
    /* compiled from: CharMatcher */
    static class C2731l extends C2719c {
        C2731l(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return Character.isLowerCase(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$m */
    /* compiled from: CharMatcher */
    static class C2732m extends C2737r {
        C2732m(String str) {
            super(str);
        }

        /* renamed from: a */
        public int mo10394a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C6329k.m29443b(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return true;
        }

        /* renamed from: b */
        public int mo10404b(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        /* renamed from: c */
        public int mo10408c(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        /* renamed from: d */
        public boolean mo10411d(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return true;
        }

        /* renamed from: f */
        public boolean mo10413f(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: g */
        public String mo10414g(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return "";
        }

        /* renamed from: i */
        public String mo10416i(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return "";
        }

        /* renamed from: b */
        public String mo10407b(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        /* renamed from: a */
        public String mo10399a(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public C2719c mo10406b(C2719c cVar) {
            C6329k.m29434a(cVar);
            return this;
        }

        /* renamed from: a */
        public String mo10398a(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        /* renamed from: a */
        public int mo10393a(CharSequence charSequence) {
            return charSequence.length();
        }

        /* renamed from: a */
        public C2719c mo10396a(C2719c cVar) {
            return (C2719c) C6329k.m29434a(cVar);
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return C2719c.f9854p;
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$n */
    /* compiled from: CharMatcher */
    static class C2733n extends C2737r {
        C2733n(String str) {
            super(str);
        }

        /* renamed from: a */
        public int mo10394a(CharSequence charSequence, int i) {
            C6329k.m29443b(i, charSequence.length());
            return -1;
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return false;
        }

        /* renamed from: b */
        public int mo10404b(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return -1;
        }

        /* renamed from: c */
        public int mo10408c(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return -1;
        }

        /* renamed from: d */
        public boolean mo10411d(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: f */
        public boolean mo10413f(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return true;
        }

        /* renamed from: g */
        public String mo10414g(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: i */
        public String mo10416i(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: j */
        public String mo10417j(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: k */
        public String mo10418k(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: b */
        public String mo10407b(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        /* renamed from: a */
        public String mo10399a(CharSequence charSequence, CharSequence charSequence2) {
            C6329k.m29434a(charSequence2);
            return charSequence.toString();
        }

        /* renamed from: b */
        public C2719c mo10406b(C2719c cVar) {
            return (C2719c) C6329k.m29434a(cVar);
        }

        /* renamed from: a */
        public String mo10398a(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        /* renamed from: a */
        public int mo10393a(CharSequence charSequence) {
            C6329k.m29434a(charSequence);
            return 0;
        }

        /* renamed from: a */
        public C2719c mo10396a(C2719c cVar) {
            C6329k.m29434a(cVar);
            return this;
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return C2719c.f9853o;
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$o */
    /* compiled from: CharMatcher */
    static class C2734o extends C2737r {

        /* renamed from: v */
        final /* synthetic */ char f9868v;

        C2734o(String str, char c) {
            this.f9868v = c;
            super(str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return c == this.f9868v;
        }

        /* renamed from: b */
        public String mo10407b(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f9868v, c);
        }

        /* renamed from: a */
        public C2719c mo10396a(C2719c cVar) {
            return cVar.mo10401a(this.f9868v) ? this : C2719c.f9854p;
        }

        /* renamed from: b */
        public C2719c mo10406b(C2719c cVar) {
            return cVar.mo10401a(this.f9868v) ? cVar : C2719c.super.mo10406b(cVar);
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return C2719c.m13133c(this.f9868v);
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            bitSet.set(this.f9868v);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$p */
    /* compiled from: CharMatcher */
    private static class C2735p extends C2719c {

        /* renamed from: v */
        final C2719c f9869v;

        /* renamed from: w */
        final C2719c f9870w;

        C2735p(C2719c cVar, C2719c cVar2) {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.and(");
            sb.append(cVar);
            sb.append(", ");
            sb.append(cVar2);
            sb.append(")");
            this(cVar, cVar2, sb.toString());
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return this.f9869v.mo10401a(c) && this.f9870w.mo10401a(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        C2735p(C2719c cVar, C2719c cVar2, String str) {
            super(str);
            this.f9869v = (C2719c) C6329k.m29434a(cVar);
            this.f9870w = (C2719c) C6329k.m29434a(cVar2);
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f9869v.mo10400a(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f9870w.mo10400a(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2719c mo10397a(String str) {
            return new C2735p(this.f9869v, this.f9870w, str);
        }
    }

    @C2717c("java.util.BitSet")
    /* renamed from: c.d.b.a.e.a.a.a.b.c$q */
    /* compiled from: CharMatcher */
    private static class C2736q extends C2737r {

        /* renamed from: v */
        private final BitSet f9871v;

        /* synthetic */ C2736q(BitSet bitSet, String str, C2726g gVar) {
            this(bitSet, str);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return this.f9871v.get(c);
        }

        private C2736q(BitSet bitSet, String str) {
            super(str);
            if (bitSet.length() + 64 < bitSet.size()) {
                bitSet = (BitSet) bitSet.clone();
            }
            this.f9871v = bitSet;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            bitSet.or(this.f9871v);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$r */
    /* compiled from: CharMatcher */
    static abstract class C2737r extends C2719c {
        C2737r() {
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return new C2738s(this);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final C2719c mo10405b() {
            return this;
        }

        C2737r(String str) {
            super(str);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$s */
    /* compiled from: CharMatcher */
    static final class C2738s extends C2739t {
        C2738s(C2719c cVar) {
            super(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2719c mo10397a(String str) {
            return new C2738s(str, this.f9872v);
        }

        /* renamed from: b */
        public final C2719c mo10405b() {
            return this;
        }

        C2738s(String str, C2719c cVar) {
            super(str, cVar);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$t */
    /* compiled from: CharMatcher */
    private static class C2739t extends C2719c {

        /* renamed from: v */
        final C2719c f9872v;

        C2739t(String str, C2719c cVar) {
            super(str);
            this.f9872v = cVar;
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return !this.f9872v.mo10401a(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        /* renamed from: d */
        public boolean mo10411d(CharSequence charSequence) {
            return this.f9872v.mo10413f(charSequence);
        }

        /* renamed from: f */
        public boolean mo10413f(CharSequence charSequence) {
            return this.f9872v.mo10411d(charSequence);
        }

        /* renamed from: a */
        public int mo10393a(CharSequence charSequence) {
            return charSequence.length() - this.f9872v.mo10393a(charSequence);
        }

        C2739t(C2719c cVar) {
            StringBuilder sb = new StringBuilder();
            sb.append(cVar);
            sb.append(".negate()");
            this(sb.toString(), cVar);
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f9872v.mo10400a(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        /* renamed from: a */
        public C2719c mo10395a() {
            return this.f9872v;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2719c mo10397a(String str) {
            return new C2739t(str, this.f9872v);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$u */
    /* compiled from: CharMatcher */
    private static class C2740u extends C2719c {

        /* renamed from: v */
        final C2719c f9873v;

        /* renamed from: w */
        final C2719c f9874w;

        C2740u(C2719c cVar, C2719c cVar2, String str) {
            super(str);
            this.f9873v = (C2719c) C6329k.m29434a(cVar);
            this.f9874w = (C2719c) C6329k.m29434a(cVar2);
        }

        /* access modifiers changed from: 0000 */
        @C2717c("java.util.BitSet")
        /* renamed from: a */
        public void mo10400a(BitSet bitSet) {
            this.f9873v.mo10400a(bitSet);
            this.f9874w.mo10400a(bitSet);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            return this.f9873v.mo10401a(c) || this.f9874w.mo10401a(c);
        }

        C2740u(C2719c cVar, C2719c cVar2) {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.or(");
            sb.append(cVar);
            sb.append(", ");
            sb.append(cVar2);
            sb.append(")");
            this(cVar, cVar2, sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C2719c mo10397a(String str) {
            return new C2740u(this.f9873v, this.f9874w, str);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.c$v */
    /* compiled from: CharMatcher */
    private static class C2741v extends C2719c {

        /* renamed from: v */
        private final char[] f9875v;

        /* renamed from: w */
        private final char[] f9876w;

        C2741v(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.f9875v = cArr;
            this.f9876w = cArr2;
            C6329k.m29440a(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                C6329k.m29440a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    C6329k.m29440a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        /* renamed from: a */
        public boolean mo10401a(char c) {
            int binarySearch = Arrays.binarySearch(this.f9875v, c);
            boolean z = true;
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            if (i < 0 || c > this.f9876w[i]) {
                z = false;
            }
            return z;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C2719c.super.apply((Character) obj);
        }
    }

    static {
        StringBuilder sb = new StringBuilder(31);
        int i = 0;
        while (true) {
            String str = f9842d;
            if (i < 31) {
                sb.append((char) (str.charAt(i) + 9));
                i++;
            } else {
                f9843e = sb.toString();
                f9844f = new C2741v("CharMatcher.DIGIT", str.toCharArray(), f9843e.toCharArray());
                return;
            }
        }
    }

    C2719c(String str) {
        this.f9860a = str;
    }

    /* renamed from: a */
    public static C2719c m13125a(char c, char c2) {
        C6329k.m29440a(c2 >= c);
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.inRange('");
        sb.append(m13134d(c));
        sb.append("', '");
        sb.append(m13134d(c2));
        sb.append("')");
        return m13126a(c, c2, sb.toString());
    }

    @C2717c("SmallCharMatcher")
    /* renamed from: a */
    private static boolean m13130a(int i, int i2) {
        return i <= 1023 && i2 > (i * 4) * 16;
    }

    /* renamed from: b */
    public static C2719c m13131b(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        sb.append(m13134d(c));
        sb.append("')");
        return new C2734o(sb.toString(), c);
    }

    /* renamed from: c */
    public static C2719c m13133c(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.isNot('");
        sb.append(m13134d(c));
        sb.append("')");
        return new C2720a(sb.toString(), c);
    }

    /* renamed from: d */
    private static String m13134d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: l */
    public static C2719c m13135l(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return f9854p;
        }
        if (length == 1) {
            return m13131b(charSequence.charAt(0));
        }
        if (length == 2) {
            return m13132b(charSequence.charAt(0), charSequence.charAt(1));
        }
        char[] charArray = charSequence.toString().toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char d : charArray) {
            sb.append(m13134d(d));
        }
        sb.append("\")");
        return new C2721b(sb.toString(), charArray);
    }

    /* renamed from: m */
    public static C2719c m13136m(CharSequence charSequence) {
        return m13135l(charSequence).mo10395a();
    }

    /* renamed from: a */
    public abstract boolean mo10401a(char c);

    /* renamed from: e */
    public boolean mo10412e(CharSequence charSequence) {
        return !mo10413f(charSequence);
    }

    /* renamed from: f */
    public boolean mo10413f(CharSequence charSequence) {
        return mo10404b(charSequence) == -1;
    }

    @C5944c
    /* renamed from: g */
    public String mo10414g(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int b = mo10404b((CharSequence) charSequence2);
        if (b == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            b++;
            while (b != charArray.length) {
                if (mo10401a(charArray[b])) {
                    i++;
                } else {
                    charArray[b - i] = charArray[b];
                    b++;
                }
            }
            return new String(charArray, 0, b - i);
        }
    }

    @C5944c
    /* renamed from: h */
    public String mo10415h(CharSequence charSequence) {
        return mo10395a().mo10414g(charSequence);
    }

    @C5944c
    /* renamed from: i */
    public String mo10416i(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo10401a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && mo10401a(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    @C5944c
    /* renamed from: j */
    public String mo10417j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!mo10401a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    @C5944c
    /* renamed from: k */
    public String mo10418k(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo10401a(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String toString() {
        return this.f9860a;
    }

    protected C2719c() {
        this.f9860a = super.toString();
    }

    /* renamed from: b */
    private static C2719c m13132b(char c, char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.anyOf(\"");
        sb.append(m13134d(c));
        sb.append(m13134d(c2));
        sb.append("\")");
        return new C2722c(sb.toString(), c, c2);
    }

    /* access modifiers changed from: 0000 */
    @C2717c("java.util.BitSet")
    /* renamed from: c */
    public C2719c mo10409c() {
        String str;
        BitSet bitSet = new BitSet();
        mo10400a(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return m13127a(cardinality, bitSet, this.f9860a);
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String str2 = ".negate()";
        if (this.f9860a.endsWith(str2)) {
            String str3 = this.f9860a;
            str = str3.substring(0, str3.length() - 9);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9860a);
            sb.append(str2);
            str = sb.toString();
        }
        return new C2738s(toString(), m13127a(i, bitSet, str));
    }

    /* renamed from: a */
    static C2719c m13126a(char c, char c2, String str) {
        return new C2723d(str, c, c2);
    }

    /* renamed from: d */
    public boolean mo10411d(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo10401a(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C2719c m13128a(C2751l<? super Character> lVar) {
        C6329k.m29434a(lVar);
        if (lVar instanceof C2719c) {
            return (C2719c) lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.forPredicate(");
        sb.append(lVar);
        sb.append(")");
        return new C2724e(sb.toString(), lVar);
    }

    /* renamed from: b */
    public C2719c mo10406b(C2719c cVar) {
        return new C2740u(this, (C2719c) C6329k.m29434a(cVar));
    }

    /* renamed from: b */
    public C2719c mo10405b() {
        return C6328j.m29431a(this);
    }

    /* renamed from: b */
    public int mo10404b(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (mo10401a(charSequence.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    @C5944c
    /* renamed from: b */
    public String mo10407b(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int b = mo10404b((CharSequence) charSequence2);
        if (b == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[b] = c;
        while (true) {
            b++;
            if (b >= charArray.length) {
                return new String(charArray);
            }
            if (mo10401a(charArray[b])) {
                charArray[b] = c;
            }
        }
    }

    /* renamed from: a */
    public C2719c mo10395a() {
        return new C2739t(this);
    }

    /* renamed from: c */
    public int mo10408c(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (mo10401a(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C2719c mo10396a(C2719c cVar) {
        return new C2735p(this, (C2719c) C6329k.m29434a(cVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2719c mo10397a(String str) {
        throw new UnsupportedOperationException();
    }

    @C5944c
    /* renamed from: c */
    public String mo10410c(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo10401a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        int i3 = i2;
        while (i3 > i && mo10401a(charSequence.charAt(i3))) {
            i3--;
        }
        if (i == 0 && i3 == i2) {
            return mo10398a(charSequence, c);
        }
        int i4 = i3 + 1;
        return m13129a(charSequence, i, i4, c, new StringBuilder(i4 - i), false);
    }

    @C2717c("java.util.BitSet")
    /* renamed from: a */
    private static C2719c m13127a(int i, BitSet bitSet, String str) {
        if (i == 0) {
            return f9854p;
        }
        if (i == 1) {
            return m13131b((char) bitSet.nextSetBit(0));
        }
        if (i != 2) {
            return m13130a(i, bitSet.length()) ? C6331n.m29459a(bitSet, str) : new C2736q(bitSet, str, null);
        }
        char nextSetBit = (char) bitSet.nextSetBit(0);
        return m13132b(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
    }

    /* access modifiers changed from: 0000 */
    @C2717c("java.util.BitSet")
    /* renamed from: a */
    public void mo10400a(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (mo10401a((char) i)) {
                bitSet.set(i);
            }
        }
    }

    /* renamed from: a */
    public int mo10394a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C6329k.m29443b(i, length);
        while (i < length) {
            if (mo10401a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public int mo10393a(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo10401a(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    @C5944c
    /* renamed from: a */
    public String mo10399a(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return mo10414g(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return mo10407b(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int b = mo10404b((CharSequence) charSequence3);
        if (b == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(charSequence3, i, b);
            sb.append(charSequence2);
            i = b + 1;
            b = mo10394a((CharSequence) charSequence3, i);
        } while (b != -1);
        sb.append(charSequence3, i, length2);
        return sb.toString();
    }

    @C5944c
    /* renamed from: a */
    public String mo10398a(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (mo10401a(charAt)) {
                if (charAt != c || (i != length - 1 && mo10401a(charSequence.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence.subSequence(0, i));
                    sb.append(c);
                    return m13129a(charSequence, i + 1, length, c, sb, true);
                }
                i++;
            }
            i++;
        }
        return charSequence.toString();
    }

    /* renamed from: a */
    private String m13129a(CharSequence charSequence, int i, int i2, char c, StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!mo10401a(charAt)) {
                sb.append(charAt);
                z = false;
            } else if (!z) {
                sb.append(c);
                z = true;
            }
            i++;
        }
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public boolean apply(Character ch) {
        return mo10401a(ch.charValue());
    }
}
