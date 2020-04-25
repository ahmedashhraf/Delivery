package androidx.browser.p013a;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import p000a.p001a.p002a.C0000a;
import p000a.p001a.p002a.C0006c.C0007a;

/* renamed from: androidx.browser.a.h */
/* compiled from: PostMessageService */
public class C0604h extends Service {

    /* renamed from: a */
    private C0007a f2395a = new C0605a();

    /* renamed from: androidx.browser.a.h$a */
    /* compiled from: PostMessageService */
    class C0605a extends C0007a {
        C0605a() {
        }

        /* renamed from: a */
        public void mo22a(C0000a aVar, Bundle bundle) throws RemoteException {
            aVar.mo3d(bundle);
        }

        /* renamed from: a */
        public void mo23a(C0000a aVar, String str, Bundle bundle) throws RemoteException {
            aVar.mo5h(str, bundle);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f2395a;
    }
}
