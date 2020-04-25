package com.instabug.survey.network.service;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.Survey.SurveyState;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugSurveysSubmitterService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26833a;

    /* renamed from: com.instabug.survey.network.service.InstabugSurveysSubmitterService$a */
    class C10088a implements Callbacks<Boolean, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26834c;

        /* renamed from: a */
        final /* synthetic */ Survey f26835a;

        /* renamed from: b */
        final /* synthetic */ InstabugSurveysSubmitterService f26836b;

        C10088a(InstabugSurveysSubmitterService instabugSurveysSubmitterService, Survey survey) {
            boolean[] a = m46935a();
            this.f26836b = instabugSurveysSubmitterService;
            this.f26835a = survey;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46935a() {
            boolean[] zArr = f26834c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6835847320671857715L, "com/instabug/survey/network/service/InstabugSurveysSubmitterService$1", 10);
            f26834c = a;
            return a;
        }

        /* renamed from: a */
        public void mo36228a(Boolean bool) {
            boolean[] a = m46935a();
            this.f26835a.setSurveyState(SurveyState.SYNCED);
            a[1] = true;
            if (!this.f26835a.isLastEventSubmit()) {
                a[2] = true;
            } else {
                a[3] = true;
                this.f26835a.clearAnswers();
                a[4] = true;
            }
            this.f26835a.getSurveyEvents().clear();
            a[5] = true;
            SurveysCacheManager.saveCacheToDisk();
            a[6] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m46935a();
            mo36229a((Throwable) obj);
            a[8] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m46935a();
            mo36228a((Boolean) obj);
            a[9] = true;
        }

        /* renamed from: a */
        public void mo36229a(Throwable th) {
            boolean[] a = m46935a();
            InstabugSDKLogger.m46624e(this, th.getMessage(), th);
            a[7] = true;
        }
    }

    public InstabugSurveysSubmitterService() {
        m46934b()[0] = true;
    }

    /* renamed from: a */
    public static void m46933a(Context context, Intent intent) {
        boolean[] b = m46934b();
        C9969b.enqueueInstabugWork(context, InstabugSurveysSubmitterService.class, 2581, intent);
        b[1] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46934b() {
        boolean[] zArr = f26833a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4161301670856517737L, "com/instabug/survey/network/service/InstabugSurveysSubmitterService", 11);
        f26833a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] b = m46934b();
        InstabugSDKLogger.m46622d(this, "runBackgroundTask started");
        b[2] = true;
        m46932a();
        b[3] = true;
    }

    /* renamed from: a */
    private void m46932a() throws IOException, JSONException {
        boolean[] b = m46934b();
        InstabugSDKLogger.m46622d(this, "submitSurveys started");
        b[4] = true;
        List<Survey> readyToSendSurveys = SurveysCacheManager.getReadyToSendSurveys();
        b[5] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("ready to send surveys size: ");
        sb.append(readyToSendSurveys.size());
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[6] = true;
        b[7] = true;
        for (Survey survey : readyToSendSurveys) {
            b[8] = true;
            C10089a.m46938a().mo36231a(this, survey, new C10088a(this, survey));
            b[9] = true;
        }
        b[10] = true;
    }
}
