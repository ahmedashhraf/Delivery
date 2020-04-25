package com.oppwa.mobile.connect.payment.alipay;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;

@Deprecated
public class AlipayPaymentParams extends PaymentParams implements Parcelable {
    public static final Creator<AlipayPaymentParams> CREATOR = new C11953a();

    /* renamed from: com.oppwa.mobile.connect.payment.alipay.AlipayPaymentParams$a */
    static class C11953a implements Creator<AlipayPaymentParams> {
        C11953a() {
        }

        /* renamed from: a */
        public AlipayPaymentParams createFromParcel(Parcel parcel) {
            return new AlipayPaymentParams(parcel, null);
        }

        /* renamed from: a */
        public AlipayPaymentParams[] newArray(int i) {
            return new AlipayPaymentParams[i];
        }
    }

    private AlipayPaymentParams(Parcel parcel) {
        super(parcel);
    }

    /* synthetic */ AlipayPaymentParams(Parcel parcel, C11953a aVar) {
        this(parcel);
    }

    public AlipayPaymentParams(String str) throws PaymentException {
        super(str, "ALIPAY");
    }
}
