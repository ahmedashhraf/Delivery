package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.p427b.C11780c;

public final class CardBrandInfo implements Parcelable {
    public static final Creator<CardBrandInfo> CREATOR = new C11945a();
    @C0193h0

    /* renamed from: N */
    private String f34465N;
    @C0193h0

    /* renamed from: O */
    private CVVMode f34466O;

    /* renamed from: P */
    private int f34467P;

    /* renamed from: Q */
    private boolean f34468Q;

    /* renamed from: R */
    private boolean f34469R;

    /* renamed from: S */
    private boolean f34470S;
    @C0193h0

    /* renamed from: a */
    private String f34471a;
    @C0195i0

    /* renamed from: b */
    private String f34472b;

    /* renamed from: com.oppwa.mobile.connect.payment.CardBrandInfo$a */
    static class C11945a implements Creator<CardBrandInfo> {
        C11945a() {
        }

        /* renamed from: a */
        public CardBrandInfo createFromParcel(Parcel parcel) {
            return new CardBrandInfo(parcel, null);
        }

        /* renamed from: a */
        public CardBrandInfo[] newArray(int i) {
            return new CardBrandInfo[i];
        }
    }

    public CardBrandInfo() {
        this.f34471a = "[0-9]{10,19}";
        this.f34465N = "#### #### #### #### ###";
        this.f34466O = CVVMode.REQUIRED;
        this.f34467P = 3;
        this.f34468Q = true;
        this.f34469R = false;
        this.f34470S = false;
    }

    private CardBrandInfo(Parcel parcel) {
        this.f34471a = "[0-9]{10,19}";
        this.f34465N = "#### #### #### #### ###";
        this.f34466O = CVVMode.REQUIRED;
        this.f34467P = 3;
        boolean z = true;
        this.f34468Q = true;
        this.f34469R = false;
        this.f34470S = false;
        this.f34471a = parcel.readString();
        this.f34472b = parcel.readString();
        this.f34465N = parcel.readString();
        this.f34466O = (CVVMode) parcel.readParcelable(CVVMode.class.getClassLoader());
        this.f34467P = parcel.readInt();
        this.f34468Q = parcel.readByte() != 0;
        this.f34469R = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f34470S = z;
    }

    /* synthetic */ CardBrandInfo(Parcel parcel, C11945a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public int mo40813a() {
        return this.f34467P;
    }

    /* renamed from: a */
    public CardBrandInfo mo40814a(int i) {
        this.f34467P = i;
        return this;
    }

    /* renamed from: a */
    public CardBrandInfo mo40815a(CVVMode cVVMode) {
        this.f34466O = cVVMode;
        return this;
    }

    /* renamed from: a */
    public CardBrandInfo mo40816a(@C0195i0 String str) {
        this.f34472b = str;
        return this;
    }

    /* renamed from: a */
    public CardBrandInfo mo40817a(boolean z) {
        this.f34469R = z;
        return this;
    }

    /* renamed from: b */
    public CVVMode mo40818b() {
        return this.f34466O;
    }

    /* renamed from: b */
    public CardBrandInfo mo40819b(boolean z) {
        this.f34468Q = z;
        return this;
    }

    /* renamed from: c */
    public CardBrandInfo mo40820c(@C0193h0 String str) {
        this.f34465N = str;
        return this;
    }

    /* renamed from: c */
    public CardBrandInfo mo40821c(boolean z) {
        this.f34470S = z;
        return this;
    }

    @C0195i0
    /* renamed from: c */
    public String mo40822c() {
        return this.f34472b;
    }

    /* renamed from: d */
    public CardBrandInfo mo40823d(@C0193h0 String str) {
        this.f34471a = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CardBrandInfo.class != obj.getClass()) {
            return false;
        }
        CardBrandInfo cardBrandInfo = (CardBrandInfo) obj;
        if (!C11780c.m52958a((Object) this.f34471a, (Object) cardBrandInfo.f34471a) || !C11780c.m52958a((Object) this.f34472b, (Object) cardBrandInfo.f34472b) || !C11780c.m52958a((Object) this.f34465N, (Object) cardBrandInfo.f34465N) || !C11780c.m52958a((Object) this.f34466O, (Object) cardBrandInfo.f34466O) || this.f34467P != cardBrandInfo.f34467P || this.f34468Q != cardBrandInfo.f34468Q || this.f34469R != cardBrandInfo.f34469R || this.f34470S != cardBrandInfo.f34470S) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f34471a.hashCode() * 31;
        String str = this.f34472b;
        return ((((((((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f34465N.hashCode()) * 31) + this.f34466O.hashCode()) * 31) + this.f34467P) * 31) + (this.f34468Q ? 1 : 0)) * 31) + (this.f34469R ? 1 : 0)) * 31) + (this.f34470S ? 1 : 0);
    }

    @C0193h0
    /* renamed from: i */
    public String mo40827i() {
        return this.f34465N;
    }

    @C0193h0
    /* renamed from: j */
    public String mo40828j() {
        return this.f34471a;
    }

    /* renamed from: k */
    public boolean mo40829k() {
        return this.f34469R;
    }

    /* renamed from: l */
    public boolean mo40830l() {
        return this.f34468Q;
    }

    /* renamed from: m */
    public boolean mo40831m() {
        return this.f34470S;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34471a);
        parcel.writeString(this.f34472b);
        parcel.writeString(this.f34465N);
        parcel.writeParcelable(this.f34466O, 0);
        parcel.writeInt(this.f34467P);
        parcel.writeByte(this.f34468Q ? (byte) 1 : 0);
        parcel.writeByte(this.f34469R ? (byte) 1 : 0);
        parcel.writeByte(this.f34470S ? (byte) 1 : 0);
    }
}
