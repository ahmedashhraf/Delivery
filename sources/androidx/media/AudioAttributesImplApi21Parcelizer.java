package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
public final class AudioAttributesImplApi21Parcelizer {
    public static C1524b read(VersionedParcel versionedParcel) {
        C1524b bVar = new C1524b();
        bVar.f5867a = (AudioAttributes) versionedParcel.mo8687a(bVar.f5867a, 1);
        bVar.f5868b = versionedParcel.mo8683a(bVar.f5868b, 2);
        return bVar;
    }

    public static void write(C1524b bVar, VersionedParcel versionedParcel) {
        versionedParcel.mo8714a(false, false);
        versionedParcel.mo8743b((Parcelable) bVar.f5867a, 1);
        versionedParcel.mo8739b(bVar.f5868b, 2);
    }
}
