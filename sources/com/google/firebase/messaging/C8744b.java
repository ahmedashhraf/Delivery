package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.measurement.AppMeasurement.C5177d;
import com.google.android.gms.plus.C5493f;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.google.firebase.analytics.p313a.C8617a;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;

@C4056a
/* renamed from: com.google.firebase.messaging.b */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public class C8744b {
    @C4056a
    /* renamed from: a */
    public static void m41008a(Intent intent) {
        m41009a("_nd", intent);
    }

    @C4056a
    /* renamed from: b */
    public static void m41010b(Intent intent) {
        m41009a("_nf", intent);
    }

    @C4056a
    /* renamed from: c */
    public static void m41011c(Intent intent) {
        if (intent != null) {
            String str = "FirebaseMessaging";
            if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                C8617a aVar = (C8617a) FirebaseApp.getInstance().mo31945a(C8617a.class);
                boolean isLoggable = Log.isLoggable(str, 3);
                if (aVar != null) {
                    String stringExtra = intent.getStringExtra("google.c.a.c_id");
                    String str2 = "fcm";
                    aVar.mo31971a(str2, C5177d.f14829c, stringExtra);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "Firebase");
                    bundle.putString(C5854b.f16905L, "notification");
                    bundle.putString(C5854b.f16903J, stringExtra);
                    aVar.logEvent(str2, "_cmp", bundle);
                }
            } else {
                boolean isLoggable2 = Log.isLoggable(str, 3);
            }
        }
        m41009a("_no", intent);
    }

    @C4056a
    /* renamed from: d */
    public static void m41012d(Intent intent) {
        m41009a("_nr", intent);
    }

    @C4056a
    /* renamed from: e */
    public static boolean m41013e(Intent intent) {
        if (intent == null) {
            return false;
        }
        if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    /* renamed from: a */
    private static void m41009a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString(C5493f.f15781i, stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra(PrivacyItem.SUBSCRIPTION_FROM);
        if (stringExtra5 == null || !stringExtra5.startsWith("/topics/")) {
            stringExtra5 = null;
        }
        if (stringExtra5 != null) {
            bundle.putString("_nt", stringExtra5);
        }
        String str2 = "google.c.a.ts";
        if (intent.hasExtra(str2)) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(intent.getStringExtra(str2)));
            } catch (NumberFormatException unused) {
            }
        }
        String str3 = "google.c.a.udt";
        if (intent.hasExtra(str3)) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(intent.getStringExtra(str3)));
            } catch (NumberFormatException unused2) {
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", (intent.getExtras() == null || !C8755m.m41037a(intent.getExtras())) ? "data" : ServerProtocol.DIALOG_PARAM_DISPLAY);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(valueOf).length());
            sb.append("Sending event=");
            sb.append(str);
            sb.append(" params=");
            sb.append(valueOf);
            sb.toString();
        }
        C8617a aVar = (C8617a) FirebaseApp.getInstance().mo31945a(C8617a.class);
        if (aVar != null) {
            aVar.logEvent("fcm", str, bundle);
        }
    }
}
