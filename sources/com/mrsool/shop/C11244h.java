package com.mrsool.shop;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.github.aakira.expandablelayout.C3902d;
import com.github.aakira.expandablelayout.C3911g;
import com.github.aakira.expandablelayout.ExpandableLinearLayout;
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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.jackandphantom.circularimageview.RoundedImage;
import com.krishna.fileloader.p408i.C10186b;
import com.mrsool.C10232R;
import com.mrsool.bean.DeeplinkBean;
import com.mrsool.bean.FourSquareMainBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.bean.WorkingHoursBean;
import com.mrsool.createorder.CreateOrderActivity;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11728i;
import com.mrsool.p423v.C11738n;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.shop.h */
/* compiled from: ShopInfoFragment */
public class C11244h extends Fragment implements OnClickListener, C11056p {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C5887x f31311N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public AppSingleton f31312O;

    /* renamed from: P */
    private Toolbar f31313P;

    /* renamed from: Q */
    private ImageView f31314Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ImageView f31315R;

    /* renamed from: S */
    private ImageView f31316S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ImageView f31317T;

    /* renamed from: U */
    private TextView f31318U;

    /* renamed from: V */
    private TextView f31319V;

    /* renamed from: W */
    private TextView f31320W;

    /* renamed from: X */
    private TextView f31321X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public TextView f31322Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public TextView f31323Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public GoogleMap f31324a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public TextView f31325a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SupportMapFragment f31326b;

    /* renamed from: b0 */
    private TextView f31327b0;

    /* renamed from: c0 */
    private TextView f31328c0;

    /* renamed from: d0 */
    private LinearLayout f31329d0;

    /* renamed from: e0 */
    private LinearLayout f31330e0;

    /* renamed from: f0 */
    private LinearLayout f31331f0;

    /* renamed from: g0 */
    private LinearLayout f31332g0;

    /* renamed from: h0 */
    private View f31333h0;

    /* renamed from: i0 */
    private RecyclerView f31334i0;

    /* renamed from: j0 */
    private RelativeLayout f31335j0;

    /* renamed from: k0 */
    private View f31336k0;

    /* renamed from: l0 */
    private View f31337l0;

    /* renamed from: m0 */
    private View f31338m0;

    /* renamed from: n0 */
    private FloatingActionButton f31339n0;

    /* renamed from: o0 */
    private FloatingActionButton f31340o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ArrayList<Marker> f31341p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ExpandableLinearLayout f31342q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public DeeplinkBean f31343r0;

    /* renamed from: s0 */
    private final String f31344s0 = "getDeepLink";

    /* renamed from: t0 */
    private final String f31345t0 = "CheckInShop";
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public int f31346u0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public int f31347v0 = 1;

    /* renamed from: com.mrsool.shop.h$a */
    /* compiled from: ShopInfoFragment */
    class C11245a implements Callback<DeeplinkBean> {
        C11245a() {
        }

        public void onFailure(Call<DeeplinkBean> call, Throwable th) {
            if (C11244h.this.f31311N != null) {
                C11244h.this.f31311N.mo23653q0();
            }
        }

        public void onResponse(Call<DeeplinkBean> call, Response<DeeplinkBean> response) {
            if (C11244h.this.f31311N != null) {
                C11244h.this.f31311N.mo23492O();
                if (response.isSuccessful()) {
                    C11244h.this.f31343r0 = (DeeplinkBean) response.body();
                    if (((DeeplinkBean) response.body()).getCode().intValue() <= 300) {
                        String a = C11244h.this.f31311N.mo23528a(response.body());
                        String str = "getDeepLink";
                        if (!TextUtils.isEmpty(a)) {
                            C11244h.this.f31311N.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            C11244h.this.mo36511f(str);
                        }
                    } else {
                        C11244h.this.f31311N.mo23615f(((DeeplinkBean) response.body()).getMessage(), C11244h.this.getString(C10232R.string.app_name));
                    }
                } else if (C11244h.this.f31311N != null) {
                    C11244h.this.f31311N.mo23615f(response.message(), C11244h.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$b */
    /* compiled from: ShopInfoFragment */
    class C11246b implements OnClickListener {
        C11246b() {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: com.mrsool.shop.h$c */
    /* compiled from: ShopInfoFragment */
    class C11247c extends C2550c {
        C11247c(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            if (C11244h.this.isAdded()) {
                C11244h.this.f31317T.setScaleType(ScaleType.CENTER_CROP);
                C11244h.this.f31317T.setImageDrawable(C11244h.this.f31311N.mo23567b(bitmap));
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$d */
    /* compiled from: ShopInfoFragment */
    class C11248d implements Runnable {
        C11248d() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append(C3868i.f12248b);
            sb.append(C11244h.this.f31312O.f16955b.getShop().getDiscountLabel().replace(C11244h.this.f31312O.f16955b.getShop().getDiscountShortLabel(), ""));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            if (((ShopDetailActivity) C11244h.this.getActivity()).f31133c0 == null) {
                ((ShopDetailActivity) C11244h.this.getActivity()).f31133c0 = C5887x.m25812d((View) C11244h.this.f31325a0);
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(C11244h.this.getActivity().getResources(), ((ShopDetailActivity) C11244h.this.getActivity()).f31133c0);
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
            spannableStringBuilder.setSpan(new C11738n(bitmapDrawable), 0, 1, 34);
            C11244h.this.f31323Z.setText(spannableStringBuilder, BufferType.SPANNABLE);
            C11244h.this.f31325a0.setVisibility(8);
        }
    }

    /* renamed from: com.mrsool.shop.h$e */
    /* compiled from: ShopInfoFragment */
    class C11249e extends C3902d {
        C11249e() {
        }

        /* renamed from: c */
        public void mo17227c() {
            C11244h hVar = C11244h.this;
            hVar.mo39078a((View) hVar.f31315R, 180.0f, 0.0f).start();
            C11244h.this.f31342q0.setExpanded(false);
            C11244h.this.f31322Y.setText(C11244h.this.getResources().getString(C10232R.string.lbl_show_working_hours));
        }

        /* renamed from: e */
        public void mo17229e() {
            C11244h hVar = C11244h.this;
            hVar.mo39078a((View) hVar.f31315R, 0.0f, 180.0f).start();
            C11244h.this.f31342q0.setExpanded(true);
            C11244h.this.f31322Y.setText(C11244h.this.getResources().getString(C10232R.string.lbl_hide_working_hours));
        }

        /* renamed from: f */
        public void mo17230f() {
            super.mo17230f();
        }
    }

    /* renamed from: com.mrsool.shop.h$f */
    /* compiled from: ShopInfoFragment */
    class C11250f extends C2557j<Bitmap> {
        C11250f() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (C11244h.this.isAdded()) {
                try {
                    if (C11244h.this.f31311N.mo23648p() != null) {
                        C11244h.this.f31341p0.add(C11244h.this.f31324a.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(C11244h.this.mo39079a((Context) C11244h.this.getActivity(), C11244h.this.m50864a(C10232R.C10235drawable.icon_home_pickup, C11244h.this.getResources().getString(C10232R.string.lbl_tb_title_home), Boolean.valueOf(false), null)))).position(new LatLng(C11244h.this.f31311N.mo23648p().latitude, C11244h.this.f31311N.mo23648p().longitude)).anchor(0.5f, 1.0f)));
                    }
                    if (C11244h.this.f31312O.f16954a.getLatitude() != null) {
                        C11244h.this.f31341p0.add(C11244h.this.f31324a.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(C11244h.this.mo39079a((Context) C11244h.this.getActivity(), C11244h.this.m50864a(0, C11244h.this.f31312O.f16955b.getShop().getVName(), Boolean.valueOf(true), bitmap)))).position(new LatLng(Double.valueOf(C11244h.this.f31312O.f16954a.getLatitude()).doubleValue(), Double.valueOf(C11244h.this.f31312O.f16954a.getLongitude()).doubleValue())).anchor(0.5f, 1.0f)));
                    }
                    C11244h.this.m50862N();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$g */
    /* compiled from: ShopInfoFragment */
    class C11251g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f31354a;

        C11251g(Builder builder) {
            this.f31354a = builder;
        }

        public void run() {
            if (C11244h.this.isAdded()) {
                try {
                    C11244h.this.f31324a.setPadding(C11244h.this.f31347v0 / 2, C11244h.this.f31346u0 / 2, C11244h.this.f31347v0 / 2, 0);
                    C11244h.this.f31324a.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f31354a.build(), 100));
                } catch (Exception e) {
                    C11244h.this.f31324a.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$h */
    /* compiled from: ShopInfoFragment */
    class C11252h implements OnMapReadyCallback {

        /* renamed from: com.mrsool.shop.h$h$a */
        /* compiled from: ShopInfoFragment */
        class C11253a implements Runnable {
            C11253a() {
            }

            public void run() {
                if (C11244h.this.isAdded()) {
                    C11244h.this.m50884w();
                }
            }
        }

        C11252h() {
        }

        public void onMapReady(GoogleMap googleMap) {
            C11244h.this.f31324a = googleMap;
            if (C0841b.m4916a((Context) C11244h.this.getActivity(), "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) C11244h.this.getActivity(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                C11244h hVar = C11244h.this;
                hVar.f31324a = hVar.f31311N.mo23514a(googleMap, C11244h.this.f31326b, true, true);
                C11244h.this.f31324a.setMyLocationEnabled(false);
                C11244h.this.f31324a.getUiSettings().setMyLocationButtonEnabled(false);
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(C11244h.this.f31311N.mo23648p());
                CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(16.0f);
                C11244h.this.f31324a.moveCamera(newLatLng);
                C11244h.this.f31324a.animateCamera(zoomTo);
                new Handler().postDelayed(new C11253a(), 100);
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$i */
    /* compiled from: ShopInfoFragment */
    class C11254i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31358a;

        C11254i(Dialog dialog) {
            this.f31358a = dialog;
        }

        public void onClick(View view) {
            this.f31358a.dismiss();
            if (C11244h.this.f31324a != null) {
                C11244h.this.f31324a.setMapType(1);
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$j */
    /* compiled from: ShopInfoFragment */
    class C11255j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31360a;

        C11255j(Dialog dialog) {
            this.f31360a = dialog;
        }

        public void onClick(View view) {
            this.f31360a.dismiss();
            if (C11244h.this.f31324a != null) {
                C11244h.this.f31324a.setMapType(4);
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$k */
    /* compiled from: ShopInfoFragment */
    class C11256k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31362a;

        C11256k(Dialog dialog) {
            this.f31362a = dialog;
        }

        public void onClick(View view) {
            this.f31362a.dismiss();
            if (C11244h.this.f31324a != null) {
                C11244h.this.f31324a.setMapType(2);
            }
        }
    }

    /* renamed from: com.mrsool.shop.h$l */
    /* compiled from: ShopInfoFragment */
    public interface C11257l {
        /* renamed from: b */
        void mo39038b(Uri uri);
    }

    /* renamed from: com.mrsool.shop.h$m */
    /* compiled from: ShopInfoFragment */
    private class C11258m implements OnGlobalLayoutListener {

        /* renamed from: a */
        private View f31364a;

        public C11258m(View view) {
            this.f31364a = view;
        }

        public void onGlobalLayout() {
            C11244h.this.f31342q0.mo17200d();
            C11244h.this.f31342q0.setExpanded(false);
            this.f31364a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: A */
    private void m50849A() {
        if (!this.f31311N.mo23503Y() && this.f31312O.f16955b.getAllowOrder().booleanValue()) {
            m50886y();
        }
    }

    /* renamed from: B */
    private void m50850B() {
        startActivity(new Intent(getActivity(), PromotionalOfferActivity.class));
        getActivity().overridePendingTransition(17432576, 17432577);
    }

    /* renamed from: C */
    private void m50851C() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        this.f31335j0.setLayoutParams(layoutParams);
    }

    /* renamed from: D */
    private void m50852D() {
        this.f31320W.setText(this.f31312O.f16954a.getFormattedAddress());
        TextView textView = this.f31328c0;
        String string = getResources().getString(C10232R.string.lbl_distance_km_away_no_space);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f31312O.f16955b.getShop().getDistance_courier_shop());
        textView.setText(String.format(string, new Object[]{sb.toString()}));
        this.f31332g0.setVisibility(0);
        this.f31329d0.setVisibility(0);
        m50856H();
        m50853E();
    }

    /* renamed from: E */
    private void m50853E() {
        if (this.f31312O.f16955b.getShop().isHasDiscount()) {
            this.f31333h0.setVisibility(0);
            this.f31323Z.setText(this.f31312O.f16955b.getShop().getDiscountShortLabel());
            this.f31325a0.setText(this.f31312O.f16955b.getShop().getDiscountShortLabel());
            new Handler().postDelayed(new C11248d(), 100);
            return;
        }
        this.f31333h0.setVisibility(8);
    }

    /* renamed from: F */
    private void m50854F() {
        this.f31342q0.setListener(new C11249e());
    }

    /* renamed from: G */
    private void m50855G() {
        AppSingleton appSingleton = this.f31312O;
        if (appSingleton == null) {
            ShopDetails shopDetails = appSingleton.f16955b;
            if (shopDetails == null && shopDetails.getShop() == null) {
                return;
            }
        }
        if (this.f31312O.f16955b.getShop().isServiceShopOpen()) {
            this.f31321X.setText(getResources().getString(C10232R.string.lbl_shop_open));
        } else {
            this.f31321X.setText(getResources().getString(C10232R.string.lbl_shop_close));
            this.f31321X.setTextColor(getResources().getColor(C10232R.C10234color.red_1));
            this.f31314Q.setColorFilter(getResources().getColor(C10232R.C10234color.red_1));
        }
    }

    /* renamed from: H */
    private void m50856H() {
        if (this.f31312O.f16955b.getShop().getOpening_hours() == null || this.f31312O.f16955b.getShop().getOpening_hours().size() != 0) {
            this.f31330e0.setVisibility(0);
            m50855G();
            if (this.f31312O.f16955b.getShop().getOpening_hours() != null) {
                for (int i = 0; i < this.f31312O.f16955b.getShop().getOpening_hours().size(); i++) {
                    View inflate = getActivity().getLayoutInflater().inflate(C10232R.layout.row_working_hours, null);
                    TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvDay);
                    TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvTime);
                    StringBuilder sb = new StringBuilder();
                    String str = "";
                    sb.append(str);
                    sb.append(((WorkingHoursBean) this.f31312O.f16955b.getShop().getOpening_hours().get(i)).getDay());
                    textView.setText(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(((WorkingHoursBean) this.f31312O.f16955b.getShop().getOpening_hours().get(i)).getTime());
                    textView2.setText(sb2.toString());
                    inflate.findViewById(C10232R.C10236id.vDivider);
                    this.f31331f0.addView(inflate);
                    if (getResources().getDisplayMetrics().densityDpi <= 240) {
                        textView2.setTextSize(2, 11.0f);
                    } else if (getResources().getDisplayMetrics().densityDpi <= 320) {
                        textView2.setTextSize(2, 12.0f);
                    }
                }
            }
            return;
        }
        this.f31330e0.setVisibility(8);
        m50851C();
    }

    /* renamed from: I */
    private void m50857I() {
        if (this.f31311N == null) {
            this.f31311N = new C5887x(getActivity());
        }
        if (this.f31311N.mo23496R()) {
            this.f31311N.mo23545a((ImageView) this.f31336k0.findViewById(C10232R.C10236id.ivArrow));
        }
    }

    /* renamed from: J */
    private void m50858J() {
        this.f31313P = (Toolbar) getActivity().findViewById(C10232R.C10236id.tbTXT);
        this.f31329d0 = (LinearLayout) this.f31313P.findViewById(C10232R.C10236id.layRightClick);
        this.f31329d0.setOnClickListener(this);
        this.f31332g0 = (LinearLayout) this.f31313P.findViewById(C10232R.C10236id.llLeft);
        this.f31319V = (TextView) this.f31313P.findViewById(C10232R.C10236id.txtTitle);
        this.f31319V.setText(this.f31312O.f16954a.getShopName());
        this.f31313P.findViewById(C10232R.C10236id.txtSubTitle).setVisibility(8);
        this.f31317T = (ImageView) this.f31313P.findViewById(C10232R.C10236id.ivServiceLogo);
        try {
            C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31312O.f16955b.getShop().getVShopPic()).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).mo9458b(new C11247c(this.f31317T));
        } catch (Exception unused) {
        }
    }

    /* renamed from: K */
    private void m50859K() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_map_style);
        dialog.setCancelable(true);
        C5887x xVar = this.f31311N;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvSatellite);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvHybrid);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMap)).setOnClickListener(new C11254i(dialog));
        textView2.setOnClickListener(new C11255j(dialog));
        textView.setOnClickListener(new C11256k(dialog));
        if (!getActivity().isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: L */
    private void m50860L() {
        try {
            this.f31324a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(((ShopDetailActivity) getActivity()).f31129Z.getLatitude(), ((ShopDetailActivity) getActivity()).f31129Z.getLongitude()), 16.0f));
        } catch (Exception unused) {
        }
    }

    /* renamed from: M */
    private void m50861M() {
        if (this.f31312O.f16955b.getBarColor().equalsIgnoreCase(getString(C10232R.string.lbl_order_color_yellow))) {
            this.f31327b0.setText(this.f31312O.f16955b.getShop_order_alert_text());
            this.f31316S.setVisibility(0);
            this.f31327b0.setVisibility(0);
            this.f31318U.setVisibility(8);
        } else {
            this.f31316S.setVisibility(8);
            this.f31327b0.setVisibility(8);
            this.f31318U.setVisibility(0);
        }
        this.f31312O.f16955b.getShop().isHasDiscount();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m50862N() {
        if (isAdded()) {
            Builder builder = new Builder();
            Iterator it = this.f31341p0.iterator();
            while (it.hasNext()) {
                builder.include(((Marker) it.next()).getPosition());
            }
            new Handler().postDelayed(new C11251g(builder), 10);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m50884w() {
        if (isAdded()) {
            GoogleMap googleMap = this.f31324a;
            if (!(googleMap == null || this.f31312O == null || this.f31311N == null)) {
                googleMap.clear();
                this.f31341p0 = new ArrayList<>();
                try {
                    C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(this.f31312O.f16955b.getShop().getVShopPic()).mo9441j().mo9458b(new C11250f());
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: x */
    private void m50885x() {
        C5887x xVar = this.f31311N;
        if (xVar != null && xVar.mo23502X()) {
            AppSingleton appSingleton = this.f31312O;
            if (appSingleton != null) {
                FourSquareMainBean fourSquareMainBean = appSingleton.f16954a;
                if (!(fourSquareMainBean == null || fourSquareMainBean.getShopId() == null)) {
                    this.f31311N.mo23665u0();
                    HashMap hashMap = new HashMap();
                    hashMap.put("vShopId", this.f31312O.f16954a.getShopId());
                    C5882b.m25774a(this.f31311N).getDeepLink(hashMap).enqueue(new C11245a());
                }
            }
        }
    }

    /* renamed from: y */
    private void m50886y() {
        Intent intent = new Intent(getActivity(), CreateOrderActivity.class);
        intent.putExtra(C11644i.f33431v1, getString(C10232R.string.lbl_tab_shop_info));
        StringBuilder sb = new StringBuilder();
        sb.append("call from ");
        sb.append(getString(C10232R.string.lbl_tab_shop_info));
        C5880q.m25753d(sb.toString());
        startActivityForResult(intent, 100);
    }

    /* renamed from: z */
    private void m50887z() {
        ShopDetails shopDetails = this.f31312O.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            getActivity().finish();
            return;
        }
        m50858J();
        this.f31320W = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvShopAddress);
        this.f31316S = (ImageView) this.f31336k0.findViewById(C10232R.C10236id.ivYelloBg);
        this.f31327b0 = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvNoCourier);
        this.f31318U = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvOrderNow);
        this.f31330e0 = (LinearLayout) this.f31336k0.findViewById(C10232R.C10236id.llTodayTiming);
        this.f31330e0.setOnClickListener(this);
        this.f31314Q = (ImageView) this.f31336k0.findViewById(C10232R.C10236id.ivLocation);
        this.f31321X = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvOpenClose);
        this.f31322Y = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvTodaysTime);
        this.f31315R = (ImageView) this.f31336k0.findViewById(C10232R.C10236id.ivDownUpHours);
        this.f31342q0 = (ExpandableLinearLayout) this.f31336k0.findViewById(C10232R.C10236id.expWorkingHours);
        this.f31333h0 = this.f31336k0.findViewById(C10232R.C10236id.flOrderNowDiscount);
        this.f31323Z = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvDiscount);
        this.f31325a0 = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvDiscountTemp);
        this.f31337l0 = this.f31336k0.findViewById(C10232R.C10236id.rlOrderNowMain);
        this.f31338m0 = this.f31336k0.findViewById(C10232R.C10236id.llOrderNow);
        this.f31337l0.setOnClickListener(this);
        this.f31339n0 = (FloatingActionButton) this.f31336k0.findViewById(C10232R.C10236id.fabMapStyle);
        this.f31340o0 = (FloatingActionButton) this.f31336k0.findViewById(C10232R.C10236id.fabMylocation);
        this.f31339n0.setOnClickListener(this);
        this.f31340o0.setOnClickListener(this);
        this.f31335j0 = (RelativeLayout) this.f31336k0.findViewById(C10232R.C10236id.rlMap);
        this.f31328c0 = (TextView) this.f31336k0.findViewById(C10232R.C10236id.tvDistanceAway);
        m50854F();
        this.f31331f0 = (LinearLayout) this.f31336k0.findViewById(C10232R.C10236id.llWorkingHoursMonThurs);
        m50852D();
        this.f31331f0.getViewTreeObserver().addOnGlobalLayoutListener(new C11258m(this.f31331f0));
        mo39080a(this.f31312O.f16955b);
        m50861M();
        m50857I();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f31311N = new C5887x(getActivity());
        this.f31311N.mo23553a((C11056p) this);
        C1382h childFragmentManager = getChildFragmentManager();
        this.f31326b = (SupportMapFragment) childFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f31326b == null) {
            this.f31326b = SupportMapFragment.newInstance();
            childFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f31326b).mo6100f();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder();
        sb.append("onActivityResult shop innfo requestCode ");
        sb.append(i);
        C5880q.m25753d(sb.toString());
        if (i == 100) {
            getActivity();
            if (i2 == -1) {
                ViewPager viewPager = ShopDetailActivity.f31114j0;
                if (viewPager != null) {
                    viewPager.setCurrentItem(0);
                }
            }
        }
    }

    public void onClick(View view) {
        if (this.f31312O.f16955b == null) {
            getActivity().finish();
            return;
        }
        switch (view.getId()) {
            case C10232R.C10236id.fabMapStyle /*2131362217*/:
                m50859K();
                break;
            case C10232R.C10236id.fabMylocation /*2131362218*/:
                m50860L();
                break;
            case C10232R.C10236id.layRightClick /*2131362913*/:
                m50885x();
                break;
            case C10232R.C10236id.llTodayTiming /*2131363175*/:
                this.f31342q0.setExpanded(false);
                this.f31342q0.toggle();
                break;
            case C10232R.C10236id.rlOrderNowMain /*2131363485*/:
                if (this.f31311N.mo23497S()) {
                    m50849A();
                    break;
                }
                break;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31336k0 = layoutInflater.inflate(C10232R.layout.fragment_shop_info, viewGroup, false);
        MapsInitializer.initialize(getActivity().getApplicationContext());
        this.f31312O = (AppSingleton) getActivity().getApplicationContext();
        m50887z();
        return this.f31336k0;
    }

    public void onResume() {
        super.onResume();
        try {
            if (C11644i.f33302f7) {
                C11728i.m52794a(getActivity());
            }
            if (this.f31324a == null) {
                this.f31326b.getMapAsync(new C11252h());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f31326b.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, 30, 30);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m50870b(Bitmap bitmap) {
        String file = Environment.getExternalStorageDirectory().toString();
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        sb.append("/req_images");
        File file2 = new File(sb.toString());
        file2.mkdirs();
        int nextInt = new Random().nextInt(C14236a.DEFAULT_TIMEOUT);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Image-");
        sb2.append(nextInt);
        sb2.append(C10186b.f27189b);
        File file3 = new File(file2, sb2.toString());
        if (file3.exists()) {
            file3.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            bitmap.compress(CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (((str.hashCode() == -1588787076 && str.equals("getDeepLink")) ? (char) 0 : 65535) == 0 && isAdded()) {
            C5887x xVar = this.f31311N;
            String string = getResources().getString(C10232R.string.msg_share_shop);
            Object[] objArr = new Object[2];
            objArr[0] = this.f31312O.f16954a.getShopName();
            DeeplinkBean deeplinkBean = this.f31343r0;
            objArr[1] = deeplinkBean != null ? deeplinkBean.getUrl() : "";
            xVar.mo23483J(String.format(string, objArr));
        }
    }

    /* renamed from: g */
    public void mo39081g(String str) {
        try {
            Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setText(str);
            textView.setOnClickListener(new C11246b());
            dialog.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Bitmap m50863a(View view, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getLayoutParams().width, view.getLayoutParams().height);
        view.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public ObjectAnimator mo39078a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{f, f2});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(C3911g.m17082a(8));
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m50864a(int i, String str, Boolean bool, Bitmap bitmap) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_branch, null);
        RoundedImage roundedImage = (RoundedImage) inflate.findViewById(C10232R.C10236id.ivPin);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvDistance);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
        if (bitmap != null) {
            roundedImage.setImageBitmap(bitmap);
        } else {
            roundedImage.setImageResource(i);
        }
        roundedImage.setRoundedRadius((int) getResources().getDimension(C10232R.dimen.dp_35));
        textView2.setText(str);
        textView2.setPadding((int) getResources().getDimension(C10232R.dimen.dp_10), 0, (int) getResources().getDimension(C10232R.dimen.dp_10), (int) getResources().getDimension(C10232R.dimen.dp_5));
        if (bool.booleanValue()) {
            String string = getResources().getString(C10232R.string.lbl_distance_value);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f31312O.f16955b.getShop().getDistance_courier_shop());
            textView.setText(String.format(string, new Object[]{sb.toString()}));
            textView2.setPadding(0, (int) getResources().getDimension(C10232R.dimen.dp_3), 0, 0);
            textView.setPadding(0, 0, 0, 0);
            linearLayout.setBackgroundResource(C10232R.C10235drawable.marker_bg_new_large);
        } else {
            textView2.setPadding(0, (int) getResources().getDimension(C10232R.dimen.dp_1), 0, 0);
            textView.setVisibility(8);
        }
        return inflate;
    }

    /* renamed from: a */
    public Bitmap mo39079a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (this.f31346u0 < createBitmap.getHeight()) {
            this.f31346u0 = createBitmap.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("maxMarkerHeight : ");
            sb.append(this.f31346u0);
            sb.toString();
        }
        if (this.f31347v0 < createBitmap.getWidth()) {
            this.f31347v0 = createBitmap.getWidth();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("maxMarkerWidth : ");
            sb2.append(this.f31347v0);
            sb2.toString();
        }
        return createBitmap;
    }

    /* renamed from: a */
    public void mo39080a(ShopDetails shopDetails) {
        try {
            if (shopDetails.getPromotionAvailable()) {
                startActivity(new Intent(getActivity(), PromotionalOfferActivity.class));
                getActivity().overridePendingTransition(17432576, 17432577);
            }
        } catch (Exception unused) {
        }
    }
}
