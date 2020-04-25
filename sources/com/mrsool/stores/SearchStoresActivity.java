package com.mrsool.stores;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.api.C2876e;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.Shop;
import com.mrsool.bean.ShopBean;
import com.mrsool.createorder.OrderSentActivity;
import com.mrsool.order.C11071t;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11730j;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchStoresActivity extends C10787d implements OnClickListener, C11071t {

    /* renamed from: k1 */
    public static Context f32500k1;

    /* renamed from: A0 */
    private Animation f32501A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public Animation f32502B0;

    /* renamed from: C0 */
    private Animation f32503C0;

    /* renamed from: D0 */
    private Animation f32504D0;

    /* renamed from: E0 */
    private Animation f32505E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public boolean f32506F0 = false;

    /* renamed from: G0 */
    private ImageView f32507G0;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public ImageView f32508H0;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public ImageView f32509I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public ImageView f32510J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public boolean f32511K0 = true;

    /* renamed from: L0 */
    int f32512L0 = 0;

    /* renamed from: M0 */
    private int f32513M0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public String f32514N0;

    /* renamed from: O0 */
    private TextView f32515O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public TextView f32516P0;

    /* renamed from: Q0 */
    private TextView f32517Q0;

    /* renamed from: R0 */
    private TextView f32518R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public EditText f32519S;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public LinearLayout f32520S0;

    /* renamed from: T */
    private EditText f32521T;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public LinearLayout f32522T0;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public AutoCompleteTextView f32523U;

    /* renamed from: U0 */
    private LinearLayout f32524U0;

    /* renamed from: V */
    public ArrayList<FourSquareMainBean> f32525V = new ArrayList<>();

    /* renamed from: V0 */
    private LinearLayout f32526V0;

    /* renamed from: W */
    public ArrayList<FourSquareMainBean> f32527W = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public LinearLayout f32528W0;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public List<String> f32529X;

    /* renamed from: X0 */
    private LinearLayout f32530X0;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public RecyclerView f32531Y;

    /* renamed from: Y0 */
    private LinearLayout f32532Y0;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public RecyclerView f32533Z;

    /* renamed from: Z0 */
    private C11535e f32534Z0;

    /* renamed from: a0 */
    private RecyclerView f32535a0;

    /* renamed from: a1 */
    private boolean f32536a1;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C11537f f32537b0;

    /* renamed from: b1 */
    private NestedScrollView f32538b1;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public C11537f f32539c0;
    /* access modifiers changed from: private */

    /* renamed from: c1 */
    public FrameLayout f32540c1;

    /* renamed from: d0 */
    private C11532d f32541d0;

    /* renamed from: d1 */
    private FrameLayout f32542d1;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public String f32543e0 = null;

    /* renamed from: e1 */
    private FrameLayout f32544e1;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public SimpleAdapter f32545f0;

    /* renamed from: f1 */
    private String f32546f1;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public ImageView f32547g0;

    /* renamed from: g1 */
    private C11614c f32548g1;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public ImageView f32549h0;
    /* access modifiers changed from: private */

    /* renamed from: h1 */
    public View f32550h1;

    /* renamed from: i0 */
    private ImageView f32551i0;
    /* access modifiers changed from: private */

    /* renamed from: i1 */
    public int f32552i1;

    /* renamed from: j0 */
    private ImageView f32553j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public String f32554j1;

    /* renamed from: k0 */
    private ImageView f32555k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ImageView f32556l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ImageView f32557m0;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public ImageView f32558n0;

    /* renamed from: o0 */
    private LinearLayout f32559o0;

    /* renamed from: p0 */
    private RelativeLayout f32560p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ProgressBar f32561q0;

    /* renamed from: r0 */
    private Animation f32562r0 = null;

    /* renamed from: s0 */
    private Animation f32563s0;

    /* renamed from: t0 */
    private AnimationListener f32564t0;

    /* renamed from: u0 */
    private AnimationListener f32565u0;

    /* renamed from: v0 */
    private Animation f32566v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public LinearLayout f32567w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public LinearLayout f32568x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public LinearLayout f32569y0;

    /* renamed from: z0 */
    private LinearLayout f32570z0;

    /* renamed from: com.mrsool.stores.SearchStoresActivity$a */
    class C11505a implements Runnable {
        C11505a() {
        }

        public void run() {
            SearchStoresActivity.this.f29642a.mo23668v0();
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$b */
    class C11506b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f32572a;

        C11506b(boolean z) {
            this.f32572a = z;
        }

        public void run() {
            String str = "";
            if (SearchStoresActivity.this.f32529X.size() <= 0 || ((!SearchStoresActivity.this.f32523U.hasFocus() || !SearchStoresActivity.this.f32523U.getText().toString().trim().equals(str)) && (!SearchStoresActivity.this.f32519S.hasFocus() || !SearchStoresActivity.this.f32519S.getText().toString().trim().equals(str)))) {
                SearchStoresActivity.this.f32522T0.setVisibility(8);
            } else {
                SearchStoresActivity.this.f32522T0.setVisibility(0);
                SearchStoresActivity.this.f32520S0.setVisibility(8);
            }
            if (SearchStoresActivity.this.f32529X.size() > 0 || !SearchStoresActivity.this.f32523U.hasFocus() || !SearchStoresActivity.this.f32523U.getText().toString().trim().equals(str) || !this.f32572a) {
                SearchStoresActivity.this.f32516P0.setVisibility(0);
                return;
            }
            SearchStoresActivity.this.f32522T0.setVisibility(0);
            SearchStoresActivity.this.f32528W0.setVisibility(8);
            SearchStoresActivity.this.f32516P0.setVisibility(8);
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$c */
    class C11507c implements AnimationListener {
        C11507c() {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            SearchStoresActivity.this.f32540c1.setVisibility(4);
            if (SearchStoresActivity.this.f32523U.hasFocus()) {
                SearchStoresActivity.this.f32508H0.setImageResource(C10232R.C10235drawable.icon_search_marker_gray_new);
                SearchStoresActivity searchStoresActivity = SearchStoresActivity.this;
                searchStoresActivity.f29642a.mo23546a(searchStoresActivity.f32508H0, (int) C10232R.C10234color.package_title_text);
                return;
            }
            SearchStoresActivity.this.f32508H0.setImageResource(C10232R.C10235drawable.icon_search_marker_new);
            SearchStoresActivity searchStoresActivity2 = SearchStoresActivity.this;
            searchStoresActivity2.f29642a.mo23546a(searchStoresActivity2.f32508H0, (int) C10232R.C10234color.search_text_gray_lite);
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$d */
    class C11508d implements AnimationListener {
        C11508d() {
        }

        public void onAnimationEnd(Animation animation) {
            SearchStoresActivity.this.f32568x0.setVisibility(8);
            SearchStoresActivity.this.f32540c1.setVisibility(0);
            if (!TextUtils.isEmpty(SearchStoresActivity.this.f32519S.getText().toString().trim())) {
                SearchStoresActivity.this.f32508H0.setImageResource(C10232R.C10235drawable.icon_shop_search_new);
                SearchStoresActivity searchStoresActivity = SearchStoresActivity.this;
                searchStoresActivity.f29642a.mo23546a(searchStoresActivity.f32508H0, (int) C10232R.C10234color.search_text_gray_lite);
            }
            SearchStoresActivity.this.f32519S.clearFocus();
            SearchStoresActivity.this.f32523U.clearFocus();
            SearchStoresActivity.this.f29642a.mo23494P();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$e */
    class C11509e implements AnimationListener {
        C11509e() {
        }

        public void onAnimationEnd(Animation animation) {
            if (SearchStoresActivity.this.f32511K0) {
                SearchStoresActivity.this.f32567w0.setVisibility(8);
            } else {
                SearchStoresActivity.this.f32568x0.setVisibility(8);
                SearchStoresActivity.this.f32540c1.setVisibility(0);
            }
            SearchStoresActivity.this.f29642a.mo23494P();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$f */
    class C11510f implements OnFocusChangeListener {
        C11510f() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchStoresActivity.this.f32519S.setHint(SearchStoresActivity.this.getString(C10232R.string.lbl_search_for_stores));
            SearchStoresActivity.this.f32519S.setHintTextColor(C0841b.m4915a((Context) SearchStoresActivity.this, (int) C10232R.C10234color.gray_3));
            if (z) {
                SearchStoresActivity.this.m51952k(0);
                SearchStoresActivity.this.f32549h0.setImageResource(C10232R.C10235drawable.bg_border_sky_blue_8);
                SearchStoresActivity searchStoresActivity = SearchStoresActivity.this;
                searchStoresActivity.f29642a.mo23546a(searchStoresActivity.f32558n0, (int) C10232R.C10234color.shops_title_text_gray);
                SearchStoresActivity.this.m51930a(true, 0, false);
            } else {
                SearchStoresActivity.this.f32522T0.setVisibility(8);
                SearchStoresActivity.this.f32557m0.setVisibility(8);
                SearchStoresActivity.this.f32510J0.setVisibility(4);
                if (SearchStoresActivity.this.f32519S.getText().toString().trim().equals("")) {
                    SearchStoresActivity.this.f32549h0.setImageResource(C10232R.C10235drawable.bg_border_light_gray_8);
                    SearchStoresActivity searchStoresActivity2 = SearchStoresActivity.this;
                    searchStoresActivity2.f29642a.mo23546a(searchStoresActivity2.f32558n0, (int) C10232R.C10234color.gray_3);
                } else {
                    SearchStoresActivity.this.f32549h0.setImageResource(C10232R.C10235drawable.bg_border_dark_gray_8);
                    SearchStoresActivity searchStoresActivity3 = SearchStoresActivity.this;
                    searchStoresActivity3.f29642a.mo23546a(searchStoresActivity3.f32558n0, (int) C10232R.C10234color.shops_title_text_gray);
                }
            }
            if (z && SearchStoresActivity.this.f32567w0.getVisibility() == 8) {
                SearchStoresActivity.this.f32567w0.setVisibility(0);
                SearchStoresActivity.this.f32557m0.setVisibility(0);
                SearchStoresActivity.this.f32567w0.startAnimation(SearchStoresActivity.this.f32502B0);
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$g */
    class C11511g implements OnFocusChangeListener {
        C11511g() {
        }

        public void onFocusChange(View view, boolean z) {
            String str = "";
            if (z) {
                SearchStoresActivity.this.m51950j(0);
                SearchStoresActivity.this.m51940c(true);
                SearchStoresActivity.this.f32547g0.setImageResource(C10232R.C10235drawable.bg_border_sky_blue_8);
                SearchStoresActivity searchStoresActivity = SearchStoresActivity.this;
                searchStoresActivity.f29642a.mo23546a(searchStoresActivity.f32508H0, (int) C10232R.C10234color.shops_title_text_gray);
                SearchStoresActivity.this.m51930a(false, 0, false);
            } else {
                SearchStoresActivity.this.f32522T0.setVisibility(8);
                SearchStoresActivity.this.f32556l0.setVisibility(8);
                SearchStoresActivity.this.m51940c(false);
                SearchStoresActivity.this.f32509I0.setVisibility(4);
                if (SearchStoresActivity.this.f32523U.getText().toString().trim().equals(str)) {
                    SearchStoresActivity.this.f32547g0.setImageResource(C10232R.C10235drawable.bg_border_light_gray_8);
                    SearchStoresActivity searchStoresActivity2 = SearchStoresActivity.this;
                    searchStoresActivity2.f29642a.mo23546a(searchStoresActivity2.f32508H0, (int) C10232R.C10234color.gray_3);
                } else {
                    SearchStoresActivity.this.f32547g0.setImageResource(C10232R.C10235drawable.bg_border_dark_gray_8);
                    SearchStoresActivity searchStoresActivity3 = SearchStoresActivity.this;
                    searchStoresActivity3.f29642a.mo23546a(searchStoresActivity3.f32508H0, (int) C10232R.C10234color.shops_title_text_gray);
                }
            }
            if (z && SearchStoresActivity.this.f32506F0 && SearchStoresActivity.this.f32568x0.getVisibility() == 8) {
                SearchStoresActivity.this.f32523U.setAdapter(null);
                AutoCompleteTextView F = SearchStoresActivity.this.f32523U;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(SearchStoresActivity.this.f32514N0);
                F.setText(sb.toString());
                SearchStoresActivity.this.f32523U.setAdapter(SearchStoresActivity.this.f32545f0);
                SearchStoresActivity.this.m51944e(false);
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$h */
    class C11512h implements Callback<ShopBean> {

        /* renamed from: a */
        final /* synthetic */ String f32579a;

        /* renamed from: com.mrsool.stores.SearchStoresActivity$h$a */
        class C11513a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Response f32581a;

            C11513a(Response response) {
                this.f32581a = response;
            }

            public void run() {
                if (!SearchStoresActivity.this.isFinishing()) {
                    C5887x xVar = SearchStoresActivity.this.f29642a;
                    if (xVar != null) {
                        xVar.mo23492O();
                        if (SearchStoresActivity.this.isFinishing() || !this.f32581a.isSuccessful()) {
                            if (!SearchStoresActivity.this.isFinishing()) {
                                SearchStoresActivity searchStoresActivity = SearchStoresActivity.this;
                                C5887x xVar2 = searchStoresActivity.f29642a;
                                if (xVar2 != null) {
                                    xVar2.mo23615f(searchStoresActivity.getString(C10232R.string.alert_foursquare), SearchStoresActivity.this.getString(C10232R.string.app_name));
                                }
                            }
                        } else if (((ShopBean) this.f32581a.body()).getCode().intValue() <= 300) {
                            C11512h hVar = C11512h.this;
                            SearchStoresActivity.this.f32554j1 = hVar.f32579a;
                            new C11523r((ShopBean) this.f32581a.body()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        } else {
                            SearchStoresActivity.this.f32561q0.setVisibility(8);
                            SearchStoresActivity.this.f29642a.mo23487L(((ShopBean) this.f32581a.body()).getMessage());
                            SearchStoresActivity.this.f32523U.clearFocus();
                            SearchStoresActivity.this.f32519S.clearFocus();
                            SearchStoresActivity.this.f32550h1.requestFocus();
                        }
                        SearchStoresActivity.this.f29642a.mo23494P();
                    }
                }
            }
        }

        C11512h(String str) {
            this.f32579a = str;
        }

        public void onFailure(Call<ShopBean> call, Throwable th) {
            th.printStackTrace();
        }

        public void onResponse(Call<ShopBean> call, Response<ShopBean> response) {
            new Handler().postDelayed(new C11513a(response), 300);
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$i */
    class C11514i extends C11725f {
        C11514i() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            if (SearchStoresActivity.this.f29642a.mo23502X() && SearchStoresActivity.this.f29642a.mo23500V() && SearchStoresActivity.this.f29642a.mo23497S() && SearchStoresActivity.this.f32527W.size() > 0 && i >= 0) {
                SearchStoresActivity.this.m51926a(i, true);
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$j */
    class C11515j extends C11725f {
        C11515j() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            if (SearchStoresActivity.this.f29642a.mo23502X() && SearchStoresActivity.this.f29642a.mo23500V() && SearchStoresActivity.this.f29642a.mo23497S() && SearchStoresActivity.this.f32525V.size() > 0 && i >= 0) {
                SearchStoresActivity.this.m51926a(i, false);
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$k */
    class C11516k extends C11725f {
        C11516k() {
        }

        public void onClick(View view) {
            int childLayoutPosition = SearchStoresActivity.this.f32533Z.getChildLayoutPosition(view);
            if (SearchStoresActivity.this.f32529X.size() > 0 && childLayoutPosition >= 0) {
                if (SearchStoresActivity.this.getCurrentFocus().getId() == SearchStoresActivity.this.f32519S.getId()) {
                    SearchStoresActivity.this.f32519S.setText((CharSequence) SearchStoresActivity.this.f32529X.get(childLayoutPosition));
                    SearchStoresActivity.this.f32519S.setSelection(((String) SearchStoresActivity.this.f32529X.get(childLayoutPosition)).length());
                    SearchStoresActivity.this.m51911K();
                    return;
                }
                SearchStoresActivity.this.f32523U.setText((CharSequence) SearchStoresActivity.this.f32529X.get(childLayoutPosition));
                SearchStoresActivity.this.f32523U.setSelection(((String) SearchStoresActivity.this.f32529X.get(childLayoutPosition)).length());
                if (!TextUtils.isEmpty(SearchStoresActivity.this.f32519S.getText().toString().trim())) {
                    SearchStoresActivity.this.m51911K();
                }
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$l */
    class C11517l implements OnTouchListener {
        C11517l() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            SearchStoresActivity.this.f29642a.mo23494P();
            return false;
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$m */
    class C11518m implements TextWatcher {
        C11518m() {
        }

        public void afterTextChanged(Editable editable) {
            SearchStoresActivity.this.m51950j(0);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$n */
    class C11519n implements TextWatcher {
        C11519n() {
        }

        public void afterTextChanged(Editable editable) {
            SearchStoresActivity.this.m51952k(0);
            C5880q.m25753d("afterTextChanged");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$o */
    class C11520o implements OnEditorActionListener {
        C11520o() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                SearchStoresActivity.this.m51911K();
            }
            C5880q.m25753d("setOnEditorActionListener");
            return false;
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$p */
    class C11521p implements OnItemClickListener {
        C11521p() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            String str = (String) ((HashMap) adapterView.getItemAtPosition(i)).get(C2876e.f10110S);
            if (str != null) {
                SearchStoresActivity.this.f32543e0 = str;
            } else {
                SearchStoresActivity.this.f32543e0 = null;
            }
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$q */
    class C11522q implements OnEditorActionListener {
        C11522q() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                SearchStoresActivity.this.m51911K();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.stores.SearchStoresActivity$r */
    class C11523r extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        ShopBean f32592a;

        public C11523r(ShopBean shopBean) {
            this.f32592a = shopBean;
            SearchStoresActivity.this.f32552i1 = 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void[] voidArr) {
            ShopBean shopBean = this.f32592a;
            if (shopBean != null && shopBean.getShops().size() > 0) {
                for (int i = 0; i < this.f32592a.getShops().size(); i++) {
                    Shop shop = (Shop) this.f32592a.getShops().get(i);
                    FourSquareMainBean fourSquareMainBean = new FourSquareMainBean();
                    fourSquareMainBean.setShopId(shop.getVShopId());
                    fourSquareMainBean.setShopName(shop.getVName());
                    StringBuilder sb = new StringBuilder();
                    String str = "";
                    sb.append(str);
                    sb.append(shop.getLatitude());
                    fourSquareMainBean.setLatitude(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(shop.getLongitude());
                    fourSquareMainBean.setLongitude(sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(shop.getDistance());
                    fourSquareMainBean.setDistance(sb3.toString());
                    fourSquareMainBean.setRatings(shop.getCount());
                    fourSquareMainBean.setFormattedAddress(shop.getVAddress());
                    fourSquareMainBean.setType(shop.getVType());
                    fourSquareMainBean.setvDataSource(shop.getvDataSource());
                    fourSquareMainBean.setShortDescription(shop.getvDescription());
                    fourSquareMainBean.setShopPic(shop.getVShopPic());
                    fourSquareMainBean.setHasDiscount(shop.isHasDiscount());
                    fourSquareMainBean.setDiscountLabel(shop.getDiscountLabel());
                    fourSquareMainBean.setMrsoolService(shop.getMrsoolService());
                    fourSquareMainBean.setShopNameEn(shop.getvEnName());
                    if (!fourSquareMainBean.isMrsoolService()) {
                        SearchStoresActivity.this.f32525V.add(fourSquareMainBean);
                    } else {
                        SearchStoresActivity.this.f32527W.add(fourSquareMainBean);
                    }
                    SearchStoresActivity.this.m51910J();
                }
            }
            C11598a.m52263f().mo39808a(SearchStoresActivity.this.f32525V.size() + SearchStoresActivity.this.f32527W.size(), SearchStoresActivity.this.f32527W.size(), SearchStoresActivity.this.f32552i1, SearchStoresActivity.this.f32525V.size());
            return null;
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            SearchStoresActivity.this.f32525V.clear();
            SearchStoresActivity.this.f32527W.clear();
            ShopBean shopBean = this.f32592a;
            if (shopBean == null || shopBean.getShops().size() <= 0) {
                SearchStoresActivity.this.f32569y0.setVisibility(0);
                SearchStoresActivity.this.f32531Y.setVisibility(8);
                SearchStoresActivity.this.m51942d(false);
                SearchStoresActivity.this.f32520S0.setVisibility(0);
                return;
            }
            SearchStoresActivity.this.f32520S0.setVisibility(8);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Void voidR) {
            SearchStoresActivity.this.f32561q0.setVisibility(8);
            ShopBean shopBean = this.f32592a;
            if (shopBean != null && shopBean.getShops().size() > 0) {
                SearchStoresActivity.this.f32569y0.setVisibility(0);
                SearchStoresActivity.this.m51942d(true);
            }
            SearchStoresActivity.this.f32537b0.mo7341e();
            SearchStoresActivity.this.f32539c0.mo7341e();
            SearchStoresActivity.this.f32523U.clearFocus();
            SearchStoresActivity.this.f32519S.clearFocus();
        }
    }

    public SearchStoresActivity() {
        String str = "";
        this.f32514N0 = str;
        this.f32546f1 = str;
        this.f32552i1 = 0;
        this.f32554j1 = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m51910J() {
        if (this.f32548g1 == null) {
            this.f32548g1 = new C11614c(this);
        }
        if (this.f32548g1 != null) {
            ArrayList<FourSquareMainBean> arrayList = this.f32525V;
            if (arrayList != null && arrayList.size() > 0) {
                if (this.f32525V.size() == 1) {
                    this.f32548g1.mo39852b(((FourSquareMainBean) this.f32525V.get(0)).getShopId());
                } else if (this.f32525V.size() == 2) {
                    this.f32548g1.mo39849a(((FourSquareMainBean) this.f32525V.get(0)).getShopId(), ((FourSquareMainBean) this.f32525V.get(1)).getShopId());
                } else if (this.f32525V.size() > 2) {
                    this.f32548g1.mo39853b(((FourSquareMainBean) this.f32525V.get(0)).getShopId(), ((FourSquareMainBean) this.f32525V.get(1)).getShopId(), ((FourSquareMainBean) this.f32525V.get(2)).getShopId());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m51911K() {
        this.f29642a.mo23494P();
        if (this.f29642a.mo23502X() && this.f29642a.mo23500V() && m51916P()) {
            if (this.f32525V.size() == 0) {
                m51942d(false);
            }
            if (this.f29642a.mo23468C().mo23459f(C11644i.f33303g) == null || this.f29642a.mo23468C().mo23459f(C11644i.f33312h) == null) {
                this.f32561q0.setVisibility(8);
                this.f29642a.mo23615f(getString(C10232R.string.msg_error_location_not_found), getString(C10232R.string.app_name));
                return;
            }
            this.f32543e0 = this.f32523U.getText().toString();
            this.f32561q0.setVisibility(0);
            this.f32526V0.setVisibility(8);
            this.f32524U0.setVisibility(8);
            String str = null;
            String trim = this.f32519S.getText().toString().trim().length() > 0 ? this.f32519S.getText().toString().trim() : null;
            String str2 = this.f32543e0;
            if (str2 != null) {
                str = str2;
            }
            m51936b(trim, str);
        }
    }

    /* renamed from: L */
    private int m51912L() {
        if (TextUtils.isEmpty(this.f32519S.getText().toString())) {
            this.f32513M0 = 2;
        } else if (TextUtils.isEmpty(this.f32523U.getText().toString())) {
            this.f32513M0 = 1;
        } else {
            this.f32513M0 = 3;
        }
        return this.f32513M0;
    }

    /* renamed from: M */
    private void m51913M() {
        C5880q.m25753d("initControl call");
        this.f32548g1 = new C11614c(this);
        f32500k1 = this;
        this.f32534Z0 = new C11535e(this);
        this.f32529X = this.f32534Z0.mo39675b(true);
        OrderSentActivity.m48878a((C11071t) this);
        this.f32550h1 = findViewById(C10232R.C10236id.focus_thief);
        this.f32528W0 = (LinearLayout) findViewById(C10232R.C10236id.llCurrentLocation);
        this.f32532Y0 = (LinearLayout) findViewById(C10232R.C10236id.llUseCurrentLocation);
        this.f32530X0 = (LinearLayout) findViewById(C10232R.C10236id.llSearch);
        this.f32522T0 = (LinearLayout) findViewById(C10232R.C10236id.llRecent);
        this.f32520S0 = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f32515O0 = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f32516P0 = (TextView) findViewById(C10232R.C10236id.tvRecentLocation);
        this.f32517Q0 = (TextView) findViewById(C10232R.C10236id.tvRecentSearch);
        this.f32518R0 = (TextView) findViewById(C10232R.C10236id.tvClearAll);
        this.f32518R0.setOnClickListener(this);
        this.f32540c1 = (FrameLayout) findViewById(C10232R.C10236id.flNearbyBack);
        this.f32507G0 = (ImageView) findViewById(C10232R.C10236id.imgBackNearBy);
        this.f32507G0.setOnClickListener(this);
        this.f32508H0 = (ImageView) findViewById(C10232R.C10236id.imgLocation);
        this.f32509I0 = (ImageView) findViewById(C10232R.C10236id.ivLineNearMe);
        this.f32510J0 = (ImageView) findViewById(C10232R.C10236id.ivLineSearch);
        this.f32526V0 = (LinearLayout) findViewById(C10232R.C10236id.llService);
        this.f32524U0 = (LinearLayout) findViewById(C10232R.C10236id.llStores);
        this.f32569y0 = (LinearLayout) findViewById(C10232R.C10236id.llRv);
        this.f32567w0 = (LinearLayout) findViewById(C10232R.C10236id.llNearMe);
        this.f32568x0 = (LinearLayout) findViewById(C10232R.C10236id.llSearchShop);
        this.f32560p0 = (RelativeLayout) findViewById(C10232R.C10236id.laySearch);
        this.f32558n0 = (ImageView) findViewById(C10232R.C10236id.imgSearchShop);
        this.f32570z0 = (LinearLayout) findViewById(C10232R.C10236id.llLocationIcon);
        this.f32558n0.setOnClickListener(this);
        this.f32570z0.setOnClickListener(this);
        this.f32532Y0.setOnClickListener(this);
        this.f32538b1 = (NestedScrollView) findViewById(C10232R.C10236id.stickytScroll);
        this.f32562r0 = AnimationUtils.loadAnimation(this, C10232R.anim.fad_in);
        this.f32562r0.setAnimationListener(this.f32564t0);
        this.f32563s0 = AnimationUtils.loadAnimation(this, C10232R.anim.fad_in);
        this.f32563s0.setAnimationListener(this.f32565u0);
        this.f32519S = (EditText) findViewById(C10232R.C10236id.edtSearchShop);
        if (this.f29642a.mo23496R()) {
            mo38404a((View) this.f32519S, 8388627);
            mo38404a((View) this.f32523U, 8388627);
        }
        this.f32561q0 = (ProgressBar) findViewById(C10232R.C10236id.pgLoadMore);
        this.f32556l0.setOnClickListener(this);
        this.f32557m0.setOnClickListener(this);
        this.f32521T = (EditText) findViewById(C10232R.C10236id.txtSearchText);
        this.f32521T.setOnClickListener(this);
        this.f32555k0 = (ImageView) findViewById(C10232R.C10236id.txtSearchImg);
        this.f32547g0 = (ImageView) findViewById(C10232R.C10236id.ivNearMeBg);
        this.f32549h0 = (ImageView) findViewById(C10232R.C10236id.ivStoresBg);
        this.f32551i0 = (ImageView) findViewById(C10232R.C10236id.imgBack);
        this.f32551i0.setOnClickListener(this);
        this.f32553j0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f32553j0.setOnClickListener(this);
        this.f32559o0 = (LinearLayout) findViewById(C10232R.C10236id.laySearchResult);
        this.f32559o0.setOnClickListener(this);
        this.f32535a0 = (RecyclerView) findViewById(C10232R.C10236id.rvSearchService);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(1);
        this.f32535a0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f32535a0.setItemAnimator(this.f29642a.mo23672x());
        this.f32531Y = (RecyclerView) findViewById(C10232R.C10236id.rvSearchShop);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager2 = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager2.mo7000l(1);
        this.f32531Y.setLayoutManager(wrapContentLinearLayoutManager2);
        this.f32531Y.setItemAnimator(this.f29642a.mo23672x());
        this.f32533Z = (RecyclerView) findViewById(C10232R.C10236id.rvRecent);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager3 = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager3.mo7000l(1);
        this.f32533Z.setLayoutManager(wrapContentLinearLayoutManager3);
        this.f32533Z.setItemAnimator(this.f29642a.mo23672x());
        this.f32539c0 = new C11537f(this, this.f32527W, true, new C11514i());
        this.f32537b0 = new C11537f(this, this.f32525V, false, new C11515j());
        this.f32541d0 = new C11532d(this, this.f32529X, new C11516k());
        this.f32533Z.setAdapter(this.f32541d0);
        this.f32531Y.setAdapter(this.f32537b0);
        this.f32538b1.setOnTouchListener(new C11517l());
        this.f32535a0.setAdapter(this.f32539c0);
        this.f32523U = (AutoCompleteTextView) findViewById(C10232R.C10236id.actvSearchNearMe);
        this.f32523U.setThreshold(1);
        m51954l(1);
        m51920T();
        m51919S();
        this.f32560p0.startAnimation(this.f32503C0);
        this.f32523U.addTextChangedListener(new C11518m());
        this.f32519S.addTextChangedListener(new C11519n());
        this.f32519S.setOnEditorActionListener(new C11520o());
        this.f32523U.setOnItemClickListener(new C11521p());
        this.f32523U.setOnEditorActionListener(new C11522q());
        m51933b(0, false);
        if (this.f32529X.size() <= 0) {
            new Handler().postDelayed(new C11505a(), 300);
        }
    }

    /* renamed from: N */
    private void m51914N() {
        this.f32542d1 = (FrameLayout) findViewById(C10232R.C10236id.flShopBack);
        this.f32540c1 = (FrameLayout) findViewById(C10232R.C10236id.flNearbyBack);
        this.f32557m0 = (ImageView) findViewById(C10232R.C10236id.imgShopDelete);
        this.f32556l0 = (ImageView) findViewById(C10232R.C10236id.imgNearByDelete);
    }

    /* renamed from: O */
    private boolean m51915O() {
        return (this.f32526V0.getVisibility() == 0 || this.f32524U0.getVisibility() == 0) ? false : true;
    }

    /* renamed from: P */
    private boolean m51916P() {
        if (this.f32519S.getText().toString().trim().length() >= 1 && this.f32519S.getText().toString().trim().length() <= 2) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_shop_length), getString(C10232R.string.app_name));
            return false;
        } else if (this.f32523U.getText().toString().trim().length() >= 1 && this.f32523U.getText().toString().trim().length() <= 2) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_near_me_length), getString(C10232R.string.app_name));
            return false;
        } else if (this.f32523U.getText().toString().trim().length() == 0 && this.f32519S.getText().toString().trim().length() == 0) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_blank_search_for_both), getString(C10232R.string.app_name));
            return false;
        } else if (this.f32523U.getText().toString().trim().length() < 1 || this.f32519S.getText().toString().trim().length() != 0) {
            this.f32522T0.setVisibility(8);
            return true;
        } else {
            this.f32550h1.requestFocus();
            this.f32519S.setHint(getString(C10232R.string.lbl_location_missing));
            this.f32519S.setHintTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red_lite_3));
            this.f32549h0.setImageResource(C10232R.C10235drawable.bg_border_red_8);
            this.f29642a.mo23546a(this.f32558n0, (int) C10232R.C10234color.red_lite_3);
            return false;
        }
    }

    /* renamed from: Q */
    private void m51917Q() {
        this.f32505E0.setAnimationListener(new C11507c());
        this.f32504D0.setAnimationListener(new C11508d());
        this.f32501A0.setAnimationListener(new C11509e());
    }

    /* renamed from: R */
    private void m51918R() {
        m51914N();
        if (this.f29642a.mo23496R()) {
            mo38399G();
            mo38411a(this.f32542d1, this.f32540c1, this.f32557m0, this.f32556l0);
        }
    }

    /* renamed from: S */
    private void m51919S() {
        this.f32519S.setOnFocusChangeListener(new C11510f());
        this.f32523U.setOnFocusChangeListener(new C11511g());
        this.f32519S.requestFocus();
    }

    /* renamed from: T */
    private void m51920T() {
        this.f32501A0 = AnimationUtils.loadAnimation(this, C10232R.anim.slid_up);
        this.f32504D0 = AnimationUtils.loadAnimation(this, C10232R.anim.slid_up);
        this.f32502B0 = AnimationUtils.loadAnimation(this, C10232R.anim.slid_down);
        this.f32505E0 = AnimationUtils.loadAnimation(this, C10232R.anim.slid_down);
        this.f32503C0 = AnimationUtils.loadAnimation(this, C10232R.anim.slid_down);
        m51917Q();
    }

    /* renamed from: U */
    private void m51921U() {
        this.f32567w0.setVisibility(0);
        this.f32567w0.startAnimation(this.f32502B0);
        this.f32569y0.startAnimation(this.f32502B0);
        this.f32557m0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m51944e(boolean z) {
    }

    public void onClick(View view) {
        C5880q.m25753d("onClick");
        if (view.equals(this.f32551i0) || view.equals(this.f32507G0)) {
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23494P();
                C11644i.f33260b1 = true;
                finish();
            }
        } else if (view.equals(this.f32553j0)) {
            C5887x xVar2 = this.f29642a;
            if (xVar2 != null) {
                xVar2.mo23494P();
                C11644i.f33260b1 = true;
                finish();
            }
        } else if (!view.equals(this.f32559o0) && !view.equals(this.f32521T)) {
            String str = "";
            if (view.equals(this.f32557m0)) {
                C5880q.m25753d("imgShopDelete");
                this.f32519S.setText(str);
                this.f32519S.setHint(getString(C10232R.string.lbl_search_for_stores));
                if (this.f32567w0.getVisibility() == 8) {
                    m51921U();
                }
            } else if (view.equals(this.f32556l0)) {
                C5880q.m25753d("imgNearByDelete");
                this.f32523U.setText(str);
                if (this.f32568x0.getVisibility() == 8) {
                    this.f32519S.setText(str);
                }
                this.f32523U.setHint(getString(C10232R.string.lbl_near_you));
                if (this.f32568x0.getVisibility() == 8) {
                    m51944e(false);
                }
            } else if (view.equals(this.f32570z0) && this.f32568x0.getVisibility() == 8) {
                if (this.f32525V.size() > 0 && this.f32521T.getText().toString().length() > 0) {
                    this.f32523U.setText(this.f32514N0);
                }
                m51944e(false);
            } else if (view.equals(this.f32532Y0)) {
                if (this.f32519S.getText().toString().trim().equals(str)) {
                    this.f32519S.requestFocus();
                } else {
                    m51911K();
                }
            } else if (view.equals(this.f32518R0)) {
                this.f32534Z0.mo39674a(this.f32519S.hasFocus());
                m51930a(this.f32519S.hasFocus(), 0, false);
            }
        } else if (this.f29642a != null) {
            C5880q.m25753d("laySearchResult call");
            C5887x xVar3 = this.f29642a;
            if (xVar3 != null) {
                xVar3.mo23494P();
                m51954l(1);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_search);
        m51918R();
        m51913M();
    }

    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23620g()) {
            this.f29642a.mo23626i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51942d(boolean z) {
        if (this.f32525V.size() > 0) {
            this.f32524U0.setVisibility(0);
        } else {
            this.f32524U0.setVisibility(8);
        }
        if (this.f32527W.size() > 0) {
            this.f32526V0.setVisibility(0);
        } else {
            this.f32526V0.setVisibility(8);
        }
        if (z) {
            this.f32531Y.setVisibility(0);
        } else {
            this.f32531Y.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51950j(int i) {
        String obj = this.f32523U.getText().toString();
        if (obj == null || obj.length() < 1) {
            this.f32556l0.setVisibility(8);
            m51933b(i, false);
            return;
        }
        this.f32522T0.setVisibility(8);
        this.f32556l0.setVisibility(0);
        if (this.f32526V0.getVisibility() != 0) {
            int visibility = this.f32524U0.getVisibility();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m51952k(int i) {
        String obj = this.f32519S.getText().toString();
        if (obj == null || obj.length() < 1) {
            if (this.f32529X.size() == 0 && this.f32526V0.getVisibility() != 0) {
                this.f32524U0.getVisibility();
            }
            this.f32557m0.setVisibility(8);
            m51933b(i, false);
            return;
        }
        this.f32522T0.setVisibility(8);
        this.f32557m0.setVisibility(0);
        if (this.f32526V0.getVisibility() != 0) {
            int visibility = this.f32524U0.getVisibility();
        }
    }

    /* renamed from: l */
    private void m51954l(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("manageView ");
        sb.append(i);
        C5880q.m25753d(sb.toString());
        if (i == 0) {
            C5880q.m25753d("manageView show result view");
            if (this.f32559o0.getVisibility() != 0) {
                this.f32560p0.setVisibility(8);
                this.f32559o0.startAnimation(AnimationUtils.loadAnimation(this, 17432576));
                this.f32559o0.setVisibility(0);
                this.f29642a.mo23494P();
                return;
            }
            C5880q.m25753d("laySearchResult visible");
            return;
        }
        C5880q.m25753d("manageView search view");
        if (this.f32560p0.getVisibility() != 0) {
            this.f32559o0.setVisibility(8);
            this.f32560p0.startAnimation(AnimationUtils.loadAnimation(this, 17432576));
            this.f32560p0.setVisibility(0);
            this.f32519S.requestFocus();
            this.f32519S.setFocusable(true);
            this.f32519S.setFocusableInTouchMode(true);
            this.f29642a.mo23668v0();
            return;
        }
        C5880q.m25753d("laySearch visible");
    }

    /* renamed from: A */
    public void mo36518A() {
        this.f29642a.mo23473E(C11644i.f33213V3);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m51940c(boolean z) {
        if (z) {
            this.f32528W0.setVisibility(8);
            this.f32530X0.setVisibility(0);
            return;
        }
        this.f32528W0.setVisibility(8);
        this.f32530X0.setVisibility(0);
    }

    /* renamed from: b */
    private void m51933b(int i, boolean z) {
        new Handler().postDelayed(new C11506b(z), (long) i);
    }

    /* renamed from: b */
    private void m51936b(String str, String str2) {
        if (str != null && str.trim().length() > 0 && str2 != null && str2.trim().length() > 0) {
            EditText editText = this.f32521T;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str3 = C3868i.f12248b;
            sb.append(str3);
            sb.append(getString(C10232R.string.lbl_near_to));
            sb.append(str3);
            sb.append(str2);
            editText.setText(sb.toString());
            this.f32555k0.setImageResource(C10232R.C10235drawable.icon_shop_search_new);
            this.f29642a.mo23546a(this.f32555k0, (int) C10232R.C10234color.search_text_gray_lite);
        } else if (str != null && str.trim().length() > 0) {
            this.f32521T.setText(str);
            this.f32555k0.setImageResource(C10232R.C10235drawable.icon_shop_search_new);
            this.f29642a.mo23546a(this.f32555k0, (int) C10232R.C10234color.search_text_gray_lite);
        } else if (str2 != null && str2.trim().length() > 0) {
            this.f32521T.setText(str2);
            this.f32555k0.setImageResource(C10232R.C10235drawable.icon_search_marker_new);
            this.f29642a.mo23546a(this.f32555k0, (int) C10232R.C10234color.search_text_gray_lite);
        }
        C5880q.m25753d("callAllForSquareAPI");
        this.f32513M0 = m51912L();
        this.f32506F0 = true;
        this.f32523U.clearFocus();
        this.f32550h1.requestFocus();
        this.f32522T0.setVisibility(8);
        HashMap hashMap = new HashMap();
        hashMap.put("vName", this.f29642a.mo23471D(str));
        hashMap.put("latitude", this.f29642a.mo23468C().mo23459f(C11644i.f33303g));
        hashMap.put("longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
        String str4 = "";
        hashMap.put("near", str2 != null ? str2 : str4);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(this.f29642a.mo23478H());
        hashMap.put("language", sb2.toString());
        this.f32534Z0.mo39673a(this.f32519S.getText().toString().trim(), true);
        if (!TextUtils.isEmpty(str2)) {
            this.f32534Z0.mo39673a(str2, false);
        }
        this.f32546f1 = str;
        C11598a.m52263f().mo39834c(str);
        String str5 = this.f32554j1;
        if (str2 != null) {
            str4 = str2;
        }
        if (!str5.equalsIgnoreCase(str4)) {
            C11598a.m52263f().mo39835c(str2, this.f32554j1);
        }
        C11687c.m52645a(this.f29642a).SearchShop(hashMap).enqueue(new C11512h(str2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51926a(int i, boolean z) {
        String string = getResources().getString(C10232R.string.ct_event_param_value_search_screen);
        StringBuilder sb = new StringBuilder();
        sb.append("Search - ");
        sb.append(this.f32546f1);
        CTEventBean cTEventBean = new CTEventBean(string, sb.toString(), String.valueOf(i + 1));
        String str = C11644i.f33207U5;
        if (!z) {
            if (C11644i.f33184R6.equalsIgnoreCase(((FourSquareMainBean) this.f32525V.get(i)).getvDataSource())) {
                Intent intent = new Intent(this, ShopDetailActivity.class);
                intent.putExtra(str, cTEventBean);
                this.f29642a.mo23555a(this.f32525V, i, (Context) this);
                startActivity(intent);
                m51925a(i, C11644i.f33244Z2, (FourSquareMainBean) this.f32525V.get(i));
                return;
            }
        }
        if (z) {
            if (C11644i.f33192S6.equalsIgnoreCase(((FourSquareMainBean) this.f32527W.get(i)).getvDataSource())) {
                Intent intent2 = new Intent(this, ShopDetailPackageActivity.class);
                intent2.putExtra(C11644i.f33367n1, ((FourSquareMainBean) this.f32527W.get(i)).getShopId());
                intent2.putExtra(C11644i.f33375o1, "");
                intent2.putExtra(C11644i.f33147N1, false);
                intent2.putExtra(str, cTEventBean);
                startActivity(intent2);
                m51925a(i, C11644i.f33253a3, (FourSquareMainBean) this.f32527W.get(i));
            }
        }
    }

    /* renamed from: a */
    private void m51925a(int i, String str, FourSquareMainBean fourSquareMainBean) {
        try {
            C11598a f = C11598a.m52263f();
            String shopId = fourSquareMainBean.getShopId();
            String shopName = fourSquareMainBean.getShopName();
            String shopNameEn = fourSquareMainBean.getShopNameEn();
            String categories = fourSquareMainBean.getCategories();
            String str2 = "";
            String type = fourSquareMainBean.getType();
            int i2 = i + 1;
            double S = C5887x.m25791S(fourSquareMainBean.getDistance());
            boolean hasDiscount = fourSquareMainBean.getHasDiscount();
            try {
                f.mo39836c(shopId, shopName, shopNameEn, str, categories, str2, type, i2, S, hasDiscount, this.f29642a.mo23639m(fourSquareMainBean.getDiscountLabel()));
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51930a(boolean z, int i, boolean z2) {
        int i2;
        Resources resources;
        this.f32529X = this.f32534Z0.mo39675b(z);
        this.f32541d0.mo39669a(this.f32529X);
        m51933b(i, z2);
        TextView textView = this.f32517Q0;
        if (z) {
            resources = getResources();
            i2 = C10232R.string.lbl_recent_search;
        } else {
            resources = getResources();
            i2 = C10232R.string.lbl_recent_location;
        }
        textView.setText(resources.getString(i2));
    }
}
