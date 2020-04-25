package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.oppwa.mobile.connect.p427b.C11780c;
import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckoutInfo implements Parcelable {
    public static final Creator<CheckoutInfo> CREATOR = new C11946a();

    /* renamed from: N */
    private double f34473N;

    /* renamed from: O */
    private String f34474O;

    /* renamed from: P */
    private String[] f34475P;

    /* renamed from: Q */
    private boolean f34476Q;

    /* renamed from: R */
    private boolean f34477R;

    /* renamed from: S */
    private Token[] f34478S;

    /* renamed from: T */
    private String[] f34479T;

    /* renamed from: U */
    private boolean f34480U;

    /* renamed from: a */
    private String f34481a;

    /* renamed from: b */
    private String f34482b;

    /* renamed from: com.oppwa.mobile.connect.payment.CheckoutInfo$a */
    static class C11946a implements Creator<CheckoutInfo> {
        C11946a() {
        }

        /* renamed from: a */
        public CheckoutInfo createFromParcel(Parcel parcel) {
            return new CheckoutInfo(parcel, null);
        }

        /* renamed from: a */
        public CheckoutInfo[] newArray(int i) {
            return new CheckoutInfo[i];
        }
    }

    protected CheckoutInfo() {
        this.f34475P = new String[0];
        this.f34476Q = false;
        this.f34477R = false;
        this.f34480U = false;
    }

    private CheckoutInfo(Parcel parcel) {
        this.f34481a = parcel.readString();
        this.f34482b = parcel.readString();
        this.f34473N = parcel.readDouble();
        this.f34474O = parcel.readString();
        boolean z = true;
        this.f34476Q = parcel.readByte() != 0;
        this.f34477R = parcel.readByte() != 0;
        this.f34475P = parcel.createStringArray();
        this.f34478S = (Token[]) parcel.createTypedArray(Token.CREATOR);
        this.f34479T = parcel.createStringArray();
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f34480U = z;
    }

    /* synthetic */ CheckoutInfo(Parcel parcel, C11946a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static CheckoutInfo m53835a(JSONObject jSONObject) throws JSONException {
        CheckoutInfo checkoutInfo = new CheckoutInfo();
        String str = "endpoint";
        if (jSONObject.has(str)) {
            checkoutInfo.f34481a = jSONObject.getString(str);
        }
        String str2 = "resourcePath";
        if (jSONObject.has(str2)) {
            checkoutInfo.f34482b = jSONObject.getString(str2);
        }
        String str3 = "amount";
        if (jSONObject.has(str3)) {
            checkoutInfo.f34473N = Double.parseDouble(jSONObject.getString(str3));
        }
        String str4 = C5854b.f16923e;
        if (jSONObject.has(str4)) {
            checkoutInfo.f34474O = jSONObject.getString(str4);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("config");
        String str5 = "brandConfig";
        if (jSONObject2.has(str5)) {
            m53836a(jSONObject2.getJSONObject(str5), checkoutInfo);
        }
        if (jSONObject2.has("registrations")) {
            m53837b(jSONObject2, checkoutInfo);
        }
        if (jSONObject2.has("klarnaMerchantIds")) {
            m53838c(jSONObject2, checkoutInfo);
        }
        String str6 = "workflowSpecificConfig";
        if (jSONObject2.has(str6)) {
            m53839d(jSONObject2.getJSONObject(str6), checkoutInfo);
        }
        return checkoutInfo;
    }

    /* renamed from: a */
    private static CheckoutInfo m53836a(JSONObject jSONObject, CheckoutInfo checkoutInfo) throws JSONException {
        String[] strArr;
        checkoutInfo.f34476Q = jSONObject.getBoolean("overrideShopBrands");
        checkoutInfo.f34477R = jSONObject.getBoolean("activateBrands");
        JSONArray jSONArray = jSONObject.getJSONArray("brands");
        if (jSONArray.length() > 0) {
            strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
        } else {
            strArr = null;
        }
        checkoutInfo.f34475P = strArr;
        return checkoutInfo;
    }

    /* renamed from: b */
    private static CheckoutInfo m53837b(JSONObject jSONObject, CheckoutInfo checkoutInfo) throws JSONException {
        Token[] tokenArr;
        JSONArray jSONArray = jSONObject.getJSONArray("registrations");
        if (jSONArray.length() > 0) {
            tokenArr = new Token[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                tokenArr[i] = Token.m54036a(jSONArray.getJSONObject(i));
            }
        } else {
            tokenArr = null;
        }
        checkoutInfo.f34478S = tokenArr;
        return checkoutInfo;
    }

    /* renamed from: c */
    private static CheckoutInfo m53838c(JSONObject jSONObject, CheckoutInfo checkoutInfo) throws JSONException {
        String[] strArr;
        JSONArray jSONArray = jSONObject.getJSONArray("klarnaMerchantIds");
        if (jSONArray.length() > 0) {
            strArr = new String[jSONArray.length()];
            for (int i = 0; i < jSONArray.length(); i++) {
                strArr[i] = jSONArray.getString(i);
            }
        } else {
            strArr = null;
        }
        checkoutInfo.f34479T = strArr;
        return checkoutInfo;
    }

    /* renamed from: d */
    private static CheckoutInfo m53839d(JSONObject jSONObject, CheckoutInfo checkoutInfo) throws JSONException {
        String str = "iovationConfig";
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            String str2 = "msdkActive";
            if (jSONObject2.has(str2)) {
                checkoutInfo.f34480U = jSONObject2.getBoolean(str2);
            }
        }
        return checkoutInfo;
    }

    /* renamed from: p */
    private Token[] m53840p() {
        Token[] tokenArr = this.f34478S;
        if (tokenArr == null) {
            return null;
        }
        int length = tokenArr.length;
        Token[] tokenArr2 = new Token[length];
        for (int i = 0; i < length; i++) {
            Token[] tokenArr3 = this.f34478S;
            tokenArr2[i] = tokenArr3[i].mo41006a(tokenArr3[i]);
        }
        return tokenArr2;
    }

    /* renamed from: a */
    public double mo40837a() {
        return this.f34473N;
    }

    /* renamed from: a */
    public void mo40838a(String str) {
        this.f34481a = str;
    }

    @C0195i0
    /* renamed from: b */
    public String[] mo40839b() {
        return this.f34475P;
    }

    @C0195i0
    /* renamed from: c */
    public String mo40840c() {
        return this.f34474O;
    }

    /* renamed from: c */
    public void mo40841c(String str) {
        this.f34482b = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || CheckoutInfo.class != obj.getClass()) {
            return false;
        }
        CheckoutInfo checkoutInfo = (CheckoutInfo) obj;
        if (Double.compare(checkoutInfo.f34473N, this.f34473N) != 0 || !Arrays.equals(this.f34475P, checkoutInfo.f34475P) || !Arrays.equals(this.f34478S, checkoutInfo.f34478S) || !Arrays.equals(this.f34479T, checkoutInfo.f34479T) || this.f34476Q != checkoutInfo.f34476Q || this.f34480U != checkoutInfo.f34480U || this.f34477R != checkoutInfo.f34477R || !C11780c.m52958a((Object) this.f34481a, (Object) checkoutInfo.f34481a) || !C11780c.m52958a((Object) this.f34482b, (Object) checkoutInfo.f34482b) || !C11780c.m52958a((Object) this.f34474O, (Object) checkoutInfo.f34474O)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        String str = this.f34481a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34482b;
        int hashCode2 = hashCode + (str2 != null ? str2.hashCode() : 0);
        long doubleToLongBits = Double.doubleToLongBits(this.f34473N);
        int i2 = ((hashCode2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        String str3 = this.f34474O;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((((((((((((i2 + i) * 31) + Arrays.hashCode(this.f34475P)) * 31) + (this.f34476Q ? 1 : 0)) * 31) + (this.f34477R ? 1 : 0)) * 31) + Arrays.hashCode(this.f34478S)) * 31) + Arrays.hashCode(this.f34479T)) * 31) + (this.f34480U ? 1 : 0);
    }

    @C0195i0
    /* renamed from: i */
    public String mo40845i() {
        return this.f34481a;
    }

    @C0195i0
    /* renamed from: j */
    public String[] mo40846j() {
        return this.f34479T;
    }

    @C0195i0
    /* renamed from: k */
    public String mo40847k() {
        return this.f34482b;
    }

    @C0195i0
    /* renamed from: l */
    public Token[] mo40848l() {
        return m53840p();
    }

    /* renamed from: m */
    public boolean mo40849m() {
        return this.f34477R;
    }

    /* renamed from: n */
    public boolean mo40850n() {
        return this.f34480U;
    }

    /* renamed from: o */
    public boolean mo40851o() {
        return this.f34476Q;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34481a);
        parcel.writeString(this.f34482b);
        parcel.writeDouble(this.f34473N);
        parcel.writeString(this.f34474O);
        parcel.writeByte(this.f34476Q ? (byte) 1 : 0);
        parcel.writeByte(this.f34477R ? (byte) 1 : 0);
        parcel.writeStringArray(this.f34475P);
        parcel.writeTypedArray(this.f34478S, i);
        parcel.writeStringArray(this.f34479T);
        parcel.writeByte(this.f34480U ? (byte) 1 : 0);
    }
}
