package p076c.p112d.p148d.p280h;

import com.google.common.base.C5822s;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.collect.C5838k1;
import com.google.common.collect.C7555b2;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C7859g3;
import com.google.common.collect.C7859g3.C7860a;
import com.google.common.collect.C8133r4;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8257x2.C8259b;
import com.google.common.collect.C8302z2;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p076c.p112d.p148d.p150g.C6646i;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.m */
/* compiled from: TypeToken */
public abstract class C6693m<T> extends C6683i<T> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Type f18674a;

    /* renamed from: b */
    private transient C6685k f18675b;

    /* renamed from: c.d.d.h.m$a */
    /* compiled from: TypeToken */
    class C6694a extends C6675b<T> {
        C6694a(Method method) {
            super(method);
        }

        /* renamed from: a */
        public C6693m<T> mo26748a() {
            return C6693m.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public Type[] mo26786n() {
            return C6693m.this.m31979b(super.mo26786n());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public Type[] mo26787o() {
            return C6693m.this.m31979b(super.mo26787o());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public Type mo26788p() {
            return C6693m.this.mo26842b(super.mo26788p()).mo26848h();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(mo26748a());
            sb.append(".");
            sb.append(super.toString());
            return sb.toString();
        }
    }

    /* renamed from: c.d.d.h.m$b */
    /* compiled from: TypeToken */
    class C6695b extends C6674a<T> {
        C6695b(Constructor constructor) {
            super(constructor);
        }

        /* renamed from: a */
        public C6693m<T> mo26748a() {
            return C6693m.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public Type[] mo26786n() {
            return C6693m.this.m31979b(super.mo26786n());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public Type[] mo26787o() {
            return C6693m.this.m31979b(super.mo26787o());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: p */
        public Type mo26788p() {
            return C6693m.this.mo26842b(super.mo26788p()).mo26848h();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(mo26748a());
            sb.append("(");
            sb.append(C5822s.m25525c(", ").mo23122a((Object[]) mo26787o()));
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: c.d.d.h.m$c */
    /* compiled from: TypeToken */
    class C6696c extends C6712n {
        C6696c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26824a(TypeVariable<?> typeVariable) {
            StringBuilder sb = new StringBuilder();
            sb.append(C6693m.this.f18674a);
            sb.append("contains a type variable and is not safe for the operation");
            throw new IllegalArgumentException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26825a(WildcardType wildcardType) {
            mo26877a(wildcardType.getLowerBounds());
            mo26877a(wildcardType.getUpperBounds());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26823a(ParameterizedType parameterizedType) {
            mo26877a(parameterizedType.getActualTypeArguments());
            mo26877a(parameterizedType.getOwnerType());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26822a(GenericArrayType genericArrayType) {
            mo26877a(genericArrayType.getGenericComponentType());
        }
    }

    /* renamed from: c.d.d.h.m$d */
    /* compiled from: TypeToken */
    static class C6697d extends C6712n {

        /* renamed from: b */
        final /* synthetic */ C7860a f18679b;

        C6697d(C7860a aVar) {
            this.f18679b = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26824a(TypeVariable<?> typeVariable) {
            mo26877a(typeVariable.getBounds());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26825a(WildcardType wildcardType) {
            mo26877a(wildcardType.getUpperBounds());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26823a(ParameterizedType parameterizedType) {
            this.f18679b.m37521a((Class) parameterizedType.getRawType());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26821a(Class<?> cls) {
            this.f18679b.m37521a(cls);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26822a(GenericArrayType genericArrayType) {
            this.f18679b.m37521a(C6713o.m32086a(C6693m.m31984d(genericArrayType.getGenericComponentType())));
        }
    }

    /* renamed from: c.d.d.h.m$e */
    /* compiled from: TypeToken */
    private final class C6698e extends C6711j {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private transient C7859g3<C6693m<? super T>> f18680N;

        private C6698e() {
            super();
        }

        private Object readResolve() {
            return C6693m.this.mo26850i().mo26858F();
        }

        /* renamed from: F */
        public C6711j mo26858F() {
            return this;
        }

        /* renamed from: G */
        public C6711j mo26859G() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        /* renamed from: H */
        public Set<Class<? super T>> mo26860H() {
            return C7859g3.m37505a((Collection<? extends E>) C6702h.f18687b.mo26862a().mo26863a((Iterable<? extends K>) C6693m.this.m31994o()));
        }

        /* synthetic */ C6698e(C6693m mVar, C6694a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<C6693m<? super T>> m32038y() {
            C7859g3<C6693m<? super T>> g3Var = this.f18680N;
            if (g3Var != null) {
                return g3Var;
            }
            C7859g3<C6693m<? super T>> e = C5838k1.m25634a((Iterable<E>) C6702h.f18686a.mo26862a().mo26864a(C6693m.this)).mo23217c((C5831y<? super E>) C6708i.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo23222e();
            this.f18680N = e;
            return e;
        }
    }

    /* renamed from: c.d.d.h.m$f */
    /* compiled from: TypeToken */
    private final class C6699f extends C6711j {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final transient C6711j f18682N;

        /* renamed from: O */
        private transient C7859g3<C6693m<? super T>> f18683O;

        /* renamed from: c.d.d.h.m$f$a */
        /* compiled from: TypeToken */
        class C6700a implements C5831y<Class<?>> {
            C6700a() {
            }

            /* renamed from: a */
            public boolean apply(Class<?> cls) {
                return cls.isInterface();
            }
        }

        C6699f(C6711j jVar) {
            super();
            this.f18682N = jVar;
        }

        private Object readResolve() {
            return C6693m.this.mo26850i().mo26859G();
        }

        /* renamed from: F */
        public C6711j mo26858F() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        /* renamed from: G */
        public C6711j mo26859G() {
            return this;
        }

        /* renamed from: H */
        public Set<Class<? super T>> mo26860H() {
            return C5838k1.m25634a((Iterable<E>) C6702h.f18687b.mo26863a((Iterable<? extends K>) C6693m.this.m31994o())).mo23217c((C5831y<? super E>) new C6700a<Object>()).mo23222e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<C6693m<? super T>> m32044y() {
            C7859g3<C6693m<? super T>> g3Var = this.f18683O;
            if (g3Var != null) {
                return g3Var;
            }
            C7859g3<C6693m<? super T>> e = C5838k1.m25634a((Iterable<E>) this.f18682N).mo23217c((C5831y<? super E>) C6708i.INTERFACE_ONLY).mo23222e();
            this.f18683O = e;
            return e;
        }
    }

    /* renamed from: c.d.d.h.m$g */
    /* compiled from: TypeToken */
    private static final class C6701g<T> extends C6693m<T> {
        private static final long serialVersionUID = 0;

        C6701g(Type type) {
            super(type, null);
        }
    }

    /* renamed from: c.d.d.h.m$h */
    /* compiled from: TypeToken */
    private static abstract class C6702h<K> {

        /* renamed from: a */
        static final C6702h<C6693m<?>> f18686a = new C6703a();

        /* renamed from: b */
        static final C6702h<Class<?>> f18687b = new C6704b();

        /* renamed from: c.d.d.h.m$h$a */
        /* compiled from: TypeToken */
        static class C6703a extends C6702h<C6693m<?>> {
            C6703a() {
                super(null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Iterable<? extends C6693m<?>> mo26865b(C6693m<?> mVar) {
                return mVar.mo26844e();
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Class<?> mo26866c(C6693m<?> mVar) {
                return mVar.mo26847g();
            }

            /* access modifiers changed from: 0000 */
            @C5952h
            /* renamed from: c */
            public C6693m<?> mo26867d(C6693m<?> mVar) {
                return mVar.mo26846f();
            }
        }

        /* renamed from: c.d.d.h.m$h$b */
        /* compiled from: TypeToken */
        static class C6704b extends C6702h<Class<?>> {
            C6704b() {
                super(null);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Iterable<? extends Class<?>> mo26865b(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Class<?> mo26866c(Class<?> cls) {
                return cls;
            }

            /* access modifiers changed from: 0000 */
            @C5952h
            /* renamed from: c */
            public Class<?> mo26867d(Class<?> cls) {
                return cls.getSuperclass();
            }
        }

        /* renamed from: c.d.d.h.m$h$c */
        /* compiled from: TypeToken */
        class C6705c extends C6707e<K> {
            C6705c(C6702h hVar) {
                super(hVar);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public C8257x2<K> mo26863a(Iterable<? extends K> iterable) {
                C8259b l = C8257x2.m39411l();
                for (Object next : iterable) {
                    if (!mo26866c(next).isInterface()) {
                        l.m39420a(next);
                    }
                }
                return super.mo26863a((Iterable<? extends K>) l.mo30346a());
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Iterable<? extends K> mo26865b(K k) {
                return C7859g3.m37512m();
            }
        }

        /* renamed from: c.d.d.h.m$h$d */
        /* compiled from: TypeToken */
        static class C6706d extends C8133r4<K> {

            /* renamed from: N */
            final /* synthetic */ Comparator f18689N;

            /* renamed from: O */
            final /* synthetic */ Map f18690O;

            C6706d(Comparator comparator, Map map) {
                this.f18689N = comparator;
                this.f18690O = map;
            }

            public int compare(K k, K k2) {
                return this.f18689N.compare(this.f18690O.get(k), this.f18690O.get(k2));
            }
        }

        /* renamed from: c.d.d.h.m$h$e */
        /* compiled from: TypeToken */
        private static class C6707e<K> extends C6702h<K> {

            /* renamed from: c */
            private final C6702h<K> f18691c;

            C6707e(C6702h<K> hVar) {
                super(null);
                this.f18691c = hVar;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Iterable<? extends K> mo26865b(K k) {
                return this.f18691c.mo26865b(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public Class<?> mo26866c(K k) {
                return this.f18691c.mo26866c(k);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: d */
            public K mo26867d(K k) {
                return this.f18691c.mo26867d(k);
            }
        }

        private C6702h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C6702h<K> mo26862a() {
            return new C6705c(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Iterable<? extends K> mo26865b(K k);

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract Class<?> mo26866c(K k);

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: d */
        public abstract K mo26867d(K k);

        /* synthetic */ C6702h(C6694a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C8257x2<K> mo26864a(K k) {
            return mo26863a((Iterable<? extends K>) C8257x2.m39393a(k));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8257x2<K> mo26863a(Iterable<? extends K> iterable) {
            HashMap c = C7800f4.m37335c();
            for (Object a : iterable) {
                m32046a((K) a, (Map<? super K, Integer>) c);
            }
            return m32047a((Map<K, V>) c, (Comparator<? super V>) C8133r4.m38943j().mo30568g());
        }

        /* renamed from: a */
        private int m32046a(K k, Map<? super K, Integer> map) {
            Integer num = (Integer) map.get(this);
            if (num != null) {
                return num.intValue();
            }
            int isInterface = mo26866c(k).isInterface();
            for (Object a : mo26865b(k)) {
                isInterface = Math.max(isInterface, m32046a((K) a, map));
            }
            Object d = mo26867d(k);
            if (d != null) {
                isInterface = Math.max(isInterface, m32046a((K) d, map));
            }
            int i = isInterface + 1;
            map.put(k, Integer.valueOf(i));
            return i;
        }

        /* renamed from: a */
        private static <K, V> C8257x2<K> m32047a(Map<K, V> map, Comparator<? super V> comparator) {
            return new C6706d(comparator, map).mo30930a((Iterable<E>) map.keySet());
        }
    }

    /* renamed from: c.d.d.h.m$i */
    /* compiled from: TypeToken */
    private enum C6708i implements C5831y<C6693m<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* renamed from: a */
            public boolean apply(C6693m<?> mVar) {
                return !(mVar.f18674a instanceof TypeVariable) && !(mVar.f18674a instanceof WildcardType);
            }
        },
        INTERFACE_ONLY {
            /* renamed from: a */
            public boolean apply(C6693m<?> mVar) {
                return mVar.mo26847g().isInterface();
            }
        };
    }

    /* renamed from: c.d.d.h.m$j */
    /* compiled from: TypeToken */
    public class C6711j extends C7555b2<C6693m<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private transient C7859g3<C6693m<? super T>> f18692a;

        C6711j() {
        }

        /* renamed from: F */
        public C6711j mo26858F() {
            return new C6698e(C6693m.this, null);
        }

        /* renamed from: G */
        public C6711j mo26859G() {
            return new C6699f(this);
        }

        /* renamed from: H */
        public Set<Class<? super T>> mo26860H() {
            return C7859g3.m37505a((Collection<? extends E>) C6702h.f18687b.mo26863a((Iterable<? extends K>) C6693m.this.m31994o()));
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public Set<C6693m<? super T>> m32078y() {
            C7859g3<C6693m<? super T>> g3Var = this.f18692a;
            if (g3Var != null) {
                return g3Var;
            }
            C7859g3<C6693m<? super T>> e = C5838k1.m25634a((Iterable<E>) C6702h.f18686a.mo26864a(C6693m.this)).mo23217c((C5831y<? super E>) C6708i.IGNORE_TYPE_VARIABLE_OR_WILDCARD).mo23222e();
            this.f18692a = e;
            return e;
        }
    }

    /* synthetic */ C6693m(Type type, C6694a aVar) {
        this(type);
    }

    /* renamed from: e */
    public static <T> C6693m<T> m31985e(Class<T> cls) {
        return new C6701g(cls);
    }

    /* renamed from: g */
    public static C6693m<?> m31990g(Type type) {
        return new C6701g(type);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public C7859g3<Class<? super T>> m31994o() {
        return m31986e(this.f18674a);
    }

    /* renamed from: p */
    private boolean m31995p() {
        return C6646i.m31726b().contains(this.f18674a);
    }

    @C5952h
    /* renamed from: d */
    public final C6693m<?> mo26843d() {
        Type a = C6713o.m32090a(this.f18674a);
        if (a == null) {
            return null;
        }
        return m31990g(a);
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C6693m)) {
            return false;
        }
        return this.f18674a.equals(((C6693m) obj).f18674a);
    }

    /* access modifiers changed from: 0000 */
    @C5952h
    /* renamed from: f */
    public final C6693m<? super T> mo26846f() {
        Type type = this.f18674a;
        if (type instanceof TypeVariable) {
            return m31981c(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return m31981c(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = mo26847g().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return m31991h(genericSuperclass);
    }

    /* renamed from: h */
    public final Type mo26848h() {
        return this.f18674a;
    }

    public int hashCode() {
        return this.f18674a.hashCode();
    }

    /* renamed from: i */
    public final C6711j mo26850i() {
        return new C6711j<>();
    }

    /* renamed from: j */
    public final boolean mo26851j() {
        return mo26843d() != null;
    }

    /* renamed from: k */
    public final boolean mo26852k() {
        Type type = this.f18674a;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final C6693m<T> mo26853l() {
        new C6696c().mo26877a(this.f18674a);
        return this;
    }

    /* renamed from: m */
    public final C6693m<T> mo26854m() {
        return m31995p() ? m31985e(C6646i.m31725b((Class) this.f18674a)) : this;
    }

    /* renamed from: n */
    public final C6693m<T> mo26855n() {
        return mo26852k() ? m31985e(C6646i.m31727c((Class) this.f18674a)) : this;
    }

    public String toString() {
        return C6713o.m32103e(this.f18674a);
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return m31990g(new C6685k().mo26820a(this.f18674a));
    }

    protected C6693m() {
        this.f18674a = mo26814a();
        Type type = this.f18674a;
        C7397x.m35678b(!(type instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", type);
    }

    @C5952h
    /* renamed from: c */
    private C6693m<? super T> m31981c(Type type) {
        C6693m<? super T> g = m31990g(type);
        if (g.mo26847g().isInterface()) {
            return null;
        }
        return g;
    }

    /* renamed from: h */
    private C6693m<?> m31991h(Type type) {
        C6693m<?> b = mo26842b(type);
        b.f18675b = this.f18675b;
        return b;
    }

    @C5952h
    /* renamed from: i */
    private static Type m31992i(Type type) {
        return type instanceof WildcardType ? m31965a((WildcardType) type) : type;
    }

    /* renamed from: j */
    private static Type m31993j(Type type) {
        return type instanceof WildcardType ? m31976b((WildcardType) type) : type;
    }

    /* renamed from: a */
    public final <X> C6693m<T> mo26836a(C6684j<X> jVar, C6693m<X> mVar) {
        return new C6701g(new C6685k().mo26819a((Map<C6690d, ? extends Type>) C8302z2.m39626c(new C6690d(jVar.f18662a), mVar.f18674a)).mo26820a(this.f18674a));
    }

    /* renamed from: b */
    public final C6693m<?> mo26842b(Type type) {
        C7397x.m35664a(type);
        C6685k kVar = this.f18675b;
        if (kVar == null) {
            kVar = C6685k.m31932b(this.f18674a);
            this.f18675b = kVar;
        }
        return m31990g(kVar.mo26820a(type));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C8257x2<C6693m<? super T>> mo26844e() {
        Type type = this.f18674a;
        if (type instanceof TypeVariable) {
            return m31964a(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m31964a(((WildcardType) type).getUpperBounds());
        }
        C8259b l = C8257x2.m39411l();
        for (Type h : mo26847g().getGenericInterfaces()) {
            l.m39420a((Object) m31991h(h));
        }
        return l.mo30346a();
    }

    /* renamed from: g */
    public final Class<? super T> mo26847g() {
        return m31984d(this.f18674a);
    }

    @C2778d
    /* renamed from: d */
    static Class<?> m31984d(Type type) {
        return (Class) m31986e(type).iterator().next();
    }

    @C2778d
    /* renamed from: g */
    static <T> C6693m<? extends T> m31989g(Class<T> cls) {
        if (cls.isArray()) {
            return m31990g(C6713o.m32097b(m31989g(cls.getComponentType()).f18674a));
        }
        TypeVariable[] typeParameters = cls.getTypeParameters();
        if (typeParameters.length > 0) {
            return m31990g((Type) C6713o.m32088a(cls, (Type[]) typeParameters));
        }
        return m31985e(cls);
    }

    /* renamed from: c */
    private C6693m<? extends T> m31980c(Class<?> cls) {
        return m31990g(m31988f(mo26843d().mo26838a(cls.getComponentType()).f18674a));
    }

    /* renamed from: d */
    private C6693m<? super T> m31983d(Class<? super T> cls) {
        return m31990g(m31988f(((C6693m) C7397x.m35666a(mo26843d(), "%s isn't a super type of %s", cls, this)).mo26841b(cls.getComponentType()).f18674a));
    }

    /* renamed from: a */
    public final <X> C6693m<T> mo26837a(C6684j<X> jVar, Class<X> cls) {
        return mo26836a(jVar, m31985e(cls));
    }

    protected C6693m(Class<?> cls) {
        Type a = super.mo26814a();
        if (a instanceof Class) {
            this.f18674a = a;
        } else {
            this.f18674a = m31985e(cls).mo26842b(a).f18674a;
        }
    }

    /* renamed from: a */
    private C8257x2<C6693m<? super T>> m31964a(Type[] typeArr) {
        C8259b l = C8257x2.m39411l();
        for (Type g : typeArr) {
            C6693m g2 = m31990g(g);
            if (g2.mo26847g().isInterface()) {
                l.m39420a((Object) g2);
            }
        }
        return l.mo30346a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Type[] m31979b(Type[] typeArr) {
        for (int i = 0; i < typeArr.length; i++) {
            typeArr[i] = mo26842b(typeArr[i]).mo26848h();
        }
        return typeArr;
    }

    /* renamed from: f */
    private Type m31987f(Class<?> cls) {
        if (this.f18674a instanceof Class) {
            return cls;
        }
        C6693m g = m31989g(cls);
        return new C6685k().mo26818a(g.mo26841b(mo26847g()).f18674a, this.f18674a).mo26820a(g.f18674a);
    }

    /* renamed from: b */
    public final C6693m<? super T> mo26841b(Class<? super T> cls) {
        C7397x.m35672a(cls.isAssignableFrom(mo26847g()), "%s is not a super class of %s", cls, this);
        Type type = this.f18674a;
        if (type instanceof TypeVariable) {
            return m31974b(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m31974b(cls, ((WildcardType) type).getUpperBounds());
        }
        if (cls.isArray()) {
            return m31983d(cls);
        }
        return m31991h(m31989g(cls).f18674a);
    }

    private C6693m(Type type) {
        this.f18674a = (Type) C7397x.m35664a(type);
    }

    @C2778d
    /* renamed from: e */
    static C7859g3<Class<?>> m31986e(Type type) {
        C7397x.m35664a(type);
        C7860a l = C7859g3.m37511l();
        new C6697d(l).mo26877a(type);
        return l.m37524a();
    }

    /* renamed from: f */
    private static Type m31988f(Type type) {
        return C6722e.JAVA7.mo26885a(type);
    }

    /* renamed from: a */
    public final C6693m<? extends T> mo26838a(Class<?> cls) {
        C7397x.m35672a(!(this.f18674a instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.f18674a;
        if (type instanceof WildcardType) {
            return m31963a(cls, ((WildcardType) type).getLowerBounds());
        }
        C7397x.m35672a(mo26847g().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        if (mo26851j()) {
            return m31980c(cls);
        }
        return m31990g(m31987f(cls));
    }

    /* renamed from: b */
    private static boolean m31978b(Type type, WildcardType wildcardType) {
        return m31970a(type, m31976b(wildcardType)) && m31971a(type, wildcardType);
    }

    /* renamed from: b */
    private static boolean m31977b(Type type, Type type2) {
        if (type.equals(type2)) {
            return true;
        }
        if (type2 instanceof WildcardType) {
            return m31978b(type, (WildcardType) type2);
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo26839a(C6693m<?> mVar) {
        return mo26840a(mVar.f18674a);
    }

    /* renamed from: a */
    public final boolean mo26840a(Type type) {
        return m31970a((Type) C7397x.m35664a(type), this.f18674a);
    }

    /* renamed from: b */
    private static Type m31976b(WildcardType wildcardType) {
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length == 1) {
            return m31993j(upperBounds[0]);
        }
        if (upperBounds.length == 0) {
            return Object.class;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("There should be at most one upper bound for wildcard type: ");
        sb.append(wildcardType);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    public final C6673e<T, Object> mo26835a(Method method) {
        C7397x.m35672a(m31985e(method.getDeclaringClass()).mo26839a(this), "%s not declared by %s", method, this);
        return new C6694a(method);
    }

    /* renamed from: a */
    public final C6673e<T, T> mo26834a(Constructor<?> constructor) {
        C7397x.m35672a(constructor.getDeclaringClass() == mo26847g(), "%s not declared by %s", constructor, mo26847g());
        return new C6695b(constructor);
    }

    /* renamed from: a */
    private static boolean m31970a(Type type, Type type2) {
        if (type2.equals(type)) {
            return true;
        }
        if (type2 instanceof WildcardType) {
            return m31978b(type, (WildcardType) type2);
        }
        if (type instanceof TypeVariable) {
            return m31972a(((TypeVariable) type).getBounds(), type2);
        }
        if (type instanceof WildcardType) {
            return m31972a(((WildcardType) type).getUpperBounds(), type2);
        }
        if (type instanceof GenericArrayType) {
            return m31966a((GenericArrayType) type, type2);
        }
        if (type2 instanceof Class) {
            return m31967a(type, (Class) type2);
        }
        if (type2 instanceof ParameterizedType) {
            return m31969a(type, (ParameterizedType) type2);
        }
        if (type2 instanceof GenericArrayType) {
            return m31968a(type, (GenericArrayType) type2);
        }
        return false;
    }

    /* renamed from: b */
    private C6693m<? super T> m31974b(Class<? super T> cls, Type[] typeArr) {
        for (Type g : typeArr) {
            C6693m g2 = m31990g(g);
            if (m31985e(cls).mo26839a(g2)) {
                return g2.mo26841b(cls);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" isn't a super type of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static boolean m31972a(Type[] typeArr, Type type) {
        for (Type a : typeArr) {
            if (m31970a(a, type)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m31967a(Type type, Class<?> cls) {
        return cls.isAssignableFrom(m31984d(type));
    }

    /* renamed from: a */
    private static boolean m31971a(Type type, WildcardType wildcardType) {
        Type a = m31965a(wildcardType);
        if (a == null) {
            return true;
        }
        Type i = m31992i(type);
        if (i == null) {
            return false;
        }
        return m31970a(a, i);
    }

    /* renamed from: a */
    private static boolean m31969a(Type type, ParameterizedType parameterizedType) {
        Class d = m31984d((Type) parameterizedType);
        if (!d.isAssignableFrom(m31984d(type))) {
            return false;
        }
        TypeVariable[] typeParameters = d.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C6693m g = m31990g(type);
        for (int i = 0; i < typeParameters.length; i++) {
            if (!m31977b(g.mo26842b((Type) typeParameters[i]).f18674a, actualTypeArguments[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m31968a(Type type, GenericArrayType genericArrayType) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return false;
            }
            return m31970a((Type) cls.getComponentType(), genericArrayType.getGenericComponentType());
        } else if (type instanceof GenericArrayType) {
            return m31970a(((GenericArrayType) type).getGenericComponentType(), genericArrayType.getGenericComponentType());
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m31966a(GenericArrayType genericArrayType, Type type) {
        boolean z = false;
        if (type instanceof Class) {
            Class<Object> cls = (Class) type;
            if (cls.isArray()) {
                return m31970a(genericArrayType.getGenericComponentType(), (Type) cls.getComponentType());
            }
            if (cls == Object.class) {
                z = true;
            }
            return z;
        } else if (!(type instanceof GenericArrayType)) {
            return false;
        } else {
            return m31970a(genericArrayType.getGenericComponentType(), ((GenericArrayType) type).getGenericComponentType());
        }
    }

    @C5952h
    /* renamed from: a */
    private static Type m31965a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length == 1) {
            return m31992i(lowerBounds[0]);
        }
        if (lowerBounds.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wildcard should have at most one lower bound: ");
        sb.append(wildcardType);
        throw new AssertionError(sb.toString());
    }

    /* renamed from: a */
    private C6693m<? extends T> m31963a(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return m31990g(typeArr[0]).mo26838a(cls);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls);
        sb.append(" isn't a subclass of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
}
