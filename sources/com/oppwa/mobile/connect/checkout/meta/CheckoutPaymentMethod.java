package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.dialog.C11918y;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;

@Deprecated
public enum CheckoutPaymentMethod implements Parcelable {
    VISA(PaymentParamsBrand.VISA, C11771R.C11774drawable.visa, C11771R.string.visa, null),
    MASTERCARD(PaymentParamsBrand.MASTER_CARD, C11771R.C11774drawable.master, C11771R.string.master, null),
    AMEX(PaymentParamsBrand.AMEX, C11771R.C11774drawable.amex, C11771R.string.amex, null),
    JCB(PaymentParamsBrand.JCB, C11771R.C11774drawable.jcb, C11771R.string.jcb, null),
    DINERS(PaymentParamsBrand.DINERS, C11771R.C11774drawable.diners, C11771R.string.diners, null),
    UNIONPAY(PaymentParamsBrand.UNIONPAY, C11771R.C11774drawable.unionpay, C11771R.string.unionpay, null),
    CHINA_UNIONPAY(PaymentParamsBrand.CHINA_UNIONPAY, C11771R.C11774drawable.chinaunionpay, C11771R.string.chinaunionpay, null),
    DISCOVER(PaymentParamsBrand.DISCOVER, C11771R.C11774drawable.discover, C11771R.string.discover, null),
    DIRECT_DEBIT_SEPA(PaymentParamsBrand.DIRECT_DEBIT_SEPA, C11771R.C11774drawable.directdebit_sepa, C11771R.string.directdebit_sepa, null),
    SOFORT(PaymentParamsBrand.SOFORT_BANKING, C11771R.C11774drawable.sofortueberweisung, C11771R.string.sofortueberweisung, null),
    PAYPAL(PaymentParamsBrand.PAYPAL, C11771R.C11774drawable.paypal, C11771R.string.paypal, null),
    BOLETO(PaymentParamsBrand.BOLETO, C11771R.C11774drawable.boleto, C11771R.string.boleto, null),
    IDEAL(PaymentParamsBrand.IDEAL, C11771R.C11774drawable.ideal, C11771R.string.ideal, null),
    ALIPAY(PaymentParamsBrand.ALIPAY, C11771R.C11774drawable.alipay, C11771R.string.alipay, null);
    
    public static final Creator<CheckoutPaymentMethod> CREATOR = null;

    /* renamed from: a */
    private PaymentParamsBrand f34409a;

    /* renamed from: b */
    private int f34410b;

    /* renamed from: c */
    private int f34411c;

    /* renamed from: d */
    private Class<? extends C11918y> f34412d;

    /* renamed from: e */
    private CheckoutSecurityPolicyMode f34413e;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutPaymentMethod$a */
    static class C11934a implements Creator<CheckoutPaymentMethod> {
        C11934a() {
        }

        /* renamed from: a */
        public CheckoutPaymentMethod createFromParcel(Parcel parcel) {
            return CheckoutPaymentMethod.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public CheckoutPaymentMethod[] newArray(int i) {
            return new CheckoutPaymentMethod[i];
        }
    }

    static {
        CREATOR = new C11934a();
    }

    private CheckoutPaymentMethod(PaymentParamsBrand paymentParamsBrand, int i, int i2, Class<? extends C11918y> cls) {
        this.f34409a = paymentParamsBrand;
        this.f34410b = i;
        this.f34411c = i2;
        this.f34412d = cls;
        this.f34413e = CheckoutSecurityPolicyMode.DEVICE_AUTH_NOT_REQUIRED;
    }

    /* renamed from: a */
    public static CheckoutPaymentMethod m53648a(PaymentParamsBrand paymentParamsBrand) {
        CheckoutPaymentMethod[] values;
        for (CheckoutPaymentMethod checkoutPaymentMethod : values()) {
            if (checkoutPaymentMethod.mo40646j() == paymentParamsBrand) {
                return checkoutPaymentMethod;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static CheckoutPaymentMethod m53649c(String str) {
        CheckoutPaymentMethod[] values;
        for (CheckoutPaymentMethod checkoutPaymentMethod : values()) {
            if (checkoutPaymentMethod.name().equals(str)) {
                return checkoutPaymentMethod;
            }
        }
        return null;
    }

    /* renamed from: a */
    public CheckoutPaymentMethod mo40644a(CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        this.f34413e = checkoutSecurityPolicyMode;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public PaymentParamsBrand mo40646j() {
        return this.f34409a;
    }

    /* renamed from: k */
    public CheckoutSecurityPolicyMode mo40647k() {
        return this.f34413e;
    }

    /* renamed from: p */
    public Class<? extends C11918y> mo40648p() {
        return this.f34412d;
    }

    /* renamed from: q */
    public int mo40649q() {
        return this.f34410b;
    }

    /* renamed from: r */
    public int mo40650r() {
        return this.f34411c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
