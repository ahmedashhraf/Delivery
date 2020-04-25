package p212io.branch.referral;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14148n;
import p212io.branch.referral.C6009d.C6013d;

/* renamed from: io.branch.referral.n */
/* compiled from: BranchUrlBuilder */
abstract class C14148n<T extends C14148n> {

    /* renamed from: a */
    protected JSONObject f41616a;

    /* renamed from: b */
    protected String f41617b;

    /* renamed from: c */
    protected String f41618c = C6009d.f17201D;

    /* renamed from: d */
    protected String f41619d;

    /* renamed from: e */
    protected String f41620e;

    /* renamed from: f */
    protected String f41621f;

    /* renamed from: g */
    protected int f41622g = 0;

    /* renamed from: h */
    protected int f41623h = 0;

    /* renamed from: i */
    protected ArrayList<String> f41624i;

    /* renamed from: j */
    protected C6009d f41625j = C6009d.m27463J();

    /* renamed from: k */
    private boolean f41626k;

    /* renamed from: l */
    private final Context f41627l;

    protected C14148n(Context context) {
        this.f41627l = context.getApplicationContext();
        this.f41626k = true;
    }

    /* renamed from: a */
    public T mo44707a(String str) {
        if (this.f41624i == null) {
            this.f41624i = new ArrayList<>();
        }
        this.f41624i.add(str);
        return this;
    }

    /* renamed from: a */
    public T mo44709a(List<String> list) {
        if (this.f41624i == null) {
            this.f41624i = new ArrayList<>();
        }
        this.f41624i.addAll(list);
        return this;
    }

    /* renamed from: a */
    public T mo44708a(String str, Object obj) {
        try {
            if (this.f41616a == null) {
                this.f41616a = new JSONObject();
            }
            this.f41616a.put(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: a */
    public T mo44710a(boolean z) {
        this.f41626k = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo44711a() {
        if (this.f41625j == null) {
            return null;
        }
        C14116a0 a0Var = new C14116a0(this.f41627l, this.f41621f, this.f41622g, this.f41623h, this.f41624i, this.f41617b, this.f41618c, this.f41619d, this.f41620e, C6031o.m27712b(this.f41616a), null, false, this.f41626k);
        return this.f41625j.mo24747a(a0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44712a(C6013d dVar) {
        mo44713a(dVar, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44713a(C6013d dVar, boolean z) {
        C6013d dVar2 = dVar;
        if (this.f41625j != null) {
            C14116a0 a0Var = new C14116a0(this.f41627l, this.f41621f, this.f41622g, this.f41623h, this.f41624i, this.f41617b, this.f41618c, this.f41619d, this.f41620e, C6031o.m27712b(this.f41616a), dVar, true, this.f41626k);
            a0Var.mo44619a(z);
            this.f41625j.mo24747a(a0Var);
        } else if (dVar2 != null) {
            dVar2.mo24840a(null, new C14130h("session has not been initialized", C14130h.f41548c));
        }
    }
}
