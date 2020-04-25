package com.instabug.survey.p398b;

import android.os.Handler;
import android.os.Looper;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.C10060a.C10064d;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.b.f */
/* compiled from: SurveysUtils */
public class C10070f {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26799a;

    /* renamed from: com.instabug.survey.b.f$a */
    /* compiled from: SurveysUtils */
    static class C10071a implements Runnable {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26800a;

        C10071a() {
            m46842a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46842a() {
            boolean[] zArr = f26800a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4975547288054443987L, "com/instabug/survey/utils/SurveysUtils$1", 2);
            f26800a = a;
            return a;
        }

        public void run() {
            boolean[] a = m46842a();
            C10064d.m46818b().onShow();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.b.f$b */
    /* compiled from: SurveysUtils */
    static class C10072b implements Runnable {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26801a;

        C10072b() {
            m46843a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46843a() {
            boolean[] zArr = f26801a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2322465495822576353L, "com/instabug/survey/utils/SurveysUtils$2", 2);
            f26801a = a;
            return a;
        }

        public void run() {
            boolean[] a = m46843a();
            C10064d.m46820c().onDismiss();
            a[1] = true;
        }
    }

    public C10070f() {
        m46841e()[0] = true;
    }

    /* renamed from: a */
    public static boolean m46837a() {
        boolean[] e = m46841e();
        boolean isFeatureAvailable = InstabugCore.isFeatureAvailable(Feature.SURVEYS);
        e[1] = true;
        return isFeatureAvailable;
    }

    /* renamed from: b */
    public static boolean m46838b() {
        boolean z;
        boolean[] e = m46841e();
        if (InstabugCore.getFeatureState(Feature.SURVEYS) == State.ENABLED) {
            e[2] = true;
            z = true;
        } else {
            z = false;
            e[3] = true;
        }
        e[4] = true;
        return z;
    }

    /* renamed from: c */
    public static void m46839c() {
        boolean[] e = m46841e();
        if (C10064d.m46818b() == null) {
            e[5] = true;
        } else {
            try {
                e[6] = true;
                Handler handler = new Handler(Looper.getMainLooper());
                e[7] = true;
                handler.post(new C10071a());
                e[8] = true;
            } catch (Exception e2) {
                e[9] = true;
                InstabugSDKLogger.m46624e(C10070f.class, "AfterShowingSurveyRunnable has been failed to run.", e2);
                e[10] = true;
            }
        }
        e[11] = true;
    }

    /* renamed from: d */
    public static void m46840d() {
        boolean[] e = m46841e();
        if (C10064d.m46820c() == null) {
            e[12] = true;
        } else {
            try {
                e[13] = true;
                Handler handler = new Handler(Looper.getMainLooper());
                e[14] = true;
                handler.post(new C10072b());
                e[15] = true;
            } catch (Exception e2) {
                e[16] = true;
                InstabugSDKLogger.m46624e(C10070f.class, "AfterShowingSurveyRunnable has been failed to run.", e2);
                e[17] = true;
            }
        }
        e[18] = true;
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m46841e() {
        boolean[] zArr = f26799a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(914530761781618135L, "com/instabug/survey/utils/SurveysUtils", 19);
        f26799a = a;
        return a;
    }
}
