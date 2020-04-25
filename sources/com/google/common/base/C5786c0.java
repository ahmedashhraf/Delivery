package com.google.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5944c;

@C2776b(emulated = true)
/* renamed from: com.google.common.base.c0 */
/* compiled from: Splitter */
public final class C5786c0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5799e f16708a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f16709b;

    /* renamed from: c */
    private final C5798h f16710c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f16711d;

    /* renamed from: com.google.common.base.c0$a */
    /* compiled from: Splitter */
    static class C5787a implements C5798h {

        /* renamed from: a */
        final /* synthetic */ C5799e f16712a;

        /* renamed from: com.google.common.base.c0$a$a */
        /* compiled from: Splitter */
        class C5788a extends C5797g {
            C5788a(C5786c0 c0Var, CharSequence charSequence) {
                super(c0Var, charSequence);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo23079a(int i) {
                return i + 1;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public int mo23080b(int i) {
                return C5787a.this.f16712a.mo23086a(this.f16726N, i);
            }
        }

        C5787a(C5799e eVar) {
            this.f16712a = eVar;
        }

        /* renamed from: a */
        public C5797g m25385a(C5786c0 c0Var, CharSequence charSequence) {
            return new C5788a(c0Var, charSequence);
        }
    }

    /* renamed from: com.google.common.base.c0$b */
    /* compiled from: Splitter */
    static class C5789b implements C5798h {

        /* renamed from: a */
        final /* synthetic */ String f16714a;

        /* renamed from: com.google.common.base.c0$b$a */
        /* compiled from: Splitter */
        class C5790a extends C5797g {
            C5790a(C5786c0 c0Var, CharSequence charSequence) {
                super(c0Var, charSequence);
            }

            /* renamed from: a */
            public int mo23079a(int i) {
                return i + C5789b.this.f16714a.length();
            }

            /* renamed from: b */
            public int mo23080b(int i) {
                int length = C5789b.this.f16714a.length();
                int length2 = this.f16726N.length() - length;
                while (i <= length2) {
                    int i2 = 0;
                    while (i2 < length) {
                        if (this.f16726N.charAt(i2 + i) != C5789b.this.f16714a.charAt(i2)) {
                            i++;
                        } else {
                            i2++;
                        }
                    }
                    return i;
                }
                return -1;
            }
        }

        C5789b(String str) {
            this.f16714a = str;
        }

        /* renamed from: a */
        public C5797g m25389a(C5786c0 c0Var, CharSequence charSequence) {
            return new C5790a(c0Var, charSequence);
        }
    }

    /* renamed from: com.google.common.base.c0$c */
    /* compiled from: Splitter */
    static class C5791c implements C5798h {

        /* renamed from: a */
        final /* synthetic */ Pattern f16716a;

        /* renamed from: com.google.common.base.c0$c$a */
        /* compiled from: Splitter */
        class C5792a extends C5797g {

            /* renamed from: S */
            final /* synthetic */ Matcher f16717S;

            C5792a(C5786c0 c0Var, CharSequence charSequence, Matcher matcher) {
                this.f16717S = matcher;
                super(c0Var, charSequence);
            }

            /* renamed from: a */
            public int mo23079a(int i) {
                return this.f16717S.end();
            }

            /* renamed from: b */
            public int mo23080b(int i) {
                if (this.f16717S.find(i)) {
                    return this.f16717S.start();
                }
                return -1;
            }
        }

        C5791c(Pattern pattern) {
            this.f16716a = pattern;
        }

        /* renamed from: a */
        public C5797g m25393a(C5786c0 c0Var, CharSequence charSequence) {
            return new C5792a(c0Var, charSequence, this.f16716a.matcher(charSequence));
        }
    }

    /* renamed from: com.google.common.base.c0$d */
    /* compiled from: Splitter */
    static class C5793d implements C5798h {

        /* renamed from: a */
        final /* synthetic */ int f16719a;

        /* renamed from: com.google.common.base.c0$d$a */
        /* compiled from: Splitter */
        class C5794a extends C5797g {
            C5794a(C5786c0 c0Var, CharSequence charSequence) {
                super(c0Var, charSequence);
            }

            /* renamed from: a */
            public int mo23079a(int i) {
                return i;
            }

            /* renamed from: b */
            public int mo23080b(int i) {
                int i2 = i + C5793d.this.f16719a;
                if (i2 < this.f16726N.length()) {
                    return i2;
                }
                return -1;
            }
        }

        C5793d(int i) {
            this.f16719a = i;
        }

        /* renamed from: a */
        public C5797g m25397a(C5786c0 c0Var, CharSequence charSequence) {
            return new C5794a(c0Var, charSequence);
        }
    }

    /* renamed from: com.google.common.base.c0$e */
    /* compiled from: Splitter */
    class C5795e implements Iterable<String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f16721a;

        C5795e(CharSequence charSequence) {
            this.f16721a = charSequence;
        }

        public Iterator<String> iterator() {
            return C5786c0.this.m25372c(this.f16721a);
        }

        public String toString() {
            C5822s c = C5822s.m25525c(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder a = c.mo23123a(sb, (Iterable<?>) this);
            a.append(']');
            return a.toString();
        }
    }

    @C2775a
    /* renamed from: com.google.common.base.c0$f */
    /* compiled from: Splitter */
    public static final class C5796f {

        /* renamed from: c */
        private static final String f16723c = "Chunk [%s] is not a valid entry";

        /* renamed from: a */
        private final C5786c0 f16724a;

        /* renamed from: b */
        private final C5786c0 f16725b;

        /* synthetic */ C5796f(C5786c0 c0Var, C5786c0 c0Var2, C5787a aVar) {
            this(c0Var, c0Var2);
        }

        /* renamed from: a */
        public Map<String, String> mo23083a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f16724a.mo23075a(charSequence)) {
                Iterator a = this.f16725b.m25372c((CharSequence) str);
                boolean hasNext = a.hasNext();
                Object[] objArr = {str};
                String str2 = f16723c;
                C7397x.m35672a(hasNext, str2, objArr);
                String str3 = (String) a.next();
                C7397x.m35672a(!linkedHashMap.containsKey(str3), "Duplicate key [%s] found.", str3);
                C7397x.m35672a(a.hasNext(), str2, str);
                linkedHashMap.put(str3, (String) a.next());
                C7397x.m35672a(!a.hasNext(), str2, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private C5796f(C5786c0 c0Var, C5786c0 c0Var2) {
            this.f16724a = c0Var;
            this.f16725b = (C5786c0) C7397x.m35664a(c0Var2);
        }
    }

    /* renamed from: com.google.common.base.c0$g */
    /* compiled from: Splitter */
    private static abstract class C5797g extends C7321b<String> {

        /* renamed from: N */
        final CharSequence f16726N;

        /* renamed from: O */
        final C5799e f16727O;

        /* renamed from: P */
        final boolean f16728P;

        /* renamed from: Q */
        int f16729Q = 0;

        /* renamed from: R */
        int f16730R;

        protected C5797g(C5786c0 c0Var, CharSequence charSequence) {
            this.f16727O = c0Var.f16708a;
            this.f16728P = c0Var.f16709b;
            this.f16730R = c0Var.f16711d;
            this.f16726N = charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo23079a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract int mo23080b(int i);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String m25404b() {
            int i;
            int i2 = this.f16729Q;
            while (true) {
                int i3 = this.f16729Q;
                if (i3 == -1) {
                    return (String) mo29191c();
                }
                int b = mo23080b(i3);
                if (b == -1) {
                    b = this.f16726N.length();
                    this.f16729Q = -1;
                } else {
                    this.f16729Q = mo23079a(b);
                }
                int i4 = this.f16729Q;
                if (i4 == i2) {
                    this.f16729Q = i4 + 1;
                    if (this.f16729Q >= this.f16726N.length()) {
                        this.f16729Q = -1;
                    }
                } else {
                    while (i2 < b && this.f16727O.mo23093a(this.f16726N.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f16727O.mo23093a(this.f16726N.charAt(i - 1))) {
                        b = i - 1;
                    }
                    if (!this.f16728P || i2 != i) {
                        int i5 = this.f16730R;
                    } else {
                        i2 = this.f16729Q;
                    }
                }
            }
            int i52 = this.f16730R;
            if (i52 == 1) {
                i = this.f16726N.length();
                this.f16729Q = -1;
                while (i > i2 && this.f16727O.mo23093a(this.f16726N.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f16730R = i52 - 1;
            }
            return this.f16726N.subSequence(i2, i).toString();
        }
    }

    /* renamed from: com.google.common.base.c0$h */
    /* compiled from: Splitter */
    private interface C5798h {
        /* renamed from: a */
        Iterator<String> mo23078a(C5786c0 c0Var, CharSequence charSequence);
    }

    private C5786c0(C5798h hVar) {
        this(hVar, false, C5799e.f16744a0, Integer.MAX_VALUE);
    }

    private C5786c0(C5798h hVar, boolean z, C5799e eVar, int i) {
        this.f16710c = hVar;
        this.f16709b = z;
        this.f16708a = eVar;
        this.f16711d = i;
    }

    @C2777c("java.util.regex")
    /* renamed from: a */
    public static C5786c0 m25364a(Pattern pattern) {
        C7397x.m35664a(pattern);
        C7397x.m35672a(!pattern.matcher("").matches(), "The pattern may not match the empty string: %s", pattern);
        return new C5786c0(new C5791c(pattern));
    }

    /* renamed from: b */
    public static C5786c0 m25366b(char c) {
        return m25368b(C5799e.m25412b(c));
    }

    @C2777c("java.util.regex")
    /* renamed from: c */
    public static C5786c0 m25371c(String str) {
        return m25364a(Pattern.compile(str));
    }

    /* renamed from: b */
    public static C5786c0 m25368b(C5799e eVar) {
        C7397x.m35664a(eVar);
        return new C5786c0(new C5787a(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Iterator<String> m25372c(CharSequence charSequence) {
        return this.f16710c.mo23078a(this, charSequence);
    }

    /* renamed from: b */
    public static C5786c0 m25369b(String str) {
        C7397x.m35671a(str.length() != 0, (Object) "The separator may not be the empty string.");
        return new C5786c0(new C5789b(str));
    }

    @C5944c
    /* renamed from: a */
    public C5786c0 mo23072a() {
        return new C5786c0(this.f16710c, true, this.f16708a, this.f16711d);
    }

    @C5944c
    /* renamed from: a */
    public C5786c0 mo23073a(int i) {
        C7397x.m35672a(i > 0, "must be greater than zero: %s", Integer.valueOf(i));
        return new C5786c0(this.f16710c, this.f16709b, this.f16708a, i);
    }

    /* renamed from: b */
    public static C5786c0 m25367b(int i) {
        C7397x.m35671a(i > 0, (Object) "The length may not be less than 1");
        return new C5786c0(new C5793d(i));
    }

    @C5944c
    /* renamed from: a */
    public C5786c0 mo23074a(C5799e eVar) {
        C7397x.m35664a(eVar);
        return new C5786c0(this.f16710c, this.f16709b, eVar, this.f16711d);
    }

    @C5944c
    /* renamed from: b */
    public C5786c0 mo23076b() {
        return mo23074a(C5799e.f16750f0);
    }

    /* renamed from: a */
    public Iterable<String> mo23075a(CharSequence charSequence) {
        C7397x.m35664a(charSequence);
        return new C5795e(charSequence);
    }

    @C2775a
    /* renamed from: b */
    public List<String> mo23077b(CharSequence charSequence) {
        C7397x.m35664a(charSequence);
        Iterator c = m25372c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (c.hasNext()) {
            arrayList.add(c.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @C5944c
    @C2775a
    /* renamed from: a */
    public C5796f mo23071a(String str) {
        return mo23070a(m25369b(str));
    }

    @C5944c
    @C2775a
    /* renamed from: a */
    public C5796f mo23069a(char c) {
        return mo23070a(m25366b(c));
    }

    @C5944c
    @C2775a
    /* renamed from: a */
    public C5796f mo23070a(C5786c0 c0Var) {
        return new C5796f(this, c0Var, null);
    }
}
