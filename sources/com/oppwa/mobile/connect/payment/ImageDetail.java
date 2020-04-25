package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.p427b.C11780c;

public class ImageDetail implements Parcelable {
    public static final Creator<ImageDetail> CREATOR = new C11947a();

    /* renamed from: N */
    private String f34483N;

    /* renamed from: O */
    private String f34484O;

    /* renamed from: P */
    private String f34485P;

    /* renamed from: a */
    private String f34486a;

    /* renamed from: b */
    private String f34487b;

    /* renamed from: com.oppwa.mobile.connect.payment.ImageDetail$a */
    static class C11947a implements Creator<ImageDetail> {
        C11947a() {
        }

        /* renamed from: a */
        public ImageDetail createFromParcel(Parcel parcel) {
            return new ImageDetail(parcel, null);
        }

        /* renamed from: a */
        public ImageDetail[] newArray(int i) {
            return new ImageDetail[i];
        }
    }

    public ImageDetail() {
    }

    private ImageDetail(Parcel parcel) {
        this.f34486a = parcel.readString();
        this.f34487b = parcel.readString();
        this.f34483N = parcel.readString();
        this.f34484O = parcel.readString();
        this.f34485P = parcel.readString();
    }

    /* synthetic */ ImageDetail(Parcel parcel, C11947a aVar) {
        this(parcel);
    }

    public ImageDetail(String str, String str2, String str3, String str4, String str5) {
        this.f34486a = str;
        this.f34487b = str2;
        this.f34483N = str3;
        this.f34484O = str4;
        this.f34485P = str5;
    }

    /* renamed from: a */
    public String mo40857a() {
        return this.f34485P;
    }

    /* renamed from: a */
    public void mo40858a(String str) {
        this.f34485P = str;
    }

    /* renamed from: b */
    public String mo40859b() {
        return this.f34483N;
    }

    /* renamed from: c */
    public String mo40860c() {
        return this.f34486a;
    }

    /* renamed from: c */
    public void mo40861c(String str) {
        this.f34483N = str;
    }

    /* renamed from: d */
    public void mo40862d(String str) {
        this.f34486a = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo40864e(String str) {
        this.f34484O = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ImageDetail.class != obj.getClass()) {
            return false;
        }
        ImageDetail imageDetail = (ImageDetail) obj;
        if (!C11780c.m52958a((Object) this.f34486a, (Object) imageDetail.f34486a) || !C11780c.m52958a((Object) this.f34487b, (Object) imageDetail.f34487b) || !C11780c.m52958a((Object) this.f34483N, (Object) imageDetail.f34483N) || !C11780c.m52958a((Object) this.f34484O, (Object) imageDetail.f34484O) || !C11780c.m52958a((Object) this.f34485P, (Object) imageDetail.f34485P)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo40866f(String str) {
        this.f34487b = str;
    }

    public int hashCode() {
        String str = this.f34486a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34487b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f34483N;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f34484O;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f34485P;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public String mo40868i() {
        return this.f34484O;
    }

    /* renamed from: j */
    public String mo40869j() {
        return this.f34487b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34486a);
        parcel.writeString(this.f34487b);
        parcel.writeString(this.f34483N);
        parcel.writeString(this.f34484O);
        parcel.writeString(this.f34485P);
    }
}
