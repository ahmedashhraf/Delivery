package p212io.branch.referral.util;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.util.f */
/* compiled from: Product */
public class C14198f {

    /* renamed from: a */
    private String f41801a;

    /* renamed from: b */
    private String f41802b;

    /* renamed from: c */
    private Double f41803c;

    /* renamed from: d */
    private Integer f41804d;

    /* renamed from: e */
    private String f41805e;

    /* renamed from: f */
    private String f41806f;

    /* renamed from: g */
    private C14199g f41807g;

    public C14198f() {
    }

    /* renamed from: a */
    public void mo44873a(Double d) {
        this.f41803c = d;
    }

    /* renamed from: b */
    public void mo44877b(String str) {
        this.f41802b = str;
    }

    /* renamed from: c */
    public void mo44879c(String str) {
        this.f41801a = str;
    }

    /* renamed from: d */
    public Double mo44880d() {
        return this.f41803c;
    }

    /* renamed from: e */
    public JSONObject mo44882e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sku", this.f41801a);
            jSONObject.put("name", this.f41802b);
            jSONObject.put(C5854b.f16944z, this.f41803c);
            jSONObject.put(C5854b.f16894A, this.f41804d);
            jSONObject.put("brand", this.f41805e);
            jSONObject.put("variant", this.f41806f);
            jSONObject.put("category", this.f41807g);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: f */
    public Integer mo44883f() {
        return this.f41804d;
    }

    /* renamed from: g */
    public String mo44884g() {
        return this.f41801a;
    }

    /* renamed from: h */
    public String mo44885h() {
        return this.f41806f;
    }

    public C14198f(String str, String str2, Double d, Integer num, String str3, String str4, C14199g gVar) {
        this.f41801a = str;
        this.f41802b = str2;
        this.f41803c = d;
        this.f41804d = num;
        this.f41805e = str3;
        this.f41806f = str4;
        this.f41807g = gVar;
    }

    /* renamed from: a */
    public void mo44874a(Integer num) {
        this.f41804d = num;
    }

    /* renamed from: b */
    public C14199g mo44876b() {
        return this.f41807g;
    }

    /* renamed from: c */
    public String mo44878c() {
        return this.f41802b;
    }

    /* renamed from: d */
    public void mo44881d(String str) {
        this.f41806f = str;
    }

    /* renamed from: a */
    public String mo44871a() {
        return this.f41805e;
    }

    /* renamed from: a */
    public void mo44875a(String str) {
        this.f41805e = str;
    }

    /* renamed from: a */
    public void mo44872a(C14199g gVar) {
        this.f41807g = gVar;
    }
}
