package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.clevertap.android.sdk.C3150p0.C3205z0;
import org.json.JSONObject;

public class CleverTapInstanceConfig implements Parcelable {
    public static final Creator<CleverTapInstanceConfig> CREATOR = new C3045a();

    /* renamed from: N */
    private String f10875N;

    /* renamed from: O */
    private String f10876O;

    /* renamed from: P */
    private boolean f10877P;

    /* renamed from: Q */
    private boolean f10878Q;

    /* renamed from: R */
    private boolean f10879R;

    /* renamed from: S */
    private boolean f10880S;

    /* renamed from: T */
    private boolean f10881T;

    /* renamed from: U */
    private int f10882U;

    /* renamed from: V */
    protected C3111h1 f10883V;

    /* renamed from: W */
    private boolean f10884W;

    /* renamed from: X */
    private boolean f10885X;

    /* renamed from: Y */
    private boolean f10886Y;

    /* renamed from: Z */
    private boolean f10887Z;

    /* renamed from: a */
    private String f10888a;

    /* renamed from: a0 */
    private String f10889a0;

    /* renamed from: b */
    private String f10890b;

    /* renamed from: com.clevertap.android.sdk.CleverTapInstanceConfig$a */
    static class C3045a implements Creator<CleverTapInstanceConfig> {
        C3045a() {
        }

        public CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel, null);
        }

        public CleverTapInstanceConfig[] newArray(int i) {
            return new CleverTapInstanceConfig[i];
        }
    }

    /* synthetic */ CleverTapInstanceConfig(Parcel parcel, C3045a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public static CleverTapInstanceConfig m14635a(Context context, @C0193h0 String str, @C0193h0 String str2) {
        if (str == null || str2 == null) {
            C3111h1.m14934e("CleverTap accountId and accountToken cannot be null");
            return null;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = new CleverTapInstanceConfig(context, str, str2, null, false);
        return cleverTapInstanceConfig;
    }

    /* renamed from: b */
    public static CleverTapInstanceConfig m14638b(Context context, @C0193h0 String str, @C0193h0 String str2, String str3) {
        if (str == null || str2 == null) {
            C3111h1.m14934e("CleverTap accountId and accountToken cannot be null");
            return null;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig = new CleverTapInstanceConfig(context, str, str2, str3, false);
        return cleverTapInstanceConfig;
    }

    /* renamed from: w */
    private String m14639w() {
        return this.f10876O;
    }

    /* renamed from: c */
    public String mo12099c() {
        return this.f10890b;
    }

    /* renamed from: d */
    public void mo12101d(boolean z) {
        this.f10880S = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo12103e(boolean z) {
        this.f10887Z = z;
    }

    /* renamed from: f */
    public void mo12104f(boolean z) {
        this.f10879R = z;
    }

    /* renamed from: i */
    public int mo12105i() {
        return this.f10882U;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo12106j() {
        return this.f10887Z;
    }

    /* renamed from: k */
    public String mo12107k() {
        return this.f10889a0;
    }

    /* renamed from: l */
    public C3111h1 mo12108l() {
        return this.f10883V;
    }

    /* renamed from: m */
    public boolean mo12109m() {
        return this.f10877P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo12110n() {
        return this.f10886Y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo12111o() {
        return this.f10884W;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo12112p() {
        return this.f10878Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo12113q() {
        return this.f10880S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo12114r() {
        return this.f10881T;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo12115s() {
        return this.f10885X;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo12116t() {
        return this.f10879R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public void mo12117u() {
        this.f10884W = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public String mo12118v() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountId", mo12093a());
            jSONObject.put("accountToken", mo12099c());
            jSONObject.put("accountRegion", mo12097b());
            jSONObject.put("gcmSenderId", m14639w());
            jSONObject.put("analyticsOnly", mo12109m());
            jSONObject.put("isDefaultInstance", mo12112p());
            jSONObject.put("useGoogleAdId", mo12116t());
            jSONObject.put("disableAppLaunchedEvent", mo12113q());
            jSONObject.put("personalization", mo12114r());
            jSONObject.put("debugLevel", mo12105i());
            jSONObject.put("createdPostAppLaunch", mo12111o());
            jSONObject.put("sslPinning", mo12115s());
            jSONObject.put("backgroundSync", mo12110n());
            jSONObject.put("getEnableCustomCleverTapId", mo12106j());
            jSONObject.put("fcmSenderId", mo12107k());
            return jSONObject.toString();
        } catch (Throwable th) {
            C3111h1.m14941f("Unable to convert config to JSON : ", th.getCause());
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10888a);
        parcel.writeString(this.f10890b);
        parcel.writeString(this.f10875N);
        parcel.writeString(this.f10876O);
        parcel.writeByte(this.f10877P ? (byte) 1 : 0);
        parcel.writeByte(this.f10878Q ? (byte) 1 : 0);
        parcel.writeByte(this.f10879R ? (byte) 1 : 0);
        parcel.writeByte(this.f10880S ? (byte) 1 : 0);
        parcel.writeByte(this.f10881T ? (byte) 1 : 0);
        parcel.writeInt(this.f10882U);
        parcel.writeByte(this.f10885X ? (byte) 1 : 0);
        parcel.writeByte(this.f10884W ? (byte) 1 : 0);
        parcel.writeByte(this.f10886Y ? (byte) 1 : 0);
        parcel.writeByte(this.f10887Z ? (byte) 1 : 0);
        parcel.writeString(this.f10889a0);
    }

    private CleverTapInstanceConfig(Context context, String str, String str2, String str3, boolean z) {
        this.f10888a = str;
        this.f10890b = str2;
        this.f10875N = str3;
        this.f10878Q = z;
        this.f10877P = false;
        this.f10881T = true;
        this.f10882U = C3205z0.INFO.mo12550d();
        this.f10883V = new C3111h1(this.f10882U);
        this.f10884W = false;
        C3115i1 a = C3115i1.m14962a(context);
        this.f10879R = a.mo12330l();
        this.f10880S = a.mo12326h();
        this.f10876O = a.mo12324f();
        this.f10885X = a.mo12328j();
        this.f10886Y = a.mo12327i();
        this.f10889a0 = a.mo12323e();
        this.f10887Z = a.mo12329k();
    }

    /* renamed from: c */
    public void mo12100c(boolean z) {
        this.f10886Y = z;
    }

    /* renamed from: a */
    protected static CleverTapInstanceConfig m14637a(@C0193h0 String str) {
        try {
            return new CleverTapInstanceConfig(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo12097b() {
        return this.f10875N;
    }

    /* renamed from: a */
    protected static CleverTapInstanceConfig m14636a(Context context, @C0193h0 String str, @C0193h0 String str2, String str3) {
        CleverTapInstanceConfig cleverTapInstanceConfig = new CleverTapInstanceConfig(context, str, str2, str3, true);
        return cleverTapInstanceConfig;
    }

    /* renamed from: b */
    public void mo12098b(boolean z) {
        this.f10877P = z;
    }

    /* renamed from: a */
    public String mo12093a() {
        return this.f10888a;
    }

    /* renamed from: a */
    public void mo12096a(boolean z) {
        this.f10881T = z;
    }

    /* renamed from: a */
    public void mo12095a(C3205z0 z0Var) {
        this.f10882U = z0Var.mo12550d();
    }

    /* renamed from: a */
    public void mo12094a(int i) {
        this.f10882U = i;
    }

    CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f10888a = cleverTapInstanceConfig.f10888a;
        this.f10890b = cleverTapInstanceConfig.f10890b;
        this.f10875N = cleverTapInstanceConfig.f10875N;
        this.f10878Q = cleverTapInstanceConfig.f10878Q;
        this.f10877P = cleverTapInstanceConfig.f10877P;
        this.f10881T = cleverTapInstanceConfig.f10881T;
        this.f10882U = cleverTapInstanceConfig.f10882U;
        this.f10883V = cleverTapInstanceConfig.f10883V;
        this.f10879R = cleverTapInstanceConfig.f10879R;
        this.f10880S = cleverTapInstanceConfig.f10880S;
        this.f10876O = cleverTapInstanceConfig.f10876O;
        this.f10884W = cleverTapInstanceConfig.f10884W;
        this.f10885X = cleverTapInstanceConfig.f10885X;
        this.f10886Y = cleverTapInstanceConfig.f10886Y;
        this.f10887Z = cleverTapInstanceConfig.f10887Z;
        this.f10889a0 = cleverTapInstanceConfig.f10889a0;
    }

    private CleverTapInstanceConfig(String str) throws Throwable {
        String str2 = str;
        String str3 = "backgroundSync";
        String str4 = "sslPinning";
        String str5 = "createdPostAppLaunch";
        String str6 = "debugLevel";
        String str7 = "personalization";
        String str8 = "disableAppLaunchedEvent";
        String str9 = "useGoogleAdId";
        String str10 = "isDefaultInstance";
        String str11 = "analyticsOnly";
        String str12 = "gcmSenderId";
        String str13 = "accountRegion";
        String str14 = "accountToken";
        String str15 = "fcmSenderId";
        String str16 = "accountId";
        String str17 = "getEnableCustomCleverTapId";
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(str16)) {
                this.f10888a = jSONObject.getString(str16);
            }
            if (jSONObject.has(str14)) {
                this.f10890b = jSONObject.getString(str14);
            }
            if (jSONObject.has(str13)) {
                this.f10875N = jSONObject.getString(str13);
            }
            if (jSONObject.has(str12)) {
                this.f10876O = jSONObject.getString(str12);
            }
            if (jSONObject.has(str11)) {
                this.f10877P = jSONObject.getBoolean(str11);
            }
            if (jSONObject.has(str10)) {
                this.f10878Q = jSONObject.getBoolean(str10);
            }
            if (jSONObject.has(str9)) {
                this.f10879R = jSONObject.getBoolean(str9);
            }
            if (jSONObject.has(str8)) {
                this.f10880S = jSONObject.getBoolean(str8);
            }
            if (jSONObject.has(str7)) {
                this.f10881T = jSONObject.getBoolean(str7);
            }
            if (jSONObject.has(str6)) {
                this.f10882U = jSONObject.getInt(str6);
                this.f10883V = new C3111h1(this.f10882U);
            }
            if (jSONObject.has(str5)) {
                this.f10884W = jSONObject.getBoolean(str5);
            }
            if (jSONObject.has(str4)) {
                this.f10885X = jSONObject.getBoolean(str4);
            }
            if (jSONObject.has(str3)) {
                this.f10886Y = jSONObject.getBoolean(str3);
            }
            String str18 = str17;
            if (jSONObject.has(str18)) {
                this.f10887Z = jSONObject.getBoolean(str18);
            }
            String str19 = str15;
            if (jSONObject.has(str19)) {
                this.f10876O = jSONObject.getString(str19);
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error constructing CleverTapInstanceConfig from JSON: ");
            sb.append(str2);
            sb.append(": ");
            C3111h1.m14941f(sb.toString(), th.getCause());
            throw th;
        }
    }

    private CleverTapInstanceConfig(Parcel parcel) {
        this.f10888a = parcel.readString();
        this.f10890b = parcel.readString();
        this.f10875N = parcel.readString();
        this.f10876O = parcel.readString();
        boolean z = true;
        this.f10877P = parcel.readByte() != 0;
        this.f10878Q = parcel.readByte() != 0;
        this.f10879R = parcel.readByte() != 0;
        this.f10880S = parcel.readByte() != 0;
        this.f10881T = parcel.readByte() != 0;
        this.f10882U = parcel.readInt();
        this.f10884W = parcel.readByte() != 0;
        this.f10885X = parcel.readByte() != 0;
        this.f10886Y = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f10887Z = z;
        this.f10889a0 = parcel.readString();
    }
}
