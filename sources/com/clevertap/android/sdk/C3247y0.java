package com.clevertap.android.sdk;

import android.os.Bundle;
import com.google.android.gms.gcm.GcmListenerService;

@Deprecated
/* renamed from: com.clevertap.android.sdk.y0 */
/* compiled from: GcmMessageListenerService */
public class C3247y0 extends GcmListenerService {
    /* renamed from: a */
    public void mo12663a(String str, Bundle bundle) {
        try {
            if (C3150p0.m15266d(bundle).f11197a) {
                StringBuilder sb = new StringBuilder();
                sb.append("GcmMessageListenerService received notification from CleverTap: ");
                sb.append(bundle.toString());
                C3111h1.m14930d(sb.toString());
                C3150p0.m15151a(getApplicationContext(), bundle);
            }
        } catch (Throwable th) {
            C3111h1.m14933d("Error handling GCM message", th);
        }
    }
}
