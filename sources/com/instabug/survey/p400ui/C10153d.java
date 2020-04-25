package com.instabug.survey.p400ui;

import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.C10084b.C10085a;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p400ui.c$c$g.C10128a;
import com.instabug.survey.p400ui.c$d.p402a.C10130a;
import com.instabug.survey.p400ui.c$g.p403a.C10132a;
import com.instabug.survey.p400ui.c$i.C10134a.C10136b;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.d */
/* compiled from: SurveyNavigator */
public class C10153d {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f27047a;

    /* renamed from: a */
    public static void m47199a(C1382h hVar, Survey survey, int i, int i2) {
        boolean[] a = m47200a();
        if (((C10084b) survey.getQuestions().get(0)).mo36216e() == C10085a.TEXT) {
            a[1] = true;
            m47205e(hVar, survey, i, i2);
            a[2] = true;
        } else if (((C10084b) survey.getQuestions().get(0)).mo36216e() == C10085a.MCQ) {
            a[3] = true;
            m47204d(hVar, survey, i, i2);
            a[4] = true;
        } else if (((C10084b) survey.getQuestions().get(0)).mo36216e() == C10085a.STAR_RATE) {
            a[5] = true;
            m47203c(hVar, survey, i, i2);
            a[6] = true;
        } else if (((C10084b) survey.getQuestions().get(0)).mo36216e() != C10085a.NPS) {
            a[7] = true;
        } else {
            a[8] = true;
            m47202b(hVar, survey, i, i2);
            a[9] = true;
        }
        a[10] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m47200a() {
        boolean[] zArr = f27047a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4104728597530793259L, "com/instabug/survey/ui/SurveyNavigator", 21);
        f27047a = a;
        return a;
    }

    /* renamed from: b */
    public static void m47201b(C1382h hVar, Survey survey) {
        boolean[] a = m47200a();
        m47199a(hVar, survey, 0, 0);
        a[12] = true;
    }

    /* renamed from: c */
    private static void m47203c(C1382h hVar, Survey survey, int i, int i2) {
        boolean[] a = m47200a();
        m47197a(hVar, (Fragment) C10132a.m47113b(survey), i, i2);
        a[14] = true;
    }

    /* renamed from: d */
    private static void m47204d(C1382h hVar, Survey survey, int i, int i2) {
        boolean[] a = m47200a();
        m47197a(hVar, (Fragment) C10128a.m47101b(survey), i, i2);
        a[15] = true;
    }

    /* renamed from: e */
    private static void m47205e(C1382h hVar, Survey survey, int i, int i2) {
        boolean[] a = m47200a();
        m47197a(hVar, (Fragment) C10136b.m47129b(survey), i, i2);
        a[16] = true;
    }

    /* renamed from: b */
    private static void m47202b(C1382h hVar, Survey survey, int i, int i2) {
        boolean[] a = m47200a();
        m47197a(hVar, (Fragment) C10130a.m47105b(survey), i, i2);
        a[13] = true;
    }

    /* renamed from: a */
    public static void m47198a(C1382h hVar, Survey survey) {
        boolean[] a = m47200a();
        m47199a(hVar, survey, C10049R.anim.instabug_anim_flyin_from_bottom, C10049R.anim.instabug_anim_flyout_to_bottom);
        a[11] = true;
    }

    /* renamed from: a */
    public static void m47197a(C1382h hVar, Fragment fragment, int i, int i2) {
        boolean[] a = m47200a();
        C1406n a2 = hVar.mo6224a();
        a[17] = true;
        C1406n a3 = a2.mo6392a(i, i2);
        int i3 = C10049R.C10053id.instabug_fragment_container;
        a[18] = true;
        C1406n b = a3.mo6405b(i3, fragment);
        a[19] = true;
        b.mo6097e();
        a[20] = true;
    }
}
