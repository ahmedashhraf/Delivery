package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableByte extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableByte> CREATOR = new C1145a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private byte f5011b;

    /* renamed from: androidx.databinding.ObservableByte$a */
    static class C1145a implements Creator<ObservableByte> {
        C1145a() {
        }

        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        public ObservableByte[] newArray(int i) {
            return new ObservableByte[i];
        }
    }

    public ObservableByte(byte b) {
        this.f5011b = b;
    }

    /* renamed from: a */
    public void mo5472a(byte b) {
        if (b != this.f5011b) {
            this.f5011b = b;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public byte mo5474i() {
        return this.f5011b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f5011b);
    }

    public ObservableByte() {
    }

    public ObservableByte(C1296v... vVarArr) {
        super(vVarArr);
    }
}
