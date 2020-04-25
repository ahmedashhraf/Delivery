package android.support.p003v4.app;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
/* renamed from: android.support.v4.app.RemoteActionCompatParcelizer */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(versionedParcel);
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, versionedParcel);
    }
}
