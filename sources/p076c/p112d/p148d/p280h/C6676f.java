package p076c.p112d.p148d.p280h;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.collect.C7555b2;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C8178t3;
import com.google.common.collect.C8220v1;
import com.google.common.collect.C8244w1;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.f */
/* compiled from: MutableTypeToInstanceMap */
public final class C6676f<B> extends C8220v1<C6693m<? extends B>, B> implements C6692l<B> {

    /* renamed from: a */
    private final Map<C6693m<? extends B>, B> f18655a = C7800f4.m37335c();

    /* renamed from: c.d.d.h.f$b */
    /* compiled from: MutableTypeToInstanceMap */
    private static final class C6678b<K, V> extends C8244w1<K, V> {

        /* renamed from: a */
        private final Entry<K, V> f18656a;

        /* renamed from: c.d.d.h.f$b$a */
        /* compiled from: MutableTypeToInstanceMap */
        static class C6679a extends C7555b2<Entry<K, V>> {

            /* renamed from: a */
            final /* synthetic */ Set f18657a;

            C6679a(Set set) {
                this.f18657a = set;
            }

            public Iterator<Entry<K, V>> iterator() {
                return C6678b.m31911b(super.iterator());
            }

            public Object[] toArray() {
                return mo30759C();
            }

            public <T> T[] toArray(T[] tArr) {
                return mo30762a((Object[]) tArr);
            }

            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Set<Entry<K, V>> m31916y() {
                return this.f18657a;
            }
        }

        /* renamed from: c.d.d.h.f$b$b */
        /* compiled from: MutableTypeToInstanceMap */
        static class C6680b implements C7380p<Entry<K, V>, Entry<K, V>> {
            C6680b() {
            }

            /* renamed from: a */
            public Entry<K, V> apply(Entry<K, V> entry) {
                return new C6678b(entry);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static <K, V> Iterator<Entry<K, V>> m31911b(Iterator<Entry<K, V>> it) {
            return C8178t3.m39099a(it, (C7380p<? super F, ? extends T>) new C6680b<Object,Object>());
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        private C6678b(Entry<K, V> entry) {
            this.f18656a = (Entry) C7397x.m35664a(entry);
        }

        /* renamed from: a */
        static <K, V> Set<Entry<K, V>> m31910a(Set<Entry<K, V>> set) {
            return new C6679a(set);
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Entry<K, V> m31913y() {
            return this.f18656a;
        }
    }

    @C5952h
    /* renamed from: c */
    private <T extends B> T m31901c(C6693m<T> mVar, @C5952h T t) {
        return this.f18655a.put(mVar, t);
    }

    @C5952h
    /* renamed from: a */
    public <T extends B> T mo26775a(Class<T> cls) {
        return m31900b(C6693m.m31985e(cls));
    }

    /* renamed from: b */
    public B put(C6693m<? extends B> mVar, B b) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    public Set<Entry<C6693m<? extends B>, B>> entrySet() {
        return C6678b.m31910a(super.entrySet());
    }

    public void putAll(Map<? extends C6693m<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @C5952h
    /* renamed from: b */
    private <T extends B> T m31900b(C6693m<T> mVar) {
        return this.f18655a.get(mVar);
    }

    @C5952h
    /* renamed from: a */
    public <T extends B> T mo26776a(Class<T> cls, @C5952h T t) {
        return m31901c(C6693m.m31985e(cls), t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Map<C6693m<? extends B>, B> m31908y() {
        return this.f18655a;
    }

    @C5952h
    /* renamed from: a */
    public <T extends B> T mo26773a(C6693m<T> mVar) {
        return m31900b(mVar.mo26853l());
    }

    @C5952h
    /* renamed from: a */
    public <T extends B> T mo26774a(C6693m<T> mVar, @C5952h T t) {
        return m31901c(mVar.mo26853l(), t);
    }
}
