package com.mrsool.auth;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.C10795e;
import com.mrsool.bean.SingInBean;
import com.mrsool.countrypicker.activity.CountryPickerActivity;
import com.mrsool.p410r.p413c.C11147a;
import com.mrsool.p410r.p414d.C11148a;
import com.mrsool.p410r.p415e.C11149a;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p489f.C14069f;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginWithPhoneActivity extends C10795e implements OnClickListener {

    /* renamed from: q0 */
    public static Context f27531q0;

    /* renamed from: S */
    private final int f27532S = 1;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public EditText f27533T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C5887x f27534U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public String f27535V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f27536W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public String f27537X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public AlertDialog f27538Y;

    /* renamed from: Z */
    private TextView f27539Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public TextView f27540a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public TextView f27541b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public TextView f27542c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public TextView f27543d0;

    /* renamed from: e0 */
    private TextView f27544e0;

    /* renamed from: f0 */
    private TextView f27545f0;

    /* renamed from: g0 */
    private ImageView f27546g0;

    /* renamed from: h0 */
    private ProgressBar f27547h0;

    /* renamed from: i0 */
    private ImageView f27548i0;

    /* renamed from: j0 */
    private View f27549j0;

    /* renamed from: k0 */
    private View f27550k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public String f27551l0 = "";

    /* renamed from: m0 */
    private int f27552m0;

    /* renamed from: n0 */
    private Bundle f27553n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public int f27554o0;

    /* renamed from: p0 */
    private C11149a f27555p0;

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$a */
    class C10270a implements OnClickListener {
        C10270a() {
        }

        public void onClick(View view) {
            LoginWithPhoneActivity.this.m47744T();
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$b */
    class C10271b implements C11147a {
        C10271b() {
        }

        /* renamed from: a */
        public void mo36619a(String str, String str2, String str3, int i) {
            LoginWithPhoneActivity.this.f27551l0 = "";
            LoginWithPhoneActivity.this.m47777n(str3);
            LoginWithPhoneActivity.this.f27542c0.setText(str);
            InputMethodManager inputMethodManager = (InputMethodManager) LoginWithPhoneActivity.this.getSystemService("input_method");
            LoginWithPhoneActivity.this.f27533T.requestFocus();
            inputMethodManager.showSoftInput(LoginWithPhoneActivity.this.f27533T, 2);
            LoginWithPhoneActivity.this.f27533T.setSelection(LoginWithPhoneActivity.this.f27533T.getText().length());
            LoginWithPhoneActivity loginWithPhoneActivity = LoginWithPhoneActivity.this;
            loginWithPhoneActivity.m47748a(loginWithPhoneActivity.f27543d0, 0);
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$c */
    class C10272c implements OnGlobalLayoutListener {
        C10272c() {
        }

        public void onGlobalLayout() {
            LoginWithPhoneActivity.this.f27542c0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            LoginWithPhoneActivity.this.f27554o0 = LoginWithPhoneActivity.this.getResources().getDrawable(C10232R.C10235drawable.ic_arrow_down).getIntrinsicWidth();
            LoginWithPhoneActivity loginWithPhoneActivity = LoginWithPhoneActivity.this;
            loginWithPhoneActivity.m47748a(loginWithPhoneActivity.f27542c0, LoginWithPhoneActivity.this.f27554o0);
            LoginWithPhoneActivity loginWithPhoneActivity2 = LoginWithPhoneActivity.this;
            loginWithPhoneActivity2.m47748a(loginWithPhoneActivity2.f27541b0, 0);
            LoginWithPhoneActivity loginWithPhoneActivity3 = LoginWithPhoneActivity.this;
            loginWithPhoneActivity3.m47748a(loginWithPhoneActivity3.f27540a0, 0);
            LoginWithPhoneActivity loginWithPhoneActivity4 = LoginWithPhoneActivity.this;
            loginWithPhoneActivity4.m47748a(loginWithPhoneActivity4.f27543d0, 0);
            LoginWithPhoneActivity loginWithPhoneActivity5 = LoginWithPhoneActivity.this;
            loginWithPhoneActivity5.m47747a(loginWithPhoneActivity5.f27533T);
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$d */
    class C10273d implements TextWatcher {
        C10273d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String charSequence2 = charSequence.toString();
            String str = C14069f.f41344H;
            if (charSequence2.startsWith(str)) {
                LoginWithPhoneActivity.this.m47760d(true);
            } else if (charSequence.toString().contains(str)) {
                LoginWithPhoneActivity.this.f27533T.setText(charSequence.toString().replace(str, ""));
            } else if (!LoginWithPhoneActivity.this.f27543d0.getText().toString().trim().equals("+2") && charSequence.toString().startsWith(AppEventsConstants.EVENT_PARAM_VALUE_NO) && charSequence.toString().length() > 10 && !LoginWithPhoneActivity.this.f27551l0.equals(charSequence.toString().substring(0, 5))) {
                LoginWithPhoneActivity.this.f27551l0 = charSequence.toString().substring(0, 5);
                LoginWithPhoneActivity.this.m47760d(false);
            }
            LoginWithPhoneActivity.this.f27533T.setTextSize(2, 16.0f);
            LoginWithPhoneActivity loginWithPhoneActivity = LoginWithPhoneActivity.this;
            loginWithPhoneActivity.m47747a(loginWithPhoneActivity.f27533T);
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$e */
    class C10274e implements Callback<SingInBean> {
        C10274e() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (LoginWithPhoneActivity.this.f27534U != null) {
                    LoginWithPhoneActivity.this.f27534U.mo23492O();
                    LoginWithPhoneActivity.this.f27534U.mo23475F(LoginWithPhoneActivity.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            try {
                if (LoginWithPhoneActivity.this.f27534U != null) {
                    LoginWithPhoneActivity.this.f27534U.mo23492O();
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            LoginWithPhoneActivity.this.m47745U();
                        } else if (LoginWithPhoneActivity.this.f27534U != null) {
                            LoginWithPhoneActivity.this.f27534U.mo23475F(singInBean.getMessage());
                        }
                    } else {
                        if (LoginWithPhoneActivity.this.f27538Y != null) {
                            LoginWithPhoneActivity.this.f27538Y.dismiss();
                        }
                        LoginWithPhoneActivity.this.f27534U.mo23475F(response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$f */
    class C10275f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27561a;

        C10275f(Dialog dialog) {
            this.f27561a = dialog;
        }

        public void onClick(View view) {
            this.f27561a.dismiss();
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$g */
    class C10276g implements Runnable {
        C10276g() {
        }

        public void run() {
            Intent intent = new Intent(LoginWithPhoneActivity.this, ConfirmationOTPActivity.class);
            intent.putExtra("val_cc_phone", LoginWithPhoneActivity.this.f27535V);
            intent.putExtra(C11644i.f33347k7, LoginWithPhoneActivity.this.f27543d0.getText().toString());
            String str = "callFrom";
            if (LoginWithPhoneActivity.this.getIntent() != null && LoginWithPhoneActivity.this.getIntent().hasExtra(str)) {
                String str2 = "EditProfile";
                if (LoginWithPhoneActivity.this.getIntent().getStringExtra(str).equalsIgnoreCase(str2)) {
                    intent.putExtra(str, str2);
                    intent.setFlags(67108864);
                    intent.setFlags(32768);
                    intent.putExtra("user_id", LoginWithPhoneActivity.this.f27536W);
                    intent.putExtra(C11644i.f33067D1, LoginWithPhoneActivity.this.f27537X);
                    LoginWithPhoneActivity.this.startActivity(intent);
                }
            }
            intent.putExtra(str, "Splash");
            intent.setFlags(67108864);
            intent.setFlags(32768);
            intent.putExtra("user_id", LoginWithPhoneActivity.this.f27536W);
            intent.putExtra(C11644i.f33067D1, LoginWithPhoneActivity.this.f27537X);
            LoginWithPhoneActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$h */
    class C10277h implements Callback<SingInBean> {
        C10277h() {
        }

        public void onFailure(Call<SingInBean> call, Throwable th) {
            try {
                if (LoginWithPhoneActivity.this.f27534U != null) {
                    LoginWithPhoneActivity.this.f27534U.mo23475F(LoginWithPhoneActivity.this.getString(C10232R.string.msg_error_server_issue));
                    LoginWithPhoneActivity.this.m47769j(3);
                    C11598a.m52263f().mo39818a(LoginWithPhoneActivity.this.f27535V, LoginWithPhoneActivity.this.f27543d0.getText().toString(), th.getMessage());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<SingInBean> call, Response<SingInBean> response) {
            try {
                if (LoginWithPhoneActivity.this.f27534U != null) {
                    LoginWithPhoneActivity.this.f27534U.mo23492O();
                    if (response.isSuccessful()) {
                        SingInBean singInBean = (SingInBean) response.body();
                        if (singInBean.getCode().intValue() <= 300) {
                            C11598a.m52263f().mo39818a(LoginWithPhoneActivity.this.f27535V, LoginWithPhoneActivity.this.f27543d0.getText().toString(), "");
                            LoginWithPhoneActivity.this.f27536W = singInBean.getIUserId().toString();
                            LoginWithPhoneActivity.this.m47745U();
                            LoginWithPhoneActivity.this.m47769j(2);
                        } else if (LoginWithPhoneActivity.this.f27534U != null) {
                            LoginWithPhoneActivity.this.f27534U.mo23475F(singInBean.getMessage());
                            C11598a.m52263f().mo39818a(LoginWithPhoneActivity.this.f27535V, LoginWithPhoneActivity.this.f27543d0.getText().toString(), singInBean.getMessage());
                            LoginWithPhoneActivity.this.m47769j(3);
                        }
                    } else if (LoginWithPhoneActivity.this.f27534U != null) {
                        LoginWithPhoneActivity.this.m47769j(3);
                        LoginWithPhoneActivity.this.f27534U.mo23475F(response.message());
                        C11598a.m52263f().mo39818a(LoginWithPhoneActivity.this.f27535V, LoginWithPhoneActivity.this.f27543d0.getText().toString(), response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.auth.LoginWithPhoneActivity$i */
    class C10278i implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ TextView f27566a;

        /* renamed from: b */
        final /* synthetic */ int f27567b;

        C10278i(TextView textView, int i) {
            this.f27566a = textView;
            this.f27567b = i;
        }

        public void onGlobalLayout() {
            float f;
            float f2;
            this.f27566a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            Paint paint = new Paint(this.f27566a.getPaint());
            if (this.f27566a.getText().toString().isEmpty()) {
                f = paint.measureText(this.f27566a.getHint().toString());
            } else {
                f = paint.measureText(this.f27566a.getText().toString());
            }
            float width = (float) this.f27566a.getWidth();
            int maxLines = this.f27566a.getMaxLines();
            while (width > 0.0f && f / ((float) maxLines) > width - ((float) (this.f27566a.getCompoundDrawablePadding() + this.f27567b))) {
                float textSize = paint.getTextSize();
                paint.setTextSize(textSize - 1.0f);
                if (this.f27566a.getText().toString().isEmpty()) {
                    f2 = paint.measureText(this.f27566a.getHint().toString());
                } else {
                    f2 = paint.measureText(this.f27566a.getText().toString());
                }
                if (textSize < TypedValue.applyDimension(2, 8.0f, LoginWithPhoneActivity.this.getResources().getDisplayMetrics())) {
                    break;
                }
                f = f2;
            }
            this.f27566a.setTextSize(0, paint.getTextSize());
        }
    }

    /* renamed from: L */
    private void m47736L() {
        HashMap hashMap = new HashMap();
        C5881v C = this.f27534U.mo23468C();
        String str = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str) != null ? this.f27534U.mo23468C().mo23459f(str) : C11644i.f33273c5);
        hashMap.put("vPhone", this.f27535V);
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("vAppVersion", String.valueOf(this.f27534U.mo23633k()));
        hashMap.put("vPlatform", C11644i.f33264b5);
        C5881v C2 = this.f27534U.mo23468C();
        String str2 = C11644i.f33303g;
        if (C2.mo23459f(str2) != null) {
            hashMap.put("latitude", this.f27534U.mo23468C().mo23459f(str2));
            hashMap.put("longitude", this.f27534U.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("vLanguage", this.f27534U.mo23478H());
        hashMap.put("language", String.valueOf(this.f27534U.mo23645o()));
        hashMap.put("device_id", this.f27534U.mo23669w());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignInApi Data: ");
        sb2.append(hashMap);
        C5880q.m25751b(sb2.toString());
        Call SignInApi = C11687c.m52645a(this.f27534U).SignInApi(hashMap);
        m47769j(1);
        SignInApi.enqueue(new C10277h());
    }

    /* renamed from: M */
    private void m47737M() {
        if (this.f27534U.mo23502X() && this.f27534U.mo23502X()) {
            String str = "user_id";
            if (getIntent().hasExtra(str)) {
                this.f27536W = getIntent().getStringExtra(str);
                m47766i(getIntent().getStringExtra(str));
                return;
            }
            m47736L();
        }
    }

    /* renamed from: N */
    private void m47738N() {
        String str;
        if (this.f27543d0.getText() != null && this.f27543d0.getText().toString().trim().length() > 0) {
            String trim = this.f27533T.getText().toString().trim();
            do {
                int length = trim.length();
                str = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                if (length > 1 && trim.startsWith(str)) {
                    trim = trim.substring(1, trim.length());
                }
                if (trim.length() <= 1) {
                    break;
                }
            } while (trim.startsWith(str));
            if (this.f27534U.mo23667v(trim)) {
                String str2 = "+2";
                if (this.f27543d0.getText().toString().trim().equals(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f27543d0.getText());
                    sb.append(str);
                    sb.append(trim);
                    this.f27535V = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f27543d0.getText());
                    sb2.append("");
                    sb2.append(trim);
                    this.f27535V = sb2.toString();
                }
                this.f27534U.mo23494P();
                if (this.f27543d0.getText().toString().trim().equals(str2) && !m47773l(this.f27533T.getText().toString().trim())) {
                    this.f27534U.mo23615f(getString(C10232R.string.alert_enter_number_without_zero_one_two), getResources().getString(C10232R.string.app_name));
                } else if (!this.f27543d0.getText().toString().trim().equals(str2) || m47775m(this.f27533T.getText().toString().trim())) {
                    m47737M();
                } else {
                    this.f27534U.mo23615f(getString(C10232R.string.msg_error_invalide_phone_number), getResources().getString(C10232R.string.app_name));
                }
            } else if (this.f27533T.getText().toString().trim().length() == 0) {
                this.f27534U.mo23475F(getString(C10232R.string.msg_error_blank_phone_number));
            } else {
                this.f27534U.mo23475F(getString(C10232R.string.msg_error_invalide_phone_number));
            }
        } else if (this.f27543d0.getText().toString().trim().length() == 0) {
            this.f27534U.mo23475F(getString(C10232R.string.msg_error_blank_cc));
        } else {
            this.f27534U.mo23475F(getString(C10232R.string.msg_error_invalide_cc));
        }
    }

    /* renamed from: O */
    private void m47739O() {
        m47742R();
        m47771k(getString(C10232R.string.lbl_confirm));
        f27531q0 = this;
        this.f27543d0 = (TextView) findViewById(C10232R.C10236id.txtCC);
        this.f27539Z = (TextView) findViewById(C10232R.C10236id.txtPhoneHeader);
        m47741Q();
        this.f27533T = (EditText) findViewById(C10232R.C10236id.edtPhone);
        this.f27542c0 = (TextView) findViewById(C10232R.C10236id.txtCountry);
        this.f27540a0 = (TextView) findViewById(C10232R.C10236id.txtCountryLabel);
        this.f27541b0 = (TextView) findViewById(C10232R.C10236id.txtPhoneLable);
        this.f27549j0 = findViewById(C10232R.C10236id.llMobileDirection);
        this.f27550k0 = findViewById(C10232R.C10236id.rlMain);
        this.f27542c0.setOnClickListener(this);
        this.f27550k0.setOnClickListener(this);
        m47743S();
        this.f27555p0 = new C11149a(this);
        m47740P();
        this.f27533T.setHint(getString(C10232R.string.hint_phone));
        if (getIntent() != null) {
            String str = "val_country";
            if (getIntent().hasExtra(str)) {
                this.f27542c0.setText(getIntent().getStringExtra(str));
            }
            String str2 = "val_cc";
            if (getIntent().hasExtra(str2)) {
                m47777n(getIntent().getStringExtra(str2));
            }
            String str3 = "val_phone";
            if (getIntent().hasExtra(str3)) {
                this.f27533T.setText(getIntent().getStringExtra(str3));
            }
        }
        this.f27542c0.setOnClickListener(new C10270a());
        this.f27555p0.mo38977a((C11147a) new C10271b());
        if (this.f27534U.mo23496R()) {
            this.f27534U.mo23608d(this.f27542c0);
            this.f27549j0.setLayoutDirection(0);
            this.f27533T.setLayoutDirection(1);
        }
        this.f27542c0.getViewTreeObserver().addOnGlobalLayoutListener(new C10272c());
    }

    /* renamed from: P */
    private void m47740P() {
        C11148a K = C11644i.f33073E ? mo36613K() : mo36612J();
        this.f27542c0.setText(K.mo38972d());
        m47777n(K.mo38968b());
        m47748a(this.f27543d0, 0);
    }

    /* renamed from: Q */
    private void m47741Q() {
        if (getIntent() != null && getIntent().hasExtra(C11644i.f33324i2) && getIntent().getStringExtra(C11644i.f33324i2).equalsIgnoreCase("EditProfile")) {
            this.f27539Z.setText(getString(C10232R.string.lbl_title_change_phone_number));
        }
    }

    /* renamed from: R */
    private void m47742R() {
        this.f27545f0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27545f0.setText(getString(C10232R.string.title_confirm_mobile_number));
        this.f27546g0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f27546g0.setOnClickListener(this);
    }

    /* renamed from: S */
    private void m47743S() {
        this.f27533T.addTextChangedListener(new C10273d());
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m47744T() {
        startActivityForResult(new Intent(this, CountryPickerActivity.class), 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m47745U() {
        new Handler().postDelayed(new C10276g(), 200);
    }

    /* renamed from: J */
    public C11148a mo36612J() {
        this.f27555p0.mo38975a((Context) this);
        C11148a aVar = new C11148a();
        aVar.mo38967a("IN");
        aVar.mo38971c(getString(C10232R.string.lbl_country_india));
        aVar.mo38969b("+91");
        aVar.mo38966a((int) C10232R.C10235drawable.flag_in);
        return aVar;
    }

    /* renamed from: K */
    public C11148a mo36613K() {
        C11148a a = this.f27555p0.mo38975a((Context) this);
        StringBuilder sb = new StringBuilder();
        sb.append("getUserCountryInfo country");
        sb.append(a.mo38972d());
        C5880q.m25753d(sb.toString());
        if (a.mo38965a().equalsIgnoreCase("AF")) {
            C11148a aVar = new C11148a();
            aVar.mo38967a("SAR");
            aVar.mo38971c(getString(C10232R.string.lbl_country_saudi_arabia));
            aVar.mo38969b("+966");
            aVar.mo38966a((int) C10232R.C10235drawable.flag_sa);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getUserCountryInfo AF");
            sb2.append(a.mo38972d());
            C5880q.m25753d(sb2.toString());
            return aVar;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("getUserCountryInfo SIM");
        sb3.append(a.mo38972d());
        C5880q.m25753d(sb3.toString());
        return a;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            String stringExtra = intent.getStringExtra(C11644i.f33132L2);
            intent.getStringExtra(C11644i.f33140M2);
            String stringExtra2 = intent.getStringExtra(C11644i.f33148N2);
            intent.getIntExtra(C11644i.f33156O2, 0);
            this.f27542c0.setTextSize(2, 16.0f);
            this.f27543d0.setTextSize(2, 16.0f);
            this.f27551l0 = "";
            m47777n(stringExtra2);
            this.f27542c0.setText(stringExtra);
            InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
            this.f27533T.requestFocus();
            inputMethodManager.showSoftInput(this.f27533T, 2);
            EditText editText = this.f27533T;
            editText.setSelection(editText.getText().length());
            m47748a(this.f27542c0, this.f27554o0);
            m47748a(this.f27543d0, 0);
        }
    }

    public void onClick(View view) {
        if (view.equals(this.f27550k0)) {
            m47738N();
        } else if (view.equals(this.f27546g0)) {
            onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo36614a(getApplicationContext(), new Configuration(configuration));
    }

    /* access modifiers changed from: protected */
    @RequiresApi(api = 21)
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_login_with_phone_new);
        this.f27534U = new C5887x(this);
        C5887x xVar = this.f27534U;
        xVar.mo23477G(xVar.mo23470D().mo23460g("language"));
        this.f27553n0 = getIntent().getExtras();
        Bundle bundle2 = this.f27553n0;
        if (bundle2 != null && bundle2.containsKey(C11644i.f33067D1)) {
            this.f27537X = this.f27553n0.getString(C11644i.f33067D1);
        }
        m47739O();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f27552m0 == 2) {
            m47769j(3);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m47760d(boolean z) {
        String str;
        String trim = this.f27533T.getText().toString().trim();
        String str2 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        int i = 1;
        String str3 = "";
        String str4 = str3;
        if (!z) {
            do {
                if (trim.length() > 1 && trim.startsWith(str2)) {
                    trim = trim.substring(1, trim.length());
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(str2);
                    str4 = sb.toString();
                }
                if (trim.length() <= 1) {
                    break;
                }
            } while (trim.startsWith(str2));
        }
        int length = trim.length();
        int i2 = 4;
        int i3 = 3;
        String str5 = C14069f.f41344H;
        if (length >= 4) {
            C11149a aVar = this.f27555p0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z ? str3 : str5);
            if (!z) {
                i2 = 3;
            }
            sb2.append(trim.substring(0, i2));
            str = aVar.mo38976a(sb2.toString());
        } else {
            str = str3;
        }
        if (trim.length() >= 3 && str.equals(str3)) {
            C11149a aVar2 = this.f27555p0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(z ? str3 : str5);
            if (!z) {
                i3 = 2;
            }
            sb3.append(trim.substring(0, i3));
            str = aVar2.mo38976a(sb3.toString());
        }
        if (trim.length() >= 2 && str.equals(str3)) {
            C11149a aVar3 = this.f27555p0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z ? str3 : str5);
            if (z) {
                i = 2;
            }
            sb4.append(trim.substring(0, i));
            str = aVar3.mo38976a(sb4.toString());
        }
        if (!str.equals(str3) && !this.f27543d0.getText().toString().trim().equals("+2")) {
            if (z) {
                EditText editText = this.f27533T;
                editText.setText(editText.getText().toString().trim().replace(str, str3));
            } else {
                EditText editText2 = this.f27533T;
                String trim2 = editText2.getText().toString().trim();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str4);
                sb5.append(str.replace(str5, str3));
                editText2.setText(trim2.replace(sb5.toString(), str3));
            }
            if (str.equals("+20")) {
                EditText editText3 = this.f27533T;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(this.f27533T.getText().toString().trim());
                editText3.setText(sb6.toString());
            }
            this.f27555p0.mo38978b(str);
        }
    }

    /* renamed from: i */
    private void m47766i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("current_user_id", this.f27534U.mo23476G());
        hashMap.put("vPhone", this.f27535V);
        C5881v C = this.f27534U.mo23468C();
        String str2 = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str2) != null ? this.f27534U.mo23468C().mo23459f(str2) : C11644i.f33273c5);
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("vAppVersion", String.valueOf(this.f27534U.mo23633k()));
        hashMap.put("vPlatform", C11644i.f33264b5);
        hashMap.put("vLanguage", this.f27534U.mo23478H());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        sb2.append(this.f27534U.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("auth_token", sb2.toString());
        C5881v C2 = this.f27534U.mo23468C();
        String str3 = C11644i.f33303g;
        if (C2.mo23459f(str3) != null) {
            hashMap.put("latitude", this.f27534U.mo23468C().mo23459f(str3));
            hashMap.put("longitude", this.f27534U.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("device_id", this.f27534U.mo23669w());
        Call SignInSocialMediaApi = C11687c.m52645a(null).SignInSocialMediaApi(str, hashMap);
        this.f27534U.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        SignInSocialMediaApi.enqueue(new C10274e());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m47769j(int i) {
        this.f27552m0 = i;
        if (i == 1) {
            this.f27544e0.setText("");
            this.f27550k0.setClickable(false);
            this.f27542c0.setClickable(false);
            this.f27547h0.setVisibility(0);
            this.f27548i0.setVisibility(8);
        } else if (i == 2) {
            this.f27542c0.setClickable(false);
            this.f27550k0.setClickable(false);
            this.f27547h0.setVisibility(8);
            this.f27548i0.setVisibility(0);
        } else if (i == 3) {
            this.f27544e0.setText(getString(C10232R.string.lbl_confirm));
            this.f27542c0.setClickable(true);
            this.f27550k0.setClickable(true);
            this.f27547h0.setVisibility(8);
            this.f27548i0.setVisibility(8);
        }
    }

    /* renamed from: k */
    private void m47771k(String str) {
        this.f27547h0 = (ProgressBar) findViewById(C10232R.C10236id.pbAPI);
        this.f27548i0 = (ImageView) findViewById(C10232R.C10236id.imgStatus);
        this.f27544e0 = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f27547h0.setVisibility(8);
        this.f27548i0.setVisibility(8);
        this.f27544e0.setVisibility(0);
        this.f27544e0.setText(str);
    }

    /* renamed from: l */
    private boolean m47773l(String str) {
        return str.charAt(0) == '0' && str.charAt(1) == '1' && (str.charAt(2) == '0' || str.charAt(2) == '1' || str.charAt(2) == '2' || str.charAt(2) == '5');
    }

    /* renamed from: m */
    private boolean m47775m(String str) {
        return str.length() == 11;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m47777n(String str) {
        if (str == null) {
            this.f27543d0.setText("");
        } else if (str.equals("+20")) {
            this.f27543d0.setText("+2");
        } else {
            this.f27543d0.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo36616c(boolean z) {
        if (z) {
            getWindow().addFlags(67108864);
        } else {
            getWindow().clearFlags(67108864);
        }
    }

    /* renamed from: b */
    public void mo36615b(String str, String str2) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_show_ok);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str);
        textView2.setText(str2);
        textView.setOnClickListener(new C10275f(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: a */
    public void mo36614a(Context context, Configuration configuration) {
        boolean z;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (configuration.fontScale != 1.0f) {
            this.f27534U.mo23468C().mo23446a(C11644i.f33220W2, configuration.fontScale);
            configuration.fontScale = 1.0f;
            z = true;
        } else {
            z = false;
        }
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        if (configuration.densityDpi != ((int) getResources().getDisplayMetrics().xdpi)) {
            this.f27534U.mo23468C().mo23446a(C11644i.f33236Y2, displayMetrics.scaledDensity);
            this.f27534U.mo23468C().mo23447a(C11644i.f33228X2, displayMetrics.densityDpi);
            displayMetrics.scaledDensity = configuration.fontScale * displayMetrics.density;
            configuration.densityDpi = (int) getResources().getDisplayMetrics().xdpi;
            z = true;
        }
        if (z) {
            getBaseContext().getResources().updateConfiguration(configuration, displayMetrics);
        }
    }

    /* renamed from: j */
    private JSONObject m47768j(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mobile number", this.f27535V);
            jSONObject.put("country code", this.f27543d0.getText().toString());
            jSONObject.put("error ", str);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47748a(TextView textView, int i) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C10278i(textView, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47747a(EditText editText) {
        float f;
        float f2;
        Paint paint = new Paint(editText.getPaint());
        if (editText.getText().toString().isEmpty()) {
            f = paint.measureText(editText.getHint().toString());
        } else {
            f = paint.measureText(editText.getText().toString());
        }
        float width = (float) editText.getWidth();
        int maxLines = editText.getMaxLines();
        while (width > 0.0f && f / ((float) maxLines) > (width - ((float) editText.getPaddingStart())) - ((float) editText.getPaddingEnd())) {
            float textSize = paint.getTextSize();
            paint.setTextSize(textSize - 1.0f);
            if (editText.getText().toString().isEmpty()) {
                f2 = paint.measureText(editText.getHint().toString());
            } else {
                f2 = paint.measureText(editText.getText().toString());
            }
            if (textSize < TypedValue.applyDimension(2, 8.0f, getResources().getDisplayMetrics())) {
                break;
            }
            f = f2;
        }
        editText.setTextSize(0, paint.getTextSize());
    }
}
