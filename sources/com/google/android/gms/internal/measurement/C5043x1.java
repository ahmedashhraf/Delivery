package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import androidx.annotation.C0221u;
import androidx.collection.C0635a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.x1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5043x1 implements C4735e1 {
    @C0221u("SharedPreferencesLoader.class")

    /* renamed from: f */
    private static final Map<String, C5043x1> f14496f = new C0635a();

    /* renamed from: a */
    private final SharedPreferences f14497a;

    /* renamed from: b */
    private final OnSharedPreferenceChangeListener f14498b = new C5030w1(this);

    /* renamed from: c */
    private final Object f14499c = new Object();

    /* renamed from: d */
    private volatile Map<String, ?> f14500d;
    @C0221u("this")

    /* renamed from: e */
    private final List<C4753f1> f14501e = new ArrayList();

    private C5043x1(SharedPreferences sharedPreferences) {
        this.f14497a = sharedPreferences;
        this.f14497a.registerOnSharedPreferenceChangeListener(this.f14498b);
    }

    /* renamed from: a */
    static C5043x1 m21766a(Context context, String str) {
        C5043x1 x1Var;
        SharedPreferences sharedPreferences;
        if (!((!C4679a1.m19900a() || str.startsWith("direct_boot:")) ? true : C4679a1.m19901a(context))) {
            return null;
        }
        synchronized (C5043x1.class) {
            x1Var = (C5043x1) f14496f.get(str);
            if (x1Var == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C4679a1.m19900a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                x1Var = new C5043x1(sharedPreferences);
                f14496f.put(str, x1Var);
            }
        }
        return x1Var;
    }

    /* renamed from: a */
    public final Object mo18931a(String str) {
        Map<String, ?> map = this.f14500d;
        if (map == null) {
            synchronized (this.f14499c) {
                map = this.f14500d;
                if (map == null) {
                    map = this.f14497a.getAll();
                    this.f14500d = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* renamed from: a */
    static synchronized void m21767a() {
        synchronized (C5043x1.class) {
            for (C5043x1 x1Var : f14496f.values()) {
                x1Var.f14497a.unregisterOnSharedPreferenceChangeListener(x1Var.f14498b);
            }
            f14496f.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo19734a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14499c) {
            this.f14500d = null;
            C4896o1.m20861c();
        }
        synchronized (this) {
            for (C4753f1 a : this.f14501e) {
                a.mo18979a();
            }
        }
    }
}
