package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.material.tabs.TabLayout.C7050e;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import java.util.ArrayList;
import java.util.Arrays;

public class CTInboxStyleConfig implements Parcelable {
    public static final Creator<CTInboxStyleConfig> CREATOR = new C3044b();

    /* renamed from: V */
    private static final int f10863V = 2;

    /* renamed from: W */
    private static boolean f10864W;

    /* renamed from: N */
    private String f10865N;

    /* renamed from: O */
    private String f10866O;

    /* renamed from: P */
    private String f10867P;

    /* renamed from: Q */
    private String f10868Q;

    /* renamed from: R */
    private String f10869R;

    /* renamed from: S */
    private String f10870S;

    /* renamed from: T */
    private String f10871T;

    /* renamed from: U */
    private String[] f10872U;

    /* renamed from: a */
    private String f10873a;

    /* renamed from: b */
    private String f10874b;

    /* renamed from: com.clevertap.android.sdk.CTInboxStyleConfig$a */
    static class C3043a implements C7051h {
        C3043a() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* renamed from: com.clevertap.android.sdk.CTInboxStyleConfig$b */
    static class C3044b implements Creator<CTInboxStyleConfig> {
        C3044b() {
        }

        public CTInboxStyleConfig createFromParcel(Parcel parcel) {
            return new CTInboxStyleConfig(parcel);
        }

        public CTInboxStyleConfig[] newArray(int i) {
            return new CTInboxStyleConfig[i];
        }
    }

    static {
        try {
            f10864W = new C3043a() instanceof C7050e;
        } catch (Throwable unused) {
        }
    }

    public CTInboxStyleConfig() {
        String str = "#FFFFFF";
        this.f10873a = str;
        this.f10874b = "App Inbox";
        String str2 = "#333333";
        this.f10865N = str2;
        this.f10866O = "#D3D4DA";
        this.f10867P = str2;
        String str3 = "#1C84FE";
        this.f10868Q = str3;
        this.f10869R = "#808080";
        this.f10870S = str3;
        this.f10871T = str;
        this.f10872U = new String[0];
    }

    /* renamed from: a */
    public void mo12069a(ArrayList<String> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            if (f10864W) {
                if (arrayList.size() > 2) {
                    arrayList = new ArrayList<>(arrayList.subList(0, 2));
                }
                this.f10872U = (String[]) arrayList.toArray(new String[0]);
                return;
            }
            C3111h1.m14930d("Please upgrade com.android.support:design library to v28.0.0 to enable Tabs for App Inbox, dropping Tabs");
        }
    }

    /* renamed from: b */
    public String mo12070b() {
        return this.f10866O;
    }

    /* renamed from: c */
    public String mo12071c() {
        return this.f10873a;
    }

    /* renamed from: d */
    public void mo12073d(String str) {
        this.f10873a = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo12075e(String str) {
        this.f10874b = str;
    }

    /* renamed from: f */
    public void mo12076f(String str) {
        this.f10865N = str;
    }

    /* renamed from: g */
    public void mo12077g(String str) {
        this.f10868Q = str;
    }

    /* renamed from: h */
    public void mo12078h(String str) {
        this.f10870S = str;
    }

    /* renamed from: i */
    public String mo12079i() {
        return this.f10874b;
    }

    /* renamed from: j */
    public String mo12081j() {
        return this.f10865N;
    }

    /* renamed from: k */
    public String mo12083k() {
        return this.f10868Q;
    }

    /* renamed from: l */
    public String mo12084l() {
        return this.f10870S;
    }

    /* renamed from: m */
    public String mo12085m() {
        return this.f10871T;
    }

    /* renamed from: n */
    public ArrayList<String> mo12086n() {
        String[] strArr = this.f10872U;
        return strArr == null ? new ArrayList<>() : new ArrayList(Arrays.asList(strArr));
    }

    /* renamed from: o */
    public String mo12087o() {
        return this.f10869R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo12088p() {
        String[] strArr = this.f10872U;
        return strArr != null && strArr.length > 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10873a);
        parcel.writeString(this.f10874b);
        parcel.writeString(this.f10865N);
        parcel.writeString(this.f10866O);
        parcel.writeStringArray(this.f10872U);
        parcel.writeString(this.f10867P);
        parcel.writeString(this.f10868Q);
        parcel.writeString(this.f10869R);
        parcel.writeString(this.f10870S);
        parcel.writeString(this.f10871T);
    }

    /* renamed from: c */
    public void mo12072c(String str) {
        this.f10866O = str;
    }

    /* renamed from: i */
    public void mo12080i(String str) {
        this.f10871T = str;
    }

    /* renamed from: j */
    public void mo12082j(String str) {
        this.f10869R = str;
    }

    /* renamed from: a */
    public String mo12067a() {
        return this.f10867P;
    }

    /* renamed from: a */
    public void mo12068a(String str) {
        this.f10867P = str;
    }

    CTInboxStyleConfig(CTInboxStyleConfig cTInboxStyleConfig) {
        this.f10873a = cTInboxStyleConfig.f10873a;
        this.f10874b = cTInboxStyleConfig.f10874b;
        this.f10865N = cTInboxStyleConfig.f10865N;
        this.f10866O = cTInboxStyleConfig.f10866O;
        this.f10867P = cTInboxStyleConfig.f10867P;
        this.f10868Q = cTInboxStyleConfig.f10868Q;
        this.f10869R = cTInboxStyleConfig.f10869R;
        this.f10870S = cTInboxStyleConfig.f10870S;
        this.f10871T = cTInboxStyleConfig.f10871T;
        String[] strArr = cTInboxStyleConfig.f10872U;
        this.f10872U = strArr == null ? new String[0] : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    protected CTInboxStyleConfig(Parcel parcel) {
        this.f10873a = parcel.readString();
        this.f10874b = parcel.readString();
        this.f10865N = parcel.readString();
        this.f10866O = parcel.readString();
        this.f10872U = parcel.createStringArray();
        this.f10867P = parcel.readString();
        this.f10868Q = parcel.readString();
        this.f10869R = parcel.readString();
        this.f10870S = parcel.readString();
        this.f10871T = parcel.readString();
    }
}
