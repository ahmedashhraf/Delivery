package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p121c.C2595a;
import p076c.p112d.p113a.p114a.p118d.p121c.C2596b;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.common.internal.t */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface C4401t extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.t$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4402a extends C2595a implements C4401t {

        /* renamed from: com.google.android.gms.common.internal.t$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class C4403a extends C2596b implements C4401t {
            C4403a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
            }

            /* renamed from: a */
            public void mo18392a(ResolveAccountResponse resolveAccountResponse) throws RemoteException {
                Parcel G0 = mo10093G0();
                C2598d.m12704a(G0, (Parcelable) resolveAccountResponse);
                mo10096b(2, G0);
            }
        }

        public C4402a() {
            super("com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }

        /* renamed from: a */
        public static C4401t m19029a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (queryLocalInterface instanceof C4401t) {
                return (C4401t) queryLocalInterface;
            }
            return new C4403a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo10090a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            mo18392a((ResolveAccountResponse) C2598d.m12702a(parcel, ResolveAccountResponse.CREATOR));
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo18392a(ResolveAccountResponse resolveAccountResponse) throws RemoteException;
}
