package com.instabug.library.network.p395f.p396a;

import android.content.Context;
import com.instabug.library.C9780c;
import com.instabug.library.network.BaseNetworkTask;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.f.a.a */
/* compiled from: FeaturesFetcherTask */
public class C9973a extends BaseNetworkTask {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26522a;

    public C9973a(Context context) {
        boolean[] b = m46380b();
        super(context);
        b[1] = true;
    }

    /* renamed from: a */
    public static void m46379a(Context context) {
        boolean[] b = m46380b();
        new C9973a(context);
        b[0] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46380b() {
        boolean[] zArr = f26522a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1402800495053231864L, "com/instabug/library/network/worker/fetcher/FeaturesFetcherTask", 6);
        f26522a = a;
        return a;
    }

    public void onHandleTask() throws Exception {
        boolean[] b = m46380b();
        m46378a();
        b[3] = true;
    }

    public void onTaskCancelled() {
        m46380b()[4] = true;
    }

    public void onTaskFinished() {
        m46380b()[5] = true;
    }

    /* renamed from: a */
    private void m46378a() {
        boolean[] b = m46380b();
        C9780c.m45631b().mo34871c(getContext());
        b[2] = true;
    }
}
