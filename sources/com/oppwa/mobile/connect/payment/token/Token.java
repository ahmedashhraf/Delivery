package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;
import org.json.JSONException;
import org.json.JSONObject;

public class Token implements Parcelable, Cloneable {
    public static final Creator<Token> CREATOR = new C11973a();

    /* renamed from: N */
    private Card f34546N;

    /* renamed from: O */
    private BankAccount f34547O;
    @C0193h0

    /* renamed from: a */
    private String f34548a;
    @C0193h0

    /* renamed from: b */
    private String f34549b;

    /* renamed from: com.oppwa.mobile.connect.payment.token.Token$a */
    static class C11973a implements Creator<Token> {
        C11973a() {
        }

        /* renamed from: a */
        public Token createFromParcel(Parcel parcel) {
            return new Token(parcel, null);
        }

        /* renamed from: a */
        public Token[] newArray(int i) {
            return new Token[i];
        }
    }

    private Token(Parcel parcel) {
        this.f34548a = parcel.readString();
        this.f34549b = parcel.readString();
        this.f34546N = (Card) parcel.readParcelable(Card.class.getClassLoader());
        this.f34547O = (BankAccount) parcel.readParcelable(BankAccount.class.getClassLoader());
    }

    /* synthetic */ Token(Parcel parcel, C11973a aVar) {
        this(parcel);
    }

    private Token(Token token) {
        this.f34548a = token.mo41013j();
        this.f34549b = token.mo41012i();
        BankAccount bankAccount = null;
        this.f34546N = token.mo41008c() != null ? new Card(token.mo41008c()) : null;
        if (token.mo41007b() != null) {
            bankAccount = new BankAccount(token.mo41007b());
        }
        this.f34547O = bankAccount;
    }

    @Deprecated
    public Token(String str, PaymentParamsBrand paymentParamsBrand, BankAccount bankAccount) {
        this(str, paymentParamsBrand.mo40908j(), bankAccount);
    }

    @Deprecated
    public Token(String str, PaymentParamsBrand paymentParamsBrand, Card card) {
        this(str, paymentParamsBrand.mo40908j(), card);
    }

    public Token(String str, String str2, BankAccount bankAccount) {
        this.f34548a = str;
        this.f34549b = str2;
        this.f34547O = bankAccount;
    }

    public Token(@C0193h0 String str, String str2, Card card) {
        this.f34548a = str;
        this.f34549b = str2;
        this.f34546N = card;
    }

    /* renamed from: a */
    public static Token m54036a(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("id");
        String string2 = jSONObject.getString("paymentBrand");
        String str = "card";
        if (jSONObject.has(str)) {
            return new Token(string, string2, Card.m54029a(jSONObject.getJSONObject(str)));
        }
        String str2 = "bankAccount";
        if (jSONObject.has(str2)) {
            return new Token(string, string2, BankAccount.m54024a(jSONObject.getJSONObject(str2)));
        }
        return null;
    }

    /* renamed from: a */
    public Token mo41006a(Token token) {
        return new Token(token);
    }

    /* renamed from: b */
    public BankAccount mo41007b() {
        return this.f34547O;
    }

    /* renamed from: c */
    public Card mo41008c() {
        return this.f34546N;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || Token.class != obj.getClass()) {
            return false;
        }
        Token token = (Token) obj;
        if (!C11780c.m52958a((Object) this.f34548a, (Object) token.f34548a) || !C11780c.m52958a((Object) this.f34549b, (Object) token.f34549b) || !C11780c.m52958a((Object) this.f34546N, (Object) token.f34546N) || !C11780c.m52958a((Object) this.f34547O, (Object) token.f34547O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((this.f34548a.hashCode() * 31) + this.f34549b.hashCode()) * 31;
        Card card = this.f34546N;
        int i = 0;
        int hashCode2 = (hashCode + (card != null ? card.hashCode() : 0)) * 31;
        BankAccount bankAccount = this.f34547O;
        if (bankAccount != null) {
            i = bankAccount.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public String mo41012i() {
        return this.f34549b;
    }

    /* renamed from: j */
    public String mo41013j() {
        return this.f34548a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34548a);
        parcel.writeString(this.f34549b);
        parcel.writeParcelable(this.f34546N, i);
        parcel.writeParcelable(this.f34547O, i);
    }
}
