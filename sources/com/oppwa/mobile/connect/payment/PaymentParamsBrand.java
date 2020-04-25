package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@Deprecated
public enum PaymentParamsBrand implements Parcelable {
    VISA(r2),
    MASTER_CARD("MASTER"),
    AMEX(r4),
    JCB(r5),
    DINERS(r6),
    UNIONPAY(r7),
    DISCOVER(r8),
    DIRECT_DEBIT_SEPA("DIRECTDEBIT_SEPA"),
    CHINA_UNIONPAY("CHINAUNIONPAY"),
    SOFORT_BANKING("SOFORTUEBERWEISUNG"),
    PAYPAL("PAYPAL"),
    BOLETO("BOLETO"),
    IDEAL("IDEAL"),
    ALIPAY("ALIPAY");
    
    public static final Creator<PaymentParamsBrand> CREATOR = null;

    /* renamed from: a */
    private String f34496a;

    /* renamed from: com.oppwa.mobile.connect.payment.PaymentParamsBrand$a */
    static class C11950a implements Creator<PaymentParamsBrand> {
        C11950a() {
        }

        /* renamed from: a */
        public PaymentParamsBrand createFromParcel(Parcel parcel) {
            return PaymentParamsBrand.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public PaymentParamsBrand[] newArray(int i) {
            return new PaymentParamsBrand[i];
        }
    }

    /* renamed from: com.oppwa.mobile.connect.payment.PaymentParamsBrand$b */
    static /* synthetic */ class C11951b {

        /* renamed from: a */
        static final /* synthetic */ int[] f34497a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.oppwa.mobile.connect.payment.PaymentParamsBrand[] r0 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34497a = r0
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.VISA     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.MASTER_CARD     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.AMEX     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.JCB     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.DINERS     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.UNIONPAY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f34497a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.oppwa.mobile.connect.payment.PaymentParamsBrand r1 = com.oppwa.mobile.connect.payment.PaymentParamsBrand.DISCOVER     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.PaymentParamsBrand.C11951b.<clinit>():void");
        }
    }

    static {
        CREATOR = new C11950a();
    }

    private PaymentParamsBrand(String str) {
        this.f34496a = str;
    }

    /* renamed from: c */
    public static PaymentParamsBrand m53895c(String str) {
        PaymentParamsBrand[] values;
        for (PaymentParamsBrand paymentParamsBrand : values()) {
            if (paymentParamsBrand.mo40908j().equalsIgnoreCase(str)) {
                return paymentParamsBrand;
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public String mo40908j() {
        return this.f34496a;
    }

    /* renamed from: k */
    public boolean mo40909k() {
        switch (C11951b.f34497a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: p */
    public boolean mo40910p() {
        return mo40909k() || this == DIRECT_DEBIT_SEPA;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
