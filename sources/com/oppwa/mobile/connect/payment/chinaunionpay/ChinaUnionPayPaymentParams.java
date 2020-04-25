package com.oppwa.mobile.connect.payment.chinaunionpay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class ChinaUnionPayPaymentParams extends PaymentParams {
    public static final Creator<ChinaUnionPayPaymentParams> CREATOR = new C11965a();

    /* renamed from: S */
    private static SoftReference<Pattern> f34529S;
    @C0195i0

    /* renamed from: R */
    private byte[] f34530R;

    /* renamed from: com.oppwa.mobile.connect.payment.chinaunionpay.ChinaUnionPayPaymentParams$a */
    static class C11965a implements Creator<ChinaUnionPayPaymentParams> {
        C11965a() {
        }

        /* renamed from: a */
        public ChinaUnionPayPaymentParams createFromParcel(Parcel parcel) {
            return new ChinaUnionPayPaymentParams(parcel, (C11965a) null);
        }

        /* renamed from: a */
        public ChinaUnionPayPaymentParams[] newArray(int i) {
            return new ChinaUnionPayPaymentParams[i];
        }
    }

    private ChinaUnionPayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34530R = C11780c.m52959a(parcel);
    }

    /* synthetic */ ChinaUnionPayPaymentParams(Parcel parcel, C11965a aVar) {
        this(parcel);
    }

    public ChinaUnionPayPaymentParams(String str, @C0195i0 String str2) throws PaymentException {
        super(str, "CHINAUNIONPAY");
        if (str2 == null || m53988f(str2)) {
            this.f34530R = C11780c.m52960a(C11780c.m52962c(str2));
            return;
        }
        throw new PaymentException(PaymentError.m53775u());
    }

    /* renamed from: f */
    public static boolean m53988f(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        if (str.isEmpty() || m53989n().matcher(C11780c.m52962c(str)).matches()) {
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    private static Pattern m53989n() {
        SoftReference<Pattern> softReference = f34529S;
        if (softReference == null || softReference.get() == null) {
            f34529S = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return (Pattern) f34529S.get();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChinaUnionPayPaymentParams.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Arrays.equals(this.f34530R, ((ChinaUnionPayPaymentParams) obj).f34530R);
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f34530R);
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        if (this.f34530R != null) {
            i.put("virtualAccount.holder", mo40920m());
        }
        return i;
    }

    /* renamed from: m */
    public String mo40920m() {
        return C11780c.m52956a(this.f34530R);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C11780c.m52957a(parcel, this.f34530R);
    }
}
