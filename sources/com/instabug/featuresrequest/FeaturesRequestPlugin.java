package com.instabug.featuresrequest;

import android.content.Context;
import android.content.Intent;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.featuresrequest.p369b.C9537c;
import com.instabug.featuresrequest.p370c.C9541d;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Session;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeaturesRequestPlugin extends Plugin {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private C12314c disposable;

    /* renamed from: com.instabug.featuresrequest.FeaturesRequestPlugin$a */
    class C9524a implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25214b;

        /* renamed from: a */
        final /* synthetic */ FeaturesRequestPlugin f25215a;

        C9524a(FeaturesRequestPlugin featuresRequestPlugin) {
            boolean[] a = m44602a();
            this.f25215a = featuresRequestPlugin;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44602a() {
            boolean[] zArr = f25214b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-334214682455979776L, "com/instabug/featuresrequest/FeaturesRequestPlugin$1", 12);
            f25214b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34213a(SDKCoreEvent sDKCoreEvent) {
            boolean[] a = m44602a();
            if (!C9541d.m44636a()) {
                a[1] = true;
            } else {
                a[2] = true;
                String type = sDKCoreEvent.getType();
                char c = 65535;
                if (type.hashCode() != 1984987798) {
                    a[3] = true;
                } else if (!type.equals("session")) {
                    a[4] = true;
                } else {
                    c = 0;
                    a[5] = true;
                }
                if (c != 0) {
                    a[6] = true;
                } else if (!sDKCoreEvent.getValue().equals(Session.VALUE_STARTED)) {
                    a[7] = true;
                } else {
                    a[8] = true;
                    FeaturesRequestPlugin.access$000(this.f25215a);
                    a[9] = true;
                }
            }
            a[10] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m44602a();
            mo34213a((SDKCoreEvent) obj);
            a[11] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5962867906367628765L, "com/instabug/featuresrequest/FeaturesRequestPlugin", 15);
        $jacocoData = a;
        return a;
    }

    public FeaturesRequestPlugin() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ void access$000(FeaturesRequestPlugin featuresRequestPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        featuresRequestPlugin.submitPendingVotes();
        $jacocoInit[14] = true;
    }

    private void submitPendingVotes() {
        boolean[] $jacocoInit = $jacocoInit();
        Context context = (Context) this.contextWeakReference.get();
        if (context == null) {
            $jacocoInit[10] = true;
        } else {
            $jacocoInit[11] = true;
            FeaturesRequestVoteService.m44769a(context, new Intent(context, FeaturesRequestVoteService.class));
            $jacocoInit[12] = true;
        }
        $jacocoInit[13] = true;
    }

    private void subscribeOnSDKEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        this.disposable = SDKCoreEventSubscriber.subscribe(new C9524a(this));
        $jacocoInit[9] = true;
    }

    public long getLastActivityTime() {
        $jacocoInit()[8] = true;
        return 0;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super.init(context);
        $jacocoInit[1] = true;
        subscribeOnSDKEvents();
        $jacocoInit[2] = true;
        C9537c.m44625a(context);
        $jacocoInit[3] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.disposable.mo41878d()) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            this.disposable.dispose();
            $jacocoInit[6] = true;
        }
        $jacocoInit[7] = true;
    }
}
