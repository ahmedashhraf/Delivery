package com.oppwa.mobile.connect.payment;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.oppwa.mobile.connect.C11777a;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11780c;
import java.io.UnsupportedEncodingException;
import java.lang.ref.SoftReference;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class PaymentParams implements Parcelable {
    public static final Creator<PaymentParams> CREATOR = new C11949a();

    /* renamed from: Q */
    private static SoftReference<Pattern> f34489Q;
    @C0193h0

    /* renamed from: N */
    private String f34490N;
    @C0193h0

    /* renamed from: O */
    private String f34491O;
    @C0195i0

    /* renamed from: P */
    private String f34492P;
    @C0193h0

    /* renamed from: a */
    protected Map<String, String> f34493a;
    @C0193h0

    /* renamed from: b */
    protected Map<String, String> f34494b;

    /* renamed from: com.oppwa.mobile.connect.payment.PaymentParams$a */
    static class C11949a implements Creator<PaymentParams> {
        C11949a() {
        }

        /* renamed from: a */
        public PaymentParams createFromParcel(Parcel parcel) {
            return new PaymentParams(parcel);
        }

        /* renamed from: a */
        public PaymentParams[] newArray(int i) {
            return new PaymentParams[i];
        }
    }

    protected PaymentParams(Parcel parcel) {
        this.f34490N = parcel.readString();
        this.f34491O = parcel.readString();
        this.f34492P = parcel.readString();
        int readInt = parcel.readInt();
        this.f34493a = new HashMap();
        if (readInt > 0) {
            this.f34493a = new HashMap(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f34493a.put(parcel.readString(), parcel.readString());
            }
        }
        int readInt2 = parcel.readInt();
        this.f34494b = new HashMap();
        if (readInt2 > 0) {
            this.f34494b = new HashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.f34494b.put(parcel.readString(), parcel.readString());
            }
        }
    }

    @Deprecated
    public PaymentParams(String str, PaymentParamsBrand paymentParamsBrand) throws PaymentException {
        this(str, paymentParamsBrand.mo40908j());
    }

    public PaymentParams(String str, String str2) throws PaymentException {
        if (str == null || str.length() == 0) {
            throw new PaymentException(PaymentError.m53779y());
        } else if (mo40888a(str2)) {
            this.f34490N = str;
            this.f34491O = str2;
            this.f34493a = new HashMap();
            this.f34494b = new HashMap();
        } else {
            throw new PaymentException(PaymentError.m53752F());
        }
    }

    /* renamed from: f */
    private String mo40950f(String str) {
        String str2 = "://";
        String[] split = str.split(str2);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            sb.append(str2);
            sb.append(URLEncoder.encode(split[1], "UTF-8"));
            return sb.toString();
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: m */
    private static Pattern mo40920m() {
        SoftReference<Pattern> softReference = f34489Q;
        if (softReference == null || softReference.get() == null) {
            f34489Q = new SoftReference<>(Pattern.compile("^SHOPPER_[a-zA-Z0-9\\._]{2,64}$"));
        }
        return (Pattern) f34489Q.get();
    }

    /* renamed from: n */
    private void mo40921n() {
        String str = "SHOPPER_MSDKIntegrationType";
        if (!this.f34493a.containsKey(str)) {
            mo40890b(str, "Custom");
        }
        mo40890b("SHOPPER_OS", mo40922o());
        mo40890b("SHOPPER_device", mo40923p());
        mo40890b("SHOPPER_MSDKVersion", mo40924q());
    }

    /* renamed from: o */
    private static String mo40922o() {
        StringBuilder sb = new StringBuilder();
        sb.append("Android ");
        sb.append(VERSION.RELEASE);
        return sb.toString();
    }

    /* renamed from: p */
    private static String mo40923p() {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        String str = C3868i.f12248b;
        sb.append(str);
        sb.append(Build.BRAND);
        sb.append(str);
        sb.append(Build.MODEL);
        return sb.toString();
    }

    /* renamed from: q */
    private static String mo40924q() {
        return C11777a.f34040f;
    }

    @Deprecated
    /* renamed from: a */
    public PaymentParamsBrand mo40886a() {
        return PaymentParamsBrand.m53895c(this.f34491O);
    }

    /* renamed from: a */
    public void mo40887a(String str, String str2) {
        this.f34494b.put(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo40888a(String str) {
        return str != null && str.length() > 0;
    }

    /* renamed from: b */
    public String mo40889b() {
        return this.f34490N;
    }

    /* renamed from: b */
    public boolean mo40890b(String str, String str2) {
        if (!mo40920m().matcher(str).matches() || str2.length() > 2048) {
            return false;
        }
        this.f34493a.put(str, str2);
        return true;
    }

    /* renamed from: c */
    public Creator<?> mo40891c() {
        return CREATOR;
    }

    /* renamed from: c */
    public void mo40892c(String str) {
        this.f34493a.remove(str);
    }

    /* renamed from: d */
    public void mo40893d(String str) {
        this.f34490N = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo40895e(@C0195i0 String str) {
        this.f34492P = str;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaymentParams paymentParams = (PaymentParams) obj;
        if (!C11780c.m52958a((Object) this.f34491O, (Object) paymentParams.f34491O) || !C11780c.m52958a((Object) this.f34490N, (Object) paymentParams.f34490N) || !C11780c.m52958a((Object) this.f34492P, (Object) paymentParams.f34492P) || !C11780c.m52958a((Object) this.f34493a, (Object) paymentParams.f34493a) || !C11780c.m52958a((Object) this.f34494b, (Object) paymentParams.f34494b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.f34493a.hashCode() * 31) + this.f34494b.hashCode()) * 31) + this.f34490N.hashCode()) * 31;
        String str = this.f34492P;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f34491O.hashCode();
    }

    /* renamed from: i */
    public Map<String, String> mo40898i() {
        HashMap hashMap = new HashMap();
        hashMap.put("paymentBrand", this.f34491O);
        hashMap.put("source", "MSDK");
        mo40921n();
        for (String str : this.f34493a.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append("customParameters[");
            sb.append(str);
            sb.append("]");
            hashMap.put(sb.toString(), this.f34493a.get(str));
        }
        String str2 = this.f34492P;
        if (str2 != null) {
            hashMap.put("shopperResultUrl", mo40950f(str2));
        }
        if (!this.f34494b.isEmpty()) {
            for (String str3 : this.f34494b.keySet()) {
                hashMap.put(str3, this.f34494b.get(str3));
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public String mo40899j() {
        return this.f34491O;
    }

    @C0195i0
    /* renamed from: k */
    public String mo40900k() {
        return this.f34492P;
    }

    /* renamed from: l */
    public void mo40901l() {
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34490N);
        parcel.writeString(this.f34491O);
        parcel.writeString(this.f34492P);
        parcel.writeInt(this.f34493a.size());
        if (!this.f34493a.isEmpty()) {
            for (String str : this.f34493a.keySet()) {
                parcel.writeString(str);
                parcel.writeString((String) this.f34493a.get(str));
            }
        }
        parcel.writeInt(this.f34494b.size());
        if (!this.f34494b.isEmpty()) {
            for (String str2 : this.f34494b.keySet()) {
                parcel.writeString(str2);
                parcel.writeString((String) this.f34494b.get(str2));
            }
        }
    }
}
