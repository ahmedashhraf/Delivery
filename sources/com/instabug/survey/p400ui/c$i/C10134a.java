package com.instabug.survey.p400ui.c$i;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p398b.C10066b;
import com.instabug.survey.p400ui.C10105c.C10107b;
import com.instabug.survey.p400ui.C10105c.C10122e;
import com.instabug.survey.p400ui.SurveyActivity;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$i.a */
/* compiled from: TextQuestionFragment */
public class C10134a extends C10107b implements TextWatcher {

    /* renamed from: V */
    private static transient /* synthetic */ boolean[] f26953V;

    /* renamed from: U */
    protected EditText f26954U;

    /* renamed from: com.instabug.survey.ui.c$i.a$a */
    /* compiled from: TextQuestionFragment */
    class C10135a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26955b;

        /* renamed from: a */
        final /* synthetic */ C10134a f26956a;

        C10135a(C10134a aVar) {
            boolean[] a = m47128a();
            this.f26956a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47128a() {
            boolean[] zArr = f26955b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6300313480075539897L, "com/instabug/survey/ui/survey/text/TextQuestionFragment$1", 2);
            f26955b = a;
            return a;
        }

        public void run() {
            boolean[] a = m47128a();
            C10134a aVar = this.f26956a;
            aVar.f26954U.addTextChangedListener(aVar);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.c$i.a$b */
    /* compiled from: PartialTextQuestionFragment */
    public class C10136b extends C10134a implements OnClickListener {

        /* renamed from: W */
        private static transient /* synthetic */ boolean[] f26957W;

        public C10136b() {
            m47130i()[0] = true;
        }

        /* renamed from: b */
        public static C10136b m47129b(Survey survey) {
            boolean[] i = m47130i();
            Bundle bundle = new Bundle();
            i[1] = true;
            bundle.putSerializable("survey", survey);
            i[2] = true;
            bundle.putSerializable("question", (Serializable) survey.getQuestions().get(0));
            i[3] = true;
            C10136b bVar = new C10136b();
            i[4] = true;
            bVar.setArguments(bundle);
            i[5] = true;
            return bVar;
        }

        /* renamed from: i */
        private static /* synthetic */ boolean[] m47130i() {
            boolean[] zArr = f26957W;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6046322427972767044L, "com/instabug/survey/ui/survey/text/partial/PartialTextQuestionFragment", 19);
            f26957W = a;
            return a;
        }

        /* access modifiers changed from: protected */
        public void initViews(View view, Bundle bundle) {
            boolean[] i = m47130i();
            C10134a.super.initViews(view, bundle);
            i[8] = true;
            ((SurveyActivity) getActivity()).mo36243c(true);
            i[9] = true;
            this.f26954U.setFocusable(false);
            i[10] = true;
            this.f26883P.setOnClickListener(this);
            i[11] = true;
            this.f26954U.setOnClickListener(this);
            i[12] = true;
            this.f26882O.setVisibility(0);
            i[13] = true;
            this.f26883P.setVisibility(0);
            i[14] = true;
        }

        public void onClick(View view) {
            boolean[] i = m47130i();
            if (view.getId() == C10049R.C10053id.instabug_edit_text_answer) {
                i[15] = true;
                mo36266a(this.f26885R, true);
                i[16] = true;
            } else {
                super.onClick(view);
                i[17] = true;
            }
            i[18] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] i = m47130i();
            C10134a.super.onCreate(bundle);
            i[6] = true;
            this.f26885R = (Survey) getArguments().getSerializable("survey");
            i[7] = true;
        }
    }

    public C10134a() {
        m47124i()[0] = true;
    }

    /* renamed from: a */
    public static C10134a m47122a(C10084b bVar, C10122e eVar) {
        boolean[] i = m47124i();
        Bundle bundle = new Bundle();
        i[2] = true;
        bundle.putSerializable("question", bVar);
        i[3] = true;
        C10134a aVar = new C10134a();
        i[4] = true;
        aVar.setArguments(bundle);
        i[5] = true;
        aVar.mo36267a(eVar);
        i[6] = true;
        return aVar;
    }

    /* renamed from: b */
    private void m47123b(C10084b bVar) {
        boolean[] i = m47124i();
        if (bVar.mo36218g() == null) {
            i[23] = true;
        } else if (bVar.mo36218g().isEmpty()) {
            i[24] = true;
        } else {
            i[25] = true;
            this.f26954U.setText(bVar.mo36218g());
            i[26] = true;
        }
        i[27] = true;
    }

    /* renamed from: i */
    private static /* synthetic */ boolean[] m47124i() {
        boolean[] zArr = f26953V;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7605392463398840984L, "com/instabug/survey/ui/survey/text/TextQuestionFragment", 45);
        f26953V = a;
        return a;
    }

    public void afterTextChanged(Editable editable) {
        boolean[] i = m47124i();
        this.f26887a.mo36214c(editable.toString());
        C10122e eVar = this.f26888b;
        if (eVar == null) {
            i[40] = true;
        } else {
            i[41] = true;
            eVar.mo36279b(this.f26887a);
            i[42] = true;
        }
        i[43] = true;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m47124i()[38] = true;
    }

    /* renamed from: c */
    public void mo36313c(C10084b bVar) {
        boolean[] i = m47124i();
        this.f26881N.setText(bVar.mo36215d());
        i[19] = true;
        this.f26954U.setHint(getContext().getString(C10049R.string.instabug_str_hint_enter_your_answer));
        i[20] = true;
        this.f26954U.postDelayed(new C10135a(this), 300);
        i[21] = true;
        m47123b(bVar);
        i[22] = true;
    }

    /* renamed from: f */
    public String mo36269f() {
        boolean[] i = m47124i();
        if (!this.f26954U.getText().toString().trim().equals("")) {
            i[28] = true;
            String obj = this.f26954U.getText().toString();
            i[29] = true;
            return obj;
        }
        i[30] = true;
        return null;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] i = m47124i();
        int i2 = C10049R.layout.instabug_dialog_text_survey;
        i[1] = true;
        return i2;
    }

    /* renamed from: h */
    public void mo36314h() {
        boolean[] i = m47124i();
        if (getActivity() == null) {
            i[31] = true;
        } else {
            i[32] = true;
            this.f26954U.requestFocus();
            i[33] = true;
            C10066b.m46828a(getActivity(), this.f26954U);
            i[34] = true;
        }
        i[35] = true;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] i = m47124i();
        super.initViews(view, bundle);
        i[10] = true;
        this.f26881N = (TextView) view.findViewById(C10049R.C10053id.instabug_text_view_question);
        i[11] = true;
        this.f26954U = (EditText) view.findViewById(C10049R.C10053id.instabug_edit_text_answer);
        i[12] = true;
        this.f26954U.getLayoutParams().height = getResources().getDimensionPixelSize(C10049R.dimen.question_answer_text_height);
        i[13] = true;
        ((LayoutParams) this.f26954U.getLayoutParams()).bottomMargin = 10;
        i[14] = true;
        mo36270g();
        i[15] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] i = m47124i();
        super.onCreate(bundle);
        i[7] = true;
        setRetainInstance(true);
        i[8] = true;
        this.f26887a = (C10084b) getArguments().getSerializable("question");
        i[9] = true;
    }

    public void onDestroyView() {
        boolean[] i = m47124i();
        super.onDestroyView();
        i[36] = true;
        this.f26954U.removeTextChangedListener(this);
        i[37] = true;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        m47124i()[39] = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] i = m47124i();
        super.onViewCreated(view, bundle);
        i[16] = true;
        view.setFocusableInTouchMode(true);
        i[17] = true;
        mo36313c(this.f26887a);
        i[18] = true;
    }
}
