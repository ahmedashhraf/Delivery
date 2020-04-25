package com.clevertap.android.sdk;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.clevertap.android.sdk.m0 */
/* compiled from: CTNotificationIntentService */
public class C3136m0 extends IntentService {

    /* renamed from: a */
    public static final String f11206a = "com.clevertap.PUSH_EVENT";

    /* renamed from: b */
    public static final String f11207b = "com.clevertap.ACTION_BUTTON_CLICK";

    public C3136m0() {
        super("CTNotificationIntentService");
    }

    /* renamed from: a */
    private void m15053a(Bundle bundle) {
        Intent intent;
        String str = "dl";
        try {
            boolean z = bundle.getBoolean("autoCancel", false);
            int i = bundle.getInt("notificationId", -1);
            String string = bundle.getString(str);
            Context applicationContext = getApplicationContext();
            if (string != null) {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
            } else {
                intent = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
            }
            if (intent == null) {
                C3111h1.m14938f("CTNotificationService: create launch intent.");
                return;
            }
            intent.setFlags(872415232);
            intent.putExtras(bundle);
            intent.removeExtra(str);
            if (z && i > -1) {
                NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(i);
                }
            }
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            startActivity(intent);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("CTNotificationService: unable to process action button click:  ");
            sb.append(th.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (f11207b.equals(extras.getString("ct_type"))) {
                C3111h1.m14938f("CTNotificationIntentService handling com.clevertap.ACTION_BUTTON_CLICK");
                m15053a(extras);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("CTNotificationIntentService: unhandled intent ");
                sb.append(intent.getAction());
                C3111h1.m14938f(sb.toString());
            }
        }
    }
}
