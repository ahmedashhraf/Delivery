package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C3997b {

    /* renamed from: c */
    private static final Lock f12684c = new ReentrantLock();
    @C5966a("sLk")

    /* renamed from: d */
    private static C3997b f12685d;

    /* renamed from: a */
    private final Lock f12686a = new ReentrantLock();
    @C5966a("mLk")

    /* renamed from: b */
    private final SharedPreferences f12687b;

    @C4476d0
    private C3997b(Context context) {
        this.f12687b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @C4056a
    /* renamed from: a */
    public static C3997b m17378a(Context context) {
        C4300a0.m18620a(context);
        f12684c.lock();
        try {
            if (f12685d == null) {
                f12685d = new C3997b(context.getApplicationContext());
            }
            return f12685d;
        } finally {
            f12684c.unlock();
        }
    }

    @C4056a
    @C5952h
    /* renamed from: b */
    public GoogleSignInAccount mo17521b() {
        return m17377a(m17382c("defaultGoogleSignInAccount"));
    }

    @C4056a
    @C5952h
    /* renamed from: c */
    public GoogleSignInOptions mo17522c() {
        return m17380b(m17382c("defaultGoogleSignInAccount"));
    }

    @C4056a
    @C5952h
    /* renamed from: d */
    public String mo17523d() {
        return m17382c("refreshToken");
    }

    /* renamed from: e */
    public final void mo17524e() {
        String str = "defaultGoogleSignInAccount";
        String c = m17382c(str);
        m17383d(str);
        if (!TextUtils.isEmpty(c)) {
            m17383d(m17381b("googleSignInAccount", c));
            m17383d(m17381b("googleSignInOptions", c));
        }
    }

    /* renamed from: d */
    private final void m17383d(String str) {
        this.f12686a.lock();
        try {
            this.f12687b.edit().remove(str).apply();
        } finally {
            this.f12686a.unlock();
        }
    }

    @C5952h
    @C4476d0
    /* renamed from: b */
    private final GoogleSignInOptions m17380b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m17382c(m17381b("googleSignInOptions", str));
        if (c != null) {
            try {
                return GoogleSignInOptions.m17300c(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @C5952h
    /* renamed from: c */
    private final String m17382c(String str) {
        this.f12686a.lock();
        try {
            return this.f12687b.getString(str, null);
        } finally {
            this.f12686a.unlock();
        }
    }

    /* renamed from: b */
    private static String m17381b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @C4056a
    /* renamed from: a */
    public void mo17520a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C4300a0.m18620a(googleSignInAccount);
        C4300a0.m18620a(googleSignInOptions);
        m17379a("defaultGoogleSignInAccount", googleSignInAccount.mo17454Y());
        C4300a0.m18620a(googleSignInAccount);
        C4300a0.m18620a(googleSignInOptions);
        String Y = googleSignInAccount.mo17454Y();
        m17379a(m17381b("googleSignInAccount", Y), googleSignInAccount.mo17455Z());
        m17379a(m17381b("googleSignInOptions", Y), googleSignInOptions.mo17469V());
    }

    /* renamed from: a */
    private final void m17379a(String str, String str2) {
        this.f12686a.lock();
        try {
            this.f12687b.edit().putString(str, str2).apply();
        } finally {
            this.f12686a.unlock();
        }
    }

    @C5952h
    @C4476d0
    /* renamed from: a */
    private final GoogleSignInAccount m17377a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String c = m17382c(m17381b("googleSignInAccount", str));
        if (c != null) {
            try {
                return GoogleSignInAccount.m17279c(c);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @C4056a
    /* renamed from: a */
    public void mo17519a() {
        this.f12686a.lock();
        try {
            this.f12687b.edit().clear().apply();
        } finally {
            this.f12686a.unlock();
        }
    }
}
