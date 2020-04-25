package com.instabug.survey.p400ui.c$c$g;

import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import androidx.annotation.C0195i0;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p400ui.C10105c.C10110c.C10117h;
import com.instabug.survey.p400ui.SurveyActivity;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$c$g.a */
/* compiled from: PartialMCQQuestionFragment */
public class C10128a extends C10117h {

    /* renamed from: Y */
    private static transient /* synthetic */ boolean[] f26943Y;

    /* renamed from: X */
    private View f26944X;

    /* renamed from: com.instabug.survey.ui.c$c$g.a$a */
    /* compiled from: PartialMCQQuestionFragment */
    class C10129a implements OnScrollListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26945b;

        /* renamed from: a */
        final /* synthetic */ C10128a f26946a;

        C10129a(C10128a aVar) {
            boolean[] a = m47104a();
            this.f26946a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47104a() {
            boolean[] zArr = f26945b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5703463783422382314L, "com/instabug/survey/ui/survey/mcq/partial/PartialMCQQuestionFragment$1", 6);
            f26945b = a;
            return a;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            m47104a()[5] = true;
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean[] a = m47104a();
            if (i != 1) {
                a[1] = true;
            } else {
                a[2] = true;
                C10128a aVar = this.f26946a;
                C10128a.m47100a(aVar, C10128a.m47099a(aVar), false);
                a[3] = true;
            }
            a[4] = true;
        }
    }

    public C10128a() {
        m47102h()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Survey m47099a(C10128a aVar) {
        boolean[] h = m47102h();
        Survey survey = aVar.f26885R;
        h[23] = true;
        return survey;
    }

    /* renamed from: b */
    public static C10128a m47101b(Survey survey) {
        boolean[] h = m47102h();
        Bundle bundle = new Bundle();
        h[1] = true;
        bundle.putSerializable("survey", survey);
        h[2] = true;
        bundle.putSerializable("question", (Serializable) survey.getQuestions().get(0));
        h[3] = true;
        C10128a aVar = new C10128a();
        h[4] = true;
        aVar.setArguments(bundle);
        h[5] = true;
        return aVar;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47102h() {
        boolean[] zArr = f26943Y;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1392765513510296369L, "com/instabug/survey/ui/survey/mcq/partial/PartialMCQQuestionFragment", 25);
        f26943Y = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47102h();
        super.initViews(view, bundle);
        h[8] = true;
        this.f26944X = findViewById(C10049R.C10053id.survey_mcq_fade);
        h[9] = true;
        ((SurveyActivity) getActivity()).mo36243c(true);
        h[10] = true;
        this.f26882O.setVisibility(0);
        h[11] = true;
        this.f26883P.setVisibility(0);
        h[12] = true;
        this.f26922V.setEnabled(true);
        h[13] = true;
        this.f26922V.setVerticalScrollBarEnabled(false);
        h[14] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            h[15] = true;
            this.f26944X.setBackgroundResource(C10049R.C10052drawable.survey_mcq_fade_light);
            h[16] = true;
        } else {
            this.f26944X.setBackgroundResource(C10049R.C10052drawable.survey_mcq_fade_dark);
            h[17] = true;
        }
        this.f26944X.setVisibility(0);
        h[18] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47102h();
        super.onCreate(bundle);
        h[6] = true;
        this.f26885R = (Survey) getArguments().getSerializable("survey");
        h[7] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] h = m47102h();
        super.onViewCreated(view, bundle);
        h[19] = true;
        this.f26922V.setOnScrollListener(new C10129a(this));
        h[20] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m47100a(C10128a aVar, Survey survey, boolean z) {
        boolean[] h = m47102h();
        aVar.mo36266a(survey, z);
        h[24] = true;
    }

    /* renamed from: a */
    public void mo36293a(View view, String str) {
        boolean[] h = m47102h();
        ((C10084b) this.f26885R.getQuestions().get(0)).mo36214c(str);
        h[21] = true;
        mo36266a(this.f26885R, false);
        h[22] = true;
    }
}
