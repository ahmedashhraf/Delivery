package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0187e0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.internal.measurement.zzv;

/* renamed from: com.google.android.gms.measurement.internal.f4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5249f4 {

    /* renamed from: a */
    private final C5304k4 f15021a;

    public C5249f4(C5304k4 k4Var) {
        C4300a0.m18620a(k4Var);
        this.f15021a = k4Var;
    }

    /* renamed from: a */
    public static boolean m22764a(Context context) {
        C4300a0.m18620a(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0);
            if (receiverInfo != null && receiverInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    @C0187e0
    /* renamed from: a */
    public final void mo21332a(Context context, Intent intent) {
        C5359p4 a = C5359p4.m23334a(context, (zzv) null);
        C5303k3 d = a.mo21205d();
        if (intent == null) {
            d.mo21536w().mo21549a("Receiver called with null intent");
            return;
        }
        a.mo21189B();
        String action = intent.getAction();
        d.mo21528C().mo21550a("Local receiver got", action);
        String str = "com.google.android.gms.measurement.UPLOAD";
        if (str.equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction(str);
            d.mo21528C().mo21549a("Starting wakeful intent.");
            this.f15021a.mo21091a(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                a.mo21203c().mo21555a((Runnable) new C5282i4(this, a, d));
            } catch (Exception e) {
                d.mo21536w().mo21550a("Install Referrer Reporter encountered a problem", e);
            }
            PendingResult a2 = this.f15021a.mo21090a();
            String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                d.mo21528C().mo21549a("Install referrer extras are null");
                if (a2 != null) {
                    a2.finish();
                }
                return;
            }
            d.mo21539z().mo21550a("Install referrer extras are", stringExtra);
            String str2 = "?";
            if (!stringExtra.contains(str2)) {
                String valueOf = String.valueOf(stringExtra);
                stringExtra = valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2);
            }
            Bundle a3 = a.mo21607u().mo21360a(Uri.parse(stringExtra));
            if (a3 == null) {
                d.mo21528C().mo21549a("No campaign defined in install referrer broadcast");
                if (a2 != null) {
                    a2.finish();
                }
            } else {
                long longExtra = intent.getLongExtra("referrer_timestamp_seconds", 0) * 1000;
                if (longExtra == 0) {
                    d.mo21536w().mo21549a("Install referrer is missing timestamp");
                }
                C5326m4 c = a.mo21203c();
                C5271h4 h4Var = new C5271h4(this, a, longExtra, a3, context, d, a2);
                c.mo21555a((Runnable) h4Var);
            }
        }
    }
}
