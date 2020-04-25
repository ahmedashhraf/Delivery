package p076c.p112d.p134b.p135a.p143g;

import com.facebook.appevents.AppEventsConstants;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: c.d.b.a.g.n */
/* compiled from: Data */
public class C6398n {

    /* renamed from: a */
    public static final Boolean f17815a = new Boolean(true);

    /* renamed from: b */
    public static final String f17816b = new String();

    /* renamed from: c */
    public static final Character f17817c = new Character(0);

    /* renamed from: d */
    public static final Byte f17818d = new Byte(0);

    /* renamed from: e */
    public static final Short f17819e = new Short(0);

    /* renamed from: f */
    public static final Integer f17820f = new Integer(0);

    /* renamed from: g */
    public static final Float f17821g = new Float(0.0f);

    /* renamed from: h */
    public static final Long f17822h = new Long(0);

    /* renamed from: i */
    public static final Double f17823i = new Double(0.0d);

    /* renamed from: j */
    public static final BigInteger f17824j;

    /* renamed from: k */
    public static final BigDecimal f17825k;

    /* renamed from: l */
    public static final C6405p f17826l = new C6405p(0);

    /* renamed from: m */
    private static final ConcurrentHashMap<Class<?>, Object> f17827m = new ConcurrentHashMap<>();

    static {
        String str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        f17824j = new BigInteger(str);
        f17825k = new BigDecimal(str);
        f17827m.put(Boolean.class, f17815a);
        f17827m.put(String.class, f17816b);
        f17827m.put(Character.class, f17817c);
        f17827m.put(Byte.class, f17818d);
        f17827m.put(Short.class, f17819e);
        f17827m.put(Integer.class, f17820f);
        f17827m.put(Float.class, f17821g);
        f17827m.put(Long.class, f17822h);
        f17827m.put(Double.class, f17823i);
        f17827m.put(BigInteger.class, f17824j);
        f17827m.put(BigDecimal.class, f17825k);
        f17827m.put(C6405p.class, f17826l);
    }

    /* renamed from: a */
    public static <T> T m29715a(T t) {
        T t2;
        if (t == null || m29720a((Type) t.getClass())) {
            return t;
        }
        if (t instanceof C6413s) {
            return ((C6413s) t).clone();
        }
        Class cls = t.getClass();
        if (cls.isArray()) {
            t2 = Array.newInstance(cls.getComponentType(), Array.getLength(t));
        } else if (t instanceof C6357a) {
            t2 = ((C6357a) t).clone();
        } else {
            if ("java.util.Arrays$ArrayList".equals(cls.getName())) {
                Object[] array = ((List) t).toArray();
                m29719a((Object) array, (Object) array);
                return Arrays.asList(array);
            }
            t2 = C6409q0.m29766a(cls);
        }
        m29719a((Object) t, (Object) t2);
        return t2;
    }

    /* renamed from: b */
    public static <T> T m29721b(Class<?> cls) {
        T t = f17827m.get(cls);
        if (t == null) {
            synchronized (f17827m) {
                t = f17827m.get(cls);
                if (t == null) {
                    int i = 0;
                    if (cls.isArray()) {
                        Class<?> cls2 = cls;
                        do {
                            cls2 = cls2.getComponentType();
                            i++;
                        } while (cls2.isArray());
                        t = Array.newInstance(cls2, new int[i]);
                    } else if (cls.isEnum()) {
                        C6412r b = C6387k.m29691a(cls).mo25769b(null);
                        C6381h0.m29665a(b, "enum missing constant with @NullValue annotation: %s", cls);
                        t = b.mo25828a();
                    } else {
                        t = C6409q0.m29766a(cls);
                    }
                    f17827m.put(cls, t);
                }
            }
        }
        return t;
    }

    /* renamed from: c */
    public static boolean m29724c(Object obj) {
        return obj == null || m29720a((Type) obj.getClass());
    }

    /* renamed from: d */
    public static Map<String, Object> m29725d(Object obj) {
        if (obj == null || m29723b(obj)) {
            return Collections.emptyMap();
        }
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return new C6400o(obj, false);
    }

    /* renamed from: a */
    public static void m29719a(Object obj, Object obj2) {
        Class cls = obj.getClass();
        boolean z = true;
        int i = 0;
        C6381h0.m29666a(cls == obj2.getClass());
        if (cls.isArray()) {
            if (Array.getLength(obj) != Array.getLength(obj2)) {
                z = false;
            }
            C6381h0.m29666a(z);
            for (Object a : C6409q0.m29765a(obj)) {
                int i2 = i + 1;
                Array.set(obj2, i, m29715a((T) a));
                i = i2;
            }
        } else if (Collection.class.isAssignableFrom(cls)) {
            Collection<Object> collection = (Collection) obj;
            if (ArrayList.class.isAssignableFrom(cls)) {
                ((ArrayList) obj2).ensureCapacity(collection.size());
            }
            Collection collection2 = (Collection) obj2;
            for (Object a2 : collection) {
                collection2.add(m29715a((T) a2));
            }
        } else {
            boolean isAssignableFrom = C6413s.class.isAssignableFrom(cls);
            if (isAssignableFrom || !Map.class.isAssignableFrom(cls)) {
                C6387k a3 = isAssignableFrom ? ((C6413s) obj).f17875b : C6387k.m29691a(cls);
                for (String b : a3.f17811d) {
                    C6412r b2 = a3.mo25769b(b);
                    if (!b2.mo25836g() && (!isAssignableFrom || !b2.mo25837h())) {
                        Object a4 = b2.mo25829a(obj);
                        if (a4 != null) {
                            b2.mo25830a(obj2, m29715a((T) a4));
                        }
                    }
                }
            } else if (C6357a.class.isAssignableFrom(cls)) {
                C6357a aVar = (C6357a) obj2;
                C6357a aVar2 = (C6357a) obj;
                int size = aVar2.size();
                while (i < size) {
                    aVar.mo25717a(i, m29715a((T) aVar2.mo25724c(i)));
                    i++;
                }
            } else {
                Map map = (Map) obj2;
                for (Entry entry : ((Map) obj).entrySet()) {
                    map.put(entry.getKey(), m29715a((T) entry.getValue()));
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m29723b(Object obj) {
        return obj != null && obj == f17827m.get(obj.getClass());
    }

    /* renamed from: b */
    public static Collection<Object> m29722b(Type type) {
        if (type instanceof WildcardType) {
            type = C6409q0.m29771a((WildcardType) type);
        }
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getRawType();
        }
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || (type instanceof GenericArrayType) || (cls != null && (cls.isArray() || cls.isAssignableFrom(ArrayList.class)))) {
            return new ArrayList();
        }
        if (cls == null) {
            String valueOf = String.valueOf(String.valueOf(type));
            StringBuilder sb = new StringBuilder(valueOf.length() + 39);
            sb.append("unable to create new instance of type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        } else {
            if (cls.isAssignableFrom(TreeSet.class)) {
                return new TreeSet();
            }
            return (Collection) C6409q0.m29766a(cls);
        }
    }

    /* renamed from: a */
    public static boolean m29720a(Type type) {
        if (type instanceof WildcardType) {
            type = C6409q0.m29771a((WildcardType) type);
        }
        boolean z = false;
        if (!(type instanceof Class)) {
            return false;
        }
        Class<Boolean> cls = (Class) type;
        if (cls.isPrimitive() || cls == Character.class || cls == String.class || cls == Integer.class || cls == Long.class || cls == Short.class || cls == Byte.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == C6405p.class || cls == Boolean.class) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static Object m29716a(Type type, String str) {
        Class cls = type instanceof Class ? (Class) type : null;
        if (type == null || cls != null) {
            if (cls == Void.class) {
                return null;
            }
            if (str == null || cls == null || cls.isAssignableFrom(String.class)) {
                return str;
            }
            if (cls == Character.class || cls == Character.TYPE) {
                if (str.length() == 1) {
                    return Character.valueOf(str.charAt(0));
                }
                String valueOf = String.valueOf(String.valueOf(cls));
                StringBuilder sb = new StringBuilder(valueOf.length() + 37);
                sb.append("expected type Character/char but got ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (cls == Boolean.class || cls == Boolean.TYPE) {
                return Boolean.valueOf(str);
            } else {
                if (cls == Byte.class || cls == Byte.TYPE) {
                    return Byte.valueOf(str);
                }
                if (cls == Short.class || cls == Short.TYPE) {
                    return Short.valueOf(str);
                }
                if (cls == Integer.class || cls == Integer.TYPE) {
                    return Integer.valueOf(str);
                }
                if (cls == Long.class || cls == Long.TYPE) {
                    return Long.valueOf(str);
                }
                if (cls == Float.class || cls == Float.TYPE) {
                    return Float.valueOf(str);
                }
                if (cls == Double.class || cls == Double.TYPE) {
                    return Double.valueOf(str);
                }
                if (cls == C6405p.class) {
                    return C6405p.m29731b(str);
                }
                if (cls == BigInteger.class) {
                    return new BigInteger(str);
                }
                if (cls == BigDecimal.class) {
                    return new BigDecimal(str);
                }
                if (cls.isEnum()) {
                    return C6387k.m29691a(cls).mo25769b(str).mo25828a();
                }
            }
        }
        String valueOf2 = String.valueOf(String.valueOf(type));
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 35);
        sb2.append("expected primitive class, but got: ");
        sb2.append(valueOf2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static Map<String, Object> m29718a(Class<?> cls) {
        if (cls == null || cls.isAssignableFrom(C6357a.class)) {
            return C6357a.m29612c();
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new TreeMap();
        }
        return (Map) C6409q0.m29766a(cls);
    }

    /* renamed from: a */
    public static Type m29717a(List<Type> list, Type type) {
        if (type instanceof WildcardType) {
            type = C6409q0.m29771a((WildcardType) type);
        }
        while (type instanceof TypeVariable) {
            Type a = C6409q0.m29772a(list, (TypeVariable) type);
            if (a != null) {
                type = a;
            }
            if (type instanceof TypeVariable) {
                type = ((TypeVariable) type).getBounds()[0];
            }
        }
        return type;
    }
}
