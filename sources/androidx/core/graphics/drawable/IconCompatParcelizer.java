package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.versionedparcelable.VersionedParcel;

@C0207n0({C0208a.LIBRARY})
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4084a = versionedParcel.mo8683a(iconCompat.f4084a, 1);
        iconCompat.f4086c = versionedParcel.mo8725a(iconCompat.f4086c, 2);
        iconCompat.f4087d = versionedParcel.mo8687a(iconCompat.f4087d, 3);
        iconCompat.f4088e = versionedParcel.mo8683a(iconCompat.f4088e, 4);
        iconCompat.f4089f = versionedParcel.mo8683a(iconCompat.f4089f, 5);
        iconCompat.f4090g = (ColorStateList) versionedParcel.mo8687a(iconCompat.f4090g, 6);
        iconCompat.f4092i = versionedParcel.mo8695a(iconCompat.f4092i, 7);
        iconCompat.mo4581g();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo8714a(true, true);
        iconCompat.mo4579a(versionedParcel.mo8765c());
        int i = iconCompat.f4084a;
        if (-1 != i) {
            versionedParcel.mo8739b(i, 1);
        }
        byte[] bArr = iconCompat.f4086c;
        if (bArr != null) {
            versionedParcel.mo8755b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4087d;
        if (parcelable != null) {
            versionedParcel.mo8743b(parcelable, 3);
        }
        int i2 = iconCompat.f4088e;
        if (i2 != 0) {
            versionedParcel.mo8739b(i2, 4);
        }
        int i3 = iconCompat.f4089f;
        if (i3 != 0) {
            versionedParcel.mo8739b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f4090g;
        if (colorStateList != null) {
            versionedParcel.mo8743b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f4092i;
        if (str != null) {
            versionedParcel.mo8750b(str, 7);
        }
    }
}
