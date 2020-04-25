package com.mrsool.order;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.bean.CancelReasonBean;
import com.mrsool.bean.ComplainAttachmentBean;
import com.mrsool.bean.ComplaintDetailMainBean;
import com.mrsool.bean.ComplaintListBean;
import com.mrsool.bean.OrderReasonBean;
import com.mrsool.bean.ReasonBean;
import com.mrsool.bean.ReasonMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.customeview.CustomeEditTextRobotoRegular;
import com.mrsool.customeview.CustomeTextViewRobotoBold;
import com.mrsool.p425y.C11759b;
import com.mrsool.p425y.C11759b.C11760a;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.webservice.C11687c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p053b.p072g.p073b.C2128a;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FileComplainActivity extends C0295d implements OnClickListener, C11056p, C11760a {

    /* renamed from: N */
    public TextView f30279N;

    /* renamed from: O */
    public TextView f30280O;

    /* renamed from: P */
    private ImageView f30281P;

    /* renamed from: Q */
    private ImageView f30282Q;

    /* renamed from: R */
    public List<ReasonBean> f30283R = new ArrayList();

    /* renamed from: S */
    private CustomeEditTextRobotoRegular f30284S;

    /* renamed from: T */
    private C11669t f30285T;

    /* renamed from: U */
    private int f30286U = 0;

    /* renamed from: V */
    private boolean f30287V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f30288W = false;

    /* renamed from: X */
    private Bundle f30289X;

    /* renamed from: Y */
    private int f30290Y = -1;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ComplaintListBean f30291Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f30292a;

    /* renamed from: a0 */
    private String f30293a0;

    /* renamed from: b */
    public ImageView f30294b;

    /* renamed from: b0 */
    private String f30295b0;

    /* renamed from: c0 */
    private LinearLayout f30296c0;

    /* renamed from: d0 */
    private ReasonBean f30297d0;

    /* renamed from: e0 */
    private OrderReasonBean f30298e0;

    /* renamed from: f0 */
    private RecyclerView f30299f0;

    /* renamed from: g0 */
    private ArrayList<ComplainAttachmentBean> f30300g0;

    /* renamed from: h0 */
    private C10992g f30301h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public CustomeTextViewRobotoBold f30302i0;

    /* renamed from: j0 */
    private final String f30303j0;

    /* renamed from: com.mrsool.order.FileComplainActivity$a */
    class C10975a implements Callback<ReasonMainBean> {
        C10975a() {
        }

        public void onFailure(Call<ReasonMainBean> call, Throwable th) {
            if (FileComplainActivity.this.f30292a != null) {
                FileComplainActivity.this.f30292a.mo23653q0();
            }
        }

        public void onResponse(Call<ReasonMainBean> call, Response<ReasonMainBean> response) {
            if (FileComplainActivity.this.f30292a != null) {
                FileComplainActivity.this.f30292a.mo23492O();
                if (response.isSuccessful()) {
                    if (((ReasonMainBean) response.body()).getCode() <= 300) {
                        FileComplainActivity.this.m50067c(response);
                        String a = FileComplainActivity.this.f30292a.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            FileComplainActivity.this.f30292a.mo23551a(new ServiceManualDataBean("", a));
                        }
                    } else if (((ReasonMainBean) response.body()).getCode() == 402) {
                        FileComplainActivity.this.f30292a.mo23609d0();
                    } else {
                        FileComplainActivity.this.f30292a.mo23615f(((ReasonMainBean) response.body()).getMessage(), FileComplainActivity.this.getString(C10232R.string.app_name));
                    }
                } else if (FileComplainActivity.this.f30292a != null) {
                    FileComplainActivity.this.f30292a.mo23615f(response.message(), FileComplainActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.FileComplainActivity$b */
    class C10976b implements Callback<ServiceManualDefaultBean> {
        C10976b() {
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            FileComplainActivity.this.f30302i0.setEnabled(true);
            FileComplainActivity.this.f30292a.mo23653q0();
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            try {
                if (FileComplainActivity.this.f30292a != null) {
                    FileComplainActivity.this.f30292a.mo23492O();
                    if (response.isSuccessful()) {
                        if (((ServiceManualDefaultBean) response.body()).getCode().intValue() <= 300) {
                            FileComplainActivity.this.f30292a.mo23473E(C11644i.f33299f4);
                            FileComplainActivity.this.f30292a.mo23489M(((ServiceManualDefaultBean) response.body()).getMessage());
                            String a = FileComplainActivity.this.f30292a.mo23528a(response.body());
                            String str = "action_back";
                            if (!TextUtils.isEmpty(a)) {
                                FileComplainActivity.this.f30292a.mo23551a(new ServiceManualDataBean(str, a));
                            } else {
                                FileComplainActivity.this.mo36511f(str);
                            }
                        } else {
                            FileComplainActivity.this.f30302i0.setEnabled(true);
                            FileComplainActivity.this.f30292a.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), FileComplainActivity.this.getString(C10232R.string.app_name));
                        }
                    } else if (((ServiceManualDefaultBean) response.body()).getCode().intValue() == 402) {
                        FileComplainActivity.this.f30292a.mo23609d0();
                    } else {
                        try {
                            FileComplainActivity.this.f30292a.mo23615f(response.message(), FileComplainActivity.this.getString(C10232R.string.app_name));
                            FileComplainActivity.this.f30302i0.setEnabled(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception e2) {
                FileComplainActivity.this.f30292a.mo23492O();
                FileComplainActivity.this.f30302i0.setEnabled(true);
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.FileComplainActivity$c */
    class C10977c implements C11673d {
        C10977c() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            Intent intent = new Intent(FileComplainActivity.this, TakeImages.class);
            intent.putExtra("PicType", FileComplainActivity.this.getString(C10232R.string.lbl_dg_title_both));
            intent.putExtra("pictureRatio", "1,1");
            FileComplainActivity.this.startActivityForResult(intent, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.order.FileComplainActivity$d */
    class C10978d implements Callback<ComplaintDetailMainBean> {
        C10978d() {
        }

        public void onFailure(Call<ComplaintDetailMainBean> call, Throwable th) {
            FileComplainActivity.this.f30292a.mo23653q0();
        }

        public void onResponse(Call<ComplaintDetailMainBean> call, Response<ComplaintDetailMainBean> response) {
            FileComplainActivity.this.f30292a.mo23492O();
            if (response.isSuccessful()) {
                if (((ComplaintDetailMainBean) response.body()).getCode().intValue() <= 300) {
                    FileComplainActivity.this.f30291Z = (ComplaintListBean) ((ComplaintDetailMainBean) response.body()).getComplaint().get(0);
                    FileComplainActivity.this.m50061a((ComplaintListBean) ((ComplaintDetailMainBean) response.body()).getComplaint().get(0));
                    FileComplainActivity.this.f30288W = true;
                    String a = FileComplainActivity.this.f30292a.mo23528a(response.body());
                    if (!TextUtils.isEmpty(a)) {
                        FileComplainActivity.this.f30292a.mo23551a(new ServiceManualDataBean("", a));
                    }
                } else if (((ComplaintDetailMainBean) response.body()).getCode().intValue() == 402) {
                    FileComplainActivity.this.f30292a.mo23609d0();
                } else {
                    FileComplainActivity.this.f30292a.mo23615f(((ComplaintDetailMainBean) response.body()).getMessage(), FileComplainActivity.this.getString(C10232R.string.app_name));
                }
            } else if (FileComplainActivity.this.f30292a != null) {
                FileComplainActivity.this.f30292a.mo23615f(response.message(), FileComplainActivity.this.getString(C10232R.string.app_name));
            }
        }
    }

    /* renamed from: com.mrsool.order.FileComplainActivity$e */
    class C10979e implements Callback<ComplaintDetailMainBean> {
        C10979e() {
        }

        public void onFailure(Call<ComplaintDetailMainBean> call, Throwable th) {
            FileComplainActivity.this.f30302i0.setEnabled(true);
            FileComplainActivity.this.f30292a.mo23653q0();
        }

        public void onResponse(Call<ComplaintDetailMainBean> call, Response<ComplaintDetailMainBean> response) {
            try {
                if (FileComplainActivity.this.f30292a != null) {
                    FileComplainActivity.this.f30292a.mo23492O();
                    if (!response.isSuccessful()) {
                        try {
                            FileComplainActivity.this.f30292a.mo23615f(response.message(), FileComplainActivity.this.getString(C10232R.string.app_name));
                            FileComplainActivity.this.f30302i0.setEnabled(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (((ComplaintDetailMainBean) response.body()).getCode().intValue() <= 300) {
                        FileComplainActivity.this.f30302i0.setEnabled(true);
                        if (((ComplaintDetailMainBean) response.body()).getComplaint().size() > 0) {
                            ComplaintListBean complaintListBean = (ComplaintListBean) ((ComplaintDetailMainBean) response.body()).getComplaint().get(0);
                            Intent intent = new Intent(C11644i.f33308g4);
                            intent.putExtra(C11644i.f33455y1, complaintListBean);
                            C2128a.m11089a((Context) FileComplainActivity.this).mo9219a(intent);
                        }
                        String a = FileComplainActivity.this.f30292a.mo23528a(response.body());
                        String str = "action_back";
                        if (!TextUtils.isEmpty(a)) {
                            FileComplainActivity.this.f30292a.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            FileComplainActivity.this.mo36511f(str);
                        }
                    } else if (((ComplaintDetailMainBean) response.body()).getCode().intValue() == 402) {
                        FileComplainActivity.this.f30292a.mo23609d0();
                    } else {
                        FileComplainActivity.this.f30302i0.setEnabled(true);
                        FileComplainActivity.this.f30292a.mo23615f(((ComplaintDetailMainBean) response.body()).getMessage(), FileComplainActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public FileComplainActivity() {
        String str = "";
        this.f30293a0 = str;
        this.f30295b0 = str;
        this.f30300g0 = new ArrayList<>(3);
        this.f30303j0 = "action_back";
    }

    /* renamed from: C */
    private void m50048C() {
        this.f30285T.mo40036a(C11644i.f33330j, (C11673d) new C10977c());
    }

    /* renamed from: D */
    private void m50049D() {
        HashMap hashMap = new HashMap();
        hashMap.put("current_user", this.f30292a.mo23468C().mo23459f("user_id"));
        hashMap.put("auth_token", this.f30292a.mo23468C().mo23459f(C11644i.f33443w5));
        hashMap.put("complaint_number", getIntent().getExtras().getString(C11644i.f33439w1));
        C11687c.m52645a(this.f30292a).getComplaintDetail(hashMap).enqueue(new C10978d());
    }

    /* renamed from: E */
    private void m50050E() {
        C5887x xVar = this.f30292a;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f30292a.mo23476G());
            hashMap.put("auth_token", this.f30292a.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("user_id", this.f30292a.mo23476G());
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f30295b0);
            hashMap.put("order_id", sb.toString());
            C11687c.m52645a(this.f30292a).getReason(hashMap).enqueue(new C10975a());
        }
    }

    /* renamed from: G */
    private void m50051G() {
        int i = 0;
        this.f30302i0.setEnabled(false);
        this.f30292a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        HashMap hashMap = new HashMap();
        C5887x xVar = this.f30292a;
        String str = "user_id";
        hashMap.put("current_user", xVar.mo23622h(xVar.mo23468C().mo23459f(str)));
        C5887x xVar2 = this.f30292a;
        hashMap.put("auth_token", xVar2.mo23622h(xVar2.mo23468C().mo23459f(C11644i.f33443w5)));
        C5887x xVar3 = this.f30292a;
        hashMap.put("complaint[complainant_id]", xVar3.mo23622h(xVar3.mo23468C().mo23459f(str)));
        C5887x xVar4 = this.f30292a;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(this.f30295b0);
        hashMap.put("complaint[order_id]", xVar4.mo23622h(sb.toString()));
        C5887x xVar5 = this.f30292a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(this.f30297d0.getCode());
        hashMap.put("complaint[reason_id]", xVar5.mo23622h(sb2.toString()));
        hashMap.put("complaint[comment]", this.f30292a.mo23622h(this.f30284S.getText().toString().trim()));
        C13875b bVar = null;
        C13875b bVar2 = null;
        C13875b bVar3 = null;
        while (i < this.f30300g0.size()) {
            String str3 = i == 1 ? "complaint[image2]" : i == 2 ? "complaint[image3]" : "complaint[image1]";
            ComplainAttachmentBean complainAttachmentBean = (ComplainAttachmentBean) this.f30300g0.get(i);
            if (!TextUtils.isEmpty(complainAttachmentBean.getImageUri())) {
                C13875b a = C13875b.m59383a(str3, new File(complainAttachmentBean.getImageUri()).getName(), C13817d0.create(C13872x.m59361b("image/*"), new File(complainAttachmentBean.getImageUri())));
                if (i == 0) {
                    bVar = a;
                } else if (i == 1) {
                    bVar2 = a;
                } else if (i == 2) {
                    bVar3 = a;
                }
            }
            i++;
        }
        C11687c.m52645a(this.f30292a).CreateCompaint(hashMap, bVar, bVar2, bVar3).enqueue(new C10976b());
    }

    /* renamed from: H */
    private void m50052H() {
        int i = 0;
        this.f30302i0.setEnabled(false);
        this.f30292a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        HashMap hashMap = new HashMap();
        C5887x xVar = this.f30292a;
        hashMap.put("current_user_id", xVar.mo23622h(xVar.mo23468C().mo23459f("user_id")));
        C5887x xVar2 = this.f30292a;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(getIntent().getExtras().getString(C11644i.f33051B1, str));
        hashMap.put("complaint[id]", xVar2.mo23622h(sb.toString()));
        C5887x xVar3 = this.f30292a;
        hashMap.put("auth_token", xVar3.mo23622h(xVar3.mo23468C().mo23459f(C11644i.f33443w5)));
        C5887x xVar4 = this.f30292a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f30295b0);
        hashMap.put("complaint[order_id]", xVar4.mo23622h(sb2.toString()));
        C5887x xVar5 = this.f30292a;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f30297d0.getCode());
        hashMap.put("complaint[reason_id]", xVar5.mo23622h(sb3.toString()));
        hashMap.put("complaint[comment]", this.f30292a.mo23622h(this.f30284S.getText().toString().trim()));
        C13875b bVar = null;
        C13875b bVar2 = null;
        C13875b bVar3 = null;
        while (i < this.f30300g0.size()) {
            String str2 = i == 1 ? "complaint[image2]" : i == 2 ? "complaint[image3]" : "complaint[image1]";
            ComplainAttachmentBean complainAttachmentBean = (ComplainAttachmentBean) this.f30300g0.get(i);
            if (!TextUtils.isEmpty(complainAttachmentBean.getImageUri()) && !complainAttachmentBean.isServerImage()) {
                C13875b a = C13875b.m59383a(str2, new File(complainAttachmentBean.getImageUri()).getName(), C13817d0.create(C13872x.m59361b("image/*"), new File(complainAttachmentBean.getImageUri())));
                if (i == 0) {
                    bVar = a;
                } else if (i == 1) {
                    bVar2 = a;
                } else if (i == 2) {
                    bVar3 = a;
                }
            }
            i++;
        }
        C11687c.m52645a(this.f30292a).editCompaint(hashMap, bVar, bVar2, bVar3).enqueue(new C10979e());
    }

    /* renamed from: I */
    private void m50053I() {
        this.f30292a = new C5887x(this);
        this.f30292a.mo23553a((C11056p) this);
        this.f30285T = new C11669t(this);
        m50057M();
        this.f30284S = (CustomeEditTextRobotoRegular) findViewById(C10232R.C10236id.edComment);
        this.f30302i0 = (CustomeTextViewRobotoBold) findViewById(C10232R.C10236id.btnContinue);
        this.f30282Q = (ImageView) findViewById(C10232R.C10236id.bgContinue);
        this.f30282Q.setOnClickListener(this);
        this.f30280O = (TextView) findViewById(C10232R.C10236id.tvReason);
        this.f30296c0 = (LinearLayout) findViewById(C10232R.C10236id.llChooseReason);
        this.f30296c0.setOnClickListener(this);
        m50054J();
        this.f30289X = getIntent().getExtras();
        Bundle bundle = this.f30289X;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33043A1)) {
                this.f30287V = this.f30289X.getBoolean(C11644i.f33043A1);
            }
            if (this.f30289X.containsKey(C11644i.f33447x1)) {
                this.f30290Y = this.f30289X.getInt(C11644i.f33447x1);
            }
            if (this.f30289X.containsKey(C11644i.f33367n1)) {
                this.f30293a0 = this.f30289X.getString(C11644i.f33367n1);
            }
            if (this.f30289X.containsKey(C11644i.f33314h1)) {
                this.f30295b0 = this.f30289X.getString(C11644i.f33314h1);
            }
        }
        if (this.f30292a.mo23502X()) {
            m50050E();
            if (this.f30287V) {
                m50049D();
            }
        }
    }

    /* renamed from: J */
    private void m50054J() {
        this.f30299f0 = (RecyclerView) findViewById(C10232R.C10236id.rvAttachments);
        this.f30300g0.add(new ComplainAttachmentBean(null));
        this.f30301h0 = new C10992g(this.f30300g0, new C10980a(this));
        this.f30299f0.setAdapter(this.f30301h0);
    }

    /* renamed from: K */
    private boolean m50055K() {
        if (this.f30297d0 == null) {
            this.f30292a.mo23615f(getString(C10232R.string.alert_select_reason), getString(C10232R.string.app_name));
            return false;
        } else if (!TextUtils.isEmpty(this.f30284S.getText().toString().trim())) {
            return true;
        } else {
            this.f30292a.mo23615f(getString(C10232R.string.lbl_enter_complaint_detail), getString(C10232R.string.app_name));
            return false;
        }
    }

    /* renamed from: L */
    private void m50056L() {
        for (int i = 0; i < this.f30283R.size(); i++) {
            if (((ReasonBean) this.f30283R.get(i)).getCode().intValue() == this.f30290Y) {
                this.f30297d0 = (ReasonBean) this.f30283R.get(i);
                this.f30280O.setText(this.f30297d0.getvReason());
                return;
            }
        }
    }

    /* renamed from: M */
    private void m50057M() {
        this.f30279N = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f30279N.setText(getString(C10232R.string.title_file_a_compaint));
        this.f30281P = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f30281P.setImageDrawable(C0841b.m4928c(this, C10232R.C10235drawable.back_white));
        this.f30281P.setOnClickListener(this);
        if (this.f30292a.mo23496R()) {
            this.f30281P.setScaleX(-1.0f);
        }
    }

    /* renamed from: N */
    private void m50058N() {
        int i = 0;
        if (this.f30298e0 == null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.f30283R.size(); i2++) {
                arrayList.add(new CancelReasonBean(((ReasonBean) this.f30283R.get(i2)).getCode().toString(), ((ReasonBean) this.f30283R.get(i2)).getvReason()));
            }
            OrderReasonBean orderReasonBean = new OrderReasonBean(arrayList, 0, getString(C10232R.string.lbl_choose_a_reason), getString(C10232R.string.lbl_choose_a_reason), getString(C10232R.string.lbl_done), getString(C10232R.string.lbl_me_cancel), C10232R.C10234color.sky_blue_color);
            this.f30298e0 = orderReasonBean;
        }
        int i3 = -1;
        while (true) {
            if (i >= this.f30283R.size()) {
                break;
            }
            ReasonBean reasonBean = this.f30297d0;
            if (reasonBean != null && reasonBean.getCode().equals(((ReasonBean) this.f30283R.get(i)).getCode())) {
                i3 = i;
                break;
            }
            i++;
        }
        if (this.f30283R.size() > 0) {
            this.f30298e0.setSelectedPos(Integer.valueOf(i3));
            C11759b.m52887a(this.f30298e0).show(getSupportFragmentManager(), "ShowReasonDialogFragment");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50067c(Response<ReasonMainBean> response) {
        this.f30283R = ((ReasonMainBean) response.body()).getReasons();
        if (this.f30288W) {
            m50056L();
        }
    }

    /* renamed from: f */
    public void mo37670f(int i) {
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (str.equalsIgnoreCase("action_back")) {
            onBackPressed();
        }
    }

    /* renamed from: h */
    public /* synthetic */ void mo38739h(int i) {
        this.f30286U = i;
        m50048C();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            String str = "image_path";
            if (intent.getExtras().getString(str) != null) {
                this.f30292a.mo23481I(intent.getExtras().getString(str));
                C5887x xVar = this.f30292a;
                xVar.mo23579b(new File(xVar.mo23488M()));
                C5887x xVar2 = this.f30292a;
                xVar2.mo23605d(xVar2.mo23511a(xVar2.mo23486L()));
                if (this.f30292a.mo23484K().getWidth() == 0 || this.f30292a.mo23484K().getHeight() == 0) {
                    this.f30292a.mo23491N(getString(C10232R.string.error_upload_image));
                    return;
                }
                this.f30292a.mo23573b(1080);
                m50063a(intent.getExtras().getString(str), false);
            }
        }
    }

    public void onBackPressed() {
        Bundle bundle = this.f30289X;
        if (bundle == null || !bundle.containsKey(C11644i.f33059C1) || !this.f30289X.getBoolean(C11644i.f33059C1)) {
            setResult(-1, new Intent());
            finish();
            return;
        }
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id != C10232R.C10236id.bgContinue) {
            if (id == C10232R.C10236id.imgClose) {
                finish();
            } else if (id == C10232R.C10236id.llChooseReason) {
                m50058N();
            }
        } else if (this.f30302i0.isEnabled() && this.f30292a.mo23502X() && m50055K()) {
            if (this.f30287V) {
                m50052H();
            } else {
                m50051G();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_file_complain);
        m50053I();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f30285T;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* renamed from: a */
    private void m50063a(String str, boolean z) {
        if (this.f30300g0.size() < 3) {
            this.f30300g0.add(new ComplainAttachmentBean(null));
            this.f30301h0.mo7342e(this.f30300g0.size() - 1);
        }
        this.f30301h0.mo38757a(str, z, this.f30286U);
    }

    /* renamed from: a */
    public void mo37659a(int i, int i2) {
        this.f30297d0 = (ReasonBean) this.f30283R.get(i2);
        this.f30280O.setText(this.f30297d0.getvReason());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50061a(ComplaintListBean complaintListBean) {
        if (this.f30283R.size() > 0) {
            m50056L();
        }
        CustomeEditTextRobotoRegular customeEditTextRobotoRegular = this.f30284S;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(complaintListBean.getComment());
        customeEditTextRobotoRegular.setText(sb.toString());
        if (!TextUtils.isEmpty(complaintListBean.getImages().getImage1())) {
            this.f30286U = 0;
            m50063a(complaintListBean.getImages().getImage1(), true);
        }
        if (!TextUtils.isEmpty(complaintListBean.getImages().getImage2())) {
            this.f30286U = 1;
            m50063a(complaintListBean.getImages().getImage2(), true);
        }
        if (!TextUtils.isEmpty(complaintListBean.getImages().getImage3())) {
            this.f30286U = 2;
            m50063a(complaintListBean.getImages().getImage3(), true);
        }
    }
}
