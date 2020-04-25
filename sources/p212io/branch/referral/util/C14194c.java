package p212io.branch.referral.util;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.indexing.BranchUniversalObject;
import p212io.branch.referral.C14152o0;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C14205y;
import p212io.branch.referral.C14205y.C14206a;
import p212io.branch.referral.C6009d;

/* renamed from: io.branch.referral.util.c */
/* compiled from: BranchEvent */
public class C14194c {

    /* renamed from: f */
    public static final String f41779f = "View";

    /* renamed from: g */
    public static final String f41780g = "Add to Wishlist";

    /* renamed from: h */
    public static final String f41781h = "Add to Cart";

    /* renamed from: i */
    public static final String f41782i = "Purchase Started";

    /* renamed from: j */
    public static final String f41783j = "Purchased";

    /* renamed from: k */
    public static final String f41784k = "Share Started";

    /* renamed from: l */
    public static final String f41785l = "Share Completed";

    /* renamed from: m */
    public static final String f41786m = "$canonical_identifier_list";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f41787a;

    /* renamed from: b */
    private final boolean f41788b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final JSONObject f41789c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final JSONObject f41790d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final List<BranchUniversalObject> f41791e;

    /* renamed from: io.branch.referral.util.c$a */
    /* compiled from: BranchEvent */
    private class C14195a extends C14205y {
        C14195a(Context context, String str) {
            super(context, str);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C14169a.Name.mo44764d(), C14194c.this.f41787a);
                if (C14194c.this.f41790d.length() > 0) {
                    jSONObject.put(C14169a.CustomData.mo44764d(), C14194c.this.f41790d);
                }
                if (C14194c.this.f41789c.length() > 0) {
                    jSONObject.put(C14169a.EventData.mo44764d(), C14194c.this.f41789c);
                }
                if (C14194c.this.f41791e.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject.put(C14169a.ContentItems.mo44764d(), jSONArray);
                    for (BranchUniversalObject a : C14194c.this.f41791e) {
                        jSONArray.put(a.mo44524a());
                    }
                }
                mo44635a(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            mo45014a(context, jSONObject);
        }

        /* renamed from: a */
        public void mo44615a() {
        }

        /* renamed from: a */
        public void mo44616a(int i, String str) {
        }

        /* renamed from: a */
        public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        }

        /* renamed from: b */
        public boolean mo44620b(Context context) {
            return false;
        }

        /* renamed from: d */
        public C14206a mo44851d() {
            return C14206a.V2;
        }

        /* renamed from: j */
        public boolean mo44638j() {
            return true;
        }

        /* renamed from: k */
        public boolean mo44621k() {
            return false;
        }

        /* renamed from: r */
        public boolean mo44634r() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public boolean mo44641s() {
            return true;
        }
    }

    public C14194c(C14192a aVar) {
        this(aVar.getName(), true);
    }

    /* renamed from: e */
    public C14194c mo44850e(String str) {
        return m61394a(C14169a.TransactionID.mo44764d(), (Object) str);
    }

    public C14194c(String str) {
        this(str, false);
    }

    /* renamed from: a */
    public C14194c mo44839a(C14197e eVar) {
        return m61394a(C14169a.Currency.mo44764d(), (Object) eVar.toString());
    }

    /* renamed from: b */
    public C14194c mo44845b(double d) {
        return m61394a(C14169a.Shipping.mo44764d(), (Object) Double.valueOf(d));
    }

    /* renamed from: c */
    public C14194c mo44847c(double d) {
        return m61394a(C14169a.Tax.mo44764d(), (Object) Double.valueOf(d));
    }

    /* renamed from: d */
    public C14194c mo44849d(String str) {
        return m61394a(C14169a.SearchQuery.mo44764d(), (Object) str);
    }

    private C14194c(String str, boolean z) {
        this.f41789c = new JSONObject();
        this.f41790d = new JSONObject();
        this.f41787a = str;
        C14192a[] values = C14192a.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (str.equals(values[i].getName())) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.f41788b = z;
        this.f41791e = new ArrayList();
    }

    /* renamed from: a */
    public C14194c mo44838a(double d) {
        return m61394a(C14169a.Revenue.mo44764d(), (Object) Double.valueOf(d));
    }

    /* renamed from: b */
    public C14194c mo44846b(String str) {
        return m61394a(C14169a.Coupon.mo44764d(), (Object) str);
    }

    /* renamed from: c */
    public C14194c mo44848c(String str) {
        return m61394a(C14169a.Description.mo44764d(), (Object) str);
    }

    /* renamed from: a */
    public C14194c mo44840a(String str) {
        return m61394a(C14169a.Affiliation.mo44764d(), (Object) str);
    }

    /* renamed from: a */
    private C14194c m61394a(String str, Object obj) {
        if (obj != null) {
            try {
                this.f41789c.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            this.f41789c.remove(str);
        }
        return this;
    }

    /* renamed from: a */
    public C14194c mo44841a(String str, String str2) {
        try {
            this.f41790d.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return this;
    }

    /* renamed from: a */
    public C14194c mo44843a(BranchUniversalObject... branchUniversalObjectArr) {
        Collections.addAll(this.f41791e, branchUniversalObjectArr);
        return this;
    }

    /* renamed from: a */
    public C14194c mo44842a(List<BranchUniversalObject> list) {
        this.f41791e.addAll(list);
        return this;
    }

    /* renamed from: a */
    public boolean mo44844a(Context context) {
        String d = (this.f41788b ? C14171c.TrackStandardEvent : C14171c.TrackCustomEvent).mo44768d();
        if (C6009d.m27463J() == null) {
            return false;
        }
        C6009d.m27463J().mo24758a((C14205y) new C14195a(context, d));
        return true;
    }
}
