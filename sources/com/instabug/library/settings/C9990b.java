package com.instabug.library.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.C0193h0;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.broadcast.LastContactedChangedBroadcast;
import com.instabug.library.p397ui.onboarding.WelcomeMessage.State;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.settings.b */
/* compiled from: PersistableSettings */
public class C9990b {

    /* renamed from: b */
    private static C9990b f26584b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26585c;

    /* renamed from: a */
    private SharedPreferences f26586a;

    private C9990b(Context context) {
        boolean[] z = m46480z();
        z[0] = true;
        this.f26586a = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        z[1] = true;
    }

    /* renamed from: A */
    public static C9990b m46478A() {
        boolean[] z = m46480z();
        C9990b bVar = f26584b;
        z[3] = true;
        return bVar;
    }

    /* renamed from: a */
    public static void m46479a(Context context) {
        boolean[] z = m46480z();
        f26584b = new C9990b(context);
        z[2] = true;
    }

    /* renamed from: z */
    private static /* synthetic */ boolean[] m46480z() {
        boolean[] zArr = f26585c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4594104655933448636L, "com/instabug/library/settings/PersistableSettings", 59);
        f26585c = a;
        return a;
    }

    @C0193h0
    /* renamed from: b */
    public String mo35766b() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("identified_name", "");
        z[8] = true;
        return string;
    }

    /* renamed from: c */
    public String mo35770c() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("identified_email", "");
        z[10] = true;
        return string;
    }

    /* renamed from: d */
    public boolean mo35775d() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_device_registered", false);
        z[12] = true;
        return z2;
    }

    /* renamed from: e */
    public boolean mo35778e() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_first_run", true);
        z[14] = true;
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public long mo35779f() {
        boolean[] z = m46480z();
        long j = this.f26586a.getLong("ib_first_run_at", 0);
        z[17] = true;
        return j;
    }

    /* renamed from: g */
    public long mo35782g() {
        boolean[] z = m46480z();
        long j = this.f26586a.getLong(LastContactedChangedBroadcast.LAST_CONTACTED_AT, 0);
        z[19] = true;
        return j;
    }

    /* renamed from: h */
    public boolean mo35787h() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_pn", true);
        z[21] = true;
        return z2;
    }

    /* renamed from: i */
    public int mo35788i() {
        boolean[] z = m46480z();
        int i = this.f26586a.getInt("last_migration_version", 0);
        z[24] = true;
        return i;
    }

    /* renamed from: j */
    public boolean mo35790j() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_first_dismiss", true);
        z[26] = true;
        return z2;
    }

    /* renamed from: k */
    public InstabugColorTheme mo35791k() {
        boolean[] z = m46480z();
        SharedPreferences sharedPreferences = this.f26586a;
        InstabugColorTheme instabugColorTheme = InstabugColorTheme.InstabugColorThemeLight;
        z[28] = true;
        String name = instabugColorTheme.name();
        z[29] = true;
        InstabugColorTheme valueOf = InstabugColorTheme.valueOf(sharedPreferences.getString("ib_color_theme", name));
        z[30] = true;
        return valueOf;
    }

    /* renamed from: l */
    public String mo35792l() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("entered_name", "");
        z[33] = true;
        return string;
    }

    /* renamed from: m */
    public String mo35793m() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_uuid", null);
        z[34] = true;
        return string;
    }

    /* renamed from: n */
    public String mo35794n() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_md5_uuid", null);
        z[36] = true;
        return string;
    }

    /* renamed from: o */
    public String mo35795o() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_user_data", "");
        z[38] = true;
        return string;
    }

    /* renamed from: p */
    public boolean mo35796p() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_is_user_logged_out", true);
        z[40] = true;
        return z2;
    }

    /* renamed from: q */
    public boolean mo35797q() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_should_make_uuid_migration_request", false);
        z[42] = true;
        return z2;
    }

    /* renamed from: r */
    public String mo35798r() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_sdk_version", "8.0.11");
        z[47] = true;
        return string;
    }

    /* renamed from: s */
    public boolean mo35799s() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("ib_is_sdk_version_set", false);
        z[48] = true;
        return z2;
    }

    /* renamed from: t */
    public int mo35800t() {
        boolean[] z = m46480z();
        int i = this.f26586a.getInt("ib_sessions_count", 0);
        z[49] = true;
        return i;
    }

    /* renamed from: u */
    public void mo35801u() {
        boolean[] z = m46480z();
        this.f26586a.edit().putInt("ib_sessions_count", mo35800t() + 1).apply();
        z[50] = true;
    }

    /* renamed from: v */
    public String mo35802v() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("entered_email", "");
        z[52] = true;
        return string;
    }

    /* renamed from: w */
    public boolean mo35803w() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("session_status", true);
        z[54] = true;
        return z2;
    }

    /* renamed from: x */
    public String mo35804x() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_welcome_msg_state", State.LIVE.toString());
        z[55] = true;
        return string;
    }

    /* renamed from: y */
    public boolean mo35805y() {
        boolean[] z = m46480z();
        boolean z2 = this.f26586a.getBoolean("should_show_onboarding", true);
        z[58] = true;
        return z2;
    }

    /* renamed from: b */
    public void mo35768b(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("identified_name", str).apply();
        z[9] = true;
    }

    /* renamed from: c */
    public void mo35771c(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("identified_email", str).apply();
        z[11] = true;
    }

    /* renamed from: d */
    public void mo35774d(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("ib_first_dismiss", z).apply();
        z2[27] = true;
    }

    /* renamed from: e */
    public void mo35776e(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_uuid", str).apply();
        z[35] = true;
    }

    /* renamed from: f */
    public void mo35780f(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_md5_uuid", str).apply();
        z[37] = true;
    }

    /* renamed from: g */
    public void mo35783g(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_user_data", str).apply();
        z[39] = true;
    }

    /* renamed from: h */
    public void mo35785h(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_sdk_version", str).apply();
        z[45] = true;
        this.f26586a.edit().putBoolean("ib_is_sdk_version_set", true).apply();
        z[46] = true;
    }

    /* renamed from: i */
    public void mo35789i(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("entered_email", str).apply();
        z[51] = true;
    }

    /* renamed from: a */
    public String mo35759a() {
        boolean[] z = m46480z();
        String string = this.f26586a.getString("ib_app_token", null);
        z[6] = true;
        return string;
    }

    /* renamed from: a */
    public void mo35764a(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_app_token", str).apply();
        z[7] = true;
    }

    /* renamed from: b */
    public void mo35769b(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("ib_first_run", z).apply();
        z2[15] = true;
        this.f26586a.edit().putLong("ib_first_run_at", System.currentTimeMillis()).apply();
        z2[16] = true;
    }

    /* renamed from: c */
    public void mo35772c(boolean z) {
        boolean[] z2 = m46480z();
        Editor putBoolean = this.f26586a.edit().putBoolean("ib_pn", z);
        z2[22] = true;
        putBoolean.apply();
        z2[23] = true;
    }

    /* renamed from: d */
    public void mo35773d(String str) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("entered_name", str).apply();
        z[32] = true;
    }

    /* renamed from: e */
    public void mo35777e(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("ib_is_user_logged_out", z).apply();
        z2[41] = true;
    }

    /* renamed from: f */
    public void mo35781f(boolean z) {
        boolean[] z2 = m46480z();
        Editor putBoolean = this.f26586a.edit().putBoolean("ib_should_make_uuid_migration_request", z);
        z2[43] = true;
        putBoolean.apply();
        z2[44] = true;
    }

    /* renamed from: g */
    public void mo35784g(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("session_status", z).apply();
        z2[53] = true;
    }

    /* renamed from: h */
    public void mo35786h(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("should_show_onboarding", z).apply();
        z2[57] = true;
    }

    /* renamed from: a */
    public void mo35765a(boolean z) {
        boolean[] z2 = m46480z();
        this.f26586a.edit().putBoolean("ib_device_registered", z).apply();
        z2[13] = true;
    }

    /* renamed from: b */
    public void mo35767b(long j) {
        boolean[] z = m46480z();
        this.f26586a.edit().putLong(LastContactedChangedBroadcast.LAST_CONTACTED_AT, j).apply();
        z[20] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35761a(long j) {
        boolean[] z = m46480z();
        this.f26586a.edit().putLong("ib_first_run_at", j).apply();
        z[18] = true;
    }

    /* renamed from: a */
    public void mo35760a(int i) {
        boolean[] z = m46480z();
        this.f26586a.edit().putInt("last_migration_version", i).apply();
        z[25] = true;
    }

    /* renamed from: a */
    public void mo35762a(InstabugColorTheme instabugColorTheme) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_color_theme", instabugColorTheme.name()).apply();
        z[31] = true;
    }

    /* renamed from: a */
    public void mo35763a(State state) {
        boolean[] z = m46480z();
        this.f26586a.edit().putString("ib_welcome_msg_state", state.toString()).apply();
        z[56] = true;
    }
}
