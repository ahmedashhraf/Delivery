package com.instabug.bug.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.C0195i0;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.settings.c */
/* compiled from: PersistableSettings */
public class C9293c {

    /* renamed from: c */
    private static C9293c f24606c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f24607d;

    /* renamed from: a */
    private SharedPreferences f24608a;

    /* renamed from: b */
    private Editor f24609b = this.f24608a.edit();

    private C9293c(Context context) {
        boolean[] h = m43537h();
        h[0] = true;
        this.f24608a = context.getSharedPreferences("instabug_bug_reporting", 0);
        h[1] = true;
        h[2] = true;
    }

    /* renamed from: a */
    public static void m43535a(Context context) {
        boolean[] h = m43537h();
        f24606c = new C9293c(context);
        h[3] = true;
    }

    /* renamed from: g */
    public static C9293c m43536g() {
        boolean[] h = m43537h();
        C9293c cVar = f24606c;
        h[4] = true;
        return cVar;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m43537h() {
        boolean[] zArr = f24607d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3152187784353023395L, "com/instabug/bug/settings/PersistableSettings", 23);
        f24607d = a;
        return a;
    }

    /* renamed from: b */
    public boolean mo33652b() {
        boolean[] h = m43537h();
        boolean z = this.f24608a.getBoolean("ib_bugreporting_is_email_enabled", true);
        h[8] = true;
        return z;
    }

    /* renamed from: c */
    public long mo33653c() {
        boolean[] h = m43537h();
        long j = this.f24608a.getLong("last_bug_time", 0);
        h[11] = true;
        return j;
    }

    /* renamed from: d */
    public boolean mo33655d() {
        boolean[] h = m43537h();
        boolean z = this.f24608a.getBoolean("ib_bugreporting_success_dialog_enabled", true);
        h[14] = true;
        return z;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public String mo33656e() {
        boolean[] h = m43537h();
        String string = this.f24608a.getString("ib_remote_report_categories", null);
        h[17] = true;
        return string;
    }

    /* renamed from: f */
    public long mo33657f() {
        boolean[] h = m43537h();
        long j = this.f24608a.getLong("report_categories_fetched_time", 0);
        h[20] = true;
        return j;
    }

    /* renamed from: b */
    public void mo33651b(boolean z) {
        boolean[] h = m43537h();
        this.f24609b.putBoolean("ib_bugreporting_is_email_enabled", z);
        h[9] = true;
        this.f24609b.apply();
        h[10] = true;
    }

    /* renamed from: c */
    public void mo33654c(boolean z) {
        boolean[] h = m43537h();
        this.f24609b.putBoolean("ib_bugreporting_success_dialog_enabled", z);
        h[15] = true;
        this.f24609b.apply();
        h[16] = true;
    }

    /* renamed from: a */
    public boolean mo33649a() {
        boolean[] h = m43537h();
        boolean z = this.f24608a.getBoolean("ib_bugreporting_is_email_required", true);
        h[5] = true;
        return z;
    }

    /* renamed from: a */
    public void mo33648a(boolean z) {
        boolean[] h = m43537h();
        this.f24609b.putBoolean("ib_bugreporting_is_email_required", z);
        h[6] = true;
        this.f24609b.apply();
        h[7] = true;
    }

    /* renamed from: b */
    public void mo33650b(long j) {
        boolean[] h = m43537h();
        this.f24609b.putLong("report_categories_fetched_time", j);
        h[21] = true;
        this.f24609b.apply();
        h[22] = true;
    }

    /* renamed from: a */
    public void mo33646a(long j) {
        boolean[] h = m43537h();
        this.f24609b.putLong("last_bug_time", j);
        h[12] = true;
        this.f24609b.apply();
        h[13] = true;
    }

    /* renamed from: a */
    public void mo33647a(String str) {
        boolean[] h = m43537h();
        this.f24609b.putString("ib_remote_report_categories", str);
        h[18] = true;
        this.f24609b.apply();
        h[19] = true;
    }
}
