package com.mrsool.chat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import p053b.p072g.p073b.C2128a;

/* renamed from: com.mrsool.chat.k */
/* compiled from: CheckoutBroadcastReceiver */
public class C10522k extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String str = CheckoutActivity.f34069j0;
        if (str.equals(action)) {
            intent.getStringExtra(CheckoutActivity.f34075p0);
            String str2 = CheckoutActivity.f34076q0;
            String stringExtra = intent.getStringExtra(str2);
            ComponentName componentName = (ComponentName) intent.getParcelableExtra(CheckoutActivity.f34080u0);
            Intent intent2 = new Intent(str);
            intent2.setComponent(componentName);
            intent2.setPackage(componentName.getPackageName());
            intent2.addFlags(268435456);
            intent2.putExtra(str2, stringExtra);
            intent2.putExtra(CheckoutActivity.f34078s0, false);
            context.startActivity(intent2);
            C2128a.m11089a(context).mo9219a(new Intent(str));
        }
    }
}
