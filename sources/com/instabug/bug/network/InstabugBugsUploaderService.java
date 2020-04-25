package com.instabug.bug.network;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugBugsUploaderService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24558a;

    public InstabugBugsUploaderService() {
        m43420a()[0] = true;
    }

    /* renamed from: a */
    public static void m43419a(Context context, Intent intent) {
        boolean[] a = m43420a();
        C9969b.enqueueInstabugWork(context, InstabugBugsUploaderService.class, 2580, intent);
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43420a() {
        boolean[] zArr = f24558a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2799907626642111125L, "com/instabug/bug/network/InstabugBugsUploaderService", 4);
        f24558a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] a = m43420a();
        C9279a aVar = new C9279a(this);
        a[2] = true;
        aVar.mo33554a();
        a[3] = true;
    }
}
