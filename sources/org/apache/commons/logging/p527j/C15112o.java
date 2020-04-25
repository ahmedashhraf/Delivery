package org.apache.commons.logging.p527j;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: org.apache.commons.logging.j.o */
/* compiled from: WeakHashtable */
public final class C15112o extends Hashtable {

    /* renamed from: N */
    private static final int f43971N = 100;

    /* renamed from: O */
    private static final int f43972O = 10;

    /* renamed from: a */
    private ReferenceQueue f43973a = new ReferenceQueue();

    /* renamed from: b */
    private int f43974b = 0;

    /* renamed from: org.apache.commons.logging.j.o$a */
    /* compiled from: WeakHashtable */
    private static final class C15113a implements Entry {

        /* renamed from: a */
        private final Object f43975a;

        /* renamed from: b */
        private final Object f43976b;

        /* synthetic */ C15113a(Object obj, Object obj2, C15111n nVar) {
            this(obj, obj2);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (getKey() == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!getKey().equals(entry.getKey())) {
                return false;
            }
            if (getValue() == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f43975a;
        }

        public Object getValue() {
            return this.f43976b;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = getKey() == null ? 0 : getKey().hashCode();
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Entry.setValue is not supported.");
        }

        private C15113a(Object obj, Object obj2) {
            this.f43975a = obj;
            this.f43976b = obj2;
        }
    }

    /* renamed from: org.apache.commons.logging.j.o$b */
    /* compiled from: WeakHashtable */
    private static final class C15114b {

        /* renamed from: a */
        private final WeakReference f43977a;

        /* renamed from: b */
        private final int f43978b;

        /* synthetic */ C15114b(Object obj, ReferenceQueue referenceQueue, C15111n nVar) {
            this(obj, referenceQueue);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C15114b)) {
                return false;
            }
            C15114b bVar = (C15114b) obj;
            Object a = m67158a();
            Object a2 = bVar.m67158a();
            if (a != null) {
                return a.equals(a2);
            }
            boolean z = a2 == null;
            if (!z) {
                return z;
            }
            if (hashCode() == bVar.hashCode()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f43978b;
        }

        /* synthetic */ C15114b(Object obj, C15111n nVar) {
            this(obj);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Object m67158a() {
            return this.f43977a.get();
        }

        private C15114b(Object obj) {
            this.f43977a = new WeakReference(obj);
            this.f43978b = obj.hashCode();
        }

        private C15114b(Object obj, ReferenceQueue referenceQueue) {
            this.f43977a = new C15115c(obj, referenceQueue, this, null);
            this.f43978b = obj.hashCode();
        }
    }

    /* renamed from: org.apache.commons.logging.j.o$c */
    /* compiled from: WeakHashtable */
    private static final class C15115c extends WeakReference {

        /* renamed from: a */
        private final C15114b f43979a;

        /* synthetic */ C15115c(Object obj, ReferenceQueue referenceQueue, C15114b bVar, C15111n nVar) {
            this(obj, referenceQueue, bVar);
        }

        private C15115c(Object obj, ReferenceQueue referenceQueue, C15114b bVar) {
            super(obj, referenceQueue);
            this.f43979a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C15114b m67160a() {
            return this.f43979a;
        }
    }

    /* renamed from: d */
    private void m67156d() {
        synchronized (this.f43973a) {
            while (true) {
                C15115c cVar = (C15115c) this.f43973a.poll();
                if (cVar != null) {
                    super.remove(cVar.m67160a());
                }
            }
        }
    }

    /* renamed from: e */
    private void m67157e() {
        synchronized (this.f43973a) {
            C15115c cVar = (C15115c) this.f43973a.poll();
            if (cVar != null) {
                super.remove(cVar.m67160a());
            }
        }
    }

    public boolean containsKey(Object obj) {
        return super.containsKey(new C15114b(obj, (C15111n) null));
    }

    public Enumeration elements() {
        m67156d();
        return super.elements();
    }

    public Set entrySet() {
        m67156d();
        Set<Entry> entrySet = super.entrySet();
        HashSet hashSet = new HashSet();
        for (Entry entry : entrySet) {
            Object a = ((C15114b) entry.getKey()).m67158a();
            Object value = entry.getValue();
            if (a != null) {
                hashSet.add(new C15113a(a, value, null));
            }
        }
        return hashSet;
    }

    public Object get(Object obj) {
        return super.get(new C15114b(obj, (C15111n) null));
    }

    public boolean isEmpty() {
        m67156d();
        return super.isEmpty();
    }

    public Set keySet() {
        m67156d();
        Set<C15114b> keySet = super.keySet();
        HashSet hashSet = new HashSet();
        for (C15114b a : keySet) {
            Object a2 = a.m67158a();
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return hashSet;
    }

    public Enumeration keys() {
        m67156d();
        return new C15111n(this, super.keys());
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("Null keys are not allowed");
        } else if (obj2 != null) {
            int i = this.f43974b;
            this.f43974b = i + 1;
            if (i > 100) {
                m67156d();
                this.f43974b = 0;
            } else if (this.f43974b % 10 == 0) {
                m67157e();
            }
            return super.put(new C15114b(obj, this.f43973a, null), obj2);
        } else {
            throw new NullPointerException("Null values are not allowed");
        }
    }

    public void putAll(Map map) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void rehash() {
        m67156d();
        super.rehash();
    }

    public Object remove(Object obj) {
        int i = this.f43974b;
        this.f43974b = i + 1;
        if (i > 100) {
            m67156d();
            this.f43974b = 0;
        } else if (this.f43974b % 10 == 0) {
            m67157e();
        }
        return super.remove(new C15114b(obj, (C15111n) null));
    }

    public int size() {
        m67156d();
        return super.size();
    }

    public String toString() {
        m67156d();
        return super.toString();
    }

    public Collection values() {
        m67156d();
        return super.values();
    }
}
