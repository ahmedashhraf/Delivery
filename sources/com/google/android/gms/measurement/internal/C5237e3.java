package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C4677a;
import com.google.android.gms.internal.measurement.C4692b0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.e3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5237e3 extends C4677a implements C5204b3 {
    C5237e3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo21161a(zzak zzak, zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzak);
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(1, G0);
    }

    /* renamed from: b */
    public final void mo21168b(zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(6, G0);
    }

    /* renamed from: c */
    public final String mo21169c(zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzm);
        Parcel a = mo18820a(11, G0);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: d */
    public final void mo21170d(zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(4, G0);
    }

    /* renamed from: a */
    public final void mo21163a(zzjx zzjx, zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzjx);
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(2, G0);
    }

    /* renamed from: a */
    public final void mo21162a(zzak zzak, String str, String str2) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzak);
        G0.writeString(str);
        G0.writeString(str2);
        mo18822b(5, G0);
    }

    /* renamed from: a */
    public final List<zzjx> mo21155a(zzm zzm, boolean z) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzm);
        C4692b0.m19946a(G0, z);
        Parcel a = mo18820a(7, G0);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final byte[] mo21167a(zzak zzak, String str) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzak);
        G0.writeString(str);
        Parcel a = mo18820a(9, G0);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo21160a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeLong(j);
        G0.writeString(str);
        G0.writeString(str2);
        G0.writeString(str3);
        mo18822b(10, G0);
    }

    /* renamed from: a */
    public final void mo21166a(zzs zzs, zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzs);
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(12, G0);
    }

    /* renamed from: a */
    public final void mo21165a(zzs zzs) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzs);
        mo18822b(13, G0);
    }

    /* renamed from: a */
    public final List<zzjx> mo21159a(String str, String str2, boolean z, zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19946a(G0, z);
        C4692b0.m19945a(G0, (Parcelable) zzm);
        Parcel a = mo18820a(14, G0);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzjx> mo21158a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        G0.writeString(str3);
        C4692b0.m19946a(G0, z);
        Parcel a = mo18820a(15, G0);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzjx.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzs> mo21156a(String str, String str2, zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        C4692b0.m19945a(G0, (Parcelable) zzm);
        Parcel a = mo18820a(16, G0);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzs.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzs> mo21157a(String str, String str2, String str3) throws RemoteException {
        Parcel G0 = mo18819G0();
        G0.writeString(str);
        G0.writeString(str2);
        G0.writeString(str3);
        Parcel a = mo18820a(17, G0);
        ArrayList createTypedArrayList = a.createTypedArrayList(zzs.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final void mo21164a(zzm zzm) throws RemoteException {
        Parcel G0 = mo18819G0();
        C4692b0.m19945a(G0, (Parcelable) zzm);
        mo18822b(18, G0);
    }
}
