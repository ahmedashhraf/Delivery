package com.google.common.util.concurrent;

import com.google.common.base.C7397x;
import com.google.common.collect.C8047m5;
import com.google.common.collect.C8109q4;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.util.concurrent.p0 */
/* compiled from: SimpleTimeLimiter */
public final class C8567p0 implements C8589s0 {

    /* renamed from: a */
    private final ExecutorService f22540a;

    /* renamed from: com.google.common.util.concurrent.p0$a */
    /* compiled from: SimpleTimeLimiter */
    class C8568a implements InvocationHandler {

        /* renamed from: a */
        final /* synthetic */ Object f22541a;

        /* renamed from: b */
        final /* synthetic */ long f22542b;

        /* renamed from: c */
        final /* synthetic */ TimeUnit f22543c;

        /* renamed from: d */
        final /* synthetic */ Set f22544d;

        /* renamed from: com.google.common.util.concurrent.p0$a$a */
        /* compiled from: SimpleTimeLimiter */
        class C8569a implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ Method f22547a;

            /* renamed from: b */
            final /* synthetic */ Object[] f22548b;

            C8569a(Method method, Object[] objArr) {
                this.f22547a = method;
                this.f22548b = objArr;
            }

            public Object call() throws Exception {
                try {
                    return this.f22547a.invoke(C8568a.this.f22541a, this.f22548b);
                } catch (InvocationTargetException e) {
                    C8567p0.m40428b(e, false);
                    throw new AssertionError("can't get here");
                }
            }
        }

        C8568a(Object obj, long j, TimeUnit timeUnit, Set set) {
            this.f22541a = obj;
            this.f22542b = j;
            this.f22543c = timeUnit;
            this.f22544d = set;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            return C8567p0.this.mo31884a((Callable<T>) new C8569a<T>(method, objArr), this.f22542b, this.f22543c, this.f22544d.contains(method));
        }
    }

    public C8567p0(ExecutorService executorService) {
        this.f22540a = (ExecutorService) C7397x.m35664a(executorService);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Exception m40428b(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) C8109q4.m38837a((T[]) cause.getStackTrace(), (T[]) exc.getStackTrace(), StackTraceElement.class));
            }
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw exc;
            }
        } else {
            throw exc;
        }
    }

    /* renamed from: a */
    public <T> T mo31883a(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        C7397x.m35664a(t);
        C7397x.m35664a(cls);
        C7397x.m35664a(timeUnit);
        C7397x.m35672a(j > 0, "bad timeout: %s", Long.valueOf(j));
        C7397x.m35671a(cls.isInterface(), (Object) "interfaceType must be an interface type");
        C8568a aVar = new C8568a(t, j, timeUnit, m40426a(cls));
        return m40425a(cls, (InvocationHandler) aVar);
    }

    public C8567p0() {
        this(Executors.newCachedThreadPool());
    }

    /* renamed from: a */
    public <T> T mo31884a(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        C7397x.m35664a(callable);
        C7397x.m35664a(timeUnit);
        C7397x.m35672a(j > 0, "timeout must be positive: %s", Long.valueOf(j));
        Future submit = this.f22540a.submit(callable);
        if (!z) {
            return C8595u0.m40489a(submit, j, timeUnit);
        }
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            throw m40428b(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new UncheckedTimeoutException((Throwable) e3);
        }
    }

    /* renamed from: a */
    private static Set<Method> m40426a(Class<?> cls) {
        Method[] methods;
        HashSet c = C8047m5.m38530c();
        for (Method method : cls.getMethods()) {
            if (m40427a(method)) {
                c.add(method);
            }
        }
        return c;
    }

    /* renamed from: a */
    private static boolean m40427a(Method method) {
        for (Class<InterruptedException> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static <T> T m40425a(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
