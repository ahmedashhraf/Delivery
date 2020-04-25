package com.instabug.survey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugState;
import com.instabug.library.PresentationManager;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p398b.C10070f;
import com.instabug.survey.p398b.C10073g;
import com.instabug.survey.p399c.C10077a;
import com.instabug.survey.p399c.C10077a.C10079b;
import com.instabug.survey.p400ui.SurveyActivity;
import java.lang.ref.WeakReference;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.survey.a */
/* compiled from: SurveysManager */
public class C10060a implements C10079b {

    /* renamed from: d */
    private static C10060a f26774d;

    /* renamed from: e */
    private static transient /* synthetic */ boolean[] f26775e;

    /* renamed from: a */
    private WeakReference<Context> f26776a;

    /* renamed from: b */
    private C10077a f26777b = new C10077a(this);

    /* renamed from: c */
    private C10073g f26778c;

    /* renamed from: com.instabug.survey.a$a */
    /* compiled from: SurveysManager */
    class C10061a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26779N;

        /* renamed from: a */
        final /* synthetic */ Survey f26780a;

        /* renamed from: b */
        final /* synthetic */ C10060a f26781b;

        C10061a(C10060a aVar, Survey survey) {
            boolean[] a = m46790a();
            this.f26781b = aVar;
            this.f26780a = survey;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46790a() {
            boolean[] zArr = f26779N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1445298635144601518L, "com/instabug/survey/SurveysManager$1", 18);
            f26779N = a;
            return a;
        }

        public void run() {
            boolean[] a = m46790a();
            C10070f.m46839c();
            a[1] = true;
            InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
            a[2] = true;
            Activity targetActivity = instance.getTargetActivity();
            if (targetActivity == null) {
                a[3] = true;
            } else {
                a[4] = true;
                if (!this.f26780a.isOptInSurvey()) {
                    a[5] = true;
                } else if (this.f26780a.getSurveyEvents() == null) {
                    a[6] = true;
                } else {
                    Survey survey = this.f26780a;
                    a[7] = true;
                    if (survey.getSurveyEvents().size() <= 0) {
                        a[8] = true;
                    } else {
                        Survey survey2 = this.f26780a;
                        a[9] = true;
                        if (survey2.isLastEventDismiss()) {
                            a[10] = true;
                        } else {
                            a[11] = true;
                            this.f26780a.clearAnswers();
                            a[12] = true;
                        }
                    }
                }
                this.f26780a.addShowEvent();
                a[13] = true;
                Intent intent = new Intent(targetActivity, SurveyActivity.class);
                a[14] = true;
                intent.putExtra("survey", this.f26780a);
                a[15] = true;
                targetActivity.startActivity(intent);
                a[16] = true;
            }
            a[17] = true;
        }
    }

    /* renamed from: com.instabug.survey.a$b */
    /* compiled from: PerSessionSettings */
    public class C10062b {

        /* renamed from: f */
        private static C10062b f26782f;

        /* renamed from: g */
        private static transient /* synthetic */ boolean[] f26783g;

        /* renamed from: a */
        private StringBuilder f26784a;

        /* renamed from: b */
        private boolean f26785b = true;

        /* renamed from: c */
        private boolean f26786c = false;

        /* renamed from: d */
        private OnShowCallback f26787d;

        /* renamed from: e */
        private OnDismissCallback f26788e;

        private C10062b() {
            boolean[] g = m46793g();
            g[0] = true;
            this.f26784a = new StringBuilder();
            g[1] = true;
        }

        /* renamed from: e */
        public static void m46791e() {
            boolean[] g = m46793g();
            f26782f = new C10062b();
            g[2] = true;
        }

        /* renamed from: f */
        public static C10062b m46792f() {
            boolean[] g = m46793g();
            C10062b bVar = f26782f;
            g[3] = true;
            return bVar;
        }

        /* renamed from: g */
        private static /* synthetic */ boolean[] m46793g() {
            boolean[] zArr = f26783g;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9217385835977238632L, "com/instabug/survey/settings/PerSessionSettings", 13);
            f26783g = a;
            return a;
        }

        /* renamed from: a */
        public void mo36115a(boolean z) {
            boolean[] g = m46793g();
            this.f26785b = z;
            g[5] = true;
        }

        /* renamed from: b */
        public OnShowCallback mo36117b() {
            boolean[] g = m46793g();
            OnShowCallback onShowCallback = this.f26787d;
            g[7] = true;
            return onShowCallback;
        }

        /* renamed from: c */
        public OnDismissCallback mo36119c() {
            boolean[] g = m46793g();
            OnDismissCallback onDismissCallback = this.f26788e;
            g[9] = true;
            return onDismissCallback;
        }

        /* renamed from: d */
        public boolean mo36120d() {
            boolean[] g = m46793g();
            boolean z = this.f26786c;
            g[12] = true;
            return z;
        }

        /* renamed from: b */
        public void mo36118b(boolean z) {
            boolean[] g = m46793g();
            this.f26786c = z;
            g[11] = true;
        }

        /* renamed from: a */
        public boolean mo36116a() {
            boolean[] g = m46793g();
            boolean z = this.f26785b;
            g[6] = true;
            return z;
        }

        /* renamed from: a */
        public void mo36114a(OnShowCallback onShowCallback) {
            boolean[] g = m46793g();
            this.f26787d = onShowCallback;
            g[8] = true;
        }

        /* renamed from: a */
        public void mo36113a(OnDismissCallback onDismissCallback) {
            boolean[] g = m46793g();
            this.f26788e = onDismissCallback;
            g[10] = true;
        }
    }

    /* renamed from: com.instabug.survey.a$c */
    /* compiled from: PersistableSettings */
    public class C10063c {

        /* renamed from: c */
        private static C10063c f26789c;

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26790d;

        /* renamed from: a */
        private SharedPreferences f26791a;

        /* renamed from: b */
        private Editor f26792b = this.f26791a.edit();

        private C10063c(Context context) {
            boolean[] f = m46804f();
            f[0] = true;
            this.f26791a = context.getSharedPreferences("instabug_survey", 0);
            f[1] = true;
            f[2] = true;
        }

        /* renamed from: a */
        public static void m46802a(Context context) {
            boolean[] f = m46804f();
            f26789c = new C10063c(context);
            f[3] = true;
        }

        /* renamed from: e */
        public static C10063c m46803e() {
            boolean[] f = m46804f();
            C10063c cVar = f26789c;
            f[4] = true;
            return cVar;
        }

        /* renamed from: f */
        private static /* synthetic */ boolean[] m46804f() {
            boolean[] zArr = f26790d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1038444357616949798L, "com/instabug/survey/settings/PersistableSettings", 16);
            f26790d = a;
            return a;
        }

        /* renamed from: b */
        public void mo36125b(long j) {
            boolean[] f = m46804f();
            this.f26792b.putLong("survey_last_fetch_time", j);
            f[8] = true;
            this.f26792b.apply();
            f[9] = true;
        }

        /* renamed from: c */
        public int mo36126c() {
            boolean[] f = m46804f();
            int i = this.f26791a.getInt("survey_reshow_after_session_count", 4);
            f[14] = true;
            return i;
        }

        /* renamed from: d */
        public int mo36127d() {
            boolean[] f = m46804f();
            int i = this.f26791a.getInt("survey_reshow_after_days_count", 4);
            f[15] = true;
            return i;
        }

        /* renamed from: a */
        public void mo36123a(long j) {
            boolean[] f = m46804f();
            this.f26792b.putLong("last_survey_time", j);
            f[5] = true;
            this.f26792b.apply();
            f[6] = true;
        }

        /* renamed from: b */
        public long mo36124b() {
            boolean[] f = m46804f();
            long j = this.f26791a.getLong("survey_last_fetch_time", 0);
            f[10] = true;
            return j;
        }

        /* renamed from: a */
        public long mo36121a() {
            boolean[] f = m46804f();
            long j = this.f26791a.getLong("last_survey_time", 0);
            f[7] = true;
            return j;
        }

        /* renamed from: a */
        public void mo36122a(int i, int i2) {
            boolean[] f = m46804f();
            this.f26792b.putInt("survey_reshow_after_session_count", i);
            f[11] = true;
            this.f26792b.putInt("survey_reshow_after_days_count", i2);
            f[12] = true;
            this.f26792b.apply();
            f[13] = true;
        }
    }

    /* renamed from: com.instabug.survey.a$d */
    /* compiled from: SurveysSettings */
    public class C10064d {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26793a;

        /* renamed from: a */
        public static void m46816a(boolean z) {
            boolean[] g = m46824g();
            C10062b.m46792f().mo36115a(z);
            g[1] = true;
        }

        /* renamed from: b */
        public static OnShowCallback m46818b() {
            boolean[] g = m46824g();
            OnShowCallback b = C10062b.m46792f().mo36117b();
            g[3] = true;
            return b;
        }

        /* renamed from: c */
        public static OnDismissCallback m46820c() {
            boolean[] g = m46824g();
            OnDismissCallback c = C10062b.m46792f().mo36119c();
            g[5] = true;
            return c;
        }

        /* renamed from: d */
        public static Boolean m46821d() {
            boolean[] g = m46824g();
            Boolean valueOf = Boolean.valueOf(C10062b.m46792f().mo36120d());
            g[8] = true;
            return valueOf;
        }

        /* renamed from: e */
        public static long m46822e() {
            boolean[] g = m46824g();
            long b = C10063c.m46803e().mo36124b();
            g[12] = true;
            return b;
        }

        /* renamed from: f */
        public static int m46823f() {
            boolean[] g = m46824g();
            int c = C10063c.m46803e().mo36126c();
            g[14] = true;
            return c;
        }

        /* renamed from: g */
        private static /* synthetic */ boolean[] m46824g() {
            boolean[] zArr = f26793a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1137128458892665253L, "com/instabug/survey/settings/SurveysSettings", 16);
            f26793a = a;
            return a;
        }

        /* renamed from: b */
        public static void m46819b(boolean z) {
            boolean[] g = m46824g();
            C10062b.m46792f().mo36118b(z);
            g[7] = true;
        }

        /* renamed from: a */
        public static boolean m46817a() {
            boolean[] g = m46824g();
            boolean a = C10062b.m46792f().mo36116a();
            g[2] = true;
            return a;
        }

        /* renamed from: a */
        public static void m46815a(OnShowCallback onShowCallback) {
            boolean[] g = m46824g();
            C10062b.m46792f().mo36114a(onShowCallback);
            g[4] = true;
        }

        /* renamed from: a */
        public static void m46814a(OnDismissCallback onDismissCallback) {
            boolean[] g = m46824g();
            C10062b.m46792f().mo36113a(onDismissCallback);
            g[6] = true;
        }

        /* renamed from: a */
        public static void m46813a(long j) {
            boolean[] g = m46824g();
            C10063c.m46803e().mo36125b(j);
            g[11] = true;
        }

        /* renamed from: a */
        public static void m46812a(int i, int i2) {
            boolean[] g = m46824g();
            C10063c.m46803e().mo36122a(i, i2);
            g[13] = true;
        }
    }

    private C10060a(Context context) {
        boolean[] g = m46779g();
        g[0] = true;
        this.f26776a = new WeakReference<>(context);
        g[1] = true;
        g[2] = true;
        String appVersion = InstabugDeviceProperties.getAppVersion(context);
        g[3] = true;
        this.f26778c = new C10073g(appVersion, InstabugDeviceProperties.getAppVersionName(context));
        g[4] = true;
    }

    /* renamed from: a */
    public static C10060a m46770a(Context context) {
        boolean[] g = m46779g();
        if (f26774d != null) {
            g[6] = true;
        } else {
            g[7] = true;
            m46773b(context);
            g[8] = true;
        }
        C10060a aVar = f26774d;
        g[9] = true;
        return aVar;
    }

    /* renamed from: b */
    private static void m46773b(Context context) {
        boolean[] g = m46779g();
        f26774d = new C10060a(context);
        g[5] = true;
    }

    @C0195i0
    /* renamed from: c */
    private Survey m46775c(String str) {
        boolean[] g = m46779g();
        List<Survey> surveys = SurveysCacheManager.getSurveys();
        g[44] = true;
        g[45] = true;
        for (Survey survey : surveys) {
            g[46] = true;
            if (survey.getToken() == null) {
                g[47] = true;
            } else if (!survey.getToken().equals(str)) {
                g[48] = true;
            } else {
                g[49] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("Showing survey With token ");
                sb.append(str);
                InstabugSDKLogger.m46625i(this, sb.toString());
                g[50] = true;
                return survey;
            }
            g[51] = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("No Survey With token ");
        sb2.append(str);
        InstabugSDKLogger.m46625i(this, sb2.toString());
        g[52] = true;
        return null;
    }

    /* renamed from: f */
    private Survey m46778f() throws ParseException {
        boolean[] g = m46779g();
        Survey a = this.f26778c.mo36132a();
        g[107] = true;
        return a;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46779g() {
        boolean[] zArr = f26775e;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4728381226650919397L, "com/instabug/survey/SurveysManager", C13959t.f40819N1);
        f26775e = a;
        return a;
    }

    /* renamed from: d */
    public void mo36110d() {
        boolean[] g = m46779g();
        List<Survey> surveys = SurveysCacheManager.getSurveys();
        g[114] = true;
        g[115] = true;
        for (Survey survey : surveys) {
            g[116] = true;
            if (!survey.isCancelled()) {
                g[117] = true;
            } else if (!survey.shouldShowAgain()) {
                g[118] = true;
            } else {
                g[119] = true;
                survey.incrementSessionCount();
                g[120] = true;
            }
            g[121] = true;
        }
        SurveysCacheManager.addSurveys(surveys);
        g[122] = true;
    }

    /* renamed from: e */
    public List<Survey> mo36111e() {
        boolean[] g = m46779g();
        List<Survey> c = this.f26778c.mo36144c();
        g[124] = true;
        return c;
    }

    /* renamed from: b */
    public boolean mo36107b() {
        boolean[] g = m46779g();
        if (Instabug.isEnabled()) {
            g[16] = true;
            try {
                if (!Instabug.getState().equals(InstabugState.ENABLED)) {
                    g[19] = true;
                } else {
                    g[20] = true;
                    if (!C10070f.m46838b()) {
                        g[21] = true;
                    } else {
                        g[22] = true;
                        if (!Instabug.isAppOnForeground()) {
                            g[23] = true;
                        } else {
                            g[24] = true;
                            Survey f = m46778f();
                            if (f == null) {
                                g[25] = true;
                                g[28] = true;
                                return false;
                            }
                            g[26] = true;
                            m46774b(f);
                            g[27] = true;
                            return true;
                        }
                    }
                }
                g[29] = true;
                return false;
            } catch (ParseException e) {
                g[30] = true;
                InstabugSDKLogger.m46624e(C10077a.class.getAnnotations(), e.getMessage(), e);
                g[31] = true;
                return false;
            }
        } else {
            g[17] = true;
            InstabugSDKLogger.m46622d(C10060a.class, "Instabug SDK is disabled.");
            g[18] = true;
            return false;
        }
    }

    /* renamed from: a */
    public void mo36102a() {
        boolean[] g = m46779g();
        if (this.f26776a.get() == null) {
            g[10] = true;
        } else {
            try {
                g[11] = true;
                this.f26777b.mo36150a((Context) this.f26776a.get());
                g[12] = true;
            } catch (JSONException e) {
                g[13] = true;
                InstabugSDKLogger.m46624e(C10077a.class.getAnnotations(), e.getMessage(), e);
                g[14] = true;
            }
        }
        g[15] = true;
    }

    /* renamed from: a */
    public boolean mo36106a(String str) {
        boolean[] g = m46779g();
        if (!Instabug.getState().equals(InstabugState.ENABLED)) {
            g[32] = true;
        } else {
            g[33] = true;
            if (!C10070f.m46838b()) {
                g[34] = true;
            } else {
                g[35] = true;
                if (!Instabug.isAppOnForeground()) {
                    g[36] = true;
                } else {
                    g[37] = true;
                    Survey c = m46775c(str);
                    g[38] = true;
                    if (c == null) {
                        g[39] = true;
                    } else if (c.isPaused()) {
                        g[40] = true;
                    } else {
                        g[41] = true;
                        m46774b(c);
                        g[42] = true;
                        return true;
                    }
                }
            }
        }
        g[43] = true;
        return false;
    }

    /* renamed from: c */
    public boolean mo36109c() {
        boolean[] g = m46779g();
        boolean z = false;
        try {
            if (!Instabug.getState().equals(InstabugState.ENABLED)) {
                g[53] = true;
            } else {
                g[54] = true;
                if (!C10070f.m46838b()) {
                    g[55] = true;
                } else {
                    C10073g gVar = this.f26778c;
                    g[56] = true;
                    if (!gVar.mo36141b()) {
                        g[57] = true;
                    } else {
                        g[58] = true;
                        z = true;
                        g[60] = true;
                        return z;
                    }
                }
            }
            g[59] = true;
            g[60] = true;
            return z;
        } catch (ParseException e) {
            g[61] = true;
            InstabugSDKLogger.m46624e(C10077a.class.getAnnotations(), e.getMessage(), e);
            g[62] = true;
            return false;
        }
    }

    /* renamed from: c */
    private void m46777c(List<Survey> list) {
        boolean[] g = m46779g();
        InMemoryCache cache = SurveysCacheManager.getCache();
        if (cache == null) {
            g[103] = true;
        } else {
            g[104] = true;
            cache.invalidate();
            g[105] = true;
        }
        SurveysCacheManager.addSurveys(list);
        g[106] = true;
    }

    /* renamed from: a */
    public void mo36105a(List<Survey> list) {
        boolean[] g = m46779g();
        List b = m46772b(list);
        g[63] = true;
        m46777c(b);
        g[64] = true;
        if (Instabug.isEnabled()) {
            g[65] = true;
            try {
                Thread.sleep(10000);
                g[68] = true;
                if (!C10064d.m46817a()) {
                    g[69] = true;
                } else {
                    g[70] = true;
                    if (!Instabug.isAppOnForeground()) {
                        g[71] = true;
                    } else {
                        g[72] = true;
                        Survey f = m46778f();
                        if (f == null) {
                            g[73] = true;
                        } else {
                            g[74] = true;
                            m46774b(f);
                            g[75] = true;
                        }
                    }
                }
                g[76] = true;
            } catch (InterruptedException | ParseException e) {
                g[77] = true;
                InstabugSDKLogger.m46624e(C10077a.class.getAnnotations(), e.getMessage(), e);
                g[78] = true;
            }
            g[79] = true;
            return;
        }
        g[66] = true;
        InstabugSDKLogger.m46622d(C10060a.class, "Instabug SDK is disabled.");
        g[67] = true;
    }

    /* renamed from: b */
    private List<Survey> m46772b(List<Survey> list) {
        boolean[] g = m46779g();
        ArrayList arrayList = new ArrayList();
        g[81] = true;
        g[82] = true;
        for (Survey survey : list) {
            g[83] = true;
            if (m46771a(survey)) {
                g[84] = true;
                InMemoryCache cache = SurveysCacheManager.getCache();
                if (cache == null) {
                    g[85] = true;
                } else {
                    g[86] = true;
                    Survey survey2 = (Survey) cache.get(Long.valueOf(survey.getId()));
                    if (survey2 == null) {
                        g[87] = true;
                    } else {
                        g[88] = true;
                        survey2.setPaused(survey.isPaused());
                        g[89] = true;
                        arrayList.add(survey2);
                        g[90] = true;
                    }
                }
                g[91] = true;
            } else if (survey.isPaused()) {
                g[92] = true;
            } else {
                g[93] = true;
                arrayList.add(survey);
                g[94] = true;
            }
            g[95] = true;
        }
        g[96] = true;
        return arrayList;
    }

    /* renamed from: c */
    private void m46776c(Survey survey) {
        boolean[] g = m46779g();
        PresentationManager.getInstance().show(new C10061a(this, survey));
        g[110] = true;
    }

    @C0224v0
    /* renamed from: b */
    private void m46774b(Survey survey) {
        boolean[] g = m46779g();
        if (!Instabug.isEnabled()) {
            g[108] = true;
            return;
        }
        m46776c(survey);
        g[109] = true;
    }

    /* renamed from: a */
    public void mo36104a(Throwable th) {
        boolean[] g = m46779g();
        InstabugSDKLogger.m46624e(C10077a.class.getAnnotations(), th.getMessage(), th);
        g[80] = true;
    }

    /* renamed from: a */
    private boolean m46771a(Survey survey) {
        boolean z;
        boolean[] g = m46779g();
        InMemoryCache cache = SurveysCacheManager.getCache();
        g[97] = true;
        if (cache == null) {
            g[98] = true;
        } else if (cache.get(Long.valueOf(survey.getId())) == null) {
            g[99] = true;
        } else {
            g[100] = true;
            z = true;
            g[102] = true;
            return z;
        }
        z = false;
        g[101] = true;
        g[102] = true;
        return z;
    }

    /* renamed from: a */
    public void mo36103a(long j) {
        boolean[] g = m46779g();
        m46774b((Survey) SurveysCacheManager.getCache().get(Long.valueOf(j)));
        g[123] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo36108b(String str) {
        boolean[] g = m46779g();
        Survey c = m46775c(str);
        if (c != null) {
            g[111] = true;
            boolean isAnswered = c.isAnswered();
            g[112] = true;
            return isAnswered;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No survey with token=");
        sb.append(str);
        sb.append(" was found.");
        InstabugSDKLogger.m46623e(this, sb.toString());
        g[113] = true;
        return false;
    }
}
