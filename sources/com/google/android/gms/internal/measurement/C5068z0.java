package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import androidx.annotation.C0221u;
import androidx.collection.C0635a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.z0 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5068z0 implements C4735e1 {
    @C0221u("ConfigurationContentLoader.class")

    /* renamed from: g */
    private static final Map<Uri, C5068z0> f14546g = new C0635a();

    /* renamed from: h */
    private static final String[] f14547h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f14548a;

    /* renamed from: b */
    private final Uri f14549b;

    /* renamed from: c */
    private final ContentObserver f14550c = new C4693b1(this, null);

    /* renamed from: d */
    private final Object f14551d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f14552e;
    @C0221u("this")

    /* renamed from: f */
    private final List<C4753f1> f14553f = new ArrayList();

    private C5068z0(ContentResolver contentResolver, Uri uri) {
        this.f14548a = contentResolver;
        this.f14549b = uri;
        contentResolver.registerContentObserver(uri, false, this.f14550c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C5068z0 m21858a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.z0> r0 = com.google.android.gms.internal.measurement.C5068z0.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.z0> r1 = f14546g     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.z0 r1 = (com.google.android.gms.internal.measurement.C5068z0) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            com.google.android.gms.internal.measurement.z0 r2 = new com.google.android.gms.internal.measurement.z0     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.z0> r3 = f14546g     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5068z0.m21858a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.z0");
    }

    /* renamed from: d */
    static synchronized void m21859d() {
        synchronized (C5068z0.class) {
            for (C5068z0 z0Var : f14546g.values()) {
                z0Var.f14548a.unregisterContentObserver(z0Var.f14550c);
            }
            f14546g.clear();
        }
    }

    /* renamed from: e */
    private final Map<String, String> m21860e() {
        try {
            return (Map) C4785h1.m20254a(new C4721d1(this));
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo19757b() {
        synchronized (this.f14551d) {
            this.f14552e = null;
            C4896o1.m20861c();
        }
        synchronized (this) {
            for (C4753f1 a : this.f14553f) {
                a.mo18979a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Map mo19758c() {
        Map map;
        Cursor query = this.f14548a.query(this.f14549b, f14547h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new C0635a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo19756a() {
        Map<String, String> map = this.f14552e;
        if (map == null) {
            synchronized (this.f14551d) {
                map = this.f14552e;
                if (map == null) {
                    map = m21860e();
                    this.f14552e = map;
                }
            }
        }
        if (map != null) {
            return map;
        }
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18931a(String str) {
        return (String) mo19756a().get(str);
    }
}
