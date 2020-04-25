package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class ObservableLong extends C1173b implements Parcelable, Serializable {
    public static final Creator<ObservableLong> CREATOR = new C1150a();
    static final long serialVersionUID = 1;

    /* renamed from: b */
    private long f5016b;

    /* renamed from: androidx.databinding.ObservableLong$a */
    static class C1150a implements Creator<ObservableLong> {
        C1150a() {
        }

        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        public ObservableLong[] newArray(int i) {
            return new ObservableLong[i];
        }
    }

    public ObservableLong(long j) {
        this.f5016b = j;
    }

    /* renamed from: c */
    public void mo5502c(long j) {
        if (j != this.f5016b) {
            this.f5016b = j;
            mo5577a();
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public long mo5504i() {
        return this.f5016b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5016b);
    }

    public ObservableLong() {
    }

    public ObservableLong(C1296v... vVarArr) {
        super(vVarArr);
    }
}
