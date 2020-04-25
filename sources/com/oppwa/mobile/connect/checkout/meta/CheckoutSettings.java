package com.oppwa.mobile.connect.checkout.meta;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.TransactionInfo;
import com.mrsool.utils.C11644i;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import com.oppwa.mobile.connect.checkout.dialog.IPaymentFormListener;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CheckoutSettings implements Parcelable {
    public static final Creator<CheckoutSettings> CREATOR = new C11936a();
    @C0193h0

    /* renamed from: N */
    private C11978a f34415N;

    /* renamed from: O */
    private String f34416O;

    /* renamed from: P */
    private Set<String> f34417P;
    @C0193h0

    /* renamed from: Q */
    private CheckoutStorePaymentDetailsMode f34418Q;
    @C0193h0

    /* renamed from: R */
    private CheckoutSkipCVVMode f34419R;
    @C0193h0

    /* renamed from: S */
    private CheckoutCardBrandsDisplayMode f34420S;

    /* renamed from: T */
    private boolean f34421T;

    /* renamed from: U */
    private boolean f34422U;

    /* renamed from: V */
    private boolean f34423V;

    /* renamed from: W */
    private boolean f34424W;
    @C0193h0

    /* renamed from: X */
    private HashMap<String, CheckoutSecurityPolicyMode> f34425X;

    /* renamed from: Y */
    private CheckoutSecurityPolicyMode f34426Y;

    /* renamed from: Z */
    private int f34427Z;
    @C0193h0

    /* renamed from: a */
    private String f34428a;

    /* renamed from: a0 */
    private String f34429a0;

    /* renamed from: b */
    private String f34430b;

    /* renamed from: b0 */
    private boolean f34431b0;

    /* renamed from: c0 */
    private String f34432c0;

    /* renamed from: d0 */
    private double f34433d0;

    /* renamed from: e0 */
    private double f34434e0;

    /* renamed from: f0 */
    private boolean f34435f0;

    /* renamed from: g0 */
    private IPaymentFormListener f34436g0;

    /* renamed from: h0 */
    private boolean f34437h0;

    /* renamed from: i0 */
    private boolean f34438i0;
    @C0193h0

    /* renamed from: j0 */
    private Integer[] f34439j0;
    @C0193h0

    /* renamed from: k0 */
    private CheckoutBrandDetectionType f34440k0;

    /* renamed from: l0 */
    private List<String> f34441l0;

    /* renamed from: m0 */
    private PaymentDataRequest f34442m0;
    @Deprecated

    /* renamed from: n0 */
    private Integer[] f34443n0;
    @Deprecated

    /* renamed from: o0 */
    private Integer[] f34444o0;
    @Deprecated

    /* renamed from: p0 */
    private String f34445p0;

    /* renamed from: com.oppwa.mobile.connect.checkout.meta.CheckoutSettings$a */
    static class C11936a implements Creator<CheckoutSettings> {
        C11936a() {
        }

        /* renamed from: a */
        public CheckoutSettings createFromParcel(Parcel parcel) {
            return new CheckoutSettings(parcel, (C11936a) null);
        }

        /* renamed from: a */
        public CheckoutSettings[] newArray(int i) {
            return new CheckoutSettings[i];
        }
    }

    private CheckoutSettings(Parcel parcel) {
        this.f34415N = C11978a.TEST;
        this.f34418Q = CheckoutStorePaymentDetailsMode.NEVER;
        this.f34419R = CheckoutSkipCVVMode.NEVER;
        this.f34420S = CheckoutCardBrandsDisplayMode.GROUPED;
        boolean z = true;
        this.f34423V = true;
        this.f34425X = new HashMap<>();
        this.f34431b0 = true;
        this.f34435f0 = false;
        this.f34437h0 = false;
        this.f34438i0 = true;
        this.f34439j0 = new Integer[]{Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5)};
        this.f34440k0 = CheckoutBrandDetectionType.REGEX;
        this.f34443n0 = new Integer[0];
        this.f34444o0 = new Integer[0];
        this.f34428a = parcel.readString();
        this.f34445p0 = parcel.readString();
        this.f34430b = parcel.readString();
        this.f34415N = C11978a.valueOf(parcel.readString());
        this.f34416O = parcel.readString();
        this.f34417P = new LinkedHashSet(Arrays.asList(parcel.createStringArray()));
        this.f34418Q = (CheckoutStorePaymentDetailsMode) parcel.readParcelable(CheckoutStorePaymentDetailsMode.class.getClassLoader());
        this.f34419R = (CheckoutSkipCVVMode) parcel.readParcelable(CheckoutSkipCVVMode.class.getClassLoader());
        this.f34420S = (CheckoutCardBrandsDisplayMode) parcel.readParcelable(CheckoutCardBrandsDisplayMode.class.getClassLoader());
        this.f34421T = parcel.readByte() != 0;
        this.f34422U = parcel.readByte() != 0;
        this.f34424W = parcel.readByte() != 0;
        this.f34423V = parcel.readByte() != 0;
        this.f34425X = new HashMap<>();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i = 0; i < readInt; i++) {
                this.f34425X.put(parcel.readString(), (CheckoutSecurityPolicyMode) parcel.readParcelable(CheckoutSecurityPolicyMode.class.getClassLoader()));
            }
        }
        this.f34426Y = (CheckoutSecurityPolicyMode) parcel.readParcelable(CheckoutSecurityPolicyMode.class.getClassLoader());
        this.f34427Z = parcel.readInt();
        this.f34429a0 = parcel.readString();
        this.f34432c0 = parcel.readString();
        this.f34433d0 = parcel.readDouble();
        this.f34434e0 = parcel.readDouble();
        this.f34443n0 = m53662a(parcel);
        this.f34444o0 = m53662a(parcel);
        this.f34431b0 = parcel.readByte() != 0;
        this.f34435f0 = parcel.readByte() != 0;
        this.f34436g0 = (IPaymentFormListener) parcel.readParcelable(IPaymentFormListener.class.getClassLoader());
        this.f34437h0 = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f34438i0 = z;
        this.f34439j0 = m53662a(parcel);
        this.f34442m0 = parcel.readParcelable(PaymentDataRequest.class.getClassLoader());
        this.f34440k0 = (CheckoutBrandDetectionType) parcel.readParcelable(CheckoutBrandDetectionType.class.getClassLoader());
        if (parcel.readByte() > 0) {
            this.f34441l0 = new ArrayList();
            parcel.readStringList(this.f34441l0);
        }
    }

    /* synthetic */ CheckoutSettings(Parcel parcel, C11936a aVar) {
        this(parcel);
    }

    @Deprecated
    public CheckoutSettings(@C0193h0 String str, String str2, CheckoutPaymentMethod[] checkoutPaymentMethodArr) {
        this.f34415N = C11978a.TEST;
        this.f34418Q = CheckoutStorePaymentDetailsMode.NEVER;
        this.f34419R = CheckoutSkipCVVMode.NEVER;
        this.f34420S = CheckoutCardBrandsDisplayMode.GROUPED;
        this.f34423V = true;
        this.f34425X = new HashMap<>();
        this.f34431b0 = true;
        this.f34435f0 = false;
        this.f34437h0 = false;
        this.f34438i0 = true;
        this.f34439j0 = new Integer[]{Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5)};
        this.f34440k0 = CheckoutBrandDetectionType.REGEX;
        this.f34443n0 = new Integer[0];
        this.f34444o0 = new Integer[0];
        this.f34428a = str;
        this.f34416O = str2;
        this.f34417P = m53664b(checkoutPaymentMethodArr);
    }

    @Deprecated
    public CheckoutSettings(@C0193h0 String str, Set<String> set) {
        this.f34415N = C11978a.TEST;
        this.f34418Q = CheckoutStorePaymentDetailsMode.NEVER;
        this.f34419R = CheckoutSkipCVVMode.NEVER;
        this.f34420S = CheckoutCardBrandsDisplayMode.GROUPED;
        this.f34423V = true;
        this.f34425X = new HashMap<>();
        this.f34431b0 = true;
        this.f34435f0 = false;
        this.f34437h0 = false;
        this.f34438i0 = true;
        this.f34439j0 = new Integer[]{Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5)};
        this.f34440k0 = CheckoutBrandDetectionType.REGEX;
        this.f34443n0 = new Integer[0];
        this.f34444o0 = new Integer[0];
        this.f34428a = str;
        this.f34417P = set;
    }

    public CheckoutSettings(@C0193h0 String str, Set<String> set, @C0193h0 C11978a aVar) {
        this.f34415N = C11978a.TEST;
        this.f34418Q = CheckoutStorePaymentDetailsMode.NEVER;
        this.f34419R = CheckoutSkipCVVMode.NEVER;
        this.f34420S = CheckoutCardBrandsDisplayMode.GROUPED;
        this.f34423V = true;
        this.f34425X = new HashMap<>();
        this.f34431b0 = true;
        this.f34435f0 = false;
        this.f34437h0 = false;
        this.f34438i0 = true;
        this.f34439j0 = new Integer[]{Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(5)};
        this.f34440k0 = CheckoutBrandDetectionType.REGEX;
        this.f34443n0 = new Integer[0];
        this.f34444o0 = new Integer[0];
        this.f34428a = str;
        this.f34417P = set;
        if (set != null) {
            for (String a : set) {
                mo40686a(a, CheckoutSecurityPolicyMode.DEVICE_AUTH_NOT_REQUIRED);
            }
        } else {
            this.f34417P = new LinkedHashSet();
        }
        this.f34415N = aVar;
    }

    /* renamed from: a */
    private static String m53661a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Bundle{");
        for (String str : bundle.keySet()) {
            sb.append(str);
            sb.append(" => ");
            sb.append(bundle.get(str));
            sb.append("; ");
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private Integer[] m53662a(Parcel parcel) {
        Object[] readArray = parcel.readArray(Integer.class.getClassLoader());
        Integer[] numArr = new Integer[readArray.length];
        for (int i = 0; i < readArray.length; i++) {
            numArr[i] = (Integer) readArray[i];
        }
        return numArr;
    }

    @C0195i0
    /* renamed from: b */
    private String m53663b(PaymentDataRequest paymentDataRequest) {
        String str;
        String str2 = null;
        if (paymentDataRequest == null) {
            return null;
        }
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = paymentDataRequest.getPaymentMethodTokenizationParameters();
        TransactionInfo transactionInfo = paymentDataRequest.getTransactionInfo();
        CardRequirements cardRequirements = paymentDataRequest.getCardRequirements();
        StringBuilder sb = new StringBuilder();
        sb.append("paymentMethodTokenizationType=");
        sb.append(paymentMethodTokenizationParameters != null ? Integer.valueOf(paymentMethodTokenizationParameters.getPaymentMethodTokenizationType()) : null);
        sb.append("\n  parameters=");
        sb.append(paymentMethodTokenizationParameters != null ? m53661a(paymentMethodTokenizationParameters.getParameters()) : null);
        sb.append("\n  transactionInfo=");
        if (transactionInfo != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(transactionInfo.getTotalPrice());
            String str3 = C3868i.f12248b;
            sb2.append(str3);
            sb2.append(transactionInfo.getCurrencyCode());
            sb2.append(str3);
            sb2.append(transactionInfo.getTotalPriceStatus());
            str = sb2.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("\n  allowedPaymentMethods=");
        sb.append(paymentDataRequest.getAllowedPaymentMethods() != null ? paymentDataRequest.getAllowedPaymentMethods().toString() : null);
        sb.append("\n  allowedCardsNetworks=");
        if (!(cardRequirements == null || cardRequirements.getAllowedCardNetworks() == null)) {
            str2 = cardRequirements.getAllowedCardNetworks().toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: b */
    private Set<String> m53664b(CheckoutPaymentMethod[] checkoutPaymentMethodArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (CheckoutPaymentMethod checkoutPaymentMethod : checkoutPaymentMethodArr) {
            String j = checkoutPaymentMethod.mo40646j().mo40908j();
            linkedHashSet.add(checkoutPaymentMethod.mo40646j().mo40908j());
            mo40686a(j, checkoutPaymentMethod.mo40647k());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private CheckoutPaymentMethod[] m53665b(Set<String> set) {
        CheckoutPaymentMethod[] checkoutPaymentMethodArr = new CheckoutPaymentMethod[set.size()];
        int i = 0;
        for (String str : set) {
            CheckoutPaymentMethod a = CheckoutPaymentMethod.m53648a(PaymentParamsBrand.m53895c(str));
            if (a != null) {
                a.mo40644a(mo40675a(str));
            }
            checkoutPaymentMethodArr[i] = a;
            i++;
        }
        return checkoutPaymentMethodArr;
    }

    /* renamed from: A */
    public String mo40662A() {
        return this.f34430b;
    }

    @C0193h0
    /* renamed from: B */
    public CheckoutSkipCVVMode mo40663B() {
        return this.f34419R;
    }

    @C0193h0
    /* renamed from: C */
    public CheckoutStorePaymentDetailsMode mo40664C() {
        return this.f34418Q;
    }

    /* renamed from: D */
    public int mo40665D() {
        return this.f34427Z;
    }

    /* renamed from: E */
    public boolean mo40666E() {
        return this.f34423V;
    }

    /* renamed from: F */
    public boolean mo40667F() {
        return this.f34438i0;
    }

    /* renamed from: G */
    public boolean mo40668G() {
        return this.f34424W;
    }

    /* renamed from: H */
    public boolean mo40669H() {
        return this.f34437h0;
    }

    /* renamed from: I */
    public boolean mo40670I() {
        return this.f34435f0;
    }

    /* renamed from: J */
    public boolean mo40671J() {
        return this.f34421T;
    }

    @Deprecated
    /* renamed from: K */
    public boolean mo40672K() {
        return this.f34422U;
    }

    /* renamed from: L */
    public boolean mo40673L() {
        return this.f34431b0;
    }

    /* renamed from: a */
    public Intent mo40674a(Context context, ComponentName componentName) {
        Intent c = mo40697c(context);
        if (componentName != null) {
            c.putExtra(CheckoutActivity.f34062c0, componentName);
        }
        return c;
    }

    /* renamed from: a */
    public CheckoutSecurityPolicyMode mo40675a(String str) {
        return (CheckoutSecurityPolicyMode) this.f34425X.get(str);
    }

    /* renamed from: a */
    public CheckoutSettings mo40676a(double d) {
        this.f34434e0 = d;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40677a(int i) {
        this.f34427Z = i;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40678a(PaymentDataRequest paymentDataRequest) {
        this.f34442m0 = paymentDataRequest;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40679a(IPaymentFormListener iPaymentFormListener) {
        this.f34436g0 = iPaymentFormListener;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40680a(CheckoutBrandDetectionType checkoutBrandDetectionType) {
        this.f34440k0 = checkoutBrandDetectionType;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40681a(CheckoutCardBrandsDisplayMode checkoutCardBrandsDisplayMode) {
        this.f34420S = checkoutCardBrandsDisplayMode;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40682a(CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        this.f34426Y = checkoutSecurityPolicyMode;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40683a(CheckoutSkipCVVMode checkoutSkipCVVMode) {
        this.f34419R = checkoutSkipCVVMode;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40684a(CheckoutStorePaymentDetailsMode checkoutStorePaymentDetailsMode) {
        this.f34418Q = checkoutStorePaymentDetailsMode;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40685a(C11978a aVar) {
        this.f34415N = aVar;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40686a(String str, CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        if ("ANDROIDPAY".equals(str)) {
            checkoutSecurityPolicyMode = CheckoutSecurityPolicyMode.DEVICE_AUTH_NOT_REQUIRED;
        }
        this.f34425X.put(str, checkoutSecurityPolicyMode);
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40687a(List<String> list) {
        this.f34441l0 = list;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40688a(Set<String> set) {
        this.f34417P = set;
        return this;
    }

    /* renamed from: a */
    public CheckoutSettings mo40689a(boolean z) {
        this.f34423V = z;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public CheckoutSettings mo40690a(CheckoutPaymentMethod[] checkoutPaymentMethodArr) {
        this.f34417P = m53664b(checkoutPaymentMethodArr);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public CheckoutSettings mo40691a(@C0193h0 Integer[] numArr) {
        this.f34443n0 = numArr;
        return this;
    }

    /* renamed from: a */
    public List<String> mo40692a() {
        return this.f34441l0;
    }

    /* renamed from: b */
    public CheckoutBrandDetectionType mo40693b() {
        return this.f34440k0;
    }

    /* renamed from: b */
    public CheckoutSettings mo40694b(double d) {
        this.f34433d0 = d;
        return this;
    }

    /* renamed from: b */
    public CheckoutSettings mo40695b(boolean z) {
        this.f34424W = z;
        return this;
    }

    /* renamed from: b */
    public CheckoutSettings mo40696b(@C0193h0 Integer[] numArr) {
        this.f34444o0 = numArr;
        return this;
    }

    /* renamed from: c */
    public Intent mo40697c(Context context) {
        Intent intent = new Intent(context, CheckoutActivity.class);
        intent.putExtra(CheckoutActivity.f34061b0, this);
        return intent;
    }

    @C0193h0
    /* renamed from: c */
    public CheckoutCardBrandsDisplayMode mo40698c() {
        return this.f34420S;
    }

    /* renamed from: c */
    public CheckoutSettings mo40699c(boolean z) {
        this.f34437h0 = z;
        return this;
    }

    /* renamed from: c */
    public CheckoutSettings mo40700c(@C0193h0 Integer[] numArr) {
        this.f34439j0 = numArr;
        return this;
    }

    /* renamed from: c */
    public void mo40701c(@C0193h0 String str) {
        this.f34428a = str;
    }

    /* renamed from: d */
    public CheckoutSettings mo40702d(String str) {
        this.f34445p0 = str;
        return this;
    }

    /* renamed from: d */
    public CheckoutSettings mo40703d(boolean z) {
        this.f34435f0 = z;
        return this;
    }

    @Deprecated
    /* renamed from: d */
    public CheckoutSettings mo40704d(@C0193h0 Integer[] numArr) {
        this.f34443n0 = numArr;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public CheckoutSettings mo40706e(String str) {
        this.f34432c0 = str;
        return this;
    }

    /* renamed from: e */
    public CheckoutSettings mo40707e(boolean z) {
        this.f34438i0 = z;
        return this;
    }

    /* renamed from: e */
    public CheckoutSettings mo40708e(@C0193h0 Integer[] numArr) {
        this.f34444o0 = numArr;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CheckoutSettings.class != obj.getClass()) {
            return false;
        }
        CheckoutSettings checkoutSettings = (CheckoutSettings) obj;
        if (this.f34422U != checkoutSettings.f34422U || this.f34424W != checkoutSettings.f34424W || this.f34423V != checkoutSettings.f34423V || this.f34427Z != checkoutSettings.f34427Z || this.f34431b0 != checkoutSettings.f34431b0 || this.f34421T != checkoutSettings.f34421T || this.f34435f0 != checkoutSettings.f34435f0 || this.f34437h0 != checkoutSettings.f34437h0 || this.f34438i0 != checkoutSettings.f34438i0 || Double.compare(checkoutSettings.f34433d0, this.f34433d0) != 0 || Double.compare(checkoutSettings.f34434e0, this.f34434e0) != 0 || !Arrays.equals(this.f34443n0, checkoutSettings.f34443n0) || !Arrays.equals(this.f34444o0, checkoutSettings.f34444o0) || !Arrays.equals(this.f34439j0, checkoutSettings.f34439j0) || !C11780c.m52958a((Object) this.f34428a, (Object) checkoutSettings.f34428a) || !C11780c.m52958a((Object) this.f34445p0, (Object) checkoutSettings.f34445p0) || !C11780c.m52958a((Object) this.f34430b, (Object) checkoutSettings.f34430b) || !C11780c.m52958a((Object) this.f34415N, (Object) checkoutSettings.f34415N) || !C11780c.m52958a((Object) this.f34416O, (Object) checkoutSettings.f34416O) || !C11780c.m52958a((Object) this.f34417P, (Object) checkoutSettings.f34417P) || !C11780c.m52958a((Object) this.f34418Q, (Object) checkoutSettings.f34418Q) || !C11780c.m52958a((Object) this.f34419R, (Object) checkoutSettings.f34419R) || !C11780c.m52958a((Object) this.f34420S, (Object) checkoutSettings.f34420S) || !C11780c.m52958a((Object) this.f34426Y, (Object) checkoutSettings.f34426Y) || !C11780c.m52958a((Object) this.f34440k0, (Object) checkoutSettings.f34440k0) || !C11780c.m52958a((Object) this.f34441l0, (Object) checkoutSettings.f34441l0) || !C11780c.m52958a((Object) this.f34429a0, (Object) checkoutSettings.f34429a0) || !C11780c.m52958a((Object) this.f34432c0, (Object) checkoutSettings.f34432c0) || !C11780c.m52958a((Object) this.f34425X, (Object) checkoutSettings.f34425X)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public CheckoutSettings mo40710f(String str) {
        this.f34429a0 = str;
        return this;
    }

    /* renamed from: f */
    public CheckoutSettings mo40711f(boolean z) {
        this.f34421T = z;
        return this;
    }

    @Deprecated
    /* renamed from: g */
    public CheckoutSettings mo40712g(String str) {
        this.f34416O = str;
        return this;
    }

    @Deprecated
    /* renamed from: g */
    public CheckoutSettings mo40713g(boolean z) {
        this.f34422U = z;
        return this;
    }

    /* renamed from: h */
    public CheckoutSettings mo40714h(String str) {
        this.f34430b = str;
        return this;
    }

    /* renamed from: h */
    public CheckoutSettings mo40715h(boolean z) {
        this.f34431b0 = z;
        return this;
    }

    public int hashCode() {
        int hashCode = this.f34428a.hashCode() * 31;
        String str = this.f34445p0;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f34430b;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f34415N.hashCode()) * 31;
        String str3 = this.f34416O;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<String> set = this.f34417P;
        int hashCode5 = (((((((((((((((((hashCode4 + (set != null ? set.hashCode() : 0)) * 31) + this.f34418Q.hashCode()) * 31) + this.f34419R.hashCode()) * 31) + this.f34420S.hashCode()) * 31) + (this.f34421T ? 1 : 0)) * 31) + (this.f34422U ? 1 : 0)) * 31) + (this.f34424W ? 1 : 0)) * 31) + (this.f34423V ? 1 : 0)) * 31) + this.f34425X.hashCode()) * 31;
        CheckoutSecurityPolicyMode checkoutSecurityPolicyMode = this.f34426Y;
        int hashCode6 = (hashCode5 + (checkoutSecurityPolicyMode != null ? checkoutSecurityPolicyMode.hashCode() : 0)) * 31;
        CheckoutBrandDetectionType checkoutBrandDetectionType = this.f34440k0;
        int hashCode7 = (hashCode6 + (checkoutBrandDetectionType != null ? checkoutBrandDetectionType.hashCode() : 0)) * 31;
        List<String> list = this.f34441l0;
        int hashCode8 = (((hashCode7 + (list != null ? list.hashCode() : 0)) * 31) + this.f34427Z) * 31;
        String str4 = this.f34429a0;
        int hashCode9 = (((hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.f34431b0 ? 1 : 0)) * 31;
        String str5 = this.f34432c0;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = hashCode9 + i;
        long doubleToLongBits = Double.doubleToLongBits(this.f34433d0);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f34434e0);
        return (((((((((((((i3 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Arrays.hashCode(this.f34443n0)) * 31) + Arrays.hashCode(this.f34444o0)) * 31) + (this.f34435f0 ? 1 : 0)) * 31) + (this.f34437h0 ? 1 : 0)) * 31) + (this.f34438i0 ? 1 : 0)) * 31) + Arrays.hashCode(this.f34439j0);
    }

    @C0193h0
    /* renamed from: i */
    public String mo40717i() {
        return this.f34428a;
    }

    @Deprecated
    /* renamed from: j */
    public String mo40718j() {
        return this.f34445p0;
    }

    @C0193h0
    @Deprecated
    /* renamed from: k */
    public Integer[] mo40719k() {
        return this.f34443n0;
    }

    @C0193h0
    /* renamed from: l */
    public Integer[] mo40720l() {
        return this.f34444o0;
    }

    /* renamed from: m */
    public PaymentDataRequest mo40721m() {
        return this.f34442m0;
    }

    @C0193h0
    /* renamed from: n */
    public Integer[] mo40722n() {
        return this.f34439j0;
    }

    /* renamed from: o */
    public String mo40723o() {
        return this.f34432c0;
    }

    /* renamed from: p */
    public double mo40724p() {
        return this.f34434e0;
    }

    /* renamed from: q */
    public double mo40725q() {
        return this.f34433d0;
    }

    /* renamed from: r */
    public String mo40726r() {
        return this.f34429a0;
    }

    @C0193h0
    @Deprecated
    /* renamed from: s */
    public Integer[] mo40727s() {
        return this.f34443n0;
    }

    @C0193h0
    /* renamed from: t */
    public Integer[] mo40728t() {
        return this.f34444o0;
    }

    @C0193h0
    public String toString() {
        IPaymentFormListener iPaymentFormListener = this.f34436g0;
        String cls = iPaymentFormListener != null ? iPaymentFormListener.getClass().toString() : C11644i.f33271c3;
        StringBuilder sb = new StringBuilder();
        sb.append("checkoutId=");
        sb.append(this.f34428a);
        sb.append("\nentityId=");
        sb.append(this.f34445p0);
        sb.append("\nshopperResultUrl=");
        sb.append(this.f34430b);
        sb.append("\nproviderMode=");
        sb.append(this.f34415N);
        sb.append("\npaymentBrands=");
        sb.append(this.f34417P);
        sb.append("\nstorePaymentDetailsMode=");
        sb.append(this.f34418Q);
        sb.append("\nskipCVVMode=");
        sb.append(this.f34419R);
        sb.append("\ncardBrandsDisplayMode=");
        sb.append(this.f34420S);
        sb.append("\nisTotalAmountRequired=");
        sb.append(this.f34421T);
        sb.append("\nisWebViewEnabledFor3DSecure=");
        sb.append(this.f34422U);
        sb.append("\nisIBANRequired=");
        sb.append(this.f34424W);
        sb.append("\nisCardHolderVisible=");
        sb.append(this.f34423V);
        sb.append("\nsecurityPolicies=");
        sb.append(this.f34425X);
        sb.append("\nsecurityPolicyModeForTokens=");
        sb.append(this.f34426Y);
        sb.append("\nbrandDetectionType=");
        sb.append(this.f34440k0);
        sb.append("\nbrandDetectionPriority=");
        sb.append(this.f34441l0);
        sb.append("\nthemeResId=");
        sb.append(this.f34427Z);
        sb.append("\nlocale=");
        sb.append(this.f34429a0);
        sb.append("\nklarnaCountry=");
        sb.append(this.f34432c0);
        sb.append("\nklarnaInvoiceFee=");
        sb.append(this.f34433d0);
        sb.append("\nklarnaInstallmentsFee=");
        sb.append(this.f34434e0);
        sb.append("\nisWindowSecurityEnabled=");
        sb.append(this.f34431b0);
        sb.append("\nisPhoneCallPermissionRequestRequired=");
        sb.append(this.f34435f0);
        sb.append("\ngooglePayPaymentDataRequest=");
        sb.append(m53663b(this.f34442m0));
        sb.append("\ngooglePayAllowedCardNetworks=");
        sb.append(Arrays.toString(this.f34443n0));
        sb.append("\ngooglePayAllowedPaymentMethods=");
        sb.append(Arrays.toString(this.f34444o0));
        sb.append("\npaymentFormListener=");
        sb.append(cls);
        sb.append("\nisInstallmentEnabled=");
        sb.append(this.f34437h0);
        sb.append("\nisDetectedBrandsShown=");
        sb.append(this.f34438i0);
        sb.append("\ninstallmentOptions=");
        sb.append(Arrays.toString(this.f34439j0));
        return sb.toString();
    }

    /* renamed from: u */
    public Set<String> mo40730u() {
        return this.f34417P;
    }

    /* renamed from: v */
    public IPaymentFormListener mo40731v() {
        return this.f34436g0;
    }

    @Deprecated
    /* renamed from: w */
    public CheckoutPaymentMethod[] mo40732w() {
        return m53665b(this.f34417P);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34428a);
        parcel.writeString(this.f34445p0);
        parcel.writeString(this.f34430b);
        parcel.writeString(this.f34415N.name());
        parcel.writeString(this.f34416O);
        Set<String> set = this.f34417P;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        int i2 = 0;
        parcel.writeParcelable(this.f34418Q, 0);
        parcel.writeParcelable(this.f34419R, 0);
        parcel.writeParcelable(this.f34420S, 0);
        parcel.writeByte(this.f34421T ? (byte) 1 : 0);
        parcel.writeByte(this.f34422U ? (byte) 1 : 0);
        parcel.writeByte(this.f34424W ? (byte) 1 : 0);
        parcel.writeByte(this.f34423V ? (byte) 1 : 0);
        parcel.writeInt(this.f34425X.size());
        if (!this.f34425X.isEmpty()) {
            for (String str : this.f34425X.keySet()) {
                parcel.writeString(str);
                parcel.writeParcelable((Parcelable) this.f34425X.get(str), 0);
            }
        }
        parcel.writeParcelable(this.f34426Y, 0);
        parcel.writeInt(this.f34427Z);
        parcel.writeString(this.f34429a0);
        parcel.writeString(this.f34432c0);
        parcel.writeDouble(this.f34433d0);
        parcel.writeDouble(this.f34434e0);
        parcel.writeArray(this.f34443n0);
        parcel.writeArray(this.f34444o0);
        parcel.writeByte(this.f34431b0 ? (byte) 1 : 0);
        parcel.writeByte(this.f34435f0 ? (byte) 1 : 0);
        parcel.writeParcelable(this.f34436g0, 0);
        parcel.writeByte(this.f34437h0 ? (byte) 1 : 0);
        parcel.writeByte(this.f34438i0 ? (byte) 1 : 0);
        parcel.writeArray(this.f34439j0);
        parcel.writeParcelable(this.f34442m0, 0);
        parcel.writeParcelable(this.f34440k0, 0);
        if (this.f34441l0 != null) {
            i2 = 1;
        }
        parcel.writeByte((byte) i2);
        List<String> list = this.f34441l0;
        if (list != null) {
            parcel.writeStringList(list);
        }
    }

    @Deprecated
    /* renamed from: x */
    public String mo40734x() {
        return this.f34416O;
    }

    @C0193h0
    /* renamed from: y */
    public C11978a mo40735y() {
        return this.f34415N;
    }

    /* renamed from: z */
    public CheckoutSecurityPolicyMode mo40736z() {
        return this.f34426Y;
    }
}
