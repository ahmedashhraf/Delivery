package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;

@C4056a
/* renamed from: com.google.android.gms.common.data.f */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4269f {

    /* renamed from: N */
    private int f13263N;
    @C4056a

    /* renamed from: a */
    protected final DataHolder f13264a;
    @C4056a

    /* renamed from: b */
    protected int f13265b;

    @C4056a
    public C4269f(DataHolder dataHolder, int i) {
        this.f13264a = (DataHolder) C4300a0.m18620a(dataHolder);
        mo18069a(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18069a(int i) {
        C4300a0.m18631b(i >= 0 && i < this.f13264a.getCount());
        this.f13265b = i;
        this.f13263N = this.f13264a.mo18045g(this.f13265b);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: b */
    public byte[] mo18073b(String str) {
        return this.f13264a.mo18039c(str, this.f13265b, this.f13263N);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: c */
    public double mo18074c(String str) {
        return this.f13264a.mo18049i(str, this.f13265b, this.f13263N);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: d */
    public int mo18076d() {
        return this.f13265b;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: e */
    public int mo18077e(String str) {
        return this.f13264a.mo18041d(str, this.f13265b, this.f13263N);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4269f) {
            C4269f fVar = (C4269f) obj;
            if (C4413y.m19053a(Integer.valueOf(fVar.f13265b), Integer.valueOf(this.f13265b)) && C4413y.m19053a(Integer.valueOf(fVar.f13263N), Integer.valueOf(this.f13263N)) && fVar.f13264a == this.f13264a) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: f */
    public long mo18079f(String str) {
        return this.f13264a.mo18042e(str, this.f13265b, this.f13263N);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: g */
    public String mo18080g(String str) {
        return this.f13264a.mo18043f(str, this.f13265b, this.f13263N);
    }

    @C4056a
    /* renamed from: h */
    public boolean mo18081h(String str) {
        return this.f13264a.mo18038c(str);
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f13265b), Integer.valueOf(this.f13263N), this.f13264a);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: i */
    public boolean mo18083i(String str) {
        return this.f13264a.mo18046g(str, this.f13265b, this.f13263N);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: j */
    public Uri mo18084j(String str) {
        String f = this.f13264a.mo18043f(str, this.f13265b, this.f13263N);
        if (f == null) {
            return null;
        }
        return Uri.parse(f);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: d */
    public float mo18075d(String str) {
        return this.f13264a.mo18048h(str, this.f13265b, this.f13263N);
    }

    @C4056a
    /* renamed from: a */
    public boolean mo18071a() {
        return !this.f13264a.isClosed();
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public boolean mo18072a(String str) {
        return this.f13264a.mo18037b(str, this.f13265b, this.f13263N);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo18070a(String str, CharArrayBuffer charArrayBuffer) {
        this.f13264a.mo18036a(str, this.f13265b, this.f13263N, charArrayBuffer);
    }
}
