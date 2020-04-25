package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: c.d.a.a.d.f.g0 */
public final class C2653g0 extends C2640a implements C2649e0 {
    C2653g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    /* renamed from: O */
    public final int mo10233O() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    /* renamed from: P */
    public final int mo10234P() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    /* renamed from: Q */
    public final List<LatLng> mo10235Q() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(LatLng.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    /* renamed from: T */
    public final boolean mo10236T() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: U */
    public final List<PatternItem> mo10237U() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
        ArrayList createTypedArrayList = transactAndReadException.createTypedArrayList(PatternItem.CREATOR);
        transactAndReadException.recycle();
        return createTypedArrayList;
    }

    /* renamed from: V */
    public final float mo10238V() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo10239a(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    /* renamed from: a */
    public final void mo10240a(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
    }

    /* renamed from: a */
    public final boolean mo10241a(C2649e0 e0Var) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) e0Var);
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: b */
    public final int mo10242b() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    /* renamed from: c */
    public final void mo10243c(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
    }

    /* renamed from: c */
    public final void mo10244c(List<LatLng> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeTypedList(list);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    /* renamed from: c */
    public final void mo10245c(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
    }

    /* renamed from: d */
    public final void mo10246d(List<PatternItem> list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeTypedList(list);
        transactAndReadExceptionReturnVoid(25, obtainAndWriteInterfaceToken);
    }

    /* renamed from: f */
    public final C4519d mo10247f() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(28, obtainAndWriteInterfaceToken());
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: f */
    public final void mo10248f(List list) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeList(list);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    /* renamed from: g */
    public final float mo10249g() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    /* renamed from: g0 */
    public final List mo10250g0() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(6, obtainAndWriteInterfaceToken());
        ArrayList b = C2658k.m12918b(transactAndReadException);
        transactAndReadException.recycle();
        return b;
    }

    public final String getId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    /* renamed from: h */
    public final void mo10252h(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    /* renamed from: h */
    public final void mo10253h(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    /* renamed from: i */
    public final void mo10254i(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    public final boolean isVisible() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: j */
    public final void mo10256j(int i) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        transactAndReadExceptionReturnVoid(23, obtainAndWriteInterfaceToken);
    }

    /* renamed from: m0 */
    public final int mo10257m0() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(24, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    public final void remove() throws RemoteException {
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    /* renamed from: x */
    public final boolean mo10260x() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(22, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }
}
