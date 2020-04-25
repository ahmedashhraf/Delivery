package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.s0 */
public abstract class C4609s0 extends C4614w implements C4607r0 {
    public C4609s0() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo17563a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo18697g((Status) C4615x.m19727a(parcel, Status.CREATOR));
                break;
            case 2:
                mo18696a((Status) C4615x.m19727a(parcel, Status.CREATOR), (zzt) C4615x.m19727a(parcel, zzt.CREATOR));
                break;
            case 3:
                mo18695a((Status) C4615x.m19727a(parcel, Status.CREATOR), (zzl) C4615x.m19727a(parcel, zzl.CREATOR));
                break;
            case 4:
                zzd();
                break;
            case 5:
                mo17308h((Status) C4615x.m19727a(parcel, Status.CREATOR));
                break;
            case 6:
                mo17312a(parcel.createByteArray());
                break;
            case 7:
                mo17313a((DeviceMetaData) C4615x.m19727a(parcel, DeviceMetaData.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
