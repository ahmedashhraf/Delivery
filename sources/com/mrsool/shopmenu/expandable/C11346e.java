package com.mrsool.shopmenu.expandable;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0737c;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C1103b;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.C1817b;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import com.jackandphantom.circularimageview.RoundedImage;
import com.krishna.fileloader.C10171b;
import com.krishna.fileloader.p194h.C10183b;
import com.krishna.fileloader.p405e.C10177a;
import com.krishna.fileloader.p407g.C10181b;
import com.mrsool.C10232R;
import com.mrsool.bean.CheckinOut;
import com.mrsool.bean.DeeplinkBean;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.ListViewHeightBean;
import com.mrsool.bean.MenuItemsBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.bean.ShopMenuBean;
import com.mrsool.bean.WorkingHoursBean;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.createorder.BranchesActivity;
import com.mrsool.createorder.CreateOrderActivity;
import com.mrsool.customeview.TwitterVideoView.C10724c;
import com.mrsool.customeview.TwitterVideoView.C10729d;
import com.mrsool.customeview.TwitterVideoView.VideoView;
import com.mrsool.newBean.BranchBean;
import com.mrsool.newBean.GetBranchList;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11728i;
import com.mrsool.review.ServiceReviewListActivity;
import com.mrsool.shop.C11259i;
import com.mrsool.shop.C11259i.C11263d;
import com.mrsool.shop.PromotionalOfferActivity;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shop.ViewVideoFullActivity;
import com.mrsool.shopmenu.MenuOrderActivityStep1;
import com.mrsool.shopmenu.bean.GetMenuBean;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11668s;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.ReadMoreTextView;
import com.mrsool.utils.ReadMoreTextView.C11565c;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C5882b;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p053b.p072g.p073b.C2128a;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.shopmenu.expandable.e */
/* compiled from: ShopInfoPackageFragmentMenuTest1 */
public class C11346e extends Fragment implements OnClickListener, C10729d, C11056p {

    /* renamed from: A0 */
    private RecyclerView f31809A0;

    /* renamed from: B0 */
    private C11259i f31810B0;

    /* renamed from: C0 */
    private NestedScrollView f31811C0;

    /* renamed from: D0 */
    private LinearLayout f31812D0;

    /* renamed from: E0 */
    private ProgressBar f31813E0;

    /* renamed from: F0 */
    private ProgressBar f31814F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public ProgressBar f31815G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public C10724c f31816H0;

    /* renamed from: I0 */
    private C11669t f31817I0;

    /* renamed from: J0 */
    private int f31818J0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public boolean f31819K0 = false;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public DeeplinkBean f31820L0;

    /* renamed from: M0 */
    private final String f31821M0 = "getDeepLink";

    /* renamed from: N */
    private View f31822N;

    /* renamed from: N0 */
    private final String f31823N0 = "CheckInShop";

    /* renamed from: O */
    private View f31824O;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public Dialog f31825O0;

    /* renamed from: P */
    private View f31826P;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public boolean f31827P0 = false;

    /* renamed from: Q */
    private TextView f31828Q;

    /* renamed from: Q0 */
    private VideoView f31829Q0;

    /* renamed from: R */
    private TextView f31830R;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public RecyclerView f31831R0;

    /* renamed from: S */
    private TextView f31832S;

    /* renamed from: S0 */
    private C11315a f31833S0;

    /* renamed from: T */
    private TextView f31834T;

    /* renamed from: T0 */
    private View f31835T0;

    /* renamed from: U */
    private TextView f31836U;

    /* renamed from: U0 */
    private View f31837U0;

    /* renamed from: V */
    private TextView f31838V;

    /* renamed from: V0 */
    private C11614c f31839V0;

    /* renamed from: W */
    private TextView f31840W;

    /* renamed from: W0 */
    private boolean f31841W0 = false;

    /* renamed from: X */
    private TextView f31842X;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public Handler f31843X0;

    /* renamed from: Y */
    private TextView f31844Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public Runnable f31845Y0;

    /* renamed from: Z */
    private TextView f31846Z;

    /* renamed from: Z0 */
    private FrameLayout f31847Z0;

    /* renamed from: a */
    private View f31848a;

    /* renamed from: a0 */
    private TextView f31849a0;

    /* renamed from: a1 */
    private String f31850a1 = "";

    /* renamed from: b */
    private View f31851b;

    /* renamed from: b0 */
    private TextView f31852b0;

    /* renamed from: b1 */
    private LinearLayout f31853b1;

    /* renamed from: c0 */
    private TextView f31854c0;

    /* renamed from: c1 */
    private LinearLayout f31855c1;

    /* renamed from: d0 */
    private TextView f31856d0;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public boolean f31857d1 = false;

    /* renamed from: e0 */
    private TextView f31858e0;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public boolean f31859e1 = false;

    /* renamed from: f0 */
    private TextView f31860f0;

    /* renamed from: f1 */
    private boolean f31861f1 = false;

    /* renamed from: g0 */
    private RatingBar f31862g0;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public int f31863g1 = 0;

    /* renamed from: h0 */
    private ImageView f31864h0;

    /* renamed from: h1 */
    private double f31865h1 = 0.0d;

    /* renamed from: i0 */
    private ImageView f31866i0;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public TabLayout f31867i1;

    /* renamed from: j0 */
    private ImageView f31868j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public LinearLayoutManager f31869j1;

    /* renamed from: k0 */
    private ImageView f31870k0;

    /* renamed from: k1 */
    private ArrayList<ListViewHeightBean> f31871k1 = new ArrayList<>();

    /* renamed from: l0 */
    private ImageView f31872l0;

    /* renamed from: l1 */
    String f31873l1 = "Process Time";
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ImageView f31874m0;

    /* renamed from: m1 */
    private BroadcastReceiver f31875m1 = new C11358k();

    /* renamed from: n0 */
    private LinearLayout f31876n0;

    /* renamed from: n1 */
    Handler f31877n1 = new Handler();

    /* renamed from: o0 */
    private LinearLayout f31878o0;

    /* renamed from: o1 */
    Runnable f31879o1 = new C11361n();

    /* renamed from: p0 */
    private View f31880p0;

    /* renamed from: p1 */
    private OnGlobalLayoutListener f31881p1 = new C11363p();
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ReadMoreTextView f31882q0;

    /* renamed from: r0 */
    private View f31883r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public C5887x f31884s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public AppSingleton f31885t0;

    /* renamed from: u0 */
    private RoundedImage f31886u0;

    /* renamed from: v0 */
    private final String f31887v0 = "image";

    /* renamed from: w0 */
    private final int f31888w0 = 101;

    /* renamed from: x0 */
    private final int f31889x0 = 102;

    /* renamed from: y0 */
    private ImageView f31890y0;

    /* renamed from: z0 */
    private RelativeLayout f31891z0;

    /* renamed from: com.mrsool.shopmenu.expandable.e$a */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11347a implements Runnable {
        C11347a() {
        }

        public void run() {
            if (!C11346e.this.f31827P0 || C11346e.this.f31843X0 == null) {
                if (C11346e.this.m51340J()) {
                    int lineCount = C11346e.this.f31882q0.getLineCount();
                    if (lineCount == 1) {
                        C11346e.this.m51350T();
                        return;
                    }
                    C11346e.this.f31882q0.setTrimLines(lineCount - 1);
                    C11346e.this.f31882q0.setText(C11346e.this.f31885t0.f16955b.getShop().getvDescription(), null);
                    C11346e.this.m51351U();
                } else {
                    C11346e.this.m51350T();
                }
                return;
            }
            C11346e.this.f31843X0.removeCallbacks(this);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$b */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11348b extends C2550c {
        C11348b(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C11346e.this.f31874m0.setScaleType(ScaleType.CENTER_CROP);
            C11346e.this.f31874m0.setImageDrawable(C11346e.this.f31884s0.mo23567b(bitmap));
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$c */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11349c implements Callback<CheckinOut> {
        C11349c() {
        }

        public void onFailure(Call<CheckinOut> call, Throwable th) {
            try {
                if (C11346e.this.f31884s0 != null && C11346e.this.isAdded()) {
                    C11346e.this.f31884s0.mo23492O();
                    C11346e.this.f31884s0.mo23615f(C11346e.this.getString(C10232R.string.msg_error_server_issue), C11346e.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CheckinOut> call, Response<CheckinOut> response) {
            try {
                if (C11346e.this.f31884s0 != null && C11346e.this.isAdded()) {
                    C11346e.this.f31884s0.mo23492O();
                    if (response.isSuccessful() && C11346e.this.isAdded()) {
                        if (C11346e.this.f31885t0.f16955b.getCheckedIn().booleanValue()) {
                            C11346e.this.f31885t0.f16955b.setCheckedIn(Boolean.valueOf(false));
                        } else {
                            C11346e.this.f31885t0.f16955b.setCheckedIn(Boolean.valueOf(true));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Check in status after : ");
                        sb.append(C11346e.this.f31885t0.f16955b.getCheckedIn());
                        C5880q.m25753d(sb.toString());
                        CheckinOut checkinOut = (CheckinOut) response.body();
                        C11346e.this.m51368a(checkinOut.getCheckedIn().booleanValue(), checkinOut.getCheckedInCount());
                        if (((ShopDetailPackageActivity) C11346e.this.getActivity()).f31173b0.equalsIgnoreCase("checkinList")) {
                            C11346e.this.f31884s0.mo23473E(C11644i.f33394q4);
                        }
                        if (((CheckinOut) response.body()).getCode() <= 300) {
                            String a = C11346e.this.f31884s0.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                C11346e.this.f31884s0.mo23551a(new ServiceManualDataBean("CheckInShop", a));
                            }
                        }
                    } else if (C11346e.this.f31884s0 != null && C11346e.this.isAdded()) {
                        C11346e.this.f31884s0.mo23615f(response.message(), C11346e.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$d */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11350d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31895a;

        C11350d(Dialog dialog) {
            this.f31895a = dialog;
        }

        public void onClick(View view) {
            this.f31895a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$e */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11351e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31897a;

        C11351e(Dialog dialog) {
            this.f31897a = dialog;
        }

        public void onClick(View view) {
            this.f31897a.dismiss();
            if (C11346e.this.f31884s0.mo23502X()) {
                C11346e eVar = C11346e.this;
                eVar.m51381d(!eVar.f31885t0.f16955b.getCheckedIn().booleanValue());
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$f */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11352f implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f31899a;

        /* renamed from: com.mrsool.shopmenu.expandable.e$f$a */
        /* compiled from: ShopInfoPackageFragmentMenuTest1 */
        class C11353a implements C10177a<File> {
            C11353a() {
            }

            /* renamed from: a */
            public void mo36448a(C10183b bVar, C10181b<File> bVar2) {
                C11346e.this.f31884s0.mo23468C().mo23448a(C11346e.this.f31885t0.f16955b.getShop().getvImage(), Boolean.valueOf(true));
                File file = (File) bVar2.mo36458a();
                if (C11346e.this.f31816H0.f29412a.mo38170a()) {
                    C11346e.this.f31816H0.f29412a.mo38177b();
                }
                C11346e.this.f31816H0.mo38204a(C11346e.this.m51391g(Uri.fromFile(file).getPath()), C11352f.this.f31899a);
            }

            /* renamed from: a */
            public void mo36449a(C10183b bVar, Throwable th) {
            }
        }

        C11352f(int i) {
            this.f31899a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C10171b.m47256c(C11346e.this.getActivity()).mo36428a(C11346e.this.f31885t0.f16955b.getShop().getvImage(), false).mo36427a(".mrsool", 4).mo36436b((C10177a<File>) new C11353a<File>());
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$g */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11354g implements C11263d {

        /* renamed from: a */
        final /* synthetic */ List f31902a;

        C11354g(List list) {
            this.f31902a = list;
        }

        /* renamed from: a */
        public void mo39098a(int i) {
            if (!TextUtils.isEmpty(((MenuItemsBean) this.f31902a.get(i)).getImage())) {
                Intent intent = new Intent(C11346e.this.getActivity(), ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((MenuItemsBean) this.f31902a.get(i)).getImage());
                C11346e.this.startActivity(intent);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$h */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11355h implements Callback<DeeplinkBean> {
        C11355h() {
        }

        public void onFailure(Call<DeeplinkBean> call, Throwable th) {
            if (C11346e.this.isAdded() && C11346e.this.f31884s0 != null) {
                C11346e.this.f31884s0.mo23653q0();
            }
        }

        public void onResponse(Call<DeeplinkBean> call, Response<DeeplinkBean> response) {
            if (C11346e.this.f31884s0 != null) {
                C11346e.this.f31884s0.mo23492O();
                if (response.isSuccessful()) {
                    if (((DeeplinkBean) response.body()).getCode().intValue() <= 300) {
                        C11346e.this.f31820L0 = (DeeplinkBean) response.body();
                        String a = C11346e.this.f31884s0.mo23528a(response.body());
                        String str = "getDeepLink";
                        if (!TextUtils.isEmpty(a)) {
                            C11346e.this.f31884s0.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            C11346e.this.mo36511f(str);
                        }
                    } else {
                        C11346e.this.f31884s0.mo23615f(((DeeplinkBean) response.body()).getMessage(), C11346e.this.getString(C10232R.string.app_name));
                    }
                } else if (C11346e.this.f31884s0 != null) {
                    C11346e.this.f31884s0.mo23615f(response.message(), C11346e.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$i */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11356i implements Callback<GetBranchList> {

        /* renamed from: a */
        final /* synthetic */ int f31905a;

        C11356i(int i) {
            this.f31905a = i;
        }

        public void onFailure(Call<GetBranchList> call, Throwable th) {
            if (C11346e.this.isAdded() && C11346e.this.f31884s0 != null) {
                C11346e.this.f31884s0.mo23492O();
                if (C11346e.this.f31885t0.f16955b.getShop().isBOMSLinked()) {
                    C11346e.this.m51361a(this.f31905a, false, 0, 1);
                }
            }
        }

        public void onResponse(Call<GetBranchList> call, Response<GetBranchList> response) {
            if (C11346e.this.f31884s0 != null && C11346e.this.isAdded()) {
                if (response.isSuccessful() && ((GetBranchList) response.body()).getCode() <= 300) {
                    C11346e.this.f31885t0.f16955b.getShop().setBranchList(((GetBranchList) response.body()).getBranchList());
                    C11346e.this.f31885t0.f16955b.setBarColor(((GetBranchList) response.body()).getBarColor());
                    C11346e.this.f31885t0.f16955b.setAllowOrder(Boolean.valueOf(((GetBranchList) response.body()).isAllowOrder()));
                    C11346e.this.f31885t0.f16955b.setShop_order_alert_text(((GetBranchList) response.body()).getShopOrderAlertText());
                    C11346e.this.m51348R();
                } else if (response.body() != null) {
                    C11346e.this.f31884s0.mo23615f(((GetBranchList) response.body()).getMessage(), C11346e.this.getString(C10232R.string.app_name));
                }
                if (C11346e.this.f31885t0.f16955b.getShop().isBOMSLinked()) {
                    C11346e.this.m51361a(this.f31905a, false, 0, 1);
                } else {
                    C11346e.this.f31884s0.mo23492O();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$j */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11357j implements Callback<GetMenuBean> {

        /* renamed from: a */
        final /* synthetic */ int f31907a;

        /* renamed from: b */
        final /* synthetic */ boolean f31908b;

        C11357j(int i, boolean z) {
            this.f31907a = i;
            this.f31908b = z;
        }

        public void onFailure(Call<GetMenuBean> call, Throwable th) {
            if (C11346e.this.isAdded() && C11346e.this.f31884s0 != null) {
                C11346e.this.f31815G0.setVisibility(8);
                C11346e.this.f31884s0.mo23492O();
                C11346e.this.f31884s0.mo23615f(C11346e.this.getString(C10232R.string.msg_error_server_issue), C11346e.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetMenuBean> call, Response<GetMenuBean> response) {
            if (C11346e.this.f31884s0 != null && C11346e.this.isAdded()) {
                if (!response.isSuccessful() || ((GetMenuBean) response.body()).getCode() > 300) {
                    C11346e.this.f31815G0.setVisibility(8);
                    C11346e.this.f31884s0.mo23492O();
                    C11346e.this.m51387e(false);
                } else {
                    ShopDetailPackageActivity.f31150n0 = ((GetMenuBean) response.body()).getMenuBean().getArrayListCategoryBean();
                    ShopDetailPackageActivity.f31154r0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessAccountId();
                    ShopDetailPackageActivity.f31155s0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessBranchId();
                    ShopDetailPackageActivity.f31156t0 = ((GetMenuBean) response.body()).getMenuBean().getVatMultiplier();
                    if (this.f31907a == 3) {
                        for (int i = 0; i < ShopDetailPackageActivity.f31151o0.size(); i++) {
                            for (int i2 = 0; i2 < ShopDetailPackageActivity.f31150n0.size(); i2++) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getArrayListMenuItems().size()) {
                                        break;
                                    } else if (((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getArrayListMenuItems().get(i3)).getId().equals(((MenuItemBean) ShopDetailPackageActivity.f31151o0.get(i)).getId())) {
                                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getArrayListUsersMenuItems().add(ShopDetailPackageActivity.f31151o0.get(i));
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    C11346e.this.m51349S();
                    C11346e eVar = C11346e.this;
                    ArrayList<MenuCategoryBean> arrayList = ShopDetailPackageActivity.f31150n0;
                    eVar.f31819K0 = arrayList != null && arrayList.size() > 0;
                    C11346e.this.f31884s0.mo23492O();
                    C11346e.this.m51354X();
                    C11346e.this.m51387e(true);
                }
                boolean z = this.f31908b;
                String str = C11644i.f33173Q3;
                if (z) {
                    int i4 = this.f31907a;
                    if (i4 == 2) {
                        if (C11346e.this.f31819K0) {
                            C11346e.this.m51387e(true);
                            C11346e.this.f31884s0.mo23473E(str);
                        } else {
                            C11346e.this.m51387e(false);
                        }
                    } else if (i4 == 1 && C11346e.this.f31819K0) {
                        C11346e.this.m51387e(true);
                    }
                } else if (this.f31907a == 3) {
                    C11346e.this.f31884s0.mo23473E(str);
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$k */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11358k extends BroadcastReceiver {
        C11358k() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33173Q3)) {
                C11346e.this.m51398i0();
                C11346e.this.m51393g0();
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33166P4)) {
                C11346e.this.m51396h0();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$l */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11359l implements C1103b {
        C11359l() {
        }

        /* renamed from: a */
        public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (C11346e.this.isAdded()) {
                StringBuilder sb = new StringBuilder();
                sb.append("getChildCount (visibleItemCount) : ");
                sb.append(C11346e.this.f31869j1.mo7467e());
                sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("getItemCount (totalItemCount) :");
                sb2.append(C11346e.this.f31869j1.mo7483j());
                sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("findFirstVisibleItemPosition: ");
                sb3.append(C11346e.this.f31869j1.mo6959N());
                sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("lastVisibleItem: ");
                sb4.append(C11346e.this.f31869j1.mo6959N() + C11346e.this.f31869j1.mo7483j());
                sb4.toString();
                int x = C11346e.this.m51331B();
                C11346e eVar = C11346e.this;
                eVar.f31863g1 = (i2 - x) + eVar.f31867i1.getMeasuredHeight();
                C11346e eVar2 = C11346e.this;
                Runnable runnable = eVar2.f31879o1;
                if (runnable != null) {
                    eVar2.f31877n1.removeCallbacksAndMessages(runnable);
                }
                if (i2 > x - C11346e.this.f31867i1.getMeasuredHeight()) {
                    C11346e.this.m51388e0();
                    C11346e eVar3 = C11346e.this;
                    eVar3.f31877n1.postDelayed(eVar3.f31879o1, 5);
                } else {
                    C11346e.this.m51337G();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$m */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11360m implements C7051h {
        C11360m() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            if (!C11346e.this.f31857d1) {
                C11346e.this.f31859e1 = true;
            }
            C11346e.this.m51385e(kVar.mo28203f());
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            if (!C11346e.this.f31857d1) {
                C11346e.this.f31859e1 = true;
            }
            C11346e.this.m51385e(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$n */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11361n implements Runnable {
        C11361n() {
        }

        public void run() {
            if (C11346e.this.isAdded()) {
                StringBuilder sb = new StringBuilder();
                sb.append("expandableListView.getVerticalScrollbarPosition()");
                sb.append(C11346e.this.f31831R0.getY());
                sb.toString();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$o */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11362o implements OnClickListener {
        C11362o() {
        }

        public void onClick(View view) {
            C11346e.this.f31825O0.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$p */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11363p implements OnGlobalLayoutListener {

        /* renamed from: com.mrsool.shopmenu.expandable.e$p$a */
        /* compiled from: ShopInfoPackageFragmentMenuTest1 */
        class C11364a implements Runnable {
            C11364a() {
            }

            public void run() {
                C11346e.this.f31843X0 = new Handler();
                C11346e.this.m51352V();
            }
        }

        C11363p() {
        }

        public void onGlobalLayout() {
            new Handler().postDelayed(new C11364a(), 100);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$q */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11365q implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31917a;

        C11365q(Dialog dialog) {
            this.f31917a = dialog;
        }

        public void onClick(View view) {
            this.f31917a.dismiss();
            Intent intent = new Intent(C11346e.this.getContext(), BranchesActivity.class);
            intent.putExtra(C11644i.f33431v1, C11346e.this.getString(C10232R.string.lbl_tab_shop_pkg_info));
            C11346e.this.startActivityForResult(intent, 102);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$r */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11366r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31919a;

        C11366r(Dialog dialog) {
            this.f31919a = dialog;
        }

        public void onClick(View view) {
            this.f31919a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$s */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    class C11367s implements C11565c {
        C11367s() {
        }

        /* renamed from: a */
        public void mo39392a() {
            try {
                if (C11346e.this.f31843X0 != null) {
                    C11346e.this.f31843X0.removeCallbacks(C11346e.this.f31845Y0);
                }
                C11346e.this.f31882q0.setTrimLines(0);
                C11346e.this.f31827P0 = true;
                C11346e.this.m51350T();
            } catch (Exception unused) {
            }
        }

        /* renamed from: b */
        public void mo39393b() {
        }

        /* renamed from: c */
        public void mo39394c() {
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.e$t */
    /* compiled from: ShopInfoPackageFragmentMenuTest1 */
    public interface C11368t {
        /* renamed from: b */
        void mo39418b(Uri uri);
    }

    /* renamed from: C */
    private String m51333C() {
        try {
            if (((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return ((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(0)).getvAddress();
            }
            for (int i = 0; i < this.f31885t0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return ((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i)).getvAddress();
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: D */
    private String m51334D() {
        try {
            if (((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return String.valueOf(((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(0)).getDistance());
            }
            for (int i = 0; i < this.f31885t0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return String.valueOf(((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i)).getDistance());
                }
            }
            return "X";
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    private C11668s m51335E() {
        C11668s sVar = new C11668s(this.f31885t0.f16955b.getShop().getvImage(), true, false, null, null, false, true, this.f31816H0.mo38199a());
        return sVar;
    }

    /* renamed from: F */
    private void m51336F() {
        if (this.f31824O.getVisibility() == 8 && this.f31876n0.getVisibility() == 8) {
            this.f31851b.getVisibility();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m51337G() {
        try {
            this.f31867i1.setAlpha(0.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    private void m51338H() {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(C10232R.C10236id.tbTXT);
        TextView textView = (TextView) toolbar.findViewById(C10232R.C10236id.txtTitle);
        TextView textView2 = (TextView) toolbar.findViewById(C10232R.C10236id.txtSubTitle);
        LinearLayout linearLayout = (LinearLayout) toolbar.findViewById(C10232R.C10236id.layRightClick);
        this.f31884s0 = new C5887x(getActivity());
        this.f31839V0 = new C11614c(getActivity());
        this.f31817I0 = new C11669t(getActivity());
        this.f31867i1 = (TabLayout) this.f31880p0.findViewById(C10232R.C10236id.tabLayoutMenu);
        this.f31853b1 = (LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.llAboveDetail);
        this.f31855c1 = (LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.llMenuHeader);
        if (this.f31884s0.mo23496R()) {
            this.f31880p0.findViewById(C10232R.C10236id.ivArrowRightBranch).setScaleX(-1.0f);
            this.f31880p0.findViewById(C10232R.C10236id.ivArrowRightRating).setScaleX(-1.0f);
            this.f31880p0.findViewById(C10232R.C10236id.ivArrowRightHours).setScaleX(-1.0f);
        }
        toolbar.findViewById(C10232R.C10236id.llLeft).setVisibility(0);
        this.f31884s0.mo23553a((C11056p) this);
        linearLayout.setOnClickListener(this);
        this.f31847Z0 = (FrameLayout) this.f31880p0.findViewById(C10232R.C10236id.flMenuTotal);
        this.f31828Q = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvAmount);
        this.f31830R = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvCurrency);
        this.f31831R0 = (RecyclerView) this.f31880p0.findViewById(C10232R.C10236id.expandableListView);
        this.f31869j1 = new LinearLayoutManager(getActivity());
        this.f31831R0.setLayoutManager(this.f31869j1);
        this.f31872l0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.imgIamCheckin);
        this.f31874m0 = (ImageView) toolbar.findViewById(C10232R.C10236id.ivServiceLogo);
        this.f31849a0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.txtIamCheckin);
        this.f31852b0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.txtCheckInCount);
        this.f31891z0 = (RelativeLayout) this.f31880p0.findViewById(C10232R.C10236id.rlVideoTour);
        this.f31829Q0 = (VideoView) this.f31880p0.findViewById(C10232R.C10236id.video_view);
        this.f31829Q0.setOnClickListener(this);
        this.f31890y0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.ivVideoThumb);
        this.f31883r0 = this.f31880p0.findViewById(C10232R.C10236id.flBannerContainer);
        this.f31876n0 = (LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.llMenuContainer);
        this.f31848a = this.f31880p0.findViewById(C10232R.C10236id.rlOrderNowMain);
        this.f31848a.setOnClickListener(this);
        this.f31824O = this.f31880p0.findViewById(C10232R.C10236id.llBranch);
        this.f31826P = this.f31880p0.findViewById(C10232R.C10236id.flOrderCount);
        this.f31856d0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvDistanceAway);
        this.f31824O.setOnClickListener(this);
        this.f31824O.setEnabled(false);
        if (this.f31884s0.mo23504Z().booleanValue()) {
            this.f31824O.setVisibility(8);
        } else if (m51341K()) {
            this.f31824O.setVisibility(0);
        }
        this.f31813E0 = (ProgressBar) this.f31880p0.findViewById(C10232R.C10236id.pgLoading);
        this.f31814F0 = (ProgressBar) this.f31880p0.findViewById(C10232R.C10236id.pgLoadImage);
        this.f31815G0 = (ProgressBar) this.f31880p0.findViewById(C10232R.C10236id.pgMenuLoad);
        this.f31870k0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.ivLocation);
        this.f31838V = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvBranchAddress);
        this.f31840W = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvCount);
        this.f31842X = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvOrderNow);
        this.f31844Y = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvNoCourier);
        this.f31858e0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvDiscountTemp);
        this.f31860f0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvDiscount);
        this.f31846Z = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvWrkHrsTime);
        this.f31866i0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.ivYelloBg);
        this.f31868j0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.ivOrderNowGradiant);
        linearLayout.setVisibility(0);
        this.f31837U0 = this.f31880p0.findViewById(C10232R.C10236id.bottomDividerView);
        this.f31835T0 = this.f31880p0.findViewById(C10232R.C10236id.flOrderNowDiscount);
        this.f31878o0 = (LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.llBOMSMenuContainer);
        ShopDetails shopDetails = this.f31885t0.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            getActivity().finish();
            return;
        }
        m51362a(this.f31885t0.f16955b);
        m51345O();
        textView.setText(this.f31885t0.f16955b.getShop().getvTitle());
        textView2.setText(this.f31885t0.f16955b.getShop().getvSubTitle());
        textView2.setSelected(true);
        m51379c0();
        this.f31854c0 = (TextView) this.f31880p0.findViewById(C10232R.C10236id.txtPkgTitle);
        this.f31882q0 = (ReadMoreTextView) this.f31880p0.findViewById(C10232R.C10236id.txtPkgDesc);
        this.f31886u0 = (RoundedImage) this.f31880p0.findViewById(C10232R.C10236id.imgPkgInfo);
        this.f31886u0.setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_16));
        this.f31864h0 = (ImageView) this.f31880p0.findViewById(C10232R.C10236id.imgPkgIcon);
        this.f31886u0.setOnClickListener(this);
        this.f31882q0.setOnClickListener(this);
        this.f31809A0 = (RecyclerView) this.f31880p0.findViewById(C10232R.C10236id.rvMenu);
        this.f31822N = this.f31880p0.findViewById(C10232R.C10236id.llCustomerReviews);
        this.f31851b = this.f31880p0.findViewById(C10232R.C10236id.llWorkingHrs);
        this.f31832S = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvReviewLbl);
        this.f31834T = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvRting);
        this.f31836U = (TextView) this.f31880p0.findViewById(C10232R.C10236id.tvHrsStatus);
        this.f31862g0 = (RatingBar) this.f31880p0.findViewById(C10232R.C10236id.rbAllOver);
        this.f31811C0 = (NestedScrollView) this.f31880p0.findViewById(C10232R.C10236id.svMain);
        this.f31812D0 = (LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.llMain);
        this.f31851b.setOnClickListener(this);
        this.f31822N.setOnClickListener(this);
        m51355Y();
        m51363a(this.f31885t0.f16955b.getShop().getShop_menu());
        m51414x();
        ((LinearLayout) this.f31880p0.findViewById(C10232R.C10236id.layCheckIn)).setOnClickListener(this);
        m51374b0();
        m51353W();
        m51356Z();
        m51370a0();
        m51336F();
        m51393g0();
        if (this.f31885t0.f16955b.getShop().isDisableOrderNow()) {
            m51378c(true);
        }
        this.f31813E0.setVisibility(0);
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f31875m1, new IntentFilter(C11644i.f33173Q3));
        this.f31882q0.getViewTreeObserver().addOnGlobalLayoutListener(this.f31881p1);
    }

    /* renamed from: I */
    private boolean m51339I() {
        if (this.f31819K0) {
            for (int i = 0; i < ShopDetailPackageActivity.f31150n0.size(); i++) {
                if (((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getOrderCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public boolean m51340J() {
        double height = (double) this.f31811C0.getHeight();
        Double.isNaN(height);
        return height * 0.9d < ((double) ((this.f31812D0.getHeight() + this.f31811C0.getPaddingTop()) + this.f31811C0.getPaddingBottom()));
    }

    /* renamed from: K */
    private boolean m51341K() {
        if ((this.f31885t0.f16955b.getShop().isbIsPickupFixed() == 1 || this.f31885t0.f16955b.getShop().isbIsDropoffFixed() == 1) && this.f31885t0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private boolean m51342L() {
        return this.f31884s0.mo23468C().mo23450a(this.f31885t0.f16955b.getShop().getvImage());
    }

    /* renamed from: M */
    private void m51343M() {
        C11598a.m52263f().mo39829b(this.f31885t0.f16954a.getShopId());
    }

    /* renamed from: N */
    private void m51344N() {
        try {
            C11598a.m52263f().mo39811a(this.f31885t0.f16955b.getShop().getTotalReviews(), (double) this.f31885t0.f16955b.getShop().getRating(), this.f31885t0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    private void m51345O() {
        try {
            this.f31839V0.mo39854c(this.f31885t0.f16955b.getShop().getVShopId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: P */
    private void m51346P() {
        try {
            C11598a.m52263f().mo39840e(this.f31885t0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q */
    private void m51347Q() {
        this.f31882q0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f31881p1);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m51348R() {
        if (this.f31885t0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            this.f31824O.setVisibility(0);
            this.f31824O.setVisibility(0);
            this.f31838V.setText(m51333C());
            TextView textView = this.f31856d0;
            String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(m51334D());
            textView.setText(String.format(string, new Object[]{sb.toString()}));
            this.f31824O.setEnabled(true);
            return;
        }
        this.f31824O.setVisibility(8);
        this.f31824O.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m51349S() {
        for (int i = 0; i < ShopDetailPackageActivity.f31150n0.size(); i++) {
            for (int i2 = 0; i2 < ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().size(); i2++) {
                String str = "";
                ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).setDefaultVarietyId(str);
                if ((((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getDefaultVarietyId() == null || ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getDefaultVarietyId().equals(str)) && ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().size() > 0) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().size(); i4++) {
                        if (((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().get(i3)).getPrice() > ((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().get(i4)).getPrice() && ((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().get(i4)).getStatus().equalsIgnoreCase(C11644i.f33266b7)) {
                            i3 = i4;
                        }
                    }
                    ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).setDefaultVarietyId(((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2)).getArrayListVariety().get(i3)).getId());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m51350T() {
        this.f31882q0.setVisibility(0);
        this.f31812D0.setVisibility(0);
        this.f31813E0.setVisibility(8);
        m51416y();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m51351U() {
        this.f31845Y0 = new C11347a();
        this.f31843X0.postDelayed(this.f31845Y0, 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m51352V() {
        int lineCount = this.f31882q0.getLineCount();
        boolean J = m51340J();
        StringBuilder sb = new StringBuilder();
        sb.append("Text Line Count : ");
        sb.append(lineCount);
        C5880q.m25754e(sb.toString());
        if (lineCount != 0) {
            if (lineCount <= 4 || this.f31818J0 != 1 || !J) {
                if (lineCount >= 1) {
                    int i = this.f31818J0;
                    if (i == 1) {
                        this.f31818J0 = i + 1;
                        this.f31882q0.setTextSize(2, 18.0f);
                        C5880q.m25754e("Text Size : 18");
                        return;
                    }
                }
                if (lineCount >= 2) {
                    int i2 = this.f31818J0;
                    if (i2 == 2) {
                        this.f31818J0 = i2 + 1;
                        this.f31882q0.setTextSize(2, 16.0f);
                        C5880q.m25754e("Text Size : 16");
                        return;
                    }
                }
                if (lineCount >= 3) {
                    int i3 = this.f31818J0;
                    if (i3 == 3) {
                        this.f31818J0 = i3 + 1;
                        this.f31882q0.setTextSize(2, 14.0f);
                        C5880q.m25754e("Text Size : 14");
                        return;
                    }
                }
                if (lineCount >= 4 && this.f31818J0 == 4) {
                    this.f31882q0.setTextSize(2, 13.0f);
                    C5880q.m25754e("Text Size : 13");
                    m51347Q();
                }
                m51351U();
                return;
            }
            this.f31882q0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f31881p1);
            m51351U();
        }
    }

    /* renamed from: W */
    private void m51353W() {
        if (this.f31885t0.f16955b.getShop().isHasDiscount()) {
            String replace = this.f31885t0.f16955b.getShop().getDiscountLabel().replace(this.f31885t0.f16955b.getShop().getDiscountShortLabel(), "");
            this.f31835T0.setVisibility(0);
            this.f31860f0.setText(replace);
            this.f31858e0.setText(this.f31885t0.f16955b.getShop().getDiscountShortLabel());
            return;
        }
        this.f31835T0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m51354X() {
        this.f31857d1 = false;
        this.f31859e1 = false;
        this.f31861f1 = true;
        if (this.f31833S0 == null) {
            this.f31811C0.setOnScrollChangeListener(new C11359l());
            this.f31867i1.mo28104a((C7051h) new C11360m());
        }
        this.f31867i1.mo28139h();
        try {
            Iterator it = ShopDetailPackageActivity.f31150n0.iterator();
            while (it.hasNext()) {
                this.f31867i1.mo28105a(this.f31867i1.mo28126f().mo28195b((CharSequence) ((MenuCategoryBean) it.next()).getCategoryName().trim()));
                ((TextView) this.f31867i1.mo28096a(this.f31867i1.getTabCount() - 1).f19940i.getChildAt(1)).setSingleLine(true);
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ShopDetailPackageActivity.f31150n0.iterator();
        while (it2.hasNext()) {
            MenuCategoryBean menuCategoryBean = (MenuCategoryBean) it2.next();
            arrayList.add(new C11320c(menuCategoryBean, menuCategoryBean.getArrayListMenuItems()));
        }
        this.f31831R0.setAdapter(new C11315a(getContext(), arrayList));
        this.f31815G0.setVisibility(8);
        this.f31831R0.setVisibility(0);
        this.f31837U0.setVisibility(0);
    }

    /* renamed from: Y */
    private void m51355Y() {
        AppSingleton appSingleton = this.f31885t0;
        if (appSingleton == null) {
            ShopDetails shopDetails = appSingleton.f16955b;
            if (shopDetails == null && shopDetails.getShop() == null) {
                return;
            }
        }
        if (this.f31885t0.f16955b.getShop().getOpening_hours() == null || this.f31885t0.f16955b.getShop().getOpening_hours().size() <= 0) {
            this.f31851b.setVisibility(8);
        } else {
            if (this.f31885t0.f16955b.getShop().isServiceShopOpen()) {
                this.f31836U.setText(getResources().getString(C10232R.string.lbl_open_now));
                this.f31870k0.setImageResource(C10232R.C10235drawable.ic_clock_grey);
            } else {
                this.f31836U.setText(getResources().getString(C10232R.string.lbl_closed));
                this.f31870k0.setImageResource(C10232R.C10235drawable.ic_clock_red);
                this.f31836U.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.red_lite_3));
            }
            this.f31846Z.setText(this.f31885t0.f16955b.getShop().getTodaysWorkingHours());
        }
    }

    /* renamed from: Z */
    private void m51356Z() {
        this.f31882q0.setmOnCollapseExpandListner(new C11367s());
    }

    /* renamed from: a0 */
    private void m51370a0() {
        try {
            if (this.f31885t0.f16955b.getShop().getTotalReviews().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                this.f31832S.setText(getResources().getString(C10232R.string.lbl_no_customer_review));
                this.f31862g0.setRating(0.0f);
                this.f31834T.setVisibility(8);
            } else {
                this.f31822N.setVisibility(0);
                TextView textView = this.f31832S;
                String string = getResources().getString(C10232R.string.lbl_no_reviews);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f31885t0.f16955b.getShop().getTotalReviews());
                textView.setText(String.format(string, new Object[]{sb.toString()}));
                this.f31834T.setText(String.valueOf(this.f31885t0.f16955b.getShop().getRating()));
                this.f31862g0.setRating(Float.parseFloat(String.valueOf(this.f31885t0.f16955b.getShop().getRating())));
                this.f31834T.setVisibility(0);
            }
            if (this.f31885t0.f16955b.getShop().isRateable()) {
                this.f31822N.setVisibility(0);
            } else {
                this.f31822N.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b0 */
    private void m51374b0() {
        if (this.f31885t0.f16955b.getShop().getvIcon() != null && !TextUtils.isEmpty(this.f31885t0.f16955b.getShop().getvIcon().trim())) {
            C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31885t0.f16955b.getShop().getvIcon()).m11491c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11496d().m11500e((int) C10232R.C10235drawable.shop_place_holder_white).mo9424a(this.f31864h0);
        }
        if (this.f31885t0.f16955b.getShop().getvTitle() != null && !TextUtils.isEmpty(this.f31885t0.f16955b.getShop().getvTitle().trim())) {
            this.f31854c0.setText(this.f31885t0.f16955b.getShop().getvSubTitle());
        }
        if (this.f31885t0.f16955b.getShop().getvDescription() != null && !TextUtils.isEmpty(this.f31885t0.f16955b.getShop().getvDescription().trim())) {
            this.f31882q0.setText(this.f31885t0.f16955b.getShop().getvDescription());
        }
    }

    /* renamed from: c0 */
    private void m51379c0() {
        C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31885t0.f16955b.getShop().getvIcon()).mo9441j().m11405c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11415e((int) C10232R.C10235drawable.shop_place_holder_white).mo9458b(new C11348b(this.f31874m0));
    }

    /* renamed from: d0 */
    private void m51383d0() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f31884s0;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvDelete);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.tvTitle);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.tvMessage);
        textView2.setText(C10232R.string.btn_not_now);
        textView.setText(C10232R.string.lbl_change);
        textView.setBackgroundResource(C10232R.C10235drawable.selector_skyblue_button);
        textView4.setText(C10232R.string.lbl_change_branch_message);
        textView3.setText(C10232R.string.lbl_change_branch);
        textView.setOnClickListener(new C11365q(dialog));
        textView2.setOnClickListener(new C11366r(dialog));
        if (isAdded() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m51388e0() {
        try {
            this.f31867i1.setAlpha(1.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f0 */
    private void m51390f0() {
        String str = "";
        try {
            if (this.f31825O0 == null || !this.f31825O0.isShowing()) {
                View inflate = LayoutInflater.from(getActivity()).inflate(C10232R.layout.dialog_working_hrs, null);
                this.f31825O0 = new Dialog(getActivity());
                this.f31825O0.requestWindowFeature(1);
                this.f31825O0.setContentView(inflate);
                LinearLayout linearLayout = (LinearLayout) this.f31825O0.findViewById(C10232R.C10236id.llWorkingHoursMonThurs);
                TextView textView = (TextView) this.f31825O0.findViewById(C10232R.C10236id.txtOk);
                if (this.f31884s0 != null) {
                    this.f31884s0.mo23535a(this.f31825O0);
                }
                if (this.f31885t0.f16955b.getShop().getOpening_hours() != null) {
                    for (int i = 0; i < this.f31885t0.f16955b.getShop().getOpening_hours().size(); i++) {
                        View inflate2 = getActivity().getLayoutInflater().inflate(C10232R.layout.row_working_hours, null);
                        TextView textView2 = (TextView) inflate2.findViewById(C10232R.C10236id.tvDay);
                        TextView textView3 = (TextView) inflate2.findViewById(C10232R.C10236id.tvTime);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(((WorkingHoursBean) this.f31885t0.f16955b.getShop().getOpening_hours().get(i)).getDay());
                        textView2.setText(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(((WorkingHoursBean) this.f31885t0.f16955b.getShop().getOpening_hours().get(i)).getTime());
                        textView3.setText(sb2.toString());
                        linearLayout.addView(inflate2);
                        if (getResources().getDisplayMetrics().densityDpi <= 240) {
                            textView3.setTextSize(2, 11.0f);
                        } else if (getResources().getDisplayMetrics().densityDpi <= 320) {
                            textView3.setTextSize(2, 12.0f);
                        }
                    }
                    if (!getActivity().isFinishing()) {
                        this.f31825O0.show();
                    }
                }
                textView.setOnClickListener(new C11362o());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m51393g0() {
        if (isAdded()) {
            if (this.f31885t0.f16955b.getBarColor().equalsIgnoreCase(getString(C10232R.string.lbl_order_color_yellow))) {
                this.f31844Y.setText(this.f31885t0.f16955b.getShop_order_alert_text());
                this.f31866i0.setVisibility(0);
                this.f31844Y.setVisibility(0);
                this.f31842X.setVisibility(8);
                this.f31868j0.setVisibility(8);
            } else {
                this.f31866i0.setVisibility(8);
                this.f31844Y.setVisibility(8);
                this.f31842X.setVisibility(0);
                this.f31868j0.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m51396h0() {
        ViewPager viewPager = ShopDetailActivity.f31114j0;
        if (viewPager != null) {
            viewPager.setCurrentItem(0);
        }
        this.f31833S0.mo7341e();
        m51398i0();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m51398i0() {
        int i;
        double d;
        this.f31865h1 = 0.0d;
        String str = "";
        if (this.f31819K0) {
            i = 0;
            for (int i2 = 0; i2 < ShopDetailPackageActivity.f31150n0.size(); i2++) {
                i += ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getOrderCount();
            }
            for (int i3 = 0; i3 < ShopDetailPackageActivity.f31150n0.size(); i3++) {
                for (int i4 = 0; i4 < ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().size(); i4++) {
                    if (((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getOrderCount() > 0) {
                        if (this.f31850a1.equals(str)) {
                            this.f31850a1 = ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getCurrency();
                        }
                        try {
                            d = Double.parseDouble(((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getPrice());
                        } catch (Exception unused) {
                            d = 0.0d;
                        }
                        double d2 = d;
                        for (int i5 = 0; i5 < ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListVariety().size(); i5++) {
                            if (((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListVariety().get(i5)).isSelected()) {
                                d2 += ((MenuVarietyBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListVariety().get(i5)).getPrice();
                            }
                        }
                        int i6 = 0;
                        while (i6 < ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().size()) {
                            if (((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).isSelected() && ((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).getMenuAddonOptions().size() <= 0) {
                                d2 += ((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).getPrice().doubleValue();
                            }
                            double d3 = d2;
                            for (int i7 = 0; i7 < ((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).getMenuAddonOptions().size(); i7++) {
                                if (((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).getMenuAddonOptions().get(i7)).isSelected()) {
                                    d3 += ((MenuAddonsOptionsBean) ((MenuAddonsBean) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getArrayListAddons().get(i6)).getMenuAddonOptions().get(i7)).getPrice().doubleValue();
                                }
                            }
                            i6++;
                            d2 = d3;
                        }
                        double d4 = this.f31865h1;
                        double orderCount = (double) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getOrderCount();
                        Double.isNaN(orderCount);
                        this.f31865h1 = d4 + (d2 * orderCount);
                    }
                }
            }
            if (this.f31865h1 > 0.0d) {
                this.f31847Z0.setVisibility(0);
                this.f31811C0.setPadding(0, 0, 0, (int) getResources().getDimension(C10232R.dimen.dp_33));
            } else {
                this.f31847Z0.setVisibility(8);
                this.f31811C0.setPadding(0, 0, 0, 0);
            }
        } else {
            i = 0;
        }
        TextView textView = this.f31840W;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        textView.setText(sb.toString());
        TextView textView2 = this.f31828Q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C5887x.m25809b(Double.valueOf(this.f31865h1)));
        textView2.setText(sb2.toString());
        this.f31830R.setText(this.f31850a1);
        if (!isAdded()) {
            return;
        }
        if (i <= 0) {
            this.f31842X.setText(getString(C10232R.string.lbl_tb_title_order_now));
            this.f31840W.setVisibility(8);
            this.f31826P.setVisibility(8);
            m51378c(true);
            return;
        }
        this.f31842X.setText(getString(C10232R.string.btn_place_order));
        this.f31840W.setVisibility(0);
        this.f31826P.setVisibility(0);
        m51378c(false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult shop innfo requestCode ");
        sb.append(i);
        C5880q.m25753d(sb.toString());
        if (i2 != -1) {
            return;
        }
        if (i != 1009) {
            switch (i) {
                case 100:
                    ViewPager viewPager = ShopDetailActivity.f31114j0;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(0);
                    }
                    this.f31833S0.mo7341e();
                    m51398i0();
                    if (intent != null && intent.getBooleanExtra(C11644i.f33293e7, false)) {
                        m51361a(0, false, 0, 3);
                        return;
                    }
                    return;
                case 101:
                    int intExtra = intent.getIntExtra(C11644i.f33456y2, 0);
                    if (m51342L()) {
                        m51376c(intExtra);
                        return;
                    }
                    this.f31816H0.mo38204a(m51335E(), intExtra);
                    m51376c(intExtra);
                    return;
                case 102:
                    BranchBean branchBean = (BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0));
                    if (this.f31885t0.f16955b.getShop().isbIsPickupFixed() == 1) {
                        this.f31885t0.f16955b.getShop().setPlatitude(branchBean.getLatitude());
                        this.f31885t0.f16955b.getShop().setPlongitude(branchBean.getLongitude());
                        this.f31885t0.f16955b.getShop().setvPickupAddress(branchBean.getvAddress());
                    }
                    if (this.f31885t0.f16955b.getShop().isbIsDropoffFixed() == 1) {
                        this.f31885t0.f16955b.getShop().setDlatitude(branchBean.getLatitude());
                        this.f31885t0.f16955b.getShop().setDlongitude(branchBean.getLongitude());
                        this.f31885t0.f16955b.getShop().setvDropoffAddress(branchBean.getvAddress());
                    }
                    this.f31838V.setText(((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getvAddress());
                    TextView textView = this.f31856d0;
                    String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getDistance());
                    textView.setText(String.format(string, new Object[]{sb2.toString()}));
                    if (this.f31885t0.f16955b.getShop().isBOMSLinked()) {
                        m51361a(0, true, intent.getIntExtra(C11644i.f33332j1, 0), 2);
                    }
                    m51398i0();
                    m51393g0();
                    return;
                default:
                    return;
            }
        } else {
            m51370a0();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.imgPkgInfo /*2131362498*/:
                if (!TextUtils.isEmpty(this.f31885t0.f16955b.getShop().getvImage())) {
                    if ("image".equalsIgnoreCase(this.f31885t0.f16955b.getShop().getvImageType())) {
                        Intent intent = new Intent(getActivity(), ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, this.f31885t0.f16955b.getShop().getvImage());
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case C10232R.C10236id.layCheckIn /*2131362894*/:
                if (this.f31884s0.mo23503Y()) {
                    return;
                }
                if (!this.f31885t0.f16955b.getCheckedIn().booleanValue()) {
                    m51395h(getString(C10232R.string.msg_info_checkin));
                    return;
                } else {
                    m51381d(true);
                    return;
                }
            case C10232R.C10236id.layRightClick /*2131362913*/:
                m51417z();
                return;
            case C10232R.C10236id.llBranch /*2131362975*/:
                if (!this.f31884s0.mo23503Y() && this.f31884s0.mo23497S()) {
                    if (m51339I()) {
                        m51383d0();
                        return;
                    }
                    Intent intent2 = new Intent(getContext(), BranchesActivity.class);
                    intent2.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
                    startActivityForResult(intent2, 102);
                    return;
                }
                return;
            case C10232R.C10236id.llCustomerReviews /*2131363013*/:
                C5887x xVar = this.f31884s0;
                if (xVar != null && !xVar.mo23503Y()) {
                    startActivityForResult(new Intent(getContext(), ServiceReviewListActivity.class), 1009);
                    m51344N();
                    return;
                }
                return;
            case C10232R.C10236id.llWorkingHrs /*2131363202*/:
                m51390f0();
                m51346P();
                return;
            case C10232R.C10236id.rlOrderNowMain /*2131363485*/:
                if (this.f31884s0.mo23497S()) {
                    mo39407w();
                    return;
                }
                return;
            case C10232R.C10236id.txtPkgDesc /*2131364134*/:
                this.f31882q0.mo39696f();
                return;
            case C10232R.C10236id.video_view /*2131364235*/:
                Intent intent3 = new Intent(getContext(), ViewVideoFullActivity.class);
                intent3.putExtra(C11644i.f33383p1, this.f31885t0.f16955b.getShop().getvImage());
                intent3.putExtra(C11644i.f33448x2, m51335E());
                C10724c cVar = this.f31816H0;
                if (!(cVar == null || cVar.mo38209c() == null)) {
                    this.f31816H0.mo38209c().mo38177b();
                }
                C1376c activity = getActivity();
                VideoView videoView = this.f31829Q0;
                startActivityForResult(intent3, 101, C0737c.m4272a((Activity) activity, (View) videoView, C0962e0.m5415S(videoView)).mo4091b());
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31880p0 = layoutInflater.inflate(C10232R.layout.fragment_shop_info_package_menu_test1, viewGroup, false);
        MapsInitializer.initialize(getActivity().getApplicationContext());
        this.f31885t0 = (AppSingleton) getActivity().getApplicationContext();
        return this.f31880p0;
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(getActivity());
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51338H();
    }

    public void start() {
        this.f31890y0.setVisibility(8);
    }

    /* renamed from: A */
    private C1817b m51329A() {
        C1817b bVar = new C1817b(getActivity());
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public int m51331B() {
        return this.f31853b1.getMeasuredHeight();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C11668s m51391g(String str) {
        C11668s sVar = new C11668s(str, true, false, null, null, false, true, this.f31816H0.mo38199a());
        return sVar;
    }

    /* renamed from: h */
    private void m51395h(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        textView4.setText(getString(C10232R.string.lbl_dg_title_yes));
        textView2.setText(getString(C10232R.string.lbl_dg_title_check_in));
        textView.setText(str);
        textView3.setOnClickListener(new C11350d(dialog));
        textView4.setOnClickListener(new C11351e(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: x */
    private void m51414x() {
        try {
            if (!TextUtils.isEmpty(this.f31885t0.f16955b.getShop().getvImage())) {
                String str = this.f31885t0.f16955b.getShop().getvImageType();
                char c = 65535;
                int hashCode = str.hashCode();
                if (hashCode != 102340) {
                    if (hashCode != 100313435) {
                        if (hashCode == 112202875) {
                            if (str.equals("video")) {
                                c = 2;
                            }
                        }
                    } else if (str.equals("image")) {
                        c = 0;
                    }
                } else if (str.equals("gif")) {
                    c = 1;
                }
                if (c == 0) {
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31885t0.f16955b.getShop().getvImage()).m11496d().mo9424a((ImageView) this.f31886u0);
                } else if (c == 1) {
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31885t0.f16955b.getShop().getvImage()).mo9456k().mo9429c((int) C10232R.C10235drawable.ic_image_placeholder).mo9430c((Drawable) m51329A()).mo9424a((ImageView) this.f31886u0);
                } else if (c == 2) {
                    this.f31883r0.setVisibility(8);
                    this.f31891z0.setVisibility(0);
                    this.f31890y0.setVisibility(8);
                    this.f31816H0 = new C10724c(getActivity().findViewById(16908290));
                    if (m51342L()) {
                        m51376c(0);
                        return;
                    }
                    this.f31816H0.mo38204a(m51335E(), 0);
                    m51376c(0);
                }
            } else {
                this.f31814F0.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    private void m51416y() {
        try {
            if (!this.f31841W0) {
                this.f31841W0 = true;
                if (m51341K()) {
                    m51360a(0);
                } else if (this.f31885t0.f16955b.getShop().isBOMSLinked()) {
                    m51361a(0, false, 0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    private void m51417z() {
        C5887x xVar = this.f31884s0;
        if (xVar != null && xVar.mo23502X()) {
            AppSingleton appSingleton = this.f31885t0;
            if (appSingleton != null) {
                FourSquareMainBean fourSquareMainBean = appSingleton.f16954a;
                if (fourSquareMainBean != null && fourSquareMainBean.getShopId() != null) {
                    this.f31884s0.mo23665u0();
                    HashMap hashMap = new HashMap();
                    hashMap.put("vShopId", this.f31885t0.f16954a.getShopId());
                    C5882b.m25774a(this.f31884s0).getDeepLink(hashMap).enqueue(new C11355h());
                }
            }
        }
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if ("getDeepLink".equals(str) && isAdded()) {
            C5887x xVar = this.f31884s0;
            String string = getResources().getString(C10232R.string.msg_share_shop);
            Object[] objArr = new Object[2];
            objArr[0] = this.f31885t0.f16955b.getShop().getvTitle();
            DeeplinkBean deeplinkBean = this.f31820L0;
            objArr[1] = deeplinkBean != null ? deeplinkBean.getUrl() : "";
            xVar.mo23483J(String.format(string, objArr));
        }
    }

    /* renamed from: w */
    public void mo39407w() {
        Intent intent;
        C5887x xVar = this.f31884s0;
        if (xVar != null && !xVar.mo23503Y() && !this.f31884s0.mo23503Y()) {
            ShopDetails shopDetails = this.f31885t0.f16955b;
            if (shopDetails != null && shopDetails.getAllowOrder().booleanValue()) {
                if (this.f31885t0.f16955b.getShop() == null) {
                    getActivity().finish();
                    return;
                }
                if (!this.f31819K0 || !m51339I()) {
                    intent = new Intent(getActivity(), CreateOrderActivity.class);
                } else {
                    intent = new Intent(getActivity(), MenuOrderActivityStep1.class);
                    ShopDetailPackageActivity shopDetailPackageActivity = (ShopDetailPackageActivity) getActivity();
                    intent.putExtra(C11687c.f33739W0, ShopDetailPackageActivity.f31154r0);
                    ShopDetailPackageActivity shopDetailPackageActivity2 = (ShopDetailPackageActivity) getActivity();
                    intent.putExtra(C11687c.f33743X0, ShopDetailPackageActivity.f31155s0);
                }
                intent.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
                intent.putExtra(C11644i.f33464z2, this.f31885t0.f16955b.getShop().isbIsPickupFixed());
                intent.putExtra(C11644i.f33044A2, this.f31885t0.f16955b.getShop().isbIsDropoffFixed());
                intent.putExtra(C11644i.f33052B2, this.f31885t0.f16955b.getShop().getbIsPickupAvailable());
                intent.putExtra(C11644i.f33060C2, this.f31885t0.f16955b.getShop().getbIsDropoffAvailable());
                if (this.f31885t0.f16955b.getShop().isbIsPickupFixed() == 1) {
                    intent.putExtra(C11644i.f33068D2, this.f31885t0.f16955b.getShop().getPlatitude());
                    intent.putExtra(C11644i.f33076E2, this.f31885t0.f16955b.getShop().getPlongitude());
                    intent.putExtra(C11644i.f33084F2, this.f31885t0.f16955b.getShop().getvPickupAddress());
                }
                if (this.f31885t0.f16955b.getShop().isbIsDropoffFixed() == 1) {
                    intent.putExtra(C11644i.f33092G2, this.f31885t0.f16955b.getShop().getDlatitude());
                    intent.putExtra(C11644i.f33100H2, this.f31885t0.f16955b.getShop().getDlongitude());
                    intent.putExtra(C11644i.f33108I2, this.f31885t0.f16955b.getShop().getvDropoffAddress());
                }
                startActivityForResult(intent, 100);
            }
        }
    }

    /* renamed from: c */
    private void m51378c(boolean z) {
        if (this.f31885t0.f16955b.getShop().isDisableOrderNow()) {
            String str = "yellow";
            if (z) {
                if (this.f31885t0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                    this.f31866i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                } else {
                    this.f31866i0.setVisibility(0);
                    this.f31866i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                    this.f31868j0.setVisibility(8);
                }
                this.f31848a.setEnabled(false);
                return;
            }
            if (this.f31885t0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                this.f31866i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
            } else {
                this.f31866i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
                this.f31866i0.setVisibility(8);
                this.f31868j0.setVisibility(0);
            }
            this.f31848a.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51381d(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("bNotification", this.f31885t0.f16955b.getCheckedIn().booleanValue() ? "false" : ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        hashMap.put("iUserId", String.valueOf(this.f31884s0.mo23468C().mo23459f("user_id")));
        hashMap.put("vShopId", this.f31885t0.f16954a.getShopId());
        C5882b.m25774a(this.f31884s0).CheckInShop(hashMap).enqueue(new C11349c());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51385e(int i) {
        if (this.f31857d1) {
            this.f31857d1 = false;
        } else {
            if (this.f31861f1) {
            }
        }
    }

    /* renamed from: b */
    public void mo38223b() {
        this.f31890y0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51387e(boolean z) {
        if (z) {
            this.f31876n0.setVisibility(8);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.f31878o0.setAnimation(alphaAnimation);
            this.f31878o0.setVisibility(0);
            return;
        }
        this.f31878o0.setVisibility(8);
        C11259i iVar = this.f31810B0;
        if (iVar != null && iVar.mo7325b() > 0) {
            this.f31876n0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51368a(boolean z, int i) {
        if (z) {
            this.f31849a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.apptheme_color));
            this.f31872l0.setImageResource(C10232R.C10235drawable.icon_check_act);
        } else {
            this.f31849a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.shop_type_color));
            this.f31872l0.setImageResource(C10232R.C10235drawable.icon_check);
        }
        this.f31852b0.setText(String.valueOf(i));
    }

    /* renamed from: a */
    private void m51363a(ShopMenuBean shopMenuBean) {
        if (shopMenuBean == null || shopMenuBean.getMenu_items() == null) {
            this.f31876n0.setVisibility(8);
            return;
        }
        this.f31876n0.setVisibility(8);
        List menu_items = shopMenuBean.getMenu_items();
        this.f31809A0.setNestedScrollingEnabled(false);
        this.f31809A0.setHasFixedSize(false);
        this.f31810B0 = new C11259i(getActivity(), menu_items);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f31809A0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f31809A0.setAdapter(this.f31810B0);
        this.f31810B0.mo39093a((C11263d) new C11354g(menu_items));
        StringBuilder sb = new StringBuilder();
        sb.append("original is :");
        sb.append(this.f31884s0.mo23601d(105));
        C5880q.m25751b(sb.toString());
    }

    /* renamed from: c */
    private void m51376c(int i) {
        this.f31817I0.mo40036a(C11644i.f33357m, (C11673d) new C11352f(i));
    }

    /* renamed from: a */
    private void m51362a(ShopDetails shopDetails) {
        try {
            if (shopDetails.getPromotionAvailable()) {
                startActivity(new Intent(getActivity(), PromotionalOfferActivity.class));
                getActivity().overridePendingTransition(17432576, 17432577);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m51360a(int i) {
        C5887x xVar = this.f31884s0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f31884s0.mo23492O();
        } else if (!this.f31884s0.mo23504Z().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f31884s0.mo23476G());
            hashMap.put("auth_token", this.f31884s0.mo23640m());
            hashMap.put("vShopId", this.f31885t0.f16955b.getShop().getVShopId());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f31885t0.f16955b.getShop().getLatitude());
            hashMap.put("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f31885t0.f16955b.getShop().getLongitude());
            hashMap.put("longitude", sb2.toString());
            hashMap.put(C11687c.f33717Q2, str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("param: ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C11687c.m52645a(this.f31884s0).getBranchList(hashMap).enqueue(new C11356i(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51361a(int i, boolean z, int i2, int i3) {
        double d;
        C5887x xVar = this.f31884s0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f31884s0.mo23492O();
            return;
        }
        if (z || i3 == 3) {
            this.f31884s0.mo23665u0();
        }
        this.f31815G0.setVisibility(0);
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33862z0, this.f31885t0.f16955b.getShop().getVShopId());
        hashMap.put("language", this.f31884s0.mo23645o().toUpperCase());
        double d2 = 0.0d;
        if (i3 == 3) {
            d = 0.0d;
        } else if (z) {
            d2 = ((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i2)).getLatitude().doubleValue();
            d = ((BranchBean) this.f31885t0.f16955b.getShop().getBranchList().get(i2)).getLongitude().doubleValue();
        } else {
            d2 = this.f31885t0.f16955b.getShop().getLatitude().doubleValue();
            d = this.f31885t0.f16955b.getShop().getLongitude().doubleValue();
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(d2);
        hashMap.put("latitude", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(d);
        hashMap.put("longitude", sb2.toString());
        this.f31819K0 = false;
        C11687c.m52644a().getMenuForBusinessOrder(hashMap).enqueue(new C11357j(i3, z));
    }
}
