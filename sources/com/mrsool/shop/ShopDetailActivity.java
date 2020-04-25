package com.mrsool.shop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1405m;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.mrsool.C10232R;
import com.mrsool.C10796f;
import com.mrsool.HomeActivity;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.bean.StaticLabelBean;
import com.mrsool.chat.C10526n;
import com.mrsool.customeview.C10752a;
import com.mrsool.order.C11056p;
import com.mrsool.p417t.C11553g;
import com.mrsool.shop.C11244h.C11257l;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p420b0.C11573b;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11616e;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

public class ShopDetailActivity extends C10796f implements OnClickListener, C11257l, C11056p, C11573b {

    /* renamed from: j0 */
    public static ViewPager f31114j0 = null;

    /* renamed from: k0 */
    public static boolean f31115k0 = false;

    /* renamed from: l0 */
    public static Context f31116l0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public AppSingleton f31117N;

    /* renamed from: O */
    private LinearLayout f31118O;

    /* renamed from: P */
    private LinearLayout f31119P;

    /* renamed from: Q */
    private ImageView f31120Q;

    /* renamed from: R */
    private Bundle f31121R;

    /* renamed from: S */
    private View f31122S;

    /* renamed from: T */
    private C10752a f31123T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C11214e f31124U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11616e f31125V;

    /* renamed from: W */
    private Toolbar f31126W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public ProgressBar f31127X;

    /* renamed from: Y */
    private C11669t f31128Y;

    /* renamed from: Z */
    public Location f31129Z;

    /* renamed from: a0 */
    public String f31130a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5887x f31131b;

    /* renamed from: b0 */
    public String f31132b0;

    /* renamed from: c0 */
    public Bitmap f31133c0 = null;

    /* renamed from: d0 */
    public CTEventBean f31134d0;

    /* renamed from: e0 */
    private FrameLayout f31135e0;

    /* renamed from: f0 */
    private TextView f31136f0;

    /* renamed from: g0 */
    private C15792c f31137g0;

    /* renamed from: h0 */
    private Handler f31138h0 = new Handler();

    /* renamed from: i0 */
    private BroadcastReceiver f31139i0 = new C11210a();

    /* renamed from: com.mrsool.shop.ShopDetailActivity$a */
    class C11210a extends BroadcastReceiver {
        C11210a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!intent.getAction().equalsIgnoreCase(C11644i.f33157O3)) {
                return;
            }
            if (!ShopDetailActivity.this.f31131b.mo23502X() || !ShopDetailActivity.this.f31131b.mo23500V()) {
                ShopDetailActivity.this.f31127X.setVisibility(8);
                return;
            }
            ShopDetailActivity.this.f31127X.setVisibility(0);
            ShopDetailActivity.this.m50735i(1);
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailActivity$b */
    class C11211b implements Callback<ShopDetails> {

        /* renamed from: a */
        final /* synthetic */ int f31141a;

        C11211b(int i) {
            this.f31141a = i;
        }

        public void onFailure(Call<ShopDetails> call, Throwable th) {
            try {
                if (ShopDetailActivity.this.f31131b != null) {
                    ShopDetailActivity.this.f31127X.setVisibility(8);
                    ShopDetailActivity.this.f31131b.mo23492O();
                    ShopDetailActivity.this.f31131b.mo23615f(ShopDetailActivity.this.getString(C10232R.string.msg_error_server_issue), ShopDetailActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0064 */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0068 A[Catch:{ Exception -> 0x0150 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0079 A[Catch:{ Exception -> 0x0150 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae A[Catch:{ Exception -> 0x0150 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00ec A[Catch:{ Exception -> 0x0150 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call<com.mrsool.bean.ShopDetails> r4, retrofit2.Response<com.mrsool.bean.ShopDetails> r5) {
            /*
                r3 = this;
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0154
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                boolean r4 = r4.isFinishing()     // Catch:{ Exception -> 0x0150 }
                if (r4 != 0) goto L_0x0154
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                r4.mo23492O()     // Catch:{ Exception -> 0x0150 }
                boolean r4 = r5.isSuccessful()     // Catch:{ Exception -> 0x0150 }
                r0 = 2131886154(0x7f12004a, float:1.9406879E38)
                if (r4 == 0) goto L_0x0117
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.AppSingleton r4 = r4.f31117N     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.bean.ShopDetails r1 = (com.mrsool.bean.ShopDetails) r1     // Catch:{ Exception -> 0x0150 }
                r4.f16955b = r1     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                android.widget.ProgressBar r4 = r4.f31127X     // Catch:{ Exception -> 0x0150 }
                r1 = 8
                r4.setVisibility(r1)     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r4 = r5.body()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.bean.ShopDetails r4 = (com.mrsool.bean.ShopDetails) r4     // Catch:{ Exception -> 0x0150 }
                int r4 = r4.getCode()     // Catch:{ Exception -> 0x0150 }
                r1 = 300(0x12c, float:4.2E-43)
                if (r4 > r1) goto L_0x00fd
                int r4 = r3.f31141a     // Catch:{ Exception -> 0x0064 }
                if (r4 != 0) goto L_0x0064
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0064 }
                com.mrsool.utils.c.e r4 = r4.f31125V     // Catch:{ Exception -> 0x0064 }
                com.mrsool.shop.ShopDetailActivity r0 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0064 }
                com.mrsool.utils.AppSingleton r0 = r0.f31117N     // Catch:{ Exception -> 0x0064 }
                com.mrsool.bean.ShopDetails r0 = r0.f16955b     // Catch:{ Exception -> 0x0064 }
                java.lang.String r1 = "shop"
                com.mrsool.shop.ShopDetailActivity r2 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0064 }
                com.mrsool.bean.CTEventBean r2 = r2.f31134d0     // Catch:{ Exception -> 0x0064 }
                r4.mo39858a(r0, r1, r2)     // Catch:{ Exception -> 0x0064 }
            L_0x0064:
                boolean r4 = com.mrsool.utils.C11644i.f33453y     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0070
                r4 = 0
                com.mrsool.utils.C11644i.f33453y = r4     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                r4.m50719M()     // Catch:{ Exception -> 0x0150 }
            L_0x0070:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                r4.m50729c(r5)     // Catch:{ Exception -> 0x0150 }
                int r4 = r3.f31141a     // Catch:{ Exception -> 0x0150 }
                if (r4 != 0) goto L_0x00ae
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity$e r0 = new com.mrsool.shop.ShopDetailActivity$e     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r1 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r2 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                androidx.fragment.app.h r2 = r2.getSupportFragmentManager()     // Catch:{ Exception -> 0x0150 }
                r0.<init>(r2)     // Catch:{ Exception -> 0x0150 }
                r4.f31124U = r0     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity$e r4 = r4.f31124U     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.h r0 = new com.mrsool.shop.h     // Catch:{ Exception -> 0x0150 }
                r0.<init>()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r1 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                r2 = 2131887166(0x7f12043e, float:1.9408931E38)
                java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0150 }
                r4.mo39043a(r0, r1)     // Catch:{ Exception -> 0x0150 }
                androidx.viewpager.widget.ViewPager r4 = com.mrsool.shop.ShopDetailActivity.f31114j0     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r0 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity$e r0 = r0.f31124U     // Catch:{ Exception -> 0x0150 }
                r4.setAdapter(r0)     // Catch:{ Exception -> 0x0150 }
                goto L_0x00b9
            L_0x00ae:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                java.lang.String r0 = "refresh_complete_pending_order"
                r4.mo23473E(r0)     // Catch:{ Exception -> 0x0150 }
            L_0x00b9:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x00cf }
                com.mrsool.shop.ShopDetailActivity r0 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x00cf }
                com.mrsool.utils.AppSingleton r0 = r0.f31117N     // Catch:{ Exception -> 0x00cf }
                com.mrsool.bean.ShopDetails r0 = r0.f16955b     // Catch:{ Exception -> 0x00cf }
                java.util.List r0 = r0.getOrders()     // Catch:{ Exception -> 0x00cf }
                int r0 = r0.size()     // Catch:{ Exception -> 0x00cf }
                r4.mo39039h(r0)     // Catch:{ Exception -> 0x00cf }
                goto L_0x00d3
            L_0x00cf:
                r4 = move-exception
                r4.printStackTrace()     // Catch:{ Exception -> 0x0150 }
            L_0x00d3:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                r4.m50721O()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0150 }
                java.lang.String r4 = r4.mo23528a(r5)     // Catch:{ Exception -> 0x0150 }
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0150 }
                if (r5 != 0) goto L_0x0154
                com.mrsool.bean.ServiceManualDataBean r5 = new com.mrsool.bean.ServiceManualDataBean     // Catch:{ Exception -> 0x0150 }
                java.lang.String r0 = "shopDetails"
                r5.<init>(r0, r4)     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                r4.mo23551a(r5)     // Catch:{ Exception -> 0x0150 }
                goto L_0x0154
            L_0x00fd:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.bean.ShopDetails r5 = (com.mrsool.bean.ShopDetails) r5     // Catch:{ Exception -> 0x0150 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r1 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0150 }
                r4.mo23615f(r5, r0)     // Catch:{ Exception -> 0x0150 }
                return
            L_0x0117:
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0154
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.AppSingleton r4 = r4.f31117N     // Catch:{ Exception -> 0x0150 }
                if (r4 == 0) goto L_0x0154
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                boolean r4 = r4.isFinishing()     // Catch:{ Exception -> 0x0150 }
                if (r4 != 0) goto L_0x0154
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.AppSingleton r4 = r4.f31117N     // Catch:{ Exception -> 0x0150 }
                com.mrsool.bean.ShopDetails r1 = new com.mrsool.bean.ShopDetails     // Catch:{ Exception -> 0x0150 }
                r1.<init>()     // Catch:{ Exception -> 0x0150 }
                r4.f16955b = r1     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r4 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                com.mrsool.utils.x r4 = r4.f31131b     // Catch:{ Exception -> 0x0150 }
                java.lang.String r5 = r5.message()     // Catch:{ Exception -> 0x0150 }
                com.mrsool.shop.ShopDetailActivity r1 = com.mrsool.shop.ShopDetailActivity.this     // Catch:{ Exception -> 0x0150 }
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0150 }
                r4.mo23615f(r5, r0)     // Catch:{ Exception -> 0x0150 }
                goto L_0x0154
            L_0x0150:
                r4 = move-exception
                r4.printStackTrace()
            L_0x0154:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.shop.ShopDetailActivity.C11211b.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailActivity$c */
    class C11212c implements C11673d {
        C11212c() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C5880q.m25753d("initLocationData buildGoogleApiClient");
            if (ShopDetailActivity.this.f31131b.mo23502X() && ShopDetailActivity.this.f31131b.mo23500V()) {
                ShopDetailActivity.this.mo39037E();
            }
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailActivity$d */
    class C11213d implements Runnable {
        C11213d() {
        }

        public void run() {
            ShopDetailActivity.this.m50716J();
        }
    }

    /* renamed from: com.mrsool.shop.ShopDetailActivity$e */
    class C11214e extends C1405m {

        /* renamed from: o */
        private final List<Fragment> f31145o = new ArrayList();

        /* renamed from: p */
        private final List<String> f31146p = new ArrayList();

        /* renamed from: q */
        private String[] f31147q = {ShopDetailActivity.this.getString(C10232R.string.lbl_tab_shop_info), ShopDetailActivity.this.getString(C10232R.string.lbl_tab_pending_orders)};

        public C11214e(C1382h hVar) {
            super(hVar, 1);
        }

        /* renamed from: a */
        public int mo8886a() {
            return this.f31145o.size();
        }

        /* renamed from: c */
        public Fragment mo6390c(int i) {
            return (Fragment) this.f31145o.get(i);
        }

        /* renamed from: d */
        public View mo39044d(int i) {
            View inflate = ShopDetailActivity.this.getLayoutInflater().inflate(C10232R.layout.row_service_layout_badge_count, null);
            ((TextView) inflate.findViewById(C10232R.C10236id.txtTabTitle)).setText(this.f31147q[i]);
            return inflate;
        }

        /* renamed from: a */
        public void mo39043a(Fragment fragment, String str) {
            this.f31145o.add(fragment);
            this.f31146p.add(str);
        }

        /* renamed from: a */
        public CharSequence mo8888a(int i) {
            return (CharSequence) this.f31146p.get(i);
        }
    }

    public ShopDetailActivity() {
        String str = "";
        this.f31130a0 = str;
        this.f31132b0 = str;
    }

    /* renamed from: G */
    private View m50713G() {
        CharSequence charSequence;
        C11553g a = C11553g.m52081a(getLayoutInflater());
        StaticLabelBean i0 = HomeActivity.m47500i0();
        String string = getString(C10232R.string.lbl_ok_got_it);
        if (i0 == null || i0.getTooltipLabels() == null || i0.getTooltipLabels().getWaitingOrderTooltip() == null) {
            charSequence = "Now here is all the new Waiting Order request from user ";
        } else {
            CharSequence a2 = this.f31131b.mo23516a(i0.getTooltipLabels().getWaitingOrderTooltip().getLabel(), i0.getTooltipLabels().getWaitingOrderTooltip().getHighlight());
            string = i0.getTooltipLabels().getWaitingOrderTooltip().getButtonLabel();
            charSequence = a2;
        }
        a.f32708t0.setText(charSequence);
        a.f32704p0.setText(string);
        a.f32704p0.setOnClickListener(this);
        return a.mo5538m();
    }

    /* renamed from: H */
    private void m50714H() {
        this.f31121R = getIntent().getExtras();
        this.f31126W = (Toolbar) findViewById(C10232R.C10236id.tbTXT);
        this.f31127X = (ProgressBar) findViewById(C10232R.C10236id.pgLoadMore);
        f31114j0 = (ViewPager) findViewById(C10232R.C10236id.vpShopDetail);
        this.f31135e0 = (FrameLayout) this.f31126W.findViewById(C10232R.C10236id.flPendingOrder);
        this.f31136f0 = (TextView) this.f31126W.findViewById(C10232R.C10236id.tvOrderBadge);
        this.f31135e0.setOnClickListener(this);
        C11644i.f33234Y0 = true;
        this.f31118O = (LinearLayout) this.f31126W.findViewById(C10232R.C10236id.llLeft);
        this.f31118O.setVisibility(4);
        this.f31120Q = (ImageView) findViewById(C10232R.C10236id.imgClose);
        findViewById(C10232R.C10236id.flShopBack).setOnClickListener(this);
        this.f31119P = (LinearLayout) this.f31126W.findViewById(C10232R.C10236id.layRightClick);
        this.f31119P.setVisibility(4);
        this.f31118O.setOnClickListener(this);
        this.f31122S = findViewById(C10232R.C10236id.vDivider);
        if (!this.f31131b.mo23502X() || !this.f31131b.mo23500V()) {
            this.f31127X.setVisibility(8);
        } else {
            this.f31127X.setVisibility(0);
            m50735i(0);
        }
        C2128a.m11089a((Context) this).mo9218a(this.f31139i0, new IntentFilter(C11644i.f33157O3));
    }

    /* renamed from: I */
    private void m50715I() {
        if (this.f31131b.mo23624h()) {
            this.f31128Y.mo40036a(C11644i.f33339k, (C11673d) new C11212c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m50716J() {
        C15792c cVar = this.f31137g0;
        if (cVar == null || !cVar.mo52000b()) {
            this.f31137g0 = new C15800h(this).mo52035c(m50713G()).mo52031b((View) this.f31135e0).mo52023a(C15801a.none).mo52025a(C15803c.auto).mo52024a(this.f31131b.mo23496R() ? C15802b.start : C15802b.auto).mo52037d(100).mo52036d(4.0f).mo52039e(this.f31131b.mo23601d(-5)).mo52034c(-((int) this.f31135e0.getX())).mo52027a();
            this.f31137g0.mo52001c();
        }
    }

    /* renamed from: K */
    private boolean m50717K() {
        return C5887x.m25797a(this.f31121R).equalsIgnoreCase(getResources().getString(C10232R.string.lbl_screen_home));
    }

    /* renamed from: L */
    private boolean m50718L() {
        return C5887x.m25797a(this.f31121R).equalsIgnoreCase(getResources().getString(C10232R.string.lbl_frg_notification)) || C5887x.m25797a(this.f31121R).equalsIgnoreCase(getResources().getString(C10232R.string.lbl_push_notification)) || C5887x.m25797a(this.f31121R).equalsIgnoreCase(getResources().getString(C10232R.string.lbl_store_id));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m50719M() {
        String str;
        if (this.f31117N.f16955b.getShop().isBOMSLinked()) {
            str = C11644i.f33262b3;
        } else {
            str = C11644i.f33253a3;
        }
        try {
            C11598a.m52263f().mo39819a(this.f31117N.f16955b.getShop().getVShopId(), this.f31117N.f16955b.getShop().getVName(), this.f31117N.f16955b.getShop().getvEnName(), str, this.f31117N.f16955b.getShop().getVType(), "", this.f31117N.f16955b.getShop().getVType(), this.f31117N.f16955b.getShop().getDistance_courier_shop(), this.f31117N.f16955b.getShop().isHasDiscount(), this.f31131b.mo23639m(this.f31117N.f16955b.getShop().getDiscountShortLabel()), C11644i.f33065D);
        } catch (Exception unused) {
        }
    }

    /* renamed from: N */
    private void m50720N() {
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m50721O() {
        this.f31118O.setVisibility(0);
        this.f31119P.setVisibility(0);
        mo39039h(this.f31117N.f16955b.getOrders().size());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m50735i(int i) {
        HashMap hashMap = new HashMap();
        String str = "language";
        String str2 = "user_long";
        String str3 = "user_lat";
        String str4 = "vShopId";
        String str5 = "";
        if (m50718L() || m50717K()) {
            hashMap.put(str4, C5887x.m25798a(this.f31121R, C11644i.f33367n1));
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(this.f31131b.mo23648p().latitude);
            hashMap.put(str3, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(this.f31131b.mo23648p().longitude);
            hashMap.put(str2, sb2.toString());
            C11644i.f33218W0 = C5887x.m25798a(this.f31121R, C11644i.f33367n1);
        } else if (this.f31117N.f16954a.getShopId() != null) {
            hashMap.put(str4, String.valueOf(this.f31117N.f16954a.getShopId().trim()));
            hashMap.put("vName", String.valueOf(this.f31117N.f16954a.getShopName()).trim());
            hashMap.put("vAddress", String.valueOf(this.f31117N.f16954a.getFormattedAddress()));
            hashMap.put("latitude", String.valueOf(this.f31117N.f16954a.getLatitude()));
            hashMap.put("longitude", String.valueOf(this.f31117N.f16954a.getLongitude()));
            hashMap.put("vShopPic", String.valueOf(this.f31117N.f16954a.getShopPic()));
            hashMap.put(str, this.f31131b.mo23478H());
            hashMap.put("vType", String.valueOf(this.f31117N.f16954a.getType()));
            hashMap.put("vDataSource", String.valueOf(this.f31117N.f16954a.getvDataSource()));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append(this.f31131b.mo23648p().latitude);
            hashMap.put(str3, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(this.f31131b.mo23648p().longitude);
            hashMap.put(str2, sb4.toString());
            String str6 = "vPhone";
            if (this.f31117N.f16954a.getvPhone() == null) {
                hashMap.put(str6, str5);
            } else {
                hashMap.put(str6, String.valueOf(this.f31117N.f16954a.getvPhone()));
            }
            C11644i.f33218W0 = String.valueOf(this.f31117N.f16954a.getShopId().trim());
        } else {
            return;
        }
        hashMap.put(str, String.valueOf(this.f31131b.mo23645o()));
        hashMap.put("vLanguage", this.f31131b.mo23645o());
        if (this.f31131b.mo23585b0()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("callShopDetails login status");
            String str7 = "user_id";
            sb5.append(this.f31131b.mo23468C().mo23459f(str7));
            C5880q.m25753d(sb5.toString());
            hashMap.put("iUserId", String.valueOf(this.f31131b.mo23468C().mo23459f(str7)));
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Params:");
        sb6.append(hashMap);
        C5880q.m25751b(sb6.toString());
        C11687c.m52645a(this.f31131b).shopDetails(hashMap).enqueue(new C11211b(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo39037E() {
        this.f29659a.mo39750a((C11573b) this);
        this.f29659a.mo39753b((int) C10526n.f28536a);
        this.f29659a.mo39748a(1000);
        mo38426C();
    }

    /* renamed from: b */
    public void mo39038b(Uri uri) {
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.btnTooltipDone) {
            C15792c cVar = this.f31137g0;
            if (cVar != null && cVar.mo52000b()) {
                this.f31137g0.mo51999a();
                this.f31131b.mo23468C().mo23448a(C11644i.f33338j7, Boolean.valueOf(true));
            }
        } else if (id == C10232R.C10236id.flPendingOrder) {
            Intent intent = new Intent(this, PendingOrdersActivity.class);
            intent.putExtra(C11644i.f33391q1, this.f31117N.f16954a.getShopName());
            startActivity(intent);
        } else if (id == C10232R.C10236id.flShopBack) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31131b = new C5887x(this);
        this.f31131b.mo23553a((C11056p) this);
        C11644i.f33209V = false;
        setContentView((int) C10232R.layout.activity_shop_detail);
        f31116l0 = this;
        this.f31131b = new C5887x(this);
        this.f31128Y = new C11669t(this);
        this.f31117N = (AppSingleton) getApplicationContext();
        this.f31125V = new C11616e(this);
        if (this.f31131b.mo23502X() && this.f31131b.mo23500V()) {
            m50715I();
        }
        try {
            C6009d.m27516c(getApplicationContext()).mo24810e(getResources().getString(C10232R.string.branch_event_open_Shop));
        } catch (Exception unused) {
        }
        if (getIntent().getExtras() != null && getIntent().getExtras().containsKey(C11644i.f33067D1)) {
            this.f31130a0 = getIntent().getExtras().getString(C11644i.f33067D1);
        }
        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            String str = C11644i.f33207U5;
            if (extras.containsKey(str)) {
                this.f31134d0 = (CTEventBean) getIntent().getExtras().get(str);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        try {
            C11644i.f33234Y0 = false;
            mo38427D();
            C2128a.m11089a((Context) this).mo9217a(this.f31139i0);
        } catch (NullPointerException unused) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m50714H();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C11644i.f33234Y0 = false;
        mo38427D();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.f31128Y != null) {
                this.f31128Y.onRequestPermissionsResult(i, strArr, iArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            C11644i.f33234Y0 = true;
            if (this.f31131b != null && this.f31131b.mo23620g()) {
                this.f31131b.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: s */
    public void mo36531s() {
    }

    /* renamed from: t */
    public void mo36532t() {
    }

    /* renamed from: c */
    private void m50728c(Location location) {
        C5880q.m25753d("startLocationUpdates ");
        this.f31129Z = location;
        String str = C11644i.f33312h;
        String str2 = C11644i.f33303g;
        if (location != null) {
            if (((double) C5887x.m25805b(this.f31129Z.getLatitude(), this.f31129Z.getLongitude(), location.getLatitude(), location.getLongitude())) > ((double) C11644i.f33397r)) {
                this.f31131b.mo23468C().mo23449a(str2, this.f31131b.mo23523a(location));
                this.f31131b.mo23468C().mo23449a(str, this.f31131b.mo23570b(location));
                f31115k0 = true;
            } else {
                f31115k0 = false;
            }
        }
        Location location2 = this.f31129Z;
        String str3 = "startLocationUpdates location";
        if (location2 != null) {
            this.f31131b.mo23570b(location2);
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(this.f31129Z.getLatitude());
            C5880q.m25753d(sb.toString());
            this.f31131b.mo23468C().mo23449a(str2, this.f31131b.mo23523a(this.f31129Z));
            this.f31131b.mo23468C().mo23449a(str, this.f31131b.mo23570b(this.f31129Z));
            m50714H();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(this.f31129Z);
        C5880q.m25753d(sb2.toString());
    }

    /* renamed from: b */
    public void mo36526b(Location location) {
        m50728c(location);
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (str.hashCode() == -661560633) {
            boolean equals = str.equals("shopdetail");
        }
    }

    /* renamed from: h */
    public void mo39039h(int i) {
        String str;
        try {
            int i2 = 8;
            if (!this.f31131b.mo23662t0()) {
                this.f31135e0.setVisibility(8);
                return;
            }
            this.f31135e0.setVisibility(i > 0 ? 0 : 8);
            TextView textView = this.f31136f0;
            if (i > 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            TextView textView2 = this.f31136f0;
            if (i > 9) {
                str = "+9";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("");
                str = sb.toString();
            }
            textView2.setText(str);
            if (!this.f31131b.mo23468C().mo23450a(C11644i.f33338j7) && i > 0) {
                this.f31138h0.postDelayed(new C11213d(), 2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo36525a(Location location) {
        m50728c(location);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50729c(Response<ShopDetails> response) {
        if (response.isSuccessful()) {
            this.f31117N.f16954a.setShopId(((ShopDetails) response.body()).getShop().getVShopId());
            this.f31117N.f16954a.setShopName(((ShopDetails) response.body()).getShop().getVName());
            this.f31117N.f16954a.setLatitude(String.valueOf(((ShopDetails) response.body()).getShop().getLatitude()));
            this.f31117N.f16954a.setLongitude(String.valueOf(((ShopDetails) response.body()).getShop().getLongitude()));
            this.f31117N.f16954a.setDistance(String.valueOf(((ShopDetails) response.body()).getShop().getDistance()));
            this.f31117N.f16954a.setRatings(null);
            this.f31117N.f16954a.setFormattedAddress(String.valueOf(((ShopDetails) response.body()).getShop().getVAddress()));
            this.f31117N.f16954a.setShopPic(String.valueOf(((ShopDetails) response.body()).getShop().getVShopPic()));
        }
    }
}
