package p076c.p112d.p134b.p135a.p143g;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: c.d.b.a.g.q0 */
/* compiled from: Types */
public class C6409q0 {

    /* renamed from: c.d.b.a.g.q0$a */
    /* compiled from: Types */
    static class C6410a implements Iterable<T> {

        /* renamed from: a */
        final /* synthetic */ Object f17866a;

        /* renamed from: c.d.b.a.g.q0$a$a */
        /* compiled from: Types */
        class C6411a implements Iterator<T> {

            /* renamed from: a */
            final int f17868a = Array.getLength(C6410a.this.f17866a);

            /* renamed from: b */
            int f17869b = 0;

            C6411a() {
            }

            public boolean hasNext() {
                return this.f17869b < this.f17868a;
            }

            public T next() {
                if (hasNext()) {
                    Object obj = C6410a.this.f17866a;
                    int i = this.f17869b;
                    this.f17869b = i + 1;
                    return Array.get(obj, i);
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        C6410a(Object obj) {
            this.f17866a = obj;
        }

        public Iterator<T> iterator() {
            return new C6411a();
        }
    }

    private C6409q0() {
    }

    /* renamed from: a */
    public static ParameterizedType m29768a(Type type, Class<?> cls) {
        Class<?> cls2;
        if ((type instanceof Class) || (type instanceof ParameterizedType)) {
            while (type != null && type != Object.class) {
                if (type instanceof Class) {
                    cls2 = (Class) type;
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Class<?> a = m29762a(parameterizedType);
                    if (a == cls) {
                        return parameterizedType;
                    }
                    if (cls.isInterface()) {
                        Type[] genericInterfaces = a.getGenericInterfaces();
                        int length = genericInterfaces.length;
                        for (int i = 0; i < length; i++) {
                            Type type2 = genericInterfaces[i];
                            if (cls.isAssignableFrom(type2 instanceof Class ? (Class) type2 : m29762a((ParameterizedType) type2))) {
                                type = type2;
                                break;
                            }
                        }
                    }
                    cls2 = a;
                }
                type = cls2.getGenericSuperclass();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Type m29774b(Type type) {
        return m29770a(type, Iterable.class, 0);
    }

    /* renamed from: c */
    public static Type m29775c(Type type) {
        return m29770a(type, Map.class, 1);
    }

    /* renamed from: d */
    public static boolean m29776d(Type type) {
        return (type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray());
    }

    /* renamed from: a */
    public static boolean m29773a(Class<?> cls, Class<?> cls2) {
        return cls.isAssignableFrom(cls2) || cls2.isAssignableFrom(cls);
    }

    /* renamed from: a */
    public static <T> T m29766a(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw m29764a((Exception) e, cls);
        } catch (InstantiationException e2) {
            throw m29764a((Exception) e2, cls);
        }
    }

    /* renamed from: a */
    private static IllegalArgumentException m29764a(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(C3868i.f12248b);
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    /* renamed from: a */
    public static Type m29769a(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    /* renamed from: a */
    public static Class<?> m29762a(ParameterizedType parameterizedType) {
        return (Class) parameterizedType.getRawType();
    }

    /* renamed from: a */
    public static Type m29771a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    /* renamed from: a */
    public static Type m29772a(List<Type> list, TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            Class cls = (Class) genericDeclaration;
            int size = list.size();
            ParameterizedType parameterizedType = null;
            while (parameterizedType == null) {
                size--;
                if (size < 0) {
                    break;
                }
                parameterizedType = m29768a((Type) list.get(size), cls);
            }
            if (parameterizedType != null) {
                TypeVariable[] typeParameters = genericDeclaration.getTypeParameters();
                int i = 0;
                while (i < typeParameters.length && !typeParameters[i].equals(typeVariable)) {
                    i++;
                }
                Type type = parameterizedType.getActualTypeArguments()[i];
                if (type instanceof TypeVariable) {
                    Type a = m29772a(list, (TypeVariable) type);
                    if (a != null) {
                        return a;
                    }
                }
                return type;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Class<?> m29763a(List<Type> list, Type type) {
        if (type instanceof TypeVariable) {
            type = m29772a(list, (TypeVariable) type);
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m29763a(list, m29769a(type)), 0).getClass();
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m29762a((ParameterizedType) type);
        }
        C6381h0.m29668a(type == null, "wildcard type is not supported: %s", type);
        return Object.class;
    }

    /* renamed from: a */
    private static Type m29770a(Type type, Class<?> cls, int i) {
        ParameterizedType a = m29768a(type, cls);
        if (a == null) {
            return null;
        }
        Type type2 = a.getActualTypeArguments()[i];
        if (type2 instanceof TypeVariable) {
            Type a2 = m29772a(Arrays.asList(new Type[]{type}), (TypeVariable) type2);
            if (a2 != null) {
                return a2;
            }
        }
        return type2;
    }

    /* renamed from: a */
    public static <T> Iterable<T> m29765a(Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class cls = obj.getClass();
        C6381h0.m29668a(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new C6410a(obj);
    }

    /* renamed from: a */
    public static Object m29767a(Collection<?> collection, Class<?> cls) {
        if (!cls.isPrimitive()) {
            return collection.toArray((Object[]) Array.newInstance(cls, collection.size()));
        }
        Object newInstance = Array.newInstance(cls, collection.size());
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            Array.set(newInstance, i, obj);
            i = i2;
        }
        return newInstance;
    }
}
