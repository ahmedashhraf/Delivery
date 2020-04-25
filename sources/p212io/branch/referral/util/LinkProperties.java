package p212io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONObject;
import p212io.branch.referral.C6009d;

/* renamed from: io.branch.referral.util.LinkProperties */
public class LinkProperties implements Parcelable {
    public static final Creator CREATOR = new C14191a();

    /* renamed from: N */
    private String f41771N;

    /* renamed from: O */
    private String f41772O;

    /* renamed from: P */
    private int f41773P;

    /* renamed from: Q */
    private final HashMap<String, String> f41774Q;

    /* renamed from: R */
    private String f41775R;

    /* renamed from: S */
    private String f41776S;

    /* renamed from: a */
    private final ArrayList<String> f41777a;

    /* renamed from: b */
    private String f41778b;

    /* renamed from: io.branch.referral.util.LinkProperties$a */
    static class C14191a implements Creator {
        C14191a() {
        }

        public LinkProperties createFromParcel(Parcel parcel) {
            return new LinkProperties(parcel, null);
        }

        public LinkProperties[] newArray(int i) {
            return new LinkProperties[i];
        }
    }

    /* synthetic */ LinkProperties(Parcel parcel, C14191a aVar) {
        this(parcel);
    }

    /* renamed from: n */
    public static LinkProperties m61376n() {
        String str = "~tags";
        String str2 = "$match_duration";
        String str3 = "~duration";
        String str4 = "~campaign";
        String str5 = "~stage";
        String str6 = "~feature";
        String str7 = "~channel";
        String str8 = "+clicked_branch_link";
        C6009d J = C6009d.m27463J();
        if (J == null || J.mo24819m() == null) {
            return null;
        }
        JSONObject m = J.mo24819m();
        try {
            if (!m.has(str8) || !m.getBoolean(str8)) {
                return null;
            }
            LinkProperties linkProperties = new LinkProperties();
            try {
                if (m.has(str7)) {
                    linkProperties.mo44826e(m.getString(str7));
                }
                if (m.has(str6)) {
                    linkProperties.mo44827f(m.getString(str6));
                }
                if (m.has(str5)) {
                    linkProperties.mo44828g(m.getString(str5));
                }
                if (m.has(str4)) {
                    linkProperties.mo44824d(m.getString(str4));
                }
                if (m.has(str3)) {
                    linkProperties.mo44817a(m.getInt(str3));
                }
                if (m.has(str2)) {
                    linkProperties.mo44817a(m.getInt(str2));
                }
                if (m.has(str)) {
                    JSONArray jSONArray = m.getJSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        linkProperties.mo44818a(jSONArray.getString(i));
                    }
                }
                Iterator keys = m.keys();
                while (keys.hasNext()) {
                    String str9 = (String) keys.next();
                    if (str9.startsWith("$")) {
                        linkProperties.mo44819a(str9, m.getString(str9));
                    }
                }
            } catch (Exception unused) {
            }
            return linkProperties;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public LinkProperties mo44818a(String str) {
        this.f41777a.add(str);
        return this;
    }

    /* renamed from: b */
    public String mo44821b() {
        return this.f41776S;
    }

    /* renamed from: c */
    public LinkProperties mo44822c(String str) {
        this.f41771N = str;
        return this;
    }

    /* renamed from: d */
    public LinkProperties mo44824d(String str) {
        this.f41776S = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public LinkProperties mo44826e(String str) {
        this.f41775R = str;
        return this;
    }

    /* renamed from: f */
    public LinkProperties mo44827f(String str) {
        this.f41778b = str;
        return this;
    }

    /* renamed from: g */
    public LinkProperties mo44828g(String str) {
        this.f41772O = str;
        return this;
    }

    /* renamed from: i */
    public HashMap<String, String> mo44829i() {
        return this.f41774Q;
    }

    /* renamed from: j */
    public String mo44830j() {
        return this.f41778b;
    }

    /* renamed from: k */
    public int mo44831k() {
        return this.f41773P;
    }

    /* renamed from: l */
    public String mo44832l() {
        return this.f41772O;
    }

    /* renamed from: m */
    public ArrayList<String> mo44833m() {
        return this.f41777a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41778b);
        parcel.writeString(this.f41771N);
        parcel.writeString(this.f41772O);
        parcel.writeString(this.f41775R);
        parcel.writeString(this.f41776S);
        parcel.writeInt(this.f41773P);
        parcel.writeSerializable(this.f41777a);
        parcel.writeInt(this.f41774Q.size());
        for (Entry entry : this.f41774Q.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public LinkProperties() {
        this.f41777a = new ArrayList<>();
        this.f41778b = "Share";
        this.f41774Q = new HashMap<>();
        String str = "";
        this.f41771N = str;
        this.f41772O = str;
        this.f41773P = 0;
        this.f41775R = str;
        this.f41776S = str;
    }

    /* renamed from: a */
    public LinkProperties mo44819a(String str, String str2) {
        this.f41774Q.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public String mo44823c() {
        return this.f41775R;
    }

    /* renamed from: a */
    public LinkProperties mo44817a(int i) {
        this.f41773P = i;
        return this;
    }

    /* renamed from: a */
    public String mo44820a() {
        return this.f41771N;
    }

    private LinkProperties(Parcel parcel) {
        this();
        this.f41778b = parcel.readString();
        this.f41771N = parcel.readString();
        this.f41772O = parcel.readString();
        this.f41775R = parcel.readString();
        this.f41776S = parcel.readString();
        this.f41773P = parcel.readInt();
        this.f41777a.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f41774Q.put(parcel.readString(), parcel.readString());
        }
    }
}
