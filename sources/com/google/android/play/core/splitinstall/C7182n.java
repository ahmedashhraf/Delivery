package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.facebook.internal.NativeProtocol;
import com.google.android.play.core.internal.C7137h0;
import com.google.android.play.core.tasks.C7205o;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.n */
class C7182n<T> extends C7137h0 {

    /* renamed from: N */
    private final /* synthetic */ C7169g0 f20316N;

    /* renamed from: b */
    final C7205o<T> f20317b;

    C7182n(C7169g0 g0Var, C7205o<T> oVar) {
        this.f20316N = g0Var;
        this.f20317b = oVar;
    }

    /* renamed from: a */
    public void mo28509a(Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onDeferredInstall", new Object[0]);
    }

    /* renamed from: a */
    public void mo28510a(List<Bundle> list) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onGetSessionStates", new Object[0]);
    }

    /* renamed from: b */
    public final void mo28511b(int i) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onCompleteInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: c */
    public final void mo28512c() throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onGetSplitsForAppUpdate", new Object[0]);
    }

    /* renamed from: d */
    public final void mo28513d() throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onCompleteInstallForAppUpdate", new Object[0]);
    }

    /* renamed from: d */
    public void mo28514d(int i, Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: e */
    public void mo28515e(int i, Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onCancelInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: e */
    public void mo28516e(Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onDeferredLanguageUninstall", new Object[0]);
    }

    /* renamed from: f */
    public void mo28517f(int i, Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onStartInstall(%d)", Integer.valueOf(i));
    }

    /* renamed from: f */
    public void mo28518f(Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onDeferredLanguageInstall", new Object[0]);
    }

    /* renamed from: g */
    public final void mo28519g(Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        int i = bundle.getInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE);
        C7169g0.f20293c.mo23047d("onError(%d)", Integer.valueOf(i));
        this.f20317b.mo28633a((Exception) new SplitInstallException(i));
    }

    /* renamed from: h */
    public void mo28520h(Bundle bundle) throws RemoteException {
        this.f20316N.f20296b.mo28495a();
        C7169g0.f20293c.mo23043a("onDeferredUninstall", new Object[0]);
    }
}
