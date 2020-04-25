package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences.Editor;
import android.util.Pair;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5205b4 {
    @C4476d0

    /* renamed from: a */
    private final String f14892a;

    /* renamed from: b */
    private final String f14893b;

    /* renamed from: c */
    private final String f14894c;

    /* renamed from: d */
    private final long f14895d;

    /* renamed from: e */
    private final /* synthetic */ C5446x3 f14896e;

    private C5205b4(C5446x3 x3Var, String str, long j) {
        this.f14896e = x3Var;
        C4300a0.m18630b(str);
        C4300a0.m18627a(j > 0);
        this.f14892a = String.valueOf(str).concat(":start");
        this.f14893b = String.valueOf(str).concat(":count");
        this.f14894c = String.valueOf(str).concat(":value");
        this.f14895d = j;
    }

    @C0226w0
    /* renamed from: b */
    private final void m22523b() {
        this.f14896e.mo21209h();
        long a = this.f14896e.mo21208g().mo18569a();
        Editor edit = this.f14896e.m23729C().edit();
        edit.remove(this.f14893b);
        edit.remove(this.f14894c);
        edit.putLong(this.f14892a, a);
        edit.apply();
    }

    @C0226w0
    /* renamed from: c */
    private final long m22524c() {
        return this.f14896e.m23729C().getLong(this.f14892a, 0);
    }

    @C0226w0
    /* renamed from: a */
    public final void mo21172a(String str, long j) {
        this.f14896e.mo21209h();
        if (m22524c() == 0) {
            m22523b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f14896e.m23729C().getLong(this.f14893b, 0);
        if (j2 <= 0) {
            Editor edit = this.f14896e.m23729C().edit();
            edit.putString(this.f14894c, str);
            edit.putLong(this.f14893b, 1);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f14896e.mo21212k().mo21390u().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        Editor edit2 = this.f14896e.m23729C().edit();
        if (z) {
            edit2.putString(this.f14894c, str);
        }
        edit2.putLong(this.f14893b, j3);
        edit2.apply();
    }

    @C0226w0
    /* renamed from: a */
    public final Pair<String, Long> mo21171a() {
        long j;
        this.f14896e.mo21209h();
        this.f14896e.mo21209h();
        long c = m22524c();
        if (c == 0) {
            m22523b();
            j = 0;
        } else {
            j = Math.abs(c - this.f14896e.mo21208g().mo18569a());
        }
        long j2 = this.f14895d;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m22523b();
            return null;
        }
        String string = this.f14896e.m23729C().getString(this.f14894c, null);
        long j3 = this.f14896e.m23729C().getLong(this.f14893b, 0);
        m22523b();
        if (string == null || j3 <= 0) {
            return C5446x3.f15566B;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
