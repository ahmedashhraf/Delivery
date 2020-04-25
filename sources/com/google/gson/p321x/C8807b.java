package com.google.gson.p321x;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.x.b */
/* compiled from: $Gson$Types */
public final class C8807b {

    /* renamed from: a */
    static final Type[] f23101a = new Type[0];

    /* renamed from: com.google.gson.x.b$a */
    /* compiled from: $Gson$Types */
    private static final class C8808a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f23102a;

        public C8808a(Type type) {
            this.f23102a = C8807b.m41357b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C8807b.m41356a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f23102a;
        }

        public int hashCode() {
            return this.f23102a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C8807b.m41365h(this.f23102a));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.x.b$b */
    /* compiled from: $Gson$Types */
    private static final class C8809b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: N */
        private final Type[] f23103N;

        /* renamed from: a */
        private final Type f23104a;

        /* renamed from: b */
        private final Type f23105b;

        public C8809b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C8806a.m41345a(z);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C8807b.m41357b(type);
            }
            this.f23104a = type3;
            this.f23105b = C8807b.m41357b(type2);
            this.f23103N = (Type[]) typeArr.clone();
            int length = this.f23103N.length;
            for (int i = 0; i < length; i++) {
                C8806a.m41344a(this.f23103N[i]);
                C8807b.m41360c(this.f23103N[i]);
                Type[] typeArr2 = this.f23103N;
                typeArr2[i] = C8807b.m41357b(typeArr2[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C8807b.m41356a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f23103N.clone();
        }

        public Type getOwnerType() {
            return this.f23104a;
        }

        public Type getRawType() {
            return this.f23105b;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f23103N) ^ this.f23105b.hashCode()) ^ C8807b.m41346a((Object) this.f23104a);
        }

        public String toString() {
            int length = this.f23103N.length;
            if (length == 0) {
                return C8807b.m41365h(this.f23105b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C8807b.m41365h(this.f23105b));
            sb.append("<");
            sb.append(C8807b.m41365h(this.f23103N[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C8807b.m41365h(this.f23103N[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.x.b$c */
    /* compiled from: $Gson$Types */
    private static final class C8810c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Type f23106a;

        /* renamed from: b */
        private final Type f23107b;

        public C8810c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C8806a.m41345a(typeArr2.length <= 1);
            C8806a.m41345a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C8806a.m41344a(typeArr2[0]);
                C8807b.m41360c(typeArr2[0]);
                if (typeArr[0] != cls) {
                    z = false;
                }
                C8806a.m41345a(z);
                this.f23107b = C8807b.m41357b(typeArr2[0]);
                this.f23106a = cls;
                return;
            }
            C8806a.m41344a(typeArr[0]);
            C8807b.m41360c(typeArr[0]);
            this.f23107b = null;
            this.f23106a = C8807b.m41357b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C8807b.m41356a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f23107b;
            if (type == null) {
                return C8807b.f23101a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f23106a};
        }

        public int hashCode() {
            Type type = this.f23107b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f23106a.hashCode() + 31);
        }

        public String toString() {
            if (this.f23107b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("? super ");
                sb.append(C8807b.m41365h(this.f23107b));
                return sb.toString();
            } else if (this.f23106a == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("? extends ");
                sb2.append(C8807b.m41365h(this.f23106a));
                return sb2.toString();
            }
        }
    }

    private C8807b() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static ParameterizedType m41350a(Type type, Type type2, Type... typeArr) {
        return new C8809b(type, type2, typeArr);
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.google.gson.x.b$a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m41357b(java.lang.reflect.Type r3) {
        /*
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.x.b$a r0 = new com.google.gson.x.b$a
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = m41357b(r3)
            r0.<init>(r3)
            r3 = r0
        L_0x001a:
            return r3
        L_0x001b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0033
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.x.b$b r0 = new com.google.gson.x.b$b
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0033:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0043
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.x.b$a r0 = new com.google.gson.x.b$a
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L_0x0043:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0057
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.x.b$c r0 = new com.google.gson.x.b$c
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8807b.m41357b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: c */
    static void m41360c(Type type) {
        C8806a.m41345a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    public static Type m41361d(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: e */
    public static Class<?> m41362e(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C8806a.m41345a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m41362e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m41362e(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            sb.append("> is of type ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: f */
    public static WildcardType m41363f(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C8810c(typeArr, f23101a);
    }

    /* renamed from: g */
    public static WildcardType m41364g(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C8810c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: h */
    public static String m41365h(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* renamed from: a */
    public static GenericArrayType m41349a(Type type) {
        return new C8808a(type);
    }

    /* renamed from: a */
    static boolean m41355a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static boolean m41356a(Type type, Type type2) {
        boolean z = true;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m41355a((Object) parameterizedType.getOwnerType(), (Object) parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                z = false;
            }
            return z;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m41356a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                z = false;
            }
            return z;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: b */
    static Type m41358b(Type type, Class<?> cls, Class<?> cls2) {
        C8806a.m41345a(cls2.isAssignableFrom(cls));
        return m41353a(type, cls, m41352a(type, cls, cls2));
    }

    /* renamed from: b */
    public static Type[] m41359b(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type b = m41358b(type, cls, Map.class);
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: a */
    static int m41346a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    static Type m41352a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m41352a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m41352a(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: a */
    public static Type m41351a(Type type, Class<?> cls) {
        Type b = m41358b(type, cls, Collection.class);
        if (b instanceof WildcardType) {
            b = ((WildcardType) b).getUpperBounds()[0];
        }
        if (b instanceof ParameterizedType) {
            return ((ParameterizedType) b).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [java.lang.reflect.Type] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type m41353a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L_0x000f
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.Type r0 = m41354a(r8, r9, r10)
            if (r0 != r10) goto L_0x000d
            return r0
        L_0x000d:
            r10 = r0
            goto L_0x0000
        L_0x000f:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x002c
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r1 = r0.isArray()
            if (r1 == 0) goto L_0x002c
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = m41353a(r8, r9, r10)
            if (r10 != r8) goto L_0x0027
            goto L_0x002b
        L_0x0027:
            java.lang.reflect.GenericArrayType r0 = m41349a(r8)
        L_0x002b:
            return r0
        L_0x002c:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0042
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = m41353a(r8, r9, r0)
            if (r0 != r8) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            java.lang.reflect.GenericArrayType r10 = m41349a(r8)
        L_0x0041:
            return r10
        L_0x0042:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0082
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = m41353a(r8, r9, r0)
            if (r3 == r0) goto L_0x0056
            r0 = 1
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x005c:
            if (r2 >= r5) goto L_0x0077
            r6 = r4[r2]
            java.lang.reflect.Type r6 = m41353a(r8, r9, r6)
            r7 = r4[r2]
            if (r6 == r7) goto L_0x0074
            if (r0 != 0) goto L_0x0072
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x0072:
            r4[r2] = r6
        L_0x0074:
            int r2 = r2 + 1
            goto L_0x005c
        L_0x0077:
            if (r0 == 0) goto L_0x0081
            java.lang.reflect.Type r8 = r10.getRawType()
            java.lang.reflect.ParameterizedType r10 = m41350a(r3, r8, r4)
        L_0x0081:
            return r10
        L_0x0082:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x00b4
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r1) goto L_0x00a2
            r1 = r0[r2]
            java.lang.reflect.Type r8 = m41353a(r8, r9, r1)
            r9 = r0[r2]
            if (r8 == r9) goto L_0x00b4
            java.lang.reflect.WildcardType r8 = m41364g(r8)
            return r8
        L_0x00a2:
            int r0 = r3.length
            if (r0 != r1) goto L_0x00b4
            r0 = r3[r2]
            java.lang.reflect.Type r8 = m41353a(r8, r9, r0)     // Catch:{ all -> 0x00b5 }
            r9 = r3[r2]
            if (r8 == r9) goto L_0x00b4
            java.lang.reflect.WildcardType r8 = m41363f(r8)
            return r8
        L_0x00b4:
            return r10
        L_0x00b5:
            r8 = move-exception
            goto L_0x00b8
        L_0x00b7:
            throw r8
        L_0x00b8:
            goto L_0x00b7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8807b.m41353a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* renamed from: a */
    static Type m41354a(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class a = m41348a(typeVariable);
        if (a == null) {
            return typeVariable;
        }
        Type a2 = m41352a(type, cls, a);
        if (!(a2 instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) a2).getActualTypeArguments()[m41347a((Object[]) a.getTypeParameters(), (Object) typeVariable)];
    }

    /* renamed from: a */
    private static int m41347a(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private static Class<?> m41348a(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
