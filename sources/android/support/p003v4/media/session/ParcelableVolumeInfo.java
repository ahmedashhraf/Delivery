package android.support.p003v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C0121a();

    /* renamed from: N */
    public int f429N;

    /* renamed from: O */
    public int f430O;

    /* renamed from: P */
    public int f431P;

    /* renamed from: a */
    public int f432a;

    /* renamed from: b */
    public int f433b;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0121a implements Creator<ParcelableVolumeInfo> {
        C0121a() {
        }

        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f432a = i;
        this.f433b = i2;
        this.f429N = i3;
        this.f430O = i4;
        this.f431P = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f432a);
        parcel.writeInt(this.f429N);
        parcel.writeInt(this.f430O);
        parcel.writeInt(this.f431P);
        parcel.writeInt(this.f433b);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f432a = parcel.readInt();
        this.f429N = parcel.readInt();
        this.f430O = parcel.readInt();
        this.f431P = parcel.readInt();
        this.f433b = parcel.readInt();
    }
}
