package com.mrsool.p409me;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.StartActivityNew;
import com.mrsool.bean.ComplaintTokenBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.chat.AdvanceWebviewActivity;
import com.mrsool.complaint.MyFiledCOmplaint;
import com.mrsool.p423v.C11730j;
import com.mrsool.stickers.StickersActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.SettingsActivity */
public class SettingsActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private C11669t f29871S;

    /* renamed from: T */
    private LinearLayout f29872T;

    /* renamed from: U */
    private LinearLayout f29873U;

    /* renamed from: V */
    private LinearLayout f29874V;

    /* renamed from: W */
    private LinearLayout f29875W;

    /* renamed from: X */
    private LinearLayout f29876X;

    /* renamed from: Y */
    private LinearLayout f29877Y;

    /* renamed from: Z */
    private LinearLayout f29878Z;

    /* renamed from: a0 */
    private LinearLayout f29879a0;

    /* renamed from: b0 */
    private LinearLayout f29880b0;

    /* renamed from: c0 */
    private LinearLayout f29881c0;

    /* renamed from: d0 */
    private LinearLayout f29882d0;

    /* renamed from: e0 */
    private LinearLayout f29883e0;

    /* renamed from: f0 */
    private LinearLayout f29884f0;

    /* renamed from: g0 */
    private LinearLayout f29885g0;

    /* renamed from: h0 */
    private TextView f29886h0;

    /* renamed from: i0 */
    private TextView f29887i0;

    /* renamed from: j0 */
    private TextView f29888j0;

    /* renamed from: k0 */
    private TextView f29889k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public UserDetail f29890l0;

    /* renamed from: m0 */
    private ImageView f29891m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public String f29892n0 = null;

    /* renamed from: o0 */
    private String f29893o0 = "halalahewallet://Transaction?terminal=512345677&amount=0.20&referenceNo=MRSL_15480520&billNo=MRSL_15480520&memo=TestTransaction&callback=mrsool://open";

    /* renamed from: p0 */
    private BroadcastReceiver f29894p0 = new C10875c();

    /* renamed from: com.mrsool.me.SettingsActivity$a */
    class C10873a implements C11673d {
        C10873a() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            String str = C11644i.f33111I5;
            try {
                Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
                intent.putExtra("android.intent.extra.ringtone.TYPE", 2);
                intent.putExtra("android.intent.extra.ringtone.TITLE", SettingsActivity.this.getString(C10232R.string.lbl_select_tone));
                intent.addFlags(1);
                String str2 = "android.intent.extra.ringtone.EXISTING_URI";
                if (TextUtils.isEmpty(SettingsActivity.this.f29642a.mo23468C().mo23459f(str))) {
                    intent.putExtra(str2, RingtoneManager.getDefaultUri(2));
                } else {
                    intent.putExtra(str2, Uri.parse(SettingsActivity.this.f29642a.mo23468C().mo23459f(str)));
                }
                SettingsActivity.this.startActivityForResult(intent, 1005);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.SettingsActivity$b */
    class C10874b implements Callback<UserDetail> {
        C10874b() {
        }

        public void onFailure(Call<UserDetail> call, Throwable th) {
            try {
                if (SettingsActivity.this.f29642a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("callGetUserDetailAPI");
                    sb.append(th.getMessage());
                    C5880q.m25753d(sb.toString());
                    SettingsActivity.this.f29642a.mo23615f(SettingsActivity.this.getString(C10232R.string.msg_error_server_issue), SettingsActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UserDetail> call, Response<UserDetail> response) {
            try {
                if (SettingsActivity.this.f29642a == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    SettingsActivity.this.f29890l0 = (UserDetail) response.body();
                    SettingsActivity.this.f29892n0 = SettingsActivity.this.f29890l0.getUser().getVProfilePic();
                } else if (response.code() == 401) {
                    SettingsActivity.this.f29642a.mo23613e0();
                } else if (SettingsActivity.this.f29642a != null) {
                    SettingsActivity.this.f29642a.mo23615f(response.message(), SettingsActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.SettingsActivity$c */
    class C10875c extends BroadcastReceiver {
        C10875c() {
        }

        public void onReceive(Context context, Intent intent) {
            intent.getAction().equalsIgnoreCase(C11644i.f33308g4);
        }
    }

    /* renamed from: com.mrsool.me.SettingsActivity$d */
    class C10876d implements Callback<ComplaintTokenBean> {
        C10876d() {
        }

        public void onFailure(Call<ComplaintTokenBean> call, Throwable th) {
            if (!SettingsActivity.this.isFinishing()) {
                C5887x xVar = SettingsActivity.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ComplaintTokenBean> call, Response<ComplaintTokenBean> response) {
            try {
                SettingsActivity.this.f29642a.mo23492O();
                if (!response.isSuccessful()) {
                    SettingsActivity.this.f29642a.mo23487L(response.message());
                } else if (((ComplaintTokenBean) response.body()).getCode().intValue() > 300) {
                    SettingsActivity.this.f29642a.mo23487L(((ComplaintTokenBean) response.body()).getMessage());
                } else if (!TextUtils.isEmpty(((ComplaintTokenBean) response.body()).getToken())) {
                    Intent intent = new Intent(SettingsActivity.this, AdvanceWebviewActivity.class);
                    intent.putExtra(C11644i.f33391q1, SettingsActivity.this.getResources().getString(C10232R.string.lbl_my_filed_complaint));
                    intent.putExtra(C11644i.f33383p1, SettingsActivity.this.m49759i(((ComplaintTokenBean) response.body()).getToken()));
                    SettingsActivity.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: J */
    private void m49743J() {
        C11687c.m52645a(this.f29642a).getUserDetail(String.valueOf(this.f29642a.mo23468C().mo23459f("user_id"))).enqueue(new C10874b());
    }

    /* renamed from: K */
    private void m49744K() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).getCourierWeblinkToken(this.f29642a.mo23476G(), hashMap).enqueue(new C10876d());
        }
    }

    /* renamed from: L */
    private void m49745L() {
        this.f29871S = new C11669t(this);
        this.f29891m0.setOnClickListener(this);
        m49749P();
        this.f29889k0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29889k0.setText(getResources().getText(C10232R.string.lbl_settings));
        this.f29872T = (LinearLayout) findViewById(C10232R.C10236id.llWhatsAppSticker);
        this.f29873U = (LinearLayout) findViewById(C10232R.C10236id.llSettingEditProfile);
        this.f29874V = (LinearLayout) findViewById(C10232R.C10236id.llSettingLanguageSetting);
        this.f29875W = (LinearLayout) findViewById(C10232R.C10236id.llSettingMyFiledComaplaints);
        this.f29876X = (LinearLayout) findViewById(C10232R.C10236id.llSettingTermsCondition);
        this.f29877Y = (LinearLayout) findViewById(C10232R.C10236id.llSettingRateUs);
        this.f29878Z = (LinearLayout) findViewById(C10232R.C10236id.llAppTour);
        this.f29879a0 = (LinearLayout) findViewById(C10232R.C10236id.llSettingPrivacyPolicy);
        this.f29880b0 = (LinearLayout) findViewById(C10232R.C10236id.llBecomeMarsooler);
        this.f29881c0 = (LinearLayout) findViewById(C10232R.C10236id.llnotificationtone);
        this.f29885g0 = (LinearLayout) findViewById(C10232R.C10236id.llSettingIban);
        this.f29885g0.setOnClickListener(this);
        this.f29881c0.setOnClickListener(this);
        this.f29888j0 = (TextView) findViewById(C10232R.C10236id.tvVersion);
        this.f29883e0 = (LinearLayout) findViewById(C10232R.C10236id.llCourierSettings);
        this.f29884f0 = (LinearLayout) findViewById(C10232R.C10236id.llPaymentCollection);
        this.f29884f0.setOnClickListener(this);
        this.f29887i0 = (TextView) findViewById(C10232R.C10236id.tvNotificationToneName);
        this.f29873U.setOnClickListener(this);
        this.f29874V.setOnClickListener(this);
        this.f29876X.setOnClickListener(this);
        this.f29877Y.setOnClickListener(this);
        this.f29875W.setOnClickListener(this);
        this.f29878Z.setOnClickListener(this);
        this.f29879a0.setOnClickListener(this);
        this.f29880b0.setOnClickListener(this);
        this.f29872T.setOnClickListener(this);
        this.f29886h0 = (TextView) findViewById(C10232R.C10236id.tvResolved);
        m49748O();
        this.f29642a.mo23540a(this.f29894p0, C11644i.f33317h4);
        m49747N();
        this.f29888j0.setText(String.format(getResources().getString(C10232R.string.lbl_version), new Object[]{this.f29642a.mo23636l()}));
        m49752S();
    }

    /* renamed from: M */
    private void m49746M() {
        if (this.f29642a.mo23502X() && this.f29642a.mo23497S()) {
            Intent intent = new Intent(this, AdvanceWebviewActivity.class);
            intent.putExtra(C11644i.f33391q1, getResources().getString(C10232R.string.payment_method_registration));
            intent.putExtra(C11644i.f33383p1, C5887x.m25820z0());
            startActivity(intent);
        }
    }

    /* renamed from: N */
    private void m49747N() {
        C5881v C = this.f29642a.mo23468C();
        String str = C11644i.f33119J5;
        if (!TextUtils.isEmpty(C.mo23459f(str))) {
            this.f29887i0.setText(this.f29642a.mo23468C().mo23459f(str));
        } else {
            this.f29887i0.setText(C10232R.string.lbl_default);
        }
    }

    /* renamed from: O */
    private void m49748O() {
        UserDetail userDetail = C11644i.f33072D6;
        if (userDetail == null || userDetail.getUser().getResolved_complaint_count() <= 0) {
            this.f29886h0.setVisibility(8);
            return;
        }
        this.f29886h0.setVisibility(0);
        TextView textView = this.f29886h0;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(C11644i.f33072D6.getUser().getResolved_complaint_count());
        sb.append(C3868i.f12248b);
        sb.append(getResources().getString(C10232R.string.lbl_resolved));
        textView.setText(sb.toString());
    }

    /* renamed from: P */
    private void m49749P() {
        this.f29642a.mo23561a((ImageView) findViewById(C10232R.C10236id.ivArwMfc), (ImageView) findViewById(C10232R.C10236id.ivArwEp), (ImageView) findViewById(C10232R.C10236id.ivArwLs), (ImageView) findViewById(C10232R.C10236id.ivArwTos), (ImageView) findViewById(C10232R.C10236id.ivArwPP), (ImageView) findViewById(C10232R.C10236id.ivArwRA), (ImageView) findViewById(C10232R.C10236id.ivArwWs), (ImageView) findViewById(C10232R.C10236id.ivArwPc), (ImageView) findViewById(C10232R.C10236id.ivArwAt), (ImageView) findViewById(C10232R.C10236id.ivArwBm), (ImageView) findViewById(C10232R.C10236id.ivArwNft), (ImageView) findViewById(C10232R.C10236id.ivArwIban));
    }

    /* renamed from: Q */
    private void m49750Q() {
        this.f29882d0 = (LinearLayout) findViewById(C10232R.C10236id.llContainerMain);
        this.f29891m0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        if (this.f29642a.mo23496R()) {
            this.f29891m0.setScaleX(-1.0f);
        }
    }

    /* renamed from: R */
    private void m49751R() {
        try {
            this.f29885g0.setVisibility(C11644i.f33072D6.getUser().getIs_courier().booleanValue() ? 0 : 8);
        } catch (Exception unused) {
            this.f29885g0.setVisibility(8);
        }
    }

    /* renamed from: S */
    private void m49752S() {
        UserDetail userDetail = C11644i.f33072D6;
        if (userDetail == null || userDetail.getUser() == null || !C11644i.f33072D6.getUser().getIs_courier().booleanValue()) {
            m49758c(false);
        } else {
            m49758c(true);
        }
    }

    /* renamed from: c */
    private void m49758c(boolean z) {
        if (z) {
            this.f29883e0.setVisibility(0);
            this.f29885g0.setVisibility(0);
            return;
        }
        this.f29883e0.setVisibility(8);
        this.f29885g0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m49759i(String str) {
        if (C5887x.m25786E0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("https://forms.staging.mrsool.co/courier_filed_complaints?token=");
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("https://forms.mrsool.co/courier_filed_complaints?token=");
        sb2.append(str);
        return sb2.toString();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i != 999) {
            if (i == 1005) {
                m49756a(intent);
            }
        } else if (intent.getExtras().getBoolean("isProfileChange") && this.f29642a.mo23502X()) {
            m49743J();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        String str = "android.intent.action.VIEW";
        switch (view.getId()) {
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.llAppTour /*2131362961*/:
                if (this.f29642a.mo23497S()) {
                    Intent intent = new Intent(this, StartActivityNew.class);
                    intent.putExtra("isFromSplash", false);
                    startActivity(intent);
                    return;
                }
                return;
            case C10232R.C10236id.llBecomeMarsooler /*2131362971*/:
                if (!C11644i.f33073E) {
                    this.f29642a.mo23574b((Activity) this);
                    return;
                } else if (this.f29642a.mo23502X()) {
                    this.f29642a.mo23594c("become_courier", "");
                    return;
                } else {
                    return;
                }
            case C10232R.C10236id.llLeft /*2131363064*/:
                onBackPressed();
                return;
            case C10232R.C10236id.llPaymentCollection /*2131363117*/:
                if (this.f29642a.mo23497S()) {
                    startActivity(new Intent(this, PaymentMethodActivity.class));
                    return;
                }
                return;
            case C10232R.C10236id.llSettingEditProfile /*2131363155*/:
                if (this.f29642a.mo23497S()) {
                    Intent intent2 = new Intent(this, EditProfileActivity.class);
                    String str2 = "user_name";
                    intent2.putExtra(str2, getIntent().getStringExtra(str2));
                    String str3 = "user_email";
                    intent2.putExtra(str3, getIntent().getStringExtra(str3));
                    Intent intent3 = getIntent();
                    String str4 = C11644i.f33387p5;
                    intent2.putExtra(str4, intent3.getStringExtra(str4));
                    String str5 = this.f29892n0;
                    String str6 = C11644i.f33395q5;
                    if (str5 == null) {
                        str5 = getIntent().getStringExtra(str6);
                    }
                    intent2.putExtra(str6, str5);
                    startActivityForResult(intent2, C11644i.f33446x0);
                    return;
                }
                return;
            case C10232R.C10236id.llSettingIban /*2131363156*/:
                m49746M();
                return;
            case C10232R.C10236id.llSettingLanguageSetting /*2131363157*/:
                if (this.f29642a.mo23497S()) {
                    startActivity(new Intent(this, LanguageChangeActivity.class));
                    return;
                }
                return;
            case C10232R.C10236id.llSettingMyFiledComaplaints /*2131363158*/:
                if (C11644i.f33072D6.getUser().getIs_courier().booleanValue()) {
                    m49744K();
                    return;
                } else {
                    startActivity(new Intent(this, MyFiledCOmplaint.class));
                    return;
                }
            case C10232R.C10236id.llSettingPrivacyPolicy /*2131363161*/:
                this.f29642a.mo23611e(getString(C10232R.string.lbl_privacy_policy), C11687c.f33853x);
                return;
            case C10232R.C10236id.llSettingRateUs /*2131363162*/:
                String packageName = getPackageName();
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("market://details?id=");
                    sb.append(packageName);
                    startActivity(new Intent(str, Uri.parse(sb.toString())));
                    return;
                } catch (ActivityNotFoundException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("http://play.google.com/store/apps/details?id=");
                    sb2.append(packageName);
                    startActivity(new Intent(str, Uri.parse(sb2.toString())));
                    return;
                }
            case C10232R.C10236id.llSettingTermsCondition /*2131363163*/:
                this.f29642a.mo23611e(getString(C10232R.string.lbl_terms_condition), "https://s.mrsool.co/terms.html");
                return;
            case C10232R.C10236id.llWhatsAppSticker /*2131363200*/:
                if (this.f29642a.mo23497S()) {
                    startActivity(new Intent(this, StickersActivity.class));
                    return;
                }
                return;
            case C10232R.C10236id.llnotificationtone /*2131363203*/:
                this.f29871S.mo40036a(C11644i.f33357m, (C11673d) new C10873a());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_setting);
        m49750Q();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.f29871S != null) {
                this.f29871S.onRequestPermissionsResult(i, strArr, iArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            m49745L();
            if (this.f29642a != null) {
                this.f29642a.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m49756a(Intent intent) {
        try {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            Ringtone ringtone = RingtoneManager.getRingtone(this, uri);
            this.f29642a.mo23468C().mo23449a(C11644i.f33111I5, uri.toString());
            this.f29642a.mo23468C().mo23449a(C11644i.f33119J5, ringtone.getTitle(this));
            if (this.f29642a.mo23495Q()) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.getNotificationChannel(getResources().getString(C10232R.string.notification_channel_id));
                }
                notificationManager.deleteNotificationChannel(this.f29642a.mo23674y());
                this.f29642a.mo23470D().mo23454b(C11644i.f33055B5, "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
