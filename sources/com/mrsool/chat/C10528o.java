package com.mrsool.chat;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import com.mrsool.C10232R;
import com.mrsool.bean.RatingReasonBean;
import com.mrsool.bean.RatingReasonMainBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.chat.o */
/* compiled from: RateYourExperienceActivity */
public class C10528o extends C0295d implements OnClickListener {

    /* renamed from: N */
    private TextView f28550N;

    /* renamed from: O */
    private TextView f28551O;

    /* renamed from: P */
    private TextView f28552P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public TextView f28553Q;

    /* renamed from: R */
    private TextView f28554R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public TextView f28555S;

    /* renamed from: T */
    private LinearLayout f28556T;

    /* renamed from: U */
    private LinearLayout f28557U;

    /* renamed from: V */
    private ImageView f28558V;

    /* renamed from: W */
    private ImageView f28559W;

    /* renamed from: X */
    private RatingBar f28560X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public ProgressBar f28561Y;

    /* renamed from: Z */
    private EditText f28562Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f28563a;

    /* renamed from: a0 */
    private boolean f28564a0;

    /* renamed from: b */
    private Toolbar f28565b;

    /* renamed from: b0 */
    private int f28566b0;

    /* renamed from: c0 */
    private int f28567c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public List<RatingReasonBean> f28568d0 = new ArrayList();

    /* renamed from: e0 */
    Bundle f28569e0;

    /* renamed from: com.mrsool.chat.o$a */
    /* compiled from: RateYourExperienceActivity */
    class C10529a implements OnRatingBarChangeListener {
        C10529a() {
        }

        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            C10528o.this.m48647a(ratingBar, f);
            Intent intent = new Intent(C11644i.f33426u4);
            intent.putExtra(C11644i.f33261b2, f);
            C2128a.m11089a((Context) C10528o.this).mo9219a(intent);
            TextView a = C10528o.this.f28553Q;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            int i = (int) f;
            sb.append(C10528o.this.m48660h(i).toUpperCase());
            sb.append("!");
            a.setText(sb.toString());
            C10528o.this.m48661i(i);
        }
    }

    /* renamed from: com.mrsool.chat.o$b */
    /* compiled from: RateYourExperienceActivity */
    class C10530b implements Callback<RatingReasonMainBean> {
        C10530b() {
        }

        public void onFailure(Call<RatingReasonMainBean> call, Throwable th) {
            C10528o.this.f28561Y.setVisibility(8);
            C10528o.this.f28563a.mo23653q0();
            C10528o.this.f28555S.setEnabled(false);
        }

        public void onResponse(Call<RatingReasonMainBean> call, Response<RatingReasonMainBean> response) {
            C10528o.this.f28561Y.setVisibility(8);
            if (!response.isSuccessful()) {
                C10528o.this.m48659g(response.message());
            } else if (((RatingReasonMainBean) response.body()).getCode().intValue() <= 300) {
                C10528o.this.f28568d0 = ((RatingReasonMainBean) response.body()).getReasons();
                C10528o oVar = C10528o.this;
                oVar.m48653b(oVar.f28568d0);
                C10528o.this.f28555S.setEnabled(true);
            } else {
                C10528o.this.m48659g(((RatingReasonMainBean) response.body()).getMessage());
            }
        }
    }

    /* renamed from: com.mrsool.chat.o$c */
    /* compiled from: RateYourExperienceActivity */
    class C10531c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f28572a;

        C10531c(TextView textView) {
            this.f28572a = textView;
        }

        public void onClick(View view) {
            C5880q.m25751b("reason1");
            TextView textView = this.f28572a;
            textView.setActivated(!textView.isActivated());
            C10528o.this.m48662j(((Integer) this.f28572a.getTag()).intValue());
        }
    }

    /* renamed from: com.mrsool.chat.o$d */
    /* compiled from: RateYourExperienceActivity */
    class C10532d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextView f28574a;

        C10532d(TextView textView) {
            this.f28574a = textView;
        }

        public void onClick(View view) {
            C5880q.m25751b("reason2");
            TextView textView = this.f28574a;
            textView.setActivated(!textView.isActivated());
            C10528o.this.m48662j(((Integer) this.f28574a.getTag()).intValue());
        }
    }

    /* renamed from: com.mrsool.chat.o$e */
    /* compiled from: RateYourExperienceActivity */
    class C10533e implements Callback<ServiceManualDefaultBean> {
        C10533e() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            C10528o.this.f28563a.mo23653q0();
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (!response.isSuccessful()) {
                C10528o.this.f28563a.mo23615f(response.message(), C10528o.this.getString(C10232R.string.app_name));
            } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                Intent intent = new Intent(C11644i.f33410s4);
                String str = C11644i.f33261b2;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(C10528o.this.f28569e0.getFloat(C11644i.f33261b2));
                intent.putExtra(str, sb.toString());
                C2128a.m11089a((Context) C10528o.this).mo9219a(intent);
                C10528o.this.f28563a.mo23473E(C11644i.f33418t4);
                C10528o.this.onBackPressed();
            } else {
                C10528o.this.f28563a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), C10528o.this.getString(C10232R.string.app_name));
            }
        }
    }

    /* renamed from: com.mrsool.chat.o$f */
    /* compiled from: RateYourExperienceActivity */
    class C10534f {

        /* renamed from: a */
        private RatingReasonBean f28577a;

        /* renamed from: b */
        private RatingReasonBean f28578b;

        public C10534f(RatingReasonBean ratingReasonBean, RatingReasonBean ratingReasonBean2) {
            this.f28577a = ratingReasonBean;
            this.f28578b = ratingReasonBean2;
        }

        /* renamed from: a */
        public RatingReasonBean mo37917a() {
            return this.f28577a;
        }

        /* renamed from: b */
        public RatingReasonBean mo37919b() {
            return this.f28578b;
        }

        /* renamed from: a */
        public void mo37918a(RatingReasonBean ratingReasonBean) {
            this.f28577a = ratingReasonBean;
        }

        /* renamed from: b */
        public void mo37920b(RatingReasonBean ratingReasonBean) {
            this.f28578b = ratingReasonBean;
        }
    }

    /* renamed from: C */
    private void m48638C() {
        this.f28564a0 = this.f28569e0.getBoolean(C11644i.f33270c2);
        this.f28566b0 = this.f28569e0.getInt(C11644i.f33123K1);
        this.f28567c0 = this.f28569e0.getInt(C11644i.f33131L1);
        m48641G();
        this.f28560X.setRating(this.f28569e0.getFloat(C11644i.f33261b2));
        TextView textView = this.f28553Q;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(m48660h((int) this.f28569e0.getFloat(C11644i.f33261b2)).toUpperCase());
        sb.append("!");
        textView.setText(sb.toString());
    }

    /* renamed from: D */
    private String m48639D() {
        String str;
        String str2 = "";
        String str3 = str2;
        int i = 0;
        while (true) {
            str = ",";
            if (i >= this.f28568d0.size()) {
                break;
            }
            if (((RatingReasonBean) this.f28568d0.get(i)).getSelected()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Selected ID is :");
                sb.append(((RatingReasonBean) this.f28568d0.get(i)).getid());
                C5880q.m25751b(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str2);
                sb2.append(((RatingReasonBean) this.f28568d0.get(i)).getid());
                sb2.append(str);
                str3 = sb2.toString();
            }
            i++;
        }
        if (str3.contains(str) && str3.lastIndexOf(str) == str3.length() - 1) {
            str3 = str3.substring(0, str3.length() - 1);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("String is :");
        sb3.append(str3);
        C5880q.m25751b(sb3.toString());
        return str3;
    }

    /* renamed from: E */
    private void m48640E() {
        this.f28563a = new C5887x(this);
        this.f28569e0 = getIntent().getExtras();
        m48643I();
        this.f28551O = (TextView) findViewById(C10232R.C10236id.tvUserName);
        this.f28552P = (TextView) findViewById(C10232R.C10236id.tvRating);
        this.f28553Q = (TextView) findViewById(C10232R.C10236id.tvRateName);
        this.f28559W = (ImageView) findViewById(C10232R.C10236id.imgMeProfile);
        this.f28560X = (RatingBar) findViewById(C10232R.C10236id.ratBarUserFeedback1);
        this.f28557U = (LinearLayout) findViewById(C10232R.C10236id.llReasons);
        this.f28561Y = (ProgressBar) findViewById(C10232R.C10236id.pgRateReason);
        this.f28561Y.setVisibility(8);
        this.f28554R = (TextView) findViewById(C10232R.C10236id.tverror);
        this.f28555S = (TextView) findViewById(C10232R.C10236id.tvSubmit);
        this.f28555S.setOnClickListener(this);
        this.f28562Z = (EditText) findViewById(C10232R.C10236id.edtComment);
        m48641G();
        m48642H();
    }

    /* renamed from: G */
    private void m48641G() {
        LayerDrawable layerDrawable = (LayerDrawable) this.f28560X.getProgressDrawable();
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(1)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.color_rating));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(2)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.color_rating));
        C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(0)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.color_rating));
    }

    /* renamed from: H */
    private void m48642H() {
        this.f28560X.setOnRatingBarChangeListener(new C10529a());
    }

    /* renamed from: I */
    private void m48643I() {
        this.f28565b = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        this.f28550N = (TextView) this.f28565b.findViewById(C10232R.C10236id.txtTitle);
        this.f28550N.setText(C10232R.string.title_rate_your_experience);
        this.f28556T = (LinearLayout) findViewById(C10232R.C10236id.llLeft);
        this.f28556T.setOnClickListener(this);
        this.f28558V = (ImageView) this.f28565b.findViewById(C10232R.C10236id.ivLeft);
        this.f28558V.setImageResource(C10232R.C10235drawable.back_white);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m48659g(String str) {
        TextView textView = this.f28554R;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        if (TextUtils.isEmpty(str)) {
            str = "Error ! Please try Again";
        }
        sb.append(str);
        textView.setText(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public String m48660h(int i) {
        if (i == 1) {
            return getString(C10232R.string.rate_value_1);
        }
        if (i == 2) {
            return getString(C10232R.string.rate_value_2);
        }
        if (i == 3) {
            return getString(C10232R.string.rate_value_3);
        }
        if (i != 4) {
            return i != 5 ? "" : getString(C10232R.string.rate_value_5);
        }
        return getString(C10232R.string.rate_value_4);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m48661i(int i) {
        if (this.f28563a.mo23502X()) {
            this.f28557U.setVisibility(8);
            this.f28555S.setEnabled(false);
            this.f28561Y.setVisibility(0);
            this.f28554R.setVisibility(8);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f28563a.mo23476G());
            hashMap.put("auth_token", this.f28563a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("order_id", this.f28569e0.getString(C11644i.f33314h1));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            hashMap.put("rating", sb.toString());
            C5882b.m25774a(this.f28563a).ratingReason(hashMap).enqueue(new C10530b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m48662j(int i) {
        for (int i2 = 0; i2 < this.f28568d0.size(); i2++) {
            if (i == ((RatingReasonBean) this.f28568d0.get(i2)).getid()) {
                ((RatingReasonBean) this.f28568d0.get(i2)).setSelected(Boolean.valueOf(!((RatingReasonBean) this.f28568d0.get(i2)).getSelected()));
                return;
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.llLeft) {
            onBackPressed();
        } else if (id == C10232R.C10236id.tvSubmit) {
            C5880q.m25751b("Submit clicked");
            String D = m48639D();
            if (TextUtils.isEmpty(D)) {
                this.f28563a.mo23615f(getResources().getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
                return;
            }
            m48658e(D);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setSoftInputMode(3);
        setContentView((int) C10232R.layout.activity_rate_experience);
        m48640E();
        m48638C();
        m48661i((int) this.f28569e0.getFloat(C11644i.f33261b2));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        m48641G();
        super.onDestroy();
    }

    /* renamed from: e */
    private void m48658e(String str) {
        if (this.f28563a.mo23502X()) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(this.f28564a0 ? this.f28566b0 : this.f28567c0);
            hashMap.put("iRaterId", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f28564a0 ? this.f28567c0 : this.f28566b0);
            hashMap.put("iRatedId", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append((int) this.f28569e0.getFloat(C11644i.f33261b2));
            hashMap.put("fRating", sb3.toString());
            hashMap.put("txReview", this.f28562Z.getText().toString().trim());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(this.f28569e0.getString(C11644i.f33314h1));
            hashMap.put("iOrderId", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(str);
            hashMap.put("rating_reason_ids", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Param : ");
            sb6.append(hashMap);
            C5880q.m25751b(sb6.toString());
            C5882b.m25774a(this.f28563a).RateNReview(hashMap).enqueue(new C10533e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m48653b(List<RatingReasonBean> list) {
        this.f28557U.removeAllViews();
        if (list.size() == 0) {
            this.f28554R.setVisibility(8);
            m48659g("No Reason Found");
            return;
        }
        this.f28557U.setVisibility(0);
        for (int i = 0; i < list.size(); i++) {
            ((RatingReasonBean) list.get(i)).setSelected(Boolean.valueOf(false));
        }
        for (int i2 = 0; i2 < list.size(); i2 += 2) {
            View inflate = getLayoutInflater().inflate(C10232R.layout.row_rate_reason, null);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvReason1);
            TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvReason2);
            textView.setTag(Integer.valueOf(((RatingReasonBean) list.get(i2)).getid()));
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((RatingReasonBean) list.get(i2)).getName());
            textView.setText(sb.toString());
            int i3 = i2 + 1;
            if (i3 != list.size()) {
                textView2.setTag(Integer.valueOf(((RatingReasonBean) list.get(i3)).getid()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(((RatingReasonBean) list.get(i3)).getName());
                textView2.setText(sb2.toString());
            } else {
                textView2.setVisibility(4);
            }
            textView.setOnClickListener(new C10531c(textView));
            textView2.setOnClickListener(new C10532d(textView2));
            this.f28557U.addView(inflate);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48647a(RatingBar ratingBar, float f) {
        m48641G();
        if (f <= 2.0f) {
            LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
            int i = VERSION.SDK_INT;
            if (i == 24) {
                C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(1)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
                C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(2)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
                C0892a.m5154b(C0892a.m5161i(layerDrawable.getDrawable(0)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
            } else if (i == 23) {
                layerDrawable.getDrawable(2).setTint(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red));
            } else {
                layerDrawable.getDrawable(2).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red), Mode.SRC_ATOP);
                layerDrawable.getDrawable(1).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red), Mode.SRC_ATOP);
            }
        } else if (f == 3.0f) {
            LayerDrawable layerDrawable2 = (LayerDrawable) ratingBar.getProgressDrawable();
            int i2 = VERSION.SDK_INT;
            if (i2 == 24) {
                C0892a.m5154b(C0892a.m5161i(layerDrawable2.getDrawable(1)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow));
                C0892a.m5154b(C0892a.m5161i(layerDrawable2.getDrawable(2)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow));
                C0892a.m5154b(C0892a.m5161i(layerDrawable2.getDrawable(0)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow));
            } else if (i2 == 23) {
                layerDrawable2.getDrawable(2).setTint(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow));
            } else {
                layerDrawable2.getDrawable(2).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow), Mode.SRC_ATOP);
                layerDrawable2.getDrawable(1).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow), Mode.SRC_ATOP);
            }
        } else {
            LayerDrawable layerDrawable3 = (LayerDrawable) ratingBar.getProgressDrawable();
            int i3 = VERSION.SDK_INT;
            if (i3 == 24) {
                C0892a.m5154b(C0892a.m5161i(layerDrawable3.getDrawable(1)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.green));
                C0892a.m5154b(C0892a.m5161i(layerDrawable3.getDrawable(2)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.green));
                C0892a.m5154b(C0892a.m5161i(layerDrawable3.getDrawable(0)), C0841b.m4915a((Context) this, (int) C10232R.C10234color.green));
            } else if (i3 == 23) {
                layerDrawable3.getDrawable(2).setTint(C0841b.m4915a((Context) this, (int) C10232R.C10234color.green));
            } else {
                layerDrawable3.getDrawable(2).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.green), Mode.SRC_ATOP);
                layerDrawable3.getDrawable(1).setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.green), Mode.SRC_ATOP);
            }
        }
    }
}
