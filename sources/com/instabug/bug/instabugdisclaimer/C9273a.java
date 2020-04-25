package com.instabug.bug.instabugdisclaimer;

import com.instabug.bug.settings.C9291a;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.settings.SettingsManager;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.instabugdisclaimer.a */
/* compiled from: InstabugDisclaimer */
class C9273a {

    /* renamed from: a */
    private static String f24529a = "Disclaimer: Once submitted, this feedback and [metadata](#metadata-screen) will be sent to and stored on Instabug's servers.<P/><P/>[Learn more](http://grasshopper.codes).";

    /* renamed from: b */
    private static transient /* synthetic */ boolean[] f24530b;

    static {
        boolean[] b = m43373b();
        b[17] = true;
    }

    /* renamed from: a */
    static void m43371a() {
        boolean[] b = m43373b();
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        b[1] = true;
        InstabugCore.setFeatureState(Feature.CONSOLE_LOGS, State.DISABLED);
        b[2] = true;
        InstabugCore.setFeatureState(Feature.TRACK_USER_STEPS, State.DISABLED);
        b[3] = true;
        InstabugCore.setFeatureState(Feature.REPRO_STEPS, State.DISABLED);
        b[4] = true;
        InstabugCore.setFeatureState(Feature.VIEW_HIERARCHY, State.DISABLED);
        b[5] = true;
        Instabug.setPromptOptionsEnabled(false, true, true);
        b[6] = true;
        SettingsManager.getInstance().setIsSessionEnabled(false);
        b[7] = true;
        m43372a(f24529a);
        b[8] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43373b() {
        boolean[] zArr = f24530b;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3115598810532252203L, "com/instabug/bug/instabugdisclaimer/InstabugDisclaimer", 18);
        f24530b = a;
        return a;
    }

    /* renamed from: a */
    static void m43372a(String str) {
        boolean[] b = m43373b();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        b[9] = true;
        b[10] = true;
        Parameter[] parameterArr = {parameter.setName("disclaimer").setType(CharSequence.class)};
        b[11] = true;
        instance.catchApiUsage(parameterArr);
        b[12] = true;
        if (InstabugCore.getFeatureState(Feature.DISCLAIMER) != State.ENABLED) {
            b[13] = true;
        } else {
            b[14] = true;
            C9291a.m43476r().mo33605b(str);
            b[15] = true;
        }
        b[16] = true;
    }
}
