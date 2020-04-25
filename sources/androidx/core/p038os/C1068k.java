package androidx.core.p038os;

import android.os.Parcel;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.os.k */
/* compiled from: ParcelCompat */
public final class C1068k {
    private C1068k() {
    }

    /* renamed from: a */
    public static boolean m6196a(@C0193h0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: a */
    public static void m6195a(@C0193h0 Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
