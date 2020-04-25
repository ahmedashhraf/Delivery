package p212io.branch.indexing;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14130h;
import p212io.branch.referral.C14137k;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C6009d;
import p212io.branch.referral.C6009d.C6013d;
import p212io.branch.referral.C6009d.C6014e;
import p212io.branch.referral.C6009d.C6022m;
import p212io.branch.referral.C6009d.C6024o;
import p212io.branch.referral.C6009d.C6028s;
import p212io.branch.referral.C6031o.C6032a;
import p212io.branch.referral.util.C14192a;
import p212io.branch.referral.util.C14197e;
import p212io.branch.referral.util.C14200h;
import p212io.branch.referral.util.ContentMetadata;
import p212io.branch.referral.util.LinkProperties;

/* renamed from: io.branch.indexing.BranchUniversalObject */
public class BranchUniversalObject implements Parcelable {
    public static final Creator CREATOR = new C14087a();

    /* renamed from: N */
    private String f41370N;

    /* renamed from: O */
    private String f41371O;

    /* renamed from: P */
    private String f41372P;

    /* renamed from: Q */
    private ContentMetadata f41373Q;

    /* renamed from: R */
    private C14088b f41374R;

    /* renamed from: S */
    private final ArrayList<String> f41375S;

    /* renamed from: T */
    private long f41376T;

    /* renamed from: U */
    private C14088b f41377U;

    /* renamed from: V */
    private long f41378V;

    /* renamed from: a */
    private String f41379a;

    /* renamed from: b */
    private String f41380b;

    /* renamed from: io.branch.indexing.BranchUniversalObject$a */
    static class C14087a implements Creator {
        C14087a() {
        }

        public BranchUniversalObject createFromParcel(Parcel parcel) {
            return new BranchUniversalObject(parcel, null);
        }

        public BranchUniversalObject[] newArray(int i) {
            return new BranchUniversalObject[i];
        }
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$b */
    public enum C14088b {
        PUBLIC,
        PRIVATE
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$c */
    private class C14089c implements C6014e {

        /* renamed from: a */
        private final C6014e f41381a;

        /* renamed from: b */
        private final C6028s f41382b;

        /* renamed from: c */
        private final LinkProperties f41383c;

        C14089c(C6014e eVar, C6028s sVar, LinkProperties linkProperties) {
            this.f41381a = eVar;
            this.f41382b = sVar;
            this.f41383c = linkProperties;
        }

        /* renamed from: a */
        public void mo24841a() {
            C6014e eVar = this.f41381a;
            if (eVar != null) {
                eVar.mo24841a();
            }
        }

        /* renamed from: b */
        public void mo24844b() {
            C6014e eVar = this.f41381a;
            if (eVar != null) {
                eVar.mo24844b();
            }
        }

        /* renamed from: a */
        public void mo24843a(String str, String str2, C14130h hVar) {
            HashMap hashMap = new HashMap();
            if (hVar == null) {
                hashMap.put(C14169a.SharedLink.mo44764d(), str);
            } else {
                hashMap.put(C14169a.ShareError.mo44764d(), hVar.mo44646b());
            }
            BranchUniversalObject.this.mo44532a(C14192a.SHARE.getName(), hashMap);
            C6014e eVar = this.f41381a;
            if (eVar != null) {
                eVar.mo24843a(str, str2, hVar);
            }
        }

        /* renamed from: a */
        public void mo24842a(String str) {
            C6014e eVar = this.f41381a;
            if (eVar != null) {
                eVar.mo24842a(str);
            }
            C6014e eVar2 = this.f41381a;
            if ((eVar2 instanceof C6022m) && ((C6022m) eVar2).mo24854a(str, BranchUniversalObject.this, this.f41383c)) {
                C6028s sVar = this.f41382b;
                sVar.mo24875a(BranchUniversalObject.this.m60872a(sVar.mo24911u(), this.f41383c));
            }
        }
    }

    /* renamed from: io.branch.indexing.BranchUniversalObject$d */
    public interface C14090d {
        /* renamed from: a */
        void mo44565a(boolean z, C14130h hVar);
    }

    /* synthetic */ BranchUniversalObject(Parcel parcel, C14087a aVar) {
        this(parcel);
    }

    /* renamed from: w */
    public static BranchUniversalObject m60874w() {
        BranchUniversalObject a;
        String str = "+clicked_branch_link";
        C6009d J = C6009d.m27463J();
        if (J == null) {
            return null;
        }
        try {
            if (J.mo24819m() == null) {
                return null;
            }
            if (J.mo24819m().has(str) && J.mo24819m().getBoolean(str)) {
                a = m60870a(J.mo24819m());
            } else if (J.mo24816j() == null || J.mo24816j().length() <= 0) {
                return null;
            } else {
                a = m60870a(J.mo24819m());
            }
            return a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public BranchUniversalObject mo44514a(double d, C14197e eVar) {
        return this;
    }

    /* renamed from: b */
    public BranchUniversalObject mo44533b(C14088b bVar) {
        this.f41377U = bVar;
        return this;
    }

    /* renamed from: c */
    public BranchUniversalObject mo44536c(@C0193h0 String str) {
        this.f41379a = str;
        return this;
    }

    /* renamed from: d */
    public BranchUniversalObject mo44540d(@C0193h0 String str) {
        this.f41380b = str;
        return this;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public BranchUniversalObject mo44543e(String str) {
        this.f41371O = str;
        return this;
    }

    /* renamed from: f */
    public BranchUniversalObject mo44544f(@C0193h0 String str) {
        this.f41372P = str;
        return this;
    }

    /* renamed from: g */
    public BranchUniversalObject mo44545g(String str) {
        return this;
    }

    /* renamed from: h */
    public BranchUniversalObject mo44546h(@C0193h0 String str) {
        this.f41370N = str;
        return this;
    }

    /* renamed from: i */
    public void mo44548i(String str) {
        mo44532a(str, null);
    }

    /* renamed from: j */
    public String mo44549j() {
        return null;
    }

    /* renamed from: k */
    public String mo44550k() {
        return this.f41371O;
    }

    /* renamed from: l */
    public long mo44551l() {
        return this.f41376T;
    }

    /* renamed from: m */
    public String mo44552m() {
        return this.f41372P;
    }

    /* renamed from: n */
    public ArrayList<String> mo44553n() {
        return this.f41375S;
    }

    /* renamed from: o */
    public JSONArray mo44554o() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f41375S.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    /* renamed from: p */
    public HashMap<String, String> mo44555p() {
        return this.f41373Q.mo44808b();
    }

    /* renamed from: q */
    public double mo44556q() {
        return 0.0d;
    }

    /* renamed from: r */
    public String mo44557r() {
        return this.f41370N;
    }

    /* renamed from: s */
    public String mo44558s() {
        return null;
    }

    /* renamed from: t */
    public boolean mo44559t() {
        return this.f41377U == C14088b.PUBLIC;
    }

    /* renamed from: u */
    public boolean mo44560u() {
        return this.f41374R == C14088b.PUBLIC;
    }

    /* renamed from: v */
    public void mo44561v() {
        mo44529a((C14090d) null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f41378V);
        parcel.writeString(this.f41379a);
        parcel.writeString(this.f41380b);
        parcel.writeString(this.f41370N);
        parcel.writeString(this.f41371O);
        parcel.writeString(this.f41372P);
        parcel.writeLong(this.f41376T);
        parcel.writeInt(this.f41374R.ordinal());
        parcel.writeSerializable(this.f41375S);
        parcel.writeParcelable(this.f41373Q, i);
        parcel.writeInt(this.f41377U.ordinal());
    }

    public BranchUniversalObject() {
        this.f41373Q = new ContentMetadata();
        this.f41375S = new ArrayList<>();
        String str = "";
        this.f41379a = str;
        this.f41380b = str;
        this.f41370N = str;
        this.f41371O = str;
        C14088b bVar = C14088b.PUBLIC;
        this.f41374R = bVar;
        this.f41377U = bVar;
        this.f41376T = 0;
        this.f41378V = System.currentTimeMillis();
    }

    /* renamed from: a */
    public BranchUniversalObject mo44521a(HashMap<String, String> hashMap) {
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.f41373Q.mo44804a(str, (String) hashMap.get(str));
            }
        }
        return this;
    }

    /* renamed from: b */
    public void mo44535b(Context context, LinkProperties linkProperties) {
        C14091a.m60929a(context, this, linkProperties);
    }

    /* renamed from: c */
    public void mo44538c(Context context) {
        C14091a.m60929a(context, this, (LinkProperties) null);
    }

    /* renamed from: d */
    public void mo44541d(Context context) {
        C14091a.m60933b(context, this, (LinkProperties) null);
    }

    /* renamed from: i */
    public ContentMetadata mo44547i() {
        return this.f41373Q;
    }

    /* renamed from: d */
    private C14137k m60873d(@C0193h0 Context context, @C0193h0 LinkProperties linkProperties) {
        return m60872a(new C14137k(context), linkProperties);
    }

    /* renamed from: b */
    public String mo44534b() {
        return this.f41379a;
    }

    /* renamed from: c */
    public void mo44539c(Context context, LinkProperties linkProperties) {
        C14091a.m60933b(context, this, linkProperties);
    }

    /* renamed from: c */
    public String mo44537c() {
        return this.f41380b;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44518a(String str, String str2) {
        this.f41373Q.mo44804a(str, str2);
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44516a(ContentMetadata contentMetadata) {
        this.f41373Q = contentMetadata;
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44515a(C14088b bVar) {
        this.f41374R = bVar;
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44519a(ArrayList<String> arrayList) {
        this.f41375S.addAll(arrayList);
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44517a(String str) {
        this.f41375S.add(str);
        return this;
    }

    /* renamed from: a */
    public BranchUniversalObject mo44520a(Date date) {
        this.f41376T = date.getTime();
        return this;
    }

    /* renamed from: a */
    public void mo44530a(C14192a aVar) {
        mo44532a(aVar.getName(), null);
    }

    private BranchUniversalObject(Parcel parcel) {
        this();
        this.f41378V = parcel.readLong();
        this.f41379a = parcel.readString();
        this.f41380b = parcel.readString();
        this.f41370N = parcel.readString();
        this.f41371O = parcel.readString();
        this.f41372P = parcel.readString();
        this.f41376T = parcel.readLong();
        this.f41374R = C14088b.values()[parcel.readInt()];
        ArrayList arrayList = (ArrayList) parcel.readSerializable();
        if (arrayList != null) {
            this.f41375S.addAll(arrayList);
        }
        this.f41373Q = (ContentMetadata) parcel.readParcelable(ContentMetadata.class.getClassLoader());
        this.f41377U = C14088b.values()[parcel.readInt()];
    }

    /* renamed from: a */
    public void mo44532a(String str, HashMap<String, String> hashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            new JSONArray().put(this.f41379a);
            jSONObject.put(this.f41379a, mo44524a());
            if (hashMap != null) {
                for (String str2 : hashMap.keySet()) {
                    jSONObject.put(str2, hashMap.get(str2));
                }
            }
            if (C6009d.m27463J() != null) {
                C6009d.m27463J().mo24767a(str, jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public void mo44531a(C14192a aVar, HashMap<String, String> hashMap) {
        mo44532a(aVar.getName(), hashMap);
    }

    /* renamed from: a */
    public void mo44529a(@C0195i0 C14090d dVar) {
        if (C6009d.m27463J() != null) {
            C6009d.m27463J().mo24751a(this, dVar);
        } else if (dVar != null) {
            dVar.mo44565a(false, new C14130h("Register view error", C14130h.f41556k));
        }
    }

    /* renamed from: a */
    public String mo44522a(@C0193h0 Context context, @C0193h0 LinkProperties linkProperties) {
        return m60873d(context, linkProperties).mo44691b();
    }

    /* renamed from: a */
    public String mo44523a(@C0193h0 Context context, @C0193h0 LinkProperties linkProperties, boolean z) {
        return ((C14137k) m60873d(context, linkProperties).mo44710a(z)).mo44691b();
    }

    /* renamed from: a */
    public void mo44527a(@C0193h0 Context context, @C0193h0 LinkProperties linkProperties, @C0195i0 C6013d dVar) {
        m60873d(context, linkProperties).mo44692b(dVar);
    }

    /* renamed from: a */
    public void mo44528a(@C0193h0 Context context, @C0193h0 LinkProperties linkProperties, @C0195i0 C6013d dVar, boolean z) {
        ((C14137k) m60873d(context, linkProperties).mo44710a(z)).mo44692b(dVar);
    }

    /* renamed from: a */
    public void mo44525a(@C0193h0 Activity activity, @C0193h0 LinkProperties linkProperties, @C0193h0 C14200h hVar, @C0195i0 C6014e eVar) {
        mo44526a(activity, linkProperties, hVar, eVar, null);
    }

    /* renamed from: a */
    public void mo44526a(@C0193h0 Activity activity, @C0193h0 LinkProperties linkProperties, @C0193h0 C14200h hVar, @C0195i0 C6014e eVar, C6024o oVar) {
        if (C6009d.m27463J() != null) {
            C6028s sVar = new C6028s(activity, m60873d(activity, linkProperties));
            sVar.mo24866a((C6014e) new C14089c(eVar, sVar, linkProperties)).mo24867a(oVar).mo24899j(hVar.mo44916k()).mo24893g(hVar.mo44915j());
            if (hVar.mo44899b() != null) {
                sVar.mo24864a(hVar.mo44899b(), hVar.mo44898a(), hVar.mo44923r());
            }
            if (hVar.mo44917l() != null) {
                sVar.mo24863a(hVar.mo44917l(), hVar.mo44918m());
            }
            if (hVar.mo44906c() != null) {
                sVar.mo24888e(hVar.mo44906c());
            }
            if (hVar.mo44919n().size() > 0) {
                sVar.mo24871a(hVar.mo44919n());
            }
            if (hVar.mo44922q() > 0) {
                sVar.mo24890e(hVar.mo44922q());
            }
            sVar.mo24876b(hVar.mo44910e());
            sVar.mo24873a(hVar.mo44914i());
            sVar.mo24860a(hVar.mo44907d());
            sVar.mo24896h(hVar.mo44920o());
            sVar.mo24865a(hVar.mo44921p());
            sVar.mo24883c(hVar.mo44912g());
            if (hVar.mo44913h() != null && hVar.mo44913h().size() > 0) {
                sVar.mo24879b(hVar.mo44913h());
            }
            if (hVar.mo44911f() != null && hVar.mo44911f().size() > 0) {
                sVar.mo24872a(hVar.mo44911f());
            }
            sVar.mo24914x();
        } else if (eVar != null) {
            eVar.mo24843a(null, null, new C14130h("Trouble sharing link. ", C14130h.f41556k));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C14137k m60872a(@C0193h0 C14137k kVar, @C0193h0 LinkProperties linkProperties) {
        if (linkProperties.mo44833m() != null) {
            kVar.mo44709a((List<String>) linkProperties.mo44833m());
        }
        if (linkProperties.mo44830j() != null) {
            kVar.mo44696e(linkProperties.mo44830j());
        }
        if (linkProperties.mo44820a() != null) {
            kVar.mo44690b(linkProperties.mo44820a());
        }
        if (linkProperties.mo44823c() != null) {
            kVar.mo44695d(linkProperties.mo44823c());
        }
        if (linkProperties.mo44832l() != null) {
            kVar.mo44697f(linkProperties.mo44832l());
        }
        if (linkProperties.mo44821b() != null) {
            kVar.mo44694c(linkProperties.mo44821b());
        }
        if (linkProperties.mo44831k() > 0) {
            kVar.mo44687a(linkProperties.mo44831k());
        }
        if (!TextUtils.isEmpty(this.f41370N)) {
            kVar.mo44708a(C14169a.ContentTitle.mo44764d(), (Object) this.f41370N);
        }
        if (!TextUtils.isEmpty(this.f41379a)) {
            kVar.mo44708a(C14169a.CanonicalIdentifier.mo44764d(), (Object) this.f41379a);
        }
        if (!TextUtils.isEmpty(this.f41380b)) {
            kVar.mo44708a(C14169a.CanonicalUrl.mo44764d(), (Object) this.f41380b);
        }
        JSONArray o = mo44554o();
        if (o.length() > 0) {
            kVar.mo44708a(C14169a.ContentKeyWords.mo44764d(), (Object) o);
        }
        if (!TextUtils.isEmpty(this.f41371O)) {
            kVar.mo44708a(C14169a.ContentDesc.mo44764d(), (Object) this.f41371O);
        }
        if (!TextUtils.isEmpty(this.f41372P)) {
            kVar.mo44708a(C14169a.ContentImgUrl.mo44764d(), (Object) this.f41372P);
        }
        String str = "";
        if (this.f41376T > 0) {
            String d = C14169a.ContentExpiryTime.mo44764d();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f41376T);
            kVar.mo44708a(d, (Object) sb.toString());
        }
        String d2 = C14169a.PublicallyIndexable.mo44764d();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(mo44560u());
        kVar.mo44708a(d2, (Object) sb2.toString());
        JSONObject a = this.f41373Q.mo44807a();
        try {
            Iterator keys = a.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                kVar.mo44708a(str2, a.get(str2));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        HashMap i = linkProperties.mo44829i();
        for (String str3 : i.keySet()) {
            kVar.mo44708a(str3, i.get(str3));
        }
        return kVar;
    }

    /* renamed from: a */
    public static BranchUniversalObject m60870a(JSONObject jSONObject) {
        JSONArray jSONArray = null;
        try {
            BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
            try {
                C6032a aVar = new C6032a(jSONObject);
                branchUniversalObject.f41370N = aVar.mo24930h(C14169a.ContentTitle.mo44764d());
                branchUniversalObject.f41379a = aVar.mo24930h(C14169a.CanonicalIdentifier.mo44764d());
                branchUniversalObject.f41380b = aVar.mo24930h(C14169a.CanonicalUrl.mo44764d());
                branchUniversalObject.f41371O = aVar.mo24930h(C14169a.ContentDesc.mo44764d());
                branchUniversalObject.f41372P = aVar.mo24930h(C14169a.ContentImgUrl.mo44764d());
                branchUniversalObject.f41376T = aVar.mo24929g(C14169a.ContentExpiryTime.mo44764d());
                Object b = aVar.mo24923b(C14169a.ContentKeyWords.mo44764d());
                if (b instanceof JSONArray) {
                    jSONArray = (JSONArray) b;
                } else if (b instanceof String) {
                    jSONArray = new JSONArray((String) b);
                }
                if (jSONArray != null) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        branchUniversalObject.f41375S.add((String) jSONArray.get(i));
                    }
                }
                Object b2 = aVar.mo24923b(C14169a.PublicallyIndexable.mo44764d());
                if (b2 instanceof Boolean) {
                    branchUniversalObject.f41374R = ((Boolean) b2).booleanValue() ? C14088b.PUBLIC : C14088b.PRIVATE;
                } else if (b2 instanceof Integer) {
                    branchUniversalObject.f41374R = ((Integer) b2).intValue() == 1 ? C14088b.PUBLIC : C14088b.PRIVATE;
                }
                branchUniversalObject.f41377U = aVar.mo24925c(C14169a.LocallyIndexable.mo44764d()) ? C14088b.PUBLIC : C14088b.PRIVATE;
                branchUniversalObject.f41378V = aVar.mo24929g(C14169a.CreationTimestamp.mo44764d());
                branchUniversalObject.f41373Q = ContentMetadata.m61356a(aVar);
                JSONObject a = aVar.mo24921a();
                Iterator keys = a.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    branchUniversalObject.f41373Q.mo44804a(str, a.optString(str));
                }
                return branchUniversalObject;
            } catch (Exception unused) {
                return branchUniversalObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public JSONObject mo44524a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject a = this.f41373Q.mo44807a();
            Iterator keys = a.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                jSONObject.put(str, a.get(str));
            }
            if (!TextUtils.isEmpty(this.f41370N)) {
                jSONObject.put(C14169a.ContentTitle.mo44764d(), this.f41370N);
            }
            if (!TextUtils.isEmpty(this.f41379a)) {
                jSONObject.put(C14169a.CanonicalIdentifier.mo44764d(), this.f41379a);
            }
            if (!TextUtils.isEmpty(this.f41380b)) {
                jSONObject.put(C14169a.CanonicalUrl.mo44764d(), this.f41380b);
            }
            if (this.f41375S.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = this.f41375S.iterator();
                while (it.hasNext()) {
                    jSONArray.put((String) it.next());
                }
                jSONObject.put(C14169a.ContentKeyWords.mo44764d(), jSONArray);
            }
            if (!TextUtils.isEmpty(this.f41371O)) {
                jSONObject.put(C14169a.ContentDesc.mo44764d(), this.f41371O);
            }
            if (!TextUtils.isEmpty(this.f41372P)) {
                jSONObject.put(C14169a.ContentImgUrl.mo44764d(), this.f41372P);
            }
            if (this.f41376T > 0) {
                jSONObject.put(C14169a.ContentExpiryTime.mo44764d(), this.f41376T);
            }
            jSONObject.put(C14169a.PublicallyIndexable.mo44764d(), mo44560u());
            jSONObject.put(C14169a.LocallyIndexable.mo44764d(), mo44559t());
            jSONObject.put(C14169a.CreationTimestamp.mo44764d(), this.f41378V);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
