package com.mrsool.createorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.appcompat.app.C0295d;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1405m;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.facebook.appevents.AppEventsConstants;
import com.mrsool.C10232R;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.bean.PostOrder;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.customeview.NonSwipeableViewPager;
import com.mrsool.newBean.UploadImageBean;
import com.mrsool.order.C11056p;
import com.mrsool.payment.C11095j;
import com.mrsool.payment.C11095j.C11112n;
import com.mrsool.shop.C11229b;
import com.mrsool.shop.C11229b.C11230a;
import com.mrsool.shop.C11229b.C11231b;
import com.mrsool.shop.C11232c;
import com.mrsool.shop.C11232c.C11234b;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import com.viewpagerindicator.CirclePageIndicator;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p212io.branch.referral.C6009d;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c;

public class CreateOrderActivity extends C0295d implements OnClickListener, C11056p {

    /* renamed from: N */
    private C11232c f28791N;

    /* renamed from: O */
    private Activity f28792O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C11617f f28793P;

    /* renamed from: Q */
    private String f28794Q = "";
    /* access modifiers changed from: private */

    /* renamed from: R */
    public PostOrder f28795R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public boolean f28796S = false;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public boolean f28797T = false;

    /* renamed from: U */
    public NonSwipeableViewPager f28798U;

    /* renamed from: V */
    private C10584f f28799V;

    /* renamed from: W */
    private CirclePageIndicator f28800W;

    /* renamed from: X */
    private TextView f28801X;

    /* renamed from: Y */
    private ImageView f28802Y;

    /* renamed from: Z */
    private ImageView f28803Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AppSingleton f28804a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public C10677s f28805a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5887x f28806b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C10657r f28807b0;

    /* renamed from: c0 */
    public CheckDiscountBean f28808c0;

    /* renamed from: d0 */
    private final String f28809d0 = "placeNewOrder";

    /* renamed from: e0 */
    private final String f28810e0 = "checkDiscountOptions";

    /* renamed from: f0 */
    public boolean f28811f0 = true;

    /* renamed from: g0 */
    private C11614c f28812g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public C11095j f28813h0;

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$a */
    class C10579a implements C2019j {
        C10579a() {
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            CreateOrderActivity.this.f28806b.mo23494P();
            CreateOrderActivity.this.mo37969H();
        }
    }

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$b */
    class C10580b implements Callback<CheckDiscountBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f28815a;

        /* renamed from: b */
        final /* synthetic */ boolean f28816b;

        /* renamed from: c */
        final /* synthetic */ boolean f28817c;

        /* renamed from: d */
        final /* synthetic */ String f28818d;

        /* renamed from: e */
        final /* synthetic */ int f28819e;

        C10580b(boolean z, boolean z2, boolean z3, String str, int i) {
            this.f28815a = z;
            this.f28816b = z2;
            this.f28817c = z3;
            this.f28818d = str;
            this.f28819e = i;
        }

        public void onFailure(Call<CheckDiscountBean> call, Throwable th) {
            if (CreateOrderActivity.this.f28806b != null) {
                CreateOrderActivity.this.mo37965C();
                CreateOrderActivity createOrderActivity = CreateOrderActivity.this;
                createOrderActivity.mo37972e(createOrderActivity.getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<CheckDiscountBean> call, Response<CheckDiscountBean> response) {
            if (CreateOrderActivity.this.f28806b != null) {
                try {
                    if (!response.isSuccessful()) {
                        CreateOrderActivity.this.mo37965C();
                        CreateOrderActivity.this.mo37972e(response.message());
                    } else if (((CheckDiscountBean) response.body()).getCode().intValue() > 300) {
                        CreateOrderActivity.this.mo37965C();
                        CreateOrderActivity.this.mo37972e(((CheckDiscountBean) response.body()).getMessage());
                    } else if (this.f28815a) {
                        if (this.f28816b && !this.f28817c) {
                            CreateOrderActivity.this.mo37965C();
                        }
                        CreateOrderActivity.this.f28807b0.mo38049a(response);
                    } else if (!this.f28818d.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                        CreateOrderActivity.this.f28805a0.mo38080a(response, this.f28818d, this.f28819e);
                    } else {
                        if (this.f28816b && !this.f28817c) {
                            CreateOrderActivity.this.mo37965C();
                        }
                        CreateOrderActivity.this.f28808c0 = (CheckDiscountBean) response.body();
                        CreateOrderActivity.this.f28805a0.mo38079a(response);
                        CreateOrderActivity.this.f28807b0.mo38049a(response);
                    }
                } catch (Exception unused) {
                    CreateOrderActivity.this.mo37965C();
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$c */
    class C10581c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28821a;

        C10581c(Dialog dialog) {
            this.f28821a = dialog;
        }

        public void onClick(View view) {
            this.f28821a.dismiss();
            CreateOrderActivity.this.finish();
        }
    }

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$d */
    class C10582d implements C11234b {
        C10582d() {
        }

        /* renamed from: a */
        public void mo37975a() {
            CreateOrderActivity.this.f28798U.setCurrentItem(1, true);
            CreateOrderActivity.this.f28805a0.mo38074A();
        }

        /* renamed from: b */
        public void mo37976b() {
            new C11229b(CreateOrderActivity.this, new C11230a(CreateOrderActivity.this.f28804a.f16955b.getAddCardPopupTitle(), CreateOrderActivity.this.f28804a.f16955b.getAddCardPopupDescription(), CreateOrderActivity.this.f28804a.f16955b.getAddCardPopupButtonLabel())).mo39068a((C11231b) new C10629b(this));
        }

        /* renamed from: c */
        public /* synthetic */ void mo37977c() {
            CreateOrderActivity.this.f28798U.setCurrentItem(1, true);
            CreateOrderActivity.this.f28805a0.mo38074A();
        }

        /* renamed from: d */
        public /* synthetic */ void mo37978d() {
            CreateOrderActivity createOrderActivity = CreateOrderActivity.this;
            createOrderActivity.f28813h0 = new C11095j(createOrderActivity, null);
            CreateOrderActivity.this.f28813h0.mo38896j();
            CreateOrderActivity.this.f28813h0.mo38884a((C11112n) new C10628a(this));
        }
    }

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$e */
    class C10583e implements Callback<PostOrder> {
        C10583e() {
        }

        public void onFailure(Call<PostOrder> call, Throwable th) {
            try {
                if (CreateOrderActivity.this.f28806b != null) {
                    CreateOrderActivity.this.f28806b.mo23492O();
                }
                CreateOrderActivity.this.f28806b.mo23615f(CreateOrderActivity.this.getString(C10232R.string.msg_error_server_issue), CreateOrderActivity.this.getString(C10232R.string.app_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<PostOrder> call, Response<PostOrder> response) {
            try {
                if (CreateOrderActivity.this.f28806b != null) {
                    CreateOrderActivity.this.f28806b.mo23492O();
                    if (response.isSuccessful()) {
                        if (((PostOrder) response.body()).getCode().intValue() >= 300) {
                            CreateOrderActivity.this.f28806b.mo23615f(((PostOrder) response.body()).getMessage(), CreateOrderActivity.this.getString(C10232R.string.app_name));
                            return;
                        }
                        CreateOrderActivity.this.f28795R = (PostOrder) response.body();
                        C11644i.f33136L6 = false;
                        CreateOrderActivity createOrderActivity = CreateOrderActivity.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(CreateOrderActivity.this.f28807b0.mo38050c(false));
                        sb.append(CreateOrderActivity.this.f28807b0.f29131b.getText().toString());
                        createOrderActivity.m48842a(sb.toString(), CreateOrderActivity.this.f28795R.getiOrderId());
                        CreateOrderActivity.this.m48832K();
                        CreateOrderActivity.this.m48833L();
                        CreateOrderActivity.this.f28796S = true;
                        try {
                            C6009d.m27516c(CreateOrderActivity.this.getApplicationContext()).mo24810e(CreateOrderActivity.this.getResources().getString(C10232R.string.branch_event_submit_order));
                            if (C11644i.f33437w) {
                                CreateOrderActivity.this.f28793P.mo39870c(CreateOrderActivity.this.f28797T ? CreateOrderActivity.this.f28804a.f16955b.getShop().getvTitle() : CreateOrderActivity.this.f28804a.f16955b.getShop().getVName(), CreateOrderActivity.this.f28793P.mo39860a(), String.valueOf(CreateOrderActivity.this.f28804a.f16955b.getShop().getDistance_courier_shop()));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String a = CreateOrderActivity.this.f28806b.mo23528a(response.body());
                        String str = "placeNewOrder";
                        if (!TextUtils.isEmpty(a)) {
                            CreateOrderActivity.this.f28806b.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            CreateOrderActivity.this.mo36511f(str);
                        }
                    } else if (CreateOrderActivity.this.f28806b != null) {
                        CreateOrderActivity.this.f28806b.mo23615f(response.message(), CreateOrderActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.CreateOrderActivity$f */
    class C10584f extends C1405m {

        /* renamed from: o */
        private final List<Fragment> f28825o = new ArrayList();

        /* renamed from: p */
        private String[] f28826p = {CreateOrderActivity.this.getString(C10232R.string.lbl_tab_pending_orders), CreateOrderActivity.this.getString(C10232R.string.tab_title_service_info)};

        public C10584f(C1382h hVar) {
            super(hVar, 1);
        }

        /* renamed from: a */
        public int mo8886a() {
            return this.f28825o.size();
        }

        /* renamed from: a */
        public CharSequence mo8888a(int i) {
            return "";
        }

        /* renamed from: c */
        public Fragment mo6390c(int i) {
            return (Fragment) this.f28825o.get(i);
        }

        /* renamed from: d */
        public View mo37980d(int i) {
            View inflate = CreateOrderActivity.this.getLayoutInflater().inflate(C10232R.layout.row_shop_layout_badge_count, null);
            ((TextView) inflate.findViewById(C10232R.C10236id.txtTabTitle)).setText(this.f28826p[i]);
            return inflate;
        }

        /* renamed from: a */
        public void mo37979a(Fragment fragment) {
            this.f28825o.add(fragment);
        }
    }

    /* renamed from: I */
    private void m48830I() {
        String str = "";
        if (this.f28806b == null) {
            this.f28806b = new C5887x(this);
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        String str2 = "iBuyerId";
        try {
            C5887x xVar = this.f28806b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f28806b.mo23468C().mo23459f("user_id"));
            hashMap.put(str2, xVar.mo23622h(String.valueOf(sb.toString())));
            C5887x xVar2 = this.f28806b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f28804a.f16954a.getShopId());
            hashMap.put("vShopId", xVar2.mo23622h(String.valueOf(sb2.toString())));
            String str3 = C11687c.f33675G0;
            C5887x xVar3 = this.f28806b;
            StringBuilder sb3 = new StringBuilder();
            int i = 0;
            sb3.append(this.f28807b0.mo38050c(false));
            sb3.append(this.f28807b0.f29131b.getText().toString());
            hashMap.put(str3, xVar3.mo23622h(String.valueOf(sb3.toString())));
            C5887x xVar4 = this.f28806b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f28805a0.f29202R);
            hashMap.put("latitude", xVar4.mo23622h(String.valueOf(sb4.toString())));
            C5887x xVar5 = this.f28806b;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(this.f28805a0.f29204S);
            hashMap.put("longitude", xVar5.mo23622h(String.valueOf(sb5.toString())));
            hashMap.put("language", this.f28806b.mo23622h(C11644i.f33183R5));
            C5887x xVar6 = this.f28806b;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(this.f28805a0.f29206T);
            hashMap.put("vAddress", xVar6.mo23622h(String.valueOf(sb6.toString())));
            String str4 = C11687c.f33683I0;
            C5887x xVar7 = this.f28806b;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(this.f28805a0.f29194N);
            hashMap.put(str4, xVar7.mo23622h(String.valueOf(sb7.toString())));
            String str5 = C11687c.f33711P0;
            C5887x xVar8 = this.f28806b;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append(this.f28807b0.f29118P);
            hashMap.put(str5, xVar8.mo23622h(String.valueOf(sb8.toString())));
            hashMap.put("buyer_payment_option_id", this.f28806b.mo23622h(String.valueOf(this.f28807b0.f29116N == -1 ? str : Integer.valueOf(this.f28807b0.f29116N))));
            boolean z = this.f28797T;
            String str6 = C11687c.f33679H0;
            String str7 = C11687c.f33657B2;
            if (z) {
                String str8 = C11687c.f33727T0;
                C5887x xVar9 = this.f28806b;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(this.f28804a.f16955b.getShop().isManualBranchSelect());
                hashMap.put(str8, xVar9.mo23622h(String.valueOf(sb9.toString())));
                String str9 = C11687c.f33787g2;
                C5887x xVar10 = this.f28806b;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(this.f28805a0.f29200Q);
                hashMap.put(str9, xVar10.mo23622h(String.valueOf(sb10.toString())));
                String str10 = C11687c.f33792h2;
                C5887x xVar11 = this.f28806b;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(this.f28805a0.f29196O);
                hashMap.put(str10, xVar11.mo23622h(String.valueOf(sb11.toString())));
                String str11 = C11687c.f33796i2;
                C5887x xVar12 = this.f28806b;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(this.f28805a0.f29198P);
                hashMap.put(str11, xVar12.mo23622h(String.valueOf(sb12.toString())));
                C5887x xVar13 = this.f28806b;
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(this.f28805a0.f29206T);
                hashMap.put(str6, xVar13.mo23622h(sb13.toString()));
                String str12 = C11687c.f33653A2;
                C5887x xVar14 = this.f28806b;
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(this.f28805a0.f29212W);
                hashMap.put(str12, xVar14.mo23622h(sb14.toString()));
                C5887x xVar15 = this.f28806b;
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(this.f28805a0.f29214X);
                hashMap.put(str7, xVar15.mo23622h(sb15.toString()));
            } else {
                C5887x xVar16 = this.f28806b;
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(this.f28805a0.f29210V);
                hashMap.put(str7, xVar16.mo23622h(sb16.toString()));
                C5887x xVar17 = this.f28806b;
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(this.f28805a0.f29208U);
                hashMap.put(str6, xVar17.mo23622h(sb17.toString()));
            }
            while (i < this.f28807b0.f29136f0.size()) {
                C13817d0 create = C13817d0.create(C13872x.m59361b("image/jpeg"), ((UploadImageBean) this.f28807b0.f29136f0.get(i)).getImageFile());
                StringBuilder sb18 = new StringBuilder();
                sb18.append("images[");
                int i2 = i + 1;
                sb18.append(i2);
                sb18.append("]");
                arrayList.add(C13875b.m59383a(sb18.toString(), new File(((UploadImageBean) this.f28807b0.f29136f0.get(i)).getImagePath()).getName(), create));
                i = i2;
            }
        } catch (Exception unused) {
        }
        StringBuilder sb19 = new StringBuilder();
        sb19.append("ordernow : ");
        sb19.append(hashMap);
        C5880q.m25751b(sb19.toString());
        Call placeNewOrderNew = C11687c.m52645a(this.f28806b).placeNewOrderNew(hashMap, arrayList);
        this.f28806b.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        placeNewOrderNew.enqueue(new C10583e());
    }

    /* renamed from: J */
    private void m48831J() {
        this.f28804a = (AppSingleton) getApplicationContext();
        this.f28812g0 = new C11614c(this);
        this.f28792O = (Activity) ShopDetailActivity.f31116l0;
        this.f28793P = new C11617f(this);
        this.f28794Q = this.f28793P.mo39860a();
        try {
            if (C11644i.f33437w) {
                this.f28793P.mo39867b(this.f28804a.f16955b.getShop().getVName(), this.f28794Q, String.valueOf(this.f28804a.f16955b.getShop().getDistance_courier_shop()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(C11644i.f33431v1);
            if (stringExtra.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                this.f28797T = false;
                this.f28792O = (Activity) ShopDetailActivity.f31116l0;
                m48845c(false);
            } else if (stringExtra.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                this.f28797T = true;
                this.f28792O = (Activity) ShopDetailPackageActivity.f31149m0;
                m48845c(true);
            }
        }
        this.f28802Y = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28802Y.setImageResource(C10232R.C10235drawable.icon_close);
        this.f28802Y.setOnClickListener(this);
        this.f28803Z = (ImageView) findViewById(C10232R.C10236id.ivBack);
        this.f28803Z.setOnClickListener(this);
        this.f28801X = (TextView) findViewById(C10232R.C10236id.tvTitle);
        AppSingleton appSingleton = this.f28804a;
        if (appSingleton != null) {
            ShopDetails shopDetails = appSingleton.f16955b;
            if (!(shopDetails == null || shopDetails.getShop() == null)) {
                if (this.f28797T) {
                    this.f28801X.setText(this.f28804a.f16955b.getShop().getvTitle());
                } else {
                    this.f28801X.setText(this.f28804a.f16955b.getShop().getVName());
                }
                this.f28798U = (NonSwipeableViewPager) findViewById(C10232R.C10236id.vpShopDetail);
                this.f28800W = (CirclePageIndicator) findViewById(C10232R.C10236id.pagerIndicator);
                this.f28799V = new C10584f(getSupportFragmentManager());
                this.f28805a0 = new C10677s();
                this.f28807b0 = new C10657r();
                this.f28799V.mo37979a((Fragment) this.f28807b0);
                this.f28799V.mo37979a((Fragment) this.f28805a0);
                this.f28798U.setAdapter(this.f28799V);
                this.f28800W.setViewPager(this.f28798U);
                this.f28798U.addOnPageChangeListener(new C10579a());
                m48835N();
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m48832K() {
        String str;
        C11598a f = C11598a.m52263f();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(this.f28807b0.mo38050c(false));
        sb.append(this.f28807b0.f29131b.getText().toString());
        String sb2 = sb.toString();
        boolean z2 = this.f28807b0.f29136f0.size() > 0;
        if (this.f28807b0.f29144n0 != -1) {
            z = true;
        }
        String d = C11601c.Cash.mo39844d();
        String d2 = this.f28807b0.f29115F0.mo39843d();
        boolean isHasDiscount = this.f28804a.f16955b.getShop().isHasDiscount();
        double m = this.f28806b.mo23639m(this.f28804a.f16955b.getShop().getDiscountShortLabel());
        C10677s sVar = this.f28805a0;
        if (sVar.f29242k0) {
            str = sVar.f29200Q;
        } else {
            str = this.f28804a.f16955b.getShop().getVAddress();
        }
        C10677s sVar2 = this.f28805a0;
        f.mo39824a(sb2, z2, z, d, d2, isHasDiscount, m, str, sVar2.f29206T, sVar2.f29194N, 0, 0.0d, this.f28804a.f16955b.getShop().getVShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m48833L() {
        String str;
        String str2;
        String str3 = "";
        if (this.f28805a0.f29253p1.equals(str3)) {
            str = this.f28805a0.f29191K0.getText().toString().trim();
        } else {
            str = this.f28805a0.f29253p1;
        }
        if (this.f28805a0.f29255q1.equals(str3)) {
            str2 = this.f28805a0.f29192L0.getText().toString().trim();
        } else {
            str2 = this.f28805a0.f29255q1;
        }
        if (this.f28805a0.f29257r1.equals(str3)) {
            C10677s sVar = this.f28805a0;
            sVar.f29257r1 = sVar.f29216Y.getText().toString().trim();
        }
        C11598a f = C11598a.m52263f();
        boolean z = !str.equals(this.f28805a0.f29191K0.getText().toString().trim());
        C10677s sVar2 = this.f28805a0;
        boolean z2 = sVar2.f29259s1;
        boolean z3 = !str2.equals(sVar2.f29192L0.getText().toString().trim());
        C10677s sVar3 = this.f28805a0;
        f.mo39827a(z, z2, z3, sVar3.f29261t1, !sVar3.f29257r1.equals(sVar3.f29216Y.getText().toString().trim()), this.f28805a0.f29216Y.getText().toString().trim(), this.f28804a.f16955b.getShop().getVShopId());
    }

    /* renamed from: M */
    private void m48834M() {
        if (this.f28804a.f16955b.getShop().getbIsPickupAvailable().intValue() == 0) {
            C10677s sVar = this.f28805a0;
            String str = "";
            sVar.f29200Q = str;
            sVar.f29196O = str;
            sVar.f29198P = str;
        }
    }

    /* renamed from: N */
    private void m48835N() {
        if (this.f28806b.mo23496R()) {
            this.f28806b.mo23545a(this.f28803Z);
            this.f28806b.mo23608d(findViewById(C10232R.C10236id.main_content));
        }
    }

    /* renamed from: O */
    private void m48836O() {
        if (this.f28797T) {
            m48834M();
        }
        if (this.f28797T && this.f28804a.f16955b.getShop().getbIsPickupAvailable().intValue() != 0) {
            String str = this.f28805a0.f29200Q;
            if (str == null || str.length() == 0) {
                this.f28806b.mo23615f(getString(C10232R.string.lbl_hint_pickup_address), getString(C10232R.string.app_name));
                return;
            }
        }
        if (this.f28797T) {
            String str2 = this.f28805a0.f29206T;
            if (str2 == null || str2.length() == 0) {
                this.f28806b.mo23615f(getString(C10232R.string.lbl_hint_dropoff_address), getString(C10232R.string.app_name));
                return;
            }
        }
        if (!this.f28797T) {
            String str3 = this.f28805a0.f29206T;
            if (str3 == null || str3.length() == 0) {
                this.f28806b.mo23615f(getString(C10232R.string.msg_error_invalid_order_address), getString(C10232R.string.app_name));
                return;
            }
        }
        String str4 = this.f28805a0.f29194N;
        if (str4 == null || str4.length() == 0) {
            this.f28806b.mo23615f(getString(C10232R.string.msg_error_invalid_order_time), getString(C10232R.string.app_name));
            return;
        }
        String str5 = "";
        if (!this.f28807b0.mo38050c(false).equals(str5) || !this.f28807b0.f29131b.getText().toString().equals(str5)) {
            m48830I();
        } else if (!this.f28797T || !this.f28804a.f16955b.getShop().isShowItemList()) {
            this.f28806b.mo23615f(getString(C10232R.string.msg_error_invalid_item), getString(C10232R.string.app_name));
        } else {
            this.f28806b.mo23615f(getString(C10232R.string.msg_error_invalid_order_desc), getString(C10232R.string.app_name));
        }
    }

    /* renamed from: P */
    private void m48837P() {
        if (this.f28804a.f16955b.getShouldCheckIfHasValidCard()) {
            this.f28791N.mo39069a(this, new C10582d());
            return;
        }
        this.f28798U.setCurrentItem(1, true);
        this.f28805a0.mo38074A();
    }

    /* renamed from: C */
    public void mo37965C() {
        C5887x xVar = this.f28806b;
        if (xVar != null) {
            xVar.mo23492O();
        }
    }

    /* renamed from: D */
    public void mo37966D() {
        this.f28806b.mo23494P();
        if (this.f28798U.getCurrentItem() == 0) {
            m48837P();
        } else if (this.f28806b.mo23497S() && this.f28806b.mo23502X() && this.f28806b.mo23500V()) {
            m48836O();
        }
    }

    /* renamed from: E */
    public void mo37967E() {
        C5887x xVar = this.f28806b;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
    }

    /* renamed from: G */
    public void mo37968G() {
        this.f28811f0 = false;
        ShopDetails shopDetails = this.f28804a.f16955b;
        if (shopDetails != null && !shopDetails.getShop().isServiceShopOpen()) {
            this.f28806b.mo23487L(this.f28804a.f16955b.getShop().getShopNotOpenWarning());
        }
    }

    /* renamed from: H */
    public void mo37969H() {
        try {
            if (this.f28798U.getCurrentItem() == 0) {
                this.f28806b.mo23494P();
                this.f28803Z.setVisibility(8);
                this.f28802Y.setVisibility(0);
                return;
            }
            this.f28803Z.setVisibility(0);
            this.f28802Y.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    public void onBackPressed() {
        NonSwipeableViewPager nonSwipeableViewPager = this.f28798U;
        if (nonSwipeableViewPager == null || nonSwipeableViewPager.getCurrentItem() != 1) {
            super.onBackPressed();
            return;
        }
        C15792c cVar = this.f28805a0.f29189I0;
        if (cVar == null || !cVar.mo52000b()) {
            C15792c cVar2 = this.f28805a0.f29188H0;
            if (cVar2 != null && cVar2.mo52000b()) {
                this.f28805a0.f29188H0.mo51999a();
            }
        } else {
            this.f28805a0.f29189I0.mo51999a();
        }
        this.f28798U.setCurrentItem(0, true);
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            finish();
        } else if (view.getId() == C10232R.C10236id.ivBack) {
            this.f28798U.setCurrentItem(0, true);
        } else {
            view.getId();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_create_order);
        this.f28806b = new C5887x(this);
        this.f28791N = new C11232c(this.f28806b);
        m48831J();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (!this.f28796S) {
            try {
                if (C11644i.f33437w) {
                    this.f28793P.mo39863a(this.f28804a.f16955b.getShop().getVName(), this.f28794Q, String.valueOf(this.f28804a.f16955b.getShop().getDistance()), this.f28793P.mo39860a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f28807b0.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: c */
    private void m48845c(boolean z) {
        ShopDetails shopDetails = this.f28804a.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            finish();
        }
    }

    /* renamed from: e */
    public void mo37972e(String str) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setText(str);
            textView.setOnClickListener(new C10581c(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36511f(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -574844939(0xffffffffddbc8ff5, float:-1.6984185E18)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1331902389(0x4f6337b5, float:3.81207885E9)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "placeNewOrder"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "checkDiscountOptions"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x0039
            if (r4 == r2) goto L_0x002a
            goto L_0x0039
        L_0x002a:
            com.mrsool.bean.PostOrder r4 = r3.f28795R
            java.lang.String r4 = r4.getMessage()
            com.mrsool.bean.PostOrder r0 = r3.f28795R
            java.lang.Boolean r0 = r0.getShowFailPopup()
            r3.mo37970a(r4, r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.createorder.CreateOrderActivity.mo36511f(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo37971a(boolean z, boolean z2, String str, int i, boolean z3, boolean z4) {
        C5887x xVar = this.f28806b;
        if (xVar != null && xVar.mo23502X()) {
            if (z && !z4) {
                mo37967E();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f28806b.mo23476G());
            hashMap.put("auth_token", this.f28806b.mo23640m());
            hashMap.put(C11687c.f33862z0, this.f28804a.f16955b.getShop().getVShopId());
            hashMap.put(C11687c.f33719R0, this.f28797T ? "2" : "1");
            StringBuilder sb = new StringBuilder();
            sb.append("param: ");
            sb.append(hashMap);
            C5880q.m25751b(sb.toString());
            Call checkDiscountOptions = C11687c.m52645a(this.f28806b).checkDiscountOptions(this.f28806b.mo23476G(), hashMap);
            C10580b bVar = new C10580b(z3, z2, z4, str, i);
            checkDiscountOptions.enqueue(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48842a(String str, String str2) {
        try {
            this.f28812g0.mo39847a(this.f28804a.f16955b.getShop().getVShopId());
            this.f28812g0.mo39850a(this.f28804a.f16955b.getShop().getVShopId(), this.f28804a.f16955b.getShop().getVName(), str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo37970a(String str, Boolean bool) {
        Activity activity = this.f28792O;
        if (activity != null) {
            activity.finish();
        }
        startActivity(new Intent(this, OrderSentActivity.class));
        finish();
    }
}
