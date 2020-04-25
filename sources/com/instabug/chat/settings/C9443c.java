package com.instabug.chat.settings;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.C0213q;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.settings.c */
/* compiled from: PersistableSettings */
public class C9443c {

    /* renamed from: b */
    private static C9443c f25017b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25018c;

    /* renamed from: a */
    private SharedPreferences f25019a;

    private C9443c(SharedPreferences sharedPreferences) {
        boolean[] j = m44231j();
        this.f25019a = sharedPreferences;
        j[0] = true;
    }

    /* renamed from: a */
    static void m44229a(SharedPreferences sharedPreferences) {
        boolean[] j = m44231j();
        f25017b = new C9443c(sharedPreferences);
        j[1] = true;
    }

    /* renamed from: i */
    static C9443c m44230i() {
        boolean[] j = m44231j();
        C9443c cVar = f25017b;
        j[2] = true;
        return cVar;
    }

    /* renamed from: j */
    private static /* synthetic */ boolean[] m44231j() {
        boolean[] zArr = f25018c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5983343758826867758L, "com/instabug/chat/settings/PersistableSettings", 23);
        f25018c = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public long mo34028b() {
        boolean[] j = m44231j();
        long j2 = this.f25019a.getLong("ibc_ttl", 60);
        j[5] = true;
        return j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo34032c() {
        boolean[] j = m44231j();
        boolean z = this.f25019a.getBoolean("ibc_notification_sound", false);
        j[10] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo34034d() {
        boolean[] j = m44231j();
        boolean z = this.f25019a.getBoolean("ibc_in_app_notification_sound", false);
        j[12] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    @C0213q
    /* renamed from: e */
    public int mo34035e() {
        boolean[] j = m44231j();
        int i = this.f25019a.getInt("ibc_push_notification_icon", -1);
        j[14] = true;
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo34037f() {
        boolean[] j = m44231j();
        boolean z = this.f25019a.getBoolean("ibc__notifications_state", true);
        j[16] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo34038g() {
        boolean[] j = m44231j();
        String string = this.f25019a.getString("ibc_push_notification_token", "");
        j[20] = true;
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo34039h() {
        boolean[] j = m44231j();
        boolean z = this.f25019a.getBoolean("ibc_is_push_notification_token_sent", false);
        j[22] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34029b(long j) {
        boolean[] j2 = m44231j();
        this.f25019a.edit().putLong("ibc_ttl", j).apply();
        j2[6] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo34031c(boolean z) {
        boolean[] j = m44231j();
        this.f25019a.edit().putBoolean("ibc_in_app_notification_sound", z).apply();
        j[13] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo34033d(boolean z) {
        boolean[] j = m44231j();
        Editor putBoolean = this.f25019a.edit().putBoolean("ibc__notifications_state", z);
        j[17] = true;
        putBoolean.apply();
        j[18] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo34036e(boolean z) {
        boolean[] j = m44231j();
        this.f25019a.edit().putBoolean("ibc_is_push_notification_token_sent", z).apply();
        j[21] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo34023a() {
        boolean[] j = m44231j();
        long j2 = this.f25019a.getLong("ibc_last_chat_time", System.currentTimeMillis());
        j[3] = true;
        return j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34025a(long j) {
        boolean[] j2 = m44231j();
        this.f25019a.edit().putLong("ibc_last_chat_time", j).apply();
        j2[4] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34030b(boolean z) {
        boolean[] j = m44231j();
        this.f25019a.edit().putBoolean("ibc_notification_sound", z).apply();
        j[11] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34027a(boolean z) {
        boolean[] j = m44231j();
        Editor putBoolean = this.f25019a.edit().putBoolean("ibc_conversation_sounds", z);
        j[8] = true;
        putBoolean.apply();
        j[9] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34024a(@C0213q int i) {
        boolean[] j = m44231j();
        this.f25019a.edit().putInt("ibc_push_notification_icon", i).apply();
        j[15] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34026a(String str) {
        boolean[] j = m44231j();
        this.f25019a.edit().putString("ibc_push_notification_token", str).apply();
        j[19] = true;
    }
}
