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
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4086i.C4087a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.C5142m;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.Builder;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mrsool.C10232R;
import com.mrsool.bean.GoogleShareUrlBean;
import com.mrsool.bean.ReverseGeocodeBean;
import com.mrsool.bean.SavedBookmarkedBean;
import com.mrsool.chat.C10526n;
import com.mrsool.p423v.C11728i;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
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

public class PicOrderLocationActivityRevisedOrder extends C0295d implements OnClickListener, C4088b, C4089c, C5140l {

    /* renamed from: V0 */
    private static int f28921V0 = C14236a.DEFAULT_TIMEOUT;

    /* renamed from: W0 */
    private static int f28922W0 = C10526n.f28536a;

    /* renamed from: X0 */
    private static int f28923X0 = 10;

    /* renamed from: Y0 */
    private static final int f28924Y0 = 1000;

    /* renamed from: Z0 */
    static final /* synthetic */ boolean f28925Z0 = false;

    /* renamed from: A0 */
    private boolean f28926A0;

    /* renamed from: B0 */
    private C4086i f28927B0;

    /* renamed from: C0 */
    private boolean f28928C0;

    /* renamed from: D0 */
    private LocationRequest f28929D0;

    /* renamed from: E0 */
    private Location f28930E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public TextView f28931F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public TextView f28932G0;

    /* renamed from: H0 */
    private TextView f28933H0;

    /* renamed from: I0 */
    private ImageView f28934I0;

    /* renamed from: J0 */
    private TextView f28935J0;

    /* renamed from: K0 */
    private EditText f28936K0;

    /* renamed from: L0 */
    private ProgressBar f28937L0;

    /* renamed from: M0 */
    private ProgressBar f28938M0;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C5887x f28939N;

    /* renamed from: N0 */
    private EditText f28940N0;

    /* renamed from: O */
    private C11669t f28941O;

    /* renamed from: O0 */
    private int f28942O0;

    /* renamed from: P */
    private Geocoder f28943P;

    /* renamed from: P0 */
    private final int f28944P0;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C11589f f28945Q;

    /* renamed from: Q0 */
    private final int f28946Q0;

    /* renamed from: R */
    private List<Address> f28947R;

    /* renamed from: R0 */
    private final int f28948R0;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public Marker f28949S;

    /* renamed from: S0 */
    private int f28950S0;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public LinearLayout f28951T;

    /* renamed from: T0 */
    private BroadcastReceiver f28952T0;

    /* renamed from: U */
    private TextView f28953U;

    /* renamed from: U0 */
    private BroadcastReceiver f28954U0;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f28955V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public double f28956W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public double f28957X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public LatLng f28958Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public LatLng f28959Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public GoogleMap f28960a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public LatLng f28961a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public SupportMapFragment f28962b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public String f28963b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public String f28964c0;

    /* renamed from: d0 */
    private String f28965d0 = null;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public String f28966e0;

    /* renamed from: f0 */
    private String f28967f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public String f28968g0 = null;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f28969h0 = null;

    /* renamed from: i0 */
    private String f28970i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public BitmapDescriptor f28971j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public boolean f28972k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public TextView f28973l0;

    /* renamed from: m0 */
    private MaterialButton f28974m0;

    /* renamed from: n0 */
    private MaterialButton f28975n0;

    /* renamed from: o0 */
    private MaterialButton f28976o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public boolean f28977p0;

    /* renamed from: q0 */
    private Bundle f28978q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public boolean f28979r0;

    /* renamed from: s0 */
    private FloatingActionButton f28980s0;

    /* renamed from: t0 */
    private ExtendedFloatingActionButton f28981t0;

    /* renamed from: u0 */
    private View f28982u0;

    /* renamed from: v0 */
    private ImageView f28983v0;

    /* renamed from: w0 */
    private OnCameraChangeListener f28984w0;

    /* renamed from: x0 */
    private String f28985x0;

    /* renamed from: y0 */
    private Animation f28986y0;

    /* renamed from: z0 */
    private Animation f28987z0;

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$a */
    class C10604a implements OnEditorActionListener {
        C10604a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 3) {
                PicOrderLocationActivityRevisedOrder.this.m48985Q();
            }
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$b */
    class C10605b implements OnCameraChangeListener {
        C10605b() {
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder.m49008a(true, picOrderLocationActivityRevisedOrder.f28960a);
            C5880q.m25751b("on camera change");
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28979r0 = true;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = true;
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = false;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28979r0) {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(0);
                TextView f = PicOrderLocationActivityRevisedOrder.this.f28931F0;
                String string = PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.lbl_accurate_to);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(PicOrderLocationActivityRevisedOrder.this.f28939N.mo23468C().mo23459f(C11644i.f33321i));
                f.setText(String.format(string, new Object[]{sb.toString()}));
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(8);
            }
            PicOrderLocationActivityRevisedOrder.this.f28972k0 = false;
            PicOrderLocationActivityRevisedOrder.this.f28961a0 = cameraPosition.target;
            PicOrderLocationActivityRevisedOrder.this.f28960a.clear();
            LatLng fromScreenLocation = PicOrderLocationActivityRevisedOrder.this.f28960a.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getX(), (int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getY()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("geoPoint : Lat->");
            sb2.append(fromScreenLocation.latitude);
            String str = " Lng->";
            sb2.append(str);
            sb2.append(fromScreenLocation.longitude);
            C5880q.m25751b(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("centerPoint : Lat->");
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude);
            sb3.append(str);
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude);
            C5880q.m25751b(sb3.toString());
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder2.f28949S = picOrderLocationActivityRevisedOrder2.f28960a.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevisedOrder.this.f28961a0).icon(PicOrderLocationActivityRevisedOrder.this.f28971j0));
            try {
                PicOrderLocationActivityRevisedOrder.this.m49007a(String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude), String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$c */
    class C10606c implements OnCameraChangeListener {

        /* renamed from: a */
        final /* synthetic */ BitmapDescriptor f28990a;

        C10606c(BitmapDescriptor bitmapDescriptor) {
            this.f28990a = bitmapDescriptor;
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder.m49008a(true, picOrderLocationActivityRevisedOrder.f28960a);
            C5880q.m25751b("on camera change");
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28979r0 = true;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = true;
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = false;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28979r0) {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(0);
                TextView f = PicOrderLocationActivityRevisedOrder.this.f28931F0;
                String string = PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.lbl_accurate_to);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(PicOrderLocationActivityRevisedOrder.this.f28939N.mo23468C().mo23459f(C11644i.f33321i));
                f.setText(String.format(string, new Object[]{sb.toString()}));
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(8);
            }
            PicOrderLocationActivityRevisedOrder.this.f28972k0 = false;
            PicOrderLocationActivityRevisedOrder.this.f28961a0 = cameraPosition.target;
            PicOrderLocationActivityRevisedOrder.this.f28960a.clear();
            LatLng fromScreenLocation = PicOrderLocationActivityRevisedOrder.this.f28960a.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getX(), (int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getY()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("geoPoint : Lat->");
            sb2.append(fromScreenLocation.latitude);
            String str = " Lng->";
            sb2.append(str);
            sb2.append(fromScreenLocation.longitude);
            C5880q.m25751b(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("centerPoint : Lat->");
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude);
            sb3.append(str);
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude);
            C5880q.m25751b(sb3.toString());
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder2.f28949S = picOrderLocationActivityRevisedOrder2.f28960a.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevisedOrder.this.f28961a0).icon(this.f28990a));
            try {
                PicOrderLocationActivityRevisedOrder.this.m49007a(String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude), String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$d */
    class C10607d implements OnMyLocationButtonClickListener {
        C10607d() {
        }

        public boolean onMyLocationButtonClick() {
            PicOrderLocationActivityRevisedOrder.this.f28972k0 = true;
            PicOrderLocationActivityRevisedOrder.this.f28979r0 = true;
            PicOrderLocationActivityRevisedOrder.this.m49024d(false);
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$e */
    class C10608e implements OnCameraMoveStartedListener {
        C10608e() {
        }

        public void onCameraMoveStarted(int i) {
            if (i == 1) {
                PicOrderLocationActivityRevisedOrder.this.f28979r0 = false;
                PicOrderLocationActivityRevisedOrder.this.m49024d(true);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$f */
    class C10609f implements OnCameraChangeListener {

        /* renamed from: a */
        final /* synthetic */ BitmapDescriptor f28994a;

        C10609f(BitmapDescriptor bitmapDescriptor) {
            this.f28994a = bitmapDescriptor;
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder.m49008a(true, picOrderLocationActivityRevisedOrder.f28960a);
            C5880q.m25751b("on camera change");
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28979r0 = true;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = true;
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28977p0 = false;
            }
            if (PicOrderLocationActivityRevisedOrder.this.f28979r0) {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(0);
                TextView f = PicOrderLocationActivityRevisedOrder.this.f28931F0;
                String string = PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.lbl_accurate_to);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(PicOrderLocationActivityRevisedOrder.this.f28939N.mo23468C().mo23459f(C11644i.f33321i));
                f.setText(String.format(string, new Object[]{sb.toString()}));
            } else {
                PicOrderLocationActivityRevisedOrder.this.f28931F0.setVisibility(8);
            }
            PicOrderLocationActivityRevisedOrder.this.f28972k0 = false;
            PicOrderLocationActivityRevisedOrder.this.f28961a0 = cameraPosition.target;
            PicOrderLocationActivityRevisedOrder.this.f28960a.clear();
            LatLng fromScreenLocation = PicOrderLocationActivityRevisedOrder.this.f28960a.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getX(), (int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getY()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("geoPoint : Lat->");
            sb2.append(fromScreenLocation.latitude);
            String str = " Lng->";
            sb2.append(str);
            sb2.append(fromScreenLocation.longitude);
            C5880q.m25751b(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("centerPoint : Lat->");
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude);
            sb3.append(str);
            sb3.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude);
            C5880q.m25751b(sb3.toString());
            PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
            picOrderLocationActivityRevisedOrder2.f28949S = picOrderLocationActivityRevisedOrder2.f28960a.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevisedOrder.this.f28961a0).icon(this.f28994a));
            try {
                PicOrderLocationActivityRevisedOrder.this.m49007a(String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude), String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$g */
    class C10610g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28996a;

        C10610g(Dialog dialog) {
            this.f28996a = dialog;
        }

        public void onClick(View view) {
            this.f28996a.dismiss();
            PicOrderLocationActivityRevisedOrder.this.m49009a(false, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$h */
    class C10611h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28998a;

        C10611h(Dialog dialog) {
            this.f28998a = dialog;
        }

        public void onClick(View view) {
            this.f28998a.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$i */
    class C10612i extends BroadcastReceiver {

        /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$i$a */
        class C10613a implements OnCameraChangeListener {

            /* renamed from: a */
            final /* synthetic */ BitmapDescriptor f29001a;

            C10613a(BitmapDescriptor bitmapDescriptor) {
                this.f29001a = bitmapDescriptor;
            }

            public void onCameraChange(CameraPosition cameraPosition) {
                PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
                picOrderLocationActivityRevisedOrder.m49008a(true, picOrderLocationActivityRevisedOrder.f28960a);
                C5880q.m25751b("on camera change");
                if (PicOrderLocationActivityRevisedOrder.this.f28972k0) {
                    PicOrderLocationActivityRevisedOrder.this.f28977p0 = true;
                } else {
                    PicOrderLocationActivityRevisedOrder.this.f28977p0 = false;
                }
                PicOrderLocationActivityRevisedOrder.this.f28972k0 = false;
                PicOrderLocationActivityRevisedOrder.this.f28961a0 = cameraPosition.target;
                PicOrderLocationActivityRevisedOrder.this.f28960a.clear();
                PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
                picOrderLocationActivityRevisedOrder2.f28949S = picOrderLocationActivityRevisedOrder2.f28960a.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevisedOrder.this.f28961a0).icon(this.f29001a));
                LatLng fromScreenLocation = PicOrderLocationActivityRevisedOrder.this.f28960a.getProjection().fromScreenLocation(new Point((int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getX(), (int) PicOrderLocationActivityRevisedOrder.this.f28932G0.getY()));
                StringBuilder sb = new StringBuilder();
                sb.append("geoPoint : Lat->");
                sb.append(fromScreenLocation.latitude);
                String str = " Lng->";
                sb.append(str);
                sb.append(fromScreenLocation.longitude);
                C5880q.m25751b(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("centerPoint : Lat->");
                sb2.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude);
                sb2.append(str);
                sb2.append(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude);
                C5880q.m25751b(sb2.toString());
                PicOrderLocationActivityRevisedOrder.this.f28955V.setText("Loading...");
                try {
                    PicOrderLocationActivityRevisedOrder.this.m49007a(String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.latitude), String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28961a0.longitude));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        C10612i() {
        }

        public void onReceive(Context context, Intent intent) {
            String str = "p_lat";
            if (intent.getAction().endsWith("aaa")) {
                try {
                    PicOrderLocationActivityRevisedOrder.this.f28945Q = new C11589f(PicOrderLocationActivityRevisedOrder.this);
                    PicOrderLocationActivityRevisedOrder.this.f28945Q.mo39763a();
                    PicOrderLocationActivityRevisedOrder.this.f28951T.setVisibility(0);
                    if (PicOrderLocationActivityRevisedOrder.this.f28945Q != null) {
                        PicOrderLocationActivityRevisedOrder.this.f28956W = PicOrderLocationActivityRevisedOrder.this.f28945Q.mo39764b();
                        PicOrderLocationActivityRevisedOrder.this.f28957X = PicOrderLocationActivityRevisedOrder.this.f28945Q.mo39768d();
                    }
                    PicOrderLocationActivityRevisedOrder.this.f28960a.setInfoWindowAdapter(new C10626u());
                    PicOrderLocationActivityRevisedOrder.this.m48988T();
                    if (PicOrderLocationActivityRevisedOrder.this.getIntent().hasExtra(str)) {
                        PicOrderLocationActivityRevisedOrder.this.f28968g0 = PicOrderLocationActivityRevisedOrder.this.getIntent().getStringExtra(str);
                        PicOrderLocationActivityRevisedOrder.this.f28969h0 = PicOrderLocationActivityRevisedOrder.this.getIntent().getStringExtra("p_lng");
                    } else if (PicOrderLocationActivityRevisedOrder.this.f28956W == 0.0d) {
                        PicOrderLocationActivityRevisedOrder.this.f28968g0 = String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28939N.mo23468C().mo23459f(C11644i.f33303g));
                        PicOrderLocationActivityRevisedOrder.this.f28969h0 = String.valueOf(PicOrderLocationActivityRevisedOrder.this.f28939N.mo23468C().mo23459f(C11644i.f33312h));
                    } else {
                        PicOrderLocationActivityRevisedOrder.this.f28968g0 = String.valueOf(intent.getStringExtra("latitude"));
                        PicOrderLocationActivityRevisedOrder.this.f28969h0 = String.valueOf(intent.getStringExtra("longitude"));
                    }
                    PicOrderLocationActivityRevisedOrder.this.f28958Y = new LatLng(Double.valueOf(PicOrderLocationActivityRevisedOrder.this.f28968g0).doubleValue(), Double.valueOf(PicOrderLocationActivityRevisedOrder.this.f28969h0).doubleValue());
                    PicOrderLocationActivityRevisedOrder.this.f28959Z = PicOrderLocationActivityRevisedOrder.this.f28958Y;
                    BitmapDescriptor E = PicOrderLocationActivityRevisedOrder.this.mo38006E();
                    if (!(PicOrderLocationActivityRevisedOrder.this.f28959Z == null || PicOrderLocationActivityRevisedOrder.this.f28960a == null)) {
                        PicOrderLocationActivityRevisedOrder.this.f28960a.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(PicOrderLocationActivityRevisedOrder.this.f28959Z).zoom(16.0f).build()));
                        C5880q.m25751b("moveCamera Called");
                    }
                    PicOrderLocationActivityRevisedOrder.this.f28960a.setOnCameraChangeListener(new C10613a(E));
                } catch (Exception e) {
                    e.printStackTrace();
                    PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
                    picOrderLocationActivityRevisedOrder.m49008a(true, picOrderLocationActivityRevisedOrder.f28960a);
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$j */
    class C10614j implements Callback<GoogleShareUrlBean> {
        C10614j() {
        }

        public void onFailure(Call<GoogleShareUrlBean> call, Throwable th) {
            PicOrderLocationActivityRevisedOrder.this.m49027e(false);
            try {
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23492O();
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23653q0();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<GoogleShareUrlBean> call, Response<GoogleShareUrlBean> response) {
            PicOrderLocationActivityRevisedOrder.this.f28939N.mo23492O();
            PicOrderLocationActivityRevisedOrder.this.m49027e(false);
            try {
                if (response.isSuccessful()) {
                    GoogleShareUrlBean googleShareUrlBean = (GoogleShareUrlBean) response.body();
                    if (googleShareUrlBean.getCode().intValue() <= 300) {
                        PicOrderLocationActivityRevisedOrder.this.f28960a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(googleShareUrlBean.getLatitude().doubleValue(), googleShareUrlBean.getLongitude().doubleValue()), 16.0f));
                        PicOrderLocationActivityRevisedOrder.this.f28979r0 = false;
                        return;
                    }
                    PicOrderLocationActivityRevisedOrder.this.f28939N.mo23615f(googleShareUrlBean.getMessage(), PicOrderLocationActivityRevisedOrder.this.getResources().getString(C10232R.string.app_name));
                    return;
                }
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23615f(response.message(), PicOrderLocationActivityRevisedOrder.this.getResources().getString(C10232R.string.app_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$k */
    class C10615k extends BroadcastReceiver {
        C10615k() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("")) {
                if (PicOrderLocationActivityRevisedOrder.this.f28949S != null) {
                    PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
                    picOrderLocationActivityRevisedOrder.f28971j0 = picOrderLocationActivityRevisedOrder.mo38006E();
                    PicOrderLocationActivityRevisedOrder.this.f28949S.remove();
                    PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
                    picOrderLocationActivityRevisedOrder2.f28949S = picOrderLocationActivityRevisedOrder2.f28960a.addMarker(new MarkerOptions().position(PicOrderLocationActivityRevisedOrder.this.f28961a0).icon(PicOrderLocationActivityRevisedOrder.this.f28971j0));
                }
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33335j4) && PicOrderLocationActivityRevisedOrder.this.f28979r0 && PicOrderLocationActivityRevisedOrder.this.f28960a != null) {
                PicOrderLocationActivityRevisedOrder.this.f28960a.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(new LatLng(intent.getDoubleExtra("latitude", 0.0d), intent.getDoubleExtra("longitude", 0.0d))).zoom(16.0f).build()));
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$l */
    class C10616l implements Callback<ReverseGeocodeBean> {

        /* renamed from: a */
        final /* synthetic */ String f29005a;

        /* renamed from: b */
        final /* synthetic */ String f29006b;

        C10616l(String str, String str2) {
            this.f29005a = str;
            this.f29006b = str2;
        }

        public void onFailure(Call<ReverseGeocodeBean> call, Throwable th) {
            if (PicOrderLocationActivityRevisedOrder.this.f28939N != null) {
                PicOrderLocationActivityRevisedOrder.this.m49020c(false);
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23491N(PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<ReverseGeocodeBean> call, Response<ReverseGeocodeBean> response) {
            if (PicOrderLocationActivityRevisedOrder.this.f28939N != null) {
                PicOrderLocationActivityRevisedOrder.this.m49020c(false);
                if (!response.isSuccessful()) {
                    PicOrderLocationActivityRevisedOrder.this.f28939N.mo23615f(response.message(), PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.app_name));
                } else if (((ReverseGeocodeBean) response.body()).getCode().intValue() <= 300) {
                    PicOrderLocationActivityRevisedOrder.this.f28955V.setVisibility(0);
                    PicOrderLocationActivityRevisedOrder.this.f28955V.setText(((ReverseGeocodeBean) response.body()).getAddress().trim());
                    PicOrderLocationActivityRevisedOrder.this.f28966e0 = ((ReverseGeocodeBean) response.body()).getAddress().trim();
                    PicOrderLocationActivityRevisedOrder.this.f28963b0 = this.f29005a;
                    PicOrderLocationActivityRevisedOrder.this.f28964c0 = this.f29006b;
                } else {
                    PicOrderLocationActivityRevisedOrder.this.f28939N.mo23491N(((ReverseGeocodeBean) response.body()).getMessage());
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$m */
    class C10617m implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ int f29008N;

        /* renamed from: a */
        final /* synthetic */ EditText f29010a;

        /* renamed from: b */
        final /* synthetic */ Dialog f29011b;

        C10617m(EditText editText, Dialog dialog, int i) {
            this.f29010a = editText;
            this.f29011b = dialog;
            this.f29008N = i;
        }

        public void onClick(View view) {
            if (PicOrderLocationActivityRevisedOrder.this.m49048n(this.f29010a.getText().toString().trim())) {
                this.f29011b.dismiss();
                PicOrderLocationActivityRevisedOrder.this.m49002a(this.f29008N, this.f29010a.getText().toString().trim());
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23494P();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$n */
    class C10618n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29012a;

        C10618n(Dialog dialog) {
            this.f29012a = dialog;
        }

        public void onClick(View view) {
            this.f29012a.dismiss();
            PicOrderLocationActivityRevisedOrder.this.m49009a(false, AppEventsConstants.EVENT_PARAM_VALUE_NO);
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$o */
    class C10619o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29014a;

        C10619o(Dialog dialog) {
            this.f29014a = dialog;
        }

        public void onClick(View view) {
            this.f29014a.dismiss();
            if (PicOrderLocationActivityRevisedOrder.this.f28960a != null) {
                PicOrderLocationActivityRevisedOrder.this.f28960a.setMapType(1);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$p */
    class C10620p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29016a;

        C10620p(Dialog dialog) {
            this.f29016a = dialog;
        }

        public void onClick(View view) {
            this.f29016a.dismiss();
            if (PicOrderLocationActivityRevisedOrder.this.f28960a != null) {
                PicOrderLocationActivityRevisedOrder.this.f28960a.setMapType(4);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$q */
    class C10621q implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29018a;

        C10621q(Dialog dialog) {
            this.f29018a = dialog;
        }

        public void onClick(View view) {
            this.f29018a.dismiss();
            if (PicOrderLocationActivityRevisedOrder.this.f28960a != null) {
                PicOrderLocationActivityRevisedOrder.this.f28960a.setMapType(2);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$r */
    class C10622r implements Callback<SavedBookmarkedBean> {
        C10622r() {
        }

        public void onFailure(Call<SavedBookmarkedBean> call, Throwable th) {
            if (PicOrderLocationActivityRevisedOrder.this.f28939N != null) {
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23653q0();
            }
        }

        public void onResponse(Call<SavedBookmarkedBean> call, Response<SavedBookmarkedBean> response) {
            if (PicOrderLocationActivityRevisedOrder.this.f28939N != null) {
                PicOrderLocationActivityRevisedOrder.this.f28939N.mo23492O();
                if (response.isSuccessful()) {
                    if (((SavedBookmarkedBean) response.body()).getCode().intValue() <= 300) {
                        PicOrderLocationActivityRevisedOrder.this.f28939N.mo23491N(((SavedBookmarkedBean) response.body()).getMessage());
                        PicOrderLocationActivityRevisedOrder.this.m49009a(true, ((SavedBookmarkedBean) response.body()).getBookmark().getId());
                    } else {
                        PicOrderLocationActivityRevisedOrder.this.f28939N.mo23615f(((SavedBookmarkedBean) response.body()).getMessage(), PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.app_name));
                    }
                } else if (PicOrderLocationActivityRevisedOrder.this.f28939N != null) {
                    PicOrderLocationActivityRevisedOrder.this.f28939N.mo23615f(response.message(), PicOrderLocationActivityRevisedOrder.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$s */
    class C10623s implements C11673d {

        /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$s$a */
        class C10624a implements OnMapReadyCallback {
            C10624a() {
            }

            public void onMapReady(GoogleMap googleMap) {
                PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder = PicOrderLocationActivityRevisedOrder.this;
                picOrderLocationActivityRevisedOrder.f28960a = picOrderLocationActivityRevisedOrder.f28939N.mo23514a(googleMap, PicOrderLocationActivityRevisedOrder.this.f28962b, true, true);
                PicOrderLocationActivityRevisedOrder.this.f28960a.setMyLocationEnabled(true);
                PicOrderLocationActivityRevisedOrder picOrderLocationActivityRevisedOrder2 = PicOrderLocationActivityRevisedOrder.this;
                picOrderLocationActivityRevisedOrder2.m49008a(false, picOrderLocationActivityRevisedOrder2.f28960a);
                C5880q.m25751b("onMapReady Called");
                LayoutParams layoutParams = (LayoutParams) ((View) PicOrderLocationActivityRevisedOrder.this.f28962b.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, 30, 30);
                PicOrderLocationActivityRevisedOrder.this.m48980L();
            }
        }

        C10623s() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            try {
                C1382h supportFragmentManager = PicOrderLocationActivityRevisedOrder.this.getSupportFragmentManager();
                PicOrderLocationActivityRevisedOrder.this.f28962b = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
                if (PicOrderLocationActivityRevisedOrder.this.f28962b == null) {
                    PicOrderLocationActivityRevisedOrder.this.f28962b = SupportMapFragment.newInstance();
                    supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, PicOrderLocationActivityRevisedOrder.this.f28962b).mo6100f();
                }
                if (PicOrderLocationActivityRevisedOrder.this.f28960a == null && PicOrderLocationActivityRevisedOrder.this.f28939N.mo23502X() && PicOrderLocationActivityRevisedOrder.this.f28939N.mo23500V()) {
                    PicOrderLocationActivityRevisedOrder.this.f28962b.getMapAsync(new C10624a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$t */
    class C10625t implements Runnable {
        C10625t() {
        }

        public void run() {
            MapsInitializer.initialize(PicOrderLocationActivityRevisedOrder.this.getApplicationContext());
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$u */
    private class C10626u implements InfoWindowAdapter {

        /* renamed from: a */
        private View f29024a;

        public C10626u() {
            this.f29024a = PicOrderLocationActivityRevisedOrder.this.getLayoutInflater().inflate(C10232R.layout.custom_info_window, null);
        }

        public View getInfoContents(Marker marker) {
            return null;
        }

        public View getInfoWindow(Marker marker) {
            PicOrderLocationActivityRevisedOrder.this.f28949S = marker;
            String snippet = marker.getSnippet();
            TextView textView = (TextView) this.f29024a.findViewById(C10232R.C10236id.title);
            TextView textView2 = (TextView) this.f29024a.findViewById(C10232R.C10236id.txtAccuracy);
            LinearLayout linearLayout = (LinearLayout) this.f29024a.findViewById(C10232R.C10236id.llAccuracy);
            PicOrderLocationActivityRevisedOrder.this.f28973l0 = textView;
            textView.setTextColor(C0841b.m4915a(PicOrderLocationActivityRevisedOrder.this.getApplicationContext(), (int) C10232R.C10234color.Black));
            String str = "";
            if (snippet == null) {
                snippet = str;
            }
            textView.setText(snippet);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(PicOrderLocationActivityRevisedOrder.this.m48978J());
            textView2.setText(sb.toString());
            boolean t = PicOrderLocationActivityRevisedOrder.this.f28979r0;
            linearLayout.setVisibility(8);
            return this.f29024a;
        }
    }

    /* renamed from: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$v */
    private class C10627v extends Handler {
        private C10627v() {
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
        Class<PicOrderLocationActivityRevisedOrder> cls = PicOrderLocationActivityRevisedOrder.class;
    }

    public PicOrderLocationActivityRevisedOrder() {
        String str = C14265s.f42076o;
        this.f28963b0 = str;
        this.f28964c0 = str;
        String str2 = "";
        this.f28970i0 = str2;
        this.f28972k0 = true;
        this.f28977p0 = true;
        this.f28979r0 = true;
        this.f28985x0 = str2;
        this.f28926A0 = false;
        this.f28928C0 = true;
        this.f28944P0 = 1;
        this.f28946Q0 = 2;
        this.f28948R0 = 3;
        this.f28950S0 = -1;
        this.f28952T0 = new C10615k();
        this.f28954U0 = new C10612i();
    }

    /* renamed from: H */
    private boolean m48976H() {
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(this);
        if (isGooglePlayServicesAvailable == 0) {
            return true;
        }
        if (GooglePlayServicesUtil.isUserRecoverableError(isGooglePlayServicesAvailable)) {
            GooglePlayServicesUtil.getErrorDialog(isGooglePlayServicesAvailable, this, 1000).show();
        } else {
            this.f28939N.mo23491N("This device is not supported.");
            finish();
        }
        return false;
    }

    /* renamed from: I */
    private void m48977I() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            this.f28930E0 = C5142m.f14785d.mo18775a(this.f28927B0);
            Location location = this.f28930E0;
            if (location != null) {
                this.f28956W = location.getLatitude();
                this.f28957X = this.f28930E0.getLongitude();
                if (this.f28960a != null) {
                    m48987S();
                }
            } else {
                this.f28939N.mo23489M("(Couldn't get the location. Make sure location is enabled on the device)");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public String m48978J() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(getResources().getString(C10232R.string.lbl_accuracy));
        sb.append(": ");
        sb.append(this.f28939N.mo23468C().mo23459f(C11644i.f33321i));
        sb.append(C3868i.f12248b);
        sb.append(getResources().getString(C10232R.string.lbl_meters));
        return sb.toString();
    }

    /* renamed from: K */
    private void m48979K() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String str = "location";
            if (extras.containsKey(str)) {
                this.f28942O0 = extras.getInt(str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01ba, code lost:
        if (r0 != 3) goto L_0x01c4;
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m48980L() {
        /*
            r7 = this;
            android.content.Intent r0 = r7.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            r7.f28978q0 = r0
            r0 = 2131363857(0x7f0a0811, float:1.8347535E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28935J0 = r0
            r0 = 2131363214(0x7f0a058e, float:1.834623E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f28951T = r0
            r0 = 2131362218(0x7f0a01aa, float:1.834421E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r0
            r7.f28981t0 = r0
            r0 = 2131362217(0x7f0a01a9, float:1.8344208E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            r7.f28980s0 = r0
            r0 = 2131362467(0x7f0a02a3, float:1.8344715E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f28982u0 = r0
            r0 = 2131363898(0x7f0a083a, float:1.8347618E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r7.f28974m0 = r0
            r0 = 2131363899(0x7f0a083b, float:1.834762E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r7.f28975n0 = r0
            r0 = 2131363897(0x7f0a0839, float:1.8347616E38)
            android.view.View r0 = r7.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r7.f28976o0 = r0
            r0 = 2131362744(0x7f0a03b8, float:1.8345277E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f28983v0 = r0
            android.widget.TextView r0 = r7.f28935J0
            r0.setOnClickListener(r7)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r7.f28980s0
            r0.setOnClickListener(r7)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r7.f28981t0
            r0.setOnClickListener(r7)
            com.google.android.material.button.MaterialButton r0 = r7.f28974m0
            r0.setOnClickListener(r7)
            com.google.android.material.button.MaterialButton r0 = r7.f28975n0
            r0.setOnClickListener(r7)
            com.google.android.material.button.MaterialButton r0 = r7.f28976o0
            r0.setOnClickListener(r7)
            android.view.View r0 = r7.f28982u0
            r0.setOnClickListener(r7)
            r0 = 2131364178(0x7f0a0952, float:1.8348186E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28953U = r0
            r0 = 2131363761(0x7f0a07b1, float:1.834734E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28955V = r0
            r0 = 2131364090(0x7f0a08fa, float:1.8348007E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28932G0 = r0
            r0 = 2131363759(0x7f0a07af, float:1.8347336E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28931F0 = r0
            r0 = 2131363386(0x7f0a063a, float:1.834658E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r7.f28938M0 = r0
            r0 = 2131362199(0x7f0a0197, float:1.8344172E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r7.f28936K0 = r0
            r0 = 2131362181(0x7f0a0185, float:1.8344135E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r7.f28940N0 = r0
            r0 = 2131361985(0x7f0a00c1, float:1.8343738E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f28933H0 = r0
            android.widget.TextView r0 = r7.f28933H0
            r0.setOnClickListener(r7)
            r7.m48986R()
            r0 = 2131363393(0x7f0a0641, float:1.8346594E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r7.f28937L0 = r0
            r0 = 2131362849(0x7f0a0421, float:1.834549E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.f28934I0 = r0
            android.widget.TextView r0 = r7.f28931F0
            r1 = 2131886638(0x7f12022e, float:1.940786E38)
            java.lang.String r1 = r7.getString(r1)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            com.mrsool.utils.x r5 = r7.f28939N
            com.mrsool.utils.v r5 = r5.mo23468C()
            java.lang.String r6 = "user_location_accuracy"
            java.lang.String r5 = r5.mo23459f(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 0
            r3[r5] = r4
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r0.setText(r1)
            android.os.Bundle r0 = r7.f28978q0
            r1 = 2131886776(0x7f1202b8, float:1.940814E38)
            if (r0 == 0) goto L_0x015e
            java.lang.String r3 = com.mrsool.utils.C11644i.f33391q1
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0154
            android.widget.TextView r0 = r7.f28953U
            android.os.Bundle r1 = r7.f28978q0
            java.lang.String r3 = com.mrsool.utils.C11644i.f33391q1
            java.lang.String r1 = r1.getString(r3)
            r0.setText(r1)
            goto L_0x0167
        L_0x0154:
            android.widget.TextView r0 = r7.f28953U
            java.lang.String r1 = r7.getString(r1)
            r0.setText(r1)
            goto L_0x0167
        L_0x015e:
            android.widget.TextView r0 = r7.f28953U
            java.lang.String r1 = r7.getString(r1)
            r0.setText(r1)
        L_0x0167:
            com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$t r0 = new com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$t
            r0.<init>()
            r7.runOnUiThread(r0)
            r7.m49024d(r5)
            com.google.android.gms.common.api.i r0 = r7.f28927B0
            boolean r0 = r0.mo17718g()
            if (r0 == 0) goto L_0x0181
            boolean r0 = r7.f28928C0
            if (r0 == 0) goto L_0x0181
            r7.mo38007G()
        L_0x0181:
            com.google.android.gms.maps.GoogleMap r0 = r7.f28960a
            if (r0 == 0) goto L_0x018c
            com.google.android.gms.maps.UiSettings r0 = r0.getUiSettings()
            r0.setMyLocationButtonEnabled(r5)
        L_0x018c:
            android.widget.EditText r0 = r7.f28936K0
            com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$a r1 = new com.mrsool.createorder.PicOrderLocationActivityRevisedOrder$a
            r1.<init>()
            r0.setOnEditorActionListener(r1)
            com.mrsool.utils.x r0 = r7.f28939N
            boolean r0 = r0.mo23496R()
            if (r0 == 0) goto L_0x01a9
            android.widget.TextView r0 = r7.f28955V
            r1 = 4
            r0.setTextDirection(r1)
            android.widget.EditText r0 = r7.f28940N0
            r0.setTextDirection(r1)
        L_0x01a9:
            r7.m49035h(r2)
            int r0 = r7.f28942O0
            r1 = 2131231712(0x7f0803e0, float:1.8079513E38)
            r3 = 2131886720(0x7f120280, float:1.9408027E38)
            if (r0 == r2) goto L_0x01c1
            r2 = 2
            if (r0 == r2) goto L_0x01bd
            r2 = 3
            if (r0 == r2) goto L_0x01c1
            goto L_0x01c4
        L_0x01bd:
            r1 = 2131231832(0x7f080458, float:1.8079756E38)
            goto L_0x01c4
        L_0x01c1:
            r3 = 2131886719(0x7f12027f, float:1.9408025E38)
        L_0x01c4:
            android.widget.TextView r0 = r7.f28933H0
            r0.setText(r3)
            android.widget.ImageView r0 = r7.f28983v0
            r0.setImageResource(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder.m48980L():void");
    }

    /* renamed from: M */
    private boolean m48981M() {
        Bundle bundle = this.f28978q0;
        if (bundle == null || !bundle.containsKey(C11644i.f33155O1)) {
            return false;
        }
        return this.f28978q0.getBoolean(C11644i.f33155O1);
    }

    /* renamed from: N */
    private boolean m48982N() {
        if (!TextUtils.isEmpty(this.f28936K0.getText().toString().trim())) {
            return true;
        }
        this.f28939N.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
        return false;
    }

    /* renamed from: O */
    private void m48983O() {
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
        textView2.setOnClickListener(new C10610g(dialog));
        textView3.setOnClickListener(new C10611h(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: P */
    private void m48984P() {
        this.f28972k0 = true;
        this.f28979r0 = true;
        m49024d(false);
        try {
            if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                this.f28930E0 = C5142m.f14785d.mo18775a(this.f28927B0);
                if (this.f28930E0 != null) {
                    this.f28956W = this.f28930E0.getLatitude();
                    this.f28957X = this.f28930E0.getLongitude();
                } else {
                    this.f28939N.mo23489M("(Couldn't get the location. Make sure location is enabled on the device)");
                }
                m48988T();
                if (this.f28956W == 0.0d) {
                    this.f28968g0 = String.valueOf(this.f28939N.mo23468C().mo23459f(C11644i.f33303g));
                    this.f28969h0 = String.valueOf(this.f28939N.mo23468C().mo23459f(C11644i.f33312h));
                } else {
                    this.f28968g0 = String.valueOf(this.f28956W);
                    this.f28969h0 = String.valueOf(this.f28957X);
                }
                this.f28958Y = new LatLng(Double.valueOf(this.f28968g0).doubleValue(), Double.valueOf(this.f28969h0).doubleValue());
                this.f28959Z = this.f28958Y;
                BitmapDescriptor E = mo38006E();
                if (!(this.f28959Z == null || this.f28960a == null)) {
                    this.f28960a.animateCamera(CameraUpdateFactory.newLatLngZoom(this.f28959Z, 16.0f));
                    C5880q.m25751b("moveCamera Called");
                }
                this.f28960a.setOnCameraChangeListener(new C10609f(E));
            }
        } catch (Exception e) {
            e.printStackTrace();
            m49008a(true, this.f28960a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m48985Q() {
        String str = "";
        String str2 = ",";
        try {
            String trim = this.f28936K0.getText().toString().trim();
            if (m49058s(trim)) {
                trim = mo38008e(trim);
            }
            if (m49050o(trim.toLowerCase())) {
                m49042k(trim);
            } else if (m49062u(trim)) {
                m49064v(trim);
            } else {
                if (!m49056r(trim)) {
                    if (!m49052p(trim)) {
                        if (!trim.contains(str2)) {
                            this.f28939N.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                        } else if (trim.indexOf(str2) == trim.lastIndexOf(str2)) {
                            m49064v(trim.replaceAll(C3868i.f12248b, str));
                        } else {
                            this.f28939N.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                        }
                    }
                }
                if (m49060t(trim)) {
                    m49064v(trim);
                } else {
                    this.f28939N.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f28936K0.setText(str);
        this.f28939N.mo23494P();
    }

    /* renamed from: R */
    private void m48986R() {
        this.f28984w0 = new C10605b();
    }

    /* renamed from: S */
    private void m48987S() {
        String str = "p_lat";
        try {
            m48988T();
            if (getIntent().hasExtra(str)) {
                this.f28968g0 = getIntent().getStringExtra(str);
                this.f28969h0 = getIntent().getStringExtra("p_lng");
                m49024d(true);
            } else if (this.f28956W == 0.0d) {
                this.f28968g0 = String.valueOf(this.f28939N.mo23468C().mo23459f(C11644i.f33303g));
                this.f28969h0 = String.valueOf(this.f28939N.mo23468C().mo23459f(C11644i.f33312h));
            } else {
                this.f28968g0 = String.valueOf(this.f28956W);
                this.f28969h0 = String.valueOf(this.f28957X);
            }
            this.f28958Y = new LatLng(Double.valueOf(this.f28968g0).doubleValue(), Double.valueOf(this.f28969h0).doubleValue());
            this.f28959Z = this.f28958Y;
            BitmapDescriptor E = mo38006E();
            if (!(this.f28959Z == null || this.f28960a == null)) {
                this.f28960a.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(this.f28959Z).zoom(16.0f).build()));
            }
            this.f28960a.setOnCameraChangeListener(new C10606c(E));
        } catch (Exception e) {
            e.printStackTrace();
            m49008a(true, this.f28960a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m48988T() {
        this.f28960a.setOnMyLocationButtonClickListener(new C10607d());
        this.f28960a.setOnCameraMoveStartedListener(new C10608e());
    }

    /* renamed from: U */
    private void m48989U() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_map_style);
        dialog.setCancelable(true);
        C5887x xVar = this.f28939N;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvSatellite);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvHybrid);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMap)).setOnClickListener(new C10619o(dialog));
        textView2.setOnClickListener(new C10620p(dialog));
        textView.setOnClickListener(new C10621q(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: V */
    private void m48990V() {
        if (!this.f28928C0) {
            this.f28928C0 = true;
            mo38007G();
            return;
        }
        this.f28928C0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public synchronized void mo38004C() {
        this.f28927B0 = new C4087a(this).mo17732a((C4088b) this).mo17733a((C4089c) this).mo17728a(C5142m.f14784c).mo17736a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo38005D() {
        this.f28929D0 = new LocationRequest();
        this.f28929D0.mo20037n((long) f28921V0);
        this.f28929D0.mo20036m((long) f28922W0);
        this.f28929D0.mo20033h(C11644i.f33208U6);
        this.f28929D0.mo20029a((float) f28923X0);
    }

    /* renamed from: E */
    public BitmapDescriptor mo38006E() {
        return m48995a(getResources().getDrawable(C10232R.C10235drawable.pin_pick_location));
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo38007G() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            C5142m.f14785d.mo18780a(this.f28927B0, this.f28929D0, (C5140l) this);
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C10232R.anim.slide_down_activity_new, C10232R.anim.slide_no_change);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnSelectLocation /*2131361985*/:
                if (this.f28963b0 == null || this.f28966e0 == null) {
                    this.f28939N.mo23615f(getString(C10232R.string.msg_error_invalid_delivery_location), getString(C10232R.string.app_name));
                    return;
                }
                try {
                    if (Double.parseDouble(this.f28939N.mo23468C().mo23459f(C11644i.f33321i)) >= 100.0d) {
                        m48983O();
                        return;
                    } else {
                        m49009a(false, AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case C10232R.C10236id.fabMapStyle /*2131362217*/:
                m48989U();
                return;
            case C10232R.C10236id.fabMylocation /*2131362218*/:
                C5880q.m25751b("FAB Location clicked");
                m48984P();
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.tvGo /*2131363857*/:
                m48985Q();
                return;
            case C10232R.C10236id.tvMapHybrid /*2131363897*/:
                this.f28960a.setMapType(4);
                m49035h(4);
                return;
            case C10232R.C10236id.tvMapNormal /*2131363898*/:
                this.f28960a.setMapType(1);
                m49035h(1);
                return;
            case C10232R.C10236id.tvMapSatellite /*2131363899*/:
                this.f28960a.setMapType(2);
                m49035h(2);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_order_location_revised_order);
        C11644i.f33185S = true;
        m48979K();
        if (m48976H()) {
            mo38004C();
            mo38005D();
        }
        this.f28939N = new C5887x(this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10232R.C10237menu.menu_map, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11644i.f33185S = false;
        C2128a.m11089a((Context) this).mo9217a(this.f28952T0);
    }

    public void onLocationChanged(Location location) {
        this.f28930E0 = location;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f28960a != null) {
            int itemId = menuItem.getItemId();
            if (itemId == C10232R.C10236id.action_Hybrid) {
                this.f28950S0 = 4;
                this.f28960a.setMapType(4);
            } else if (itemId == C10232R.C10236id.action_map) {
                this.f28950S0 = 1;
                this.f28960a.setMapType(1);
            } else if (itemId == C10232R.C10236id.action_satellite) {
                this.f28950S0 = 2;
                this.f28960a.setMapType(2);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(this);
        }
        C2128a.m11089a((Context) this).mo9218a(this.f28952T0, new IntentFilter(C11644i.f33254a4));
        C2128a.m11089a((Context) this).mo9218a(this.f28952T0, new IntentFilter(C11644i.f33335j4));
        this.f28941O = new C11669t(this);
        this.f28941O.mo40036a(C11644i.f33339k, (C11673d) new C10623s());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4086i iVar = this.f28927B0;
        if (iVar != null) {
            iVar.mo17711c();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4086i iVar = this.f28927B0;
        if (iVar != null && iVar.mo17718g()) {
            this.f28927B0.mo17715d();
        }
    }

    /* renamed from: h */
    private void m49035h(int i) {
        if (i == 1) {
            this.f28974m0.setChecked(true);
        } else if (i == 2) {
            this.f28975n0.setChecked(true);
        } else if (i == 4) {
            this.f28976o0.setChecked(true);
        }
    }

    /* renamed from: i */
    private void m49038i(int i) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_bookmark_location);
        dialog.setCancelable(true);
        C5887x xVar = this.f28939N;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvSave)).setOnClickListener(new C10617m((EditText) dialog.findViewById(C10232R.C10236id.edtTagName), dialog, i));
        textView.setOnClickListener(new C10618n(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: j */
    private String m49040j(String str) {
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
    private void m49042k(String str) {
        m49027e(true);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        C11687c.m52645a(this.f28939N).getLatlngFromUrl(hashMap).enqueue(new C10614j());
    }

    /* renamed from: l */
    private LatLng m49044l(String str) {
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
    private LatLng m49045m(String str) {
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

    /* access modifiers changed from: private */
    /* renamed from: n */
    public boolean m49048n(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f28939N.mo23615f(getResources().getString(C10232R.string.lbl_enter_name), getResources().getString(C10232R.string.app_name));
            return false;
        } else if (!this.f28939N.mo23497S()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: o */
    private boolean m49050o(String str) {
        return str.matches(".*[a-z].*");
    }

    /* renamed from: p */
    private boolean m49052p(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m49054q(String str) {
        String str2 = "https://goo.gl";
        String str3 = "https://www.googleapis.com";
        if ((str.startsWith(str2) || str.startsWith(str3)) && !str.startsWith(str2) && str.startsWith(str3)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m49056r(String str) {
        return TextUtils.isDigitsOnly(str);
    }

    /* renamed from: s */
    public static boolean m49058s(String str) {
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

    /* renamed from: t */
    private boolean m49060t(String str) {
        try {
            Double valueOf = Double.valueOf(Double.parseDouble(str));
            if (valueOf.doubleValue() > -99.0d && valueOf.doubleValue() < 99.0d) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: u */
    private boolean m49062u(String str) {
        return str.matches("^[-+]?([1-8]?\\d(\\.\\d+)?|90(\\.0+)?),\\s*[-+]?(180(\\.0+)?|((1[0-7]\\d)|([1-9]?\\d))(\\.\\d+)?)$");
    }

    /* renamed from: v */
    private void m49064v(String str) {
        String str2 = ",";
        try {
            if (str.contains(str2)) {
                String[] split = str.split(str2);
                if (split.length == 2) {
                    this.f28979r0 = false;
                    this.f28960a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1])), 16.0f));
                    return;
                }
                this.f28979r0 = false;
                this.f28960a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(split[0]), 0.0d), 16.0f));
                return;
            }
            this.f28979r0 = false;
            this.f28960a.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(Double.parseDouble(str), 0.0d), 16.0f));
        } catch (Exception unused) {
            this.f28939N.mo23615f(getResources().getString(C10232R.string.msg_valid_google_url), getResources().getString(C10232R.string.app_name));
        }
    }

    /* renamed from: g */
    public LatLng mo38010g(String str) {
        String str2 = "";
        try {
            String format = String.format("http://maps.google.com/maps?cid=%s&q=a&output=json", new Object[]{str});
            StringBuilder sb = new StringBuilder();
            sb.append("Full url is :");
            sb.append(format);
            C5880q.m25751b(sb.toString());
            try {
                str2 = m49034h(format);
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
    public void m49024d(boolean z) {
        if (z) {
            try {
                this.f28981t0.mo27237f();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.f28981t0.mo27232d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m49027e(boolean z) {
        if (z) {
            this.f28937L0.setVisibility(0);
            this.f28935J0.setVisibility(4);
            return;
        }
        this.f28937L0.setVisibility(8);
        this.f28935J0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49020c(boolean z) {
        if (z) {
            this.f28934I0.setVisibility(8);
            this.f28938M0.setVisibility(0);
            return;
        }
        this.f28934I0.setVisibility(0);
        this.f28938M0.setVisibility(4);
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m49034h(java.lang.String r6) throws java.io.IOException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.createorder.PicOrderLocationActivityRevisedOrder.m49034h(java.lang.String):java.lang.String");
    }

    /* renamed from: n */
    public void mo17778n(int i) {
        this.f28927B0.mo17711c();
    }

    /* renamed from: e */
    public String mo38008e(String str) {
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

    /* renamed from: i */
    public void mo17777i(Bundle bundle) {
        m48977I();
        if (this.f28928C0) {
            mo38007G();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49002a(int i, String str) {
        C5887x xVar = this.f28939N;
        if (xVar != null && xVar.mo23502X()) {
            this.f28939N.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f28939N.mo23640m());
            hashMap.put(C11687c.f33752Z1, str);
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(i);
            hashMap.put(C11687c.f33757a2, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f28966e0);
            hashMap.put(C11687c.f33762b2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(String.valueOf(this.f28979r0 ? Double.valueOf(this.f28956W) : this.f28963b0));
            hashMap.put(C11687c.f33767c2, sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(String.valueOf(this.f28979r0 ? Double.valueOf(this.f28957X) : this.f28964c0));
            hashMap.put(C11687c.f33772d2, sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            sb5.append(this.f28940N0.getText().toString().trim());
            hashMap.put(C11687c.f33777e2, sb5.toString());
            C11687c.m52645a(this.f28939N).callSaveLocationBookmark(this.f28939N.mo23476G(), hashMap).enqueue(new C10622r());
        }
    }

    /* renamed from: i */
    private String m49037i(String str) {
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
                EditText editText = this.f28936K0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                editText.setText(sb2.toString());
            }
        } catch (Exception unused) {
        }
        return str;
    }

    /* renamed from: a */
    public void mo17767a(ConnectionResult connectionResult) {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection failed: ConnectionResult.getErrorCode() = ");
        sb.append(connectionResult.mo17576N());
        C5880q.m25752c(sb.toString());
    }

    /* renamed from: a */
    private BitmapDescriptor m48995a(Drawable drawable) {
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49008a(boolean z, GoogleMap googleMap) {
        googleMap.getUiSettings().setScrollGesturesEnabled(z);
        googleMap.getUiSettings().setAllGesturesEnabled(z);
        googleMap.getUiSettings().setRotateGesturesEnabled(z);
        googleMap.getUiSettings().setScrollGesturesEnabled(z);
        googleMap.getUiSettings().setTiltGesturesEnabled(z);
        googleMap.getUiSettings().setZoomGesturesEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49009a(boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("selectedLat", String.valueOf(this.f28979r0 ? Double.valueOf(this.f28956W) : this.f28963b0));
        intent.putExtra("selectedLng", String.valueOf(this.f28979r0 ? Double.valueOf(this.f28957X) : this.f28964c0));
        intent.putExtra("selectedAddress", String.valueOf(this.f28966e0));
        String str2 = this.f28967f0;
        if (str2 == null) {
            str2 = this.f28966e0;
        }
        intent.putExtra("selectedArea", str2);
        intent.putExtra("selectedFloorNo", this.f28940N0.getText().toString().trim());
        if (z) {
            intent.putExtra(C11644i.f33423u1, z);
            intent.putExtra(C11644i.f33415t1, str);
        }
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49007a(String str, String str2) {
        if (!this.f28939N.mo23502X()) {
            m49020c(false);
            this.f28966e0 = null;
            this.f28955V.setVisibility(4);
            this.f28963b0 = null;
            this.f28964c0 = null;
        } else if (!str.equalsIgnoreCase(C14265s.f42076o)) {
            m49020c(true);
            this.f28966e0 = null;
            this.f28955V.setVisibility(4);
            this.f28963b0 = null;
            this.f28964c0 = null;
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f28939N.mo23476G());
            hashMap.put("auth_token", this.f28939N.mo23640m());
            hashMap.put("latitude", str);
            hashMap.put("longitude", str2);
            C11687c.m52647c().callgetAddressFromLatLng(hashMap).enqueue(new C10616l(str, str2));
        }
    }
}
