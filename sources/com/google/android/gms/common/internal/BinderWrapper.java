package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
@C4056a
public final class BinderWrapper implements Parcelable {
    public static final Creator<BinderWrapper> CREATOR = new C4301a1();

    /* renamed from: a */
    private IBinder f13341a;

    public BinderWrapper() {
        this.f13341a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f13341a);
    }

    @C4056a
    public BinderWrapper(IBinder iBinder) {
        this.f13341a = null;
        this.f13341a = iBinder;
    }

    private BinderWrapper(Parcel parcel) {
        this.f13341a = null;
        this.f13341a = parcel.readStrongBinder();
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C4301a1 a1Var) {
        this(parcel);
    }
}
