package com.oppwa.mobile.connect.payment.card;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.facebook.internal.ServerProtocol;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.PaymentParamsBrand;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.regex.Pattern;

public class CardPaymentParams extends PaymentParams {
    public static final Creator<CardPaymentParams> CREATOR = new C11963a();

    /* renamed from: a0 */
    private static SoftReference<Pattern> f34513a0;

    /* renamed from: b0 */
    private static SoftReference<Pattern> f34514b0;

    /* renamed from: c0 */
    private static SoftReference<Pattern> f34515c0;

    /* renamed from: d0 */
    private static SoftReference<Pattern> f34516d0;

    /* renamed from: e0 */
    private static SoftReference<Pattern> f34517e0;

    /* renamed from: f0 */
    private static SoftReference<Pattern> f34518f0;
    @C0193h0

    /* renamed from: R */
    private byte[] f34519R;
    @C0195i0

    /* renamed from: S */
    private byte[] f34520S;
    @C0195i0

    /* renamed from: T */
    private byte[] f34521T;
    @C0195i0

    /* renamed from: U */
    private byte[] f34522U;
    @C0195i0

    /* renamed from: V */
    private byte[] f34523V;
    @C0195i0

    /* renamed from: W */
    private byte[] f34524W;
    @C0195i0

    /* renamed from: X */
    private byte[] f34525X;

    /* renamed from: Y */
    private boolean f34526Y;
    @C0195i0

    /* renamed from: Z */
    private Integer f34527Z;

    /* renamed from: com.oppwa.mobile.connect.payment.card.CardPaymentParams$a */
    static class C11963a implements Creator<CardPaymentParams> {
        C11963a() {
        }

        /* renamed from: a */
        public CardPaymentParams createFromParcel(Parcel parcel) {
            return new CardPaymentParams(parcel, null);
        }

        /* renamed from: a */
        public CardPaymentParams[] newArray(int i) {
            return new CardPaymentParams[i];
        }
    }

    private CardPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34520S = C11780c.m52959a(parcel);
        this.f34519R = C11780c.m52959a(parcel);
        this.f34521T = C11780c.m52959a(parcel);
        this.f34522U = C11780c.m52959a(parcel);
        this.f34523V = C11780c.m52959a(parcel);
        this.f34524W = C11780c.m52959a(parcel);
        this.f34525X = C11780c.m52959a(parcel);
        this.f34526Y = parcel.readByte() != 0;
        this.f34527Z = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    /* synthetic */ CardPaymentParams(Parcel parcel, C11963a aVar) {
        this(parcel);
    }

    @Deprecated
    public CardPaymentParams(String str, PaymentParamsBrand paymentParamsBrand, String str2, String str3, String str4, String str5, String str6) throws PaymentException {
        this(str, paymentParamsBrand.mo40908j(), str2, str3, str4, str5, str6);
    }

    public CardPaymentParams(String str, @C0193h0 String str2, @C0195i0 String str3, @C0195i0 String str4, @C0195i0 String str5, @C0195i0 String str6) throws PaymentException {
        this(str, "", str2, str3, str4, str5, str6);
    }

    public CardPaymentParams(String str, String str2, @C0193h0 String str3, @C0195i0 String str4, @C0195i0 String str5, @C0195i0 String str6, @C0195i0 String str7) throws PaymentException {
        super(str, str2);
        if (str4 != null && !m53961m(str4)) {
            throw new PaymentException(PaymentError.m53775u());
        } else if (!m53963o(str3)) {
            throw new PaymentException(PaymentError.m53777w());
        } else if (str5 != null && !m53959k(str5)) {
            throw new PaymentException(PaymentError.m53776v());
        } else if (str6 != null && !m53960l(str6)) {
            throw new PaymentException(PaymentError.m53778x());
        } else if (str5 != null && str6 != null && m53953c(str5, str6)) {
            throw new PaymentException(PaymentError.m53774t());
        } else if (str7 == null || m53958j(str7)) {
            this.f34520S = C11780c.m52960a(C11780c.m52962c(str4));
            this.f34519R = C11780c.m52961b(str3).getBytes();
            this.f34521T = C11780c.m52960a(str5);
            this.f34522U = C11780c.m52960a(str6);
            this.f34523V = C11780c.m52960a(str7);
            this.f34526Y = false;
        } else {
            throw new PaymentException(PaymentError.m53773s());
        }
    }

    /* renamed from: A */
    private static Pattern m53952A() {
        SoftReference<Pattern> softReference = f34517e0;
        if (softReference == null || softReference.get() == null) {
            f34517e0 = new SoftReference<>(Pattern.compile("[0-9]{3,4}"));
        }
        return (Pattern) f34517e0.get();
    }

    /* renamed from: c */
    public static boolean m53953c(String str, String str2) {
        if (!m53959k(str) || !m53960l(str2)) {
            return false;
        }
        int i = Calendar.getInstance().get(1);
        int i2 = Calendar.getInstance().get(2) + 1;
        int intValue = Integer.valueOf(str).intValue();
        int intValue2 = Integer.valueOf(str2).intValue();
        return intValue2 < i || (intValue2 == i && intValue < i2);
    }

    @Deprecated
    /* renamed from: d */
    public static boolean m53954d(String str, String str2) {
        return m53958j(str);
    }

    /* renamed from: e */
    public static boolean m53955e(String str, String str2) {
        String b = C11780c.m52961b(str);
        return b != null && m53966x().matcher(b).matches() && (C11964a.m53987a(b) || "UNIONPAY".equals(str2) || "UNIONPAY_SMS".equals(str2));
    }

    /* renamed from: h */
    public static boolean m53956h(String str) {
        return C11964a.m53987a(str);
    }

    /* renamed from: i */
    public static boolean m53957i(String str) {
        return str != null && m53965w().matcher(str).matches();
    }

    /* renamed from: j */
    public static boolean m53958j(String str) {
        return m53952A().matcher(str).matches();
    }

    /* renamed from: k */
    public static boolean m53959k(String str) {
        return str != null && m53967y().matcher(str).matches();
    }

    /* renamed from: l */
    public static boolean m53960l(String str) {
        return str != null && m53968z().matcher(str).matches();
    }

    /* renamed from: m */
    public static boolean m53961m(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String c = C11780c.m52962c(str);
        if (c.isEmpty() || (m53964v().matcher(c).matches() && !Pattern.compile("^[0-9]{10,}$").matcher(C11780c.m52961b(str)).matches() && !m53952A().matcher(str).matches())) {
            z = true;
        }
        return z;
    }

    /* renamed from: n */
    public static boolean m53962n(String str) {
        return str != null && m53965w().matcher(str).matches();
    }

    /* renamed from: o */
    public static boolean m53963o(String str) {
        String b = C11780c.m52961b(str);
        return b != null && m53966x().matcher(b).matches();
    }

    /* renamed from: v */
    private static Pattern m53964v() {
        SoftReference<Pattern> softReference = f34513a0;
        if (softReference == null || softReference.get() == null) {
            f34513a0 = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return (Pattern) f34513a0.get();
    }

    /* renamed from: w */
    private static Pattern m53965w() {
        SoftReference<Pattern> softReference = f34518f0;
        if (softReference == null || softReference.get() == null) {
            f34518f0 = new SoftReference<>(Pattern.compile("^[0-9].*"));
        }
        return (Pattern) f34518f0.get();
    }

    /* renamed from: x */
    private static Pattern m53966x() {
        SoftReference<Pattern> softReference = f34514b0;
        if (softReference == null || softReference.get() == null) {
            f34514b0 = new SoftReference<>(Pattern.compile("[0-9]{10,19}"));
        }
        return (Pattern) f34514b0.get();
    }

    /* renamed from: y */
    private static Pattern m53967y() {
        SoftReference<Pattern> softReference = f34515c0;
        if (softReference == null || softReference.get() == null) {
            f34515c0 = new SoftReference<>(Pattern.compile("^1[0-2]$|^0[1-9]$"));
        }
        return (Pattern) f34515c0.get();
    }

    /* renamed from: z */
    private static Pattern m53968z() {
        SoftReference<Pattern> softReference = f34516d0;
        if (softReference == null || softReference.get() == null) {
            f34516d0 = new SoftReference<>(Pattern.compile("20[0-9]{2}"));
        }
        return (Pattern) f34516d0.get();
    }

    /* renamed from: a */
    public CardPaymentParams mo40948a(@C0195i0 Integer num) {
        this.f34527Z = num;
        return this;
    }

    /* renamed from: a */
    public CardPaymentParams mo40949a(boolean z) {
        this.f34526Y = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40888a(String str) {
        return str != null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CardPaymentParams.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CardPaymentParams cardPaymentParams = (CardPaymentParams) obj;
        if (this.f34526Y != cardPaymentParams.f34526Y || !Arrays.equals(this.f34520S, cardPaymentParams.f34520S) || !Arrays.equals(this.f34519R, cardPaymentParams.f34519R) || !Arrays.equals(this.f34521T, cardPaymentParams.f34521T) || !Arrays.equals(this.f34522U, cardPaymentParams.f34522U) || !Arrays.equals(this.f34523V, cardPaymentParams.f34523V) || !Arrays.equals(this.f34524W, cardPaymentParams.f34524W) || !Arrays.equals(this.f34525X, cardPaymentParams.f34525X) || !C11780c.m52958a((Object) this.f34527Z, (Object) cardPaymentParams.f34527Z)) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public void mo40950f(String str) {
        this.f34525X = C11780c.m52960a(str);
    }

    /* renamed from: g */
    public void mo40951g(String str) {
        this.f34524W = C11780c.m52960a(str);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((super.hashCode() * 31) + Arrays.hashCode(this.f34520S)) * 31) + Arrays.hashCode(this.f34519R)) * 31) + Arrays.hashCode(this.f34521T)) * 31) + Arrays.hashCode(this.f34522U)) * 31) + Arrays.hashCode(this.f34523V)) * 31) + Arrays.hashCode(this.f34524W)) * 31) + Arrays.hashCode(this.f34525X)) * 31) + (this.f34526Y ? 1 : 0)) * 31;
        Integer num = this.f34527Z;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        if (this.f34520S != null) {
            i.put("card.holder", mo40924q());
        }
        i.put("card.number", mo40953s());
        if (this.f34521T != null) {
            i.put("card.expiryMonth", mo40922o());
        }
        if (this.f34522U != null) {
            i.put("card.expiryYear", mo40923p());
        }
        if (this.f34523V != null) {
            i.put("card.cvv", mo40921n());
        }
        if (this.f34526Y) {
            i.put("createRegistration", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        if (this.f34524W != null) {
            i.put("customer.mobile", mo40952r());
        }
        if (this.f34525X != null) {
            i.put("customParameters[MOBILE_COUNTRY_CODE]", mo40920m());
        }
        Integer num = this.f34527Z;
        if (num != null) {
            i.put("recurring.numberOfInstallments", num.toString());
        }
        return i;
    }

    /* renamed from: l */
    public void mo40901l() {
        if (this.f34523V != null) {
            this.f34523V = C11780c.m52960a(new String(new char[mo40921n().length()]).replace(0, '*'));
        }
        String s = mo40953s();
        if (s.length() > 4) {
            this.f34519R = s.substring(s.length() - 4).getBytes();
        }
    }

    /* renamed from: m */
    public String mo40920m() {
        return C11780c.m52956a(this.f34525X);
    }

    @C0195i0
    /* renamed from: n */
    public String mo40921n() {
        return C11780c.m52956a(this.f34523V);
    }

    @C0195i0
    /* renamed from: o */
    public String mo40922o() {
        return C11780c.m52956a(this.f34521T);
    }

    @C0195i0
    /* renamed from: p */
    public String mo40923p() {
        return C11780c.m52956a(this.f34522U);
    }

    @C0195i0
    /* renamed from: q */
    public String mo40924q() {
        return C11780c.m52956a(this.f34520S);
    }

    /* renamed from: r */
    public String mo40952r() {
        return C11780c.m52956a(this.f34524W);
    }

    @C0193h0
    /* renamed from: s */
    public String mo40953s() {
        return C11780c.m52956a(this.f34519R);
    }

    @C0195i0
    /* renamed from: t */
    public Integer mo40954t() {
        return this.f34527Z;
    }

    /* renamed from: u */
    public boolean mo40955u() {
        return this.f34526Y;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C11780c.m52957a(parcel, this.f34520S);
        C11780c.m52957a(parcel, this.f34519R);
        C11780c.m52957a(parcel, this.f34521T);
        C11780c.m52957a(parcel, this.f34522U);
        C11780c.m52957a(parcel, this.f34523V);
        C11780c.m52957a(parcel, this.f34524W);
        C11780c.m52957a(parcel, this.f34525X);
        parcel.writeByte(this.f34526Y ? (byte) 1 : 0);
        parcel.writeValue(this.f34527Z);
    }
}
