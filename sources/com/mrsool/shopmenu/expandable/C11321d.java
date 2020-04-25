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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0737c;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import androidx.swiperefreshlayout.widget.C1817b;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout.C5607e;
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

/* renamed from: com.mrsool.shopmenu.expandable.d */
/* compiled from: ShopInfoPackageFragmentMenuTest */
public class C11321d extends Fragment implements OnClickListener, C10729d, C11056p {

    /* renamed from: A0 */
    private C11259i f31695A0;

    /* renamed from: B0 */
    private LinearLayout f31696B0;

    /* renamed from: C0 */
    private ProgressBar f31697C0;

    /* renamed from: D0 */
    private ProgressBar f31698D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public ProgressBar f31699E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public C10724c f31700F0;

    /* renamed from: G0 */
    private C11669t f31701G0;

    /* renamed from: H0 */
    private int f31702H0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public boolean f31703I0 = false;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public DeeplinkBean f31704J0;

    /* renamed from: K0 */
    private final String f31705K0 = "getDeepLink";

    /* renamed from: L0 */
    private final String f31706L0 = "CheckInShop";
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public Dialog f31707M0;

    /* renamed from: N */
    private View f31708N;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public boolean f31709N0 = false;

    /* renamed from: O */
    private View f31710O;

    /* renamed from: O0 */
    private VideoView f31711O0;

    /* renamed from: P */
    private View f31712P;

    /* renamed from: P0 */
    private RecyclerView f31713P0;

    /* renamed from: Q */
    private TextView f31714Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public C11315a f31715Q0;

    /* renamed from: R */
    private TextView f31716R;

    /* renamed from: R0 */
    private View f31717R0;

    /* renamed from: S */
    private TextView f31718S;

    /* renamed from: S0 */
    private C11614c f31719S0;

    /* renamed from: T */
    private TextView f31720T;

    /* renamed from: T0 */
    private boolean f31721T0 = false;

    /* renamed from: U */
    private TextView f31722U;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public Handler f31723U0;

    /* renamed from: V */
    private TextView f31724V;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public Runnable f31725V0;

    /* renamed from: W */
    private TextView f31726W;

    /* renamed from: W0 */
    private FrameLayout f31727W0;

    /* renamed from: X */
    private TextView f31728X;

    /* renamed from: X0 */
    private FrameLayout f31729X0;

    /* renamed from: Y */
    private TextView f31730Y;

    /* renamed from: Y0 */
    private String f31731Y0 = "";

    /* renamed from: Z */
    private TextView f31732Z;

    /* renamed from: Z0 */
    private LinearLayout f31733Z0;

    /* renamed from: a */
    private View f31734a;

    /* renamed from: a0 */
    private TextView f31735a0;

    /* renamed from: a1 */
    private LinearLayout f31736a1;

    /* renamed from: b */
    private View f31737b;

    /* renamed from: b0 */
    private TextView f31738b0;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public boolean f31739b1 = false;

    /* renamed from: c0 */
    private TextView f31740c0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public boolean f31741c1 = false;

    /* renamed from: d0 */
    private TextView f31742d0;

    /* renamed from: d1 */
    private int f31743d1 = 0;

    /* renamed from: e0 */
    private TextView f31744e0;

    /* renamed from: e1 */
    private double f31745e1 = 0.0d;

    /* renamed from: f0 */
    private TextView f31746f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public TabLayout f31747f1;

    /* renamed from: g0 */
    private RatingBar f31748g0;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public LinearLayoutManager f31749g1;

    /* renamed from: h0 */
    private ImageView f31750h0;

    /* renamed from: h1 */
    String f31751h1 = "Process Time";

    /* renamed from: i0 */
    private ImageView f31752i0;

    /* renamed from: i1 */
    private AppBarLayout f31753i1;

    /* renamed from: j0 */
    private ImageView f31754j0;

    /* renamed from: j1 */
    private BroadcastReceiver f31755j1 = new C11333k();

    /* renamed from: k0 */
    private ImageView f31756k0;

    /* renamed from: k1 */
    private C1660t f31757k1 = new C11337o();
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ImageView f31758l0;

    /* renamed from: l1 */
    Handler f31759l1 = new Handler();

    /* renamed from: m0 */
    private LinearLayout f31760m0;

    /* renamed from: m1 */
    Runnable f31761m1 = new C11340r();

    /* renamed from: n0 */
    private FrameLayout f31762n0;

    /* renamed from: n1 */
    private OnGlobalLayoutListener f31763n1 = new C11342t();

    /* renamed from: o0 */
    private View f31764o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ReadMoreTextView f31765p0;

    /* renamed from: q0 */
    private View f31766q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C5887x f31767r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public AppSingleton f31768s0;

    /* renamed from: t0 */
    private RoundedImage f31769t0;

    /* renamed from: u0 */
    private final String f31770u0 = "image";

    /* renamed from: v0 */
    private final int f31771v0 = 101;

    /* renamed from: w0 */
    private final int f31772w0 = 102;

    /* renamed from: x0 */
    private ImageView f31773x0;

    /* renamed from: y0 */
    private RelativeLayout f31774y0;

    /* renamed from: z0 */
    private RecyclerView f31775z0;

    /* renamed from: com.mrsool.shopmenu.expandable.d$a */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11322a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31776a;

        C11322a(Dialog dialog) {
            this.f31776a = dialog;
        }

        public void onClick(View view) {
            this.f31776a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$b */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11323b implements C11565c {
        C11323b() {
        }

        /* renamed from: a */
        public void mo39392a() {
            try {
                if (C11321d.this.f31723U0 != null) {
                    C11321d.this.f31723U0.removeCallbacks(C11321d.this.f31725V0);
                }
                C11321d.this.f31765p0.setTrimLines(0);
                C11321d.this.f31709N0 = true;
                C11321d.this.m51236T();
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

    /* renamed from: com.mrsool.shopmenu.expandable.d$c */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11324c implements Runnable {
        C11324c() {
        }

        public void run() {
            if (!C11321d.this.f31709N0 || C11321d.this.f31723U0 == null) {
                if (C11321d.this.m51226J()) {
                    int lineCount = C11321d.this.f31765p0.getLineCount();
                    if (lineCount == 1) {
                        C11321d.this.m51236T();
                        return;
                    }
                    C11321d.this.f31765p0.setTrimLines(lineCount - 1);
                    C11321d.this.f31765p0.setText(C11321d.this.f31768s0.f16955b.getShop().getvDescription(), null);
                    C11321d.this.m51237U();
                } else {
                    C11321d.this.m51236T();
                }
                return;
            }
            C11321d.this.f31723U0.removeCallbacks(this);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$d */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11325d extends C2550c {
        C11325d(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C11321d.this.f31758l0.setScaleType(ScaleType.CENTER_CROP);
            C11321d.this.f31758l0.setImageDrawable(C11321d.this.f31767r0.mo23567b(bitmap));
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$e */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11326e implements Callback<CheckinOut> {
        C11326e() {
        }

        public void onFailure(Call<CheckinOut> call, Throwable th) {
            try {
                if (C11321d.this.f31767r0 != null && C11321d.this.isAdded()) {
                    C11321d.this.f31767r0.mo23492O();
                    C11321d.this.f31767r0.mo23615f(C11321d.this.getString(C10232R.string.msg_error_server_issue), C11321d.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CheckinOut> call, Response<CheckinOut> response) {
            try {
                if (C11321d.this.f31767r0 != null && C11321d.this.isAdded()) {
                    C11321d.this.f31767r0.mo23492O();
                    if (response.isSuccessful() && C11321d.this.isAdded()) {
                        if (C11321d.this.f31768s0.f16955b.getCheckedIn().booleanValue()) {
                            C11321d.this.f31768s0.f16955b.setCheckedIn(Boolean.valueOf(false));
                        } else {
                            C11321d.this.f31768s0.f16955b.setCheckedIn(Boolean.valueOf(true));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Check in status after : ");
                        sb.append(C11321d.this.f31768s0.f16955b.getCheckedIn());
                        C5880q.m25753d(sb.toString());
                        CheckinOut checkinOut = (CheckinOut) response.body();
                        C11321d.this.m51254a(checkinOut.getCheckedIn().booleanValue(), checkinOut.getCheckedInCount());
                        if (((ShopDetailPackageActivity) C11321d.this.getActivity()).f31173b0.equalsIgnoreCase("checkinList")) {
                            C11321d.this.f31767r0.mo23473E(C11644i.f33394q4);
                        }
                        if (((CheckinOut) response.body()).getCode() <= 300) {
                            String a = C11321d.this.f31767r0.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                C11321d.this.f31767r0.mo23551a(new ServiceManualDataBean("CheckInShop", a));
                            }
                        }
                    } else if (C11321d.this.f31767r0 != null && C11321d.this.isAdded()) {
                        C11321d.this.f31767r0.mo23615f(response.message(), C11321d.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$f */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11327f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31782a;

        C11327f(Dialog dialog) {
            this.f31782a = dialog;
        }

        public void onClick(View view) {
            this.f31782a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$g */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11328g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31784a;

        C11328g(Dialog dialog) {
            this.f31784a = dialog;
        }

        public void onClick(View view) {
            this.f31784a.dismiss();
            if (C11321d.this.f31767r0.mo23502X()) {
                C11321d dVar = C11321d.this;
                dVar.m51268d(!dVar.f31768s0.f16955b.getCheckedIn().booleanValue());
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$h */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11329h implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f31786a;

        /* renamed from: com.mrsool.shopmenu.expandable.d$h$a */
        /* compiled from: ShopInfoPackageFragmentMenuTest */
        class C11330a implements C10177a<File> {
            C11330a() {
            }

            /* renamed from: a */
            public void mo36448a(C10183b bVar, C10181b<File> bVar2) {
                C11321d.this.f31767r0.mo23468C().mo23448a(C11321d.this.f31768s0.f16955b.getShop().getvImage(), Boolean.valueOf(true));
                File file = (File) bVar2.mo36458a();
                if (C11321d.this.f31700F0.f29412a.mo38170a()) {
                    C11321d.this.f31700F0.f29412a.mo38177b();
                }
                C11321d.this.f31700F0.mo38204a(C11321d.this.m51280g(Uri.fromFile(file).getPath()), C11329h.this.f31786a);
            }

            /* renamed from: a */
            public void mo36449a(C10183b bVar, Throwable th) {
            }
        }

        C11329h(int i) {
            this.f31786a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C10171b.m47256c(C11321d.this.getActivity()).mo36428a(C11321d.this.f31768s0.f16955b.getShop().getvImage(), false).mo36427a(".mrsool", 4).mo36436b((C10177a<File>) new C11330a<File>());
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$i */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11331i implements C11263d {

        /* renamed from: a */
        final /* synthetic */ List f31789a;

        C11331i(List list) {
            this.f31789a = list;
        }

        /* renamed from: a */
        public void mo39098a(int i) {
            if (!TextUtils.isEmpty(((MenuItemsBean) this.f31789a.get(i)).getImage())) {
                Intent intent = new Intent(C11321d.this.getActivity(), ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((MenuItemsBean) this.f31789a.get(i)).getImage());
                C11321d.this.startActivity(intent);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$j */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11332j implements Callback<DeeplinkBean> {
        C11332j() {
        }

        public void onFailure(Call<DeeplinkBean> call, Throwable th) {
            if (C11321d.this.isAdded() && C11321d.this.f31767r0 != null) {
                C11321d.this.f31767r0.mo23653q0();
            }
        }

        public void onResponse(Call<DeeplinkBean> call, Response<DeeplinkBean> response) {
            if (C11321d.this.f31767r0 != null) {
                C11321d.this.f31767r0.mo23492O();
                if (response.isSuccessful()) {
                    if (((DeeplinkBean) response.body()).getCode().intValue() <= 300) {
                        C11321d.this.f31704J0 = (DeeplinkBean) response.body();
                        String a = C11321d.this.f31767r0.mo23528a(response.body());
                        String str = "getDeepLink";
                        if (!TextUtils.isEmpty(a)) {
                            C11321d.this.f31767r0.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            C11321d.this.mo36511f(str);
                        }
                    } else {
                        C11321d.this.f31767r0.mo23615f(((DeeplinkBean) response.body()).getMessage(), C11321d.this.getString(C10232R.string.app_name));
                    }
                } else if (C11321d.this.f31767r0 != null) {
                    C11321d.this.f31767r0.mo23615f(response.message(), C11321d.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$k */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11333k extends BroadcastReceiver {
        C11333k() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33173Q3)) {
                if (C11321d.this.f31715Q0 != null) {
                    C11321d.this.f31715Q0.mo7341e();
                }
                C11321d.this.m51288i0();
                C11321d.this.m51283g0();
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33166P4)) {
                C11321d.this.m51286h0();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$l */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11334l implements Callback<GetBranchList> {

        /* renamed from: a */
        final /* synthetic */ int f31793a;

        C11334l(int i) {
            this.f31793a = i;
        }

        public void onFailure(Call<GetBranchList> call, Throwable th) {
            if (C11321d.this.isAdded() && C11321d.this.f31767r0 != null) {
                C11321d.this.f31767r0.mo23492O();
                if (C11321d.this.f31768s0.f16955b.getShop().isBOMSLinked()) {
                    C11321d.this.m51248a(this.f31793a, false, 0, 1);
                }
            }
        }

        public void onResponse(Call<GetBranchList> call, Response<GetBranchList> response) {
            if (C11321d.this.f31767r0 != null && C11321d.this.isAdded()) {
                if (response.isSuccessful() && ((GetBranchList) response.body()).getCode() <= 300) {
                    C11321d.this.f31768s0.f16955b.getShop().setBranchList(((GetBranchList) response.body()).getBranchList());
                    C11321d.this.f31768s0.f16955b.setBarColor(((GetBranchList) response.body()).getBarColor());
                    C11321d.this.f31768s0.f16955b.setAllowOrder(Boolean.valueOf(((GetBranchList) response.body()).isAllowOrder()));
                    C11321d.this.f31768s0.f16955b.setShop_order_alert_text(((GetBranchList) response.body()).getShopOrderAlertText());
                    C11321d.this.m51234R();
                } else if (response.body() != null) {
                    C11321d.this.f31767r0.mo23615f(((GetBranchList) response.body()).getMessage(), C11321d.this.getString(C10232R.string.app_name));
                }
                if (C11321d.this.f31768s0.f16955b.getShop().isBOMSLinked()) {
                    C11321d.this.m51248a(this.f31793a, false, 0, 1);
                } else {
                    C11321d.this.f31767r0.mo23492O();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$m */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11335m implements Callback<GetMenuBean> {

        /* renamed from: a */
        final /* synthetic */ int f31795a;

        /* renamed from: b */
        final /* synthetic */ boolean f31796b;

        C11335m(int i, boolean z) {
            this.f31795a = i;
            this.f31796b = z;
        }

        public void onFailure(Call<GetMenuBean> call, Throwable th) {
            if (C11321d.this.isAdded() && C11321d.this.f31767r0 != null) {
                C11321d.this.f31699E0.setVisibility(8);
                C11321d.this.f31767r0.mo23492O();
                C11321d.this.f31767r0.mo23615f(C11321d.this.getString(C10232R.string.msg_error_server_issue), C11321d.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetMenuBean> call, Response<GetMenuBean> response) {
            if (C11321d.this.f31767r0 != null && C11321d.this.isAdded()) {
                if (!response.isSuccessful() || ((GetMenuBean) response.body()).getCode() > 300) {
                    C11321d.this.f31699E0.setVisibility(8);
                    C11321d.this.f31767r0.mo23492O();
                    C11321d.this.m51274e(false);
                } else {
                    ShopDetailPackageActivity.f31150n0 = ((GetMenuBean) response.body()).getMenuBean().getArrayListCategoryBean();
                    ShopDetailPackageActivity.f31154r0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessAccountId();
                    ShopDetailPackageActivity.f31155s0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessBranchId();
                    ShopDetailPackageActivity.f31156t0 = ((GetMenuBean) response.body()).getMenuBean().getVatMultiplier();
                    if (this.f31795a == 3) {
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
                    C11321d.this.m51235S();
                    C11321d dVar = C11321d.this;
                    ArrayList<MenuCategoryBean> arrayList = ShopDetailPackageActivity.f31150n0;
                    dVar.f31703I0 = arrayList != null && arrayList.size() > 0;
                    C11321d.this.f31767r0.mo23492O();
                    C11321d.this.m51240X();
                    C11321d.this.m51274e(true);
                }
                boolean z = this.f31796b;
                String str = C11644i.f33173Q3;
                if (z) {
                    int i4 = this.f31795a;
                    if (i4 == 2) {
                        if (C11321d.this.f31703I0) {
                            C11321d.this.m51274e(true);
                            C11321d.this.f31767r0.mo23473E(str);
                        } else {
                            C11321d.this.m51274e(false);
                        }
                    } else if (i4 == 1 && C11321d.this.f31703I0) {
                        C11321d.this.m51274e(true);
                    }
                } else if (this.f31795a == 3) {
                    C11321d.this.f31767r0.mo23473E(str);
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$n */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11336n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f31798a;

        C11336n(int i) {
            this.f31798a = i;
        }

        public void run() {
            C11321d.this.f31749g1.mo6994f(C11321d.this.m51271e(this.f31798a), (int) C11321d.this.getResources().getDimension(C10232R.dimen.dp_4_sub));
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$o */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11337o extends C1660t {
        C11337o() {
        }

        /* renamed from: a */
        public void mo7531a(@C0193h0 RecyclerView recyclerView, int i) {
            super.mo7531a(recyclerView, i);
            StringBuilder sb = new StringBuilder();
            sb.append("newState: ");
            sb.append(i);
            sb.toString();
            C11321d dVar = C11321d.this;
            Runnable runnable = dVar.f31761m1;
            if (runnable != null) {
                dVar.f31759l1.removeCallbacksAndMessages(runnable);
            }
            C11321d dVar2 = C11321d.this;
            dVar2.f31759l1.postDelayed(dVar2.f31761m1, 5);
        }

        /* renamed from: a */
        public void mo7532a(@C0193h0 RecyclerView recyclerView, int i, int i2) {
            super.mo7532a(recyclerView, i, i2);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$p */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11338p implements C5607e {
        C11338p() {
        }

        /* renamed from: a */
        public void mo22154a(AppBarLayout appBarLayout, int i) {
            if (C11321d.this.m51216B() + i == 0) {
                C11321d.this.m51275e0();
            } else {
                C11321d.this.m51223G();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$q */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11339q implements C7051h {
        C11339q() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            if (C11321d.this.f31739b1) {
                C11321d.this.f31739b1 = false;
                return;
            }
            C11321d.this.f31741c1 = true;
            C11321d.this.m51281g(kVar.mo28203f());
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            if (C11321d.this.f31739b1) {
                C11321d.this.f31739b1 = false;
                return;
            }
            C11321d.this.f31741c1 = true;
            C11321d.this.m51281g(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$r */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11340r implements Runnable {
        C11340r() {
        }

        public void run() {
            if (C11321d.this.isAdded()) {
                if (C11321d.this.f31741c1) {
                    C11321d.this.f31741c1 = false;
                    return;
                }
                C11321d.this.f31739b1 = true;
                TabLayout d = C11321d.this.f31747f1;
                TabLayout d2 = C11321d.this.f31747f1;
                C11321d dVar = C11321d.this;
                d.mo28123d(d2.mo28096a(dVar.m51261c(dVar.f31749g1.mo6959N())));
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$s */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11341s implements OnClickListener {
        C11341s() {
        }

        public void onClick(View view) {
            C11321d.this.f31707M0.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$t */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11342t implements OnGlobalLayoutListener {

        /* renamed from: com.mrsool.shopmenu.expandable.d$t$a */
        /* compiled from: ShopInfoPackageFragmentMenuTest */
        class C11343a implements Runnable {
            C11343a() {
            }

            public void run() {
                C11321d.this.f31723U0 = new Handler();
                C11321d.this.m51238V();
            }
        }

        C11342t() {
        }

        public void onGlobalLayout() {
            new Handler().postDelayed(new C11343a(), 100);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$u */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    class C11344u implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31807a;

        C11344u(Dialog dialog) {
            this.f31807a = dialog;
        }

        public void onClick(View view) {
            this.f31807a.dismiss();
            Intent intent = new Intent(C11321d.this.getContext(), BranchesActivity.class);
            intent.putExtra(C11644i.f33431v1, C11321d.this.getString(C10232R.string.lbl_tab_shop_pkg_info));
            C11321d.this.startActivityForResult(intent, 102);
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.d$v */
    /* compiled from: ShopInfoPackageFragmentMenuTest */
    public interface C11345v {
        /* renamed from: b */
        void mo39405b(Uri uri);
    }

    /* renamed from: D */
    private String m51220D() {
        try {
            if (((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return String.valueOf(((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(0)).getDistance());
            }
            for (int i = 0; i < this.f31768s0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return String.valueOf(((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i)).getDistance());
                }
            }
            return "X";
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    private C11668s m51221E() {
        C11668s sVar = new C11668s(this.f31768s0.f16955b.getShop().getvImage(), true, false, null, null, false, true, this.f31700F0.mo38199a());
        return sVar;
    }

    /* renamed from: F */
    private void m51222F() {
        if (this.f31710O.getVisibility() == 8 && this.f31760m0.getVisibility() == 8) {
            this.f31737b.getVisibility();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m51223G() {
        try {
            this.f31747f1.setAlpha(0.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    private void m51224H() {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(C10232R.C10236id.tbTXT);
        TextView textView = (TextView) toolbar.findViewById(C10232R.C10236id.txtTitle);
        TextView textView2 = (TextView) toolbar.findViewById(C10232R.C10236id.txtSubTitle);
        LinearLayout linearLayout = (LinearLayout) toolbar.findViewById(C10232R.C10236id.layRightClick);
        this.f31767r0 = new C5887x(getActivity());
        this.f31719S0 = new C11614c(getActivity());
        this.f31701G0 = new C11669t(getActivity());
        this.f31753i1 = (AppBarLayout) this.f31764o0.findViewById(C10232R.C10236id.appBarLayout);
        this.f31747f1 = (TabLayout) this.f31764o0.findViewById(C10232R.C10236id.tabLayoutMenu);
        this.f31733Z0 = (LinearLayout) this.f31764o0.findViewById(C10232R.C10236id.llAboveDetail);
        this.f31736a1 = (LinearLayout) this.f31764o0.findViewById(C10232R.C10236id.llMenuHeader);
        this.f31729X0 = (FrameLayout) this.f31764o0.findViewById(C10232R.C10236id.flBottomLayout);
        if (this.f31767r0.mo23496R()) {
            this.f31764o0.findViewById(C10232R.C10236id.ivArrowRightBranch).setScaleX(-1.0f);
            this.f31764o0.findViewById(C10232R.C10236id.ivArrowRightRating).setScaleX(-1.0f);
            this.f31764o0.findViewById(C10232R.C10236id.ivArrowRightHours).setScaleX(-1.0f);
        }
        toolbar.findViewById(C10232R.C10236id.llLeft).setVisibility(0);
        this.f31767r0.mo23553a((C11056p) this);
        linearLayout.setOnClickListener(this);
        this.f31727W0 = (FrameLayout) this.f31764o0.findViewById(C10232R.C10236id.flMenuTotal);
        this.f31714Q = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvAmount);
        this.f31716R = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvCurrency);
        this.f31713P0 = (RecyclerView) this.f31764o0.findViewById(C10232R.C10236id.expandableListView);
        this.f31749g1 = new LinearLayoutManager(getActivity());
        this.f31713P0.setLayoutManager(this.f31749g1);
        this.f31756k0 = (ImageView) this.f31764o0.findViewById(C10232R.C10236id.imgIamCheckin);
        this.f31758l0 = (ImageView) toolbar.findViewById(C10232R.C10236id.ivServiceLogo);
        this.f31735a0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.txtIamCheckin);
        this.f31738b0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.txtCheckInCount);
        this.f31774y0 = (RelativeLayout) this.f31764o0.findViewById(C10232R.C10236id.rlVideoTour);
        this.f31711O0 = (VideoView) this.f31764o0.findViewById(C10232R.C10236id.video_view);
        this.f31711O0.setOnClickListener(this);
        this.f31773x0 = (ImageView) this.f31764o0.findViewById(C10232R.C10236id.ivVideoThumb);
        this.f31766q0 = this.f31764o0.findViewById(C10232R.C10236id.flBannerContainer);
        this.f31760m0 = (LinearLayout) this.f31764o0.findViewById(C10232R.C10236id.llMenuContainer);
        this.f31734a = this.f31764o0.findViewById(C10232R.C10236id.rlOrderNowMain);
        this.f31734a.setOnClickListener(this);
        this.f31710O = this.f31764o0.findViewById(C10232R.C10236id.llBranch);
        this.f31712P = this.f31764o0.findViewById(C10232R.C10236id.flOrderCount);
        this.f31742d0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvDistanceAway);
        this.f31710O.setOnClickListener(this);
        this.f31710O.setEnabled(false);
        if (this.f31767r0.mo23504Z().booleanValue()) {
            this.f31710O.setVisibility(8);
        } else if (m51227K()) {
            this.f31710O.setVisibility(0);
        }
        this.f31697C0 = (ProgressBar) this.f31764o0.findViewById(C10232R.C10236id.pgLoading);
        this.f31698D0 = (ProgressBar) this.f31764o0.findViewById(C10232R.C10236id.pgLoadImage);
        this.f31699E0 = (ProgressBar) this.f31764o0.findViewById(C10232R.C10236id.pgMenuLoad);
        this.f31754j0 = (ImageView) this.f31764o0.findViewById(C10232R.C10236id.ivLocation);
        this.f31724V = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvBranchAddress);
        this.f31726W = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvCount);
        this.f31728X = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvOrderNow);
        this.f31730Y = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvNoCourier);
        this.f31744e0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvDiscountTemp);
        this.f31746f0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvDiscount);
        this.f31732Z = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvWrkHrsTime);
        this.f31752i0 = (ImageView) this.f31764o0.findViewById(C10232R.C10236id.ivYelloBg);
        linearLayout.setVisibility(0);
        this.f31717R0 = this.f31764o0.findViewById(C10232R.C10236id.flOrderNowDiscount);
        this.f31762n0 = (FrameLayout) this.f31764o0.findViewById(C10232R.C10236id.llBOMSMenuContainer);
        ShopDetails shopDetails = this.f31768s0.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            getActivity().finish();
            return;
        }
        m51249a(this.f31768s0.f16955b);
        m51231O();
        textView.setText(this.f31768s0.f16955b.getShop().getvTitle());
        textView2.setText(this.f31768s0.f16955b.getShop().getvSubTitle());
        textView2.setSelected(true);
        m51266c0();
        this.f31740c0 = (TextView) this.f31764o0.findViewById(C10232R.C10236id.txtPkgTitle);
        this.f31765p0 = (ReadMoreTextView) this.f31764o0.findViewById(C10232R.C10236id.txtPkgDesc);
        this.f31769t0 = (RoundedImage) this.f31764o0.findViewById(C10232R.C10236id.imgPkgInfo);
        this.f31769t0.setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_16));
        this.f31750h0 = (ImageView) this.f31764o0.findViewById(C10232R.C10236id.imgPkgIcon);
        this.f31769t0.setOnClickListener(this);
        this.f31765p0.setOnClickListener(this);
        this.f31775z0 = (RecyclerView) this.f31764o0.findViewById(C10232R.C10236id.rvMenu);
        this.f31708N = this.f31764o0.findViewById(C10232R.C10236id.llCustomerReviews);
        this.f31737b = this.f31764o0.findViewById(C10232R.C10236id.llWorkingHrs);
        this.f31718S = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvReviewLbl);
        this.f31720T = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvRting);
        this.f31722U = (TextView) this.f31764o0.findViewById(C10232R.C10236id.tvHrsStatus);
        this.f31748g0 = (RatingBar) this.f31764o0.findViewById(C10232R.C10236id.rbAllOver);
        this.f31696B0 = (LinearLayout) this.f31764o0.findViewById(C10232R.C10236id.llMain);
        this.f31737b.setOnClickListener(this);
        this.f31708N.setOnClickListener(this);
        m51241Y();
        m51250a(this.f31768s0.f16955b.getShop().getShop_menu());
        m51304x();
        ((LinearLayout) this.f31764o0.findViewById(C10232R.C10236id.layCheckIn)).setOnClickListener(this);
        m51260b0();
        m51239W();
        m51242Z();
        m51256a0();
        m51222F();
        m51283g0();
        if (this.f31768s0.f16955b.getShop().isDisableOrderNow()) {
            m51264c(true);
        }
        this.f31697C0.setVisibility(0);
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f31755j1, new IntentFilter(C11644i.f33173Q3));
        this.f31765p0.getViewTreeObserver().addOnGlobalLayoutListener(this.f31763n1);
    }

    /* renamed from: I */
    private boolean m51225I() {
        if (this.f31703I0) {
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
    public boolean m51226J() {
        return true;
    }

    /* renamed from: K */
    private boolean m51227K() {
        if ((this.f31768s0.f16955b.getShop().isbIsPickupFixed() == 1 || this.f31768s0.f16955b.getShop().isbIsDropoffFixed() == 1) && this.f31768s0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: L */
    private boolean m51228L() {
        return this.f31767r0.mo23468C().mo23450a(this.f31768s0.f16955b.getShop().getvImage());
    }

    /* renamed from: M */
    private void m51229M() {
        C11598a.m52263f().mo39829b(this.f31768s0.f16954a.getShopId());
    }

    /* renamed from: N */
    private void m51230N() {
        try {
            C11598a.m52263f().mo39811a(this.f31768s0.f16955b.getShop().getTotalReviews(), (double) this.f31768s0.f16955b.getShop().getRating(), this.f31768s0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    private void m51231O() {
        try {
            this.f31719S0.mo39854c(this.f31768s0.f16955b.getShop().getVShopId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: P */
    private void m51232P() {
        try {
            C11598a.m52263f().mo39840e(this.f31768s0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q */
    private void m51233Q() {
        this.f31765p0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f31763n1);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m51234R() {
        if (this.f31768s0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            this.f31710O.setVisibility(0);
            this.f31710O.setVisibility(0);
            this.f31724V.setText(m51218C());
            TextView textView = this.f31742d0;
            String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(m51220D());
            textView.setText(String.format(string, new Object[]{sb.toString()}));
            this.f31710O.setEnabled(true);
            return;
        }
        this.f31710O.setVisibility(8);
        this.f31710O.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m51235S() {
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
    public void m51236T() {
        this.f31765p0.setVisibility(0);
        this.f31696B0.setVisibility(0);
        this.f31697C0.setVisibility(8);
        m51306y();
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m51237U() {
        this.f31725V0 = new C11324c();
        this.f31723U0.postDelayed(this.f31725V0, 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m51238V() {
        int lineCount = this.f31765p0.getLineCount();
        boolean J = m51226J();
        StringBuilder sb = new StringBuilder();
        sb.append("Text Line Count : ");
        sb.append(lineCount);
        C5880q.m25754e(sb.toString());
        if (lineCount != 0) {
            if (lineCount <= 4 || this.f31702H0 != 1 || !J) {
                if (lineCount >= 1) {
                    int i = this.f31702H0;
                    if (i == 1) {
                        this.f31702H0 = i + 1;
                        this.f31765p0.setTextSize(2, 18.0f);
                        C5880q.m25754e("Text Size : 18");
                        return;
                    }
                }
                if (lineCount >= 2) {
                    int i2 = this.f31702H0;
                    if (i2 == 2) {
                        this.f31702H0 = i2 + 1;
                        this.f31765p0.setTextSize(2, 16.0f);
                        C5880q.m25754e("Text Size : 16");
                        return;
                    }
                }
                if (lineCount >= 3) {
                    int i3 = this.f31702H0;
                    if (i3 == 3) {
                        this.f31702H0 = i3 + 1;
                        this.f31765p0.setTextSize(2, 14.0f);
                        C5880q.m25754e("Text Size : 14");
                        return;
                    }
                }
                if (lineCount >= 4 && this.f31702H0 == 4) {
                    this.f31765p0.setTextSize(2, 13.0f);
                    C5880q.m25754e("Text Size : 13");
                    m51233Q();
                }
                m51237U();
                return;
            }
            this.f31765p0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f31763n1);
            m51237U();
        }
    }

    /* renamed from: W */
    private void m51239W() {
        if (this.f31768s0.f16955b.getShop().isHasDiscount()) {
            String replace = this.f31768s0.f16955b.getShop().getDiscountLabel().replace(this.f31768s0.f16955b.getShop().getDiscountShortLabel(), "");
            this.f31717R0.setVisibility(0);
            this.f31746f0.setText(replace);
            this.f31744e0.setText(this.f31768s0.f16955b.getShop().getDiscountShortLabel());
            return;
        }
        this.f31717R0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m51240X() {
        this.f31739b1 = false;
        this.f31741c1 = false;
        if (this.f31715Q0 == null) {
            this.f31764o0.findViewById(C10232R.C10236id.dividerOpenNow).setVisibility(8);
            this.f31713P0.setPadding(0, 0, 0, this.f31729X0.getMeasuredHeight());
            this.f31713P0.addOnScrollListener(this.f31757k1);
            this.f31753i1.mo22072a((C5607e) new C11338p());
            this.f31747f1.mo28104a((C7051h) new C11339q());
        }
        this.f31747f1.mo28139h();
        try {
            Iterator it = ShopDetailPackageActivity.f31150n0.iterator();
            while (it.hasNext()) {
                this.f31747f1.mo28105a(this.f31747f1.mo28126f().mo28195b((CharSequence) ((MenuCategoryBean) it.next()).getCategoryName().trim()));
                ((TextView) this.f31747f1.mo28096a(this.f31747f1.getTabCount() - 1).f19940i.getChildAt(1)).setSingleLine(true);
            }
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ShopDetailPackageActivity.f31150n0.iterator();
        while (it2.hasNext()) {
            MenuCategoryBean menuCategoryBean = (MenuCategoryBean) it2.next();
            arrayList.add(new C11320c(menuCategoryBean, menuCategoryBean.getArrayListMenuItems()));
        }
        this.f31713P0.setAdapter(new C11315a(getContext(), arrayList));
        this.f31699E0.setVisibility(8);
        this.f31713P0.setVisibility(0);
        this.f31747f1.setVisibility(0);
    }

    /* renamed from: Y */
    private void m51241Y() {
        AppSingleton appSingleton = this.f31768s0;
        if (appSingleton == null) {
            ShopDetails shopDetails = appSingleton.f16955b;
            if (shopDetails == null && shopDetails.getShop() == null) {
                return;
            }
        }
        if (this.f31768s0.f16955b.getShop().getOpening_hours() == null || this.f31768s0.f16955b.getShop().getOpening_hours().size() <= 0) {
            this.f31737b.setVisibility(8);
        } else {
            if (this.f31768s0.f16955b.getShop().isServiceShopOpen()) {
                this.f31722U.setText(getResources().getString(C10232R.string.lbl_open_now));
                this.f31754j0.setImageResource(C10232R.C10235drawable.ic_clock_grey);
            } else {
                this.f31722U.setText(getResources().getString(C10232R.string.lbl_closed));
                this.f31754j0.setImageResource(C10232R.C10235drawable.ic_clock_red);
                this.f31722U.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.red_lite_3));
            }
            this.f31732Z.setText(this.f31768s0.f16955b.getShop().getTodaysWorkingHours());
        }
    }

    /* renamed from: Z */
    private void m51242Z() {
        this.f31765p0.setmOnCollapseExpandListner(new C11323b());
    }

    /* renamed from: a0 */
    private void m51256a0() {
        try {
            if (this.f31768s0.f16955b.getShop().getTotalReviews().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                this.f31718S.setText(getResources().getString(C10232R.string.lbl_no_customer_review));
                this.f31748g0.setRating(0.0f);
                this.f31720T.setVisibility(8);
            } else {
                this.f31708N.setVisibility(0);
                TextView textView = this.f31718S;
                String string = getResources().getString(C10232R.string.lbl_no_reviews);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f31768s0.f16955b.getShop().getTotalReviews());
                textView.setText(String.format(string, new Object[]{sb.toString()}));
                this.f31720T.setText(String.valueOf(this.f31768s0.f16955b.getShop().getRating()));
                this.f31748g0.setRating(Float.parseFloat(String.valueOf(this.f31768s0.f16955b.getShop().getRating())));
                this.f31720T.setVisibility(0);
            }
            if (this.f31768s0.f16955b.getShop().isRateable()) {
                this.f31708N.setVisibility(0);
            } else {
                this.f31708N.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b0 */
    private void m51260b0() {
        if (this.f31768s0.f16955b.getShop().getvIcon() != null && !TextUtils.isEmpty(this.f31768s0.f16955b.getShop().getvIcon().trim())) {
            C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31768s0.f16955b.getShop().getvIcon()).m11491c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11496d().m11500e((int) C10232R.C10235drawable.shop_place_holder_white).mo9424a(this.f31750h0);
        }
        if (this.f31768s0.f16955b.getShop().getvTitle() != null && !TextUtils.isEmpty(this.f31768s0.f16955b.getShop().getvTitle().trim())) {
            this.f31740c0.setText(this.f31768s0.f16955b.getShop().getvSubTitle());
        }
        if (this.f31768s0.f16955b.getShop().getvDescription() != null && !TextUtils.isEmpty(this.f31768s0.f16955b.getShop().getvDescription().trim())) {
            this.f31765p0.setText(this.f31768s0.f16955b.getShop().getvDescription());
        }
    }

    /* renamed from: c0 */
    private void m51266c0() {
        C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31768s0.f16955b.getShop().getvIcon()).mo9441j().m11405c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11415e((int) C10232R.C10235drawable.shop_place_holder_white).mo9458b(new C11325d(this.f31758l0));
    }

    /* renamed from: d0 */
    private void m51270d0() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f31767r0;
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
        textView.setOnClickListener(new C11344u(dialog));
        textView2.setOnClickListener(new C11322a(dialog));
        if (isAdded() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m51275e0() {
        try {
            this.f31747f1.setAlpha(1.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f0 */
    private void m51279f0() {
        String str = "";
        try {
            if (this.f31707M0 == null || !this.f31707M0.isShowing()) {
                View inflate = LayoutInflater.from(getActivity()).inflate(C10232R.layout.dialog_working_hrs, null);
                this.f31707M0 = new Dialog(getActivity());
                this.f31707M0.requestWindowFeature(1);
                this.f31707M0.setContentView(inflate);
                LinearLayout linearLayout = (LinearLayout) this.f31707M0.findViewById(C10232R.C10236id.llWorkingHoursMonThurs);
                TextView textView = (TextView) this.f31707M0.findViewById(C10232R.C10236id.txtOk);
                if (this.f31767r0 != null) {
                    this.f31767r0.mo23535a(this.f31707M0);
                }
                if (this.f31768s0.f16955b.getShop().getOpening_hours() != null) {
                    for (int i = 0; i < this.f31768s0.f16955b.getShop().getOpening_hours().size(); i++) {
                        View inflate2 = getActivity().getLayoutInflater().inflate(C10232R.layout.row_working_hours, null);
                        TextView textView2 = (TextView) inflate2.findViewById(C10232R.C10236id.tvDay);
                        TextView textView3 = (TextView) inflate2.findViewById(C10232R.C10236id.tvTime);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(((WorkingHoursBean) this.f31768s0.f16955b.getShop().getOpening_hours().get(i)).getDay());
                        textView2.setText(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(((WorkingHoursBean) this.f31768s0.f16955b.getShop().getOpening_hours().get(i)).getTime());
                        textView3.setText(sb2.toString());
                        linearLayout.addView(inflate2);
                        if (getResources().getDisplayMetrics().densityDpi <= 240) {
                            textView3.setTextSize(2, 11.0f);
                        } else if (getResources().getDisplayMetrics().densityDpi <= 320) {
                            textView3.setTextSize(2, 12.0f);
                        }
                    }
                    if (!getActivity().isFinishing()) {
                        this.f31707M0.show();
                    }
                }
                textView.setOnClickListener(new C11341s());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m51283g0() {
        if (isAdded()) {
            if (this.f31768s0.f16955b.getBarColor().equalsIgnoreCase(getString(C10232R.string.lbl_order_color_yellow))) {
                this.f31730Y.setText(this.f31768s0.f16955b.getShop_order_alert_text());
                this.f31752i0.setVisibility(0);
                this.f31730Y.setVisibility(0);
                this.f31728X.setVisibility(8);
            } else {
                this.f31752i0.setVisibility(8);
                this.f31730Y.setVisibility(8);
                this.f31728X.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m51286h0() {
        ViewPager viewPager = ShopDetailActivity.f31114j0;
        if (viewPager != null) {
            viewPager.setCurrentItem(0);
        }
        this.f31715Q0.mo7341e();
        m51288i0();
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m51288i0() {
        int i;
        double d;
        this.f31745e1 = 0.0d;
        String str = "";
        if (this.f31703I0) {
            i = 0;
            for (int i2 = 0; i2 < ShopDetailPackageActivity.f31150n0.size(); i2++) {
                i += ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getOrderCount();
            }
            for (int i3 = 0; i3 < ShopDetailPackageActivity.f31150n0.size(); i3++) {
                for (int i4 = 0; i4 < ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().size(); i4++) {
                    if (((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getOrderCount() > 0) {
                        if (this.f31731Y0.equals(str)) {
                            this.f31731Y0 = ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getCurrency();
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
                        double d4 = this.f31745e1;
                        double orderCount = (double) ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4)).getOrderCount();
                        Double.isNaN(orderCount);
                        this.f31745e1 = d4 + (d2 * orderCount);
                    }
                }
            }
            if (this.f31745e1 > 0.0d) {
                this.f31727W0.setVisibility(0);
            } else {
                this.f31727W0.setVisibility(8);
            }
        } else {
            i = 0;
        }
        TextView textView = this.f31726W;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        textView.setText(sb.toString());
        TextView textView2 = this.f31714Q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C5887x.m25809b(Double.valueOf(this.f31745e1)));
        textView2.setText(sb2.toString());
        this.f31716R.setText(this.f31731Y0);
        if (isAdded()) {
            if (i <= 0) {
                this.f31728X.setText(getString(C10232R.string.lbl_tb_title_order_now));
                this.f31726W.setVisibility(8);
                this.f31712P.setVisibility(8);
                m51264c(true);
            } else {
                this.f31728X.setText(getString(C10232R.string.btn_place_order));
                this.f31726W.setVisibility(0);
                this.f31712P.setVisibility(0);
                m51264c(false);
            }
        }
        this.f31713P0.setPadding(0, 0, 0, this.f31729X0.getMeasuredHeight());
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
                    this.f31715Q0.mo7341e();
                    m51288i0();
                    if (intent != null && intent.getBooleanExtra(C11644i.f33293e7, false)) {
                        m51248a(0, false, 0, 3);
                        return;
                    }
                    return;
                case 101:
                    int intExtra = intent.getIntExtra(C11644i.f33456y2, 0);
                    if (m51228L()) {
                        m51277f(intExtra);
                        return;
                    }
                    this.f31700F0.mo38204a(m51221E(), intExtra);
                    m51277f(intExtra);
                    return;
                case 102:
                    BranchBean branchBean = (BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0));
                    if (this.f31768s0.f16955b.getShop().isbIsPickupFixed() == 1) {
                        this.f31768s0.f16955b.getShop().setPlatitude(branchBean.getLatitude());
                        this.f31768s0.f16955b.getShop().setPlongitude(branchBean.getLongitude());
                        this.f31768s0.f16955b.getShop().setvPickupAddress(branchBean.getvAddress());
                    }
                    if (this.f31768s0.f16955b.getShop().isbIsDropoffFixed() == 1) {
                        this.f31768s0.f16955b.getShop().setDlatitude(branchBean.getLatitude());
                        this.f31768s0.f16955b.getShop().setDlongitude(branchBean.getLongitude());
                        this.f31768s0.f16955b.getShop().setvDropoffAddress(branchBean.getvAddress());
                    }
                    this.f31724V.setText(((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getvAddress());
                    TextView textView = this.f31742d0;
                    String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getDistance());
                    textView.setText(String.format(string, new Object[]{sb2.toString()}));
                    if (this.f31768s0.f16955b.getShop().isBOMSLinked()) {
                        m51248a(0, true, intent.getIntExtra(C11644i.f33332j1, 0), 2);
                    }
                    m51288i0();
                    m51283g0();
                    return;
                default:
                    return;
            }
        } else {
            m51256a0();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.imgPkgInfo /*2131362498*/:
                if (!TextUtils.isEmpty(this.f31768s0.f16955b.getShop().getvImage())) {
                    if ("image".equalsIgnoreCase(this.f31768s0.f16955b.getShop().getvImageType())) {
                        Intent intent = new Intent(getActivity(), ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, this.f31768s0.f16955b.getShop().getvImage());
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case C10232R.C10236id.layCheckIn /*2131362894*/:
                if (this.f31767r0.mo23503Y()) {
                    return;
                }
                if (!this.f31768s0.f16955b.getCheckedIn().booleanValue()) {
                    m51285h(getString(C10232R.string.msg_info_checkin));
                    return;
                } else {
                    m51268d(true);
                    return;
                }
            case C10232R.C10236id.layRightClick /*2131362913*/:
                m51308z();
                return;
            case C10232R.C10236id.llBranch /*2131362975*/:
                if (!this.f31767r0.mo23503Y() && this.f31767r0.mo23497S()) {
                    if (m51225I()) {
                        m51270d0();
                        return;
                    }
                    Intent intent2 = new Intent(getContext(), BranchesActivity.class);
                    intent2.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
                    startActivityForResult(intent2, 102);
                    return;
                }
                return;
            case C10232R.C10236id.llCustomerReviews /*2131363013*/:
                C5887x xVar = this.f31767r0;
                if (xVar != null && !xVar.mo23503Y()) {
                    startActivityForResult(new Intent(getContext(), ServiceReviewListActivity.class), 1009);
                    m51230N();
                    return;
                }
                return;
            case C10232R.C10236id.llWorkingHrs /*2131363202*/:
                m51279f0();
                m51232P();
                return;
            case C10232R.C10236id.rlOrderNowMain /*2131363485*/:
                if (this.f31767r0.mo23497S()) {
                    mo39390w();
                    return;
                }
                return;
            case C10232R.C10236id.txtPkgDesc /*2131364134*/:
                this.f31765p0.mo39696f();
                return;
            case C10232R.C10236id.video_view /*2131364235*/:
                Intent intent3 = new Intent(getContext(), ViewVideoFullActivity.class);
                intent3.putExtra(C11644i.f33383p1, this.f31768s0.f16955b.getShop().getvImage());
                intent3.putExtra(C11644i.f33448x2, m51221E());
                C10724c cVar = this.f31700F0;
                if (!(cVar == null || cVar.mo38209c() == null)) {
                    this.f31700F0.mo38209c().mo38177b();
                }
                C1376c activity = getActivity();
                VideoView videoView = this.f31711O0;
                startActivityForResult(intent3, 101, C0737c.m4272a((Activity) activity, (View) videoView, C0962e0.m5415S(videoView)).mo4091b());
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31764o0 = layoutInflater.inflate(C10232R.layout.fragment_shop_info_package_menu_test, viewGroup, false);
        MapsInitializer.initialize(getActivity().getApplicationContext());
        this.f31768s0 = (AppSingleton) getActivity().getApplicationContext();
        return this.f31764o0;
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(getActivity());
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51224H();
    }

    public void start() {
        this.f31773x0.setVisibility(8);
    }

    /* renamed from: A */
    private C1817b m51214A() {
        C1817b bVar = new C1817b(getActivity());
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public int m51216B() {
        return this.f31733Z0.getMeasuredHeight();
    }

    /* renamed from: C */
    private String m51218C() {
        try {
            if (((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return ((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(0)).getvAddress();
            }
            for (int i = 0; i < this.f31768s0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return ((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i)).getvAddress();
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m51281g(int i) {
        this.f31713P0.post(new C11336n(i));
    }

    /* renamed from: h */
    private void m51285h(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        textView4.setText(getString(C10232R.string.lbl_dg_title_yes));
        textView2.setText(getString(C10232R.string.lbl_dg_title_check_in));
        textView.setText(str);
        textView3.setOnClickListener(new C11327f(dialog));
        textView4.setOnClickListener(new C11328g(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: x */
    private void m51304x() {
        try {
            if (!TextUtils.isEmpty(this.f31768s0.f16955b.getShop().getvImage())) {
                String str = this.f31768s0.f16955b.getShop().getvImageType();
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
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31768s0.f16955b.getShop().getvImage()).m11496d().mo9424a((ImageView) this.f31769t0);
                } else if (c == 1) {
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31768s0.f16955b.getShop().getvImage()).mo9456k().mo9429c((int) C10232R.C10235drawable.ic_image_placeholder).mo9430c((Drawable) m51214A()).mo9424a((ImageView) this.f31769t0);
                } else if (c == 2) {
                    this.f31766q0.setVisibility(8);
                    this.f31774y0.setVisibility(0);
                    this.f31773x0.setVisibility(8);
                    this.f31700F0 = new C10724c(getActivity().findViewById(16908290));
                    if (m51228L()) {
                        m51277f(0);
                        return;
                    }
                    this.f31700F0.mo38204a(m51221E(), 0);
                    m51277f(0);
                }
            } else {
                this.f31698D0.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    private void m51306y() {
        try {
            if (!this.f31721T0) {
                this.f31721T0 = true;
                if (m51227K()) {
                    m51247a(0);
                } else if (this.f31768s0.f16955b.getShop().isBOMSLinked()) {
                    m51248a(0, false, 0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    private void m51308z() {
        C5887x xVar = this.f31767r0;
        if (xVar != null && xVar.mo23502X()) {
            AppSingleton appSingleton = this.f31768s0;
            if (appSingleton != null) {
                FourSquareMainBean fourSquareMainBean = appSingleton.f16954a;
                if (fourSquareMainBean != null && fourSquareMainBean.getShopId() != null) {
                    this.f31767r0.mo23665u0();
                    HashMap hashMap = new HashMap();
                    hashMap.put("vShopId", this.f31768s0.f16954a.getShopId());
                    C5882b.m25774a(this.f31767r0).getDeepLink(hashMap).enqueue(new C11332j());
                }
            }
        }
    }

    /* renamed from: w */
    public void mo39390w() {
        Intent intent;
        C5887x xVar = this.f31767r0;
        if (xVar != null && !xVar.mo23503Y() && !this.f31767r0.mo23503Y()) {
            ShopDetails shopDetails = this.f31768s0.f16955b;
            if (shopDetails != null && shopDetails.getAllowOrder().booleanValue()) {
                if (this.f31768s0.f16955b.getShop() == null) {
                    getActivity().finish();
                    return;
                }
                if (!this.f31703I0 || !m51225I()) {
                    intent = new Intent(getActivity(), CreateOrderActivity.class);
                } else {
                    intent = new Intent(getActivity(), MenuOrderActivityStep1.class);
                    ShopDetailPackageActivity shopDetailPackageActivity = (ShopDetailPackageActivity) getActivity();
                    intent.putExtra(C11687c.f33739W0, ShopDetailPackageActivity.f31154r0);
                    ShopDetailPackageActivity shopDetailPackageActivity2 = (ShopDetailPackageActivity) getActivity();
                    intent.putExtra(C11687c.f33743X0, ShopDetailPackageActivity.f31155s0);
                }
                intent.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
                intent.putExtra(C11644i.f33464z2, this.f31768s0.f16955b.getShop().isbIsPickupFixed());
                intent.putExtra(C11644i.f33044A2, this.f31768s0.f16955b.getShop().isbIsDropoffFixed());
                intent.putExtra(C11644i.f33052B2, this.f31768s0.f16955b.getShop().getbIsPickupAvailable());
                intent.putExtra(C11644i.f33060C2, this.f31768s0.f16955b.getShop().getbIsDropoffAvailable());
                if (this.f31768s0.f16955b.getShop().isbIsPickupFixed() == 1) {
                    intent.putExtra(C11644i.f33068D2, this.f31768s0.f16955b.getShop().getPlatitude());
                    intent.putExtra(C11644i.f33076E2, this.f31768s0.f16955b.getShop().getPlongitude());
                    intent.putExtra(C11644i.f33084F2, this.f31768s0.f16955b.getShop().getvPickupAddress());
                }
                if (this.f31768s0.f16955b.getShop().isbIsDropoffFixed() == 1) {
                    intent.putExtra(C11644i.f33092G2, this.f31768s0.f16955b.getShop().getDlatitude());
                    intent.putExtra(C11644i.f33100H2, this.f31768s0.f16955b.getShop().getDlongitude());
                    intent.putExtra(C11644i.f33108I2, this.f31768s0.f16955b.getShop().getvDropoffAddress());
                }
                startActivityForResult(intent, 100);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51268d(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("bNotification", this.f31768s0.f16955b.getCheckedIn().booleanValue() ? "false" : ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        hashMap.put("iUserId", String.valueOf(this.f31767r0.mo23468C().mo23459f("user_id")));
        hashMap.put("vShopId", this.f31768s0.f16954a.getShopId());
        C5882b.m25774a(this.f31767r0).CheckInShop(hashMap).enqueue(new C11326e());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m51271e(int i) {
        if (ShopDetailPackageActivity.f31150n0 == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = i2 + 1 + ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListMenuItems().size();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("tab_pos totalCount = ");
        sb.append(i2);
        sb.toString();
        return i2;
    }

    /* renamed from: f */
    private void m51277f(int i) {
        this.f31701G0.mo40036a(C11644i.f33357m, (C11673d) new C11329h(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C11668s m51280g(String str) {
        C11668s sVar = new C11668s(str, true, false, null, null, false, true, this.f31700F0.mo38199a());
        return sVar;
    }

    /* renamed from: c */
    private void m51264c(boolean z) {
        if (this.f31768s0.f16955b.getShop().isDisableOrderNow()) {
            String str = "yellow";
            if (z) {
                if (this.f31768s0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                    this.f31752i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                } else {
                    this.f31752i0.setVisibility(0);
                    this.f31752i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                }
                this.f31734a.setEnabled(false);
                return;
            }
            if (this.f31768s0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                this.f31752i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
            } else {
                this.f31752i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
                this.f31752i0.setVisibility(8);
            }
            this.f31734a.setEnabled(true);
        }
    }

    /* renamed from: b */
    public void mo38223b() {
        this.f31773x0.setVisibility(0);
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if ("getDeepLink".equals(str) && isAdded()) {
            C5887x xVar = this.f31767r0;
            String string = getResources().getString(C10232R.string.msg_share_shop);
            Object[] objArr = new Object[2];
            objArr[0] = this.f31768s0.f16955b.getShop().getvTitle();
            DeeplinkBean deeplinkBean = this.f31704J0;
            objArr[1] = deeplinkBean != null ? deeplinkBean.getUrl() : "";
            xVar.mo23483J(String.format(string, objArr));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51274e(boolean z) {
        if (z) {
            this.f31760m0.setVisibility(8);
            this.f31762n0.setVisibility(0);
            return;
        }
        this.f31762n0.setVisibility(8);
        C11259i iVar = this.f31695A0;
        if (iVar != null && iVar.mo7325b() > 0) {
            this.f31760m0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51254a(boolean z, int i) {
        if (z) {
            this.f31735a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.apptheme_color));
            this.f31756k0.setImageResource(C10232R.C10235drawable.icon_check_act);
        } else {
            this.f31735a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.shop_type_color));
            this.f31756k0.setImageResource(C10232R.C10235drawable.icon_check);
        }
        this.f31738b0.setText(String.valueOf(i));
    }

    /* renamed from: a */
    private void m51250a(ShopMenuBean shopMenuBean) {
        if (shopMenuBean == null || shopMenuBean.getMenu_items() == null) {
            this.f31760m0.setVisibility(8);
            return;
        }
        this.f31760m0.setVisibility(8);
        List menu_items = shopMenuBean.getMenu_items();
        this.f31775z0.setNestedScrollingEnabled(false);
        this.f31775z0.setHasFixedSize(false);
        this.f31695A0 = new C11259i(getActivity(), menu_items);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f31775z0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f31775z0.setAdapter(this.f31695A0);
        this.f31695A0.mo39093a((C11263d) new C11331i(menu_items));
        StringBuilder sb = new StringBuilder();
        sb.append("original is :");
        sb.append(this.f31767r0.mo23601d(105));
        C5880q.m25751b(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m51261c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("tab_pos visiblePosition = ");
        sb.append(i);
        sb.toString();
        if (ShopDetailPackageActivity.f31150n0 == null) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < ShopDetailPackageActivity.f31150n0.size()) {
            i3 = i3 + 1 + ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getArrayListMenuItems().size();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tab_pos totalCount =");
            sb2.append(i3);
            sb2.toString();
            int i4 = i + 1;
            if (i3 >= i4) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("tab_pos pos = ");
                sb3.append(i2);
                sb3.toString();
                return i2;
            } else if (this.f31747f1.getSelectedTabPosition() > 0 && i4 < i3) {
                return this.f31747f1.getSelectedTabPosition();
            } else {
                i2++;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private void m51249a(ShopDetails shopDetails) {
        try {
            if (shopDetails.getPromotionAvailable()) {
                startActivity(new Intent(getActivity(), PromotionalOfferActivity.class));
                getActivity().overridePendingTransition(17432576, 17432577);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m51247a(int i) {
        C5887x xVar = this.f31767r0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f31767r0.mo23492O();
        } else if (!this.f31767r0.mo23504Z().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f31767r0.mo23476G());
            hashMap.put("auth_token", this.f31767r0.mo23640m());
            hashMap.put("vShopId", this.f31768s0.f16955b.getShop().getVShopId());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f31768s0.f16955b.getShop().getLatitude());
            hashMap.put("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f31768s0.f16955b.getShop().getLongitude());
            hashMap.put("longitude", sb2.toString());
            hashMap.put(C11687c.f33717Q2, str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("param: ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C11687c.m52645a(this.f31767r0).getBranchList(hashMap).enqueue(new C11334l(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51248a(int i, boolean z, int i2, int i3) {
        double d;
        C5887x xVar = this.f31767r0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f31767r0.mo23492O();
            return;
        }
        if (z || i3 == 3) {
            this.f31767r0.mo23665u0();
        }
        this.f31699E0.setVisibility(0);
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33862z0, this.f31768s0.f16955b.getShop().getVShopId());
        hashMap.put("language", this.f31767r0.mo23645o().toUpperCase());
        double d2 = 0.0d;
        if (i3 == 3) {
            d = 0.0d;
        } else if (z) {
            d2 = ((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i2)).getLatitude().doubleValue();
            d = ((BranchBean) this.f31768s0.f16955b.getShop().getBranchList().get(i2)).getLongitude().doubleValue();
        } else {
            d2 = this.f31768s0.f16955b.getShop().getLatitude().doubleValue();
            d = this.f31768s0.f16955b.getShop().getLongitude().doubleValue();
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
        this.f31703I0 = false;
        C11687c.m52644a().getMenuForBusinessOrder(hashMap).enqueue(new C11335m(i3, z));
    }
}
