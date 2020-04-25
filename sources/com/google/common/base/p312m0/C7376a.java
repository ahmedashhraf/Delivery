package com.google.common.base.p312m0;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.base.m0.a */
/* compiled from: Finalizer */
public class C7376a implements Runnable {

    /* renamed from: O */
    private static final Logger f20833O = Logger.getLogger(C7376a.class.getName());

    /* renamed from: P */
    private static final String f20834P = "com.google.common.base.FinalizableReference";

    /* renamed from: Q */
    private static final Field f20835Q = m35632b();

    /* renamed from: N */
    private final ReferenceQueue<Object> f20836N;

    /* renamed from: a */
    private final WeakReference<Class<?>> f20837a;

    /* renamed from: b */
    private final PhantomReference<Object> f20838b;

    private C7376a(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        this.f20836N = referenceQueue;
        this.f20837a = new WeakReference<>(cls);
        this.f20838b = phantomReference;
    }

    /* renamed from: a */
    public static void m35630a(Class<?> cls, ReferenceQueue<Object> referenceQueue, PhantomReference<Object> phantomReference) {
        if (cls.getName().equals(f20834P)) {
            Thread thread = new Thread(new C7376a(cls, referenceQueue, phantomReference));
            thread.setName(C7376a.class.getName());
            thread.setDaemon(true);
            try {
                if (f20835Q != null) {
                    f20835Q.set(thread, null);
                }
            } catch (Throwable th) {
                f20833O.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", th);
            }
            thread.start();
            return;
        }
        throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
    }

    /* renamed from: b */
    public static Field m35632b() {
        try {
            Field declaredField = Thread.class.getDeclaredField("inheritableThreadLocals");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            f20833O.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:2:0x000a, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.ref.ReferenceQueue<java.lang.Object> r0 = r1.f20836N     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.ref.Reference r0 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
            boolean r0 = r1.m35631a(r0)     // Catch:{ InterruptedException -> 0x0000 }
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.p312m0.C7376a.run():void");
    }

    /* renamed from: a */
    private boolean m35631a(Reference<?> reference) {
        Method a = m35629a();
        if (a == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.f20838b) {
                return false;
            }
            try {
                a.invoke(reference, new Object[0]);
            } catch (Throwable th) {
                f20833O.log(Level.SEVERE, "Error cleaning up after reference.", th);
            }
            reference = this.f20836N.poll();
        } while (reference != null);
        return true;
    }

    /* renamed from: a */
    private Method m35629a() {
        Class cls = (Class) this.f20837a.get();
        if (cls == null) {
            return null;
        }
        try {
            return cls.getMethod("finalizeReferent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }
}
