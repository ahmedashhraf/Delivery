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
import com.mrsool.newBean.VoteReview;
import com.mrsool.newBean.WriteRatingReviewBean;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11730j;
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

public class UserReviewListActivity extends C10797g implements OnClickListener, C11056p {
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public C11652p f30912A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public SwipeRefreshLayout f30913B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public ViewGroup f30914C0;

    /* renamed from: D0 */
    private OnGlobalLayoutListener f30915D0 = new C11164c();

    /* renamed from: r0 */
    private TextView f30916r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public TextView f30917s0;

    /* renamed from: t0 */
    private ImageView f30918t0;

    /* renamed from: u0 */
    private RecyclerView f30919u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public ArrayList<ReviewBean> f30920v0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public C11182c f30921w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public C5665a f30922x0;

    /* renamed from: y0 */
    private LinearLayout f30923y0;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public int f30924z0;

    /* renamed from: com.mrsool.review.UserReviewListActivity$a */
    class C11162a implements Callback<DeleteReview> {

        /* renamed from: a */
        final /* synthetic */ int f30925a;

        C11162a(int i) {
            this.f30925a = i;
        }

        public void onFailure(Call<DeleteReview> call, Throwable th) {
            C5887x xVar = UserReviewListActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                UserReviewListActivity userReviewListActivity = UserReviewListActivity.this;
                userReviewListActivity.f29642a.mo23615f(userReviewListActivity.getString(C10232R.string.msg_error_server_issue), UserReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<DeleteReview> call, Response<DeleteReview> response) {
            C5887x xVar = UserReviewListActivity.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
                if (!response.isSuccessful() || ((DeleteReview) response.body()).getCode() > 300) {
                    UserReviewListActivity.this.f29642a.mo23615f(response.message(), UserReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    UserReviewListActivity.this.f30920v0.remove(this.f30925a);
                    UserReviewListActivity.this.f30921w0.mo7341e();
                    UserReviewListActivity.this.m50591P();
                    C5887x xVar2 = UserReviewListActivity.this.f29642a;
                    if (xVar2 != null) {
                        xVar2.mo23473E(C11644i.f33326i4);
                        UserReviewListActivity userReviewListActivity = UserReviewListActivity.this;
                        userReviewListActivity.f29642a.mo23576b((Context) userReviewListActivity, ((DeleteReview) response.body()).getMessage());
                    }
                    if (UserReviewListActivity.this.f30920v0.size() == 0) {
                        UserReviewListActivity.this.f30917s0.setText(UserReviewListActivity.this.getString(C10232R.string.no_review_found));
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$b */
    class C11163b implements Callback<VoteReview> {

        /* renamed from: a */
        final /* synthetic */ int f30927a;

        C11163b(int i) {
            this.f30927a = i;
        }

        public void onFailure(Call<VoteReview> call, Throwable th) {
            UserReviewListActivity userReviewListActivity = UserReviewListActivity.this;
            C5887x xVar = userReviewListActivity.f29642a;
            if (xVar != null) {
                xVar.mo23615f(userReviewListActivity.getString(C10232R.string.msg_error_server_issue), UserReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<VoteReview> call, Response<VoteReview> response) {
            if (UserReviewListActivity.this.f29642a != null) {
                if (!response.isSuccessful() || ((VoteReview) response.body()).getCode() > 300) {
                    UserReviewListActivity.this.f29642a.mo23615f(response.message(), UserReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    ((ReviewBean) UserReviewListActivity.this.f30920v0.get(this.f30927a)).setUpvote(((VoteReview) response.body()).getRateReviewBean().getUpvote());
                    ((ReviewBean) UserReviewListActivity.this.f30920v0.get(this.f30927a)).setDownvote(((VoteReview) response.body()).getRateReviewBean().getDownvote());
                    UserReviewListActivity.this.f30921w0.mo7337d(this.f30927a);
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$c */
    class C11164c implements OnGlobalLayoutListener {
        C11164c() {
        }

        public void onGlobalLayout() {
            if (UserReviewListActivity.this.f30914C0.getRootView().getHeight() - UserReviewListActivity.this.f30914C0.getHeight() >= 500) {
                C5880q.m25751b("Keyboard opens...");
                if (UserReviewListActivity.this.f29642a.mo23497S()) {
                    UserReviewListActivity.this.mo38430K();
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$d */
    class C11165d extends C11725f {
        C11165d() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            UserReviewListActivity.this.mo38999k(i);
        }

        /* renamed from: f */
        public void mo38988f(int i) {
            UserReviewListActivity.this.mo38997a(i, true);
        }

        /* renamed from: g */
        public void mo38989g(int i) {
            UserReviewListActivity.this.mo38997a(i, false);
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$e */
    class C11166e implements C11656d {
        C11166e() {
        }

        /* renamed from: a */
        public void mo38990a() {
        }

        /* renamed from: a */
        public void mo38991a(int i) {
            UserReviewListActivity.this.mo36519N();
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$f */
    class C11167f implements C1814j {
        C11167f() {
        }

        /* renamed from: a */
        public void mo8147a() {
            if (UserReviewListActivity.this.f30913B0.mo8107b()) {
                UserReviewListActivity.this.f30912A0.mo40006h();
                UserReviewListActivity.this.f30912A0.mo40008j();
            }
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$g */
    class C11168g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30933a;

        /* renamed from: com.mrsool.review.UserReviewListActivity$g$a */
        class C11169a implements Runnable {
            C11169a() {
            }

            public void run() {
                C11168g gVar = C11168g.this;
                UserReviewListActivity.this.f30924z0 = gVar.f30933a;
                WriteRatingReviewBean writeRatingReviewBean = new WriteRatingReviewBean();
                writeRatingReviewBean.setShopId(((ReviewBean) UserReviewListActivity.this.f30920v0.get(C11168g.this.f30933a)).getShopId());
                writeRatingReviewBean.setRating(((ReviewBean) UserReviewListActivity.this.f30920v0.get(C11168g.this.f30933a)).getRating());
                writeRatingReviewBean.setReview(((ReviewBean) UserReviewListActivity.this.f30920v0.get(C11168g.this.f30933a)).getReview());
                writeRatingReviewBean.setShopPic(((ReviewBean) UserReviewListActivity.this.f30920v0.get(C11168g.this.f30933a)).getServicePic());
                writeRatingReviewBean.setTitle(((ReviewBean) UserReviewListActivity.this.f30920v0.get(C11168g.this.f30933a)).getReviewHeader());
                UserReviewListActivity.this.mo38434a(writeRatingReviewBean, true);
            }
        }

        C11168g(int i) {
            this.f30933a = i;
        }

        public void onClick(View view) {
            UserReviewListActivity.this.f30922x0.hide();
            new Handler().postDelayed(new C11169a(), 100);
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$h */
    class C11170h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30936a;

        C11170h(int i) {
            this.f30936a = i;
        }

        public void onClick(View view) {
            UserReviewListActivity.this.mo39000l(this.f30936a);
            UserReviewListActivity.this.f30922x0.hide();
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$i */
    class C11171i implements Callback<GetReviews> {
        C11171i() {
        }

        public void onFailure(Call<GetReviews> call, Throwable th) {
            UserReviewListActivity userReviewListActivity = UserReviewListActivity.this;
            if (userReviewListActivity.f29642a != null) {
                if (userReviewListActivity.f30913B0.mo8107b()) {
                    UserReviewListActivity.this.f30913B0.setRefreshing(false);
                }
                if (UserReviewListActivity.this.f30912A0.mo40002d() == 1 && !UserReviewListActivity.this.f30913B0.mo8107b()) {
                    UserReviewListActivity.this.f29642a.mo23492O();
                }
                UserReviewListActivity userReviewListActivity2 = UserReviewListActivity.this;
                userReviewListActivity2.f29642a.mo23615f(userReviewListActivity2.getString(C10232R.string.msg_error_server_issue), UserReviewListActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetReviews> call, Response<GetReviews> response) {
            UserReviewListActivity userReviewListActivity = UserReviewListActivity.this;
            if (userReviewListActivity.f29642a != null) {
                if (userReviewListActivity.f30912A0.mo40002d() == 1 && !UserReviewListActivity.this.f30913B0.mo8107b()) {
                    UserReviewListActivity.this.f29642a.mo23492O();
                }
                if (!response.isSuccessful() || ((GetReviews) response.body()).getCode() > 300) {
                    UserReviewListActivity.this.f30912A0.mo39999b();
                    UserReviewListActivity.this.f29642a.mo23615f(response.message(), UserReviewListActivity.this.getString(C10232R.string.app_name));
                } else {
                    if (((GetReviews) response.body()).getPageBean() != null) {
                        UserReviewListActivity.this.f30912A0.mo39997a(((GetReviews) response.body()).getPageBean().getTotalPages());
                    }
                    if (UserReviewListActivity.this.f30912A0.mo40002d() == 1) {
                        UserReviewListActivity.this.f30920v0.clear();
                    }
                    UserReviewListActivity.this.f30920v0.addAll(((GetReviews) response.body()).getArrayListReview());
                    UserReviewListActivity.this.f30921w0.mo7341e();
                    UserReviewListActivity.this.f30912A0.mo39996a();
                    UserReviewListActivity.this.f30917s0.setText(((GetReviews) response.body()).getMessage());
                    UserReviewListActivity.this.m50591P();
                }
                if (UserReviewListActivity.this.f30913B0.mo8107b()) {
                    UserReviewListActivity.this.f30913B0.setRefreshing(false);
                }
            }
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$j */
    class C11172j implements DialogInterface.OnClickListener {
        C11172j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mrsool.review.UserReviewListActivity$k */
    class C11173k implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30940a;

        C11173k(int i) {
            this.f30940a = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            UserReviewListActivity.this.mo38998j(this.f30940a);
        }
    }

    /* renamed from: O */
    private void m50590O() {
        this.f30923y0 = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f30917s0 = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f30918t0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f30918t0.setOnClickListener(this);
        this.f30914C0 = (ViewGroup) findViewById(C10232R.C10236id.llMain);
        this.f30914C0.getViewTreeObserver().addOnGlobalLayoutListener(this.f30915D0);
        this.f30919u0 = (RecyclerView) findViewById(C10232R.C10236id.rvReview);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(1);
        this.f30919u0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f30919u0.setItemAnimator(this.f29642a.mo23672x());
        this.f30921w0 = new C11182c(this, this.f30920v0, new C11165d());
        this.f30919u0.setAdapter(this.f30921w0);
        this.f30916r0 = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f30916r0.setText(getString(C10232R.string.lbl_my_reviews));
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a(this.f30918t0);
        }
        this.f30912A0 = new C11652p(this.f30919u0, this.f30920v0);
        this.f30912A0.mo39998a((C11656d) new C11166e());
        this.f30913B0 = (SwipeRefreshLayout) findViewById(C10232R.C10236id.pullToRefresh);
        this.f30913B0.setColorSchemeColors(-16776961, C0986h.f4419u, -16776961);
        this.f30913B0.setColorSchemeColors(C0841b.m4915a((Context) this, (int) C10232R.C10234color.colorAccent));
        this.f30913B0.setOnRefreshListener(new C11167f());
        this.f30912A0.mo40008j();
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m50591P() {
        if (this.f30920v0.size() > 0) {
            this.f30923y0.setVisibility(8);
            this.f30919u0.setVisibility(0);
            return;
        }
        this.f30923y0.setVisibility(0);
        this.f30919u0.setVisibility(8);
    }

    /* renamed from: N */
    public void mo36519N() {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        if (this.f30912A0.mo40002d() == 1 && !this.f30913B0.mo8107b()) {
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("page", String.valueOf(this.f30912A0.mo40002d()));
        C11687c.m52645a(this.f29642a).getUserReviewList(this.f29642a.mo23476G(), hashMap).enqueue(new C11171i());
    }

    /* renamed from: j */
    public void mo38998j(int i) {
        C5887x xVar = this.f29642a;
        if (xVar == null || !xVar.mo23502X()) {
            this.f29642a.mo23492O();
            return;
        }
        this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        C11687c.m52645a(this.f29642a).deleteReview(((ReviewBean) this.f30920v0.get(i)).getId()).enqueue(new C11162a(i));
    }

    /* renamed from: k */
    public void mo38999k(int i) {
        View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_edit_delete, null);
        inflate.findViewById(C10232R.C10236id.llEdit).setOnClickListener(new C11168g(i));
        inflate.findViewById(C10232R.C10236id.llDelete).setOnClickListener(new C11170h(i));
        this.f30922x0 = new C5665a(this);
        this.f30922x0.setContentView(inflate);
        this.f30922x0.show();
    }

    /* renamed from: l */
    public void mo39000l(int i) {
        C6845b bVar = new C6845b(this, C10232R.style.AlertDialogTheme);
        bVar.mo770b((CharSequence) getString(C10232R.string.app_name)).mo758a((CharSequence) getString(C10232R.string.msg_ask_to_delete_review)).mo760a(false).mo776c((CharSequence) getString(C10232R.string.lbl_dg_title_yes), (DialogInterface.OnClickListener) new C11173k(i)).mo759a((CharSequence) getString(C10232R.string.lbl_dg_title_no), (DialogInterface.OnClickListener) new C11172j());
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
        m50590O();
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
            this.f29660S.dismiss();
            this.f29660S = null;
            if (this.f29675h0 != null) {
                ((ReviewBean) this.f30920v0.get(this.f30924z0)).setRating(this.f29675h0.getWriteRatingReviewBean().getRating());
                ((ReviewBean) this.f30920v0.get(this.f30924z0)).setReview(this.f29675h0.getWriteRatingReviewBean().getReview());
            }
            this.f30921w0.mo7337d(this.f30924z0);
        }
    }

    /* renamed from: a */
    public void mo38997a(int i, boolean z) {
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
            if (((ReviewBean) this.f30920v0.get(i)).getUserAction().equals(str2)) {
                ((ReviewBean) this.f30920v0.get(i)).setUserAction(str);
            } else {
                ((ReviewBean) this.f30920v0.get(i)).getUserAction().equals(str3);
                ((ReviewBean) this.f30920v0.get(i)).setUserAction(str2);
            }
        } else if (((ReviewBean) this.f30920v0.get(i)).getUserAction().equals(str3)) {
            ((ReviewBean) this.f30920v0.get(i)).setUserAction(str);
        } else {
            ((ReviewBean) this.f30920v0.get(i)).getUserAction().equals(str2);
            ((ReviewBean) this.f30920v0.get(i)).setUserAction(str3);
        }
        this.f30921w0.mo7337d(i);
        C11687c.m52645a(this.f29642a).voteReview(((ReviewBean) this.f30920v0.get(i)).getId(), hashMap).enqueue(new C11163b(i));
    }
}
