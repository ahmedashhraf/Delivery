package p212io.fabric.sdk.android.p493p.p495b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.p493p.p497d.C14302d;
import p212io.fabric.sdk.android.p493p.p497d.C14303e;

/* renamed from: io.fabric.sdk.android.p.b.c */
/* compiled from: AdvertisingInfoProvider */
class C14238c {

    /* renamed from: c */
    private static final String f41982c = "TwitterAdvertisingInfoPreferences";

    /* renamed from: d */
    private static final String f41983d = "limit_ad_tracking_enabled";

    /* renamed from: e */
    private static final String f41984e = "advertising_id";

    /* renamed from: a */
    private final Context f41985a;

    /* renamed from: b */
    private final C14302d f41986b;

    /* renamed from: io.fabric.sdk.android.p.b.c$a */
    /* compiled from: AdvertisingInfoProvider */
    class C14239a extends C14247h {

        /* renamed from: a */
        final /* synthetic */ C14237b f41987a;

        C14239a(C14237b bVar) {
            this.f41987a = bVar;
        }

        public void onRun() {
            C14237b a = C14238c.this.m61771e();
            if (!this.f41987a.equals(a)) {
                C14215d.m61672j().mo45042d(C14215d.f41919m, "Asychronously getting Advertising Info and storing it to preferences");
                C14238c.this.m61770c(a);
            }
        }
    }

    public C14238c(Context context) {
        this.f41985a = context.getApplicationContext();
        this.f41986b = new C14303e(context, f41982c);
    }

    /* renamed from: b */
    private void m61769b(C14237b bVar) {
        new Thread(new C14239a(bVar)).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    public void m61770c(C14237b bVar) {
        boolean a = m61768a(bVar);
        String str = f41983d;
        String str2 = f41984e;
        if (a) {
            C14302d dVar = this.f41986b;
            dVar.mo45252a(dVar.mo45251a().putString(str2, bVar.f41980a).putBoolean(str, bVar.f41981b));
            return;
        }
        C14302d dVar2 = this.f41986b;
        dVar2.mo45252a(dVar2.mo45251a().remove(str2).remove(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C14237b m61771e() {
        C14237b a = mo45124c().mo45126a();
        boolean a2 = m61768a(a);
        String str = C14215d.f41919m;
        if (!a2) {
            a = mo45125d().mo45126a();
            if (!m61768a(a)) {
                C14215d.m61672j().mo45042d(str, "AdvertisingInfo not present");
            } else {
                C14215d.m61672j().mo45042d(str, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            C14215d.m61672j().mo45042d(str, "Using AdvertisingInfo from Reflection Provider");
        }
        return a;
    }

    /* renamed from: d */
    public C14245f mo45125d() {
        return new C14241e(this.f41985a);
    }

    /* renamed from: a */
    public C14237b mo45122a() {
        C14237b b = mo45123b();
        if (m61768a(b)) {
            C14215d.m61672j().mo45042d(C14215d.f41919m, "Using AdvertisingInfo from Preference Store");
            m61769b(b);
            return b;
        }
        C14237b e = m61771e();
        m61770c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C14237b mo45123b() {
        return new C14237b(this.f41986b.get().getString(f41984e, ""), this.f41986b.get().getBoolean(f41983d, false));
    }

    /* renamed from: a */
    private boolean m61768a(C14237b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.f41980a);
    }

    /* renamed from: c */
    public C14245f mo45124c() {
        return new C14240d(this.f41985a);
    }
}
