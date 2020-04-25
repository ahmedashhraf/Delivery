package com.mrsool.createorder;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnCameraIdleListener;
import com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mrsool.C10232R;
import com.mrsool.C10796f;
import com.mrsool.bean.GoogleShareUrlBean;
import com.mrsool.bean.ReverseGeocodeBean;
import com.mrsool.chat.C10526n;
import com.mrsool.p423v.C11728i;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p420b0.C11573b;
import com.mrsool.utils.p420b0.C11589f;
import com.mrsool.utils.webservice.C11687c;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p053b.p072g.p073b.C2128a;
import p212io.fabric.sdk.android.p493p.p495b.C14236a;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PicOrderLocationActivityRevised extends C10796f implements OnClickListener, C11573b {

    /* renamed from: Q0 */
    private static int f28834Q0 = C14236a.DEFAULT_TIMEOUT;

    /* renamed from: R0 */
    private static int f28835R0 = C10526n.f28536a;

    /* renamed from: S0 */
    private static int f28836S0 = 10;

    /* renamed from: T0 */
    private static final int f28837T0 = 1000;

    /* renamed from: U0 */
    static final /* synthetic */ boolean f28838U0 = false;

    /* renamed from: A0 */
    private int f28839A0;

    /* renamed from: B0 */
    private boolean f28840B0;
    /* access modifiers changed from: private */

    /* renamed from: C0 */
    public TextView f28841C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public TextView f28842D0;

    /* renamed from: E0 */
    private TextView f28843E0;

    /* renamed from: F0 */
    private ImageView f28844F0;

    /* renamed from: G0 */
    private TextView f28845G0;

    /* renamed from: H0 */
    private EditText f28846H0;

    /* renamed from: I0 */
    private String f28847I0;

    /* renamed from: J0 */
    private ProgressBar f28848J0;

    /* renamed from: K0 */
    private ProgressBar f28849K0;

    /* renamed from: L0 */
    private EditText f28850L0;

    /* renamed from: M0 */
    private int f28851M0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public SupportMapFragment f28852N;

    /* renamed from: N0 */
    private int f28853N0;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C5887x f28854O;

    /* renamed from: O0 */
    private BroadcastReceiver f28855O0;

    /* renamed from: P */
    private C11669t f28856P;

    /* renamed from: P0 */
    private BroadcastReceiver f28857P0;

    /* renamed from: Q */
    private Geocoder f28858Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C11589f f28859R;

    /* renamed from: S */
    private List<Address> f28860S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public Marker f28861T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public LinearLayout f28862U;

    /* renamed from: V */
    private TextView f28863V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f28864W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public double f28865X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public double f28866Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public LatLng f28867Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public LatLng f28868a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public GoogleMap f28869b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public LatLng f28870b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public String f28871c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public String f28872d0;

    /* renamed from: e0 */
    private String f28873e0 = null;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public String f28874f0;

    /* renamed from: g0 */
    private String f28875g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f28876h0 = null;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public String f28877i0 = null;

    /* renamed from: j0 */
    private String f28878j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public BitmapDescriptor f28879k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public boolean f28880l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public TextView f28881m0;

    /* renamed from: n0 */
    private TextView f28882n0;

    /* renamed from: o0 */
    private TextView f28883o0;

    /* renamed from: p0 */
    private TextView f28884p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public boolean f28885q0;

    /* renamed from: r0 */
    private Bundle f28886r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public boolean f28887s0;

    /* renamed from: t0 */
    private FloatingActionButton f28888t0;

    /* renamed from: u0 */
    private FloatingActionButton f28889u0;

    /* renamed from: v0 */
    private View f28890v0;

    /* renamed from: w0 */
    private OnCameraIdleListener f28891w0;

    /* renamed from: x0 */
    private String f28892x0;

    /* renamed from: y0 */
    private Location f28893y0;

    /* renamed from: z0 */
    private int f28894z0;

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$a */
    class C10586a implements OnCameraMoveStartedListener {
        C10586a() {
        }

        public void onCameraMoveStarted(int i) {
            if (i == 1) {
                PicOrderLocationActivityRevised.this.f28887s0 = false;
                PicOrderLocationActivityRevised.this.m48924d(true);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$b */
    class C10587b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28896a;

        C10587b(Dialog dialog) {
            this.f28896a = dialog;
        }

        public void onClick(View view) {
            this.f28896a.dismiss();
            PicOrderLocationActivityRevised.this.m48908a(false, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$c */
    class C10588c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28898a;

        C10588c(Dialog dialog) {
            this.f28898a = dialog;
        }

        public void onClick(View view) {
            this.f28898a.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$d */
    class C10589d extends BroadcastReceiver {
        C10589d() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo37995a(BitmapDescriptor bitmapDescriptor) {
            PicOrderLocationActivityRevised picOrderLocationActivityRevised = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised.m48907a(true, picOrderLocationActivityRevised.f28869b);
            C5880q.m25751b("on camera change");
            if (PicOrderLocationActivityRevised.this.f28880l0) {
                PicOrderLocationActivityRevised.this.f28885q0 = true;
            } else {
                PicOrderLocationActivityRevised.this.f28885q0 = false;
            }
            PicOrderLocationActivityRevised.this.f28880l0 = false;
            PicOrderLocationActivityRevised picOrderLocationActivityRevised2 = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised2.f28870b0 = picOrderLocationActivityRevised2.f28869b.getCameraPosition().target;
            PicOrderLocationActivityRevised.this.f28869b.clear();
            PicOrderLocationActivityRevised picOrderLocationActivityRevised3 = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised3.f28861T = picOrderLocationActivityRevised3.f28869b.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevised.this.f28870b0).icon(bitmapDescriptor));
            LatLng fromScreenLocation = PicOrderLocationActivityRevised.this.f28869b.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevised.this.f28842D0.getX(), (int) PicOrderLocationActivityRevised.this.f28842D0.getY()));
            StringBuilder sb = new StringBuilder();
            sb.append("geoPoint : Lat->");
            sb.append(fromScreenLocation.latitude);
            String str = " Lng->";
            sb.append(str);
            sb.append(fromScreenLocation.longitude);
            C5880q.m25751b(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("centerPoint : Lat->");
            sb2.append(PicOrderLocationActivityRevised.this.f28870b0.latitude);
            sb2.append(str);
            sb2.append(PicOrderLocationActivityRevised.this.f28870b0.longitude);
            C5880q.m25751b(sb2.toString());
            PicOrderLocationActivityRevised.this.f28864W.setText("Loading...");
            try {
                PicOrderLocationActivityRevised.this.m48906a(String.valueOf(PicOrderLocationActivityRevised.this.f28870b0.latitude), String.valueOf(PicOrderLocationActivityRevised.this.f28870b0.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onReceive(Context context, Intent intent) {
            String str = "p_lat";
            if (intent.getAction().endsWith("aaa")) {
                try {
                    PicOrderLocationActivityRevised.this.f28859R = new C11589f(PicOrderLocationActivityRevised.this);
                    PicOrderLocationActivityRevised.this.f28859R.mo39763a();
                    PicOrderLocationActivityRevised.this.f28862U.setVisibility(0);
                    if (PicOrderLocationActivityRevised.this.f28859R != null) {
                        PicOrderLocationActivityRevised.this.f28865X = PicOrderLocationActivityRevised.this.f28859R.mo39764b();
                        PicOrderLocationActivityRevised.this.f28866Y = PicOrderLocationActivityRevised.this.f28859R.mo39768d();
                    }
                    PicOrderLocationActivityRevised.this.f28869b.setInfoWindowAdapter(new C10602p());
                    PicOrderLocationActivityRevised.this.m48889S();
                    if (PicOrderLocationActivityRevised.this.getIntent().hasExtra(str)) {
                        PicOrderLocationActivityRevised.this.f28876h0 = PicOrderLocationActivityRevised.this.getIntent().getStringExtra(str);
                        PicOrderLocationActivityRevised.this.f28877i0 = PicOrderLocationActivityRevised.this.getIntent().getStringExtra("p_lng");
                    } else if (PicOrderLocationActivityRevised.this.f28865X == 0.0d) {
                        PicOrderLocationActivityRevised.this.f28876h0 = String.valueOf(PicOrderLocationActivityRevised.this.f28854O.mo23468C().mo23459f(C11644i.f33303g));
                        PicOrderLocationActivityRevised.this.f28877i0 = String.valueOf(PicOrderLocationActivityRevised.this.f28854O.mo23468C().mo23459f(C11644i.f33312h));
                    } else {
                        PicOrderLocationActivityRevised.this.f28876h0 = String.valueOf(intent.getStringExtra("latitude"));
                        PicOrderLocationActivityRevised.this.f28877i0 = String.valueOf(intent.getStringExtra("longitude"));
                    }
                    PicOrderLocationActivityRevised.this.f28867Z = new LatLng(Double.valueOf(PicOrderLocationActivityRevised.this.f28876h0).doubleValue(), Double.valueOf(PicOrderLocationActivityRevised.this.f28877i0).doubleValue());
                    PicOrderLocationActivityRevised.this.f28868a0 = PicOrderLocationActivityRevised.this.f28867Z;
                    BitmapDescriptor G = PicOrderLocationActivityRevised.this.mo37984G();
                    if (!(PicOrderLocationActivityRevised.this.f28868a0 == null || PicOrderLocationActivityRevised.this.f28869b == null)) {
                        PicOrderLocationActivityRevised.this.f28869b.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(PicOrderLocationActivityRevised.this.f28868a0).zoom(16.0f).build()));
                        C5880q.m25751b("moveCamera Called");
                    }
                    PicOrderLocationActivityRevised.this.f28869b.setOnCameraIdleListener(new C10638k(this, G));
                } catch (Exception e) {
                    e.printStackTrace();
                    PicOrderLocationActivityRevised picOrderLocationActivityRevised = PicOrderLocationActivityRevised.this;
                    picOrderLocationActivityRevised.m48907a(true, picOrderLocationActivityRevised.f28869b);
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$e */
    class C10590e implements Callback<GoogleShareUrlBean> {
        C10590e() {
        }

        public void onFailure(Call<GoogleShareUrlBean> call, Throwable th) {
            PicOrderLocationActivityRevised.this.m48928e(false);
            try {
                PicOrderLocationActivityRevised.this.f28854O.mo23492O();
                PicOrderLocationActivityRevised.this.f28854O.mo23653q0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<GoogleShareUrlBean> call, Response<GoogleShareUrlBean> response) {
            PicOrderLocationActivityRevised.this.f28854O.mo23492O();
            PicOrderLocationActivityRevised.this.m48928e(false);
            try {
                if (response.isSuccessful()) {
                    GoogleShareUrlBean googleShareUrlBean = (GoogleShareUrlBean) response.body();
                    if (googleShareUrlBean.getCode().intValue() <= 300) {
                        PicOrderLocationActivityRevised.this.f28869b.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(googleShareUrlBean.getLatitude().doubleValue(), googleShareUrlBean.getLongitude().doubleValue()), 16.0f));
                        PicOrderLocationActivityRevised.this.f28887s0 = false;
                        return;
                    }
                    PicOrderLocationActivityRevised.this.f28854O.mo23615f(googleShareUrlBean.getMessage(), PicOrderLocationActivityRevised.this.getResources().getString(C10232R.string.app_name));
                    return;
                }
                PicOrderLocationActivityRevised.this.f28854O.mo23615f(response.message(), PicOrderLocationActivityRevised.this.getResources().getString(C10232R.string.app_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$f */
    class C10591f implements Callback<ReverseGeocodeBean> {

        /* renamed from: a */
        final /* synthetic */ String f28902a;

        /* renamed from: b */
        final /* synthetic */ String f28903b;

        C10591f(String str, String str2) {
            this.f28902a = str;
            this.f28903b = str2;
        }

        public void onFailure(Call<ReverseGeocodeBean> call, Throwable th) {
            if (PicOrderLocationActivityRevised.this.f28854O != null) {
                PicOrderLocationActivityRevised.this.m48919c(false);
            }
        }

        public void onResponse(Call<ReverseGeocodeBean> call, Response<ReverseGeocodeBean> response) {
            if (PicOrderLocationActivityRevised.this.f28854O != null) {
                PicOrderLocationActivityRevised.this.m48919c(false);
                if (response.isSuccessful() && ((ReverseGeocodeBean) response.body()).getCode().intValue() <= 300) {
                    PicOrderLocationActivityRevised.this.f28864W.setVisibility(0);
                    PicOrderLocationActivityRevised.this.f28864W.setText(((ReverseGeocodeBean) response.body()).getAddress().trim());
                    PicOrderLocationActivityRevised.this.f28874f0 = ((ReverseGeocodeBean) response.body()).getAddress().trim();
                    PicOrderLocationActivityRevised.this.f28871c0 = this.f28902a;
                    PicOrderLocationActivityRevised.this.f28872d0 = this.f28903b;
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$g */
    class C10592g extends BroadcastReceiver {
        C10592g() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("")) {
                if (PicOrderLocationActivityRevised.this.f28861T != null) {
                    PicOrderLocationActivityRevised picOrderLocationActivityRevised = PicOrderLocationActivityRevised.this;
                    picOrderLocationActivityRevised.f28879k0 = picOrderLocationActivityRevised.mo37984G();
                    PicOrderLocationActivityRevised.this.f28861T.remove();
                    PicOrderLocationActivityRevised picOrderLocationActivityRevised2 = PicOrderLocationActivityRevised.this;
                    picOrderLocationActivityRevised2.f28861T = picOrderLocationActivityRevised2.f28869b.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevised.this.f28870b0).icon(PicOrderLocationActivityRevised.this.f28879k0));
                }
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33335j4) && PicOrderLocationActivityRevised.this.f28887s0 && PicOrderLocationActivityRevised.this.f28869b != null) {
                PicOrderLocationActivityRevised.this.f28869b.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(new LatLng(intent.getDoubleExtra("latitude", 0.0d), intent.getDoubleExtra("longitude", 0.0d))).zoom(16.0f).build()));
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$h */
    class C10593h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28906a;

        C10593h(Dialog dialog) {
            this.f28906a = dialog;
        }

        public void onClick(View view) {
            this.f28906a.dismiss();
            if (PicOrderLocationActivityRevised.this.f28869b != null) {
                PicOrderLocationActivityRevised.this.f28869b.setMapType(1);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$i */
    class C10594i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28908a;

        C10594i(Dialog dialog) {
            this.f28908a = dialog;
        }

        public void onClick(View view) {
            this.f28908a.dismiss();
            if (PicOrderLocationActivityRevised.this.f28869b != null) {
                PicOrderLocationActivityRevised.this.f28869b.setMapType(4);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$j */
    class C10595j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28910a;

        C10595j(Dialog dialog) {
            this.f28910a = dialog;
        }

        public void onClick(View view) {
            this.f28910a.dismiss();
            if (PicOrderLocationActivityRevised.this.f28869b != null) {
                PicOrderLocationActivityRevised.this.f28869b.setMapType(2);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$k */
    class C10596k implements C11673d {

        /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$k$a */
        class C10597a implements OnMapReadyCallback {
            C10597a() {
            }

            public void onMapReady(GoogleMap googleMap) {
                PicOrderLocationActivityRevised picOrderLocationActivityRevised = PicOrderLocationActivityRevised.this;
                picOrderLocationActivityRevised.f28869b = picOrderLocationActivityRevised.f28854O.mo23514a(googleMap, PicOrderLocationActivityRevised.this.f28852N, true, true);
                PicOrderLocationActivityRevised.this.f28869b.setMyLocationEnabled(false);
                PicOrderLocationActivityRevised picOrderLocationActivityRevised2 = PicOrderLocationActivityRevised.this;
                picOrderLocationActivityRevised2.m48907a(false, picOrderLocationActivityRevised2.f28869b);
                C5880q.m25751b("onMapReady Called");
                LayoutParams layoutParams = (LayoutParams) ((View) PicOrderLocationActivityRevised.this.f28852N.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, 30, 30);
                PicOrderLocationActivityRevised.this.m48881K();
            }
        }

        C10596k() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            try {
                C1382h supportFragmentManager = PicOrderLocationActivityRevised.this.getSupportFragmentManager();
                PicOrderLocationActivityRevised.this.f28852N = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
                if (PicOrderLocationActivityRevised.this.f28852N == null) {
                    PicOrderLocationActivityRevised.this.f28852N = SupportMapFragment.newInstance();
                    supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, PicOrderLocationActivityRevised.this.f28852N).mo6100f();
                }
                if (PicOrderLocationActivityRevised.this.f28869b == null && PicOrderLocationActivityRevised.this.f28854O.mo23502X() && PicOrderLocationActivityRevised.this.f28854O.mo23500V()) {
                    PicOrderLocationActivityRevised.this.f28852N.getMapAsync(new C10597a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$l */
    class C10598l implements Runnable {
        C10598l() {
        }

        public void run() {
            MapsInitializer.initialize(PicOrderLocationActivityRevised.this.getApplicationContext());
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$m */
    class C10599m implements OnEditorActionListener {
        C10599m() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                PicOrderLocationActivityRevised.this.m48886P();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$n */
    class C10600n implements OnCameraIdleListener {
        C10600n() {
        }

        public void onCameraIdle() {
            PicOrderLocationActivityRevised picOrderLocationActivityRevised = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised.m48907a(true, picOrderLocationActivityRevised.f28869b);
            C5880q.m25751b("on camera change");
            if (PicOrderLocationActivityRevised.this.f28880l0) {
                PicOrderLocationActivityRevised.this.f28887s0 = true;
            }
            if (PicOrderLocationActivityRevised.this.f28880l0) {
                PicOrderLocationActivityRevised.this.f28885q0 = true;
            } else {
                PicOrderLocationActivityRevised.this.f28885q0 = false;
            }
            if (PicOrderLocationActivityRevised.this.f28887s0) {
                PicOrderLocationActivityRevised.this.f28841C0.setVisibility(0);
                TextView d = PicOrderLocationActivityRevised.this.f28841C0;
                String string = PicOrderLocationActivityRevised.this.getString(C10232R.string.lbl_accurate_to);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(PicOrderLocationActivityRevised.this.f28854O.mo23468C().mo23459f(C11644i.f33321i));
                d.setText(String.format(string, new Object[]{sb.toString()}));
            } else {
                PicOrderLocationActivityRevised.this.f28841C0.setVisibility(8);
            }
            PicOrderLocationActivityRevised.this.f28880l0 = false;
            PicOrderLocationActivityRevised picOrderLocationActivityRevised2 = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised2.f28870b0 = picOrderLocationActivityRevised2.f28869b.getCameraPosition().target;
            PicOrderLocationActivityRevised.this.f28869b.clear();
            LatLng fromScreenLocation = PicOrderLocationActivityRevised.this.f28869b.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevised.this.f28842D0.getX(), (int) PicOrderLocationActivityRevised.this.f28842D0.getY()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("geoPoint : Lat->");
            sb2.append(fromScreenLocation.latitude);
            String str = " Lng->";
            sb2.append(str);
            sb2.append(fromScreenLocation.longitude);
            C5880q.m25751b(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("centerPoint : Lat->");
            sb3.append(PicOrderLocationActivityRevised.this.f28870b0.latitude);
            sb3.append(str);
            sb3.append(PicOrderLocationActivityRevised.this.f28870b0.longitude);
            C5880q.m25751b(sb3.toString());
            PicOrderLocationActivityRevised picOrderLocationActivityRevised3 = PicOrderLocationActivityRevised.this;
            picOrderLocationActivityRevised3.f28861T = picOrderLocationActivityRevised3.f28869b.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevised.this.f28870b0).icon(PicOrderLocationActivityRevised.this.f28879k0));
            try {
                PicOrderLocationActivityRevised.this.m48906a(String.valueOf(PicOrderLocationActivityRevised.this.f28870b0.latitude), String.valueOf(PicOrderLocationActivityRevised.this.f28870b0.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$o */
    class C10601o implements OnMyLocationButtonClickListener {
        C10601o() {
        }

        public boolean onMyLocationButtonClick() {
            PicOrderLocationActivityRevised.this.f28880l0 = true;
            PicOrderLocationActivityRevised.this.f28887s0 = true;
            PicOrderLocationActivityRevised.this.m48924d(false);
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$p */
    private class C10602p implements InfoWindowAdapter {

        /* renamed from: a */
        private View f28918a;

        public C10602p() {
            this.f28918a = PicOrderLocationActivityRevised.this.getLayoutInflater().inflate(C10232R.layout.custom_info_window, null);
        }

        public View getInfoContents(Marker marker) {
            return null;
        }

        public View getInfoWindow(Marker marker) {
            PicOrderLocationActivityRevised.this.f28861T = marker;
            String snippet = marker.getSnippet();
            TextView textView = (TextView) this.f28918a.findViewById(C10232R.C10236id.title);
            TextView textView2 = (TextView) this.f28918a.findViewById(C10232R.C10236id.txtAccuracy);
            LinearLayout linearLayout = (LinearLayout) this.f28918a.findViewById(C10232R.C10236id.llAccuracy);
            PicOrderLocationActivityRevised.this.f28881m0 = textView;
            textView.setTextColor(C0841b.m4915a(PicOrderLocationActivityRevised.this.getApplicationContext(), (int) C10232R.C10234color.Black));
            String str = "";
            if (snippet == null) {
                snippet = str;
            }
            textView.setText(snippet);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(PicOrderLocationActivityRevised.this.m48879I());
            textView2.setText(sb.toString());
            boolean r = PicOrderLocationActivityRevised.this.f28887s0;
            linearLayout.setVisibility(8);
            return this.f28918a;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevised$q */
    private class C10603q extends Handler {
        private C10603q() {
        }

        public void handleMessage(Message message) {
            String str;
            if (message.what != 1) {
                str = null;
            } else {
                str = message.getData().getString("address");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Final address is :");
            sb.append(str);
            C5880q.m25751b(sb.toString());
        }
    }

    static {
        Class<PicOrderLocationActivityRevised> cls = PicOrderLocationActivityRevised.class;
    }

    public PicOrderLocationActivityRevised() {
        String str = C14265s.f42076o;
        this.f28871c0 = str;
        this.f28872d0 = str;
        String str2 = "";
        this.f28878j0 = str2;
        this.f28880l0 = true;
        this.f28885q0 = true;
        this.f28887s0 = true;
        this.f28892x0 = str2;
        this.f28894z0 = 2;
        this.f28839A0 = 1;
        this.f28840B0 = false;
        this.f28847I0 = str2;
        this.f28853N0 = -1;
        this.f28855O0 = new C10592g();
        this.f28857P0 = new C10589d();
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public String m48879I() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(getResources().getString(C10232R.string.lbl_accuracy));
        sb.append(": ");
        sb.append(this.f28854O.mo23468C().mo23459f(C11644i.f33321i));
        sb.append(C3868i.f12248b);
        sb.append(getResources().getString(C10232R.string.lbl_meters));
        return sb.toString();
    }

    /* renamed from: J */
    private void m48880J() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = "location";
            if (extras.containsKey(str)) {
                this.f28851M0 = extras.getInt(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m48881K() {
        this.f28886r0 = getIntent().getExtras();
        this.f28845G0 = (TextView) findViewById(C10232R.C10236id.tvGo);
        this.f28862U = (LinearLayout) findViewById(C10232R.C10236id.locationMarker);
        this.f28888t0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMylocation);
        this.f28889u0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMapStyle);
        this.f28890v0 = findViewById(C10232R.C10236id.flBack);
        this.f28882n0 = (TextView) findViewById(C10232R.C10236id.tvMapNormal);
        this.f28883o0 = (TextView) findViewById(C10232R.C10236id.tvMapSatellite);
        this.f28884p0 = (TextView) findViewById(C10232R.C10236id.tvMapHybrid);
        this.f28845G0.setOnClickListener(this);
        this.f28889u0.setOnClickListener(this);
        this.f28888t0.setOnClickListener(this);
        this.f28882n0.setOnClickListener(this);
        this.f28883o0.setOnClickListener(this);
        this.f28884p0.setOnClickListener(this);
        this.f28890v0.setOnClickListener(this);
        this.f28863V = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f28864W = (TextView) findViewById(C10232R.C10236id.tvAccuracyAddress);
        this.f28842D0 = (TextView) findViewById(C10232R.C10236id.txtDot);
        this.f28841C0 = (TextView) findViewById(C10232R.C10236id.tvAccuracy);
        this.f28849K0 = (ProgressBar) findViewById(C10232R.C10236id.pgPlaceLoader);
        this.f28846H0 = (EditText) findViewById(C10232R.C10236id.etSearch);
        this.f28850L0 = (EditText) findViewById(C10232R.C10236id.edtfloorNo);
        this.f28843E0 = (TextView) findViewById(C10232R.C10236id.btnSelectLocation);
        this.f28843E0.setOnClickListener(this);
        m48887Q();
        this.f28848J0 = (ProgressBar) findViewById(C10232R.C10236id.pglocate);
        this.f28844F0 = (ImageView) findViewById(C10232R.C10236id.ivRoundPin);
        TextView textView = this.f28841C0;
        String string = getString(C10232R.string.lbl_accurate_to);
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f28854O.mo23468C().mo23459f(C11644i.f33321i));
        textView.setText(String.format(string, new Object[]{sb.toString()}));
        Bundle bundle = this.f28886r0;
        if (bundle == null) {
            this.f28863V.setText(getString(C10232R.string.lbl_delivery_location));
        } else if (bundle.containsKey(C11644i.f33391q1)) {
            this.f28863V.setText(this.f28886r0.getString(C11644i.f33391q1));
        } else {
            this.f28863V.setText(getString(C10232R.string.lbl_delivery_location));
        }
        runOnUiThread(new C10598l());
        m48924d(false);
        GoogleMap googleMap = this.f28869b;
        if (googleMap != null) {
            googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        }
        this.f28846H0.setOnEditorActionListener(new C10599m());
        if (this.f28854O.mo23496R()) {
            this.f28864W.setTextDirection(4);
            this.f28850L0.setTextDirection(4);
        }
        m48934h(1);
        mo37983E();
    }

    /* renamed from: L */
    private boolean m48882L() {
        Bundle bundle = this.f28886r0;
        if (bundle == null || !bundle.containsKey(C11644i.f33155O1)) {
            return false;
        }
        return this.f28886r0.getBoolean(C11644i.f33155O1);
    }

    /* renamed from: M */
    private boolean m48883M() {
        if (!TextUtils.isEmpty(this.f28846H0.getText().toString().trim())) {
            return true;
        }
        this.f28854O.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
        return false;
    }

    /* renamed from: N */
    private void m48884N() {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        dialog.setCancelable(true);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
        textView.setText(C10232R.string.msg_accuracy_warning);
        textView2.setText(C10232R.string.lbl_yes);
        textView3.setText(C10232R.string.lbl_no_revised);
        textView2.setAllCaps(true);
        textView3.setAllCaps(true);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setOnClickListener(new C10587b(dialog));
        textView3.setOnClickListener(new C10588c(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: O */
    private void m48885O() {
        this.f28880l0 = true;
        this.f28887s0 = true;
        m48924d(false);
        try {
            if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                if (this.f28893y0 != null) {
                    this.f28865X = this.f28893y0.getLatitude();
                    this.f28866Y = this.f28893y0.getLongitude();
                } else {
                    this.f28854O.mo23489M("(Couldn't get the location. Make sure location is enabled on the device)");
                }
                m48889S();
                if (this.f28865X == 0.0d) {
                    this.f28876h0 = String.valueOf(this.f28854O.mo23468C().mo23459f(C11644i.f33303g));
                    this.f28877i0 = String.valueOf(this.f28854O.mo23468C().mo23459f(C11644i.f33312h));
                } else {
                    this.f28876h0 = String.valueOf(this.f28865X);
                    this.f28877i0 = String.valueOf(this.f28866Y);
                }
                this.f28867Z = new LatLng(Double.valueOf(this.f28876h0).doubleValue(), Double.valueOf(this.f28877i0).doubleValue());
                this.f28868a0 = this.f28867Z;
                BitmapDescriptor G = mo37984G();
                if (!(this.f28868a0 == null || this.f28869b == null)) {
                    this.f28869b.animateCamera(CameraUpdateFactory.newLatLngZoom(this.f28868a0, 16.0f));
                    C5880q.m25751b("moveCamera Called");
                }
                this.f28869b.setOnCameraIdleListener(new C10640m(this, G));
            }
        } catch (Exception e) {
            e.printStackTrace();
            m48907a(true, this.f28869b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m48886P() {
        String str = "";
        String str2 = ",";
        try {
            String trim = this.f28846H0.getText().toString().trim();
            if (m48954r(trim)) {
                trim = mo37988e(trim);
            }
            if (m48946n(trim.toLowerCase())) {
                m48940k(trim);
            } else if (m48958t(trim)) {
                m48960u(trim);
            } else {
                if (!m48952q(trim)) {
                    if (!m48948o(trim)) {
                        if (!trim.contains(str2)) {
                            this.f28854O.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                        } else if (trim.indexOf(str2) == trim.lastIndexOf(str2)) {
                            m48960u(trim.replaceAll(C3868i.f12248b, str));
                        } else {
                            this.f28854O.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                        }
                    }
                }
                if (m48956s(trim)) {
                    m48960u(trim);
                } else {
                    this.f28854O.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f28846H0.setText(str);
        this.f28854O.mo23494P();
    }

    /* renamed from: Q */
    private void m48887Q() {
        this.f28891w0 = new C10600n();
    }

    /* renamed from: R */
    private void m48888R() {
        String str = "p_lat";
        try {
            m48889S();
            if (getIntent().hasExtra(str)) {
                this.f28876h0 = getIntent().getStringExtra(str);
                this.f28877i0 = getIntent().getStringExtra("p_lng");
                m48924d(true);
            } else if (this.f28865X == 0.0d) {
                this.f28876h0 = String.valueOf(this.f28854O.mo23468C().mo23459f(C11644i.f33303g));
                this.f28877i0 = String.valueOf(this.f28854O.mo23468C().mo23459f(C11644i.f33312h));
            } else {
                this.f28876h0 = String.valueOf(this.f28865X);
                this.f28877i0 = String.valueOf(this.f28866Y);
            }
            this.f28867Z = new LatLng(Double.valueOf(this.f28876h0).doubleValue(), Double.valueOf(this.f28877i0).doubleValue());
            this.f28868a0 = this.f28867Z;
            BitmapDescriptor G = mo37984G();
            if (!(this.f28868a0 == null || this.f28869b == null)) {
                this.f28869b.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(this.f28868a0).zoom(16.0f).build()));
            }
            this.f28869b.setOnCameraIdleListener(new C10639l(this, G));
        } catch (Exception e) {
            e.printStackTrace();
            m48907a(true, this.f28869b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m48889S() {
        this.f28869b.setOnMyLocationButtonClickListener(new C10601o());
        this.f28869b.setOnCameraMoveStartedListener(new C10586a());
    }

    /* renamed from: T */
    private void m48890T() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_map_style);
        dialog.setCancelable(true);
        C5887x xVar = this.f28854O;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvSatellite);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvHybrid);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMap)).setOnClickListener(new C10593h(dialog));
        textView2.setOnClickListener(new C10594i(dialog));
        textView.setOnClickListener(new C10595j(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: U */
    private void m48891U() {
        this.f28882n0.setSelected(false);
        this.f28883o0.setSelected(false);
        this.f28884p0.setSelected(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo37983E() {
        this.f29659a.mo39750a((C11573b) this);
        this.f29659a.mo39753b(f28834Q0);
        this.f29659a.mo39748a(f28835R0);
        this.f29659a.mo39756c(f28836S0);
        mo38426C();
    }

    /* renamed from: G */
    public BitmapDescriptor mo37984G() {
        return m48896a(getResources().getDrawable(C10232R.C10235drawable.pin_pick_location));
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo37985H() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnSelectLocation /*2131361985*/:
                if (this.f28871c0 == null || this.f28874f0 == null) {
                    this.f28854O.mo23615f(getString(C10232R.string.msg_error_invalid_delivery_location), getString(C10232R.string.app_name));
                    return;
                }
                try {
                    if (Double.parseDouble(this.f28854O.mo23468C().mo23459f(C11644i.f33321i)) >= 100.0d) {
                        m48884N();
                        return;
                    } else {
                        m48908a(false, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case C10232R.C10236id.fabMapStyle /*2131362217*/:
                m48890T();
                return;
            case C10232R.C10236id.fabMylocation /*2131362218*/:
                C5880q.m25751b("FAB Location clicked");
                m48885O();
                return;
            case C10232R.C10236id.flBack /*2131362263*/:
                onBackPressed();
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.tvGo /*2131363857*/:
                m48886P();
                return;
            case C10232R.C10236id.tvMapHybrid /*2131363897*/:
                this.f28869b.setMapType(4);
                m48934h(4);
                return;
            case C10232R.C10236id.tvMapNormal /*2131363898*/:
                this.f28869b.setMapType(1);
                m48934h(1);
                return;
            case C10232R.C10236id.tvMapSatellite /*2131363899*/:
                this.f28869b.setMapType(2);
                m48934h(2);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_order_location_revised);
        C11644i.f33185S = true;
        m48880J();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10232R.C10237menu.menu_map, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11644i.f33185S = false;
        C2128a.m11089a((Context) this).mo9217a(this.f28855O0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f28869b != null) {
            int itemId = menuItem.getItemId();
            if (itemId == C10232R.C10236id.action_Hybrid) {
                this.f28853N0 = 4;
                this.f28869b.setMapType(4);
            } else if (itemId == C10232R.C10236id.action_map) {
                this.f28853N0 = 1;
                this.f28869b.setMapType(1);
            } else if (itemId == C10232R.C10236id.action_satellite) {
                this.f28853N0 = 2;
                this.f28869b.setMapType(2);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(this);
        }
        C2128a.m11089a((Context) this).mo9218a(this.f28855O0, new IntentFilter(C11644i.f33254a4));
        C2128a.m11089a((Context) this).mo9218a(this.f28855O0, new IntentFilter(C11644i.f33335j4));
        this.f28854O = new C5887x(this);
        this.f28856P = new C11669t(this);
        this.f28856P.mo40036a(C11644i.f33339k, (C11673d) new C10596k());
    }

    /* renamed from: s */
    public void mo36531s() {
    }

    /* renamed from: t */
    public void mo36532t() {
    }

    /* renamed from: h */
    private void m48934h(int i) {
        m48891U();
        if (i == 1) {
            this.f28882n0.setSelected(true);
        } else if (i == 2) {
            this.f28883o0.setSelected(true);
        } else if (i == 4) {
            this.f28884p0.setSelected(true);
        }
    }

    /* renamed from: i */
    private String m48936i(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            Matcher matcher = Pattern.compile("(?:^|[\\W])((ht|f)tp(s?):\\/\\/|www\\.)(([\\w\\-]+\\.){1,}?([\\w\\-.~]+\\/?)*[\\p{Alnum}.,%_=?&#\\-+()\\[\\]\\*$~@!:/{};']*)", 42).matcher(str);
            if (matcher.find()) {
                str = str.substring(matcher.start(1), matcher.end());
                StringBuilder sb = new StringBuilder();
                sb.append("url :");
                sb.append(str);
                C5880q.m25751b(sb.toString());
                EditText editText = this.f28846H0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                editText.setText(sb2.toString());
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: j */
    private String m48938j(String str) {
        String str2 = C3868i.f12248b;
        String str3 = "\\+";
        try {
            String[] split = str.split("@")[0].split("/place/");
            String replaceAll = split[1].replaceAll(str3, str2);
            StringBuilder sb = new StringBuilder();
            sb.append("address :");
            sb.append(split[1].replaceAll(str3, str2));
            C5880q.m25751b(sb.toString());
            return replaceAll.substring(0, replaceAll.length() - 1);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: k */
    private void m48940k(String str) {
        m48928e(true);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        C11687c.m52645a(this.f28854O).getLatlngFromUrl(hashMap).enqueue(new C10590e());
    }

    /* renamed from: l */
    private LatLng m48941l(String str) {
        String str2 = ",";
        try {
            String[] split = str.split("@")[1].split(str2);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(split[0]);
            sb.append(str2);
            sb.append(split[1]);
            C5880q.m25751b(sb.toString());
            if (Double.parseDouble(split[0]) != 0.0d) {
                return new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: m */
    private LatLng m48943m(String str) {
        String str2 = ",";
        String str3 = "";
        String str4 = "!4d";
        try {
            String[] split = str.split("!3d");
            String[] split2 = split[1].split(str4);
            Double valueOf = Double.valueOf(Double.parseDouble(split2[0].replace(str4, str3)));
            Double valueOf2 = Double.valueOf(Double.parseDouble(split2[1].split(str4)[1]));
            StringBuilder sb = new StringBuilder();
            sb.append("Lat - ");
            sb.append(valueOf);
            C5880q.m25751b(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Long - ");
            sb2.append(split2[1].split(str4)[1]);
            C5880q.m25751b(sb2.toString());
            String[] split3 = split[1].split(str2);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(split3[0]);
            sb3.append(str2);
            sb3.append(split3[1]);
            C5880q.m25751b(sb3.toString());
            if (valueOf.doubleValue() != 0.0d) {
                return new LatLng(valueOf.doubleValue(), valueOf2.doubleValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: n */
    private boolean m48946n(String str) {
        return str.matches(".*[a-z].*");
    }

    /* renamed from: o */
    private boolean m48948o(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m48950p(String str) {
        String str2 = "https://goo.gl";
        String str3 = "https://www.googleapis.com";
        if ((str.startsWith(str2) || str.startsWith(str3)) && !str.startsWith(str2) && str.startsWith(str3)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m48952q(String str) {
        return TextUtils.isDigitsOnly(str);
    }

    /* renamed from: r */
    public static boolean m48954r(String str) {
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt >= 1536 && codePointAt <= 1760) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    /* renamed from: s */
    private boolean m48956s(String str) {
        try {
            Double valueOf = Double.valueOf(Double.parseDouble(str));
            if (valueOf.doubleValue() > -99.0d && valueOf.doubleValue() < 99.0d) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: t */
    private boolean m48958t(String str) {
        return str.matches("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$");
    }

    /* renamed from: u */
    private void m48960u(String str) {
        String str2 = ",";
        try {
            if (str.contains(str2)) {
                String[] split = str.split(str2);
                if (split.length == 2) {
                    this.f28887s0 = false;
                    this.f28869b.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1])), 16.0f));
                    return;
                }
                this.f28887s0 = false;
                this.f28869b.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(split[0]), 0.0d), 16.0f));
                return;
            }
            this.f28887s0 = false;
            this.f28869b.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(str), 0.0d), 16.0f));
        } catch (Exception unused) {
            this.f28854O.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
        }
    }

    /* renamed from: g */
    public LatLng mo37989g(String str) {
        String str2 = "";
        try {
            String format = String.format("http://maps.google.com/maps?cid=%s&q=a&output=json", new Object[]{str});
            StringBuilder sb = new StringBuilder();
            sb.append("Full url is :");
            sb.append(format);
            C5880q.m25751b(sb.toString());
            try {
                str2 = m48933h(format);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Data :");
                sb2.append(str2);
                C5880q.m25751b(sb2.toString());
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Background Task");
                sb3.append(e.toString());
                C5880q.m25750a(sb3.toString());
            }
            int indexOf = str2.indexOf("viewport:{center:{");
            if (indexOf == -1) {
                return null;
            }
            int i = indexOf + 18;
            String[] split = str2.substring(i, str2.indexOf("}", i)).split(",");
            if (split.length == 2 && split[0].startsWith("lat:")) {
                split[0] = split[0].substring(4);
                if (split[1].startsWith("lng:")) {
                    split[1] = split[1].substring(4);
                    return new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
                }
            }
            return null;
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m48924d(boolean z) {
        if (z) {
            try {
                this.f28888t0.mo27311g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f28888t0.mo27304c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m48928e(boolean z) {
        if (z) {
            this.f28848J0.setVisibility(0);
            this.f28845G0.setVisibility(4);
            return;
        }
        this.f28848J0.setVisibility(8);
        this.f28845G0.setVisibility(0);
    }

    /* renamed from: c */
    private void m48917c(Location location) {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f28893y0 = location;
            Location location2 = this.f28893y0;
            if (location2 != null) {
                this.f28865X = location2.getLatitude();
                this.f28866Y = this.f28893y0.getLongitude();
                if (this.f28869b != null) {
                    m48888R();
                }
            } else {
                this.f28854O.mo23489M("(Couldn't get the location. Make sure location is enabled on the device)");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* JADX WARNING: type inference failed for: r6v9 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: type inference failed for: r6v11 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v3
      assigns: []
      uses: []
      mth insns count: 41
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m48933h(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            java.net.URLConnection r6 = r2.openConnection()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r6.connect()     // Catch:{ Exception -> 0x0036 }
            java.io.InputStream r1 = r6.getInputStream()     // Catch:{ Exception -> 0x0036 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0036 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0036 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0036 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0036 }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x0036 }
            r3.<init>()     // Catch:{ Exception -> 0x0036 }
        L_0x0024:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x0036 }
            if (r4 == 0) goto L_0x002e
            r3.append(r4)     // Catch:{ Exception -> 0x0036 }
            goto L_0x0024
        L_0x002e:
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0036 }
            r2.close()     // Catch:{ Exception -> 0x0036 }
            goto L_0x0055
        L_0x0036:
            r2 = move-exception
            goto L_0x003d
        L_0x0038:
            r0 = move-exception
            r6 = r1
            goto L_0x005d
        L_0x003b:
            r2 = move-exception
            r6 = r1
        L_0x003d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
            r3.<init>()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = "downloadUrl "
            r3.append(r4)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x005c }
            r3.append(r2)     // Catch:{ all -> 0x005c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x005c }
            com.mrsool.utils.C5880q.m25753d(r2)     // Catch:{ all -> 0x005c }
        L_0x0055:
            r1.close()
            r6.disconnect()
            return r0
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            r1.close()
            r6.disconnect()
            goto L_0x0065
        L_0x0064:
            throw r0
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.createorder.PicOrderLocationActivityRevised.m48933h(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    public /* synthetic */ void mo37987b(BitmapDescriptor bitmapDescriptor) {
        m48907a(true, this.f28869b);
        C5880q.m25751b("on camera change");
        if (this.f28880l0) {
            this.f28887s0 = true;
        }
        if (this.f28880l0) {
            this.f28885q0 = true;
        } else {
            this.f28885q0 = false;
        }
        if (this.f28887s0) {
            this.f28841C0.setVisibility(0);
            TextView textView = this.f28841C0;
            String string = getString(C10232R.string.lbl_accurate_to);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f28854O.mo23468C().mo23459f(C11644i.f33321i));
            textView.setText(String.format(string, new Object[]{sb.toString()}));
        } else {
            this.f28841C0.setVisibility(8);
        }
        this.f28880l0 = false;
        this.f28870b0 = this.f28869b.getCameraPosition().target;
        this.f28869b.clear();
        LatLng fromScreenLocation = this.f28869b.getProjection().fromScreenLocation(new Point((int) this.f28842D0.getX(), (int) this.f28842D0.getY()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geoPoint : Lat->");
        sb2.append(fromScreenLocation.latitude);
        String str = " Lng->";
        sb2.append(str);
        sb2.append(fromScreenLocation.longitude);
        C5880q.m25751b(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("centerPoint : Lat->");
        sb3.append(this.f28870b0.latitude);
        sb3.append(str);
        sb3.append(this.f28870b0.longitude);
        C5880q.m25751b(sb3.toString());
        this.f28861T = this.f28869b.addMarker(new MarkerOptions().position(this.f28870b0).icon(bitmapDescriptor));
        try {
            m48906a(String.valueOf(this.f28870b0.latitude), String.valueOf(this.f28870b0.longitude));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public String mo37988e(String str) {
        char[] charArray;
        String str2;
        String str3 = "";
        String str4 = str3;
        for (char c : str.toCharArray()) {
            if (c < 1632 || c > 1641) {
                str2 = String.valueOf(c);
            } else {
                str2 = String.valueOf((char) (c - 1584));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str2);
            str4 = sb.toString();
        }
        return str4.replaceAll(C3868i.f12248b, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m48919c(boolean z) {
        if (z) {
            this.f28844F0.setVisibility(8);
            this.f28849K0.setVisibility(0);
            return;
        }
        this.f28844F0.setVisibility(0);
        this.f28849K0.setVisibility(4);
    }

    /* renamed from: a */
    private BitmapDescriptor m48896a(Drawable drawable) {
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }

    /* renamed from: a */
    public /* synthetic */ void mo37986a(BitmapDescriptor bitmapDescriptor) {
        m48907a(true, this.f28869b);
        C5880q.m25751b("on camera change");
        if (this.f28880l0) {
            this.f28887s0 = true;
        }
        if (this.f28880l0) {
            this.f28885q0 = true;
        } else {
            this.f28885q0 = false;
        }
        if (this.f28887s0) {
            this.f28841C0.setVisibility(0);
            TextView textView = this.f28841C0;
            String string = getString(C10232R.string.lbl_accurate_to);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f28854O.mo23468C().mo23459f(C11644i.f33321i));
            textView.setText(String.format(string, new Object[]{sb.toString()}));
        } else {
            this.f28841C0.setVisibility(8);
        }
        this.f28880l0 = false;
        this.f28870b0 = this.f28869b.getCameraPosition().target;
        this.f28869b.clear();
        LatLng fromScreenLocation = this.f28869b.getProjection().fromScreenLocation(new Point((int) this.f28842D0.getX(), (int) this.f28842D0.getY()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geoPoint : Lat->");
        sb2.append(fromScreenLocation.latitude);
        String str = " Lng->";
        sb2.append(str);
        sb2.append(fromScreenLocation.longitude);
        C5880q.m25751b(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("centerPoint : Lat->");
        sb3.append(this.f28870b0.latitude);
        sb3.append(str);
        sb3.append(this.f28870b0.longitude);
        C5880q.m25751b(sb3.toString());
        this.f28861T = this.f28869b.addMarker(new MarkerOptions().position(this.f28870b0).icon(bitmapDescriptor));
        try {
            m48906a(String.valueOf(this.f28870b0.latitude), String.valueOf(this.f28870b0.longitude));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public void mo36526b(Location location) {
        this.f28893y0 = location;
    }

    /* renamed from: a */
    public void mo36525a(Location location) {
        this.f28893y0 = location;
        m48917c(location);
        mo37985H();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48907a(boolean z, GoogleMap googleMap) {
        googleMap.getUiSettings().setScrollGesturesEnabled(z);
        googleMap.getUiSettings().setAllGesturesEnabled(z);
        googleMap.getUiSettings().setRotateGesturesEnabled(z);
        googleMap.getUiSettings().setScrollGesturesEnabled(z);
        googleMap.getUiSettings().setTiltGesturesEnabled(z);
        googleMap.getUiSettings().setZoomGesturesEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48908a(boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("selectedLat", String.valueOf(this.f28887s0 ? Double.valueOf(this.f28865X) : this.f28871c0));
        intent.putExtra("selectedLng", String.valueOf(this.f28887s0 ? Double.valueOf(this.f28866Y) : this.f28872d0));
        intent.putExtra("selectedAddress", String.valueOf(this.f28874f0));
        String str2 = this.f28875g0;
        if (str2 == null) {
            str2 = this.f28874f0;
        }
        intent.putExtra("selectedArea", str2);
        intent.putExtra("selectedFloorNo", this.f28850L0.getText().toString().trim());
        if (z) {
            intent.putExtra(C11644i.f33423u1, z);
            intent.putExtra(C11644i.f33415t1, str);
        }
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48906a(String str, String str2) {
        if (!this.f28854O.mo23502X()) {
            m48919c(false);
            this.f28874f0 = null;
            this.f28864W.setVisibility(4);
            this.f28871c0 = null;
            this.f28872d0 = null;
        } else if (!str.equalsIgnoreCase(C14265s.f42076o)) {
            m48919c(true);
            this.f28874f0 = null;
            this.f28864W.setVisibility(4);
            this.f28871c0 = null;
            this.f28872d0 = null;
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f28854O.mo23476G());
            hashMap.put("auth_token", this.f28854O.mo23640m());
            hashMap.put("latitude", str);
            hashMap.put("longitude", str2);
            C11687c.m52647c().callgetAddressFromLatLng(hashMap).enqueue(new C10591f(str, str2));
        }
    }
}
