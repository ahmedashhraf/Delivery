package p212io.branch.referral;

import android.content.Context;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14170b;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6013d;
import p212io.fabric.sdk.android.services.network.C14393i;

/* renamed from: io.branch.referral.a0 */
/* compiled from: ServerRequestCreateUrl */
class C14116a0 extends C14205y {

    /* renamed from: s */
    private static final String f41501s = "https://bnc.lt/a/";

    /* renamed from: n */
    private C14133i f41502n;

    /* renamed from: o */
    private boolean f41503o = true;

    /* renamed from: p */
    private C6013d f41504p;

    /* renamed from: q */
    private boolean f41505q;

    /* renamed from: r */
    private boolean f41506r = true;

    public C14116a0(Context context, String str, int i, int i2, Collection<String> collection, String str2, String str3, String str4, String str5, JSONObject jSONObject, C6013d dVar, boolean z, boolean z2) {
        super(context, C14171c.GetURL.mo44768d());
        this.f41504p = dVar;
        this.f41503o = z;
        this.f41506r = z2;
        this.f41502n = new C14133i();
        try {
            this.f41502n.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            this.f41502n.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            this.f41502n.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                this.f41502n.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            this.f41502n.mo44670b(i);
            this.f41502n.mo44665a(i2);
            this.f41502n.mo44667a(collection);
            this.f41502n.mo44666a(str);
            this.f41502n.mo44673c(str2);
            this.f41502n.mo44675d(str3);
            this.f41502n.mo44677e(str4);
            this.f41502n.mo44671b(str5);
            this.f41502n.mo44668a(jSONObject);
            mo44635a((JSONObject) this.f41502n);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: c */
    private void m61023c(String str) {
        JSONObject f = this.f41502n.mo44679f();
        if (mo44628z() && f != null) {
            new C14188u().mo44794a(C14188u.f41744c, f, this.f41890c.mo44995r());
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        try {
            String string = o0Var.mo44721c().getString("url");
            if (this.f41504p != null) {
                this.f41504p.mo24840a(string, null);
            }
            m61023c(string);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C6013d dVar = this.f41504p;
        if (dVar != null) {
            dVar.mo24840a(null, new C14130h("Trouble creating a URL.", C14130h.f41549d));
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo44622l() {
        return false;
    }

    /* renamed from: u */
    public C14133i mo44623u() {
        return this.f41502n;
    }

    /* renamed from: v */
    public String mo44624v() {
        if (!this.f41890c.mo44935H().equals("bnc_no_value")) {
            return m61022b(this.f41890c.mo44935H());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f41501s);
        sb.append(this.f41890c.mo44977i());
        return m61022b(sb.toString());
    }

    /* renamed from: w */
    public void mo44625w() {
        C6013d dVar = this.f41504p;
        if (dVar != null) {
            dVar.mo24840a(null, new C14130h("Trouble creating a URL.", C14130h.f41552g));
        }
    }

    /* renamed from: x */
    public boolean mo44626x() {
        return this.f41503o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public boolean mo44627y() {
        return this.f41506r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public boolean mo44628z() {
        return this.f41505q;
    }

    /* renamed from: b */
    private String m61022b(String str) {
        String str2 = "?";
        try {
            String str3 = "";
            if (C6009d.m27463J().mo24822p()) {
                if (!str.contains(f41501s)) {
                    str = str.replace(new URL(str).getQuery(), str3);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains(str2) ? str3 : str2);
            str = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str4 = "&";
            if (!str.endsWith(str2)) {
                str3 = str4;
            }
            sb2.append(str3);
            str = sb2.toString();
            Collection<String> i = this.f41502n.mo44683i();
            String str5 = C14393i.f42526a;
            String str6 = "=";
            if (i != null) {
                for (String str7 : i) {
                    if (str7 != null && str7.length() > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(C14170b.Tags);
                        sb3.append(str6);
                        sb3.append(URLEncoder.encode(str7, str5));
                        sb3.append(str4);
                        str = sb3.toString();
                    }
                }
            }
            String a = this.f41502n.mo44664a();
            if (a != null && a.length() > 0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(C14170b.Alias);
                sb4.append(str6);
                sb4.append(URLEncoder.encode(a, str5));
                sb4.append(str4);
                str = sb4.toString();
            }
            String c = this.f41502n.mo44672c();
            if (c != null && c.length() > 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(C14170b.Channel);
                sb5.append(str6);
                sb5.append(URLEncoder.encode(c, str5));
                sb5.append(str4);
                str = sb5.toString();
            }
            String e = this.f41502n.mo44676e();
            if (e != null && e.length() > 0) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(C14170b.Feature);
                sb6.append(str6);
                sb6.append(URLEncoder.encode(e, str5));
                sb6.append(str4);
                str = sb6.toString();
            }
            String h = this.f41502n.mo44681h();
            if (h != null && h.length() > 0) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(C14170b.Stage);
                sb7.append(str6);
                sb7.append(URLEncoder.encode(h, str5));
                sb7.append(str4);
                str = sb7.toString();
            }
            String b = this.f41502n.mo44669b();
            if (b != null && b.length() > 0) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(C14170b.Campaign);
                sb8.append(str6);
                sb8.append(URLEncoder.encode(b, str5));
                sb8.append(str4);
                str = sb8.toString();
            }
            long j = (long) this.f41502n.mo44684j();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(C14170b.Type);
            sb9.append(str6);
            sb9.append(j);
            sb9.append(str4);
            String sb10 = sb9.toString();
            long d = (long) this.f41502n.mo44674d();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            sb11.append(C14170b.Duration);
            sb11.append(str6);
            sb11.append(d);
            String sb12 = sb11.toString();
            String jSONObject = this.f41502n.mo44680g().toString();
            if (jSONObject == null || jSONObject.length() <= 0) {
                return sb12;
            }
            String encode = URLEncoder.encode(C14119c.m61053c(jSONObject.getBytes(), 2), str5);
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            sb13.append("&source=android&data=");
            sb13.append(encode);
            return sb13.toString();
        } catch (Exception unused) {
            this.f41504p.mo24840a(null, new C14130h("Trouble creating a URL.", C14130h.f41563r));
            return str;
        }
    }

    /* renamed from: a */
    public void mo44618a(String str) {
        C6013d dVar = this.f41504p;
        if (dVar != null) {
            dVar.mo24840a(str, null);
        }
        m61023c(str);
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        if (this.f41504p != null) {
            String str2 = null;
            if (this.f41506r) {
                str2 = mo44624v();
            }
            C6013d dVar = this.f41504p;
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble creating a URL. ");
            sb.append(str);
            dVar.mo24840a(str2, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41504p = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44619a(boolean z) {
        this.f41505q = z;
    }

    public C14116a0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
