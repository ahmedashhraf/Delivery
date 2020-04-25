package com.google.firebase.p318m;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import androidx.annotation.C0224v0;
import androidx.core.content.C0841b;
import com.google.firebase.C8635b;
import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8673c;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.m.a */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8739a {

    /* renamed from: e */
    private static final String f22902e = "com.google.firebase.common.prefs:";
    @C0224v0

    /* renamed from: f */
    public static final String f22903f = "firebase_data_collection_default_enabled";

    /* renamed from: a */
    private final Context f22904a;

    /* renamed from: b */
    private final SharedPreferences f22905b;

    /* renamed from: c */
    private final C8673c f22906c;

    /* renamed from: d */
    private final AtomicBoolean f22907d = new AtomicBoolean(m40942b());

    public C8739a(Context context, String str, C8673c cVar) {
        this.f22904a = m40941a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(f22902e);
        sb.append(str);
        this.f22905b = context.getSharedPreferences(sb.toString(), 0);
        this.f22906c = cVar;
    }

    /* renamed from: a */
    private static Context m40941a(Context context) {
        return (VERSION.SDK_INT < 24 || C0841b.m4934h(context)) ? context : C0841b.m4917a(context);
    }

    /* renamed from: b */
    private boolean m40942b() {
        SharedPreferences sharedPreferences = this.f22905b;
        String str = f22903f;
        if (sharedPreferences.contains(str)) {
            return this.f22905b.getBoolean(str, true);
        }
        try {
            PackageManager packageManager = this.f22904a.getPackageManager();
            if (packageManager != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f22904a.getPackageName(), 128);
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                    return applicationInfo.metaData.getBoolean(str);
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo32188a() {
        return this.f22907d.get();
    }

    /* renamed from: a */
    public void mo32187a(boolean z) {
        if (this.f22907d.compareAndSet(!z, z)) {
            this.f22905b.edit().putBoolean(f22903f, z).apply();
            this.f22906c.mo32030a(new C8671a(C8635b.class, new C8635b(z)));
        }
    }
}
