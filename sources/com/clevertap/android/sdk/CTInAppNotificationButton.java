package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mrsool.utils.webservice.C11687c;
import org.json.JSONException;
import org.json.JSONObject;

class CTInAppNotificationButton implements Parcelable {
    public static final Creator<CTInAppNotificationButton> CREATOR = new C3036a();

    /* renamed from: N */
    private String f10813N;

    /* renamed from: O */
    private String f10814O;

    /* renamed from: P */
    private JSONObject f10815P;

    /* renamed from: Q */
    private String f10816Q;

    /* renamed from: R */
    private String f10817R;

    /* renamed from: S */
    private String f10818S;

    /* renamed from: a */
    private String f10819a;

    /* renamed from: b */
    private String f10820b;

    /* renamed from: com.clevertap.android.sdk.CTInAppNotificationButton$a */
    static class C3036a implements Creator<CTInAppNotificationButton> {
        C3036a() {
        }

        public CTInAppNotificationButton createFromParcel(Parcel parcel) {
            return new CTInAppNotificationButton(parcel);
        }

        public CTInAppNotificationButton[] newArray(int i) {
            return new CTInAppNotificationButton[i];
        }
    }

    CTInAppNotificationButton() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo11964a() {
        return this.f10814O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo11966b() {
        return this.f10813N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo11969c(String str) {
        this.f10813N = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo11970d(String str) {
        this.f10817R = str;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11972e(String str) {
        this.f10818S = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo11973f(String str) {
        this.f10816Q = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo11974g(String str) {
        this.f10819a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo11975h(String str) {
        this.f10820b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public String mo11976i() {
        return this.f10818S;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo11977j() {
        return this.f10816Q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public JSONObject mo11978k() {
        return this.f10815P;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public String mo11979l() {
        return this.f10819a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public String mo11980m() {
        return this.f10820b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10819a);
        parcel.writeString(this.f10820b);
        parcel.writeString(this.f10813N);
        parcel.writeString(this.f10814O);
        parcel.writeString(this.f10817R);
        parcel.writeString(this.f10818S);
        if (this.f10815P == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10815P.toString());
        }
        parcel.writeString(this.f10816Q);
    }

    protected CTInAppNotificationButton(Parcel parcel) {
        this.f10819a = parcel.readString();
        this.f10820b = parcel.readString();
        this.f10813N = parcel.readString();
        this.f10814O = parcel.readString();
        this.f10817R = parcel.readString();
        this.f10818S = parcel.readString();
        try {
            this.f10815P = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.f10816Q = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11965a(String str) {
        this.f10814O = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11967b(JSONObject jSONObject) {
        this.f10815P = jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo11968c() {
        return this.f10817R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CTInAppNotificationButton mo11963a(JSONObject jSONObject) {
        String str = "android";
        String str2 = "actions";
        String str3 = C11687c.f33842u0;
        String str4 = "border";
        String str5 = "bg";
        String str6 = "color";
        String str7 = "text";
        try {
            this.f10815P = jSONObject;
            String str8 = "";
            this.f10819a = jSONObject.has(str7) ? jSONObject.getString(str7) : str8;
            this.f10820b = jSONObject.has(str6) ? jSONObject.getString(str6) : "#0000FF";
            String str9 = "#FFFFFF";
            this.f10813N = jSONObject.has(str5) ? jSONObject.getString(str5) : str9;
            if (jSONObject.has(str4)) {
                str9 = jSONObject.getString(str4);
            }
            this.f10817R = str9;
            this.f10818S = jSONObject.has(str3) ? jSONObject.getString(str3) : str8;
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 != null) {
                if (jSONObject2.has(str)) {
                    str8 = jSONObject2.getString(str);
                }
                if (!str8.isEmpty()) {
                    this.f10814O = str8;
                }
            }
        } catch (JSONException unused) {
            this.f10816Q = "Invalid JSON";
        }
        return this;
    }
}
