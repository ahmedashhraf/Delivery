package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.payment.bankaccount.b */
class C11957b extends BankAccountPaymentParams {
    public static final Creator<C11957b> CREATOR = new C11958a();

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.b$a */
    static class C11958a implements Creator<C11957b> {
        C11958a() {
        }

        /* renamed from: a */
        public C11957b createFromParcel(Parcel parcel) {
            return new C11957b(parcel, null);
        }

        /* renamed from: a */
        public C11957b[] newArray(int i) {
            return new C11957b[i];
        }
    }

    private C11957b(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ C11957b(Parcel parcel, C11958a aVar) {
        this(parcel);
    }

    C11957b(String str, String str2, String str3, String str4, String str5) throws PaymentException {
        super(str, "GIROPAY", null, str2, str3, str4, str5, null, null);
        if (str2 != null && !BankAccountPaymentParams.m53920m(str2)) {
            throw new PaymentException(PaymentError.m53769o());
        } else if (str3 != null && !BankAccountPaymentParams.m53914g(str3)) {
            throw new PaymentException(PaymentError.m53770p());
        } else if (str4 != null && !BankAccountPaymentParams.m53917j(str4)) {
            throw new PaymentException(PaymentError.m53767m());
        } else if (str5 != null && !BankAccountPaymentParams.m53915h(str5)) {
            throw new PaymentException(PaymentError.m53766l());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("bankAccount.country", "DE");
        if (this.f34506S != null) {
            i.put("bankAccount.iban", mo40926s());
        }
        if (this.f34507T != null) {
            i.put("bankAccount.number", mo40920m());
        }
        if (this.f34508U != null) {
            i.put("bankAccount.bic", mo40923p());
        }
        if (this.f34509V != null) {
            i.put("bankAccount.bankCode", mo40921n());
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
