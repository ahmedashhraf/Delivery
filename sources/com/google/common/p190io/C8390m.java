package com.google.common.p190io;

import com.google.common.base.C7358i0;
import com.google.common.base.C7397x;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.io.m */
/* compiled from: Closer */
public final class C8390m implements Closeable {

    /* renamed from: O */
    private static final C8393c f22286O = (C8392b.m39907b() ? C8392b.f22291a : C8391a.f22290a);

    /* renamed from: N */
    private Throwable f22287N;
    @C2778d

    /* renamed from: a */
    final C8393c f22288a;

    /* renamed from: b */
    private final LinkedList<Closeable> f22289b = new LinkedList<>();

    @C2778d
    /* renamed from: com.google.common.io.m$a */
    /* compiled from: Closer */
    static final class C8391a implements C8393c {

        /* renamed from: a */
        static final C8391a f22290a = new C8391a();

        C8391a() {
        }

        /* renamed from: a */
        public void mo31528a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = C8389l.f22285a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppressing exception thrown when closing ");
            sb.append(closeable);
            logger.log(level, sb.toString(), th2);
        }
    }

    @C2778d
    /* renamed from: com.google.common.io.m$b */
    /* compiled from: Closer */
    static final class C8392b implements C8393c {

        /* renamed from: a */
        static final C8392b f22291a = new C8392b();

        /* renamed from: b */
        static final Method f22292b = m39906a();

        C8392b() {
        }

        /* renamed from: a */
        private static Method m39906a() {
            try {
                return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: b */
        static boolean m39907b() {
            return f22292b != null;
        }

        /* renamed from: a */
        public void mo31528a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    f22292b.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    C8391a.f22290a.mo31528a(closeable, th, th2);
                }
            }
        }
    }

    @C2778d
    /* renamed from: com.google.common.io.m$c */
    /* compiled from: Closer */
    interface C8393c {
        /* renamed from: a */
        void mo31528a(Closeable closeable, Throwable th, Throwable th2);
    }

    @C2778d
    C8390m(C8393c cVar) {
        this.f22288a = (C8393c) C7397x.m35664a(cVar);
    }

    /* renamed from: a */
    public static C8390m m39900a() {
        return new C8390m(f22286O);
    }

    public void close() throws IOException {
        Throwable th = this.f22287N;
        while (!this.f22289b.isEmpty()) {
            Closeable closeable = (Closeable) this.f22289b.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f22288a.mo31528a(closeable, th, th2);
                }
            }
        }
        if (this.f22287N == null && th != null) {
            C7358i0.m35587b(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public <C extends Closeable> C mo31523a(@C5952h C c) {
        if (c != null) {
            this.f22289b.addFirst(c);
        }
        return c;
    }

    /* renamed from: a */
    public RuntimeException mo31524a(Throwable th) throws IOException {
        C7397x.m35664a(th);
        this.f22287N = th;
        C7358i0.m35587b(th, IOException.class);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public <X extends Exception> RuntimeException mo31525a(Throwable th, Class<X> cls) throws IOException, Exception {
        C7397x.m35664a(th);
        this.f22287N = th;
        C7358i0.m35587b(th, IOException.class);
        C7358i0.m35587b(th, cls);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public <X1 extends Exception, X2 extends Exception> RuntimeException mo31526a(Throwable th, Class<X1> cls, Class<X2> cls2) throws IOException, Exception, Exception {
        C7397x.m35664a(th);
        this.f22287N = th;
        C7358i0.m35587b(th, IOException.class);
        C7358i0.m35585a(th, cls, cls2);
        throw new RuntimeException(th);
    }
}
