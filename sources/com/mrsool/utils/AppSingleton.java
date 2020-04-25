package com.mrsool.utils;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.amplitude.api.C2855a;
import com.clevertap.android.sdk.C3070b;
import com.clevertap.android.sdk.C3150p0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mrsool.C10232R;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.utils.ConnectivityChange.NetworkChangeReceiver;
import com.mrsool.utils.webservice.C5882b;
import p053b.p074h.C2133b;
import p212io.branch.referral.C6009d;

public class AppSingleton extends C3070b {

    /* renamed from: P */
    public static C3150p0 f16949P;

    /* renamed from: Q */
    private static AppSingleton f16950Q;

    /* renamed from: R */
    public static FirebaseAnalytics f16951R;

    /* renamed from: N */
    public C5887x f16952N;

    /* renamed from: O */
    public C5881v f16953O;

    /* renamed from: a */
    public FourSquareMainBean f16954a = new FourSquareMainBean();

    /* renamed from: b */
    public ShopDetails f16955b = new ShopDetails();

    /* renamed from: c */
    private void m25736c() {
        C2855a.m13438e().mo11186a((Context) this, getResources().getString(C10232R.string.key_amplitude_live)).mo11185a((Application) this);
    }

    /* renamed from: d */
    public static AppSingleton m25737d() {
        return f16950Q;
    }

    /* renamed from: a */
    public C5887x mo23425a() {
        return this.f16952N;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C2133b.m11110d(this);
    }

    /* renamed from: b */
    public C5881v mo23429b() {
        return this.f16953O;
    }

    public void onCreate() {
        super.onCreate();
        C2133b.m11110d(this);
        f16950Q = this;
        this.f16952N = new C5887x(this);
        this.f16953O = this.f16952N.mo23468C();
        f16951R = FirebaseAnalytics.getInstance(this);
        C5878e eVar = new C5878e();
        registerActivityLifecycleCallbacks(eVar);
        registerComponentCallbacks(eVar);
        try {
            f16949P = C3150p0.m15330m(getApplicationContext());
            f16949P.mo12454a(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C5882b.f17061m.equalsIgnoreCase(C5882b.f17043g);
        try {
            C6009d.m27475a((Context) this);
            C6009d.m27463J().mo24812f("$clevertap_attribution_id", f16949P.mo12477f());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        m25736c();
        registerReceiver(new NetworkChangeReceiver(), new IntentFilter("android.net.wifi.STATE_CHANGE"));
    }

    public void onTrimMemory(int i) {
        C5880q.m25751b("AppSingleton onTrimMemory");
        super.onTrimMemory(i);
    }

    /* renamed from: a */
    public void mo23427a(C5887x xVar) {
        this.f16952N = xVar;
    }

    /* renamed from: a */
    public void mo23426a(C5881v vVar) {
        this.f16953O = vVar;
    }
}
