package com.instabug.featuresrequest.p373ui.p375b.p376a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.cache.C9561a;
import com.instabug.featuresrequest.eventbus.FeatureRequestsEventBus;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9569b;
import com.instabug.featuresrequest.models.FeatureRequestResponse;
import com.instabug.featuresrequest.network.service.C9580b;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.featuresrequest.p370c.C9541d;
import com.instabug.featuresrequest.p373ui.p375b.C9613c;
import com.instabug.featuresrequest.p373ui.p375b.p376a.C9601c.C9603b;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.b.a.e */
/* compiled from: FeaturesListPresenter */
public class C9606e extends BasePresenter<C9603b> implements C9602a {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25429c;

    /* renamed from: a */
    private final C9603b f25430a = ((C9603b) this.view.get());

    /* renamed from: b */
    C9613c f25431b;

    /* renamed from: com.instabug.featuresrequest.ui.b.a.e$a */
    /* compiled from: FeaturesListPresenter */
    class C9607a implements Callbacks<JSONObject, Throwable> {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f25432d;

        /* renamed from: a */
        final /* synthetic */ boolean f25433a;

        /* renamed from: b */
        final /* synthetic */ C9613c f25434b;

        /* renamed from: c */
        final /* synthetic */ C9606e f25435c;

        C9607a(C9606e eVar, boolean z, C9613c cVar) {
            boolean[] a = m44962a();
            this.f25435c = eVar;
            this.f25433a = z;
            this.f25434b = cVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44962a() {
            boolean[] zArr = f25432d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7782902450510474630L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListPresenter$1", 22);
            f25432d = a;
            return a;
        }

        /* renamed from: a */
        public void mo34417a(JSONObject jSONObject) {
            boolean[] a = m44962a();
            try {
                a[1] = true;
                FeatureRequestResponse fromJson = FeatureRequestResponse.fromJson(jSONObject);
                if (fromJson == null) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    if (fromJson.getFeatureRequestList().size() <= 0) {
                        a[4] = true;
                    } else {
                        if (!this.f25433a) {
                            a[5] = true;
                        } else {
                            a[6] = true;
                            this.f25434b.mo34433e();
                            a[7] = true;
                        }
                        C9613c cVar = this.f25434b;
                        a[8] = true;
                        List featureRequestList = fromJson.getFeatureRequestList();
                        a[9] = true;
                        cVar.mo34428a(featureRequestList);
                        a[10] = true;
                        if (fromJson.hasNextPage()) {
                            a[11] = true;
                            this.f25434b.mo34432d();
                            a[12] = true;
                        } else {
                            this.f25434b.mo34429a(false);
                            a[13] = true;
                        }
                    }
                }
                this.f25435c.mo34408d();
                a[14] = true;
            } catch (JSONException e) {
                a[15] = true;
                mo34416a((Throwable) e);
                a[16] = true;
            }
            a[17] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44962a();
            mo34416a((Throwable) obj);
            a[20] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44962a();
            mo34417a((JSONObject) obj);
            a[21] = true;
        }

        /* renamed from: a */
        public void mo34416a(Throwable th) {
            boolean[] a = m44962a();
            InstabugSDKLogger.m46623e(C9606e.class, th.getMessage());
            a[18] = true;
            this.f25435c.mo34407c();
            a[19] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.b.a.e$b */
    /* compiled from: FeaturesListPresenter */
    class C9608b implements C12331g<C9567a> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25436b;

        /* renamed from: a */
        final /* synthetic */ C9606e f25437a;

        /* renamed from: com.instabug.featuresrequest.ui.b.a.e$b$a */
        /* compiled from: FeaturesListPresenter */
        class C9609a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f25438b;

            /* renamed from: a */
            final /* synthetic */ C9608b f25439a;

            C9609a(C9608b bVar) {
                boolean[] a = m44968a();
                this.f25439a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m44968a() {
                boolean[] zArr = f25438b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-4425180010449581141L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListPresenter$2$1", 5);
                f25438b = a;
                return a;
            }

            public void run() {
                boolean[] a = m44968a();
                if (C9606e.m44942a(this.f25439a.f25437a) == null) {
                    a[1] = true;
                } else {
                    a[2] = true;
                    C9606e.m44942a(this.f25439a.f25437a).mo34393p();
                    a[3] = true;
                }
                a[4] = true;
            }
        }

        C9608b(C9606e eVar) {
            boolean[] a = m44965a();
            this.f25437a = eVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44965a() {
            boolean[] zArr = f25436b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2083378297419124131L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListPresenter$2", 7);
            f25436b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34418a(C9567a aVar) {
            boolean[] a = m44965a();
            if (this.f25437a.f25431b.mo34427a() == null) {
                a[1] = true;
            } else {
                C9613c cVar = this.f25437a.f25431b;
                a[2] = true;
                if (cVar.mo34427a().isEmpty()) {
                    a[3] = true;
                } else {
                    new Handler().postDelayed(new C9609a(this), 1000);
                    a[5] = true;
                    return;
                }
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m44965a();
            mo34418a((C9567a) obj);
            a[6] = true;
        }
    }

    public C9606e(C9603b bVar, C9613c cVar, boolean z) {
        boolean[] n = m44945n();
        super(bVar);
        n[0] = true;
        this.f25431b = cVar;
        n[1] = true;
        int c = cVar.mo34431c();
        n[2] = true;
        boolean e = C9535a.m44613e();
        n[3] = true;
        mo34403a(cVar, c, false, e, z, false);
        n[4] = true;
        m44944m();
        n[5] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9603b m44942a(C9606e eVar) {
        boolean[] n = m44945n();
        C9603b bVar = eVar.f25430a;
        n[111] = true;
        return bVar;
    }

    /* renamed from: l */
    private void m44943l() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[44] = true;
        } else {
            n[45] = true;
            Context context = ((Fragment) bVar.getViewContext()).getContext();
            if (context == null) {
                n[46] = true;
            } else {
                n[47] = true;
                FeaturesRequestVoteService.m44769a(context, new Intent(context, FeaturesRequestVoteService.class));
                n[48] = true;
            }
        }
        n[49] = true;
    }

    /* renamed from: m */
    private void m44944m() {
        boolean[] n = m44945n();
        FeatureRequestsEventBus instance = FeatureRequestsEventBus.getInstance();
        C9608b bVar = new C9608b(this);
        n[109] = true;
        instance.subscribe(bVar);
        n[110] = true;
    }

    /* renamed from: n */
    private static /* synthetic */ boolean[] m44945n() {
        boolean[] zArr = f25429c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3357611432241267051L, "com/instabug/featuresrequest/ui/base/featureslist/FeaturesListPresenter", 112);
        f25429c = a;
        return a;
    }

    /* renamed from: b */
    public void mo34405b(int i) {
        boolean[] n = m44945n();
        this.f25430a.mo34379b(this.f25431b.mo34426a(i));
        n[34] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34407c() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[27] = true;
            return;
        }
        bVar.mo34378a(false);
        n[28] = true;
        if (mo34411g() == 0) {
            n[29] = true;
            this.f25430a.mo34383f();
            n[30] = true;
        } else {
            C9603b bVar2 = this.f25430a;
            bVar2.mo34377a(((Fragment) bVar2.getViewContext()).getString(C9525R.string.feature_requests_error_state_title));
            n[31] = true;
            this.f25430a.mo34392o();
            n[32] = true;
        }
        n[33] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo34408d() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[19] = true;
            return;
        }
        bVar.mo34378a(false);
        n[20] = true;
        if (mo34411g() == 0) {
            n[21] = true;
            if (NetworkManager.isOnline(((Fragment) this.f25430a.getViewContext()).getContext())) {
                n[22] = true;
                this.f25430a.mo34381d();
                n[23] = true;
            } else {
                this.f25430a.mo34383f();
                n[24] = true;
            }
        } else {
            this.f25430a.mo34382e();
            n[25] = true;
        }
        n[26] = true;
    }

    /* renamed from: e */
    public void mo34409e() {
        boolean[] n = m44945n();
        if (this.f25430a == null) {
            n[59] = true;
        } else {
            n[60] = true;
            if (this.f25431b.mo34434f()) {
                n[61] = true;
                this.f25430a.mo34388k();
                n[62] = true;
                C9613c cVar = this.f25431b;
                int c = cVar.mo34431c();
                n[63] = true;
                boolean e = C9535a.m44613e();
                boolean j = this.f25430a.mo34387j();
                n[64] = true;
                mo34403a(cVar, c, false, e, j, false);
                n[65] = true;
            } else {
                this.f25430a.mo34391n();
                n[66] = true;
            }
        }
        n[67] = true;
    }

    /* renamed from: f */
    public void mo34410f() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[68] = true;
        } else {
            n[69] = true;
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
                n[70] = true;
                bVar.mo34389l();
                n[71] = true;
            } else {
                bVar.mo34390m();
                n[72] = true;
            }
        }
        n[73] = true;
    }

    /* renamed from: g */
    public int mo34411g() {
        boolean[] n = m44945n();
        int b = this.f25431b.mo34430b();
        n[74] = true;
        return b;
    }

    /* renamed from: h */
    public void mo34412h() {
        boolean[] n = m44945n();
        this.f25431b.mo34429a(true);
        if (this.f25430a == null) {
            n[75] = true;
        } else {
            n[76] = true;
            if (NetworkManager.isOnline(Instabug.getApplicationContext())) {
                n[77] = true;
                this.f25430a.mo34384g();
                n[78] = true;
                this.f25430a.mo34380c();
                C9613c cVar = this.f25431b;
                n[79] = true;
                boolean e = C9535a.m44613e();
                boolean j = this.f25430a.mo34387j();
                n[80] = true;
                mo34403a(cVar, 1, false, e, j, true);
                n[81] = true;
            } else if (this.f25431b.mo34430b() == 0) {
                n[82] = true;
                if (NetworkManager.isOnline(Instabug.getApplicationContext())) {
                    n[83] = true;
                    this.f25430a.mo34381d();
                    n[84] = true;
                } else {
                    this.f25430a.mo34383f();
                    n[85] = true;
                }
            } else {
                this.f25430a.mo34394r();
                n[86] = true;
                this.f25430a.mo34391n();
                n[87] = true;
            }
        }
        n[88] = true;
    }

    /* renamed from: i */
    public void mo34413i() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[97] = true;
        } else {
            n[98] = true;
            bVar.mo34386i();
            n[99] = true;
        }
        n[100] = true;
    }

    /* renamed from: j */
    public void mo34414j() {
        boolean[] n = m44945n();
        this.f25431b.mo34433e();
        n[101] = true;
    }

    /* renamed from: k */
    public boolean mo34415k() {
        boolean[] n = m44945n();
        boolean f = this.f25431b.mo34434f();
        n[108] = true;
        return f;
    }

    /* renamed from: a */
    public void mo34403a(C9613c cVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean[] n = m44945n();
        if (!C9541d.m44636a()) {
            n[6] = true;
        } else {
            n[7] = true;
            if (!NetworkManager.isOnline(Instabug.getApplicationContext())) {
                n[8] = true;
            } else {
                if (i != 1) {
                    n[9] = true;
                } else {
                    n[10] = true;
                    this.f25430a.mo34378a(true);
                    n[11] = true;
                }
                C9580b a = C9580b.m44783a();
                n[12] = true;
                Context applicationContext = Instabug.getApplicationContext();
                C9613c cVar2 = cVar;
                C9607a aVar = new C9607a(this, z4, cVar);
                n[13] = true;
                a.mo34321a(applicationContext, i, z, z2, z3, aVar);
                n[14] = true;
                n[18] = true;
            }
        }
        if (cVar.mo34430b() == 0) {
            n[15] = true;
            this.f25430a.mo34383f();
            n[16] = true;
        } else {
            this.f25430a.mo34392o();
            n[17] = true;
        }
        n[18] = true;
    }

    /* renamed from: b */
    public void mo34406b(C9567a aVar) {
        boolean[] n = m44945n();
        aVar.mo34259a(C9569b.USER_UN_VOTED);
        try {
            n[50] = true;
            C9561a.m44674a(aVar);
            n[51] = true;
        } catch (JSONException e) {
            n[52] = true;
            e.printStackTrace();
            n[53] = true;
        }
        m44943l();
        n[54] = true;
        FeatureRequestsEventBus.getInstance().post(aVar);
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[55] = true;
        } else {
            n[56] = true;
            bVar.mo34385h();
            n[57] = true;
        }
        n[58] = true;
    }

    /* renamed from: a */
    public void mo34402a(C9567a aVar) {
        boolean[] n = m44945n();
        aVar.mo34259a(C9569b.USER_VOTED_UP);
        try {
            n[35] = true;
            C9561a.m44674a(aVar);
            n[36] = true;
        } catch (JSONException e) {
            n[37] = true;
            e.printStackTrace();
            n[38] = true;
        }
        m44943l();
        n[39] = true;
        FeatureRequestsEventBus.getInstance().post(aVar);
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[40] = true;
        } else {
            n[41] = true;
            bVar.mo34385h();
            n[42] = true;
        }
        n[43] = true;
    }

    /* renamed from: b */
    public void mo34404b() {
        boolean[] n = m44945n();
        C9603b bVar = this.f25430a;
        if (bVar == null) {
            n[103] = true;
        } else {
            n[104] = true;
            bVar.mo34380c();
            n[105] = true;
            mo34412h();
            n[106] = true;
        }
        n[107] = true;
    }

    /* renamed from: a */
    public void mo34401a(int i, C9598b bVar) {
        boolean[] n = m44945n();
        C9567a a = this.f25431b.mo34426a(i);
        n[89] = true;
        bVar.mo34373a(a.mo34275l());
        n[90] = true;
        bVar.mo34371a(a);
        n[91] = true;
        bVar.mo34369a(a.mo34265d());
        n[92] = true;
        bVar.mo34374b(a.mo34273j());
        n[93] = true;
        bVar.mo34370a(a.mo34269f());
        n[94] = true;
        bVar.mo34372a(Boolean.valueOf(a.mo34278o()));
        n[95] = true;
        bVar.mo34375b(a);
        n[96] = true;
    }

    /* renamed from: a */
    public void mo34400a() {
        boolean[] n = m44945n();
        mo34412h();
        n[102] = true;
    }
}
