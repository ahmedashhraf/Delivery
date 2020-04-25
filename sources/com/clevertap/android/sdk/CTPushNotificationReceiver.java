package com.clevertap.android.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class CTPushNotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2;
        String str = "wzrk_dl";
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                if (extras.containsKey(str)) {
                    intent2 = new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra(str)));
                } else {
                    intent2 = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                    if (intent2 == null) {
                        return;
                    }
                }
                C3150p0.m15219b(context, extras);
                intent2.setFlags(872415232);
                intent2.putExtras(extras);
                intent2.putExtra("wzrk_from", "CTPushNotificationReceiver");
                context.startActivity(intent2);
                StringBuilder sb = new StringBuilder();
                sb.append("CTPushNotificationReceiver: handled notification: ");
                sb.append(extras.toString());
                C3111h1.m14930d(sb.toString());
            }
        } catch (Throwable th) {
            C3111h1.m14941f("CTPushNotificationReceiver: error handling notification", th);
        }
    }
}
