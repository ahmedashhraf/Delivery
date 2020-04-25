package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.p172q.C4438b;
import com.google.android.gms.common.p172q.C4439c;
import com.google.android.gms.common.stats.C4462a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.measurement.C4722d2;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.ForegroundStatus;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5238e4 {

    /* renamed from: a */
    final C5359p4 f14970a;

    C5238e4(C5359p4 p4Var) {
        this.f14970a = p4Var;
    }

    /* access modifiers changed from: protected */
    @C0226w0
    /* renamed from: a */
    public final void mo21241a(String str) {
        if (str == null || str.isEmpty()) {
            this.f14970a.mo21205d().mo21539z().mo21549a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f14970a.mo21203c().mo21209h();
        if (!m22626a()) {
            this.f14970a.mo21205d().mo21539z().mo21549a("Install Referrer Reporter is not available");
            return;
        }
        this.f14970a.mo21205d().mo21539z().mo21549a("Install Referrer Reporter is initializing");
        C5216c4 c4Var = new C5216c4(this, str);
        this.f14970a.mo21203c().mo21209h();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        String str2 = "com.android.vending";
        intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f14970a.mo21206e().getPackageManager();
        if (packageManager == null) {
            this.f14970a.mo21205d().mo21536w().mo21549a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f14970a.mo21205d().mo21539z().mo21549a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
        if (serviceInfo != null) {
            String str3 = serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !str2.equals(str3) || !m22626a()) {
                this.f14970a.mo21205d().mo21539z().mo21549a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f14970a.mo21205d().mo21539z().mo21550a("Install Referrer Service is", C4462a.m19276a().mo18551a(this.f14970a.mo21206e(), new Intent(intent), c4Var, 1) ? ForegroundStatus.VALUE_AVAILABLE : "not available");
                } catch (Exception e) {
                    this.f14970a.mo21205d().mo21533t().mo21550a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    @C4476d0
    /* renamed from: a */
    private final boolean m22626a() {
        boolean z = false;
        try {
            C4438b a = C4439c.m19110a(this.f14970a.mo21206e());
            if (a == null) {
                this.f14970a.mo21205d().mo21539z().mo21549a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo18451b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f14970a.mo21205d().mo21539z().mo21550a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0226w0
    @C0195i0
    @C4476d0
    /* renamed from: a */
    public final Bundle mo21240a(String str, C4722d2 d2Var) {
        this.f14970a.mo21203c().mo21209h();
        if (d2Var == null) {
            this.f14970a.mo21205d().mo21536w().mo21549a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle c = d2Var.mo18905c(bundle);
            if (c != null) {
                return c;
            }
            this.f14970a.mo21205d().mo21533t().mo21549a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f14970a.mo21205d().mo21533t().mo21550a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
