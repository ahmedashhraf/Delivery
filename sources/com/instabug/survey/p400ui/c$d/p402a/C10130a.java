package com.instabug.survey.p400ui.c$d.p402a;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0195i0;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p400ui.SurveyActivity;
import com.instabug.survey.p400ui.c$d.C10131b;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$d.a.a */
/* compiled from: PartialNpsQuestionFragment */
public class C10130a extends C10131b {

    /* renamed from: W */
    private static transient /* synthetic */ boolean[] f26947W;

    public C10130a() {
        m47106h()[0] = true;
    }

    /* renamed from: b */
    public static C10130a m47105b(Survey survey) {
        boolean[] h = m47106h();
        Bundle bundle = new Bundle();
        h[1] = true;
        bundle.putSerializable("survey", survey);
        h[2] = true;
        bundle.putSerializable("question", (Serializable) survey.getQuestions().get(0));
        h[3] = true;
        C10130a aVar = new C10130a();
        h[4] = true;
        aVar.setArguments(bundle);
        h[5] = true;
        return aVar;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47106h() {
        boolean[] zArr = f26947W;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8014166398667937115L, "com/instabug/survey/ui/survey/nps/partial/PartialNpsQuestionFragment", 15);
        f26947W = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47106h();
        super.initViews(view, bundle);
        h[8] = true;
        ((SurveyActivity) getActivity()).mo36243c(true);
        h[9] = true;
        this.f26882O.setVisibility(0);
        h[10] = true;
        this.f26883P.setVisibility(0);
        h[11] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47106h();
        super.onCreate(bundle);
        h[6] = true;
        this.f26885R = (Survey) getArguments().getSerializable("survey");
        h[7] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] h = m47106h();
        super.onViewCreated(view, bundle);
        h[12] = true;
    }

    /* renamed from: b */
    public void mo36308b(int i) {
        boolean[] h = m47106h();
        ((C10084b) this.f26885R.getQuestions().get(0)).mo36214c(String.valueOf(i));
        h[13] = true;
        mo36266a(this.f26885R, false);
        h[14] = true;
    }
}
