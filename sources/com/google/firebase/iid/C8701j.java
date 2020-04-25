package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.j */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8701j {

    /* renamed from: a */
    private final Messenger f22824a;

    /* renamed from: b */
    private final zzf f22825b;

    C8701j(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f22824a = new Messenger(iBinder);
            this.f22825b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f22825b = new zzf(iBinder);
            this.f22824a = null;
        } else {
            String str = "Invalid interface descriptor: ";
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo32130a(Message message) throws RemoteException {
        Messenger messenger = this.f22824a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzf zzf = this.f22825b;
        if (zzf != null) {
            zzf.mo32181a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
