package com.mrsool.complaint;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1376c;
import com.mrsool.C10232R;
import com.mrsool.bean.ComplaintDetailMainBean;
import com.mrsool.bean.ComplaintListBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.order.FileComplainActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ComplaintDetailActivity extends C0295d implements OnClickListener {

    /* renamed from: N */
    private TextView f28598N;

    /* renamed from: O */
    private LinearLayout f28599O;

    /* renamed from: P */
    private LinearLayout f28600P;

    /* renamed from: Q */
    private LinearLayout f28601Q;

    /* renamed from: R */
    private LinearLayout f28602R;

    /* renamed from: S */
    private LinearLayout f28603S;

    /* renamed from: T */
    private ImageView f28604T;

    /* renamed from: U */
    private ImageView f28605U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ImageView f28606V;

    /* renamed from: W */
    private ImageView f28607W;

    /* renamed from: X */
    private ImageView f28608X;

    /* renamed from: Y */
    private ImageView f28609Y;

    /* renamed from: Z */
    private ImageView f28610Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f28611a;

    /* renamed from: a0 */
    private ImageView f28612a0;

    /* renamed from: b */
    private Toolbar f28613b;

    /* renamed from: b0 */
    private ImageView f28614b0;

    /* renamed from: c0 */
    private TextView f28615c0;

    /* renamed from: d0 */
    private TextView f28616d0;

    /* renamed from: e0 */
    private TextView f28617e0;

    /* renamed from: f0 */
    private TextView f28618f0;

    /* renamed from: g0 */
    private TextView f28619g0;

    /* renamed from: h0 */
    private TextView f28620h0;

    /* renamed from: i0 */
    private TextView f28621i0;

    /* renamed from: j0 */
    private TextView f28622j0;

    /* renamed from: k0 */
    private TextView f28623k0;

    /* renamed from: l0 */
    private TextView f28624l0;

    /* renamed from: m0 */
    private TextView f28625m0;

    /* renamed from: n0 */
    private TextView f28626n0;

    /* renamed from: o0 */
    private TextView f28627o0;

    /* renamed from: p0 */
    private ProgressBar f28628p0;

    /* renamed from: q0 */
    private ProgressBar f28629q0;

    /* renamed from: r0 */
    private ProgressBar f28630r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public String f28631s0 = "-1";

    /* renamed from: t0 */
    private Bundle f28632t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public ComplaintListBean f28633u0;

    /* renamed from: com.mrsool.complaint.ComplaintDetailActivity$a */
    class C10540a implements Callback<ComplaintDetailMainBean> {
        C10540a() {
        }

        public void onFailure(Call<ComplaintDetailMainBean> call, Throwable th) {
            ComplaintDetailActivity.this.f28611a.mo23653q0();
        }

        public void onResponse(Call<ComplaintDetailMainBean> call, Response<ComplaintDetailMainBean> response) {
            ComplaintDetailActivity.this.f28611a.mo23492O();
            if (response.isSuccessful()) {
                if (((ComplaintDetailMainBean) response.body()).getCode().intValue() <= 300) {
                    try {
                        if (((ComplaintDetailMainBean) response.body()).getComplaint() != null) {
                            ComplaintDetailActivity.this.f28633u0 = (ComplaintListBean) ((ComplaintDetailMainBean) response.body()).getComplaint().get(0);
                            ComplaintDetailActivity.this.m48682a(ComplaintDetailActivity.this.f28633u0);
                        }
                    } catch (Exception unused) {
                    }
                    String a = ComplaintDetailActivity.this.f28611a.mo23528a(response.body());
                    if (!TextUtils.isEmpty(a)) {
                        ComplaintDetailActivity.this.f28611a.mo23551a(new ServiceManualDataBean("", a));
                        return;
                    }
                    return;
                }
                ComplaintDetailActivity.this.f28611a.mo23615f(((ComplaintDetailMainBean) response.body()).getMessage(), ComplaintDetailActivity.this.getString(C10232R.string.app_name));
            } else if (ComplaintDetailActivity.this.f28611a != null) {
                ComplaintDetailActivity.this.f28611a.mo23615f(response.message(), ComplaintDetailActivity.this.getString(C10232R.string.app_name));
            }
        }
    }

    /* renamed from: com.mrsool.complaint.ComplaintDetailActivity$b */
    class C10541b extends C2550c {
        C10541b(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            ComplaintDetailActivity.this.f28606V.setImageDrawable(ComplaintDetailActivity.this.f28611a.mo23513a(bitmap));
        }
    }

    /* renamed from: com.mrsool.complaint.ComplaintDetailActivity$c */
    class C10542c extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f28636R;

        /* renamed from: S */
        final /* synthetic */ int f28637S;

        C10542c(ImageView imageView, ImageView imageView2, int i) {
            this.f28636R = imageView2;
            this.f28637S = i;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            this.f28636R.setScaleType(ScaleType.CENTER_CROP);
            this.f28636R.setImageBitmap(bitmap);
            this.f28636R.setVisibility(0);
            ComplaintDetailActivity.this.m48681a(this.f28637S, false);
        }
    }

    /* renamed from: com.mrsool.complaint.ComplaintDetailActivity$d */
    class C10543d implements Callback<ComplaintDetailMainBean> {
        C10543d() {
        }

        public void onFailure(Call<ComplaintDetailMainBean> call, Throwable th) {
            ComplaintDetailActivity.this.f28611a.mo23653q0();
        }

        public void onResponse(Call<ComplaintDetailMainBean> call, Response<ComplaintDetailMainBean> response) {
            String str = "";
            try {
                if (ComplaintDetailActivity.this.f28611a != null) {
                    ComplaintDetailActivity.this.f28611a.mo23492O();
                    if (!response.isSuccessful()) {
                        try {
                            ComplaintDetailActivity.this.f28611a.mo23615f(response.message(), ComplaintDetailActivity.this.getString(C10232R.string.app_name));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (((ComplaintDetailMainBean) response.body()).getCode().intValue() <= 300) {
                        ComplaintDetailActivity.this.f28633u0 = (ComplaintListBean) ((ComplaintDetailMainBean) response.body()).getComplaint().get(0);
                        if (C11644i.f33072D6 != null && C11644i.f33072D6.getUser() != null && C11644i.f33072D6.getUser().getResolved_complaint_count() > 0) {
                            C5881v C = ComplaintDetailActivity.this.f28611a.mo23468C();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(ComplaintDetailActivity.this.f28631s0);
                            if (C.mo23459f(sb.toString()) == null) {
                                C5881v C2 = ComplaintDetailActivity.this.f28611a.mo23468C();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str);
                                sb2.append(ComplaintDetailActivity.this.f28631s0);
                                C2.mo23449a(sb2.toString(), "done");
                                C11644i.f33072D6.getUser().setResolved_complaint_count(C11644i.f33072D6.getUser().getResolved_complaint_count() - 1);
                                ComplaintDetailActivity.this.f28611a.mo23473E(C11644i.f33317h4);
                                String a = ComplaintDetailActivity.this.f28611a.mo23528a(response.body());
                                if (!TextUtils.isEmpty(a)) {
                                    ComplaintDetailActivity.this.f28611a.mo23551a(new ServiceManualDataBean(str, a));
                                }
                            }
                        }
                    } else {
                        ComplaintDetailActivity.this.f28611a.mo23615f(((ComplaintDetailMainBean) response.body()).getMessage(), ComplaintDetailActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e2) {
                ComplaintDetailActivity.this.f28611a.mo23492O();
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: C */
    private void m48674C() {
        this.f28611a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        HashMap hashMap = new HashMap();
        hashMap.put("current_user", this.f28611a.mo23468C().mo23459f("user_id"));
        hashMap.put("auth_token", this.f28611a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("complaint_number", getIntent().getExtras().getString(C11644i.f33439w1));
        C5882b.m25774a(this.f28611a).getComplaintDetail(hashMap).enqueue(new C10540a());
    }

    /* renamed from: D */
    private void m48675D() {
        this.f28632t0 = getIntent().getExtras();
        Bundle bundle = this.f28632t0;
        if (bundle != null && bundle.containsKey(C11644i.f33051B1)) {
            this.f28631s0 = this.f28632t0.getString(C11644i.f33051B1);
        }
    }

    /* renamed from: E */
    private void m48676E() {
        this.f28611a = new C5887x(this);
        m48677G();
        this.f28605U = (ImageView) findViewById(C10232R.C10236id.imgShop);
        this.f28606V = (ImageView) findViewById(C10232R.C10236id.imgSuspect);
        this.f28607W = (ImageView) findViewById(C10232R.C10236id.ivUp);
        this.f28608X = (ImageView) findViewById(C10232R.C10236id.ivDown);
        this.f28609Y = (ImageView) findViewById(C10232R.C10236id.imgAttachment1);
        this.f28610Z = (ImageView) findViewById(C10232R.C10236id.imgAttachment2);
        this.f28612a0 = (ImageView) findViewById(C10232R.C10236id.imgAttachment3);
        this.f28609Y.setOnClickListener(this);
        this.f28610Z.setOnClickListener(this);
        this.f28612a0.setOnClickListener(this);
        this.f28607W.setOnClickListener(this);
        this.f28608X.setOnClickListener(this);
        this.f28600P = (LinearLayout) findViewById(C10232R.C10236id.llByMrsool);
        this.f28601Q = (LinearLayout) findViewById(C10232R.C10236id.llAttachmentContainer);
        this.f28603S = (LinearLayout) findViewById(C10232R.C10236id.llUpDown);
        this.f28615c0 = (TextView) findViewById(C10232R.C10236id.txtshopName);
        this.f28616d0 = (TextView) findViewById(C10232R.C10236id.txtOrderNo);
        this.f28617e0 = (TextView) findViewById(C10232R.C10236id.txtOrderDiscription);
        this.f28618f0 = (TextView) findViewById(C10232R.C10236id.txtOrderStatus);
        this.f28619g0 = (TextView) findViewById(C10232R.C10236id.txtSuspectName);
        this.f28620h0 = (TextView) findViewById(C10232R.C10236id.tvReason);
        this.f28621i0 = (TextView) findViewById(C10232R.C10236id.tvReasonDetail);
        this.f28622j0 = (TextView) findViewById(C10232R.C10236id.txtComplaintResponse);
        this.f28623k0 = (TextView) findViewById(C10232R.C10236id.txtResponseTime);
        this.f28624l0 = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f28625m0 = (TextView) findViewById(C10232R.C10236id.txtrowTime);
        this.f28626n0 = (TextView) findViewById(C10232R.C10236id.txtComplaintNumber);
        this.f28627o0 = (TextView) findViewById(C10232R.C10236id.tvHappy);
        this.f28628p0 = (ProgressBar) findViewById(C10232R.C10236id.pgImage1);
        this.f28629q0 = (ProgressBar) findViewById(C10232R.C10236id.pgImage2);
        this.f28630r0 = (ProgressBar) findViewById(C10232R.C10236id.pgImage3);
        m48675D();
        if (this.f28611a.mo23502X()) {
            m48674C();
        }
    }

    /* renamed from: G */
    private void m48677G() {
        this.f28613b = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        this.f28598N = (TextView) this.f28613b.findViewById(C10232R.C10236id.txtTitle);
        this.f28598N.setGravity(3);
        this.f28598N.setText(C10232R.string.lbl_my_filed_complaint);
        this.f28599O = (LinearLayout) findViewById(C10232R.C10236id.llLeft);
        this.f28599O.setOnClickListener(this);
        this.f28599O.setContentDescription(getString(C10232R.string.lbl_back));
        this.f28604T = (ImageView) this.f28613b.findViewById(C10232R.C10236id.ivLeft);
        this.f28604T.setImageResource(C10232R.C10235drawable.back_white);
        this.f28602R = (LinearLayout) findViewById(C10232R.C10236id.layRightClick);
        this.f28602R.setOnClickListener(this);
        this.f28614b0 = (ImageView) findViewById(C10232R.C10236id.imgRight);
    }

    /* renamed from: H */
    private void m48678H() {
        this.f28611a.mo23489M(getString(C10232R.string.alert_max_feedback));
    }

    /* renamed from: h */
    private void m48690h(int i) {
        if (this.f28631s0.equals("-1")) {
            this.f28611a.mo23615f(getResources().getString(C10232R.string.msg_alert_something_went_wrong), getResources().getString(C10232R.string.app_name));
        }
        this.f28611a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        HashMap hashMap = new HashMap();
        C5887x xVar = this.f28611a;
        hashMap.put("current_user", xVar.mo23622h(xVar.mo23468C().mo23459f("user_id")));
        C5887x xVar2 = this.f28611a;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f28631s0);
        hashMap.put("complaint[id]", xVar2.mo23622h(sb.toString()));
        C5887x xVar3 = this.f28611a;
        hashMap.put("auth_token", xVar3.mo23622h(xVar3.mo23468C().mo23459f(C11644i.f33443w5)));
        C5887x xVar4 = this.f28611a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(i);
        hashMap.put("complaint[complainant_feedback]", xVar4.mo23622h(sb2.toString()));
        C5882b.m25774a(this.f28611a).editCompaint(hashMap, null, null, null).enqueue(new C10543d());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1003 && this.f28611a.mo23502X()) {
            m48674C();
        }
    }

    public void onClick(View view) {
        boolean z = false;
        switch (view.getId()) {
            case C10232R.C10236id.imgAttachment1 /*2131362455*/:
                ComplaintListBean complaintListBean = this.f28633u0;
                if (complaintListBean != null && !TextUtils.isEmpty(complaintListBean.getImages().getImage1())) {
                    Intent intent = new Intent(this, ViewPhotoFullActivity.class);
                    intent.putExtra(C11644i.f33463z1, this.f28633u0.getImages().getImage1());
                    startActivity(intent);
                    return;
                }
                return;
            case C10232R.C10236id.imgAttachment2 /*2131362456*/:
                ComplaintListBean complaintListBean2 = this.f28633u0;
                if (complaintListBean2 != null && !TextUtils.isEmpty(complaintListBean2.getImages().getImage2())) {
                    Intent intent2 = new Intent(this, ViewPhotoFullActivity.class);
                    intent2.putExtra(C11644i.f33463z1, this.f28633u0.getImages().getImage2());
                    startActivity(intent2);
                    return;
                }
                return;
            case C10232R.C10236id.imgAttachment3 /*2131362457*/:
                ComplaintListBean complaintListBean3 = this.f28633u0;
                if (complaintListBean3 != null && !TextUtils.isEmpty(complaintListBean3.getImages().getImage3())) {
                    Intent intent3 = new Intent(this, ViewPhotoFullActivity.class);
                    intent3.putExtra(C11644i.f33463z1, this.f28633u0.getImages().getImage3());
                    startActivity(intent3);
                    return;
                }
                return;
            case C10232R.C10236id.ivDown /*2131362774*/:
                ComplaintListBean complaintListBean4 = this.f28633u0;
                if (complaintListBean4 == null || !complaintListBean4.isAllow_feedback()) {
                    m48678H();
                    return;
                }
                this.f28607W.setSelected(false);
                ImageView imageView = this.f28608X;
                imageView.setSelected(!imageView.isSelected());
                if (this.f28611a.mo23502X()) {
                    m48690h(3);
                    return;
                }
                return;
            case C10232R.C10236id.ivUp /*2131362876*/:
                ComplaintListBean complaintListBean5 = this.f28633u0;
                if (complaintListBean5 == null || !complaintListBean5.isAllow_feedback()) {
                    m48678H();
                    return;
                }
                this.f28608X.setSelected(false);
                ImageView imageView2 = this.f28607W;
                imageView2.setSelected(!imageView2.isSelected());
                if (this.f28611a.mo23502X()) {
                    m48690h(2);
                    return;
                }
                return;
            case C10232R.C10236id.layRightClick /*2131362913*/:
                Intent intent4 = new Intent(this, FileComplainActivity.class);
                intent4.putExtra(C11644i.f33314h1, this.f28633u0.getOrder());
                intent4.putExtra(C11644i.f33439w1, this.f28633u0.getComplaint_number());
                intent4.putExtra(C11644i.f33051B1, this.f28633u0.getComplaint_id());
                intent4.putExtra(C11644i.f33447x1, this.f28633u0.getReason_id());
                intent4.putExtra(C11644i.f33043A1, true);
                String str = C11644i.f33059C1;
                if (this.f28602R.getVisibility() != 0) {
                    z = true;
                }
                intent4.putExtra(str, z);
                startActivityForResult(intent4, 1003);
                return;
            case C10232R.C10236id.llLeft /*2131363064*/:
                onBackPressed();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_complaint_detail);
        m48676E();
    }

    /* renamed from: b */
    private void m48686b(ComplaintListBean complaintListBean) {
        this.f28624l0.setVisibility(8);
        if (TextUtils.isEmpty(complaintListBean.getImages().getImage1())) {
            this.f28609Y.setVisibility(8);
            this.f28610Z.setVisibility(8);
            this.f28612a0.setVisibility(8);
            this.f28624l0.setVisibility(0);
            this.f28601Q.setVisibility(8);
        } else if (TextUtils.isEmpty(complaintListBean.getImages().getImage2())) {
            m48684a(complaintListBean.getImages().getImage1(), this.f28609Y, 1);
            this.f28609Y.setVisibility(0);
            this.f28610Z.setVisibility(8);
            this.f28612a0.setVisibility(8);
            this.f28601Q.setVisibility(0);
        } else if (TextUtils.isEmpty(complaintListBean.getImages().getImage3())) {
            m48684a(complaintListBean.getImages().getImage1(), this.f28609Y, 1);
            m48684a(complaintListBean.getImages().getImage2(), this.f28610Z, 2);
            this.f28612a0.setVisibility(8);
            this.f28601Q.setVisibility(0);
        } else {
            m48684a(complaintListBean.getImages().getImage1(), this.f28609Y, 1);
            m48684a(complaintListBean.getImages().getImage2(), this.f28610Z, 2);
            m48684a(complaintListBean.getImages().getImage3(), this.f28612a0, 3);
            this.f28601Q.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48682a(ComplaintListBean complaintListBean) {
        if (complaintListBean != null) {
            C2232l.m11649c(getApplicationContext()).mo9515a(complaintListBean.getSuspect_pic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).m11411d().mo9458b(new C10541b(this.f28606V));
            C2232l.m11649c(getApplicationContext()).mo9515a(complaintListBean.getShop_pic()).m11496d().m11500e((int) C10232R.C10235drawable.menu_shop).mo9424a(this.f28605U);
            this.f28615c0.setText(complaintListBean.getShop_name());
            this.f28619g0.setText(complaintListBean.getSuspect_name());
            this.f28617e0.setText(complaintListBean.getOrder_desc());
            this.f28616d0.setText(String.valueOf(complaintListBean.getOrder()));
            this.f28625m0.setText(complaintListBean.getCreated_at());
            this.f28619g0.setText(complaintListBean.getSuspect_name());
            this.f28620h0.setText(complaintListBean.getReason());
            this.f28626n0.setText(complaintListBean.getComplaint_number());
            if (TextUtils.isEmpty(complaintListBean.getComment())) {
                this.f28621i0.setVisibility(8);
            } else {
                this.f28621i0.setText(complaintListBean.getComment());
            }
            m48686b(complaintListBean);
            TextView textView = this.f28618f0;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f28633u0.getStatus());
            textView.setText(sb.toString());
            if (!TextUtils.isEmpty(this.f28633u0.getStatus_color())) {
                TextView textView2 = this.f28618f0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f28633u0.getStatus_color());
                textView2.setTextColor(Color.parseColor(sb2.toString()));
            }
            this.f28622j0.setText(complaintListBean.getAdmin_reply());
            String complainant_feedback = complaintListBean.getComplainant_feedback();
            char c = 65535;
            int hashCode = complainant_feedback.hashCode();
            if (hashCode != -1039624149) {
                if (hashCode != 3321751) {
                    if (hashCode == 1671642405 && complainant_feedback.equals(C11644i.f33425u3)) {
                        c = 2;
                    }
                } else if (complainant_feedback.equals(C11644i.f33417t3)) {
                    c = 1;
                }
            } else if (complainant_feedback.equals(C11644i.f33409s3)) {
                c = 0;
            }
            if (c != 0) {
                if (c == 1) {
                    this.f28607W.setSelected(true);
                } else if (c == 2) {
                    this.f28608X.setSelected(true);
                }
            }
            if (complaintListBean.isAllow_feedback()) {
                this.f28607W.setEnabled(true);
                this.f28608X.setEnabled(true);
            } else {
                this.f28607W.setEnabled(false);
                this.f28608X.setEnabled(false);
            }
            if (!TextUtils.isEmpty(complaintListBean.getAdmin_reply_at())) {
                this.f28623k0.setText(complaintListBean.getAdmin_reply_at());
            } else {
                this.f28623k0.setVisibility(8);
            }
            this.f28602R.setVisibility(this.f28633u0.is_editable() ? 0 : 8);
            this.f28614b0.setImageResource(C10232R.C10235drawable.ic_mode_edit_24dp);
            this.f28602R.setContentDescription(getString(C10232R.string.lbl_edit));
            if (this.f28633u0.getStatus_code().intValue() == 4) {
                this.f28600P.setVisibility(8);
                this.f28603S.setVisibility(8);
                this.f28627o0.setVisibility(8);
            } else if (this.f28633u0.getStatus_code().intValue() == 3) {
                this.f28600P.setVisibility(0);
                this.f28603S.setVisibility(0);
            } else if (this.f28633u0.getStatus_code().intValue() != 2) {
                this.f28600P.setVisibility(8);
            } else if (!TextUtils.isEmpty(complaintListBean.getAdmin_reply())) {
                this.f28600P.setVisibility(8);
                this.f28603S.setVisibility(8);
                this.f28627o0.setVisibility(8);
            } else {
                this.f28600P.setVisibility(8);
            }
            this.f28631s0 = complaintListBean.getComplaint_id();
        }
    }

    /* renamed from: a */
    private void m48684a(String str, ImageView imageView, int i) {
        imageView.setVisibility(4);
        m48681a(i, true);
        C2232l.m11636a((C1376c) this).mo9515a(str).mo9441j().m11411d().m11405c((int) C10232R.C10235drawable.ic_image_placeholder).mo9458b(new C10542c(imageView, imageView, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48681a(int i, boolean z) {
        int i2 = 0;
        if (i == 1) {
            ProgressBar progressBar = this.f28628p0;
            if (!z) {
                i2 = 8;
            }
            progressBar.setVisibility(i2);
        } else if (i == 2) {
            ProgressBar progressBar2 = this.f28629q0;
            if (!z) {
                i2 = 8;
            }
            progressBar2.setVisibility(i2);
        } else if (i == 3) {
            ProgressBar progressBar3 = this.f28630r0;
            if (!z) {
                i2 = 8;
            }
            progressBar3.setVisibility(i2);
        }
    }
}
