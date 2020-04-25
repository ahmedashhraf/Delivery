package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.r */
public interface C4567r extends IInterface {
    /* renamed from: a */
    void mo18653a(Status status, Credential credential) throws RemoteException;

    /* renamed from: a */
    void mo18654a(Status status, String str) throws RemoteException;

    /* renamed from: i */
    void mo18655i(Status status) throws RemoteException;
}
