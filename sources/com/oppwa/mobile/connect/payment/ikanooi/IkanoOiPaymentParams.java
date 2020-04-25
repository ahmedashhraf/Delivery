package com.oppwa.mobile.connect.payment.ikanooi;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class IkanoOiPaymentParams extends PaymentParams {
    public static final Creator<IkanoOiPaymentParams> CREATOR = new C11967a();

    /* renamed from: S */
    private static SoftReference<Pattern> f34532S;

    /* renamed from: T */
    private static SoftReference<Pattern> f34533T;

    /* renamed from: U */
    private static SoftReference<Pattern> f34534U;
    @C0193h0

    /* renamed from: R */
    private String f34535R;

    /* renamed from: com.oppwa.mobile.connect.payment.ikanooi.IkanoOiPaymentParams$a */
    static class C11967a implements Creator<IkanoOiPaymentParams> {
        C11967a() {
        }

        /* renamed from: a */
        public IkanoOiPaymentParams createFromParcel(Parcel parcel) {
            return new IkanoOiPaymentParams(parcel, null);
        }

        /* renamed from: a */
        public IkanoOiPaymentParams[] newArray(int i) {
            return new IkanoOiPaymentParams[i];
        }
    }

    private IkanoOiPaymentParams(Parcel parcel) {
        super(parcel);
        this.f34535R = parcel.readString();
    }

    /* synthetic */ IkanoOiPaymentParams(Parcel parcel, C11967a aVar) {
        this(parcel);
    }

    public IkanoOiPaymentParams(@C0193h0 String str, @C0193h0 String str2, @C0193h0 String str3) throws PaymentException {
        super(str, str2);
        if (m54000e(str3, str2)) {
            this.f34535R = str3;
            return;
        }
        throw new PaymentException(PaymentError.m53751E());
    }

    /* renamed from: c */
    private static boolean m53998c(@C0193h0 String str, @C0193h0 String str2) {
        return m53999d(str.substring(0, str2.length()), str2);
    }

    /* renamed from: d */
    private static boolean m53999d(@C0193h0 String str, @C0193h0 String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(str);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m54000e(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 580579304) {
            if (hashCode != 580579558) {
                if (hashCode == 580579703 && str2.equals("IKANOOI_SE")) {
                    c = 1;
                }
            } else if (str2.equals("IKANOOI_NO")) {
                c = 0;
            }
        } else if (str2.equals("IKANOOI_FI")) {
            c = 2;
        }
        if (c == 0) {
            return m54001f(str);
        }
        if (c == 1) {
            return m54002g(str);
        }
        if (c != 2) {
            return false;
        }
        return m54003h(str);
    }

    /* renamed from: f */
    private static boolean m54001f(@C0193h0 String str) {
        if (m54005o().matcher(str).matches()) {
            return m53998c(str, "ddMMyy");
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m54002g(@C0193h0 String str) {
        if (m54004n().matcher(str).matches()) {
            return m53998c(str, "yyyyMMdd");
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m54003h(@C0193h0 String str) {
        if (m54006p().matcher(str).matches()) {
            return m53998c(str, "ddMMyy");
        }
        return false;
    }

    /* renamed from: n */
    private static Pattern m54004n() {
        SoftReference<Pattern> softReference = f34532S;
        if (softReference == null || softReference.get() == null) {
            f34532S = new SoftReference<>(Pattern.compile("^[0-9]{12}$"));
        }
        return (Pattern) f34532S.get();
    }

    /* renamed from: o */
    private static Pattern m54005o() {
        SoftReference<Pattern> softReference = f34533T;
        if (softReference == null || softReference.get() == null) {
            f34533T = new SoftReference<>(Pattern.compile("^[0-9]{11}$"));
        }
        return (Pattern) f34533T.get();
    }

    /* renamed from: p */
    private static Pattern m54006p() {
        SoftReference<Pattern> softReference = f34534U;
        if (softReference == null || softReference.get() == null) {
            f34534U = new SoftReference<>(Pattern.compile("^[0-9]{6}-[a-zA-Z0-9]{4}$"));
        }
        return (Pattern) f34534U.get();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IkanoOiPaymentParams.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return C11780c.m52958a((Object) this.f34535R, (Object) ((IkanoOiPaymentParams) obj).f34535R);
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.f34535R.hashCode();
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        Map<String, String> i = super.mo40898i();
        i.put("customer.identificationDocId", this.f34535R);
        return i;
    }

    @C0193h0
    /* renamed from: m */
    public String mo40920m() {
        return this.f34535R;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f34535R);
    }
}
