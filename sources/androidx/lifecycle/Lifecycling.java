package androidx.lifecycle;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.lifecycle.Lifecycle.C1441a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class Lifecycling {

    /* renamed from: a */
    private static final int f5663a = 1;

    /* renamed from: b */
    private static final int f5664b = 2;

    /* renamed from: c */
    private static Map<Class, Integer> f5665c = new HashMap();

    /* renamed from: d */
    private static Map<Class, List<Constructor<? extends C1455e>>> f5666d = new HashMap();

    private Lifecycling() {
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    static C1456f m7639a(Object obj) {
        final C1457g b = m7643b(obj);
        return new C1456f() {
            /* renamed from: a */
            public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
                b.mo632a(iVar, aVar);
            }
        };
    }

    @C0193h0
    /* renamed from: b */
    static C1457g m7643b(Object obj) {
        boolean z = obj instanceof C1457g;
        boolean z2 = obj instanceof C1454d;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C1454d) obj, (C1457g) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C1454d) obj, null);
        }
        if (z) {
            return (C1457g) obj;
        }
        Class cls = obj.getClass();
        if (m7642b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f5666d.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m7638a((Constructor) list.get(0), obj));
        }
        C1455e[] eVarArr = new C1455e[list.size()];
        for (int i = 0; i < list.size(); i++) {
            eVarArr[i] = m7638a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(eVarArr);
    }

    /* renamed from: c */
    private static boolean m7644c(Class<?> cls) {
        return cls != null && C1458h.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m7645d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m7641a(cls);
        if (a != null) {
            f5666d.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C1447b.f5691c.mo6495b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m7644c(superclass)) {
                if (m7642b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f5666d.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m7644c(cls2)) {
                    if (m7642b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f5666d.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f5666d.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static C1455e m7638a(Constructor<? extends C1455e> constructor, Object obj) {
        try {
            return (C1455e) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @C0195i0
    /* renamed from: a */
    private static Constructor<? extends C1455e> m7641a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m7640a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends C1455e> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m7640a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", C14282d.ROLL_OVER_FILE_NAME_SEPARATOR));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* renamed from: b */
    private static int m7642b(Class<?> cls) {
        Integer num = (Integer) f5665c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m7645d(cls);
        f5665c.put(cls, Integer.valueOf(d));
        return d;
    }
}
