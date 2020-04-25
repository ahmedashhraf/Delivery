package com.instabug.chat.network;

import android.content.Context;
import android.content.Intent;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugMessageUploaderService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24966a;

    public InstabugMessageUploaderService() {
        m44121a()[0] = true;
    }

    /* renamed from: a */
    public static void m44120a(Context context, Intent intent) {
        boolean[] a = m44121a();
        C9969b.enqueueInstabugWork(context, InstabugMessageUploaderService.class, 2577, intent);
        a[1] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44121a() {
        boolean[] zArr = f24966a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8244460894557744763L, "com/instabug/chat/network/InstabugMessageUploaderService", 5);
        f24966a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] a = m44121a();
        C9428a aVar = new C9428a(this);
        a[2] = true;
        aVar.mo33982a();
        a[3] = true;
        aVar.mo33983a(ChatsCacheManager.getOfflineMessages());
        a[4] = true;
    }
}
