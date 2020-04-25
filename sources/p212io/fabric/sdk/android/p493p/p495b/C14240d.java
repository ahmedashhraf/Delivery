package p212io.fabric.sdk.android.p493p.p495b;

import android.content.Context;
import p212io.fabric.sdk.android.C14215d;

/* renamed from: io.fabric.sdk.android.p.b.d */
/* compiled from: AdvertisingInfoReflectionStrategy */
class C14240d implements C14245f {

    /* renamed from: b */
    private static final int f41989b = 0;

    /* renamed from: c */
    private static final String f41990c = "com.google.android.gms.common.GooglePlayServicesUtil";

    /* renamed from: d */
    private static final String f41991d = "isGooglePlayServicesAvailable";

    /* renamed from: e */
    private static final String f41992e = "com.google.android.gms.ads.identifier.AdvertisingIdClient";

    /* renamed from: f */
    private static final String f41993f = "com.google.android.gms.ads.identifier.AdvertisingIdClient$Info";

    /* renamed from: g */
    private static final String f41994g = "getAdvertisingIdInfo";

    /* renamed from: h */
    private static final String f41995h = "getId";

    /* renamed from: i */
    private static final String f41996i = "isLimitAdTrackingEnabled";

    /* renamed from: a */
    private final Context f41997a;

    public C14240d(Context context) {
        this.f41997a = context.getApplicationContext();
    }

    /* renamed from: b */
    private String m61776b() {
        try {
            return (String) Class.forName(f41993f).getMethod(f41995h, new Class[0]).invoke(m61777c(), new Object[0]);
        } catch (Exception unused) {
            C14215d.m61672j().mo45051w(C14215d.f41919m, "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    /* renamed from: c */
    private Object m61777c() {
        try {
            return Class.forName(f41992e).getMethod(f41994g, new Class[]{Context.class}).invoke(null, new Object[]{this.f41997a});
        } catch (Exception unused) {
            C14215d.m61672j().mo45051w(C14215d.f41919m, "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    /* renamed from: d */
    private boolean m61778d() {
        try {
            return ((Boolean) Class.forName(f41993f).getMethod(f41996i, new Class[0]).invoke(m61777c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C14215d.m61672j().mo45051w(C14215d.f41919m, "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo45127a(Context context) {
        try {
            if (((Integer) Class.forName(f41990c).getMethod(f41991d, new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public C14237b mo45126a() {
        if (mo45127a(this.f41997a)) {
            return new C14237b(m61776b(), m61778d());
        }
        return null;
    }
}
