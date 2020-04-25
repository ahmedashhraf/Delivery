package androidx.media;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.versionedparcelable.C2003g;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f5856a = (C1523a) versionedParcel.mo8691a(audioAttributesCompat.f5856a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8714a(false, false);
        versionedParcel.mo8747b((C2003g) audioAttributesCompat.f5856a, 1);
    }
}
