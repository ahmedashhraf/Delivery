package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: com.google.android.gms.internal.auth.z */
public interface C4617z extends IInterface {
    /* renamed from: a */
    Bundle mo18676a(Account account, String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    Bundle mo18677a(String str) throws RemoteException;

    /* renamed from: a */
    AccountChangeEventsResponse mo18678a(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException;

    /* renamed from: b */
    Bundle mo18679b(Account account) throws RemoteException;

    /* renamed from: j */
    Bundle mo18680j(String str, Bundle bundle) throws RemoteException;
}
