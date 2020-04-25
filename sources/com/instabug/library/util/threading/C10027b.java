package com.instabug.library.util.threading;

import android.os.Process;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.concurrent.ThreadFactory;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.util.threading.b */
/* compiled from: PriorityThreadFactory */
public class C10027b implements ThreadFactory {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26682b;

    /* renamed from: a */
    private final int f26683a;

    /* renamed from: com.instabug.library.util.threading.b$a */
    /* compiled from: PriorityThreadFactory */
    class C10028a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26684N;

        /* renamed from: a */
        final /* synthetic */ Runnable f26685a;

        /* renamed from: b */
        final /* synthetic */ C10027b f26686b;

        C10028a(C10027b bVar, Runnable runnable) {
            boolean[] a = m46648a();
            this.f26686b = bVar;
            this.f26685a = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46648a() {
            boolean[] zArr = f26684N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2688285555286876266L, "com/instabug/library/util/threading/PriorityThreadFactory$1", 7);
            f26684N = a;
            return a;
        }

        public void run() {
            boolean[] a = m46648a();
            try {
                Process.setThreadPriority(C10027b.m46646a(this.f26686b));
                a[1] = true;
            } catch (Throwable th) {
                a[2] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("new thread threw an exception");
                a[3] = true;
                sb.append(th.getMessage());
                String sb2 = sb.toString();
                a[4] = true;
                InstabugSDKLogger.m46623e(this, sb2);
                a[5] = true;
            }
            this.f26685a.run();
            a[6] = true;
        }
    }

    public C10027b(int i) {
        boolean[] a = m46647a();
        this.f26683a = i;
        a[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ int m46646a(C10027b bVar) {
        boolean[] a = m46647a();
        int i = bVar.f26683a;
        a[3] = true;
        return i;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m46647a() {
        boolean[] zArr = f26682b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6784589490021955050L, "com/instabug/library/util/threading/PriorityThreadFactory", 4);
        f26682b = a;
        return a;
    }

    public Thread newThread(Runnable runnable) {
        boolean[] a = m46647a();
        C10028a aVar = new C10028a(this, runnable);
        a[1] = true;
        Thread thread = new Thread(aVar);
        a[2] = true;
        return thread;
    }
}
