package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5456y3 {

    /* renamed from: a */
    private final String f15619a;

    /* renamed from: b */
    private final long f15620b;

    /* renamed from: c */
    private boolean f15621c;

    /* renamed from: d */
    private long f15622d;

    /* renamed from: e */
    private final /* synthetic */ C5446x3 f15623e;

    public C5456y3(C5446x3 x3Var, String str, long j) {
        this.f15623e = x3Var;
        C4300a0.m18630b(str);
        this.f15619a = str;
        this.f15620b = j;
    }

    @C0226w0
    /* renamed from: a */
    public final long mo21825a() {
        if (!this.f15621c) {
            this.f15621c = true;
            this.f15622d = this.f15623e.m23729C().getLong(this.f15619a, this.f15620b);
        }
        return this.f15622d;
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21826a(long j) {
        Editor edit = this.f15623e.m23729C().edit();
        edit.putLong(this.f15619a, j);
        edit.apply();
        this.f15622d = j;
    }
}
