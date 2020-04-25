package p212io.fabric.sdk.android.p493p.p498e;

import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.p493p.p495b.C14254k;

/* renamed from: io.fabric.sdk.android.p.e.l */
/* compiled from: DefaultSettingsJsonTransform */
class C14317l implements C14331w {
    C14317l() {
    }

    /* renamed from: b */
    private C14310e m62028b(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString(C14330v.f42305U);
        String string2 = jSONObject.getString("status");
        String string3 = jSONObject.getString("url");
        String string4 = jSONObject.getString(C14330v.f42308X);
        String string5 = jSONObject.getString(C14330v.f42309Y);
        boolean optBoolean = jSONObject.optBoolean(C14330v.f42310Z, false);
        String str = C14330v.f42312a0;
        C14310e eVar = new C14310e(string, string2, string3, string4, string5, optBoolean, (!jSONObject.has(str) || !jSONObject.getJSONObject(str).has(C14330v.f42316c0)) ? null : m62031e(jSONObject.getJSONObject(str)));
        return eVar;
    }

    /* renamed from: c */
    private C14312g m62029c(JSONObject jSONObject) throws JSONException {
        return new C14312g(jSONObject.optString(C14330v.f42288G, C14330v.f42292I), jSONObject.optInt(C14330v.f42290H, 3600));
    }

    /* renamed from: d */
    private C14319n m62030d(JSONObject jSONObject) {
        C14319n nVar = new C14319n(jSONObject.optBoolean(C14330v.f42295K, false), jSONObject.optBoolean(C14330v.f42297M, true), jSONObject.optBoolean(C14330v.f42296L, true), jSONObject.optBoolean(C14330v.f42298N, false), jSONObject.optBoolean(C14330v.f42299O, false));
        return nVar;
    }

    /* renamed from: e */
    private C14308c m62031e(JSONObject jSONObject) throws JSONException {
        return new C14308c(jSONObject.getString(C14330v.f42316c0), jSONObject.getInt(C14330v.f42318d0), jSONObject.getInt(C14330v.f42320e0));
    }

    /* renamed from: f */
    private C14321p m62032f(JSONObject jSONObject) throws JSONException {
        C14321p pVar = new C14321p(jSONObject.optString("title", C14330v.f42281C0), jSONObject.optString("message", C14330v.f42283D0), jSONObject.optString(C14330v.f42358x0, C14330v.f42289G0), jSONObject.optBoolean(C14330v.f42360y0, true), jSONObject.optString(C14330v.f42362z0, C14330v.f42293I0), jSONObject.optBoolean(C14330v.f42277A0, true), jSONObject.optString(C14330v.f42279B0, C14330v.f42291H0));
        return pVar;
    }

    /* renamed from: g */
    private C14322q m62033g(JSONObject jSONObject) throws JSONException {
        C14322q qVar = new C14322q(jSONObject.optInt(C14330v.f42324g0, C14330v.f42340o0), jSONObject.optInt(C14330v.f42326h0, 8), jSONObject.optInt(C14330v.f42328i0, 64), jSONObject.optInt(C14330v.f42330j0, 64), jSONObject.optInt(C14330v.f42332k0, 255), jSONObject.optBoolean(C14330v.f42334l0, false), jSONObject.optInt(C14330v.f42336m0, 4));
        return qVar;
    }

    /* renamed from: a */
    public C14329u mo45267a(C14254k kVar, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt(C14330v.f42323g, 0);
        int optInt2 = jSONObject.optInt(C14330v.f42327i, 3600);
        C14329u uVar = new C14329u(m62019a(kVar, (long) optInt2, jSONObject), m62028b(jSONObject.getJSONObject(C14330v.f42313b)), m62033g(jSONObject.getJSONObject("session")), m62032f(jSONObject.getJSONObject(C14330v.f42321f)), m62030d(jSONObject.getJSONObject("features")), m62020a(jSONObject.getJSONObject(C14330v.f42315c)), m62029c(jSONObject.getJSONObject("beta")), optInt, optInt2);
        return uVar;
    }

    /* renamed from: a */
    public JSONObject mo45268a(C14329u uVar) throws JSONException {
        String str = "features";
        String str2 = "beta";
        String str3 = "session";
        return new JSONObject().put(C14330v.f42311a, uVar.f42273g).put(C14330v.f42327i, uVar.f42275i).put(C14330v.f42323g, uVar.f42274h).put(str, m62025a(uVar.f42270d)).put(C14330v.f42315c, m62021a(uVar.f42271e)).put(str2, m62024a(uVar.f42272f)).put(C14330v.f42313b, m62023a(uVar.f42267a)).put(str3, m62027a(uVar.f42268b)).put(C14330v.f42321f, m62026a(uVar.f42269c));
    }

    /* renamed from: a */
    private C14307b m62020a(JSONObject jSONObject) {
        C14307b bVar = new C14307b(jSONObject.optString("url", C14330v.f42353v), jSONObject.optInt(C14330v.f42333l, C14330v.f42355w), jSONObject.optInt(C14330v.f42335m, 8000), jSONObject.optInt(C14330v.f42337n, 1), jSONObject.optInt(C14330v.f42339o, 100), jSONObject.optBoolean(C14330v.f42341p, false), jSONObject.optBoolean(C14330v.f42343q, false), jSONObject.optBoolean(C14330v.f42345r, true), jSONObject.optBoolean(C14330v.f42347s, true), jSONObject.optInt(C14330v.f42349t, 1), jSONObject.optBoolean(C14330v.f42351u, true));
        return bVar;
    }

    /* renamed from: a */
    private long m62019a(C14254k kVar, long j, JSONObject jSONObject) throws JSONException {
        String str = C14330v.f42311a;
        if (jSONObject.has(str)) {
            return jSONObject.getLong(str);
        }
        return (j * 1000) + kVar.mo45145a();
    }

    /* renamed from: a */
    private JSONObject m62023a(C14310e eVar) throws JSONException {
        String str = "status";
        String str2 = "url";
        JSONObject put = new JSONObject().put(C14330v.f42305U, eVar.f42208a).put(str, eVar.f42209b).put(str2, eVar.f42210c).put(C14330v.f42308X, eVar.f42211d).put(C14330v.f42309Y, eVar.f42212e).put(C14330v.f42310Z, eVar.f42213f);
        C14308c cVar = eVar.f42214g;
        if (cVar != null) {
            put.put(C14330v.f42312a0, m62022a(cVar));
        }
        return put;
    }

    /* renamed from: a */
    private JSONObject m62022a(C14308c cVar) throws JSONException {
        return new JSONObject().put(C14330v.f42316c0, cVar.f42191a).put(C14330v.f42318d0, cVar.f42192b).put(C14330v.f42320e0, cVar.f42193c);
    }

    /* renamed from: a */
    private JSONObject m62025a(C14319n nVar) throws JSONException {
        return new JSONObject().put(C14330v.f42297M, nVar.f42238b).put(C14330v.f42296L, nVar.f42239c).put(C14330v.f42298N, nVar.f42240d);
    }

    /* renamed from: a */
    private JSONObject m62027a(C14322q qVar) throws JSONException {
        return new JSONObject().put(C14330v.f42324g0, qVar.f42253a).put(C14330v.f42326h0, qVar.f42254b).put(C14330v.f42328i0, qVar.f42255c).put(C14330v.f42330j0, qVar.f42256d).put(C14330v.f42332k0, qVar.f42257e).put(C14330v.f42334l0, qVar.f42258f);
    }

    /* renamed from: a */
    private JSONObject m62021a(C14307b bVar) throws JSONException {
        return new JSONObject().put("url", bVar.f42180a).put(C14330v.f42333l, bVar.f42181b).put(C14330v.f42335m, bVar.f42182c).put(C14330v.f42337n, bVar.f42183d).put(C14330v.f42339o, bVar.f42184e);
    }

    /* renamed from: a */
    private JSONObject m62024a(C14312g gVar) throws JSONException {
        return new JSONObject().put(C14330v.f42288G, gVar.f42215a).put(C14330v.f42290H, gVar.f42216b);
    }

    /* renamed from: a */
    private JSONObject m62026a(C14321p pVar) throws JSONException {
        String str = "message";
        return new JSONObject().put("title", pVar.f42246a).put(str, pVar.f42247b).put(C14330v.f42358x0, pVar.f42248c).put(C14330v.f42360y0, pVar.f42249d).put(C14330v.f42362z0, pVar.f42250e).put(C14330v.f42277A0, pVar.f42251f).put(C14330v.f42279B0, pVar.f42252g);
    }
}
