package androidx.dynamicanimation.p041a;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import androidx.annotation.RequiresApi;
import androidx.collection.C0649h;
import java.util.ArrayList;

/* renamed from: androidx.dynamicanimation.a.a */
/* compiled from: AnimationHandler */
class C1320a {

    /* renamed from: g */
    private static final long f5252g = 10;

    /* renamed from: h */
    public static final ThreadLocal<C1320a> f5253h = new ThreadLocal<>();

    /* renamed from: a */
    private final C0649h<C1322b, Long> f5254a = new C0649h<>();

    /* renamed from: b */
    final ArrayList<C1322b> f5255b = new ArrayList<>();

    /* renamed from: c */
    private final C1321a f5256c = new C1321a();

    /* renamed from: d */
    private C1323c f5257d;

    /* renamed from: e */
    long f5258e = 0;

    /* renamed from: f */
    private boolean f5259f = false;

    /* renamed from: androidx.dynamicanimation.a.a$a */
    /* compiled from: AnimationHandler */
    class C1321a {
        C1321a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5796a() {
            C1320a.this.f5258e = SystemClock.uptimeMillis();
            C1320a aVar = C1320a.this;
            aVar.mo5792a(aVar.f5258e);
            if (C1320a.this.f5255b.size() > 0) {
                C1320a.this.mo5791a().mo5798a();
            }
        }
    }

    /* renamed from: androidx.dynamicanimation.a.a$b */
    /* compiled from: AnimationHandler */
    interface C1322b {
        /* renamed from: a */
        boolean mo5797a(long j);
    }

    /* renamed from: androidx.dynamicanimation.a.a$c */
    /* compiled from: AnimationHandler */
    static abstract class C1323c {

        /* renamed from: a */
        final C1321a f5261a;

        C1323c(C1321a aVar) {
            this.f5261a = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo5798a();
    }

    /* renamed from: androidx.dynamicanimation.a.a$d */
    /* compiled from: AnimationHandler */
    private static class C1324d extends C1323c {

        /* renamed from: b */
        private final Runnable f5262b = new C1325a();

        /* renamed from: c */
        private final Handler f5263c = new Handler(Looper.myLooper());

        /* renamed from: d */
        long f5264d = -1;

        /* renamed from: androidx.dynamicanimation.a.a$d$a */
        /* compiled from: AnimationHandler */
        class C1325a implements Runnable {
            C1325a() {
            }

            public void run() {
                C1324d.this.f5264d = SystemClock.uptimeMillis();
                C1324d.this.f5261a.mo5796a();
            }
        }

        C1324d(C1321a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5798a() {
            this.f5263c.postDelayed(this.f5262b, Math.max(C1320a.f5252g - (SystemClock.uptimeMillis() - this.f5264d), 0));
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.dynamicanimation.a.a$e */
    /* compiled from: AnimationHandler */
    private static class C1326e extends C1323c {

        /* renamed from: b */
        private final Choreographer f5266b = Choreographer.getInstance();

        /* renamed from: c */
        private final FrameCallback f5267c = new C1327a();

        /* renamed from: androidx.dynamicanimation.a.a$e$a */
        /* compiled from: AnimationHandler */
        class C1327a implements FrameCallback {
            C1327a() {
            }

            public void doFrame(long j) {
                C1326e.this.f5261a.mo5796a();
            }
        }

        C1326e(C1321a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5798a() {
            this.f5266b.postFrameCallback(this.f5267c);
        }
    }

    C1320a() {
    }

    /* renamed from: b */
    private boolean m7006b(C1322b bVar, long j) {
        Long l = (Long) this.f5254a.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() >= j) {
            return false;
        }
        this.f5254a.remove(bVar);
        return true;
    }

    /* renamed from: c */
    public static long m7007c() {
        if (f5253h.get() == null) {
            return 0;
        }
        return ((C1320a) f5253h.get()).f5258e;
    }

    /* renamed from: d */
    public static C1320a m7008d() {
        if (f5253h.get() == null) {
            f5253h.set(new C1320a());
        }
        return (C1320a) f5253h.get();
    }

    /* renamed from: a */
    public void mo5795a(C1323c cVar) {
        this.f5257d = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1323c mo5791a() {
        if (this.f5257d == null) {
            if (VERSION.SDK_INT >= 16) {
                this.f5257d = new C1326e(this.f5256c);
            } else {
                this.f5257d = new C1324d(this.f5256c);
            }
        }
        return this.f5257d;
    }

    /* renamed from: b */
    private void m7005b() {
        if (this.f5259f) {
            for (int size = this.f5255b.size() - 1; size >= 0; size--) {
                if (this.f5255b.get(size) == null) {
                    this.f5255b.remove(size);
                }
            }
            this.f5259f = false;
        }
    }

    /* renamed from: a */
    public void mo5794a(C1322b bVar, long j) {
        if (this.f5255b.size() == 0) {
            mo5791a().mo5798a();
        }
        if (!this.f5255b.contains(bVar)) {
            this.f5255b.add(bVar);
        }
        if (j > 0) {
            this.f5254a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    /* renamed from: a */
    public void mo5793a(C1322b bVar) {
        this.f5254a.remove(bVar);
        int indexOf = this.f5255b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f5255b.set(indexOf, null);
            this.f5259f = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5792a(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.f5255b.size(); i++) {
            C1322b bVar = (C1322b) this.f5255b.get(i);
            if (bVar != null && m7006b(bVar, uptimeMillis)) {
                bVar.mo5797a(j);
            }
        }
        m7005b();
    }
}
