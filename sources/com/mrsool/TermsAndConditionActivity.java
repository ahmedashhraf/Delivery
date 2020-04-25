package com.mrsool;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0295d;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.mrsool.bean.UpdateInfoBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TermsAndConditionActivity extends C0295d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TextView f27448N;

    /* renamed from: O */
    private View f27449O;

    /* renamed from: P */
    private WebView f27450P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C5887x f27451Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ProgressBar f27452R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ProgressBar f27453S;

    /* renamed from: T */
    private String f27454T = "";

    /* renamed from: a */
    private TextView f27455a;

    /* renamed from: b */
    private View f27456b;

    /* renamed from: com.mrsool.TermsAndConditionActivity$a */
    class C10250a extends WebViewClient {
        C10250a() {
        }

        public void onPageFinished(WebView webView, String str) {
            TermsAndConditionActivity.this.f27453S.setVisibility(8);
            if (TermsAndConditionActivity.this.f27451Q.mo23496R()) {
                TermsAndConditionActivity.this.f27451Q.mo23477G(C11644i.f33191S5);
            } else {
                TermsAndConditionActivity.this.f27451Q.mo23477G(C11644i.f33183R5);
            }
            TermsAndConditionActivity.this.f27448N.setText(TermsAndConditionActivity.this.getString(C10232R.string.lbl_agree));
            TermsAndConditionActivity.this.f27448N.setVisibility(0);
        }
    }

    /* renamed from: com.mrsool.TermsAndConditionActivity$b */
    class C10251b implements Callback<UpdateInfoBean> {
        C10251b() {
        }

        public void onFailure(Call<UpdateInfoBean> call, Throwable th) {
            try {
                if (TermsAndConditionActivity.this.f27451Q != null) {
                    TermsAndConditionActivity.this.f27451Q.mo23492O();
                    TermsAndConditionActivity.this.f27452R.setVisibility(0);
                    TermsAndConditionActivity.this.f27451Q.mo23591c((Context) TermsAndConditionActivity.this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateInfoBean> call, Response<UpdateInfoBean> response) {
            try {
                if (TermsAndConditionActivity.this.f27451Q != null) {
                    TermsAndConditionActivity.this.f27452R.setVisibility(0);
                    TermsAndConditionActivity.this.f27451Q.mo23492O();
                    if (response.isSuccessful()) {
                        if (((UpdateInfoBean) response.body()).getCode() <= 300) {
                            UpdateInfoBean updateInfoBean = (UpdateInfoBean) response.body();
                            TermsAndConditionActivity.this.f27451Q.mo23468C().mo23448a("isupdated", Boolean.valueOf(true));
                            TermsAndConditionActivity.this.f27451Q.mo23468C().mo23448a(C11644i.f33282d5, Boolean.valueOf(updateInfoBean.isTerms_accepted()));
                            TermsAndConditionActivity.this.f27451Q.mo23468C().mo23447a(C11644i.f33291e5, updateInfoBean.getCurrent_terms_version());
                            if (TermsAndConditionActivity.this.m47658G()) {
                                TermsAndConditionActivity.this.setResult(-1);
                            }
                            TermsAndConditionActivity.this.finish();
                        }
                    } else if (TermsAndConditionActivity.this.f27451Q != null) {
                        TermsAndConditionActivity.this.f27451Q.mo23576b((Context) TermsAndConditionActivity.this, response.message());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: C */
    private void m47655C() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f27451Q.mo23468C().mo23459f("user_id"));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(C3868i.f12248b);
        sb.append(Build.MODEL);
        hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
        hashMap.put("vOSVersion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("vPlatform", C11644i.f33264b5);
        hashMap.put("vAppVersion", String.valueOf(this.f27451Q.mo23633k()));
        C5881v C = this.f27451Q.mo23468C();
        String str = C11644i.f33419t5;
        hashMap.put("vDeviceToken", C.mo23459f(str) != null ? this.f27451Q.mo23468C().mo23459f(str) : C11644i.f33273c5);
        hashMap.put("vLanguage", this.f27451Q.mo23478H());
        hashMap.put("iTermsVersion", String.valueOf(this.f27451Q.mo23468C().mo23457d(C11644i.f33291e5)));
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        sb2.append(str2);
        sb2.append(C5887x.m25816e((Context) this));
        hashMap.put("inst_package_name", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(C5887x.m25813d((Context) this));
        hashMap.put("app_sign", sb3.toString());
        C5881v C2 = this.f27451Q.mo23468C();
        String str3 = C11644i.f33303g;
        if (C2.mo23459f(str3) != null) {
            hashMap.put("latitude", this.f27451Q.mo23468C().mo23459f(str3));
            hashMap.put("longitude", this.f27451Q.mo23468C().mo23459f(C11644i.f33312h));
        }
        hashMap.put("device_id", this.f27451Q.mo23669w());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("UpdateDeviceInfo()==>");
        sb4.append(hashMap);
        C5880q.m25751b(sb4.toString());
        C11687c.m52645a(this.f27451Q).UpdateDeviceInfo(hashMap).enqueue(new C10251b());
    }

    /* renamed from: D */
    private void m47656D() {
        this.f27451Q = new C5887x(this);
        if (this.f27451Q.mo23496R()) {
            this.f27451Q.mo23477G(C11644i.f33191S5);
        } else {
            this.f27451Q.mo23477G(C11644i.f33183R5);
        }
        this.f27455a = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27448N = (TextView) findViewById(C10232R.C10236id.btnAgree);
        this.f27453S = (ProgressBar) findViewById(C10232R.C10236id.pbAPI);
        this.f27455a.setText(getIntent().getExtras().getString(C11644i.f33391q1));
        this.f27452R = new ProgressBar(this);
        if (this.f27451Q.mo23502X()) {
            this.f27450P = (WebView) findViewById(C10232R.C10236id.wvTermsAndService);
            this.f27450P.getSettings().setJavaScriptEnabled(true);
            this.f27450P.setScrollBarStyle(MediaHttpDownloader.f20486j);
            this.f27450P.loadUrl(getIntent().getExtras().getString(C11644i.f33383p1));
            this.f27453S.setVisibility(0);
            this.f27450P.setWebViewClient(new C10250a());
            this.f27452R.setVisibility(0);
        }
        this.f27448N.setOnClickListener(this);
    }

    /* renamed from: E */
    private void m47657E() {
        this.f27455a = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f27455a.setText(getString(C10232R.string.lbl_terms_condition));
        this.f27456b = findViewById(C10232R.C10236id.viewActionBack);
        this.f27456b.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public boolean m47658G() {
        return (!TextUtils.isEmpty(this.f27454T) && this.f27454T.equalsIgnoreCase(C11644i.f33376o2)) || (C11644i.f33453y && !TextUtils.isEmpty(this.f27454T) && this.f27454T.equalsIgnoreCase(C11644i.f33384p2));
    }

    public void onBackPressed() {
    }

    public void onClick(View view) {
        if (view.equals(this.f27448N)) {
            this.f27452R.setVisibility(0);
            m47655C();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_terms_and_condition_new);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(C11644i.f33067D1)) {
            this.f27454T = extras.getString(C11644i.f33067D1, "");
        }
        m47657E();
        m47656D();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f27451Q;
        if (xVar != null && xVar.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
            this.f27451Q.mo23626i();
        }
    }
}
