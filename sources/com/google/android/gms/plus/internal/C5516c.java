package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.internal.plus.C5087e;
import com.google.android.gms.internal.plus.C5088f;
import com.google.android.gms.internal.plus.zzr;

/* renamed from: com.google.android.gms.plus.internal.c */
public abstract class C5516c extends C5087e implements C5515b {
    public C5516c() {
        super("com.google.android.gms.plus.internal.IPlusCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo19870a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo21920a(parcel.readInt(), (Bundle) C5088f.m22086a(parcel, Bundle.CREATOR), (Bundle) C5088f.m22086a(parcel, Bundle.CREATOR));
                break;
            case 2:
                mo21921a(parcel.readInt(), (Bundle) C5088f.m22086a(parcel, Bundle.CREATOR), (ParcelFileDescriptor) C5088f.m22086a(parcel, ParcelFileDescriptor.CREATOR));
                break;
            case 3:
                mo21927b(parcel.readString());
                break;
            case 4:
                mo21925a((DataHolder) C5088f.m22086a(parcel, DataHolder.CREATOR), parcel.readString());
                break;
            case 5:
                mo21922a(parcel.readInt(), (Bundle) C5088f.m22086a(parcel, Bundle.CREATOR), (SafeParcelResponse) C5088f.m22086a(parcel, SafeParcelResponse.CREATOR));
                break;
            case 6:
                mo21926a((DataHolder) C5088f.m22086a(parcel, DataHolder.CREATOR), parcel.readString(), parcel.readString());
                break;
            case 7:
                mo21928c(parcel.readInt(), (Bundle) C5088f.m22086a(parcel, Bundle.CREATOR));
                break;
            case 8:
                mo21929c(parcel.readString());
                break;
            case 9:
                mo21923a(parcel.readInt(), (zzr) C5088f.m22086a(parcel, zzr.CREATOR));
                break;
            case 10:
                mo21924a((Status) C5088f.m22086a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
