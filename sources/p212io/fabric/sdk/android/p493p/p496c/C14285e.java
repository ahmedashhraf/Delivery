package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: io.fabric.sdk.android.p.c.e */
/* compiled from: EventsHandler */
public abstract class C14285e<T> implements C14292h {

    /* renamed from: a */
    protected final Context f42134a;

    /* renamed from: b */
    protected final ScheduledExecutorService f42135b;

    /* renamed from: c */
    protected C14293i<T> f42136c;

    /* renamed from: io.fabric.sdk.android.p.c.e$a */
    /* compiled from: EventsHandler */
    class C14286a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f42138a;

        /* renamed from: b */
        final /* synthetic */ boolean f42139b;

        C14286a(Object obj, boolean z) {
            this.f42138a = obj;
            this.f42139b = z;
        }

        public void run() {
            try {
                C14285e.this.f42136c.mo45201a(this.f42138a);
                if (this.f42139b) {
                    C14285e.this.f42136c.rollFileOver();
                }
            } catch (Exception e) {
                C14248i.m61813a(C14285e.this.f42134a, "Failed to record event.", (Throwable) e);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.p.c.e$b */
    /* compiled from: EventsHandler */
    class C14287b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f42140a;

        C14287b(Object obj) {
            this.f42140a = obj;
        }

        public void run() {
            try {
                C14285e.this.f42136c.mo45201a(this.f42140a);
            } catch (Exception e) {
                C14248i.m61813a(C14285e.this.f42134a, "Crashlytics failed to record event", (Throwable) e);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.p.c.e$c */
    /* compiled from: EventsHandler */
    class C14288c implements Runnable {
        C14288c() {
        }

        public void run() {
            try {
                C14285e.this.f42136c.sendEvents();
            } catch (Exception e) {
                C14248i.m61813a(C14285e.this.f42134a, "Failed to send events files.", (Throwable) e);
            }
        }
    }

    /* renamed from: io.fabric.sdk.android.p.c.e$d */
    /* compiled from: EventsHandler */
    class C14289d implements Runnable {
        C14289d() {
        }

        public void run() {
            try {
                C14293i<T> iVar = C14285e.this.f42136c;
                C14285e.this.f42136c = C14285e.this.mo45223b();
                iVar.deleteAllEvents();
            } catch (Exception e) {
                C14248i.m61813a(C14285e.this.f42134a, "Failed to disable events.", (Throwable) e);
            }
        }
    }

    public C14285e(Context context, C14293i<T> iVar, C14282d dVar, ScheduledExecutorService scheduledExecutorService) {
        this.f42134a = context.getApplicationContext();
        this.f42135b = scheduledExecutorService;
        this.f42136c = iVar;
        dVar.registerRollOverListener(this);
    }

    /* renamed from: a */
    public void mo45221a(T t, boolean z) {
        mo45222a((Runnable) new C14286a(t, z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C14293i<T> mo45223b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo45224b(Runnable runnable) {
        try {
            this.f42135b.submit(runnable).get();
        } catch (Exception e) {
            C14248i.m61813a(this.f42134a, "Failed to run events task", (Throwable) e);
        }
    }

    public void onRollOver(String str) {
        mo45222a((Runnable) new C14288c());
    }

    /* renamed from: a */
    public void mo45220a(T t) {
        mo45224b(new C14287b(t));
    }

    /* renamed from: a */
    public void mo45219a() {
        mo45222a((Runnable) new C14289d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45222a(Runnable runnable) {
        try {
            this.f42135b.submit(runnable);
        } catch (Exception e) {
            C14248i.m61813a(this.f42134a, "Failed to submit events task", (Throwable) e);
        }
    }
}
