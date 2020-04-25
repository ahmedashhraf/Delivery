package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5467z3 {

    /* renamed from: a */
    private final String f15666a;

    /* renamed from: b */
    private final boolean f15667b;

    /* renamed from: c */
    private boolean f15668c;

    /* renamed from: d */
    private boolean f15669d;

    /* renamed from: e */
    private final /* synthetic */ C5446x3 f15670e;

    public C5467z3(C5446x3 x3Var, String str, boolean z) {
        this.f15670e = x3Var;
        C4300a0.m18630b(str);
        this.f15666a = str;
        this.f15667b = z;
    }

    @C0226w0
    /* renamed from: a */
    public final boolean mo21870a() {
        if (!this.f15668c) {
            this.f15668c = true;
            this.f15669d = this.f15670e.m23729C().getBoolean(this.f15666a, this.f15667b);
        }
        return this.f15669d;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21869a(boolean z) {
        Editor edit = this.f15670e.m23729C().edit();
        edit.putBoolean(this.f15666a, z);
        edit.apply();
        this.f15669d = z;
    }
}
