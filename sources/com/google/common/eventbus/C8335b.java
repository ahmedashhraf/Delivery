package com.google.common.eventbus;

import com.google.common.base.C5827t;
import com.google.common.base.C7358i0;
import com.google.common.cache.C5832d;
import com.google.common.cache.C7446i;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C7886h4;
import com.google.common.collect.C8067n2;
import com.google.common.collect.C8257x2;
import com.google.common.util.concurrent.UncheckedExecutionException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p076c.p112d.p148d.p280h.C6693m;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.eventbus.b */
/* compiled from: AnnotatedSubscriberFinder */
class C8335b implements C8342h {

    /* renamed from: a */
    private static final C7446i<Class<?>, C8257x2<Method>> f22229a = C5832d.m25587w().mo23191s().mo23167a((CacheLoader<? super K1, V1>) new C8336a<Object,V1>());

    /* renamed from: com.google.common.eventbus.b$a */
    /* compiled from: AnnotatedSubscriberFinder */
    static class C8336a extends CacheLoader<Class<?>, C8257x2<Method>> {
        C8336a() {
        }

        /* renamed from: a */
        public C8257x2<Method> mo29318a(Class<?> cls) throws Exception {
            return C8335b.m39697c(cls);
        }
    }

    /* renamed from: com.google.common.eventbus.b$b */
    /* compiled from: AnnotatedSubscriberFinder */
    private static final class C8337b {

        /* renamed from: a */
        private final String f22230a;

        /* renamed from: b */
        private final List<Class<?>> f22231b;

        C8337b(Method method) {
            this.f22230a = method.getName();
            this.f22231b = Arrays.asList(method.getParameterTypes());
        }

        public boolean equals(@C5952h Object obj) {
            if (!(obj instanceof C8337b)) {
                return false;
            }
            C8337b bVar = (C8337b) obj;
            if (!this.f22230a.equals(bVar.f22230a) || !this.f22231b.equals(bVar.f22231b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C5827t.m25558a(this.f22230a, this.f22231b);
        }
    }

    C8335b() {
    }

    /* renamed from: b */
    private static C8257x2<Method> m39696b(Class<?> cls) {
        try {
            return (C8257x2) f22229a.mo29334c(cls);
        } catch (UncheckedExecutionException e) {
            throw C7358i0.m35589d(e.getCause());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C8257x2<Method> m39697c(Class<?> cls) {
        Set<Class> H = C6693m.m31985e(cls).mo26850i().mo26860H();
        HashMap c = C7800f4.m37335c();
        for (Class methods : H) {
            Method[] methods2 = methods.getMethods();
            int length = methods2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Method method = methods2[i];
                    if (method.isAnnotationPresent(C5843e.class)) {
                        Class[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1) {
                            C8337b bVar = new C8337b(method);
                            if (!c.containsKey(bVar)) {
                                c.put(bVar, method);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Method ");
                            sb.append(method);
                            sb.append(" has @Subscribe annotation, but requires ");
                            sb.append(parameterTypes.length);
                            sb.append(" arguments.  Event subscriber methods must require a single argument.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    i++;
                }
            }
        }
        return C8257x2.m39405a(c.values());
    }

    /* renamed from: a */
    public C7886h4<Class<?>, C8339d> mo31372a(Object obj) {
        C8067n2 s = C8067n2.m38579s();
        Iterator it = m39696b(obj.getClass()).iterator();
        while (it.hasNext()) {
            Method method = (Method) it.next();
            s.put(method.getParameterTypes()[0], m39694a(obj, method));
        }
        return s;
    }

    /* renamed from: a */
    private static C8339d m39694a(Object obj, Method method) {
        if (m39695a(method)) {
            return new C8339d(obj, method);
        }
        return new C8343i(obj, method);
    }

    /* renamed from: a */
    private static boolean m39695a(Method method) {
        return method.getAnnotation(C5842a.class) != null;
    }
}
