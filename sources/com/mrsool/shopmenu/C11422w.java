package com.mrsool.shopmenu;

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
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
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
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11728i;
import com.mrsool.review.ServiceReviewListActivity;
import com.mrsool.shop.C11259i;
import com.mrsool.shop.C11259i.C11263d;
import com.mrsool.shop.PromotionalOfferActivity;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shop.ViewVideoFullActivity;
import com.mrsool.shopmenu.C11383o.C11397m;
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
import p076c.p112d.p148d.p150g.C6637f;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.shopmenu.w */
/* compiled from: ShopInfoPackageFragmentMenu */
public class C11422w extends Fragment implements OnClickListener, C10729d, C11056p {

    /* renamed from: A0 */
    private RelativeLayout f32142A0;

    /* renamed from: B0 */
    private RecyclerView f32143B0;

    /* renamed from: C0 */
    private C11259i f32144C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public NestedScrollView f32145D0;

    /* renamed from: E0 */
    private LinearLayout f32146E0;

    /* renamed from: F0 */
    private ProgressBar f32147F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public ProgressBar f32148G0;

    /* renamed from: H0 */
    private View f32149H0;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public C10724c f32150I0;

    /* renamed from: J0 */
    private C11669t f32151J0;

    /* renamed from: K0 */
    private int f32152K0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public boolean f32153L0 = false;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public DeeplinkBean f32154M0;

    /* renamed from: N */
    private View f32155N;

    /* renamed from: N0 */
    private final String f32156N0 = "getDeepLink";

    /* renamed from: O */
    private View f32157O;

    /* renamed from: O0 */
    private final String f32158O0 = "CheckInShop";

    /* renamed from: P */
    private View f32159P;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public Dialog f32160P0;

    /* renamed from: Q */
    private TextView f32161Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public boolean f32162Q0 = false;

    /* renamed from: R */
    private TextView f32163R;

    /* renamed from: R0 */
    private VideoView f32164R0;

    /* renamed from: S */
    private TextView f32165S;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public ExpandableListView f32166S0;

    /* renamed from: T */
    private TextView f32167T;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public C11403q f32168T0;

    /* renamed from: U */
    private TextView f32169U;

    /* renamed from: U0 */
    private View f32170U0;

    /* renamed from: V */
    private TextView f32171V;

    /* renamed from: V0 */
    private View f32172V0;

    /* renamed from: W */
    private TextView f32173W;

    /* renamed from: W0 */
    private C11614c f32174W0;

    /* renamed from: X */
    private TextView f32175X;

    /* renamed from: X0 */
    private boolean f32176X0 = false;

    /* renamed from: Y */
    private TextView f32177Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public Handler f32178Y0;

    /* renamed from: Z */
    private TextView f32179Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public Runnable f32180Z0;

    /* renamed from: a */
    private View f32181a;

    /* renamed from: a0 */
    private TextView f32182a0;

    /* renamed from: a1 */
    private FrameLayout f32183a1;

    /* renamed from: b */
    private View f32184b;

    /* renamed from: b0 */
    private TextView f32185b0;

    /* renamed from: b1 */
    private String f32186b1 = "";

    /* renamed from: c0 */
    private TextView f32187c0;

    /* renamed from: c1 */
    private LinearLayout f32188c1;

    /* renamed from: d0 */
    private TextView f32189d0;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public LinearLayout f32190d1;

    /* renamed from: e0 */
    private TextView f32191e0;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public boolean f32192e1 = false;

    /* renamed from: f0 */
    private TextView f32193f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public boolean f32194f1 = false;

    /* renamed from: g0 */
    private RatingBar f32195g0;
    /* access modifiers changed from: private */

    /* renamed from: g1 */
    public boolean f32196g1 = false;

    /* renamed from: h0 */
    private ImageView f32197h0;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public int f32198h1 = 0;

    /* renamed from: i0 */
    private ImageView f32199i0;

    /* renamed from: i1 */
    private double f32200i1 = 0.0d;

    /* renamed from: j0 */
    private ImageView f32201j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public TabLayout f32202j1;

    /* renamed from: k0 */
    private ImageView f32203k0;
    /* access modifiers changed from: private */

    /* renamed from: k1 */
    public ArrayList<ListViewHeightBean> f32204k1 = new ArrayList<>();

    /* renamed from: l0 */
    private ImageView f32205l0;

    /* renamed from: l1 */
    String f32206l1 = "Process Time";

    /* renamed from: m0 */
    private ImageView f32207m0;

    /* renamed from: m1 */
    private BroadcastReceiver f32208m1 = new C11435k();
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public ImageView f32209n0;

    /* renamed from: n1 */
    Handler f32210n1 = new Handler();

    /* renamed from: o0 */
    private LinearLayout f32211o0;

    /* renamed from: o1 */
    Runnable f32212o1 = new C11425b();

    /* renamed from: p0 */
    private LinearLayout f32213p0;

    /* renamed from: p1 */
    private OnGlobalLayoutListener f32214p1 = new C11427d();

    /* renamed from: q0 */
    private View f32215q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ReadMoreTextView f32216r0;

    /* renamed from: s0 */
    private View f32217s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C5887x f32218t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public AppSingleton f32219u0;

    /* renamed from: v0 */
    private RoundedImage f32220v0;

    /* renamed from: w0 */
    private final String f32221w0 = "image";

    /* renamed from: x0 */
    private final int f32222x0 = 101;

    /* renamed from: y0 */
    private final int f32223y0 = 102;

    /* renamed from: z0 */
    private ImageView f32224z0;

    /* renamed from: com.mrsool.shopmenu.w$a */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11423a implements Runnable {
        C11423a() {
        }

        public void run() {
            C11422w wVar = C11422w.this;
            wVar.m51654b(wVar.f32166S0, false);
            C11422w.this.f32196g1 = false;
            C11422w.this.f32168T0.notifyDataSetChanged();
            C11422w.this.f32148G0.setVisibility(8);
            C11422w.this.f32166S0.setVisibility(0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$a0 */
    /* compiled from: ShopInfoPackageFragmentMenu */
    public interface C11424a0 {
        /* renamed from: b */
        void mo39507b(Uri uri);
    }

    /* renamed from: com.mrsool.shopmenu.w$b */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11425b implements Runnable {
        C11425b() {
        }

        public void run() {
            double d;
            double d2;
            if (C11422w.this.isAdded() && !C11422w.this.f32196g1) {
                int i = 0;
                if (C11422w.this.f32194f1) {
                    C11422w.this.f32194f1 = false;
                    return;
                }
                ExpandableListAdapter expandableListAdapter = C11422w.this.f32166S0.getExpandableListAdapter();
                int i2 = 0;
                while (i < expandableListAdapter.getGroupCount()) {
                    if (C11422w.this.f32166S0.isGroupExpanded(i)) {
                        d2 = (double) i2;
                        d = ((ListViewHeightBean) C11422w.this.f32204k1.get(i)).getExpandHeight();
                        Double.isNaN(d2);
                    } else {
                        d2 = (double) i2;
                        d = ((ListViewHeightBean) C11422w.this.f32204k1.get(i)).getCollapseHeight();
                        Double.isNaN(d2);
                    }
                    int i3 = (int) (d2 + d);
                    if (C11422w.this.f32198h1 >= i2 && C11422w.this.f32198h1 <= i3 && i != C11422w.this.f32202j1.getSelectedTabPosition()) {
                        C11422w.this.f32192e1 = true;
                        C11422w.this.f32202j1.mo28123d(C11422w.this.f32202j1.mo28096a(i));
                    }
                    i++;
                    i2 = i3;
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$c */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11426c implements OnClickListener {
        C11426c() {
        }

        public void onClick(View view) {
            C11422w.this.f32160P0.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$d */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11427d implements OnGlobalLayoutListener {

        /* renamed from: com.mrsool.shopmenu.w$d$a */
        /* compiled from: ShopInfoPackageFragmentMenu */
        class C11428a implements Runnable {
            C11428a() {
            }

            public void run() {
                C11422w.this.f32178Y0 = new Handler();
                C11422w.this.m51632Y();
            }
        }

        C11427d() {
        }

        public void onGlobalLayout() {
            new Handler().postDelayed(new C11428a(), 100);
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$e */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11429e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32230a;

        C11429e(Dialog dialog) {
            this.f32230a = dialog;
        }

        public void onClick(View view) {
            this.f32230a.dismiss();
            Intent intent = new Intent(C11422w.this.getContext(), BranchesActivity.class);
            intent.putExtra(C11644i.f33431v1, C11422w.this.getString(C10232R.string.lbl_tab_shop_pkg_info));
            C11422w.this.startActivityForResult(intent, 102);
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$f */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11430f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32232a;

        C11430f(Dialog dialog) {
            this.f32232a = dialog;
        }

        public void onClick(View view) {
            this.f32232a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$g */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11431g implements C11565c {
        C11431g() {
        }

        /* renamed from: a */
        public void mo39392a() {
            try {
                if (C11422w.this.f32178Y0 != null) {
                    C11422w.this.f32178Y0.removeCallbacks(C11422w.this.f32180Z0);
                }
                C11422w.this.f32216r0.setTrimLines(0);
                C11422w.this.f32162Q0 = true;
                C11422w.this.m51630W();
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

    /* renamed from: com.mrsool.shopmenu.w$h */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11432h implements Runnable {
        C11432h() {
        }

        public void run() {
            if (!C11422w.this.f32162Q0 || C11422w.this.f32178Y0 == null) {
                if (C11422w.this.m51620M()) {
                    int lineCount = C11422w.this.f32216r0.getLineCount();
                    if (lineCount == 1) {
                        C11422w.this.m51630W();
                        return;
                    }
                    C11422w.this.f32216r0.setTrimLines(lineCount - 1);
                    C11422w.this.f32216r0.setText(C11422w.this.f32219u0.f16955b.getShop().getvDescription(), null);
                    C11422w.this.m51631X();
                } else {
                    C11422w.this.m51630W();
                }
                return;
            }
            C11422w.this.f32178Y0.removeCallbacks(this);
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$i */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11433i extends C2550c {
        C11433i(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C11422w.this.f32209n0.setScaleType(ScaleType.CENTER_CROP);
            C11422w.this.f32209n0.setImageDrawable(C11422w.this.f32218t0.mo23567b(bitmap));
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$j */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11434j implements Callback<CheckinOut> {
        C11434j() {
        }

        public void onFailure(Call<CheckinOut> call, Throwable th) {
            try {
                if (C11422w.this.f32218t0 != null && C11422w.this.isAdded()) {
                    C11422w.this.f32218t0.mo23492O();
                    C11422w.this.f32218t0.mo23615f(C11422w.this.getString(C10232R.string.msg_error_server_issue), C11422w.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CheckinOut> call, Response<CheckinOut> response) {
            try {
                if (C11422w.this.f32218t0 != null && C11422w.this.isAdded()) {
                    C11422w.this.f32218t0.mo23492O();
                    if (response.isSuccessful() && C11422w.this.isAdded()) {
                        if (C11422w.this.f32219u0.f16955b.getCheckedIn().booleanValue()) {
                            C11422w.this.f32219u0.f16955b.setCheckedIn(Boolean.valueOf(false));
                        } else {
                            C11422w.this.f32219u0.f16955b.setCheckedIn(Boolean.valueOf(true));
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Check in status after : ");
                        sb.append(C11422w.this.f32219u0.f16955b.getCheckedIn());
                        C5880q.m25753d(sb.toString());
                        CheckinOut checkinOut = (CheckinOut) response.body();
                        C11422w.this.m51649a(checkinOut.getCheckedIn().booleanValue(), checkinOut.getCheckedInCount());
                        if (((ShopDetailPackageActivity) C11422w.this.getActivity()).f31173b0.equalsIgnoreCase("checkinList")) {
                            C11422w.this.f32218t0.mo23473E(C11644i.f33394q4);
                        }
                        if (((CheckinOut) response.body()).getCode() <= 300) {
                            String a = C11422w.this.f32218t0.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                C11422w.this.f32218t0.mo23551a(new ServiceManualDataBean("CheckInShop", a));
                            }
                        }
                    } else if (C11422w.this.f32218t0 != null && C11422w.this.isAdded()) {
                        C11422w.this.f32218t0.mo23615f(response.message(), C11422w.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$k */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11435k extends BroadcastReceiver {
        C11435k() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33173Q3)) {
                if (C11422w.this.f32168T0 != null) {
                    ShopDetailPackageActivity shopDetailPackageActivity = (ShopDetailPackageActivity) C11422w.this.getActivity();
                    C11422w.this.f32168T0.mo39465a(ShopDetailPackageActivity.f31150n0);
                    C11422w.this.f32168T0.notifyDataSetChanged();
                }
                C11422w.this.m51692l0();
                C11422w.this.m51688j0();
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33166P4)) {
                C11422w.this.m51690k0();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$l */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11436l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32239a;

        C11436l(Dialog dialog) {
            this.f32239a = dialog;
        }

        public void onClick(View view) {
            this.f32239a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$m */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11437m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32241a;

        C11437m(Dialog dialog) {
            this.f32241a = dialog;
        }

        public void onClick(View view) {
            this.f32241a.dismiss();
            if (C11422w.this.f32218t0.mo23502X()) {
                C11422w wVar = C11422w.this;
                wVar.m51667d(!wVar.f32219u0.f16955b.getCheckedIn().booleanValue());
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$n */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11438n implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f32243a;

        /* renamed from: com.mrsool.shopmenu.w$n$a */
        /* compiled from: ShopInfoPackageFragmentMenu */
        class C11439a implements C10177a<File> {
            C11439a() {
            }

            /* renamed from: a */
            public void mo36448a(C10183b bVar, C10181b<File> bVar2) {
                C11422w.this.f32218t0.mo23468C().mo23448a(C11422w.this.f32219u0.f16955b.getShop().getvImage(), Boolean.valueOf(true));
                File file = (File) bVar2.mo36458a();
                if (C11422w.this.f32150I0.f29412a.mo38170a()) {
                    C11422w.this.f32150I0.f29412a.mo38177b();
                }
                C11422w.this.f32150I0.mo38204a(C11422w.this.m51678g(Uri.fromFile(file).getPath()), C11438n.this.f32243a);
            }

            /* renamed from: a */
            public void mo36449a(C10183b bVar, Throwable th) {
            }
        }

        C11438n(int i) {
            this.f32243a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C10171b.m47256c(C11422w.this.getActivity()).mo36428a(C11422w.this.f32219u0.f16955b.getShop().getvImage(), false).mo36427a(".mrsool", 4).mo36436b((C10177a<File>) new C11439a<File>());
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$o */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11440o implements C11263d {

        /* renamed from: a */
        final /* synthetic */ List f32246a;

        C11440o(List list) {
            this.f32246a = list;
        }

        /* renamed from: a */
        public void mo39098a(int i) {
            if (!TextUtils.isEmpty(((MenuItemsBean) this.f32246a.get(i)).getImage())) {
                Intent intent = new Intent(C11422w.this.getActivity(), ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((MenuItemsBean) this.f32246a.get(i)).getImage());
                C11422w.this.startActivity(intent);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$p */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11441p implements Callback<DeeplinkBean> {
        C11441p() {
        }

        public void onFailure(Call<DeeplinkBean> call, Throwable th) {
            if (C11422w.this.isAdded() && C11422w.this.f32218t0 != null) {
                C11422w.this.f32218t0.mo23653q0();
            }
        }

        public void onResponse(Call<DeeplinkBean> call, Response<DeeplinkBean> response) {
            if (C11422w.this.f32218t0 != null) {
                C11422w.this.f32218t0.mo23492O();
                if (response.isSuccessful()) {
                    if (((DeeplinkBean) response.body()).getCode().intValue() <= 300) {
                        C11422w.this.f32154M0 = (DeeplinkBean) response.body();
                        String a = C11422w.this.f32218t0.mo23528a(response.body());
                        String str = "getDeepLink";
                        if (!TextUtils.isEmpty(a)) {
                            C11422w.this.f32218t0.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            C11422w.this.mo36511f(str);
                        }
                    } else {
                        C11422w.this.f32218t0.mo23615f(((DeeplinkBean) response.body()).getMessage(), C11422w.this.getString(C10232R.string.app_name));
                    }
                } else if (C11422w.this.f32218t0 != null) {
                    C11422w.this.f32218t0.mo23615f(response.message(), C11422w.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$q */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11442q implements Callback<GetBranchList> {

        /* renamed from: a */
        final /* synthetic */ int f32249a;

        C11442q(int i) {
            this.f32249a = i;
        }

        public void onFailure(Call<GetBranchList> call, Throwable th) {
            if (C11422w.this.isAdded() && C11422w.this.f32218t0 != null) {
                C11422w.this.f32218t0.mo23492O();
                if (C11422w.this.f32219u0.f16955b.getShop().isBOMSLinked()) {
                    C11422w.this.m51642a(this.f32249a, false, 0, 1);
                }
            }
        }

        public void onResponse(Call<GetBranchList> call, Response<GetBranchList> response) {
            if (C11422w.this.f32218t0 != null && C11422w.this.isAdded()) {
                if (response.isSuccessful() && ((GetBranchList) response.body()).getCode() <= 300) {
                    C11422w.this.f32219u0.f16955b.getShop().setBranchList(((GetBranchList) response.body()).getBranchList());
                    C11422w.this.f32219u0.f16955b.setBarColor(((GetBranchList) response.body()).getBarColor());
                    C11422w.this.f32219u0.f16955b.setAllowOrder(Boolean.valueOf(((GetBranchList) response.body()).isAllowOrder()));
                    C11422w.this.f32219u0.f16955b.setShop_order_alert_text(((GetBranchList) response.body()).getShopOrderAlertText());
                    C11422w.this.m51628U();
                } else if (response.body() != null) {
                    C11422w.this.f32218t0.mo23615f(((GetBranchList) response.body()).getMessage(), C11422w.this.getString(C10232R.string.app_name));
                }
                if (C11422w.this.f32219u0.f16955b.getShop().isBOMSLinked()) {
                    C11422w.this.m51642a(this.f32249a, false, 0, 1);
                } else {
                    C11422w.this.f32218t0.mo23492O();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$r */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11443r implements Callback<GetMenuBean> {

        /* renamed from: a */
        final /* synthetic */ int f32251a;

        /* renamed from: b */
        final /* synthetic */ boolean f32252b;

        C11443r(int i, boolean z) {
            this.f32251a = i;
            this.f32252b = z;
        }

        public void onFailure(Call<GetMenuBean> call, Throwable th) {
            if (C11422w.this.isAdded() && C11422w.this.f32218t0 != null) {
                C11422w.this.f32148G0.setVisibility(8);
                C11422w.this.f32218t0.mo23492O();
                C11422w.this.f32218t0.mo23615f(C11422w.this.getString(C10232R.string.msg_error_server_issue), C11422w.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetMenuBean> call, Response<GetMenuBean> response) {
            if (C11422w.this.f32218t0 != null && C11422w.this.isAdded()) {
                if (!response.isSuccessful() || ((GetMenuBean) response.body()).getCode() > 300) {
                    C11422w.this.f32148G0.setVisibility(8);
                    C11422w.this.f32218t0.mo23492O();
                    C11422w.this.m51673e(false);
                } else {
                    ShopDetailPackageActivity.f31150n0 = ((GetMenuBean) response.body()).getMenuBean().getArrayListCategoryBean();
                    ShopDetailPackageActivity.f31154r0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessAccountId();
                    ShopDetailPackageActivity.f31155s0 = ((GetMenuBean) response.body()).getMenuBean().getBusinessBranchId();
                    ShopDetailPackageActivity.f31156t0 = ((GetMenuBean) response.body()).getMenuBean().getVatMultiplier();
                    if (this.f32251a == 3) {
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
                    C11422w.this.m51629V();
                    C11422w wVar = C11422w.this;
                    ArrayList<MenuCategoryBean> arrayList = ShopDetailPackageActivity.f31150n0;
                    wVar.f32153L0 = arrayList != null && arrayList.size() > 0;
                    C11422w.this.f32218t0.mo23492O();
                    C11422w.this.m51651a0();
                    C11422w.this.m51673e(true);
                }
                boolean z = this.f32252b;
                String str = C11644i.f33173Q3;
                if (z) {
                    int i4 = this.f32251a;
                    if (i4 == 2) {
                        if (C11422w.this.f32153L0) {
                            C11422w.this.m51673e(true);
                            C11422w.this.f32218t0.mo23473E(str);
                        } else {
                            C11422w.this.m51673e(false);
                        }
                    } else if (i4 == 1 && C11422w.this.f32153L0) {
                        C11422w.this.m51673e(true);
                    }
                } else if (this.f32251a == 3) {
                    C11422w.this.f32218t0.mo23473E(str);
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$s */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11444s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f32254a;

        C11444s(int i) {
            this.f32254a = i;
        }

        public void run() {
            C11422w wVar = C11422w.this;
            C11422w.this.f32145D0.mo5286b(0, ((wVar.m51634a(wVar.f32166S0, this.f32254a) + C11422w.this.m51602C()) + C11422w.this.f32190d1.getMeasuredHeight()) - C11422w.this.f32202j1.getMeasuredHeight());
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$t */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11445t extends C11725f {
        C11445t() {
        }

        /* renamed from: e */
        public void mo38064e(int i) {
            C11422w.this.m51623P();
            C11422w.this.m51692l0();
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$u */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11446u implements C1103b {
        C11446u() {
        }

        /* renamed from: a */
        public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            if (C11422w.this.isAdded()) {
                int G = C11422w.this.m51602C();
                C11422w wVar = C11422w.this;
                wVar.f32198h1 = (i2 - G) + wVar.f32202j1.getMeasuredHeight();
                C11422w wVar2 = C11422w.this;
                Runnable runnable = wVar2.f32212o1;
                if (runnable != null) {
                    wVar2.f32210n1.removeCallbacksAndMessages(runnable);
                }
                if (i2 > G - C11422w.this.f32202j1.getMeasuredHeight()) {
                    C11422w.this.m51684h0();
                    C11422w wVar3 = C11422w.this;
                    wVar3.f32210n1.postDelayed(wVar3.f32212o1, 5);
                } else {
                    C11422w.this.m51615I();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$v */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11447v implements OnGroupExpandListener {

        /* renamed from: com.mrsool.shopmenu.w$v$a */
        /* compiled from: ShopInfoPackageFragmentMenu */
        class C11448a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f32259a;

            C11448a(int i) {
                this.f32259a = i;
            }

            public void run() {
                C11422w wVar = C11422w.this;
                C11422w.this.f32145D0.mo5286b(0, ((wVar.m51634a(wVar.f32166S0, this.f32259a) + C11422w.this.m51602C()) + C11422w.this.f32190d1.getMeasuredHeight()) - C11422w.this.f32202j1.getMeasuredHeight());
            }
        }

        C11447v() {
        }

        public void onGroupExpand(int i) {
            if (!C11422w.this.f32196g1) {
                C11422w wVar = C11422w.this;
                wVar.m51661c(wVar.f32166S0, true);
                C11422w.this.f32145D0.postDelayed(new C11448a(i), 10);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$w */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11449w implements OnGroupCollapseListener {
        C11449w() {
        }

        public void onGroupCollapse(int i) {
            if (C11422w.this.m51618K()) {
                C11422w wVar = C11422w.this;
                wVar.m51661c(wVar.f32166S0, true);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$x */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11450x implements OnGroupClickListener {
        C11450x() {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            C11422w.this.m51653b(expandableListView, i);
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$y */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11451y implements OnChildClickListener {

        /* renamed from: com.mrsool.shopmenu.w$y$a */
        /* compiled from: ShopInfoPackageFragmentMenu */
        class C11452a implements C11397m {
            C11452a() {
            }

            /* renamed from: a */
            public void mo39129a() {
                C11422w.this.m51690k0();
            }
        }

        C11451y() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            if (!C11422w.this.f32218t0.mo23497S()) {
                return false;
            }
            ShopDetailPackageActivity.f31152p0 = i;
            ShopDetailPackageActivity.f31153q0 = i2;
            C11383o oVar = new C11383o(C11422w.this.getActivity(), null);
            oVar.mo39440f();
            oVar.mo39435a((C11397m) new C11452a());
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.w$z */
    /* compiled from: ShopInfoPackageFragmentMenu */
    class C11453z implements C7051h {
        C11453z() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            if (!C11422w.this.f32192e1) {
                C11422w.this.f32194f1 = true;
            }
            C11422w.this.m51670e(kVar.mo28203f());
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            if (!C11422w.this.f32192e1) {
                C11422w.this.f32194f1 = true;
            }
            C11422w.this.m51670e(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public boolean m51618K() {
        for (int i = 0; i < this.f32166S0.getExpandableListAdapter().getGroupCount(); i++) {
            if (this.f32166S0.isGroupExpanded(i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    private boolean m51619L() {
        if (this.f32153L0) {
            for (int i = 0; i < ShopDetailPackageActivity.f31150n0.size(); i++) {
                if (((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getOrderCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public boolean m51620M() {
        double height = (double) this.f32145D0.getHeight();
        Double.isNaN(height);
        return height * 0.9d < ((double) ((this.f32146E0.getHeight() + this.f32145D0.getPaddingTop()) + this.f32145D0.getPaddingBottom()));
    }

    /* renamed from: N */
    private boolean m51621N() {
        if ((this.f32219u0.f16955b.getShop().isbIsPickupFixed() == 1 || this.f32219u0.f16955b.getShop().isbIsDropoffFixed() == 1) && this.f32219u0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    private boolean m51622O() {
        return this.f32218t0.mo23468C().mo23450a(this.f32219u0.f16955b.getShop().getvImage());
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m51623P() {
        C11598a.m52263f().mo39829b(this.f32219u0.f16954a.getShopId());
    }

    /* renamed from: Q */
    private void m51624Q() {
        try {
            C11598a.m52263f().mo39811a(this.f32219u0.f16955b.getShop().getTotalReviews(), (double) this.f32219u0.f16955b.getShop().getRating(), this.f32219u0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R */
    private void m51625R() {
        try {
            this.f32174W0.mo39854c(this.f32219u0.f16955b.getShop().getVShopId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: S */
    private void m51626S() {
        try {
            C11598a.m52263f().mo39840e(this.f32219u0.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T */
    private void m51627T() {
        this.f32216r0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f32214p1);
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public void m51628U() {
        if (this.f32219u0.f16955b.getShop().getHasMultipleBranches().booleanValue()) {
            this.f32157O.setVisibility(0);
            this.f32157O.setVisibility(0);
            this.f32171V.setText(m51604D());
            TextView textView = this.f32189d0;
            String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(m51606E());
            textView.setText(String.format(string, new Object[]{sb.toString()}));
            this.f32157O.setEnabled(true);
            return;
        }
        this.f32157O.setVisibility(8);
        this.f32157O.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m51629V() {
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
    /* renamed from: W */
    public void m51630W() {
        this.f32216r0.setVisibility(0);
        this.f32146E0.setVisibility(0);
        this.f32147F0.setVisibility(8);
        m51706y();
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m51631X() {
        this.f32180Z0 = new C11432h();
        this.f32178Y0.postDelayed(this.f32180Z0, 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m51632Y() {
        int lineCount = this.f32216r0.getLineCount();
        boolean M = m51620M();
        StringBuilder sb = new StringBuilder();
        sb.append("Text Line Count : ");
        sb.append(lineCount);
        C5880q.m25754e(sb.toString());
        if (lineCount != 0) {
            if (lineCount <= 4 || this.f32152K0 != 1 || !M) {
                if (lineCount >= 1) {
                    int i = this.f32152K0;
                    if (i == 1) {
                        this.f32152K0 = i + 1;
                        this.f32216r0.setTextSize(2, 18.0f);
                        C5880q.m25754e("Text Size : 18");
                        return;
                    }
                }
                if (lineCount >= 2) {
                    int i2 = this.f32152K0;
                    if (i2 == 2) {
                        this.f32152K0 = i2 + 1;
                        this.f32216r0.setTextSize(2, 16.0f);
                        C5880q.m25754e("Text Size : 16");
                        return;
                    }
                }
                if (lineCount >= 3) {
                    int i3 = this.f32152K0;
                    if (i3 == 3) {
                        this.f32152K0 = i3 + 1;
                        this.f32216r0.setTextSize(2, 14.0f);
                        C5880q.m25754e("Text Size : 14");
                        return;
                    }
                }
                if (lineCount >= 4 && this.f32152K0 == 4) {
                    this.f32216r0.setTextSize(2, 13.0f);
                    C5880q.m25754e("Text Size : 13");
                    m51627T();
                }
                m51631X();
                return;
            }
            this.f32216r0.getViewTreeObserver().removeOnGlobalLayoutListener(this.f32214p1);
            m51631X();
        }
    }

    /* renamed from: Z */
    private void m51633Z() {
        if (this.f32219u0.f16955b.getShop().isHasDiscount()) {
            String replace = this.f32219u0.f16955b.getShop().getDiscountLabel().replace(this.f32219u0.f16955b.getShop().getDiscountShortLabel(), "");
            this.f32170U0.setVisibility(0);
            this.f32193f0.setText(replace);
            this.f32191e0.setText(this.f32219u0.f16955b.getShop().getDiscountShortLabel());
            return;
        }
        this.f32170U0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m51651a0() {
        this.f32192e1 = false;
        this.f32194f1 = false;
        this.f32196g1 = true;
        if (this.f32168T0 == null) {
            this.f32168T0 = new C11403q(getActivity(), new C11445t());
            this.f32145D0.setOnScrollChangeListener(new C11446u());
            this.f32166S0.setOnGroupExpandListener(new C11447v());
            this.f32166S0.setOnGroupCollapseListener(new C11449w());
            this.f32166S0.setOnGroupClickListener(new C11450x());
            this.f32166S0.setOnChildClickListener(new C11451y());
            this.f32202j1.mo28104a((C7051h) new C11453z());
        }
        this.f32202j1.mo28139h();
        try {
            Iterator it = ShopDetailPackageActivity.f31150n0.iterator();
            while (it.hasNext()) {
                this.f32202j1.mo28105a(this.f32202j1.mo28126f().mo28195b((CharSequence) ((MenuCategoryBean) it.next()).getCategoryName().trim()));
                ((TextView) this.f32202j1.mo28096a(this.f32202j1.getTabCount() - 1).f19940i.getChildAt(1)).setSingleLine(true);
            }
        } catch (Exception unused) {
        }
        this.f32196g1 = true;
        this.f32168T0.mo39465a(ShopDetailPackageActivity.f31150n0);
        this.f32166S0.setAdapter(this.f32168T0);
        this.f32166S0.setVisibility(4);
        m51599A();
        ArrayList<MenuCategoryBean> arrayList = ShopDetailPackageActivity.f31150n0;
        if (arrayList != null && arrayList.size() > 0) {
            new Handler().postDelayed(new C11423a(), 30);
        }
    }

    /* renamed from: b0 */
    private void m51659b0() {
        AppSingleton appSingleton = this.f32219u0;
        if (appSingleton == null) {
            ShopDetails shopDetails = appSingleton.f16955b;
            if (shopDetails == null && shopDetails.getShop() == null) {
                return;
            }
        }
        if (this.f32219u0.f16955b.getShop().getOpening_hours() == null || this.f32219u0.f16955b.getShop().getOpening_hours().size() <= 0) {
            this.f32184b.setVisibility(8);
        } else {
            if (this.f32219u0.f16955b.getShop().isServiceShopOpen()) {
                this.f32169U.setText(getResources().getString(C10232R.string.lbl_open_now));
                this.f32205l0.setImageResource(C10232R.C10235drawable.ic_clock_grey);
            } else {
                this.f32169U.setText(getResources().getString(C10232R.string.lbl_closed));
                this.f32205l0.setImageResource(C10232R.C10235drawable.ic_clock_red);
                this.f32169U.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.red_lite_3));
            }
            this.f32179Z.setText(this.f32219u0.f16955b.getShop().getTodaysWorkingHours());
        }
    }

    /* renamed from: c0 */
    private void m51665c0() {
        this.f32216r0.setmOnCollapseExpandListner(new C11431g());
    }

    /* renamed from: d0 */
    private void m51669d0() {
        try {
            if (this.f32219u0.f16955b.getShop().getTotalReviews().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                this.f32165S.setText(getResources().getString(C10232R.string.lbl_no_customer_review));
                this.f32195g0.setRating(0.0f);
                this.f32167T.setVisibility(8);
            } else {
                this.f32155N.setVisibility(0);
                TextView textView = this.f32165S;
                String string = getResources().getString(C10232R.string.lbl_no_reviews);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f32219u0.f16955b.getShop().getTotalReviews());
                textView.setText(String.format(string, new Object[]{sb.toString()}));
                this.f32167T.setText(String.valueOf(this.f32219u0.f16955b.getShop().getRating()));
                this.f32195g0.setRating(Float.parseFloat(String.valueOf(this.f32219u0.f16955b.getShop().getRating())));
                this.f32167T.setVisibility(0);
            }
            if (this.f32219u0.f16955b.getShop().isRateable()) {
                this.f32155N.setVisibility(0);
            } else {
                this.f32155N.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e0 */
    private void m51674e0() {
        if (this.f32219u0.f16955b.getShop().getvIcon() != null && !TextUtils.isEmpty(this.f32219u0.f16955b.getShop().getvIcon().trim())) {
            C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f32219u0.f16955b.getShop().getvIcon()).m11491c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11496d().m11500e((int) C10232R.C10235drawable.shop_place_holder_white).mo9424a(this.f32197h0);
        }
        if (this.f32219u0.f16955b.getShop().getvTitle() != null && !TextUtils.isEmpty(this.f32219u0.f16955b.getShop().getvTitle().trim())) {
            this.f32187c0.setText(this.f32219u0.f16955b.getShop().getvSubTitle());
        }
        if (this.f32219u0.f16955b.getShop().getvDescription() != null && !TextUtils.isEmpty(this.f32219u0.f16955b.getShop().getvDescription().trim())) {
            this.f32216r0.setText(this.f32219u0.f16955b.getShop().getvDescription());
        }
    }

    /* renamed from: f0 */
    private void m51677f0() {
        C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f32219u0.f16955b.getShop().getvIcon()).mo9441j().m11405c((int) C10232R.C10235drawable.icon_mo_ac_small_shop).m11415e((int) C10232R.C10235drawable.shop_place_holder_white).mo9458b(new C11433i(this.f32209n0));
    }

    /* renamed from: g0 */
    private void m51681g0() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f32218t0;
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
        textView.setOnClickListener(new C11429e(dialog));
        textView2.setOnClickListener(new C11430f(dialog));
        if (isAdded() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m51684h0() {
        try {
            this.f32202j1.setAlpha(1.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i0 */
    private void m51686i0() {
        String str = "";
        try {
            if (this.f32160P0 == null || !this.f32160P0.isShowing()) {
                View inflate = LayoutInflater.from(getActivity()).inflate(C10232R.layout.dialog_working_hrs, null);
                this.f32160P0 = new Dialog(getActivity());
                this.f32160P0.requestWindowFeature(1);
                this.f32160P0.setContentView(inflate);
                LinearLayout linearLayout = (LinearLayout) this.f32160P0.findViewById(C10232R.C10236id.llWorkingHoursMonThurs);
                TextView textView = (TextView) this.f32160P0.findViewById(C10232R.C10236id.txtOk);
                if (this.f32218t0 != null) {
                    this.f32218t0.mo23535a(this.f32160P0);
                }
                if (this.f32219u0.f16955b.getShop().getOpening_hours() != null) {
                    for (int i = 0; i < this.f32219u0.f16955b.getShop().getOpening_hours().size(); i++) {
                        View inflate2 = getActivity().getLayoutInflater().inflate(C10232R.layout.row_working_hours, null);
                        TextView textView2 = (TextView) inflate2.findViewById(C10232R.C10236id.tvDay);
                        TextView textView3 = (TextView) inflate2.findViewById(C10232R.C10236id.tvTime);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(((WorkingHoursBean) this.f32219u0.f16955b.getShop().getOpening_hours().get(i)).getDay());
                        textView2.setText(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(((WorkingHoursBean) this.f32219u0.f16955b.getShop().getOpening_hours().get(i)).getTime());
                        textView3.setText(sb2.toString());
                        linearLayout.addView(inflate2);
                        if (getResources().getDisplayMetrics().densityDpi <= 240) {
                            textView3.setTextSize(2, 11.0f);
                        } else if (getResources().getDisplayMetrics().densityDpi <= 320) {
                            textView3.setTextSize(2, 12.0f);
                        }
                    }
                    if (!getActivity().isFinishing()) {
                        this.f32160P0.show();
                    }
                }
                textView.setOnClickListener(new C11426c());
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m51688j0() {
        if (isAdded()) {
            if (this.f32219u0.f16955b.getBarColor().equalsIgnoreCase(getString(C10232R.string.lbl_order_color_yellow))) {
                this.f32177Y.setText(this.f32219u0.f16955b.getShop_order_alert_text());
                this.f32199i0.setVisibility(0);
                this.f32201j0.setVisibility(0);
                this.f32177Y.setVisibility(0);
                this.f32175X.setVisibility(8);
            } else {
                this.f32199i0.setVisibility(8);
                this.f32201j0.setVisibility(8);
                this.f32177Y.setVisibility(8);
                this.f32175X.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m51690k0() {
        ViewPager viewPager = ShopDetailActivity.f31114j0;
        if (viewPager != null) {
            viewPager.setCurrentItem(0);
        }
        this.f32168T0.notifyDataSetChanged();
        m51692l0();
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m51692l0() {
        int i;
        double d = 0.0d;
        this.f32200i1 = 0.0d;
        String str = "";
        if (this.f32153L0) {
            i = 0;
            for (int i2 = 0; i2 < ShopDetailPackageActivity.f31150n0.size(); i2++) {
                i += ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i2)).getOrderCount();
            }
            boolean z = false;
            int i3 = 0;
            while (i3 < ShopDetailPackageActivity.f31150n0.size()) {
                int i4 = 0;
                while (i4 < ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().size()) {
                    MenuItemBean menuItemBean = (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i3)).getArrayListUsersMenuItems().get(i4);
                    if (menuItemBean.getOrderCount() > 0) {
                        boolean z2 = menuItemBean.shouldHidePriceZero() ? true : z;
                        if (this.f32186b1.equals(str)) {
                            this.f32186b1 = menuItemBean.getCurrency();
                        }
                        double d2 = d;
                        int i5 = 0;
                        boolean z3 = false;
                        while (i5 < menuItemBean.getArrayListVariety().size()) {
                            if (((MenuVarietyBean) menuItemBean.getArrayListVariety().get(i5)).isSelected()) {
                                d2 += ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(i5)).getPrice();
                            }
                            i5++;
                            z3 = true;
                        }
                        for (int i6 = 0; i6 < menuItemBean.getArrayListAddons().size(); i6++) {
                            if (((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).isSelected() && ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).getMenuAddonOptions().size() <= 0) {
                                d2 += ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).getPrice().doubleValue();
                            }
                            for (int i7 = 0; i7 < ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).getMenuAddonOptions().size(); i7++) {
                                if (((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).getMenuAddonOptions().get(i7)).isSelected()) {
                                    d2 += ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i6)).getMenuAddonOptions().get(i7)).getPrice().doubleValue();
                                }
                            }
                        }
                        if (!z3) {
                            try {
                                d2 += Double.parseDouble(menuItemBean.getPrice());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                        double d3 = this.f32200i1;
                        double orderCount = (double) menuItemBean.getOrderCount();
                        Double.isNaN(orderCount);
                        this.f32200i1 = d3 + (d2 * orderCount);
                        z = z2;
                    }
                    i4++;
                    d = 0.0d;
                }
                i3++;
                d = 0.0d;
            }
            if (z) {
                this.f32183a1.setVisibility(8);
            } else if (this.f32200i1 > 0.0d) {
                this.f32183a1.setVisibility(0);
                this.f32145D0.setPadding(0, 0, 0, (int) getResources().getDimension(C10232R.dimen.dp_33));
            } else {
                this.f32183a1.setVisibility(8);
                this.f32145D0.setPadding(0, 0, 0, 0);
            }
        } else {
            this.f32183a1.setVisibility(8);
            this.f32145D0.setPadding(0, 0, 0, 0);
            i = 0;
        }
        TextView textView = this.f32173W;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        textView.setText(sb.toString());
        TextView textView2 = this.f32161Q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(C5887x.m25809b(Double.valueOf(this.f32200i1)));
        textView2.setText(sb2.toString());
        this.f32163R.setText(this.f32186b1);
        if (!isAdded()) {
            return;
        }
        if (i <= 0) {
            this.f32175X.setText(getString(C10232R.string.lbl_tb_title_order_now));
            this.f32173W.setVisibility(8);
            this.f32159P.setVisibility(8);
            m51663c(true);
            return;
        }
        this.f32175X.setText(getString(C10232R.string.btn_place_order));
        this.f32173W.setVisibility(0);
        this.f32159P.setVisibility(0);
        m51663c(false);
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
                    this.f32168T0.notifyDataSetChanged();
                    m51692l0();
                    if (intent != null && intent.getBooleanExtra(C11644i.f33293e7, false)) {
                        m51642a(0, false, 0, 3);
                        return;
                    }
                    return;
                case 101:
                    int intExtra = intent.getIntExtra(C11644i.f33456y2, 0);
                    if (m51622O()) {
                        m51660c(intExtra);
                        return;
                    }
                    this.f32150I0.mo38204a(m51608F(), intExtra);
                    m51660c(intExtra);
                    return;
                case 102:
                    BranchBean branchBean = (BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0));
                    if (this.f32219u0.f16955b.getShop().isbIsPickupFixed() == 1) {
                        this.f32219u0.f16955b.getShop().setPlatitude(branchBean.getLatitude());
                        this.f32219u0.f16955b.getShop().setPlongitude(branchBean.getLongitude());
                        this.f32219u0.f16955b.getShop().setvPickupAddress(branchBean.getvAddress());
                    }
                    if (this.f32219u0.f16955b.getShop().isbIsDropoffFixed() == 1) {
                        this.f32219u0.f16955b.getShop().setDlatitude(branchBean.getLatitude());
                        this.f32219u0.f16955b.getShop().setDlongitude(branchBean.getLongitude());
                        this.f32219u0.f16955b.getShop().setvDropoffAddress(branchBean.getvAddress());
                    }
                    this.f32171V.setText(((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getvAddress());
                    TextView textView = this.f32189d0;
                    String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("");
                    sb2.append(((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(intent.getIntExtra(C11644i.f33332j1, 0))).getDistance());
                    textView.setText(String.format(string, new Object[]{sb2.toString()}));
                    if (this.f32219u0.f16955b.getShop().isBOMSLinked()) {
                        m51642a(0, true, intent.getIntExtra(C11644i.f33332j1, 0), 2);
                    }
                    m51692l0();
                    m51688j0();
                    return;
                default:
                    return;
            }
        } else {
            m51669d0();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.imgPkgInfo /*2131362498*/:
                if (!TextUtils.isEmpty(this.f32219u0.f16955b.getShop().getvImage())) {
                    if ("image".equalsIgnoreCase(this.f32219u0.f16955b.getShop().getvImageType())) {
                        Intent intent = new Intent(getActivity(), ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, this.f32219u0.f16955b.getShop().getvImage());
                        startActivity(intent);
                        return;
                    }
                    return;
                }
                return;
            case C10232R.C10236id.layCheckIn /*2131362894*/:
                if (this.f32218t0.mo23503Y()) {
                    return;
                }
                if (!this.f32219u0.f16955b.getCheckedIn().booleanValue()) {
                    m51682h(getString(C10232R.string.msg_info_checkin));
                    return;
                } else {
                    m51667d(true);
                    return;
                }
            case C10232R.C10236id.layRightClick /*2131362913*/:
                m51709z();
                return;
            case C10232R.C10236id.llBranch /*2131362975*/:
                if (!this.f32218t0.mo23503Y() && this.f32218t0.mo23497S()) {
                    if (m51619L()) {
                        m51681g0();
                        return;
                    }
                    Intent intent2 = new Intent(getContext(), BranchesActivity.class);
                    intent2.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
                    startActivityForResult(intent2, 102);
                    return;
                }
                return;
            case C10232R.C10236id.llCustomerReviews /*2131363013*/:
                C5887x xVar = this.f32218t0;
                if (xVar != null && !xVar.mo23503Y()) {
                    startActivityForResult(new Intent(getContext(), ServiceReviewListActivity.class), 1009);
                    m51624Q();
                    return;
                }
                return;
            case C10232R.C10236id.llWorkingHrs /*2131363202*/:
                m51686i0();
                m51626S();
                return;
            case C10232R.C10236id.rlOrderNowMain /*2131363485*/:
                if (this.f32218t0.mo23497S()) {
                    mo39505w();
                    return;
                }
                return;
            case C10232R.C10236id.txtPkgDesc /*2131364134*/:
                this.f32216r0.mo39696f();
                return;
            case C10232R.C10236id.video_view /*2131364235*/:
                Intent intent3 = new Intent(getContext(), ViewVideoFullActivity.class);
                intent3.putExtra(C11644i.f33383p1, this.f32219u0.f16955b.getShop().getvImage());
                intent3.putExtra(C11644i.f33448x2, m51608F());
                C10724c cVar = this.f32150I0;
                if (!(cVar == null || cVar.mo38209c() == null)) {
                    this.f32150I0.mo38209c().mo38177b();
                }
                C1376c activity = getActivity();
                VideoView videoView = this.f32164R0;
                startActivityForResult(intent3, 101, C0737c.m4272a((Activity) activity, (View) videoView, C0962e0.m5415S(videoView)).mo4091b());
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f32215q0 = layoutInflater.inflate(C10232R.layout.fragment_shop_info_package_menu, viewGroup, false);
        MapsInitializer.initialize(getActivity().getApplicationContext());
        this.f32219u0 = (AppSingleton) getActivity().getApplicationContext();
        return this.f32215q0;
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(getActivity());
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m51617J();
    }

    public void start() {
        this.f32224z0.setVisibility(8);
    }

    /* renamed from: A */
    private void m51599A() {
        for (int i = 0; i < this.f32166S0.getExpandableListAdapter().getGroupCount(); i++) {
            this.f32166S0.expandGroup(i);
        }
    }

    /* renamed from: B */
    private C1817b m51601B() {
        C1817b bVar = new C1817b(getActivity());
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public int m51602C() {
        return this.f32188c1.getMeasuredHeight();
    }

    /* renamed from: D */
    private String m51604D() {
        try {
            if (((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return ((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(0)).getvAddress();
            }
            for (int i = 0; i < this.f32219u0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return ((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i)).getvAddress();
                }
            }
            return "";
        } catch (Exception unused) {
        }
    }

    /* renamed from: E */
    private String m51606E() {
        try {
            if (((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(0)).getIsSelected() == 1) {
                return String.valueOf(((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(0)).getDistance());
            }
            for (int i = 0; i < this.f32219u0.f16955b.getShop().getBranchList().size(); i++) {
                if (((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                    return String.valueOf(((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i)).getDistance());
                }
            }
            return "X";
        } catch (Exception unused) {
        }
    }

    /* renamed from: F */
    private C11668s m51608F() {
        C11668s sVar = new C11668s(this.f32219u0.f16955b.getShop().getvImage(), true, false, null, null, false, true, this.f32150I0.mo38199a());
        return sVar;
    }

    /* renamed from: G */
    private void m51611G() {
        Intent intent;
        if (!this.f32153L0 || !m51619L()) {
            intent = new Intent(getActivity(), CreateOrderActivity.class);
        } else {
            intent = new Intent(getActivity(), MenuOrderActivityStep1.class);
            ShopDetailPackageActivity shopDetailPackageActivity = (ShopDetailPackageActivity) getActivity();
            intent.putExtra(C11687c.f33739W0, ShopDetailPackageActivity.f31154r0);
            ShopDetailPackageActivity shopDetailPackageActivity2 = (ShopDetailPackageActivity) getActivity();
            intent.putExtra(C11687c.f33743X0, ShopDetailPackageActivity.f31155s0);
        }
        intent.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_pkg_info));
        intent.putExtra(C11644i.f33464z2, this.f32219u0.f16955b.getShop().isbIsPickupFixed());
        intent.putExtra(C11644i.f33044A2, this.f32219u0.f16955b.getShop().isbIsDropoffFixed());
        intent.putExtra(C11644i.f33052B2, this.f32219u0.f16955b.getShop().getbIsPickupAvailable());
        intent.putExtra(C11644i.f33060C2, this.f32219u0.f16955b.getShop().getbIsDropoffAvailable());
        if (this.f32219u0.f16955b.getShop().isbIsPickupFixed() == 1) {
            intent.putExtra(C11644i.f33068D2, this.f32219u0.f16955b.getShop().getPlatitude());
            intent.putExtra(C11644i.f33076E2, this.f32219u0.f16955b.getShop().getPlongitude());
            intent.putExtra(C11644i.f33084F2, this.f32219u0.f16955b.getShop().getvPickupAddress());
        }
        if (this.f32219u0.f16955b.getShop().isbIsDropoffFixed() == 1) {
            intent.putExtra(C11644i.f33092G2, this.f32219u0.f16955b.getShop().getDlatitude());
            intent.putExtra(C11644i.f33100H2, this.f32219u0.f16955b.getShop().getDlongitude());
            intent.putExtra(C11644i.f33108I2, this.f32219u0.f16955b.getShop().getvDropoffAddress());
        }
        startActivityForResult(intent, 100);
    }

    /* renamed from: H */
    private void m51613H() {
        if (this.f32157O.getVisibility() == 8 && this.f32211o0.getVisibility() == 8) {
            this.f32184b.getVisibility();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public void m51615I() {
        try {
            this.f32202j1.setAlpha(0.0f);
        } catch (Exception unused) {
        }
    }

    /* renamed from: J */
    private void m51617J() {
        Toolbar toolbar = (Toolbar) getActivity().findViewById(C10232R.C10236id.tbTXT);
        TextView textView = (TextView) toolbar.findViewById(C10232R.C10236id.txtTitle);
        TextView textView2 = (TextView) toolbar.findViewById(C10232R.C10236id.txtSubTitle);
        LinearLayout linearLayout = (LinearLayout) toolbar.findViewById(C10232R.C10236id.layRightClick);
        this.f32218t0 = new C5887x(getActivity());
        this.f32174W0 = new C11614c(getActivity());
        this.f32151J0 = new C11669t(getActivity());
        this.f32202j1 = (TabLayout) this.f32215q0.findViewById(C10232R.C10236id.tabLayoutMenu);
        this.f32188c1 = (LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.llAboveDetail);
        this.f32190d1 = (LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.llMenuHeader);
        if (this.f32218t0.mo23496R()) {
            this.f32215q0.findViewById(C10232R.C10236id.ivArrowRightBranch).setScaleX(-1.0f);
            this.f32215q0.findViewById(C10232R.C10236id.ivArrowRightRating).setScaleX(-1.0f);
            this.f32215q0.findViewById(C10232R.C10236id.ivArrowRightHours).setScaleX(-1.0f);
        }
        toolbar.findViewById(C10232R.C10236id.llLeft).setVisibility(0);
        this.f32218t0.mo23553a((C11056p) this);
        linearLayout.setOnClickListener(this);
        this.f32183a1 = (FrameLayout) this.f32215q0.findViewById(C10232R.C10236id.flMenuTotal);
        this.f32161Q = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvAmount);
        this.f32163R = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvCurrency);
        this.f32166S0 = (ExpandableListView) this.f32215q0.findViewById(C10232R.C10236id.expandableListView);
        this.f32207m0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.imgIamCheckin);
        this.f32209n0 = (ImageView) toolbar.findViewById(C10232R.C10236id.ivServiceLogo);
        this.f32182a0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.txtIamCheckin);
        this.f32185b0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.txtCheckInCount);
        this.f32142A0 = (RelativeLayout) this.f32215q0.findViewById(C10232R.C10236id.rlVideoTour);
        this.f32164R0 = (VideoView) this.f32215q0.findViewById(C10232R.C10236id.video_view);
        this.f32164R0.setOnClickListener(this);
        this.f32224z0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.ivVideoThumb);
        this.f32217s0 = this.f32215q0.findViewById(C10232R.C10236id.flBannerContainer);
        this.f32211o0 = (LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.llMenuContainer);
        this.f32181a = this.f32215q0.findViewById(C10232R.C10236id.rlOrderNowMain);
        this.f32181a.setOnClickListener(this);
        this.f32157O = this.f32215q0.findViewById(C10232R.C10236id.llBranch);
        this.f32159P = this.f32215q0.findViewById(C10232R.C10236id.flOrderCount);
        this.f32189d0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvDistanceAway);
        this.f32157O.setOnClickListener(this);
        this.f32157O.setEnabled(false);
        this.f32147F0 = (ProgressBar) this.f32215q0.findViewById(C10232R.C10236id.pgLoading);
        this.f32149H0 = this.f32215q0.findViewById(C10232R.C10236id.pgLoadImage);
        this.f32148G0 = (ProgressBar) this.f32215q0.findViewById(C10232R.C10236id.pgMenuLoad);
        this.f32205l0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.ivLocation);
        this.f32171V = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvBranchAddress);
        this.f32173W = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvCount);
        this.f32175X = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvOrderNow);
        this.f32177Y = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvNoCourier);
        this.f32191e0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvDiscountTemp);
        this.f32193f0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvDiscount);
        this.f32179Z = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvWrkHrsTime);
        this.f32199i0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.ivYelloBg);
        this.f32201j0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.ivYelloBgTotal);
        linearLayout.setVisibility(0);
        this.f32172V0 = this.f32215q0.findViewById(C10232R.C10236id.bottomDividerView);
        this.f32170U0 = this.f32215q0.findViewById(C10232R.C10236id.flOrderNowDiscount);
        this.f32213p0 = (LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.llBOMSMenuContainer);
        ShopDetails shopDetails = this.f32219u0.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            getActivity().finish();
            return;
        }
        if (this.f32218t0.mo23504Z().booleanValue()) {
            this.f32157O.setVisibility(8);
        } else if (m51621N()) {
            this.f32157O.setVisibility(0);
        }
        m51643a(this.f32219u0.f16955b);
        m51625R();
        textView.setText(this.f32219u0.f16955b.getShop().getvTitle());
        textView2.setText(this.f32219u0.f16955b.getShop().getvSubTitle());
        textView2.setSelected(true);
        m51677f0();
        this.f32187c0 = (TextView) this.f32215q0.findViewById(C10232R.C10236id.txtPkgTitle);
        this.f32216r0 = (ReadMoreTextView) this.f32215q0.findViewById(C10232R.C10236id.txtPkgDesc);
        this.f32220v0 = (RoundedImage) this.f32215q0.findViewById(C10232R.C10236id.imgPkgInfo);
        this.f32220v0.setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_16));
        ((RoundedImage) this.f32215q0.findViewById(C10232R.C10236id.ivPlaceholder)).setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_16));
        this.f32197h0 = (ImageView) this.f32215q0.findViewById(C10232R.C10236id.imgPkgIcon);
        this.f32220v0.setOnClickListener(this);
        this.f32216r0.setOnClickListener(this);
        this.f32143B0 = (RecyclerView) this.f32215q0.findViewById(C10232R.C10236id.rvMenu);
        this.f32155N = this.f32215q0.findViewById(C10232R.C10236id.llCustomerReviews);
        this.f32184b = this.f32215q0.findViewById(C10232R.C10236id.llWorkingHrs);
        this.f32165S = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvReviewLbl);
        this.f32167T = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvRting);
        this.f32169U = (TextView) this.f32215q0.findViewById(C10232R.C10236id.tvHrsStatus);
        this.f32195g0 = (RatingBar) this.f32215q0.findViewById(C10232R.C10236id.rbAllOver);
        this.f32145D0 = (NestedScrollView) this.f32215q0.findViewById(C10232R.C10236id.svMain);
        this.f32146E0 = (LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.llMain);
        this.f32184b.setOnClickListener(this);
        this.f32155N.setOnClickListener(this);
        m51659b0();
        m51644a(this.f32219u0.f16955b.getShop().getShop_menu());
        m51705x();
        ((LinearLayout) this.f32215q0.findViewById(C10232R.C10236id.layCheckIn)).setOnClickListener(this);
        m51674e0();
        m51633Z();
        m51665c0();
        m51669d0();
        m51613H();
        m51688j0();
        if (this.f32219u0.f16955b.getShop().isDisableOrderNow()) {
            m51663c(true);
        }
        this.f32147F0.setVisibility(0);
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f32208m1, new IntentFilter(C11644i.f33173Q3));
        this.f32216r0.getViewTreeObserver().addOnGlobalLayoutListener(this.f32214p1);
    }

    /* renamed from: h */
    private void m51682h(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        textView4.setText(getString(C10232R.string.lbl_dg_title_yes));
        textView2.setText(getString(C10232R.string.lbl_dg_title_check_in));
        textView.setText(str);
        textView3.setOnClickListener(new C11436l(dialog));
        textView4.setOnClickListener(new C11437m(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: x */
    private void m51705x() {
        try {
            if (!TextUtils.isEmpty(this.f32219u0.f16955b.getShop().getvImage())) {
                String str = this.f32219u0.f16955b.getShop().getvImageType();
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
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f32219u0.f16955b.getShop().getvImage()).m11491c((int) C10232R.C10235drawable.img_shop_banner).m11496d().mo9424a((ImageView) this.f32220v0);
                } else if (c == 1) {
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f32219u0.f16955b.getShop().getvImage()).mo9456k().mo9429c((int) C10232R.C10235drawable.img_shop_banner).mo9430c((Drawable) m51601B()).mo9424a((ImageView) this.f32220v0);
                } else if (c == 2) {
                    this.f32217s0.setVisibility(8);
                    this.f32142A0.setVisibility(0);
                    this.f32224z0.setVisibility(8);
                    this.f32150I0 = new C10724c(getActivity().findViewById(16908290));
                    if (m51622O()) {
                        m51660c(0);
                        return;
                    }
                    this.f32150I0.mo38204a(m51608F(), 0);
                    m51660c(0);
                }
            } else {
                this.f32149H0.setVisibility(8);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    private void m51706y() {
        try {
            if (!this.f32176X0) {
                this.f32176X0 = true;
                if (m51621N()) {
                    m51641a(0);
                } else if (this.f32219u0.f16955b.getShop().isBOMSLinked()) {
                    m51642a(0, false, 0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    private void m51709z() {
        C5887x xVar = this.f32218t0;
        if (xVar != null && xVar.mo23502X()) {
            AppSingleton appSingleton = this.f32219u0;
            if (appSingleton != null) {
                FourSquareMainBean fourSquareMainBean = appSingleton.f16954a;
                if (fourSquareMainBean != null && fourSquareMainBean.getShopId() != null) {
                    this.f32218t0.mo23665u0();
                    HashMap hashMap = new HashMap();
                    hashMap.put("vShopId", this.f32219u0.f16954a.getShopId());
                    C5882b.m25774a(this.f32218t0).getDeepLink(hashMap).enqueue(new C11441p());
                }
            }
        }
    }

    /* renamed from: w */
    public void mo39505w() {
        C5887x xVar = this.f32218t0;
        if (xVar != null && !xVar.mo23503Y()) {
            ShopDetails shopDetails = this.f32219u0.f16955b;
            if (shopDetails != null && shopDetails.getAllowOrder().booleanValue()) {
                if (this.f32219u0.f16955b.getShop() == null) {
                    getActivity().finish();
                    return;
                }
                m51611G();
            }
        }
    }

    /* renamed from: c */
    private void m51663c(boolean z) {
        if (this.f32219u0.f16955b.getShop().isDisableOrderNow()) {
            String str = "yellow";
            if (z) {
                if (this.f32219u0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                    this.f32199i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                    this.f32201j0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                } else {
                    this.f32199i0.setVisibility(0);
                    this.f32201j0.setVisibility(0);
                    this.f32199i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                    this.f32201j0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.text_color_96));
                }
                this.f32181a.setEnabled(false);
                return;
            }
            if (this.f32219u0.f16955b.getBarColor().equalsIgnoreCase(str)) {
                this.f32199i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
                this.f32201j0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
            } else {
                this.f32199i0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
                this.f32201j0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_3));
                this.f32199i0.setVisibility(8);
                this.f32201j0.setVisibility(8);
            }
            this.f32181a.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51667d(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("bNotification", this.f32219u0.f16955b.getCheckedIn().booleanValue() ? "false" : ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        hashMap.put("iUserId", String.valueOf(this.f32218t0.mo23468C().mo23459f("user_id")));
        hashMap.put("vShopId", this.f32219u0.f16954a.getShopId());
        C5882b.m25774a(this.f32218t0).CheckInShop(hashMap).enqueue(new C11434j());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51670e(int i) {
        if (this.f32192e1) {
            this.f32192e1 = false;
        } else if (!this.f32196g1) {
            if (!this.f32166S0.isGroupExpanded(i)) {
                this.f32166S0.expandGroup(i);
                m51661c(this.f32166S0, false);
            }
            this.f32145D0.postDelayed(new C11444s(i), 10);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C11668s m51678g(String str) {
        C11668s sVar = new C11668s(str, true, false, null, null, false, true, this.f32150I0.mo38199a());
        return sVar;
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if ("getDeepLink".equals(str) && isAdded()) {
            C5887x xVar = this.f32218t0;
            String string = getResources().getString(C10232R.string.msg_share_shop);
            Object[] objArr = new Object[2];
            objArr[0] = this.f32219u0.f16955b.getShop().getvTitle();
            DeeplinkBean deeplinkBean = this.f32154M0;
            objArr[1] = deeplinkBean != null ? deeplinkBean.getUrl() : "";
            xVar.mo23483J(String.format(string, objArr));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51653b(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i2 = 0;
        for (int i3 = 0; i3 < expandableListAdapter.getGroupCount(); i3++) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            int measuredHeight = i2 + groupView.getMeasuredHeight();
            if (((expandableListView.isGroupExpanded(i3) && i3 != i) || (!expandableListView.isGroupExpanded(i3) && i3 == i)) && expandableListAdapter.getChildrenCount(i3) > 0) {
                View childView = expandableListAdapter.getChildView(i3, 0, false, null, expandableListView);
                childView.measure(makeMeasureSpec, 0);
                measuredHeight += childView.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3);
            }
            i2 = measuredHeight;
        }
        LayoutParams layoutParams = expandableListView.getLayoutParams();
        int dividerHeight = i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
        if (dividerHeight < 10) {
            dividerHeight = 200;
        }
        layoutParams.height = dividerHeight;
        expandableListView.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51673e(boolean z) {
        if (z) {
            this.f32211o0.setVisibility(8);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            this.f32213p0.setAnimation(alphaAnimation);
            this.f32213p0.setVisibility(0);
            return;
        }
        this.f32213p0.setVisibility(8);
        C11259i iVar = this.f32144C0;
        if (iVar != null && iVar.mo7325b() > 0) {
            this.f32211o0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m51634a(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            int measuredHeight = i2 + groupView.getMeasuredHeight();
            if (((expandableListView.isGroupExpanded(i3) && i3 != i) || (!expandableListView.isGroupExpanded(i3) && i3 == i)) && expandableListAdapter.getChildrenCount(i3) > 0) {
                View childView = expandableListAdapter.getChildView(i3, 0, false, null, expandableListView);
                childView.measure(makeMeasureSpec, 0);
                measuredHeight += childView.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3);
            }
            i2 = measuredHeight;
        }
        return i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m51661c(ExpandableListView expandableListView, boolean z) {
        if (isAdded()) {
            int a = m51635a(expandableListView, z);
            LayoutParams layoutParams = expandableListView.getLayoutParams();
            if (a < 10) {
                a = 200;
            }
            layoutParams.height = a;
            expandableListView.setLayoutParams(layoutParams);
            expandableListView.requestLayout();
        }
    }

    /* renamed from: a */
    private int m51635a(ExpandableListView expandableListView, boolean z) {
        double d;
        double d2;
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int i = 0;
        for (int i2 = 0; i2 < expandableListAdapter.getGroupCount(); i2++) {
            if (expandableListView.isGroupExpanded(i2)) {
                d2 = (double) i;
                d = ((ListViewHeightBean) this.f32204k1.get(i2)).getExpandHeight();
                Double.isNaN(d2);
            } else {
                d2 = (double) i;
                d = ((ListViewHeightBean) this.f32204k1.get(i2)).getCollapseHeight();
                Double.isNaN(d2);
            }
            i = (int) (d2 + d);
        }
        return i + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51654b(ExpandableListView expandableListView, boolean z) {
        int i;
        ListViewHeightBean listViewHeightBean;
        ListViewHeightBean listViewHeightBean2;
        double childrenCount;
        ExpandableListView expandableListView2 = expandableListView;
        if (isAdded()) {
            try {
                this.f32204k1.clear();
                ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
                if (z) {
                    i = 1;
                } else {
                    i = expandableListAdapter.getGroupCount();
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
                View groupView = expandableListAdapter.getGroupView(i > 1 ? 1 : 0, true, null, expandableListView2);
                groupView.measure(makeMeasureSpec, 0);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (i3 < i) {
                    ListViewHeightBean listViewHeightBean3 = new ListViewHeightBean();
                    listViewHeightBean3.setParentHeight((double) groupView.getMeasuredHeight());
                    int measuredHeight = i2 + groupView.getMeasuredHeight();
                    if (!expandableListView2.isGroupExpanded(i3) || expandableListAdapter.getChildrenCount(i3) <= 0) {
                        listViewHeightBean = listViewHeightBean3;
                    } else {
                        if (expandableListAdapter.getChildrenCount(i3) > 1) {
                            listViewHeightBean2 = listViewHeightBean3;
                            View childView = expandableListAdapter.getChildView(i3, 1, false, null, expandableListView);
                            childView.measure(makeMeasureSpec, 0);
                            measuredHeight += childView.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3);
                            childrenCount = (double) (childView.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3));
                            Double.isNaN(childrenCount);
                        } else {
                            listViewHeightBean2 = listViewHeightBean3;
                            if (i4 == 0) {
                                View childView2 = expandableListAdapter.getChildView(i3, 0, false, null, expandableListView);
                                childView2.measure(makeMeasureSpec, 0);
                                if (expandableListAdapter.getChildrenCount(i3) > 1) {
                                    i4 = childView2.getMeasuredHeight();
                                }
                                measuredHeight += childView2.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3);
                                childrenCount = (double) (childView2.getMeasuredHeight() * expandableListAdapter.getChildrenCount(i3));
                                Double.isNaN(childrenCount);
                            } else {
                                measuredHeight += expandableListAdapter.getChildrenCount(i3) * i4;
                                childrenCount = (double) (expandableListAdapter.getChildrenCount(i3) * i4);
                                Double.isNaN(childrenCount);
                            }
                        }
                        double d = childrenCount + 0.0d;
                        listViewHeightBean = listViewHeightBean2;
                        listViewHeightBean.setChildHeight(d);
                    }
                    this.f32204k1.add(listViewHeightBean);
                    i3++;
                    i2 = measuredHeight;
                }
                if (isAdded()) {
                    int dividerHeight = i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
                    LayoutParams layoutParams = expandableListView.getLayoutParams();
                    if (dividerHeight < 10) {
                        dividerHeight = 200;
                    }
                    layoutParams.height = dividerHeight;
                    expandableListView2.setLayoutParams(layoutParams);
                    expandableListView.requestLayout();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m51660c(int i) {
        this.f32151J0.mo40036a(C11644i.f33357m, (C11673d) new C11438n(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51649a(boolean z, int i) {
        if (z) {
            this.f32182a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.apptheme_color));
            this.f32207m0.setImageResource(C10232R.C10235drawable.icon_check_act);
        } else {
            this.f32182a0.setTextColor(C0841b.m4915a(getActivity().getApplicationContext(), (int) C10232R.C10234color.shop_type_color));
            this.f32207m0.setImageResource(C10232R.C10235drawable.icon_check);
        }
        this.f32185b0.setText(String.valueOf(i));
    }

    /* renamed from: a */
    private void m51644a(ShopMenuBean shopMenuBean) {
        if (shopMenuBean == null || shopMenuBean.getMenu_items() == null) {
            this.f32211o0.setVisibility(8);
            return;
        }
        this.f32211o0.setVisibility(8);
        List menu_items = shopMenuBean.getMenu_items();
        this.f32143B0.setNestedScrollingEnabled(false);
        this.f32143B0.setHasFixedSize(false);
        this.f32144C0 = new C11259i(getActivity(), menu_items);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f32143B0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f32143B0.setAdapter(this.f32144C0);
        this.f32144C0.mo39093a((C11263d) new C11440o(menu_items));
        StringBuilder sb = new StringBuilder();
        sb.append("original is :");
        sb.append(this.f32218t0.mo23601d(105));
        C5880q.m25751b(sb.toString());
    }

    /* renamed from: a */
    private void m51643a(ShopDetails shopDetails) {
        try {
            if (shopDetails.getPromotionAvailable()) {
                startActivity(new Intent(getActivity(), PromotionalOfferActivity.class));
                getActivity().overridePendingTransition(17432576, 17432577);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m51641a(int i) {
        C5887x xVar = this.f32218t0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f32218t0.mo23492O();
        } else if (!this.f32218t0.mo23504Z().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f32218t0.mo23476G());
            hashMap.put("auth_token", this.f32218t0.mo23640m());
            hashMap.put("vShopId", this.f32219u0.f16955b.getShop().getVShopId());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f32219u0.f16955b.getShop().getLatitude());
            hashMap.put("latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f32219u0.f16955b.getShop().getLongitude());
            hashMap.put("longitude", sb2.toString());
            hashMap.put(C11687c.f33717Q2, str);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("param: ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C11687c.m52645a(this.f32218t0).getBranchList(hashMap).enqueue(new C11442q(i));
        }
    }

    /* renamed from: b */
    public void mo38223b() {
        this.f32224z0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51642a(int i, boolean z, int i2, int i3) {
        double d;
        C5887x xVar = this.f32218t0;
        if (xVar == null || !xVar.mo23502X()) {
            this.f32218t0.mo23492O();
            return;
        }
        if (z || i3 == 3) {
            this.f32218t0.mo23665u0();
        }
        this.f32148G0.setVisibility(0);
        HashMap hashMap = new HashMap();
        hashMap.put(C11687c.f33862z0, this.f32219u0.f16955b.getShop().getVShopId());
        hashMap.put("language", this.f32218t0.mo23645o().toUpperCase());
        double d2 = 0.0d;
        if (i3 == 3) {
            d = 0.0d;
        } else if (z) {
            d2 = ((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i2)).getLatitude().doubleValue();
            d = ((BranchBean) this.f32219u0.f16955b.getShop().getBranchList().get(i2)).getLongitude().doubleValue();
        } else {
            d2 = this.f32219u0.f16955b.getShop().getLatitude().doubleValue();
            d = this.f32219u0.f16955b.getShop().getLongitude().doubleValue();
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
        this.f32153L0 = false;
        C11687c.m52644a().getMenuForBusinessOrder(hashMap).enqueue(new C11443r(i3, z));
    }
}
