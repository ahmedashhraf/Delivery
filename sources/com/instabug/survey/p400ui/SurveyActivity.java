package com.instabug.survey.p400ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1406n;
import androidx.fragment.app.Fragment;
import com.instabug.library.Instabug;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.p382ui.BaseContract.Presenter;
import com.instabug.library.core.p382ui.BaseFragmentActivity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.C10049R;
import com.instabug.survey.SurveyPlugin;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p398b.C10069e;
import com.instabug.survey.p398b.C10070f;
import com.instabug.survey.p400ui.C10105c.C10106a;
import com.instabug.survey.p400ui.C10105c.C10107b;
import com.instabug.survey.p400ui.C10105c.C10110c;
import com.instabug.survey.p400ui.c$j.C10137a;
import com.instabug.survey.p400ui.c$k.C10143a;
import com.instabug.survey.p400ui.p401a.C10099a;
import com.instabug.survey.p400ui.p401a.C10099a.C10100a;
import java.util.Iterator;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.SurveyActivity */
public class SurveyActivity extends BaseFragmentActivity<C10154e> implements _InstabugActivity, C10104b, C10106a {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f26846R;

    /* renamed from: N */
    private FrameLayout f26847N;

    /* renamed from: O */
    private RelativeLayout f26848O;

    /* renamed from: P */
    private Survey f26849P;

    /* renamed from: Q */
    private GestureDetector f26850Q;

    /* renamed from: a */
    boolean f26851a = false;

    /* renamed from: b */
    private Handler f26852b;

    /* renamed from: com.instabug.survey.ui.SurveyActivity$a */
    class C10092a implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26853N;

        /* renamed from: a */
        final /* synthetic */ Bundle f26854a;

        /* renamed from: b */
        final /* synthetic */ SurveyActivity f26855b;

        C10092a(SurveyActivity surveyActivity, Bundle bundle) {
            boolean[] a = m46974a();
            this.f26855b = surveyActivity;
            this.f26854a = bundle;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46974a() {
            boolean[] zArr = f26853N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4331655069040401663L, "com/instabug/survey/ui/SurveyActivity$1", 20);
            f26853N = a;
            return a;
        }

        public void run() {
            boolean[] a = m46974a();
            if (InstabugCore.getStartedActivitiesCount() > 1) {
                a[1] = true;
                try {
                    if (this.f26855b.isFinishing()) {
                        a[4] = true;
                    } else if (!this.f26855b.f26851a) {
                        a[5] = true;
                    } else {
                        a[6] = true;
                        SurveyActivity.m46951a(this.f26855b, (Survey) this.f26855b.getIntent().getSerializableExtra("survey"));
                        if (this.f26854a != null) {
                            a[7] = true;
                        } else {
                            a[8] = true;
                            if (((C10154e) SurveyActivity.m46950a(this.f26855b)).mo36371e()) {
                                a[9] = true;
                                SurveyActivity.m46953b(this.f26855b, SurveyActivity.m46952b(this.f26855b));
                                a[10] = true;
                            } else {
                                C1382h supportFragmentManager = this.f26855b.getSupportFragmentManager();
                                SurveyActivity surveyActivity = this.f26855b;
                                a[11] = true;
                                Survey b = SurveyActivity.m46952b(surveyActivity);
                                a[12] = true;
                                C10153d.m47198a(supportFragmentManager, b);
                                a[13] = true;
                            }
                        }
                    }
                    a[14] = true;
                } catch (Exception e) {
                    a[15] = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Survey has not been shown due to this error: ");
                    a[16] = true;
                    sb.append(e.getMessage());
                    String sb2 = sb.toString();
                    a[17] = true;
                    InstabugSDKLogger.m46623e(SurveyActivity.class, sb2);
                    a[18] = true;
                }
                a[19] = true;
                return;
            }
            a[2] = true;
            this.f26855b.finish();
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$b */
    class C10093b implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26856b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26857a;

        C10093b(SurveyActivity surveyActivity) {
            boolean[] a = m46975a();
            this.f26857a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46975a() {
            boolean[] zArr = f26856b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3580053135988113909L, "com/instabug/survey/ui/SurveyActivity$2", 2);
            f26856b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46975a();
            SurveyActivity.m46954c(this.f26857a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$c */
    class C10094c implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26858b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26859a;

        C10094c(SurveyActivity surveyActivity) {
            boolean[] a = m46976a();
            this.f26859a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46976a() {
            boolean[] zArr = f26858b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5243899508232210430L, "com/instabug/survey/ui/SurveyActivity$3", 2);
            f26858b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46976a();
            this.f26859a.finish();
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$d */
    class C10095d implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26860b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26861a;

        C10095d(SurveyActivity surveyActivity) {
            boolean[] a = m46977a();
            this.f26861a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46977a() {
            boolean[] zArr = f26860b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7806401410216717161L, "com/instabug/survey/ui/SurveyActivity$4", 3);
            f26860b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46977a();
            this.f26861a.finish();
            a[1] = true;
            C10070f.m46840d();
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$e */
    class C10096e implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26862b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26863a;

        C10096e(SurveyActivity surveyActivity) {
            boolean[] a = m46978a();
            this.f26863a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46978a() {
            boolean[] zArr = f26862b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7721864853592297948L, "com/instabug/survey/ui/SurveyActivity$5", 7);
            f26862b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46978a();
            try {
                SurveyActivity.m46956d(this.f26863a);
                a[1] = true;
            } catch (Exception unused) {
                a[2] = true;
                this.f26863a.getSupportFragmentManager().mo6245j();
                a[3] = true;
                this.f26863a.finish();
                a[4] = true;
                InstabugSDKLogger.m46623e(this.f26863a, "ThanksFragment couldn't save it's state");
                a[5] = true;
            }
            a[6] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$f */
    class C10097f implements AnimatorUpdateListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26864b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26865a;

        C10097f(SurveyActivity surveyActivity) {
            boolean[] a = m46979a();
            this.f26865a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46979a() {
            boolean[] zArr = f26864b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7039139612174245405L, "com/instabug/survey/ui/SurveyActivity$6", 4);
            f26864b = a;
            return a;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean[] a = m46979a();
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            a[1] = true;
            LayoutParams layoutParams = SurveyActivity.m46957e(this.f26865a).getLayoutParams();
            layoutParams.height = intValue;
            a[2] = true;
            SurveyActivity.m46957e(this.f26865a).setLayoutParams(layoutParams);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.survey.ui.SurveyActivity$g */
    class C10098g implements C10100a {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26866b;

        /* renamed from: a */
        final /* synthetic */ SurveyActivity f26867a;

        C10098g(SurveyActivity surveyActivity) {
            boolean[] a = m46980a();
            this.f26867a = surveyActivity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46980a() {
            boolean[] zArr = f26866b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7990807752769144844L, "com/instabug/survey/ui/SurveyActivity$7", 26);
            f26866b = a;
            return a;
        }

        /* renamed from: c */
        public void mo36254c() {
            boolean[] a = m46980a();
            List e = this.f26867a.getSupportFragmentManager().mo6240e();
            a[8] = true;
            Iterator it = e.iterator();
            a[9] = true;
            while (true) {
                if (!it.hasNext()) {
                    a[10] = true;
                    break;
                }
                Fragment fragment = (Fragment) it.next();
                if (fragment instanceof C10110c) {
                    a[11] = true;
                    ((C10110c) fragment).mo36286g();
                    a[12] = true;
                    break;
                }
                a[13] = true;
            }
            a[14] = true;
        }

        /* renamed from: d */
        public void mo36255d() {
            boolean[] a = m46980a();
            List e = this.f26867a.getSupportFragmentManager().mo6240e();
            a[1] = true;
            Iterator it = e.iterator();
            a[2] = true;
            while (true) {
                if (!it.hasNext()) {
                    a[3] = true;
                    break;
                }
                Fragment fragment = (Fragment) it.next();
                if (fragment instanceof C10110c) {
                    a[4] = true;
                    ((C10110c) fragment).mo36285f();
                    a[5] = true;
                    break;
                }
                a[6] = true;
            }
            a[7] = true;
        }

        /* renamed from: e */
        public void mo36256e() {
            m46980a()[15] = true;
        }

        /* renamed from: f */
        public void mo36257f() {
            m46980a()[16] = true;
        }

        /* renamed from: g */
        public void mo36258g() {
            boolean[] a = m46980a();
            List e = this.f26867a.getSupportFragmentManager().mo6240e();
            a[17] = true;
            Iterator it = e.iterator();
            a[18] = true;
            while (true) {
                if (!it.hasNext()) {
                    a[19] = true;
                    break;
                }
                Fragment fragment = (Fragment) it.next();
                if (fragment instanceof C10107b) {
                    a[20] = true;
                    C10107b bVar = (C10107b) fragment;
                    if (!bVar.mo36268e()) {
                        a[21] = true;
                    } else {
                        a[22] = true;
                        bVar.mo36264d();
                        a[23] = true;
                    }
                } else {
                    a[24] = true;
                }
            }
            a[25] = true;
        }
    }

    public SurveyActivity() {
        boolean[] h = m46960h();
        h[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Presenter m46950a(SurveyActivity surveyActivity) {
        boolean[] h = m46960h();
        P p = surveyActivity.presenter;
        h[85] = true;
        return p;
    }

    /* renamed from: b */
    static /* synthetic */ Survey m46952b(SurveyActivity surveyActivity) {
        boolean[] h = m46960h();
        Survey survey = surveyActivity.f26849P;
        h[86] = true;
        return survey;
    }

    /* renamed from: c */
    static /* synthetic */ void m46954c(SurveyActivity surveyActivity) {
        boolean[] h = m46960h();
        surveyActivity.m46959g();
        h[88] = true;
    }

    /* renamed from: d */
    static /* synthetic */ void m46956d(SurveyActivity surveyActivity) {
        boolean[] h = m46960h();
        surveyActivity.m46958f();
        h[89] = true;
    }

    /* renamed from: e */
    static /* synthetic */ FrameLayout m46957e(SurveyActivity surveyActivity) {
        boolean[] h = m46960h();
        FrameLayout frameLayout = surveyActivity.f26847N;
        h[90] = true;
        return frameLayout;
    }

    /* renamed from: f */
    private void m46958f() {
        boolean[] h = m46960h();
        String str = "THANKS_FRAGMENT";
        if (getSupportFragmentManager().mo6223a(str) == null) {
            h[46] = true;
        } else {
            h[47] = true;
            C1406n a = getSupportFragmentManager().mo6224a();
            int i = C10049R.anim.instabug_anim_flyout_to_bottom;
            h[48] = true;
            C1406n a2 = a.mo6392a(0, i);
            h[49] = true;
            C1406n d = a2.mo6094d(getSupportFragmentManager().mo6223a(str));
            h[50] = true;
            d.mo6097e();
            h[51] = true;
            new Handler().postDelayed(new C10095d(this), 400);
            h[52] = true;
        }
        h[53] = true;
    }

    /* renamed from: g */
    private void m46959g() {
        boolean[] h = m46960h();
        this.f26852b = new Handler();
        h[54] = true;
        this.f26852b.postDelayed(new C10096e(this), 3000);
        h[55] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46960h() {
        boolean[] zArr = f26846R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6740820652682286317L, "com/instabug/survey/ui/SurveyActivity", 91);
        f26846R = a;
        return a;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean[] h = m46960h();
        if (this.f26850Q != null) {
            h[75] = true;
        } else {
            h[76] = true;
            this.f26850Q = new GestureDetector(this, new C10099a(new C10098g(this)));
            h[77] = true;
        }
        this.f26850Q.onTouchEvent(motionEvent);
        h[78] = true;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        h[79] = true;
        return dispatchTouchEvent;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m46960h();
        int i = C10049R.layout.instabug_survey_activity;
        h[30] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        m46960h()[31] = true;
    }

    public void onBackPressed() {
        boolean[] h = m46960h();
        ((C10154e) this.presenter).mo36369c();
        h[56] = true;
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        boolean[] h = m46960h();
        super.onCreate(bundle);
        h[3] = true;
        setTheme(C10069e.m46835a(Instabug.getTheme()));
        h[4] = true;
        this.f26847N = (FrameLayout) findViewById(C10049R.C10053id.instabug_fragment_container);
        h[5] = true;
        this.f26848O = (RelativeLayout) findViewById(C10049R.C10053id.survey_activity_container);
        h[6] = true;
        this.f26848O.setFocusableInTouchMode(true);
        h[7] = true;
        this.presenter = new C10154e(this);
        if (bundle != null) {
            C10159g gVar = C10159g.PARTIAL;
            h[8] = true;
            int d = gVar.mo36374d();
            h[9] = true;
            C10159g a = C10159g.m47219a(bundle.getInt("viewType", d), C10159g.PARTIAL);
            h[10] = true;
            ((C10154e) this.presenter).mo36367a(a, false);
            h[11] = true;
        } else {
            ((C10154e) this.presenter).mo36367a(C10159g.PARTIAL, false);
            h[12] = true;
        }
        this.f26847N.postDelayed(new C10092a(this, bundle), 500);
        h[13] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] h = m46960h();
        super.onDestroy();
        h[57] = true;
        SurveyPlugin surveyPlugin = (SurveyPlugin) InstabugCore.getXPlugin(SurveyPlugin.class);
        if (surveyPlugin == null) {
            h[58] = true;
        } else {
            h[59] = true;
            surveyPlugin.setState(0);
            h[60] = true;
        }
        h[61] = true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        boolean[] h = m46960h();
        this.f26851a = false;
        h[25] = true;
        super.onPause();
        Handler handler = this.f26852b;
        if (handler == null) {
            h[26] = true;
        } else {
            h[27] = true;
            handler.removeCallbacksAndMessages(null);
            h[28] = true;
        }
        overridePendingTransition(0, 0);
        h[29] = true;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        boolean[] h = m46960h();
        super.onResume();
        this.f26851a = true;
        h[20] = true;
        SurveyPlugin surveyPlugin = (SurveyPlugin) InstabugCore.getXPlugin(SurveyPlugin.class);
        if (surveyPlugin == null) {
            h[21] = true;
        } else {
            h[22] = true;
            surveyPlugin.setState(1);
            h[23] = true;
        }
        m46958f();
        h[24] = true;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        boolean[] h = m46960h();
        super.onSaveInstanceState(bundle);
        h[1] = true;
        bundle.putInt("viewType", ((C10154e) this.presenter).mo36370d().mo36374d());
        h[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Survey m46951a(SurveyActivity surveyActivity, Survey survey) {
        boolean[] h = m46960h();
        surveyActivity.f26849P = survey;
        h[84] = true;
        return survey;
    }

    /* renamed from: b */
    static /* synthetic */ void m46953b(SurveyActivity surveyActivity, Survey survey) {
        boolean[] h = m46960h();
        surveyActivity.m46955d(survey);
        h[87] = true;
    }

    /* renamed from: d */
    private void m46955d(Survey survey) {
        boolean[] h = m46960h();
        mo36234a((Fragment) C10143a.m47145a(survey));
        h[14] = true;
    }

    /* renamed from: c */
    public void mo36243c(boolean z) {
        int i;
        boolean[] h = m46960h();
        View decorView = getWindow().getDecorView();
        if (z) {
            i = C10049R.C10051color.instabug_transparent_color;
            h[70] = true;
        } else {
            i = C10049R.C10051color.instabug_dialog_bg_color;
            h[71] = true;
        }
        decorView.setBackgroundColor(C0841b.m4915a((Context) this, i));
        h[72] = true;
    }

    /* renamed from: e */
    public C10159g mo36247e() {
        boolean[] h = m46960h();
        C10159g d = ((C10154e) this.presenter).mo36370d();
        h[83] = true;
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36234a(Fragment fragment) {
        boolean[] h = m46960h();
        mo36235a(fragment, C10049R.anim.instabug_anim_flyin_from_bottom, C10049R.anim.instabug_anim_flyout_to_bottom);
        h[15] = true;
    }

    /* renamed from: b */
    public void mo36239b(int i) {
        boolean[] h = m46960h();
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f26847N.getMeasuredHeight(), i});
        h[62] = true;
        ofInt.addUpdateListener(new C10097f(this));
        h[63] = true;
        ofInt.setDuration(300);
        h[64] = true;
        ofInt.start();
        h[65] = true;
    }

    /* renamed from: c */
    public void mo36242c(Survey survey) {
        boolean[] h = m46960h();
        ((C10154e) this.presenter).mo36368b(survey);
        h[81] = true;
    }

    /* renamed from: d */
    public void mo36245d(int i) {
        boolean[] h = m46960h();
        FrameLayout frameLayout = this.f26847N;
        h[66] = true;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        layoutParams.height = i;
        h[67] = true;
        this.f26847N.setLayoutParams(layoutParams);
        h[68] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36235a(Fragment fragment, int i, int i2) {
        boolean[] h = m46960h();
        C1406n a = getSupportFragmentManager().mo6224a();
        h[16] = true;
        C1406n a2 = a.mo6392a(i, i2);
        int i3 = C10049R.C10053id.instabug_fragment_container;
        h[17] = true;
        C1406n b = a2.mo6405b(i3, fragment);
        h[18] = true;
        b.mo6097e();
        h[19] = true;
    }

    /* renamed from: c */
    public Survey mo36241c() {
        boolean[] h = m46960h();
        Survey survey = this.f26849P;
        h[82] = true;
        return survey;
    }

    /* renamed from: b */
    public void mo36240b(Survey survey) {
        boolean[] h = m46960h();
        ((C10154e) this.presenter).mo36366a(survey);
        h[80] = true;
    }

    /* renamed from: d */
    public C10159g mo36244d() {
        boolean[] h = m46960h();
        C10159g d = ((C10154e) this.presenter).mo36370d();
        h[74] = true;
        return d;
    }

    /* renamed from: a */
    public void mo36238a(boolean z) {
        boolean[] h = m46960h();
        if (getSupportFragmentManager().mo6221a(C10049R.C10053id.instabug_fragment_container) == null) {
            h[32] = true;
        } else {
            h[33] = true;
            C1406n a = getSupportFragmentManager().mo6224a();
            int i = C10049R.anim.instabug_anim_flyout_to_bottom;
            h[34] = true;
            C1406n a2 = a.mo6392a(0, i);
            h[35] = true;
            C1406n d = a2.mo6094d(getSupportFragmentManager().mo6221a(C10049R.C10053id.instabug_fragment_container));
            h[36] = true;
            d.mo6097e();
            h[37] = true;
        }
        if (z) {
            h[38] = true;
            C1406n a3 = getSupportFragmentManager().mo6224a();
            h[39] = true;
            C1406n a4 = a3.mo6392a(0, 0);
            int i2 = C10049R.C10053id.instabug_fragment_container;
            h[40] = true;
            C1406n b = a4.mo6406b(i2, C10137a.m47134d(), "THANKS_FRAGMENT");
            h[41] = true;
            b.mo6097e();
            h[42] = true;
            new Handler().postDelayed(new C10093b(this), 600);
            h[43] = true;
        } else {
            new Handler().postDelayed(new C10094c(this), 300);
            h[44] = true;
        }
        C10070f.m46840d();
        h[45] = true;
    }

    /* renamed from: a */
    public void mo36237a(C10159g gVar, boolean z) {
        boolean[] h = m46960h();
        ((C10154e) this.presenter).mo36367a(gVar, z);
        h[69] = true;
    }

    /* renamed from: a */
    public void mo36236a(Survey survey) {
        boolean[] h = m46960h();
        ((C10154e) this.presenter).mo36368b(survey);
        h[73] = true;
    }
}
