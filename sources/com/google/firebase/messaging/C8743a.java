package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.google.android.gms.tasks.C5560k;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.firebase.messaging.a */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public class C8743a {

    /* renamed from: b */
    public static final String f22949b = "FCM";

    /* renamed from: c */
    private static final Pattern f22950c = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: d */
    private static C8743a f22951d;

    /* renamed from: a */
    private final FirebaseInstanceId f22952a;

    private C8743a(FirebaseInstanceId firebaseInstanceId) {
        this.f22952a = firebaseInstanceId;
    }

    @C0193h0
    /* renamed from: b */
    public static synchronized C8743a m41002b() {
        C8743a aVar;
        synchronized (C8743a.class) {
            if (f22951d == null) {
                f22951d = new C8743a(FirebaseInstanceId.m40758n());
            }
            aVar = f22951d;
        }
        return aVar;
    }

    /* renamed from: a */
    public boolean mo32247a() {
        return this.f22952a.mo32081l();
    }

    /* renamed from: a */
    public void mo32246a(boolean z) {
        this.f22952a.mo32070b(z);
    }

    @C0193h0
    /* renamed from: a */
    public C5560k<Void> mo32244a(@C0193h0 String str) {
        if (str != null && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        if (str == null || !f22950c.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.f22952a;
        String str2 = "S!";
        String valueOf = String.valueOf(str);
        return firebaseInstanceId.mo32058a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    @C0193h0
    /* renamed from: b */
    public C5560k<Void> mo32248b(@C0193h0 String str) {
        if (str != null && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        if (str == null || !f22950c.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
            sb.append("Invalid topic name: ");
            sb.append(str);
            sb.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
            throw new IllegalArgumentException(sb.toString());
        }
        FirebaseInstanceId firebaseInstanceId = this.f22952a;
        String str2 = "U!";
        String valueOf = String.valueOf(str);
        return firebaseInstanceId.mo32058a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: a */
    public void mo32245a(@C0193h0 RemoteMessage remoteMessage) {
        if (!TextUtils.isEmpty(remoteMessage.mo32205W())) {
            Context b = FirebaseApp.getInstance().mo31950b();
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra(C14330v.f42313b, PendingIntent.getBroadcast(b, 0, intent2, 0));
            intent.setPackage("com.google.android.gms");
            intent.putExtras(remoteMessage.f22913a);
            b.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }
}
