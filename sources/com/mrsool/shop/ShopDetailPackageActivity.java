package com.mrsool.shop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1405m;
import androidx.fragment.app.Fragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.bean.StaticLabelBean;
import com.mrsool.p417t.C11553g;
import com.mrsool.shopmenu.C11422w;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.CustomViewPager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11616e;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p053b.p072g.p073b.C2128a;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c.C15800h;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15803c;

public class ShopDetailPackageActivity extends C0295d implements OnClickListener {

    /* renamed from: m0 */
    public static Context f31149m0;

    /* renamed from: n0 */
    public static ArrayList<MenuCategoryBean> f31150n0;

    /* renamed from: o0 */
    public static ArrayList<MenuItemBean> f31151o0 = new ArrayList<>();

    /* renamed from: p0 */
    public static int f31152p0 = -1;

    /* renamed from: q0 */
    public static int f31153q0 = -1;

    /* renamed from: r0 */
    public static String f31154r0;

    /* renamed from: s0 */
    public static String f31155s0;

    /* renamed from: t0 */
    public static double f31156t0 = 1.05d;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public AppSingleton f31157N;

    /* renamed from: O */
    private LinearLayout f31158O;

    /* renamed from: P */
    private LinearLayout f31159P;

    /* renamed from: Q */
    private ImageView f31160Q;

    /* renamed from: R */
    private C11218d f31161R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C11616e f31162S;

    /* renamed from: T */
    private Toolbar f31163T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ProgressBar f31164U;

    /* renamed from: V */
    private C11669t f31165V;

    /* renamed from: W */
    private String f31166W;

    /* renamed from: X */
    private String f31167X;

    /* renamed from: Y */
    private C11422w f31168Y;

    /* renamed from: Z */
    private C11422w f31169Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f31170a;

    /* renamed from: a0 */
    private FloatingActionButton f31171a0;

    /* renamed from: b */
    public CustomViewPager f31172b;

    /* renamed from: b0 */
    public String f31173b0;

    /* renamed from: c0 */
    private Bundle f31174c0;

    /* renamed from: d0 */
    public Bitmap f31175d0 = null;

    /* renamed from: e0 */
    private Boolean f31176e0 = Boolean.valueOf(false);

    /* renamed from: f0 */
    public CTEventBean f31177f0;

    /* renamed from: g0 */
    private FrameLayout f31178g0;

    /* renamed from: h0 */
    private TextView f31179h0;

    /* renamed from: i0 */
    String f31180i0 = "Process Time";

    /* renamed from: j0 */
    private BroadcastReceiver f31181j0 = new C11215a();

    /* renamed from: k0 */
    private Handler f31182k0 = new Handler();

    /* renamed from: l0 */
    private C15792c f31183l0;

    /* renamed from: com.mrsool.shop.ShopDetailPackageActivity$a */
    class C11215a extends BroadcastReceiver {
        C11215a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equalsIgnoreCase(C11644i.f33157O3)) {
                return;
            }
            if (!ShopDetailPackageActivity.this.f31170a.mo23502X() || !ShopDetailPackageActivity.this.f31170a.mo23500V()) {
                ShopDetailPackageActivity.this.f31164U.setVisibility(8);
                return;
            }
            ShopDetailPackageActivity.this.f31164U.setVisibility(0);
            ShopDetailPackageActivity.this.m50767j(1);
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailPackageActivity$b */
    class C11216b implements Callback<ShopDetails> {

        /* renamed from: a */
        final /* synthetic */ int f31185a;

        C11216b(int i) {
            this.f31185a = i;
        }

        public void onFailure(Call<ShopDetails> call, Throwable th) {
            try {
                if (ShopDetailPackageActivity.this.f31170a != null) {
                    ShopDetailPackageActivity.this.f31164U.setVisibility(8);
                    ShopDetailPackageActivity.this.f31170a.mo23492O();
                    ShopDetailPackageActivity.this.f31170a.mo23615f(ShopDetailPackageActivity.this.getString(C10232R.string.msg_error_server_issue), ShopDetailPackageActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0085 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0089 A[Catch:{ Exception -> 0x0130 }] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa A[Catch:{ Exception -> 0x0130 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call<com.mrsool.bean.ShopDetails> r4, retrofit2.Response<com.mrsool.bean.ShopDetails> r5) {
            /*
                r3 = this;
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                if (r4 == 0) goto L_0x0134
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                boolean r4 = r4.isFinishing()     // Catch:{ Exception -> 0x0130 }
                if (r4 != 0) goto L_0x0134
                boolean r4 = r5.isSuccessful()     // Catch:{ Exception -> 0x0130 }
                r0 = 2131886154(0x7f12004a, float:1.9406879E38)
                if (r4 == 0) goto L_0x00ee
                java.lang.Object r4 = r5.body()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r4 = (com.mrsool.bean.ShopDetails) r4     // Catch:{ Exception -> 0x0130 }
                int r4 = r4.getCode()     // Catch:{ Exception -> 0x0130 }
                r1 = 8
                r2 = 300(0x12c, float:4.2E-43)
                if (r4 < r2) goto L_0x0050
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                android.widget.ProgressBar r4 = r4.f31164U     // Catch:{ Exception -> 0x0130 }
                r4.setVisibility(r1)     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r5 = (com.mrsool.bean.ShopDetails) r5     // Catch:{ Exception -> 0x0130 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r1 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x0130 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0130 }
                r4.mo23615f(r5, r0)     // Catch:{ Exception -> 0x0130 }
                return
            L_0x0050:
                java.lang.Object r4 = r5.body()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r4 = (com.mrsool.bean.ShopDetails) r4     // Catch:{ Exception -> 0x0130 }
                int r4 = r4.getCode()     // Catch:{ Exception -> 0x0130 }
                if (r4 > r2) goto L_0x00bb
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.AppSingleton r4 = r4.f31157N     // Catch:{ Exception -> 0x0130 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r0 = (com.mrsool.bean.ShopDetails) r0     // Catch:{ Exception -> 0x0130 }
                r4.f16955b = r0     // Catch:{ Exception -> 0x0130 }
                int r4 = r3.f31185a     // Catch:{ Exception -> 0x0085 }
                if (r4 != 0) goto L_0x0085
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0085 }
                com.mrsool.utils.c.e r4 = r4.f31162S     // Catch:{ Exception -> 0x0085 }
                com.mrsool.shop.ShopDetailPackageActivity r0 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0085 }
                com.mrsool.utils.AppSingleton r0 = r0.f31157N     // Catch:{ Exception -> 0x0085 }
                com.mrsool.bean.ShopDetails r0 = r0.f16955b     // Catch:{ Exception -> 0x0085 }
                java.lang.String r1 = "service"
                com.mrsool.shop.ShopDetailPackageActivity r2 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0085 }
                com.mrsool.bean.CTEventBean r2 = r2.f31177f0     // Catch:{ Exception -> 0x0085 }
                r4.mo39858a(r0, r1, r2)     // Catch:{ Exception -> 0x0085 }
            L_0x0085:
                boolean r4 = com.mrsool.utils.C11644i.f33453y     // Catch:{ Exception -> 0x0130 }
                if (r4 == 0) goto L_0x0091
                r4 = 0
                com.mrsool.utils.C11644i.f33453y = r4     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                r4.m50754G()     // Catch:{ Exception -> 0x0130 }
            L_0x0091:
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                r4.m50762c(r5)     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0130 }
                java.lang.String r4 = r4.mo23528a(r5)     // Catch:{ Exception -> 0x0130 }
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0130 }
                if (r5 != 0) goto L_0x00e6
                com.mrsool.bean.ServiceManualDataBean r5 = new com.mrsool.bean.ServiceManualDataBean     // Catch:{ Exception -> 0x0130 }
                java.lang.String r0 = "shopDetails service"
                r5.<init>(r0, r4)     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                r4.mo23551a(r5)     // Catch:{ Exception -> 0x0130 }
                goto L_0x00e6
            L_0x00bb:
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                android.widget.ProgressBar r4 = r4.f31164U     // Catch:{ Exception -> 0x0130 }
                r4.setVisibility(r1)     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                r4.mo23492O()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r5 = (com.mrsool.bean.ShopDetails) r5     // Catch:{ Exception -> 0x0130 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r1 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0130 }
                r4.mo23615f(r5, r0)     // Catch:{ Exception -> 0x0130 }
            L_0x00e6:
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                int r5 = r3.f31185a     // Catch:{ Exception -> 0x0130 }
                r4.m50766i(r5)     // Catch:{ Exception -> 0x0130 }
                goto L_0x0134
            L_0x00ee:
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                if (r4 == 0) goto L_0x0134
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.AppSingleton r4 = r4.f31157N     // Catch:{ Exception -> 0x0130 }
                if (r4 == 0) goto L_0x0134
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                boolean r4 = r4.isFinishing()     // Catch:{ Exception -> 0x0130 }
                if (r4 != 0) goto L_0x0134
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                r4.mo23492O()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.AppSingleton r4 = r4.f31157N     // Catch:{ Exception -> 0x0130 }
                com.mrsool.bean.ShopDetails r1 = new com.mrsool.bean.ShopDetails     // Catch:{ Exception -> 0x0130 }
                r1.<init>()     // Catch:{ Exception -> 0x0130 }
                r4.f16955b = r1     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r4 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                com.mrsool.utils.x r4 = r4.f31170a     // Catch:{ Exception -> 0x0130 }
                java.lang.String r5 = r5.message()     // Catch:{ Exception -> 0x0130 }
                com.mrsool.shop.ShopDetailPackageActivity r1 = com.mrsool.shop.ShopDetailPackageActivity.this     // Catch:{ Exception -> 0x0130 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0130 }
                r4.mo23615f(r5, r0)     // Catch:{ Exception -> 0x0130 }
                goto L_0x0134
            L_0x0130:
                r4 = move-exception
                r4.printStackTrace()
            L_0x0134:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.shop.ShopDetailPackageActivity.C11216b.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailPackageActivity$c */
    class C11217c implements Runnable {
        C11217c() {
        }

        public void run() {
            ShopDetailPackageActivity.this.m50753E();
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailPackageActivity$d */
    class C11218d extends C1405m {

        /* renamed from: o */
        private final List<Fragment> f31188o = new ArrayList();

        /* renamed from: p */
        private final List<String> f31189p = new ArrayList();

        /* renamed from: q */
        private String[] f31190q = {ShopDetailPackageActivity.this.getString(C10232R.string.tab_title_service_info), ShopDetailPackageActivity.this.getString(C10232R.string.lbl_tab_pending_orders)};

        public C11218d(C1382h hVar) {
            super(hVar, 1);
        }

        /* renamed from: a */
        public int mo8886a() {
            return this.f31188o.size();
        }

        /* renamed from: b */
        public void mo39050b(Fragment fragment, String str) {
            this.f31188o.add(0, fragment);
            this.f31189p.add(str);
        }

        /* renamed from: c */
        public Fragment mo6390c(int i) {
            return (Fragment) this.f31188o.get(i);
        }

        /* renamed from: d */
        public void mo39052d() {
            this.f31188o.clear();
        }

        /* renamed from: a */
        public void mo39049a(Fragment fragment, String str) {
            this.f31188o.add(fragment);
            this.f31189p.add(str);
        }

        /* renamed from: d */
        public View mo39051d(int i) {
            View inflate = ShopDetailPackageActivity.this.getLayoutInflater().inflate(C10232R.layout.row_service_layout_badge_count, null);
            ((TextView) inflate.findViewById(C10232R.C10236id.txtTabTitle)).setText(this.f31190q[i]);
            return inflate;
        }

        /* renamed from: a */
        public CharSequence mo8888a(int i) {
            return (CharSequence) this.f31189p.get(i);
        }
    }

    static {
        String str = "";
        f31154r0 = str;
        f31155s0 = str;
    }

    public ShopDetailPackageActivity() {
        String str = "";
        this.f31166W = str;
        this.f31167X = str;
        this.f31173b0 = str;
    }

    /* renamed from: C */
    private View m50751C() {
        CharSequence charSequence;
        C11553g a = C11553g.m52081a(getLayoutInflater());
        StaticLabelBean i0 = HomeActivity.m47500i0();
        String string = getString(C10232R.string.lbl_ok_got_it);
        if (i0 == null || i0.getTooltipLabels() == null || i0.getTooltipLabels().getWaitingOrderTooltip() == null) {
            charSequence = "Now here is all the new Waiting Order request from user ";
        } else {
            CharSequence a2 = this.f31170a.mo23516a(i0.getTooltipLabels().getWaitingOrderTooltip().getLabel(), i0.getTooltipLabels().getWaitingOrderTooltip().getHighlight());
            string = i0.getTooltipLabels().getWaitingOrderTooltip().getButtonLabel();
            charSequence = a2;
        }
        a.f32708t0.setText(charSequence);
        a.f32704p0.setText(string);
        a.f32704p0.setOnClickListener(this);
        return a.mo5538m();
    }

    /* renamed from: D */
    private void m50752D() {
        this.f31174c0 = getIntent().getExtras();
        this.f31163T = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        this.f31164U = (ProgressBar) findViewById(C10232R.C10236id.pgLoadMore);
        this.f31172b = (CustomViewPager) findViewById(C10232R.C10236id.vpShopDetail);
        this.f31178g0 = (FrameLayout) this.f31163T.findViewById(C10232R.C10236id.flPendingOrder);
        this.f31179h0 = (TextView) this.f31163T.findViewById(C10232R.C10236id.tvOrderBadge);
        this.f31178g0.setOnClickListener(this);
        this.f31160Q = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f31158O = (LinearLayout) findViewById(C10232R.C10236id.llLeft);
        this.f31158O.setVisibility(4);
        this.f31159P = (LinearLayout) findViewById(C10232R.C10236id.layRightClick);
        this.f31159P.setVisibility(4);
        if (this.f31170a.mo23478H().equalsIgnoreCase(C11644i.f33191S5)) {
            this.f31160Q.setScaleX(-1.0f);
        }
        findViewById(C10232R.C10236id.flShopBack).setOnClickListener(this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f31166W = intent.getStringExtra(C11644i.f33367n1);
            this.f31167X = intent.getStringExtra(C11644i.f33375o1);
        }
        this.f31171a0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabOrderNow);
        this.f31171a0.setOnClickListener(this);
        if (!this.f31170a.mo23502X() || !this.f31170a.mo23500V()) {
            this.f31164U.setVisibility(8);
        } else {
            this.f31164U.setVisibility(0);
            m50767j(0);
        }
        C2128a.m11089a((Context) this).mo9218a(this.f31181j0, new IntentFilter(C11644i.f33157O3));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m50753E() {
        C15792c cVar = this.f31183l0;
        if (cVar == null || !cVar.mo52000b()) {
            this.f31183l0 = new C15800h(this).mo52035c(m50751C()).mo52031b((View) this.f31178g0).mo52023a(C15801a.none).mo52025a(C15803c.auto).mo52024a(this.f31170a.mo23496R() ? C15802b.start : C15802b.auto).mo52037d(100).mo52036d(4.0f).mo52039e(this.f31170a.mo23601d(-5)).mo52034c(-((int) this.f31178g0.getX())).mo52027a();
            this.f31183l0.mo52001c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m50754G() {
        String str;
        if (this.f31157N.f16955b.getShop().isBOMSLinked()) {
            str = C11644i.f33262b3;
        } else {
            str = C11644i.f33253a3;
        }
        try {
            C11598a.m52263f().mo39819a(this.f31157N.f16955b.getShop().getVShopId(), this.f31157N.f16955b.getShop().getVName(), this.f31157N.f16955b.getShop().getvEnName(), str, this.f31157N.f16955b.getShop().getVType(), "", this.f31157N.f16955b.getShop().getVType(), this.f31157N.f16955b.getShop().getDistance_courier_shop(), this.f31157N.f16955b.getShop().isHasDiscount(), this.f31170a.mo23639m(this.f31157N.f16955b.getShop().getDiscountShortLabel()), C11644i.f33065D);
        } catch (Exception unused) {
        }
    }

    /* renamed from: H */
    private void m50755H() {
        this.f31158O.setVisibility(0);
        this.f31159P.setVisibility(0);
        mo39045h(this.f31157N.f16955b.getOrders().size());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m50766i(int i) {
        C5880q.m25751b("addInfoOrderFragments");
        if (i == 0) {
            this.f31161R = new C11218d(getSupportFragmentManager());
            if (this.f31176e0.booleanValue()) {
                this.f31169Z = new C11422w();
                if (!this.f31169Z.isAdded()) {
                    this.f31161R.mo39049a(this.f31169Z, getString(C10232R.string.tab_title_service_info));
                }
            } else {
                this.f31168Y = new C11422w();
                if (!this.f31168Y.isAdded()) {
                    this.f31161R.mo39049a(this.f31168Y, getString(C10232R.string.tab_title_service_info));
                }
            }
            this.f31172b.setAdapter(this.f31161R);
            m50755H();
            return;
        }
        this.f31170a.mo23473E(C11644i.f33165P3);
        mo39045h(this.f31157N.f16955b.getOrders().size());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m50767j(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("vShopId", this.f31166W);
        C11644i.f33218W0 = this.f31166W;
        hashMap.put("type", "2");
        String str = "language";
        if (this.f31170a.mo23585b0()) {
            StringBuilder sb = new StringBuilder();
            sb.append("callShopDetails login status");
            String str2 = "user_id";
            sb.append(this.f31170a.mo23468C().mo23459f(str2));
            C5880q.m25753d(sb.toString());
            hashMap.put("iUserId", String.valueOf(this.f31170a.mo23468C().mo23459f(str2)));
            hashMap.put(str, String.valueOf(this.f31170a.mo23645o()));
        }
        hashMap.put(str, String.valueOf(this.f31170a.mo23645o()));
        hashMap.put("vLanguage", this.f31170a.mo23645o());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Params:");
        sb2.append(hashMap);
        C5880q.m25751b(sb2.toString());
        C11687c.m52645a(this.f31170a).shopDetails(hashMap).enqueue(new C11216b(i));
    }

    /* renamed from: h */
    public void mo39045h(int i) {
        String str;
        try {
            int i2 = 8;
            if (!this.f31170a.mo23662t0()) {
                this.f31178g0.setVisibility(8);
                return;
            }
            this.f31178g0.setVisibility(i > 0 ? 0 : 8);
            TextView textView = this.f31179h0;
            if (i > 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = this.f31179h0;
            if (i > 9) {
                str = "+9";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("");
                str = sb.toString();
            }
            textView2.setText(str);
            if (!this.f31170a.mo23468C().mo23450a(C11644i.f33338j7) && i > 0) {
                this.f31182k0.postDelayed(new C11217c(), 2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        if (view.equals(this.f31171a0)) {
            C11422w wVar = this.f31168Y;
            if (wVar != null) {
                wVar.mo39505w();
            }
            C11422w wVar2 = this.f31169Z;
            if (wVar2 != null) {
                wVar2.mo39505w();
            }
        } else if (view.getId() == C10232R.C10236id.flShopBack) {
            onBackPressed();
        } else if (view == this.f31178g0) {
            Intent intent = new Intent(this, PendingOrdersActivity.class);
            intent.putExtra(C11644i.f33391q1, this.f31157N.f16955b.getShop().getvTitle());
            startActivity(intent);
        } else if (view.getId() == C10232R.C10236id.btnTooltipDone) {
            C15792c cVar = this.f31183l0;
            if (cVar != null && cVar.mo52000b()) {
                this.f31183l0.mo51999a();
                this.f31170a.mo23468C().mo23448a(C11644i.f33338j7, Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31170a = new C5887x(this);
        String g = this.f31170a.mo23468C().mo23460g("language");
        if (!Locale.getDefault().getLanguage().equalsIgnoreCase(g)) {
            this.f31170a.mo23477G(g);
        }
        C11644i.f33234Y0 = true;
        setContentView((int) C10232R.layout.activity_service_detail);
        f31149m0 = this;
        C11644i.f33209V = true;
        this.f31170a = new C5887x(this);
        this.f31165V = new C11669t(this);
        this.f31157N = (AppSingleton) getApplicationContext();
        this.f31162S = new C11616e(this);
        C11644i.f33137M = true;
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        try {
            C6009d.m27516c(getApplicationContext()).mo24810e(getResources().getString(C10232R.string.branch_event_open_Shop));
        } catch (Exception unused) {
        }
        m50752D();
        if (getIntent().getExtras() != null && getIntent().getExtras().containsKey(C11644i.f33067D1)) {
            this.f31173b0 = getIntent().getExtras().getString(C11644i.f33067D1);
        }
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            String str = C11644i.f33207U5;
            if (extras.containsKey(str)) {
                this.f31177f0 = (CTEventBean) getIntent().getExtras().get(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            super.onDestroy();
            C11644i.f33234Y0 = false;
            C2128a.m11089a((Context) this).mo9217a(this.f31181j0);
        } catch (NullPointerException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m50752D();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11644i.f33234Y0 = false;
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5880q.m25751b("onResume ShopDetailPackageActivity");
        try {
            C11644i.f33234Y0 = true;
            if (this.f31170a != null && this.f31170a.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                this.f31170a.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50762c(Response<ShopDetails> response) {
        if (response.isSuccessful()) {
            this.f31157N.f16954a.setShopId(((ShopDetails) response.body()).getShop().getVShopId());
            this.f31157N.f16954a.setShopName(((ShopDetails) response.body()).getShop().getVName());
            this.f31157N.f16954a.setLatitude(String.valueOf(((ShopDetails) response.body()).getShop().getLatitude()));
            this.f31157N.f16954a.setLongitude(String.valueOf(((ShopDetails) response.body()).getShop().getLongitude()));
            this.f31157N.f16954a.setDistance(String.valueOf(((ShopDetails) response.body()).getShop().getDistance_courier_shop()));
            this.f31157N.f16954a.setRatings(null);
            this.f31157N.f16954a.setFormattedAddress(String.valueOf(((ShopDetails) response.body()).getShop().getVAddress()));
            this.f31157N.f16954a.setShopPic(String.valueOf(((ShopDetails) response.body()).getShop().getVShopPic()));
        }
    }
}
