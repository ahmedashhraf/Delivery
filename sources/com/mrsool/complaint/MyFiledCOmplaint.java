package com.mrsool.complaint;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
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
import com.mrsool.bean.ComplaintListBean;
import com.mrsool.bean.ComplaintListMainBean;
import com.mrsool.complaint.C10547a.C10551d;
import com.mrsool.order.FileComplainActivity;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C5882b;
import java.util.ArrayList;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyFiledCOmplaint extends C0295d implements OnClickListener {

    /* renamed from: N */
    private LinearLayout f28640N;

    /* renamed from: O */
    private ImageView f28641O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ProgressBar f28642P;

    /* renamed from: Q */
    private RecyclerView f28643Q;

    /* renamed from: R */
    private TextView f28644R;

    /* renamed from: S */
    ArrayList<ComplaintListBean> f28645S;

    /* renamed from: T */
    C10547a f28646T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public int f28647U = -1;

    /* renamed from: V */
    WrapContentLinearLayoutManager f28648V;

    /* renamed from: W */
    private BroadcastReceiver f28649W = new C10546c();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f28650a;

    /* renamed from: b */
    private TextView f28651b;

    /* renamed from: com.mrsool.complaint.MyFiledCOmplaint$a */
    class C10544a implements Callback<ComplaintListMainBean> {
        C10544a() {
        }

        public void onFailure(Call<ComplaintListMainBean> call, Throwable th) {
            try {
                MyFiledCOmplaint.this.f28642P.setVisibility(8);
                if (MyFiledCOmplaint.this.f28650a != null) {
                    MyFiledCOmplaint.this.f28650a.mo23492O();
                    MyFiledCOmplaint.this.f28650a.mo23615f(MyFiledCOmplaint.this.getString(C10232R.string.msg_error_server_issue), MyFiledCOmplaint.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<ComplaintListMainBean> call, Response<ComplaintListMainBean> response) {
            MyFiledCOmplaint.this.f28642P.setVisibility(8);
            if (response.isSuccessful()) {
                if (((ComplaintListMainBean) response.body()).getCode().intValue() <= 300) {
                    MyFiledCOmplaint.this.m48704c(response);
                } else {
                    MyFiledCOmplaint.this.f28650a.mo23615f(((ComplaintListMainBean) response.body()).getMessage(), MyFiledCOmplaint.this.getString(C10232R.string.app_name));
                }
            } else if (MyFiledCOmplaint.this.f28650a != null) {
                MyFiledCOmplaint.this.f28650a.mo23615f(response.message(), MyFiledCOmplaint.this.getString(C10232R.string.app_name));
            }
        }
    }

    /* renamed from: com.mrsool.complaint.MyFiledCOmplaint$b */
    class C10545b implements C10551d {
        C10545b() {
        }

        /* renamed from: a */
        public void mo37927a(int i) {
            if (MyFiledCOmplaint.this.f28650a.mo23502X()) {
                Intent intent = new Intent(MyFiledCOmplaint.this, ComplaintDetailActivity.class);
                intent.putExtra(C11644i.f33439w1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getComplaint_number());
                intent.putExtra(C11644i.f33051B1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getComplaint_id());
                MyFiledCOmplaint.this.startActivity(intent);
            }
        }

        /* renamed from: b */
        public void mo37928b(int i) {
            if (MyFiledCOmplaint.this.f28650a.mo23502X()) {
                Intent intent = new Intent(MyFiledCOmplaint.this, FileComplainActivity.class);
                intent.putExtra(C11644i.f33314h1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getOrder_id() != null ? ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getOrder_id() : ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getOrder());
                intent.putExtra(C11644i.f33439w1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getComplaint_number());
                intent.putExtra(C11644i.f33051B1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getComplaint_id());
                intent.putExtra(C11644i.f33447x1, ((ComplaintListBean) MyFiledCOmplaint.this.f28645S.get(i)).getReason_id());
                intent.putExtra(C11644i.f33043A1, true);
                intent.putExtra(C11644i.f33059C1, true);
                intent.putExtra(C11644i.f33367n1, "");
                MyFiledCOmplaint.this.startActivity(intent);
                MyFiledCOmplaint.this.f28647U = i;
            }
        }
    }

    /* renamed from: com.mrsool.complaint.MyFiledCOmplaint$c */
    class C10546c extends BroadcastReceiver {
        C10546c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33308g4)) {
                MyFiledCOmplaint.this.m48695C();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m48695C() {
        this.f28642P.setVisibility(0);
        C5882b.m25774a(this.f28650a).getAllComplaints(this.f28650a.mo23476G()).enqueue(new C10544a());
    }

    /* renamed from: D */
    private void m48696D() {
        this.f28650a = new C5887x(this);
        this.f28645S = new ArrayList<>();
        m48698G();
        this.f28642P = (ProgressBar) findViewById(C10232R.C10236id.pgComplaint);
        this.f28643Q = (RecyclerView) findViewById(C10232R.C10236id.rvComplaints);
        this.f28640N = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f28644R = (TextView) findViewById(C10232R.C10236id.txtNDF);
        m48697E();
        this.f28650a.mo23540a(this.f28649W, C11644i.f33308g4);
        if (this.f28650a.mo23502X()) {
            m48695C();
        }
    }

    /* renamed from: E */
    private void m48697E() {
        this.f28648V = new WrapContentLinearLayoutManager(this);
        this.f28648V.mo7000l(1);
        this.f28643Q.setLayoutManager(this.f28648V);
        this.f28643Q.setItemAnimator(this.f28650a.mo23672x());
        this.f28643Q.setNestedScrollingEnabled(false);
    }

    /* renamed from: G */
    private void m48698G() {
        this.f28651b = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f28651b.setText(getResources().getString(C10232R.string.lbl_my_filed_complaint));
        this.f28641O = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28641O.setOnClickListener(this);
        if (this.f28650a.mo23496R()) {
            this.f28641O.setScaleX(-1.0f);
        }
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
        setContentView((int) C10232R.layout.activity_my_filed_complaint);
        m48696D();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C2128a.m11089a((Context) this).mo9217a(this.f28649W);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48704c(Response<ComplaintListMainBean> response) {
        this.f28645S = ((ComplaintListMainBean) response.body()).getComplaints();
        ArrayList<ComplaintListBean> arrayList = this.f28645S;
        if (arrayList == null) {
            this.f28640N.setVisibility(0);
            this.f28643Q.setVisibility(8);
        } else if (arrayList.size() > 0) {
            this.f28643Q.setVisibility(0);
            this.f28646T = new C10547a(this.f28645S, this);
            this.f28643Q.setAdapter(this.f28646T);
            this.f28646T.mo37930a((C10551d) new C10545b());
        } else {
            this.f28644R.setText(TextUtils.isEmpty(((ComplaintListMainBean) response.body()).getMessage()) ? getString(C10232R.string.hint_no_data_found) : ((ComplaintListMainBean) response.body()).getMessage());
            this.f28640N.setVisibility(0);
            this.f28643Q.setVisibility(8);
        }
    }
}
