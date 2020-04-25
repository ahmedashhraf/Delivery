package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.measurement.zzv;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.x5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5448x5 {

    /* renamed from: a */
    final Context f15594a;

    /* renamed from: b */
    String f15595b;

    /* renamed from: c */
    String f15596c;

    /* renamed from: d */
    String f15597d;

    /* renamed from: e */
    Boolean f15598e;

    /* renamed from: f */
    long f15599f;

    /* renamed from: g */
    zzv f15600g;

    /* renamed from: h */
    boolean f15601h = true;

    @C4476d0
    public C5448x5(Context context, zzv zzv) {
        C4300a0.m18620a(context);
        Context applicationContext = context.getApplicationContext();
        C4300a0.m18620a(applicationContext);
        this.f15594a = applicationContext;
        if (zzv != null) {
            this.f15600g = zzv;
            this.f15595b = zzv.f14576Q;
            this.f15596c = zzv.f14575P;
            this.f15597d = zzv.f14574O;
            this.f15601h = zzv.f14573N;
            this.f15599f = zzv.f14579b;
            Bundle bundle = zzv.f14577R;
            if (bundle != null) {
                this.f15598e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
