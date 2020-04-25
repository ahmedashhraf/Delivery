package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.signin.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface C5532c extends IInterface {
    /* renamed from: a */
    void mo21955a(ConnectionResult connectionResult, zab zab) throws RemoteException;

    /* renamed from: a */
    void mo21956a(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    /* renamed from: a */
    void mo17908a(zak zak) throws RemoteException;

    /* renamed from: e */
    void mo21957e(Status status) throws RemoteException;

    /* renamed from: f */
    void mo21958f(Status status) throws RemoteException;
}
