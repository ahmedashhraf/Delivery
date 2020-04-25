package com.oppwa.mobile.connect.payment.mbway;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Arrays;
import java.util.Map;

public class MBWayPaymentParams extends PaymentParams {
    public static final Creator<MBWayPaymentParams> CREATOR = new C11968a();

    /* renamed from: R */
    private byte[] f34536R;

    /* renamed from: S */
    private byte[] f34537S;

    /* renamed from: T */
    private byte[] f34538T;

    /* renamed from: com.oppwa.mobile.connect.payment.mbway.MBWayPaymentParams$a */
    static class C11968a implements Creator<MBWayPaymentParams> {
        C11968a() {
        }

        /* renamed from: a */
        public MBWayPaymentParams createFromParcel(Parcel parcel) {
            return new MBWayPaymentParams(parcel, (C11968a) null);
        }

        /* renamed from: a */
        public MBWayPaymentParams[] newArray(int i) {
            return new MBWayPaymentParams[i];
        }
    }

    private MBWayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34536R = C11780c.m52959a(parcel);
        this.f34537S = C11780c.m52959a(parcel);
        this.f34538T = C11780c.m52959a(parcel);
    }

    /* synthetic */ MBWayPaymentParams(Parcel parcel, C11968a aVar) {
        this(parcel);
    }

    public MBWayPaymentParams(@C0193h0 String str, @C0193h0 String str2) throws PaymentException {
        super(str, "MBWAY");
        if (!TextUtils.isEmpty(str2)) {
            this.f34538T = C11780c.m52960a(str2);
            return;
        }
        throw new PaymentException(PaymentError.m53747A());
    }

    public MBWayPaymentParams(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3) throws PaymentException {
        super(str, "MBWAY");
        if (TextUtils.isEmpty(str2)) {
            throw new PaymentException(PaymentError.m53780z());
        } else if (!TextUtils.isEmpty(str3)) {
            this.f34536R = C11780c.m52960a(str2);
            this.f34537S = C11780c.m52960a(str3);
        } else {
            throw new PaymentException(PaymentError.m53750D());
        }
    }

    /* renamed from: p */
    private String m54011p() {
        if (this.f34538T != null) {
            return mo40921n();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mo40920m());
        sb.append("#");
        sb.append(mo40922o());
        return sb.toString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MBWayPaymentParams.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MBWayPaymentParams mBWayPaymentParams = (MBWayPaymentParams) obj;
        if (!Arrays.equals(this.f34536R, mBWayPaymentParams.f34536R) || !Arrays.equals(this.f34537S, mBWayPaymentParams.f34537S) || !Arrays.equals(this.f34538T, mBWayPaymentParams.f34538T)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((super.hashCode() * 31) + Arrays.hashCode(this.f34536R)) * 31) + Arrays.hashCode(this.f34537S)) * 31) + Arrays.hashCode(this.f34538T);
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("virtualAccount.accountId", m54011p());
        return i;
    }

    @C0195i0
    /* renamed from: m */
    public String mo40920m() {
        return C11780c.m52956a(this.f34536R);
    }

    @C0195i0
    /* renamed from: n */
    public String mo40921n() {
        return C11780c.m52956a(this.f34538T);
    }

    @C0195i0
    /* renamed from: o */
    public String mo40922o() {
        return C11780c.m52956a(this.f34537S);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C11780c.m52957a(parcel, this.f34536R);
        C11780c.m52957a(parcel, this.f34537S);
        C11780c.m52957a(parcel, this.f34538T);
    }
}
