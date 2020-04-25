package p212io.branch.referral;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;

/* renamed from: io.branch.referral.t */
/* compiled from: DeviceInfo */
class C14175t {

    /* renamed from: q */
    private static C14175t f41703q;

    /* renamed from: a */
    private final String f41704a;

    /* renamed from: b */
    private final boolean f41705b;

    /* renamed from: c */
    private final String f41706c;

    /* renamed from: d */
    private final String f41707d;

    /* renamed from: e */
    private final int f41708e;

    /* renamed from: f */
    private final int f41709f;

    /* renamed from: g */
    private final int f41710g;

    /* renamed from: h */
    private final boolean f41711h;

    /* renamed from: i */
    private final String f41712i;

    /* renamed from: j */
    private final String f41713j;

    /* renamed from: k */
    private final int f41714k;

    /* renamed from: l */
    private final String f41715l;

    /* renamed from: m */
    private final String f41716m;

    /* renamed from: n */
    private final String f41717n;

    /* renamed from: o */
    private final String f41718o;

    /* renamed from: p */
    private final String f41719p;

    private C14175t(boolean z, C14161q0 q0Var, boolean z2) {
        if (z2) {
            this.f41704a = q0Var.mo44742a(true);
        } else {
            this.f41704a = q0Var.mo44742a(z);
        }
        this.f41705b = q0Var.mo44754l();
        this.f41706c = q0Var.mo44749g();
        this.f41707d = q0Var.mo44750h();
        DisplayMetrics i = q0Var.mo44751i();
        this.f41708e = i.densityDpi;
        this.f41709f = i.heightPixels;
        this.f41710g = i.widthPixels;
        this.f41711h = q0Var.mo44753k();
        this.f41712i = C14161q0.m61278n();
        this.f41713j = q0Var.mo44746d();
        this.f41714k = q0Var.mo44747e();
        this.f41716m = q0Var.mo44748f();
        this.f41717n = q0Var.mo44741a();
        this.f41718o = q0Var.mo44744b();
        this.f41719p = q0Var.mo44745c();
        this.f41715l = q0Var.mo44752j();
    }

    /* renamed from: a */
    public static C14175t m61316a(boolean z, C14161q0 q0Var, boolean z2) {
        if (f41703q == null) {
            f41703q = new C14175t(z, q0Var, z2);
        }
        return f41703q;
    }

    /* renamed from: f */
    public static C14175t m61318f() {
        return f41703q;
    }

    /* renamed from: b */
    public String mo44782b() {
        if (this.f41704a.equals("bnc_no_value")) {
            return null;
        }
        return this.f41704a;
    }

    /* renamed from: c */
    public String mo44783c() {
        return this.f41713j;
    }

    /* renamed from: d */
    public String mo44784d() {
        return this.f41716m;
    }

    /* renamed from: e */
    public boolean mo44785e() {
        return this.f41705b;
    }

    /* renamed from: a */
    public void mo44781a(JSONObject jSONObject) {
        String str = "bnc_no_value";
        try {
            if (!this.f41704a.equals(str)) {
                jSONObject.put(C14169a.HardwareID.mo44764d(), this.f41704a);
                jSONObject.put(C14169a.IsHardwareIDReal.mo44764d(), this.f41705b);
            }
            if (!this.f41706c.equals(str)) {
                jSONObject.put(C14169a.Brand.mo44764d(), this.f41706c);
            }
            if (!this.f41707d.equals(str)) {
                jSONObject.put(C14169a.Model.mo44764d(), this.f41707d);
            }
            jSONObject.put(C14169a.ScreenDpi.mo44764d(), this.f41708e);
            jSONObject.put(C14169a.ScreenHeight.mo44764d(), this.f41709f);
            jSONObject.put(C14169a.ScreenWidth.mo44764d(), this.f41710g);
            jSONObject.put(C14169a.WiFi.mo44764d(), this.f41711h);
            jSONObject.put(C14169a.UIMode.mo44764d(), this.f41715l);
            if (!this.f41713j.equals(str)) {
                jSONObject.put(C14169a.OS.mo44764d(), this.f41713j);
            }
            jSONObject.put(C14169a.OSVersion.mo44764d(), this.f41714k);
            if (!TextUtils.isEmpty(this.f41718o)) {
                jSONObject.put(C14169a.Country.mo44764d(), this.f41718o);
            }
            if (!TextUtils.isEmpty(this.f41719p)) {
                jSONObject.put(C14169a.Language.mo44764d(), this.f41719p);
            }
            if (!TextUtils.isEmpty(this.f41712i)) {
                jSONObject.put(C14169a.LocalIP.mo44764d(), this.f41712i);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo44780a(Context context, C14204x xVar, JSONObject jSONObject) {
        String str = "bnc_no_value";
        try {
            if (this.f41704a.equals(str) || !this.f41705b) {
                jSONObject.put(C14169a.UnidentifiedDevice.mo44764d(), true);
            } else {
                jSONObject.put(C14169a.AndroidID.mo44764d(), this.f41704a);
            }
            if (!this.f41706c.equals(str)) {
                jSONObject.put(C14169a.Brand.mo44764d(), this.f41706c);
            }
            if (!this.f41707d.equals(str)) {
                jSONObject.put(C14169a.Model.mo44764d(), this.f41707d);
            }
            jSONObject.put(C14169a.ScreenDpi.mo44764d(), this.f41708e);
            jSONObject.put(C14169a.ScreenHeight.mo44764d(), this.f41709f);
            jSONObject.put(C14169a.ScreenWidth.mo44764d(), this.f41710g);
            if (!this.f41713j.equals(str)) {
                jSONObject.put(C14169a.OS.mo44764d(), this.f41713j);
            }
            jSONObject.put(C14169a.OSVersion.mo44764d(), this.f41714k);
            if (!TextUtils.isEmpty(this.f41718o)) {
                jSONObject.put(C14169a.Country.mo44764d(), this.f41718o);
            }
            if (!TextUtils.isEmpty(this.f41719p)) {
                jSONObject.put(C14169a.Language.mo44764d(), this.f41719p);
            }
            if (!TextUtils.isEmpty(this.f41712i)) {
                jSONObject.put(C14169a.LocalIP.mo44764d(), this.f41712i);
            }
            if (xVar != null && !xVar.mo44981k().equals(str)) {
                jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), xVar.mo44981k());
            }
            String q = xVar.mo44993q();
            if (q != null && !q.equals(str)) {
                jSONObject.put(C14169a.DeveloperIdentity.mo44764d(), xVar.mo44993q());
            }
            jSONObject.put(C14169a.AppVersion.mo44764d(), m61318f().mo44779a());
            jSONObject.put(C14169a.SDK.mo44764d(), "android");
            jSONObject.put(C14169a.SdkVersion.mo44764d(), C14160q.f41677f);
            jSONObject.put(C14169a.UserAgent.mo44764d(), m61317a(context));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public String mo44779a() {
        return this.f41717n;
    }

    /* renamed from: a */
    private String m61317a(Context context) {
        if (VERSION.SDK_INT >= 17) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
