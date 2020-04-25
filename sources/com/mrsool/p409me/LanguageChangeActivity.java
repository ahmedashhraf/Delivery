package com.mrsool.p409me;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.C11137q;
import com.mrsool.HomeActivity;
import com.mrsool.bean.ChangeLanguage;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.LanguageChangeActivity */
public class LanguageChangeActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private RelativeLayout f29806S;

    /* renamed from: T */
    private RelativeLayout f29807T;

    /* renamed from: U */
    private ImageView f29808U;

    /* renamed from: V */
    private ImageView f29809V;

    /* renamed from: W */
    private ImageView f29810W;

    /* renamed from: X */
    private TextView f29811X;

    /* renamed from: Y */
    private TextView f29812Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ProgressBar f29813Z;

    /* renamed from: com.mrsool.me.LanguageChangeActivity$a */
    class C10853a implements C11137q {

        /* renamed from: a */
        final /* synthetic */ String f29814a;

        C10853a(String str) {
            this.f29814a = str;
        }

        /* renamed from: a */
        public void mo38480a() {
        }

        /* renamed from: b */
        public void mo38481b() {
            LanguageChangeActivity.this.m49691i(this.f29814a);
        }
    }

    /* renamed from: com.mrsool.me.LanguageChangeActivity$b */
    class C10854b implements Callback<ChangeLanguage> {

        /* renamed from: a */
        final /* synthetic */ String f29816a;

        C10854b(String str) {
            this.f29816a = str;
        }

        public void onFailure(Call<ChangeLanguage> call, Throwable th) {
            try {
                if (LanguageChangeActivity.this.f29642a != null) {
                    LanguageChangeActivity.this.f29642a.mo23492O();
                    LanguageChangeActivity.this.f29813Z.setVisibility(8);
                    LanguageChangeActivity.this.f29642a.mo23615f(LanguageChangeActivity.this.getString(C10232R.string.msg_error_server_issue), LanguageChangeActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<ChangeLanguage> call, Response<ChangeLanguage> response) {
            String str = "language";
            try {
                if (LanguageChangeActivity.this.f29642a != null) {
                    LanguageChangeActivity.this.f29642a.mo23492O();
                    LanguageChangeActivity.this.f29813Z.setVisibility(8);
                    if (!response.isSuccessful()) {
                        LanguageChangeActivity.this.f29642a.mo23487L(response.message());
                    } else if (((ChangeLanguage) response.body()).getCode().intValue() <= 300) {
                        LanguageChangeActivity.this.m49693k(this.f29816a);
                        ChangeLanguage changeLanguage = (ChangeLanguage) response.body();
                        LanguageChangeActivity.this.f29642a.mo23468C().mo23449a(str, changeLanguage.getVLanguage());
                        LanguageChangeActivity.this.f29642a.mo23468C().mo23454b(str, changeLanguage.getVLanguage());
                        LanguageChangeActivity.this.f29642a.mo23477G(changeLanguage.getVLanguage());
                        LanguageChangeActivity.this.mo38478J();
                    } else {
                        LanguageChangeActivity.this.f29642a.mo23487L(((ChangeLanguage) response.body()).getMessage());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: K */
    private void m49686K() {
        m49687L();
        this.f29806S = (RelativeLayout) findViewById(C10232R.C10236id.llLanChngEnglish);
        this.f29807T = (RelativeLayout) findViewById(C10232R.C10236id.llLanChngArabic);
        this.f29806S.setOnClickListener(this);
        this.f29807T.setOnClickListener(this);
        this.f29811X = (TextView) findViewById(C10232R.C10236id.tvEngLbl);
        this.f29812Y = (TextView) findViewById(C10232R.C10236id.tvArLbl);
        this.f29813Z = (ProgressBar) findViewById(C10232R.C10236id.pgLanChange);
        this.f29808U = (ImageView) findViewById(C10232R.C10236id.imgLanChngEnglish);
        this.f29809V = (ImageView) findViewById(C10232R.C10236id.imgLanChngArabic);
        this.f29640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29640Q.setText(getResources().getString(C10232R.string.lbl_lan_change));
        String str = "language";
        if (this.f29642a.mo23470D().mo23460g(str) == null) {
            this.f29808U.setVisibility(8);
            this.f29809V.setVisibility(8);
        } else if (this.f29642a.mo23470D().mo23460g(str).equalsIgnoreCase(C11644i.f33191S5)) {
            this.f29809V.setVisibility(0);
            this.f29808U.setVisibility(8);
            this.f29811X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
            this.f29812Y.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
        } else if (this.f29642a.mo23470D().mo23460g(str).equalsIgnoreCase(C11644i.f33183R5)) {
            this.f29808U.setVisibility(0);
            this.f29809V.setVisibility(8);
            this.f29811X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            this.f29812Y.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
        } else {
            this.f29808U.setVisibility(8);
            this.f29809V.setVisibility(8);
        }
    }

    /* renamed from: L */
    private void m49687L() {
        this.f29810W = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29810W.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f29810W.setScaleX(-1.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m49691i(String str) {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            String str2 = "user_id";
            hashMap.put("iUserId", String.valueOf(this.f29642a.mo23468C().mo23459f(str2)));
            hashMap.put("vLanguage", String.valueOf(str));
            C11687c.m52645a(this.f29642a).ChangeLanguage(String.valueOf(this.f29642a.mo23468C().mo23459f(str2)), hashMap).enqueue(new C10854b(str));
        }
    }

    /* renamed from: j */
    private void m49692j(String str) {
        mo38409a(getString(C10232R.string.msg_change_language), getString(C10232R.string.app_name), (C11137q) new C10853a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m49693k(String str) {
        if (str.equalsIgnoreCase(C11644i.f33183R5)) {
            this.f29809V.setVisibility(8);
            this.f29808U.setVisibility(0);
            this.f29811X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            this.f29812Y.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
        } else if (str.equalsIgnoreCase(C11644i.f33191S5)) {
            this.f29809V.setVisibility(0);
            this.f29808U.setVisibility(8);
            this.f29811X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            this.f29812Y.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
        }
    }

    /* renamed from: J */
    public void mo38478J() {
        this.f29642a.mo23530a();
        Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.addFlags(32768);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.imgClose) {
            onBackPressed();
        } else if (id != C10232R.C10236id.llLanChngArabic) {
            if (id == C10232R.C10236id.llLanChngEnglish && this.f29808U.getVisibility() != 0) {
                m49692j(C11644i.f33183R5);
            }
        } else if (this.f29809V.getVisibility() != 0) {
            m49692j(C11644i.f33191S5);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_language_change);
        m49686K();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }
}
