package com.google.gson.p321x;

import com.google.gson.C8783h;
import com.google.gson.JsonIOException;
import com.google.gson.p324y.C8928a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: com.google.gson.x.c */
/* compiled from: ConstructorConstructor */
public final class C8811c {

    /* renamed from: a */
    private final Map<Type, C8783h<?>> f23108a;

    /* renamed from: com.google.gson.x.c$a */
    /* compiled from: ConstructorConstructor */
    class C8812a implements C8848i<T> {
        C8812a() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: com.google.gson.x.c$b */
    /* compiled from: ConstructorConstructor */
    class C8813b implements C8848i<T> {
        C8813b() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new TreeMap();
        }
    }

    /* renamed from: com.google.gson.x.c$c */
    /* compiled from: ConstructorConstructor */
    class C8814c implements C8848i<T> {
        C8814c() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: com.google.gson.x.c$d */
    /* compiled from: ConstructorConstructor */
    class C8815d implements C8848i<T> {
        C8815d() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new C8840h();
        }
    }

    /* renamed from: com.google.gson.x.c$e */
    /* compiled from: ConstructorConstructor */
    class C8816e implements C8848i<T> {

        /* renamed from: a */
        private final C8853l f23113a = C8853l.m41447a();

        /* renamed from: b */
        final /* synthetic */ Class f23114b;

        /* renamed from: c */
        final /* synthetic */ Type f23115c;

        C8816e(Class cls, Type type) {
            this.f23114b = cls;
            this.f23115c = type;
        }

        /* renamed from: a */
        public T mo32504a() {
            try {
                return this.f23113a.mo32608a(this.f23114b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to invoke no-args constructor for ");
                sb.append(this.f23115c);
                sb.append(". ");
                sb.append("Register an InstanceCreator with Gson for this type may fix this problem.");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    /* renamed from: com.google.gson.x.c$f */
    /* compiled from: ConstructorConstructor */
    class C8817f implements C8848i<T> {

        /* renamed from: a */
        final /* synthetic */ C8783h f23117a;

        /* renamed from: b */
        final /* synthetic */ Type f23118b;

        C8817f(C8783h hVar, Type type) {
            this.f23117a = hVar;
            this.f23118b = type;
        }

        /* renamed from: a */
        public T mo32504a() {
            return this.f23117a.mo32360a(this.f23118b);
        }
    }

    /* renamed from: com.google.gson.x.c$g */
    /* compiled from: ConstructorConstructor */
    class C8818g implements C8848i<T> {

        /* renamed from: a */
        final /* synthetic */ C8783h f23120a;

        /* renamed from: b */
        final /* synthetic */ Type f23121b;

        C8818g(C8783h hVar, Type type) {
            this.f23120a = hVar;
            this.f23121b = type;
        }

        /* renamed from: a */
        public T mo32504a() {
            return this.f23120a.mo32360a(this.f23121b);
        }
    }

    /* renamed from: com.google.gson.x.c$h */
    /* compiled from: ConstructorConstructor */
    class C8819h implements C8848i<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f23123a;

        C8819h(Constructor constructor) {
            this.f23123a = constructor;
        }

        /* renamed from: a */
        public T mo32504a() {
            String str = " with no args";
            String str2 = "Failed to invoke ";
            try {
                return this.f23123a.newInstance(null);
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f23123a);
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            } catch (InvocationTargetException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f23123a);
                sb2.append(str);
                throw new RuntimeException(sb2.toString(), e2.getTargetException());
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }
    }

    /* renamed from: com.google.gson.x.c$i */
    /* compiled from: ConstructorConstructor */
    class C8820i implements C8848i<T> {
        C8820i() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new TreeSet();
        }
    }

    /* renamed from: com.google.gson.x.c$j */
    /* compiled from: ConstructorConstructor */
    class C8821j implements C8848i<T> {

        /* renamed from: a */
        final /* synthetic */ Type f23126a;

        C8821j(Type type) {
            this.f23126a = type;
        }

        /* renamed from: a */
        public T mo32504a() {
            Type type = this.f23126a;
            String str = "Invalid EnumSet type: ";
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f23126a.toString());
                throw new JsonIOException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f23126a.toString());
            throw new JsonIOException(sb2.toString());
        }
    }

    /* renamed from: com.google.gson.x.c$k */
    /* compiled from: ConstructorConstructor */
    class C8822k implements C8848i<T> {
        C8822k() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.google.gson.x.c$l */
    /* compiled from: ConstructorConstructor */
    class C8823l implements C8848i<T> {
        C8823l() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new ArrayDeque();
        }
    }

    /* renamed from: com.google.gson.x.c$m */
    /* compiled from: ConstructorConstructor */
    class C8824m implements C8848i<T> {
        C8824m() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new ArrayList();
        }
    }

    /* renamed from: com.google.gson.x.c$n */
    /* compiled from: ConstructorConstructor */
    class C8825n implements C8848i<T> {
        C8825n() {
        }

        /* renamed from: a */
        public T mo32504a() {
            return new ConcurrentSkipListMap();
        }
    }

    public C8811c(Map<Type, C8783h<?>> map) {
        this.f23108a = map;
    }

    /* renamed from: b */
    private <T> C8848i<T> m41368b(Type type, Class<? super T> cls) {
        return new C8816e(cls, type);
    }

    /* renamed from: a */
    public <T> C8848i<T> mo32502a(C8928a<T> aVar) {
        Type b = aVar.mo32664b();
        Class a = aVar.mo32660a();
        C8783h hVar = (C8783h) this.f23108a.get(b);
        if (hVar != null) {
            return new C8817f(hVar, b);
        }
        C8783h hVar2 = (C8783h) this.f23108a.get(a);
        if (hVar2 != null) {
            return new C8818g(hVar2, b);
        }
        C8848i<T> a2 = m41366a(a);
        if (a2 != null) {
            return a2;
        }
        C8848i<T> a3 = m41367a(b, a);
        if (a3 != null) {
            return a3;
        }
        return m41368b(b, a);
    }

    public String toString() {
        return this.f23108a.toString();
    }

    /* renamed from: a */
    private <T> C8848i<T> m41366a(Class<? super T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new C8819h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private <T> C8848i<T> m41367a(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                return new C8820i();
            }
            if (EnumSet.class.isAssignableFrom(cls)) {
                return new C8821j(type);
            }
            if (Set.class.isAssignableFrom(cls)) {
                return new C8822k();
            }
            if (Queue.class.isAssignableFrom(cls)) {
                return new C8823l();
            }
            return new C8824m();
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                return new C8825n();
            }
            if (ConcurrentMap.class.isAssignableFrom(cls)) {
                return new C8812a();
            }
            if (SortedMap.class.isAssignableFrom(cls)) {
                return new C8813b();
            }
            if (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C8928a.m41700b(((ParameterizedType) type).getActualTypeArguments()[0]).mo32660a())) {
                return new C8815d();
            }
            return new C8814c();
        }
    }
}
