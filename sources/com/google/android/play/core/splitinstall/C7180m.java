package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C7205o;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.m */
final class C7180m extends C7182n<List<SplitInstallSessionState>> {
    C7180m(C7169g0 g0Var, C7205o<List<SplitInstallSessionState>> oVar) {
        super(g0Var, oVar);
    }

    /* renamed from: a */
    public final void mo28510a(List<Bundle> list) throws RemoteException {
        super.mo28510a(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Bundle a : list) {
            arrayList.add(SplitInstallSessionState.m34394a(a));
        }
        this.f20317b.mo28634a(arrayList);
    }
}
