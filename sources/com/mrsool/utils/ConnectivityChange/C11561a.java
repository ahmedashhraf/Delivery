package com.mrsool.utils.ConnectivityChange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.mrsool.utils.ConnectivityChange.a */
/* compiled from: ConnectivityReceiver */
public class C11561a extends BroadcastReceiver {

    /* renamed from: a */
    private C11562a f32724a;

    /* renamed from: com.mrsool.utils.ConnectivityChange.a$a */
    /* compiled from: ConnectivityReceiver */
    public interface C11562a {
        /* renamed from: a */
        void mo39687a(boolean z);
    }

    C11561a(C11562a aVar) {
        this.f32724a = aVar;
    }

    /* renamed from: a */
    public static boolean m52108a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void onReceive(Context context, Intent intent) {
        this.f32724a.mo39687a(m52108a(context));
    }
}
