package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.material.datepicker.CalendarConstraints.DateValidator;
import java.util.Arrays;

public class DateValidatorPointForward implements DateValidator {
    public static final Creator<DateValidatorPointForward> CREATOR = new C6796a();

    /* renamed from: a */
    private final long f18902a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    static class C6796a implements Creator<DateValidatorPointForward> {
        C6796a() {
        }

        @C0193h0
        public DateValidatorPointForward createFromParcel(@C0193h0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @C0193h0
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C6796a aVar) {
        this(j);
    }

    @C0193h0
    /* renamed from: a */
    public static DateValidatorPointForward m32499a(long j) {
        return new DateValidatorPointForward(j);
    }

    /* renamed from: b */
    public boolean mo27085b(long j) {
        return j >= this.f18902a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f18902a != ((DateValidatorPointForward) obj).f18902a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f18902a)});
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        parcel.writeLong(this.f18902a);
    }

    private DateValidatorPointForward(long j) {
        this.f18902a = j;
    }

    @C0193h0
    /* renamed from: a */
    public static DateValidatorPointForward m32498a() {
        return m32499a(C6840p.m32699f().getTimeInMillis());
    }
}
