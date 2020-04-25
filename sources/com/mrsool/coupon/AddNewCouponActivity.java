package com.mrsool.coupon;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.CouponDetailBean;
import com.mrsool.bean.CouponDetailMainBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.UseCouponBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddNewCouponActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private Toolbar f28692S;

    /* renamed from: T */
    private ImageView f28693T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ImageView f28694U;

    /* renamed from: V */
    private EditText f28695V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public LinearLayout f28696W;

    /* renamed from: X */
    private LinearLayout f28697X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f28698Y;

    /* renamed from: Z */
    private TextView f28699Z;

    /* renamed from: a0 */
    private TextView f28700a0;

    /* renamed from: b0 */
    private TextView f28701b0;

    /* renamed from: c0 */
    private TextView f28702c0;

    /* renamed from: d0 */
    private TextView f28703d0;

    /* renamed from: e0 */
    private TextView f28704e0;

    /* renamed from: f0 */
    private TextView f28705f0;

    /* renamed from: g0 */
    private TextView f28706g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public RelativeLayout f28707h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public boolean f28708i0;

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$a */
    class C10555a implements TextWatcher {
        C10555a() {
        }

        public void afterTextChanged(Editable editable) {
            AddNewCouponActivity.this.m48738Q();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$b */
    class C10556b implements OnFocusChangeListener {
        C10556b() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                AddNewCouponActivity.this.f28696W.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$c */
    class C10557c implements Runnable {
        C10557c() {
        }

        public void run() {
            if (!AddNewCouponActivity.this.f28708i0) {
                AddNewCouponActivity.this.m48733L();
            } else {
                AddNewCouponActivity.this.m48732K();
            }
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$d */
    class C10558d implements Callback<CouponDetailMainBean> {
        C10558d() {
        }

        public void onFailure(Call<CouponDetailMainBean> call, Throwable th) {
            try {
                if (AddNewCouponActivity.this.f29642a != null) {
                    AddNewCouponActivity.this.f29642a.mo23558a(true, AddNewCouponActivity.this.f28698Y, true);
                    AddNewCouponActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception unused) {
            }
        }

        public void onResponse(Call<CouponDetailMainBean> call, Response<CouponDetailMainBean> response) {
            try {
                if (AddNewCouponActivity.this.f29642a != null) {
                    AddNewCouponActivity.this.f29642a.mo23492O();
                    AddNewCouponActivity.this.f28694U.setEnabled(true);
                    if (!response.isSuccessful()) {
                        AddNewCouponActivity.this.f28696W.setVisibility(0);
                        AddNewCouponActivity.this.f29642a.mo23615f(response.message(), AddNewCouponActivity.this.getString(C10232R.string.app_name));
                    } else if (((CouponDetailMainBean) response.body()).getCode().intValue() <= 300) {
                        AddNewCouponActivity.this.f28708i0 = true;
                        AddNewCouponActivity.this.m48739a(((CouponDetailMainBean) response.body()).getCoupon());
                        AddNewCouponActivity.this.f28696W.setVisibility(8);
                        AddNewCouponActivity.this.f28707h0.setVisibility(8);
                    } else {
                        AddNewCouponActivity.this.m48756j(((CouponDetailMainBean) response.body()).getMessage());
                        AddNewCouponActivity.this.f28696W.setVisibility(0);
                    }
                    AddNewCouponActivity.this.f29642a.mo23543a(AddNewCouponActivity.this.findViewById(C10232R.C10236id.rlMain));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$e */
    class C10559e implements Callback<UseCouponBean> {
        C10559e() {
        }

        public void onFailure(Call<UseCouponBean> call, Throwable th) {
            C5887x xVar = AddNewCouponActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                AddNewCouponActivity.this.f29642a.mo23653q0();
            }
        }

        public void onResponse(Call<UseCouponBean> call, Response<UseCouponBean> response) {
            C5887x xVar = AddNewCouponActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                if (!response.isSuccessful()) {
                    AddNewCouponActivity.this.f29642a.mo23615f(response.message(), AddNewCouponActivity.this.getString(C10232R.string.app_name));
                } else if (((UseCouponBean) response.body()).getCode().intValue() > 300) {
                    AddNewCouponActivity.this.f29642a.mo23615f(((UseCouponBean) response.body()).getMessage(), AddNewCouponActivity.this.getString(C10232R.string.app_name));
                } else if (((UseCouponBean) response.body()).getAsk_replace() == null || ((UseCouponBean) response.body()).getAsk_replace().intValue() != 1) {
                    AddNewCouponActivity.this.f29642a.mo23473E(C11644i.f33326i4);
                    C5887x xVar2 = AddNewCouponActivity.this.f29642a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(((UseCouponBean) response.body()).getMessage());
                    xVar2.mo23489M(sb.toString());
                    AddNewCouponActivity.this.setResult(-1);
                    AddNewCouponActivity.this.finish();
                } else {
                    AddNewCouponActivity.this.m48754i(((UseCouponBean) response.body()).getMessage());
                }
            }
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$f */
    class C10560f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28714a;

        C10560f(Dialog dialog) {
            this.f28714a = dialog;
        }

        public void onClick(View view) {
            this.f28714a.dismiss();
            C5887x xVar = AddNewCouponActivity.this.f29642a;
            if (xVar != null && xVar.mo23502X()) {
                AddNewCouponActivity.this.m48731J();
            }
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$g */
    class C10561g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28716a;

        C10561g(Dialog dialog) {
            this.f28716a = dialog;
        }

        public void onClick(View view) {
            this.f28716a.dismiss();
        }
    }

    /* renamed from: com.mrsool.coupon.AddNewCouponActivity$h */
    class C10562h implements Callback<DefaultBean> {
        C10562h() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5887x xVar = AddNewCouponActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                AddNewCouponActivity.this.f29642a.mo23653q0();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            C5887x xVar = AddNewCouponActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                if (!response.isSuccessful()) {
                    AddNewCouponActivity.this.f29642a.mo23615f(response.message(), AddNewCouponActivity.this.getString(C10232R.string.app_name));
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    UserDetail userDetail = C11644i.f33072D6;
                    String str = C11644i.f33326i4;
                    if (userDetail != null && userDetail.getUser().getCoupon_count().intValue() == 0) {
                        AddNewCouponActivity.this.f29642a.mo23473E(str);
                    }
                    C5887x xVar2 = AddNewCouponActivity.this.f29642a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(((DefaultBean) response.body()).getMessage());
                    xVar2.mo23489M(sb.toString());
                    AddNewCouponActivity.this.f29642a.mo23473E(str);
                    AddNewCouponActivity.this.setResult(-1);
                    AddNewCouponActivity.this.finish();
                } else {
                    AddNewCouponActivity.this.f29642a.mo23615f(((DefaultBean) response.body()).getMessage(), AddNewCouponActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m48731J() {
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f28695V.getText().toString());
            hashMap.put(C11687c.f33725S2, sb.toString());
            C11687c.m52645a(this.f29642a).ReplaceCoupon(this.f29642a.mo23476G(), hashMap).enqueue(new C10562h());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m48732K() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f28695V.getText().toString());
            hashMap.put(C11687c.f33725S2, sb.toString());
            C11687c.m52645a(this.f29642a).AddCoupon(this.f29642a.mo23476G(), hashMap).enqueue(new C10559e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m48733L() {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23665u0();
            this.f28694U.setEnabled(false);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f28695V.getText().toString());
            hashMap.put(C11687c.f33725S2, sb.toString());
            C11687c.m52645a(this.f29642a).viewCouponDetail(hashMap).enqueue(new C10558d());
        }
    }

    /* renamed from: M */
    private void m48734M() {
        m48736O();
        this.f28695V = (EditText) findViewById(C10232R.C10236id.edCouponCode);
        this.f28696W = (LinearLayout) findViewById(C10232R.C10236id.llInvalidCoupon);
        this.f28699Z = (TextView) findViewById(C10232R.C10236id.tvCouponType);
        this.f28697X = (LinearLayout) findViewById(C10232R.C10236id.llCouponDetail);
        this.f28700a0 = (TextView) findViewById(C10232R.C10236id.tvCouponAmount);
        this.f28701b0 = (TextView) findViewById(C10232R.C10236id.tvCouponCurrency);
        this.f28702c0 = (TextView) findViewById(C10232R.C10236id.tvCouponCode);
        this.f28703d0 = (TextView) findViewById(C10232R.C10236id.tvValidTill);
        this.f28698Y = (TextView) findViewById(C10232R.C10236id.tvCheckAdd);
        this.f28694U = (ImageView) findViewById(C10232R.C10236id.ivCheckAdd);
        this.f28694U.setOnClickListener(this);
        this.f28694U.setEnabled(false);
        this.f28694U.setClickable(false);
        this.f28704e0 = (TextView) findViewById(C10232R.C10236id.tvValidTillLabel);
        this.f28707h0 = (RelativeLayout) findViewById(C10232R.C10236id.rlEnterCouponCode);
        m48737P();
        this.f28705f0 = (TextView) findViewById(C10232R.C10236id.tvInvalideCode);
        this.f28706g0 = (TextView) findViewById(C10232R.C10236id.tvMsgSocialLine1);
        m48756j(getResources().getString(C10232R.string.lbl_invalid_coupon_code));
        m48735N();
    }

    /* renamed from: N */
    private void m48735N() {
        String str = " 👉 ";
        if (this.f29642a.mo23496R()) {
            TextView textView = this.f28706g0;
            StringBuilder sb = new StringBuilder();
            sb.append(getResources().getString(C10232R.string.lbl_coupon_social_line1));
            sb.append(str);
            sb.append(getResources().getString(C10232R.string.lbl_coupon_social_line2));
            textView.setText(sb.toString());
            return;
        }
        TextView textView2 = this.f28706g0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getResources().getString(C10232R.string.lbl_coupon_social_line1));
        sb2.append(str);
        sb2.append(getResources().getString(C10232R.string.lbl_coupon_social_line2));
        textView2.setText(sb2.toString());
    }

    /* renamed from: O */
    private void m48736O() {
        this.f28693T = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28693T.setOnClickListener(this);
    }

    /* renamed from: P */
    private void m48737P() {
        this.f28695V.addTextChangedListener(new C10555a());
        this.f28695V.setOnFocusChangeListener(new C10556b());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m48738Q() {
        if (this.f28695V.getText().toString().trim().length() > 0) {
            this.f28698Y.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_check_btn_blue);
            m48747c(true);
            return;
        }
        this.f28698Y.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_check_btn_gray);
        m48747c(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m48756j(String str) {
        TextView textView = this.f28705f0;
        StringBuilder sb = new StringBuilder();
        sb.append("🚫 ");
        sb.append(str);
        textView.setText(sb.toString());
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id != C10232R.C10236id.imgClose) {
            if (id == C10232R.C10236id.ivCheckAdd) {
                if (this.f28695V.hasFocus()) {
                    this.f28695V.clearFocus();
                    this.f29642a.mo23543a(findViewById(C10232R.C10236id.rlMain));
                    new Handler().postDelayed(new C10557c(), 150);
                } else if (!this.f28708i0) {
                    m48733L();
                } else {
                    m48732K();
                }
            }
        } else if (this.f28697X.getVisibility() == 0) {
            this.f28698Y.setText(getString(C10232R.string.lbl_check));
            this.f28708i0 = false;
            this.f28697X.setVisibility(8);
            this.f28707h0.setVisibility(0);
            m48738Q();
        } else {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_add_new_coupon);
        m48734M();
    }

    /* renamed from: c */
    private void m48747c(boolean z) {
        this.f28698Y.setEnabled(z);
        this.f28698Y.setClickable(z);
        this.f28694U.setEnabled(z);
        this.f28694U.setClickable(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m48754i(String str) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        dialog.setCancelable(true);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
        textView.setText(str);
        textView2.setText(C10232R.string.lbl_yes);
        textView3.setText(C10232R.string.lbl_no_revised);
        textView2.setAllCaps(true);
        textView3.setAllCaps(true);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setOnClickListener(new C10560f(dialog));
        textView3.setOnClickListener(new C10561g(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: j */
    private String m48755j(int i) {
        if (i == 1) {
            return getString(C10232R.string.lbl_coupon_type_amount);
        }
        return i == 2 ? getString(C10232R.string.lbl_coupon_type_percentage) : "Type";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48739a(CouponDetailBean couponDetailBean) {
        this.f28697X.setVisibility(0);
        this.f28699Z.setText(m48755j(couponDetailBean.getCoupon_type().intValue()));
        this.f28700a0.setText(couponDetailBean.getCoupon_value());
        this.f28702c0.setText(this.f28695V.getText().toString().trim());
        if (couponDetailBean.getCoupon_type().intValue() == 1) {
            this.f28701b0.setText(couponDetailBean.getCouponCurrency());
        } else {
            this.f28701b0.setText("%");
        }
        if (couponDetailBean.getExpiration_date() > 0) {
            this.f28704e0.setText(getResources().getString(C10232R.string.lbl_valide_untill));
            this.f28703d0.setText(this.f29642a.mo23521a(couponDetailBean.getExpiration_date() * 1000, C11644i.f33420t6));
        } else {
            this.f28704e0.setText(C10232R.string.lbl_no_expiration_date);
            this.f28703d0.setText("");
        }
        this.f28698Y.setText(getString(C10232R.string.lbl_add_coupon));
    }
}
