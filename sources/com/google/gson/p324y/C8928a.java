package com.google.gson.p324y;

import com.google.gson.p321x.C8806a;
import com.google.gson.p321x.C8807b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.y.a */
/* compiled from: TypeToken */
public class C8928a<T> {

    /* renamed from: a */
    final Class<? super T> f23360a;

    /* renamed from: b */
    final Type f23361b;

    /* renamed from: c */
    final int f23362c;

    protected C8928a() {
        this.f23361b = m41702c(getClass());
        this.f23360a = C8807b.m41362e(this.f23361b);
        this.f23362c = this.f23361b.hashCode();
    }

    /* renamed from: c */
    static Type m41702c(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return C8807b.m41357b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> mo32660a() {
        return this.f23360a;
    }

    /* renamed from: b */
    public final Type mo32664b() {
        return this.f23361b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C8928a) && C8807b.m41356a(this.f23361b, ((C8928a) obj).f23361b);
    }

    public final int hashCode() {
        return this.f23362c;
    }

    public final String toString() {
        return C8807b.m41365h(this.f23361b);
    }

    /* renamed from: b */
    public static C8928a<?> m41700b(Type type) {
        return new C8928a<>(type);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo32662a(Class<?> cls) {
        return mo32663a((Type) cls);
    }

    /* renamed from: b */
    public static <T> C8928a<T> m41699b(Class<T> cls) {
        return new C8928a<>(cls);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo32663a(Type type) {
        boolean z = false;
        if (type == null) {
            return false;
        }
        if (this.f23361b.equals(type)) {
            return true;
        }
        Type type2 = this.f23361b;
        if (type2 instanceof Class) {
            return this.f23360a.isAssignableFrom(C8807b.m41362e(type));
        }
        if (type2 instanceof ParameterizedType) {
            return m41697a(type, (ParameterizedType) type2, (Map<String, Type>) new HashMap<String,Type>());
        }
        if (type2 instanceof GenericArrayType) {
            if (this.f23360a.isAssignableFrom(C8807b.m41362e(type)) && m41696a(type, (GenericArrayType) this.f23361b)) {
                z = true;
            }
            return z;
        }
        throw m41694a(type2, (Class<?>[]) new Class[]{Class.class, ParameterizedType.class, GenericArrayType.class});
    }

    C8928a(Type type) {
        this.f23361b = C8807b.m41357b((Type) C8806a.m41344a(type));
        this.f23360a = C8807b.m41362e(this.f23361b);
        this.f23362c = this.f23361b.hashCode();
    }

    /* renamed from: c */
    public static C8928a<?> m41701c(Type type) {
        return new C8928a<>(C8807b.m41349a(type));
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo32661a(C8928a<?> aVar) {
        return mo32663a(aVar.mo32664b());
    }

    /* renamed from: a */
    private static boolean m41696a(Type type, GenericArrayType genericArrayType) {
        Type genericComponentType = genericArrayType.getGenericComponentType();
        if (!(genericComponentType instanceof ParameterizedType)) {
            return true;
        }
        if (type instanceof GenericArrayType) {
            type = ((GenericArrayType) type).getGenericComponentType();
        } else if (type instanceof Class) {
            r1 = (Class) type;
            while (r1.isArray()) {
                r1 = r1.getComponentType();
            }
            type = r1;
        }
        return m41697a(type, (ParameterizedType) genericComponentType, (Map<String, Type>) new HashMap<String,Type>());
    }

    /* renamed from: a */
    private static boolean m41697a(Type type, ParameterizedType parameterizedType, Map<String, Type> map) {
        if (type == null) {
            return false;
        }
        if (parameterizedType.equals(type)) {
            return true;
        }
        Class e = C8807b.m41362e(type);
        ParameterizedType parameterizedType2 = null;
        if (type instanceof ParameterizedType) {
            parameterizedType2 = (ParameterizedType) type;
        }
        if (parameterizedType2 != null) {
            Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
            TypeVariable[] typeParameters = e.getTypeParameters();
            for (int i = 0; i < actualTypeArguments.length; i++) {
                Type type2 = actualTypeArguments[i];
                TypeVariable typeVariable = typeParameters[i];
                while (type2 instanceof TypeVariable) {
                    type2 = (Type) map.get(((TypeVariable) type2).getName());
                }
                map.put(typeVariable.getName(), type2);
            }
            if (m41695a(parameterizedType2, parameterizedType, map)) {
                return true;
            }
        }
        for (Type a : e.getGenericInterfaces()) {
            if (m41697a(a, parameterizedType, (Map<String, Type>) new HashMap<String,Type>(map))) {
                return true;
            }
        }
        return m41697a(e.getGenericSuperclass(), parameterizedType, (Map<String, Type>) new HashMap<String,Type>(map));
    }

    /* renamed from: a */
    private static boolean m41695a(ParameterizedType parameterizedType, ParameterizedType parameterizedType2, Map<String, Type> map) {
        if (!parameterizedType.getRawType().equals(parameterizedType2.getRawType())) {
            return false;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            if (!m41698a(actualTypeArguments[i], actualTypeArguments2[i], map)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static AssertionError m41694a(Type type, Class<?>... clsArr) {
        StringBuilder sb = new StringBuilder("Unexpected type. Expected one of: ");
        for (Class<?> name : clsArr) {
            sb.append(name.getName());
            sb.append(", ");
        }
        sb.append("but got: ");
        sb.append(type.getClass().getName());
        sb.append(", for type token: ");
        sb.append(type.toString());
        sb.append('.');
        return new AssertionError(sb.toString());
    }

    /* renamed from: a */
    private static boolean m41698a(Type type, Type type2, Map<String, Type> map) {
        return type2.equals(type) || ((type instanceof TypeVariable) && type2.equals(map.get(((TypeVariable) type).getName())));
    }

    /* renamed from: a */
    public static C8928a<?> m41693a(Type type, Type... typeArr) {
        return new C8928a<>(C8807b.m41350a((Type) null, type, typeArr));
    }
}
