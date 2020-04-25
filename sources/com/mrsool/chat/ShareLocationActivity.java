package com.mrsool.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
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
import androidx.fragment.app.C1382h;
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
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.ChatInitModel;
import com.mrsool.p423v.C11728i;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.Iterator;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;

public class ShareLocationActivity extends C10787d implements OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public GoogleMap f28260S;

    /* renamed from: T */
    private TextView f28261T;

    /* renamed from: U */
    private TextView f28262U;

    /* renamed from: V */
    private TextView f28263V;

    /* renamed from: W */
    private TextView f28264W;

    /* renamed from: X */
    private TextView f28265X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public SupportMapFragment f28266Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ImageView f28267Z;

    /* renamed from: a0 */
    private ImageView f28268a0;

    /* renamed from: b0 */
    private ImageView f28269b0;

    /* renamed from: c0 */
    private LinearLayout f28270c0;

    /* renamed from: d0 */
    private LinearLayout f28271d0;

    /* renamed from: e0 */
    private LinearLayout f28272e0;

    /* renamed from: f0 */
    private LinearLayout f28273f0;

    /* renamed from: g0 */
    private FrameLayout f28274g0;

    /* renamed from: h0 */
    private RelativeLayout f28275h0;

    /* renamed from: i0 */
    private double f28276i0 = 0.0d;

    /* renamed from: j0 */
    private double f28277j0 = 0.0d;

    /* renamed from: k0 */
    private double f28278k0 = 0.0d;

    /* renamed from: l0 */
    private double f28279l0 = 0.0d;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f28280m0;

    /* renamed from: n0 */
    private Bundle f28281n0;

    /* renamed from: o0 */
    private boolean f28282o0;

    /* renamed from: p0 */
    private ChatInitModel f28283p0;

    /* renamed from: com.mrsool.chat.ShareLocationActivity$a */
    class C10471a extends C2550c {
        C10471a(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            C0894c a = C0895d.m5185a(ShareLocationActivity.this.getResources(), C5887x.m25815e(bitmap));
            a.mo4601b(true);
            ShareLocationActivity.this.f28267Z.setImageDrawable(a);
        }
    }

    /* renamed from: com.mrsool.chat.ShareLocationActivity$b */
    class C10472b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f28285a;

        C10472b(Builder builder) {
            this.f28285a = builder;
        }

        public void run() {
            try {
                ShareLocationActivity.this.f28260S.setPadding(0, ShareLocationActivity.this.getResources().getDrawable(ShareLocationActivity.this.f29642a.mo23506a(ShareLocationActivity.this.f28280m0)).getIntrinsicHeight(), 0, 0);
                ShareLocationActivity.this.f28260S.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f28285a.build(), 100));
            } catch (Exception e) {
                ShareLocationActivity.this.f28260S.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.chat.ShareLocationActivity$c */
    class C10473c implements OnMapReadyCallback {
        C10473c() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (C0841b.m4916a((Context) ShareLocationActivity.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) ShareLocationActivity.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                ShareLocationActivity shareLocationActivity = ShareLocationActivity.this;
                shareLocationActivity.f28260S = shareLocationActivity.f29642a.mo23514a(googleMap, shareLocationActivity.f28266Y, true, true);
                CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(ShareLocationActivity.this.f29642a.mo23648p());
                CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                ShareLocationActivity.this.f28260S.moveCamera(newLatLng);
                ShareLocationActivity.this.f28260S.animateCamera(zoomTo);
                ShareLocationActivity.this.m48465J();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m48465J() {
        ArrayList arrayList = new ArrayList();
        if (this.f29642a.mo23648p() != null) {
            arrayList.add(this.f28260S.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(C10232R.C10235drawable.pin_user)).position(this.f29642a.mo23648p())));
        }
        if (this.f28278k0 > 0.0d && (this.f28280m0 || !this.f28282o0)) {
            arrayList.add(this.f28260S.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(this.f29642a.mo23602d(this.f28280m0))).position(new LatLng(this.f28278k0, this.f28279l0))));
        }
        if (this.f28276i0 > 0.0d) {
            arrayList.add(this.f28260S.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(this.f29642a.mo23506a(this.f28280m0))).position(new LatLng(this.f28276i0, this.f28277j0))));
        }
        Builder builder = new Builder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.include(((Marker) it.next()).getPosition());
        }
        new Handler().postDelayed(new C10472b(builder), 200);
    }

    /* renamed from: K */
    private void m48466K() {
        MapsInitializer.initialize(getApplicationContext());
        this.f28281n0 = getIntent().getExtras();
        mo38412e(getResources().getString(C10232R.string.lbl_see_route));
        m48467L();
        this.f28267Z = (ImageView) findViewById(C10232R.C10236id.imgBuyerPic);
        this.f28268a0 = (ImageView) findViewById(C10232R.C10236id.ivStoreLocation);
        this.f28269b0 = (ImageView) findViewById(C10232R.C10236id.ivCustomerLocation);
        this.f28261T = (TextView) findViewById(C10232R.C10236id.txtStoreName);
        this.f28262U = (TextView) findViewById(C10232R.C10236id.txtStoreAddress);
        this.f28263V = (TextView) findViewById(C10232R.C10236id.txtCustomerName);
        this.f28264W = (TextView) findViewById(C10232R.C10236id.txtCustomerAdd);
        this.f28265X = (TextView) findViewById(C10232R.C10236id.txtBuyerName);
        this.f28270c0 = (LinearLayout) findViewById(C10232R.C10236id.llDriveStoreLocation);
        this.f28271d0 = (LinearLayout) findViewById(C10232R.C10236id.llDriveCustomerLocation);
        this.f28270c0.setOnClickListener(this);
        this.f28271d0.setOnClickListener(this);
        this.f28272e0 = (LinearLayout) findViewById(C10232R.C10236id.llLocationContainer);
        this.f28274g0 = (FrameLayout) findViewById(C10232R.C10236id.flMap);
        this.f28275h0 = (RelativeLayout) findViewById(C10232R.C10236id.rlStorePickUpLocation);
        this.f28273f0 = (LinearLayout) findViewById(C10232R.C10236id.llDivider);
        Bundle bundle = this.f28281n0;
        if (bundle != null && bundle.containsKey(C11644i.f33179R1)) {
            this.f28283p0 = (ChatInitModel) this.f28281n0.get(C11644i.f33179R1);
        }
        if (this.f28283p0 == null) {
            finish();
        } else {
            m48469N();
        }
    }

    /* renamed from: L */
    private void m48467L() {
        C1382h supportFragmentManager = getSupportFragmentManager();
        this.f28266Y = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f28266Y == null) {
            this.f28266Y = SupportMapFragment.newInstance();
            supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f28266Y).mo6100f();
        }
    }

    /* renamed from: M */
    private void m48468M() {
        if (!this.f28280m0 && !this.f28283p0.getOrder().getServicePickupAvailable()) {
            this.f28282o0 = true;
            this.f28275h0.setVisibility(8);
            this.f28273f0.setVisibility(8);
            LayoutParams layoutParams = new LayoutParams(-1, 0);
            layoutParams.weight = 80.0f;
            this.f28274g0.setLayoutParams(layoutParams);
            LayoutParams layoutParams2 = new LayoutParams(-1, 0);
            layoutParams2.weight = 20.0f;
            this.f28272e0.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: N */
    private void m48469N() {
        this.f28280m0 = this.f28283p0.getOrder().getvShopType().equalsIgnoreCase(C11644i.f33244Z2);
        if (this.f28280m0) {
            this.f28278k0 = Double.parseDouble(this.f28283p0.getOrder().getvShopLat());
            this.f28279l0 = Double.parseDouble(this.f28283p0.getOrder().getvShopLong());
            this.f28262U.setText(this.f29642a.mo23471D(this.f28283p0.getOrder().getvShopAddress()));
        } else {
            if (!TextUtils.isEmpty(this.f28283p0.getOrder().getvSubPickupAddress())) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f28283p0.getOrder().getvSubPickupAddress());
                sb.append("\n");
                sb.toString();
            }
            this.f28278k0 = this.f28283p0.getOrder().getPlatitude();
            this.f28279l0 = this.f28283p0.getOrder().getPlongitude();
            this.f28262U.setText(this.f29642a.mo23471D(this.f28283p0.getOrder().getFullPickupAddress()));
            this.f28268a0.setImageResource(C10232R.C10235drawable.ic_pickdropoff);
            this.f28269b0.setImageResource(C10232R.C10235drawable.ic_pickdropoff);
            this.f28261T.setText(getResources().getString(C10232R.string.lbl_pickup_location));
            this.f28263V.setText(getResources().getString(C10232R.string.lbl_dropoff_location));
        }
        this.f28276i0 = this.f28283p0.getOrder().getLatitude();
        this.f28277j0 = this.f28283p0.getOrder().getLongitude();
        if (!TextUtils.isEmpty(this.f28283p0.getOrder().getvBuyerPic())) {
            C2232l.m11649c(getApplicationContext()).mo9515a(this.f28283p0.getOrder().getvBuyerPic()).mo9441j().m11411d().m11415e((int) C10232R.C10235drawable.hint_userpic).mo9458b(new C10471a(this.f28267Z));
        }
        this.f28264W.setText(this.f29642a.mo23471D(this.f28283p0.getOrder().getFullDeliveryDropOffAddress()));
        this.f28265X.setText(this.f29642a.mo23471D(this.f28283p0.getOrder().getvBuyerName()));
        m48468M();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.llDriveCustomerLocation /*2131363032*/:
                m48472a(this.f28276i0, this.f28277j0);
                return;
            case C10232R.C10236id.llDriveStoreLocation /*2131363033*/:
                m48472a(this.f28278k0, this.f28279l0);
                return;
            case C10232R.C10236id.llLeft /*2131363064*/:
                onBackPressed();
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_share_location);
        m48466K();
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
            if (C11644i.f33302f7) {
                C11728i.m52794a(this);
            }
            if (this.f29642a == null) {
                this.f29642a = new C5887x(this);
            }
            if (this.f29642a.mo23502X() && this.f29642a.mo23500V() && this.f28260S == null) {
                this.f28266Y.getMapAsync(new C10473c());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f28266Y.getView().findViewById(Integer.parseInt("1")).getParent()).findViewById(Integer.parseInt("2")).getLayoutParams();
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

    /* renamed from: a */
    private void m48472a(double d, double d2) {
        C5887x xVar = this.f29642a;
        xVar.mo23531a(xVar.mo23648p().latitude, this.f29642a.mo23648p().longitude, d, d2);
    }
}
