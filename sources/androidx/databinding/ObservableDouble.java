package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableDouble extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableDouble> CREATOR = new C1147a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private double f5013b;

    /* renamed from: androidx.databinding.ObservableDouble$a */
    static class C1147a implements Creator<ObservableDouble> {
        C1147a() {
        }

        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        public ObservableDouble[] newArray(int i) {
            return new ObservableDouble[i];
        }
    }

    public ObservableDouble(double d) {
        this.f5013b = d;
    }

    /* renamed from: a */
    public void mo5484a(double d) {
        if (d != this.f5013b) {
            this.f5013b = d;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public double mo5486i() {
        return this.f5013b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f5013b);
    }

    public ObservableDouble() {
    }

    public ObservableDouble(C1296v... vVarArr) {
        super(vVarArr);
    }
}
