package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4692b0;
import com.google.android.gms.internal.measurement.C4707c1;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.f3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public abstract class C5248f3 extends C4707c1 implements C5204b3 {
    public C5248f3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18879a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo21161a((zzak) C4692b0.m19943a(parcel, zzak.CREATOR), (zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo21163a((zzjx) C4692b0.m19943a(parcel, zzjx.CREATOR), (zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo21170d((zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo21162a((zzak) C4692b0.m19943a(parcel, zzak.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo21168b((zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = mo21155a((zzm) C4692b0.m19943a(parcel, zzm.CREATOR), C4692b0.m19947a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = mo21167a((zzak) C4692b0.m19943a(parcel, zzak.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                mo21160a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = mo21169c((zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                mo21166a((zzs) C4692b0.m19943a(parcel, zzs.CREATOR), (zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo21165a((zzs) C4692b0.m19943a(parcel, zzs.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = mo21159a(parcel.readString(), parcel.readString(), C4692b0.m19947a(parcel), (zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = mo21158a(parcel.readString(), parcel.readString(), parcel.readString(), C4692b0.m19947a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = mo21156a(parcel.readString(), parcel.readString(), (zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = mo21157a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                mo21164a((zzm) C4692b0.m19943a(parcel, zzm.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
