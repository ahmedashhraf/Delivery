package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;
import androidx.annotation.C0221u;
import androidx.collection.C0635a;
import androidx.core.content.C0841b;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.w */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8727w {

    /* renamed from: a */
    private final SharedPreferences f22882a;

    /* renamed from: b */
    private final Context f22883b;

    /* renamed from: c */
    private final C8726v0 f22884c;
    @C0221u("this")

    /* renamed from: d */
    private final Map<String, C8730x0> f22885d;

    public C8727w(Context context) {
        this(context, new C8726v0());
    }

    /* renamed from: c */
    private final synchronized boolean m40918c() {
        return this.f22882a.getAll().isEmpty();
    }

    /* renamed from: a */
    public final synchronized String mo32163a() {
        return this.f22882a.getString("topic_operation_queue", "");
    }

    /* renamed from: b */
    public final synchronized void mo32167b() {
        this.f22885d.clear();
        C8726v0.m40904a(this.f22883b);
        this.f22882a.edit().clear().commit();
    }

    private C8727w(Context context, C8726v0 v0Var) {
        this.f22885d = new C0635a();
        this.f22883b = context;
        this.f22882a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f22884c = v0Var;
        File file = new File(C0841b.m4932f(this.f22883b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m40918c()) {
                    mo32167b();
                    FirebaseInstanceId.m40758n().mo32078i();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String str = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        new String(str);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static String m40917c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized void mo32164a(String str) {
        this.f22882a.edit().putString("topic_operation_queue", str).apply();
    }

    /* renamed from: c */
    public final synchronized void mo32169c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        Editor edit = this.f22882a.edit();
        for (String str2 : this.f22882a.getAll().keySet()) {
            if (str2.startsWith(concat)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: a */
    static String m40916a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public final synchronized C8725v mo32162a(String str, String str2, String str3) {
        return C8725v.m40897b(this.f22882a.getString(m40917c(str, str2, str3), null));
    }

    /* renamed from: b */
    public final synchronized void mo32168b(String str, String str2, String str3) {
        String c = m40917c(str, str2, str3);
        Editor edit = this.f22882a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: a */
    public final synchronized void mo32165a(String str, String str2, String str3, String str4, String str5) {
        String a = C8725v.m40896a(str4, str5, System.currentTimeMillis());
        if (a != null) {
            Editor edit = this.f22882a.edit();
            edit.putString(m40917c(str, str2, str3), a);
            edit.commit();
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.v0.b(android.content.Context, java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        com.google.firebase.iid.FirebaseInstanceId.m40758n().mo32078i();
        r0 = r2.f22884c.mo32161b(r2.f22883b, r3);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0016 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.firebase.iid.C8730x0 mo32166b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.firebase.iid.x0> r0 = r2.f22885d     // Catch:{ all -> 0x002c }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.x0 r0 = (com.google.firebase.iid.C8730x0) r0     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)
            return r0
        L_0x000d:
            com.google.firebase.iid.v0 r0 = r2.f22884c     // Catch:{ y0 -> 0x0016 }
            android.content.Context r1 = r2.f22883b     // Catch:{ y0 -> 0x0016 }
            com.google.firebase.iid.x0 r0 = r0.mo32160a(r1, r3)     // Catch:{ y0 -> 0x0016 }
            goto L_0x0025
        L_0x0016:
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.m40758n()     // Catch:{ all -> 0x002c }
            r0.mo32078i()     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.v0 r0 = r2.f22884c     // Catch:{ all -> 0x002c }
            android.content.Context r1 = r2.f22883b     // Catch:{ all -> 0x002c }
            com.google.firebase.iid.x0 r0 = r0.mo32161b(r1, r3)     // Catch:{ all -> 0x002c }
        L_0x0025:
            java.util.Map<java.lang.String, com.google.firebase.iid.x0> r1 = r2.f22885d     // Catch:{ all -> 0x002c }
            r1.put(r3, r0)     // Catch:{ all -> 0x002c }
            monitor-exit(r2)
            return r0
        L_0x002c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8727w.mo32166b(java.lang.String):com.google.firebase.iid.x0");
    }
}
