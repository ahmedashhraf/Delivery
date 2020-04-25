package com.google.common.base;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2778d;

/* renamed from: com.google.common.base.m */
/* compiled from: FinalizableReferenceQueue */
public class C7371m implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final Logger f20825O = Logger.getLogger(C7371m.class.getName());

    /* renamed from: P */
    private static final String f20826P = "com.google.common.base.internal.Finalizer";

    /* renamed from: Q */
    private static final Method f20827Q = m35620a(m35619a(new C7375d(), new C7372a(), new C7373b()));

    /* renamed from: N */
    final boolean f20828N;

    /* renamed from: a */
    final ReferenceQueue<Object> f20829a = new ReferenceQueue<>();

    /* renamed from: b */
    final PhantomReference<Object> f20830b = new PhantomReference<>(this, this.f20829a);

    /* renamed from: com.google.common.base.m$a */
    /* compiled from: FinalizableReferenceQueue */
    static class C7372a implements C7374c {

        /* renamed from: a */
        private static final String f20831a = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

        C7372a() {
        }

        /* renamed from: a */
        public Class<?> mo29265a() {
            try {
                return mo29266a(mo29267b()).loadClass(C7371m.f20826P);
            } catch (Exception e) {
                C7371m.f20825O.log(Level.WARNING, f20831a, e);
                return null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public URL mo29267b() throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append(C7371m.f20826P.replace('.', '/'));
            sb.append(".class");
            String sb2 = sb.toString();
            URL resource = C7372a.class.getClassLoader().getResource(sb2);
            if (resource != null) {
                String url = resource.toString();
                if (url.endsWith(sb2)) {
                    return new URL(resource, url.substring(0, url.length() - sb2.length()));
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unsupported path style: ");
                sb3.append(url);
                throw new IOException(sb3.toString());
            }
            throw new FileNotFoundException(sb2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public URLClassLoader mo29266a(URL url) {
            return new URLClassLoader(new URL[]{url}, null);
        }
    }

    /* renamed from: com.google.common.base.m$b */
    /* compiled from: FinalizableReferenceQueue */
    static class C7373b implements C7374c {
        C7373b() {
        }

        /* renamed from: a */
        public Class<?> mo29265a() {
            try {
                return Class.forName("com.google.common.base.m0.a");
            } catch (ClassNotFoundException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.common.base.m$c */
    /* compiled from: FinalizableReferenceQueue */
    interface C7374c {
        /* renamed from: a */
        Class<?> mo29265a();
    }

    /* renamed from: com.google.common.base.m$d */
    /* compiled from: FinalizableReferenceQueue */
    static class C7375d implements C7374c {
        @C2778d

        /* renamed from: a */
        static boolean f20832a;

        C7375d() {
        }

        /* renamed from: a */
        public Class<?> mo29265a() {
            if (f20832a) {
                return null;
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (systemClassLoader != null) {
                    try {
                        return systemClassLoader.loadClass(C7371m.f20826P);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                return null;
            } catch (SecurityException unused2) {
                C7371m.f20825O.info("Not allowed to access system class loader.");
                return null;
            }
        }
    }

    public C7371m() {
        boolean z = true;
        try {
            f20827Q.invoke(null, new Object[]{C7369l.class, this.f20829a, this.f20830b});
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (Throwable th) {
            f20825O.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.f20828N = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo29263a() {
        if (!this.f20828N) {
            while (true) {
                Reference poll = this.f20829a.poll();
                if (poll != null) {
                    poll.clear();
                    try {
                        ((C7369l) poll).mo29262a();
                    } catch (Throwable th) {
                        f20825O.log(Level.SEVERE, "Error cleaning up after reference.", th);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void close() {
        this.f20830b.enqueue();
        mo29263a();
    }

    /* renamed from: a */
    private static Class<?> m35619a(C7374c... cVarArr) {
        for (C7374c a : cVarArr) {
            Class<?> a2 = a.mo29265a();
            if (a2 != null) {
                return a2;
            }
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    static Method m35620a(Class<?> cls) {
        try {
            return cls.getMethod("startFinalizer", new Class[]{Class.class, ReferenceQueue.class, PhantomReference.class});
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        }
    }
}
