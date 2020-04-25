package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableChar extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableChar> CREATOR = new C1146a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private char f5012b;

    /* renamed from: androidx.databinding.ObservableChar$a */
    static class C1146a implements Creator<ObservableChar> {
        C1146a() {
        }

        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        public ObservableChar[] newArray(int i) {
            return new ObservableChar[i];
        }
    }

    public ObservableChar(char c) {
        this.f5012b = c;
    }

    /* renamed from: a */
    public void mo5478a(char c) {
        if (c != this.f5012b) {
            this.f5012b = c;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public char mo5480i() {
        return this.f5012b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5012b);
    }

    public ObservableChar() {
    }

    public ObservableChar(C1296v... vVarArr) {
        super(vVarArr);
    }
}
