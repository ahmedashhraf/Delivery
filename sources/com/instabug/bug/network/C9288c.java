package com.instabug.bug.network;

import android.content.Context;
import com.instabug.library.network.BaseNetworkTask;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.network.c */
/* compiled from: BugsUploaderTask */
public class C9288c extends BaseNetworkTask {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24588a;

    public C9288c(Context context) {
        boolean[] a = m43462a();
        super(context);
        a[1] = true;
    }

    /* renamed from: a */
    public static void m43461a(Context context) {
        boolean[] a = m43462a();
        new C9288c(context);
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43462a() {
        boolean[] zArr = f24588a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-398330275022432205L, "com/instabug/bug/network/BugsUploaderTask", 6);
        f24588a = a;
        return a;
    }

    public void onHandleTask() throws Exception {
        boolean[] a = m43462a();
        C9279a aVar = new C9279a(getContext());
        a[2] = true;
        aVar.mo33554a();
        a[3] = true;
    }

    public void onTaskCancelled() {
        m43462a()[4] = true;
    }

    public void onTaskFinished() {
        m43462a()[5] = true;
    }
}
