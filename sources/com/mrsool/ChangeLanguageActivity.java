package com.mrsool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.p419a0.C11570a;

public class ChangeLanguageActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private ImageView f27194S;

    /* renamed from: T */
    private TextView f27195T;

    /* renamed from: U */
    private TextView f27196U;

    /* renamed from: V */
    private TextView f27197V;

    /* renamed from: W */
    private LinearLayout f27198W;

    /* renamed from: X */
    private FrameLayout f27199X;

    /* renamed from: Y */
    private FrameLayout f27200Y;

    /* renamed from: Z */
    private int f27201Z = -1;

    /* renamed from: a0 */
    private ImageView f27202a0;

    /* renamed from: b0 */
    private ImageView f27203b0;

    /* renamed from: J */
    private void m47387J() {
        this.f27198W.setAlpha(0.0f);
        this.f27198W.setVisibility(0);
        this.f27198W.animate().alpha(1.0f).setDuration(700).setStartDelay(700).setListener(null);
        this.f27195T.setAlpha(0.0f);
        this.f27195T.setVisibility(0);
        this.f27195T.animate().alpha(1.0f).setDuration(700).setStartDelay(500).setListener(null);
    }

    /* renamed from: K */
    private void m47388K() {
        if (C11644i.f33191S5.equalsIgnoreCase(this.f29642a.mo23470D().mo23460g("language"))) {
            this.f27201Z = 3;
        } else {
            this.f27201Z = 1;
        }
        m47391j(2);
    }

    @TargetApi(19)
    /* renamed from: L */
    private Transition m47389L() {
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(new C11570a());
        changeBounds.setDuration(1200);
        return changeBounds;
    }

    /* renamed from: M */
    private void m47390M() {
        this.f27196U = (TextView) findViewById(C10232R.C10236id.tvLanguageArabic);
        this.f27197V = (TextView) findViewById(C10232R.C10236id.tvLanguageEng);
        this.f27199X = (FrameLayout) findViewById(C10232R.C10236id.flLanguageEng);
        this.f27200Y = (FrameLayout) findViewById(C10232R.C10236id.flLanguageArabic);
        this.f27202a0 = (ImageView) findViewById(C10232R.C10236id.ivLanguageEng);
        this.f27203b0 = (ImageView) findViewById(C10232R.C10236id.ivLanguageArabic);
        this.f27195T = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f27195T.setOnClickListener(this);
        this.f27200Y.setOnClickListener(this);
        this.f27199X.setOnClickListener(this);
        m47388K();
    }

    /* renamed from: j */
    private void m47391j(int i) {
        if (i == 2) {
            this.f27195T.setText(getString(C10232R.string.lbl_next_ar));
            this.f27196U.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            this.f27197V.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.text_color_7b));
            this.f27203b0.setVisibility(0);
            this.f27202a0.setVisibility(8);
        } else {
            this.f27195T.setText(getString(C10232R.string.lbl_next_en));
            this.f27196U.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.text_color_7b));
            this.f27197V.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            this.f27203b0.setVisibility(8);
            this.f27202a0.setVisibility(0);
        }
        int i2 = this.f27201Z;
        String str = "language";
        if (i2 == 1) {
            this.f29642a.mo23470D().mo23454b(str, C11644i.f33183R5);
        } else if (i2 == 2) {
            this.f29642a.mo23470D().mo23454b(str, C11644i.f33191S5);
        }
    }

    public void onBackPressed() {
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                int i = this.f27201Z;
                if (i != -1) {
                    String str = "language";
                    if (i == 1) {
                        this.f29642a.mo23470D().mo23454b(str, C11644i.f33183R5);
                    } else if (i == 2) {
                        this.f29642a.mo23470D().mo23454b(str, C11644i.f33191S5);
                    }
                    this.f29642a.mo23470D().mo23453b(C11644i.f33196T2, Boolean.valueOf(true));
                    setResult(-1);
                    finish();
                    break;
                } else {
                    return;
                }
            case C10232R.C10236id.flLanguageArabic /*2131362281*/:
                this.f27201Z = 2;
                m47391j(this.f27201Z);
                break;
            case C10232R.C10236id.flLanguageEng /*2131362282*/:
                this.f27201Z = 1;
                m47391j(this.f27201Z);
                break;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_change_language_new);
        this.f27198W = (LinearLayout) findViewById(C10232R.C10236id.llSelection);
        this.f27195T = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f27194S = (ImageView) findViewById(C10232R.C10236id.imgLogo);
        if (VERSION.SDK_INT >= 21) {
            if (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getBoolean(C11644i.f33392q2, false)) {
                this.f27198W.setVisibility(0);
                this.f27195T.setVisibility(0);
            } else {
                getWindow().setSharedElementEnterTransition(m47389L());
                this.f27198W.setVisibility(8);
                this.f27195T.setVisibility(8);
                getWindow().setEnterTransition(null);
                m47387J();
            }
        }
        m47390M();
    }
}
