package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@C4056a
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: N */
    private static ClassLoader f13344N;

    /* renamed from: O */
    private static Integer f13345O;

    /* renamed from: b */
    private static final Object f13346b = new Object();

    /* renamed from: a */
    private boolean f13347a = false;

    @C4056a
    /* renamed from: O */
    protected static Integer m18581O() {
        synchronized (f13346b) {
        }
        return null;
    }

    /* renamed from: P */
    private static ClassLoader m18582P() {
        synchronized (f13346b) {
        }
        return null;
    }

    @C4056a
    /* renamed from: c */
    protected static boolean m18583c(String str) {
        m18582P();
        return true;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: N */
    public boolean mo18182N() {
        return this.f13347a;
    }

    @C4056a
    /* renamed from: a */
    public void mo18183a(boolean z) {
        this.f13347a = z;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: g */
    public abstract boolean mo18184g(int i);
}
