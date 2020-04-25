package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d.C4520a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2613a;
import p076c.p112d.p113a.p114a.p118d.p122d.C2614b;
import p076c.p112d.p113a.p114a.p118d.p122d.C2615c;

/* renamed from: com.google.android.gms.dynamic.c */
public interface C4516c extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.c$a */
    public static abstract class C4517a extends C2614b implements C4516c {

        /* renamed from: com.google.android.gms.dynamic.c$a$a */
        public static class C4518a extends C2613a implements C4516c {
            C4518a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            /* renamed from: A */
            public final C4519d mo18596A() throws RemoteException {
                Parcel a = mo10128a(6, mo10127a());
                C4519d a2 = C4520a.m19510a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: G */
            public final C4516c mo18597G() throws RemoteException {
                Parcel a = mo10128a(9, mo10127a());
                C4516c a2 = C4517a.m19487a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: H */
            public final C4519d mo18598H() throws RemoteException {
                Parcel a = mo10128a(2, mo10127a());
                C4519d a2 = C4520a.m19510a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: I */
            public final C4516c mo18599I() throws RemoteException {
                Parcel a = mo10128a(5, mo10127a());
                C4516c a2 = C4517a.m19487a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: N */
            public final C4519d mo18600N() throws RemoteException {
                Parcel a = mo10128a(12, mo10127a());
                C4519d a2 = C4520a.m19510a(a.readStrongBinder());
                a.recycle();
                return a2;
            }

            /* renamed from: S */
            public final Bundle mo18601S() throws RemoteException {
                Parcel a = mo10128a(3, mo10127a());
                Bundle bundle = (Bundle) C2615c.m12723a(a, Bundle.CREATOR);
                a.recycle();
                return bundle;
            }

            /* renamed from: W */
            public final boolean mo18602W() throws RemoteException {
                Parcel a = mo10128a(15, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: Z */
            public final boolean mo18603Z() throws RemoteException {
                Parcel a = mo10128a(11, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: a */
            public final void mo18604a(Intent intent) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12725a(a, (Parcelable) intent);
                mo10130b(25, a);
            }

            /* renamed from: c0 */
            public final boolean mo18605c0() throws RemoteException {
                Parcel a = mo10128a(14, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: f0 */
            public final boolean mo18606f0() throws RemoteException {
                Parcel a = mo10128a(7, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            public final int getId() throws RemoteException {
                Parcel a = mo10128a(4, mo10127a());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            /* renamed from: i */
            public final void mo18608i(boolean z) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12726a(a, z);
                mo10130b(21, a);
            }

            public final boolean isVisible() throws RemoteException {
                Parcel a = mo10128a(19, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: j */
            public final void mo18610j(boolean z) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12726a(a, z);
                mo10130b(24, a);
            }

            /* renamed from: n */
            public final void mo18611n(boolean z) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12726a(a, z);
                mo10130b(22, a);
            }

            /* renamed from: n0 */
            public final boolean mo18612n0() throws RemoteException {
                Parcel a = mo10128a(16, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: o */
            public final void mo18613o(boolean z) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12726a(a, z);
                mo10130b(23, a);
            }

            /* renamed from: q0 */
            public final boolean mo18614q0() throws RemoteException {
                Parcel a = mo10128a(17, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: r0 */
            public final boolean mo18615r0() throws RemoteException {
                Parcel a = mo10128a(18, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            /* renamed from: s0 */
            public final boolean mo18616s0() throws RemoteException {
                Parcel a = mo10128a(13, mo10127a());
                boolean a2 = C2615c.m12727a(a);
                a.recycle();
                return a2;
            }

            public final void startActivityForResult(Intent intent, int i) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12725a(a, (Parcelable) intent);
                a.writeInt(i);
                mo10130b(26, a);
            }

            /* renamed from: v0 */
            public final int mo18618v0() throws RemoteException {
                Parcel a = mo10128a(10, mo10127a());
                int readInt = a.readInt();
                a.recycle();
                return readInt;
            }

            /* renamed from: y */
            public final String mo18619y() throws RemoteException {
                Parcel a = mo10128a(8, mo10127a());
                String readString = a.readString();
                a.recycle();
                return readString;
            }

            public final void zza(C4519d dVar) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12724a(a, (IInterface) dVar);
                mo10130b(20, a);
            }

            public final void zzb(C4519d dVar) throws RemoteException {
                Parcel a = mo10127a();
                C2615c.m12724a(a, (IInterface) dVar);
                mo10130b(27, a);
            }
        }

        public C4517a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        /* renamed from: a */
        public static C4516c m19487a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            if (queryLocalInterface instanceof C4516c) {
                return (C4516c) queryLocalInterface;
            }
            return new C4518a(iBinder);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo10132a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    C4519d H = mo18598H();
                    parcel2.writeNoException();
                    C2615c.m12724a(parcel2, (IInterface) H);
                    break;
                case 3:
                    Bundle S = mo18601S();
                    parcel2.writeNoException();
                    C2615c.m12728b(parcel2, S);
                    break;
                case 4:
                    int id = getId();
                    parcel2.writeNoException();
                    parcel2.writeInt(id);
                    break;
                case 5:
                    C4516c I = mo18599I();
                    parcel2.writeNoException();
                    C2615c.m12724a(parcel2, (IInterface) I);
                    break;
                case 6:
                    C4519d A = mo18596A();
                    parcel2.writeNoException();
                    C2615c.m12724a(parcel2, (IInterface) A);
                    break;
                case 7:
                    boolean f0 = mo18606f0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, f0);
                    break;
                case 8:
                    String y = mo18619y();
                    parcel2.writeNoException();
                    parcel2.writeString(y);
                    break;
                case 9:
                    C4516c G = mo18597G();
                    parcel2.writeNoException();
                    C2615c.m12724a(parcel2, (IInterface) G);
                    break;
                case 10:
                    int v0 = mo18618v0();
                    parcel2.writeNoException();
                    parcel2.writeInt(v0);
                    break;
                case 11:
                    boolean Z = mo18603Z();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, Z);
                    break;
                case 12:
                    C4519d N = mo18600N();
                    parcel2.writeNoException();
                    C2615c.m12724a(parcel2, (IInterface) N);
                    break;
                case 13:
                    boolean s0 = mo18616s0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, s0);
                    break;
                case 14:
                    boolean c0 = mo18605c0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, c0);
                    break;
                case 15:
                    boolean W = mo18602W();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, W);
                    break;
                case 16:
                    boolean n0 = mo18612n0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, n0);
                    break;
                case 17:
                    boolean q0 = mo18614q0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, q0);
                    break;
                case 18:
                    boolean r0 = mo18615r0();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, r0);
                    break;
                case 19:
                    boolean isVisible = isVisible();
                    parcel2.writeNoException();
                    C2615c.m12726a(parcel2, isVisible);
                    break;
                case 20:
                    zza(C4520a.m19510a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    mo18608i(C2615c.m12727a(parcel));
                    parcel2.writeNoException();
                    break;
                case 22:
                    mo18611n(C2615c.m12727a(parcel));
                    parcel2.writeNoException();
                    break;
                case 23:
                    mo18613o(C2615c.m12727a(parcel));
                    parcel2.writeNoException();
                    break;
                case 24:
                    mo18610j(C2615c.m12727a(parcel));
                    parcel2.writeNoException();
                    break;
                case 25:
                    mo18604a((Intent) C2615c.m12723a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 26:
                    startActivityForResult((Intent) C2615c.m12723a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    break;
                case 27:
                    zzb(C4520a.m19510a(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
            return true;
        }
    }

    /* renamed from: A */
    C4519d mo18596A() throws RemoteException;

    /* renamed from: G */
    C4516c mo18597G() throws RemoteException;

    /* renamed from: H */
    C4519d mo18598H() throws RemoteException;

    /* renamed from: I */
    C4516c mo18599I() throws RemoteException;

    /* renamed from: N */
    C4519d mo18600N() throws RemoteException;

    /* renamed from: S */
    Bundle mo18601S() throws RemoteException;

    /* renamed from: W */
    boolean mo18602W() throws RemoteException;

    /* renamed from: Z */
    boolean mo18603Z() throws RemoteException;

    /* renamed from: a */
    void mo18604a(Intent intent) throws RemoteException;

    /* renamed from: c0 */
    boolean mo18605c0() throws RemoteException;

    /* renamed from: f0 */
    boolean mo18606f0() throws RemoteException;

    int getId() throws RemoteException;

    /* renamed from: i */
    void mo18608i(boolean z) throws RemoteException;

    boolean isVisible() throws RemoteException;

    /* renamed from: j */
    void mo18610j(boolean z) throws RemoteException;

    /* renamed from: n */
    void mo18611n(boolean z) throws RemoteException;

    /* renamed from: n0 */
    boolean mo18612n0() throws RemoteException;

    /* renamed from: o */
    void mo18613o(boolean z) throws RemoteException;

    /* renamed from: q0 */
    boolean mo18614q0() throws RemoteException;

    /* renamed from: r0 */
    boolean mo18615r0() throws RemoteException;

    /* renamed from: s0 */
    boolean mo18616s0() throws RemoteException;

    void startActivityForResult(Intent intent, int i) throws RemoteException;

    /* renamed from: v0 */
    int mo18618v0() throws RemoteException;

    /* renamed from: y */
    String mo18619y() throws RemoteException;

    void zza(C4519d dVar) throws RemoteException;

    void zzb(C4519d dVar) throws RemoteException;
}
