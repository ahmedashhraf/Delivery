package com.google.common.base;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5944c;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.base.s */
/* compiled from: Joiner */
public class C5822s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f16768a;

    /* renamed from: com.google.common.base.s$d */
    /* compiled from: Joiner */
    public static final class C5823d {

        /* renamed from: a */
        private final C5822s f16769a;

        /* renamed from: b */
        private final String f16770b;

        /* synthetic */ C5823d(C5822s sVar, String str, C5824a aVar) {
            this(sVar, str);
        }

        /* renamed from: a */
        public <A extends Appendable> A mo23131a(A a, Map<?, ?> map) throws IOException {
            return mo23129a(a, (Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        private C5823d(C5822s sVar, String str) {
            this.f16769a = sVar;
            this.f16770b = (String) C7397x.m35664a(str);
        }

        /* renamed from: a */
        public StringBuilder mo23137a(StringBuilder sb, Map<?, ?> map) {
            return mo23135a(sb, (Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        /* renamed from: a */
        public String mo23134a(Map<?, ?> map) {
            return mo23132a((Iterable<? extends Entry<?, ?>>) map.entrySet());
        }

        @C2775a
        /* renamed from: a */
        public <A extends Appendable> A mo23129a(A a, Iterable<? extends Entry<?, ?>> iterable) throws IOException {
            return mo23130a(a, iterable.iterator());
        }

        @C2775a
        /* renamed from: a */
        public <A extends Appendable> A mo23130a(A a, Iterator<? extends Entry<?, ?>> it) throws IOException {
            C7397x.m35664a(a);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                a.append(this.f16769a.mo23118a(entry.getKey()));
                a.append(this.f16770b);
                a.append(this.f16769a.mo23118a(entry.getValue()));
                while (it.hasNext()) {
                    a.append(this.f16769a.f16768a);
                    Entry entry2 = (Entry) it.next();
                    a.append(this.f16769a.mo23118a(entry2.getKey()));
                    a.append(this.f16770b);
                    a.append(this.f16769a.mo23118a(entry2.getValue()));
                }
            }
            return a;
        }

        @C2775a
        /* renamed from: a */
        public StringBuilder mo23135a(StringBuilder sb, Iterable<? extends Entry<?, ?>> iterable) {
            return mo23136a(sb, iterable.iterator());
        }

        @C2775a
        /* renamed from: a */
        public StringBuilder mo23136a(StringBuilder sb, Iterator<? extends Entry<?, ?>> it) {
            try {
                mo23130a((A) sb, it);
                return sb;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }

        @C2775a
        /* renamed from: a */
        public String mo23132a(Iterable<? extends Entry<?, ?>> iterable) {
            return mo23133a(iterable.iterator());
        }

        @C2775a
        /* renamed from: a */
        public String mo23133a(Iterator<? extends Entry<?, ?>> it) {
            return mo23136a(new StringBuilder(), it).toString();
        }

        @C5944c
        /* renamed from: a */
        public C5823d mo23128a(String str) {
            return new C5823d(this.f16769a.mo23113a(str), this.f16770b);
        }
    }

    /* renamed from: com.google.common.base.s$a */
    /* compiled from: Joiner */
    class C5824a extends C5822s {

        /* renamed from: b */
        final /* synthetic */ String f16771b;

        C5824a(C5822s sVar, String str) {
            this.f16771b = str;
            super(sVar, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo23118a(@C5952h Object obj) {
            return obj == null ? this.f16771b : C5822s.this.mo23118a(obj);
        }

        /* renamed from: a */
        public C5822s mo23113a(String str) {
            throw new UnsupportedOperationException("already specified useForNull");
        }

        /* renamed from: a */
        public C5822s mo23112a() {
            throw new UnsupportedOperationException("already specified useForNull");
        }
    }

    /* renamed from: com.google.common.base.s$b */
    /* compiled from: Joiner */
    class C5825b extends C5822s {
        C5825b(C5822s sVar) {
            super(sVar, null);
        }

        /* renamed from: a */
        public <A extends Appendable> A mo23116a(A a, Iterator<?> it) throws IOException {
            C7397x.m35665a(a, (Object) "appendable");
            C7397x.m35665a(it, (Object) "parts");
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    a.append(C5822s.this.mo23118a(next));
                    break;
                }
            }
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 != null) {
                    a.append(C5822s.this.f16768a);
                    a.append(C5822s.this.mo23118a(next2));
                }
            }
            return a;
        }

        /* renamed from: b */
        public C5823d mo23127b(String str) {
            throw new UnsupportedOperationException("can't use .skipNulls() with maps");
        }

        /* renamed from: a */
        public C5822s mo23113a(String str) {
            throw new UnsupportedOperationException("already specified skipNulls");
        }
    }

    /* renamed from: com.google.common.base.s$c */
    /* compiled from: Joiner */
    static class C5826c extends AbstractList<Object> {

        /* renamed from: N */
        final /* synthetic */ Object f16774N;

        /* renamed from: a */
        final /* synthetic */ Object[] f16775a;

        /* renamed from: b */
        final /* synthetic */ Object f16776b;

        C5826c(Object[] objArr, Object obj, Object obj2) {
            this.f16775a = objArr;
            this.f16776b = obj;
            this.f16774N = obj2;
        }

        public Object get(int i) {
            if (i == 0) {
                return this.f16776b;
            }
            if (i != 1) {
                return this.f16775a[i - 2];
            }
            return this.f16774N;
        }

        public int size() {
            return this.f16775a.length + 2;
        }
    }

    /* synthetic */ C5822s(C5822s sVar, C5824a aVar) {
        this(sVar);
    }

    /* renamed from: c */
    public static C5822s m25525c(String str) {
        return new C5822s(str);
    }

    @C5944c
    /* renamed from: b */
    public C5823d mo23127b(String str) {
        return new C5823d(this, str, null);
    }

    private C5822s(String str) {
        this.f16768a = (String) C7397x.m35664a(str);
    }

    /* renamed from: a */
    public static C5822s m25522a(char c) {
        return new C5822s(String.valueOf(c));
    }

    /* renamed from: b */
    private static Iterable<Object> m25524b(Object obj, Object obj2, Object[] objArr) {
        C7397x.m35664a(objArr);
        return new C5826c(objArr, obj, obj2);
    }

    /* renamed from: a */
    public <A extends Appendable> A mo23114a(A a, Iterable<?> iterable) throws IOException {
        return mo23116a(a, iterable.iterator());
    }

    private C5822s(C5822s sVar) {
        this.f16768a = sVar.f16768a;
    }

    /* renamed from: a */
    public <A extends Appendable> A mo23116a(A a, Iterator<?> it) throws IOException {
        C7397x.m35664a(a);
        if (it.hasNext()) {
            a.append(mo23118a(it.next()));
            while (it.hasNext()) {
                a.append(this.f16768a);
                a.append(mo23118a(it.next()));
            }
        }
        return a;
    }

    /* renamed from: a */
    public final <A extends Appendable> A mo23117a(A a, Object[] objArr) throws IOException {
        return mo23114a(a, (Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final <A extends Appendable> A mo23115a(A a, @C5952h Object obj, @C5952h Object obj2, Object... objArr) throws IOException {
        return mo23114a(a, m25524b(obj, obj2, objArr));
    }

    /* renamed from: a */
    public final StringBuilder mo23123a(StringBuilder sb, Iterable<?> iterable) {
        return mo23125a(sb, iterable.iterator());
    }

    /* renamed from: a */
    public final StringBuilder mo23125a(StringBuilder sb, Iterator<?> it) {
        try {
            mo23116a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final StringBuilder mo23126a(StringBuilder sb, Object[] objArr) {
        return mo23123a(sb, (Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final StringBuilder mo23124a(StringBuilder sb, @C5952h Object obj, @C5952h Object obj2, Object... objArr) {
        return mo23123a(sb, m25524b(obj, obj2, objArr));
    }

    /* renamed from: a */
    public final String mo23119a(Iterable<?> iterable) {
        return mo23121a(iterable.iterator());
    }

    /* renamed from: a */
    public final String mo23121a(Iterator<?> it) {
        return mo23125a(new StringBuilder(), it).toString();
    }

    /* renamed from: a */
    public final String mo23122a(Object[] objArr) {
        return mo23119a((Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    public final String mo23120a(@C5952h Object obj, @C5952h Object obj2, Object... objArr) {
        return mo23119a(m25524b(obj, obj2, objArr));
    }

    @C5944c
    /* renamed from: a */
    public C5822s mo23113a(String str) {
        C7397x.m35664a(str);
        return new C5824a(this, str);
    }

    @C5944c
    /* renamed from: a */
    public C5822s mo23112a() {
        return new C5825b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo23118a(Object obj) {
        C7397x.m35664a(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
