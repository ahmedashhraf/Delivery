package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1699e0.C1700a;
import androidx.recyclerview.widget.C1699e0.C1701b;
import androidx.recyclerview.widget.C1703f0.C1704a;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.recyclerview.widget.u */
/* compiled from: MessageThreadUtil */
class C1766u<T> implements C1699e0<T> {

    /* renamed from: androidx.recyclerview.widget.u$a */
    /* compiled from: MessageThreadUtil */
    class C1767a implements C1701b<T> {

        /* renamed from: f */
        static final int f6875f = 1;

        /* renamed from: g */
        static final int f6876g = 2;

        /* renamed from: h */
        static final int f6877h = 3;

        /* renamed from: a */
        final C1771c f6878a = new C1771c();

        /* renamed from: b */
        private final Handler f6879b = new Handler(Looper.getMainLooper());

        /* renamed from: c */
        private Runnable f6880c = new C1768a();

        /* renamed from: d */
        final /* synthetic */ C1701b f6881d;

        /* renamed from: androidx.recyclerview.widget.u$a$a */
        /* compiled from: MessageThreadUtil */
        class C1768a implements Runnable {
            C1768a() {
            }

            public void run() {
                C1772d a = C1767a.this.f6878a.mo8003a();
                while (a != null) {
                    int i = a.f6899b;
                    if (i == 1) {
                        C1767a.this.f6881d.mo7783b(a.f6900c, a.f6901d);
                    } else if (i == 2) {
                        C1767a.this.f6881d.mo7782a(a.f6900c, (C1704a) a.f6905h);
                    } else if (i != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported message, what=");
                        sb.append(a.f6899b);
                        sb.toString();
                    } else {
                        C1767a.this.f6881d.mo7781a(a.f6900c, a.f6901d);
                    }
                    a = C1767a.this.f6878a.mo8003a();
                }
            }
        }

        C1767a(C1701b bVar) {
            this.f6881d = bVar;
        }

        /* renamed from: a */
        public void mo7782a(int i, C1704a<T> aVar) {
            m9530a(C1772d.m9547a(2, i, (Object) aVar));
        }

        /* renamed from: b */
        public void mo7783b(int i, int i2) {
            m9530a(C1772d.m9545a(1, i, i2));
        }

        /* renamed from: a */
        public void mo7781a(int i, int i2) {
            m9530a(C1772d.m9545a(3, i, i2));
        }

        /* renamed from: a */
        private void m9530a(C1772d dVar) {
            this.f6878a.mo8005a(dVar);
            this.f6879b.post(this.f6880c);
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    /* compiled from: MessageThreadUtil */
    class C1769b implements C1700a<T> {

        /* renamed from: g */
        static final int f6884g = 1;

        /* renamed from: h */
        static final int f6885h = 2;

        /* renamed from: i */
        static final int f6886i = 3;

        /* renamed from: j */
        static final int f6887j = 4;

        /* renamed from: a */
        final C1771c f6888a = new C1771c();

        /* renamed from: b */
        private final Executor f6889b = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: c */
        AtomicBoolean f6890c = new AtomicBoolean(false);

        /* renamed from: d */
        private Runnable f6891d = new C1770a();

        /* renamed from: e */
        final /* synthetic */ C1700a f6892e;

        /* renamed from: androidx.recyclerview.widget.u$b$a */
        /* compiled from: MessageThreadUtil */
        class C1770a implements Runnable {
            C1770a() {
            }

            public void run() {
                while (true) {
                    C1772d a = C1769b.this.f6888a.mo8003a();
                    if (a == null) {
                        C1769b.this.f6890c.set(false);
                        return;
                    }
                    int i = a.f6899b;
                    if (i == 1) {
                        C1769b.this.f6888a.mo8004a(1);
                        C1769b.this.f6892e.mo7784a(a.f6900c);
                    } else if (i == 2) {
                        C1769b.this.f6888a.mo8004a(2);
                        C1769b.this.f6888a.mo8004a(3);
                        C1769b.this.f6892e.mo7786a(a.f6900c, a.f6901d, a.f6902e, a.f6903f, a.f6904g);
                    } else if (i == 3) {
                        C1769b.this.f6892e.mo7785a(a.f6900c, a.f6901d);
                    } else if (i != 4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported message, what=");
                        sb.append(a.f6899b);
                        sb.toString();
                    } else {
                        C1769b.this.f6892e.mo7787a((C1704a) a.f6905h);
                    }
                }
            }
        }

        C1769b(C1700a aVar) {
            this.f6892e = aVar;
        }

        /* renamed from: b */
        private void m9536b(C1772d dVar) {
            this.f6888a.mo8006b(dVar);
            m9534a();
        }

        /* renamed from: a */
        public void mo7784a(int i) {
            m9536b(C1772d.m9547a(1, i, (Object) null));
        }

        /* renamed from: a */
        public void mo7786a(int i, int i2, int i3, int i4, int i5) {
            m9536b(C1772d.m9546a(2, i, i2, i3, i4, i5, null));
        }

        /* renamed from: a */
        public void mo7785a(int i, int i2) {
            m9535a(C1772d.m9545a(3, i, i2));
        }

        /* renamed from: a */
        public void mo7787a(C1704a<T> aVar) {
            m9535a(C1772d.m9547a(4, 0, (Object) aVar));
        }

        /* renamed from: a */
        private void m9535a(C1772d dVar) {
            this.f6888a.mo8005a(dVar);
            m9534a();
        }

        /* renamed from: a */
        private void m9534a() {
            if (this.f6890c.compareAndSet(false, true)) {
                this.f6889b.execute(this.f6891d);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$c */
    /* compiled from: MessageThreadUtil */
    static class C1771c {

        /* renamed from: a */
        private C1772d f6895a;

        C1771c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C1772d mo8003a() {
            if (this.f6895a == null) {
                return null;
            }
            C1772d dVar = this.f6895a;
            this.f6895a = this.f6895a.f6898a;
            return dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized void mo8006b(C1772d dVar) {
            dVar.f6898a = this.f6895a;
            this.f6895a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo8005a(C1772d dVar) {
            if (this.f6895a == null) {
                this.f6895a = dVar;
                return;
            }
            C1772d dVar2 = this.f6895a;
            while (dVar2.f6898a != null) {
                dVar2 = dVar2.f6898a;
            }
            dVar2.f6898a = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo8004a(int i) {
            while (this.f6895a != null && this.f6895a.f6899b == i) {
                C1772d dVar = this.f6895a;
                this.f6895a = this.f6895a.f6898a;
                dVar.mo8007a();
            }
            if (this.f6895a != null) {
                C1772d dVar2 = this.f6895a;
                C1772d dVar3 = dVar2.f6898a;
                while (dVar3 != null) {
                    C1772d dVar4 = dVar3.f6898a;
                    if (dVar3.f6899b == i) {
                        dVar2.f6898a = dVar4;
                        dVar3.mo8007a();
                    } else {
                        dVar2 = dVar3;
                    }
                    dVar3 = dVar4;
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$d */
    /* compiled from: MessageThreadUtil */
    static class C1772d {

        /* renamed from: i */
        private static C1772d f6896i;

        /* renamed from: j */
        private static final Object f6897j = new Object();

        /* renamed from: a */
        C1772d f6898a;

        /* renamed from: b */
        public int f6899b;

        /* renamed from: c */
        public int f6900c;

        /* renamed from: d */
        public int f6901d;

        /* renamed from: e */
        public int f6902e;

        /* renamed from: f */
        public int f6903f;

        /* renamed from: g */
        public int f6904g;

        /* renamed from: h */
        public Object f6905h;

        C1772d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo8007a() {
            this.f6898a = null;
            this.f6904g = 0;
            this.f6903f = 0;
            this.f6902e = 0;
            this.f6901d = 0;
            this.f6900c = 0;
            this.f6899b = 0;
            this.f6905h = null;
            synchronized (f6897j) {
                if (f6896i != null) {
                    this.f6898a = f6896i;
                }
                f6896i = this;
            }
        }

        /* renamed from: a */
        static C1772d m9546a(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C1772d dVar;
            synchronized (f6897j) {
                if (f6896i == null) {
                    dVar = new C1772d();
                } else {
                    dVar = f6896i;
                    f6896i = f6896i.f6898a;
                    dVar.f6898a = null;
                }
                dVar.f6899b = i;
                dVar.f6900c = i2;
                dVar.f6901d = i3;
                dVar.f6902e = i4;
                dVar.f6903f = i5;
                dVar.f6904g = i6;
                dVar.f6905h = obj;
            }
            return dVar;
        }

        /* renamed from: a */
        static C1772d m9545a(int i, int i2, int i3) {
            return m9546a(i, i2, i3, 0, 0, 0, null);
        }

        /* renamed from: a */
        static C1772d m9547a(int i, int i2, Object obj) {
            return m9546a(i, i2, 0, 0, 0, 0, obj);
        }
    }

    C1766u() {
    }

    /* renamed from: a */
    public C1701b<T> mo7797a(C1701b<T> bVar) {
        return new C1767a(bVar);
    }

    /* renamed from: a */
    public C1700a<T> mo7796a(C1700a<T> aVar) {
        return new C1769b(aVar);
    }
}
