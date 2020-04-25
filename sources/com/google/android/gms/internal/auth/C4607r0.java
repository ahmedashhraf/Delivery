package com.google.android.gms.internal.auth;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth.r0 */
public interface C4607r0 extends IInterface {
    /* renamed from: a */
    void mo17313a(DeviceMetaData deviceMetaData) throws RemoteException;

    /* renamed from: a */
    void mo18695a(Status status, zzl zzl) throws RemoteException;

    /* renamed from: a */
    void mo18696a(Status status, zzt zzt) throws RemoteException;

    /* renamed from: a */
    void mo17312a(byte[] bArr) throws RemoteException;

    /* renamed from: g */
    void mo18697g(Status status) throws RemoteException;

    /* renamed from: h */
    void mo17308h(Status status) throws RemoteException;

    void zzd() throws RemoteException;
}
