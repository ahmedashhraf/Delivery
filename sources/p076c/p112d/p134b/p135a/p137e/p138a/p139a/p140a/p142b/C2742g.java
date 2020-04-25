package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2715a;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.g */
/* compiled from: Joiner */
public class C2742g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f9877a;

    /* renamed from: c.d.b.a.e.a.a.a.b.g$d */
    /* compiled from: Joiner */
    public static final class C2743d {

        /* renamed from: a */
        private final C2742g f9878a;

        /* renamed from: b */
        private final String f9879b;

        /* synthetic */ C2743d(C2742g gVar, String str, C2744a aVar) {
            this(gVar, str);
        }

        /* renamed from: a */
        public <A extends Appendable> A mo10439a(A a, Map<?, ?> map) throws IOException {
            return mo10437a(a, (Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        private C2743d(C2742g gVar, String str) {
            this.f9878a = gVar;
            this.f9879b = (String) C6329k.m29434a(str);
        }

        /* renamed from: a */
        public StringBuilder mo10445a(StringBuilder sb, Map<?, ?> map) {
            return mo10443a(sb, (Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        /* renamed from: a */
        public String mo10442a(Map<?, ?> map) {
            return mo10440a((Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        @C2715a
        /* renamed from: a */
        public <A extends Appendable> A mo10437a(A a, Iterable<? extends Entry<?, ?>> iterable) throws IOException {
            return mo10438a(a, iterable.iterator());
        }

        @C2715a
        /* renamed from: a */
        public <A extends Appendable> A mo10438a(A a, Iterator<? extends Entry<?, ?>> it) throws IOException {
            C6329k.m29434a(a);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                a.append(this.f9878a.mo10426a(entry.getKey()));
                a.append(this.f9879b);
                a.append(this.f9878a.mo10426a(entry.getValue()));
                while (it.hasNext()) {
                    a.append(this.f9878a.f9877a);
                    Entry entry2 = (Entry) it.next();
                    a.append(this.f9878a.mo10426a(entry2.getKey()));
                    a.append(this.f9879b);
                    a.append(this.f9878a.mo10426a(entry2.getValue()));
                }
            }
            return a;
        }

        @C2715a
        /* renamed from: a */
        public StringBuilder mo10443a(StringBuilder sb, Iterable<? extends Entry<?, ?>> iterable) {
            return mo10444a(sb, iterable.iterator());
        }

        @C2715a
        /* renamed from: a */
        public StringBuilder mo10444a(StringBuilder sb, Iterator<? extends Entry<?, ?>> it) {
            try {
                mo10438a((A) sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @C2715a
        /* renamed from: a */
        public String mo10440a(Iterable<? extends Entry<?, ?>> iterable) {
            return mo10441a(iterable.iterator());
        }

        @C2715a
        /* renamed from: a */
        public String mo10441a(Iterator<? extends Entry<?, ?>> it) {
            return mo10444a(new StringBuilder(), it).toString();
        }

        @C5944c
        /* renamed from: a */
        public C2743d mo10436a(String str) {
            return new C2743d(this.f9878a.mo10421a(str), this.f9879b);
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.g$a */
    /* compiled from: Joiner */
    class C2744a extends C2742g {

        /* renamed from: b */
        final /* synthetic */ String f9880b;

        C2744a(C2742g gVar, String str) {
            this.f9880b = str;
            super(gVar, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo10426a(@C5952h Object obj) {
            return obj == null ? this.f9880b : C2742g.this.mo10426a(obj);
        }

        /* renamed from: a */
        public C2742g mo10421a(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        /* renamed from: a */
        public C2742g mo10420a() {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.g$b */
    /* compiled from: Joiner */
    class C2745b extends C2742g {
        C2745b(C2742g gVar) {
            super(gVar, null);
        }

        /* renamed from: a */
        public <A extends Appendable> A mo10424a(A a, Iterator<?> it) throws IOException {
            C6329k.m29435a(a, (Object) "appendable");
            C6329k.m29435a(it, (Object) "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a.append(C2742g.this.mo10426a(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(C2742g.this.f9877a);
                    a.append(C2742g.this.mo10426a(next2));
                }
            }
            return a;
        }

        /* renamed from: b */
        public C2743d mo10435b(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }

        /* renamed from: a */
        public C2742g mo10421a(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.g$c */
    /* compiled from: Joiner */
    static class C2746c extends AbstractList<Object> {

        /* renamed from: N */
        final /* synthetic */ Object f9883N;

        /* renamed from: a */
        final /* synthetic */ Object[] f9884a;

        /* renamed from: b */
        final /* synthetic */ Object f9885b;

        C2746c(Object[] objArr, Object obj, Object obj2) {
            this.f9884a = objArr;
            this.f9885b = obj;
            this.f9883N = obj2;
        }

        public Object get(int i) {
            if (i == 0) {
                return this.f9885b;
            }
            if (i != 1) {
                return this.f9884a[i - 2];
            }
            return this.f9883N;
        }

        public int size() {
            return this.f9884a.length + 2;
        }
    }

    /* synthetic */ C2742g(C2742g gVar, C2744a aVar) {
        this(gVar);
    }

    /* renamed from: c */
    public static C2742g m13244c(String str) {
        return new C2742g(str);
    }

    @C5944c
    /* renamed from: b */
    public C2743d mo10435b(String str) {
        return new C2743d(this, str, null);
    }

    private C2742g(String str) {
        this.f9877a = (String) C6329k.m29434a(str);
    }

    /* renamed from: a */
    public static C2742g m13241a(char c) {
        return new C2742g(String.valueOf(c));
    }

    /* renamed from: b */
    private static Iterable<Object> m13243b(Object obj, Object obj2, Object[] objArr) {
        C6329k.m29434a(objArr);
        return new C2746c(objArr, obj, obj2);
    }

    /* renamed from: a */
    public <A extends Appendable> A mo10422a(A a, Iterable<?> iterable) throws IOException {
        return mo10424a(a, iterable.iterator());
    }

    private C2742g(C2742g gVar) {
        this.f9877a = gVar.f9877a;
    }

    /* renamed from: a */
    public <A extends Appendable> A mo10424a(A a, Iterator<?> it) throws IOException {
        C6329k.m29434a(a);
        if (it.hasNext()) {
            a.append(mo10426a(it.next()));
            while (it.hasNext()) {
                a.append(this.f9877a);
                a.append(mo10426a(it.next()));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final <A extends Appendable> A mo10425a(A a, Object[] objArr) throws IOException {
        return mo10422a(a, (Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final <A extends Appendable> A mo10423a(A a, @C5952h Object obj, @C5952h Object obj2, Object... objArr) throws IOException {
        return mo10422a(a, m13243b(obj, obj2, objArr));
    }

    /* renamed from: a */
    public final StringBuilder mo10431a(StringBuilder sb, Iterable<?> iterable) {
        return mo10433a(sb, iterable.iterator());
    }

    /* renamed from: a */
    public final StringBuilder mo10433a(StringBuilder sb, Iterator<?> it) {
        try {
            mo10424a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final StringBuilder mo10434a(StringBuilder sb, Object[] objArr) {
        return mo10431a(sb, (Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final StringBuilder mo10432a(StringBuilder sb, @C5952h Object obj, @C5952h Object obj2, Object... objArr) {
        return mo10431a(sb, m13243b(obj, obj2, objArr));
    }

    /* renamed from: a */
    public final String mo10427a(Iterable<?> iterable) {
        return mo10429a(iterable.iterator());
    }

    /* renamed from: a */
    public final String mo10429a(Iterator<?> it) {
        return mo10433a(new StringBuilder(), it).toString();
    }

    /* renamed from: a */
    public final String mo10430a(Object[] objArr) {
        return mo10427a((Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final String mo10428a(@C5952h Object obj, @C5952h Object obj2, Object... objArr) {
        return mo10427a(m13243b(obj, obj2, objArr));
    }

    @C5944c
    /* renamed from: a */
    public C2742g mo10421a(String str) {
        C6329k.m29434a(str);
        return new C2744a(this, str);
    }

    @C5944c
    /* renamed from: a */
    public C2742g mo10420a() {
        return new C2745b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo10426a(Object obj) {
        C6329k.m29434a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
