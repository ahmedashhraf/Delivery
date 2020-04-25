package com.mrsool.utils.ConnectivityChange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11694e;
import p053b.p072g.p073b.C2128a;

public class NetworkChangeReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f16956a;

    /* renamed from: com.mrsool.utils.ConnectivityChange.NetworkChangeReceiver$a */
    class C5877a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f16957a;

        C5877a(Context context) {
            this.f16957a = context;
        }

        public void run() {
            if (NetworkChangeReceiver.this.mo23431a(this.f16957a)) {
                NetworkChangeReceiver.this.f16956a.mo23627i("Network connected");
                if (NetworkChangeReceiver.this.f16956a.mo23501W() && NetworkChangeReceiver.this.f16956a.mo23599c0()) {
                    NetworkChangeReceiver.this.f16956a.mo23626i();
                }
                NetworkChangeReceiver.this.m25744b();
            }
        }
    }

    /* renamed from: c */
    private void m25747c(Context context) {
        new Handler().postDelayed(new C5877a(context), 1000);
    }

    public void onReceive(Context context, Intent intent) {
        this.f16956a = new C5887x(context);
        if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
            m25745b(context);
            m25743a();
            m25747c(context);
        } else if (intent.getAction().equals(C11644i.f33356l7)) {
            m25745b(context);
            m25743a();
            m25747c(context);
        }
        Intent intent2 = new Intent(C11644i.f33102H4);
        String str = "isOn";
        intent2.putExtra(str, mo23431a(context));
        C2128a.m11089a(context).mo9219a(intent2);
        Intent intent3 = new Intent(C11644i.f33110I4);
        intent3.putExtra(str, mo23431a(context));
        C2128a.m11089a(context).mo9219a(intent3);
    }

    /* renamed from: a */
    private void m25743a() {
        try {
            if (C11644i.f33177R) {
                this.f16956a.mo23473E(C11644i.f33344k4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m25744b() {
        if (C11644i.f33225X && !C11644i.f33161P) {
            this.f16956a.mo23473E(C11644i.f33402r4);
        }
    }

    /* renamed from: b */
    private void m25745b(Context context) {
        if (!mo23431a(context)) {
            this.f16956a.mo23473E(C11644i.f33353l4);
            C11694e.INSTANCE.mo40209e();
        }
    }

    /* renamed from: a */
    public boolean mo23431a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isAvailable() || !connectivityManager.getActiveNetworkInfo().isConnected()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
