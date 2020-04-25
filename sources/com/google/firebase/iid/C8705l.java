package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import com.google.android.gms.common.util.C4503v;
import com.google.common.base.C5785c;
import com.google.firebase.FirebaseApp;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.List;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.l */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8705l {

    /* renamed from: a */
    private final Context f22831a;
    @C5966a("this")

    /* renamed from: b */
    private String f22832b;
    @C5966a("this")

    /* renamed from: c */
    private String f22833c;
    @C5966a("this")

    /* renamed from: d */
    private int f22834d;
    @C5966a("this")

    /* renamed from: e */
    private int f22835e = 0;

    public C8705l(Context context) {
        this.f22831a = context;
    }

    /* renamed from: e */
    private final synchronized void m40849e() {
        PackageInfo a = m40846a(this.f22831a.getPackageName());
        if (a != null) {
            this.f22832b = Integer.toString(a.versionCode);
            this.f22833c = a.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo32137a() {
        if (this.f22835e != 0) {
            return this.f22835e;
        }
        PackageManager packageManager = this.f22831a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C4503v.m19420n()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f22835e = 1;
                return this.f22835e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C4503v.m19420n()) {
                this.f22835e = 2;
            } else {
                this.f22835e = 1;
            }
            return this.f22835e;
        }
        this.f22835e = 2;
        return this.f22835e;
    }

    /* renamed from: b */
    public final synchronized String mo32138b() {
        if (this.f22832b == null) {
            m40849e();
        }
        return this.f22832b;
    }

    /* renamed from: c */
    public final synchronized String mo32139c() {
        if (this.f22833c == null) {
            m40849e();
        }
        return this.f22833c;
    }

    /* renamed from: d */
    public final synchronized int mo32140d() {
        if (this.f22834d == 0) {
            PackageInfo a = m40846a("com.google.android.gms");
            if (a != null) {
                this.f22834d = a.versionCode;
            }
        }
        return this.f22834d;
    }

    /* renamed from: a */
    public static String m40847a(FirebaseApp firebaseApp) {
        String e = firebaseApp.mo31955d().mo32041e();
        if (e != null) {
            return e;
        }
        String b = firebaseApp.mo31955d().mo32038b();
        if (!b.startsWith("1:")) {
            return b;
        }
        String[] split = b.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public static String m40848a(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) ((digest[0] & C5785c.f16698q) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final PackageInfo m40846a(String str) {
        try {
            return this.f22831a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }
}
