package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.internal.plus.zzr;

/* renamed from: com.google.android.gms.plus.internal.b */
public interface C5515b extends IInterface {
    /* renamed from: a */
    void mo21920a(int i, Bundle bundle, Bundle bundle2) throws RemoteException;

    /* renamed from: a */
    void mo21921a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    /* renamed from: a */
    void mo21922a(int i, Bundle bundle, SafeParcelResponse safeParcelResponse) throws RemoteException;

    /* renamed from: a */
    void mo21923a(int i, zzr zzr) throws RemoteException;

    /* renamed from: a */
    void mo21924a(Status status) throws RemoteException;

    /* renamed from: a */
    void mo21925a(DataHolder dataHolder, String str) throws RemoteException;

    /* renamed from: a */
    void mo21926a(DataHolder dataHolder, String str, String str2) throws RemoteException;

    /* renamed from: b */
    void mo21927b(String str) throws RemoteException;

    /* renamed from: c */
    void mo21928c(int i, Bundle bundle) throws RemoteException;

    /* renamed from: c */
    void mo21929c(String str) throws RemoteException;
}
