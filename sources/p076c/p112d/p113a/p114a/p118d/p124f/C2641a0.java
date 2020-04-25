package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: c.d.a.a.d.f.a0 */
public final class C2641a0 extends C2640a implements C2672y {
    C2641a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    /* renamed from: Y */
    public final String mo10157Y() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    /* renamed from: a */
    public final boolean mo10158a(C2672y yVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) yVar);
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken);
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: b */
    public final int mo10159b() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(5, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    public final String getName() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    /* renamed from: t0 */
    public final void mo10161t0() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }
}
