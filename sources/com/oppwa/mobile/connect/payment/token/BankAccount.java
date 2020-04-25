package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.oppwa.mobile.connect.p427b.C11780c;
import org.json.JSONException;
import org.json.JSONObject;

public class BankAccount implements Parcelable, Cloneable {
    public static final Creator<BankAccount> CREATOR = new C11971a();
    @C0193h0

    /* renamed from: a */
    private String f34540a;
    @C0193h0

    /* renamed from: b */
    private String f34541b;

    /* renamed from: com.oppwa.mobile.connect.payment.token.BankAccount$a */
    static class C11971a implements Creator<BankAccount> {
        C11971a() {
        }

        /* renamed from: a */
        public BankAccount createFromParcel(Parcel parcel) {
            return new BankAccount(parcel, (C11971a) null);
        }

        /* renamed from: a */
        public BankAccount[] newArray(int i) {
            return new BankAccount[i];
        }
    }

    private BankAccount(Parcel parcel) {
        this.f34540a = parcel.readString();
        this.f34541b = parcel.readString();
    }

    /* synthetic */ BankAccount(Parcel parcel, C11971a aVar) {
        this(parcel);
    }

    BankAccount(BankAccount bankAccount) {
        this.f34540a = bankAccount.mo40984b();
        this.f34541b = bankAccount.mo40985c();
    }

    public BankAccount(@C0193h0 String str, @C0193h0 String str2) {
        this.f34540a = str;
        this.f34541b = str2;
    }

    /* renamed from: a */
    static BankAccount m54024a(JSONObject jSONObject) throws JSONException {
        return new BankAccount(jSONObject.getString("holder"), jSONObject.getString("iban"));
    }

    /* renamed from: b */
    public String mo40984b() {
        return this.f34540a;
    }

    /* renamed from: c */
    public String mo40985c() {
        return this.f34541b;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || BankAccount.class != obj.getClass()) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) obj;
        if (!C11780c.m52958a((Object) this.f34540a, (Object) bankAccount.f34540a) || !C11780c.m52958a((Object) this.f34541b, (Object) bankAccount.f34541b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.f34540a.hashCode() * 31) + this.f34541b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34540a);
        parcel.writeString(this.f34541b);
    }
}
