package com.oppwa.mobile.connect.exception;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.p427b.C11780c;

public class PaymentError implements Parcelable {
    public static final Creator<PaymentError> CREATOR = new C11941a();
    @C0195i0

    /* renamed from: N */
    private String f34451N;
    @C0193h0

    /* renamed from: a */
    private ErrorCode f34452a;
    @C0193h0

    /* renamed from: b */
    private String f34453b;

    /* renamed from: com.oppwa.mobile.connect.exception.PaymentError$a */
    static class C11941a implements Creator<PaymentError> {
        C11941a() {
        }

        /* renamed from: a */
        public PaymentError createFromParcel(Parcel parcel) {
            return new PaymentError(parcel, (C11941a) null);
        }

        /* renamed from: a */
        public PaymentError[] newArray(int i) {
            return new PaymentError[i];
        }
    }

    private PaymentError(Parcel parcel) {
        this.f34452a = ErrorCode.values()[parcel.readInt()];
        this.f34453b = parcel.readString();
        this.f34451N = parcel.readString();
    }

    /* synthetic */ PaymentError(Parcel parcel, C11941a aVar) {
        this(parcel);
    }

    public PaymentError(@C0193h0 ErrorCode errorCode, @C0193h0 String str) {
        this.f34452a = errorCode;
        this.f34453b = str;
    }

    public PaymentError(@C0193h0 ErrorCode errorCode, @C0193h0 String str, @C0195i0 String str2) {
        this.f34452a = errorCode;
        this.f34453b = str;
        this.f34451N = str2;
    }

    /* renamed from: A */
    public static PaymentError m53747A() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_EMAIL_INVALID, "The email is not valid");
    }

    /* renamed from: B */
    public static PaymentError m53748B() {
        return new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "The Google Pay payment token data is invalid");
    }

    /* renamed from: C */
    public static PaymentError m53749C() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_INVALID, "The payment params are not valid.");
    }

    /* renamed from: D */
    public static PaymentError m53750D() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_MOBILE_PHONE_INVALID, "The mobile phone number is not valid");
    }

    /* renamed from: E */
    public static PaymentError m53751E() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_NATIONAL_IDENTIFIER_INVALID, "The national identifier is not valid");
    }

    /* renamed from: F */
    public static PaymentError m53752F() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_PAYMENT_BRAND_INVALID, "The payment scheme is not valid.");
    }

    /* renamed from: G */
    public static PaymentError m53753G() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_COUNTRY_INVALID, "The SOFORT country is not valid.");
    }

    /* renamed from: H */
    public static PaymentError m53754H() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_TOKEN_INVALID, "The provided token is not valid.");
    }

    @Deprecated
    /* renamed from: I */
    public static PaymentError m53755I() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_TOKENIZATION_UNSUPPORTED, "Tokenization is not supported for chosen payment brand.");
    }

    /* renamed from: J */
    public static PaymentError m53756J() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_CONNECTION_FAILURE, "Unexpected connection error.");
    }

    /* renamed from: K */
    public static PaymentError m53757K() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_NOT_INITIALIZED, "The provider must be initialized prior to using any methods. Please initialize the provider via initializeProvider()");
    }

    @Deprecated
    /* renamed from: L */
    public static PaymentError m53758L() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_SECURITY_INVALID_CHECKSUM, "File loaded from resources does not have valid checksum.Make sure you installed the framework correctly and no one has been tampering with the application");
    }

    @Deprecated
    /* renamed from: M */
    public static PaymentError m53759M() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_SECURITY_SSL_VALIDATION_FAILED, "Can't validate the SSL certificate of the remote server, aborting transaction.The SSL certificate offered by the remote peer is not signed by the expected CA.");
    }

    /* renamed from: N */
    public static PaymentError m53760N() {
        return new PaymentError(ErrorCode.ERROR_CODE_TRANSACTION_ABORTED, "Transaction was aborted.");
    }

    /* renamed from: d */
    public static PaymentError m53761d(String str) {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_CONNECTION_MALFORMED_RESPONSE, "Malformed server response.", str);
    }

    /* renamed from: e */
    public static PaymentError m53762e(String str) {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PROVIDER_INTERNAL_ERROR, str);
    }

    /* renamed from: i */
    public static PaymentError m53763i() {
        return new PaymentError(ErrorCode.ERROR_CODE_CHECKOUT_SETTINGS_MISSED, "CheckoutSettings is null.");
    }

    /* renamed from: j */
    public static PaymentError m53764j() {
        return new PaymentError(ErrorCode.ERROR_CODE_NO_AVAILABLE_PAYMENT_METHODS, "There are no available payment methods in checkout. Check your security policy configuration.");
    }

    /* renamed from: k */
    public static PaymentError m53765k() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_METHOD_NOT_AVAILABLE, "Payment method is not available. Check your security policy configuration.");
    }

    /* renamed from: l */
    public static PaymentError m53766l() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_BANK_CODE_INVALID, "The Bank code is not valid");
    }

    /* renamed from: m */
    public static PaymentError m53767m() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_BIC_INVALID, "The Bic is not valid");
    }

    /* renamed from: n */
    public static PaymentError m53768n() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_HOLDER_INVALID, "The account holder is not valid.");
    }

    /* renamed from: o */
    public static PaymentError m53769o() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_IBAN_INVALID, "The IBAN is not valid.");
    }

    /* renamed from: p */
    public static PaymentError m53770p() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_NUMBER_INVALID, "The Account number is not valid");
    }

    /* renamed from: q */
    public static PaymentError m53771q() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_BANK_ACCOUNT_BANK_NAME_INVALID, "The bank name is not valid");
    }

    @Deprecated
    /* renamed from: r */
    public static PaymentError m53772r() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_BRAND_INVALID, "The card brand is not valid.");
    }

    /* renamed from: s */
    public static PaymentError m53773s() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_CVV_INVALID, "The card cvv is not valid.");
    }

    /* renamed from: t */
    public static PaymentError m53774t() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_EXPIRED, "The card is expired.");
    }

    /* renamed from: u */
    public static PaymentError m53775u() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_HOLDER_INVALID, "The card holder is not valid.");
    }

    /* renamed from: v */
    public static PaymentError m53776v() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_MONTH_INVALID, "The card expiry month is not valid.");
    }

    /* renamed from: w */
    public static PaymentError m53777w() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_NUMBER_INVALID, "The card number is not valid.");
    }

    /* renamed from: x */
    public static PaymentError m53778x() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CARD_YEAR_INVALID, "The card expiry year is not valid.");
    }

    /* renamed from: y */
    public static PaymentError m53779y() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_CHECKOUT_ID_INVALID, "The checkout ID is not valid.");
    }

    /* renamed from: z */
    public static PaymentError m53780z() {
        return new PaymentError(ErrorCode.ERROR_CODE_PAYMENT_PARAMS_COUNTRY_CODE_INVALID, "The country code is not valid");
    }

    @C0193h0
    /* renamed from: a */
    public ErrorCode mo40760a() {
        return this.f34452a;
    }

    /* renamed from: a */
    public void mo40761a(@C0193h0 ErrorCode errorCode) {
        this.f34452a = errorCode;
    }

    /* renamed from: a */
    public void mo40762a(@C0195i0 String str) {
        this.f34451N = str;
    }

    @C0195i0
    /* renamed from: b */
    public String mo40763b() {
        return this.f34451N;
    }

    @C0193h0
    /* renamed from: c */
    public String mo40764c() {
        return this.f34453b;
    }

    /* renamed from: c */
    public void mo40765c(@C0193h0 String str) {
        this.f34453b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PaymentError.class != obj.getClass()) {
            return false;
        }
        PaymentError paymentError = (PaymentError) obj;
        if (!C11780c.m52958a((Object) this.f34452a, (Object) paymentError.f34452a) || !C11780c.m52958a((Object) this.f34453b, (Object) paymentError.f34453b) || !C11780c.m52958a((Object) this.f34451N, (Object) paymentError.f34451N)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((this.f34452a.hashCode() * 31) + this.f34453b.hashCode()) * 31;
        String str = this.f34451N;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f34452a.ordinal());
        parcel.writeString(this.f34453b);
        parcel.writeString(this.f34451N);
    }
}
