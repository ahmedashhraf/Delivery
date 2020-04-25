package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.C1376c;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.l */
public class C4157l {

    /* renamed from: a */
    private final Object f13044a;

    public C4157l(Activity activity) {
        C4300a0.m18621a(activity, (Object) "Activity must not be null");
        this.f13044a = activity;
    }

    @C4056a
    /* renamed from: a */
    public Activity mo17912a() {
        return (Activity) this.f13044a;
    }

    @C4056a
    /* renamed from: b */
    public C1376c mo17913b() {
        return (C1376c) this.f13044a;
    }

    @C4056a
    /* renamed from: c */
    public Object mo17914c() {
        return this.f13044a;
    }

    @C4056a
    /* renamed from: d */
    public boolean mo17915d() {
        return false;
    }

    @C4056a
    /* renamed from: e */
    public boolean mo17916e() {
        return this.f13044a instanceof C1376c;
    }

    /* renamed from: f */
    public final boolean mo17917f() {
        return this.f13044a instanceof Activity;
    }

    @C4056a
    public C4157l(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
