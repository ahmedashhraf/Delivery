package p212io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.facebook.appevents.AppEventsConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p212io.fabric.sdk.android.p493p.p495b.C14246g;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14256m;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p498e.C14309d;
import p212io.fabric.sdk.android.p493p.p498e.C14310e;
import p212io.fabric.sdk.android.p493p.p498e.C14314i;
import p212io.fabric.sdk.android.p493p.p498e.C14320o;
import p212io.fabric.sdk.android.p493p.p498e.C14323r;
import p212io.fabric.sdk.android.p493p.p498e.C14329u;
import p212io.fabric.sdk.android.p493p.p498e.C14334z;
import p212io.fabric.sdk.android.services.network.C14385b;
import p212io.fabric.sdk.android.services.network.C14388d;

/* renamed from: io.fabric.sdk.android.m */
/* compiled from: Onboarding */
class C14229m extends C14225i<Boolean> {

    /* renamed from: W */
    static final String f41964W = "com.crashlytics.ApiEndpoint";

    /* renamed from: X */
    private static final String f41965X = "binary";

    /* renamed from: N */
    private String f41966N;

    /* renamed from: O */
    private PackageInfo f41967O;

    /* renamed from: P */
    private String f41968P;

    /* renamed from: Q */
    private String f41969Q;

    /* renamed from: R */
    private String f41970R;

    /* renamed from: S */
    private String f41971S;

    /* renamed from: T */
    private String f41972T;

    /* renamed from: U */
    private final Future<Map<String, C14227k>> f41973U;

    /* renamed from: V */
    private final Collection<C14225i> f41974V;

    /* renamed from: a */
    private final C14388d f41975a = new C14385b();

    /* renamed from: b */
    private PackageManager f41976b;

    public C14229m(Future<Map<String, C14227k>> future, Collection<C14225i> collection) {
        this.f41973U = future;
        this.f41974V = collection;
    }

    /* renamed from: b */
    private C14329u m61737b() {
        try {
            C14323r.m62045e().mo45272a(this, this.idManager, this.f41975a, this.f41968P, this.f41969Q, getOverridenSpiEndpoint(), C14255l.m61854a(getContext())).mo45277c();
            return C14323r.m62045e().mo45273a();
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Error dealing with settings", e);
            return null;
        }
    }

    /* renamed from: c */
    private boolean m61739c(String str, C14310e eVar, Collection<C14227k> collection) {
        return m61735a(eVar, C14320o.m62043a(getContext(), str), collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, C14227k> mo45110a(Map<String, C14227k> map, Collection<C14225i> collection) {
        for (C14225i iVar : collection) {
            if (!map.containsKey(iVar.getIdentifier())) {
                map.put(iVar.getIdentifier(), new C14227k(iVar.getIdentifier(), iVar.getVersion(), f41965X));
            }
        }
        return map;
    }

    public String getIdentifier() {
        return "io.fabric.sdk.android:fabric";
    }

    /* access modifiers changed from: 0000 */
    public String getOverridenSpiEndpoint() {
        return C14248i.m61822b(getContext(), f41964W);
    }

    public String getVersion() {
        return "1.4.8.32";
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        try {
            this.f41970R = getIdManager().mo45168i();
            this.f41976b = getContext().getPackageManager();
            this.f41966N = getContext().getPackageName();
            this.f41967O = this.f41976b.getPackageInfo(this.f41966N, 0);
            this.f41968P = Integer.toString(this.f41967O.versionCode);
            this.f41969Q = this.f41967O.versionName == null ? C14265s.f42076o : this.f41967O.versionName;
            this.f41971S = this.f41976b.getApplicationLabel(getContext().getApplicationInfo()).toString();
            this.f41972T = Integer.toString(getContext().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            C14215d.m61672j().mo45045e(C14215d.f41919m, "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        boolean z;
        Map map;
        String c = C14248i.m61828c(getContext());
        C14329u b = m61737b();
        if (b != null) {
            try {
                if (this.f41973U != null) {
                    map = (Map) this.f41973U.get();
                } else {
                    map = new HashMap();
                }
                z = m61736a(c, b.f42267a, mo45110a(map, this.f41974V).values());
            } catch (Exception e) {
                C14215d.m61672j().mo45045e(C14215d.f41919m, "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    private boolean m61736a(String str, C14310e eVar, Collection<C14227k> collection) {
        boolean equals = C14310e.f42205h.equals(eVar.f42209b);
        String str2 = C14215d.f41919m;
        if (!equals) {
            if (C14310e.f42206i.equals(eVar.f42209b)) {
                return C14323r.m62045e().mo45278d();
            }
            if (eVar.f42213f) {
                C14215d.m61672j().mo45042d(str2, "Server says an update is required - forcing a full App update.");
                m61739c(str, eVar, collection);
            }
            return true;
        } else if (m61738b(str, eVar, collection)) {
            return C14323r.m62045e().mo45278d();
        } else {
            C14215d.m61672j().mo45045e(str2, "Failed to create app with Crashlytics service.", null);
            return false;
        }
    }

    /* renamed from: b */
    private boolean m61738b(String str, C14310e eVar, Collection<C14227k> collection) {
        return new C14314i(this, getOverridenSpiEndpoint(), eVar.f42210c, this.f41975a).mo45257a(m61734a(C14320o.m62043a(getContext(), str), collection));
    }

    /* renamed from: a */
    private boolean m61735a(C14310e eVar, C14320o oVar, Collection<C14227k> collection) {
        return new C14334z(this, getOverridenSpiEndpoint(), eVar.f42210c, this.f41975a).mo45257a(m61734a(oVar, collection));
    }

    /* renamed from: a */
    private C14309d m61734a(C14320o oVar, Collection<C14227k> collection) {
        Context context = getContext();
        C14309d dVar = new C14309d(new C14246g().mo45138d(context), getIdManager().mo45164e(), this.f41969Q, this.f41968P, C14248i.m61807a(C14248i.m61847o(context)), this.f41971S, C14256m.m61859b(this.f41970R).mo45149d(), this.f41972T, AppEventsConstants.EVENT_PARAM_VALUE_NO, oVar, collection);
        return dVar;
    }
}
