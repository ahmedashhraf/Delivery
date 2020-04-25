package com.instabug.survey.p400ui.c$k;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder.Key;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugLogoProvider;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p398b.C10075h;
import com.instabug.survey.p400ui.C10153d;
import com.instabug.survey.p400ui.SurveyActivity;
import com.instabug.survey.p400ui.c$k.C10144b.C10146b;
import com.instabug.survey.p400ui.p401a.C10101b;
import com.instabug.survey.p400ui.p401a.C10101b.C10103b;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$k.a */
/* compiled from: WelcomeFragment */
public class C10143a extends C9792a<C10147c> implements OnClickListener, OnTouchListener, C10103b, C10146b {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f26969R;

    /* renamed from: N */
    private Survey f26970N;

    /* renamed from: O */
    private LinearLayout f26971O;

    /* renamed from: P */
    private TextView f26972P;

    /* renamed from: Q */
    private TextView f26973Q;

    /* renamed from: a */
    private Button f26974a;

    /* renamed from: b */
    private ImageView f26975b;

    public C10143a() {
        m47147j()[0] = true;
    }

    /* renamed from: a */
    public static C10143a m47145a(Survey survey) {
        boolean[] j = m47147j();
        Bundle bundle = new Bundle();
        j[1] = true;
        bundle.putSerializable("survey", survey);
        j[2] = true;
        C10143a aVar = new C10143a();
        j[3] = true;
        aVar.setArguments(bundle);
        j[4] = true;
        return aVar;
    }

    /* renamed from: i */
    private void m47146i() {
        boolean[] j = m47147j();
        TextView textView = this.f26972P;
        Key key = Key.SURVEYS_WELCOME_SCREEN_TITLE;
        int i = C10049R.string.instabug_survey_welcome_feedback;
        j[20] = true;
        String string = getString(i);
        j[21] = true;
        textView.setText(PlaceHolderUtils.getPlaceHolder(key, string));
        TextView textView2 = this.f26973Q;
        Key key2 = Key.SURVEYS_WELCOME_SCREEN_SUBTITLE;
        int i2 = C10049R.string.instabug_survey_welcome_feedback_msg;
        j[22] = true;
        String string2 = getString(i2);
        j[23] = true;
        textView2.setText(PlaceHolderUtils.getPlaceHolder(key2, string2));
        Button button = this.f26974a;
        Key key3 = Key.SURVEYS_WELCOME_SCREEN_BUTTON;
        int i3 = C10049R.string.instabug_survey_welcome_button;
        j[24] = true;
        String string3 = getString(i3);
        j[25] = true;
        button.setText(PlaceHolderUtils.getPlaceHolder(key3, string3));
        j[26] = true;
    }

    /* renamed from: j */
    private static /* synthetic */ boolean[] m47147j() {
        boolean[] zArr = f26969R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5218251646041798954L, "com/instabug/survey/ui/survey/welcomepage/WelcomeFragment", 65);
        f26969R = a;
        return a;
    }

    /* renamed from: c */
    public void mo36263c() {
        boolean[] j = m47147j();
        ((SurveyActivity) getActivity()).mo36242c(this.f26970N);
        j[64] = true;
    }

    /* renamed from: d */
    public void mo36264d() {
        m47147j()[61] = true;
    }

    /* renamed from: e */
    public void mo36321e() {
        boolean[] j = m47147j();
        this.rootView.findViewById(C10049R.C10053id.instabug_pbi_container).setVisibility(8);
        j[29] = true;
    }

    /* renamed from: f */
    public void mo36322f() {
        boolean[] j = m47147j();
        findViewById(C10049R.C10053id.instabug_pbi_container).setVisibility(0);
        j[30] = true;
        TextView textView = (TextView) findViewById(C10049R.C10053id.text_view_pb);
        j[31] = true;
        ImageView imageView = (ImageView) findViewById(C10049R.C10053id.image_instabug_logo);
        j[32] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
            j[33] = true;
            imageView.setImageBitmap(InstabugLogoProvider.getInstabugLogo());
            j[34] = true;
            imageView.setColorFilter(Color.parseColor("#FFFFFF"), Mode.SRC_ATOP);
            j[35] = true;
            textView.setTextColor(C0841b.m4915a((Context) getActivity(), 17170443));
            j[36] = true;
        } else {
            imageView.setImageBitmap(InstabugLogoProvider.getInstabugLogo());
            j[37] = true;
            imageView.setColorFilter(C0841b.m4915a((Context) getActivity(), C10049R.C10051color.instabug_survey_pbi_color), Mode.SRC_ATOP);
            j[38] = true;
            textView.setTextColor(C0841b.m4915a((Context) getActivity(), C10049R.C10051color.instabug_survey_pbi_color));
            j[39] = true;
        }
        j[40] = true;
    }

    /* renamed from: g */
    public void mo36323g() {
        boolean[] j = m47147j();
        mo36263c();
        j[50] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] j = m47147j();
        int i = C10049R.layout.instabug_survey_fragment_welcome_dialog;
        j[8] = true;
        return i;
    }

    /* renamed from: h */
    public void mo36324h() {
        boolean[] j = m47147j();
        C1382h supportFragmentManager = getActivity().getSupportFragmentManager();
        int i = C10049R.C10053id.instabug_fragment_container;
        j[51] = true;
        Fragment a = supportFragmentManager.mo6221a(i);
        if (a == null) {
            j[52] = true;
        } else {
            j[53] = true;
            C1382h supportFragmentManager2 = getActivity().getSupportFragmentManager();
            j[54] = true;
            C1406n a2 = supportFragmentManager2.mo6224a();
            j[55] = true;
            C1406n a3 = a2.mo6392a(0, 0);
            j[56] = true;
            C1406n d = a3.mo6094d(a);
            j[57] = true;
            d.mo6097e();
            j[58] = true;
        }
        C10153d.m47201b(getFragmentManager(), this.f26970N);
        j[59] = true;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] j = m47147j();
        this.f26974a = (Button) findViewById(C10049R.C10053id.ib_welcome_survey_take_survey);
        j[9] = true;
        this.f26975b = (ImageView) findViewById(C10049R.C10053id.survey_partial_close_btn);
        j[10] = true;
        this.f26971O = (LinearLayout) findViewById(C10049R.C10053id.instabug_dialog_survey_container);
        j[11] = true;
        this.f26972P = (TextView) findViewById(C10049R.C10053id.ib_welcome_survey_title);
        j[12] = true;
        this.f26973Q = (TextView) findViewById(C10049R.C10053id.ib_welcome_survey_text);
        j[13] = true;
        this.f26971O.setOnTouchListener(this);
        j[14] = true;
        this.f26974a.setOnClickListener(this);
        j[15] = true;
        this.f26975b.setOnClickListener(this);
        j[16] = true;
        this.f26974a.setTextColor(C0841b.m4915a((Context) getActivity(), 17170443));
        j[17] = true;
        DrawableUtils.setColor(this.f26974a, Instabug.getPrimaryColor());
        j[18] = true;
        m47146i();
        j[19] = true;
    }

    public void onClick(View view) {
        boolean[] j = m47147j();
        int id = view.getId();
        if (id == C10049R.C10053id.ib_welcome_survey_take_survey) {
            j[44] = true;
            mo36324h();
            j[45] = true;
        } else if (id != C10049R.C10053id.survey_partial_close_btn) {
            j[46] = true;
        } else {
            j[47] = true;
            mo36323g();
            j[48] = true;
        }
        j[49] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] j = m47147j();
        super.onCreate(bundle);
        j[5] = true;
        this.f26970N = (Survey) getArguments().getSerializable("survey");
        j[6] = true;
        this.presenter = new C10147c(this);
        j[7] = true;
    }

    public void onResume() {
        boolean[] j = m47147j();
        super.onResume();
        j[62] = true;
        C10075h.m46875a(this.f26972P);
        j[63] = true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean[] j = m47147j();
        C10101b.m46995a(view, motionEvent, true, true, this);
        j[60] = true;
        return true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        boolean[] j = m47147j();
        super.onViewCreated(view, bundle);
        j[27] = true;
        ((C10147c) this.presenter).mo36327d();
        j[28] = true;
    }
}
