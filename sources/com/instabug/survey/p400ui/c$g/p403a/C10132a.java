package com.instabug.survey.p400ui.c$g.p403a;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout.LayoutParams;
import com.instabug.library.util.OrientationUtils;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p400ui.SurveyActivity;
import com.instabug.survey.p400ui.c$g.C10133b;
import com.instabug.survey.p400ui.custom.RatingView;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$g.a.a */
/* compiled from: PartialStarRatingQuestionFragment */
public class C10132a extends C10133b {

    /* renamed from: W */
    private static transient /* synthetic */ boolean[] f26950W;

    public C10132a() {
        m47114h()[0] = true;
    }

    /* renamed from: b */
    public static C10132a m47113b(Survey survey) {
        boolean[] h = m47114h();
        Bundle bundle = new Bundle();
        h[1] = true;
        bundle.putSerializable("survey", survey);
        h[2] = true;
        bundle.putSerializable("question", (Serializable) survey.getQuestions().get(0));
        h[3] = true;
        C10132a aVar = new C10132a();
        h[4] = true;
        aVar.setArguments(bundle);
        h[5] = true;
        return aVar;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47114h() {
        boolean[] zArr = f26950W;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-713745615655560626L, "com/instabug/survey/ui/survey/starrating/partial/PartialStarRatingQuestionFragment", 22);
        f26950W = a;
        return a;
    }

    /* renamed from: a */
    public void mo36310a(RatingView ratingView, float f, boolean z) {
        boolean[] h = m47114h();
        this.f26952U.mo36346a(f, false);
        h[19] = true;
        ((C10084b) this.f26885R.getQuestions().get(0)).mo36214c(String.valueOf((int) f));
        h[20] = true;
        mo36266a(this.f26885R, false);
        h[21] = true;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47114h();
        super.initViews(view, bundle);
        h[8] = true;
        ((SurveyActivity) getActivity()).mo36243c(true);
        h[9] = true;
        this.f26882O.setVisibility(0);
        h[10] = true;
        this.f26883P.setVisibility(0);
        h[11] = true;
        if (!OrientationUtils.isInLandscape(getActivity())) {
            h[12] = true;
        } else {
            h[13] = true;
            LayoutParams layoutParams = (LayoutParams) this.f26952U.getLayoutParams();
            h[14] = true;
            layoutParams.setMargins(0, 8, 0, 8);
            h[15] = true;
            this.f26952U.setLayoutParams(layoutParams);
            h[16] = true;
            this.f26952U.requestLayout();
            h[17] = true;
        }
        h[18] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47114h();
        super.onCreate(bundle);
        h[6] = true;
        this.f26885R = (Survey) getArguments().getSerializable("survey");
        h[7] = true;
    }
}
