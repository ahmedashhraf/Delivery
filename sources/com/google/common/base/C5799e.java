package com.google.common.base;

import java.util.Arrays;
import java.util.BitSet;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5944c;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.base.e */
/* compiled from: CharMatcher */
public abstract class C5799e implements C5831y<Character> {

    /* renamed from: N */
    public static final C5799e f16731N = m25407a(0, (char) C5785c.f16681N, "CharMatcher.ASCII");

    /* renamed from: O */
    private static final String f16732O = "0٠۰߀०০੦૦୦௦౦೦൦๐໐༠၀႐០᠐᥆᧐᭐᮰᱀᱐꘠꣐꤀꩐０";

    /* renamed from: P */
    private static final String f16733P;

    /* renamed from: Q */
    public static final C5799e f16734Q;

    /* renamed from: R */
    public static final C5799e f16735R = new C5807h("CharMatcher.JAVA_DIGIT");

    /* renamed from: S */
    public static final C5799e f16736S = new C5808i("CharMatcher.JAVA_LETTER");

    /* renamed from: T */
    public static final C5799e f16737T = new C5809j("CharMatcher.JAVA_LETTER_OR_DIGIT");

    /* renamed from: U */
    public static final C5799e f16738U = new C5810k("CharMatcher.JAVA_UPPER_CASE");

    /* renamed from: V */
    public static final C5799e f16739V = new C5811l("CharMatcher.JAVA_LOWER_CASE");

    /* renamed from: W */
    public static final C5799e f16740W = m25406a(0, 31).mo23098b(m25406a((char) C5785c.f16681N, 159)).mo23089a("CharMatcher.JAVA_ISO_CONTROL");

    /* renamed from: X */
    public static final C5799e f16741X = new C5821v("CharMatcher.INVISIBLE", "\u0000­؀؜۝܏ ᠎   ⁦⁧⁨⁩⁪　?﻿￹￺".toCharArray(), "  ­؄؜۝܏ ᠎‏ ⁤⁦⁧⁨⁩⁯　﻿￹￻".toCharArray());

    /* renamed from: Y */
    public static final C5799e f16742Y = new C5821v("CharMatcher.SINGLE_WIDTH", "\u0000־א׳؀ݐ฀Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ๿₯℺﷿﻿ￜ".toCharArray());

    /* renamed from: Z */
    public static final C5799e f16743Z = new C5812m("CharMatcher.ANY");

    /* renamed from: a0 */
    public static final C5799e f16744a0 = new C5813n("CharMatcher.NONE");

    /* renamed from: b */
    public static final C5799e f16745b = new C5806g();

    /* renamed from: b0 */
    private static final int f16746b0 = 65536;

    /* renamed from: c0 */
    static final String f16747c0 = " 　\r   　 \u000b　   　 \t     \f 　 　　 \n 　";

    /* renamed from: d0 */
    static final int f16748d0 = 1682554634;

    /* renamed from: e0 */
    static final int f16749e0 = Integer.numberOfLeadingZeros(31);

    /* renamed from: f0 */
    public static final C5799e f16750f0 = new C5805f("WHITESPACE");

    /* renamed from: a */
    final String f16751a;

    /* renamed from: com.google.common.base.e$a */
    /* compiled from: CharMatcher */
    static class C5800a extends C5817r {

        /* renamed from: g0 */
        final /* synthetic */ char f16752g0;

        C5800a(String str, char c) {
            this.f16752g0 = c;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return c != this.f16752g0;
        }

        /* renamed from: b */
        public C5799e mo23098b(C5799e eVar) {
            return eVar.mo23093a(this.f16752g0) ? C5799e.f16743Z : this;
        }

        /* renamed from: a */
        public C5799e mo23088a(C5799e eVar) {
            return eVar.mo23093a(this.f16752g0) ? C5799e.super.mo23088a(eVar) : eVar;
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            bitSet.set(0, this.f16752g0);
            bitSet.set(this.f16752g0 + 1, 65536);
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return C5799e.m25412b(this.f16752g0);
        }
    }

    /* renamed from: com.google.common.base.e$b */
    /* compiled from: CharMatcher */
    static class C5801b extends C5799e {

        /* renamed from: g0 */
        final /* synthetic */ char[] f16753g0;

        C5801b(String str, char[] cArr) {
            this.f16753g0 = cArr;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Arrays.binarySearch(this.f16753g0, c) >= 0;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            for (char c : this.f16753g0) {
                bitSet.set(c);
            }
        }
    }

    /* renamed from: com.google.common.base.e$c */
    /* compiled from: CharMatcher */
    static class C5802c extends C5817r {

        /* renamed from: g0 */
        final /* synthetic */ char f16754g0;

        /* renamed from: h0 */
        final /* synthetic */ char f16755h0;

        C5802c(String str, char c, char c2) {
            this.f16754g0 = c;
            this.f16755h0 = c2;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return c == this.f16754g0 || c == this.f16755h0;
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            bitSet.set(this.f16754g0);
            bitSet.set(this.f16755h0);
        }
    }

    /* renamed from: com.google.common.base.e$d */
    /* compiled from: CharMatcher */
    static class C5803d extends C5817r {

        /* renamed from: g0 */
        final /* synthetic */ char f16756g0;

        /* renamed from: h0 */
        final /* synthetic */ char f16757h0;

        C5803d(String str, char c, char c2) {
            this.f16756g0 = c;
            this.f16757h0 = c2;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return this.f16756g0 <= c && c <= this.f16757h0;
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            bitSet.set(this.f16756g0, this.f16757h0 + 1);
        }
    }

    /* renamed from: com.google.common.base.e$e */
    /* compiled from: CharMatcher */
    static class C5804e extends C5799e {

        /* renamed from: g0 */
        final /* synthetic */ C5831y f16758g0;

        C5804e(String str, C5831y yVar) {
            this.f16758g0 = yVar;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return this.f16758g0.apply(Character.valueOf(c));
        }

        /* renamed from: a */
        public boolean apply(Character ch) {
            return this.f16758g0.apply(C7397x.m35664a(ch));
        }
    }

    /* renamed from: com.google.common.base.e$f */
    /* compiled from: CharMatcher */
    static class C5805f extends C5817r {
        C5805f(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return C5799e.f16747c0.charAt((C5799e.f16748d0 * c) >>> C5799e.f16749e0) == c;
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set(C5799e.f16747c0.charAt(i));
            }
        }
    }

    /* renamed from: com.google.common.base.e$g */
    /* compiled from: CharMatcher */
    static class C5806g extends C5799e {
        C5806g() {
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
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
            return C5799e.super.apply((Character) obj);
        }

        public String toString() {
            return "CharMatcher.BREAKING_WHITESPACE";
        }
    }

    /* renamed from: com.google.common.base.e$h */
    /* compiled from: CharMatcher */
    static class C5807h extends C5799e {
        C5807h(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Character.isDigit(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.e$i */
    /* compiled from: CharMatcher */
    static class C5808i extends C5799e {
        C5808i(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Character.isLetter(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.e$j */
    /* compiled from: CharMatcher */
    static class C5809j extends C5799e {
        C5809j(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Character.isLetterOrDigit(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.e$k */
    /* compiled from: CharMatcher */
    static class C5810k extends C5799e {
        C5810k(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Character.isUpperCase(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.e$l */
    /* compiled from: CharMatcher */
    static class C5811l extends C5799e {
        C5811l(String str) {
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return Character.isLowerCase(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    /* renamed from: com.google.common.base.e$m */
    /* compiled from: CharMatcher */
    static class C5812m extends C5817r {
        C5812m(String str) {
            super(str);
        }

        /* renamed from: a */
        public int mo23086a(CharSequence charSequence, int i) {
            int length = charSequence.length();
            C7397x.m35673b(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return true;
        }

        /* renamed from: b */
        public int mo23096b(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        /* renamed from: c */
        public int mo23100c(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        /* renamed from: d */
        public boolean mo23103d(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return true;
        }

        /* renamed from: f */
        public boolean mo23105f(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: g */
        public String mo23106g(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return "";
        }

        /* renamed from: i */
        public String mo23108i(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return "";
        }

        /* renamed from: b */
        public String mo23099b(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        /* renamed from: a */
        public String mo23091a(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public C5799e mo23098b(C5799e eVar) {
            C7397x.m35664a(eVar);
            return this;
        }

        /* renamed from: a */
        public String mo23090a(CharSequence charSequence, char c) {
            return charSequence.length() == 0 ? "" : String.valueOf(c);
        }

        /* renamed from: a */
        public int mo23085a(CharSequence charSequence) {
            return charSequence.length();
        }

        /* renamed from: a */
        public C5799e mo23088a(C5799e eVar) {
            return (C5799e) C7397x.m35664a(eVar);
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return C5799e.f16744a0;
        }
    }

    /* renamed from: com.google.common.base.e$n */
    /* compiled from: CharMatcher */
    static class C5813n extends C5817r {
        C5813n(String str) {
            super(str);
        }

        /* renamed from: a */
        public int mo23086a(CharSequence charSequence, int i) {
            C7397x.m35673b(i, charSequence.length());
            return -1;
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return false;
        }

        /* renamed from: b */
        public int mo23096b(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return -1;
        }

        /* renamed from: c */
        public int mo23100c(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return -1;
        }

        /* renamed from: d */
        public boolean mo23103d(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        /* renamed from: f */
        public boolean mo23105f(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return true;
        }

        /* renamed from: g */
        public String mo23106g(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: i */
        public String mo23108i(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: j */
        public String mo23109j(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: k */
        public String mo23110k(CharSequence charSequence) {
            return charSequence.toString();
        }

        /* renamed from: b */
        public String mo23099b(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        /* renamed from: a */
        public String mo23091a(CharSequence charSequence, CharSequence charSequence2) {
            C7397x.m35664a(charSequence2);
            return charSequence.toString();
        }

        /* renamed from: b */
        public C5799e mo23098b(C5799e eVar) {
            return (C5799e) C7397x.m35664a(eVar);
        }

        /* renamed from: a */
        public String mo23090a(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        /* renamed from: a */
        public int mo23085a(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return 0;
        }

        /* renamed from: a */
        public C5799e mo23088a(C5799e eVar) {
            C7397x.m35664a(eVar);
            return this;
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return C5799e.f16743Z;
        }
    }

    /* renamed from: com.google.common.base.e$o */
    /* compiled from: CharMatcher */
    static class C5814o extends C5817r {

        /* renamed from: g0 */
        final /* synthetic */ char f16759g0;

        C5814o(String str, char c) {
            this.f16759g0 = c;
            super(str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return c == this.f16759g0;
        }

        /* renamed from: b */
        public String mo23099b(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f16759g0, c);
        }

        /* renamed from: a */
        public C5799e mo23088a(C5799e eVar) {
            return eVar.mo23093a(this.f16759g0) ? this : C5799e.f16744a0;
        }

        /* renamed from: b */
        public C5799e mo23098b(C5799e eVar) {
            return eVar.mo23093a(this.f16759g0) ? eVar : C5799e.super.mo23098b(eVar);
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return C5799e.m25414c(this.f16759g0);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            bitSet.set(this.f16759g0);
        }
    }

    /* renamed from: com.google.common.base.e$p */
    /* compiled from: CharMatcher */
    private static class C5815p extends C5799e {

        /* renamed from: g0 */
        final C5799e f16760g0;

        /* renamed from: h0 */
        final C5799e f16761h0;

        C5815p(C5799e eVar, C5799e eVar2) {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.and(");
            sb.append(eVar);
            sb.append(", ");
            sb.append(eVar2);
            sb.append(")");
            this(eVar, eVar2, sb.toString());
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return this.f16760g0.mo23093a(c) && this.f16761h0.mo23093a(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }

        C5815p(C5799e eVar, C5799e eVar2, String str) {
            super(str);
            this.f16760g0 = (C5799e) C7397x.m35664a(eVar);
            this.f16761h0 = (C5799e) C7397x.m35664a(eVar2);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f16760g0.mo23092a(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f16761h0.mo23092a(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C5799e mo23089a(String str) {
            return new C5815p(this.f16760g0, this.f16761h0, str);
        }
    }

    @C2777c("java.util.BitSet")
    /* renamed from: com.google.common.base.e$q */
    /* compiled from: CharMatcher */
    private static class C5816q extends C5817r {

        /* renamed from: g0 */
        private final BitSet f16762g0;

        /* synthetic */ C5816q(BitSet bitSet, String str, C5806g gVar) {
            this(bitSet, str);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return this.f16762g0.get(c);
        }

        private C5816q(BitSet bitSet, String str) {
            super(str);
            if (bitSet.length() + 64 < bitSet.size()) {
                bitSet = (BitSet) bitSet.clone();
            }
            this.f16762g0 = bitSet;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            bitSet.or(this.f16762g0);
        }
    }

    /* renamed from: com.google.common.base.e$r */
    /* compiled from: CharMatcher */
    static abstract class C5817r extends C5799e {
        C5817r() {
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return new C5818s(this);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }

        /* renamed from: b */
        public final C5799e mo23097b() {
            return this;
        }

        C5817r(String str) {
            super(str);
        }
    }

    /* renamed from: com.google.common.base.e$s */
    /* compiled from: CharMatcher */
    static final class C5818s extends C5819t {
        C5818s(C5799e eVar) {
            super(eVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C5799e mo23089a(String str) {
            return new C5818s(str, this.f16763g0);
        }

        /* renamed from: b */
        public final C5799e mo23097b() {
            return this;
        }

        C5818s(String str, C5799e eVar) {
            super(str, eVar);
        }
    }

    /* renamed from: com.google.common.base.e$t */
    /* compiled from: CharMatcher */
    private static class C5819t extends C5799e {

        /* renamed from: g0 */
        final C5799e f16763g0;

        C5819t(String str, C5799e eVar) {
            super(str);
            this.f16763g0 = eVar;
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return !this.f16763g0.mo23093a(c);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }

        /* renamed from: d */
        public boolean mo23103d(CharSequence charSequence) {
            return this.f16763g0.mo23105f(charSequence);
        }

        /* renamed from: f */
        public boolean mo23105f(CharSequence charSequence) {
            return this.f16763g0.mo23103d(charSequence);
        }

        /* renamed from: a */
        public int mo23085a(CharSequence charSequence) {
            return charSequence.length() - this.f16763g0.mo23085a(charSequence);
        }

        C5819t(C5799e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append(eVar);
            sb.append(".negate()");
            this(sb.toString(), eVar);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f16763g0.mo23092a(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        /* renamed from: a */
        public C5799e mo23087a() {
            return this.f16763g0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C5799e mo23089a(String str) {
            return new C5819t(str, this.f16763g0);
        }
    }

    /* renamed from: com.google.common.base.e$u */
    /* compiled from: CharMatcher */
    private static class C5820u extends C5799e {

        /* renamed from: g0 */
        final C5799e f16764g0;

        /* renamed from: h0 */
        final C5799e f16765h0;

        C5820u(C5799e eVar, C5799e eVar2, String str) {
            super(str);
            this.f16764g0 = (C5799e) C7397x.m35664a(eVar);
            this.f16765h0 = (C5799e) C7397x.m35664a(eVar2);
        }

        /* access modifiers changed from: 0000 */
        @C2777c("java.util.BitSet")
        /* renamed from: a */
        public void mo23092a(BitSet bitSet) {
            this.f16764g0.mo23092a(bitSet);
            this.f16765h0.mo23092a(bitSet);
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            return this.f16764g0.mo23093a(c) || this.f16765h0.mo23093a(c);
        }

        C5820u(C5799e eVar, C5799e eVar2) {
            StringBuilder sb = new StringBuilder();
            sb.append("CharMatcher.or(");
            sb.append(eVar);
            sb.append(", ");
            sb.append(eVar2);
            sb.append(")");
            this(eVar, eVar2, sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C5799e mo23089a(String str) {
            return new C5820u(this.f16764g0, this.f16765h0, str);
        }
    }

    /* renamed from: com.google.common.base.e$v */
    /* compiled from: CharMatcher */
    private static class C5821v extends C5799e {

        /* renamed from: g0 */
        private final char[] f16766g0;

        /* renamed from: h0 */
        private final char[] f16767h0;

        C5821v(String str, char[] cArr, char[] cArr2) {
            super(str);
            this.f16766g0 = cArr;
            this.f16767h0 = cArr2;
            C7397x.m35670a(cArr.length == cArr2.length);
            int i = 0;
            while (i < cArr.length) {
                C7397x.m35670a(cArr[i] <= cArr2[i]);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    C7397x.m35670a(cArr2[i] < cArr[i2]);
                }
                i = i2;
            }
        }

        /* renamed from: a */
        public boolean mo23093a(char c) {
            int binarySearch = Arrays.binarySearch(this.f16766g0, c);
            boolean z = true;
            if (binarySearch >= 0) {
                return true;
            }
            int i = (binarySearch ^ -1) - 1;
            if (i < 0 || c > this.f16767h0[i]) {
                z = false;
            }
            return z;
        }

        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return C5799e.super.apply((Character) obj);
        }
    }

    static {
        StringBuilder sb = new StringBuilder(31);
        int i = 0;
        while (true) {
            String str = f16732O;
            if (i < 31) {
                sb.append((char) (str.charAt(i) + 9));
                i++;
            } else {
                f16733P = sb.toString();
                f16734Q = new C5821v("CharMatcher.DIGIT", str.toCharArray(), f16733P.toCharArray());
                return;
            }
        }
    }

    C5799e(String str) {
        this.f16751a = str;
    }

    /* renamed from: a */
    public static C5799e m25406a(char c, char c2) {
        C7397x.m35670a(c2 >= c);
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.inRange('");
        sb.append(mo23260d(c));
        sb.append("', '");
        sb.append(mo23260d(c2));
        sb.append("')");
        return m25407a(c, c2, sb.toString());
    }

    @C2777c("SmallCharMatcher")
    /* renamed from: a */
    private static boolean m25411a(int i, int i2) {
        return i <= 1023 && i2 > (i * 4) * 16;
    }

    /* renamed from: b */
    public static C5799e m25412b(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        sb.append(mo23260d(c));
        sb.append("')");
        return new C5814o(sb.toString(), c);
    }

    /* renamed from: c */
    public static C5799e m25414c(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.isNot('");
        sb.append(mo23260d(c));
        sb.append("')");
        return new C5800a(sb.toString(), c);
    }

    /* renamed from: d */
    private static String mo23260d(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* renamed from: l */
    public static C5799e m25416l(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return f16744a0;
        }
        if (length == 1) {
            return m25412b(charSequence.charAt(0));
        }
        if (length == 2) {
            return m25413b(charSequence.charAt(0), charSequence.charAt(1));
        }
        char[] charArray = charSequence.toString().toCharArray();
        Arrays.sort(charArray);
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char d : charArray) {
            sb.append(mo23260d(d));
        }
        sb.append("\")");
        return new C5801b(sb.toString(), charArray);
    }

    /* renamed from: m */
    public static C5799e m25417m(CharSequence charSequence) {
        return m25416l(charSequence).mo23087a();
    }

    /* renamed from: a */
    public abstract boolean mo23093a(char c);

    /* renamed from: e */
    public boolean mo23104e(CharSequence charSequence) {
        return !mo23105f(charSequence);
    }

    /* renamed from: f */
    public boolean mo23105f(CharSequence charSequence) {
        return mo23096b(charSequence) == -1;
    }

    @C5944c
    /* renamed from: g */
    public String mo23106g(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int b = mo23096b((CharSequence) charSequence2);
        if (b == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            b++;
            while (b != charArray.length) {
                if (mo23093a(charArray[b])) {
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
    public String mo23107h(CharSequence charSequence) {
        return mo23087a().mo23106g(charSequence);
    }

    @C5944c
    /* renamed from: i */
    public String mo23108i(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo23093a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && mo23093a(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    @C5944c
    /* renamed from: j */
    public String mo23109j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!mo23093a(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    @C5944c
    /* renamed from: k */
    public String mo23110k(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo23093a(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    public String toString() {
        return this.f16751a;
    }

    protected C5799e() {
        this.f16751a = super.toString();
    }

    /* renamed from: b */
    private static C5799e m25413b(char c, char c2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.anyOf(\"");
        sb.append(mo23260d(c));
        sb.append(mo23260d(c2));
        sb.append("\")");
        return new C5802c(sb.toString(), c, c2);
    }

    /* access modifiers changed from: 0000 */
    @C2777c("java.util.BitSet")
    /* renamed from: c */
    public C5799e mo23101c() {
        String str;
        BitSet bitSet = new BitSet();
        mo23092a(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return m25408a(cardinality, bitSet, this.f16751a);
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String str2 = ".negate()";
        if (this.f16751a.endsWith(str2)) {
            String str3 = this.f16751a;
            str = str3.substring(0, str3.length() - 9);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f16751a);
            sb.append(str2);
            str = sb.toString();
        }
        return new C5818s(toString(), m25408a(i, bitSet, str));
    }

    /* renamed from: a */
    static C5799e m25407a(char c, char c2, String str) {
        return new C5803d(str, c, c2);
    }

    /* renamed from: d */
    public boolean mo23103d(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!mo23093a(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static C5799e m25409a(C5831y<? super Character> yVar) {
        C7397x.m35664a(yVar);
        if (yVar instanceof C5799e) {
            return (C5799e) yVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.forPredicate(");
        sb.append(yVar);
        sb.append(")");
        return new C5804e(sb.toString(), yVar);
    }

    /* renamed from: b */
    public C5799e mo23098b(C5799e eVar) {
        return new C5820u(this, (C5799e) C7397x.m35664a(eVar));
    }

    /* renamed from: b */
    public C5799e mo23097b() {
        return C7396w.m35661a(this);
    }

    /* renamed from: b */
    public int mo23096b(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (mo23093a(charSequence.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

    @C5944c
    /* renamed from: b */
    public String mo23099b(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int b = mo23096b((CharSequence) charSequence2);
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
            if (mo23093a(charArray[b])) {
                charArray[b] = c;
            }
        }
    }

    /* renamed from: a */
    public C5799e mo23087a() {
        return new C5819t(this);
    }

    /* renamed from: c */
    public int mo23100c(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (mo23093a(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C5799e mo23088a(C5799e eVar) {
        return new C5815p(this, (C5799e) C7397x.m35664a(eVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C5799e mo23089a(String str) {
        throw new UnsupportedOperationException();
    }

    @C5944c
    /* renamed from: c */
    public String mo23102c(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && mo23093a(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        int i3 = i2;
        while (i3 > i && mo23093a(charSequence.charAt(i3))) {
            i3--;
        }
        if (i == 0 && i3 == i2) {
            return mo23090a(charSequence, c);
        }
        int i4 = i3 + 1;
        return m25410a(charSequence, i, i4, c, new StringBuilder(i4 - i), false);
    }

    @C2777c("java.util.BitSet")
    /* renamed from: a */
    private static C5799e m25408a(int i, BitSet bitSet, String str) {
        if (i == 0) {
            return f16744a0;
        }
        if (i == 1) {
            return m25412b((char) bitSet.nextSetBit(0));
        }
        if (i != 2) {
            return m25411a(i, bitSet.length()) ? C7324b0.m35489a(bitSet, str) : new C5816q(bitSet, str, null);
        }
        char nextSetBit = (char) bitSet.nextSetBit(0);
        return m25413b(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
    }

    /* access modifiers changed from: 0000 */
    @C2777c("java.util.BitSet")
    /* renamed from: a */
    public void mo23092a(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (mo23093a((char) i)) {
                bitSet.set(i);
            }
        }
    }

    /* renamed from: a */
    public int mo23086a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        C7397x.m35673b(i, length);
        while (i < length) {
            if (mo23093a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public int mo23085a(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (mo23093a(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    @C5944c
    /* renamed from: a */
    public String mo23091a(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return mo23106g(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return mo23099b(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int b = mo23096b((CharSequence) charSequence3);
        if (b == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append(charSequence3, i, b);
            sb.append(charSequence2);
            i = b + 1;
            b = mo23086a((CharSequence) charSequence3, i);
        } while (b != -1);
        sb.append(charSequence3, i, length2);
        return sb.toString();
    }

    @C5944c
    /* renamed from: a */
    public String mo23090a(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (mo23093a(charAt)) {
                if (charAt != c || (i != length - 1 && mo23093a(charSequence.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence.subSequence(0, i));
                    sb.append(c);
                    return m25410a(charSequence, i + 1, length, c, sb, true);
                }
                i++;
            }
            i++;
        }
        return charSequence.toString();
    }

    /* renamed from: a */
    private String m25410a(CharSequence charSequence, int i, int i2, char c, StringBuilder sb, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (!mo23093a(charAt)) {
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
        return mo23093a(ch.charValue());
    }
}
