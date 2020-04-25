package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p003v4.app.C0009a.C0010a;

/* renamed from: androidx.core.app.t */
/* compiled from: NotificationCompatSideChannelService */
public abstract class C0796t extends Service {

    /* renamed from: androidx.core.app.t$a */
    /* compiled from: NotificationCompatSideChannelService */
    private class C0797a extends C0010a {
        C0797a() {
        }

        /* renamed from: a */
        public void mo29a(String str, int i, String str2, Notification notification) throws RemoteException {
            C0796t.this.mo4356a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C0796t.this.mo4359a(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: d */
        public void mo30d(String str) {
            C0796t.this.mo4356a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C0796t.this.mo4357a(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        /* renamed from: a */
        public void mo28a(String str, int i, String str2) throws RemoteException {
            C0796t.this.mo4356a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                C0796t.this.mo4358a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4356a(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationSideChannelService: Uid ");
        sb.append(i);
        sb.append(" is not authorized for package ");
        sb.append(str);
        throw new SecurityException(sb.toString());
    }

    /* renamed from: a */
    public abstract void mo4357a(String str);

    /* renamed from: a */
    public abstract void mo4358a(String str, int i, String str2);

    /* renamed from: a */
    public abstract void mo4359a(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals(C0798u.f3795g) || VERSION.SDK_INT > 19) {
            return null;
        }
        return new C0797a();
    }
}
