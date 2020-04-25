package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.Tile;

/* renamed from: c.d.a.a.d.f.i */
public final class C2656i extends C2640a implements C2652g {
    C2656i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    public final Tile getTile(int i, int i2, int i3) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        obtainAndWriteInterfaceToken.writeInt(i);
        obtainAndWriteInterfaceToken.writeInt(i2);
        obtainAndWriteInterfaceToken.writeInt(i3);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        Tile tile = (Tile) C2658k.m12913a(transactAndReadException, Tile.CREATOR);
        transactAndReadException.recycle();
        return tile;
    }
}
