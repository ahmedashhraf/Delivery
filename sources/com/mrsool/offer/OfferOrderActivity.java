package com.mrsool.offer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.fragment.app.C1382h;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mrsool.C10232R;
import com.mrsool.C10943o;
import com.mrsool.HomeActivity;
import com.mrsool.SplashActivity;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.bean.DefaultBeanOffer;
import com.mrsool.bean.MinMaxBean;
import com.mrsool.bean.PayoutModalLabelsBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.shopDetailPendingOrder;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.newBean.BundleOrderBean;
import com.mrsool.order.C11056p;
import com.mrsool.p423v.C11728i;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11647k;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.webservice.APIInterface;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OfferOrderActivity extends C0295d implements OnClickListener, C10943o, C11056p {

    /* renamed from: A0 */
    private LinearLayout f30127A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public LinearLayout f30128B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public TextView f30129C0;

    /* renamed from: D0 */
    private TextView f30130D0;

    /* renamed from: E0 */
    private TextView f30131E0;

    /* renamed from: F0 */
    private TextView f30132F0;

    /* renamed from: G0 */
    private TextView f30133G0;

    /* renamed from: H0 */
    private TextView f30134H0;

    /* renamed from: I0 */
    private TextView f30135I0;

    /* renamed from: J0 */
    private boolean f30136J0;

    /* renamed from: K0 */
    private boolean f30137K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public DefaultBeanOffer f30138L0;

    /* renamed from: M0 */
    private CountDownTimer f30139M0;

    /* renamed from: N */
    private TextView f30140N;

    /* renamed from: N0 */
    private RelativeLayout f30141N0;

    /* renamed from: O */
    private TextView f30142O;

    /* renamed from: O0 */
    private ArrayList<BundleOrderBean> f30143O0;

    /* renamed from: P */
    private TextView f30144P;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public boolean f30145P0 = false;

    /* renamed from: Q */
    private TextView f30146Q;

    /* renamed from: Q0 */
    RecyclerView f30147Q0;

    /* renamed from: R */
    private TextView f30148R;

    /* renamed from: R0 */
    private C10965e f30149R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public TextView f30150S;

    /* renamed from: S0 */
    private final int f30151S0 = 1;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public SupportMapFragment f30152T;

    /* renamed from: T0 */
    private final int f30153T0 = 2;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public AppSingleton f30154U;

    /* renamed from: U0 */
    private final int f30155U0 = 3;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C5887x f30156V;

    /* renamed from: V0 */
    private final int f30157V0 = 4;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public ImageView f30158W;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public MinMaxBean f30159W0 = new MinMaxBean();

    /* renamed from: X */
    private ImageView f30160X;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public LinearLayout f30161X0;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public EditText f30162Y;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public Dialog f30163Y0;

    /* renamed from: Z */
    private int f30164Z;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public ViewPager f30165Z0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public GoogleMap f30166a;

    /* renamed from: a0 */
    private String f30167a0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public C5665a f30168a1;

    /* renamed from: b */
    private TextView f30169b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public ChatInitModel f30170b0;

    /* renamed from: c0 */
    private double f30171c0 = 0.0d;

    /* renamed from: d0 */
    private double f30172d0 = 0.0d;

    /* renamed from: e0 */
    private boolean f30173e0 = false;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public View f30174f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public FrameLayout f30175g0;

    /* renamed from: h0 */
    private Marker f30176h0;

    /* renamed from: i0 */
    private Marker f30177i0;

    /* renamed from: j0 */
    private Marker f30178j0;

    /* renamed from: k0 */
    private Bundle f30179k0;

    /* renamed from: l0 */
    private FloatingActionButton f30180l0;

    /* renamed from: m0 */
    private FloatingActionButton f30181m0;

    /* renamed from: n0 */
    private FloatingActionButton f30182n0;

    /* renamed from: o0 */
    ArrayList<Marker> f30183o0 = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public long f30184p0 = 5;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public ProgressBar f30185q0;

    /* renamed from: r0 */
    private LinearLayout f30186r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public LinearLayout f30187s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public LinearLayout f30188t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public LinearLayout f30189u0;

    /* renamed from: v0 */
    private LinearLayout f30190v0;

    /* renamed from: w0 */
    private LinearLayout f30191w0;

    /* renamed from: x0 */
    private LinearLayout f30192x0;

    /* renamed from: y0 */
    private LinearLayout f30193y0;

    /* renamed from: z0 */
    private LinearLayout f30194z0;

    /* renamed from: com.mrsool.offer.OfferOrderActivity$a */
    class C10944a implements OnClickListener {
        C10944a() {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$b */
    class C10945b implements Callback<MinMaxBean> {
        C10945b() {
        }

        public void onFailure(Call<MinMaxBean> call, Throwable th) {
            if (OfferOrderActivity.this.f30156V != null) {
                OfferOrderActivity.this.f30156V.mo23492O();
                OfferOrderActivity.this.f30156V.mo23485K(OfferOrderActivity.this.getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<MinMaxBean> call, Response<MinMaxBean> response) {
            String str = "";
            try {
                if (OfferOrderActivity.this.f30156V != null) {
                    OfferOrderActivity.this.f30156V.mo23492O();
                    if (!response.isSuccessful()) {
                        OfferOrderActivity.this.f30156V.mo23615f(response.message(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                    } else if (((MinMaxBean) response.body()).getCode().intValue() < 300) {
                        OfferOrderActivity.this.f30159W0 = (MinMaxBean) response.body();
                        OfferOrderActivity.this.m49947X();
                        OfferOrderActivity.this.f30129C0.setText(OfferOrderActivity.this.f30159W0.getCourierWalkThroughBean().getOfferScreenLabel());
                        OfferOrderActivity.this.f30188t0.setVisibility(0);
                        EditText e = OfferOrderActivity.this.f30162Y;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(((MinMaxBean) response.body()).getMessage().trim());
                        e.setHint(sb.toString());
                        OfferOrderActivity.this.f30145P0 = ((MinMaxBean) response.body()).getShowYouGet().booleanValue();
                        if (((MinMaxBean) response.body()).getAlready_taken() != null && ((MinMaxBean) response.body()).getAlready_taken().intValue() == 1) {
                            OfferOrderActivity.this.m49969e(((MinMaxBean) response.body()).getAlreadyTakenMessage());
                        } else if (((MinMaxBean) response.body()).getOrder_status() != null && ((MinMaxBean) response.body()).getOrder_status().equalsIgnoreCase(C11644i.f33298f3)) {
                            OfferOrderActivity.this.m49969e(OfferOrderActivity.this.getResources().getString(C10232R.string.lbl_msg_order_cancel));
                        } else if (!OfferOrderActivity.this.f30156V.mo23468C().mo23450a(C11644i.f33103H5) && OfferOrderActivity.this.m49949Z() && OfferOrderActivity.this.f30145P0) {
                            OfferOrderActivity.this.m49965c(true);
                        }
                        if (OfferOrderActivity.this.f30145P0) {
                            OfferOrderActivity.this.f30161X0.setVisibility(0);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) OfferOrderActivity.this.f30187s0.getLayoutParams();
                            OfferOrderActivity.this.f30187s0.setGravity(17);
                            OfferOrderActivity.this.f30187s0.setPadding(0, 0, 0, (int) OfferOrderActivity.this.getResources().getDimension(C10232R.dimen.dp_16));
                            OfferOrderActivity.this.f30161X0.setVisibility(8);
                        }
                        String a = OfferOrderActivity.this.f30156V.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            OfferOrderActivity.this.f30156V.mo23551a(new ServiceManualDataBean(str, a));
                            OfferOrderActivity.this.f30156V.mo23553a((C11056p) OfferOrderActivity.this);
                        }
                    } else if (((MinMaxBean) response.body()).getCode().intValue() == 402) {
                        OfferOrderActivity.this.f30156V.mo23609d0();
                    } else {
                        OfferOrderActivity.this.f30156V.mo23615f(((MinMaxBean) response.body()).getMessage(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$c */
    class C10946c extends CountDownTimer {
        C10946c(long j, long j2) {
            super(j, j2);
        }

        public void onFinish() {
            OfferOrderActivity.this.f30184p0 = 0;
            OfferOrderActivity.this.m49967d(false);
            OfferOrderActivity.this.m49930G();
        }

        public void onTick(long j) {
            OfferOrderActivity.this.f30184p0 = j / 1000;
            TextView r = OfferOrderActivity.this.f30150S;
            StringBuilder sb = new StringBuilder();
            sb.append("00:0");
            sb.append(OfferOrderActivity.this.f30184p0);
            r.setText(sb.toString());
            OfferOrderActivity.this.f30185q0.setProgress((int) (100 - ((j * 100) / (OfferOrderActivity.this.f30170b0.getSubmitDelaySec() * 1000))));
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$d */
    class C10947d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean f30198a;

        C10947d(boolean z) {
            this.f30198a = z;
        }

        public void onClick(View view) {
            try {
                if (OfferOrderActivity.this.f30165Z0.getCurrentItem() == OfferOrderActivity.this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps().size() - 1) {
                    if (this.f30198a) {
                        OfferOrderActivity.this.f30156V.mo23468C().mo23448a(C11644i.f33103H5, Boolean.valueOf(true));
                    }
                    if (!OfferOrderActivity.this.isFinishing() && OfferOrderActivity.this.f30168a1.isShowing()) {
                        OfferOrderActivity.this.f30168a1.dismiss();
                        return;
                    }
                    return;
                }
                OfferOrderActivity.this.f30165Z0.setCurrentItem(OfferOrderActivity.this.f30165Z0.getCurrentItem() + 1);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$e */
    class C10948e implements C2019j {

        /* renamed from: a */
        final /* synthetic */ View f30200a;

        C10948e(View view) {
            this.f30200a = view;
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            if (i == OfferOrderActivity.this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps().size() - 1) {
                ((TextView) this.f30200a.findViewById(C10232R.C10236id.btnGotIt)).setText(OfferOrderActivity.this.getString(C10232R.string.lbl_got_it));
            } else {
                ((TextView) this.f30200a.findViewById(C10232R.C10236id.btnGotIt)).setText(OfferOrderActivity.this.getString(C10232R.string.lbl_next));
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$f */
    class C10949f implements OnShowListener {

        /* renamed from: com.mrsool.offer.OfferOrderActivity$f$a */
        class C10950a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DialogInterface f30203a;

            C10950a(DialogInterface dialogInterface) {
                this.f30203a = dialogInterface;
            }

            public void run() {
                C5665a aVar = (C5665a) this.f30203a;
                OfferOrderActivity.this.f30163Y0 = aVar;
                FrameLayout frameLayout = (FrameLayout) aVar.findViewById(C10232R.C10236id.design_bottom_sheet);
                BottomSheetBehavior c = BottomSheetBehavior.m24700c(frameLayout);
                frameLayout.getLayoutParams().height = -2;
                c.mo22465b(false);
                double d = (double) C11644i.f33105I;
                Double.isNaN(d);
                c.mo22467c((int) (d * 0.83d));
                frameLayout.setBackgroundColor(0);
                frameLayout.requestLayout();
            }
        }

        C10949f() {
        }

        public void onShow(DialogInterface dialogInterface) {
            new Handler().postDelayed(new C10950a(dialogInterface), 0);
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$g */
    class C10951g implements OnEditorActionListener {
        C10951g() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                OfferOrderActivity.this.f30156V.mo23494P();
                OfferOrderActivity.this.m49940Q();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$h */
    class C10952h implements OnGlobalLayoutListener {
        C10952h() {
        }

        public void onGlobalLayout() {
            OfferOrderActivity.this.f30189u0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int measuredHeight = OfferOrderActivity.this.f30189u0.getMeasuredHeight();
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) OfferOrderActivity.this.f30175g0.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, (int) (((float) measuredHeight) - C5887x.m25810c(20.0f, (Context) OfferOrderActivity.this)));
            int measuredHeight2 = OfferOrderActivity.this.f30147Q0.getMeasuredHeight();
            if (measuredHeight2 != 0) {
                OfferOrderActivity.this.f30174f0.getLayoutParams().height = measuredHeight2;
                OfferOrderActivity.this.f30174f0.requestLayout();
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$i */
    class C10953i extends C2550c {
        C10953i(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            Resources resources = OfferOrderActivity.this.getResources();
            OfferOrderActivity.this.f30156V;
            C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
            a.mo4601b(true);
            OfferOrderActivity.this.f30158W.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$j */
    class C10954j implements TextWatcher {
        C10954j() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null || charSequence.length() <= 0) {
                OfferOrderActivity.this.f30156V.mo23557a(false, (View) OfferOrderActivity.this.f30128B0, true);
            } else {
                OfferOrderActivity.this.f30156V.mo23557a(true, (View) OfferOrderActivity.this.f30128B0, true);
            }
            OfferOrderActivity.this.m49960a0();
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$k */
    class C10955k implements OnMapReadyCallback {
        C10955k() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C0841b.m4916a((Context) OfferOrderActivity.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) OfferOrderActivity.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                OfferOrderActivity offerOrderActivity = OfferOrderActivity.this;
                offerOrderActivity.f30166a = offerOrderActivity.f30156V.mo23514a(googleMap, OfferOrderActivity.this.f30152T, true, true);
                OfferOrderActivity.this.f30166a.setMyLocationEnabled(false);
                OfferOrderActivity.this.f30166a.getUiSettings().setMyLocationButtonEnabled(false);
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(OfferOrderActivity.this.f30156V.mo23648p());
                CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                OfferOrderActivity.this.f30166a.moveCamera(newLatLng);
                OfferOrderActivity.this.f30166a.setTrafficEnabled(true);
                OfferOrderActivity.this.f30166a.animateCamera(zoomTo);
                OfferOrderActivity.this.m49934K();
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$l */
    class C10956l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f30210a;

        C10956l(Builder builder) {
            this.f30210a = builder;
        }

        public void run() {
            if (!OfferOrderActivity.this.isFinishing()) {
                try {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(OfferOrderActivity.this.getResources(), OfferOrderActivity.this.f30156V.mo23509a((Context) OfferOrderActivity.this, OfferOrderActivity.this.m49952a(3, "")));
                    OfferOrderActivity.this.f30166a.setPadding(0, bitmapDrawable.getIntrinsicHeight(), bitmapDrawable.getIntrinsicHeight() / 2, 0);
                    OfferOrderActivity.this.f30166a.animateCamera(CameraUpdateFactory.newLatLngBounds(this.f30210a.build(), 100), 200, null);
                } catch (Exception e) {
                    if (OfferOrderActivity.this.f30166a != null) {
                        OfferOrderActivity.this.f30166a.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                    }
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$m */
    class C10957m implements Callback<DefaultBeanOffer> {
        C10957m() {
        }

        public void onFailure(Call<DefaultBeanOffer> call, Throwable th) {
            OfferOrderActivity.this.f30156V.mo23653q0();
        }

        public void onResponse(Call<DefaultBeanOffer> call, Response<DefaultBeanOffer> response) {
            String str = "";
            try {
                if (response.isSuccessful()) {
                    DefaultBeanOffer defaultBeanOffer = (DefaultBeanOffer) response.body();
                    OfferOrderActivity.this.f30138L0 = defaultBeanOffer;
                    if (defaultBeanOffer.getCode() <= 300) {
                        OfferOrderActivity.this.f30156V.mo23492O();
                        if (defaultBeanOffer.getOld_price() != null) {
                            OfferOrderActivity.this.f30156V.mo23615f(((DefaultBeanOffer) response.body()).getMessage(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                        } else if (defaultBeanOffer.is_taken()) {
                            OfferOrderActivity.this.m49969e(defaultBeanOffer.getMessage());
                        } else {
                            OfferOrderActivity.this.m49937N();
                            String a = OfferOrderActivity.this.f30156V.mo23528a(response.body());
                            if (!TextUtils.isEmpty(a)) {
                                OfferOrderActivity.this.f30156V.mo23551a(new ServiceManualDataBean("from offer", a));
                                OfferOrderActivity.this.f30156V.mo23553a((C11056p) OfferOrderActivity.this);
                            } else {
                                OfferOrderActivity.this.f30156V.mo23473E(C11644i.f33157O3);
                                Intent intent = new Intent();
                                intent.putExtra(C11644i.f33235Y1, OfferOrderActivity.this.f30162Y.getText().toString().trim());
                                intent.putExtra(C11644i.f33243Z1, defaultBeanOffer.getMessage());
                                intent.putExtra(C11644i.f33288e2, defaultBeanOffer.getOffer_id());
                                OfferOrderActivity.this.setResult(-1, intent);
                                OfferOrderActivity.this.finish();
                                C11694e eVar = C11694e.INSTANCE;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(OfferOrderActivity.this.f30170b0.getOrder().getiBuyerId());
                                String sb2 = sb.toString();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(OfferOrderActivity.this.f30170b0.getOrder().getiOrderId());
                                eVar.mo40206d(sb2, sb3.toString());
                            }
                        }
                    } else if (((DefaultBeanOffer) response.body()).getCode() == 402) {
                        OfferOrderActivity.this.f30156V.mo23609d0();
                    } else {
                        OfferOrderActivity.this.f30156V.mo23492O();
                        if (!(OfferOrderActivity.this.f30156V == null || OfferOrderActivity.this.f30154U == null)) {
                            if (defaultBeanOffer != null && defaultBeanOffer.isOrder_cancel()) {
                                OfferOrderActivity.this.m49969e(defaultBeanOffer.getMessage());
                            } else if (defaultBeanOffer.is_taken()) {
                                OfferOrderActivity.this.m49969e(defaultBeanOffer.getMessage());
                            } else if (defaultBeanOffer.isSelectedForPayout()) {
                                OfferOrderActivity.this.mo38705a(defaultBeanOffer.getPayoutModalLabels());
                            } else if (((DefaultBeanOffer) response.body()).getMessages() != null) {
                                OfferOrderActivity.this.f30156V.mo23615f(((DefaultBeanOffer) response.body()).getMessages(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                            } else {
                                OfferOrderActivity.this.f30156V.mo23615f(((DefaultBeanOffer) response.body()).getMessage(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                            }
                        }
                    }
                } else {
                    OfferOrderActivity.this.f30156V.mo23492O();
                    if (!(OfferOrderActivity.this.f30156V == null || OfferOrderActivity.this.f30154U == null)) {
                        if (((DefaultBeanOffer) response.body()).getMessages() != null) {
                            OfferOrderActivity.this.f30156V.mo23615f(((DefaultBeanOffer) response.body()).getMessages(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                        } else {
                            OfferOrderActivity.this.f30156V.mo23615f(((DefaultBeanOffer) response.body()).getMessage(), OfferOrderActivity.this.getString(C10232R.string.app_name));
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    if (OfferOrderActivity.this.f30156V != null) {
                        OfferOrderActivity.this.f30156V.mo23492O();
                        OfferOrderActivity.this.f30156V.mo23615f(OfferOrderActivity.this.getString(C10232R.string.msg_error_server_issue), OfferOrderActivity.this.getString(C10232R.string.app_name));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$n */
    class C10958n implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30213a;

        C10958n(Dialog dialog) {
            this.f30213a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f30213a.dismiss();
                OfferOrderActivity.this.finish();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$o */
    class C10959o implements OnClickListener {
        C10959o() {
        }

        public void onClick(View view) {
            try {
                ChatActivityNew.f27661z6.finish();
                OfferOrderActivity.this.finish();
                OfferOrderActivity.this.f30156V.mo23473E(C11644i.f33157O3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.offer.OfferOrderActivity$p */
    public class C10960p implements InputFilter {

        /* renamed from: a */
        Pattern f30216a = Pattern.compile("[0-9]*+((\\.[0-9]?)?)||(\\.)?");

        public C10960p() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!this.f30216a.matcher(spanned).matches()) {
                return "";
            }
            return null;
        }
    }

    /* renamed from: D */
    private void m49928D() {
        this.f30189u0.getViewTreeObserver().addOnGlobalLayoutListener(new C10952h());
    }

    /* renamed from: E */
    private void m49929E() {
        if (!this.f30137K0 || this.f30170b0.getSubmitDelaySec() == 0) {
            m49967d(false);
            return;
        }
        m49967d(true);
        C10946c cVar = new C10946c(100 + (this.f30170b0.getSubmitDelaySec() * 1000), 1);
        this.f30139M0 = cVar;
        this.f30139M0.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public void m49930G() {
        if (this.f30156V.mo23502X()) {
            C5887x xVar = this.f30156V;
            if (xVar != null) {
                xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            }
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30156V.mo23476G());
            hashMap.put("iCourierId", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30156V.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("auth_token", sb2.toString());
            APIInterface a = C11687c.m52645a(this.f30156V);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f30170b0.getOrder().getiOrderId());
            a.getMinMaxOffer(sb3.toString(), hashMap).enqueue(new C10945b());
        }
    }

    /* renamed from: H */
    private LatLng m49931H() {
        if (this.f30136J0) {
            return new LatLng(Double.valueOf(this.f30170b0.getOrder().getvShopLat()).doubleValue(), Double.valueOf(this.f30170b0.getOrder().getvShopLong()).doubleValue());
        }
        if (m49946W()) {
            return new LatLng(this.f30170b0.getOrder().getPlatitude(), this.f30170b0.getOrder().getPlongitude());
        }
        return new LatLng(Double.valueOf(this.f30170b0.getOrder().getvShopLat()).doubleValue(), Double.valueOf(this.f30170b0.getOrder().getvShopLong()).doubleValue());
    }

    /* renamed from: I */
    private String m49932I() {
        String str = "";
        try {
            if (this.f30170b0 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(Double.parseDouble(this.f30170b0.getOrder().getDistance_courier_shop()));
                sb.append(Double.parseDouble(this.f30170b0.getOrder().getDistance_shop_buyer()));
                str = sb.toString();
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: J */
    private List<LatLng> m49933J() {
        ArrayList arrayList = new ArrayList();
        if (this.f30136J0) {
            arrayList.add(new LatLng(Double.valueOf(this.f30170b0.getOrder().getvShopLat()).doubleValue(), Double.valueOf(this.f30170b0.getOrder().getvShopLong()).doubleValue()));
        } else if (this.f30170b0.getOrder().getServicePickupAvailable()) {
            arrayList.add(new LatLng(Double.valueOf(this.f30170b0.getOrder().getPlatitude()).doubleValue(), Double.valueOf(this.f30170b0.getOrder().getPlongitude()).doubleValue()));
        } else {
            arrayList.add(new LatLng(this.f30171c0, this.f30172d0));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m49934K() {
        this.f30173e0 = true;
        m49948Y();
    }

    /* renamed from: L */
    private boolean m49935L() {
        if (TextUtils.isEmpty(this.f30162Y.getText().toString().trim())) {
            this.f30156V.mo23491N(getString(C10232R.string.lbl_dg_alert_enter_cost));
            return false;
        } else if (!this.f30162Y.getText().toString().endsWith(".")) {
            return true;
        } else {
            this.f30156V.mo23491N("Please enter valid amount");
            return false;
        }
    }

    /* renamed from: M */
    private void m49936M() {
        try {
            C11598a.m52263f().mo39813a(this.f30179k0.getString(C11644i.f33258b), this.f30164Z + 1, this.f30179k0.getInt("count") + 1, C11644i.f33056B6.size() > 0, C5887x.m25791S(this.f30170b0.getOrder().getDistance_courier_shop()), C5887x.m25791S(this.f30170b0.getOrder().getDistance_shop_buyer()) + C5887x.m25791S(this.f30170b0.getOrder().getDistance_courier_shop()), this.f30170b0.getOrder().getiOrderId(), this.f30170b0.getOrder().getvShopId());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m49937N() {
        try {
            C11598a.m52263f().mo39804a(C5887x.m25791S(this.f30162Y.getText().toString()), this.f30170b0.getOrder().getiOrderId(), C5887x.m25791S(this.f30162Y.getText().toString()) - this.f30170b0.getMin_del_cost(), this.f30170b0.getOrder().getvShopId());
        } catch (Exception unused) {
        }
    }

    /* renamed from: O */
    private void m49938O() {
        Builder builder = new Builder();
        Iterator it = this.f30183o0.iterator();
        while (it.hasNext()) {
            builder.include(((Marker) it.next()).getPosition());
        }
        new Handler().postDelayed(new C10956l(builder), 200);
    }

    /* renamed from: P */
    private void m49939P() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C5887x.m25820z0())));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m49940Q() {
        String str = C11687c.f33795i1;
        C5887x xVar = this.f30156V;
        if (xVar != null && xVar.mo23502X() && this.f30156V.mo23500V() && this.f30156V.mo23497S() && m49935L()) {
            C5887x xVar2 = this.f30156V;
            if (xVar2 != null) {
                xVar2.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            }
            if (this.f30170b0 != null) {
                HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                sb.append(str2);
                sb.append(this.f30170b0.getOrder().getiBuyerId());
                hashMap.put("iBuyerId", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                String str3 = "user_id";
                sb2.append(this.f30156V.mo23468C().mo23459f(str3));
                hashMap.put("iCourierId", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(this.f30162Y.getText().toString().trim());
                hashMap.put(C11687c.f33791h1, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(this.f30167a0);
                hashMap.put(C11687c.f33683I0, sb4.toString());
                try {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str2);
                    sb5.append(((shopDetailPendingOrder) this.f30154U.f16955b.getOrders().get(this.f30164Z)).getTotalDistance());
                    hashMap.put(str, sb5.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str2);
                    sb6.append(m49932I());
                    hashMap.put(str, sb6.toString());
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(this.f30170b0.getOrder().getLatitude());
                hashMap.put("latitude", sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(this.f30170b0.getOrder().getLongitude());
                hashMap.put("longitude", sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f30170b0.getOrder().getiOrderId());
                hashMap.put("iOrderId", sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str2);
                sb10.append(this.f30156V.mo23648p().latitude);
                hashMap.put("clatitude", sb10.toString());
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str2);
                sb11.append(this.f30156V.mo23648p().longitude);
                hashMap.put("clongitude", sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str2);
                sb12.append(this.f30156V.mo23468C().mo23459f(str3));
                hashMap.put("current_user_id", sb12.toString());
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str2);
                sb13.append(this.f30156V.mo23468C().mo23459f(C11644i.f33443w5));
                hashMap.put("auth_token", sb13.toString());
                StringBuilder sb14 = new StringBuilder();
                sb14.append("offer PARAMS:");
                sb14.append(hashMap);
                C5880q.m25751b(sb14.toString());
                APIInterface a = C11687c.m52645a(this.f30156V);
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str2);
                sb15.append(this.f30170b0.getOrder().getiOrderId());
                a.isseuOffer(sb15.toString(), hashMap).enqueue(new C10957m());
            }
        }
    }

    /* renamed from: R */
    private void m49941R() {
        this.f30156V.mo23557a(false, (View) this.f30128B0, true);
        this.f30162Y.addTextChangedListener(new C10954j());
    }

    /* renamed from: S */
    private void m49942S() {
        try {
            boolean z = this.f30136J0;
            String str = C3868i.f12248b;
            if (z) {
                TextView textView = this.f30144P;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f30170b0.getOrder().getDistance_courier_shop());
                sb.append(str);
                sb.append(getResources().getString(C10232R.string.lbl_distance));
                textView.setText(sb.toString());
                TextView textView2 = this.f30146Q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f30170b0.getOrder().getDistance_shop_buyer());
                sb2.append(str);
                sb2.append(getResources().getString(C10232R.string.lbl_distance));
                textView2.setText(sb2.toString());
            } else if (this.f30170b0.getOrder().getServicePickupAvailable()) {
                TextView textView3 = this.f30133G0;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f30170b0.getOrder().getDistance_courier_shop());
                sb3.append(str);
                sb3.append(getResources().getString(C10232R.string.lbl_distance));
                textView3.setText(sb3.toString());
                TextView textView4 = this.f30134H0;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f30170b0.getOrder().getDistance_shop_buyer());
                sb4.append(str);
                sb4.append(getResources().getString(C10232R.string.lbl_distance));
                textView4.setText(sb4.toString());
            } else {
                TextView textView5 = this.f30135I0;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(this.f30170b0.getOrder().getDistance_courier_shop());
                sb5.append(str);
                sb5.append(getResources().getString(C10232R.string.lbl_distance));
                textView5.setText(sb5.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: T */
    private void m49943T() {
        this.f30143O0.clear();
        if (this.f30136J0) {
            BundleOrderBean bundleOrderBean = new BundleOrderBean();
            bundleOrderBean.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_courier_shop())));
            bundleOrderBean.setDropoffAddress(this.f30170b0.getOrder().getvShopAddress());
            bundleOrderBean.setTitle(getString(C10232R.string.lbl_pickup_new));
            bundleOrderBean.setIcon(C10232R.C10235drawable.ic_package_sky_blue);
            this.f30143O0.add(bundleOrderBean);
            BundleOrderBean bundleOrderBean2 = new BundleOrderBean();
            bundleOrderBean2.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_shop_buyer())));
            bundleOrderBean2.setDropoffAddress(this.f30170b0.getOrder().getvAddress());
            bundleOrderBean2.setTitle(getString(C10232R.string.lbl_drop_off));
            bundleOrderBean2.setIcon(C10232R.C10235drawable.ic_flag_sky_blue);
            this.f30143O0.add(bundleOrderBean2);
        } else if (this.f30170b0.getOrder().getServicePickupAvailable()) {
            BundleOrderBean bundleOrderBean3 = new BundleOrderBean();
            bundleOrderBean3.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_courier_shop())));
            bundleOrderBean3.setDropoffAddress(this.f30170b0.getOrder().getvPickupAddress());
            bundleOrderBean3.setTitle(getString(C10232R.string.lbl_pickup_new));
            bundleOrderBean3.setIcon(C10232R.C10235drawable.ic_package_sky_blue);
            this.f30143O0.add(bundleOrderBean3);
            BundleOrderBean bundleOrderBean4 = new BundleOrderBean();
            bundleOrderBean4.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_shop_buyer())));
            bundleOrderBean4.setDropoffAddress(this.f30170b0.getOrder().getvAddress());
            bundleOrderBean4.setTitle(getString(C10232R.string.lbl_drop_off));
            bundleOrderBean4.setIcon(C10232R.C10235drawable.ic_flag_sky_blue);
            this.f30143O0.add(bundleOrderBean4);
        } else {
            BundleOrderBean bundleOrderBean5 = new BundleOrderBean();
            bundleOrderBean5.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_courier_shop())));
            bundleOrderBean5.setDropoffAddress(this.f30170b0.getOrder().getvAddress());
            bundleOrderBean5.setTitle(getString(C10232R.string.lbl_drop_off));
            bundleOrderBean5.setIcon(C10232R.C10235drawable.ic_flag_sky_blue);
            this.f30143O0.add(bundleOrderBean5);
        }
        this.f30149R0.mo7341e();
    }

    /* renamed from: U */
    private void m49944U() {
        Thread.setDefaultUncaughtExceptionHandler(new C10962b(this));
    }

    /* renamed from: V */
    private void m49945V() {
        ViewPager viewPager = this.f30165Z0;
        if (viewPager != null) {
            ViewGroup.LayoutParams layoutParams = viewPager.getLayoutParams();
            double d = (double) C11644i.f33105I;
            Double.isNaN(d);
            layoutParams.height = (int) (d * 0.6d);
            this.f30165Z0.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: W */
    private boolean m49946W() {
        return !this.f30170b0.getOrder().getvShopType().equalsIgnoreCase(C11644i.f33253a3) || this.f30170b0.getOrder().getServicePickupAvailable();
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m49947X() {
        try {
            if (m49949Z()) {
                this.f30160X.setVisibility(0);
                this.f30129C0.setVisibility(0);
                return;
            }
            this.f30160X.setVisibility(8);
            this.f30129C0.setVisibility(8);
        } catch (Exception unused) {
        }
    }

    /* renamed from: Y */
    private void m49948Y() {
        try {
            if (this.f30170b0 == null) {
                finish();
                ChatActivityNew.f27661z6.finish();
                return;
            }
            if (this.f30173e0) {
                String str = "";
                if (this.f30156V.mo23648p() != null) {
                    this.f30176h0 = this.f30166a.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(this.f30156V.mo23509a((Context) this, m49952a(1, str)))).position(this.f30156V.mo23648p()).anchor(0.5f, 1.0f));
                    this.f30183o0.add(this.f30176h0);
                }
                if (this.f30170b0.getOrder().getvShopLat() != null && m49946W()) {
                    this.f30177i0 = this.f30166a.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(this.f30156V.mo23509a((Context) this, m49952a(2, str)))).position(m49931H()).anchor(0.5f, 1.0f));
                    this.f30183o0.add(this.f30177i0);
                }
                if (this.f30170b0.getOrder().isBundledOrder()) {
                    for (int i = 0; i < this.f30143O0.size(); i++) {
                    }
                } else {
                    this.f30178j0 = this.f30166a.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(this.f30156V.mo23509a((Context) this, m49952a(3, str)))).position(new LatLng(this.f30171c0, this.f30172d0)).anchor(0.5f, 1.0f));
                    this.f30183o0.add(this.f30178j0);
                }
                m49938O();
            }
            m49942S();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public boolean m49949Z() {
        MinMaxBean minMaxBean = this.f30159W0;
        return (minMaxBean == null || minMaxBean.getCourierWalkThroughBean() == null || this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps().size() <= 0) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m49960a0() {
        if (this.f30162Y.getText().toString().trim().equals("")) {
            this.f30130D0.setVisibility(8);
            this.f30129C0.setText(this.f30159W0.getCourierWalkThroughBean().getOfferScreenLabel());
            if (!m49949Z()) {
                this.f30129C0.setVisibility(8);
                return;
            }
            return;
        }
        try {
            double parseDouble = Double.parseDouble(this.f30162Y.getText().toString());
            double commission = this.f30159W0.getCommission() * parseDouble;
            double vat = parseDouble + commission + (this.f30159W0.getVat() * commission) + this.f30159W0.getServiceFees();
            TextView textView = this.f30129C0;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30156V.mo23569b(vat));
            sb.append(C3868i.f12248b);
            sb.append(this.f30170b0.getOrder().getCurrency());
            textView.setText(sb.toString());
            this.f30130D0.setVisibility(0);
            this.f30129C0.setVisibility(0);
        } catch (NumberFormatException unused) {
            this.f30130D0.setVisibility(8);
            this.f30129C0.setText(this.f30159W0.getCourierWalkThroughBean().getOfferScreenLabel());
        }
    }

    private void initViews() {
        this.f30156V = new C5887x(this);
        this.f30182n0 = (FloatingActionButton) findViewById(C10232R.C10236id.ibBack);
        if (this.f30156V.mo23496R()) {
            this.f30156V.mo23545a((ImageView) this.f30182n0);
            this.f30156V.mo23545a((ImageView) this.f30182n0);
        }
        this.f30143O0 = new ArrayList<>();
        this.f30179k0 = getIntent().getExtras();
        MapsInitializer.initialize(getApplicationContext());
        this.f30154U = (AppSingleton) getApplicationContext();
        HomeActivity.m47469b((C10943o) this);
        C1382h supportFragmentManager = getSupportFragmentManager();
        this.f30152T = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f30152T == null) {
            this.f30152T = SupportMapFragment.newInstance();
            supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f30152T).mo6100f();
        }
        this.f30130D0 = (TextView) findViewById(C10232R.C10236id.tvDesc);
        this.f30129C0 = (TextView) findViewById(C10232R.C10236id.tvPrice);
        this.f30161X0 = (LinearLayout) findViewById(C10232R.C10236id.llInfo);
        this.f30161X0.setOnClickListener(this);
        this.f30160X = (ImageView) findViewById(C10232R.C10236id.ivInfo);
        this.f30185q0 = (ProgressBar) findViewById(C10232R.C10236id.pbDelay);
        this.f30188t0 = (LinearLayout) findViewById(C10232R.C10236id.llTime);
        this.f30187s0 = (LinearLayout) findViewById(C10232R.C10236id.llDeliveryCost);
        this.f30141N0 = (RelativeLayout) findViewById(C10232R.C10236id.rlTimer);
        this.f30150S = (TextView) findViewById(C10232R.C10236id.tvTimerRemainTime);
        this.f30148R = (TextView) findViewById(C10232R.C10236id.tvTime);
        this.f30128B0 = (LinearLayout) findViewById(C10232R.C10236id.llSend);
        this.f30128B0.setOnClickListener(this);
        this.f30182n0.setOnClickListener(this);
        this.f30162Y = (EditText) findViewById(C10232R.C10236id.edCost);
        this.f30162Y.setOnEditorActionListener(new C10951g());
        this.f30158W = (ImageView) findViewById(C10232R.C10236id.imgUserProfile);
        this.f30158W.setOnClickListener(this);
        this.f30169b = (TextView) findViewById(C10232R.C10236id.txtUserName);
        this.f30140N = (TextView) findViewById(C10232R.C10236id.txtDeliveryLocation);
        this.f30142O = (TextView) findViewById(C10232R.C10236id.txtStoreLocation);
        this.f30144P = (TextView) findViewById(C10232R.C10236id.txtTimeYouToStore);
        this.f30146Q = (TextView) findViewById(C10232R.C10236id.txtTimeStoreToCustomer);
        this.f30186r0 = (LinearLayout) findViewById(C10232R.C10236id.layDeliveryStoreLocation);
        this.f30190v0 = (LinearLayout) findViewById(C10232R.C10236id.layPickUpDropOffLocation);
        this.f30191w0 = (LinearLayout) findViewById(C10232R.C10236id.layYouStoreCustomer);
        this.f30193y0 = (LinearLayout) findViewById(C10232R.C10236id.layYouPickUpDropOff);
        this.f30192x0 = (LinearLayout) findViewById(C10232R.C10236id.layYouDropOff);
        this.f30194z0 = (LinearLayout) findViewById(C10232R.C10236id.llPickupLocation);
        this.f30127A0 = (LinearLayout) findViewById(C10232R.C10236id.llDropOffLocation);
        this.f30131E0 = (TextView) findViewById(C10232R.C10236id.tvDeliveryLocation);
        this.f30132F0 = (TextView) findViewById(C10232R.C10236id.tvStoreLocation);
        this.f30133G0 = (TextView) findViewById(C10232R.C10236id.tvTimeYouToStore);
        this.f30134H0 = (TextView) findViewById(C10232R.C10236id.tvTimeStoreToCustomer);
        this.f30135I0 = (TextView) findViewById(C10232R.C10236id.tvYouDropOffDistance);
        this.f30174f0 = findViewById(C10232R.C10236id.viewShadowBg);
        this.f30189u0 = (LinearLayout) findViewById(C10232R.C10236id.llBottomContainer);
        this.f30175g0 = (FrameLayout) findViewById(C10232R.C10236id.flMapContainer);
        this.f30186r0.setVisibility(0);
        this.f30191w0.setVisibility(0);
        this.f30180l0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabRedirectMap);
        this.f30181m0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMylocation);
        this.f30181m0.setOnClickListener(this);
        this.f30180l0.setOnClickListener(this);
        this.f30147Q0 = (RecyclerView) findViewById(C10232R.C10236id.rvSteps);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f30147Q0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f30147Q0.setItemAnimator(this.f30156V.mo23672x());
        this.f30149R0 = new C10965e(this, this.f30143O0);
        this.f30147Q0.setAdapter(this.f30149R0);
        Bundle bundle = this.f30179k0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33332j1)) {
                this.f30164Z = this.f30179k0.getInt(C11644i.f33332j1);
            }
            if (this.f30179k0.containsKey(C11644i.f33297f2)) {
                this.f30170b0 = (ChatInitModel) this.f30179k0.get(C11644i.f33297f2);
            }
            if (this.f30179k0.containsKey(C11644i.f33368n2)) {
                this.f30137K0 = this.f30179k0.getBoolean(C11644i.f33368n2);
            }
            if (this.f30170b0 != null) {
                m49936M();
                if (!this.f30137K0 || this.f30170b0.getSubmitDelaySec() <= 0) {
                    m49967d(false);
                    m49930G();
                } else {
                    m49929E();
                }
                m49927C();
                if (this.f30170b0.getOrder().isBundledOrder()) {
                    BundleOrderBean bundleOrderBean = new BundleOrderBean();
                    bundleOrderBean.setDistFromPreviousLoc(Double.valueOf(Double.parseDouble(this.f30170b0.getOrder().getDistance_courier_shop())));
                    bundleOrderBean.setDropoffAddress(this.f30170b0.getOrder().getvShopAddress());
                    bundleOrderBean.setTitle(getString(C10232R.string.lbl_pickup_new));
                    bundleOrderBean.setIcon(C10232R.C10235drawable.ic_package_sky_blue);
                    this.f30143O0.add(bundleOrderBean);
                    int i = 0;
                    while (i < this.f30170b0.getOrder().getBundledOrders().size()) {
                        new BundleOrderBean();
                        BundleOrderBean bundleOrderBean2 = (BundleOrderBean) this.f30170b0.getOrder().getBundledOrders().get(i);
                        String string = getString(C10232R.string.lbl_delivery_value);
                        StringBuilder sb = new StringBuilder();
                        i++;
                        sb.append(i);
                        sb.append("");
                        bundleOrderBean2.setTitle(String.format(string, new Object[]{sb.toString()}));
                        bundleOrderBean2.setIcon(C10232R.C10235drawable.img_location_new);
                        this.f30143O0.add(bundleOrderBean2);
                    }
                } else {
                    m49943T();
                }
            }
        }
        this.f30156V.mo23473E(C11644i.f33126K4);
        this.f30156V.mo23553a((C11056p) this);
        m49928D();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.fabMylocation /*2131362218*/:
                m49938O();
                return;
            case C10232R.C10236id.fabRedirectMap /*2131362220*/:
                if (m49946W()) {
                    C5887x xVar = this.f30156V;
                    xVar.mo23532a(xVar.mo23648p().latitude, this.f30156V.mo23648p().longitude, ((LatLng) m49933J().get(0)).latitude, ((LatLng) m49933J().get(0)).longitude, this.f30171c0, this.f30172d0);
                    return;
                }
                C5887x xVar2 = this.f30156V;
                xVar2.mo23531a(xVar2.mo23648p().latitude, this.f30156V.mo23648p().longitude, this.f30171c0, this.f30172d0);
                return;
            case C10232R.C10236id.ibBack /*2131362369*/:
                onBackPressed();
                return;
            case C10232R.C10236id.llInfo /*2131363053*/:
                if (this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps().size() > 0) {
                    m49965c(false);
                    return;
                }
                return;
            case C10232R.C10236id.llSend /*2131363147*/:
                m49940Q();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m49944U();
        getWindow().setSoftInputMode(2);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_offer_order);
        initViews();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10232R.C10237menu.menu_map, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.f30139M0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                onBackPressed();
                break;
            case C10232R.C10236id.action_Hybrid /*2131361853*/:
                m49973h(4);
                break;
            case C10232R.C10236id.action_map /*2131361871*/:
                m49973h(1);
                break;
            case C10232R.C10236id.action_satellite /*2131361881*/:
                m49973h(2);
                break;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        try {
            if (C11644i.f33302f7) {
                C11728i.m52794a(this);
            }
            if (this.f30156V == null) {
                this.f30156V = new C5887x(this);
            }
            if (this.f30156V.mo23624h() && this.f30156V.mo23502X() && this.f30156V.mo23500V() && this.f30166a == null) {
                this.f30152T.getMapAsync(new C10955k());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f30152T.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, 30, 30);
            }
            if (this.f30156V != null && this.f30156V.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                this.f30156V.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: C */
    private void m49927C() {
        if (this.f30170b0.isAllowDecimalDelCost()) {
            this.f30162Y.setInputType(8194);
            this.f30162Y.setFilters(new InputFilter[]{new C11647k(2)});
        } else {
            this.f30162Y.setInputType(2);
            this.f30162Y.setFilters(new InputFilter[]{new C10960p()});
        }
        this.f30162Y.clearFocus();
        if (this.f30170b0.getOrder().getvStatus().equalsIgnoreCase(C11644i.f33298f3)) {
            m49969e(getResources().getString(C10232R.string.lbl_msg_order_cancel));
        }
        if (this.f30170b0.getOrder().getvExpireIn() != null) {
            this.f30148R.setText(this.f30170b0.getOrder().getvExpireIn());
        }
        String str = "";
        if (this.f30170b0.getOrder().getvShopType().equalsIgnoreCase("service")) {
            this.f30186r0.setVisibility(8);
            this.f30191w0.setVisibility(8);
            this.f30190v0.setVisibility(0);
            if (this.f30170b0.getOrder().getServicePickupAvailable()) {
                this.f30193y0.setVisibility(0);
            } else {
                this.f30193y0.setVisibility(8);
                this.f30192x0.setVisibility(0);
                this.f30194z0.setVisibility(8);
                this.f30127A0.setPadding(0, 0, 0, 0);
            }
            TextView textView = this.f30131E0;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f30170b0.getOrder().getvAddress());
            textView.setText(sb.toString());
            TextView textView2 = this.f30132F0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30170b0.getOrder().getvPickupAddress());
            textView2.setText(sb2.toString());
            this.f30136J0 = false;
        } else {
            this.f30190v0.setVisibility(8);
            this.f30193y0.setVisibility(8);
            this.f30186r0.setVisibility(0);
            this.f30191w0.setVisibility(0);
            TextView textView3 = this.f30140N;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f30170b0.getOrder().getvAddress());
            textView3.setText(sb3.toString());
            TextView textView4 = this.f30142O;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f30170b0.getOrder().getvShopAddress());
            textView4.setText(sb4.toString());
            this.f30136J0 = true;
        }
        m49941R();
        TextView textView5 = this.f30169b;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(this.f30156V.mo23646o(this.f30170b0.getOrder().getvBuyerName()));
        textView5.setText(sb5.toString());
        C2232l.m11649c(getApplicationContext()).mo9515a(this.f30170b0.getOrder().getvBuyerPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10953i(this.f30158W));
        this.f30167a0 = this.f30170b0.getOrder().getExpiry_time();
        this.f30171c0 = this.f30170b0.getOrder().getLatitude();
        this.f30172d0 = this.f30170b0.getOrder().getLongitude();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m49967d(boolean z) {
        int i = 8;
        this.f30187s0.setVisibility(z ? 8 : 0);
        RelativeLayout relativeLayout = this.f30141N0;
        if (z) {
            i = 0;
        }
        relativeLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m49969e(String str) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_cancel_order);
        dialog.setCancelable(false);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtOk);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdMessage)).setText(str);
        dialog.setOnKeyListener(new C10958n(dialog));
        textView.setOnClickListener(new C10959o());
        textView2.setOnClickListener(new C10944a());
        try {
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m49973h(int i) {
        GoogleMap googleMap = this.f30166a;
        if (googleMap != null) {
            googleMap.setMapType(i);
        }
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (this.f30138L0 != null) {
            this.f30156V.mo23473E(C11644i.f33157O3);
            Intent intent = new Intent();
            intent.putExtra(C11644i.f33235Y1, this.f30162Y.getText().toString().trim());
            intent.putExtra(C11644i.f33243Z1, this.f30138L0.getMessage());
            intent.putExtra(C11644i.f33288e2, this.f30138L0.getOffer_id());
            setResult(-1, intent);
            finish();
            C11694e eVar = C11694e.INSTANCE;
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(this.f30170b0.getOrder().getiBuyerId());
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.f30170b0.getOrder().getiOrderId());
            eVar.mo40206d(sb2, sb3.toString());
        }
    }

    /* renamed from: v */
    public void mo37677v() {
        StringBuilder sb = new StringBuilder();
        sb.append("onLocation Lat :");
        sb.append(this.f30156V.mo23648p().latitude);
        sb.append(" Lng: ");
        sb.append(this.f30156V.mo23648p().longitude);
        C5880q.m25751b(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49965c(boolean z) {
        try {
            if (this.f30156V.mo23497S()) {
                if (this.f30168a1 == null) {
                    View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_offer_price, null);
                    this.f30168a1 = new C5665a(this, C10232R.style.DialogStyle);
                    this.f30165Z0 = (ViewPager) inflate.findViewById(C10232R.C10236id.viewPager);
                    m49945V();
                    CirclePageIndicator circlePageIndicator = (CirclePageIndicator) inflate.findViewById(C10232R.C10236id.pagerIndicator);
                    this.f30165Z0.setAdapter(new C10967f(this, this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps(), this.f30156V.mo23496R()));
                    circlePageIndicator.setViewPager(this.f30165Z0);
                    ((ImageView) inflate.findViewById(C10232R.C10236id.ivNext)).setOnClickListener(new C10947d(z));
                    if (!(this.f30159W0 == null || this.f30159W0.getCourierWalkThroughBean() == null || this.f30159W0.getCourierWalkThroughBean().getCourierWalkthroughSteps().size() != 1)) {
                        ((TextView) inflate.findViewById(C10232R.C10236id.btnGotIt)).setText(getString(C10232R.string.lbl_got_it));
                        circlePageIndicator.setVisibility(4);
                    }
                    this.f30165Z0.addOnPageChangeListener(new C10948e(inflate));
                    this.f30168a1.setOnShowListener(new C10949f());
                    this.f30168a1.setCancelable(false);
                    this.f30168a1.setContentView(inflate);
                    this.f30168a1.getWindow().setSoftInputMode(19);
                    this.f30168a1.setOnKeyListener(new C10963c(this));
                } else if (this.f30165Z0 != null) {
                    this.f30165Z0.setCurrentItem(0);
                }
                if (this.f30168a1 != null && !this.f30168a1.isShowing()) {
                    this.f30168a1.show();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo38708b(Dialog dialog, View view) {
        dialog.dismiss();
        m49939P();
    }

    /* renamed from: a */
    public /* synthetic */ void mo38706a(Thread thread, Throwable th) {
        startActivity(new Intent(this, SplashActivity.class));
        finish();
        System.exit(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m49952a(int i, String str) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_pending_order, null);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivPin);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvIndex);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C10232R.C10236id.rtMultiDispatch);
        RelativeLayout relativeLayout2 = (RelativeLayout) inflate.findViewById(C10232R.C10236id.rtSingleOrder);
        if (i == 1) {
            imageView.setImageResource(C10232R.C10235drawable.img_current_location_new);
            textView.setText(getResources().getString(C10232R.string.lbl_you));
            textView.setBackgroundResource(C10232R.C10235drawable.marker_pin_you);
            textView.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
            layoutParams.topMargin = (int) getResources().getDimension(C10232R.dimen.scale_sub_15dp);
        } else if (i == 2) {
            imageView.setImageResource(C10232R.C10235drawable.marker_pick_off);
            textView.setText(getResources().getString(C10232R.string.lbl_pickup));
            textView.setBackgroundResource(C10232R.C10235drawable.marker_pin_pickup);
            textView.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.shops_title_text_gray));
            layoutParams.topMargin = (int) getResources().getDimension(C10232R.dimen.scale_sub_10dp);
        } else if (i == 3) {
            imageView.setImageResource(C10232R.C10235drawable.marker_drop_off);
            textView.setText(getResources().getString(C10232R.string.lbl_dropoff));
            textView.setBackgroundResource(C10232R.C10235drawable.marker_pin_drop_off);
            textView.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
            layoutParams.topMargin = (int) getResources().getDimension(C10232R.dimen.scale_sub_10dp);
        } else if (i == 4) {
            textView2.setText(str);
            relativeLayout.setVisibility(0);
            relativeLayout2.setVisibility(8);
            imageView.setVisibility(8);
        }
        imageView.setLayoutParams(layoutParams);
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo38707a(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4) {
            ViewPager viewPager = this.f30165Z0;
            if (!(viewPager == null || viewPager.getCurrentItem() == 0)) {
                this.f30165Z0.setCurrentItem(this.f30165Z0.getCurrentItem() - 1, true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo38705a(PayoutModalLabelsBean payoutModalLabelsBean) {
        Dialog a = this.f30156V.mo23508a((int) C10232R.layout.dialog_hyperpay_payout, true);
        TextView textView = (TextView) a.findViewById(C10232R.C10236id.txtTitle);
        TextView textView2 = (TextView) a.findViewById(C10232R.C10236id.txtBody1);
        TextView textView3 = (TextView) a.findViewById(C10232R.C10236id.txtBody2);
        MaterialButton materialButton = (MaterialButton) a.findViewById(C10232R.C10236id.btnCancel);
        MaterialButton materialButton2 = (MaterialButton) a.findViewById(C10232R.C10236id.btnOk);
        materialButton.setOnClickListener(new C10964d(this, a));
        materialButton2.setOnClickListener(new C10961a(this, a));
        if (payoutModalLabelsBean != null) {
            textView.setText(payoutModalLabelsBean.getTitle());
            textView2.setText(payoutModalLabelsBean.getBody1());
            textView3.setText(payoutModalLabelsBean.getBody2());
            materialButton.setText(payoutModalLabelsBean.getCancelBtn());
            materialButton2.setText(payoutModalLabelsBean.getRegisterNowBtn());
        }
        a.show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo38704a(Dialog dialog, View view) {
        dialog.dismiss();
        finish();
    }
}
