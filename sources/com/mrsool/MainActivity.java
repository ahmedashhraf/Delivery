package com.mrsool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import com.mrsool.auth.FBLoginActivity;
import com.mrsool.auth.GplusLoginActivity;
import com.mrsool.auth.LoginWithPhoneActivity;
import com.mrsool.p409me.TermsOfServiceActivity;
import com.mrsool.socket.LocationService;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p419a0.C11570a;
import org.jcodec.containers.mps.MPSUtils;
import p053b.p065e.p066b.p067a.C2118c;

public class MainActivity extends C10795e implements OnClickListener {

    /* renamed from: v0 */
    public static Activity f27335v0;

    /* renamed from: S */
    private final int f27336S = 2002;

    /* renamed from: T */
    private C11669t f27337T;

    /* renamed from: U */
    private ImageView f27338U;

    /* renamed from: V */
    private ImageView f27339V;

    /* renamed from: W */
    private ImageView f27340W;

    /* renamed from: X */
    private TextView f27341X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f27342Y;

    /* renamed from: Z */
    private TextView f27343Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public TextView f27344a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public TextView f27345b0;

    /* renamed from: c0 */
    private TextView f27346c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public TextView f27347d0;

    /* renamed from: e0 */
    private ImageView f27348e0;

    /* renamed from: f0 */
    private View f27349f0;

    /* renamed from: g0 */
    private View f27350g0;

    /* renamed from: h0 */
    private View f27351h0;

    /* renamed from: i0 */
    private View f27352i0;

    /* renamed from: j0 */
    private View f27353j0;

    /* renamed from: k0 */
    private View f27354k0;

    /* renamed from: l0 */
    private View f27355l0;

    /* renamed from: m0 */
    private int f27356m0 = 0;

    /* renamed from: n0 */
    private final int f27357n0 = 333;

    /* renamed from: o0 */
    private final int f27358o0 = MPSUtils.PSM;

    /* renamed from: p0 */
    private final int f27359p0 = 556;

    /* renamed from: q0 */
    private final int f27360q0 = 1;

    /* renamed from: r0 */
    private final int f27361r0 = 2;

    /* renamed from: s0 */
    private final int f27362s0 = 3;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public int f27363t0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public boolean f27364u0 = false;

    /* renamed from: com.mrsool.MainActivity$a */
    class C10222a implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f27366a;

        /* renamed from: b */
        final /* synthetic */ int f27367b;

        C10222a(TextView textView, int i) {
            this.f27366a = textView;
            this.f27367b = i;
        }

        public void onGlobalLayout() {
            float f;
            float f2;
            this.f27366a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Paint paint = new Paint(this.f27366a.getPaint());
            if (this.f27366a.getText().toString().isEmpty()) {
                f = paint.measureText(this.f27366a.getHint().toString());
            } else {
                f = paint.measureText(this.f27366a.getText().toString());
            }
            float width = (float) this.f27366a.getWidth();
            int maxLines = this.f27366a.getMaxLines();
            while (width > 0.0f && f / ((float) maxLines) > width - ((float) (this.f27366a.getCompoundDrawablePadding() + this.f27367b))) {
                float textSize = paint.getTextSize();
                paint.setTextSize(textSize - 1.0f);
                if (this.f27366a.getText().toString().isEmpty()) {
                    f2 = paint.measureText(this.f27366a.getHint().toString());
                } else {
                    f2 = paint.measureText(this.f27366a.getText().toString());
                }
                if (textSize < TypedValue.applyDimension(2, 8.0f, MainActivity.this.getResources().getDisplayMetrics())) {
                    break;
                }
                f = f2;
            }
            this.f27366a.setTextSize(0, paint.getTextSize());
        }
    }

    /* renamed from: com.mrsool.MainActivity$b */
    class C10223b implements TransitionListener {
        C10223b() {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            MainActivity.this.f27364u0 = true;
            MainActivity.this.m47593l(1200);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: com.mrsool.MainActivity$c */
    class C10224c extends ClickableSpan {
        C10224c() {
        }

        public void onClick(View view) {
            MainActivity.this.m47581b0();
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(true);
        }
    }

    /* renamed from: com.mrsool.MainActivity$d */
    class C10225d implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f27370a;

        C10225d(int i) {
            this.f27370a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
            MainActivity.this.m47564R();
        }

        /* renamed from: b */
        public void mo36514b() {
            C5881v D = MainActivity.this.f29642a.mo23470D();
            MainActivity mainActivity = MainActivity.this;
            D.mo23449a(C11644i.f33295f0, mainActivity.f29642a.mo23522a((Context) mainActivity));
            int i = this.f27370a;
            if (i == 1) {
                MainActivity.this.m47571Y();
            } else if (i == 2) {
                MainActivity.this.m47570X();
            } else if (i == 3) {
                MainActivity.this.m47572Z();
            }
        }
    }

    /* renamed from: com.mrsool.MainActivity$e */
    class C10226e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27372a;

        C10226e(Dialog dialog) {
            this.f27372a = dialog;
        }

        public void onClick(View view) {
            MainActivity.this.m47562P();
            this.f27372a.dismiss();
        }
    }

    /* renamed from: com.mrsool.MainActivity$f */
    class C10227f implements C11072p {
        C10227f() {
        }

        /* renamed from: a */
        public void mo36571a() {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m47592k(mainActivity.f27363t0);
        }
    }

    /* renamed from: com.mrsool.MainActivity$g */
    class C10228g implements OnGlobalLayoutListener {
        C10228g() {
        }

        public void onGlobalLayout() {
            MainActivity.this.f27344a0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m47574a(mainActivity.f27344a0, 0);
        }
    }

    /* renamed from: com.mrsool.MainActivity$h */
    class C10229h implements OnGlobalLayoutListener {
        C10229h() {
        }

        public void onGlobalLayout() {
            MainActivity.this.f27345b0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m47574a(mainActivity.f27345b0, 0);
        }
    }

    /* renamed from: com.mrsool.MainActivity$i */
    class C10230i implements OnGlobalLayoutListener {
        C10230i() {
        }

        public void onGlobalLayout() {
            MainActivity.this.f27347d0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m47574a(mainActivity.f27347d0, 0);
        }
    }

    /* renamed from: com.mrsool.MainActivity$j */
    class C10231j implements OnGlobalLayoutListener {
        C10231j() {
        }

        public void onGlobalLayout() {
            MainActivity.this.f27342Y.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MainActivity mainActivity = MainActivity.this;
            mainActivity.m47574a(mainActivity.f27342Y, 0);
        }
    }

    /* renamed from: N */
    private void m47560N() {
        this.f27344a0.getViewTreeObserver().addOnGlobalLayoutListener(new C10228g());
        this.f27345b0.getViewTreeObserver().addOnGlobalLayoutListener(new C10229h());
        this.f27347d0.getViewTreeObserver().addOnGlobalLayoutListener(new C10230i());
        this.f27342Y.getViewTreeObserver().addOnGlobalLayoutListener(new C10231j());
    }

    /* renamed from: O */
    private void m47561O() {
        m47592k(this.f27363t0);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m47562P() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivityForResult(intent, 556);
    }

    @TargetApi(21)
    /* renamed from: Q */
    private void m47563Q() {
        findViewById(C10232R.C10236id.imgLogo).setTransitionName(getString(C10232R.string.lbl_transition_logo));
        getWindow().setSharedElementEnterTransition(m47565S());
        getWindow().getSharedElementEnterTransition().setDuration(1200).addListener(new C10223b());
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m47564R() {
        this.f27356m0++;
        int i = this.f27356m0;
        if (i == 1) {
            boolean z = false;
            if (VERSION.SDK_INT >= 23) {
                z = shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE");
            }
            if (!z) {
                mo36552K();
            } else {
                mo36553L();
            }
        } else if (i > 1) {
            mo36552K();
        }
    }

    @RequiresApi(api = 21)
    /* renamed from: S */
    private Transition m47565S() {
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setInterpolator(new C11570a());
        changeBounds.setDuration(1200);
        return changeBounds;
    }

    /* renamed from: T */
    private void m47566T() {
        this.f27355l0 = findViewById(C10232R.C10236id.llContainerMain);
        this.f27349f0 = findViewById(C10232R.C10236id.rlFacebook);
        this.f27350g0 = findViewById(C10232R.C10236id.rlGoogle);
        this.f27351h0 = findViewById(C10232R.C10236id.llOr);
        this.f27352i0 = findViewById(C10232R.C10236id.rlMobile);
        this.f27353j0 = findViewById(C10232R.C10236id.llSkip);
        this.f27354k0 = findViewById(C10232R.C10236id.llTerms);
    }

    /* renamed from: U */
    private void m47567U() {
        this.f27338U = (ImageView) findViewById(C10232R.C10236id.imgLoginWithFacebook);
        this.f27338U.setOnClickListener(this);
        this.f27339V = (ImageView) findViewById(C10232R.C10236id.imgLoginWithGoogle);
        this.f27339V.setOnClickListener(this);
        this.f27340W = (ImageView) findViewById(C10232R.C10236id.imgLoginWithMobile);
        this.f27340W.setOnClickListener(this);
        this.f27343Z = (TextView) findViewById(C10232R.C10236id.txtSkip);
        this.f27343Z.setOnClickListener(this);
        this.f27344a0 = (TextView) findViewById(C10232R.C10236id.txtFacebook);
        this.f27345b0 = (TextView) findViewById(C10232R.C10236id.txtGoogle);
        this.f27346c0 = (TextView) findViewById(C10232R.C10236id.txtOr);
        this.f27347d0 = (TextView) findViewById(C10232R.C10236id.txtMobile);
        this.f27341X = (TextView) findViewById(C10232R.C10236id.txtTermsAndCondition);
        this.f27342Y = (TextView) findViewById(C10232R.C10236id.txtTerms);
        m47568V();
        m47560N();
    }

    /* renamed from: V */
    private void m47568V() {
        String string = getString(C10232R.string.lbl_terms_condition);
        String format = String.format(getString(C10232R.string.lbl_by_using_this_app_s), new Object[]{string});
        int indexOf = format.indexOf(getString(C10232R.string.lbl_terms_condition));
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new C10224c(), indexOf, string.length() + indexOf, 33);
        this.f27342Y.setMovementMethod(LinkMovementMethod.getInstance());
        this.f27342Y.setHighlightColor(0);
        this.f27342Y.setText(spannableString);
    }

    /* renamed from: W */
    private void m47569W() {
        if (this.f29642a.mo23502X()) {
            m47561O();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m47570X() {
        Intent intent = new Intent(this, FBLoginActivity.class);
        intent.putExtra(C11644i.f33206U4, false);
        startActivityForResult(intent, 333);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m47571Y() {
        Intent intent = new Intent(this, GplusLoginActivity.class);
        intent.putExtra(C11644i.f33214V4, false);
        startActivityForResult(intent, MPSUtils.PSM);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m47572Z() {
        if (this.f29642a.mo23502X()) {
            C11644i.f33186S0 = 3;
            this.f29642a.mo23468C().mo23448a(C11644i.f33214V4, Boolean.valueOf(false));
            this.f29642a.mo23468C().mo23448a(C11644i.f33206U4, Boolean.valueOf(false));
            this.f29642a.mo23468C().mo23448a(C11644i.f33246Z4, Boolean.valueOf(false));
            Intent intent = new Intent(this, LoginWithPhoneActivity.class);
            intent.putExtra(C11644i.f33067D1, C11644i.f33182R4);
            startActivity(intent);
        }
    }

    /* renamed from: a0 */
    private void m47578a0() {
        if (this.f29642a.mo23502X()) {
            Intent intent = new Intent(this, HomeActivity.class);
            this.f29642a.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(true));
            intent.putExtra(C11644i.f33407s1, true);
            intent.setFlags(67108864);
            intent.setFlags(268435456);
            intent.setFlags(32768);
            startActivity(intent);
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m47581b0() {
        this.f29642a.mo23611e(getString(C10232R.string.lbl_terms_condition), "https://s.mrsool.co/terms.html");
    }

    /* renamed from: c0 */
    private void m47583c0() {
        Intent intent = new Intent(this, TermsOfServiceActivity.class);
        intent.putExtra(C11644i.f33391q1, "Test");
        intent.putExtra(C11644i.f33383p1, "http://172.16.17.4:3000/reimbursement_complaint?token=eyJhbGciOiJIUzI1NiJ9.eyJvcmRlcl9pZCI6NDQxMSwiY291cmllcl9pZCI6MjU3Mzg4NCwiY291cmllcl9sYW5ndWFnZSI6bnVsbCwiY29tcGxhaW50X3RhYiI6bnVsbH0.egStwANgUbNjCIC1-9v4b7pQLnzXAScsFHjjPXkTt5U");
        intent.addFlags(268435456);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m47593l(int i) {
        mo36557b(this.f27349f0, 1300 - i);
        mo36557b(this.f27350g0, 1400 - i);
        mo36557b(this.f27351h0, 1500 - i);
        mo36557b(this.f27352i0, 1600 - i);
        mo36557b(this.f27353j0, 1700 - i);
        mo36557b(this.f27354k0, 1800 - i);
    }

    /* renamed from: J */
    public boolean mo36551J() {
        return this.f27349f0.getVisibility() == 0 && this.f27350g0.getVisibility() == 0 && this.f27351h0.getVisibility() == 0 && this.f27352i0.getVisibility() == 0 && this.f27353j0.getVisibility() == 0 && this.f27354k0.getVisibility() == 0;
    }

    /* renamed from: K */
    public void mo36552K() {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(C10232R.string.lbl_read_phone_permission_dialog));
            sb.append("");
            sb.append(getResources().getString(C10232R.string.lbl_navigate_to_setting));
            textView2.setText(sb.toString());
            textView2.setMaxLines(Integer.MAX_VALUE);
            textView2.setEllipsize(null);
            textView.setText(C10232R.string.lbl_settings);
            textView.setOnClickListener(new C10226e(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: L */
    public void mo36553L() {
        try {
            mo38408a(getResources().getString(C10232R.string.lbl_read_phone_permission_dialog), getResources().getString(C10232R.string.app_name), (C11072p) new C10227f());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: M */
    public void mo36554M() {
        try {
            if (this.f29642a.mo23495Q()) {
                startForegroundService(new Intent(this, LocationService.class));
            } else {
                startService(new Intent(this, LocationService.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if ((i == 333 || i == 444) && (!this.f29642a.mo23468C().mo23450a(C11644i.f33206U4) || this.f29642a.mo23468C().mo23459f(C11644i.f33318h5) == null || !this.f29642a.mo23468C().mo23450a(C11644i.f33214V4) || this.f29642a.mo23468C().mo23459f(C11644i.f33354l5) == null)) {
                mo38407a(getString(C10232R.string.msg_error_email_address_not_found), getString(C10232R.string.lbl_dt_login_failed));
            }
        } else if (i2 == 0 && i == 556) {
            m47561O();
        }
    }

    public void onBackPressed() {
        if (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getString(C11644i.f33324i2, "").equalsIgnoreCase("splash")) {
            super.onBackPressed();
            return;
        }
        finishAffinity();
        finish();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.txtSkip) {
            m47578a0();
        } else if (id != C10232R.C10236id.txtTermsAndCondition) {
            switch (id) {
                case C10232R.C10236id.imgLoginWithFacebook /*2131362484*/:
                    this.f27363t0 = 2;
                    m47569W();
                    return;
                case C10232R.C10236id.imgLoginWithGoogle /*2131362485*/:
                    this.f27363t0 = 1;
                    m47569W();
                    return;
                case C10232R.C10236id.imgLoginWithMobile /*2131362486*/:
                    if (this.f29642a.mo23497S()) {
                        this.f27363t0 = 3;
                        m47569W();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            m47581b0();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo36556b(getResources().getConfiguration());
        this.f29642a = new C5887x(this);
        this.f29642a.mo23638l0();
        C5887x xVar = this.f29642a;
        xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
        this.f27337T = new C11669t(this);
        setContentView((int) C10232R.layout.activity_main);
        m47566T();
        if (VERSION.SDK_INT >= 21) {
            getWindow().setEnterTransition(null);
            if (getIntent() == null || getIntent().getExtras() == null || !getIntent().getExtras().getBoolean(C11644i.f33392q2, false)) {
                mo36558j(0);
            } else {
                m47563Q();
            }
        } else {
            mo36558j(0);
        }
        if (this.f29642a.mo23496R()) {
            mo38399G();
        }
        if (C11644i.f33453y) {
            this.f29642a.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(true));
            this.f29642a.mo23581b(false);
            Activity activity = f27335v0;
            if (activity != null) {
                activity.finish();
            }
        }
        f27335v0 = this;
        m47567U();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.f27337T != null) {
                this.f27337T.onRequestPermissionsResult(i, strArr, iArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        mo36558j(0);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m47592k(int i) {
        this.f27337T.mo40036a(C11644i.f33365n, (C11673d) new C10225d(i));
    }

    /* renamed from: j */
    public void mo36558j(int i) {
        this.f27349f0.setVisibility(i);
        this.f27350g0.setVisibility(i);
        this.f27351h0.setVisibility(i);
        this.f27352i0.setVisibility(i);
        this.f27353j0.setVisibility(i);
        this.f27354k0.setVisibility(i);
    }

    /* renamed from: b */
    public void mo36557b(View view, int i) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new C2118c());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        long j = (long) i;
        alphaAnimation.setStartOffset(j);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200);
        scaleAnimation.setStartOffset(j);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        view.startAnimation(animationSet);
    }

    /* renamed from: a */
    public void mo36555a(Context context, Configuration configuration) {
        configuration.fontScale = 1.0f;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
        configuration.densityDpi = (int) getResources().getDisplayMetrics().xdpi;
        getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47574a(TextView textView, int i) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C10222a(textView, i));
    }

    /* renamed from: b */
    public void mo36556b(Configuration configuration) {
        StringBuilder sb = new StringBuilder();
        sb.append("Denish fontScale=");
        sb.append(configuration.fontScale);
        C5880q.m25751b(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Denish font too big. scale down...");
        sb2.append(configuration.fontScale);
        C5880q.m25751b(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Denish fontDensity = > ");
        sb3.append(configuration.densityDpi);
        C5880q.m25751b(sb3.toString());
        if (((double) configuration.fontScale) > 1.3d) {
            configuration.fontScale = 1.3f;
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            ((WindowManager) getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
            getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
        }
    }
}
