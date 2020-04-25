package androidx.lifecycle;

import androidx.annotation.C0195i0;
import androidx.lifecycle.Lifecycle.C1441a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.lifecycle.b */
/* compiled from: ClassesInfoCache */
class C1447b {

    /* renamed from: c */
    static C1447b f5691c = new C1447b();

    /* renamed from: d */
    private static final int f5692d = 0;

    /* renamed from: e */
    private static final int f5693e = 1;

    /* renamed from: f */
    private static final int f5694f = 2;

    /* renamed from: a */
    private final Map<Class, C1448a> f5695a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Boolean> f5696b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    /* compiled from: ClassesInfoCache */
    static class C1448a {

        /* renamed from: a */
        final Map<C1441a, List<C1449b>> f5697a = new HashMap();

        /* renamed from: b */
        final Map<C1449b, C1441a> f5698b;

        C1448a(Map<C1449b, C1441a> map) {
            this.f5698b = map;
            for (Entry entry : map.entrySet()) {
                C1441a aVar = (C1441a) entry.getValue();
                List list = (List) this.f5697a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f5697a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6496a(C1459i iVar, C1441a aVar, Object obj) {
            m7679a((List) this.f5697a.get(aVar), iVar, aVar, obj);
            m7679a((List) this.f5697a.get(C1441a.ON_ANY), iVar, aVar, obj);
        }

        /* renamed from: a */
        private static void m7679a(List<C1449b> list, C1459i iVar, C1441a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C1449b) list.get(size)).mo6497a(iVar, aVar, obj);
                }
            }
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    /* compiled from: ClassesInfoCache */
    static class C1449b {

        /* renamed from: a */
        final int f5699a;

        /* renamed from: b */
        final Method f5700b;

        C1449b(int i, Method method) {
            this.f5699a = i;
            this.f5700b = method;
            this.f5700b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6497a(C1459i iVar, C1441a aVar, Object obj) {
            try {
                int i = this.f5699a;
                if (i == 0) {
                    this.f5700b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f5700b.invoke(obj, new Object[]{iVar});
                } else if (i == 2) {
                    this.f5700b.invoke(obj, new Object[]{iVar, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C1449b.class != obj.getClass()) {
                return false;
            }
            C1449b bVar = (C1449b) obj;
            if (this.f5699a != bVar.f5699a || !this.f5700b.getName().equals(bVar.f5700b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f5699a * 31) + this.f5700b.getName().hashCode();
        }
    }

    C1447b() {
    }

    /* renamed from: c */
    private Method[] m7676c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1448a mo6494a(Class cls) {
        C1448a aVar = (C1448a) this.f5695a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m7674a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6495b(Class cls) {
        Boolean bool = (Boolean) this.f5696b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m7676c(cls);
        for (Method annotation : c) {
            if (((C1469p) annotation.getAnnotation(C1469p.class)) != null) {
                m7674a(cls, c);
                return true;
            }
        }
        this.f5696b.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private void m7675a(Map<C1449b, C1441a> map, C1449b bVar, C1441a aVar, Class cls) {
        C1441a aVar2 = (C1441a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f5700b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C1448a m7674a(Class cls, @C0195i0 Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C1448a a = mo6494a(superclass);
            if (a != null) {
                hashMap.putAll(a.f5698b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo6494a(a2).f5698b.entrySet()) {
                m7675a(hashMap, (C1449b) entry.getKey(), (C1441a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m7676c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C1469p pVar = (C1469p) method.getAnnotation(C1469p.class);
            if (pVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(C1459i.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C1441a value = pVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C1441a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C1441a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m7675a(hashMap, new C1449b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1448a aVar = new C1448a(hashMap);
        this.f5695a.put(cls, aVar);
        this.f5696b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
