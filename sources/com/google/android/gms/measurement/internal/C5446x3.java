package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.C0193h0;
import androidx.annotation.C0226w0;
import com.amplitude.api.C2876e;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.util.C4476d0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5446x3 extends C5360p5 {
    @C4476d0

    /* renamed from: B */
    static final Pair<String, Long> f15566B = new Pair<>("", Long.valueOf(0));

    /* renamed from: A */
    public C5456y3 f15567A = new C5456y3(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: c */
    private SharedPreferences f15568c;

    /* renamed from: d */
    public C5205b4 f15569d;

    /* renamed from: e */
    public final C5456y3 f15570e = new C5456y3(this, "last_upload", 0);

    /* renamed from: f */
    public final C5456y3 f15571f = new C5456y3(this, "last_upload_attempt", 0);

    /* renamed from: g */
    public final C5456y3 f15572g = new C5456y3(this, "backoff", 0);

    /* renamed from: h */
    public final C5456y3 f15573h = new C5456y3(this, "last_delete_stale", 0);

    /* renamed from: i */
    public final C5456y3 f15574i = new C5456y3(this, "midnight_offset", 0);

    /* renamed from: j */
    public final C5456y3 f15575j = new C5456y3(this, "first_open_time", 0);

    /* renamed from: k */
    public final C5456y3 f15576k = new C5456y3(this, "app_install_time", 0);

    /* renamed from: l */
    public final C5194a4 f15577l = new C5194a4(this, "app_instance_id", null);

    /* renamed from: m */
    private String f15578m;

    /* renamed from: n */
    private boolean f15579n;

    /* renamed from: o */
    private long f15580o;

    /* renamed from: p */
    public final C5456y3 f15581p = new C5456y3(this, "time_before_start", 10000);

    /* renamed from: q */
    public final C5456y3 f15582q = new C5456y3(this, "session_timeout", C2876e.f10139p);

    /* renamed from: r */
    public final C5467z3 f15583r = new C5467z3(this, "start_new_session", true);

    /* renamed from: s */
    public final C5194a4 f15584s = new C5194a4(this, "non_personalized_ads", null);

    /* renamed from: t */
    public final C5467z3 f15585t = new C5467z3(this, "use_dynamite_api", false);

    /* renamed from: u */
    public final C5467z3 f15586u = new C5467z3(this, "allow_remote_dynamite", false);

    /* renamed from: v */
    public final C5456y3 f15587v = new C5456y3(this, "last_pause_time", 0);

    /* renamed from: w */
    public final C5456y3 f15588w = new C5456y3(this, "time_active", 0);

    /* renamed from: x */
    public boolean f15589x;

    /* renamed from: y */
    public C5467z3 f15590y = new C5467z3(this, "app_backgrounded", false);

    /* renamed from: z */
    public C5467z3 f15591z = new C5467z3(this, "deep_link_retrieval_complete", false);

    C5446x3(C5359p4 p4Var) {
        super(p4Var);
    }

    /* access modifiers changed from: private */
    @C0226w0
    /* renamed from: C */
    public final SharedPreferences m23729C() {
        mo21209h();
        mo21613o();
        return this.f15568c;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: A */
    public final boolean mo21803A() {
        return this.f15568c.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    @C0226w0
    /* renamed from: a */
    public final Pair<String, Boolean> mo21804a(String str) {
        String str2 = "";
        mo21209h();
        long d = mo21208g().mo18572d();
        String str3 = this.f15578m;
        if (str3 != null && d < this.f15580o) {
            return new Pair<>(str3, Boolean.valueOf(this.f15579n));
        }
        this.f15580o = d + mo21214m().mo21633a(str, C5310l.f15243i);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mo21206e());
            if (advertisingIdInfo != null) {
                this.f15578m = advertisingIdInfo.getId();
                this.f15579n = advertisingIdInfo.isLimitAdTrackingEnabled();
            }
            if (this.f15578m == null) {
                this.f15578m = str2;
            }
        } catch (Exception e) {
            mo21205d().mo21527A().mo21550a("Unable to get advertising id", e);
            this.f15578m = str2;
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f15578m, Boolean.valueOf(this.f15579n));
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final String mo21807b(String str) {
        mo21209h();
        String str2 = (String) mo21804a(str).first;
        MessageDigest x = C5254f9.m22847x();
        if (x == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, x.digest(str2.getBytes()))});
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: c */
    public final void mo21809c(String str) {
        mo21209h();
        Editor edit = m23729C().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: d */
    public final void mo21811d(String str) {
        mo21209h();
        Editor edit = m23729C().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: n */
    public final void mo21388n() {
        this.f15568c = mo21206e().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        String str = "has_been_opened";
        this.f15589x = this.f15568c.getBoolean(str, false);
        if (!this.f15589x) {
            Editor edit = this.f15568c.edit();
            edit.putBoolean(str, true);
            edit.apply();
        }
        C5205b4 b4Var = new C5205b4(this, "health_monitor", Math.max(0, ((Long) C5310l.f15245j.mo21225a(null)).longValue()));
        this.f15569d = b4Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo21326r() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: t */
    public final String mo21813t() {
        mo21209h();
        return m23729C().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: u */
    public final String mo21814u() {
        mo21209h();
        return m23729C().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: v */
    public final Boolean mo21815v() {
        mo21209h();
        String str = "use_service";
        if (!m23729C().contains(str)) {
            return null;
        }
        return Boolean.valueOf(m23729C().getBoolean(str, false));
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: w */
    public final void mo21816w() {
        mo21209h();
        mo21205d().mo21528C().mo21549a("Clearing collection preferences.");
        if (mo21214m().mo21635a(C5310l.f15248k0)) {
            Boolean x = mo21817x();
            Editor edit = m23729C().edit();
            edit.clear();
            edit.apply();
            if (x != null) {
                mo21808b(x.booleanValue());
            }
            return;
        }
        boolean contains = m23729C().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo21810c(true);
        }
        Editor edit2 = m23729C().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            mo21808b(z);
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: x */
    public final Boolean mo21817x() {
        mo21209h();
        String str = "measurement_enabled";
        if (m23729C().contains(str)) {
            return Boolean.valueOf(m23729C().getBoolean(str, true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: y */
    public final String mo21818y() {
        mo21209h();
        String str = "previous_os_version";
        String string = m23729C().getString(str, null);
        mo21210i().mo21613o();
        String str2 = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str2) && !str2.equals(string)) {
            Editor edit = m23729C().edit();
            edit.putString(str, str2);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: z */
    public final boolean mo21819z() {
        mo21209h();
        return m23729C().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: b */
    public final void mo21808b(boolean z) {
        mo21209h();
        mo21205d().mo21528C().mo21550a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m23729C().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: c */
    public final boolean mo21810c(boolean z) {
        mo21209h();
        return m23729C().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: d */
    public final void mo21812d(boolean z) {
        mo21209h();
        mo21205d().mo21528C().mo21550a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m23729C().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: a */
    public final void mo21805a(boolean z) {
        mo21209h();
        mo21205d().mo21528C().mo21550a("Setting useService", Boolean.valueOf(z));
        Editor edit = m23729C().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo21806a(long j) {
        return j - this.f15582q.mo21825a() > this.f15587v.mo21825a();
    }
}
