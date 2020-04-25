package com.google.common.collect;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;
import p201f.p202a.C5952h;

@C2776b(emulated = true, serializable = true)
/* renamed from: com.google.common.collect.x3 */
/* compiled from: LinkedListMultimap */
public class C8263x3<K, V> extends C7874h<K, V> implements C8283y3<K, V>, Serializable {
    @C2777c("java serialization not supported")
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public transient C8271g<K, V> f22102Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public transient C8271g<K, V> f22103R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public transient Map<K, C8270f<K, V>> f22104S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public transient int f22105T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public transient int f22106U;

    /* renamed from: com.google.common.collect.x3$a */
    /* compiled from: LinkedListMultimap */
    class C8264a extends AbstractSequentialList<V> {

        /* renamed from: a */
        final /* synthetic */ Object f22107a;

        C8264a(Object obj) {
            this.f22107a = obj;
        }

        public ListIterator<V> listIterator(int i) {
            return new C8273i(this.f22107a, i);
        }

        public int size() {
            C8270f fVar = (C8270f) C8263x3.this.f22104S.get(this.f22107a);
            if (fVar == null) {
                return 0;
            }
            return fVar.f22121c;
        }
    }

    /* renamed from: com.google.common.collect.x3$b */
    /* compiled from: LinkedListMultimap */
    class C8265b extends C8055g<K> {
        C8265b() {
        }

        public boolean contains(Object obj) {
            return C8263x3.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C8269e(C8263x3.this, null);
        }

        public boolean remove(Object obj) {
            return !C8263x3.this.mo29699e(obj).isEmpty();
        }

        public int size() {
            return C8263x3.this.f22104S.size();
        }
    }

    /* renamed from: com.google.common.collect.x3$c */
    /* compiled from: LinkedListMultimap */
    class C8266c extends AbstractSequentialList<V> {

        /* renamed from: com.google.common.collect.x3$c$a */
        /* compiled from: LinkedListMultimap */
        class C8267a extends C7873g6<Entry<K, V>, V> {

            /* renamed from: b */
            final /* synthetic */ C8272h f22112b;

            C8267a(ListIterator listIterator, C8272h hVar) {
                this.f22112b = hVar;
                super(listIterator);
            }

            public void set(V v) {
                this.f22112b.mo31221a(v);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public V mo30361a(Entry<K, V> entry) {
                return entry.getValue();
            }
        }

        C8266c() {
        }

        public ListIterator<V> listIterator(int i) {
            C8272h hVar = new C8272h(i);
            return new C8267a(hVar, hVar);
        }

        public int size() {
            return C8263x3.this.f22105T;
        }
    }

    /* renamed from: com.google.common.collect.x3$d */
    /* compiled from: LinkedListMultimap */
    class C8268d extends AbstractSequentialList<Entry<K, V>> {
        C8268d() {
        }

        public ListIterator<Entry<K, V>> listIterator(int i) {
            return new C8272h(i);
        }

        public int size() {
            return C8263x3.this.f22105T;
        }
    }

    /* renamed from: com.google.common.collect.x3$e */
    /* compiled from: LinkedListMultimap */
    private class C8269e implements Iterator<K> {

        /* renamed from: N */
        C8271g<K, V> f22114N;

        /* renamed from: O */
        int f22115O;

        /* renamed from: a */
        final Set<K> f22117a;

        /* renamed from: b */
        C8271g<K, V> f22118b;

        private C8269e() {
            this.f22117a = C8047m5.m38509a(C8263x3.this.keySet().size());
            this.f22118b = C8263x3.this.f22102Q;
            this.f22115O = C8263x3.this.f22106U;
        }

        /* renamed from: b */
        private void m39471b() {
            if (C8263x3.this.f22106U != this.f22115O) {
                throw new ConcurrentModificationException();
            }
        }

        public boolean hasNext() {
            m39471b();
            return this.f22118b != null;
        }

        public K next() {
            C8271g<K, V> gVar;
            m39471b();
            C8263x3.m39444b((Object) this.f22118b);
            this.f22114N = this.f22118b;
            this.f22117a.add(this.f22114N.f22126a);
            do {
                this.f22118b = this.f22118b.f22122N;
                gVar = this.f22118b;
                if (gVar == null) {
                    break;
                }
            } while (!this.f22117a.add(gVar.f22126a));
            return this.f22114N.f22126a;
        }

        public void remove() {
            m39471b();
            C8277y.m39486a(this.f22114N != null);
            C8263x3.this.m39448d((Object) this.f22114N.f22126a);
            this.f22114N = null;
            this.f22115O = C8263x3.this.f22106U;
        }

        /* synthetic */ C8269e(C8263x3 x3Var, C8264a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.collect.x3$f */
    /* compiled from: LinkedListMultimap */
    private static class C8270f<K, V> {

        /* renamed from: a */
        C8271g<K, V> f22119a;

        /* renamed from: b */
        C8271g<K, V> f22120b;

        /* renamed from: c */
        int f22121c = 1;

        C8270f(C8271g<K, V> gVar) {
            this.f22119a = gVar;
            this.f22120b = gVar;
        }
    }

    /* renamed from: com.google.common.collect.x3$g */
    /* compiled from: LinkedListMultimap */
    private static final class C8271g<K, V> extends C7848g<K, V> {

        /* renamed from: N */
        C8271g<K, V> f22122N;

        /* renamed from: O */
        C8271g<K, V> f22123O;

        /* renamed from: P */
        C8271g<K, V> f22124P = null;

        /* renamed from: Q */
        C8271g<K, V> f22125Q = null;

        /* renamed from: a */
        final K f22126a;

        /* renamed from: b */
        V f22127b;

        C8271g(@C5952h K k, @C5952h V v) {
            this.f22126a = k;
            this.f22127b = v;
        }

        public K getKey() {
            return this.f22126a;
        }

        public V getValue() {
            return this.f22127b;
        }

        public V setValue(@C5952h V v) {
            V v2 = this.f22127b;
            this.f22127b = v;
            return v2;
        }
    }

    /* renamed from: com.google.common.collect.x3$h */
    /* compiled from: LinkedListMultimap */
    private class C8272h implements ListIterator<Entry<K, V>> {

        /* renamed from: N */
        C8271g<K, V> f22128N;

        /* renamed from: O */
        C8271g<K, V> f22129O;

        /* renamed from: P */
        int f22130P = C8263x3.this.f22106U;

        /* renamed from: a */
        int f22132a;

        /* renamed from: b */
        C8271g<K, V> f22133b;

        C8272h(int i) {
            int size = C8263x3.this.size();
            C7397x.m35673b(i, size);
            if (i < size / 2) {
                this.f22133b = C8263x3.this.f22102Q;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.f22129O = C8263x3.this.f22103R;
                this.f22132a = size;
                while (true) {
                    int i3 = i + 1;
                    if (i >= size) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.f22128N = null;
        }

        /* renamed from: a */
        private void m39472a() {
            if (C8263x3.this.f22106U != this.f22130P) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: b */
        public void set(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            m39472a();
            return this.f22133b != null;
        }

        public boolean hasPrevious() {
            m39472a();
            return this.f22129O != null;
        }

        public int nextIndex() {
            return this.f22132a;
        }

        public int previousIndex() {
            return this.f22132a - 1;
        }

        public void remove() {
            m39472a();
            C8277y.m39486a(this.f22128N != null);
            C8271g<K, V> gVar = this.f22128N;
            if (gVar != this.f22133b) {
                this.f22129O = gVar.f22123O;
                this.f22132a--;
            } else {
                this.f22133b = gVar.f22122N;
            }
            C8263x3.this.m39438a(this.f22128N);
            this.f22128N = null;
            this.f22130P = C8263x3.this.f22106U;
        }

        public C8271g<K, V> next() {
            m39472a();
            C8263x3.m39444b((Object) this.f22133b);
            C8271g<K, V> gVar = this.f22133b;
            this.f22128N = gVar;
            this.f22129O = gVar;
            this.f22133b = gVar.f22122N;
            this.f22132a++;
            return this.f22128N;
        }

        public C8271g<K, V> previous() {
            m39472a();
            C8263x3.m39444b((Object) this.f22129O);
            C8271g<K, V> gVar = this.f22129O;
            this.f22128N = gVar;
            this.f22133b = gVar;
            this.f22129O = gVar.f22123O;
            this.f22132a--;
            return this.f22128N;
        }

        /* renamed from: a */
        public void add(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31221a(V v) {
            C7397x.m35676b(this.f22128N != null);
            this.f22128N.f22127b = v;
        }
    }

    /* renamed from: com.google.common.collect.x3$i */
    /* compiled from: LinkedListMultimap */
    private class C8273i implements ListIterator<V> {

        /* renamed from: N */
        C8271g<K, V> f22134N;

        /* renamed from: O */
        C8271g<K, V> f22135O;

        /* renamed from: P */
        C8271g<K, V> f22136P;

        /* renamed from: a */
        final Object f22138a;

        /* renamed from: b */
        int f22139b;

        C8273i(@C5952h Object obj) {
            C8271g<K, V> gVar;
            this.f22138a = obj;
            C8270f fVar = (C8270f) C8263x3.this.f22104S.get(obj);
            if (fVar == null) {
                gVar = null;
            } else {
                gVar = fVar.f22119a;
            }
            this.f22134N = gVar;
        }

        public void add(V v) {
            this.f22136P = C8263x3.this.m39436a(this.f22138a, v, this.f22134N);
            this.f22139b++;
            this.f22135O = null;
        }

        public boolean hasNext() {
            return this.f22134N != null;
        }

        public boolean hasPrevious() {
            return this.f22136P != null;
        }

        public V next() {
            C8263x3.m39444b((Object) this.f22134N);
            C8271g<K, V> gVar = this.f22134N;
            this.f22135O = gVar;
            this.f22136P = gVar;
            this.f22134N = gVar.f22124P;
            this.f22139b++;
            return this.f22135O.f22127b;
        }

        public int nextIndex() {
            return this.f22139b;
        }

        public V previous() {
            C8263x3.m39444b((Object) this.f22136P);
            C8271g<K, V> gVar = this.f22136P;
            this.f22135O = gVar;
            this.f22134N = gVar;
            this.f22136P = gVar.f22125Q;
            this.f22139b--;
            return this.f22135O.f22127b;
        }

        public int previousIndex() {
            return this.f22139b - 1;
        }

        public void remove() {
            C8277y.m39486a(this.f22135O != null);
            C8271g<K, V> gVar = this.f22135O;
            if (gVar != this.f22134N) {
                this.f22136P = gVar.f22125Q;
                this.f22139b--;
            } else {
                this.f22134N = gVar.f22124P;
            }
            C8263x3.this.m39438a(this.f22135O);
            this.f22135O = null;
        }

        public void set(V v) {
            C7397x.m35676b(this.f22135O != null);
            this.f22135O.f22127b = v;
        }

        public C8273i(@C5952h Object obj, int i) {
            int i2;
            C8271g<K, V> gVar;
            C8271g<K, V> gVar2;
            C8270f fVar = (C8270f) C8263x3.this.f22104S.get(obj);
            if (fVar == null) {
                i2 = 0;
            } else {
                i2 = fVar.f22121c;
            }
            C7397x.m35673b(i, i2);
            if (i < i2 / 2) {
                if (fVar == null) {
                    gVar = null;
                } else {
                    gVar = fVar.f22119a;
                }
                this.f22134N = gVar;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                if (fVar == null) {
                    gVar2 = null;
                } else {
                    gVar2 = fVar.f22120b;
                }
                this.f22136P = gVar2;
                this.f22139b = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.f22138a = obj;
            this.f22135O = null;
        }
    }

    C8263x3() {
        this.f22104S = C7800f4.m37335c();
    }

    /* renamed from: k */
    public static <K, V> C8263x3<K, V> m39450k() {
        return new C8263x3<>();
    }

    @C2777c("java.io.ObjectInputStream")
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f22104S = C7800f4.m37347e();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @C2777c("java.io.ObjectOutputStream")
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Entry entry : mo29704m()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo29701a(C7886h4 h4Var) {
        return super.mo29701a(h4Var);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo29702b(Object obj, Iterable iterable) {
        return super.mo29702b(obj, iterable);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo29884c(Object obj, Object obj2) {
        return super.mo29884c(obj, obj2);
    }

    public void clear() {
        this.f22102Q = null;
        this.f22103R = null;
        this.f22104S.clear();
        this.f22105T = 0;
        this.f22106U++;
    }

    public boolean containsKey(@C5952h Object obj) {
        return this.f22104S.containsKey(obj);
    }

    public boolean containsValue(@C5952h Object obj) {
        return values().contains(obj);
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Iterator<Entry<K, V>> mo29807h() {
        throw new AssertionError("should never be called");
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.f22102Q == null;
    }

    /* renamed from: j */
    public /* bridge */ /* synthetic */ Map mo29703j() {
        return super.mo29703j();
    }

    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* renamed from: n */
    public /* bridge */ /* synthetic */ C7982k4 mo29889n() {
        return super.mo29889n();
    }

    public boolean put(@C5952h K k, @C5952h V v) {
        m39436a(k, v, null);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public int size() {
        return this.f22105T;
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<V> m39463g() {
        return new C8266c();
    }

    public List<V> get(@C5952h K k) {
        return new C8264a(k);
    }

    /* renamed from: m */
    public List<Entry<K, V>> m39467m() {
        return (List) super.mo29704m();
    }

    public List<V> values() {
        return (List) super.values();
    }

    private C8263x3(int i) {
        this.f22104S = new HashMap(i);
    }

    /* renamed from: b */
    public static <K, V> C8263x3<K, V> m39443b(C7886h4<? extends K, ? extends V> h4Var) {
        return new C8263x3<>(h4Var);
    }

    /* renamed from: c */
    private List<V> m39446c(@C5952h Object obj) {
        return Collections.unmodifiableList(C8309z3.m39649a((Iterator<? extends E>) new C8273i<Object>(obj)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m39448d(@C5952h Object obj) {
        C8178t3.m39123c(new C8273i(obj));
    }

    /* renamed from: e */
    public List<V> m39460e(@C5952h Object obj) {
        List<V> c = m39446c(obj);
        m39448d(obj);
        return c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m39444b(@C5952h Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public List<Entry<K, V>> m39458d() {
        return new C8268d();
    }

    private C8263x3(C7886h4<? extends K, ? extends V> h4Var) {
        this(h4Var.keySet().size());
        mo29701a((C7886h4) h4Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Set<K> mo30001e() {
        return new C8265b();
    }

    /* renamed from: a */
    public static <K, V> C8263x3<K, V> m39437a(int i) {
        return new C8263x3<>(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C8271g<K, V> m39436a(@C5952h K k, @C5952h V v, @C5952h C8271g<K, V> gVar) {
        C8271g<K, V> gVar2 = new C8271g<>(k, v);
        if (this.f22102Q == null) {
            this.f22103R = gVar2;
            this.f22102Q = gVar2;
            this.f22104S.put(k, new C8270f(gVar2));
            this.f22106U++;
        } else if (gVar == null) {
            C8271g<K, V> gVar3 = this.f22103R;
            gVar3.f22122N = gVar2;
            gVar2.f22123O = gVar3;
            this.f22103R = gVar2;
            C8270f fVar = (C8270f) this.f22104S.get(k);
            if (fVar == null) {
                this.f22104S.put(k, new C8270f(gVar2));
                this.f22106U++;
            } else {
                fVar.f22121c++;
                C8271g<K, V> gVar4 = fVar.f22120b;
                gVar4.f22124P = gVar2;
                gVar2.f22125Q = gVar4;
                fVar.f22120b = gVar2;
            }
        } else {
            C8270f fVar2 = (C8270f) this.f22104S.get(k);
            fVar2.f22121c++;
            gVar2.f22123O = gVar.f22123O;
            gVar2.f22125Q = gVar.f22125Q;
            gVar2.f22122N = gVar;
            gVar2.f22124P = gVar;
            C8271g<K, V> gVar5 = gVar.f22125Q;
            if (gVar5 == null) {
                ((C8270f) this.f22104S.get(k)).f22119a = gVar2;
            } else {
                gVar5.f22124P = gVar2;
            }
            C8271g<K, V> gVar6 = gVar.f22123O;
            if (gVar6 == null) {
                this.f22102Q = gVar2;
            } else {
                gVar6.f22122N = gVar2;
            }
            gVar.f22123O = gVar2;
            gVar.f22125Q = gVar2;
        }
        this.f22105T++;
        return gVar2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m39438a(C8271g<K, V> gVar) {
        C8271g<K, V> gVar2 = gVar.f22123O;
        if (gVar2 != null) {
            gVar2.f22122N = gVar.f22122N;
        } else {
            this.f22102Q = gVar.f22122N;
        }
        C8271g<K, V> gVar3 = gVar.f22122N;
        if (gVar3 != null) {
            gVar3.f22123O = gVar.f22123O;
        } else {
            this.f22103R = gVar.f22123O;
        }
        if (gVar.f22125Q == null && gVar.f22124P == null) {
            ((C8270f) this.f22104S.remove(gVar.f22126a)).f22121c = 0;
            this.f22106U++;
        } else {
            C8270f fVar = (C8270f) this.f22104S.get(gVar.f22126a);
            fVar.f22121c--;
            C8271g<K, V> gVar4 = gVar.f22125Q;
            if (gVar4 == null) {
                fVar.f22119a = gVar.f22124P;
            } else {
                gVar4.f22124P = gVar.f22124P;
            }
            C8271g<K, V> gVar5 = gVar.f22124P;
            if (gVar5 == null) {
                fVar.f22120b = gVar.f22125Q;
            } else {
                gVar5.f22125Q = gVar.f22125Q;
            }
        }
        this.f22105T--;
    }

    /* renamed from: a */
    public List<V> m39452a(@C5952h K k, Iterable<? extends V> iterable) {
        List<V> c = m39446c((Object) k);
        C8273i iVar = new C8273i(k);
        Iterator it = iterable.iterator();
        while (iVar.hasNext() && it.hasNext()) {
            iVar.next();
            iVar.set(it.next());
        }
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
        while (it.hasNext()) {
            iVar.add(it.next());
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<K, Collection<V>> mo29800a() {
        return new C7937a(this);
    }
}
