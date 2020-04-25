package p212io.fabric.sdk.android.p493p.p498e;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.p493p.p495b.C14246g;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14256m;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p495b.C14277x;
import p212io.fabric.sdk.android.services.network.C14388d;

/* renamed from: io.fabric.sdk.android.p.e.r */
/* compiled from: Settings */
public class C14323r {

    /* renamed from: e */
    public static final String f42260e = "com.crashlytics.settings.json";

    /* renamed from: f */
    private static final String f42261f = "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings";

    /* renamed from: a */
    private final AtomicReference<C14329u> f42262a;

    /* renamed from: b */
    private final CountDownLatch f42263b;

    /* renamed from: c */
    private C14328t f42264c;

    /* renamed from: d */
    private boolean f42265d;

    /* renamed from: io.fabric.sdk.android.p.e.r$b */
    /* compiled from: Settings */
    static class C14325b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C14323r f42266a = new C14323r();

        C14325b() {
        }
    }

    /* renamed from: io.fabric.sdk.android.p.e.r$c */
    /* compiled from: Settings */
    public interface C14326c<T> {
        /* renamed from: a */
        T mo45279a(C14329u uVar);
    }

    /* renamed from: e */
    public static C14323r m62045e() {
        return C14325b.f42266a;
    }

    /* renamed from: a */
    public synchronized C14323r mo45272a(C14225i iVar, C14265s sVar, C14388d dVar, String str, String str2, String str3, C14255l lVar) {
        C14225i iVar2 = iVar;
        synchronized (this) {
            if (this.f42265d) {
                return this;
            }
            if (this.f42264c == null) {
                Context context = iVar.getContext();
                String e = sVar.mo45164e();
                String d = new C14246g().mo45138d(context);
                String i = sVar.mo45168i();
                C14277x xVar = new C14277x();
                C14317l lVar2 = new C14317l();
                C14315j jVar = new C14315j(iVar2);
                String c = C14248i.m61828c(context);
                String str4 = str3;
                C14318m mVar = new C14318m(iVar2, str4, String.format(Locale.US, f42261f, new Object[]{e}), dVar);
                String j = sVar.mo45169j();
                String str5 = j;
                String str6 = str2;
                String str7 = str;
                C14332x xVar2 = new C14332x(d, str5, sVar.mo45170k(), sVar.mo45171l(), sVar.mo45165f(), C14248i.m61807a(C14248i.m61847o(context)), str6, str7, C14256m.m61859b(i).mo45149d(), c);
                C14316k kVar = new C14316k(iVar, xVar2, xVar, lVar2, jVar, mVar, lVar);
                this.f42264c = kVar;
            }
            this.f42265d = true;
            return this;
        }
    }

    /* renamed from: b */
    public void mo45276b() {
        this.f42262a.set(null);
    }

    /* renamed from: c */
    public synchronized boolean mo45277c() {
        C14329u a;
        a = this.f42264c.mo45261a();
        m62044a(a);
        return a != null;
    }

    /* renamed from: d */
    public synchronized boolean mo45278d() {
        C14329u a;
        a = this.f42264c.mo45262a(C14327s.SKIP_CACHE_LOOKUP);
        m62044a(a);
        if (a == null) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Failed to force reload of settings from Crashlytics.", null);
        }
        return a != null;
    }

    private C14323r() {
        this.f42262a = new AtomicReference<>();
        this.f42263b = new CountDownLatch(1);
        this.f42265d = false;
    }

    /* renamed from: a */
    public void mo45275a(C14328t tVar) {
        this.f42264c = tVar;
    }

    /* renamed from: a */
    public <T> T mo45274a(C14326c<T> cVar, T t) {
        C14329u uVar = (C14329u) this.f42262a.get();
        return uVar == null ? t : cVar.mo45279a(uVar);
    }

    /* renamed from: a */
    public C14329u mo45273a() {
        try {
            this.f42263b.await();
            return (C14329u) this.f42262a.get();
        } catch (InterruptedException unused) {
            C14215d.m61672j().mo45044e(C14215d.f41919m, "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: a */
    private void m62044a(C14329u uVar) {
        this.f42262a.set(uVar);
        this.f42263b.countDown();
    }
}
