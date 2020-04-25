package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableInt extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableInt> CREATOR = new C1149a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private int f5015b;

    /* renamed from: androidx.databinding.ObservableInt$a */
    static class C1149a implements Creator<ObservableInt> {
        C1149a() {
        }

        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        public ObservableInt[] newArray(int i) {
            return new ObservableInt[i];
        }
    }

    public ObservableInt(int i) {
        this.f5015b = i;
    }

    /* renamed from: b */
    public void mo5496b(int i) {
        if (i != this.f5015b) {
            this.f5015b = i;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public int mo5498i() {
        return this.f5015b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5015b);
    }

    public ObservableInt() {
    }

    public ObservableInt(C1296v... vVarArr) {
        super(vVarArr);
    }
}
