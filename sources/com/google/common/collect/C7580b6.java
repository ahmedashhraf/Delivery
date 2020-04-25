package com.google.common.collect;

import com.google.common.base.C5831y;
import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7677d6.C7678a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.b6 */
/* compiled from: StandardTable */
class C7580b6<R, C, V> extends C8074o<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @C5841k2

    /* renamed from: N */
    final Map<R, Map<C, V>> f21146N;
    @C5841k2

    /* renamed from: O */
    final C7344g0<? extends Map<C, V>> f21147O;

    /* renamed from: P */
    private transient Set<C> f21148P;

    /* renamed from: Q */
    private transient Map<R, Map<C, V>> f21149Q;

    /* renamed from: R */
    private transient C7591f f21150R;

    /* renamed from: com.google.common.collect.b6$b */
    /* compiled from: StandardTable */
    private class C7582b implements Iterator<C7678a<R, C, V>> {

        /* renamed from: N */
        Iterator<Entry<C, V>> f21151N;

        /* renamed from: a */
        final Iterator<Entry<R, Map<C, V>>> f21153a;

        /* renamed from: b */
        Entry<R, Map<C, V>> f21154b;

        private C7582b() {
            this.f21153a = C7580b6.this.f21146N.entrySet().iterator();
            this.f21151N = C8178t3.m39121c();
        }

        public boolean hasNext() {
            return this.f21153a.hasNext() || this.f21151N.hasNext();
        }

        public void remove() {
            this.f21151N.remove();
            if (((Map) this.f21154b.getValue()).isEmpty()) {
                this.f21153a.remove();
            }
        }

        public C7678a<R, C, V> next() {
            if (!this.f21151N.hasNext()) {
                this.f21154b = (Entry) this.f21153a.next();
                this.f21151N = ((Map) this.f21154b.getValue()).entrySet().iterator();
            }
            Entry entry = (Entry) this.f21151N.next();
            return C7771e6.m37137a(this.f21154b.getKey(), entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: com.google.common.collect.b6$c */
    /* compiled from: StandardTable */
    private class C7583c extends C7841v<R, V> {

        /* renamed from: O */
        final C f21155O;

        /* renamed from: com.google.common.collect.b6$c$a */
        /* compiled from: StandardTable */
        private class C7584a extends C8055g<Entry<R, V>> {
            private C7584a() {
            }

            public void clear() {
                C7583c.this.mo29735a(C7398z.m35698c());
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return C7580b6.this.m36377b(entry.getKey(), C7583c.this.f21155O, entry.getValue());
            }

            public boolean isEmpty() {
                C7583c cVar = C7583c.this;
                return !C7580b6.this.mo29720h(cVar.f21155O);
            }

            public Iterator<Entry<R, V>> iterator() {
                return new C7585b();
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                return C7580b6.this.m36378c(entry.getKey(), C7583c.this.f21155O, entry.getValue());
            }

            public boolean retainAll(Collection<?> collection) {
                return C7583c.this.mo29735a(C7398z.m35682a(C7398z.m35689a(collection)));
            }

            public int size() {
                int i = 0;
                for (Map containsKey : C7580b6.this.f21146N.values()) {
                    if (containsKey.containsKey(C7583c.this.f21155O)) {
                        i++;
                    }
                }
                return i;
            }
        }

        /* renamed from: com.google.common.collect.b6$c$b */
        /* compiled from: StandardTable */
        private class C7585b extends C7603c<Entry<R, V>> {

            /* renamed from: N */
            final Iterator<Entry<R, Map<C, V>>> f21158N;

            /* renamed from: com.google.common.collect.b6$c$b$a */
            /* compiled from: StandardTable */
            class C7586a extends C7848g<R, V> {

                /* renamed from: a */
                final /* synthetic */ Entry f21160a;

                C7586a(Entry entry) {
                    this.f21160a = entry;
                }

                public R getKey() {
                    return this.f21160a.getKey();
                }

                public V getValue() {
                    return ((Map) this.f21160a.getValue()).get(C7583c.this.f21155O);
                }

                public V setValue(V v) {
                    return ((Map) this.f21160a.getValue()).put(C7583c.this.f21155O, C7397x.m35664a(v));
                }
            }

            private C7585b() {
                this.f21158N = C7580b6.this.f21146N.entrySet().iterator();
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public Entry<R, V> m36399b() {
                while (this.f21158N.hasNext()) {
                    Entry entry = (Entry) this.f21158N.next();
                    if (((Map) entry.getValue()).containsKey(C7583c.this.f21155O)) {
                        return new C7586a(entry);
                    }
                }
                return (Entry) mo29793c();
            }
        }

        /* renamed from: com.google.common.collect.b6$c$c */
        /* compiled from: StandardTable */
        private class C7587c extends C7842w<R, V> {
            C7587c() {
                super(C7583c.this);
            }

            public boolean contains(Object obj) {
                C7583c cVar = C7583c.this;
                return C7580b6.this.mo29718d(obj, cVar.f21155O);
            }

            public boolean remove(Object obj) {
                C7583c cVar = C7583c.this;
                return C7580b6.this.remove(obj, cVar.f21155O) != null;
            }

            public boolean retainAll(Collection<?> collection) {
                return C7583c.this.mo29735a(C7800f4.m37276a(C7398z.m35682a(C7398z.m35689a(collection))));
            }
        }

        /* renamed from: com.google.common.collect.b6$c$d */
        /* compiled from: StandardTable */
        private class C7588d extends C7818h0<R, V> {
            C7588d() {
                super(C7583c.this);
            }

            public boolean remove(Object obj) {
                return obj != null && C7583c.this.mo29735a(C7800f4.m37311b(C7398z.m35687a(obj)));
            }

            public boolean removeAll(Collection<?> collection) {
                return C7583c.this.mo29735a(C7800f4.m37311b(C7398z.m35689a(collection)));
            }

            public boolean retainAll(Collection<?> collection) {
                return C7583c.this.mo29735a(C7800f4.m37311b(C7398z.m35682a(C7398z.m35689a(collection))));
            }
        }

        C7583c(C c) {
            this.f21155O = C7397x.m35664a(c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo29735a(C5831y<? super Entry<R, V>> yVar) {
            Iterator it = C7580b6.this.f21146N.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                Map map = (Map) entry.getValue();
                Object obj = map.get(this.f21155O);
                if (obj != null && yVar.apply(C7800f4.m37291a(entry.getKey(), obj))) {
                    map.remove(this.f21155O);
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Set<R> mo29652b() {
            return new C7587c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<V> mo29736c() {
            return new C7588d();
        }

        public boolean containsKey(Object obj) {
            return C7580b6.this.mo29718d(obj, this.f21155O);
        }

        public V get(Object obj) {
            return C7580b6.this.mo29715b(obj, this.f21155O);
        }

        public V put(R r, V v) {
            return C7580b6.this.mo29713a(r, this.f21155O, v);
        }

        public V remove(Object obj) {
            return C7580b6.this.remove(obj, this.f21155O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Set<Entry<R, V>> mo29734a() {
            return new C7584a();
        }
    }

    /* renamed from: com.google.common.collect.b6$d */
    /* compiled from: StandardTable */
    private class C7589d extends C7603c<C> {

        /* renamed from: N */
        final Map<C, V> f21164N;

        /* renamed from: O */
        final Iterator<Map<C, V>> f21165O;

        /* renamed from: P */
        Iterator<Entry<C, V>> f21166P;

        private C7589d() {
            this.f21164N = (Map) C7580b6.this.f21147O.get();
            this.f21165O = C7580b6.this.f21146N.values().iterator();
            this.f21166P = C8178t3.m39086a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public C mo29748b() {
            while (true) {
                if (this.f21166P.hasNext()) {
                    Entry entry = (Entry) this.f21166P.next();
                    if (!this.f21164N.containsKey(entry.getKey())) {
                        this.f21164N.put(entry.getKey(), entry.getValue());
                        return entry.getKey();
                    }
                } else if (!this.f21165O.hasNext()) {
                    return mo29793c();
                } else {
                    this.f21166P = ((Map) this.f21165O.next()).entrySet().iterator();
                }
            }
        }
    }

    /* renamed from: com.google.common.collect.b6$e */
    /* compiled from: StandardTable */
    private class C7590e extends C7602i<C> {
        private C7590e() {
            super();
        }

        public boolean contains(Object obj) {
            return C7580b6.this.mo29720h(obj);
        }

        public Iterator<C> iterator() {
            return C7580b6.this.mo29719g();
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator it = C7580b6.this.f21146N.values().iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().remove(obj)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean removeAll(Collection<?> collection) {
            C7397x.m35664a(collection);
            Iterator it = C7580b6.this.f21146N.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (C8178t3.m39109a(map.keySet().iterator(), collection)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            C7397x.m35664a(collection);
            Iterator it = C7580b6.this.f21146N.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map map = (Map) it.next();
                if (map.keySet().retainAll(collection)) {
                    z = true;
                    if (map.isEmpty()) {
                        it.remove();
                    }
                }
            }
            return z;
        }

        public int size() {
            return C8178t3.m39138j(iterator());
        }
    }

    /* renamed from: com.google.common.collect.b6$f */
    /* compiled from: StandardTable */
    private class C7591f extends C7841v<C, Map<R, V>> {

        /* renamed from: com.google.common.collect.b6$f$a */
        /* compiled from: StandardTable */
        class C7592a extends C7602i<Entry<C, Map<R, V>>> {

            /* renamed from: com.google.common.collect.b6$f$a$a */
            /* compiled from: StandardTable */
            class C7593a implements C7380p<C, Map<R, V>> {
                C7593a() {
                }

                public Map<R, V> apply(C c) {
                    return C7580b6.this.mo29721i(c);
                }
            }

            C7592a() {
                super();
            }

            public boolean contains(Object obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (C7580b6.this.mo29720h(entry.getKey())) {
                        return C7591f.this.get(entry.getKey()).equals(entry.getValue());
                    }
                }
                return false;
            }

            public Iterator<Entry<C, Map<R, V>>> iterator() {
                return C7800f4.m37320b(C7580b6.this.mo29728u(), (C7380p<? super K, V>) new C7593a<Object,V>());
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C7580b6.this.m36375b(((Entry) obj).getKey());
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                C7397x.m35664a(collection);
                return C8047m5.m38521a((Set<?>) this, collection.iterator());
            }

            public boolean retainAll(Collection<?> collection) {
                C7397x.m35664a(collection);
                Iterator it = C8309z3.m39649a(C7580b6.this.mo29728u().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C7800f4.m37291a(next, C7580b6.this.mo29721i(next)))) {
                        C7580b6.this.m36375b(next);
                        z = true;
                    }
                }
                return z;
            }

            public int size() {
                return C7580b6.this.mo29728u().size();
            }
        }

        /* renamed from: com.google.common.collect.b6$f$b */
        /* compiled from: StandardTable */
        private class C7594b extends C7818h0<C, Map<R, V>> {
            C7594b() {
                super(C7591f.this);
            }

            public boolean remove(Object obj) {
                for (Entry entry : C7591f.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        C7580b6.this.m36375b(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                C7397x.m35664a(collection);
                Iterator it = C8309z3.m39649a(C7580b6.this.mo29728u().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(C7580b6.this.mo29721i(next))) {
                        C7580b6.this.m36375b(next);
                        z = true;
                    }
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                C7397x.m35664a(collection);
                Iterator it = C8309z3.m39649a(C7580b6.this.mo29728u().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(C7580b6.this.mo29721i(next))) {
                        C7580b6.this.m36375b(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        private C7591f() {
        }

        /* renamed from: a */
        public Set<Entry<C, Map<R, V>>> mo29734a() {
            return new C7592a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Collection<Map<R, V>> mo29736c() {
            return new C7594b();
        }

        public boolean containsKey(Object obj) {
            return C7580b6.this.mo29720h(obj);
        }

        public Set<C> keySet() {
            return C7580b6.this.mo29728u();
        }

        public Map<R, V> get(Object obj) {
            if (C7580b6.this.mo29720h(obj)) {
                return C7580b6.this.mo29721i(obj);
            }
            return null;
        }

        public Map<R, V> remove(Object obj) {
            if (C7580b6.this.mo29720h(obj)) {
                return C7580b6.this.m36375b(obj);
            }
            return null;
        }
    }

    /* renamed from: com.google.common.collect.b6$g */
    /* compiled from: StandardTable */
    class C7595g extends C7841v<C, V> {

        /* renamed from: O */
        final R f21173O;

        /* renamed from: P */
        Map<C, V> f21174P;

        /* renamed from: com.google.common.collect.b6$g$a */
        /* compiled from: StandardTable */
        private final class C7596a extends C7828o<C, V> {

            /* renamed from: com.google.common.collect.b6$g$a$a */
            /* compiled from: StandardTable */
            class C7597a implements Iterator<Entry<C, V>> {

                /* renamed from: a */
                final /* synthetic */ Iterator f21177a;

                /* renamed from: com.google.common.collect.b6$g$a$a$a */
                /* compiled from: StandardTable */
                class C7598a extends C8244w1<C, V> {

                    /* renamed from: a */
                    final /* synthetic */ Entry f21179a;

                    C7598a(Entry entry) {
                        this.f21179a = entry;
                    }

                    public boolean equals(Object obj) {
                        return mo31180l(obj);
                    }

                    public V setValue(V v) {
                        return super.setValue(C7397x.m35664a(v));
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: y */
                    public Entry<C, V> m36409y() {
                        return this.f21179a;
                    }
                }

                C7597a(Iterator it) {
                    this.f21177a = it;
                }

                public boolean hasNext() {
                    return this.f21177a.hasNext();
                }

                public void remove() {
                    this.f21177a.remove();
                    C7595g.this.mo29773f();
                }

                public Entry<C, V> next() {
                    return new C7598a((Entry) this.f21177a.next());
                }
            }

            private C7596a() {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Map<C, V> mo29777b() {
                return C7595g.this;
            }

            public Iterator<Entry<C, V>> iterator() {
                Map d = C7595g.this.mo29771d();
                if (d == null) {
                    return C8178t3.m39121c();
                }
                return new C7597a(d.entrySet().iterator());
            }

            public int size() {
                Map d = C7595g.this.mo29771d();
                if (d == null) {
                    return 0;
                }
                return d.size();
            }
        }

        C7595g(R r) {
            this.f21173O = C7397x.m35664a(r);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<C, V>> mo29734a() {
            return new C7596a();
        }

        public void clear() {
            Map d = mo29771d();
            if (d != null) {
                d.clear();
            }
            mo29773f();
        }

        public boolean containsKey(Object obj) {
            Map d = mo29771d();
            return (obj == null || d == null || !C7800f4.m37345d(d, obj)) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public Map<C, V> mo29771d() {
            Map<C, V> map = this.f21174P;
            if (map != null && (!map.isEmpty() || !C7580b6.this.f21146N.containsKey(this.f21173O))) {
                return this.f21174P;
            }
            Map<C, V> e = mo29772e();
            this.f21174P = e;
            return e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public Map<C, V> mo29772e() {
            return (Map) C7580b6.this.f21146N.get(this.f21173O);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo29773f() {
            if (mo29771d() != null && this.f21174P.isEmpty()) {
                C7580b6.this.f21146N.remove(this.f21173O);
                this.f21174P = null;
            }
        }

        public V get(Object obj) {
            Map d = mo29771d();
            if (obj == null || d == null) {
                return null;
            }
            return C7800f4.m37346e(d, obj);
        }

        public V put(C c, V v) {
            C7397x.m35664a(c);
            C7397x.m35664a(v);
            Map<C, V> map = this.f21174P;
            if (map == null || map.isEmpty()) {
                return C7580b6.this.mo29713a(this.f21173O, c, v);
            }
            return this.f21174P.put(c, v);
        }

        public V remove(Object obj) {
            Map d = mo29771d();
            if (d == null) {
                return null;
            }
            V f = C7800f4.m37349f(d, obj);
            mo29773f();
            return f;
        }
    }

    /* renamed from: com.google.common.collect.b6$h */
    /* compiled from: StandardTable */
    class C7599h extends C7841v<R, Map<C, V>> {

        /* renamed from: com.google.common.collect.b6$h$a */
        /* compiled from: StandardTable */
        class C7600a extends C7602i<Entry<R, Map<C, V>>> {

            /* renamed from: com.google.common.collect.b6$h$a$a */
            /* compiled from: StandardTable */
            class C7601a implements C7380p<R, Map<C, V>> {
                C7601a() {
                }

                public Map<C, V> apply(R r) {
                    return C7580b6.this.mo29724k(r);
                }
            }

            C7600a() {
                super();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C8292z.m39592a((Collection<?>) C7580b6.this.f21146N.entrySet(), (Object) entry)) {
                    return false;
                }
                return true;
            }

            public Iterator<Entry<R, Map<C, V>>> iterator() {
                return C7800f4.m37320b(C7580b6.this.f21146N.keySet(), (C7380p<? super K, V>) new C7601a<Object,V>());
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !C7580b6.this.f21146N.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }

            public int size() {
                return C7580b6.this.f21146N.size();
            }
        }

        C7599h() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Set<Entry<R, Map<C, V>>> mo29734a() {
            return new C7600a();
        }

        public boolean containsKey(Object obj) {
            return C7580b6.this.mo29723j(obj);
        }

        public Map<C, V> get(Object obj) {
            if (C7580b6.this.mo29723j(obj)) {
                return C7580b6.this.mo29724k(obj);
            }
            return null;
        }

        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return (Map) C7580b6.this.f21146N.remove(obj);
        }
    }

    /* renamed from: com.google.common.collect.b6$i */
    /* compiled from: StandardTable */
    private abstract class C7602i<T> extends C8055g<T> {
        private C7602i() {
        }

        public void clear() {
            C7580b6.this.f21146N.clear();
        }

        public boolean isEmpty() {
            return C7580b6.this.f21146N.isEmpty();
        }
    }

    C7580b6(Map<R, Map<C, V>> map, C7344g0<? extends Map<C, V>> g0Var) {
        this.f21146N = map;
        this.f21147O = g0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m36378c(Object obj, Object obj2, Object obj3) {
        if (!m36377b(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    public void clear() {
        this.f21146N.clear();
    }

    public boolean containsValue(@C5952h Object obj) {
        return obj != null && super.containsValue(obj);
    }

    /* renamed from: d */
    public boolean mo29718d(@C5952h Object obj, @C5952h Object obj2) {
        return (obj == null || obj2 == null || !super.mo29718d(obj, obj2)) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Iterator<C> mo29719g() {
        return new C7589d();
    }

    /* renamed from: h */
    public boolean mo29720h(@C5952h Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map d : this.f21146N.values()) {
            if (C7800f4.m37345d(d, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public Map<R, V> mo29721i(C c) {
        return new C7583c(c);
    }

    public boolean isEmpty() {
        return this.f21146N.isEmpty();
    }

    /* renamed from: j */
    public boolean mo29723j(@C5952h Object obj) {
        return obj != null && C7800f4.m37345d(this.f21146N, obj);
    }

    /* renamed from: k */
    public Map<C, V> mo29724k(R r) {
        return new C7595g(r);
    }

    public V remove(@C5952h Object obj, @C5952h Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        Map map = (Map) C7800f4.m37346e(this.f21146N, obj);
        if (map == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.f21146N.remove(obj);
        }
        return remove;
    }

    public int size() {
        int i = 0;
        for (Map size : this.f21146N.values()) {
            i += size.size();
        }
        return i;
    }

    /* renamed from: t */
    public Set<C7678a<R, C, V>> mo29727t() {
        return super.mo29727t();
    }

    /* renamed from: u */
    public Set<C> mo29728u() {
        Set<C> set = this.f21148P;
        if (set != null) {
            return set;
        }
        C7590e eVar = new C7590e();
        this.f21148P = eVar;
        return eVar;
    }

    /* renamed from: v */
    public Map<R, Map<C, V>> mo29650v() {
        Map<R, Map<C, V>> map = this.f21149Q;
        if (map != null) {
            return map;
        }
        Map<R, Map<C, V>> h = mo29649h();
        this.f21149Q = h;
        return h;
    }

    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: w */
    public Map<C, Map<R, V>> mo29730w() {
        C7591f fVar = this.f21150R;
        if (fVar != null) {
            return fVar;
        }
        C7591f fVar2 = new C7591f<>();
        this.f21150R = fVar2;
        return fVar2;
    }

    /* renamed from: x */
    public Set<R> mo29651x() {
        return mo29650v().keySet();
    }

    /* renamed from: b */
    public V mo29715b(@C5952h Object obj, @C5952h Object obj2) {
        if (obj == null || obj2 == null) {
            return null;
        }
        return super.mo29715b(obj, obj2);
    }

    /* renamed from: a */
    private Map<C, V> m36373a(R r) {
        Map<C, V> map = (Map) this.f21146N.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.f21147O.get();
        this.f21146N.put(r, map2);
        return map2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Map<R, V> m36375b(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = this.f21146N.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            Object remove = ((Map) entry.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(entry.getKey(), remove);
                if (((Map) entry.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Map<R, Map<C, V>> mo29649h() {
        return new C7599h();
    }

    /* renamed from: a */
    public V mo29713a(R r, C c, V v) {
        C7397x.m35664a(r);
        C7397x.m35664a(c);
        C7397x.m35664a(v);
        return m36373a(r).put(c, v);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Iterator<C7678a<R, C, V>> mo29714a() {
        return new C7582b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m36377b(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(mo29715b(obj, obj2));
    }
}
