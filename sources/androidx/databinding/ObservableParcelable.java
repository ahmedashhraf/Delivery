package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableParcelable<T extends Parcelable> extends C1300y<T> implements Parcelable, Serializable {
    public static final Creator<ObservableParcelable> CREATOR = new C1151a();
    static final long serialVersionUID = 1;

    /* renamed from: androidx.databinding.ObservableParcelable$a */
    static class C1151a implements Creator<ObservableParcelable> {
        C1151a() {
        }

        public ObservableParcelable createFromParcel(Parcel parcel) {
            return new ObservableParcelable(parcel.readParcelable(C1151a.class.getClassLoader()));
        }

        public ObservableParcelable[] newArray(int i) {
            return new ObservableParcelable[i];
        }
    }

    public ObservableParcelable(T t) {
        super(t);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) mo5710i(), 0);
    }

    public ObservableParcelable() {
    }
}
