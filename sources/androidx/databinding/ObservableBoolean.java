package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableBoolean extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableBoolean> CREATOR = new C1144a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private boolean f5010b;

    /* renamed from: androidx.databinding.ObservableBoolean$a */
    static class C1144a implements Creator<ObservableBoolean> {
        C1144a() {
        }

        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            return new ObservableBoolean(z);
        }

        public ObservableBoolean[] newArray(int i) {
            return new ObservableBoolean[i];
        }
    }

    public ObservableBoolean(boolean z) {
        this.f5010b = z;
    }

    /* renamed from: a */
    public void mo5466a(boolean z) {
        if (z != this.f5010b) {
            this.f5010b = z;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public boolean mo5468i() {
        return this.f5010b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5010b ? 1 : 0);
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(C1296v... vVarArr) {
        super(vVarArr);
    }
}
