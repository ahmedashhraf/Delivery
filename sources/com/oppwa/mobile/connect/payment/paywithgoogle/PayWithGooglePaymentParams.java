package com.oppwa.mobile.connect.payment.paywithgoogle;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;

public class PayWithGooglePaymentParams extends PaymentParams implements Parcelable {
    public static final Creator<PayWithGooglePaymentParams> CREATOR = new C11970a();

    /* renamed from: R */
    private String f34539R;

    /* renamed from: com.oppwa.mobile.connect.payment.paywithgoogle.PayWithGooglePaymentParams$a */
    static class C11970a implements Creator<PayWithGooglePaymentParams> {
        C11970a() {
        }

        /* renamed from: a */
        public PayWithGooglePaymentParams createFromParcel(Parcel parcel) {
            return new PayWithGooglePaymentParams(parcel, (C11970a) null);
        }

        /* renamed from: a */
        public PayWithGooglePaymentParams[] newArray(int i) {
            return new PayWithGooglePaymentParams[i];
        }
    }

    private PayWithGooglePaymentParams(Parcel parcel) {
        super(parcel);
        this.f34539R = parcel.readString();
    }

    /* synthetic */ PayWithGooglePaymentParams(Parcel parcel, C11970a aVar) {
        this(parcel);
    }

    public PayWithGooglePaymentParams(String str, String str2) throws PaymentException {
        super(str, C10527a.f28541b);
        this.f34539R = str2;
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("googlePay.paymentToken", this.f34539R);
        return i;
    }

    /* renamed from: m */
    public String mo40920m() {
        return this.f34539R;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f34539R);
    }
}
