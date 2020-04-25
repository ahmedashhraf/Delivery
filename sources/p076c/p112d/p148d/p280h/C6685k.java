package p076c.p112d.p148d.p280h;

import com.google.common.base.C5822s;
import com.google.common.base.C5827t;
import com.google.common.base.C7397x;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C8302z2;
import com.google.common.collect.C8302z2.C8303a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.p217i1.C14662d0;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: c.d.d.h.k */
/* compiled from: TypeResolver */
public final class C6685k {

    /* renamed from: a */
    private final C6688c f18663a;

    /* renamed from: c.d.d.h.k$a */
    /* compiled from: TypeResolver */
    static class C6686a extends C6712n {

        /* renamed from: b */
        final /* synthetic */ Map f18664b;

        /* renamed from: c */
        final /* synthetic */ Type f18665c;

        C6686a(Map map, Type type) {
            this.f18664b = map;
            this.f18665c = type;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26824a(TypeVariable<?> typeVariable) {
            this.f18664b.put(new C6690d(typeVariable), this.f18665c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26825a(WildcardType wildcardType) {
            WildcardType wildcardType2 = (WildcardType) C6685k.m31933b(WildcardType.class, this.f18665c);
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            C7397x.m35672a(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f18665c);
            for (int i = 0; i < upperBounds.length; i++) {
                C6685k.m31934b(this.f18664b, upperBounds[i], upperBounds2[i]);
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                C6685k.m31934b(this.f18664b, lowerBounds[i2], lowerBounds2[i2]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26823a(ParameterizedType parameterizedType) {
            ParameterizedType parameterizedType2 = (ParameterizedType) C6685k.m31933b(ParameterizedType.class, this.f18665c);
            C7397x.m35672a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f18665c);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            C7397x.m35672a(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                C6685k.m31934b(this.f18664b, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26822a(GenericArrayType genericArrayType) {
            Type a = C6713o.m32090a(this.f18665c);
            C7397x.m35672a(a != null, "%s is not an array type.", this.f18665c);
            C6685k.m31934b(this.f18664b, genericArrayType.getGenericComponentType(), a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26821a(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("No type mapping from ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c.d.d.h.k$b */
    /* compiled from: TypeResolver */
    private static final class C6687b extends C6712n {

        /* renamed from: c */
        private static final C6691e f18666c = new C6691e(null);

        /* renamed from: b */
        private final Map<C6690d, Type> f18667b = C7800f4.m37335c();

        private C6687b() {
        }

        /* renamed from: a */
        static C8302z2<C6690d, Type> m31943a(Type type) {
            C6687b bVar = new C6687b();
            bVar.mo26877a(f18666c.mo26833a(type));
            return C8302z2.m39622a(bVar.f18667b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26821a(Class<?> cls) {
            mo26877a(cls.getGenericSuperclass());
            mo26877a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo26823a(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            C7397x.m35676b(typeParameters.length == actualTypeArguments.length);
            for (int i = 0; i < typeParameters.length; i++) {
                m31944a(new C6690d(typeParameters[i]), actualTypeArguments[i]);
            }
            mo26877a(cls);
            mo26877a(parameterizedType.getOwnerType());
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

        /* renamed from: a */
        private void m31944a(C6690d dVar, Type type) {
            if (!this.f18667b.containsKey(dVar)) {
                Type type2 = type;
                while (type2 != null) {
                    if (dVar.mo26829a(type2)) {
                        while (type != null) {
                            type = (Type) this.f18667b.remove(C6690d.m31954b(type));
                        }
                        return;
                    }
                    type2 = (Type) this.f18667b.get(C6690d.m31954b(type2));
                }
                this.f18667b.put(dVar, type);
            }
        }
    }

    /* renamed from: c.d.d.h.k$c */
    /* compiled from: TypeResolver */
    private static class C6688c {

        /* renamed from: a */
        private final C8302z2<C6690d, Type> f18668a;

        /* renamed from: c.d.d.h.k$c$a */
        /* compiled from: TypeResolver */
        class C6689a extends C6688c {

            /* renamed from: b */
            final /* synthetic */ TypeVariable f18669b;

            /* renamed from: c */
            final /* synthetic */ C6688c f18670c;

            C6689a(TypeVariable typeVariable, C6688c cVar) {
                this.f18669b = typeVariable;
                this.f18670c = cVar;
            }

            /* renamed from: a */
            public Type mo26828a(TypeVariable<?> typeVariable, C6688c cVar) {
                if (typeVariable.getGenericDeclaration().equals(this.f18669b.getGenericDeclaration())) {
                    return typeVariable;
                }
                return this.f18670c.mo26828a(typeVariable, cVar);
            }
        }

        C6688c() {
            this.f18668a = C8302z2.m39630i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C6688c mo26826a(Map<C6690d, ? extends Type> map) {
            C8303a g = C8302z2.m39628g();
            g.mo30689a((Map<? extends K, ? extends V>) this.f18668a);
            for (Entry entry : map.entrySet()) {
                C6690d dVar = (C6690d) entry.getKey();
                Type type = (Type) entry.getValue();
                C7397x.m35672a(!dVar.mo26829a(type), "Type variable %s bound to itself", dVar);
                g.mo30687a(dVar, type);
            }
            return new C6688c(g.mo30690a());
        }

        private C6688c(C8302z2<C6690d, Type> z2Var) {
            this.f18668a = z2Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Type mo26827a(TypeVariable<?> typeVariable) {
            return mo26828a(typeVariable, new C6689a(typeVariable, this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Type mo26828a(TypeVariable<?> typeVariable, C6688c cVar) {
            Type type = (Type) this.f18668a.get(new C6690d(typeVariable));
            if (type != null) {
                return new C6685k(cVar, null).mo26820a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a = new C6685k(cVar, null).m31931a(bounds);
            if (!C6726f.f18699a || !Arrays.equals(bounds, a)) {
                return C6713o.m32092a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a);
            }
            return typeVariable;
        }
    }

    /* renamed from: c.d.d.h.k$d */
    /* compiled from: TypeResolver */
    static final class C6690d {

        /* renamed from: a */
        private final TypeVariable<?> f18672a;

        C6690d(TypeVariable<?> typeVariable) {
            this.f18672a = (TypeVariable) C7397x.m35664a(typeVariable);
        }

        /* renamed from: b */
        static Object m31954b(Type type) {
            if (type instanceof TypeVariable) {
                return new C6690d((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo26829a(Type type) {
            if (type instanceof TypeVariable) {
                return m31953a((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C6690d) {
                return m31953a(((C6690d) obj).f18672a);
            }
            return false;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f18672a.getGenericDeclaration(), this.f18672a.getName());
        }

        public String toString() {
            return this.f18672a.toString();
        }

        /* renamed from: a */
        private boolean m31953a(TypeVariable<?> typeVariable) {
            return this.f18672a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f18672a.getName().equals(typeVariable.getName());
        }
    }

    /* renamed from: c.d.d.h.k$e */
    /* compiled from: TypeResolver */
    private static final class C6691e {

        /* renamed from: a */
        private final AtomicInteger f18673a;

        private C6691e() {
            this.f18673a = new AtomicInteger();
        }

        /* renamed from: b */
        private Type m31957b(@C5952h Type type) {
            if (type == null) {
                return null;
            }
            return mo26833a(type);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Type mo26833a(Type type) {
            C7397x.m35664a(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return C6713o.m32097b(mo26833a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                return C6713o.m32089a(m31957b(parameterizedType.getOwnerType()), (Class) parameterizedType.getRawType(), m31956a(parameterizedType.getActualTypeArguments()));
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    StringBuilder sb = new StringBuilder();
                    sb.append("capture#");
                    sb.append(this.f18673a.incrementAndGet());
                    sb.append("-of ? extends ");
                    sb.append(C5822s.m25522a((char) C14662d0.f42852c).mo23122a((Object[]) upperBounds));
                    type = C6713o.m32092a(C6691e.class, sb.toString(), wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* synthetic */ C6691e(C6686a aVar) {
            this();
        }

        /* renamed from: a */
        private Type[] m31956a(Type[] typeArr) {
            Type[] typeArr2 = new Type[typeArr.length];
            for (int i = 0; i < typeArr.length; i++) {
                typeArr2[i] = mo26833a(typeArr[i]);
            }
            return typeArr2;
        }
    }

    /* synthetic */ C6685k(C6688c cVar, C6686a aVar) {
        this(cVar);
    }

    /* renamed from: b */
    static C6685k m31932b(Type type) {
        return new C6685k().mo26819a((Map<C6690d, ? extends Type>) C6687b.m31943a(type));
    }

    public C6685k() {
        this.f18663a = new C6688c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m31934b(Map<C6690d, Type> map, Type type, Type type2) {
        if (!type.equals(type2)) {
            new C6686a(map, type2).mo26877a(type);
        }
    }

    private C6685k(C6688c cVar) {
        this.f18663a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m31933b(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(" is not a ");
            sb.append(cls.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public C6685k mo26818a(Type type, Type type2) {
        HashMap c = C7800f4.m37335c();
        m31934b(c, (Type) C7397x.m35664a(type), (Type) C7397x.m35664a(type2));
        return mo26819a((Map<C6690d, ? extends Type>) c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6685k mo26819a(Map<C6690d, ? extends Type> map) {
        return new C6685k(this.f18663a.mo26826a(map));
    }

    /* renamed from: a */
    public Type mo26820a(Type type) {
        C7397x.m35664a(type);
        if (type instanceof TypeVariable) {
            return this.f18663a.mo26827a((TypeVariable) type);
        }
        if (type instanceof ParameterizedType) {
            return m31926a((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return m31927a((GenericArrayType) type);
        }
        if (type instanceof WildcardType) {
            type = m31928a((WildcardType) type);
        }
        return type;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Type[] m31931a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = mo26820a(typeArr[i]);
        }
        return typeArr2;
    }

    /* renamed from: a */
    private WildcardType m31928a(WildcardType wildcardType) {
        return new C6729i(m31931a(wildcardType.getLowerBounds()), m31931a(wildcardType.getUpperBounds()));
    }

    /* renamed from: a */
    private Type m31927a(GenericArrayType genericArrayType) {
        return C6713o.m32097b(mo26820a(genericArrayType.getGenericComponentType()));
    }

    /* renamed from: a */
    private ParameterizedType m31926a(ParameterizedType parameterizedType) {
        Type type;
        Type ownerType = parameterizedType.getOwnerType();
        if (ownerType == null) {
            type = null;
        } else {
            type = mo26820a(ownerType);
        }
        return C6713o.m32089a(type, (Class) mo26820a(parameterizedType.getRawType()), m31931a(parameterizedType.getActualTypeArguments()));
    }
}
