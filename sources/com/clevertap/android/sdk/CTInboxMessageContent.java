package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class CTInboxMessageContent implements Parcelable {
    public static final Creator<CTInboxMessageContent> CREATOR = new C3042a();

    /* renamed from: N */
    private String f10851N;

    /* renamed from: O */
    private String f10852O;

    /* renamed from: P */
    private String f10853P;

    /* renamed from: Q */
    private Boolean f10854Q;

    /* renamed from: R */
    private Boolean f10855R;

    /* renamed from: S */
    private String f10856S;

    /* renamed from: T */
    private String f10857T;

    /* renamed from: U */
    private JSONArray f10858U;

    /* renamed from: V */
    private String f10859V;

    /* renamed from: W */
    private String f10860W;

    /* renamed from: a */
    private String f10861a;

    /* renamed from: b */
    private String f10862b;

    /* renamed from: com.clevertap.android.sdk.CTInboxMessageContent$a */
    static class C3042a implements Creator<CTInboxMessageContent> {
        C3042a() {
        }

        public CTInboxMessageContent createFromParcel(Parcel parcel) {
            return new CTInboxMessageContent(parcel);
        }

        public CTInboxMessageContent[] newArray(int i) {
            return new CTInboxMessageContent[i];
        }
    }

    CTInboxMessageContent() {
    }

    /* renamed from: a */
    public String mo12033a() {
        return this.f10856S;
    }

    /* renamed from: b */
    public String mo12038b(JSONObject jSONObject) {
        String str = "color";
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getString(str) : "";
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link Text Color with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* renamed from: c */
    public String mo12039c() {
        return this.f10857T;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo12043d(String str) {
        this.f10853P = str;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo12046e(String str) {
        this.f10851N = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo12048f(String str) {
        this.f10852O = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public CTInboxMessageContent mo12049g(JSONObject jSONObject) {
        String str = "hasLinks";
        String str2 = "poster";
        String str3 = C5854b.f16922d;
        String str4 = "hasUrl";
        String str5 = "action";
        String str6 = "media";
        String str7 = C14330v.f42312a0;
        String str8 = "message";
        String str9 = "title";
        try {
            JSONArray jSONArray = null;
            JSONObject jSONObject2 = jSONObject.has(str9) ? jSONObject.getJSONObject(str9) : null;
            String str10 = "color";
            String str11 = "text";
            String str12 = "";
            if (jSONObject2 != null) {
                this.f10861a = jSONObject2.has(str11) ? jSONObject2.getString(str11) : str12;
                this.f10862b = jSONObject2.has(str10) ? jSONObject2.getString(str10) : str12;
            }
            JSONObject jSONObject3 = jSONObject.has(str8) ? jSONObject.getJSONObject(str8) : null;
            if (jSONObject3 != null) {
                this.f10851N = jSONObject3.has(str11) ? jSONObject3.getString(str11) : str12;
                this.f10852O = jSONObject3.has(str10) ? jSONObject3.getString(str10) : str12;
            }
            JSONObject jSONObject4 = jSONObject.has(str7) ? jSONObject.getJSONObject(str7) : null;
            String str13 = "url";
            if (jSONObject4 != null) {
                this.f10857T = jSONObject4.has(str13) ? jSONObject4.getString(str13) : str12;
            }
            JSONObject jSONObject5 = jSONObject.has(str6) ? jSONObject.getJSONObject(str6) : null;
            if (jSONObject5 != null) {
                this.f10853P = jSONObject5.has(str13) ? jSONObject5.getString(str13) : str12;
                this.f10859V = jSONObject5.has(str3) ? jSONObject5.getString(str3) : str12;
                this.f10860W = jSONObject5.has(str2) ? jSONObject5.getString(str2) : str12;
            }
            JSONObject jSONObject6 = jSONObject.has(str5) ? jSONObject.getJSONObject(str5) : null;
            if (jSONObject6 != null) {
                boolean z = false;
                this.f10854Q = Boolean.valueOf(jSONObject6.has(str4) && jSONObject6.getBoolean(str4));
                if (jSONObject6.has(str) && jSONObject6.getBoolean(str)) {
                    z = true;
                }
                this.f10855R = Boolean.valueOf(z);
                JSONObject jSONObject7 = jSONObject6.has(str13) ? jSONObject6.getJSONObject(str13) : null;
                if (jSONObject7 != null && this.f10854Q.booleanValue()) {
                    JSONObject jSONObject8 = jSONObject7.has("android") ? jSONObject7.getJSONObject("android") : null;
                    if (jSONObject8 != null) {
                        if (jSONObject8.has(str11)) {
                            str12 = jSONObject8.getString(str11);
                        }
                        this.f10856S = str12;
                    }
                }
                if (jSONObject7 != null && this.f10855R.booleanValue()) {
                    if (jSONObject6.has("links")) {
                        jSONArray = jSONObject6.getJSONArray("links");
                    }
                    this.f10858U = jSONArray;
                }
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to init CTInboxMessageContent with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo12051h(String str) {
        this.f10861a = str;
    }

    /* renamed from: i */
    public JSONArray mo12052i() {
        return this.f10858U;
    }

    /* renamed from: j */
    public String mo12054j() {
        return this.f10853P;
    }

    /* renamed from: k */
    public String mo12055k() {
        return this.f10851N;
    }

    /* renamed from: l */
    public String mo12056l() {
        return this.f10852O;
    }

    /* renamed from: m */
    public String mo12057m() {
        return this.f10860W;
    }

    /* renamed from: n */
    public String mo12058n() {
        return this.f10861a;
    }

    /* renamed from: o */
    public String mo12059o() {
        return this.f10862b;
    }

    /* renamed from: p */
    public boolean mo12060p() {
        String b = mo12037b();
        return (b == null || this.f10853P == null || !b.startsWith("audio")) ? false : true;
    }

    /* renamed from: q */
    public boolean mo12061q() {
        String b = mo12037b();
        return (b == null || this.f10853P == null || !b.equals("image/gif")) ? false : true;
    }

    /* renamed from: r */
    public boolean mo12062r() {
        String b = mo12037b();
        return b != null && this.f10853P != null && b.startsWith("image") && !b.equals("image/gif");
    }

    /* renamed from: s */
    public boolean mo12063s() {
        String b = mo12037b();
        return (b == null || this.f10853P == null || !b.startsWith("video")) ? false : true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10861a);
        parcel.writeString(this.f10862b);
        parcel.writeString(this.f10851N);
        parcel.writeString(this.f10852O);
        parcel.writeString(this.f10853P);
        parcel.writeByte(this.f10854Q.booleanValue() ? (byte) 1 : 0);
        parcel.writeByte(this.f10855R.booleanValue() ? (byte) 1 : 0);
        parcel.writeString(this.f10856S);
        parcel.writeString(this.f10857T);
        if (this.f10858U == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10858U.toString());
        }
        parcel.writeString(this.f10859V);
        parcel.writeString(this.f10860W);
    }

    protected CTInboxMessageContent(Parcel parcel) {
        this.f10861a = parcel.readString();
        this.f10862b = parcel.readString();
        this.f10851N = parcel.readString();
        this.f10852O = parcel.readString();
        this.f10853P = parcel.readString();
        boolean z = true;
        this.f10854Q = Boolean.valueOf(parcel.readByte() != 0);
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f10855R = Boolean.valueOf(z);
        this.f10856S = parcel.readString();
        this.f10857T = parcel.readString();
        try {
            this.f10858U = parcel.readByte() == 0 ? null : new JSONArray(parcel.readString());
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to init CTInboxMessageContent with Parcel - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
        }
        this.f10859V = parcel.readString();
        this.f10860W = parcel.readString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12035a(String str) {
        this.f10856S = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12041c(String str) {
        this.f10857T = str;
    }

    /* renamed from: d */
    public String mo12042d(JSONObject jSONObject) {
        String str = "text";
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getString(str) : "";
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link Text with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* renamed from: e */
    public String mo12045e(JSONObject jSONObject) {
        String str = "text";
        String str2 = "android";
        String str3 = "url";
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.has(str3) ? jSONObject.getJSONObject(str3) : null;
            if (jSONObject2 == null) {
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.has(str2) ? jSONObject2.getJSONObject(str2) : null;
            String str4 = "";
            if (jSONObject3 != null) {
                if (jSONObject3.has(str)) {
                    str4 = jSONObject3.getString(str);
                }
            }
            return str4;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link URL with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* renamed from: f */
    public String mo12047f(JSONObject jSONObject) {
        String str = "type";
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getString(str) : "";
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link Type with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo12053i(String str) {
        this.f10862b = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12036a(JSONArray jSONArray) {
        this.f10858U = jSONArray;
    }

    /* renamed from: b */
    public String mo12037b() {
        return this.f10859V;
    }

    /* renamed from: c */
    public String mo12040c(JSONObject jSONObject) {
        String str = "text";
        String str2 = "copyText";
        String str3 = "";
        if (jSONObject == null) {
            return str3;
        }
        try {
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 != null && jSONObject2.has(str)) {
                str3 = jSONObject2.getString(str);
            }
            return str3;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link Text with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return str3;
        }
    }

    /* renamed from: a */
    public String mo12034a(JSONObject jSONObject) {
        String str = "bg";
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.has(str) ? jSONObject.getString(str) : "";
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to get Link Text Color with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
            return null;
        }
    }

    /* renamed from: g */
    public void mo12050g(String str) {
        this.f10860W = str;
    }
}
