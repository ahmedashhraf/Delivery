package com.instabug.survey.p400ui.c$d;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.p400ui.C10105c.C10107b;
import com.instabug.survey.p400ui.C10105c.C10122e;
import com.instabug.survey.p400ui.custom.NpsView;
import com.instabug.survey.p400ui.custom.NpsView.C10148a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$d.b */
/* compiled from: NPSQuestionFragment */
public class C10131b extends C10107b implements C10148a {

    /* renamed from: V */
    private static transient /* synthetic */ boolean[] f26948V;

    /* renamed from: U */
    private NpsView f26949U;

    public C10131b() {
        m47109h()[0] = true;
    }

    /* renamed from: a */
    public static C10131b m47108a(C10084b bVar, C10122e eVar) {
        boolean[] h = m47109h();
        C10131b bVar2 = new C10131b();
        h[1] = true;
        Bundle bundle = new Bundle();
        h[2] = true;
        bundle.putSerializable("question", bVar);
        h[3] = true;
        bVar2.setArguments(bundle);
        h[4] = true;
        bVar2.mo36267a(eVar);
        h[5] = true;
        return bVar2;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47109h() {
        boolean[] zArr = f26948V;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-7924911902176895650L, "com/instabug/survey/ui/survey/nps/NPSQuestionFragment", 26);
        f26948V = a;
        return a;
    }

    /* renamed from: b */
    public void mo36308b(int i) {
        boolean[] h = m47109h();
        this.f26887a.mo36214c(String.valueOf(i));
        h[24] = true;
        this.f26888b.mo36283d(this.f26887a);
        h[25] = true;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: c */
    public void mo36309c(C10084b bVar) {
        boolean[] h = m47109h();
        this.f26881N.setText(bVar.mo36215d());
        h[16] = true;
        if (bVar.mo36218g() == null) {
            h[17] = true;
        } else if (bVar.mo36218g().length() <= 0) {
            h[18] = true;
        } else {
            h[19] = true;
            this.f26949U.setScore(Integer.parseInt(bVar.mo36218g()));
            h[20] = true;
        }
        h[21] = true;
    }

    /* renamed from: f */
    public String mo36269f() {
        boolean[] h = m47109h();
        String g = this.f26887a.mo36218g();
        h[22] = true;
        return g;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m47109h();
        int i = C10049R.layout.instabug_dialog_nps_survey;
        h[9] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47109h();
        super.initViews(view, bundle);
        h[10] = true;
        this.f26881N = (TextView) view.findViewById(C10049R.C10053id.instabug_text_view_question);
        h[11] = true;
        this.f26949U = (NpsView) view.findViewById(C10049R.C10053id.instabug_survey_nps_layout);
        h[12] = true;
        this.f26949U.setOnSelectionListener(this);
        h[13] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47109h();
        super.onCreate(bundle);
        h[6] = true;
        setRetainInstance(true);
        h[7] = true;
        this.f26887a = (C10084b) getArguments().getSerializable("question");
        h[8] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] h = m47109h();
        super.onViewCreated(view, bundle);
        h[14] = true;
        mo36309c(this.f26887a);
        h[15] = true;
    }
}
