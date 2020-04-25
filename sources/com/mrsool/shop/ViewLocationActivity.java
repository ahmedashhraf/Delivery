package com.mrsool.shop;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.content.C0841b;
import androidx.fragment.app.C1382h;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.InfoWindowAdapter;
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
import com.mrsool.C10787d;
import com.mrsool.p423v.C11728i;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p420b0.C11589f;
import com.mrsool.utils.webservice.C11694e;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;

public class ViewLocationActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public GoogleMap f31192S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public SupportMapFragment f31193T;

    /* renamed from: U */
    private C11669t f31194U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public Geocoder f31195V;

    /* renamed from: W */
    private C11589f f31196W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public List<Address> f31197X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public Marker f31198Y;

    /* renamed from: Z */
    private LinearLayout f31199Z;

    /* renamed from: a0 */
    private TextView f31200a0;

    /* renamed from: b0 */
    private TextView f31201b0;

    /* renamed from: c0 */
    private double f31202c0;

    /* renamed from: d0 */
    private double f31203d0;

    /* renamed from: e0 */
    private LatLng f31204e0;

    /* renamed from: f0 */
    private LatLng f31205f0;

    /* renamed from: g0 */
    private LatLng f31206g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f31207h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public String f31208i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public String f31209j0 = null;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public String f31210k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public String f31211l0;

    /* renamed from: m0 */
    private String f31212m0 = null;

    /* renamed from: n0 */
    private String f31213n0 = null;

    /* renamed from: o0 */
    private int f31214o0 = 12;

    /* renamed from: p0 */
    private boolean f31215p0;

    /* renamed from: q0 */
    private Bundle f31216q0;

    /* renamed from: r0 */
    private FloatingActionButton f31217r0;

    /* renamed from: s0 */
    private FloatingActionButton f31218s0;

    /* renamed from: com.mrsool.shop.ViewLocationActivity$a */
    class C11219a implements C11673d {
        C11219a() {
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            ViewLocationActivity.this.m50779N();
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$b */
    class C11220b implements OnMapReadyCallback {
        C11220b() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C0841b.m4916a((Context) ViewLocationActivity.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) ViewLocationActivity.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                ViewLocationActivity viewLocationActivity = ViewLocationActivity.this;
                viewLocationActivity.f31192S = viewLocationActivity.f29642a.mo23514a(googleMap, viewLocationActivity.f31193T, true, true);
                ViewLocationActivity.this.f31192S.getUiSettings().setMapToolbarEnabled(true);
                ViewLocationActivity.this.f31192S.setMyLocationEnabled(false);
                ViewLocationActivity.this.f31192S.getUiSettings().setMyLocationButtonEnabled(false);
                ViewLocationActivity.this.m50778M();
                C5887x xVar = ViewLocationActivity.this.f29642a;
                if (xVar != null && xVar.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                    ViewLocationActivity.this.f29642a.mo23626i();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$c */
    class C11221c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31221a;

        C11221c(Dialog dialog) {
            this.f31221a = dialog;
        }

        public void onClick(View view) {
            this.f31221a.dismiss();
            if (ViewLocationActivity.this.f31192S != null) {
                ViewLocationActivity.this.f31192S.setMapType(1);
            }
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$d */
    class C11222d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31223a;

        C11222d(Dialog dialog) {
            this.f31223a = dialog;
        }

        public void onClick(View view) {
            this.f31223a.dismiss();
            if (ViewLocationActivity.this.f31192S != null) {
                ViewLocationActivity.this.f31192S.setMapType(4);
            }
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$e */
    class C11223e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31225a;

        C11223e(Dialog dialog) {
            this.f31225a = dialog;
        }

        public void onClick(View view) {
            this.f31225a.dismiss();
            if (ViewLocationActivity.this.f31192S != null) {
                ViewLocationActivity.this.f31192S.setMapType(2);
            }
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$f */
    private class C11224f implements InfoWindowAdapter {

        /* renamed from: a */
        private View f31227a;

        public C11224f() {
            this.f31227a = ViewLocationActivity.this.getLayoutInflater().inflate(C10232R.layout.custom_info_window, null);
        }

        public View getInfoContents(Marker marker) {
            return null;
        }

        public View getInfoWindow(Marker marker) {
            ViewLocationActivity.this.f31198Y = marker;
            String snippet = marker.getSnippet();
            TextView textView = (TextView) this.f31227a.findViewById(C10232R.C10236id.title);
            textView.setTextColor(C0841b.m4915a(ViewLocationActivity.this.getApplicationContext(), (int) C10232R.C10234color.Black));
            if (snippet != null) {
                textView.setText(snippet);
            } else {
                textView.setText("");
            }
            return this.f31227a;
        }
    }

    /* renamed from: com.mrsool.shop.ViewLocationActivity$g */
    private class C11225g extends AsyncTask<String, Void, String> {

        /* renamed from: a */
        double f31229a;

        /* renamed from: b */
        double f31230b;

        /* renamed from: c */
        StringBuilder f31231c;

        /* renamed from: d */
        String f31232d = "";

        public C11225g(double d, double d2) {
            this.f31229a = d;
            this.f31230b = d2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(String... strArr) {
            String str = "null";
            try {
                ViewLocationActivity.this.f31195V = new Geocoder(ViewLocationActivity.this, Locale.ENGLISH);
                ViewLocationActivity.this.f31197X = ViewLocationActivity.this.f31195V.getFromLocation(this.f31229a, this.f31230b, 1);
                this.f31231c = new StringBuilder();
                if (ViewLocationActivity.this.f31197X != null && ViewLocationActivity.this.f31197X.size() > 0) {
                    Address address = (Address) ViewLocationActivity.this.f31197X.get(0);
                    int maxAddressLineIndex = address.getMaxAddressLineIndex();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Area");
                    sb.append(address.getSubLocality());
                    C5880q.m25753d(sb.toString());
                    ViewLocationActivity.this.f31211l0 = address.getSubLocality();
                    ViewLocationActivity.this.f31209j0 = address.getPostalCode();
                    for (int i = 0; i <= maxAddressLineIndex; i++) {
                        if (ViewLocationActivity.this.f29642a.mo23661t(address.getAddressLine(i)) != null && !address.getAddressLine(i).equalsIgnoreCase(str)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.f31232d);
                            sb2.append(C3868i.f12248b);
                            sb2.append(address.getAddressLine(i).toString().replaceAll(str, ""));
                            this.f31232d = sb2.toString();
                        }
                    }
                    ViewLocationActivity.this.f31207h0 = String.valueOf(address.getLatitude());
                    ViewLocationActivity.this.f31208i0 = String.valueOf(address.getLongitude());
                }
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("IOException");
                sb3.append(e.getMessage());
                C5880q.m25751b(sb3.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Void... voidArr) {
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(String str) {
            try {
                if (ViewLocationActivity.this.f31197X != null && ViewLocationActivity.this.f31197X.size() > 0) {
                    ViewLocationActivity.this.f31198Y.setSnippet(this.f31232d.trim());
                    ViewLocationActivity.this.f31198Y.showInfoWindow();
                    ViewLocationActivity.this.f31210k0 = this.f31232d.trim();
                    C5880q.m25753d(this.f31232d.trim());
                }
            } catch (Exception e) {
                ViewLocationActivity.this.f29642a.mo23492O();
                e.printStackTrace();
            }
        }
    }

    public ViewLocationActivity() {
        String str = C14265s.f42076o;
        this.f31207h0 = str;
        this.f31208i0 = str;
    }

    /* renamed from: K */
    private int m50776K() {
        return C10232R.C10235drawable.map_pin_new;
    }

    /* renamed from: L */
    private void m50777L() {
        Bundle bundle = this.f31216q0;
        if (bundle != null) {
            this.f31212m0 = bundle.containsKey(C11644i.f33341k1) ? getIntent().getStringExtra(C11644i.f33341k1) : String.valueOf(this.f31202c0);
            this.f31213n0 = this.f31216q0.containsKey(C11644i.f33350l1) ? getIntent().getStringExtra(C11644i.f33350l1) : String.valueOf(this.f31203d0);
            this.f31215p0 = getIntent().getBooleanExtra(C11644i.f33147N1, false);
            if (this.f31216q0.containsKey(C11644i.f33391q1)) {
                if (TextUtils.isEmpty(this.f31216q0.getString(C11644i.f33391q1))) {
                    this.f31200a0.setVisibility(8);
                } else {
                    this.f31200a0.setText(this.f31216q0.getString(C11644i.f33391q1));
                }
            }
            if (this.f31216q0.containsKey(C11644i.f33163P1)) {
                this.f31201b0.setText(TextUtils.isEmpty(this.f31216q0.getString(C11644i.f33163P1)) ? "" : this.f31216q0.getString(C11644i.f33163P1));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m50778M() {
        m50782Q();
        this.f31200a0 = (TextView) findViewById(C10232R.C10236id.tvLocationTitle);
        this.f31201b0 = (TextView) findViewById(C10232R.C10236id.tvAddess);
        this.f31217r0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMylocation);
        this.f31217r0.setOnClickListener(this);
        this.f31218s0 = (FloatingActionButton) findViewById(C10232R.C10236id.fabMapStyle);
        this.f31218s0.setOnClickListener(this);
        this.f31199Z = (LinearLayout) findViewById(C10232R.C10236id.llDirection);
        this.f31199Z.setOnClickListener(this);
        MapsInitializer.initialize(getApplicationContext());
        m50783R();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m50779N() {
        try {
            C1382h supportFragmentManager = getSupportFragmentManager();
            this.f31193T = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
            if (this.f31193T == null) {
                this.f31193T = SupportMapFragment.newInstance();
                supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f31193T).mo6100f();
            }
            if (this.f31192S == null && this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
                this.f31193T.getMapAsync(new C11220b());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: O */
    private void m50780O() {
        if (this.f31192S != null) {
            this.f29642a.mo23531a(Double.valueOf(this.f29642a.mo23468C().mo23459f(C11644i.f33303g)).doubleValue(), Double.valueOf(this.f29642a.mo23468C().mo23459f(C11644i.f33312h)).doubleValue(), Double.valueOf(this.f31212m0).doubleValue(), Double.valueOf(this.f31213n0).doubleValue());
        }
    }

    /* renamed from: P */
    private void m50781P() {
        GoogleMap googleMap = this.f31192S;
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(this.f31205f0, googleMap.getCameraPosition().zoom));
    }

    /* renamed from: Q */
    private void m50782Q() {
        ((TextView) findViewById(C10232R.C10236id.txtTitle)).setText(getString(C10232R.string.lbl_customer_location));
        this.f29639P = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29639P.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f29639P.setScaleX(-1.0f);
        }
    }

    /* renamed from: R */
    private void m50783R() {
        try {
            this.f31196W = new C11589f(this);
            this.f31196W.mo39763a();
            if (this.f31196W != null) {
                this.f31202c0 = this.f31196W.mo39764b();
                this.f31203d0 = this.f31196W.mo39768d();
            }
            this.f31192S.setInfoWindowAdapter(new C11224f());
            this.f31192S.getUiSettings().setMapToolbarEnabled(true);
            m50777L();
            this.f31204e0 = new LatLng(Double.valueOf(this.f31212m0).doubleValue(), Double.valueOf(this.f31213n0).doubleValue());
            this.f31205f0 = this.f31204e0;
            mo39053J();
            if (!(this.f31205f0 == null || this.f31192S == null)) {
                this.f31192S.moveCamera(CameraUpdateFactory.newCameraPosition(new Builder().target(this.f31205f0).zoom((float) this.f31214o0).build()));
            }
            GoogleMap googleMap = this.f31192S;
            MarkerOptions position = new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(m50776K())).position(new LatLng(Double.parseDouble(this.f31212m0), Double.parseDouble(this.f31213n0)));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(this.f31212m0);
            sb.append(",");
            sb.append(this.f31213n0);
            this.f31198Y = googleMap.addMarker(position.snippet(sb.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: S */
    private void m50784S() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_map_style);
        dialog.setCancelable(true);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvSatellite);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.tvHybrid);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvMap)).setOnClickListener(new C11221c(dialog));
        textView2.setOnClickListener(new C11222d(dialog));
        textView.setOnClickListener(new C11223e(dialog));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: J */
    public BitmapDescriptor mo39053J() {
        return m50787a(getResources().getDrawable(C10232R.C10235drawable.circle_shape));
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.fabMapStyle /*2131362217*/:
                m50784S();
                return;
            case C10232R.C10236id.fabMylocation /*2131362218*/:
                m50781P();
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.layRightClick /*2131362913*/:
                m50780O();
                return;
            case C10232R.C10236id.llDirection /*2131363024*/:
                m50780O();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_view_in_map_chat);
        this.f31194U = new C11669t(this);
        this.f31216q0 = getIntent().getExtras();
        this.f31194U.mo40036a(C11644i.f33339k, (C11673d) new C11219a());
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        C11669t tVar = this.f31194U;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(this);
        }
    }

    /* renamed from: a */
    private BitmapDescriptor m50787a(Drawable drawable) {
        Canvas canvas = new Canvas();
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }
}
