package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.plus.C5488e;

/* renamed from: com.google.android.gms.plus.internal.m */
public final class C5526m extends RemoteCreator<C5517d> {

    /* renamed from: c */
    private static final C5526m f15822c = new C5526m();

    private C5526m() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m24082a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            try {
                return (View) C4523f.m19512d(((C5517d) f15822c.mo18579a(context)).mo21930a(C4523f.m19511a(context), i, i2, str, i3));
            } catch (Exception unused) {
                return new C5488e(context, i);
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo18279a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        return queryLocalInterface instanceof C5517d ? (C5517d) queryLocalInterface : new C5518e(iBinder);
    }
}
