package com.instabug.featuresrequest.p373ui.p377c;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.cache.C9561a;
import com.instabug.featuresrequest.eventbus.FeatureRequestsEventBus;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9569b;
import com.instabug.featuresrequest.models.C9575f;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.featuresrequest.p371d.p372a.C9562a;
import com.instabug.featuresrequest.p371d.p372a.C9565b;
import com.instabug.featuresrequest.p373ui.p377c.C9619b.C9620a;
import com.instabug.featuresrequest.p373ui.p377c.C9619b.C9621b;
import com.instabug.library.core.p382ui.BasePresenter;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.c.c */
/* compiled from: FeaturesRequestsDetailsPresenter */
public class C9622c extends BasePresenter<C9621b> implements C9565b<C9575f>, C9620a {

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25476c;

    /* renamed from: a */
    private final C9621b f25477a = ((C9621b) this.view.get());

    /* renamed from: b */
    private C9562a f25478b;

    public C9622c(C9621b bVar) {
        boolean[] e = m45024e();
        super(bVar);
        e[0] = true;
        e[1] = true;
        this.f25478b = C9562a.m44678a(((Fragment) bVar.getViewContext()).getContext());
        e[2] = true;
    }

    /* renamed from: b */
    private void m45021b(C9567a aVar) {
        boolean[] e = m45024e();
        aVar.mo34259a(C9569b.USER_VOTED_UP);
        try {
            e[18] = true;
            C9561a.m44674a(aVar);
            e[19] = true;
        } catch (JSONException e2) {
            e[20] = true;
            e2.printStackTrace();
            e[21] = true;
        }
        m45022c();
        e[22] = true;
        FeatureRequestsEventBus.getInstance().post(aVar);
        e[23] = true;
    }

    /* renamed from: c */
    private void m45022c() {
        boolean[] e = m45024e();
        Context context = ((Fragment) this.f25477a.getViewContext()).getContext();
        if (context == null) {
            e[24] = true;
        } else {
            e[25] = true;
            FeaturesRequestVoteService.m44769a(context, new Intent(context, FeaturesRequestVoteService.class));
            e[26] = true;
        }
        e[27] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45024e() {
        boolean[] zArr = f25476c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7915263344426914338L, "com/instabug/featuresrequest/ui/featuredetails/FeaturesRequestsDetailsPresenter", 44);
        f25476c = a;
        return a;
    }

    /* renamed from: a */
    public /* synthetic */ void mo34246a(Object obj) {
        boolean[] e = m45024e();
        mo34448a((C9575f) obj);
        e[43] = true;
    }

    /* renamed from: d */
    public void mo34449d() {
        boolean[] e = m45024e();
        C9621b bVar = this.f25477a;
        if (bVar == null) {
            e[3] = true;
        } else {
            e[4] = true;
            bVar.mo34439d();
            e[5] = true;
        }
        e[6] = true;
    }

    /* renamed from: a */
    public void mo34447a(C9567a aVar) {
        boolean[] e = m45024e();
        if (aVar.mo34278o()) {
            e[7] = true;
            aVar.mo34260a(false);
            e[8] = true;
            aVar.mo34261b(aVar.mo34273j() - 1);
            e[9] = true;
            m45023c(aVar);
            e[10] = true;
        } else {
            aVar.mo34260a(true);
            e[11] = true;
            aVar.mo34261b(aVar.mo34273j() + 1);
            e[12] = true;
            m45021b(aVar);
            e[13] = true;
        }
        C9621b bVar = this.f25477a;
        if (bVar == null) {
            e[14] = true;
        } else {
            e[15] = true;
            bVar.mo34435a(aVar);
            e[16] = true;
        }
        e[17] = true;
    }

    /* renamed from: c */
    private void m45023c(C9567a aVar) {
        boolean[] e = m45024e();
        aVar.mo34259a(C9569b.USER_UN_VOTED);
        try {
            e[28] = true;
            C9561a.m44674a(aVar);
            e[29] = true;
        } catch (JSONException e2) {
            e[30] = true;
            e2.printStackTrace();
            e[31] = true;
        }
        m45022c();
        e[32] = true;
        FeatureRequestsEventBus.getInstance().post(aVar);
        e[33] = true;
    }

    /* renamed from: a */
    public void mo34446a(long j) {
        boolean[] e = m45024e();
        this.f25478b.mo34240a(j, (C9565b<C9575f>) this);
        e[34] = true;
    }

    /* renamed from: a */
    public void mo34448a(C9575f fVar) {
        boolean[] e = m45024e();
        if (fVar.mo34313a() == null) {
            e[35] = true;
        } else if (fVar.mo34313a().size() <= 0) {
            e[36] = true;
        } else {
            e[37] = true;
            this.f25477a.mo34436a(fVar);
            e[38] = true;
            this.f25477a.mo34440e();
            e[39] = true;
            e[41] = true;
        }
        this.f25477a.mo34437c();
        e[40] = true;
        e[41] = true;
    }

    /* renamed from: a */
    public void mo34247a(Throwable th) {
        boolean[] e = m45024e();
        th.printStackTrace();
        e[42] = true;
    }
}
