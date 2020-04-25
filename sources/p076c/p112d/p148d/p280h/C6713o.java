package p076c.p112d.p148d.p280h;

import com.google.common.base.C5822s;
import com.google.common.base.C5827t;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C8145s3;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8257x2.C8259b;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

/* renamed from: c.d.d.h.o */
/* compiled from: Types */
final class C6713o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C7380p<Type, String> f18695a = new C6714a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C5822s f18696b = C5822s.m25525c(", ").mo23113a("null");

    /* renamed from: c.d.d.h.o$a */
    /* compiled from: Types */
    static class C6714a implements C7380p<Type, String> {
        C6714a() {
        }

        /* renamed from: a */
        public String apply(Type type) {
            return C6713o.m32103e(type);
        }
    }

    /* renamed from: c.d.d.h.o$b */
    /* compiled from: Types */
    static class C6715b extends C6712n {

        /* renamed from: b */
        final /* synthetic */ AtomicReference f18697b;

        C6715b(AtomicReference atomicReference) {
            this.f18697b = atomicReference;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26824a(TypeVariable<?> typeVariable) {
            this.f18697b.set(C6713o.m32098b(typeVariable.getBounds()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26825a(WildcardType wildcardType) {
            this.f18697b.set(C6713o.m32098b(wildcardType.getUpperBounds()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26822a(GenericArrayType genericArrayType) {
            this.f18697b.set(genericArrayType.getGenericComponentType());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26821a(Class<?> cls) {
            this.f18697b.set(cls.getComponentType());
        }
    }

    /* renamed from: c.d.d.h.o$c */
    /* compiled from: Types */
    private enum C6716c {
        OWNED_BY_ENCLOSING_CLASS {
            /* access modifiers changed from: 0000 */
            @C5952h
            /* renamed from: a */
            public Class<?> mo26879a(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER {
            /* access modifiers changed from: 0000 */
            @C5952h
            /* renamed from: a */
            public Class<?> mo26879a(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };
        
        static final C6716c JVM_BEHAVIOR = null;

        /* renamed from: c.d.d.h.o$c$b */
        /* compiled from: Types */
        class C6718b<T> {
            C6718b() {
            }
        }

        /* renamed from: c.d.d.h.o$c$d */
        /* compiled from: Types */
        static class C6720d extends C6718b<String> {
            C6720d() {
            }
        }

        static {
            JVM_BEHAVIOR = m32109d();
        }

        /* renamed from: d */
        private static C6716c m32109d() {
            C6716c[] values;
            new C6720d();
            ParameterizedType parameterizedType = (ParameterizedType) C6720d.class.getGenericSuperclass();
            for (C6716c cVar : values()) {
                if (cVar.mo26879a(C6718b.class) == parameterizedType.getOwnerType()) {
                    return cVar;
                }
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        @C5952h
        /* renamed from: a */
        public abstract Class<?> mo26879a(Class<?> cls);
    }

    /* renamed from: c.d.d.h.o$d */
    /* compiled from: Types */
    private static final class C6721d implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f18698a;

        C6721d(Type type) {
            this.f18698a = C6722e.CURRENT.mo26886b(type);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType)) {
                return false;
            }
            return C5827t.m25562a(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
        }

        public Type getGenericComponentType() {
            return this.f18698a;
        }

        public int hashCode() {
            return this.f18698a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C6713o.m32103e(this.f18698a));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: c.d.d.h.o$e */
    /* compiled from: Types */
    enum C6722e {
        JAVA6 {
            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Type mo26886b(Type type) {
                C7397x.m35664a(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C6721d(cls.getComponentType()) : type;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public GenericArrayType m32117a(Type type) {
                return new C6721d(type);
            }
        },
        JAVA7 {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public Type mo26885a(Type type) {
                if (type instanceof Class) {
                    return C6713o.m32086a((Class) type);
                }
                return new C6721d(type);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public Type mo26886b(Type type) {
                return (Type) C7397x.m35664a(type);
            }
        };
        
        static final C6722e CURRENT = null;

        /* renamed from: c.d.d.h.o$e$a */
        /* compiled from: Types */
        static class C6723a extends C6683i<int[]> {
            C6723a() {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C8257x2<Type> mo26884a(Type[] typeArr) {
            C8259b l = C8257x2.m39411l();
            for (Type b : typeArr) {
                l.m39420a((Object) mo26886b(b));
            }
            return l.mo30346a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract Type mo26885a(Type type);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract Type mo26886b(Type type);
    }

    /* renamed from: c.d.d.h.o$f */
    /* compiled from: Types */
    static final class C6726f<X> {

        /* renamed from: a */
        static final boolean f18699a;

        static {
            Class<C6726f> cls = C6726f.class;
            f18699a = !cls.getTypeParameters()[0].equals(C6713o.m32092a(cls, "X", new Type[0]));
        }

        C6726f() {
        }
    }

    /* renamed from: c.d.d.h.o$g */
    /* compiled from: Types */
    private static final class C6727g implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final Class<?> f18700N;

        /* renamed from: a */
        private final Type f18701a;

        /* renamed from: b */
        private final C8257x2<Type> f18702b;

        C6727g(@C5952h Type type, Class<?> cls, Type[] typeArr) {
            C7397x.m35664a(cls);
            C7397x.m35670a(typeArr.length == cls.getTypeParameters().length);
            C6713o.m32099b(typeArr, "type parameter");
            this.f18701a = type;
            this.f18700N = cls;
            this.f18702b = C6722e.CURRENT.mo26884a(typeArr);
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (getRawType().equals(parameterizedType.getRawType()) && C5827t.m25562a(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                z = true;
            }
            return z;
        }

        public Type[] getActualTypeArguments() {
            return C6713o.m32100b((Collection<Type>) this.f18702b);
        }

        public Type getOwnerType() {
            return this.f18701a;
        }

        public Type getRawType() {
            return this.f18700N;
        }

        public int hashCode() {
            Type type = this.f18701a;
            return ((type == null ? 0 : type.hashCode()) ^ this.f18702b.hashCode()) ^ this.f18700N.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Type type = this.f18701a;
            if (type != null) {
                sb.append(C6713o.m32103e(type));
                sb.append('.');
            }
            sb.append(this.f18700N.getName());
            sb.append(C14662d0.f42853d);
            sb.append(C6713o.f18696b.mo23119a(C8145s3.m39001a((Iterable<F>) this.f18702b, C6713o.f18695a)));
            sb.append(C14662d0.f42854e);
            return sb.toString();
        }
    }

    /* renamed from: c.d.d.h.o$h */
    /* compiled from: Types */
    private static final class C6728h<D extends GenericDeclaration> implements TypeVariable<D> {

        /* renamed from: N */
        private final C8257x2<Type> f18703N;

        /* renamed from: a */
        private final D f18704a;

        /* renamed from: b */
        private final String f18705b;

        C6728h(D d, String str, Type[] typeArr) {
            C6713o.m32099b(typeArr, "bound for type variable");
            this.f18704a = (GenericDeclaration) C7397x.m35664a(d);
            this.f18705b = (String) C7397x.m35664a(str);
            this.f18703N = C8257x2.m39410c(typeArr);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (C6726f.f18699a) {
                if (!(obj instanceof C6728h)) {
                    return false;
                }
                C6728h hVar = (C6728h) obj;
                if (!this.f18705b.equals(hVar.getName()) || !this.f18704a.equals(hVar.getGenericDeclaration()) || !this.f18703N.equals(hVar.f18703N)) {
                    z = false;
                }
                return z;
            } else if (!(obj instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) obj;
                if (!this.f18705b.equals(typeVariable.getName()) || !this.f18704a.equals(typeVariable.getGenericDeclaration())) {
                    z = false;
                }
                return z;
            }
        }

        public Type[] getBounds() {
            return C6713o.m32100b((Collection<Type>) this.f18703N);
        }

        public D getGenericDeclaration() {
            return this.f18704a;
        }

        public String getName() {
            return this.f18705b;
        }

        public int hashCode() {
            return this.f18704a.hashCode() ^ this.f18705b.hashCode();
        }

        public String toString() {
            return this.f18705b;
        }
    }

    /* renamed from: c.d.d.h.o$i */
    /* compiled from: Types */
    static final class C6729i implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final C8257x2<Type> f18706a;

        /* renamed from: b */
        private final C8257x2<Type> f18707b;

        C6729i(Type[] typeArr, Type[] typeArr2) {
            C6713o.m32099b(typeArr, "lower bound for wildcard");
            C6713o.m32099b(typeArr2, "upper bound for wildcard");
            this.f18706a = C6722e.CURRENT.mo26884a(typeArr);
            this.f18707b = C6722e.CURRENT.mo26884a(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            if (!this.f18706a.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.f18707b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                return false;
            }
            return true;
        }

        public Type[] getLowerBounds() {
            return C6713o.m32100b((Collection<Type>) this.f18706a);
        }

        public Type[] getUpperBounds() {
            return C6713o.m32100b((Collection<Type>) this.f18707b);
        }

        public int hashCode() {
            return this.f18706a.hashCode() ^ this.f18707b.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            Iterator it = this.f18706a.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb.append(" super ");
                sb.append(C6713o.m32103e(type));
            }
            for (Type type2 : C6713o.m32096b((Iterable<Type>) this.f18707b)) {
                sb.append(" extends ");
                sb.append(C6713o.m32103e(type2));
            }
            return sb.toString();
        }
    }

    private C6713o() {
    }

    @C2778d
    /* renamed from: c */
    static WildcardType m32101c(Type type) {
        return new C6729i(new Type[0], new Type[]{type});
    }

    @C2778d
    /* renamed from: d */
    static WildcardType m32102d(Type type) {
        return new C6729i(new Type[]{type}, new Type[]{Object.class});
    }

    /* renamed from: e */
    static String m32103e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: b */
    static Type m32097b(Type type) {
        if (!(type instanceof WildcardType)) {
            return C6722e.CURRENT.mo26885a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        boolean z = true;
        C7397x.m35671a(lowerBounds.length <= 1, (Object) "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return m32102d(m32097b(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        if (upperBounds.length != 1) {
            z = false;
        }
        C7397x.m35671a(z, (Object) "Wildcard should have only one upper bound.");
        return m32101c(m32097b(upperBounds[0]));
    }

    /* renamed from: a */
    static ParameterizedType m32089a(@C5952h Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return m32088a(cls, typeArr);
        }
        C7397x.m35664a(typeArr);
        C7397x.m35672a(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new C6727g(type, cls, typeArr);
    }

    /* renamed from: a */
    static ParameterizedType m32088a(Class<?> cls, Type... typeArr) {
        return new C6727g(C6716c.JVM_BEHAVIOR.mo26879a(cls), cls, typeArr);
    }

    /* renamed from: a */
    static <D extends GenericDeclaration> TypeVariable<D> m32092a(D d, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return new C6728h(d, str, typeArr);
    }

    @C5952h
    /* renamed from: a */
    static Type m32090a(Type type) {
        C7397x.m35664a(type);
        AtomicReference atomicReference = new AtomicReference();
        new C6715b(atomicReference).mo26877a(type);
        return (Type) atomicReference.get();
    }

    /* access modifiers changed from: private */
    @C5952h
    /* renamed from: b */
    public static Type m32098b(Type[] typeArr) {
        for (Type a : typeArr) {
            Type a2 = m32090a(a);
            if (a2 != null) {
                if (a2 instanceof Class) {
                    Class cls = (Class) a2;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m32101c(a2);
            }
        }
        return null;
    }

    /* renamed from: a */
    static Class<?> m32086a(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Type[] m32100b(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Iterable<Type> m32096b(Iterable<Type> iterable) {
        return C8145s3.m39030c(iterable, C7398z.m35682a(C7398z.m35687a(Object.class)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m32099b(Type[] typeArr, String str) {
        for (Class cls : typeArr) {
            if (cls instanceof Class) {
                Class cls2 = cls;
                C7397x.m35672a(!cls2.isPrimitive(), "Primitive type '%s' used as %s", cls2, str);
            }
        }
    }
}
