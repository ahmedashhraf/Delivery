package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;

/* renamed from: com.google.android.gms.common.internal.q */
public interface C4380q extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static abstract class C4381a extends C2614b implements C4380q {

        /* renamed from: com.google.android.gms.common.internal.q$a$a */
        public static class C4382a extends C2613a implements C4380q {
            C4382a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
            }

            public final void cancel() throws RemoteException {
                mo10131c(2, mo10127a());
            }
        }

        public C4381a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        /* renamed from: a */
        public static C4380q m18881a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if (queryLocalInterface instanceof C4380q) {
                return (C4380q) queryLocalInterface;
            }
            return new C4382a(iBinder);
        }
    }

    void cancel() throws RemoteException;
}
