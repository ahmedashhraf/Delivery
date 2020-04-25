package com.instabug.library.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Network;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.network.worker.uploader.InstabugSessionUploaderService;
import com.instabug.library.util.InstabugSDKLogger;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.c */
/* compiled from: InstabugNetworkReceiver */
public class C9970c extends BroadcastReceiver {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26515b;

    /* renamed from: a */
    private boolean f26516a;

    public C9970c() {
        m46369b()[0] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46369b() {
        boolean[] zArr = f26515b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4482642307666315632L, "com/instabug/library/network/InstabugNetworkReceiver", 13);
        f26515b = a;
        return a;
    }

    /* renamed from: a */
    public void mo35573a(Context context, IntentFilter intentFilter) {
        boolean[] b = m46369b();
        context.registerReceiver(this, intentFilter);
        this.f26516a = true;
        b[10] = true;
    }

    public void onReceive(Context context, Intent intent) {
        boolean[] b = m46369b();
        InstabugSDKLogger.m46622d(this, "Network state changed");
        b[1] = true;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        b[2] = true;
        if (connectivityManager.getActiveNetworkInfo() == null) {
            b[3] = true;
        } else {
            b[4] = true;
            InstabugSDKLogger.m46622d(this, "ActiveNetwork not equal null, checking local cache");
            b[5] = true;
            Intent intent2 = new Intent(context, InstabugSessionUploaderService.class);
            b[6] = true;
            InstabugSessionUploaderService.m46382a(context, intent2);
            b[7] = true;
            SDKCoreEventPublisher.post(new SDKCoreEvent(Network.TYPE_NETWORK, "activated"));
            b[8] = true;
        }
        b[9] = true;
    }

    /* renamed from: a */
    public void mo35572a(Context context) {
        boolean[] b = m46369b();
        context.unregisterReceiver(this);
        this.f26516a = false;
        b[11] = true;
    }

    /* renamed from: a */
    public boolean mo35574a() {
        boolean[] b = m46369b();
        boolean z = this.f26516a;
        b[12] = true;
        return z;
    }
}
