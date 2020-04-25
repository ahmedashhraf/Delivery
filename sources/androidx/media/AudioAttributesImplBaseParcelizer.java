package androidx.media;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
public final class AudioAttributesImplBaseParcelizer {
    public static C1525c read(VersionedParcel versionedParcel) {
        C1525c cVar = new C1525c();
        cVar.f5869a = versionedParcel.mo8683a(cVar.f5869a, 1);
        cVar.f5870b = versionedParcel.mo8683a(cVar.f5870b, 2);
        cVar.f5871c = versionedParcel.mo8683a(cVar.f5871c, 3);
        cVar.f5872d = versionedParcel.mo8683a(cVar.f5872d, 4);
        return cVar;
    }

    public static void write(C1525c cVar, VersionedParcel versionedParcel) {
        versionedParcel.mo8714a(false, false);
        versionedParcel.mo8739b(cVar.f5869a, 1);
        versionedParcel.mo8739b(cVar.f5870b, 2);
        versionedParcel.mo8739b(cVar.f5871c, 3);
        versionedParcel.mo8739b(cVar.f5872d, 4);
    }
}
