package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2717c;
import p201f.p202a.C5944c;

@C2716b(emulated = true)
/* renamed from: c.d.b.a.e.a.a.a.b.o */
/* compiled from: Splitter */
public final class C2752o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2719c f9893a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f9894b;

    /* renamed from: c */
    private final C2764h f9895c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f9896d;

    /* renamed from: c.d.b.a.e.a.a.a.b.o$a */
    /* compiled from: Splitter */
    static class C2753a implements C2764h {

        /* renamed from: a */
        final /* synthetic */ C2719c f9897a;

        /* renamed from: c.d.b.a.e.a.a.a.b.o$a$a */
        /* compiled from: Splitter */
        class C2754a extends C2763g {
            C2754a(C2752o oVar, CharSequence charSequence) {
                super(oVar, charSequence);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo10475a(int i) {
                return i + 1;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public int mo10476b(int i) {
                return C2753a.this.f9897a.mo10394a(this.f9911N, i);
            }
        }

        C2753a(C2719c cVar) {
            this.f9897a = cVar;
        }

        /* renamed from: a */
        public C2763g m13323a(C2752o oVar, CharSequence charSequence) {
            return new C2754a(oVar, charSequence);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$b */
    /* compiled from: Splitter */
    static class C2755b implements C2764h {

        /* renamed from: a */
        final /* synthetic */ String f9899a;

        /* renamed from: c.d.b.a.e.a.a.a.b.o$b$a */
        /* compiled from: Splitter */
        class C2756a extends C2763g {
            C2756a(C2752o oVar, CharSequence charSequence) {
                super(oVar, charSequence);
            }

            /* renamed from: a */
            public int mo10475a(int i) {
                return i + C2755b.this.f9899a.length();
            }

            /* renamed from: b */
            public int mo10476b(int i) {
                int length = C2755b.this.f9899a.length();
                int length2 = this.f9911N.length() - length;
                while (i <= length2) {
                    int i2 = 0;
                    while (i2 < length) {
                        if (this.f9911N.charAt(i2 + i) != C2755b.this.f9899a.charAt(i2)) {
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

        C2755b(String str) {
            this.f9899a = str;
        }

        /* renamed from: a */
        public C2763g m13327a(C2752o oVar, CharSequence charSequence) {
            return new C2756a(oVar, charSequence);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$c */
    /* compiled from: Splitter */
    static class C2757c implements C2764h {

        /* renamed from: a */
        final /* synthetic */ Pattern f9901a;

        /* renamed from: c.d.b.a.e.a.a.a.b.o$c$a */
        /* compiled from: Splitter */
        class C2758a extends C2763g {

            /* renamed from: S */
            final /* synthetic */ Matcher f9902S;

            C2758a(C2752o oVar, CharSequence charSequence, Matcher matcher) {
                this.f9902S = matcher;
                super(oVar, charSequence);
            }

            /* renamed from: a */
            public int mo10475a(int i) {
                return this.f9902S.end();
            }

            /* renamed from: b */
            public int mo10476b(int i) {
                if (this.f9902S.find(i)) {
                    return this.f9902S.start();
                }
                return -1;
            }
        }

        C2757c(Pattern pattern) {
            this.f9901a = pattern;
        }

        /* renamed from: a */
        public C2763g m13331a(C2752o oVar, CharSequence charSequence) {
            return new C2758a(oVar, charSequence, this.f9901a.matcher(charSequence));
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$d */
    /* compiled from: Splitter */
    static class C2759d implements C2764h {

        /* renamed from: a */
        final /* synthetic */ int f9904a;

        /* renamed from: c.d.b.a.e.a.a.a.b.o$d$a */
        /* compiled from: Splitter */
        class C2760a extends C2763g {
            C2760a(C2752o oVar, CharSequence charSequence) {
                super(oVar, charSequence);
            }

            /* renamed from: a */
            public int mo10475a(int i) {
                return i;
            }

            /* renamed from: b */
            public int mo10476b(int i) {
                int i2 = i + C2759d.this.f9904a;
                if (i2 < this.f9911N.length()) {
                    return i2;
                }
                return -1;
            }
        }

        C2759d(int i) {
            this.f9904a = i;
        }

        /* renamed from: a */
        public C2763g m13335a(C2752o oVar, CharSequence charSequence) {
            return new C2760a(oVar, charSequence);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$e */
    /* compiled from: Splitter */
    class C2761e implements Iterable<String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f9906a;

        C2761e(CharSequence charSequence) {
            this.f9906a = charSequence;
        }

        public Iterator<String> iterator() {
            return C2752o.this.m13310c(this.f9906a);
        }

        public String toString() {
            C2742g c = C2742g.m13244c(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder a = c.mo10431a(sb, (Iterable<?>) this);
            a.append(']');
            return a.toString();
        }
    }

    @C2715a
    /* renamed from: c.d.b.a.e.a.a.a.b.o$f */
    /* compiled from: Splitter */
    public static final class C2762f {

        /* renamed from: c */
        private static final String f9908c = "Chunk [%s] is not a valid entry";

        /* renamed from: a */
        private final C2752o f9909a;

        /* renamed from: b */
        private final C2752o f9910b;

        /* synthetic */ C2762f(C2752o oVar, C2752o oVar2, C2753a aVar) {
            this(oVar, oVar2);
        }

        /* renamed from: a */
        public Map<String, String> mo10479a(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f9909a.mo10471a(charSequence)) {
                Iterator a = this.f9910b.m13310c((CharSequence) str);
                boolean hasNext = a.hasNext();
                Object[] objArr = {str};
                String str2 = f9908c;
                C6329k.m29442a(hasNext, str2, objArr);
                String str3 = (String) a.next();
                C6329k.m29442a(!linkedHashMap.containsKey(str3), "Duplicate key [%s] found.", str3);
                C6329k.m29442a(a.hasNext(), str2, str);
                linkedHashMap.put(str3, (String) a.next());
                C6329k.m29442a(!a.hasNext(), str2, str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private C2762f(C2752o oVar, C2752o oVar2) {
            this.f9909a = oVar;
            this.f9910b = (C2752o) C6329k.m29434a(oVar2);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$g */
    /* compiled from: Splitter */
    private static abstract class C2763g extends C6310b<String> {

        /* renamed from: N */
        final CharSequence f9911N;

        /* renamed from: O */
        final C2719c f9912O;

        /* renamed from: P */
        final boolean f9913P;

        /* renamed from: Q */
        int f9914Q = 0;

        /* renamed from: R */
        int f9915R;

        protected C2763g(C2752o oVar, CharSequence charSequence) {
            this.f9912O = oVar.f9893a;
            this.f9913P = oVar.f9894b;
            this.f9915R = oVar.f9896d;
            this.f9911N = charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo10475a(int i);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract int mo10476b(int i);

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String m13342b() {
            int i;
            int i2 = this.f9914Q;
            while (true) {
                int i3 = this.f9914Q;
                if (i3 == -1) {
                    return (String) mo25594c();
                }
                int b = mo10476b(i3);
                if (b == -1) {
                    b = this.f9911N.length();
                    this.f9914Q = -1;
                } else {
                    this.f9914Q = mo10475a(b);
                }
                int i4 = this.f9914Q;
                if (i4 == i2) {
                    this.f9914Q = i4 + 1;
                    if (this.f9914Q >= this.f9911N.length()) {
                        this.f9914Q = -1;
                    }
                } else {
                    while (i2 < b && this.f9912O.mo10401a(this.f9911N.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f9912O.mo10401a(this.f9911N.charAt(i - 1))) {
                        b = i - 1;
                    }
                    if (!this.f9913P || i2 != i) {
                        int i5 = this.f9915R;
                    } else {
                        i2 = this.f9914Q;
                    }
                }
            }
            int i52 = this.f9915R;
            if (i52 == 1) {
                i = this.f9911N.length();
                this.f9914Q = -1;
                while (i > i2 && this.f9912O.mo10401a(this.f9911N.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f9915R = i52 - 1;
            }
            return this.f9911N.subSequence(i2, i).toString();
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.o$h */
    /* compiled from: Splitter */
    private interface C2764h {
        /* renamed from: a */
        Iterator<String> mo10474a(C2752o oVar, CharSequence charSequence);
    }

    private C2752o(C2764h hVar) {
        this(hVar, false, C2719c.f9854p, Integer.MAX_VALUE);
    }

    private C2752o(C2764h hVar, boolean z, C2719c cVar, int i) {
        this.f9895c = hVar;
        this.f9894b = z;
        this.f9893a = cVar;
        this.f9896d = i;
    }

    @C2717c("java.util.regex")
    /* renamed from: a */
    public static C2752o m13302a(Pattern pattern) {
        C6329k.m29434a(pattern);
        C6329k.m29442a(!pattern.matcher("").matches(), "The pattern may not match the empty string: %s", pattern);
        return new C2752o(new C2757c(pattern));
    }

    /* renamed from: b */
    public static C2752o m13305b(char c) {
        return m13307b(C2719c.m13131b(c));
    }

    @C2717c("java.util.regex")
    /* renamed from: c */
    public static C2752o m13309c(String str) {
        return m13302a(Pattern.compile(str));
    }

    /* renamed from: b */
    public static C2752o m13307b(C2719c cVar) {
        C6329k.m29434a(cVar);
        return new C2752o(new C2753a(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Iterator<String> m13310c(CharSequence charSequence) {
        return this.f9895c.mo10474a(this, charSequence);
    }

    /* renamed from: b */
    public static C2752o m13308b(String str) {
        C6329k.m29441a(str.length() != 0, (Object) "The separator may not be the empty string.");
        return new C2752o(new C2755b(str));
    }

    @C5944c
    /* renamed from: a */
    public C2752o mo10468a() {
        return new C2752o(this.f9895c, true, this.f9893a, this.f9896d);
    }

    @C5944c
    /* renamed from: a */
    public C2752o mo10469a(int i) {
        C6329k.m29442a(i > 0, "must be greater than zero: %s", Integer.valueOf(i));
        return new C2752o(this.f9895c, this.f9894b, this.f9893a, i);
    }

    /* renamed from: b */
    public static C2752o m13306b(int i) {
        C6329k.m29441a(i > 0, (Object) "The length may not be less than 1");
        return new C2752o(new C2759d(i));
    }

    @C5944c
    /* renamed from: a */
    public C2752o mo10470a(C2719c cVar) {
        C6329k.m29434a(cVar);
        return new C2752o(this.f9895c, this.f9894b, cVar, this.f9896d);
    }

    @C5944c
    /* renamed from: b */
    public C2752o mo10472b() {
        return mo10470a(C2719c.f9859u);
    }

    /* renamed from: a */
    public Iterable<String> mo10471a(CharSequence charSequence) {
        C6329k.m29434a(charSequence);
        return new C2761e(charSequence);
    }

    @C2715a
    /* renamed from: b */
    public List<String> mo10473b(CharSequence charSequence) {
        C6329k.m29434a(charSequence);
        Iterator c = m13310c(charSequence);
        ArrayList arrayList = new ArrayList();
        while (c.hasNext()) {
            arrayList.add(c.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    @C2715a
    @C5944c
    /* renamed from: a */
    public C2762f mo10467a(String str) {
        return mo10466a(m13308b(str));
    }

    @C2715a
    @C5944c
    /* renamed from: a */
    public C2762f mo10465a(char c) {
        return mo10466a(m13305b(c));
    }

    @C2715a
    @C5944c
    /* renamed from: a */
    public C2762f mo10466a(C2752o oVar) {
        return new C2762f(this, oVar, null);
    }
}
