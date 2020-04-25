package com.mrsool.createorder;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0841b;
import androidx.core.widget.C1113f;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds.Builder;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.bean.BookmarkPlaceBean;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.DeliveryTimeBean;
import com.mrsool.bean.DeliveryTimeWindowBean;
import com.mrsool.bean.SavedBookmarkedBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;
import com.mrsool.customeview.WheelViewNew;
import com.mrsool.customeview.WheelViewNew.C10750e;
import com.mrsool.customeview.WheelViewNew.C10751f;
import com.mrsool.newBean.BranchBean;
import com.mrsool.p417t.C11547a;
import com.mrsool.p417t.C11551e;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11728i;
import com.mrsool.p423v.C11738n;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p438de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c.C15800h;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b;

/* renamed from: com.mrsool.createorder.s */
/* compiled from: OrderStepFragment2 */
public class C10677s extends Fragment implements OnClickListener {

    /* renamed from: A0 */
    public BookmarkPlaceBean f29181A0;

    /* renamed from: B0 */
    public BookmarkPlaceBean f29182B0;

    /* renamed from: C0 */
    public BookmarkPlaceBean f29183C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public List<String> f29184D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public List<String> f29185E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public int f29186F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public Dialog f29187G0;

    /* renamed from: H0 */
    public C15792c f29188H0;

    /* renamed from: I0 */
    public C15792c f29189I0;

    /* renamed from: J0 */
    private C10641n f29190J0;

    /* renamed from: K0 */
    public TextView f29191K0;

    /* renamed from: L0 */
    public TextView f29192L0;

    /* renamed from: M0 */
    private ImageView f29193M0;

    /* renamed from: N */
    public String f29194N = null;

    /* renamed from: N0 */
    private ImageView f29195N0;

    /* renamed from: O */
    public String f29196O;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public CheckDiscountBean f29197O0;

    /* renamed from: P */
    public String f29198P;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public SupportMapFragment f29199P0;

    /* renamed from: Q */
    public String f29200Q;
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public GoogleMap f29201Q0;

    /* renamed from: R */
    public String f29202R;

    /* renamed from: R0 */
    private Marker f29203R0;

    /* renamed from: S */
    public String f29204S;

    /* renamed from: S0 */
    private Marker f29205S0;

    /* renamed from: T */
    public String f29206T;

    /* renamed from: T0 */
    private Marker f29207T0;

    /* renamed from: U */
    public String f29208U;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public ArrayList<Marker> f29209U0;

    /* renamed from: V */
    public String f29210V;

    /* renamed from: V0 */
    private ProgressBar f29211V0;

    /* renamed from: W */
    public String f29212W;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public int f29213W0;

    /* renamed from: X */
    public String f29214X;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public int f29215X0;

    /* renamed from: Y */
    public TextView f29216Y;

    /* renamed from: Y0 */
    String f29217Y0;

    /* renamed from: Z */
    private LinearLayout f29218Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public Bitmap f29219Z0;

    /* renamed from: a */
    private View f29220a;

    /* renamed from: a0 */
    private LinearLayout f29221a0;

    /* renamed from: a1 */
    private TextView f29222a1;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5887x f29223b;

    /* renamed from: b0 */
    private LinearLayout f29224b0;

    /* renamed from: b1 */
    private TextView f29225b1;

    /* renamed from: c0 */
    private LinearLayout f29226c0;

    /* renamed from: c1 */
    private ImageView f29227c1;

    /* renamed from: d0 */
    private LinearLayout f29228d0;

    /* renamed from: d1 */
    private ImageView f29229d1;

    /* renamed from: e0 */
    private LinearLayout f29230e0;

    /* renamed from: e1 */
    private ImageView f29231e1;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public int f29232f0;

    /* renamed from: f1 */
    private ImageView f29233f1;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public int f29234g0;

    /* renamed from: g1 */
    private ImageView f29235g1;

    /* renamed from: h0 */
    private int f29236h0;

    /* renamed from: h1 */
    private ImageView f29237h1;

    /* renamed from: i0 */
    private int f29238i0;

    /* renamed from: i1 */
    private TextView f29239i1;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public AppSingleton f29240j0;

    /* renamed from: j1 */
    private boolean f29241j1;

    /* renamed from: k0 */
    public boolean f29242k0;

    /* renamed from: k1 */
    private ImageView f29243k1;

    /* renamed from: l0 */
    private final int f29244l0;

    /* renamed from: l1 */
    private TextView f29245l1;

    /* renamed from: m0 */
    private final int f29246m0;

    /* renamed from: m1 */
    private Handler f29247m1;

    /* renamed from: n0 */
    private final int f29248n0;

    /* renamed from: n1 */
    private SpannableStringBuilder f29249n1;

    /* renamed from: o0 */
    private String f29250o0;

    /* renamed from: o1 */
    private boolean f29251o1;

    /* renamed from: p0 */
    private String f29252p0;

    /* renamed from: p1 */
    public String f29253p1;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f29254q0;

    /* renamed from: q1 */
    public String f29255q1;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public int f29256r0;

    /* renamed from: r1 */
    public String f29257r1;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public int f29258s0;

    /* renamed from: s1 */
    public boolean f29259s1;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public String f29260t0;

    /* renamed from: t1 */
    public boolean f29261t1;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public String f29262u0;

    /* renamed from: u1 */
    int f29263u1;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public String f29264v0;

    /* renamed from: w0 */
    private float f29265w0;

    /* renamed from: x0 */
    private float f29266x0;

    /* renamed from: y0 */
    private float f29267y0;

    /* renamed from: z0 */
    private Boolean f29268z0;

    /* renamed from: com.mrsool.createorder.s$a */
    /* compiled from: OrderStepFragment2 */
    class C10678a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MaterialButton f29269a;

        C10678a(MaterialButton materialButton) {
            this.f29269a = materialButton;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f29269a.setEnabled(charSequence.length() > 2);
        }
    }

    /* renamed from: com.mrsool.createorder.s$b */
    /* compiled from: OrderStepFragment2 */
    class C10679b implements Callback<SavedBookmarkedBean> {

        /* renamed from: a */
        final /* synthetic */ int f29271a;

        C10679b(int i) {
            this.f29271a = i;
        }

        public void onFailure(Call<SavedBookmarkedBean> call, Throwable th) {
            if (C10677s.this.f29223b != null) {
                ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
            }
        }

        public void onResponse(Call<SavedBookmarkedBean> call, Response<SavedBookmarkedBean> response) {
            if (C10677s.this.f29223b != null) {
                if (!response.isSuccessful()) {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                    if (C10677s.this.f29223b != null) {
                        C10677s.this.f29223b.mo23615f(response.message(), C10677s.this.getString(C10232R.string.app_name));
                    }
                } else if (((SavedBookmarkedBean) response.body()).getCode().intValue() <= 300) {
                    C10677s.this.f29223b.mo23491N(((SavedBookmarkedBean) response.body()).getMessage());
                    int i = this.f29271a;
                    if (i == 1) {
                        C10677s.this.f29264v0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        C10677s sVar = C10677s.this;
                        sVar.f29258s0 = sVar.m49192a(sVar.f29197O0.getBookmarks().getDelivery(), C10677s.this.f29264v0);
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 1, false, false);
                    } else if (i == 2) {
                        C10677s.this.f29262u0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        C10677s sVar2 = C10677s.this;
                        sVar2.f29256r0 = sVar2.m49192a(sVar2.f29197O0.getBookmarks().getPickup(), C10677s.this.f29262u0);
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 2, false, false);
                    } else if (i == 3) {
                        C10677s.this.f29260t0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        C10677s sVar3 = C10677s.this;
                        sVar3.f29254q0 = sVar3.m49192a(sVar3.f29197O0.getBookmarks().getDropoff(), C10677s.this.f29260t0);
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 3, false, false);
                    }
                } else {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                    C10677s.this.f29223b.mo23615f(((SavedBookmarkedBean) response.body()).getMessage(), C10677s.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$c */
    /* compiled from: OrderStepFragment2 */
    class C10680c extends C11725f {

        /* renamed from: a */
        final /* synthetic */ boolean f29273a;

        C10680c(boolean z) {
            this.f29273a = z;
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C15792c cVar = C10677s.this.f29188H0;
            if (cVar != null) {
                cVar.mo51999a();
            }
            C10677s.this.m49187Q();
            if (this.f29273a) {
                C10677s sVar = C10677s.this;
                sVar.f29182B0 = (BookmarkPlaceBean) sVar.f29197O0.getBookmarks().getPickup().get(i);
                C10677s.this.f29182B0.setBookmark(true);
                C10677s.this.f29256r0 = i;
                C10677s sVar2 = C10677s.this;
                sVar2.f29262u0 = sVar2.f29182B0.getId();
                C10677s.this.m49225c(true, true, true, true);
                return;
            }
            C10677s sVar3 = C10677s.this;
            if (sVar3.f29242k0) {
                sVar3.f29183C0 = (BookmarkPlaceBean) sVar3.f29197O0.getBookmarks().getDropoff().get(i);
                C10677s.this.f29183C0.setBookmark(true);
                C10677s.this.f29254q0 = i;
                C10677s sVar4 = C10677s.this;
                sVar4.f29260t0 = sVar4.f29183C0.getId();
                C10677s.this.m49218b(true, true, true, true);
                return;
            }
            sVar3.f29181A0 = (BookmarkPlaceBean) sVar3.f29197O0.getBookmarks().getDelivery().get(i);
            C10677s.this.f29181A0.setBookmark(true);
            C10677s.this.f29258s0 = i;
            C10677s sVar5 = C10677s.this;
            sVar5.f29264v0 = sVar5.f29181A0.getId();
            C10677s.this.m49211a(true, true, true, true);
        }

        /* renamed from: e */
        public void mo38064e(int i) {
            if (this.f29273a) {
                C10677s.this.mo38076a(2, i);
                return;
            }
            C10677s sVar = C10677s.this;
            if (sVar.f29242k0) {
                sVar.mo38076a(3, i);
            } else {
                sVar.mo38076a(1, i);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$d */
    /* compiled from: OrderStepFragment2 */
    class C10681d implements C10751f {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29275a;

        C10681d(WheelViewNew wheelViewNew) {
            this.f29275a = wheelViewNew;
        }

        /* renamed from: a */
        public void mo36638a(String str) {
            int d = C10677s.this.m49235g(str);
            if (d != -1) {
                this.f29275a.setSeletion(d);
                C10677s.this.f29186F0 = d;
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$e */
    /* compiled from: OrderStepFragment2 */
    class C10682e extends C10750e {
        C10682e() {
        }

        /* renamed from: a */
        public void mo36637a(int i, String str) {
            C10677s.this.f29186F0 = i - 1;
        }
    }

    /* renamed from: com.mrsool.createorder.s$f */
    /* compiled from: OrderStepFragment2 */
    class C10683f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29278a;

        C10683f(WheelViewNew wheelViewNew) {
            this.f29278a = wheelViewNew;
        }

        public void onClick(View view) {
            C10677s sVar = C10677s.this;
            sVar.f29186F0 = sVar.f29186F0 + -1 >= 0 ? C10677s.this.f29186F0 - 1 : 0;
            this.f29278a.setSeletion(C10677s.this.f29186F0);
        }
    }

    /* renamed from: com.mrsool.createorder.s$g */
    /* compiled from: OrderStepFragment2 */
    class C10684g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f29280a;

        C10684g(WheelViewNew wheelViewNew) {
            this.f29280a = wheelViewNew;
        }

        public void onClick(View view) {
            C10677s sVar = C10677s.this;
            sVar.f29186F0 = sVar.f29186F0 + 1 <= C10677s.this.f29184D0.size() ? C10677s.this.f29186F0 + 1 : C10677s.this.f29184D0.size();
            this.f29280a.setSeletion(C10677s.this.f29186F0);
        }
    }

    /* renamed from: com.mrsool.createorder.s$h */
    /* compiled from: OrderStepFragment2 */
    class C10685h implements OnClickListener {
        C10685h() {
        }

        public void onClick(View view) {
            if (C10677s.this.f29186F0 >= C10677s.this.f29184D0.size()) {
                C10677s sVar = C10677s.this;
                sVar.f29186F0 = sVar.f29184D0.size() - 1;
            }
            C10677s sVar2 = C10677s.this;
            sVar2.f29194N = (String) sVar2.f29185E0.get(C10677s.this.f29186F0);
            C10677s.this.m49188R();
            C10677s.this.f29187G0.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.s$i */
    /* compiled from: OrderStepFragment2 */
    class C10686i implements OnClickListener {
        C10686i() {
        }

        public void onClick(View view) {
            C10677s.this.f29187G0.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.s$j */
    /* compiled from: OrderStepFragment2 */
    class C10687j implements OnMapReadyCallback {
        C10687j() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C10677s.this.isAdded()) {
                if (C0841b.m4916a((Context) C10677s.this.getActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) C10677s.this.getActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    C10677s sVar = C10677s.this;
                    sVar.f29201Q0 = sVar.f29223b.mo23514a(googleMap, C10677s.this.f29199P0, true, true);
                    C10677s.this.f29201Q0.setMyLocationEnabled(false);
                    C10677s.this.f29201Q0.getUiSettings().setMyLocationButtonEnabled(false);
                    CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(C10677s.this.f29223b.mo23648p());
                    CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                    C10677s.this.f29201Q0.moveCamera(newLatLng);
                    C10677s.this.f29201Q0.animateCamera(zoomTo);
                    C10677s.this.m49173C();
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$k */
    /* compiled from: OrderStepFragment2 */
    class C10688k implements Runnable {
        C10688k() {
        }

        public void run() {
            C10677s.this.m49241i(true);
        }
    }

    /* renamed from: com.mrsool.createorder.s$l */
    /* compiled from: OrderStepFragment2 */
    class C10689l implements Runnable {
        C10689l() {
        }

        public void run() {
            C10677s.this.m49241i(false);
        }
    }

    /* renamed from: com.mrsool.createorder.s$m */
    /* compiled from: OrderStepFragment2 */
    class C10690m extends C2557j<Bitmap> {
        C10690m() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (C10677s.this.isAdded()) {
                C10677s.this.f29219Z0 = bitmap;
                for (int i = 0; i < C10677s.this.f29240j0.f16955b.getShop().getBranchList().size(); i++) {
                    if (((BranchBean) C10677s.this.f29240j0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        C10677s sVar = C10677s.this;
                        C1376c activity = sVar.getActivity();
                        C10677s sVar2 = C10677s.this;
                        C10677s.this.f29209U0.add(C10677s.this.f29201Q0.addMarker(markerOptions.icon(BitmapDescriptorFactory.fromBitmap(sVar.mo38075a((Context) activity, sVar2.m49194a(bitmap, (BranchBean) sVar2.f29240j0.f16955b.getShop().getBranchList().get(i))))).position(new LatLng(((BranchBean) C10677s.this.f29240j0.f16955b.getShop().getBranchList().get(i)).getLatitude().doubleValue(), ((BranchBean) C10677s.this.f29240j0.f16955b.getShop().getBranchList().get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                    }
                }
                if (!C10677s.this.f29242k0) {
                    BranchBean branchBean = new BranchBean();
                    branchBean.setIsSelected(1);
                    branchBean.setDistance(Double.valueOf(C10677s.this.f29240j0.f16955b.getShop().getDistance_courier_shop()));
                    branchBean.setvName(C10677s.this.f29240j0.f16955b.getShop().getVName());
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    C10677s sVar3 = C10677s.this;
                    C10677s.this.f29209U0.add(C10677s.this.f29201Q0.addMarker(markerOptions2.icon(BitmapDescriptorFactory.fromBitmap(sVar3.mo38075a((Context) sVar3.getActivity(), C10677s.this.m49194a(bitmap, branchBean)))).position(new LatLng(C10677s.this.f29240j0.f16955b.getShop().getLatitude().doubleValue(), C10677s.this.f29240j0.f16955b.getShop().getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                }
                C10677s.this.m49189S();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$n */
    /* compiled from: OrderStepFragment2 */
    class C10691n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f29288a;

        C10691n(Builder builder) {
            this.f29288a = builder;
        }

        public void run() {
            try {
                if (C10677s.this.f29263u1 > 1) {
                    C10677s.this.f29201Q0.setPadding(C10677s.this.f29215X0 / 4, (int) (((float) C10677s.this.f29213W0) / 1.5f), C10677s.this.f29215X0 / 4, 0);
                    C10677s.this.f29201Q0.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f29288a.build(), 100));
                } else if (C10677s.this.f29263u1 > 0) {
                    CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                    C10677s.this.f29201Q0.moveCamera(CameraUpdateFactory.newLatLng(this.f29288a.build().getCenter()));
                    C10677s.this.f29201Q0.animateCamera(zoomTo);
                } else {
                    CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(C10677s.this.f29223b.mo23648p());
                    CameraUpdate zoomTo2 = CameraUpdateFactory.zoomTo(15.0f);
                    C10677s.this.f29201Q0.moveCamera(newLatLng);
                    C10677s.this.f29201Q0.animateCamera(zoomTo2);
                }
            } catch (Exception e) {
                C10677s.this.f29201Q0.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$o */
    /* compiled from: OrderStepFragment2 */
    class C10692o implements Callback<DeliveryTimeWindowBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f29290a;

        /* renamed from: b */
        final /* synthetic */ boolean f29291b;

        C10692o(boolean z, boolean z2) {
            this.f29290a = z;
            this.f29291b = z2;
        }

        public void onFailure(Call<DeliveryTimeWindowBean> call, Throwable th) {
            if (C10677s.this.isAdded() && C10677s.this.f29223b != null) {
                ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                ((CreateOrderActivity) C10677s.this.getActivity()).mo37972e(C10677s.this.getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<DeliveryTimeWindowBean> call, Response<DeliveryTimeWindowBean> response) {
            if (C10677s.this.isAdded() && C10677s.this.f29223b != null) {
                if (this.f29290a && !this.f29291b) {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                }
                if (((CreateOrderActivity) C10677s.this.getActivity()).f28811f0) {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37968G();
                }
                if (!response.isSuccessful()) {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37972e(response.message());
                } else if (((DeliveryTimeWindowBean) response.body()).getCode().intValue() <= 300) {
                    if (C10677s.this.f29197O0 != null) {
                        C10677s.this.f29197O0.setDelivery_time_options(((DeliveryTimeWindowBean) response.body()).getDeliveryTimeOptions());
                    }
                    if (!(C10677s.this.f29240j0.f16955b.getShop().isManualBranchSelect() || ((DeliveryTimeWindowBean) response.body()).getAddressHash() == null || ((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude() == null)) {
                        ((DeliveryTimeWindowBean) response.body()).getAddressHash().setIsSelected(1);
                        if (C10677s.this.f29232f0 == 1) {
                            C10677s.this.f29200Q = ((DeliveryTimeWindowBean) response.body()).getAddressHash().getvAddress();
                            C10677s.this.f29196O = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude());
                            C10677s.this.f29198P = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLongitude());
                            C10677s.this.f29182B0 = new BookmarkPlaceBean();
                            C10677s sVar = C10677s.this;
                            sVar.f29182B0.setLongitude(Double.valueOf(Double.parseDouble(sVar.f29198P)));
                            C10677s sVar2 = C10677s.this;
                            sVar2.f29182B0.setLatitude(Double.valueOf(Double.parseDouble(sVar2.f29196O)));
                            C10677s.this.f29182B0.setSubAddress("");
                            C10677s sVar3 = C10677s.this;
                            sVar3.f29182B0.setAddress(sVar3.f29200Q);
                            C10677s.this.f29182B0.setBookmark(false);
                            C10677s.this.m49208a(((DeliveryTimeWindowBean) response.body()).getAddressHash());
                        }
                        if (C10677s.this.f29234g0 == 1) {
                            C10677s.this.f29206T = ((DeliveryTimeWindowBean) response.body()).getAddressHash().getvAddress();
                            C10677s.this.f29202R = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude());
                            C10677s.this.f29204S = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLongitude());
                            C10677s.this.m49208a(((DeliveryTimeWindowBean) response.body()).getAddressHash());
                        }
                    }
                    C10677s.this.m49236g(true);
                } else {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37972e(((DeliveryTimeWindowBean) response.body()).getMessage());
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$p */
    /* compiled from: OrderStepFragment2 */
    class C10693p implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ int f29293N;

        /* renamed from: a */
        final /* synthetic */ Dialog f29295a;

        /* renamed from: b */
        final /* synthetic */ int f29296b;

        C10693p(Dialog dialog, int i, int i2) {
            this.f29295a = dialog;
            this.f29296b = i;
            this.f29293N = i2;
        }

        public void onClick(View view) {
            try {
                this.f29295a.dismiss();
                int i = this.f29296b;
                if (i == 1) {
                    C10677s.this.m49202a(1, String.valueOf(((BookmarkPlaceBean) C10677s.this.f29197O0.getBookmarks().getDelivery().get(this.f29293N)).getId()), this.f29293N);
                } else if (i == 2) {
                    C10677s.this.m49202a(2, String.valueOf(((BookmarkPlaceBean) C10677s.this.f29197O0.getBookmarks().getPickup().get(this.f29293N)).getId()), this.f29293N);
                } else if (i == 3) {
                    C10677s.this.m49202a(3, String.valueOf(((BookmarkPlaceBean) C10677s.this.f29197O0.getBookmarks().getDropoff().get(this.f29293N)).getId()), this.f29293N);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.createorder.s$q */
    /* compiled from: OrderStepFragment2 */
    class C10694q implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29297a;

        C10694q(Dialog dialog) {
            this.f29297a = dialog;
        }

        public void onClick(View view) {
            this.f29297a.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.s$r */
    /* compiled from: OrderStepFragment2 */
    class C10695r implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ int f29299a;

        /* renamed from: b */
        final /* synthetic */ int f29300b;

        /* renamed from: c */
        final /* synthetic */ String f29301c;

        C10695r(int i, int i2, String str) {
            this.f29299a = i;
            this.f29300b = i2;
            this.f29301c = str;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
            if (C10677s.this.f29223b != null) {
                C10677s.this.f29223b.mo23653q0();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (C10677s.this.f29223b != null) {
                if (!response.isSuccessful()) {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                    if (C10677s.this.f29223b != null) {
                        C10677s.this.f29223b.mo23615f(response.message(), C10677s.this.getString(C10232R.string.app_name));
                    }
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    C10677s.this.f29223b.mo23491N(((DefaultBean) response.body()).getMessage());
                    int i = this.f29299a;
                    String str = "-1";
                    if (i == 1) {
                        if (C10677s.this.f29258s0 == this.f29300b) {
                            C10677s.this.f29258s0 = -1;
                            C10677s.this.f29264v0 = str;
                            C10677s.this.f29181A0.setBookmark(false);
                        }
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, this.f29301c, 1, false, false);
                    } else if (i == 2) {
                        if (C10677s.this.f29256r0 == this.f29300b) {
                            C10677s.this.f29256r0 = -1;
                            C10677s.this.f29262u0 = str;
                            C10677s.this.f29182B0.setBookmark(false);
                        }
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, this.f29301c, 2, false, false);
                    } else if (i == 3) {
                        if (C10677s.this.f29254q0 == this.f29300b) {
                            C10677s.this.f29254q0 = -1;
                            C10677s.this.f29260t0 = str;
                            C10677s.this.f29183C0.setBookmark(false);
                        }
                        ((CreateOrderActivity) C10677s.this.getActivity()).mo37971a(false, true, this.f29301c, 3, false, false);
                    }
                } else {
                    ((CreateOrderActivity) C10677s.this.getActivity()).mo37965C();
                    C10677s.this.f29223b.mo23615f(((DefaultBean) response.body()).getMessage(), C10677s.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    public C10677s() {
        String str = "";
        this.f29208U = str;
        this.f29210V = str;
        this.f29212W = str;
        this.f29214X = str;
        this.f29242k0 = false;
        this.f29244l0 = 1;
        this.f29246m0 = 2;
        this.f29248n0 = 3;
        this.f29250o0 = C3868i.f12248b;
        this.f29252p0 = str;
        this.f29254q0 = -1;
        this.f29256r0 = -1;
        this.f29258s0 = -1;
        String str2 = "-1";
        this.f29260t0 = str2;
        this.f29262u0 = str2;
        this.f29264v0 = str2;
        float f = C11644i.f33240Y6;
        this.f29265w0 = f;
        this.f29266x0 = f;
        this.f29267y0 = f;
        this.f29268z0 = Boolean.valueOf(true);
        this.f29184D0 = new ArrayList();
        this.f29185E0 = new ArrayList();
        this.f29186F0 = 1;
        this.f29187G0 = null;
        this.f29213W0 = 1;
        this.f29215X0 = 1;
        this.f29241j1 = false;
        this.f29247m1 = new Handler();
        this.f29251o1 = false;
        this.f29253p1 = str;
        this.f29255q1 = str;
        this.f29257r1 = str;
        this.f29263u1 = 0;
    }

    /* renamed from: B */
    private void m49172B() {
        String[] strArr = {"1 HOUR", "2 HOURS", "3 HOURS", "1 Day", "2 Days", "3 Days", "1 Week", "2 Weeks", "3 Weeks"};
        String[] strArr2 = {"1 ساعة", "2 ساعة", "3 ساعات", "1 يوم", "2 أيام", "3 أيام", "1 أسبوع", "2 أسابيع", "3 أسابيع"};
        String[] strArr3 = {"1:H", "2:H", "3:H", "1:D", "2:D", "3:D", "1:W", "2:W", "3:W"};
        for (int i = 0; i < strArr.length; i++) {
            if (C11644i.f33183R5.equalsIgnoreCase(this.f29223b.mo23478H())) {
                this.f29184D0.add(strArr[i]);
            } else {
                this.f29184D0.add(strArr2[i]);
            }
            this.f29185E0.add(strArr3[i]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m49173C() {
        if (isAdded()) {
            try {
                if (!(this.f29201Q0 == null || this.f29240j0 == null || this.f29223b == null)) {
                    this.f29201Q0.clear();
                    this.f29209U0 = new ArrayList<>();
                    String vShopPic = this.f29242k0 ? this.f29240j0.f16955b.getShop().getvIcon() : this.f29240j0.f16955b.getShop().getVShopPic();
                    if (vShopPic != null) {
                        if (!vShopPic.equals("")) {
                            C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(vShopPic).mo9441j().mo9458b(new C10690m());
                        }
                    }
                    for (int i = 0; i < this.f29240j0.f16955b.getShop().getBranchList().size(); i++) {
                        if (((BranchBean) this.f29240j0.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                            this.f29209U0.add(this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49194a((Bitmap) null, (BranchBean) this.f29240j0.f16955b.getShop().getBranchList().get(i))))).position(new LatLng(((BranchBean) this.f29240j0.f16955b.getShop().getBranchList().get(i)).getLatitude().doubleValue(), ((BranchBean) this.f29240j0.f16955b.getShop().getBranchList().get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                        }
                    }
                    if (!this.f29242k0) {
                        BranchBean branchBean = new BranchBean();
                        branchBean.setIsSelected(1);
                        branchBean.setDistance(Double.valueOf(this.f29240j0.f16955b.getShop().getDistance_courier_shop()));
                        branchBean.setvName(this.f29240j0.f16955b.getShop().getVName());
                        this.f29209U0.add(this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49194a((Bitmap) null, branchBean)))).position(new LatLng(this.f29240j0.f16955b.getShop().getLatitude().doubleValue(), this.f29240j0.f16955b.getShop().getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                    }
                }
                if (this.f29223b.mo23502X()) {
                    ((CreateOrderActivity) getActivity()).mo37971a(true, false, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0, false, false);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: D */
    private void m49174D() {
        String str = "";
        if (this.f29218Z.getVisibility() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29196O);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f29198P);
            m49210a(false, true, sb2, sb3.toString(), this.f29202R, this.f29204S, false);
        } else if (this.f29221a0.getVisibility() == 0) {
            if (this.f29242k0) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.f29196O);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(this.f29198P);
                m49210a(false, true, sb5, sb6.toString(), this.f29202R, this.f29204S, false);
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(this.f29240j0.f16955b.getShop().getLatitude());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(this.f29240j0.f16955b.getShop().getLongitude());
            m49210a(false, true, sb8, sb9.toString(), this.f29202R, this.f29204S, false);
        } else if (this.f29242k0) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            sb10.append(this.f29196O);
            String sb11 = sb10.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str);
            sb12.append(this.f29198P);
            m49210a(false, true, sb11, sb12.toString(), this.f29202R, this.f29204S, false);
        } else {
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(this.f29240j0.f16955b.getShop().getLatitude());
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(str);
            sb15.append(this.f29240j0.f16955b.getShop().getLongitude());
            m49210a(false, true, sb14, sb15.toString(), this.f29202R, this.f29204S, false);
        }
    }

    /* renamed from: E */
    private void m49175E() {
        this.f29227c1.setVisibility(0);
        this.f29229d1.setVisibility(0);
        String str = "";
        if (this.f29191K0.getText().toString().trim().equals(str)) {
            this.f29222a1.setVisibility(0);
            this.f29227c1.setVisibility(0);
            this.f29227c1.setColorFilter(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.sky_blue_color));
        } else {
            this.f29222a1.setVisibility(8);
            this.f29227c1.setColorFilter(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.gray_3));
        }
        if (this.f29192L0.getText().toString().trim().equals(str)) {
            this.f29221a0.setVisibility(0);
            this.f29229d1.setVisibility(0);
            this.f29229d1.setColorFilter(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.sky_blue_color));
        } else {
            this.f29225b1.setVisibility(8);
            this.f29229d1.setColorFilter(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.gray_3));
        }
        if (this.f29195N0.getVisibility() == 0) {
            this.f29229d1.setVisibility(8);
        }
        if (this.f29193M0.getVisibility() == 0) {
            this.f29227c1.setVisibility(8);
        }
    }

    /* renamed from: F */
    private int m49176F() {
        int i = 0;
        while (i < this.f29197O0.getDelivery_time_options().size()) {
            try {
                if (((DeliveryTimeBean) this.f29197O0.getDelivery_time_options().get(i)).getValue().equalsIgnoreCase(this.f29194N)) {
                    return i;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: G */
    private ViewPager m49177G() {
        if (getActivity() instanceof CreateOrderActivity) {
            return ((CreateOrderActivity) getActivity()).f28798U;
        }
        return null;
    }

    /* renamed from: H */
    private void m49178H() {
        this.f29211V0.setVisibility(8);
    }

    /* renamed from: I */
    private void m49179I() {
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            try {
                this.f29217Y0 = intent.getStringExtra(C11644i.f33431v1);
                this.f29232f0 = intent.getIntExtra(C11644i.f33464z2, 0);
                this.f29234g0 = intent.getIntExtra(C11644i.f33044A2, 0);
                this.f29236h0 = intent.getIntExtra(C11644i.f33052B2, 0);
                this.f29238i0 = intent.getIntExtra(C11644i.f33060C2, 0);
                if (this.f29217Y0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                    this.f29242k0 = false;
                } else if (this.f29217Y0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                    this.f29242k0 = true;
                }
                if (this.f29232f0 == 1) {
                    this.f29200Q = intent.getStringExtra(C11644i.f33084F2);
                    this.f29196O = String.valueOf(intent.getDoubleExtra(C11644i.f33068D2, 0.0d));
                    this.f29198P = String.valueOf(intent.getDoubleExtra(C11644i.f33076E2, 0.0d));
                }
                if (this.f29234g0 == 1) {
                    this.f29206T = intent.getStringExtra(C11644i.f33108I2);
                    this.f29202R = String.valueOf(intent.getDoubleExtra(C11644i.f33092G2, 0.0d));
                    this.f29204S = String.valueOf(intent.getDoubleExtra(C11644i.f33100H2, 0.0d));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: J */
    private void m49180J() {
        this.f29223b = new C5887x(getActivity());
        m49179I();
        MapsInitializer.initialize(getActivity().getApplicationContext());
        C1382h childFragmentManager = getChildFragmentManager();
        this.f29199P0 = (SupportMapFragment) childFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f29199P0 == null) {
            this.f29199P0 = SupportMapFragment.newInstance();
            childFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f29199P0).mo6100f();
        }
        m49172B();
        this.f29186F0 = 0;
        this.f29194N = (String) this.f29185E0.get(this.f29186F0);
        this.f29211V0 = (ProgressBar) this.f29220a.findViewById(C10232R.C10236id.pgBarTime);
        this.f29226c0 = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.mainContent);
        this.f29243k1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.bgOrder);
        this.f29243k1.setOnClickListener(this);
        this.f29245l1 = (TextView) this.f29220a.findViewById(C10232R.C10236id.btnDone);
        this.f29240j0 = (AppSingleton) getActivity().getApplicationContext();
        this.f29224b0 = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.llDeliveryTime);
        this.f29218Z = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.llPickUpLocation);
        this.f29221a0 = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.llDropOffLocation);
        this.f29216Y = (TextView) this.f29220a.findViewById(C10232R.C10236id.tvOrderTime);
        this.f29191K0 = (TextView) this.f29220a.findViewById(C10232R.C10236id.tvPickUpLocation);
        this.f29192L0 = (TextView) this.f29220a.findViewById(C10232R.C10236id.txtDropOffLocation);
        this.f29239i1 = (TextView) this.f29220a.findViewById(C10232R.C10236id.tvTitle);
        this.f29231e1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivDotLine);
        this.f29235g1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivPickUp);
        this.f29237h1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivArrowTime);
        this.f29233f1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivDropUp);
        this.f29222a1 = (TextView) this.f29220a.findViewById(C10232R.C10236id.tvPickLocationPickup);
        this.f29225b1 = (TextView) this.f29220a.findViewById(C10232R.C10236id.tvPickLocationDropOff);
        this.f29227c1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivPickLocationPickup);
        this.f29229d1 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivPickLocationDropOff);
        this.f29228d0 = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.llPickUpLocationRoot);
        this.f29230e0 = (LinearLayout) this.f29220a.findViewById(C10232R.C10236id.llDropOffLocationRoot);
        this.f29218Z.setOnClickListener(this);
        this.f29221a0.setOnClickListener(this);
        this.f29193M0 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivPickUpStar);
        this.f29195N0 = (ImageView) this.f29220a.findViewById(C10232R.C10236id.ivDropOffStar);
        this.f29193M0.setOnClickListener(this);
        this.f29195N0.setOnClickListener(this);
        m49185O();
        ShopDetails shopDetails = this.f29240j0.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            getActivity().finish();
            return;
        }
        this.f29224b0.setOnClickListener(this);
        try {
            if (this.f29223b.mo23624h() && this.f29223b.mo23502X() && this.f29223b.mo23500V() && this.f29201Q0 == null) {
                this.f29199P0.getMapAsync(new C10687j());
            }
            if (this.f29223b != null && this.f29223b.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                this.f29223b.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f29251o1 = this.f29223b.mo23496R();
        if (this.f29251o1) {
            this.f29223b.mo23608d(this.f29191K0, this.f29192L0);
            this.f29223b.mo23561a(this.f29229d1, this.f29237h1, this.f29227c1);
        }
    }

    /* renamed from: K */
    private boolean m49181K() {
        if (this.f29242k0) {
            m49184N();
        }
        if (this.f29242k0 && this.f29240j0.f16955b.getShop().getbIsPickupAvailable().intValue() != 0) {
            String str = this.f29200Q;
            if (str == null || str.length() == 0) {
                return false;
            }
        }
        if (this.f29242k0) {
            String str2 = this.f29206T;
            if (str2 == null || str2.length() == 0) {
                return false;
            }
        }
        if (!this.f29242k0) {
            String str3 = this.f29206T;
            if (str3 == null || str3.length() == 0) {
                return false;
            }
        }
        String str4 = this.f29194N;
        if (str4 == null || str4.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    private void m49182L() {
        if (this.f29268z0.booleanValue()) {
            double parseDouble = Double.parseDouble(this.f29223b.mo23468C().mo23459f(C11644i.f33303g));
            double parseDouble2 = Double.parseDouble(this.f29223b.mo23468C().mo23459f(C11644i.f33312h));
            if (!(this.f29242k0 && this.f29232f0 == 0 && this.f29234g0 == 0)) {
                if (this.f29218Z.getVisibility() == 0 && this.f29218Z.isEnabled()) {
                    List c = m49222c(true);
                    int i = 0;
                    while (i < c.size()) {
                        int i2 = i;
                        float b = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c.get(i)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c.get(i)).getLongitude().doubleValue());
                        if (this.f29266x0 > b) {
                            this.f29266x0 = b;
                            this.f29256r0 = i2;
                            this.f29262u0 = ((BookmarkPlaceBean) c.get(i2)).getId();
                        }
                        i = i2 + 1;
                    }
                }
                if (this.f29221a0.getVisibility() == 0 && this.f29221a0.isEnabled()) {
                    List c2 = m49222c(false);
                    if (this.f29242k0) {
                        for (int i3 = 0; i3 < c2.size(); i3++) {
                            float b2 = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c2.get(i3)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c2.get(i3)).getLongitude().doubleValue());
                            if (this.f29265w0 > b2) {
                                this.f29265w0 = b2;
                                this.f29254q0 = i3;
                                this.f29260t0 = ((BookmarkPlaceBean) c2.get(i3)).getId();
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < c2.size(); i4++) {
                            float b3 = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c2.get(i4)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c2.get(i4)).getLongitude().doubleValue());
                            if (this.f29267y0 > b3) {
                                this.f29267y0 = b3;
                                this.f29258s0 = i4;
                                this.f29264v0 = ((BookmarkPlaceBean) c2.get(i4)).getId();
                            }
                        }
                    }
                }
            }
            if (this.f29256r0 != -1) {
                this.f29182B0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getPickup().get(this.f29256r0);
                this.f29196O = String.valueOf(this.f29182B0.getLatitude());
                this.f29198P = String.valueOf(this.f29182B0.getLongitude());
                this.f29182B0.setBookmark(true);
                m49225c(false, true, true, false);
            }
            if (this.f29254q0 != -1) {
                this.f29183C0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getDropoff().get(this.f29254q0);
                this.f29202R = String.valueOf(this.f29183C0.getLatitude());
                this.f29204S = String.valueOf(this.f29183C0.getLongitude());
                this.f29183C0.setBookmark(true);
                m49218b(false, true, true, false);
            }
            if (this.f29258s0 != -1) {
                this.f29181A0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getDelivery().get(this.f29258s0);
                this.f29202R = String.valueOf(this.f29181A0.getLatitude());
                this.f29204S = String.valueOf(this.f29181A0.getLongitude());
                this.f29181A0.setBookmark(true);
                m49211a(false, true, true, false);
            }
            if ((this.f29221a0.getVisibility() == 0 && this.f29254q0 == -1 && this.f29258s0 == -1) || (this.f29218Z.getVisibility() == 0 && this.f29256r0 == -1)) {
                ((CreateOrderActivity) getActivity()).mo37965C();
                m49174D();
            } else if (this.f29221a0.getVisibility() == 8 && this.f29218Z.getVisibility() == 8) {
                ((CreateOrderActivity) getActivity()).mo37965C();
                m49174D();
            } else {
                m49174D();
            }
            this.f29268z0 = Boolean.valueOf(false);
            mo38087z();
        }
    }

    /* renamed from: M */
    private void m49183M() {
        boolean z;
        if (!TextUtils.isEmpty(this.f29194N)) {
            int i = 0;
            while (true) {
                if (i >= this.f29197O0.getDelivery_time_options().size()) {
                    z = true;
                    break;
                } else if (((DeliveryTimeBean) this.f29197O0.getDelivery_time_options().get(i)).getValue().equalsIgnoreCase(this.f29194N)) {
                    this.f29186F0 = i;
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f29194N = (String) this.f29185E0.get(this.f29186F0);
                m49188R();
                this.f29186F0 = 0;
            }
            if (this.f29216Y.getText().toString().trim().equals("")) {
                m49188R();
            }
        }
    }

    /* renamed from: N */
    private void m49184N() {
        if (this.f29240j0.f16955b.getShop().getbIsPickupAvailable().intValue() == 0) {
            String str = "";
            this.f29200Q = str;
            this.f29196O = str;
            this.f29198P = str;
        }
    }

    /* renamed from: O */
    private void m49185O() {
        boolean z = this.f29236h0 == 1;
        boolean z2 = !this.f29242k0 || this.f29238i0 == 1;
        boolean z3 = this.f29232f0 != 1;
        boolean z4 = this.f29234g0 != 1;
        this.f29218Z.setVisibility(z ? 0 : 8);
        this.f29221a0.setVisibility(z2 ? 0 : 8);
        this.f29218Z.setEnabled(z3);
        this.f29218Z.setClickable(z3);
        this.f29221a0.setEnabled(z4);
        this.f29221a0.setClickable(z4);
        if (!z || !z3) {
            LayoutParams layoutParams = (LayoutParams) this.f29221a0.getLayoutParams();
            layoutParams.removeRule(3);
            this.f29221a0.setLayoutParams(layoutParams);
            this.f29218Z.setVisibility(8);
            this.f29191K0.setText(this.f29200Q);
            this.f29235g1.setVisibility(8);
            this.f29241j1 = true;
        } else {
            this.f29235g1.setVisibility(0);
            this.f29241j1 = false;
        }
        if (!z2 || !z4) {
            this.f29221a0.setVisibility(8);
            this.f29192L0.setText(this.f29206T);
            this.f29233f1.setVisibility(8);
        } else {
            this.f29233f1.setVisibility(0);
        }
        m49175E();
        if (z3 && z4 && z2 && z) {
            this.f29239i1.setText(getString(C10232R.string.lbl_destinations));
            this.f29231e1.setVisibility(0);
        } else if (!z || !z3) {
            this.f29231e1.setVisibility(8);
        } else {
            this.f29239i1.setText(getString(C10232R.string.lbl_pickup_new));
            this.f29231e1.setVisibility(8);
        }
        if (!z3 && !z4) {
            this.f29235g1.setVisibility(8);
            this.f29233f1.setVisibility(8);
        }
        mo38087z();
    }

    /* renamed from: P */
    private void m49186P() {
        Dialog dialog = this.f29187G0;
        if ((dialog == null || !dialog.isShowing()) && this.f29184D0.size() != 0) {
            View inflate = LayoutInflater.from(getActivity()).inflate(C10232R.layout.custom_wheel_view_new, null);
            ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.imgUp);
            ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.imgDown);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtOk);
            TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.txtCancel);
            WheelViewNew wheelViewNew = (WheelViewNew) inflate.findViewById(C10232R.C10236id.wheel_view_wv);
            wheelViewNew.setSelectorCenterView(inflate.findViewById(C10232R.C10236id.vSelector));
            wheelViewNew.setOffset(1);
            wheelViewNew.setItems(this.f29184D0);
            this.f29186F0 = m49176F();
            wheelViewNew.setSeletion(this.f29186F0);
            this.f29187G0 = new Dialog(getActivity());
            this.f29187G0.requestWindowFeature(1);
            this.f29187G0.setContentView(inflate);
            C5887x xVar = this.f29223b;
            if (xVar != null) {
                xVar.mo23535a(this.f29187G0);
            }
            if (!getActivity().isFinishing()) {
                this.f29187G0.show();
            }
            wheelViewNew.setmOnWheelItemClickListner(new C10681d(wheelViewNew));
            wheelViewNew.setOnWheelViewListener(new C10682e());
            imageView.setOnClickListener(new C10683f(wheelViewNew));
            imageView2.setOnClickListener(new C10684g(wheelViewNew));
            textView.setOnClickListener(new C10685h());
            textView2.setOnClickListener(new C10686i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m49187Q() {
        this.f29211V0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m49188R() {
        this.f29216Y.setText((CharSequence) this.f29184D0.get(this.f29186F0));
        this.f29216Y.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m49189S() {
        Builder builder = new Builder();
        this.f29263u1 = 0;
        Iterator it = this.f29209U0.iterator();
        while (it.hasNext()) {
            builder.include(((Marker) it.next()).getPosition());
            this.f29263u1++;
        }
        Marker marker = this.f29203R0;
        if (marker != null) {
            builder.include(marker.getPosition());
            this.f29263u1++;
        }
        Marker marker2 = this.f29205S0;
        if (marker2 != null) {
            builder.include(marker2.getPosition());
            this.f29263u1++;
        }
        Marker marker3 = this.f29207T0;
        if (marker3 != null) {
            builder.include(marker3.getPosition());
            this.f29263u1++;
        }
        new Handler().postDelayed(new C10691n(builder), 10);
    }

    /* renamed from: A */
    public void mo38074A() {
        try {
            if (this.f29218Z.getVisibility() == 0) {
                if (m49222c(true).size() <= 0 && !this.f29223b.mo23468C().mo23450a(C11644i.f33320h7)) {
                    this.f29247m1.postDelayed(new C10688k(), 2000);
                }
            } else if (this.f29221a0.getVisibility() == 0 && m49222c(false).size() <= 0 && !this.f29223b.mo23468C().mo23450a(C11644i.f33329i7)) {
                this.f29247m1.postDelayed(new C10689l(), 2000);
            }
        } catch (Exception unused) {
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = "selectedFloorNo";
        String str2 = "selectedAddress";
        String str3 = "selectedLng";
        String str4 = "selectedLat";
        String str5 = "-1";
        if (i == 888 && i2 == -1) {
            try {
                m49187Q();
                if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                    this.f29258s0 = -1;
                    this.f29264v0 = str5;
                    this.f29202R = intent.getExtras().getString(str4);
                    this.f29204S = intent.getExtras().getString(str3);
                    this.f29206T = intent.getExtras().getString(str2);
                    this.f29208U = intent.getExtras().getString("selectedArea");
                    this.f29210V = intent.getExtras().getString(str);
                    if (this.f29181A0 == null) {
                        this.f29181A0 = new BookmarkPlaceBean();
                    }
                    this.f29181A0.setLongitude(Double.valueOf(Double.parseDouble(this.f29204S)));
                    this.f29181A0.setLatitude(Double.valueOf(Double.parseDouble(this.f29202R)));
                    this.f29181A0.setSubAddress(this.f29210V);
                    this.f29181A0.setAddress(this.f29206T);
                    this.f29181A0.setDeliveryArea(this.f29208U);
                    this.f29181A0.setBookmark(false);
                    m49211a(true, true, true, true);
                    return;
                }
                ((CreateOrderActivity) getActivity()).mo37971a(true, false, intent.getExtras().getString(C11644i.f33415t1), 1, false, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 933 && i2 == -1) {
            m49187Q();
            if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                this.f29256r0 = -1;
                this.f29262u0 = str5;
                this.f29196O = intent.getExtras().getString(str4);
                this.f29198P = intent.getExtras().getString(str3);
                this.f29200Q = intent.getExtras().getString(str2);
                this.f29212W = intent.getExtras().getString(str);
                if (this.f29182B0 == null) {
                    this.f29182B0 = new BookmarkPlaceBean();
                }
                this.f29182B0.setLongitude(Double.valueOf(Double.parseDouble(this.f29198P)));
                this.f29182B0.setLatitude(Double.valueOf(Double.parseDouble(this.f29196O)));
                this.f29182B0.setSubAddress(this.f29212W);
                this.f29182B0.setAddress(this.f29200Q);
                this.f29182B0.setBookmark(false);
                m49225c(true, true, true, true);
                return;
            }
            ((CreateOrderActivity) getActivity()).mo37971a(true, false, intent.getExtras().getString(C11644i.f33415t1), 2, false, true);
        } else if (i == 866 && i2 == -1) {
            m49187Q();
            if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                this.f29254q0 = -1;
                this.f29260t0 = str5;
                this.f29202R = intent.getExtras().getString(str4);
                this.f29204S = intent.getExtras().getString(str3);
                this.f29206T = intent.getExtras().getString(str2);
                this.f29214X = intent.getExtras().getString(str);
                if (this.f29183C0 == null) {
                    this.f29183C0 = new BookmarkPlaceBean();
                }
                this.f29183C0.setLongitude(Double.valueOf(Double.parseDouble(this.f29204S)));
                this.f29183C0.setLatitude(Double.valueOf(Double.parseDouble(this.f29202R)));
                this.f29183C0.setSubAddress(this.f29214X);
                this.f29183C0.setAddress(this.f29206T);
                this.f29183C0.setBookmark(false);
                m49218b(true, true, true, true);
                return;
            }
            ((CreateOrderActivity) getActivity()).mo37971a(true, false, intent.getExtras().getString(C11644i.f33415t1), 3, false, true);
        }
    }

    public void onClick(View view) {
        String str = "";
        int i = 1;
        switch (view.getId()) {
            case C10232R.C10236id.bgOrder /*2131361931*/:
                ((CreateOrderActivity) getActivity()).mo37966D();
                return;
            case C10232R.C10236id.btnTooltipDone /*2131361987*/:
                C15792c cVar = this.f29189I0;
                if (cVar != null && cVar.mo52000b()) {
                    boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
                    this.f29223b.mo23468C().mo23448a(booleanValue ? C11644i.f33320h7 : C11644i.f33329i7, Boolean.valueOf(true));
                    this.f29189I0.mo51999a();
                    m49233f(booleanValue);
                    return;
                }
                return;
            case C10232R.C10236id.ivDropOffStar /*2131362778*/:
                if (this.f29242k0) {
                    i = 3;
                }
                m49215b(i, this.f29192L0.getText().toString());
                return;
            case C10232R.C10236id.ivPickUpStar /*2131362834*/:
                m49215b(2, this.f29191K0.getText().toString());
                return;
            case C10232R.C10236id.llDeliveryTime /*2131363020*/:
                if (this.f29257r1.equals(str)) {
                    this.f29257r1 = this.f29216Y.getText().toString().trim();
                }
                if (this.f29211V0.getVisibility() == 8) {
                    m49186P();
                    return;
                }
                return;
            case C10232R.C10236id.llDropOffLocation /*2131363037*/:
                if (this.f29255q1.equals(str)) {
                    this.f29255q1 = this.f29192L0.getText().toString().trim();
                }
                this.f29261t1 = true;
                if (m49222c(false).size() > 0) {
                    m49238h(false);
                    return;
                } else if (!this.f29223b.mo23468C().mo23450a(C11644i.f33329i7)) {
                    m49241i(false);
                    return;
                } else {
                    m49233f(false);
                    return;
                }
            case C10232R.C10236id.llLeft /*2131363064*/:
                getActivity().onBackPressed();
                return;
            case C10232R.C10236id.llPickUpLocation /*2131363123*/:
                this.f29259s1 = true;
                if (this.f29253p1.equals(str)) {
                    this.f29253p1 = this.f29191K0.getText().toString().trim();
                }
                if (m49222c(true).size() > 0) {
                    m49238h(true);
                    return;
                } else if (!this.f29223b.mo23468C().mo23450a(C11644i.f33320h7)) {
                    m49241i(true);
                    return;
                } else {
                    m49233f(true);
                    return;
                }
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f29220a = layoutInflater.inflate(C10232R.layout.fragment_create_order_2, viewGroup, false);
        return this.f29220a;
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(getActivity());
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m49180J();
    }

    /* renamed from: y */
    public /* synthetic */ void mo38086y() {
        this.f29188H0.mo52003e();
    }

    /* renamed from: z */
    public void mo38087z() {
        try {
            if (!m49181K()) {
                this.f29245l1.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.gray_3));
                this.f29245l1.setEnabled(false);
                this.f29243k1.setEnabled(false);
                return;
            }
            this.f29245l1.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.sky_blue_color));
            this.f29245l1.setEnabled(true);
            this.f29243k1.setEnabled(true);
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private View m49230e(boolean z) {
        C11551e a = C11551e.m52070a(getLayoutInflater());
        a.f32699t0.setText(m49229d(z));
        a.f32695p0.setText(getString(C10232R.string.lbl_ok_got_it));
        a.f32695p0.setTag(Boolean.valueOf(z));
        a.f32695p0.setOnClickListener(this);
        return a.mo5538m();
    }

    /* renamed from: f */
    private void m49233f(boolean z) {
        if (z) {
            m49223c(2);
        } else if (this.f29242k0) {
            m49223c(3);
        } else {
            m49223c(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m49236g(boolean z) {
        CheckDiscountBean checkDiscountBean = this.f29197O0;
        if (checkDiscountBean != null && checkDiscountBean.getDelivery_time_options().size() > 1) {
            this.f29184D0.clear();
            this.f29185E0.clear();
            for (int i = 0; i < this.f29197O0.getDelivery_time_options().size(); i++) {
                this.f29184D0.add(((DeliveryTimeBean) this.f29197O0.getDelivery_time_options().get(i)).getText());
                this.f29185E0.add(((DeliveryTimeBean) this.f29197O0.getDelivery_time_options().get(i)).getValue());
            }
            if (z && this.f29194N == null) {
                this.f29186F0 = 0;
                this.f29194N = (String) this.f29185E0.get(this.f29186F0);
                m49188R();
            }
            m49183M();
        }
        m49178H();
        mo38087z();
    }

    /* renamed from: h */
    private boolean m49239h(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f29223b.mo23497S();
        }
        this.f29223b.mo23615f(getResources().getString(C10232R.string.lbl_enter_name), getResources().getString(C10232R.string.app_name));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m49241i(boolean z) {
        try {
            if (this.f29189I0 != null && this.f29189I0.mo52000b()) {
                this.f29189I0.mo51999a();
            }
            this.f29189I0 = new C15800h(requireContext()).mo52035c(m49230e(z)).mo52031b((View) z ? this.f29228d0 : this.f29230e0).mo52023a(C15801a.none).mo52024a(C15802b.center).mo52037d(50).mo52027a();
            if (m49177G() != null && m49177G().getCurrentItem() == 1) {
                this.f29189I0.mo52001c();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: w */
    public /* synthetic */ void mo38084w() {
        this.f29188H0.mo52003e();
    }

    /* renamed from: x */
    public /* synthetic */ void mo38085x() {
        this.f29188H0.mo52003e();
    }

    /* renamed from: d */
    private SpannableStringBuilder m49229d(boolean z) {
        SpannableStringBuilder spannableStringBuilder = this.f29249n1;
        if (spannableStringBuilder == null) {
            this.f29249n1 = new SpannableStringBuilder(getString(C10232R.string.lbl_you_can_select_your));
        } else {
            spannableStringBuilder.clear();
            this.f29249n1.append(getString(C10232R.string.lbl_you_can_select_your));
        }
        SpannableString spannableString = new SpannableString(getString(z ? C10232R.string.lbl_pickup : C10232R.string.lbl_drop_off));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
        SpannableStringBuilder spannableStringBuilder2 = this.f29249n1;
        String str = C3868i.f12248b;
        spannableStringBuilder2.append(str);
        this.f29249n1.append(spannableString);
        this.f29249n1.append(str);
        this.f29249n1.append(getString(C10232R.string.lbl_location_from_here));
        return this.f29249n1;
    }

    /* renamed from: c */
    private List<BookmarkPlaceBean> m49222c(boolean z) {
        List delivery;
        ArrayList arrayList = new ArrayList();
        if (z) {
            try {
                delivery = this.f29197O0.getBookmarks().getPickup();
            } catch (Exception unused) {
                return arrayList;
            }
        } else if (this.f29242k0) {
            delivery = this.f29197O0.getBookmarks().getDropoff();
        } else {
            delivery = this.f29197O0.getBookmarks().getDelivery();
        }
        return delivery;
    }

    /* renamed from: h */
    private void m49238h(boolean z) {
        C15792c cVar = this.f29188H0;
        if (cVar == null || !cVar.mo52000b()) {
            View inflate = LayoutInflater.from(getActivity()).inflate(C10232R.layout.dialog_location, null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10232R.C10236id.rvLocation);
            ((LinearLayout) inflate.findViewById(C10232R.C10236id.llMap)).setOnClickListener(new C10634g(this, z));
            WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
            wrapContentLinearLayoutManager.mo7000l(1);
            recyclerView.setLayoutManager(wrapContentLinearLayoutManager);
            recyclerView.setItemAnimator(this.f29223b.mo23672x());
            this.f29190J0 = new C10641n(m49222c(z), new C10680c(z));
            recyclerView.setAdapter(this.f29190J0);
            this.f29188H0 = new C15800h(requireContext()).mo52021a(inflate).mo52031b((View) z ? this.f29228d0 : this.f29230e0).mo52023a(C15801a.outside).mo52024a(C15802b.center).mo52037d(50).mo52027a();
            this.f29188H0.mo52001c();
        }
    }

    /* renamed from: b */
    private void m49215b(int i, String str) {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_bookmark_location);
        dialog.setCancelable(true);
        C5887x xVar = this.f29223b;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        MaterialButton materialButton = (MaterialButton) dialog.findViewById(C10232R.C10236id.tvSave);
        MaterialButton materialButton2 = (MaterialButton) dialog.findViewById(C10232R.C10236id.tvCancel);
        MaterialButton materialButton3 = (MaterialButton) dialog.findViewById(C10232R.C10236id.btnHome);
        MaterialButton materialButton4 = (MaterialButton) dialog.findViewById(C10232R.C10236id.btnOffice);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvAddress)).setText(str);
        EditText editText = (EditText) dialog.findViewById(C10232R.C10236id.edtTagName);
        materialButton.setOnClickListener(new C10635h(this, editText, dialog, i));
        materialButton2.setOnClickListener(new C10630c(dialog));
        materialButton3.setOnClickListener(new C10637j(this, dialog, i, materialButton3));
        materialButton4.setOnClickListener(new C10631d(this, dialog, i, materialButton4));
        editText.addTextChangedListener(new C10678a(materialButton));
        if (isAdded() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: c */
    private void m49223c(int i) {
        String str = "p_lng";
        String str2 = "p_lat";
        String str3 = "location";
        if (i == 1) {
            Intent intent = new Intent(getActivity(), PicOrderLocationActivityRevisedOrder.class);
            if (this.f29204S != null) {
                intent.putExtra(str2, this.f29202R);
                intent.putExtra(str, this.f29204S);
            }
            intent.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_delivery_location));
            intent.putExtra(C11644i.f33155O1, true);
            intent.putExtra(str3, i);
            startActivityForResult(intent, C11644i.f33414t0);
            getActivity().overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        } else if (i == 2) {
            Intent intent2 = new Intent(getActivity(), PicOrderLocationActivityRevisedOrder.class);
            String str4 = this.f29196O;
            if (str4 != null) {
                intent2.putExtra(str2, str4);
                intent2.putExtra(str, this.f29198P);
            }
            intent2.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_pickup_location));
            intent2.putExtra(C11644i.f33155O1, true);
            intent2.putExtra(str3, i);
            startActivityForResult(intent2, C11644i.f33422u0);
            getActivity().overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        } else if (i == 3) {
            Intent intent3 = new Intent(getActivity(), PicOrderLocationActivityRevisedOrder.class);
            if (this.f29204S != null) {
                intent3.putExtra(str2, this.f29202R);
                intent3.putExtra(str, this.f29204S);
            }
            intent3.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_dropoff_location));
            intent3.putExtra(C11644i.f33155O1, true);
            intent3.putExtra(str3, i);
            startActivityForResult(intent3, C11644i.f33438w0);
            getActivity().overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m49194a(Bitmap bitmap, BranchBean branchBean) {
        C11547a a = C11547a.m52045a(getLayoutInflater());
        try {
            int i = 8;
            a.f32679q0.setVisibility(bitmap != null ? 0 : 8);
            AppCompatImageView appCompatImageView = a.f32680r0;
            if (bitmap == null) {
                i = 0;
            }
            appCompatImageView.setVisibility(i);
            a.f32679q0.setImageBitmap(bitmap);
            a.f32679q0.setBorderWidth((int) getResources().getDimension(C10232R.dimen.dp_1_5));
            CircleImageView circleImageView = a.f32679q0;
            Context requireContext = requireContext();
            boolean z = this.f29241j1;
            int i2 = C10232R.C10234color.color_green_2;
            circleImageView.setBorderColor(C0841b.m4915a(requireContext, z ? C10232R.C10234color.color_green_2 : C10232R.C10234color.sky_blue_color));
            a.f32681s0.setText(branchBean.getTitle());
            a.f32681s0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            a.f32678p0.setBackgroundResource(this.f29241j1 ? C10232R.C10235drawable.bg_map_new_order_pin_pickup : C10232R.C10235drawable.bg_map_new_order_pin_dropoff);
            AppCompatImageView appCompatImageView2 = a.f32680r0;
            Context requireContext2 = requireContext();
            if (!this.f29241j1) {
                i2 = C10232R.C10234color.sky_blue_color;
            }
            C1113f.m6334a((ImageView) appCompatImageView2, ColorStateList.valueOf(C0841b.m4915a(requireContext2, i2)));
        } catch (Exception unused) {
        }
        return a.mo5538m();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public int m49235g(String str) {
        for (int i = 0; i < this.f29184D0.size(); i++) {
            if (((String) this.f29184D0.get(i)).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo38079a(Response<CheckDiscountBean> response) {
        this.f29197O0 = (CheckDiscountBean) response.body();
        m49236g(false);
        m49182L();
    }

    /* renamed from: a */
    public void mo38080a(Response<CheckDiscountBean> response, String str, int i) {
        ((CreateOrderActivity) getActivity()).mo37965C();
        this.f29197O0.getBookmarks().setPickup(((CheckDiscountBean) response.body()).getBookmarks().getPickup());
        this.f29197O0.getBookmarks().setDropoff(((CheckDiscountBean) response.body()).getBookmarks().getDropoff());
        this.f29197O0.getBookmarks().setDelivery(((CheckDiscountBean) response.body()).getBookmarks().getDelivery());
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.f29221a0.getVisibility() == 0 && this.f29221a0.isEnabled()) {
                    if (this.f29197O0.getBookmarks().getDropoff().size() == 0) {
                        C15792c cVar = this.f29188H0;
                        if (cVar != null && cVar.mo52000b()) {
                            this.f29188H0.mo51999a();
                        }
                    }
                    C15792c cVar2 = this.f29188H0;
                    if (cVar2 != null && cVar2.mo52000b()) {
                        C10641n nVar = this.f29190J0;
                        if (nVar != null) {
                            nVar.mo38037a(this.f29197O0.getBookmarks().getDropoff());
                            this.f29190J0.mo7341e();
                            this.f29247m1.postDelayed(new C10632e(this), 500);
                        }
                    }
                }
            } else if (this.f29218Z.getVisibility() == 0 && this.f29218Z.isEnabled()) {
                if (this.f29197O0.getBookmarks().getPickup().size() == 0) {
                    C15792c cVar3 = this.f29188H0;
                    if (cVar3 != null && cVar3.mo52000b()) {
                        this.f29188H0.mo51999a();
                    }
                }
                C15792c cVar4 = this.f29188H0;
                if (cVar4 != null && cVar4.mo52000b()) {
                    C10641n nVar2 = this.f29190J0;
                    if (nVar2 != null) {
                        nVar2.mo38037a(this.f29197O0.getBookmarks().getPickup());
                        this.f29190J0.mo7341e();
                        this.f29247m1.postDelayed(new C10633f(this), 500);
                    }
                }
            }
        } else if (this.f29221a0.getVisibility() == 0 && this.f29221a0.isEnabled()) {
            if (this.f29197O0.getBookmarks().getDelivery().size() == 0) {
                C15792c cVar5 = this.f29188H0;
                if (cVar5 != null && cVar5.mo52000b()) {
                    this.f29188H0.mo51999a();
                }
            }
            C15792c cVar6 = this.f29188H0;
            if (cVar6 != null && cVar6.mo52000b()) {
                C10641n nVar3 = this.f29190J0;
                if (nVar3 != null) {
                    nVar3.mo38037a(this.f29197O0.getBookmarks().getDelivery());
                    this.f29190J0.mo7341e();
                    this.f29247m1.postDelayed(new C10636i(this), 500);
                }
            }
        }
        String str2 = "-1";
        if (this.f29218Z.getVisibility() == 0 && this.f29218Z.isEnabled()) {
            if (!this.f29262u0.equals(str2)) {
                this.f29256r0 = m49192a(this.f29197O0.getBookmarks().getPickup(), this.f29262u0);
            }
            if (this.f29256r0 != -1) {
                this.f29182B0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getPickup().get(this.f29256r0);
                this.f29182B0.setBookmark(true);
            } else {
                this.f29262u0 = str2;
                BookmarkPlaceBean bookmarkPlaceBean = this.f29182B0;
                if (bookmarkPlaceBean != null) {
                    bookmarkPlaceBean.setBookmark(false);
                }
            }
            m49225c(false, false, true, false);
        }
        if (this.f29221a0.getVisibility() == 0 && this.f29221a0.isEnabled()) {
            if (this.f29242k0) {
                if (!this.f29260t0.equals(str2)) {
                    this.f29254q0 = m49192a(this.f29197O0.getBookmarks().getDropoff(), this.f29260t0);
                }
                if (this.f29254q0 != -1) {
                    this.f29183C0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getDropoff().get(this.f29254q0);
                    this.f29183C0.setBookmark(true);
                } else {
                    this.f29260t0 = str2;
                    BookmarkPlaceBean bookmarkPlaceBean2 = this.f29183C0;
                    if (bookmarkPlaceBean2 != null) {
                        bookmarkPlaceBean2.setBookmark(false);
                    }
                }
                m49218b(false, false, true, false);
                return;
            }
            if (!this.f29264v0.equals(str2)) {
                this.f29258s0 = m49192a(this.f29197O0.getBookmarks().getDelivery(), this.f29264v0);
            }
            if (this.f29258s0 != -1) {
                this.f29181A0 = (BookmarkPlaceBean) this.f29197O0.getBookmarks().getDelivery().get(this.f29258s0);
                this.f29181A0.setBookmark(true);
            } else {
                this.f29264v0 = str2;
                BookmarkPlaceBean bookmarkPlaceBean3 = this.f29181A0;
                if (bookmarkPlaceBean3 != null) {
                    bookmarkPlaceBean3.setBookmark(false);
                }
            }
            m49211a(false, false, true, false);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo38082b(Dialog dialog, int i, MaterialButton materialButton, View view) {
        dialog.dismiss();
        m49201a(i, materialButton.getText().toString());
        this.f29223b.mo23494P();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m49218b(boolean z, boolean z2, boolean z3, boolean z4) {
        if (isAdded()) {
            BookmarkPlaceBean bookmarkPlaceBean = this.f29183C0;
            if (bookmarkPlaceBean != null) {
                this.f29202R = bookmarkPlaceBean.getLatitude().toString();
                this.f29204S = this.f29183C0.getLongitude().toString();
                this.f29206T = this.f29183C0.getAddress();
                this.f29214X = this.f29183C0.getSubAddress();
                m49209a(false, this.f29183C0.isBookmark());
                String string = getString(C10232R.string.lbl_delivery);
                if (this.f29183C0.isBookmark()) {
                    string = this.f29183C0.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("0 ");
                    sb.append(this.f29183C0.getName());
                    sb.append(" | ");
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m49199a(3));
                    sb3.append(this.f29206T);
                    String sb4 = sb3.toString();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(sb2);
                    sb5.append(sb4);
                    SpannableString spannableString = new SpannableString(sb5.toString());
                    Drawable c = C0841b.m4928c(getActivity(), C10232R.C10235drawable.img_yellow_star_fill);
                    c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                    spannableString.setSpan(new C11738n(c), 0, 1, 34);
                    spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
                    spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
                    this.f29192L0.setText(spannableString);
                } else {
                    TextView textView = this.f29192L0;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(m49199a(3));
                    sb6.append(this.f29206T);
                    textView.setText(sb6.toString());
                }
                m49175E();
                this.f29192L0.setVisibility(0);
                if (!(this.f29201Q0 == null || this.f29240j0 == null || this.f29223b == null)) {
                    try {
                        if (this.f29205S0 != null) {
                            this.f29205S0.remove();
                        }
                        this.f29205S0 = this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49196a(false, string)))).position(new LatLng(Double.parseDouble(this.f29202R), Double.parseDouble(this.f29204S))).anchor(0.5f, 1.0f));
                        m49189S();
                    } catch (Exception unused) {
                    }
                }
                if (z) {
                    StringBuilder sb7 = new StringBuilder();
                    String str = "";
                    sb7.append(str);
                    sb7.append(this.f29196O);
                    String sb8 = sb7.toString();
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(str);
                    sb9.append(this.f29198P);
                    m49210a(z2, z3, sb8, sb9.toString(), this.f29202R, this.f29204S, z4);
                } else {
                    mo38087z();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49225c(boolean z, boolean z2, boolean z3, boolean z4) {
        BookmarkPlaceBean bookmarkPlaceBean = this.f29182B0;
        if (bookmarkPlaceBean != null) {
            this.f29196O = bookmarkPlaceBean.getLatitude().toString();
            this.f29198P = this.f29182B0.getLongitude().toString();
            this.f29200Q = this.f29182B0.getAddress();
            this.f29212W = this.f29182B0.getSubAddress();
            m49209a(true, this.f29182B0.isBookmark());
            String string = getString(C10232R.string.lbl_pickup);
            if (this.f29182B0.isBookmark()) {
                string = this.f29182B0.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("0 ");
                sb.append(this.f29182B0.getName());
                sb.append(" | ");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m49199a(2));
                sb3.append(this.f29200Q);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append(sb4);
                SpannableString spannableString = new SpannableString(sb5.toString());
                Drawable c = C0841b.m4928c(getActivity(), C10232R.C10235drawable.img_yellow_star_fill);
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                spannableString.setSpan(new C11738n(c), 0, 1, 34);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
                this.f29191K0.setText(spannableString);
            } else {
                TextView textView = this.f29191K0;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m49199a(2));
                sb6.append(this.f29200Q);
                textView.setText(sb6.toString());
            }
            m49175E();
            if (!(this.f29201Q0 == null || this.f29240j0 == null || this.f29223b == null)) {
                Marker marker = this.f29203R0;
                if (marker != null) {
                    marker.remove();
                }
                this.f29203R0 = this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49196a(true, string)))).position(new LatLng(Double.parseDouble(this.f29196O), Double.parseDouble(this.f29198P))).anchor(0.5f, 1.0f));
                m49189S();
            }
            if (z) {
                StringBuilder sb7 = new StringBuilder();
                String str = "";
                sb7.append(str);
                sb7.append(this.f29196O);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(this.f29198P);
                m49210a(z2, z3, sb8, sb9.toString(), this.f29202R, this.f29204S, z4);
            } else {
                mo38087z();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m49192a(List<BookmarkPlaceBean> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (((BookmarkPlaceBean) list.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m49210a(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3) {
        if (isAdded()) {
            C5887x xVar = this.f29223b;
            if (xVar != null && xVar.mo23502X()) {
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    String str5 = "null";
                    if (!str.equalsIgnoreCase(str5) && !str2.equalsIgnoreCase(str5) && !str3.equalsIgnoreCase(str5) && !str4.equalsIgnoreCase(str5)) {
                        if (z && !z3) {
                            ((CreateOrderActivity) getActivity()).mo37967E();
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("current_user_id", this.f29223b.mo23476G());
                        hashMap.put("auth_token", this.f29223b.mo23640m());
                        hashMap.put(C11687c.f33862z0, this.f29240j0.f16955b.getShop().getVShopId());
                        hashMap.put(C11687c.f33727T0, String.valueOf(this.f29240j0.f16955b.getShop().isManualBranchSelect()));
                        hashMap.put(C11687c.f33792h2, str);
                        hashMap.put(C11687c.f33796i2, str2);
                        hashMap.put(C11687c.f33800j2, str3);
                        hashMap.put(C11687c.f33804k2, str4);
                        StringBuilder sb = new StringBuilder();
                        sb.append("param: ");
                        sb.append(hashMap);
                        C5880q.m25751b(sb.toString());
                        C11687c.m52645a(this.f29223b).getDeliveryTimeWindow(hashMap).enqueue(new C10692o(z2, z3));
                        return;
                    }
                }
                if (z2 && !z3) {
                    ((CreateOrderActivity) getActivity()).mo37965C();
                }
                m49178H();
                mo38087z();
                if (((CreateOrderActivity) getActivity()).f28811f0) {
                    ((CreateOrderActivity) getActivity()).mo37968G();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49208a(BranchBean branchBean) {
        if (isAdded()) {
            try {
                if (this.f29209U0.size() >= 1) {
                    ((Marker) this.f29209U0.get(0)).remove();
                    this.f29209U0.set(0, this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49194a(this.f29219Z0, branchBean)))).position(new LatLng(branchBean.getLatitude().doubleValue(), branchBean.getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                } else {
                    this.f29209U0.add(this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49194a(this.f29219Z0, branchBean)))).position(new LatLng(branchBean.getLatitude().doubleValue(), branchBean.getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo38076a(int i, int i2) {
        try {
            Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_pos_neg);
            dialog.setCancelable(true);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
            textView.setText(C10232R.string.msg_location_delete_confirm);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
            TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
            textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
            textView2.setText(getResources().getString(C10232R.string.lbl_dg_title_yes));
            textView2.setAllCaps(true);
            textView3.setText(getResources().getString(C10232R.string.lbl_dg_title_no));
            textView3.setAllCaps(true);
            textView2.setOnClickListener(new C10693p(dialog, i, i2));
            textView3.setOnClickListener(new C10694q(dialog));
            if (!getActivity().isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49202a(int i, String str, int i2) {
        C5887x xVar = this.f29223b;
        if (xVar != null && xVar.mo23502X()) {
            ((CreateOrderActivity) getActivity()).mo37967E();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29223b.mo23640m());
            hashMap.put(C11687c.f33782f2, str);
            C11687c.m52645a(this.f29223b).callDeleteLocationBookmark(this.f29223b.mo23476G(), hashMap).enqueue(new C10695r(i, i2, str));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo38078a(EditText editText, Dialog dialog, int i, View view) {
        if (m49239h(editText.getText().toString().trim())) {
            dialog.dismiss();
            m49201a(i, editText.getText().toString().trim());
            this.f29223b.mo23494P();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo38077a(Dialog dialog, int i, MaterialButton materialButton, View view) {
        dialog.dismiss();
        m49201a(i, materialButton.getText().toString());
        this.f29223b.mo23494P();
    }

    /* renamed from: a */
    private void m49201a(int i, String str) {
        C5887x xVar = this.f29223b;
        if (xVar != null && xVar.mo23502X()) {
            ((CreateOrderActivity) getActivity()).mo37967E();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29223b.mo23640m());
            hashMap.put(C11687c.f33752Z1, str);
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(i);
            hashMap.put(C11687c.f33757a2, sb.toString());
            String str3 = C11687c.f33777e2;
            String str4 = C11687c.f33772d2;
            String str5 = C11687c.f33767c2;
            String str6 = C11687c.f33762b2;
            if (i == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(this.f29206T);
                hashMap.put(str6, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(this.f29202R);
                hashMap.put(str5, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(this.f29204S);
                hashMap.put(str4, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(this.f29210V);
                hashMap.put(str3, sb5.toString());
            } else if (i == 2) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(this.f29200Q);
                hashMap.put(str6, sb6.toString());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(this.f29196O);
                hashMap.put(str5, sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(this.f29198P);
                hashMap.put(str4, sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f29212W);
                hashMap.put(str3, sb9.toString());
            } else if (i == 3) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str2);
                sb10.append(this.f29206T);
                hashMap.put(str6, sb10.toString());
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str2);
                sb11.append(this.f29202R);
                hashMap.put(str5, sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str2);
                sb12.append(this.f29204S);
                hashMap.put(str4, sb12.toString());
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str2);
                sb13.append(this.f29214X);
                hashMap.put(str3, sb13.toString());
            }
            C11687c.m52645a(this.f29223b).callSaveLocationBookmark(this.f29223b.mo23476G(), hashMap).enqueue(new C10679b(i));
        }
    }

    /* renamed from: a */
    private String m49199a(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !TextUtils.isEmpty(this.f29214X)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f29214X);
                    sb.append(this.f29250o0);
                    return sb.toString();
                }
            } else if (!TextUtils.isEmpty(this.f29212W)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f29212W);
                sb2.append(this.f29250o0);
                return sb2.toString();
            }
        } else if (!TextUtils.isEmpty(this.f29210V)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f29210V);
            sb3.append(this.f29250o0);
            return sb3.toString();
        }
        return "";
    }

    /* renamed from: a */
    public /* synthetic */ void mo38081a(boolean z, View view) {
        this.f29188H0.mo51999a();
        m49233f(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49211a(boolean z, boolean z2, boolean z3, boolean z4) {
        BookmarkPlaceBean bookmarkPlaceBean = this.f29181A0;
        if (bookmarkPlaceBean != null) {
            this.f29202R = bookmarkPlaceBean.getLatitude().toString();
            this.f29204S = this.f29181A0.getLongitude().toString();
            this.f29206T = this.f29181A0.getAddress();
            this.f29210V = this.f29181A0.getSubAddress();
            m49209a(false, this.f29181A0.isBookmark());
            String str = "";
            if (this.f29181A0.getDeliveryArea().equals(str)) {
                BookmarkPlaceBean bookmarkPlaceBean2 = this.f29181A0;
                bookmarkPlaceBean2.setDeliveryArea(bookmarkPlaceBean2.getAddress());
                this.f29208U = this.f29181A0.getAddress();
            }
            String string = getString(C10232R.string.lbl_delivery);
            if (this.f29181A0.isBookmark()) {
                string = this.f29181A0.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("0 ");
                sb.append(this.f29181A0.getName());
                sb.append(" | ");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m49199a(1));
                sb3.append(this.f29206T);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append(sb4);
                SpannableString spannableString = new SpannableString(sb5.toString());
                Drawable c = C0841b.m4928c(getActivity(), C10232R.C10235drawable.img_yellow_star_fill);
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                spannableString.setSpan(new C11738n(c), 0, 1, 34);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
                this.f29192L0.setText(spannableString);
            } else {
                TextView textView = this.f29192L0;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m49199a(1));
                sb6.append(this.f29206T);
                textView.setText(sb6.toString());
            }
            m49175E();
            this.f29192L0.setVisibility(0);
            if (!(this.f29201Q0 == null || this.f29240j0 == null || this.f29223b == null)) {
                Marker marker = this.f29207T0;
                if (marker != null) {
                    marker.remove();
                }
                this.f29207T0 = this.f29201Q0.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo38075a((Context) getActivity(), m49196a(false, string)))).position(new LatLng(Double.parseDouble(this.f29202R), Double.parseDouble(this.f29204S))).anchor(0.5f, 1.0f));
                m49189S();
            }
            if (z) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(this.f29240j0.f16955b.getShop().getLatitude());
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(this.f29240j0.f16955b.getShop().getLongitude());
                m49210a(z2, z3, sb8, sb9.toString(), this.f29202R, this.f29204S, z4);
            } else {
                mo38087z();
            }
        }
    }

    /* renamed from: a */
    public Bitmap mo38075a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (this.f29213W0 < createBitmap.getHeight()) {
            this.f29213W0 = createBitmap.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("maxMarkerHeight : ");
            sb.append(this.f29213W0);
            sb.toString();
        }
        if (this.f29215X0 < createBitmap.getWidth()) {
            this.f29215X0 = createBitmap.getWidth();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("maxMarkerWidth : ");
            sb2.append(this.f29215X0);
            sb2.toString();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private void m49209a(boolean z, boolean z2) {
        if (z && this.f29218Z.getVisibility() == 0 && this.f29218Z.isEnabled()) {
            this.f29193M0.setVisibility(0);
            if (z2) {
                this.f29193M0.setVisibility(8);
            }
        } else if (this.f29221a0.getVisibility() == 0 && this.f29221a0.isEnabled()) {
            this.f29195N0.setVisibility(0);
            if (z2) {
                this.f29195N0.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    private View m49196a(boolean z, String str) {
        C11547a a = C11547a.m52045a(getLayoutInflater());
        a.mo39684b(Boolean.valueOf(z));
        a.f32681s0.setText(str);
        int i = z ? C10232R.C10235drawable.ic_pin_pickup_new : C10232R.C10235drawable.ic_pin_dropoff_new;
        CustomeTextViewRobotoRegular customeTextViewRobotoRegular = a.f32681s0;
        int i2 = this.f29251o1 ? 0 : i;
        if (!this.f29251o1) {
            i = 0;
        }
        customeTextViewRobotoRegular.setCompoundDrawablesWithIntrinsicBounds(i2, 0, i, 0);
        a.f32678p0.setBackgroundResource(z ? C10232R.C10235drawable.bg_map_new_order_pin_pickup : C10232R.C10235drawable.bg_map_new_order_pin_dropoff);
        C1113f.m6334a((ImageView) a.f32680r0, ColorStateList.valueOf(C0841b.m4915a(getContext(), z ? C10232R.C10234color.color_green_2 : C10232R.C10234color.sky_blue_color)));
        return a.mo5538m();
    }
}
