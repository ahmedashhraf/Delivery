package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0649h;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Creator<ExtendableSavedState> CREATOR = new C7045a();
    @C0193h0
    public final C0649h<String, Bundle> extendableStates;

    /* renamed from: com.google.android.material.stateful.ExtendableSavedState$a */
    static class C7045a implements ClassLoaderCreator<ExtendableSavedState> {
        C7045a() {
        }

        @C0193h0
        public ExtendableSavedState[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        @C0193h0
        public ExtendableSavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @C0195i0
        public ExtendableSavedState createFromParcel(@C0193h0 Parcel parcel) {
            return new ExtendableSavedState(parcel, null, null);
        }
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, C7045a aVar) {
        this(parcel, classLoader);
    }

    @C0193h0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.extendableStates);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.extendableStates.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) this.extendableStates.mo3361b(i2);
            bundleArr[i2] = (Bundle) this.extendableStates.mo3367d(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new C0649h<>();
    }

    private ExtendableSavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.extendableStates = new C0649h<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.extendableStates.put(strArr[i], bundleArr[i]);
        }
    }
}
