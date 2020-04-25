package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4519d.C4520a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: c.d.a.a.d.f.u */
public final class C2668u extends C2640a implements C2666s {
    C2668u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    /* renamed from: A0 */
    public final float mo10296A0() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    /* renamed from: R */
    public final float mo10297R() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(18, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    /* renamed from: a */
    public final void mo10298a(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
    }

    /* renamed from: a */
    public final void mo10299a(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
    }

    /* renamed from: a */
    public final void mo10300a(LatLngBounds latLngBounds) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLngBounds);
        transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
    }

    /* renamed from: a */
    public final boolean mo10301a(C2666s sVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) sVar);
        Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken);
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: b */
    public final int mo10302b() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken());
        int readInt = transactAndReadException.readInt();
        transactAndReadException.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final void mo10303b(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(17, obtainAndWriteInterfaceToken);
    }

    /* renamed from: b */
    public final void mo10304b(C4519d dVar) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12914a(obtainAndWriteInterfaceToken, (IInterface) dVar);
        transactAndReadExceptionReturnVoid(21, obtainAndWriteInterfaceToken);
    }

    /* renamed from: c */
    public final void mo10305c(float f, float f2) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        obtainAndWriteInterfaceToken.writeFloat(f2);
        transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
    }

    /* renamed from: c */
    public final void mo10306c(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
    }

    /* renamed from: d */
    public final void mo10307d(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
    }

    /* renamed from: e */
    public final void mo10308e(float f) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeFloat(f);
        transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
    }

    /* renamed from: f */
    public final C4519d mo10309f() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
        C4519d a = C4520a.m19510a(transactAndReadException.readStrongBinder());
        transactAndReadException.recycle();
        return a;
    }

    /* renamed from: g */
    public final float mo10310g() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(14, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final LatLngBounds getBounds() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken());
        LatLngBounds latLngBounds = (LatLngBounds) C2658k.m12913a(transactAndReadException, LatLngBounds.CREATOR);
        transactAndReadException.recycle();
        return latLngBounds;
    }

    public final float getHeight() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(8, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final String getId() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        String readString = transactAndReadException.readString();
        transactAndReadException.recycle();
        return readString;
    }

    public final LatLng getPosition() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        LatLng latLng = (LatLng) C2658k.m12913a(transactAndReadException, LatLng.CREATOR);
        transactAndReadException.recycle();
        return latLng;
    }

    public final float getWidth() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
        float readFloat = transactAndReadException.readFloat();
        transactAndReadException.recycle();
        return readFloat;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(16, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }

    public final void remove() throws RemoteException {
        transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken());
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12915a(obtainAndWriteInterfaceToken, (Parcelable) latLng);
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        C2658k.m12916a(obtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(15, obtainAndWriteInterfaceToken);
    }

    /* renamed from: x */
    public final boolean mo10320x() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
        boolean a = C2658k.m12917a(transactAndReadException);
        transactAndReadException.recycle();
        return a;
    }
}
