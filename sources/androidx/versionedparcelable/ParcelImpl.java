package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@SuppressLint({"BanParcelableUsage"})
@C0207n0({C0208a.LIBRARY})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C1993a();

    /* renamed from: a */
    private final C2003g f7690a;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1993a implements Creator<ParcelImpl> {
        C1993a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C2003g gVar) {
        this.f7690a = gVar;
    }

    /* renamed from: a */
    public <T extends C2003g> T mo8675a() {
        return this.f7690a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1999e(parcel).mo8708a(this.f7690a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f7690a = new C1999e(parcel).mo8783u();
    }
}
