package com.instabug.library.network;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public abstract class InstabugNetworkBasedBackgroundService extends C9969b {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7978383750336561968L, "com/instabug/library/network/InstabugNetworkBasedBackgroundService", 2);
        $jacocoData = a;
        return a;
    }

    public InstabugNetworkBasedBackgroundService() {
        $jacocoInit()[0] = true;
    }

    /* access modifiers changed from: protected */
    public boolean mustHaveNetworkConnection() {
        $jacocoInit()[1] = true;
        return true;
    }
}
