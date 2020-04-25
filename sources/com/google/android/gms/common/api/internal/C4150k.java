package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import p076c.p112d.p113a.p114a.p118d.p121c.C2595a;
import p076c.p112d.p113a.p114a.p118d.p121c.C2596b;
import p076c.p112d.p113a.p114a.p118d.p121c.C2598d;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface C4150k extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.k$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static abstract class C4151a extends C2595a implements C4150k {

        /* renamed from: com.google.android.gms.common.api.internal.k$a$a */
        /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
        public static class C4152a extends C2596b implements C4150k {
            C4152a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.api.internal.IStatusCallback");
            }

            /* renamed from: d */
            public final void mo17910d(Status status) throws RemoteException {
                Parcel G0 = mo10093G0();
                C2598d.m12704a(G0, (Parcelable) status);
                mo10097c(1, G0);
            }
        }

        public C4151a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        /* renamed from: a */
        public static C4150k m17996a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof C4150k) {
                return (C4150k) queryLocalInterface;
            }
            return new C4152a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo10090a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            mo17910d((Status) C2598d.m12702a(parcel, Status.CREATOR));
            return true;
        }
    }

    /* renamed from: d */
    void mo17910d(Status status) throws RemoteException;
}
