package com.github.aakira.expandablelayout;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class ExpandableSavedState extends BaseSavedState {
    public static final Creator<ExpandableSavedState> CREATOR = new C3894a();
    private int size;
    private float weight;

    /* renamed from: com.github.aakira.expandablelayout.ExpandableSavedState$a */
    static class C3894a implements Creator<ExpandableSavedState> {
        C3894a() {
        }

        public ExpandableSavedState createFromParcel(Parcel parcel) {
            return new ExpandableSavedState(parcel, null);
        }

        public ExpandableSavedState[] newArray(int i) {
            return new ExpandableSavedState[i];
        }
    }

    /* synthetic */ ExpandableSavedState(Parcel parcel, C3894a aVar) {
        this(parcel);
    }

    public int getSize() {
        return this.size;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.size);
        parcel.writeFloat(this.weight);
    }

    ExpandableSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private ExpandableSavedState(Parcel parcel) {
        super(parcel);
        this.size = parcel.readInt();
        this.weight = parcel.readFloat();
    }
}
