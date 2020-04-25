package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.payment.bankaccount.d */
class C11961d extends BankAccountPaymentParams {
    public static final Creator<C11961d> CREATOR = new C11962a();

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.d$a */
    static class C11962a implements Creator<C11961d> {
        C11962a() {
        }

        /* renamed from: a */
        public C11961d createFromParcel(Parcel parcel) {
            return new C11961d(parcel, (C11962a) null);
        }

        /* renamed from: a */
        public C11961d[] newArray(int i) {
            return new C11961d[i];
        }
    }

    private C11961d(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ C11961d(Parcel parcel, C11962a aVar) {
        this(parcel);
    }

    C11961d(String str, String str2) throws PaymentException {
        super(str, "SOFORTUEBERWEISUNG", null, null, null, null, null, str2, null);
        if (!BankAccountPaymentParams.m53918k(str2)) {
            throw new PaymentException(PaymentError.m53753G());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("bankAccount.country", mo40924q());
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
