package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.h0 */
public abstract class C7137h0 extends C7149v0 implements C7133f0 {
    public C7137h0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28494a(int i, Parcel parcel) throws RemoteException {
        switch (i) {
            case 2:
                mo28517f(parcel.readInt(), (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR);
                mo28511b(readInt);
                break;
            case 4:
                mo28515e(parcel.readInt(), (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 5:
                mo28514d(parcel.readInt(), (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 6:
                mo28519g((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 7:
                mo28510a((List<Bundle>) parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                mo28520h((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 9:
                mo28509a((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 10:
                Bundle bundle2 = (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR);
                mo28512c();
                break;
            case 11:
                Bundle bundle3 = (Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR);
                mo28513d();
                break;
            case 12:
                mo28518f((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            case 13:
                mo28516e((Bundle) C7148u0.m34372a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
