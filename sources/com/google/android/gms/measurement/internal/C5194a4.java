package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5194a4 {

    /* renamed from: a */
    private final String f14863a;

    /* renamed from: b */
    private final String f14864b = null;

    /* renamed from: c */
    private boolean f14865c;

    /* renamed from: d */
    private String f14866d;

    /* renamed from: e */
    private final /* synthetic */ C5446x3 f14867e;

    public C5194a4(C5446x3 x3Var, String str, String str2) {
        this.f14867e = x3Var;
        C4300a0.m18630b(str);
        this.f14863a = str;
    }

    @C0226w0
    /* renamed from: a */
    public final String mo21142a() {
        if (!this.f14865c) {
            this.f14865c = true;
            this.f14866d = this.f14867e.m23729C().getString(this.f14863a, null);
        }
        return this.f14866d;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21143a(String str) {
        if (!C5254f9.m22842d(str, this.f14866d)) {
            Editor edit = this.f14867e.m23729C().edit();
            edit.putString(this.f14863a, str);
            edit.apply();
            this.f14866d = str;
        }
    }
}
