package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class TokenPaymentParams extends PaymentParams implements Parcelable {
    public static final Creator<TokenPaymentParams> CREATOR = new C11974a();

    /* renamed from: U */
    private static SoftReference<Pattern> f34550U;
    @C0193h0

    /* renamed from: R */
    private String f34551R;
    @C0195i0

    /* renamed from: S */
    private byte[] f34552S;
    @C0195i0

    /* renamed from: T */
    private Integer f34553T;

    /* renamed from: com.oppwa.mobile.connect.payment.token.TokenPaymentParams$a */
    static class C11974a implements Creator<TokenPaymentParams> {
        C11974a() {
        }

        /* renamed from: a */
        public TokenPaymentParams createFromParcel(Parcel parcel) {
            return new TokenPaymentParams(parcel, null);
        }

        /* renamed from: a */
        public TokenPaymentParams[] newArray(int i) {
            return new TokenPaymentParams[i];
        }
    }

    private TokenPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34551R = parcel.readString();
        this.f34552S = C11780c.m52959a(parcel);
        this.f34553T = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    /* synthetic */ TokenPaymentParams(Parcel parcel, C11974a aVar) {
        this(parcel);
    }

    @Deprecated
    public TokenPaymentParams(String str, String str2, PaymentParamsBrand paymentParamsBrand) throws PaymentException {
        this(str, str2, paymentParamsBrand.mo40908j());
    }

    @Deprecated
    public TokenPaymentParams(String str, String str2, PaymentParamsBrand paymentParamsBrand, String str3) throws PaymentException {
        this(str, str2, paymentParamsBrand.mo40908j());
        if (str3 == null || m54044c(str3, paymentParamsBrand.mo40908j())) {
            this.f34552S = C11780c.m52960a(str3);
            return;
        }
        throw new PaymentException(PaymentError.m53773s());
    }

    public TokenPaymentParams(String str, String str2, String str3) throws PaymentException {
        super(str, str3);
        if (m54045f(str2)) {
            this.f34551R = str2;
            return;
        }
        throw new PaymentException(PaymentError.m53754H());
    }

    public TokenPaymentParams(String str, String str2, String str3, String str4) throws PaymentException {
        this(str, str2, str3);
        if (str4 == null || m54044c(str4, str3)) {
            this.f34552S = C11780c.m52960a(str4);
            return;
        }
        throw new PaymentException(PaymentError.m53773s());
    }

    /* renamed from: c */
    public static boolean m54044c(String str, String str2) {
        return CardPaymentParams.m53954d(str, str2);
    }

    /* renamed from: f */
    public static boolean m54045f(String str) {
        return str != null && m54046p().matcher(str).matches();
    }

    /* renamed from: p */
    private static Pattern m54046p() {
        SoftReference<Pattern> softReference = f34550U;
        if (softReference == null || softReference.get() == null) {
            f34550U = new SoftReference<>(Pattern.compile("[a-zA-Z0-9]{32}"));
        }
        return (Pattern) f34550U.get();
    }

    /* renamed from: a */
    public TokenPaymentParams mo41019a(@C0195i0 Integer num) {
        this.f34553T = num;
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
        if (obj == null || TokenPaymentParams.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        TokenPaymentParams tokenPaymentParams = (TokenPaymentParams) obj;
        if (!C11780c.m52958a((Object) this.f34551R, (Object) tokenPaymentParams.f34551R) || !Arrays.equals(this.f34552S, tokenPaymentParams.f34552S) || !C11780c.m52958a((Object) this.f34553T, (Object) tokenPaymentParams.f34553T)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((super.hashCode() * 31) + this.f34551R.hashCode()) * 31) + Arrays.hashCode(this.f34552S)) * 31;
        Integer num = this.f34553T;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("registrationId", this.f34551R);
        if (this.f34552S != null) {
            i.put("card.cvv", mo40920m());
        }
        Integer num = this.f34553T;
        if (num != null) {
            i.put("recurring.numberOfInstallments", num.toString());
        }
        return i;
    }

    /* renamed from: l */
    public void mo40901l() {
        if (this.f34552S != null) {
            this.f34552S = C11780c.m52960a(new String(new char[mo40920m().length()]).replace(0, '*'));
        }
    }

    @C0195i0
    /* renamed from: m */
    public String mo40920m() {
        return C11780c.m52956a(this.f34552S);
    }

    @C0195i0
    /* renamed from: n */
    public Integer mo40921n() {
        return this.f34553T;
    }

    @C0193h0
    /* renamed from: o */
    public String mo40922o() {
        return this.f34551R;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f34551R);
        C11780c.m52957a(parcel, this.f34552S);
        parcel.writeValue(this.f34553T);
    }
}
