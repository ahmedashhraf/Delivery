package com.oppwa.mobile.connect.payment.paypal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;

@Deprecated
public class PayPalPaymentParams extends PaymentParams {
    public static final Creator<PayPalPaymentParams> CREATOR = new C11969a();

    /* renamed from: com.oppwa.mobile.connect.payment.paypal.PayPalPaymentParams$a */
    static class C11969a implements Creator<PayPalPaymentParams> {
        C11969a() {
        }

        /* renamed from: a */
        public PayPalPaymentParams createFromParcel(Parcel parcel) {
            return new PayPalPaymentParams(parcel, null);
        }

        /* renamed from: a */
        public PayPalPaymentParams[] newArray(int i) {
            return new PayPalPaymentParams[i];
        }
    }

    private PayPalPaymentParams(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ PayPalPaymentParams(Parcel parcel, C11969a aVar) {
        this(parcel);
    }

    public PayPalPaymentParams(String str) throws PaymentException {
        super(str, "PAYPAL");
    }
}
