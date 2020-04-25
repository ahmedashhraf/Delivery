package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.C0226w0;
import androidx.core.content.C0841b;
import com.google.android.gms.common.util.C4484g;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.f */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5244f extends C5360p5 {

    /* renamed from: c */
    private long f15012c;

    /* renamed from: d */
    private String f15013d;

    /* renamed from: e */
    private Boolean f15014e;

    /* renamed from: f */
    private AccountManager f15015f;

    /* renamed from: g */
    private Boolean f15016g;

    /* renamed from: h */
    private long f15017h;

    C5244f(C5359p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: a */
    public final boolean mo21325a(Context context) {
        if (this.f15014e == null) {
            mo21189B();
            this.f15014e = Boolean.valueOf(false);
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f15014e = Boolean.valueOf(true);
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return this.f15014e.booleanValue();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo21326r() {
        Calendar instance = Calendar.getInstance();
        this.f15012c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f15013d = sb.toString();
        return false;
    }

    /* renamed from: t */
    public final long mo21327t() {
        mo21613o();
        return this.f15012c;
    }

    /* renamed from: u */
    public final String mo21328u() {
        mo21613o();
        return this.f15013d;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: v */
    public final long mo21329v() {
        mo21209h();
        return this.f15017h;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: w */
    public final void mo21330w() {
        mo21209h();
        this.f15016g = null;
        this.f15017h = 0;
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    /* renamed from: x */
    public final boolean mo21331x() {
        String str = "com.google";
        mo21209h();
        long a = mo21208g().mo18569a();
        if (a - this.f15017h > 86400000) {
            this.f15016g = null;
        }
        Boolean bool = this.f15016g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0841b.m4916a(mo21206e(), "android.permission.GET_ACCOUNTS") != 0) {
            mo21205d().mo21537x().mo21549a("Permission error checking for dasher/unicorn accounts");
            this.f15017h = a;
            this.f15016g = Boolean.valueOf(false);
            return false;
        }
        if (this.f15015f == null) {
            this.f15015f = AccountManager.get(mo21206e());
        }
        try {
            Account[] accountArr = (Account[]) this.f15015f.getAccountsByTypeAndFeatures(str, new String[]{"service_HOSTED"}, null, null).getResult();
            if (accountArr == null || accountArr.length <= 0) {
                Account[] accountArr2 = (Account[]) this.f15015f.getAccountsByTypeAndFeatures(str, new String[]{"service_uca"}, null, null).getResult();
                if (accountArr2 != null && accountArr2.length > 0) {
                    this.f15016g = Boolean.valueOf(true);
                    this.f15017h = a;
                    return true;
                }
                this.f15017h = a;
                this.f15016g = Boolean.valueOf(false);
                return false;
            }
            this.f15016g = Boolean.valueOf(true);
            this.f15017h = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            mo21205d().mo21534u().mo21550a("Exception checking account types", e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
