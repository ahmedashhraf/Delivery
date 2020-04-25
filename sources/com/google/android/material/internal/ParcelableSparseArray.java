package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

@C0207n0({C0208a.LIBRARY_GROUP})
public class ParcelableSparseArray extends SparseArray<Parcelable> implements Parcelable {
    public static final Creator<ParcelableSparseArray> CREATOR = new C6890a();

    /* renamed from: com.google.android.material.internal.ParcelableSparseArray$a */
    static class C6890a implements ClassLoaderCreator<ParcelableSparseArray> {
        C6890a() {
        }

        @C0193h0
        public ParcelableSparseArray[] newArray(int i) {
            return new ParcelableSparseArray[i];
        }

        @C0193h0
        public ParcelableSparseArray createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            return new ParcelableSparseArray(parcel, classLoader);
        }

        @C0195i0
        public ParcelableSparseArray createFromParcel(@C0193h0 Parcel parcel) {
            return new ParcelableSparseArray(parcel, null);
        }
    }

    public ParcelableSparseArray() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public ParcelableSparseArray(@C0193h0 Parcel parcel, @C0195i0 ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }
}
