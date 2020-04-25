package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.internal.ServerProtocol;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.payment.bankaccount.a */
class C11955a extends BankAccountPaymentParams {
    public static final Creator<C11955a> CREATOR = new C11956a();

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.a$a */
    static class C11956a implements Creator<C11955a> {
        C11956a() {
        }

        /* renamed from: a */
        public C11955a createFromParcel(Parcel parcel) {
            return new C11955a(parcel, null);
        }

        /* renamed from: a */
        public C11955a[] newArray(int i) {
            return new C11955a[i];
        }
    }

    private C11955a(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ C11955a(Parcel parcel, C11956a aVar) {
        this(parcel);
    }

    C11955a(String str, String str2, String str3, boolean z) throws PaymentException {
        super(str, "DIRECTDEBIT_SEPA", str2, str3, null, null, null, null, null);
        if (!BankAccountPaymentParams.m53919l(str2)) {
            throw new PaymentException(PaymentError.m53768n());
        } else if (BankAccountPaymentParams.m53920m(str3)) {
            this.f34512Y = z;
        } else {
            throw new PaymentException(PaymentError.m53769o());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("bankAccount.holder", mo40925r());
        i.put("bankAccount.iban", mo40926s());
        if (this.f34512Y) {
            i.put("createRegistration", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
