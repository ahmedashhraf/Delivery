package com.google.firebase.iid;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public class zzf implements Parcelable {
    public static final Creator<zzf> CREATOR = new C8704k0();

    /* renamed from: a */
    private Messenger f22900a;

    /* renamed from: b */
    private C8722t0 f22901b;

    /* renamed from: com.google.firebase.iid.zzf$a */
    /* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
    public static final class C8735a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            boolean o = FirebaseInstanceId.m40759o();
            return zzf.class;
        }
    }

    public zzf(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            this.f22900a = new Messenger(iBinder);
        } else {
            this.f22901b = new C8728w0(iBinder);
        }
    }

    /* renamed from: a */
    public final void mo32181a(Message message) throws RemoteException {
        Messenger messenger = this.f22900a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f22901b.mo32157a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m40939a().equals(((zzf) obj).m40939a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m40939a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f22900a;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f22901b.asBinder());
        }
    }

    /* renamed from: a */
    private final IBinder m40939a() {
        Messenger messenger = this.f22900a;
        return messenger != null ? messenger.getBinder() : this.f22901b.asBinder();
    }
}
