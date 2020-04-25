package com.mrsool.auth;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.HomeActivity;
import com.mrsool.bean.SingInBean;
import com.mrsool.bean.VerifyOTP;
import com.mrsool.customeview.Pinview;
import com.mrsool.customeview.Pinview.C10708h;
import com.mrsool.p409me.EditProfileActivity;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p065e.p066b.p067a.C2118c;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ConfirmationOTPActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public String f27472S;

    /* renamed from: T */
    private String f27473T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public AlertDialog f27474U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f27475V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f27476W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public TextView f27477X;

    /* renamed from: Y */
    private TextView f27478Y;

    /* renamed from: Z */
    private ImageView f27479Z;

    /* renamed from: a0 */
    private View f27480a0;

    /* renamed from: b0 */
    private View f27481b0;

    /* renamed from: c0 */
    private View f27482c0;

    /* renamed from: d0 */
    private View f27483d0;

    /* renamed from: e0 */
    private CountDownTimer f27484e0;

    /* renamed from: f0 */
    private AppSingleton f27485f0;

    /* renamed from: g0 */
    private C11617f f27486g0;

    /* renamed from: h0 */
    private Bundle f27487h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public String f27488i0 = "";
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public int f27489j0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public Pinview f27490k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public VerifyOTP f27491l0;

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$a */
    class C10255a implements C10708h {
        C10255a() {
        }

        /* renamed from: a */
        public void mo36599a(Pinview pinview, boolean z) {
            ConfirmationOTPActivity.this.f29642a.mo23494P();
            ConfirmationOTPActivity.this.f27475V.performClick();
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$b */
    class C10256b implements Runnable {
        C10256b() {
        }

        public void run() {
            ConfirmationOTPActivity.this.f27490k0.mo38111c();
            ConfirmationOTPActivity.this.f29642a.mo23668v0();
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$c */
    class C10257c implements Callback<SingInBean> {
        C10257c() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (ConfirmationOTPActivity.this.f29642a != null) {
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    ConfirmationOTPActivity.this.f29642a.mo23475F(ConfirmationOTPActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            try {
                if (ConfirmationOTPActivity.this.f29642a != null) {
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            ConfirmationOTPActivity.this.f27472S = singInBean.getIUserId().toString();
                            ConfirmationOTPActivity.this.mo36596b(ConfirmationOTPActivity.this.getString(C10232R.string.app_name), singInBean.getMessage());
                        } else if (ConfirmationOTPActivity.this.f29642a != null) {
                            ConfirmationOTPActivity.this.f29642a.mo23475F(singInBean.getMessage());
                        }
                    } else if (ConfirmationOTPActivity.this.f29642a != null) {
                        ConfirmationOTPActivity.this.f29642a.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$d */
    class C10258d implements Callback<VerifyOTP> {
        C10258d() {
        }

        public void onFailure(Call<VerifyOTP> call, Throwable th) {
            try {
                if (ConfirmationOTPActivity.this.f29642a != null) {
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    C5887x xVar = ConfirmationOTPActivity.this.f29642a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(th.getMessage());
                    sb.append(". ");
                    sb.append(ConfirmationOTPActivity.this.getString(C10232R.string.msg_error_server_issue));
                    xVar.mo23475F(sb.toString());
                    ConfirmationOTPActivity.this.m47694j(3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<VerifyOTP> call, Response<VerifyOTP> response) {
            try {
                if (ConfirmationOTPActivity.this.f29642a == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    VerifyOTP verifyOTP = (VerifyOTP) response.body();
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    if (verifyOTP.getCode() <= 300) {
                        ConfirmationOTPActivity.this.f27491l0 = verifyOTP;
                        ConfirmationOTPActivity.this.m47694j(2);
                        C11598a.m52263f().mo39809a(ConfirmationOTPActivity.this.f27489j0, ConfirmationOTPActivity.this.f27477X.getText().toString(), ConfirmationOTPActivity.this.f27488i0, "");
                    } else if (ConfirmationOTPActivity.this.f29642a != null) {
                        ConfirmationOTPActivity.this.f29642a.mo23475F(verifyOTP.getMessage());
                        ConfirmationOTPActivity.this.m47694j(3);
                        C11598a.m52263f().mo39809a(ConfirmationOTPActivity.this.f27489j0, ConfirmationOTPActivity.this.f27477X.getText().toString(), ConfirmationOTPActivity.this.f27488i0, verifyOTP.getMessage());
                    }
                } else {
                    if (ConfirmationOTPActivity.this.f27474U != null) {
                        ConfirmationOTPActivity.this.f27474U.dismiss();
                    }
                    ConfirmationOTPActivity.this.f29642a.mo23475F(response.message());
                    ConfirmationOTPActivity.this.m47694j(3);
                    C11598a.m52263f().mo39809a(ConfirmationOTPActivity.this.f27489j0, ConfirmationOTPActivity.this.f27477X.getText().toString(), ConfirmationOTPActivity.this.f27488i0, response.message());
                }
            } catch (Exception e) {
                e.printStackTrace();
                ConfirmationOTPActivity.this.m47694j(3);
            }
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$e */
    class C10259e implements Callback<SingInBean> {
        C10259e() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (ConfirmationOTPActivity.this.f29642a != null) {
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    ConfirmationOTPActivity.this.f29642a.mo23475F(ConfirmationOTPActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            try {
                if (ConfirmationOTPActivity.this.f29642a != null) {
                    ConfirmationOTPActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            ConfirmationOTPActivity.this.mo36596b(ConfirmationOTPActivity.this.getString(C10232R.string.app_name), singInBean.getMessage());
                        } else if (ConfirmationOTPActivity.this.f29642a != null) {
                            ConfirmationOTPActivity.this.f29642a.mo23475F(singInBean.getMessage());
                        }
                    } else {
                        if (ConfirmationOTPActivity.this.f27474U != null) {
                            ConfirmationOTPActivity.this.f27474U.dismiss();
                        }
                        ConfirmationOTPActivity.this.f29642a.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$f */
    class C10260f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27497a;

        C10260f(Dialog dialog) {
            this.f27497a = dialog;
        }

        public void onClick(View view) {
            if (!ConfirmationOTPActivity.this.isFinishing()) {
                this.f27497a.dismiss();
            }
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$g */
    class C10261g extends CountDownTimer {
        C10261g(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            ConfirmationOTPActivity.this.f27476W.setClickable(true);
            ConfirmationOTPActivity.this.f27476W.setText(ConfirmationOTPActivity.this.getString(C10232R.string.lbl_resend_code));
            ConfirmationOTPActivity.this.f27476W.setTextColor(C0841b.m4915a((Context) ConfirmationOTPActivity.this, (int) C10232R.C10234color.sky_blue_color));
        }

        public void onTick(long j) {
            C5887x xVar = ConfirmationOTPActivity.this.f29642a;
            String b = C5887x.m25808b(j);
            ConfirmationOTPActivity.this.f27476W.setText(String.format(ConfirmationOTPActivity.this.getString(C10232R.string.lbl_resend_in_format), new Object[]{b}));
            ConfirmationOTPActivity.this.f27489j0 = ConfirmationOTPActivity.this.f27489j0 + 1;
        }
    }

    /* renamed from: com.mrsool.auth.ConfirmationOTPActivity$h */
    class C10262h implements AnimationListener {
        C10262h() {
        }

        public void onAnimationEnd(Animation animation) {
            ConfirmationOTPActivity confirmationOTPActivity = ConfirmationOTPActivity.this;
            confirmationOTPActivity.m47683a(confirmationOTPActivity.f27491l0);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: K */
    private void m47667K() {
        HashMap hashMap = new HashMap();
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str) != null ? this.f29642a.mo23468C().mo23459f(str) : C11644i.f33273c5);
        hashMap.put("vPhone", getIntent().getStringExtra("val_cc_phone"));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("vAppVersion", String.valueOf(this.f29642a.mo23633k()));
        hashMap.put("vPlatform", C11644i.f33264b5);
        C5881v C2 = this.f29642a.mo23468C();
        String str2 = C11644i.f33303g;
        if (C2.mo23459f(str2) != null) {
            hashMap.put("latitude", this.f29642a.mo23468C().mo23459f(str2));
            hashMap.put("longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("vLanguage", this.f29642a.mo23478H());
        hashMap.put("language", String.valueOf(this.f29642a.mo23645o()));
        hashMap.put("device_id", this.f29642a.mo23669w());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignInApi Data: ");
        sb2.append(hashMap);
        C5880q.m25751b(sb2.toString());
        Call SignInApi = C11687c.m52645a(this.f29642a).SignInApi(hashMap);
        this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        SignInApi.enqueue(new C10257c());
    }

    /* renamed from: L */
    private void m47668L() {
        this.f27490k0.mo38106a();
        this.f29642a.mo23494P();
        if (this.f29642a.mo23502X()) {
            String str = "user_id";
            if (getIntent().hasExtra(str) && !this.f29642a.mo23468C().mo23450a(C11644i.f33222W4)) {
                Intent intent = getIntent();
                String str2 = C11644i.f33199T5;
                if (intent.hasExtra(str2) && !getIntent().getStringExtra(str2).equalsIgnoreCase("Splash")) {
                    mo36594J();
                    this.f27472S = getIntent().getStringExtra(str);
                    m47696k(getIntent().getStringExtra(str));
                    return;
                }
            }
            mo36594J();
            m47667K();
        }
    }

    /* renamed from: M */
    private void m47669M() {
        if (!this.f29642a.mo23502X()) {
            return;
        }
        if (this.f27490k0.getValue() != null && this.f27490k0.getValue().toString().trim().length() > 0) {
            m47697l(this.f27490k0.getValue().toString());
        } else if (this.f27490k0.getValue().toString().trim().length() == 0) {
            this.f29642a.mo23475F(getString(C10232R.string.msg_error_blank_otp));
        } else {
            AlertDialog alertDialog = this.f27474U;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
            this.f29642a.mo23475F(getString(C10232R.string.msg_error_invalide_OTP));
        }
    }

    /* renamed from: N */
    private String m47670N() {
        if (C11644i.f33198T4.equalsIgnoreCase(this.f27473T)) {
            return "Google";
        }
        return C11644i.f33190S4.equalsIgnoreCase(this.f27473T) ? "Facebook" : "Mobile";
    }

    /* renamed from: O */
    private void m47671O() {
        this.f27481b0.setVisibility(8);
        this.f27482c0.setVisibility(0);
        mo36595a(this.f27483d0, 0, new C10262h());
    }

    /* renamed from: P */
    private void m47672P() {
        m47677U();
        this.f27487h0 = getIntent().getExtras();
        Bundle bundle = this.f27487h0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33067D1)) {
                this.f27473T = this.f27487h0.getString(C11644i.f33067D1);
            }
            Bundle bundle2 = this.f27487h0;
            String str = C11644i.f33347k7;
            if (bundle2.containsKey(str)) {
                this.f27488i0 = this.f27487h0.getString(str);
            }
        }
        this.f27480a0 = findViewById(C10232R.C10236id.llLoader);
        this.f27481b0 = findViewById(C10232R.C10236id.pbAPI);
        this.f27482c0 = findViewById(C10232R.C10236id.txtStatus);
        this.f27483d0 = findViewById(C10232R.C10236id.imgStatus);
        this.f27475V = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f27475V.setOnClickListener(this);
        this.f27476W = (TextView) findViewById(C10232R.C10236id.tvResend);
        this.f27476W.setOnClickListener(this);
        this.f27477X = (TextView) findViewById(C10232R.C10236id.txtPhone);
        mo36594J();
        this.f27490k0 = (Pinview) findViewById(C10232R.C10236id.otpPinView);
        this.f27490k0.setTextSize(37);
        this.f27490k0.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
        if (getIntent() != null) {
            String str2 = "val_cc_phone";
            if (getIntent().hasExtra(str2)) {
                this.f27477X.setText(C5887x.m25792T(getIntent().getStringExtra(str2)));
            }
        }
        if (this.f29642a.mo23496R()) {
            this.f27490k0.setLayoutDirection(0);
        }
        this.f27490k0.setPinViewEventListener(new C10255a());
        new Handler().postDelayed(new C10256b(), 500);
    }

    /* renamed from: Q */
    private boolean m47673Q() {
        return this.f29642a.mo23468C().mo23450a(C11644i.f33206U4);
    }

    /* renamed from: R */
    private boolean m47674R() {
        return this.f29642a.mo23468C().mo23450a(C11644i.f33214V4);
    }

    /* renamed from: S */
    private boolean m47675S() {
        return this.f29642a.mo23468C().mo23450a(C11644i.f33222W4);
    }

    /* renamed from: T */
    private void m47676T() {
        if (C11644i.f33198T4.equalsIgnoreCase(this.f27473T)) {
            this.f29642a.mo23479H(C11644i.f33214V4);
            return;
        }
        if (C11644i.f33190S4.equalsIgnoreCase(this.f27473T)) {
            this.f29642a.mo23479H(C11644i.f33206U4);
        } else {
            this.f29642a.mo23479H(C11644i.f33222W4);
        }
    }

    /* renamed from: U */
    private void m47677U() {
        this.f27478Y = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27478Y.setText(getString(C10232R.string.title_confirm_mobile_number));
        this.f27479Z = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f27479Z.setOnClickListener(this);
    }

    /* renamed from: j */
    private void m47695j(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23476G());
            jSONObject.put(string, sb.toString());
            jSONObject.put(getResources().getString(C10232R.string.brach_event_param_channel), str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6009d.m27516c(getApplicationContext()).mo24767a(getResources().getString(C10232R.string.branch_event_user_signup_revised), jSONObject);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BRANCH_EVENT: ");
        sb2.append(getResources().getString(C10232R.string.branch_event_user_signup_revised));
        sb2.append(" values :");
        sb2.append(jSONObject.toString());
        C5880q.m25751b(sb2.toString());
    }

    /* renamed from: k */
    private void m47696k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("vPhone", getIntent().getStringExtra("val_cc_phone"));
        C5881v C = this.f29642a.mo23468C();
        String str2 = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str2) != null ? this.f29642a.mo23468C().mo23459f(str2) : C11644i.f33273c5);
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("vAppVersion", String.valueOf(this.f29642a.mo23633k()));
        hashMap.put("vPlatform", C11644i.f33264b5);
        hashMap.put("vLanguage", this.f29642a.mo23478H());
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        sb2.append(str3);
        sb2.append(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("current_user_id", sb3.toString());
        C5881v C2 = this.f29642a.mo23468C();
        String str4 = C11644i.f33303g;
        if (C2.mo23459f(str4) != null) {
            hashMap.put("latitude", this.f29642a.mo23468C().mo23459f(str4));
            hashMap.put("longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("device_id", this.f29642a.mo23669w());
        hashMap.put("language", String.valueOf(this.f29642a.mo23645o()));
        Call SignInSocialMediaApi = C11687c.m52645a(this.f29642a).SignInSocialMediaApi(str, hashMap);
        this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        SignInSocialMediaApi.enqueue(new C10259e());
    }

    /* renamed from: l */
    private void m47697l(String str) {
        m47694j(1);
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33686J, str);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f29642a.mo23468C().mo23459f("user_id"));
        hashMap.put("current_user_id", sb.toString());
        if (C11644i.f33198T4.equalsIgnoreCase(this.f27473T)) {
            hashMap.put("vGoogleId", this.f29642a.mo23468C().mo23459f(C11644i.f33345k5));
        } else {
            if (C11644i.f33190S4.equalsIgnoreCase(this.f27473T)) {
                hashMap.put("vFacbookId", this.f29642a.mo23468C().mo23459f(C11644i.f33309g5));
            }
        }
        hashMap.put("device_id", this.f29642a.mo23669w());
        hashMap.put("language", String.valueOf(this.f29642a.mo23645o()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("VerifyOTPApi()==>>");
        sb2.append(hashMap);
        C5880q.m25751b(sb2.toString());
        C11687c.m52645a(this.f29642a).VerifyOTPApi(this.f27472S, hashMap).enqueue(new C10258d());
    }

    /* renamed from: J */
    public void mo36594J() {
        this.f27476W.setClickable(false);
        this.f27476W.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.text_color_7a));
        C10261g gVar = new C10261g(120000, 1000);
        this.f27484e0 = gVar;
        this.f27484e0.start();
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C10232R.anim.slide_no_change, C10232R.anim.slide_down_activity_new);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.btnDone) {
            this.f29642a.mo23494P();
            this.f27472S = getIntent().getStringExtra("user_id");
            m47669M();
        } else if (id == C10232R.C10236id.imgClose) {
            onBackPressed();
        } else if (id == C10232R.C10236id.tvResend) {
            this.f29642a.mo23494P();
            m47668L();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_confirm_otp);
        this.f27485f0 = (AppSingleton) getApplicationContext();
        this.f27486g0 = new C11617f(this);
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        m47672P();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f27484e0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f27484e0 = null;
        }
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* renamed from: i */
    private void m47693i(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f29642a.mo23476G());
            jSONObject.put(string, sb.toString());
            jSONObject.put(getResources().getString(C10232R.string.brach_event_param_channel), str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6009d.m27516c(getApplicationContext()).mo24767a(getResources().getString(C10232R.string.branch_event_user_signin), jSONObject);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("BRANCH_EVENT: ");
        sb2.append(getResources().getString(C10232R.string.branch_event_user_signin));
        sb2.append(" values :");
        sb2.append(jSONObject.toString());
        C5880q.m25751b(sb2.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36597c(boolean z) {
        if (z) {
            getWindow().addFlags(67108864);
        } else {
            getWindow().clearFlags(67108864);
        }
    }

    /* renamed from: b */
    public void mo36596b(String str, String str2) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_show_ok);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str);
        textView2.setText(str2);
        textView.setOnClickListener(new C10260f(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47683a(VerifyOTP verifyOTP) {
        AlertDialog alertDialog = this.f27474U;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        boolean equalsIgnoreCase = getIntent().getStringExtra("callFrom").equalsIgnoreCase("EditProfile");
        String str = C11644i.f33411s5;
        String str2 = C11644i.f33443w5;
        String str3 = "val_cc_phone";
        String str4 = C11644i.f33387p5;
        if (equalsIgnoreCase) {
            CountDownTimer countDownTimer = this.f27484e0;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.f27484e0 = null;
            }
            this.f29642a.mo23468C().mo23449a(str4, getIntent().getStringExtra(str3));
            EditProfileActivity.f29757o0 = Boolean.valueOf(true);
            this.f29642a.mo23468C().mo23449a(str2, verifyOTP.getAuth_token());
            this.f29642a.mo23468C().mo23448a(str, verifyOTP.getIs_courier());
            finish();
            return;
        }
        this.f29642a.mo23468C().mo23449a(str4, getIntent().getStringExtra(str3));
        this.f29642a.mo23468C().mo23448a(C11644i.f33435v5, Boolean.valueOf(verifyOTP.getBNotification() != null ? verifyOTP.getBNotification().booleanValue() : false));
        this.f29642a.mo23468C().mo23449a(str2, verifyOTP.getAuth_token());
        this.f29642a.mo23468C().mo23449a("user_id", this.f27472S);
        this.f29642a.mo23468C().mo23448a(str, verifyOTP.getIs_courier());
        boolean booleanValue = verifyOTP.getBProfileComplete().booleanValue();
        String str5 = C11644i.f33246Z4;
        if (booleanValue) {
            this.f29642a.mo23494P();
            m47693i(m47670N());
            m47676T();
            this.f29642a.mo23468C().mo23448a(str5, Boolean.valueOf(true));
            C6009d.m27516c(getApplicationContext()).mo24810e(getResources().getString(C10232R.string.branch_event_user_signup));
            Intent intent = new Intent(this, HomeActivity.class);
            this.f29642a.mo23468C().mo23448a(C11644i.f33230X4, Boolean.valueOf(false));
            intent.setFlags(67108864);
            intent.setFlags(268435456);
            intent.setFlags(32768);
            startActivity(intent);
            CountDownTimer countDownTimer2 = this.f27484e0;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                this.f27484e0 = null;
            }
            finish();
            return;
        }
        m47676T();
        C6009d.m27516c(getApplicationContext()).mo24810e(getResources().getString(C10232R.string.branch_event_user_signup));
        this.f29642a.mo23468C().mo23448a(str5, Boolean.valueOf(false));
        Intent intent2 = new Intent(this, ProfileActivity.class);
        intent2.addFlags(67108864);
        intent2.addFlags(268435456);
        intent2.setFlags(32768);
        CountDownTimer countDownTimer3 = this.f27484e0;
        if (countDownTimer3 != null) {
            countDownTimer3.cancel();
            this.f27484e0 = null;
        }
        startActivity(intent2);
        overridePendingTransition(17432576, 17432577);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m47694j(int i) {
        if (i == 1) {
            this.f27480a0.setVisibility(0);
            this.f27481b0.setVisibility(0);
            this.f27483d0.setVisibility(4);
            this.f27482c0.setVisibility(4);
        } else if (i == 2) {
            m47671O();
        } else if (i == 3) {
            this.f27480a0.setVisibility(8);
            this.f27481b0.setVisibility(8);
            this.f27483d0.setVisibility(4);
            this.f27482c0.setVisibility(4);
        }
    }

    /* renamed from: a */
    private void m47680a(EditText editText) {
        Drawable background = editText.getBackground();
        background.setColorFilter(-1, Mode.SRC_ATOP);
        editText.setHighlightColor(C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.White));
        editText.setHintTextColor(C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.White));
        editText.setBackground(background);
    }

    /* renamed from: a */
    public void mo36595a(View view, int i, AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setFillAfter(true);
        animationSet.setInterpolator(new C2118c());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500);
        long j = (long) i;
        alphaAnimation.setStartOffset(j);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500);
        scaleAnimation.setStartOffset(j);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(animationListener);
        view.startAnimation(animationSet);
    }
}
