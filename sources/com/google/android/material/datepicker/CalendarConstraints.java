package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Creator<CalendarConstraints> CREATOR = new C6794a();
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: N */
    public final Month f18889N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final DateValidator f18890O;

    /* renamed from: P */
    private final int f18891P;

    /* renamed from: Q */
    private final int f18892Q;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: a */
    public final Month f18893a;
    /* access modifiers changed from: private */
    @C0193h0

    /* renamed from: b */
    public final Month f18894b;

    public interface DateValidator extends Parcelable {
        /* renamed from: b */
        boolean mo27085b(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    static class C6794a implements Creator<CalendarConstraints> {
        C6794a() {
        }

        @C0193h0
        public CalendarConstraints createFromParcel(@C0193h0 Parcel parcel) {
            CalendarConstraints calendarConstraints = new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), null);
            return calendarConstraints;
        }

        @C0193h0
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C6795b {

        /* renamed from: e */
        static final long f18895e = C6840p.m32679a(Month.m32505a(1900, 0).f18909R);

        /* renamed from: f */
        static final long f18896f = C6840p.m32679a(Month.m32505a(2100, 11).f18909R);

        /* renamed from: g */
        private static final String f18897g = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a */
        private long f18898a = f18895e;

        /* renamed from: b */
        private long f18899b = f18896f;

        /* renamed from: c */
        private Long f18900c;

        /* renamed from: d */
        private DateValidator f18901d = DateValidatorPointForward.m32499a(Long.MIN_VALUE);

        public C6795b() {
        }

        @C0193h0
        /* renamed from: a */
        public C6795b mo27088a(long j) {
            this.f18899b = j;
            return this;
        }

        @C0193h0
        /* renamed from: b */
        public C6795b mo27091b(long j) {
            this.f18900c = Long.valueOf(j);
            return this;
        }

        @C0193h0
        /* renamed from: c */
        public C6795b mo27092c(long j) {
            this.f18898a = j;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C6795b mo27089a(DateValidator dateValidator) {
            this.f18901d = dateValidator;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public CalendarConstraints mo27090a() {
            if (this.f18900c == null) {
                long D = C6822g.m32606D();
                if (this.f18898a > D || D > this.f18899b) {
                    D = this.f18898a;
                }
                this.f18900c = Long.valueOf(D);
            }
            Bundle bundle = new Bundle();
            DateValidator dateValidator = this.f18901d;
            String str = f18897g;
            bundle.putParcelable(str, dateValidator);
            CalendarConstraints calendarConstraints = new CalendarConstraints(Month.m32506c(this.f18898a), Month.m32506c(this.f18899b), Month.m32506c(this.f18900c.longValue()), (DateValidator) bundle.getParcelable(str), null);
            return calendarConstraints;
        }

        C6795b(@C0193h0 CalendarConstraints calendarConstraints) {
            this.f18898a = calendarConstraints.f18893a.f18909R;
            this.f18899b = calendarConstraints.f18894b.f18909R;
            this.f18900c = Long.valueOf(calendarConstraints.f18889N.f18909R);
            this.f18901d = calendarConstraints.f18890O;
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, Month month3, DateValidator dateValidator, C6794a aVar) {
        this(month, month2, month3, dateValidator);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f18893a.equals(calendarConstraints.f18893a) || !this.f18894b.equals(calendarConstraints.f18894b) || !this.f18889N.equals(calendarConstraints.f18889N) || !this.f18890O.equals(calendarConstraints.f18890O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18893a, this.f18894b, this.f18889N, this.f18890O});
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: i */
    public Month mo27081i() {
        return this.f18889N;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: j */
    public Month mo27082j() {
        return this.f18893a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo27083k() {
        return this.f18891P;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f18893a, 0);
        parcel.writeParcelable(this.f18894b, 0);
        parcel.writeParcelable(this.f18889N, 0);
        parcel.writeParcelable(this.f18890O, 0);
    }

    private CalendarConstraints(@C0193h0 Month month, @C0193h0 Month month2, @C0193h0 Month month3, DateValidator dateValidator) {
        this.f18893a = month;
        this.f18894b = month2;
        this.f18889N = month3;
        this.f18890O = dateValidator;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3.compareTo(month2) <= 0) {
            this.f18892Q = month.mo27120b(month2) + 1;
            this.f18891P = (month2.f18906O - month.f18906O) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* renamed from: a */
    public DateValidator mo27074a() {
        return this.f18890O;
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: b */
    public Month mo27075b() {
        return this.f18894b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo27077c(long j) {
        if (this.f18893a.mo27118a(1) <= j) {
            Month month = this.f18894b;
            if (j <= month.mo27118a(month.f18908Q)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo27076c() {
        return this.f18892Q;
    }
}
