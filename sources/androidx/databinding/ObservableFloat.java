package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableFloat extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableFloat> CREATOR = new C1148a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private float f5014b;

    /* renamed from: androidx.databinding.ObservableFloat$a */
    static class C1148a implements Creator<ObservableFloat> {
        C1148a() {
        }

        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        public ObservableFloat[] newArray(int i) {
            return new ObservableFloat[i];
        }
    }

    public ObservableFloat(float f) {
        this.f5014b = f;
    }

    /* renamed from: a */
    public void mo5490a(float f) {
        if (f != this.f5014b) {
            this.f5014b = f;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public float mo5492i() {
        return this.f5014b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f5014b);
    }

    public ObservableFloat() {
    }

    public ObservableFloat(C1296v... vVarArr) {
        super(vVarArr);
    }
}
