package com.instabug.survey.p400ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.appcompat.app.C0295d;
import androidx.core.app.C0770p;
import androidx.core.content.C0841b;
import androidx.core.p018c.C0821b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1404l;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseContract.View;
import com.instabug.library.core.p382ui.BasePresenter;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.p397ui.custom.InstabugViewPager;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable.IconState;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable.Stroke;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.C10020a;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.DisplayUtils;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.survey.C10049R;
import com.instabug.survey.models.C10084b;
import com.instabug.survey.models.C10084b.C10085a;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p398b.C10066b;
import com.instabug.survey.p398b.C10067c;
import com.instabug.survey.p398b.C10068d;
import com.instabug.survey.p398b.C10075h;
import com.instabug.survey.p400ui.c$c$g.C10128a;
import com.instabug.survey.p400ui.c$d.C10131b;
import com.instabug.survey.p400ui.c$d.p402a.C10130a;
import com.instabug.survey.p400ui.c$g.C10133b;
import com.instabug.survey.p400ui.c$g.p403a.C10132a;
import com.instabug.survey.p400ui.c$i.C10134a;
import com.instabug.survey.p400ui.c$i.C10134a.C10136b;
import com.instabug.survey.p400ui.p401a.C10099a;
import com.instabug.survey.p400ui.p401a.C10099a.C10100a;
import com.instabug.survey.p400ui.p401a.C10101b;
import com.instabug.survey.p400ui.p401a.C10101b.C10103b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c */
/* compiled from: SurveyActivityContract */
public interface C10105c {

    /* renamed from: com.instabug.survey.ui.c$a */
    /* compiled from: SurveyActivityContract */
    public interface C10106a extends View<C0295d> {
        /* renamed from: a */
        void mo36238a(boolean z);

        /* renamed from: b */
        void mo36239b(int i);

        /* renamed from: d */
        void mo36245d(int i);
    }

    /* renamed from: com.instabug.survey.ui.c$b */
    /* compiled from: QuestionFragment */
    public abstract class C10107b extends C9792a implements OnClickListener, OnTouchListener, C10103b {

        /* renamed from: T */
        private static transient /* synthetic */ boolean[] f26880T;

        /* renamed from: N */
        protected TextView f26881N;

        /* renamed from: O */
        protected android.view.View f26882O;

        /* renamed from: P */
        protected ImageView f26883P;

        /* renamed from: Q */
        protected RelativeLayout f26884Q;

        /* renamed from: R */
        protected Survey f26885R;

        /* renamed from: S */
        private GestureDetector f26886S;

        /* renamed from: a */
        protected C10084b f26887a;

        /* renamed from: b */
        protected C10122e f26888b;

        /* renamed from: com.instabug.survey.ui.c$b$a */
        /* compiled from: QuestionFragment */
        class C10108a implements C10100a {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26889b;

            /* renamed from: a */
            final /* synthetic */ C10107b f26890a;

            C10108a(C10107b bVar) {
                boolean[] a = m47015a();
                this.f26890a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47015a() {
                boolean[] zArr = f26889b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-6526072157905927895L, "com/instabug/survey/ui/survey/QuestionFragment$1", 6);
                f26889b = a;
                return a;
            }

            /* renamed from: c */
            public void mo36254c() {
                m47015a()[2] = true;
            }

            /* renamed from: d */
            public void mo36255d() {
                m47015a()[1] = true;
            }

            /* renamed from: e */
            public void mo36256e() {
                boolean[] a = m47015a();
                this.f26890a.mo36264d();
                a[3] = true;
            }

            /* renamed from: f */
            public void mo36257f() {
                boolean[] a = m47015a();
                this.f26890a.mo36263c();
                a[4] = true;
            }

            /* renamed from: g */
            public void mo36258g() {
                m47015a()[5] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$b$b */
        /* compiled from: QuestionsPagerAdapter */
        public class C10109b extends C1404l {

            /* renamed from: n */
            private static transient /* synthetic */ boolean[] f26891n;

            /* renamed from: m */
            private List<C10107b> f26892m;

            public C10109b(@C0193h0 C1382h hVar, @C0193h0 List<C10107b> list) {
                boolean[] d = m47021d();
                super(hVar);
                this.f26892m = list;
                d[0] = true;
            }

            /* renamed from: d */
            private static /* synthetic */ boolean[] m47021d() {
                boolean[] zArr = f26891n;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(166870472765250252L, "com/instabug/survey/ui/survey/adapter/QuestionsPagerAdapter", 4);
                f26891n = a;
                return a;
            }

            /* renamed from: a */
            public int mo8886a() {
                boolean[] d = m47021d();
                int size = this.f26892m.size();
                d[1] = true;
                return size;
            }

            /* renamed from: c */
            public /* synthetic */ Fragment mo6388c(int i) {
                boolean[] d = m47021d();
                C10107b e = mo36273e(i);
                d[3] = true;
                return e;
            }

            /* renamed from: e */
            public C10107b mo36273e(int i) {
                C10107b bVar = (C10107b) this.f26892m.get(i);
                m47021d()[2] = true;
                return bVar;
            }
        }

        public C10107b() {
            mo36314h()[0] = true;
        }

        /* renamed from: h */
        private static /* synthetic */ boolean[] mo36314h() {
            boolean[] zArr = f26880T;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5387613172990299822L, "com/instabug/survey/ui/survey/QuestionFragment", 74);
            f26880T = a;
            return a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36267a(C10122e eVar) {
            boolean[] h = mo36314h();
            this.f26888b = eVar;
            h[1] = true;
        }

        /* renamed from: c */
        public void mo36263c() {
            boolean[] h = mo36314h();
            ((SurveyActivity) getActivity()).mo36242c(this.f26885R);
            h[73] = true;
        }

        /* renamed from: d */
        public void mo36264d() {
            boolean[] h = mo36314h();
            mo36266a(this.f26885R, false);
            h[72] = true;
        }

        /* renamed from: e */
        public boolean mo36268e() {
            boolean[] h = mo36314h();
            if (this instanceof C10136b) {
                h[26] = true;
            } else if (this instanceof C10128a) {
                h[27] = true;
            } else if (this instanceof C10132a) {
                h[28] = true;
            } else if (this instanceof C10130a) {
                h[29] = true;
            } else {
                h[31] = true;
                return false;
            }
            h[30] = true;
            return true;
        }

        /* renamed from: f */
        public abstract String mo36269f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo36270g() {
            boolean[] h = mo36314h();
            if (this.f26881N == null) {
                h[32] = true;
            } else if (!OrientationUtils.isInLandscape(getActivity())) {
                h[33] = true;
            } else {
                h[34] = true;
                this.f26881N.setMaxLines(3);
                h[35] = true;
            }
            h[36] = true;
        }

        /* access modifiers changed from: protected */
        public void initViews(android.view.View view, Bundle bundle) {
            boolean[] h = mo36314h();
            if (!(getActivity() instanceof SurveyActivity)) {
                h[6] = true;
            } else {
                h[7] = true;
                ((SurveyActivity) getActivity()).mo36243c(false);
                h[8] = true;
            }
            this.f26882O = findViewById(C10049R.C10053id.survey_shadow);
            h[9] = true;
            this.f26883P = (ImageView) findViewById(C10049R.C10053id.survey_partial_close_btn);
            h[10] = true;
            this.f26881N = (TextView) view.findViewById(C10049R.C10053id.instabug_text_view_question);
            h[11] = true;
            this.f26884Q = (RelativeLayout) findViewById(C10049R.C10053id.instabug_survey_dialog_container);
            h[12] = true;
            this.f26884Q.setOnTouchListener(this);
            h[13] = true;
            this.f26884Q.setOnClickListener(this);
            h[14] = true;
            this.f26883P.setOnClickListener(this);
            h[15] = true;
            if (mo36268e()) {
                h[16] = true;
            } else if (!C10020a.m46628a(getContext())) {
                h[17] = true;
            } else {
                h[18] = true;
                view.setRotation(180.0f);
                h[19] = true;
            }
            h[20] = true;
        }

        public void onClick(android.view.View view) {
            boolean[] h = mo36314h();
            int id = view.getId();
            if (id == C10049R.C10053id.survey_partial_close_btn) {
                h[37] = true;
                mo36265a(this.f26885R);
                h[38] = true;
            } else {
                if (id == C10049R.C10053id.instabug_survey_dialog_container) {
                    h[39] = true;
                } else if (id != C10049R.C10053id.instabug_text_view_question) {
                    h[40] = true;
                } else {
                    h[41] = true;
                }
                if (((SurveyActivity) getActivity()).mo36244d() == C10159g.SECONDARY) {
                    h[42] = true;
                } else {
                    h[43] = true;
                    mo36266a(this.f26885R, false);
                    h[44] = true;
                }
            }
            h[45] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] h = mo36314h();
            if (!(getActivity() instanceof SurveyActivity)) {
                h[2] = true;
            } else {
                h[3] = true;
                this.f26885R = ((SurveyActivity) getActivity()).mo36241c();
                h[4] = true;
            }
            super.onCreate(bundle);
            h[5] = true;
        }

        public void onResume() {
            boolean[] h = mo36314h();
            super.onResume();
            if (!(this instanceof C10136b)) {
                h[67] = true;
            } else {
                h[68] = true;
                ((SurveyActivity) getActivity()).mo36237a(C10159g.PARTIAL, false);
                h[69] = true;
            }
            C10075h.m46875a(this.f26881N);
            h[70] = true;
            C10101b.m46993a();
            h[71] = true;
        }

        public boolean onTouch(android.view.View view, MotionEvent motionEvent) {
            boolean[] h = mo36314h();
            C10066b.m46827a(getActivity());
            h[21] = true;
            C10101b.m46995a(view, motionEvent, mo36268e(), false, this);
            if (this.f26886S != null) {
                h[22] = true;
            } else {
                h[23] = true;
                this.f26886S = new GestureDetector(getContext(), new C10099a(new C10108a(this)));
                h[24] = true;
            }
            this.f26886S.onTouchEvent(motionEvent);
            h[25] = true;
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36265a(Survey survey) {
            boolean[] h = mo36314h();
            ((SurveyActivity) getActivity()).mo36236a(survey);
            h[46] = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo36266a(Survey survey, boolean z) {
            boolean[] h = mo36314h();
            if (survey == null) {
                h[47] = true;
            } else if (survey.getQuestions() == null) {
                h[48] = true;
            } else if (survey.getQuestions().size() <= 0) {
                h[49] = true;
            } else {
                h[50] = true;
                if (((C10084b) survey.getQuestions().get(0)).mo36216e() == C10085a.NPS) {
                    h[51] = true;
                    ((SurveyActivity) getActivity()).mo36237a(C10159g.PRIMARY, true);
                    h[52] = true;
                } else if (((C10084b) survey.getQuestions().get(0)).mo36216e() == C10085a.STAR_RATE) {
                    h[53] = true;
                    ((SurveyActivity) getActivity()).mo36237a(C10159g.PRIMARY, true);
                    h[54] = true;
                    Iterator it = survey.getQuestions().iterator();
                    h[55] = true;
                    while (true) {
                        if (!it.hasNext()) {
                            h[56] = true;
                            break;
                        }
                        C10084b bVar = (C10084b) it.next();
                        h[57] = true;
                        if (bVar.mo36216e() != C10085a.STAR_RATE) {
                            h[58] = true;
                            ((SurveyActivity) getActivity()).mo36237a(C10159g.SECONDARY, true);
                            h[59] = true;
                            break;
                        }
                        h[60] = true;
                    }
                    h[61] = true;
                } else {
                    ((SurveyActivity) getActivity()).mo36237a(C10159g.SECONDARY, true);
                    h[62] = true;
                }
            }
            C1406n a = getActivity().getSupportFragmentManager().mo6224a();
            h[63] = true;
            C1406n a2 = a.mo6392a(0, 0);
            int i = C10049R.C10053id.instabug_fragment_container;
            h[64] = true;
            C1406n b = a2.mo6405b(i, C10110c.m47028a(survey, z));
            h[65] = true;
            b.mo6097e();
            h[66] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.c$c */
    /* compiled from: SurveyFragment */
    public class C10110c extends C9792a<C10127h> implements OnClickListener, C10122e, C10125b {

        /* renamed from: X */
        private static transient /* synthetic */ boolean[] f26893X;

        /* renamed from: N */
        private InstabugViewPager f26894N;

        /* renamed from: O */
        private C10109b f26895O;

        /* renamed from: P */
        private ImageView f26896P;

        /* renamed from: Q */
        private ProgressBar f26897Q;

        /* renamed from: R */
        private MaterialMenuDrawable f26898R;

        /* renamed from: S */
        private int f26899S = -1;

        /* renamed from: T */
        private String f26900T = "CURRENT_QUESTION_POSITION";

        /* renamed from: U */
        private C10104b f26901U;

        /* renamed from: V */
        private boolean f26902V = false;

        /* renamed from: W */
        private long f26903W;
        @C0224v0

        /* renamed from: a */
        Survey f26904a;

        /* renamed from: b */
        private Button f26905b;

        /* renamed from: com.instabug.survey.ui.c$c$a */
        /* compiled from: SurveyFragment */
        class C10111a implements OnKeyListener {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26906b;

            /* renamed from: a */
            final /* synthetic */ C10110c f26907a;

            C10111a(C10110c cVar) {
                boolean[] a = m47059a();
                this.f26907a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47059a() {
                boolean[] zArr = f26906b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(353104988428964970L, "com/instabug/survey/ui/survey/SurveyFragment$1", 4);
                f26906b = a;
                return a;
            }

            public boolean onKey(android.view.View view, int i, KeyEvent keyEvent) {
                boolean z;
                boolean[] a = m47059a();
                if (i == 4) {
                    a[1] = true;
                    z = true;
                } else {
                    z = false;
                    a[2] = true;
                }
                a[3] = true;
                return z;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$b */
        /* compiled from: SurveyFragment */
        class C10112b implements C2019j {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f26908N;

            /* renamed from: a */
            final /* synthetic */ Survey f26909a;

            /* renamed from: b */
            final /* synthetic */ C10110c f26910b;

            C10112b(C10110c cVar, Survey survey) {
                boolean[] a = m47060a();
                this.f26910b = cVar;
                this.f26909a = survey;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47060a() {
                boolean[] zArr = f26908N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7665944300984199509L, "com/instabug/survey/ui/survey/SurveyFragment$2", 32);
                f26908N = a;
                return a;
            }

            /* renamed from: a */
            public void mo8879a(int i, float f, int i2) {
                m47060a()[1] = true;
            }

            /* renamed from: c */
            public void mo8880c(int i) {
                boolean[] a = m47060a();
                C10110c.m47026a(this.f26910b, i);
                a[2] = true;
                this.f26910b.mo36274a(i, (List<C10084b>) this.f26909a.getQuestions());
                if (i == 0) {
                    a[3] = true;
                    C10110c.m47034b(this.f26910b, 4);
                    a[4] = true;
                    C10110c.m47027a(this.f26910b).setText(C10049R.string.instabug_str_survey_next);
                    a[5] = true;
                } else if (i == C10110c.m47032b(this.f26910b).mo8886a() - 1) {
                    a[6] = true;
                    C10110c.m47035c(this.f26910b).setVisibility(0);
                    a[7] = true;
                    if (this.f26909a.isNPSSurvey()) {
                        a[8] = true;
                        if (this.f26909a.getQuestions().size() <= 2) {
                            a[9] = true;
                        } else if (!this.f26909a.hasPositiveNpsAnswer()) {
                            a[10] = true;
                        } else {
                            a[11] = true;
                            C10110c.m47027a(this.f26910b).setText(C10049R.string.surveys_nps_btn_rate_us);
                            a[12] = true;
                            C10110c.m47035c(this.f26910b).setVisibility(4);
                            a[13] = true;
                        }
                        C10110c.m47027a(this.f26910b).setText(C10049R.string.instabug_str_action_submit);
                        a[14] = true;
                    } else {
                        C10110c.m47027a(this.f26910b).setText(C10049R.string.instabug_str_action_submit);
                        a[15] = true;
                    }
                } else {
                    C10110c.m47035c(this.f26910b).setVisibility(0);
                    a[16] = true;
                    if (this.f26909a.isNPSSurvey()) {
                        a[17] = true;
                        C10110c.m47027a(this.f26910b).setText(C10049R.string.instabug_str_action_submit);
                        a[18] = true;
                    } else {
                        C10110c.m47027a(this.f26910b).setText(C10049R.string.instabug_str_survey_next);
                        a[19] = true;
                    }
                }
                if (((C10084b) this.f26909a.getQuestions().get(i)).mo36218g() == null) {
                    a[20] = true;
                } else {
                    Survey survey = this.f26909a;
                    a[21] = true;
                    if (((C10084b) survey.getQuestions().get(i)).mo36218g().isEmpty()) {
                        a[22] = true;
                    } else {
                        a[23] = true;
                        this.f26910b.mo36277a(true);
                        a[24] = true;
                        C10110c.m47036c(this.f26910b, i);
                        a[30] = true;
                    }
                }
                if (this.f26909a.isNPSSurvey()) {
                    a[25] = true;
                    if (this.f26909a.getQuestions().size() > 2) {
                        a[26] = true;
                        this.f26910b.mo36277a(true);
                        a[27] = true;
                    } else {
                        this.f26910b.mo36277a(false);
                        a[28] = true;
                    }
                } else {
                    this.f26910b.mo36277a(false);
                    a[29] = true;
                }
                C10110c.m47036c(this.f26910b, i);
                a[30] = true;
            }

            /* renamed from: a */
            public void mo8878a(int i) {
                m47060a()[31] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$c */
        /* compiled from: SurveyFragment */
        class C10113c implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f26911N;

            /* renamed from: a */
            final /* synthetic */ int f26912a;

            /* renamed from: b */
            final /* synthetic */ C10110c f26913b;

            C10113c(C10110c cVar, int i) {
                boolean[] a = m47064a();
                this.f26913b = cVar;
                this.f26912a = i;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47064a() {
                boolean[] zArr = f26911N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-2554993610210335306L, "com/instabug/survey/ui/survey/SurveyFragment$3", 9);
                f26911N = a;
                return a;
            }

            public void run() {
                boolean[] a = m47064a();
                if (((C10084b) this.f26913b.f26904a.getQuestions().get(this.f26912a)).mo36216e() != C10085a.TEXT) {
                    a[1] = true;
                } else {
                    C10110c cVar = this.f26913b;
                    a[2] = true;
                    if (!C10110c.m47038d(cVar)) {
                        a[3] = true;
                    } else {
                        a[4] = true;
                        ((C10134a) C10110c.m47032b(this.f26913b).mo36273e(this.f26912a)).mo36314h();
                        a[5] = true;
                        C10110c.m47031a(this.f26913b, false);
                        a[6] = true;
                        a[8] = true;
                    }
                }
                C10066b.m46827a(this.f26913b.getActivity());
                a[7] = true;
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$d */
        /* compiled from: SurveyFragment */
        class C10114d implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26914b;

            /* renamed from: a */
            final /* synthetic */ C10110c f26915a;

            C10114d(C10110c cVar) {
                boolean[] a = m47065a();
                this.f26915a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47065a() {
                boolean[] zArr = f26914b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(7375983311984070002L, "com/instabug/survey/ui/survey/SurveyFragment$4", 2);
                f26914b = a;
                return a;
            }

            public void run() {
                boolean[] a = m47065a();
                C10110c.m47039e(this.f26915a).scrollForward(true);
                a[1] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$e */
        /* compiled from: SurveyFragment */
        class C10115e implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26916b;

            /* renamed from: a */
            final /* synthetic */ C10110c f26917a;

            C10115e(C10110c cVar) {
                boolean[] a = m47066a();
                this.f26917a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47066a() {
                boolean[] zArr = f26916b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7025473340284988937L, "com/instabug/survey/ui/survey/SurveyFragment$5", 9);
                f26916b = a;
                return a;
            }

            public void run() {
                boolean[] a = m47066a();
                if (C10020a.m46628a(this.f26917a.getContext())) {
                    a[1] = true;
                    if (((C10084b) this.f26917a.f26904a.getQuestions().get(C10110c.m47040f(this.f26917a))).mo36218g() == null) {
                        a[2] = true;
                    } else {
                        Survey survey = this.f26917a.f26904a;
                        a[3] = true;
                        if (TextUtils.isEmpty(((C10084b) survey.getQuestions().get(C10110c.m47040f(this.f26917a))).mo36218g())) {
                            a[4] = true;
                        } else {
                            a[5] = true;
                            C10110c.m47039e(this.f26917a).scrollForward(true);
                            a[6] = true;
                        }
                    }
                } else {
                    C10110c.m47039e(this.f26917a).scrollBackward(true);
                    a[7] = true;
                }
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$f */
        /* compiled from: SurveyFragment */
        class C10116f implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26918b;

            /* renamed from: a */
            final /* synthetic */ C10110c f26919a;

            C10116f(C10110c cVar) {
                boolean[] a = m47067a();
                this.f26919a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47067a() {
                boolean[] zArr = f26918b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7069490339450419910L, "com/instabug/survey/ui/survey/SurveyFragment$6", 9);
                f26918b = a;
                return a;
            }

            public void run() {
                boolean[] a = m47067a();
                if (C10020a.m46628a(this.f26919a.getContext())) {
                    a[1] = true;
                    C10110c.m47039e(this.f26919a).scrollBackward(true);
                    a[2] = true;
                } else if (((C10084b) this.f26919a.f26904a.getQuestions().get(C10110c.m47040f(this.f26919a))).mo36218g() == null) {
                    a[3] = true;
                } else {
                    Survey survey = this.f26919a.f26904a;
                    a[4] = true;
                    if (TextUtils.isEmpty(((C10084b) survey.getQuestions().get(C10110c.m47040f(this.f26919a))).mo36218g())) {
                        a[5] = true;
                    } else {
                        a[6] = true;
                        C10110c.m47039e(this.f26919a).scrollForward(true);
                        a[7] = true;
                    }
                }
                a[8] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$h */
        /* compiled from: MCQQuestionFragment */
        public class C10117h extends C10107b implements C10120b {

            /* renamed from: W */
            private static transient /* synthetic */ boolean[] f26920W;
            @C0224v0

            /* renamed from: U */
            protected C10118i f26921U;
            @C0224v0

            /* renamed from: V */
            protected GridView f26922V;

            public C10117h() {
                m47069h()[0] = true;
            }

            /* renamed from: a */
            public static C10117h m47068a(C10084b bVar, C10122e eVar) {
                boolean[] h = m47069h();
                Bundle bundle = new Bundle();
                h[2] = true;
                bundle.putSerializable("question", bVar);
                h[3] = true;
                C10117h hVar = new C10117h();
                h[4] = true;
                hVar.setArguments(bundle);
                h[5] = true;
                hVar.mo36267a(eVar);
                h[6] = true;
                return hVar;
            }

            /* renamed from: h */
            private static /* synthetic */ boolean[] m47069h() {
                boolean[] zArr = f26920W;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-5773462627145089695L, "com/instabug/survey/ui/survey/mcq/MCQQuestionFragment", 33);
                f26920W = a;
                return a;
            }

            /* renamed from: c */
            public void mo36294c(C10084b bVar) {
                boolean[] h = m47069h();
                this.f26881N.setText(bVar.mo36215d());
                h[17] = true;
                this.f26921U = new C10118i(getActivity(), bVar, this);
                h[18] = true;
                this.f26922V.setAdapter(this.f26921U);
                h[19] = true;
                this.f26921U.mo36297a(bVar.mo36218g());
                h[20] = true;
            }

            /* renamed from: f */
            public String mo36269f() {
                boolean[] h = m47069h();
                C10118i iVar = this.f26921U;
                if (iVar == null) {
                    h[21] = true;
                } else {
                    h[22] = true;
                    if (iVar.mo36295a() == null) {
                        h[23] = true;
                    } else {
                        h[24] = true;
                        String a = this.f26921U.mo36295a();
                        h[25] = true;
                        return a;
                    }
                }
                Toast makeText = Toast.makeText(getContext(), getString(C10049R.string.instabug_str_error_survey_without_answer), 0);
                h[26] = true;
                makeText.show();
                h[27] = true;
                return null;
            }

            /* access modifiers changed from: protected */
            public int getLayout() {
                boolean[] h = m47069h();
                int i = C10049R.layout.instabug_dialog_mcq_survey;
                h[1] = true;
                return i;
            }

            /* access modifiers changed from: protected */
            public void initViews(android.view.View view, Bundle bundle) {
                boolean[] h = m47069h();
                super.initViews(view, bundle);
                h[10] = true;
                this.f26881N = (TextView) view.findViewById(C10049R.C10053id.instabug_text_view_question);
                h[11] = true;
                this.f26922V = (GridView) view.findViewById(C10049R.C10053id.instabug_survey_mcq_grid_view);
                h[12] = true;
                mo36270g();
                h[13] = true;
            }

            public void onCreate(Bundle bundle) {
                boolean[] h = m47069h();
                super.onCreate(bundle);
                h[7] = true;
                setRetainInstance(true);
                h[8] = true;
                this.f26887a = (C10084b) getArguments().getSerializable("question");
                h[9] = true;
            }

            public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
                boolean[] h = m47069h();
                super.onViewCreated(view, bundle);
                h[14] = true;
                view.setFocusableInTouchMode(true);
                h[15] = true;
                mo36294c(this.f26887a);
                h[16] = true;
            }

            /* renamed from: a */
            public void mo36293a(android.view.View view, String str) {
                boolean[] h = m47069h();
                this.f26887a.mo36214c(str);
                C10122e eVar = this.f26888b;
                if (eVar == null) {
                    h[28] = true;
                } else {
                    h[29] = true;
                    eVar.mo36281c(this.f26887a);
                    h[30] = true;
                }
                h[31] = true;
            }
        }

        /* renamed from: com.instabug.survey.ui.c$c$i */
        /* compiled from: SurveyMCQGridAdapter */
        public class C10118i extends BaseAdapter {

            /* renamed from: Q */
            private static transient /* synthetic */ boolean[] f26923Q;

            /* renamed from: N */
            private C10084b f26924N;

            /* renamed from: O */
            private int f26925O = -1;

            /* renamed from: P */
            private Context f26926P;

            /* renamed from: a */
            private final LayoutInflater f26927a;

            /* renamed from: b */
            private C10120b f26928b;

            /* renamed from: com.instabug.survey.ui.c$c$i$a */
            /* compiled from: SurveyMCQGridAdapter */
            class C10119a implements OnClickListener {

                /* renamed from: O */
                private static transient /* synthetic */ boolean[] f26929O;

                /* renamed from: N */
                final /* synthetic */ C10118i f26930N;

                /* renamed from: a */
                final /* synthetic */ int f26931a;

                /* renamed from: b */
                final /* synthetic */ String f26932b;

                C10119a(C10118i iVar, int i, String str) {
                    boolean[] a = m47082a();
                    this.f26930N = iVar;
                    this.f26931a = i;
                    this.f26932b = str;
                    a[0] = true;
                }

                /* renamed from: a */
                private static /* synthetic */ boolean[] m47082a() {
                    boolean[] zArr = f26929O;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(-8117070709232773759L, "com/instabug/survey/ui/survey/mcq/SurveyMCQGridAdapter$1", 3);
                    f26929O = a;
                    return a;
                }

                public void onClick(android.view.View view) {
                    boolean[] a = m47082a();
                    C10118i.m47076a(this.f26930N, this.f26931a);
                    a[1] = true;
                    C10118i.m47074a(this.f26930N).mo36293a(view, this.f26932b);
                    a[2] = true;
                }
            }

            /* renamed from: com.instabug.survey.ui.c$c$i$b */
            /* compiled from: SurveyMCQGridAdapter */
            public interface C10120b {
                /* renamed from: a */
                void mo36293a(android.view.View view, String str);
            }

            /* renamed from: com.instabug.survey.ui.c$c$i$c */
            /* compiled from: SurveyMCQGridAdapter */
            private static class C10121c {

                /* renamed from: d */
                private static transient /* synthetic */ boolean[] f26933d;

                /* renamed from: a */
                LinearLayout f26934a;

                /* renamed from: b */
                TextView f26935b;

                /* renamed from: c */
                ImageView f26936c;

                private C10121c() {
                    m47084a()[0] = true;
                }

                /* renamed from: a */
                private static /* synthetic */ boolean[] m47084a() {
                    boolean[] zArr = f26933d;
                    if (zArr != null) {
                        return zArr;
                    }
                    boolean[] a = C13938g.m59885a(3538996270044243410L, "com/instabug/survey/ui/survey/mcq/SurveyMCQGridAdapter$MCQViewHolder", 2);
                    f26933d = a;
                    return a;
                }

                /* synthetic */ C10121c(C10119a aVar) {
                    boolean[] a = m47084a();
                    this();
                    a[1] = true;
                }
            }

            public C10118i(Activity activity, C10084b bVar, C10120b bVar2) {
                boolean[] b = m47078b();
                this.f26926P = activity;
                b[0] = true;
                this.f26927a = LayoutInflater.from(activity);
                this.f26924N = bVar;
                b[1] = true;
                m47075a(bVar);
                this.f26928b = bVar2;
                b[2] = true;
            }

            /* renamed from: a */
            static /* synthetic */ C10120b m47074a(C10118i iVar) {
                boolean[] b = m47078b();
                C10120b bVar = iVar.f26928b;
                b[59] = true;
                return bVar;
            }

            /* renamed from: b */
            private void m47077b(int i) {
                boolean[] b = m47078b();
                this.f26925O = i;
                b[43] = true;
                notifyDataSetChanged();
                b[44] = true;
            }

            /* renamed from: b */
            private static /* synthetic */ boolean[] m47078b() {
                boolean[] zArr = f26923Q;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(308066327542761632L, "com/instabug/survey/ui/survey/mcq/SurveyMCQGridAdapter", 60);
                f26923Q = a;
                return a;
            }

            public int getCount() {
                int i;
                boolean[] b = m47078b();
                C10084b bVar = this.f26924N;
                if (bVar == null) {
                    b[11] = true;
                } else if (bVar.mo36217f() == null) {
                    b[12] = true;
                } else {
                    i = this.f26924N.mo36217f().size();
                    b[13] = true;
                    b[15] = true;
                    return i;
                }
                i = 0;
                b[14] = true;
                b[15] = true;
                return i;
            }

            public /* synthetic */ Object getItem(int i) {
                boolean[] b = m47078b();
                String a = mo36296a(i);
                b[57] = true;
                return a;
            }

            public long getItemId(int i) {
                long j = (long) i;
                m47078b()[17] = true;
                return j;
            }

            public android.view.View getView(int i, android.view.View view, ViewGroup viewGroup) {
                C10121c cVar;
                android.view.View view2;
                boolean[] b = m47078b();
                if (view == null) {
                    b[18] = true;
                    cVar = new C10121c(null);
                    b[19] = true;
                    view2 = this.f26927a.inflate(C10049R.layout.instabug_survey_mcq_item, null);
                    b[20] = true;
                    cVar.f26934a = (LinearLayout) view2.findViewById(C10049R.C10053id.mcq_item);
                    b[21] = true;
                    cVar.f26935b = (TextView) view2.findViewById(C10049R.C10053id.survey_optional_answer_textview);
                    b[22] = true;
                    cVar.f26936c = (ImageView) view2.findViewById(C10049R.C10053id.selector_img);
                    b[23] = true;
                    view2.setTag(cVar);
                    b[24] = true;
                } else {
                    C10121c cVar2 = (C10121c) view.getTag();
                    b[25] = true;
                    C10121c cVar3 = cVar2;
                    view2 = view;
                    cVar = cVar3;
                }
                cVar.f26935b.setText((CharSequence) this.f26924N.mo36217f().get(i));
                if (i == this.f26925O) {
                    b[26] = true;
                    if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                        b[27] = true;
                        DrawableUtils.setColor(cVar.f26934a, C0821b.m4811d(Instabug.getPrimaryColor(), 25));
                        b[28] = true;
                    } else {
                        DrawableUtils.setColor(cVar.f26934a, C0821b.m4811d(Instabug.getPrimaryColor(), 50));
                        b[29] = true;
                    }
                    cVar.f26935b.setTextColor(AttrResolver.resolveAttributeColor(this.f26926P, C10049R.attr.instabug_survey_mcq_text_color_selected));
                    b[30] = true;
                    cVar.f26936c.setColorFilter(Instabug.getPrimaryColor());
                    b[31] = true;
                    cVar.f26936c.setImageResource(C10049R.C10052drawable.ic_mcq_selected);
                    b[32] = true;
                } else {
                    DrawableUtils.setColor(cVar.f26934a, AttrResolver.resolveAttributeColor(this.f26926P, C10049R.attr.instabug_survey_mcq_unselected_bg));
                    b[33] = true;
                    cVar.f26935b.setTextColor(AttrResolver.resolveAttributeColor(this.f26926P, C10049R.attr.instabug_survey_mcq_text_color));
                    b[34] = true;
                    cVar.f26936c.setColorFilter(AttrResolver.resolveAttributeColor(this.f26926P, C10049R.attr.instabug_survey_mcq_radio_icon_color));
                    b[35] = true;
                    cVar.f26936c.setImageResource(C10049R.C10052drawable.ic_mcq_unselected);
                    b[36] = true;
                }
                if (this.f26928b == null) {
                    b[37] = true;
                } else {
                    b[38] = true;
                    cVar.f26935b.setOnClickListener(m47073a((String) this.f26924N.mo36217f().get(i), i));
                    b[39] = true;
                    cVar.f26936c.setOnClickListener(m47073a((String) this.f26924N.mo36217f().get(i), i));
                    b[40] = true;
                }
                b[41] = true;
                return view2;
            }

            /* renamed from: a */
            static /* synthetic */ void m47076a(C10118i iVar, int i) {
                boolean[] b = m47078b();
                iVar.m47077b(i);
                b[58] = true;
            }

            /* renamed from: a */
            private void m47075a(C10084b bVar) {
                boolean[] b = m47078b();
                b[3] = true;
                int i = 0;
                while (true) {
                    if (i >= bVar.mo36217f().size()) {
                        b[4] = true;
                        break;
                    }
                    b[5] = true;
                    if (bVar.mo36218g() != null) {
                        if (bVar.mo36218g().equals(bVar.mo36217f().get(i))) {
                            this.f26925O = i;
                            b[8] = true;
                            break;
                        }
                        b[7] = true;
                    } else {
                        b[6] = true;
                    }
                    i++;
                    b[9] = true;
                }
                b[10] = true;
            }

            /* renamed from: a */
            public String mo36296a(int i) {
                String str = (String) this.f26924N.mo36217f().get(i);
                m47078b()[16] = true;
                return str;
            }

            /* renamed from: a */
            private OnClickListener m47073a(String str, int i) {
                boolean[] b = m47078b();
                C10119a aVar = new C10119a(this, i, str);
                b[42] = true;
                return aVar;
            }

            /* renamed from: a */
            public String mo36295a() {
                boolean[] b = m47078b();
                int i = this.f26925O;
                if (i == -1) {
                    b[45] = true;
                    return null;
                }
                String a = mo36296a(i);
                b[46] = true;
                return a;
            }

            /* renamed from: a */
            public void mo36297a(String str) {
                boolean[] b = m47078b();
                if (str == null) {
                    b[47] = true;
                } else if (str.isEmpty()) {
                    b[48] = true;
                } else {
                    b[49] = true;
                    int i = 0;
                    b[50] = true;
                    while (true) {
                        if (i >= getCount()) {
                            b[51] = true;
                            break;
                        }
                        b[52] = true;
                        String a = mo36296a(i);
                        b[53] = true;
                        if (a.equalsIgnoreCase(str)) {
                            this.f26925O = i;
                            b[54] = true;
                            break;
                        }
                        i++;
                        b[55] = true;
                    }
                }
                b[56] = true;
            }
        }

        public C10110c() {
            boolean[] m = m47045m();
            m[0] = true;
        }

        /* renamed from: a */
        static /* synthetic */ int m47026a(C10110c cVar, int i) {
            boolean[] m = m47045m();
            cVar.f26899S = i;
            m[304] = true;
            return i;
        }

        /* renamed from: b */
        static /* synthetic */ C10109b m47032b(C10110c cVar) {
            boolean[] m = m47045m();
            C10109b bVar = cVar.f26895O;
            m[307] = true;
            return bVar;
        }

        /* renamed from: c */
        static /* synthetic */ ImageView m47035c(C10110c cVar) {
            boolean[] m = m47045m();
            ImageView imageView = cVar.f26896P;
            m[308] = true;
            return imageView;
        }

        /* renamed from: d */
        static /* synthetic */ boolean m47038d(C10110c cVar) {
            boolean[] m = m47045m();
            boolean z = cVar.f26902V;
            m[310] = true;
            return z;
        }

        /* renamed from: e */
        static /* synthetic */ InstabugViewPager m47039e(C10110c cVar) {
            boolean[] m = m47045m();
            InstabugViewPager instabugViewPager = cVar.f26894N;
            m[312] = true;
            return instabugViewPager;
        }

        /* renamed from: f */
        static /* synthetic */ int m47040f(C10110c cVar) {
            boolean[] m = m47045m();
            int i = cVar.f26899S;
            m[313] = true;
            return i;
        }

        /* renamed from: h */
        private void m47041h() {
            boolean[] m = m47045m();
            this.f26897Q.setVisibility(4);
            m[185] = true;
            this.f26896P.setVisibility(4);
            m[186] = true;
        }

        /* renamed from: i */
        private void m47042i() {
            boolean[] m = m47045m();
            if (!this.f26904a.isNPSSurvey()) {
                m[187] = true;
            } else if (this.f26894N.getCurrentItem() != 2) {
                m[188] = true;
            } else {
                m[189] = true;
                this.f26896P.setVisibility(4);
                m[190] = true;
                if (this.f26904a.isLifeVersion()) {
                    m[191] = true;
                    this.f26905b.setText(C10049R.string.surveys_nps_btn_rate_us);
                    m[192] = true;
                } else {
                    this.f26905b.setText(C10049R.string.instabug_str_action_submit);
                    m[193] = true;
                }
            }
            m[194] = true;
        }

        /* renamed from: j */
        private void m47043j() {
            int i;
            boolean[] m = m47045m();
            if (m47044l()) {
                m[195] = true;
                this.f26901U.mo36242c(this.f26904a);
                m[196] = true;
            } else {
                if (!this.f26904a.isNPSSurvey()) {
                    m[197] = true;
                } else if (!this.f26904a.hasPositiveNpsAnswer()) {
                    m[198] = true;
                } else {
                    m[199] = true;
                    InstabugViewPager instabugViewPager = this.f26894N;
                    if (instabugViewPager.getAdapter().mo8886a() > 2) {
                        InstabugViewPager instabugViewPager2 = this.f26894N;
                        m[200] = true;
                        i = instabugViewPager2.getCurrentItem() - 2;
                        m[201] = true;
                    } else {
                        i = this.f26894N.getCurrentItem() - 1;
                        m[202] = true;
                    }
                    instabugViewPager.setCurrentItem(i);
                    m[203] = true;
                }
                this.f26894N.scrollBackward(true);
                m[204] = true;
            }
            m[205] = true;
        }

        /* renamed from: l */
        private boolean m47044l() {
            boolean z;
            boolean[] m = m47045m();
            if (this.f26894N.getCurrentItem() == 0) {
                m[206] = true;
                z = true;
            } else {
                z = false;
                m[207] = true;
            }
            m[208] = true;
            return z;
        }

        /* renamed from: m */
        private static /* synthetic */ boolean[] m47045m() {
            boolean[] zArr = f26893X;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5282906627550121606L, "com/instabug/survey/ui/survey/SurveyFragment", 314);
            f26893X = a;
            return a;
        }

        /* renamed from: g */
        public void mo36286g() {
            int i;
            boolean[] m = m47045m();
            if (this.f26904a.isNPSSurvey()) {
                m[282] = true;
                if (!C10020a.m46628a(getContext())) {
                    if (this.f26894N.getCurrentItem() != 0) {
                        m[286] = true;
                    } else {
                        Survey survey = this.f26904a;
                        m[287] = true;
                        if (!survey.hasPositiveNpsAnswer()) {
                            m[288] = true;
                        } else {
                            m[289] = true;
                            InstabugViewPager instabugViewPager = this.f26894N;
                            if (this.f26895O.mo8886a() < 3) {
                                InstabugViewPager instabugViewPager2 = this.f26894N;
                                m[290] = true;
                                i = instabugViewPager2.getCurrentItem() + 1;
                                m[291] = true;
                            } else {
                                InstabugViewPager instabugViewPager3 = this.f26894N;
                                m[292] = true;
                                i = instabugViewPager3.getCurrentItem() + 2;
                                m[293] = true;
                            }
                            m[294] = true;
                            instabugViewPager.setCurrentItem(i, true);
                            m[295] = true;
                            this.f26896P.setVisibility(4);
                            m[296] = true;
                            if (this.f26904a.isLifeVersion()) {
                                m[297] = true;
                                this.f26905b.setText(C10049R.string.surveys_nps_btn_rate_us);
                                m[298] = true;
                            } else {
                                this.f26905b.setText(C10049R.string.instabug_str_action_submit);
                                m[299] = true;
                            }
                        }
                    }
                    if (this.f26894N.getCurrentItem() == 1) {
                        m[300] = true;
                    } else {
                        this.f26894N.setCurrentItem(1, true);
                        m[301] = true;
                    }
                } else if (this.f26899S != 1) {
                    m[283] = true;
                } else {
                    m[284] = true;
                    this.f26894N.setCurrentItem(0, true);
                    m[285] = true;
                }
            } else {
                this.f26894N.postDelayed(new C10116f(this), 200);
                m[302] = true;
            }
            m[303] = true;
        }

        /* access modifiers changed from: protected */
        public int getLayout() {
            boolean[] m = m47045m();
            int i = C10049R.layout.instabug_dialog_survey;
            m[8] = true;
            return i;
        }

        /* access modifiers changed from: protected */
        public void initViews(android.view.View view, Bundle bundle) {
            boolean[] m = m47045m();
            view.setOnKeyListener(new C10111a(this));
            m[19] = true;
            this.f26905b = (Button) view.findViewById(C10049R.C10053id.instabug_btn_submit);
            m[20] = true;
            this.f26905b.setOnClickListener(this);
            m[21] = true;
            this.f26894N = (InstabugViewPager) findViewById(C10049R.C10053id.instabug_survey_pager);
            m[22] = true;
            this.f26894N.setSwipeable(false);
            m[23] = true;
            this.f26894N.setOffscreenPageLimit(this.f26904a.getQuestions().size());
            m[24] = true;
            this.f26896P = (ImageView) findViewById(C10049R.C10053id.instabug_ic_survey_close);
            m[25] = true;
            this.f26898R = new MaterialMenuDrawable(getActivity(), C0841b.m4915a((Context) getActivity(), 17170443), Stroke.THIN);
            m[26] = true;
            this.f26896P.setImageDrawable(this.f26898R.getCurrent());
            m[27] = true;
            this.f26896P.setOnClickListener(this);
            m[28] = true;
            this.f26896P.setVisibility(4);
            m[29] = true;
            if (!C10020a.m46628a(getContext())) {
                m[30] = true;
            } else {
                m[31] = true;
                this.f26898R.setRTLEnabled(true);
                m[32] = true;
                this.f26894N.setRotation(180.0f);
                m[33] = true;
            }
            this.f26898R.setIconState(IconState.ARROW);
            m[34] = true;
            this.f26897Q = (ProgressBar) findViewById(C10049R.C10053id.survey_step_progressbar);
            m[35] = true;
            LayerDrawable layerDrawable = (LayerDrawable) this.f26897Q.getProgressDrawable();
            m[36] = true;
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                m[37] = true;
                Resources resources = getResources();
                int i = C10049R.C10052drawable.survey_progressbar_background_light;
                m[38] = true;
                Drawable drawable = resources.getDrawable(i);
                m[39] = true;
                layerDrawable.setDrawableByLayerId(16908288, drawable);
                m[40] = true;
            } else {
                Resources resources2 = getResources();
                int i2 = C10049R.C10052drawable.survey_progressbar_background_dark;
                m[41] = true;
                Drawable drawable2 = resources2.getDrawable(i2);
                m[42] = true;
                layerDrawable.setDrawableByLayerId(16908288, drawable2);
                m[43] = true;
            }
            Drawable drawable3 = layerDrawable.getDrawable(1);
            m[44] = true;
            drawable3.setColorFilter(Instabug.getPrimaryColor(), Mode.SRC_IN);
            m[45] = true;
            this.f26897Q.setProgressDrawable(layerDrawable);
            m[46] = true;
        }

        public void onAttach(Context context) {
            boolean[] m = m47045m();
            super.onAttach(context);
            m[1] = true;
            if (!(getActivity() instanceof SurveyActivity)) {
                m[2] = true;
            } else {
                try {
                    m[3] = true;
                    this.f26901U = (C10104b) getActivity();
                    m[4] = true;
                } catch (Exception unused) {
                    m[5] = true;
                    RuntimeException runtimeException = new RuntimeException("Must implement SurveyActivityCallback ");
                    m[6] = true;
                    throw runtimeException;
                }
            }
            m[7] = true;
        }

        public void onClick(android.view.View view) {
            boolean[] m = m47045m();
            int id = view.getId();
            if (id == C10049R.C10053id.instabug_btn_submit) {
                m[135] = true;
                m47030a(view);
                m[136] = true;
            } else if (id != C10049R.C10053id.instabug_ic_survey_close) {
                m[137] = true;
            } else {
                m[138] = true;
                if (SystemClock.elapsedRealtime() - this.f26903W < 1000) {
                    m[139] = true;
                    return;
                }
                this.f26903W = SystemClock.elapsedRealtime();
                m[140] = true;
                m47043j();
                m[141] = true;
            }
            m[142] = true;
        }

        public void onCreate(Bundle bundle) {
            boolean[] m = m47045m();
            super.onCreate(bundle);
            m[14] = true;
            setRetainInstance(true);
            m[15] = true;
            this.f26904a = (Survey) getArguments().getSerializable("survey");
            m[16] = true;
            this.f26902V = getArguments().getBoolean("should_show_keyboard");
            m[17] = true;
            this.presenter = new C10127h(this, this.f26904a);
            m[18] = true;
        }

        public void onResume() {
            boolean[] m = m47045m();
            super.onResume();
            m[99] = true;
            m47037d(this.f26894N.getCurrentItem());
            m[100] = true;
            m47042i();
            m[101] = true;
        }

        public void onSaveInstanceState(Bundle bundle) {
            boolean[] m = m47045m();
            bundle.putInt(this.f26900T, this.f26899S);
            m[102] = true;
            super.onSaveInstanceState(bundle);
            m[103] = true;
        }

        public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
            boolean[] m = m47045m();
            super.onViewCreated(view, bundle);
            m[47] = true;
            view.setFocusableInTouchMode(true);
            m[48] = true;
            ((C10127h) this.presenter).mo36304c();
            m[49] = true;
            ((C10127h) this.presenter).mo36305d();
            m[50] = true;
            m47029a(bundle);
            m[51] = true;
        }

        /* renamed from: a */
        static /* synthetic */ Button m47027a(C10110c cVar) {
            boolean[] m = m47045m();
            Button button = cVar.f26905b;
            m[306] = true;
            return button;
        }

        /* renamed from: b */
        static /* synthetic */ void m47034b(C10110c cVar, int i) {
            boolean[] m = m47045m();
            cVar.m47033b(i);
            m[305] = true;
        }

        /* renamed from: c */
        static /* synthetic */ void m47036c(C10110c cVar, int i) {
            boolean[] m = m47045m();
            cVar.m47037d(i);
            m[309] = true;
        }

        /* renamed from: d */
        private void m47037d(int i) {
            boolean[] m = m47045m();
            this.f26894N.postDelayed(new C10113c(this, i), 100);
            m[98] = true;
        }

        /* renamed from: e */
        public void mo36284e() {
            boolean[] m = m47045m();
            C10068d.m46833a(getView());
            m[257] = true;
        }

        /* renamed from: f */
        public void mo36285f() {
            int i;
            boolean[] m = m47045m();
            if (this.f26904a.isNPSSurvey()) {
                m[258] = true;
                if (C10020a.m46628a(getContext())) {
                    if (this.f26899S != 0) {
                        m[259] = true;
                    } else {
                        Survey survey = this.f26904a;
                        m[260] = true;
                        if (!survey.hasPositiveNpsAnswer()) {
                            m[261] = true;
                        } else {
                            m[262] = true;
                            InstabugViewPager instabugViewPager = this.f26894N;
                            if (this.f26895O.mo8886a() < 3) {
                                InstabugViewPager instabugViewPager2 = this.f26894N;
                                m[263] = true;
                                i = instabugViewPager2.getCurrentItem() + 1;
                                m[264] = true;
                            } else {
                                InstabugViewPager instabugViewPager3 = this.f26894N;
                                m[265] = true;
                                i = 2 + instabugViewPager3.getCurrentItem();
                                m[266] = true;
                            }
                            m[267] = true;
                            instabugViewPager.setCurrentItem(i, true);
                            m[268] = true;
                            this.f26896P.setVisibility(4);
                            m[269] = true;
                            if (this.f26904a.isLifeVersion()) {
                                m[270] = true;
                                this.f26905b.setText(C10049R.string.surveys_nps_btn_rate_us);
                                m[271] = true;
                            } else {
                                this.f26905b.setText(C10049R.string.instabug_str_action_submit);
                                m[272] = true;
                            }
                        }
                    }
                    if (this.f26894N.getCurrentItem() == 2) {
                        m[273] = true;
                    } else {
                        this.f26894N.setCurrentItem(1, true);
                        m[274] = true;
                    }
                } else if (this.f26894N.getCurrentItem() == 2) {
                    m[275] = true;
                } else {
                    m[276] = true;
                    InstabugViewPager instabugViewPager4 = this.f26894N;
                    instabugViewPager4.setCurrentItem(instabugViewPager4.getCurrentItem() - 1, true);
                    m[277] = true;
                    this.f26896P.setVisibility(4);
                    m[278] = true;
                    this.f26905b.setText(C10049R.string.instabug_str_survey_next);
                    m[279] = true;
                }
            } else {
                this.f26894N.postDelayed(new C10115e(this), 300);
                m[280] = true;
            }
            m[281] = true;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m47031a(C10110c cVar, boolean z) {
            boolean[] m = m47045m();
            cVar.f26902V = z;
            m[311] = true;
            return z;
        }

        /* renamed from: b */
        private void m47033b(int i) {
            boolean[] m = m47045m();
            if (i != 0) {
                m[92] = true;
            } else if (this.f26896P.getVisibility() == 0) {
                m[93] = true;
            } else {
                m[94] = true;
                C10158f.m47216a(this.f26896P);
                m[95] = true;
                m[97] = true;
            }
            C10158f.m47218b(this.f26896P);
            m[96] = true;
            m[97] = true;
        }

        /* renamed from: c */
        public void mo36281c(C10084b bVar) {
            boolean[] m = m47045m();
            C10084b bVar2 = (C10084b) this.f26904a.getQuestions().get(m47025a(bVar.mo36209a()));
            m[209] = true;
            String g = bVar.mo36218g();
            m[210] = true;
            bVar2.mo36214c(g);
            m[211] = true;
            mo36277a(true);
            m[212] = true;
        }

        /* renamed from: a */
        public static C10110c m47028a(Survey survey, boolean z) {
            boolean[] m = m47045m();
            Bundle bundle = new Bundle();
            m[9] = true;
            bundle.putSerializable("survey", survey);
            m[10] = true;
            bundle.putBoolean("should_show_keyboard", z);
            m[11] = true;
            C10110c cVar = new C10110c();
            m[12] = true;
            cVar.setArguments(bundle);
            m[13] = true;
            return cVar;
        }

        /* renamed from: d */
        public void mo36282d() {
            boolean[] m = m47045m();
            this.f26894N.scrollBackward(true);
            m[244] = true;
        }

        /* renamed from: d */
        public void mo36283d(C10084b bVar) {
            boolean[] m = m47045m();
            C10084b bVar2 = (C10084b) this.f26904a.getQuestions().get(m47025a(bVar.mo36209a()));
            m[245] = true;
            String g = bVar.mo36218g();
            m[246] = true;
            bVar2.mo36214c(g);
            m[247] = true;
            mo36277a(true);
            m[248] = true;
            if (this.f26904a.isPromoter()) {
                m[249] = true;
                this.f26905b.setText(C10049R.string.instabug_str_action_submit);
                m[250] = true;
            } else {
                this.f26905b.setText(C10049R.string.instabug_str_survey_next);
                m[251] = true;
            }
            m[252] = true;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: b */
        public List<C10107b> mo36278b(Survey survey) {
            boolean[] m = m47045m();
            ArrayList arrayList = new ArrayList();
            m[104] = true;
            Iterator it = survey.getQuestions().iterator();
            m[105] = true;
            while (it.hasNext()) {
                C10084b bVar = (C10084b) it.next();
                m[106] = true;
                if (bVar.mo36216e() == C10085a.MCQ) {
                    m[107] = true;
                    arrayList.add(C10117h.m47068a(bVar, (C10122e) this));
                    m[108] = true;
                } else if (bVar.mo36216e() == C10085a.TEXT) {
                    m[109] = true;
                    arrayList.add(C10134a.m47122a(bVar, this));
                    m[110] = true;
                } else if (bVar.mo36216e() == C10085a.STAR_RATE) {
                    m[111] = true;
                    arrayList.add(C10133b.m47116a(bVar, this));
                    m[112] = true;
                } else if (bVar.mo36216e() == C10085a.NPS) {
                    m[113] = true;
                    this.f26897Q.setVisibility(8);
                    m[114] = true;
                    arrayList.add(C10131b.m47108a(bVar, this));
                    m[115] = true;
                } else if (bVar.mo36216e() != C10085a.STORE_RATING) {
                    m[116] = true;
                } else {
                    m[117] = true;
                    arrayList.add(C10126c.m47092a(bVar, this));
                    m[118] = true;
                }
                m[119] = true;
            }
            m[120] = true;
            return arrayList;
        }

        /* renamed from: c */
        public void mo36280c() {
            boolean[] m = m47045m();
            C10068d.m46832a(getContext(), getView());
            m[253] = true;
            LayoutParams layoutParams = (LayoutParams) this.f26905b.getLayoutParams();
            m[254] = true;
            layoutParams.bottomMargin = DisplayUtils.dpToPx(getResources(), 8);
            m[255] = true;
            this.f26905b.requestLayout();
            m[256] = true;
        }

        /* renamed from: a */
        private void m47029a(Bundle bundle) {
            boolean[] m = m47045m();
            if (bundle != null) {
                m[52] = true;
                if (bundle.getInt(this.f26900T) == -1) {
                    m[53] = true;
                } else {
                    m[54] = true;
                    this.f26899S = bundle.getInt(this.f26900T);
                    m[55] = true;
                    if (((C10084b) this.f26904a.getQuestions().get(this.f26899S)).mo36218g() == null) {
                        m[56] = true;
                    } else {
                        Survey survey = this.f26904a;
                        m[57] = true;
                        C10084b bVar = (C10084b) survey.getQuestions().get(this.f26899S);
                        m[58] = true;
                        if (bVar.mo36218g().isEmpty()) {
                            m[59] = true;
                        } else {
                            m[60] = true;
                            mo36277a(true);
                            m[61] = true;
                        }
                    }
                }
            } else {
                this.f26899S = this.f26894N.getCurrentItem();
                m[62] = true;
                if (((C10084b) this.f26904a.getQuestions().get(this.f26899S)).mo36218g() == null) {
                    m[63] = true;
                } else {
                    Survey survey2 = this.f26904a;
                    m[64] = true;
                    C10084b bVar2 = (C10084b) survey2.getQuestions().get(this.f26899S);
                    m[65] = true;
                    if (bVar2.mo36218g().isEmpty()) {
                        m[66] = true;
                    } else {
                        m[67] = true;
                        mo36277a(true);
                        m[68] = true;
                    }
                }
                mo36277a(false);
                m[69] = true;
            }
            m[70] = true;
        }

        /* renamed from: b */
        public void mo36279b(C10084b bVar) {
            boolean[] m = m47045m();
            C10084b bVar2 = (C10084b) this.f26904a.getQuestions().get(m47025a(bVar.mo36209a()));
            m[213] = true;
            String g = bVar.mo36218g();
            m[214] = true;
            bVar2.mo36214c(g);
            m[215] = true;
            if (bVar.mo36218g() == null) {
                m[216] = true;
            } else if (bVar.mo36218g().length() <= 0) {
                m[217] = true;
            } else {
                m[218] = true;
                mo36277a(true);
                m[219] = true;
                m[223] = true;
            }
            if (this.f26904a.isNPSSurvey()) {
                m[220] = true;
            } else {
                m[221] = true;
                mo36277a(false);
                m[222] = true;
            }
            m[223] = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00bb  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36275a(com.instabug.survey.models.Survey r6) {
            /*
                r5 = this;
                boolean[] r0 = m47045m()
                java.util.List r1 = r5.mo36278b(r6)
                r2 = 1
                r3 = 71
                r0[r3] = r2
                com.instabug.survey.ui.c$b$b r3 = new com.instabug.survey.ui.c$b$b
                androidx.fragment.app.h r4 = r5.getChildFragmentManager()
                r3.<init>(r4, r1)
                r5.f26895O = r3
                r1 = 72
                r0[r1] = r2
                com.instabug.library.ui.custom.InstabugViewPager r1 = r5.f26894N
                com.instabug.survey.ui.c$b$b r3 = r5.f26895O
                r1.setAdapter(r3)
                r1 = 73
                r0[r1] = r2
                java.util.ArrayList r1 = r6.getQuestions()
                int r1 = r1.size()
                r3 = 0
                if (r1 <= r2) goto L_0x005b
                r1 = 74
                r0[r1] = r2
                android.widget.Button r1 = r5.f26905b
                int r4 = com.instabug.survey.C10049R.string.instabug_str_survey_next
                r1.setText(r4)
                r1 = 75
                r0[r1] = r2
                java.util.ArrayList r1 = r6.getQuestions()
                r5.mo36274a(r3, r1)
                r1 = 76
                r0[r1] = r2
                com.instabug.library.ui.custom.InstabugViewPager r1 = r5.f26894N
                com.instabug.survey.ui.c$c$b r4 = new com.instabug.survey.ui.c$c$b
                r4.<init>(r5, r6)
                r1.addOnPageChangeListener(r4)
                r1 = 77
                r0[r1] = r2
                goto L_0x0066
            L_0x005b:
                android.widget.ProgressBar r1 = r5.f26897Q
                r4 = 8
                r1.setVisibility(r4)
                r1 = 78
                r0[r1] = r2
            L_0x0066:
                r5.f26899S = r3
                r1 = 79
                r0[r1] = r2
                java.util.ArrayList r1 = r6.getQuestions()
                java.lang.Object r1 = r1.get(r3)
                com.instabug.survey.models.b r1 = (com.instabug.survey.models.C10084b) r1
                java.lang.String r1 = r1.mo36218g()
                if (r1 != 0) goto L_0x0081
                r1 = 80
                r0[r1] = r2
                goto L_0x009d
            L_0x0081:
                java.util.ArrayList r1 = r6.getQuestions()
                java.lang.Object r1 = r1.get(r3)
                com.instabug.survey.models.b r1 = (com.instabug.survey.models.C10084b) r1
                r4 = 81
                r0[r4] = r2
                java.lang.String r1 = r1.mo36218g()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x00a5
                r1 = 82
                r0[r1] = r2
            L_0x009d:
                r5.mo36277a(r3)
                r1 = 85
                r0[r1] = r2
                goto L_0x00b0
            L_0x00a5:
                r1 = 83
                r0[r1] = r2
                r5.mo36277a(r2)
                r1 = 84
                r0[r1] = r2
            L_0x00b0:
                boolean r1 = r6.isPromoter()
                if (r1 != 0) goto L_0x00bb
                r6 = 86
                r0[r6] = r2
                goto L_0x00c5
            L_0x00bb:
                boolean r6 = r6.isLifeVersion()
                if (r6 == 0) goto L_0x00d1
                r6 = 87
                r0[r6] = r2
            L_0x00c5:
                android.widget.Button r6 = r5.f26905b
                int r1 = com.instabug.survey.C10049R.string.instabug_str_survey_next
                r6.setText(r1)
                r6 = 90
                r0[r6] = r2
                goto L_0x00e0
            L_0x00d1:
                r6 = 88
                r0[r6] = r2
                android.widget.Button r6 = r5.f26905b
                int r1 = com.instabug.survey.C10049R.string.instabug_str_action_submit
                r6.setText(r1)
                r6 = 89
                r0[r6] = r2
            L_0x00e0:
                r6 = 91
                r0[r6] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.p400ui.C10105c.C10110c.mo36275a(com.instabug.survey.models.Survey):void");
        }

        /* renamed from: a */
        public void mo36277a(boolean z) {
            boolean[] m = m47045m();
            this.f26905b.setEnabled(z);
            if (z) {
                m[121] = true;
                DrawableUtils.setColor(this.f26905b, Instabug.getPrimaryColor());
                m[122] = true;
                this.f26905b.setTextColor(C0841b.m4915a((Context) getActivity(), 17170443));
                m[123] = true;
            } else if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                m[124] = true;
                DrawableUtils.setColor(this.f26905b, C0841b.m4915a((Context) getActivity(), C10049R.C10051color.survey_btn_disabled_color_light));
                m[125] = true;
            } else {
                this.f26905b.setTextColor(C0841b.m4915a((Context) getActivity(), C10049R.C10051color.survey_btn_txt_color_dark));
                m[126] = true;
                DrawableUtils.setColor(this.f26905b, C0841b.m4915a((Context) getActivity(), C10049R.C10051color.survey_btn_disabled_color_dark));
                m[127] = true;
            }
            m[128] = true;
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: a */
        public void mo36274a(int i, List<C10084b> list) {
            boolean[] m = m47045m();
            this.f26897Q.setMax(list.size() * 100);
            ProgressBar progressBar = this.f26897Q;
            m[129] = true;
            int[] iArr = {progressBar.getProgress(), (i + 1) * 100};
            m[130] = true;
            ObjectAnimator ofInt = ObjectAnimator.ofInt(progressBar, C0770p.f3530j0, iArr);
            m[131] = true;
            ofInt.setDuration(200);
            m[132] = true;
            ofInt.setInterpolator(new DecelerateInterpolator());
            m[133] = true;
            ofInt.start();
            m[134] = true;
        }

        /* renamed from: a */
        private void m47030a(android.view.View view) {
            String str;
            int i;
            boolean[] m = m47045m();
            int currentItem = this.f26894N.getCurrentItem();
            m[143] = true;
            C1382h childFragmentManager = getChildFragmentManager();
            StringBuilder sb = new StringBuilder();
            sb.append("android:switcher:");
            sb.append(C10049R.C10053id.instabug_survey_pager);
            sb.append(":");
            sb.append(currentItem);
            Fragment a = childFragmentManager.mo6223a(sb.toString());
            if (a == null) {
                m[144] = true;
                str = null;
            } else {
                m[145] = true;
                str = ((C10107b) a).mo36269f();
                m[146] = true;
            }
            if (str != null) {
                m[147] = true;
            } else {
                m[148] = true;
                if (!this.f26904a.isNPSSurvey()) {
                    m[149] = true;
                    return;
                }
                if (a instanceof C10126c) {
                    m[150] = true;
                    ((C10084b) this.f26904a.getQuestions().get(2)).mo36214c("1");
                    m[151] = true;
                    if (!this.f26904a.isLifeVersion()) {
                        m[152] = true;
                    } else {
                        m[153] = true;
                        C10067c.m46830a(Instabug.getApplicationContext());
                        m[154] = true;
                        ((SurveyActivity) getActivity()).mo36238a(false);
                        m[155] = true;
                    }
                } else {
                    ((C10084b) this.f26904a.getQuestions().get(1)).mo36214c("");
                    m[156] = true;
                }
                m47041h();
                m[157] = true;
                this.f26901U.mo36240b(this.f26904a);
                m[158] = true;
            }
            ((C10084b) this.f26904a.getQuestions().get(currentItem)).mo36214c(str);
            m[159] = true;
            if (currentItem < this.f26895O.mo8886a() - 1) {
                m[160] = true;
                if (!this.f26904a.isNPSSurvey()) {
                    m[161] = true;
                } else if (!this.f26904a.hasPositiveNpsAnswer()) {
                    m[162] = true;
                } else {
                    m[163] = true;
                    if (this.f26904a.isLifeVersion()) {
                        m[164] = true;
                        InstabugViewPager instabugViewPager = this.f26894N;
                        if (this.f26895O.mo8886a() < 3) {
                            i = currentItem + 1;
                            m[165] = true;
                        } else {
                            i = currentItem + 2;
                            m[166] = true;
                        }
                        instabugViewPager.setCurrentItem(i, true);
                        m[167] = true;
                        m47042i();
                        m[168] = true;
                        this.f26904a.setSubmitted();
                        m[169] = true;
                    } else {
                        this.f26901U.mo36240b(this.f26904a);
                        m[170] = true;
                    }
                }
                if (!this.f26904a.isNPSSurvey()) {
                    m[171] = true;
                } else if (this.f26899S != 1) {
                    m[172] = true;
                } else {
                    m[173] = true;
                    C10066b.m46827a(getActivity());
                    m[174] = true;
                    m47041h();
                    m[175] = true;
                    this.f26901U.mo36240b(this.f26904a);
                    m[176] = true;
                }
                m47037d(currentItem + 1);
                m[177] = true;
                this.f26894N.postDelayed(new C10114d(this), 300);
                m[178] = true;
            } else if (str == null) {
                m[179] = true;
            } else {
                m[180] = true;
                C10066b.m46827a(getActivity());
                m[181] = true;
                m47041h();
                m[182] = true;
                this.f26901U.mo36240b(this.f26904a);
                m[183] = true;
            }
            m[184] = true;
        }

        /* renamed from: a */
        private int m47025a(long j) {
            boolean[] m = m47045m();
            Survey survey = this.f26904a;
            if (survey == null) {
                m[224] = true;
            } else if (survey.getQuestions() == null) {
                m[225] = true;
            } else if (this.f26904a.getQuestions().size() <= 0) {
                m[226] = true;
            } else {
                m[227] = true;
                m[228] = true;
                int i = 0;
                while (i < this.f26904a.getQuestions().size()) {
                    m[230] = true;
                    if (((C10084b) this.f26904a.getQuestions().get(i)).mo36209a() == j) {
                        m[231] = true;
                        return i;
                    }
                    i++;
                    m[232] = true;
                }
                m[229] = true;
            }
            m[233] = true;
            return 0;
        }

        /* renamed from: a */
        public void mo36276a(C10084b bVar) {
            boolean[] m = m47045m();
            if (bVar.mo36218g() != null) {
                m[234] = true;
                if (Integer.parseInt(bVar.mo36218g()) >= 1) {
                    m[235] = true;
                    mo36277a(true);
                    m[236] = true;
                    C10084b bVar2 = (C10084b) this.f26904a.getQuestions().get(m47025a(bVar.mo36209a()));
                    m[237] = true;
                    String g = bVar.mo36218g();
                    m[238] = true;
                    bVar2.mo36214c(g);
                    m[239] = true;
                } else {
                    mo36277a(false);
                    m[240] = true;
                }
                m[241] = true;
            } else {
                mo36277a(false);
                m[242] = true;
            }
            m[243] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.c$e */
    /* compiled from: SurveyFragmentCallbacks */
    public interface C10122e {
        /* renamed from: a */
        void mo36276a(C10084b bVar);

        /* renamed from: b */
        void mo36279b(C10084b bVar);

        /* renamed from: c */
        void mo36281c(C10084b bVar);

        /* renamed from: d */
        void mo36283d(C10084b bVar);
    }

    /* renamed from: com.instabug.survey.ui.c$f */
    /* compiled from: SurveyFragmentContract */
    public interface C10123f {

        /* renamed from: com.instabug.survey.ui.c$f$a */
        public interface C10124a extends Presenter {
        }

        /* renamed from: com.instabug.survey.ui.c$f$b */
        /* compiled from: SurveyFragmentContract */
        public interface C10125b extends View<Fragment> {
            /* renamed from: a */
            void mo36275a(Survey survey);

            /* renamed from: c */
            void mo36280c();

            /* renamed from: e */
            void mo36284e();
        }

        /* renamed from: com.instabug.survey.ui.c$f$c */
        /* compiled from: RateUsQuestionFragment */
        public class C10126c extends C10107b {

            /* renamed from: X */
            private static transient /* synthetic */ boolean[] f26937X;

            /* renamed from: U */
            private TextView f26938U;

            /* renamed from: V */
            private TextView f26939V;

            /* renamed from: W */
            private ImageView f26940W;

            public C10126c() {
                m47093h()[0] = true;
            }

            /* renamed from: a */
            public static C10126c m47092a(C10084b bVar, C10122e eVar) {
                boolean[] h = m47093h();
                C10126c cVar = new C10126c();
                h[1] = true;
                Bundle bundle = new Bundle();
                h[2] = true;
                bundle.putSerializable("question", bVar);
                h[3] = true;
                cVar.setArguments(bundle);
                h[4] = true;
                cVar.mo36267a(eVar);
                h[5] = true;
                return cVar;
            }

            /* renamed from: h */
            private static /* synthetic */ boolean[] m47093h() {
                boolean[] zArr = f26937X;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-29441298243547384L, "com/instabug/survey/ui/survey/rateus/RateUsQuestionFragment", 33);
                f26937X = a;
                return a;
            }

            /* access modifiers changed from: 0000 */
            @C0224v0
            /* renamed from: c */
            public void mo36303c(C10084b bVar) {
                boolean[] h = m47093h();
                this.f26881N.setText(bVar.mo36215d());
                h[30] = true;
            }

            /* renamed from: f */
            public String mo36269f() {
                boolean[] h = m47093h();
                String g = this.f26887a.mo36218g();
                h[31] = true;
                return g;
            }

            /* access modifiers changed from: protected */
            public int getLayout() {
                boolean[] h = m47093h();
                int i = C10049R.layout.survey_rate_us_fragment;
                h[9] = true;
                return i;
            }

            /* access modifiers changed from: protected */
            public void initViews(android.view.View view, Bundle bundle) {
                boolean[] h = m47093h();
                super.initViews(view, bundle);
                h[10] = true;
                this.f26881N = (TextView) view.findViewById(C10049R.C10053id.txt_rate_us_question);
                h[11] = true;
                this.f26938U = (TextView) view.findViewById(C10049R.C10053id.txt_rate_us_title);
                h[12] = true;
                this.f26939V = (TextView) view.findViewById(C10049R.C10053id.txt_rate_us_question);
                h[13] = true;
                this.f26940W = (ImageView) findViewById(C10049R.C10053id.instabug_img_thanks);
                h[14] = true;
                this.f26940W.setColorFilter(Instabug.getPrimaryColor());
                ImageView imageView = this.f26940W;
                h[15] = true;
                Drawable c = C0841b.m4928c(getContext(), C10049R.C10052drawable.ic_thanks_background);
                h[16] = true;
                Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(c);
                h[17] = true;
                imageView.setBackgroundDrawable(primaryColorTintedDrawable);
                h[18] = true;
                this.f26938U.setTextColor(Instabug.getPrimaryColor());
                h[19] = true;
                this.f26883P.setVisibility(0);
                h[20] = true;
                this.f26883P.setOnClickListener(this);
                h[21] = true;
                if (this.f26885R.isLifeVersion()) {
                    h[22] = true;
                } else {
                    h[23] = true;
                    this.f26939V.setVisibility(8);
                    h[24] = true;
                }
                h[25] = true;
            }

            public void onCreate(Bundle bundle) {
                boolean[] h = m47093h();
                super.onCreate(bundle);
                h[6] = true;
                setRetainInstance(true);
                h[7] = true;
                this.f26887a = (C10084b) getArguments().getSerializable("question");
                h[8] = true;
            }

            public void onResume() {
                boolean[] h = m47093h();
                super.onResume();
                h[26] = true;
                C10075h.m46877b(this.f26939V);
                h[27] = true;
            }

            public void onViewCreated(android.view.View view, @C0195i0 Bundle bundle) {
                boolean[] h = m47093h();
                super.onViewCreated(view, bundle);
                h[28] = true;
                mo36303c(this.f26887a);
                h[29] = true;
            }
        }
    }

    /* renamed from: com.instabug.survey.ui.c$h */
    /* compiled from: SurveyFragmentPresenter */
    public class C10127h extends BasePresenter<C10125b> implements C10124a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26941b;

        /* renamed from: a */
        private Survey f26942a;

        public C10127h(C10125b bVar, Survey survey) {
            boolean[] e = m47096e();
            super(bVar);
            this.f26942a = survey;
            e[0] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m47096e() {
            boolean[] zArr = f26941b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5208531052753315770L, "com/instabug/survey/ui/survey/SurveyFragmentPresenter", 16);
            f26941b = a;
            return a;
        }

        /* renamed from: c */
        public void mo36304c() {
            boolean[] e = m47096e();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                e[8] = true;
            } else {
                e[9] = true;
                C10125b bVar = (C10125b) weakReference.get();
                if (bVar == null) {
                    e[10] = true;
                } else {
                    e[11] = true;
                    if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == State.ENABLED) {
                        e[12] = true;
                        bVar.mo36284e();
                        e[13] = true;
                    } else {
                        bVar.mo36280c();
                        e[14] = true;
                    }
                }
            }
            e[15] = true;
        }

        /* renamed from: d */
        public void mo36305d() {
            boolean[] e = m47096e();
            WeakReference<V> weakReference = this.view;
            if (weakReference == null) {
                e[1] = true;
            } else if (weakReference.get() == null) {
                e[2] = true;
            } else {
                e[3] = true;
                C10125b bVar = (C10125b) this.view.get();
                if (bVar == null) {
                    e[4] = true;
                } else {
                    e[5] = true;
                    bVar.mo36275a(this.f26942a);
                    e[6] = true;
                }
            }
            e[7] = true;
        }
    }
}
