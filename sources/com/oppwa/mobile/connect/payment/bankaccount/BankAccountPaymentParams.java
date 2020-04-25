package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class BankAccountPaymentParams extends PaymentParams {
    public static final Creator<BankAccountPaymentParams> CREATOR = new C11954a();

    /* renamed from: Z */
    private static SoftReference<Pattern> f34498Z;

    /* renamed from: a0 */
    private static SoftReference<Pattern> f34499a0;

    /* renamed from: b0 */
    private static SoftReference<Pattern> f34500b0;

    /* renamed from: c0 */
    private static SoftReference<Pattern> f34501c0;

    /* renamed from: d0 */
    private static SoftReference<Pattern> f34502d0;

    /* renamed from: e0 */
    private static SoftReference<Pattern> f34503e0;

    /* renamed from: f0 */
    private static SoftReference<Pattern> f34504f0;

    /* renamed from: R */
    protected byte[] f34505R;

    /* renamed from: S */
    protected byte[] f34506S;

    /* renamed from: T */
    protected byte[] f34507T;

    /* renamed from: U */
    protected byte[] f34508U;

    /* renamed from: V */
    protected byte[] f34509V;

    /* renamed from: W */
    protected byte[] f34510W;

    /* renamed from: X */
    protected byte[] f34511X;

    /* renamed from: Y */
    protected boolean f34512Y = false;

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams$a */
    static class C11954a implements Creator<BankAccountPaymentParams> {
        C11954a() {
        }

        /* renamed from: a */
        public BankAccountPaymentParams createFromParcel(Parcel parcel) {
            return new BankAccountPaymentParams(parcel);
        }

        /* renamed from: a */
        public BankAccountPaymentParams[] newArray(int i) {
            return new BankAccountPaymentParams[i];
        }
    }

    BankAccountPaymentParams(Parcel parcel) {
        super(parcel);
        boolean z = false;
        this.f34505R = C11780c.m52959a(parcel);
        this.f34506S = C11780c.m52959a(parcel);
        this.f34507T = C11780c.m52959a(parcel);
        this.f34508U = C11780c.m52959a(parcel);
        this.f34509V = C11780c.m52959a(parcel);
        this.f34510W = C11780c.m52959a(parcel);
        this.f34511X = C11780c.m52959a(parcel);
        if (parcel.readByte() != 0) {
            z = true;
        }
        this.f34512Y = z;
    }

    BankAccountPaymentParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) throws PaymentException {
        super(str, str2);
        this.f34505R = C11780c.m52960a(C11780c.m52962c(str3));
        this.f34506S = C11780c.m52960a(str4);
        this.f34507T = C11780c.m52960a(str5);
        this.f34508U = C11780c.m52960a(str6);
        this.f34509V = C11780c.m52960a(str7);
        this.f34510W = C11780c.m52960a(str8);
        this.f34511X = C11780c.m52960a(str9);
    }

    /* renamed from: A */
    private static Pattern m53908A() {
        SoftReference<Pattern> softReference = f34501c0;
        if (softReference == null || softReference.get() == null) {
            f34501c0 = new SoftReference<>(Pattern.compile("[\\s\\S]{1,255}"));
        }
        return (Pattern) f34501c0.get();
    }

    /* renamed from: a */
    public static BankAccountPaymentParams m53909a(String str, String str2, String str3, String str4, String str5) throws PaymentException {
        C11957b bVar = new C11957b(str, str2, str3, str4, str5);
        return bVar;
    }

    /* renamed from: a */
    public static BankAccountPaymentParams m53910a(String str, String str2, String str3, boolean z) throws PaymentException {
        return new C11955a(str, str2, str3, z);
    }

    /* renamed from: c */
    public static BankAccountPaymentParams m53911c(String str, String str2) throws PaymentException {
        return new C11959c(str, str2);
    }

    /* renamed from: d */
    public static BankAccountPaymentParams m53912d(String str, String str2) throws PaymentException {
        return new C11961d(str, str2);
    }

    @Deprecated
    /* renamed from: f */
    public static BankAccountPaymentParams m53913f(String str) throws PaymentException {
        BankAccountPaymentParams bankAccountPaymentParams = new BankAccountPaymentParams(str, null, null, null, null, null, null, null, null);
        return bankAccountPaymentParams;
    }

    /* renamed from: g */
    public static boolean m53914g(String str) {
        return str != null && m53923w().matcher(str).matches();
    }

    /* renamed from: h */
    public static boolean m53915h(String str) {
        return str != null && m53925y().matcher(str).matches();
    }

    /* renamed from: i */
    public static boolean m53916i(String str) {
        return str != null && m53908A().matcher(str).matches();
    }

    /* renamed from: j */
    public static boolean m53917j(String str) {
        return str != null && m53924x().matcher(str).matches();
    }

    /* renamed from: k */
    public static boolean m53918k(String str) {
        return str != null && m53926z().matcher(str).matches();
    }

    /* renamed from: l */
    public static boolean m53919l(String str) {
        return str != null && m53921u().matcher(C11780c.m52962c(str)).matches();
    }

    /* renamed from: m */
    public static boolean m53920m(String str) {
        return str != null && m53922v().matcher(str).matches();
    }

    /* renamed from: u */
    private static Pattern m53921u() {
        SoftReference<Pattern> softReference = f34498Z;
        if (softReference == null || softReference.get() == null) {
            f34498Z = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return (Pattern) f34498Z.get();
    }

    /* renamed from: v */
    private static Pattern m53922v() {
        SoftReference<Pattern> softReference = f34499a0;
        if (softReference == null || softReference.get() == null) {
            f34499a0 = new SoftReference<>(Pattern.compile("[a-zA-Z]{2}[0-9]{2}[a-zA-Z0-9]{11,27}"));
        }
        return (Pattern) f34499a0.get();
    }

    /* renamed from: w */
    private static Pattern m53923w() {
        SoftReference<Pattern> softReference = f34502d0;
        if (softReference == null || softReference.get() == null) {
            f34502d0 = new SoftReference<>(Pattern.compile("[0-9]{3,27}"));
        }
        return (Pattern) f34502d0.get();
    }

    /* renamed from: x */
    private static Pattern m53924x() {
        SoftReference<Pattern> softReference = f34503e0;
        if (softReference == null || softReference.get() == null) {
            f34503e0 = new SoftReference<>(Pattern.compile("[a-zA-Z0-9]{8}$|^[a-zA-Z0-9]{11}"));
        }
        return (Pattern) f34503e0.get();
    }

    /* renamed from: y */
    private static Pattern m53925y() {
        SoftReference<Pattern> softReference = f34504f0;
        if (softReference == null || softReference.get() == null) {
            f34504f0 = new SoftReference<>(Pattern.compile("[0-9]{1,12}"));
        }
        return (Pattern) f34504f0.get();
    }

    /* renamed from: z */
    private static Pattern m53926z() {
        SoftReference<Pattern> softReference = f34500b0;
        if (softReference == null || softReference.get() == null) {
            f34500b0 = new SoftReference<>(Pattern.compile("[A-Z]{2}"));
        }
        return (Pattern) f34500b0.get();
    }

    /* renamed from: c */
    public Creator<?> mo40891c() {
        return CREATOR;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        BankAccountPaymentParams bankAccountPaymentParams = (BankAccountPaymentParams) obj;
        if (this.f34512Y != bankAccountPaymentParams.f34512Y || !Arrays.equals(this.f34505R, bankAccountPaymentParams.f34505R) || !Arrays.equals(this.f34506S, bankAccountPaymentParams.f34506S) || !Arrays.equals(this.f34507T, bankAccountPaymentParams.f34507T) || !Arrays.equals(this.f34508U, bankAccountPaymentParams.f34508U) || !Arrays.equals(this.f34509V, bankAccountPaymentParams.f34509V) || !Arrays.equals(this.f34510W, bankAccountPaymentParams.f34510W) || !Arrays.equals(this.f34511X, bankAccountPaymentParams.f34511X)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (((((((((((((((super.hashCode() * 31) + Arrays.hashCode(this.f34505R)) * 31) + Arrays.hashCode(this.f34506S)) * 31) + Arrays.hashCode(this.f34507T)) * 31) + Arrays.hashCode(this.f34508U)) * 31) + Arrays.hashCode(this.f34509V)) * 31) + Arrays.hashCode(this.f34510W)) * 31) + Arrays.hashCode(this.f34511X)) * 31) + (this.f34512Y ? 1 : 0);
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        return super.mo40898i();
    }

    /* renamed from: l */
    public void mo40901l() {
        if (this.f34506S != null) {
            String s = mo40926s();
            if (s.length() > 4) {
                this.f34506S = s.substring(s.length() - 4).getBytes();
            }
        }
    }

    /* renamed from: m */
    public String mo40920m() {
        return C11780c.m52956a(this.f34507T);
    }

    /* renamed from: n */
    public String mo40921n() {
        return C11780c.m52956a(this.f34509V);
    }

    /* renamed from: o */
    public String mo40922o() {
        return C11780c.m52956a(this.f34511X);
    }

    /* renamed from: p */
    public String mo40923p() {
        return C11780c.m52956a(this.f34508U);
    }

    /* renamed from: q */
    public String mo40924q() {
        return C11780c.m52956a(this.f34510W);
    }

    /* renamed from: r */
    public String mo40925r() {
        return C11780c.m52956a(this.f34505R);
    }

    /* renamed from: s */
    public String mo40926s() {
        return C11780c.m52956a(this.f34506S);
    }

    /* renamed from: t */
    public boolean mo40927t() {
        return this.f34512Y;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        C11780c.m52957a(parcel, this.f34505R);
        C11780c.m52957a(parcel, this.f34506S);
        C11780c.m52957a(parcel, this.f34507T);
        C11780c.m52957a(parcel, this.f34508U);
        C11780c.m52957a(parcel, this.f34509V);
        C11780c.m52957a(parcel, this.f34510W);
        C11780c.m52957a(parcel, this.f34511X);
        parcel.writeByte(this.f34512Y ? (byte) 1 : 0);
    }
}
