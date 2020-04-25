package com.google.common.eventbus;

import com.google.common.base.C7397x;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.eventbus.d */
/* compiled from: EventSubscriber */
class C8339d {

    /* renamed from: a */
    private final Object f22234a;

    /* renamed from: b */
    private final Method f22235b;

    C8339d(Object obj, Method method) {
        C7397x.m35665a(obj, (Object) "EventSubscriber target cannot be null.");
        C7397x.m35665a(method, (Object) "EventSubscriber method cannot be null.");
        this.f22234a = obj;
        this.f22235b = method;
        method.setAccessible(true);
    }

    /* renamed from: a */
    public void mo31379a(Object obj) throws InvocationTargetException {
        C7397x.m35664a(obj);
        try {
            this.f22235b.invoke(this.f22234a, new Object[]{obj});
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Method rejected target/argument: ");
            sb.append(obj);
            throw new Error(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Method became inaccessible: ");
            sb2.append(obj);
            throw new Error(sb2.toString(), e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: b */
    public Object mo31380b() {
        return this.f22234a;
    }

    public boolean equals(@C5952h Object obj) {
        if (!(obj instanceof C8339d)) {
            return false;
        }
        C8339d dVar = (C8339d) obj;
        if (this.f22234a != dVar.f22234a || !this.f22235b.equals(dVar.f22235b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f22235b.hashCode() + 31) * 31) + System.identityHashCode(this.f22234a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[wrapper ");
        sb.append(this.f22235b);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public Method mo31378a() {
        return this.f22235b;
    }
}
