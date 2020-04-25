package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableShort extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableShort> CREATOR = new C1152a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private short f5017b;

    /* renamed from: androidx.databinding.ObservableShort$a */
    static class C1152a implements Creator<ObservableShort> {
        C1152a() {
        }

        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        public ObservableShort[] newArray(int i) {
            return new ObservableShort[i];
        }
    }

    public ObservableShort(short s) {
        this.f5017b = s;
    }

    /* renamed from: a */
    public void mo5512a(short s) {
        if (s != this.f5017b) {
            this.f5017b = s;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public short mo5514i() {
        return this.f5017b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5017b);
    }

    public ObservableShort() {
    }

    public ObservableShort(C1296v... vVarArr) {
        super(vVarArr);
    }
}
