package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import p201f.p202a.C5952h;

/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5003u1 {

    /* renamed from: a */
    final String f14424a;

    /* renamed from: b */
    final Uri f14425b;

    /* renamed from: c */
    final String f14426c;

    /* renamed from: d */
    final String f14427d;

    /* renamed from: e */
    final boolean f14428e;

    /* renamed from: f */
    final boolean f14429f;

    /* renamed from: g */
    final boolean f14430g;

    /* renamed from: h */
    final boolean f14431h;
    @C5952h

    /* renamed from: i */
    final C5056y1<Context, Boolean> f14432i;

    public C5003u1(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    /* renamed from: a */
    public final C4896o1<Long> mo19700a(String str, long j) {
        return C4896o1.m20858b(this, str, j);
    }

    private C5003u1(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @C5952h C5056y1<Context, Boolean> y1Var) {
        this.f14424a = null;
        this.f14425b = uri;
        this.f14426c = str2;
        this.f14427d = str3;
        this.f14428e = false;
        this.f14429f = false;
        this.f14430g = false;
        this.f14431h = false;
        this.f14432i = null;
    }

    /* renamed from: a */
    public final C4896o1<Boolean> mo19702a(String str, boolean z) {
        return C4896o1.m20860b(this, str, z);
    }

    /* renamed from: a */
    public final C4896o1<Double> mo19699a(String str, double d) {
        return C4896o1.m20857b(this, str, -3.0d);
    }

    /* renamed from: a */
    public final C4896o1<String> mo19701a(String str, String str2) {
        return C4896o1.m20859b(this, str, str2);
    }
}
