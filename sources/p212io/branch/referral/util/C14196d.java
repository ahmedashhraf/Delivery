package p212io.branch.referral.util;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.branch.referral.util.d */
/* compiled from: CommerceEvent */
public class C14196d {

    /* renamed from: a */
    private Double f41793a;

    /* renamed from: b */
    private C14197e f41794b;

    /* renamed from: c */
    private String f41795c;

    /* renamed from: d */
    private Double f41796d;

    /* renamed from: e */
    private Double f41797e;

    /* renamed from: f */
    private String f41798f;

    /* renamed from: g */
    private String f41799g;

    /* renamed from: h */
    private List<C14198f> f41800h;

    public C14196d() {
    }

    /* renamed from: a */
    public void mo44855a(Double d) {
        this.f41793a = d;
    }

    /* renamed from: b */
    public void mo44859b(Double d) {
        this.f41796d = d;
    }

    /* renamed from: c */
    public void mo44863c(String str) {
        this.f41795c = str;
    }

    /* renamed from: d */
    public C14197e mo44864d() {
        return this.f41794b;
    }

    /* renamed from: e */
    public List<JSONObject> mo44865e() {
        if (this.f41800h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C14198f e : this.f41800h) {
            arrayList.add(e.mo44882e());
        }
        return arrayList;
    }

    /* renamed from: f */
    public Double mo44866f() {
        return this.f41793a;
    }

    /* renamed from: g */
    public Double mo44867g() {
        return this.f41796d;
    }

    /* renamed from: h */
    public Double mo44868h() {
        return this.f41797e;
    }

    /* renamed from: i */
    public String mo44869i() {
        return this.f41795c;
    }

    public C14196d(Double d, C14197e eVar, String str, Double d2, Double d3, String str2, String str3, List<C14198f> list) {
        this.f41793a = d;
        this.f41794b = eVar;
        this.f41795c = str;
        this.f41796d = d2;
        this.f41797e = d3;
        this.f41798f = str2;
        this.f41799g = str3;
        this.f41800h = list;
    }

    /* renamed from: a */
    public void mo44853a(C14197e eVar) {
        this.f41794b = eVar;
    }

    /* renamed from: b */
    public void mo44860b(String str) {
        this.f41798f = str;
    }

    /* renamed from: c */
    public void mo44862c(Double d) {
        this.f41797e = d;
    }

    /* renamed from: a */
    public String mo44852a() {
        return this.f41799g;
    }

    /* renamed from: b */
    public JSONObject mo44858b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("revenue", this.f41793a);
            jSONObject.put(C5854b.f16923e, this.f41794b);
            jSONObject.put(C5854b.f16897D, this.f41795c);
            jSONObject.put(C5854b.f16896C, this.f41796d);
            jSONObject.put(C5854b.f16900G, this.f41797e);
            jSONObject.put(C5854b.f16924f, this.f41798f);
            jSONObject.put("affiliation", this.f41799g);
            if (mo44865e() != null) {
                jSONObject.put("products", mo44865e());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: c */
    public String mo44861c() {
        return this.f41798f;
    }

    /* renamed from: a */
    public void mo44856a(String str) {
        this.f41799g = str;
    }

    /* renamed from: a */
    public void mo44857a(List<C14198f> list) {
        this.f41800h = list;
    }

    /* renamed from: a */
    public void mo44854a(C14198f fVar) {
        if (this.f41800h == null) {
            this.f41800h = new ArrayList();
        }
        this.f41800h.add(fVar);
    }

    public C14196d(Double d, C14197e eVar, String str, Double d2, Double d3, String str2, String str3, C14198f fVar) {
        this.f41793a = d;
        this.f41794b = eVar;
        this.f41795c = str;
        this.f41796d = d2;
        this.f41797e = d3;
        this.f41798f = str2;
        this.f41799g = str3;
        this.f41800h = new ArrayList();
        this.f41800h.add(fVar);
    }
}
