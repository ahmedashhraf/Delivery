package com.instabug.featuresrequest.p373ui.p379e;

import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.C9525R;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.network.service.C9578a;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.e.c */
/* compiled from: AddNewFeaturePresenter */
public class C9691c extends BasePresenter<C9680b> implements C9679a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f25675b;

    /* renamed from: a */
    private final C9680b f25676a = ((C9680b) this.view.get());

    /* renamed from: com.instabug.featuresrequest.ui.e.c$a */
    /* compiled from: AddNewFeaturePresenter */
    class C9692a implements Callbacks<Boolean, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25677c;

        /* renamed from: a */
        final /* synthetic */ C9567a f25678a;

        /* renamed from: b */
        final /* synthetic */ C9691c f25679b;

        C9692a(C9691c cVar, C9567a aVar) {
            boolean[] a = m45280a();
            this.f25679b = cVar;
            this.f25678a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45280a() {
            boolean[] zArr = f25677c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(444683227209587129L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeaturePresenter$1", 11);
            f25677c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34583a(Boolean bool) {
            boolean[] a = m45280a();
            C9691c cVar = this.f25679b;
            StringBuilder sb = new StringBuilder();
            sb.append("featureRequest ");
            sb.append(this.f25678a);
            sb.append(" synced successfully");
            InstabugSDKLogger.m46622d(cVar, sb.toString());
            a[1] = true;
            C9691c.m45273a(this.f25679b).mo34564e();
            a[2] = true;
            C9691c.m45273a(this.f25679b).mo34563d();
            a[3] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m45280a();
            mo34584a((Throwable) obj);
            a[9] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m45280a();
            mo34583a((Boolean) obj);
            a[10] = true;
        }

        /* renamed from: a */
        public void mo34584a(Throwable th) {
            boolean[] a = m45280a();
            C9691c cVar = this.f25679b;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while sending featureRequest: ");
            sb.append(this.f25678a);
            InstabugSDKLogger.m46622d(cVar, sb.toString());
            a[4] = true;
            C9691c.m45273a(this.f25679b).mo34564e();
            a[5] = true;
            C9680b a2 = C9691c.m45273a(this.f25679b);
            Fragment fragment = (Fragment) C9691c.m45273a(this.f25679b).getViewContext();
            int i = C9525R.string.feature_request_str_add_comment_error;
            a[6] = true;
            String string = fragment.getString(i);
            a[7] = true;
            a2.mo34558a(string);
            a[8] = true;
        }
    }

    public C9691c(C9680b bVar) {
        boolean[] h = m45275h();
        super(bVar);
        h[0] = true;
        C9680b bVar2 = this.f25676a;
        if (bVar2 == null) {
            h[1] = true;
        } else {
            h[2] = true;
            bVar2.mo34562c(mo34579c());
            h[3] = true;
            this.f25676a.mo34560b(mo34581e());
            h[4] = true;
        }
        h[5] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9680b m45273a(C9691c cVar) {
        boolean[] h = m45275h();
        C9680b bVar = cVar.f25676a;
        h[38] = true;
        return bVar;
    }

    /* renamed from: g */
    private void m45274g() {
        boolean[] h = m45275h();
        C9680b bVar = this.f25676a;
        if (bVar == null) {
            h[25] = true;
        } else {
            h[26] = true;
            InstabugCore.setEnteredEmail(bVar.mo34567h());
            h[27] = true;
            InstabugCore.setEnteredUsername(this.f25676a.mo34568i());
            h[28] = true;
            this.f25676a.mo34561c();
            h[29] = true;
            C9567a aVar = new C9567a();
            h[30] = true;
            aVar.mo34268e(this.f25676a.mo34565f());
            h[31] = true;
            aVar.mo34266d(this.f25676a.mo34566g());
            try {
                h[32] = true;
                C9578a.m44776a().mo34319a(Instabug.getApplicationContext(), aVar, new C9692a(this, aVar));
                h[33] = true;
            } catch (JSONException unused) {
                h[34] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("JsonException while sending featureRequest: ");
                sb.append(aVar);
                InstabugSDKLogger.m46622d(this, sb.toString());
                h[35] = true;
                this.f25676a.mo34558a("Something went wrong");
                h[36] = true;
            }
        }
        h[37] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m45275h() {
        boolean[] zArr = f25675b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5991755168389220694L, "com/instabug/featuresrequest/ui/newfeature/AddNewFeaturePresenter", 39);
        f25675b = a;
        return a;
    }

    /* renamed from: c */
    public String mo34579c() {
        boolean[] h = m45275h();
        String enteredEmail = InstabugCore.getEnteredEmail();
        h[17] = true;
        return enteredEmail;
    }

    /* renamed from: d */
    public void mo34580d() {
        boolean[] h = m45275h();
        C9680b bVar = this.f25676a;
        if (bVar == null) {
            h[6] = true;
        } else if (bVar.mo34565f() == null) {
            h[7] = true;
        } else {
            h[8] = true;
            if (C9535a.m44611c().mo34220a()) {
                h[9] = true;
            } else {
                C9680b bVar2 = this.f25676a;
                h[10] = true;
                if (bVar2.mo34567h().length() > 0) {
                    h[11] = true;
                } else {
                    m45274g();
                    h[15] = true;
                }
            }
            if (this.f25676a.mo34569j() == null) {
                h[12] = true;
            } else {
                h[13] = true;
                m45274g();
                h[14] = true;
            }
        }
        h[16] = true;
    }

    /* renamed from: e */
    public String mo34581e() {
        boolean[] h = m45275h();
        String enteredUsername = InstabugCore.getEnteredUsername();
        h[18] = true;
        return enteredUsername;
    }

    /* renamed from: f */
    public void mo34582f() {
        boolean[] h = m45275h();
        if (this.f25676a == null) {
            h[19] = true;
        } else {
            h[20] = true;
            if (C9535a.m44611c().mo34220a()) {
                h[21] = true;
                this.f25676a.mo34559a(true);
                h[22] = true;
            } else {
                this.f25676a.mo34559a(false);
                h[23] = true;
            }
        }
        h[24] = true;
    }
}
