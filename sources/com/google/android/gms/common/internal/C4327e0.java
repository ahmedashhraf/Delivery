package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

/* renamed from: com.google.android.gms.common.internal.e0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4327e0 extends RemoteCreator<C4405u> {

    /* renamed from: c */
    private static final C4327e0 f13445c = new C4327e0();

    private C4327e0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m18732a(Context context, int i, int i2) throws RemoteCreatorException {
        return f13445c.m18733b(context, i, i2);
    }

    /* renamed from: b */
    private final View m18733b(Context context, int i, int i2) throws RemoteCreatorException {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, null);
            return (View) C4523f.m19512d(((C4405u) mo18579a(context)).mo18377a(C4523f.m19511a(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreatorException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final C4405u m18735a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof C4405u) {
            return (C4405u) queryLocalInterface;
        }
        return new C4391s0(iBinder);
    }
}
