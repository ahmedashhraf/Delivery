package com.instabug.chat.network;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.network.BaseNetworkTask;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.chat.network.b */
/* compiled from: MessageUploaderTask */
public class C9440b extends BaseNetworkTask {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25007a;

    public C9440b(Context context) {
        boolean[] a = m44180a();
        super(context);
        a[1] = true;
    }

    /* renamed from: a */
    public static void m44179a(Context context) {
        boolean[] a = m44180a();
        new C9440b(context);
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44180a() {
        boolean[] zArr = f25007a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1081825903092688147L, "com/instabug/chat/network/MessageUploaderTask", 7);
        f25007a = a;
        return a;
    }

    public void onHandleTask() throws Exception {
        boolean[] a = m44180a();
        C9428a aVar = new C9428a(getContext());
        a[2] = true;
        aVar.mo33982a();
        a[3] = true;
        aVar.mo33983a(ChatsCacheManager.getOfflineMessages());
        a[4] = true;
    }

    public void onTaskCancelled() {
        m44180a()[5] = true;
    }

    public void onTaskFinished() {
        m44180a()[6] = true;
    }
}
