package com.oppwa.mobile.connect.payment.googlepay;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;

public class GooglePayPaymentParams extends PaymentParams implements Parcelable {
    public static final Creator<GooglePayPaymentParams> CREATOR = new C11966a();

    /* renamed from: R */
    private String f34531R;

    /* renamed from: com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams$a */
    static class C11966a implements Creator<GooglePayPaymentParams> {
        C11966a() {
        }

        /* renamed from: a */
        public GooglePayPaymentParams createFromParcel(Parcel parcel) {
            return new GooglePayPaymentParams(parcel, (C11966a) null);
        }

        /* renamed from: a */
        public GooglePayPaymentParams[] newArray(int i) {
            return new GooglePayPaymentParams[i];
        }
    }

    private GooglePayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34531R = parcel.readString();
    }

    /* synthetic */ GooglePayPaymentParams(Parcel parcel, C11966a aVar) {
        this(parcel);
    }

    public GooglePayPaymentParams(String str, String str2) throws PaymentException {
        super(str, C10527a.f28541b);
        if (str2 == null || str2.isEmpty()) {
            throw new PaymentException(PaymentError.m53748B());
        }
        this.f34531R = str2;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("googlePay.paymentToken", this.f34531R);
        return i;
    }

    /* renamed from: m */
    public String mo40920m() {
        return this.f34531R;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f34531R);
    }
}
