package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

/* renamed from: com.oppwa.mobile.connect.payment.bankaccount.c */
class C11959c extends BankAccountPaymentParams {
    public static final Creator<C11959c> CREATOR = new C11960a();

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.c$a */
    static class C11960a implements Creator<C11959c> {
        C11960a() {
        }

        /* renamed from: a */
        public C11959c createFromParcel(Parcel parcel) {
            return new C11959c(parcel, (C11960a) null);
        }

        /* renamed from: a */
        public C11959c[] newArray(int i) {
            return new C11959c[i];
        }
    }

    private C11959c(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ C11959c(Parcel parcel, C11960a aVar) {
        this(parcel);
    }

    C11959c(String str, String str2) throws PaymentException {
        super(str, "IDEAL", null, null, null, null, null, "NL", str2);
        if (!BankAccountPaymentParams.m53916i(str2)) {
            throw new PaymentException(PaymentError.m53771q());
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("bankAccount.bankName", mo40922o());
        i.put("bankAccount.country", mo40924q());
        return i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
