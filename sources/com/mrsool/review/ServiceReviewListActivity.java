package com.mrsool.review;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0986h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C1814j;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.p296f.C6845b;
import com.mrsool.C10232R;
import com.mrsool.C10797g;
import com.mrsool.newBean.DeleteReview;
import com.mrsool.newBean.GetReviews;
import com.mrsool.newBean.ReviewBean;
import com.mrsool.newBean.SubmitRatingBean;
import com.mrsool.newBean.VoteReview;
import com.mrsool.newBean.WriteRatingReviewBean;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11652p;
import com.mrsool.utils.C11652p.C11656d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceReviewListActivity extends C10797g implements OnClickListener, C11056p {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public int f30880A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public C11652p f30881B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public SwipeRefreshLayout f30882C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public String f30883D0 = "";
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public ViewGroup f30884E0;

    /* renamed from: F0 */
    private OnGlobalLayoutListener f30885F0 = new C11152c();

    /* renamed from: r0 */
    private TextView f30886r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public TextView f30887s0;

    /* renamed from: t0 */
    private RecyclerView f30888t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public ArrayList<ReviewBean> f30889u0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public C11177b f30890v0;

    /* renamed from: w0 */
    private ImageView f30891w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public C5665a f30892x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public AppSingleton f30893y0;

    /* renamed from: z0 */
    private LinearLayout f30894z0;

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$a */
    class C11150a implements Callback<DeleteReview> {

        /* renamed from: a */
        final /* synthetic */ int f30895a;

        C11150a(int i) {
            this.f30895a = i;
        }

        public void onFailure(Call<DeleteReview> call, Throwable th) {
            C5887x xVar = ServiceReviewListActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                ServiceReviewListActivity serviceReviewListActivity = ServiceReviewListActivity.this;
                serviceReviewListActivity.f29642a.mo23615f(serviceReviewListActivity.getString(C10232R.string.msg_error_server_issue), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<DeleteReview> call, Response<DeleteReview> response) {
            C5887x xVar = ServiceReviewListActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                if (!response.isSuccessful() || ((DeleteReview) response.body()).getCode() > 300) {
                    ServiceReviewListActivity.this.f29642a.mo23615f(response.message(), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    ServiceReviewListActivity.this.f30889u0.remove(this.f30895a);
                    ServiceReviewListActivity.this.f30890v0.mo7341e();
                    ServiceReviewListActivity.this.setResult(-1);
                    if (((DeleteReview) response.body()).getShopReviewBean() != null) {
                        ServiceReviewListActivity.this.f30893y0.f16955b.getShop().setRating(((DeleteReview) response.body()).getShopReviewBean().getRating());
                        ServiceReviewListActivity.this.f30893y0.f16955b.getShop().setTotalReviews(((DeleteReview) response.body()).getShopReviewBean().getTotalReviews());
                    }
                    ServiceReviewListActivity.this.m50566P();
                    ServiceReviewListActivity serviceReviewListActivity = ServiceReviewListActivity.this;
                    C5887x xVar2 = serviceReviewListActivity.f29642a;
                    if (xVar2 != null) {
                        xVar2.mo23576b((Context) serviceReviewListActivity, ((DeleteReview) response.body()).getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$b */
    class C11151b implements Callback<VoteReview> {

        /* renamed from: a */
        final /* synthetic */ int f30897a;

        C11151b(int i) {
            this.f30897a = i;
        }

        public void onFailure(Call<VoteReview> call, Throwable th) {
            ServiceReviewListActivity serviceReviewListActivity = ServiceReviewListActivity.this;
            C5887x xVar = serviceReviewListActivity.f29642a;
            if (xVar != null) {
                xVar.mo23615f(serviceReviewListActivity.getString(C10232R.string.msg_error_server_issue), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<VoteReview> call, Response<VoteReview> response) {
            if (ServiceReviewListActivity.this.f29642a != null) {
                if (!response.isSuccessful() || ((VoteReview) response.body()).getCode() > 300) {
                    ServiceReviewListActivity.this.f29642a.mo23615f(response.message(), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    ((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(this.f30897a)).setUpvote(((VoteReview) response.body()).getRateReviewBean().getUpvote());
                    ((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(this.f30897a)).setDownvote(((VoteReview) response.body()).getRateReviewBean().getDownvote());
                    ServiceReviewListActivity.this.f30890v0.mo7337d(this.f30897a);
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$c */
    class C11152c implements OnGlobalLayoutListener {
        C11152c() {
        }

        public void onGlobalLayout() {
            if (ServiceReviewListActivity.this.f30884E0.getRootView().getHeight() - ServiceReviewListActivity.this.f30884E0.getHeight() >= 500) {
                C5880q.m25751b("Keyboard opens...");
                if (ServiceReviewListActivity.this.f29642a.mo23497S()) {
                    ServiceReviewListActivity.this.mo38430K();
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$d */
    class C11153d extends C11725f {
        C11153d() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            ServiceReviewListActivity.this.mo38982k(i);
        }

        /* renamed from: f */
        public void mo38988f(int i) {
            ServiceReviewListActivity.this.mo38980a(i, true);
        }

        /* renamed from: g */
        public void mo38989g(int i) {
            ServiceReviewListActivity.this.mo38980a(i, false);
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$e */
    class C11154e implements C11656d {
        C11154e() {
        }

        /* renamed from: a */
        public void mo38990a() {
        }

        /* renamed from: a */
        public void mo38991a(int i) {
            ServiceReviewListActivity.this.mo36519N();
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$f */
    class C11155f implements C1814j {
        C11155f() {
        }

        /* renamed from: a */
        public void mo8147a() {
            if (ServiceReviewListActivity.this.f30882C0.mo8107b()) {
                ServiceReviewListActivity.this.f30883D0 = "";
                ServiceReviewListActivity.this.f30881B0.mo40006h();
                ServiceReviewListActivity.this.f30881B0.mo40008j();
            }
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$g */
    class C11156g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30903a;

        /* renamed from: com.mrsool.review.ServiceReviewListActivity$g$a */
        class C11157a implements Runnable {
            C11157a() {
            }

            public void run() {
                C11156g gVar = C11156g.this;
                ServiceReviewListActivity.this.f30880A0 = gVar.f30903a;
                WriteRatingReviewBean writeRatingReviewBean = new WriteRatingReviewBean();
                writeRatingReviewBean.setShopId(ServiceReviewListActivity.this.f30893y0.f16955b.getShop().getVShopId());
                writeRatingReviewBean.setRating(((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(C11156g.this.f30903a)).getRating());
                writeRatingReviewBean.setReview(((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(C11156g.this.f30903a)).getReview());
                writeRatingReviewBean.setShopPic(((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(C11156g.this.f30903a)).getServicePic());
                writeRatingReviewBean.setTitle(((ReviewBean) ServiceReviewListActivity.this.f30889u0.get(C11156g.this.f30903a)).getReviewHeader());
                ServiceReviewListActivity.this.mo38434a(writeRatingReviewBean, true);
            }
        }

        C11156g(int i) {
            this.f30903a = i;
        }

        public void onClick(View view) {
            ServiceReviewListActivity.this.f30892x0.hide();
            new Handler().postDelayed(new C11157a(), 100);
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$h */
    class C11158h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30906a;

        C11158h(int i) {
            this.f30906a = i;
        }

        public void onClick(View view) {
            ServiceReviewListActivity.this.mo38983l(this.f30906a);
            ServiceReviewListActivity.this.f30892x0.hide();
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$i */
    class C11159i implements Callback<GetReviews> {
        C11159i() {
        }

        public void onFailure(Call<GetReviews> call, Throwable th) {
            ServiceReviewListActivity serviceReviewListActivity = ServiceReviewListActivity.this;
            if (serviceReviewListActivity.f29642a != null) {
                serviceReviewListActivity.f30881B0.mo39999b();
                if (ServiceReviewListActivity.this.f30882C0.mo8107b()) {
                    ServiceReviewListActivity.this.f30882C0.setRefreshing(false);
                }
                if (ServiceReviewListActivity.this.f30881B0.mo40002d() == 1 && !ServiceReviewListActivity.this.f30882C0.mo8107b()) {
                    ServiceReviewListActivity.this.f29642a.mo23492O();
                }
                ServiceReviewListActivity serviceReviewListActivity2 = ServiceReviewListActivity.this;
                serviceReviewListActivity2.f29642a.mo23615f(serviceReviewListActivity2.getString(C10232R.string.msg_error_server_issue), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetReviews> call, Response<GetReviews> response) {
            ServiceReviewListActivity serviceReviewListActivity = ServiceReviewListActivity.this;
            if (serviceReviewListActivity.f29642a != null) {
                if (serviceReviewListActivity.f30881B0.mo40002d() == 1 && !ServiceReviewListActivity.this.f30882C0.mo8107b()) {
                    ServiceReviewListActivity.this.f29642a.mo23492O();
                }
                if (!response.isSuccessful() || ((GetReviews) response.body()).getCode() > 300) {
                    ServiceReviewListActivity.this.f30881B0.mo39999b();
                    ServiceReviewListActivity.this.f29642a.mo23615f(response.message(), ServiceReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    if (((GetReviews) response.body()).getPageBean() != null) {
                        ServiceReviewListActivity.this.f30881B0.mo39997a(((GetReviews) response.body()).getPageBean().getTotalPages());
                    }
                    if (ServiceReviewListActivity.this.f30881B0.mo40002d() == 1) {
                        ServiceReviewListActivity.this.f30889u0.clear();
                    }
                    ServiceReviewListActivity.this.f30889u0.addAll(((GetReviews) response.body()).getArrayListReview());
                    ServiceReviewListActivity.this.f30890v0.mo7341e();
                    ServiceReviewListActivity.this.f30881B0.mo39996a();
                    ServiceReviewListActivity.this.f30887s0.setText(((GetReviews) response.body()).getMessage());
                    ServiceReviewListActivity.this.m50566P();
                }
                if (ServiceReviewListActivity.this.f30882C0.mo8107b()) {
                    ServiceReviewListActivity.this.f30882C0.setRefreshing(false);
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$j */
    class C11160j implements DialogInterface.OnClickListener {
        C11160j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mrsool.review.ServiceReviewListActivity$k */
    class C11161k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30910a;

        C11161k(int i) {
            this.f30910a = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ServiceReviewListActivity.this.mo38981j(this.f30910a);
        }
    }

    /* renamed from: O */
    private void m50565O() {
        this.f30893y0 = (AppSingleton) getApplicationContext();
        this.f30894z0 = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f30887s0 = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f30891w0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f30891w0.setOnClickListener(this);
        this.f30884E0 = (ViewGroup) findViewById(C10232R.C10236id.llMain);
        this.f30884E0.getViewTreeObserver().addOnGlobalLayoutListener(this.f30885F0);
        this.f30888t0 = (RecyclerView) findViewById(C10232R.C10236id.rvReview);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(1);
        this.f30888t0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f30888t0.setItemAnimator(this.f29642a.mo23672x());
        this.f30890v0 = new C11177b(this, this.f30889u0, new C11153d());
        this.f30888t0.setAdapter(this.f30890v0);
        this.f30886r0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f30886r0.setText(getString(C10232R.string.lbl_reviews));
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a(this.f30891w0);
        }
        this.f30881B0 = new C11652p(this.f30888t0, this.f30889u0);
        this.f30881B0.mo39998a((C11656d) new C11154e());
        this.f30882C0 = (SwipeRefreshLayout) findViewById(C10232R.C10236id.pullToRefresh);
        this.f30882C0.setColorSchemeColors(-16776961, C0986h.f4419u, -16776961);
        this.f30882C0.setColorSchemeColors(C0841b.m4915a((Context) this, (int) C10232R.C10234color.colorAccent));
        this.f30882C0.setOnRefreshListener(new C11155f());
        this.f30881B0.mo40008j();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m50566P() {
        if (this.f30889u0.size() > 0) {
            this.f30894z0.setVisibility(8);
            this.f30888t0.setVisibility(0);
            return;
        }
        this.f30894z0.setVisibility(0);
        this.f30888t0.setVisibility(8);
    }

    /* renamed from: N */
    public void mo36519N() {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        if (this.f30881B0.mo40002d() == 1 && !this.f30882C0.mo8107b()) {
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        if (this.f30883D0.equals("")) {
            this.f30883D0 = String.valueOf(System.currentTimeMillis() / 1000);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("timestamp", this.f30883D0);
        hashMap.put("page", String.valueOf(this.f30881B0.mo40002d()));
        C11687c.m52645a(this.f29642a).getReviewList(this.f30893y0.f16955b.getShop().getVShopId(), hashMap).enqueue(new C11159i());
    }

    /* renamed from: j */
    public void mo38981j(int i) {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        C11687c.m52645a(this.f29642a).deleteReview(((ReviewBean) this.f30889u0.get(i)).getId()).enqueue(new C11150a(i));
    }

    /* renamed from: k */
    public void mo38982k(int i) {
        View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_edit_delete, null);
        inflate.findViewById(C10232R.C10236id.llEdit).setOnClickListener(new C11156g(i));
        inflate.findViewById(C10232R.C10236id.llDelete).setOnClickListener(new C11158h(i));
        this.f30892x0 = new C5665a(this);
        this.f30892x0.setContentView(inflate);
        this.f30892x0.show();
    }

    /* renamed from: l */
    public void mo38983l(int i) {
        C6845b bVar = new C6845b(this, C10232R.style.AlertDialogTheme);
        bVar.mo770b((CharSequence) getString(C10232R.string.app_name)).mo758a((CharSequence) getString(C10232R.string.msg_ask_to_delete_review)).mo760a(false).mo776c((CharSequence) getString(C10232R.string.lbl_dg_title_yes), (DialogInterface.OnClickListener) new C11161k(i)).mo759a((CharSequence) getString(C10232R.string.lbl_dg_title_no), (DialogInterface.OnClickListener) new C11160j());
        bVar.mo778c();
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
        setContentView((int) C10232R.layout.activity_review);
        m50565O();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10232R.C10237menu.menu_map, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (((str.hashCode() == 605598949 && str.equals("StoreRateNReview")) ? (char) 0 : 65535) == 0) {
            setResult(-1);
            this.f29660S.dismiss();
            this.f29660S = null;
            if (this.f29675h0 != null) {
                ((ReviewBean) this.f30889u0.get(this.f30880A0)).setRating(this.f29675h0.getWriteRatingReviewBean().getRating());
                ((ReviewBean) this.f30889u0.get(this.f30880A0)).setReview(this.f29675h0.getWriteRatingReviewBean().getReview());
            }
            SubmitRatingBean submitRatingBean = this.f29675h0;
            if (!(submitRatingBean == null || submitRatingBean.getShopReviewBean() == null)) {
                this.f30893y0.f16955b.getShop().setRating(this.f29675h0.getShopReviewBean().getRating());
                this.f30893y0.f16955b.getShop().setTotalReviews(this.f29675h0.getShopReviewBean().getTotalReviews());
            }
            this.f30890v0.mo7337d(this.f30880A0);
        }
    }

    /* renamed from: a */
    public void mo38980a(int i, boolean z) {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", z ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1");
        String str = "";
        String str2 = C11644i.f33355l6;
        String str3 = C11644i.f33346k6;
        if (z) {
            if (((ReviewBean) this.f30889u0.get(i)).getUserAction().equals(str2)) {
                ((ReviewBean) this.f30889u0.get(i)).setUserAction(str);
            } else {
                ((ReviewBean) this.f30889u0.get(i)).getUserAction().equals(str3);
                ((ReviewBean) this.f30889u0.get(i)).setUserAction(str2);
            }
        } else if (((ReviewBean) this.f30889u0.get(i)).getUserAction().equals(str3)) {
            ((ReviewBean) this.f30889u0.get(i)).setUserAction(str);
        } else {
            ((ReviewBean) this.f30889u0.get(i)).getUserAction().equals(str2);
            ((ReviewBean) this.f30889u0.get(i)).setUserAction(str3);
        }
        this.f30890v0.mo7337d(i);
        C11687c.m52645a(this.f29642a).voteReview(((ReviewBean) this.f30889u0.get(i)).getId(), hashMap).enqueue(new C11151b(i));
    }
}
