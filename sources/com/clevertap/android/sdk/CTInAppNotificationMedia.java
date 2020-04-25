package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInAppNotificationMedia implements Parcelable {
    public static final Creator<CTInAppNotificationMedia> CREATOR = new C3037a();

    /* renamed from: N */
    String f10821N;

    /* renamed from: O */
    int f10822O;

    /* renamed from: a */
    String f10823a;

    /* renamed from: b */
    String f10824b;

    /* renamed from: com.clevertap.android.sdk.CTInAppNotificationMedia$a */
    static class C3037a implements Creator<CTInAppNotificationMedia> {
        C3037a() {
        }

        public CTInAppNotificationMedia createFromParcel(Parcel parcel) {
            return new CTInAppNotificationMedia(parcel, null);
        }

        public CTInAppNotificationMedia[] newArray(int i) {
            return new CTInAppNotificationMedia[i];
        }
    }

    /* synthetic */ CTInAppNotificationMedia(Parcel parcel, C3037a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CTInAppNotificationMedia mo11984a(JSONObject jSONObject, int i) {
        String str = "key";
        String str2 = "url";
        String str3 = C5854b.f16922d;
        this.f10822O = i;
        try {
            String str4 = "";
            this.f10824b = jSONObject.has(str3) ? jSONObject.getString(str3) : str4;
            if (jSONObject.has(str2)) {
                str4 = jSONObject.getString(str2);
            }
            if (!str4.isEmpty()) {
                if (this.f10824b.startsWith("image")) {
                    this.f10823a = str4;
                    if (jSONObject.has(str)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(UUID.randomUUID().toString());
                        sb.append(jSONObject.getString(str));
                        this.f10821N = sb.toString();
                    } else {
                        this.f10821N = UUID.randomUUID().toString();
                    }
                } else {
                    this.f10823a = str4;
                }
            }
        } catch (JSONException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing Media JSONObject - ");
            sb2.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb2.toString());
        }
        if (this.f10824b.isEmpty()) {
            return null;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo11987b() {
        return this.f10824b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo11988c() {
        return this.f10823a;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public int mo11990i() {
        return this.f10822O;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo11991j() {
        String b = mo11987b();
        return (b == null || this.f10823a == null || !b.startsWith("audio")) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo11992k() {
        String b = mo11987b();
        return (b == null || this.f10823a == null || !b.equals("image/gif")) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo11993l() {
        String b = mo11987b();
        return b != null && this.f10823a != null && b.startsWith("image") && !b.equals("image/gif");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo11994m() {
        String b = mo11987b();
        return (b == null || this.f10823a == null || !b.startsWith("video")) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10823a);
        parcel.writeString(this.f10824b);
        parcel.writeString(this.f10821N);
        parcel.writeInt(this.f10822O);
    }

    CTInAppNotificationMedia() {
    }

    private CTInAppNotificationMedia(Parcel parcel) {
        this.f10823a = parcel.readString();
        this.f10824b = parcel.readString();
        this.f10821N = parcel.readString();
        this.f10822O = parcel.readInt();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo11985a() {
        return this.f10821N;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11986a(String str) {
        this.f10823a = str;
    }
}
