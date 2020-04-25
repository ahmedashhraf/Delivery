package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

/* renamed from: com.google.android.gms.internal.auth.b0 */
public final class C4575b0 extends C4572a implements C4617z {
    C4575b0(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    /* renamed from: a */
    public final AccountChangeEventsResponse mo18678a(AccountChangeEventsRequest accountChangeEventsRequest) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19729a(G0, (Parcelable) accountChangeEventsRequest);
        Parcel a = mo18668a(3, G0);
        AccountChangeEventsResponse accountChangeEventsResponse = (AccountChangeEventsResponse) C4615x.m19727a(a, AccountChangeEventsResponse.CREATOR);
        a.recycle();
        return accountChangeEventsResponse;
    }

    /* renamed from: b */
    public final Bundle mo18679b(Account account) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19729a(G0, (Parcelable) account);
        Parcel a = mo18668a(7, G0);
        Bundle bundle = (Bundle) C4615x.m19727a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    /* renamed from: j */
    public final Bundle mo18680j(String str, Bundle bundle) throws RemoteException {
        Parcel G0 = mo18667G0();
        G0.writeString(str);
        C4615x.m19729a(G0, (Parcelable) bundle);
        Parcel a = mo18668a(2, G0);
        Bundle bundle2 = (Bundle) C4615x.m19727a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo18676a(Account account, String str, Bundle bundle) throws RemoteException {
        Parcel G0 = mo18667G0();
        C4615x.m19729a(G0, (Parcelable) account);
        G0.writeString(str);
        C4615x.m19729a(G0, (Parcelable) bundle);
        Parcel a = mo18668a(5, G0);
        Bundle bundle2 = (Bundle) C4615x.m19727a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }

    /* renamed from: a */
    public final Bundle mo18677a(String str) throws RemoteException {
        Parcel G0 = mo18667G0();
        G0.writeString(str);
        Parcel a = mo18668a(8, G0);
        Bundle bundle = (Bundle) C4615x.m19727a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
