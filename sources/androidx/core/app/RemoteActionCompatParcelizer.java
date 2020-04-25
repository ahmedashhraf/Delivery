package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C2003g;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f3383a = (IconCompat) versionedParcel.mo8691a(remoteActionCompat.f3383a, 1);
        remoteActionCompat.f3384b = versionedParcel.mo8693a(remoteActionCompat.f3384b, 2);
        remoteActionCompat.f3385c = versionedParcel.mo8693a(remoteActionCompat.f3385c, 3);
        remoteActionCompat.f3386d = (PendingIntent) versionedParcel.mo8687a(remoteActionCompat.f3386d, 4);
        remoteActionCompat.f3387e = versionedParcel.mo8724a(remoteActionCompat.f3387e, 5);
        remoteActionCompat.f3388f = versionedParcel.mo8724a(remoteActionCompat.f3388f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8714a(false, false);
        versionedParcel.mo8747b((C2003g) remoteActionCompat.f3383a, 1);
        versionedParcel.mo8748b(remoteActionCompat.f3384b, 2);
        versionedParcel.mo8748b(remoteActionCompat.f3385c, 3);
        versionedParcel.mo8743b((Parcelable) remoteActionCompat.f3386d, 4);
        versionedParcel.mo8754b(remoteActionCompat.f3387e, 5);
        versionedParcel.mo8754b(remoteActionCompat.f3388f, 6);
    }
}
