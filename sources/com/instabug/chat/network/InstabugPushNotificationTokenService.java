package com.instabug.chat.network;

import android.content.Context;
import android.content.Intent;
import com.instabug.chat.network.C9428a.C9433e;
import com.instabug.chat.settings.C9441a;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugPushNotificationTokenService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24967a;

    /* renamed from: com.instabug.chat.network.InstabugPushNotificationTokenService$a */
    class C9427a implements Callbacks<String, Throwable> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24968b;

        /* renamed from: a */
        final /* synthetic */ InstabugPushNotificationTokenService f24969a;

        C9427a(InstabugPushNotificationTokenService instabugPushNotificationTokenService) {
            boolean[] a = m44125a();
            this.f24969a = instabugPushNotificationTokenService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44125a() {
            boolean[] zArr = f24968b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1936295924801246365L, "com/instabug/chat/network/InstabugPushNotificationTokenService$1", 8);
            f24968b = a;
            return a;
        }

        /* renamed from: a */
        public void mo33980a(String str) {
            boolean[] a = m44125a();
            if (str.equalsIgnoreCase("ok")) {
                a[1] = true;
                C9441a.m44202f(true);
                a[2] = true;
            } else {
                C9441a.m44202f(false);
                a[3] = true;
            }
            a[4] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44125a();
            mo33981a((Throwable) obj);
            a[6] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44125a();
            mo33980a((String) obj);
            a[7] = true;
        }

        /* renamed from: a */
        public void mo33981a(Throwable th) {
            boolean[] a = m44125a();
            C9441a.m44202f(false);
            a[5] = true;
        }
    }

    public InstabugPushNotificationTokenService() {
        m44124b()[0] = true;
    }

    /* renamed from: a */
    public static void m44123a(Context context, Intent intent) {
        boolean[] b = m44124b();
        C9969b.enqueueInstabugWork(context, InstabugPushNotificationTokenService.class, 2585, intent);
        b[1] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44124b() {
        boolean[] zArr = f24967a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2060094426342248618L, "com/instabug/chat/network/InstabugPushNotificationTokenService", 11);
        f24967a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() {
        boolean[] b = m44124b();
        m44122a();
        b[2] = true;
    }

    /* renamed from: a */
    private void m44122a() {
        boolean[] b = m44124b();
        String m = C9441a.m44210m();
        try {
            b[3] = true;
            C9433e.m44147a().mo33996a((Context) this, m, (Callbacks<String, Throwable>) new C9427a<String,Throwable>(this));
            b[4] = true;
        } catch (JSONException e) {
            b[5] = true;
            C9441a.m44202f(false);
            b[6] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("sending push notification token got error: ");
            b[7] = true;
            sb.append(e.getMessage());
            String sb2 = sb.toString();
            b[8] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            b[9] = true;
        }
        b[10] = true;
    }
}
