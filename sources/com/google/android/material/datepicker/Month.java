package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Creator<Month> CREATOR = new C6798a();

    /* renamed from: N */
    final int f18905N = this.f18910a.get(2);

    /* renamed from: O */
    final int f18906O = this.f18910a.get(1);

    /* renamed from: P */
    final int f18907P = this.f18910a.getMaximum(7);

    /* renamed from: Q */
    final int f18908Q = this.f18910a.getActualMaximum(5);

    /* renamed from: R */
    final long f18909R = this.f18910a.getTimeInMillis();
    @C0193h0

    /* renamed from: a */
    private final Calendar f18910a;
    @C0193h0

    /* renamed from: b */
    private final String f18911b = C6840p.m32704i().format(this.f18910a.getTime());

    /* renamed from: com.google.android.material.datepicker.Month$a */
    static class C6798a implements Creator<Month> {
        C6798a() {
        }

        @C0193h0
        public Month createFromParcel(@C0193h0 Parcel parcel) {
            return Month.m32505a(parcel.readInt(), parcel.readInt());
        }

        @C0193h0
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(@C0193h0 Calendar calendar) {
        calendar.set(5, 1);
        this.f18910a = C6840p.m32686a(calendar);
    }

    @C0193h0
    /* renamed from: a */
    static Month m32505a(int i, int i2) {
        Calendar h = C6840p.m32703h();
        h.set(1, i);
        h.set(2, i2);
        return new Month(h);
    }

    @C0193h0
    /* renamed from: c */
    static Month m32506c(long j) {
        Calendar h = C6840p.m32703h();
        h.setTimeInMillis(j);
        return new Month(h);
    }

    @C0193h0
    /* renamed from: k */
    static Month m32507k() {
        return new Month(C6840p.m32699f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo27119b() {
        int firstDayOfWeek = this.f18910a.get(7) - this.f18910a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f18907P : firstDayOfWeek;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (!(this.f18905N == month.f18905N && this.f18906O == month.f18906O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18905N), Integer.valueOf(this.f18906O)});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public long mo27127j() {
        return this.f18910a.getTimeInMillis();
    }

    public void writeToParcel(@C0193h0 Parcel parcel, int i) {
        parcel.writeInt(this.f18906O);
        parcel.writeInt(this.f18905N);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo27120b(@C0193h0 Month month) {
        if (this.f18910a instanceof GregorianCalendar) {
            return ((month.f18906O - this.f18906O) * 12) + (month.f18905N - this.f18905N);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: c */
    public String mo27122c() {
        return this.f18911b;
    }

    /* renamed from: a */
    public int compareTo(@C0193h0 Month month) {
        return this.f18910a.compareTo(month.f18910a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo27118a(int i) {
        Calendar a = C6840p.m32686a(this.f18910a);
        a.set(5, i);
        return a.getTimeInMillis();
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    /* renamed from: b */
    public Month mo27121b(int i) {
        Calendar a = C6840p.m32686a(this.f18910a);
        a.add(2, i);
        return new Month(a);
    }
}
