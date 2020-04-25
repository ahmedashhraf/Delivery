package p212io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.branch.referral.o0 */
/* compiled from: ServerResponse */
public class C14152o0 {

    /* renamed from: a */
    private int f41635a;

    /* renamed from: b */
    private String f41636b;

    /* renamed from: c */
    private Object f41637c;

    public C14152o0(String str, int i) {
        this.f41636b = str;
        this.f41635a = i;
    }

    /* renamed from: a */
    public void mo44719a(Object obj) {
        this.f41637c = obj;
    }

    /* renamed from: b */
    public String mo44720b() {
        String str = "message";
        String str2 = "error";
        String str3 = "";
        try {
            JSONObject c = mo44721c();
            if (c == null || !c.has(str2) || !c.getJSONObject(str2).has(str)) {
                return str3;
            }
            String string = c.getJSONObject(str2).getString(str);
            if (string == null || string.trim().length() <= 0) {
                return string;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(".");
            return sb.toString();
        } catch (Exception unused) {
            return str3;
        }
    }

    /* renamed from: c */
    public JSONObject mo44721c() {
        Object obj = this.f41637c;
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        return new JSONObject();
    }

    /* renamed from: d */
    public int mo44722d() {
        return this.f41635a;
    }

    /* renamed from: e */
    public String mo44723e() {
        return this.f41636b;
    }

    /* renamed from: a */
    public JSONArray mo44718a() {
        Object obj = this.f41637c;
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        return null;
    }
}
