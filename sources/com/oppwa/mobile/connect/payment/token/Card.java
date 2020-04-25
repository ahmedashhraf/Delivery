package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.p427b.C11780c;
import org.json.JSONException;
import org.json.JSONObject;

public class Card implements Parcelable, Cloneable {
    public static final Creator<Card> CREATOR = new C11972a();
    @C0193h0

    /* renamed from: N */
    private String f34542N;
    @C0193h0

    /* renamed from: O */
    private String f34543O;
    @C0195i0

    /* renamed from: a */
    private String f34544a;
    @C0193h0

    /* renamed from: b */
    private String f34545b;

    /* renamed from: com.oppwa.mobile.connect.payment.token.Card$a */
    static class C11972a implements Creator<Card> {
        C11972a() {
        }

        /* renamed from: a */
        public Card createFromParcel(Parcel parcel) {
            return new Card(parcel);
        }

        /* renamed from: a */
        public Card[] newArray(int i) {
            return new Card[i];
        }
    }

    protected Card(Parcel parcel) {
        this.f34544a = parcel.readString();
        this.f34545b = parcel.readString();
        this.f34542N = parcel.readString();
        this.f34543O = parcel.readString();
    }

    protected Card(Card card) {
        this.f34544a = card.mo40999i();
        this.f34545b = card.mo41000j();
        this.f34542N = card.mo40994b();
        this.f34543O = card.mo40995c();
    }

    public Card(@C0195i0 String str, @C0193h0 String str2, @C0193h0 String str3, @C0193h0 String str4) {
        this.f34544a = str;
        this.f34545b = str2;
        this.f34542N = str3;
        this.f34543O = str4;
    }

    /* renamed from: a */
    static Card m54029a(JSONObject jSONObject) throws JSONException {
        String str = "holder";
        return new Card(jSONObject.has(str) ? jSONObject.getString(str) : null, jSONObject.getString("last4Digits"), jSONObject.getString("expiryMonth"), jSONObject.getString("expiryYear"));
    }

    @C0193h0
    /* renamed from: b */
    public String mo40994b() {
        return this.f34542N;
    }

    @C0193h0
    /* renamed from: c */
    public String mo40995c() {
        return this.f34543O;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Card.class != obj.getClass()) {
            return false;
        }
        Card card = (Card) obj;
        if (!C11780c.m52958a((Object) this.f34544a, (Object) card.f34544a) || !C11780c.m52958a((Object) this.f34545b, (Object) card.f34545b) || !C11780c.m52958a((Object) this.f34542N, (Object) card.f34542N) || !C11780c.m52958a((Object) this.f34543O, (Object) card.f34543O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.f34545b.hashCode() * 31) + this.f34542N.hashCode()) * 31) + this.f34543O.hashCode()) * 31;
        String str = this.f34544a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @C0195i0
    /* renamed from: i */
    public String mo40999i() {
        return this.f34544a;
    }

    @C0193h0
    /* renamed from: j */
    public String mo41000j() {
        return this.f34545b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34544a);
        parcel.writeString(this.f34545b);
        parcel.writeString(this.f34542N);
        parcel.writeString(this.f34543O);
    }
}
