package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.C0770p;
import com.facebook.appevents.AppEventsConstants;
import com.instabug.library.model.State;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CTInboxMessage implements Parcelable {
    public static final Creator<CTInboxMessage> CREATOR = new C3041a();

    /* renamed from: N */
    private String f10834N;

    /* renamed from: O */
    private String f10835O;

    /* renamed from: P */
    private long f10836P;

    /* renamed from: Q */
    private long f10837Q;

    /* renamed from: R */
    private String f10838R;

    /* renamed from: S */
    private JSONObject f10839S;

    /* renamed from: T */
    private JSONObject f10840T;

    /* renamed from: U */
    private boolean f10841U;

    /* renamed from: V */
    private C3119j0 f10842V;

    /* renamed from: W */
    private List<String> f10843W;

    /* renamed from: X */
    private String f10844X;

    /* renamed from: Y */
    private ArrayList<CTInboxMessageContent> f10845Y;

    /* renamed from: Z */
    private String f10846Z;

    /* renamed from: a */
    private String f10847a;

    /* renamed from: a0 */
    private String f10848a0;

    /* renamed from: b */
    private String f10849b;

    /* renamed from: b0 */
    private JSONObject f10850b0;

    /* renamed from: com.clevertap.android.sdk.CTInboxMessage$a */
    static class C3041a implements Creator<CTInboxMessage> {
        C3041a() {
        }

        public CTInboxMessage createFromParcel(Parcel parcel) {
            return new CTInboxMessage(parcel, null);
        }

        public CTInboxMessage[] newArray(int i) {
            return new CTInboxMessage[i];
        }
    }

    /* synthetic */ CTInboxMessage(Parcel parcel, C3041a aVar) {
        this(parcel);
    }

    /* renamed from: x */
    public static Creator<CTInboxMessage> m14561x() {
        return CREATOR;
    }

    /* renamed from: a */
    public String mo12010a() {
        return this.f10835O;
    }

    /* renamed from: b */
    public String mo12012b() {
        return this.f10844X;
    }

    /* renamed from: c */
    public String mo12013c() {
        return this.f10849b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public String mo12015i() {
        return this.f10848a0;
    }

    /* renamed from: j */
    public ArrayList<String> mo12016j() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it = mo12022p().iterator();
        while (it.hasNext()) {
            arrayList.add(((CTInboxMessageContent) it.next()).mo12054j());
        }
        return arrayList;
    }

    /* renamed from: k */
    public JSONObject mo12017k() {
        return this.f10840T;
    }

    /* renamed from: l */
    public JSONObject mo12018l() {
        return this.f10839S;
    }

    /* renamed from: m */
    public long mo12019m() {
        return this.f10836P;
    }

    /* renamed from: n */
    public long mo12020n() {
        return this.f10837Q;
    }

    /* renamed from: o */
    public String mo12021o() {
        return this.f10834N;
    }

    /* renamed from: p */
    public ArrayList<CTInboxMessageContent> mo12022p() {
        return this.f10845Y;
    }

    /* renamed from: q */
    public String mo12023q() {
        return this.f10838R;
    }

    /* renamed from: r */
    public String mo12024r() {
        return this.f10846Z;
    }

    /* renamed from: s */
    public List<String> mo12025s() {
        return this.f10843W;
    }

    /* renamed from: t */
    public String mo12026t() {
        return this.f10847a;
    }

    /* renamed from: u */
    public C3119j0 mo12027u() {
        return this.f10842V;
    }

    /* renamed from: v */
    public JSONObject mo12028v() {
        JSONObject jSONObject = this.f10850b0;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: w */
    public boolean mo12029w() {
        return this.f10841U;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10847a);
        parcel.writeString(this.f10849b);
        parcel.writeString(this.f10834N);
        parcel.writeString(this.f10835O);
        parcel.writeLong(this.f10836P);
        parcel.writeLong(this.f10837Q);
        parcel.writeString(this.f10838R);
        if (this.f10839S == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10839S.toString());
        }
        if (this.f10840T == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeString(this.f10840T.toString());
        }
        parcel.writeByte(this.f10841U ? (byte) 1 : 0);
        parcel.writeValue(this.f10842V);
        if (this.f10843W == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeList(this.f10843W);
        }
        parcel.writeString(this.f10844X);
        if (this.f10845Y == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeList(this.f10845Y);
        }
        parcel.writeString(this.f10846Z);
        parcel.writeString(this.f10848a0);
        if (this.f10850b0 == null) {
            parcel.writeByte(0);
            return;
        }
        parcel.writeByte(1);
        parcel.writeString(this.f10850b0.toString());
    }

    CTInboxMessage(JSONObject jSONObject) {
        String str = "content";
        String str2 = "bg";
        String str3 = "type";
        String str4 = "wzrkParams";
        String str5 = C0770p.f3520e0;
        String str6 = State.KEY_TAGS;
        String str7 = "isRead";
        String str8 = "wzrk_ttl";
        String str9 = "date";
        String str10 = "wzrk_id";
        String str11 = "id";
        this.f10843W = new ArrayList();
        this.f10845Y = new ArrayList<>();
        this.f10839S = jSONObject;
        try {
            this.f10838R = jSONObject.has(str11) ? jSONObject.getString(str11) : AppEventsConstants.EVENT_PARAM_VALUE_NO;
            this.f10848a0 = jSONObject.has(str10) ? jSONObject.getString(str10) : "0_0";
            this.f10836P = jSONObject.has(str9) ? jSONObject.getLong(str9) : System.currentTimeMillis() / 1000;
            this.f10837Q = jSONObject.has(str8) ? jSONObject.getLong(str8) : System.currentTimeMillis() + 86400000;
            this.f10841U = jSONObject.has(str7) && jSONObject.getBoolean(str7);
            JSONObject jSONObject2 = null;
            JSONArray jSONArray = jSONObject.has(str6) ? jSONObject.getJSONArray(str6) : null;
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f10843W.add(jSONArray.getString(i));
                }
            }
            JSONObject jSONObject3 = jSONObject.has(str5) ? jSONObject.getJSONObject(str5) : null;
            if (jSONObject3 != null) {
                String str12 = "";
                this.f10842V = jSONObject3.has(str3) ? C3119j0.m14982b(jSONObject3.getString(str3)) : C3119j0.m14982b(str12);
                this.f10844X = jSONObject3.has(str2) ? jSONObject3.getString(str2) : str12;
                JSONArray jSONArray2 = jSONObject3.has(str) ? jSONObject3.getJSONArray(str) : null;
                if (jSONArray2 != null) {
                    for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                        this.f10845Y.add(new CTInboxMessageContent().mo12049g(jSONArray2.getJSONObject(i2)));
                    }
                }
                if (jSONObject3.has(State.KEY_ORIENTATION)) {
                    str12 = jSONObject3.getString(State.KEY_ORIENTATION);
                }
                this.f10846Z = str12;
            }
            if (jSONObject.has(str4)) {
                jSONObject2 = jSONObject.getJSONObject(str4);
            }
            this.f10850b0 = jSONObject2;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to init CTInboxMessage with JSON - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12011a(boolean z) {
        this.f10841U = z;
    }

    private CTInboxMessage(Parcel parcel) {
        this.f10843W = new ArrayList();
        this.f10845Y = new ArrayList<>();
        try {
            this.f10847a = parcel.readString();
            this.f10849b = parcel.readString();
            this.f10834N = parcel.readString();
            this.f10835O = parcel.readString();
            this.f10836P = parcel.readLong();
            this.f10837Q = parcel.readLong();
            this.f10838R = parcel.readString();
            JSONObject jSONObject = null;
            this.f10839S = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.f10840T = parcel.readByte() == 0 ? null : new JSONObject(parcel.readString());
            this.f10841U = parcel.readByte() != 0;
            this.f10842V = (C3119j0) parcel.readValue(C3119j0.class.getClassLoader());
            if (parcel.readByte() == 1) {
                this.f10843W = new ArrayList();
                parcel.readList(this.f10843W, String.class.getClassLoader());
            } else {
                this.f10843W = null;
            }
            this.f10844X = parcel.readString();
            if (parcel.readByte() == 1) {
                this.f10845Y = new ArrayList<>();
                parcel.readList(this.f10845Y, CTInboxMessageContent.class.getClassLoader());
            } else {
                this.f10845Y = null;
            }
            this.f10846Z = parcel.readString();
            this.f10848a0 = parcel.readString();
            if (parcel.readByte() != 0) {
                jSONObject = new JSONObject(parcel.readString());
            }
            this.f10850b0 = jSONObject;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to parse CTInboxMessage from parcel - ");
            sb.append(e.getLocalizedMessage());
            C3111h1.m14938f(sb.toString());
        }
    }
}
