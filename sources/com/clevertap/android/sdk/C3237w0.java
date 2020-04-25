package com.clevertap.android.sdk;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map.Entry;

/* renamed from: com.clevertap.android.sdk.w0 */
/* compiled from: FcmMessageListenerService */
public class C3237w0 extends FirebaseMessagingService {
    /* renamed from: a */
    public void mo12649a(RemoteMessage remoteMessage) {
        try {
            if (remoteMessage.mo32197O().size() > 0) {
                Bundle bundle = new Bundle();
                for (Entry entry : remoteMessage.mo32197O().entrySet()) {
                    bundle.putString((String) entry.getKey(), (String) entry.getValue());
                }
                if (C3150p0.m15266d(bundle).f11197a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("FcmMessageListenerService received notification from CleverTap: ");
                    sb.append(bundle.toString());
                    C3111h1.m14930d(sb.toString());
                    C3150p0.m15151a(getApplicationContext(), bundle);
                }
            }
        } catch (Throwable th) {
            C3111h1.m14933d("Error parsing FCM message", th);
        }
    }
}
