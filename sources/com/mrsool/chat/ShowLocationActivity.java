package com.mrsool.chat;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1382h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds.Builder;
import com.google.android.gms.maps.model.MarkerOptions;
import com.jackandphantom.circularimageview.CircleImage;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.newBean.WayPoint;
import com.mrsool.newBean.WayPoint.WayPointType;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11643h;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p076c.p082c.p083a.p108y.p110j.C2557j;

public class ShowLocationActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public GoogleMap f28288S;

    /* renamed from: T */
    private TextView f28289T;

    /* renamed from: U */
    private TextView f28290U;

    /* renamed from: V */
    private TextView f28291V;

    /* renamed from: W */
    private TextView f28292W;

    /* renamed from: X */
    private TextView f28293X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public SupportMapFragment f28294Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ImageView f28295Z;

    /* renamed from: a0 */
    private ImageView f28296a0;

    /* renamed from: b0 */
    private ImageView f28297b0;

    /* renamed from: c0 */
    private LinearLayout f28298c0;

    /* renamed from: d0 */
    private LinearLayout f28299d0;

    /* renamed from: e0 */
    private LinearLayout f28300e0;

    /* renamed from: f0 */
    private LinearLayout f28301f0;

    /* renamed from: g0 */
    private FrameLayout f28302g0;

    /* renamed from: h0 */
    private RelativeLayout f28303h0;

    /* renamed from: i0 */
    private double f28304i0 = 0.0d;

    /* renamed from: j0 */
    private double f28305j0 = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public double f28306k0 = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public double f28307l0 = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f28308m0;

    /* renamed from: n0 */
    private Bundle f28309n0;

    /* renamed from: o0 */
    private boolean f28310o0;

    /* renamed from: p0 */
    private ChatInitModel f28311p0;

    /* renamed from: q0 */
    private C10537q f28312q0;

    /* renamed from: r0 */
    private RecyclerView f28313r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public ArrayList<WayPoint> f28314s0;

    /* renamed from: t0 */
    private int f28315t0 = 1;

    /* renamed from: u0 */
    private int f28316u0 = 1;

    /* renamed from: com.mrsool.chat.ShowLocationActivity$a */
    class C10474a extends C2550c {
        C10474a(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(ShowLocationActivity.this.getResources(), C5887x.m25815e(bitmap));
            a.mo4601b(true);
            ShowLocationActivity.this.f28295Z.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ShowLocationActivity$b */
    class C10475b extends C11725f {
        C10475b() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            super.mo37847a(i);
            ShowLocationActivity showLocationActivity = ShowLocationActivity.this;
            showLocationActivity.m48492a((WayPoint) showLocationActivity.f28314s0.get(i));
        }
    }

    /* renamed from: com.mrsool.chat.ShowLocationActivity$c */
    class C10476c extends C2557j<Bitmap> {

        /* renamed from: O */
        final /* synthetic */ ArrayList f28319O;

        C10476c(ArrayList arrayList) {
            this.f28319O = arrayList;
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            MarkerOptions markerOptions = new MarkerOptions();
            ShowLocationActivity showLocationActivity = ShowLocationActivity.this;
            this.f28319O.add(ShowLocationActivity.this.f28288S.addMarker(markerOptions.icon(BitmapDescriptorFactory.fromBitmap(showLocationActivity.mo37844a((Context) showLocationActivity, showLocationActivity.m48486a(bitmap, showLocationActivity.getString(C10232R.string.lbl_you), C10232R.C10234color.yellow_2)))).position(ShowLocationActivity.this.f29642a.mo23648p()).anchor(0.5f, 1.0f)));
        }
    }

    /* renamed from: com.mrsool.chat.ShowLocationActivity$d */
    class C10477d extends C2557j<Bitmap> {

        /* renamed from: O */
        final /* synthetic */ ArrayList f28321O;

        C10477d(ArrayList arrayList) {
            this.f28321O = arrayList;
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            MarkerOptions markerOptions = new MarkerOptions();
            ShowLocationActivity showLocationActivity = ShowLocationActivity.this;
            this.f28321O.add(ShowLocationActivity.this.f28288S.addMarker(markerOptions.icon(BitmapDescriptorFactory.fromBitmap(showLocationActivity.mo37844a((Context) showLocationActivity, showLocationActivity.m48486a(bitmap, showLocationActivity.getString(C10232R.string.lbl_pickup), C10232R.C10234color.color_green)))).position(new LatLng(ShowLocationActivity.this.f28306k0, ShowLocationActivity.this.f28307l0)).anchor(0.5f, 1.0f)));
        }
    }

    /* renamed from: com.mrsool.chat.ShowLocationActivity$e */
    class C10478e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f28323a;

        C10478e(Builder builder) {
            this.f28323a = builder;
        }

        public void run() {
            try {
                ShowLocationActivity.this.f28288S.setPadding(0, ShowLocationActivity.this.getResources().getDrawable(ShowLocationActivity.this.f29642a.mo23506a(ShowLocationActivity.this.f28308m0)).getIntrinsicHeight(), 0, 0);
                ShowLocationActivity.this.f28288S.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f28323a.build(), 100));
            } catch (Exception e) {
                ShowLocationActivity.this.f28288S.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ShowLocationActivity$f */
    class C10479f implements OnMapReadyCallback {
        C10479f() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C0841b.m4916a((Context) ShowLocationActivity.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) ShowLocationActivity.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                ShowLocationActivity showLocationActivity = ShowLocationActivity.this;
                showLocationActivity.f28288S = showLocationActivity.f29642a.mo23514a(googleMap, showLocationActivity.f28294Y, true, true);
                ShowLocationActivity.this.f28288S.setMyLocationEnabled(false);
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(ShowLocationActivity.this.f29642a.mo23648p());
                CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                ShowLocationActivity.this.f28288S.moveCamera(newLatLng);
                ShowLocationActivity.this.f28288S.animateCamera(zoomTo);
                ShowLocationActivity.this.m48479J();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m48479J() {
        ArrayList arrayList = new ArrayList();
        Builder builder = new Builder();
        if (this.f29642a.mo23648p() != null) {
            builder.include(this.f29642a.mo23648p());
            C2232l.m11636a((C1376c) this).mo9515a(this.f28311p0.getOrder().getvCourierPic()).mo9441j().m11411d().mo9423a(new C11643h(this)).mo9458b(new C10476c(arrayList));
        }
        if (this.f28306k0 > 0.0d && (this.f28308m0 || !this.f28310o0)) {
            builder.include(new LatLng(this.f28306k0, this.f28307l0));
            C2232l.m11636a((C1376c) this).mo9515a(this.f28311p0.getOrder().getvShopPic()).mo9441j().m11411d().mo9423a(new C11643h(this)).mo9458b(new C10477d(arrayList));
        }
        double d = this.f28304i0;
        if (d > 0.0d) {
            builder.include(new LatLng(d, this.f28305j0));
            arrayList.add(this.f28288S.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo37844a((Context) this, m48485a((int) C10232R.C10235drawable.icon_home_delivery, getString(C10232R.string.lbl_delivery))))).position(new LatLng(this.f28304i0, this.f28305j0)).anchor(0.5f, 1.0f)));
        }
        new Handler().postDelayed(new C10478e(builder), 200);
    }

    /* renamed from: K */
    private void m48480K() {
        MapsInitializer.initialize(getApplicationContext());
        this.f28309n0 = getIntent().getExtras();
        mo38413g(getResources().getString(C10232R.string.title_delivery_trip));
        m48481L();
        this.f28295Z = (ImageView) findViewById(C10232R.C10236id.imgBuyerPic);
        this.f28296a0 = (ImageView) findViewById(C10232R.C10236id.ivStoreLocation);
        this.f28297b0 = (ImageView) findViewById(C10232R.C10236id.ivCustomerLocation);
        this.f28289T = (TextView) findViewById(C10232R.C10236id.txtStoreName);
        this.f28290U = (TextView) findViewById(C10232R.C10236id.txtStoreAddress);
        this.f28291V = (TextView) findViewById(C10232R.C10236id.txtCustomerName);
        this.f28292W = (TextView) findViewById(C10232R.C10236id.txtCustomerAdd);
        this.f28293X = (TextView) findViewById(C10232R.C10236id.txtBuyerName);
        this.f28298c0 = (LinearLayout) findViewById(C10232R.C10236id.llDriveStoreLocation);
        this.f28299d0 = (LinearLayout) findViewById(C10232R.C10236id.llDriveCustomerLocation);
        this.f28298c0.setOnClickListener(this);
        this.f28299d0.setOnClickListener(this);
        this.f28300e0 = (LinearLayout) findViewById(C10232R.C10236id.llLocationContainer);
        this.f28302g0 = (FrameLayout) findViewById(C10232R.C10236id.flMap);
        this.f28303h0 = (RelativeLayout) findViewById(C10232R.C10236id.rlStorePickUpLocation);
        this.f28301f0 = (LinearLayout) findViewById(C10232R.C10236id.llDivider);
        this.f28313r0 = (RecyclerView) findViewById(C10232R.C10236id.rvWayPoints);
        Bundle bundle = this.f28309n0;
        if (bundle != null && bundle.containsKey(C11644i.f33179R1)) {
            this.f28311p0 = (ChatInitModel) this.f28309n0.get(C11644i.f33179R1);
        }
        if (this.f28311p0 == null) {
            finish();
        } else {
            m48484O();
        }
    }

    /* renamed from: L */
    private void m48481L() {
        C1382h supportFragmentManager = getSupportFragmentManager();
        this.f28294Y = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f28294Y == null) {
            this.f28294Y = SupportMapFragment.newInstance();
            supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f28294Y).mo6100f();
        }
    }

    /* renamed from: M */
    private void m48482M() {
        this.f28314s0 = new ArrayList<>();
        if (this.f28308m0 || this.f28311p0.getOrder().getServicePickupAvailable()) {
            WayPoint wayPoint = new WayPoint();
            wayPoint.setType(WayPointType.PICK_UP);
            wayPoint.setLatitude(this.f28306k0);
            wayPoint.setLongitude(this.f28307l0);
            wayPoint.setDistance(this.f29642a.mo23471D(this.f28311p0.getOrder().getDistance_courier_shop()));
            if (this.f28308m0) {
                wayPoint.setAddress(this.f29642a.mo23471D(this.f28311p0.getOrder().getvShopAddress()));
            } else {
                wayPoint.setAddress(this.f29642a.mo23471D(this.f28311p0.getOrder().getFullPickupAddress()));
            }
            this.f28314s0.add(wayPoint);
        }
        WayPoint wayPoint2 = new WayPoint();
        wayPoint2.setType(WayPointType.DROP_OFF);
        wayPoint2.setAddress(this.f29642a.mo23471D(this.f28311p0.getOrder().getFullDeliveryDropOffAddress()));
        wayPoint2.setLatitude(this.f28304i0);
        wayPoint2.setLongitude(this.f28305j0);
        wayPoint2.setDistance(this.f29642a.mo23471D(this.f28311p0.getOrder().getDistance_shop_buyer()));
        this.f28314s0.add(wayPoint2);
        this.f28313r0.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.f28312q0 = new C10537q(this.f28314s0, this, new C10475b());
        this.f28313r0.setAdapter(this.f28312q0);
    }

    /* renamed from: N */
    private void m48483N() {
        if (!this.f28308m0 && !this.f28311p0.getOrder().getServicePickupAvailable()) {
            this.f28310o0 = true;
            this.f28303h0.setVisibility(8);
            this.f28301f0.setVisibility(8);
            LayoutParams layoutParams = new LayoutParams(-1, 0);
            layoutParams.weight = 80.0f;
            this.f28302g0.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(-1, 0);
            layoutParams2.weight = 20.0f;
            this.f28300e0.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: O */
    private void m48484O() {
        this.f28308m0 = this.f28311p0.getOrder().getvShopType().equalsIgnoreCase(C11644i.f33244Z2);
        if (this.f28308m0) {
            this.f28306k0 = Double.parseDouble(this.f28311p0.getOrder().getvShopLat());
            this.f28307l0 = Double.parseDouble(this.f28311p0.getOrder().getvShopLong());
            this.f28290U.setText(this.f29642a.mo23471D(this.f28311p0.getOrder().getvShopAddress()));
        } else {
            if (!TextUtils.isEmpty(this.f28311p0.getOrder().getvSubPickupAddress())) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f28311p0.getOrder().getvSubPickupAddress());
                sb.append("\n");
                sb.toString();
            }
            this.f28306k0 = this.f28311p0.getOrder().getPlatitude();
            this.f28307l0 = this.f28311p0.getOrder().getPlongitude();
            this.f28290U.setText(this.f29642a.mo23471D(this.f28311p0.getOrder().getFullPickupAddress()));
            this.f28296a0.setImageResource(C10232R.C10235drawable.ic_pickdropoff);
            this.f28297b0.setImageResource(C10232R.C10235drawable.ic_pickdropoff);
            this.f28289T.setText(getResources().getString(C10232R.string.lbl_pickup_location));
            this.f28291V.setText(getResources().getString(C10232R.string.lbl_dropoff_location));
        }
        this.f28304i0 = this.f28311p0.getOrder().getLatitude();
        this.f28305j0 = this.f28311p0.getOrder().getLongitude();
        if (!TextUtils.isEmpty(this.f28311p0.getOrder().getvBuyerPic())) {
            C2232l.m11649c(getApplicationContext()).mo9515a(this.f28311p0.getOrder().getvBuyerPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10474a(this.f28295Z));
        }
        this.f28292W.setText(this.f29642a.mo23471D(this.f28311p0.getOrder().getFullDeliveryDropOffAddress()));
        this.f28293X.setText(this.f29642a.mo23471D(this.f28311p0.getOrder().getvBuyerName()));
        m48483N();
        m48482M();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.llDriveCustomerLocation /*2131363032*/:
                m48490a(this.f28304i0, this.f28305j0);
                return;
            case C10232R.C10236id.llDriveStoreLocation /*2131363033*/:
                m48490a(this.f28306k0, this.f28307l0);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_show_location);
        m48480K();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        try {
            if (this.f29642a == null) {
                this.f29642a = new C5887x(this);
            }
            if (this.f29642a.mo23502X() && this.f29642a.mo23500V() && this.f28288S == null) {
                this.f28294Y.getMapAsync(new C10479f());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f28294Y.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
                layoutParams.addRule(10, 0);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, 30, 30);
            }
            if (this.f29642a != null) {
                this.f29642a.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48492a(WayPoint wayPoint) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://www.google.com/maps?daddr=");
        sb.append(wayPoint.getLatitude());
        sb.append(",");
        sb.append(wayPoint.getLongitude());
        sb.append("&mode=d");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            this.f29642a.mo23489M("Please install a maps application");
        }
    }

    /* renamed from: a */
    private void m48490a(double d, double d2) {
        C5887x xVar = this.f29642a;
        xVar.mo23531a(xVar.mo23648p().latitude, this.f29642a.mo23648p().longitude, d, d2);
    }

    /* renamed from: a */
    public Bitmap mo37844a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (this.f28315t0 < createBitmap.getHeight()) {
            this.f28315t0 = createBitmap.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("maxMarkerHeight : ");
            sb.append(this.f28315t0);
            sb.toString();
        }
        if (this.f28316u0 < createBitmap.getWidth()) {
            this.f28316u0 = createBitmap.getWidth();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("maxMarkerWidth : ");
            sb2.append(this.f28316u0);
            sb2.toString();
        }
        return createBitmap;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m48486a(Bitmap bitmap, String str, int i) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_waypoint, null);
        try {
            CircleImage circleImage = (CircleImage) inflate.findViewById(C10232R.C10236id.ivPin);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
            circleImage.setBorderColor(C0841b.m4915a((Context) this, i));
            circleImage.setBorderWidth((int) getResources().getDimension(C10232R.dimen.dp_2));
            circleImage.setShadowRadius((float) ((int) getResources().getDimension(C10232R.dimen.dp_35)));
            if (bitmap == null) {
                circleImage.setImageResource(C10232R.C10235drawable.ic_location_sky_blue);
            } else {
                circleImage.setImageBitmap(bitmap);
            }
            textView.setText(str);
        } catch (Exception unused) {
        }
        return inflate;
    }

    /* renamed from: a */
    private View m48485a(int i, String str) {
        View inflate = ((LayoutInflater) AppSingleton.m25737d().getSystemService("layout_inflater")).inflate(C10232R.layout.custom_marker_waypoint, null);
        try {
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvTitle);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
            ((CircleImage) inflate.findViewById(C10232R.C10236id.ivPin)).setImageResource(i);
            textView.setText(str);
        } catch (Exception unused) {
        }
        return inflate;
    }
}
