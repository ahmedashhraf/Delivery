package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Creator<FragmentManagerState> CREATOR = new C1368a();

    /* renamed from: N */
    BackStackState[] f5376N;

    /* renamed from: O */
    String f5377O = null;

    /* renamed from: P */
    int f5378P;

    /* renamed from: a */
    ArrayList<FragmentState> f5379a;

    /* renamed from: b */
    ArrayList<String> f5380b;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    static class C1368a implements Creator<FragmentManagerState> {
        C1368a() {
        }

        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f5379a);
        parcel.writeStringList(this.f5380b);
        parcel.writeTypedArray(this.f5376N, i);
        parcel.writeString(this.f5377O);
        parcel.writeInt(this.f5378P);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f5379a = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f5380b = parcel.createStringArrayList();
        this.f5376N = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f5377O = parcel.readString();
        this.f5378P = parcel.readInt();
    }
}
