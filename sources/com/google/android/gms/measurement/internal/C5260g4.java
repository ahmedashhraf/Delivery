package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.C4462a;
import com.google.android.gms.internal.measurement.C4722d2;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;

/* renamed from: com.google.android.gms.measurement.internal.g4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5260g4 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5216c4 f15057N;

    /* renamed from: a */
    private final /* synthetic */ C4722d2 f15058a;

    /* renamed from: b */
    private final /* synthetic */ ServiceConnection f15059b;

    C5260g4(C5216c4 c4Var, C4722d2 d2Var, ServiceConnection serviceConnection) {
        this.f15057N = c4Var;
        this.f15058a = d2Var;
        this.f15059b = serviceConnection;
    }

    public final void run() {
        C5216c4 c4Var = this.f15057N;
        C5238e4 e4Var = c4Var.f14925b;
        String a = c4Var.f14924a;
        C4722d2 d2Var = this.f15058a;
        ServiceConnection serviceConnection = this.f15059b;
        Bundle a2 = e4Var.mo21240a(a, d2Var);
        e4Var.f14970a.mo21203c().mo21209h();
        if (a2 != null) {
            long j = a2.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                e4Var.f14970a.mo21205d().mo21533t().mo21549a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    e4Var.f14970a.mo21205d().mo21533t().mo21549a("No referrer defined in install referrer response");
                } else {
                    e4Var.f14970a.mo21205d().mo21528C().mo21550a("InstallReferrer API result", string);
                    C5254f9 u = e4Var.f14970a.mo21607u();
                    String str = "?";
                    String valueOf = String.valueOf(string);
                    Bundle a3 = u.mo21360a(Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)));
                    if (a3 == null) {
                        e4Var.f14970a.mo21205d().mo21533t().mo21549a("No campaign params defined in install referrer result");
                    } else {
                        String string2 = a3.getString(C5854b.f16905L);
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a2.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                e4Var.f14970a.mo21205d().mo21533t().mo21549a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                a3.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == e4Var.f14970a.mo21601o().f15576k.mo21825a()) {
                            e4Var.f14970a.mo21189B();
                            e4Var.f14970a.mo21205d().mo21528C().mo21549a("Campaign has already been logged");
                        } else {
                            e4Var.f14970a.mo21601o().f15576k.mo21826a(j);
                            e4Var.f14970a.mo21189B();
                            String str2 = "referrer API";
                            e4Var.f14970a.mo21205d().mo21528C().mo21550a("Logging Install Referrer campaign from sdk with ", str2);
                            a3.putString("_cis", str2);
                            e4Var.f14970a.mo21606t().mo21764a("auto", "_cmp", a3);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C4462a.m19276a().mo18550a(e4Var.f14970a.mo21206e(), serviceConnection);
        }
    }
}
