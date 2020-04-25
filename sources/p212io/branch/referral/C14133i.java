package p212io.branch.referral;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14170b;

/* renamed from: io.branch.referral.i */
/* compiled from: BranchLinkData */
class C14133i extends JSONObject {

    /* renamed from: a */
    private Collection<String> f41575a;

    /* renamed from: b */
    private String f41576b;

    /* renamed from: c */
    private int f41577c;

    /* renamed from: d */
    private String f41578d;

    /* renamed from: e */
    private String f41579e;

    /* renamed from: f */
    private String f41580f;

    /* renamed from: g */
    private String f41581g;

    /* renamed from: h */
    private JSONObject f41582h;

    /* renamed from: i */
    private int f41583i;

    /* renamed from: a */
    public void mo44667a(Collection<String> collection) throws JSONException {
        if (collection != null) {
            this.f41575a = collection;
            JSONArray jSONArray = new JSONArray();
            for (String put : collection) {
                jSONArray.put(put);
            }
            put(C14170b.Tags.mo44766d(), jSONArray);
        }
    }

    /* renamed from: b */
    public void mo44670b(int i) throws JSONException {
        if (i != 0) {
            this.f41577c = i;
            put(C14170b.Type.mo44766d(), i);
        }
    }

    /* renamed from: c */
    public void mo44673c(String str) throws JSONException {
        if (str != null) {
            this.f41578d = str;
            put(C14170b.Channel.mo44766d(), str);
        }
    }

    /* renamed from: d */
    public int mo44674d() {
        return this.f41583i;
    }

    /* renamed from: e */
    public String mo44676e() {
        return this.f41579e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14133i.class != obj.getClass()) {
            return false;
        }
        C14133i iVar = (C14133i) obj;
        String str = this.f41576b;
        if (str == null) {
            if (iVar.f41576b != null) {
                return false;
            }
        } else if (!str.equals(iVar.f41576b)) {
            return false;
        }
        String str2 = this.f41578d;
        if (str2 == null) {
            if (iVar.f41578d != null) {
                return false;
            }
        } else if (!str2.equals(iVar.f41578d)) {
            return false;
        }
        String str3 = this.f41579e;
        if (str3 == null) {
            if (iVar.f41579e != null) {
                return false;
            }
        } else if (!str3.equals(iVar.f41579e)) {
            return false;
        }
        JSONObject jSONObject = this.f41582h;
        if (jSONObject == null) {
            if (iVar.f41582h != null) {
                return false;
            }
        } else if (!jSONObject.equals(iVar.f41582h)) {
            return false;
        }
        String str4 = this.f41580f;
        if (str4 == null) {
            if (iVar.f41580f != null) {
                return false;
            }
        } else if (!str4.equals(iVar.f41580f)) {
            return false;
        }
        String str5 = this.f41581g;
        if (str5 == null) {
            if (iVar.f41581g != null) {
                return false;
            }
        } else if (!str5.equals(iVar.f41581g)) {
            return false;
        }
        if (this.f41577c != iVar.f41577c || this.f41583i != iVar.f41583i) {
            return false;
        }
        Collection<String> collection = this.f41575a;
        if (collection == null) {
            if (iVar.f41575a != null) {
                return false;
            }
        } else if (!collection.toString().equals(iVar.f41575a.toString())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public JSONObject mo44679f() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = "~";
            if (!TextUtils.isEmpty(this.f41578d)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(C14170b.Channel.mo44766d());
                jSONObject.put(sb.toString(), this.f41578d);
            }
            if (!TextUtils.isEmpty(this.f41576b)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(C14170b.Alias.mo44766d());
                jSONObject.put(sb2.toString(), this.f41576b);
            }
            if (!TextUtils.isEmpty(this.f41579e)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(C14170b.Feature.mo44766d());
                jSONObject.put(sb3.toString(), this.f41579e);
            }
            if (!TextUtils.isEmpty(this.f41580f)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(C14170b.Stage.mo44766d());
                jSONObject.put(sb4.toString(), this.f41580f);
            }
            if (!TextUtils.isEmpty(this.f41581g)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(C14170b.Campaign.mo44766d());
                jSONObject.put(sb5.toString(), this.f41581g);
            }
            if (has(C14170b.Tags.mo44766d())) {
                jSONObject.put(C14170b.Tags.mo44766d(), getJSONArray(C14170b.Tags.mo44766d()));
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(C14170b.Type.mo44766d());
            jSONObject.put(sb6.toString(), this.f41577c);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(C14170b.Duration.mo44766d());
            jSONObject.put(sb7.toString(), this.f41583i);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: g */
    public JSONObject mo44680g() {
        return this.f41582h;
    }

    /* renamed from: h */
    public String mo44681h() {
        return this.f41580f;
    }

    @SuppressLint({"DefaultLocale"})
    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = (this.f41577c + 19) * 19;
        String str = this.f41576b;
        int i7 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.toLowerCase().hashCode();
        }
        int i8 = (i6 + i) * 19;
        String str2 = this.f41578d;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.toLowerCase().hashCode();
        }
        int i9 = (i8 + i2) * 19;
        String str3 = this.f41579e;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.toLowerCase().hashCode();
        }
        int i10 = (i9 + i3) * 19;
        String str4 = this.f41580f;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.toLowerCase().hashCode();
        }
        int i11 = (i10 + i4) * 19;
        String str5 = this.f41581g;
        if (str5 == null) {
            i5 = 0;
        } else {
            i5 = str5.toLowerCase().hashCode();
        }
        int i12 = (i11 + i5) * 19;
        JSONObject jSONObject = this.f41582h;
        if (jSONObject != null) {
            i7 = jSONObject.toString().toLowerCase().hashCode();
        }
        int i13 = ((i12 + i7) * 19) + this.f41583i;
        Collection<String> collection = this.f41575a;
        if (collection != null) {
            for (String lowerCase : collection) {
                i13 = (i13 * 19) + lowerCase.toLowerCase().hashCode();
            }
        }
        return i13;
    }

    /* renamed from: i */
    public Collection<String> mo44683i() {
        return this.f41575a;
    }

    /* renamed from: j */
    public int mo44684j() {
        return this.f41577c;
    }

    /* renamed from: d */
    public void mo44675d(String str) throws JSONException {
        if (str != null) {
            this.f41579e = str;
            put(C14170b.Feature.mo44766d(), str);
        }
    }

    /* renamed from: e */
    public void mo44677e(String str) throws JSONException {
        if (str != null) {
            this.f41580f = str;
            put(C14170b.Stage.mo44766d(), str);
        }
    }

    /* renamed from: b */
    public void mo44671b(String str) throws JSONException {
        if (str != null) {
            this.f41581g = str;
            put(C14170b.Campaign.mo44766d(), str);
        }
    }

    /* renamed from: c */
    public String mo44672c() {
        return this.f41578d;
    }

    /* renamed from: b */
    public String mo44669b() {
        return this.f41581g;
    }

    /* renamed from: a */
    public void mo44666a(String str) throws JSONException {
        if (str != null) {
            this.f41576b = str;
            put(C14170b.Alias.mo44766d(), str);
        }
    }

    /* renamed from: a */
    public String mo44664a() {
        return this.f41576b;
    }

    /* renamed from: a */
    public void mo44665a(int i) throws JSONException {
        if (i > 0) {
            this.f41583i = i;
            put(C14170b.Duration.mo44766d(), i);
        }
    }

    /* renamed from: a */
    public void mo44668a(JSONObject jSONObject) throws JSONException {
        this.f41582h = jSONObject;
        put(C14170b.Data.mo44766d(), jSONObject);
    }
}
