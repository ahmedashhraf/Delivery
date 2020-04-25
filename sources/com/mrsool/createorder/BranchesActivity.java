package com.mrsool.createorder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds.Builder;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.mrsool.C10232R;
import com.mrsool.newBean.BranchBean;
import com.mrsool.newBean.GetBranchList;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11728i;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p438de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BranchesActivity extends C0295d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TextView f28746N;

    /* renamed from: O */
    private TextView f28747O;

    /* renamed from: P */
    private ImageView f28748P;

    /* renamed from: Q */
    private ImageView f28749Q;

    /* renamed from: R */
    private ImageView f28750R;

    /* renamed from: S */
    private LinearLayout f28751S;

    /* renamed from: T */
    private LinearLayout f28752T;

    /* renamed from: U */
    private FrameLayout f28753U;

    /* renamed from: V */
    private FrameLayout f28754V;

    /* renamed from: W */
    private FrameLayout f28755W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public RecyclerView f28756X;

    /* renamed from: Y */
    private EditText f28757Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ArrayList<BranchBean> f28758Z = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public AppSingleton f28759a;

    /* renamed from: a0 */
    private C10645o f28760a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5887x f28761b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public int f28762b0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f28763c0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public int f28764d0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public SupportMapFragment f28765e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public GoogleMap f28766f0;

    /* renamed from: g0 */
    private LinearLayout f28767g0;

    /* renamed from: h0 */
    private TextView f28768h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public TextView f28769i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public Bitmap f28770j0;

    /* renamed from: k0 */
    private boolean f28771k0 = false;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public boolean f28772l0 = true;

    /* renamed from: m0 */
    private Marker f28773m0;

    /* renamed from: n0 */
    private Marker f28774n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public LinearLayout f28775o0;

    /* renamed from: p0 */
    private boolean f28776p0 = false;

    /* renamed from: q0 */
    LatLng f28777q0 = null;

    /* renamed from: com.mrsool.createorder.BranchesActivity$a */
    class C10570a extends C11725f {
        C10570a() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            BranchesActivity.this.m48813i(i);
            if (!BranchesActivity.this.f28772l0) {
                BranchesActivity.this.m48807f(true);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$b */
    class C10571b implements TextWatcher {
        C10571b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence.toString().equals("")) {
                BranchesActivity.this.m48786K();
            } else if (charSequence.toString().length() == 1) {
                BranchesActivity.this.m48786K();
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$c */
    class C10572c implements OnFocusChangeListener {
        C10572c() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z && !BranchesActivity.this.f28772l0) {
                BranchesActivity.this.m48807f(false);
            }
            BranchesActivity.this.m48786K();
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$d */
    class C10573d implements OnEditorActionListener {
        C10573d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                BranchesActivity.this.m48785J();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$e */
    class C10574e implements OnMapReadyCallback {
        C10574e() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C0841b.m4916a((Context) BranchesActivity.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) BranchesActivity.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                BranchesActivity branchesActivity = BranchesActivity.this;
                branchesActivity.f28766f0 = branchesActivity.f28761b.mo23514a(googleMap, BranchesActivity.this.f28765e0, true, true);
                BranchesActivity.this.f28766f0.setMyLocationEnabled(true);
                BranchesActivity.this.f28766f0.getUiSettings().setMyLocationButtonEnabled(false);
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(BranchesActivity.this.f28761b.mo23648p());
                CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                BranchesActivity.this.f28766f0.moveCamera(newLatLng);
                BranchesActivity.this.f28766f0.animateCamera(zoomTo);
                BranchesActivity.this.m48803d(true);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$f */
    class C10575f implements OnMarkerClickListener {
        C10575f() {
        }

        public boolean onMarkerClick(Marker marker) {
            if (marker.getTag() != null) {
                BranchesActivity.this.m48813i(Integer.parseInt(marker.getTag().toString()));
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$g */
    class C10576g extends C2557j<Bitmap> {

        /* renamed from: O */
        final /* synthetic */ boolean f28784O;

        C10576g(boolean z) {
            this.f28784O = z;
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            try {
                if (!BranchesActivity.this.isFinishing()) {
                    BranchesActivity.this.f28770j0 = bitmap;
                    for (int i = 0; i < BranchesActivity.this.f28758Z.size(); i++) {
                        Marker addMarker = BranchesActivity.this.f28766f0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(BranchesActivity.this.mo37955a((Context) BranchesActivity.this, BranchesActivity.this.m48790a(bitmap, (BranchBean) BranchesActivity.this.f28758Z.get(i))))).position(new LatLng(((BranchBean) BranchesActivity.this.f28758Z.get(i)).getLatitude().doubleValue(), ((BranchBean) BranchesActivity.this.f28758Z.get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f));
                        addMarker.setTag(Integer.valueOf(i));
                        ((BranchBean) BranchesActivity.this.f28758Z.get(i)).setMarker(addMarker);
                    }
                    BranchesActivity.this.m48812h(this.f28784O);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$h */
    class C10577h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f28787a;

        /* renamed from: b */
        final /* synthetic */ Builder f28788b;

        C10577h(boolean z, Builder builder) {
            this.f28787a = z;
            this.f28788b = builder;
        }

        public void run() {
            try {
                if (this.f28787a) {
                    BranchesActivity.this.f28766f0.setPadding(BranchesActivity.this.f28764d0 / 2, BranchesActivity.this.f28763c0 / 2, BranchesActivity.this.f28764d0 / 2, 0);
                    BranchesActivity.this.f28766f0.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f28788b.build(), 100));
                    return;
                }
                BranchesActivity.this.f28766f0.animateCamera(CameraUpdateFactory.newLatLngZoom(BranchesActivity.this.f28777q0, 14.0f));
            } catch (Exception e) {
                BranchesActivity.this.f28766f0.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.BranchesActivity$i */
    class C10578i implements Callback<GetBranchList> {

        /* renamed from: a */
        final /* synthetic */ boolean f28789a;

        C10578i(boolean z) {
            this.f28789a = z;
        }

        public void onFailure(Call<GetBranchList> call, Throwable th) {
            if (BranchesActivity.this.f28761b != null) {
                BranchesActivity.this.f28761b.mo23492O();
                BranchesActivity.this.f28761b.mo23615f(BranchesActivity.this.getString(C10232R.string.msg_error_server_issue), BranchesActivity.this.getString(C10232R.string.app_name));
            }
        }

        public void onResponse(Call<GetBranchList> call, Response<GetBranchList> response) {
            if (BranchesActivity.this.f28761b != null) {
                BranchesActivity.this.f28761b.mo23492O();
                if (!response.isSuccessful() || ((GetBranchList) response.body()).getCode() > 300) {
                    BranchesActivity.this.f28761b.mo23615f(response.message(), BranchesActivity.this.getString(C10232R.string.app_name));
                } else if (this.f28789a) {
                    BranchesActivity.this.f28759a.f16955b.setBarColor(((GetBranchList) response.body()).getBarColor());
                    BranchesActivity.this.f28759a.f16955b.setAllowOrder(Boolean.valueOf(((GetBranchList) response.body()).isAllowOrder()));
                    BranchesActivity.this.f28759a.f16955b.setShop_order_alert_text(((GetBranchList) response.body()).getShopOrderAlertText());
                    ArrayList branchList = ((GetBranchList) response.body()).getBranchList();
                    int i = 0;
                    while (true) {
                        if (i >= branchList.size()) {
                            break;
                        } else if (((BranchBean) branchList.get(i)).getBranchId().equals(((BranchBean) BranchesActivity.this.f28758Z.get(BranchesActivity.this.f28762b0)).getBranchId())) {
                            BranchesActivity.this.f28762b0 = i;
                            break;
                        } else {
                            i++;
                        }
                    }
                    BranchesActivity.this.f28758Z.clear();
                    BranchesActivity.this.f28758Z.addAll(((GetBranchList) response.body()).getBranchList());
                    for (int i2 = 0; i2 < BranchesActivity.this.f28758Z.size(); i2++) {
                        ((BranchBean) BranchesActivity.this.f28758Z.get(i2)).setIsSelected(0);
                    }
                    ((BranchBean) BranchesActivity.this.f28758Z.get(BranchesActivity.this.f28762b0)).setIsSelected(1);
                    BranchesActivity.this.m48787L();
                    BranchesActivity.this.m48780D();
                } else if (((GetBranchList) response.body()).getBranchList().size() >= 1) {
                    BranchesActivity.this.f28758Z.clear();
                    BranchesActivity.this.f28758Z.addAll(((GetBranchList) response.body()).getBranchList());
                    BranchesActivity.this.m48787L();
                    ((BranchBean) BranchesActivity.this.f28758Z.get(BranchesActivity.this.f28762b0)).setIsSelected(1);
                    BranchesActivity.this.m48788M();
                    BranchesActivity.this.m48783H();
                } else {
                    if (((GetBranchList) response.body()).getMessage() == null || ((GetBranchList) response.body()).getMessage().equals("")) {
                        BranchesActivity.this.f28769i0.setText(BranchesActivity.this.getString(C10232R.string.lbl_no_brnach_found));
                    } else {
                        BranchesActivity.this.f28769i0.setText(((GetBranchList) response.body()).getMessage());
                    }
                    BranchesActivity.this.f28746N.setText(String.format(BranchesActivity.this.getString(C10232R.string.lbl_branches), new Object[]{AppEventsConstants.EVENT_PARAM_VALUE_NO}));
                    BranchesActivity.this.f28756X.setVisibility(8);
                    BranchesActivity.this.f28775o0.setVisibility(0);
                    BranchesActivity.this.m48805e(false);
                }
            }
        }
    }

    /* renamed from: C */
    private void m48779C() {
        Iterator it = this.f28759a.f16955b.getShop().getBranchList().iterator();
        while (it.hasNext()) {
            try {
                this.f28758Z.add(((BranchBean) it.next()).clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m48780D() {
        this.f28759a.f16955b.getShop().setBranchList(this.f28758Z);
        Intent intent = new Intent();
        intent.putExtra(C11644i.f33332j1, this.f28762b0);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: E */
    private void m48781E() {
        this.f28759a = (AppSingleton) getApplicationContext();
        m48779C();
        m48787L();
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(C11644i.f33431v1);
            if (stringExtra.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                this.f28771k0 = false;
            } else if (stringExtra.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                this.f28771k0 = true;
            }
        }
        MapsInitializer.initialize(getApplicationContext());
        C1382h supportFragmentManager = getSupportFragmentManager();
        this.f28765e0 = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f28765e0 == null) {
            this.f28765e0 = SupportMapFragment.newInstance();
            supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f28765e0).mo6100f();
        }
        this.f28767g0 = (LinearLayout) findViewById(C10232R.C10236id.llListMain);
        this.f28748P = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28746N = (TextView) findViewById(C10232R.C10236id.tvAllBranches);
        this.f28747O = (TextView) findViewById(C10232R.C10236id.tvTitle);
        this.f28754V = (FrameLayout) findViewById(C10232R.C10236id.flMain);
        this.f28749Q = (ImageView) findViewById(C10232R.C10236id.ivMapList);
        this.f28750R = (ImageView) findViewById(C10232R.C10236id.ivSearch);
        this.f28751S = (LinearLayout) findViewById(C10232R.C10236id.llList);
        this.f28752T = (LinearLayout) findViewById(C10232R.C10236id.llSearch);
        this.f28753U = (FrameLayout) findViewById(C10232R.C10236id.layMapContainer);
        this.f28756X = (RecyclerView) findViewById(C10232R.C10236id.rvBranches);
        this.f28757Y = (EditText) findViewById(C10232R.C10236id.etSearch);
        this.f28755W = (FrameLayout) findViewById(C10232R.C10236id.llMain);
        this.f28775o0 = (LinearLayout) findViewById(C10232R.C10236id.llNoBranch);
        this.f28768h0 = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f28769i0 = (TextView) findViewById(C10232R.C10236id.tvNoBrnach);
        this.f28768h0.setOnClickListener(this);
        this.f28748P.setOnClickListener(this);
        this.f28749Q.setOnClickListener(this);
        this.f28750R.setOnClickListener(this);
        this.f28747O = (TextView) findViewById(C10232R.C10236id.tvTitle);
        if (this.f28771k0) {
            this.f28747O.setText(this.f28759a.f16955b.getShop().getvTitle());
        } else {
            this.f28747O.setText(this.f28759a.f16955b.getShop().getVName());
        }
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(1);
        this.f28756X.setLayoutManager(wrapContentLinearLayoutManager);
        this.f28756X.setItemAnimator(this.f28761b.mo23672x());
        C10645o oVar = new C10645o(this, this.f28771k0 ? this.f28759a.f16955b.getShop().getvIcon() : this.f28759a.f16955b.getShop().getVShopPic(), this.f28771k0 ? this.f28759a.f16955b.getShop().getvTitle() : this.f28759a.f16955b.getShop().getVName(), this.f28758Z, new C10570a());
        this.f28760a0 = oVar;
        this.f28756X.setAdapter(this.f28760a0);
        this.f28757Y.addTextChangedListener(new C10571b());
        this.f28757Y.setOnFocusChangeListener(new C10572c());
        this.f28757Y.setOnEditorActionListener(new C10573d());
        findViewById(C10232R.C10236id.focus_thief).requestFocus();
        m48788M();
        this.f28776p0 = true;
        this.f28749Q.performClick();
    }

    /* renamed from: G */
    private void m48782G() {
        try {
            if (this.f28761b.mo23624h() && this.f28761b.mo23502X() && this.f28761b.mo23500V() && this.f28766f0 == null) {
                this.f28765e0.getMapAsync(new C10574e());
            }
            if (this.f28761b != null && this.f28761b.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                this.f28761b.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m48783H() {
        try {
            C11598a.m52263f().mo39814a(this.f28757Y.getText().toString(), this.f28758Z.size(), this.f28759a.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: I */
    private void m48784I() {
        try {
            C11598a.m52263f().mo39838d(this.f28759a.f16955b.getShop().getVShopId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m48785J() {
        String trim = this.f28757Y.getText().toString().trim();
        findViewById(C10232R.C10236id.focus_thief).requestFocus();
        this.f28761b.mo23494P();
        if (trim.equals("")) {
            this.f28761b.mo23615f(getResources().getString(C10232R.string.alt_enter_location), getResources().getString(C10232R.string.app_name));
        } else {
            mo37956c(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m48786K() {
        String str = "";
        if (this.f28772l0) {
            if (this.f28757Y.isFocused()) {
                this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_skyblue_5);
            } else if (this.f28757Y.getText().toString().trim().equals(str)) {
                this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_gray);
            } else {
                this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_white_5);
            }
        } else if (this.f28757Y.isFocused()) {
            this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_skyblue_5);
        } else if (this.f28757Y.getText().toString().trim().equals(str)) {
            this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_5);
        } else {
            this.f28752T.setBackgroundResource(C10232R.C10235drawable.bg_shadow_small_white_5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m48787L() {
        for (int i = 0; i < this.f28758Z.size(); i++) {
            if (((BranchBean) this.f28758Z.get(i)).getIsSelected() == 1) {
                this.f28762b0 = i;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m48788M() {
        TextView textView = this.f28746N;
        String string = getString(C10232R.string.lbl_branches);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f28758Z.size());
        textView.setText(String.format(string, new Object[]{sb.toString()}));
        this.f28760a0.mo7341e();
        GoogleMap googleMap = this.f28766f0;
        if (googleMap != null) {
            googleMap.clear();
            m48803d(false);
        }
        if (this.f28758Z.size() > 0) {
            this.f28756X.setVisibility(0);
            this.f28775o0.setVisibility(8);
            m48805e(true);
            return;
        }
        this.f28756X.setVisibility(8);
        this.f28775o0.setVisibility(0);
        m48805e(false);
    }

    public void onBackPressed() {
        if (this.f28772l0 || this.f28751S.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            m48807f(true);
        }
    }

    public void onClick(View view) {
        if (view == this.f28748P) {
            onBackPressed();
        } else if (view == this.f28768h0) {
            this.f28759a.f16955b.getShop().setManualBranchSelect(true);
            mo37956c(true);
        } else {
            String str = "";
            if (view == this.f28750R) {
                if (!this.f28757Y.getText().toString().trim().equals(str)) {
                    m48785J();
                }
            } else if (view == this.f28749Q) {
                if (this.f28772l0) {
                    this.f28761b.mo23494P();
                    this.f28757Y.setHint(getResources().getString(C10232R.string.lbl_search_your_location));
                    this.f28772l0 = false;
                    if (this.f28775o0.getVisibility() == 0) {
                        this.f28757Y.setText(str);
                        this.f28775o0.setVisibility(8);
                        this.f28756X.setVisibility(0);
                    }
                    this.f28768h0.setEnabled(true);
                    this.f28751S.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.transparent));
                    this.f28749Q.setImageResource(C10232R.C10235drawable.btn_list_round);
                    this.f28751S.setVisibility(8);
                    this.f28753U.setVisibility(0);
                    this.f28755W.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.transparent));
                    m48782G();
                    m48809g(true);
                    findViewById(C10232R.C10236id.focus_thief).requestFocus();
                    if (this.f28757Y.isFocused() && !this.f28772l0) {
                        m48807f(false);
                    }
                } else {
                    this.f28761b.mo23494P();
                    this.f28757Y.setHint(getResources().getString(C10232R.string.lbl_search_your_location_list));
                    if (this.f28775o0.getVisibility() == 0) {
                        this.f28757Y.setText(str);
                        this.f28775o0.setVisibility(8);
                        this.f28756X.setVisibility(0);
                    }
                    this.f28768h0.setEnabled(true);
                    findViewById(C10232R.C10236id.focus_thief).requestFocus();
                    this.f28772l0 = true;
                    this.f28768h0.setAlpha(1.0f);
                    this.f28751S.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
                    this.f28749Q.setImageResource(C10232R.C10235drawable.btn_map_round);
                    this.f28751S.setVisibility(0);
                    this.f28753U.setVisibility(8);
                    this.f28755W.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
                    m48809g(false);
                }
                if (this.f28776p0) {
                    this.f28776p0 = false;
                } else {
                    m48784I();
                }
                m48786K();
                m48784I();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_branches);
        this.f28761b = new C5887x(this);
        m48781E();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m48805e(boolean z) {
        this.f28768h0.setEnabled(z);
        if (!this.f28772l0) {
            return;
        }
        if (z) {
            this.f28768h0.setAlpha(1.0f);
            this.f28768h0.setBackgroundResource(C10232R.C10235drawable.bg_sky_blue_seletor);
            return;
        }
        this.f28768h0.setAlpha(0.5f);
        this.f28768h0.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.gray_3));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m48807f(boolean z) {
        if (z) {
            try {
                this.f28766f0.getUiSettings().setScrollGesturesEnabled(true);
                this.f28766f0.getUiSettings().setZoomGesturesEnabled(true);
                findViewById(C10232R.C10236id.focus_thief).requestFocus();
                this.f28761b.mo23494P();
                this.f28751S.setVisibility(8);
                this.f28755W.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.transparent));
                this.f28768h0.setAlpha(1.0f);
                this.f28768h0.setEnabled(true);
            } catch (Exception unused) {
            }
        } else {
            this.f28766f0.getUiSettings().setScrollGesturesEnabled(false);
            this.f28766f0.getUiSettings().setZoomGesturesEnabled(false);
            this.f28751S.setVisibility(0);
            this.f28755W.setBackgroundColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.white_alpha_1));
            this.f28768h0.setAlpha(0.05f);
            this.f28768h0.setEnabled(false);
        }
    }

    /* renamed from: g */
    private void m48809g(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.f28768h0.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) this.f28767g0.getLayoutParams();
        if (z) {
            layoutParams2.bottomMargin = 0;
            layoutParams.height = (int) getResources().getDimension(C10232R.dimen.dp_40);
            layoutParams.setMargins((int) getResources().getDimension(C10232R.dimen.dp_16), (int) getResources().getDimension(C10232R.dimen.dp_16), (int) getResources().getDimension(C10232R.dimen.dp_16), (int) getResources().getDimension(C10232R.dimen.dp_16));
            this.f28768h0.setBackgroundResource(C10232R.C10235drawable.bg_sky_blue_seletor_5);
        } else {
            layoutParams2.bottomMargin = (int) getResources().getDimension(C10232R.dimen.dp_56);
            layoutParams.height = (int) getResources().getDimension(C10232R.dimen.dp_56);
            layoutParams.setMargins(0, 0, 0, 0);
            this.f28768h0.setBackgroundResource(C10232R.C10235drawable.bg_sky_blue_seletor);
        }
        this.f28767g0.setLayoutParams(layoutParams2);
        this.f28768h0.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m48812h(boolean z) {
        Builder builder = new Builder();
        for (int i = 0; i < this.f28758Z.size(); i++) {
            if (((BranchBean) this.f28758Z.get(i)).getIsSelected() == 1 || z) {
                builder.include(((BranchBean) this.f28758Z.get(i)).getMarker().getPosition());
                if (!z) {
                    this.f28777q0 = new LatLng(((BranchBean) this.f28758Z.get(i)).getLatitude().doubleValue(), ((BranchBean) this.f28758Z.get(i)).getLongitude().doubleValue());
                }
            }
        }
        new Handler().postDelayed(new C10577h(z, builder), 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m48813i(int i) {
        int i2 = 0;
        while (i2 < this.f28758Z.size()) {
            try {
                ((BranchBean) this.f28758Z.get(i2)).setIsSelected(0);
                i2++;
            } catch (Exception unused) {
                return;
            }
        }
        ((BranchBean) this.f28758Z.get(i)).setIsSelected(1);
        if (this.f28766f0 != null) {
            if (((BranchBean) this.f28758Z.get(this.f28762b0)).getMarker() != null) {
                ((BranchBean) this.f28758Z.get(this.f28762b0)).getMarker().remove();
            }
            m48810h(this.f28762b0);
            if (((BranchBean) this.f28758Z.get(i)).getMarker() != null) {
                ((BranchBean) this.f28758Z.get(i)).getMarker().remove();
            }
            m48810h(i);
            m48812h(false);
        }
        this.f28760a0.mo7337d(this.f28762b0);
        this.f28760a0.mo7337d(i);
        this.f28762b0 = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m48803d(boolean z) {
        GoogleMap googleMap = this.f28766f0;
        if (googleMap != null && this.f28759a != null && this.f28761b != null) {
            googleMap.clear();
            this.f28766f0.setOnMarkerClickListener(new C10575f());
            Marker marker = this.f28773m0;
            if (marker != null) {
                marker.remove();
            }
            Marker marker2 = this.f28774n0;
            if (marker2 != null) {
                marker2.remove();
            }
            try {
                C2232l.m11649c(getApplicationContext()).mo9515a(this.f28771k0 ? this.f28759a.f16955b.getShop().getvIcon() : this.f28759a.f16955b.getShop().getVShopPic()).mo9441j().mo9458b(new C10576g(z));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo37956c(boolean z) {
        C5887x xVar = this.f28761b;
        if (xVar == null || !xVar.mo23502X()) {
            this.f28761b.mo23492O();
            return;
        }
        this.f28761b.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        HashMap hashMap = new HashMap();
        hashMap.put("current_user_id", this.f28761b.mo23476G());
        hashMap.put("auth_token", this.f28761b.mo23640m());
        hashMap.put("vShopId", this.f28759a.f16955b.getShop().getVShopId());
        BranchBean branchBean = (BranchBean) this.f28758Z.get(this.f28762b0);
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(branchBean.getLatitude());
        hashMap.put("latitude", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(branchBean.getLongitude());
        hashMap.put("longitude", sb2.toString());
        hashMap.put(C11687c.f33717Q2, this.f28759a.f16955b.getShop().isbIsPickupFixed() == 1 ? "pickup" : "dropoff");
        if (!z) {
            str = this.f28757Y.getText().toString();
        }
        hashMap.put("search_term", str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("param: ");
        sb3.append(hashMap);
        C5880q.m25751b(sb3.toString());
        C11687c.m52645a(this.f28761b).getBranchList(hashMap).enqueue(new C10578i(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m48790a(Bitmap bitmap, BranchBean branchBean) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_branch_new, null);
        CircleImageView circleImageView = (CircleImageView) inflate.findViewById(C10232R.C10236id.ivPin);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvDistance);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
        circleImageView.setImageBitmap(bitmap);
        circleImageView.getLayoutParams().height = (int) getResources().getDimension(C10232R.dimen.dp_35);
        circleImageView.getLayoutParams().width = (int) getResources().getDimension(C10232R.dimen.dp_35);
        if (branchBean.getIsSelected() == 0) {
            textView.setVisibility(8);
            linearLayout.setVisibility(8);
            circleImageView.setAlpha(0.6f);
        } else {
            textView.setPadding(0, 0, 0, 0);
            String str = TextUtils.isEmpty(branchBean.getTitle()) ? this.f28771k0 ? this.f28759a.f16955b.getShop().getvTitle() : this.f28759a.f16955b.getShop().getVName() : branchBean.getTitle();
            textView2.setText(str);
            String string = getString(C10232R.string.lbl_distance_value);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(branchBean.getDistance());
            textView.setText(String.format(string, new Object[]{sb.toString()}));
            textView.setVisibility(0);
            circleImageView.setBorderWidth((int) getResources().getDimension(C10232R.dimen.dp_1_5));
            circleImageView.setBorderColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
            linearLayout.setBackgroundResource(C10232R.C10235drawable.marker_bg_new_small_sky_blue);
        }
        return inflate;
    }

    /* renamed from: h */
    private void m48810h(int i) {
        Marker addMarker = this.f28766f0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo37955a((Context) this, m48790a(this.f28770j0, (BranchBean) this.f28758Z.get(i))))).position(new LatLng(((BranchBean) this.f28758Z.get(i)).getLatitude().doubleValue(), ((BranchBean) this.f28758Z.get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f));
        addMarker.setTag(Integer.valueOf(i));
        ((BranchBean) this.f28758Z.get(i)).setMarker(addMarker);
    }

    /* renamed from: a */
    public Bitmap mo37955a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (this.f28763c0 < createBitmap.getHeight()) {
            this.f28763c0 = createBitmap.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("maxMarkerHeight : ");
            sb.append(this.f28763c0);
            sb.toString();
        }
        if (this.f28764d0 < createBitmap.getWidth()) {
            this.f28764d0 = createBitmap.getWidth();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("maxMarkerWidth : ");
            sb2.append(this.f28764d0);
            sb2.toString();
        }
        return createBitmap;
    }
}
