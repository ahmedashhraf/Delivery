package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.p427b.C11780c;

public final class BrandInfo implements Parcelable {
    public static final Creator<BrandInfo> CREATOR = new C11942a();
    @C0193h0

    /* renamed from: N */
    private String f34455N;
    @C0195i0

    /* renamed from: O */
    private CardBrandInfo f34456O;
    @C0193h0

    /* renamed from: a */
    private String f34457a;
    @C0193h0

    /* renamed from: b */
    private String f34458b;

    /* renamed from: com.oppwa.mobile.connect.payment.BrandInfo$a */
    static class C11942a implements Creator<BrandInfo> {
        C11942a() {
        }

        /* renamed from: a */
        public BrandInfo createFromParcel(Parcel parcel) {
            return new BrandInfo(parcel, (C11942a) null);
        }

        /* renamed from: a */
        public BrandInfo[] newArray(int i) {
            return new BrandInfo[i];
        }
    }

    private BrandInfo(Parcel parcel) {
        this.f34457a = parcel.readString();
        this.f34458b = parcel.readString();
        this.f34455N = parcel.readString();
        this.f34456O = (CardBrandInfo) parcel.readParcelable(CardBrandInfo.class.getClassLoader());
    }

    /* synthetic */ BrandInfo(Parcel parcel, C11942a aVar) {
        this(parcel);
    }

    public BrandInfo(@C0193h0 String str, @C0193h0 String str2) {
        this(str, str2, "");
    }

    public BrandInfo(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3) {
        this.f34457a = str;
        this.f34458b = str3;
        this.f34455N = str2;
    }

    /* renamed from: a */
    public BrandInfo mo40775a(@C0195i0 CardBrandInfo cardBrandInfo) {
        this.f34456O = cardBrandInfo;
        return this;
    }

    /* renamed from: a */
    public BrandInfo mo40776a(@C0193h0 String str) {
        this.f34458b = str;
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public String mo40777a() {
        return this.f34457a;
    }

    @C0195i0
    /* renamed from: b */
    public CardBrandInfo mo40778b() {
        return this.f34456O;
    }

    @C0193h0
    /* renamed from: c */
    public String mo40779c() {
        return this.f34458b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BrandInfo.class != obj.getClass()) {
            return false;
        }
        BrandInfo brandInfo = (BrandInfo) obj;
        if (!C11780c.m52958a((Object) this.f34457a, (Object) brandInfo.f34457a) || !C11780c.m52958a((Object) this.f34458b, (Object) brandInfo.f34458b) || !C11780c.m52958a((Object) this.f34455N, (Object) brandInfo.f34455N) || !C11780c.m52958a((Object) this.f34456O, (Object) brandInfo.f34456O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.f34457a.hashCode() * 31) + this.f34458b.hashCode()) * 31) + this.f34455N.hashCode()) * 31;
        CardBrandInfo cardBrandInfo = this.f34456O;
        return hashCode + (cardBrandInfo != null ? cardBrandInfo.hashCode() : 0);
    }

    @C0193h0
    /* renamed from: i */
    public String mo40783i() {
        return this.f34455N;
    }

    /* renamed from: j */
    public boolean mo40784j() {
        return this.f34455N.equals("CC");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34457a);
        parcel.writeString(this.f34458b);
        parcel.writeString(this.f34455N);
        parcel.writeParcelable(this.f34456O, i);
    }
}
