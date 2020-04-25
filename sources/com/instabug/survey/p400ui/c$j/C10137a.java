package com.instabug.survey.p400ui.c$j;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.p382ui.C9792a;
import com.instabug.library.util.Colorizer;
import com.instabug.survey.C10049R;
import com.instabug.survey.p398b.C10068d;
import com.instabug.survey.p400ui.C10159g;
import com.instabug.survey.p400ui.SurveyActivity;
import com.instabug.survey.p400ui.c$j.C10139b.C10141b;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.c$j.a */
/* compiled from: ThanksFragment */
public class C10137a extends C9792a<C10142c> implements C10141b {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f26958P;

    /* renamed from: N */
    private TextView f26959N;

    /* renamed from: O */
    private LinearLayout f26960O;

    /* renamed from: a */
    private ImageView f26961a;

    /* renamed from: b */
    private TextView f26962b;

    /* renamed from: com.instabug.survey.ui.c$j.a$a */
    /* compiled from: ThanksFragment */
    class C10138a implements OnGlobalLayoutListener {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26963P;

        /* renamed from: N */
        final /* synthetic */ Animation f26964N;

        /* renamed from: O */
        final /* synthetic */ C10137a f26965O;

        /* renamed from: a */
        final /* synthetic */ Animation f26966a;

        /* renamed from: b */
        final /* synthetic */ Animation f26967b;

        C10138a(C10137a aVar, Animation animation, Animation animation2, Animation animation3) {
            boolean[] a = m47140a();
            this.f26965O = aVar;
            this.f26966a = animation;
            this.f26967b = animation2;
            this.f26964N = animation3;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47140a() {
            boolean[] zArr = f26963P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1466621467596023551L, "com/instabug/survey/ui/survey/thankspage/ThanksFragment$1", 4);
            f26963P = a;
            return a;
        }

        public void onGlobalLayout() {
            boolean[] a = m47140a();
            C10137a.m47131a(this.f26965O).startAnimation(this.f26966a);
            a[1] = true;
            C10137a.m47132b(this.f26965O).startAnimation(this.f26967b);
            a[2] = true;
            C10137a.m47133c(this.f26965O).startAnimation(this.f26964N);
            a[3] = true;
        }
    }

    public C10137a() {
        m47137h()[0] = true;
    }

    /* renamed from: a */
    static /* synthetic */ ImageView m47131a(C10137a aVar) {
        boolean[] h = m47137h();
        ImageView imageView = aVar.f26961a;
        h[38] = true;
        return imageView;
    }

    /* renamed from: b */
    static /* synthetic */ TextView m47132b(C10137a aVar) {
        boolean[] h = m47137h();
        TextView textView = aVar.f26962b;
        h[39] = true;
        return textView;
    }

    /* renamed from: c */
    static /* synthetic */ TextView m47133c(C10137a aVar) {
        boolean[] h = m47137h();
        TextView textView = aVar.f26959N;
        h[40] = true;
        return textView;
    }

    /* renamed from: d */
    public static C10137a m47134d() {
        boolean[] h = m47137h();
        Bundle bundle = new Bundle();
        h[1] = true;
        C10137a aVar = new C10137a();
        h[2] = true;
        aVar.setArguments(bundle);
        h[3] = true;
        return aVar;
    }

    /* renamed from: f */
    private void m47135f() {
        boolean[] h = m47137h();
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C10049R.anim.ib_srv_anim_fade_in_scale);
        h[21] = true;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C10049R.anim.ib_srv_anim_fly_in);
        h[22] = true;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(getContext(), C10049R.anim.ib_srv_anim_fly_in);
        h[23] = true;
        loadAnimation2.setStartOffset(300);
        h[24] = true;
        loadAnimation3.setStartOffset(400);
        h[25] = true;
        this.f26962b.getViewTreeObserver().addOnGlobalLayoutListener(new C10138a(this, loadAnimation, loadAnimation2, loadAnimation3));
        h[26] = true;
    }

    /* renamed from: g */
    private void m47136g() {
        boolean[] h = m47137h();
        if (getActivity() == null) {
            h[28] = true;
        } else if (((SurveyActivity) getActivity()).mo36247e() == null) {
            h[29] = true;
        } else {
            h[30] = true;
            if (((SurveyActivity) getActivity()).mo36247e() != C10159g.PRIMARY) {
                h[31] = true;
            } else {
                ImageView imageView = this.f26961a;
                h[32] = true;
                LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
                h[33] = true;
                layoutParams.setMargins(0, 0, 0, 16);
                h[34] = true;
                this.f26961a.setLayoutParams(layoutParams);
                h[35] = true;
            }
        }
        h[36] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m47137h() {
        boolean[] zArr = f26958P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2950310180054518195L, "com/instabug/survey/ui/survey/thankspage/ThanksFragment", 41);
        f26958P = a;
        return a;
    }

    /* renamed from: e */
    public void mo36318e() {
        boolean[] h = m47137h();
        C10068d.m46833a(getView());
        h[37] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m47137h();
        int i = C10049R.layout.instabug_survey_fragment_thanks_dialog;
        h[4] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        boolean[] h = m47137h();
        this.f26961a = (ImageView) findViewById(C10049R.C10053id.instabug_img_thanks);
        h[7] = true;
        this.f26962b = (TextView) findViewById(C10049R.C10053id.txt_thanks_title);
        h[8] = true;
        this.f26959N = (TextView) findViewById(C10049R.C10053id.txtSubTitle);
        h[9] = true;
        this.f26960O = (LinearLayout) findViewById(C10049R.C10053id.instabug_pbi_container);
        h[10] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            h[11] = true;
            this.f26962b.setTextColor(Instabug.getPrimaryColor());
            h[12] = true;
        } else {
            this.f26962b.setTextColor(C0841b.m4915a(getContext(), 17170443));
            h[13] = true;
        }
        this.f26961a.setColorFilter(Instabug.getPrimaryColor());
        ImageView imageView = this.f26961a;
        h[14] = true;
        Drawable c = C0841b.m4928c(getContext(), C10049R.C10052drawable.ic_thanks_background);
        h[15] = true;
        Drawable primaryColorTintedDrawable = Colorizer.getPrimaryColorTintedDrawable(c);
        h[16] = true;
        imageView.setBackgroundDrawable(primaryColorTintedDrawable);
        h[17] = true;
        ((C10142c) this.presenter).mo36320d();
        h[18] = true;
        m47135f();
        h[19] = true;
        m47136g();
        h[20] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m47137h();
        super.onCreate(bundle);
        h[5] = true;
        this.presenter = new C10142c(this);
        h[6] = true;
    }

    /* renamed from: c */
    public void mo36317c() {
        boolean[] h = m47137h();
        C10068d.m46832a(getContext(), this.f26960O);
        h[27] = true;
    }
}
