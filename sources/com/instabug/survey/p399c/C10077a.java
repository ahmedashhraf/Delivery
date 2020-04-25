package com.instabug.survey.p399c;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.survey.C10060a.C10064d;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.C10086c;
import com.instabug.survey.models.Survey;
import com.instabug.survey.network.service.C10089a;
import com.instabug.survey.p398b.C10070f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.c.a */
/* compiled from: SurveysFetcher */
public class C10077a {

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f26810b;

    /* renamed from: a */
    private C10079b f26811a;

    /* renamed from: com.instabug.survey.c.a$a */
    /* compiled from: SurveysFetcher */
    class C10078a implements Callbacks<JSONObject, Throwable> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26812b;

        /* renamed from: a */
        final /* synthetic */ C10077a f26813a;

        C10078a(C10077a aVar) {
            boolean[] a = m46883a();
            this.f26813a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46883a() {
            boolean[] zArr = f26812b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5315949768822525240L, "com/instabug/survey/network/SurveysFetcher$1", 12);
            f26812b = a;
            return a;
        }

        /* renamed from: a */
        public void mo36152a(JSONObject jSONObject) {
            boolean[] a = m46883a();
            try {
                C10064d.m46813a(System.currentTimeMillis());
                a[1] = true;
                List fromJson = Survey.fromJson(jSONObject);
                a[2] = true;
                List pausedSurveysFromJson = Survey.getPausedSurveysFromJson(jSONObject);
                a[3] = true;
                fromJson.addAll(pausedSurveysFromJson);
                a[4] = true;
                C10077a.m46879a(this.f26813a).mo36105a(fromJson);
                a[5] = true;
            } catch (JSONException e) {
                a[6] = true;
                C10077a.m46879a(this.f26813a).mo36104a((Throwable) e);
                a[7] = true;
            }
            a[8] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m46883a();
            mo36151a((Throwable) obj);
            a[10] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m46883a();
            mo36152a((JSONObject) obj);
            a[11] = true;
        }

        /* renamed from: a */
        public void mo36151a(Throwable th) {
            boolean[] a = m46883a();
            C10077a.m46879a(this.f26813a).mo36104a(th);
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.survey.c.a$b */
    /* compiled from: SurveysFetcher */
    public interface C10079b {
        /* renamed from: a */
        void mo36104a(Throwable th);

        /* renamed from: a */
        void mo36105a(List<Survey> list);
    }

    /* renamed from: com.instabug.survey.c.a$c */
    /* compiled from: SubmittingSurveysUtil */
    public class C10080c {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26814a;

        /* renamed from: a */
        public static void m46889a(Request request, Survey survey) throws JSONException {
            boolean[] a = m46890a();
            if (survey.isLastEventDismiss()) {
                a[1] = true;
            } else {
                a[2] = true;
                JSONArray a2 = m46888a(survey.getQuestions());
                a[3] = true;
                if (a2.length() <= 0) {
                    a[4] = true;
                } else {
                    a[5] = true;
                    request.mo35528a("responses", a2);
                    a[6] = true;
                }
            }
            request.mo35528a("responded_at", Long.valueOf(survey.getRespondedAt()));
            a[7] = true;
            request.mo35528a("name", InstabugCore.getIdentifiedUsername());
            a[8] = true;
            request.mo35528a("email", Instabug.getUserEmail());
            a[9] = true;
            request.mo35528a("events", m46891b(survey.getSurveyEvents()));
            a[10] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46890a() {
            boolean[] zArr = f26814a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8774713382381387334L, "com/instabug/survey/network/util/SubmittingSurveysUtil", 31);
            f26814a = a;
            return a;
        }

        /* renamed from: b */
        private static JSONArray m46891b(ArrayList<C10086c> arrayList) throws JSONException {
            boolean[] a = m46890a();
            JSONArray jSONArray = new JSONArray();
            a[11] = true;
            Iterator it = arrayList.iterator();
            a[12] = true;
            while (it.hasNext()) {
                C10086c cVar = (C10086c) it.next();
                a[13] = true;
                JSONObject jSONObject = new JSONObject();
                a[14] = true;
                jSONObject.put("event_type", cVar.mo36221a());
                a[15] = true;
                jSONObject.put("timestamp", cVar.mo36225d());
                a[16] = true;
                jSONObject.put(C5854b.f16918Y, cVar.mo36226e());
                a[17] = true;
                jSONArray.put(jSONObject);
                a[18] = true;
            }
            a[19] = true;
            return jSONArray;
        }

        /* renamed from: a */
        public static JSONArray m46888a(ArrayList<C10084b> arrayList) throws JSONException {
            boolean[] a = m46890a();
            JSONArray jSONArray = new JSONArray();
            a[20] = true;
            Iterator it = arrayList.iterator();
            a[21] = true;
            while (it.hasNext()) {
                C10084b bVar = (C10084b) it.next();
                a[22] = true;
                if (bVar.mo36218g() == null) {
                    a[23] = true;
                } else {
                    a[24] = true;
                    JSONObject jSONObject = new JSONObject();
                    a[25] = true;
                    jSONObject.put("value", bVar.mo36218g());
                    a[26] = true;
                    jSONObject.put("question_id", bVar.mo36209a());
                    a[27] = true;
                    jSONArray.put(jSONObject);
                    a[28] = true;
                }
                a[29] = true;
            }
            a[30] = true;
            return jSONArray;
        }
    }

    public C10077a(C10079b bVar) {
        boolean[] b = m46881b();
        this.f26811a = bVar;
        b[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C10079b m46879a(C10077a aVar) {
        boolean[] b = m46881b();
        C10079b bVar = aVar.f26811a;
        b[10] = true;
        return bVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46881b() {
        boolean[] zArr = f26810b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4894916276480384187L, "com/instabug/survey/network/SurveysFetcher", 11);
        f26810b = a;
        return a;
    }

    /* renamed from: a */
    public void mo36150a(Context context) throws JSONException {
        boolean[] b = m46881b();
        if (!m46880a()) {
            b[1] = true;
        } else {
            b[2] = true;
            if (!C10070f.m46838b()) {
                b[3] = true;
            } else {
                b[4] = true;
                if (System.currentTimeMillis() - C10064d.m46822e() <= 10000) {
                    b[5] = true;
                } else {
                    b[6] = true;
                    C10089a.m46938a().mo36230a(context, new C10078a(this));
                    b[7] = true;
                }
            }
        }
        b[8] = true;
    }

    /* renamed from: a */
    private boolean m46880a() {
        boolean[] b = m46881b();
        boolean isFeaturesFetchedBefore = InstabugCore.isFeaturesFetchedBefore();
        b[9] = true;
        return isFeaturesFetchedBefore;
    }
}
