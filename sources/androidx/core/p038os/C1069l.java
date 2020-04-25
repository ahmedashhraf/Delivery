package androidx.core.p038os;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;

@Deprecated
/* renamed from: androidx.core.os.l */
/* compiled from: ParcelableCompat */
public final class C1069l {

    /* renamed from: androidx.core.os.l$a */
    /* compiled from: ParcelableCompat */
    static class C1070a<T> implements ClassLoaderCreator<T> {

        /* renamed from: a */
        private final C1071m<T> f4742a;

        C1070a(C1071m<T> mVar) {
            this.f4742a = mVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f4742a.createFromParcel(parcel, null);
        }

        public T[] newArray(int i) {
            return this.f4742a.newArray(i);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f4742a.createFromParcel(parcel, classLoader);
        }
    }

    private C1069l() {
    }

    @Deprecated
    /* renamed from: a */
    public static <T> Creator<T> m6197a(C1071m<T> mVar) {
        return new C1070a(mVar);
    }
}
