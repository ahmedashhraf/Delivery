package com.mrsool.p409me;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.UserFeedback;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.UserFeedbackActivity */
public class UserFeedbackActivity extends C0295d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public ProgressBar f29906N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public TextView f29907O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public LinearLayout f29908P;

    /* renamed from: Q */
    private String f29909Q = "";

    /* renamed from: R */
    private Bundle f29910R;

    /* renamed from: S */
    private ImageView f29911S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public RecyclerView f29912T;

    /* renamed from: U */
    WrapContentLinearLayoutManager f29913U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C10938j f29914V;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f29915a;

    /* renamed from: b */
    private TextView f29916b;

    /* renamed from: com.mrsool.me.UserFeedbackActivity$a */
    class C10877a implements Callback<UserFeedback> {
        C10877a() {
        }

        public void onFailure(Call<UserFeedback> call, Throwable th) {
            try {
                if (UserFeedbackActivity.this.f29915a != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("callGetUserFeedbackAPI");
                    sb.append(th.getMessage());
                    C5880q.m25753d(sb.toString());
                    UserFeedbackActivity.this.f29906N.setVisibility(8);
                    UserFeedbackActivity.this.f29915a.mo23615f(UserFeedbackActivity.this.getString(C10232R.string.msg_error_server_issue), UserFeedbackActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UserFeedback> call, Response<UserFeedback> response) {
            try {
                if (UserFeedbackActivity.this.f29915a != null) {
                    UserFeedbackActivity.this.f29906N.setVisibility(8);
                    if (response.isSuccessful()) {
                        if (((UserFeedback) response.body()).getCode() <= 300) {
                            UserFeedback userFeedback = (UserFeedback) response.body();
                            if (userFeedback.getFeedbacks().size() > 0) {
                                UserFeedbackActivity.this.f29912T.setVisibility(0);
                                UserFeedbackActivity.this.f29908P.setVisibility(8);
                                UserFeedbackActivity.this.f29914V = new C10938j(userFeedback.getFeedbacks(), UserFeedbackActivity.this);
                                UserFeedbackActivity.this.f29912T.setAdapter(UserFeedbackActivity.this.f29914V);
                            } else {
                                UserFeedbackActivity.this.f29907O.setText(TextUtils.isEmpty(userFeedback.getMessage()) ? UserFeedbackActivity.this.getString(C10232R.string.hint_no_feedback_found) : userFeedback.getMessage());
                                UserFeedbackActivity.this.f29912T.setVisibility(8);
                                UserFeedbackActivity.this.f29908P.setVisibility(0);
                            }
                            String a = UserFeedbackActivity.this.f29915a.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                UserFeedbackActivity.this.f29915a.mo23551a(new ServiceManualDataBean("", a));
                            }
                        }
                    } else if (UserFeedbackActivity.this.f29915a != null) {
                        UserFeedbackActivity.this.f29915a.mo23615f(response.message(), UserFeedbackActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: C */
    private void m49764C() {
        Call call;
        C5880q.m25753d(" =================  callGetUserFeedbackAPI ================= ");
        HashMap hashMap = new HashMap();
        hashMap.put("current_user", this.f29915a.mo23476G());
        hashMap.put("auth_token", this.f29915a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("api_type", this.f29909Q.equalsIgnoreCase(C11644i.f33075E1) ? "1" : "2");
        String str = "userId";
        if (getIntent().hasExtra(str)) {
            call = C11687c.m52645a(this.f29915a).getUserFeedback(String.valueOf(getIntent().getStringExtra(str)), hashMap);
        } else {
            call = C11687c.m52645a(this.f29915a).getUserFeedback(String.valueOf(this.f29915a.mo23468C().mo23459f("user_id")), hashMap);
        }
        call.enqueue(new C10877a());
    }

    /* renamed from: D */
    private void m49765D() {
        this.f29915a = new C5887x(this);
        this.f29906N = (ProgressBar) findViewById(C10232R.C10236id.pgUserFeedback);
        m49767G();
        m49766E();
        this.f29908P = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f29907O = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f29916b = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29916b.setText(getString(C10232R.string.lbl_customer_feedback));
        this.f29910R = getIntent().getExtras();
        Bundle bundle = this.f29910R;
        if (bundle != null && bundle.containsKey(C11644i.f33067D1)) {
            this.f29909Q = this.f29910R.getString(C11644i.f33067D1);
        }
        if (this.f29915a.mo23502X()) {
            this.f29906N.setVisibility(0);
            m49764C();
        }
    }

    /* renamed from: E */
    private void m49766E() {
        this.f29912T = (RecyclerView) findViewById(C10232R.C10236id.rvFeedback);
        this.f29913U = new WrapContentLinearLayoutManager(this);
        this.f29913U.mo7000l(1);
        this.f29912T.setLayoutManager(this.f29913U);
        this.f29912T.setItemAnimator(this.f29915a.mo23672x());
        this.f29912T.setNestedScrollingEnabled(false);
    }

    /* renamed from: G */
    private void m49767G() {
        this.f29916b = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29916b.setText(getResources().getString(C10232R.string.lbl_edit_p_user_feedback));
        this.f29911S = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29911S.setOnClickListener(this);
        if (this.f29915a.mo23496R()) {
            this.f29911S.setScaleX(-1.0f);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_user_feedback);
        m49765D();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29915a;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }
}
