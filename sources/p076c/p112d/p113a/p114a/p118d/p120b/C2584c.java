package p076c.p112d.p113a.p114a.p118d.p120b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: c.d.a.a.d.b.c */
public class C2584c {

    /* renamed from: a */
    private static final ClassLoader f9693a = C2584c.class.getClassLoader();

    private C2584c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m12681a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m12682a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
