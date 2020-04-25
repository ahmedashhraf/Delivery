package com.instabug.library.p397ui.onboarding;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.p018c.C0821b;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.instabug.library.C9700R;
import com.instabug.library.Instabug;
import com.instabug.library.core.p382ui.BaseFragmentActivity;
import com.instabug.library.p397ui.custom.InstabugViewPager;
import com.instabug.library.p397ui.custom.pagerindicator.DotIndicator;
import com.instabug.library.p397ui.onboarding.C10003b.C10004a;
import com.instabug.library.p397ui.onboarding.WelcomeMessage.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.LocaleUtils;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.ui.onboarding.OnboardingActivity */
public class OnboardingActivity extends BaseFragmentActivity<C10005c> implements C2019j, OnClickListener, C10004a {

    /* renamed from: Q */
    private static transient /* synthetic */ boolean[] f26606Q;

    /* renamed from: N */
    private DotIndicator f26607N;

    /* renamed from: O */
    private TextView f26608O;

    /* renamed from: P */
    State f26609P;

    /* renamed from: a */
    private InstabugViewPager f26610a;

    /* renamed from: b */
    private C10002a f26611b;

    public OnboardingActivity() {
        m46550h()[0] = true;
    }

    /* renamed from: a */
    public static Intent m46548a(Context context, State state) {
        boolean[] h = m46550h();
        Intent intent = new Intent(context, OnboardingActivity.class);
        h[2] = true;
        intent.putExtra("welcome_state", state);
        h[3] = true;
        return intent;
    }

    /* renamed from: g */
    private void m46549g() {
        boolean[] h = m46550h();
        this.f26608O.setVisibility(8);
        h[37] = true;
        if (this.f26611b.mo8886a() > 1) {
            h[38] = true;
            this.f26607N.setVisibility(0);
            h[39] = true;
        } else {
            this.f26607N.setVisibility(8);
            h[40] = true;
        }
        h[41] = true;
    }

    /* renamed from: h */
    private static /* synthetic */ boolean[] m46550h() {
        boolean[] zArr = f26606Q;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3720639997755554467L, "com/instabug/library/ui/onboarding/OnboardingActivity", 72);
        f26606Q = a;
        return a;
    }

    /* renamed from: c */
    public void mo8880c(int i) {
        boolean[] h = m46550h();
        this.f26607N.setSelectedItem(i, true);
        h[43] = true;
        if (i != this.f26611b.mo8886a() - 1) {
            h[44] = true;
        } else if (this.f26611b.mo8886a() <= 1) {
            h[45] = true;
        } else {
            h[46] = true;
            this.f26608O.setVisibility(0);
            h[47] = true;
            h[49] = true;
        }
        this.f26608O.setVisibility(4);
        h[48] = true;
        h[49] = true;
    }

    /* renamed from: d */
    public void mo35959d() {
        boolean[] h = m46550h();
        finish();
        h[59] = true;
    }

    /* renamed from: e */
    public void mo35960e() {
        boolean[] h = m46550h();
        findViewById(C9700R.C9704id.instabug_pbi_container).setVisibility(0);
        h[60] = true;
        TextView textView = (TextView) findViewById(C9700R.C9704id.text_view_pb);
        h[61] = true;
        ImageView imageView = (ImageView) findViewById(C9700R.C9704id.image_instabug_logo);
        h[62] = true;
        imageView.setImageResource(C9700R.C9703drawable.ic_instabug_logo);
        h[63] = true;
        imageView.setColorFilter(Color.parseColor("#FFFFFF"), Mode.SRC_ATOP);
        h[64] = true;
        textView.setTextColor(C0841b.m4915a((Context) this, 17170443));
        h[65] = true;
    }

    /* renamed from: f */
    public void mo35961f() {
        boolean[] h = m46550h();
        findViewById(C9700R.C9704id.ib_core_onboarding_container).setOnClickListener(this);
        h[69] = true;
    }

    public void finish() {
        boolean[] h = m46550h();
        super.finish();
        h[67] = true;
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        h[68] = true;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        boolean[] h = m46550h();
        int i = C9700R.layout.ib_core_lyt_onboarding_activity;
        h[1] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void initViews() {
        boolean[] h = m46550h();
        this.f26610a = (InstabugViewPager) findViewById(C9700R.C9704id.ib_core_onboarding_viewpager);
        InstabugViewPager instabugViewPager = this.f26610a;
        int i = C9700R.attr.instabug_background_color;
        h[10] = true;
        int color = AttrResolver.getColor(this, i);
        h[11] = true;
        DrawableUtils.setColor(instabugViewPager, color);
        h[12] = true;
        this.f26607N = (DotIndicator) findViewById(C9700R.C9704id.ib_core_onboarding_viewpager_indicator);
        h[13] = true;
        this.f26608O = (TextView) findViewById(C9700R.C9704id.ib_core_onboarding_done);
        h[14] = true;
        this.f26610a.addOnPageChangeListener(this);
        h[15] = true;
        this.f26608O.setOnClickListener(this);
        h[16] = true;
        this.f26610a.setOffscreenPageLimit(2);
        h[17] = true;
        this.f26610a.setAutoHeight(true);
        h[18] = true;
        this.f26607N.setSelectedDotColor(Instabug.getPrimaryColor());
        DotIndicator dotIndicator = this.f26607N;
        h[19] = true;
        int d = C0821b.m4811d(Instabug.getPrimaryColor(), 80);
        h[20] = true;
        dotIndicator.setUnselectedDotColor(d);
        h[21] = true;
        this.f26608O.setTextColor(Instabug.getPrimaryColor());
        h[22] = true;
        ((C10005c) this.presenter).mo35965a(this.f26609P);
        h[23] = true;
        if (LocaleUtils.isRTL(Instabug.getLocale(this))) {
            h[24] = true;
            this.f26610a.setRotation(180.0f);
            h[25] = true;
            LayoutParams layoutParams = (LayoutParams) this.f26608O.getLayoutParams();
            h[26] = true;
            layoutParams.addRule(5, this.f26610a.getId());
            h[27] = true;
            this.f26608O.setLayoutParams(layoutParams);
            h[28] = true;
        } else {
            LayoutParams layoutParams2 = (LayoutParams) this.f26608O.getLayoutParams();
            h[29] = true;
            layoutParams2.addRule(7, this.f26610a.getId());
            h[30] = true;
            this.f26608O.setLayoutParams(layoutParams2);
            h[31] = true;
        }
        h[32] = true;
    }

    public void onBackPressed() {
        boolean[] h = m46550h();
        super.onBackPressed();
        h[57] = true;
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        h[58] = true;
    }

    public void onClick(View view) {
        boolean[] h = m46550h();
        if (view.getId() == C9700R.C9704id.ib_core_onboarding_done) {
            h[51] = true;
            finish();
            h[52] = true;
        } else if (view.getId() != C9700R.C9704id.ib_core_onboarding_container) {
            h[53] = true;
        } else {
            h[54] = true;
            finish();
            h[55] = true;
        }
        h[56] = true;
    }

    public void onCreate(Bundle bundle) {
        boolean[] h = m46550h();
        SettingsManager.getInstance().setOnboardingShowing(true);
        h[4] = true;
        SettingsManager.getInstance().setShouldAutoShowOnboarding(false);
        h[5] = true;
        this.presenter = new C10005c(this);
        h[6] = true;
        this.f26609P = (State) getIntent().getSerializableExtra("welcome_state");
        h[7] = true;
        overridePendingTransition(C9700R.anim.ib_core_anim_fade_in, C9700R.anim.ib_core_anim_fade_out);
        h[8] = true;
        super.onCreate(bundle);
        h[9] = true;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        boolean[] h = m46550h();
        SettingsManager.getInstance().setOnboardingShowing(false);
        h[70] = true;
        super.onDestroy();
        h[71] = true;
    }

    /* renamed from: a */
    public void mo35957a(List<C10008d> list) {
        boolean[] h = m46550h();
        this.f26611b = new C10002a(getSupportFragmentManager(), list);
        h[33] = true;
        this.f26610a.setAdapter(this.f26611b);
        h[34] = true;
        this.f26607N.setNumberOfItems(this.f26611b.mo8886a());
        h[35] = true;
        m46549g();
        h[36] = true;
    }

    /* renamed from: c */
    public void mo35958c() {
        boolean[] h = m46550h();
        findViewById(C9700R.C9704id.instabug_pbi_container).setVisibility(8);
        h[66] = true;
    }

    /* renamed from: a */
    public void mo8879a(int i, float f, int i2) {
        m46550h()[42] = true;
    }

    /* renamed from: a */
    public void mo8878a(int i) {
        m46550h()[50] = true;
    }
}
