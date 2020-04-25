package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4300a0;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.e */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5233e {

    /* renamed from: a */
    final String f14961a;

    /* renamed from: b */
    final String f14962b;

    /* renamed from: c */
    private final String f14963c;

    /* renamed from: d */
    final long f14964d;

    /* renamed from: e */
    final long f14965e;

    /* renamed from: f */
    final zzaf f14966f;

    private C5233e(C5359p4 p4Var, String str, String str2, String str3, long j, long j2, zzaf zzaf) {
        C4300a0.m18630b(str2);
        C4300a0.m18630b(str3);
        C4300a0.m18620a(zzaf);
        this.f14961a = str2;
        this.f14962b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14963c = str;
        this.f14964d = j;
        this.f14965e = j2;
        long j3 = this.f14965e;
        if (j3 != 0 && j3 > this.f14964d) {
            p4Var.mo21205d().mo21536w().mo21551a("Event created with reverse previous/current timestamps. appId, name", C5303k3.m23051a(str2), C5303k3.m23051a(str3));
        }
        this.f14966f = zzaf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C5233e mo21238a(C5359p4 p4Var, long j) {
        C5233e eVar = new C5233e(p4Var, this.f14963c, this.f14961a, this.f14962b, this.f14964d, j, this.f14966f);
        return eVar;
    }

    public final String toString() {
        String str = this.f14961a;
        String str2 = this.f14962b;
        String valueOf = String.valueOf(this.f14966f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    C5233e(C5359p4 p4Var, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzaf zzaf;
        C4300a0.m18630b(str2);
        C4300a0.m18630b(str3);
        this.f14961a = str2;
        this.f14962b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f14963c = str;
        this.f14964d = j;
        this.f14965e = j2;
        long j3 = this.f14965e;
        if (j3 != 0 && j3 > this.f14964d) {
            p4Var.mo21205d().mo21536w().mo21550a("Event created with reverse previous/current timestamps. appId", C5303k3.m23051a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzaf = new zzaf(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    p4Var.mo21205d().mo21533t().mo21549a("Param name can't be null");
                    it.remove();
                } else {
                    Object a = p4Var.mo21607u().mo21364a(str4, bundle2.get(str4));
                    if (a == null) {
                        p4Var.mo21205d().mo21536w().mo21550a("Param value can't be null", p4Var.mo21608v().mo21430b(str4));
                        it.remove();
                    } else {
                        p4Var.mo21607u().mo21368a(bundle2, str4, a);
                    }
                }
            }
            zzaf = new zzaf(bundle2);
        }
        this.f14966f = zzaf;
    }
}
