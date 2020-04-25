package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.util.C4503v;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import p053b.p068f.p070b.C2125a;
import p076c.p112d.p134b.p135a.p235c.p246i.C6240c;
import p201f.p202a.p203u.C5966a;

/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class FirebaseInstanceIdReceiver extends C2125a {
    @C5966a("FirebaseInstanceIdReceiver.class")

    /* renamed from: d */
    private static C8690e0 f22784d;

    @C4312d0
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public static int m40793a(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean z = true;
        boolean z2 = C4503v.m19420n() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (z2 && !z) {
            return m40795b(broadcastReceiver, context, intent);
        }
        int a = C8721t.m40887b().mo32153a(context, intent);
        if (!C4503v.m19420n() || a != 402) {
            return a;
        }
        m40795b(broadcastReceiver, context, intent);
        return 403;
    }

    /* renamed from: b */
    private static int m40795b(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        m40794a(context, "com.google.firebase.MESSAGING_EVENT").mo32117a(intent, broadcastReceiver.goAsync());
        return -1;
    }

    /* renamed from: c */
    private final void m40796c(Context context, Intent intent) {
        int i;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra(PrivacyItem.SUBSCRIPTION_FROM))) {
            String stringExtra = intent.getStringExtra("CMD");
            if (stringExtra != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(stringExtra).length() + 21 + String.valueOf(valueOf).length());
                    sb.append("Received command: ");
                    sb.append(stringExtra);
                    sb.append(" - ");
                    sb.append(valueOf);
                    sb.toString();
                }
                if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                    FirebaseInstanceId.m40758n().mo32078i();
                } else if (C6240c.f17557a.equals(stringExtra)) {
                    FirebaseInstanceId.m40758n().mo32080k();
                }
            }
            i = -1;
        } else {
            String str = "gcm.rawData64";
            String stringExtra2 = intent.getStringExtra(str);
            if (stringExtra2 != null) {
                intent.putExtra("rawData", Base64.decode(stringExtra2, 0));
                intent.removeExtra(str);
            }
            i = m40793a(this, context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }

    public final void onReceive(@C0193h0 Context context, @C0193h0 Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                m40796c(context, intent2);
            } else {
                m40796c(context, intent);
            }
        }
    }

    /* renamed from: a */
    private static synchronized C8690e0 m40794a(Context context, String str) {
        C8690e0 e0Var;
        synchronized (FirebaseInstanceIdReceiver.class) {
            if (f22784d == null) {
                f22784d = new C8690e0(context, str);
            }
            e0Var = f22784d;
        }
        return e0Var;
    }
}
