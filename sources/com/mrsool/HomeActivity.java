package com.mrsool;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.core.app.C0727a;
import androidx.core.app.C0770p;
import androidx.core.app.C0770p.C0779e;
import androidx.core.content.C0841b;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0962e0;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.Fragment;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation.C2898e;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation.C2899f;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation.TitleState;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationViewPager;
import com.aurelhubert.ahbottomnavigation.C2909b;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.location.C5140l;
import com.google.android.gms.location.LocationRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.mrsool.bean.ComplaintTokenBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.LastAnnouncementRating;
import com.mrsool.bean.LastUnRatedOrder;
import com.mrsool.bean.LocationData;
import com.mrsool.bean.NotificationList;
import com.mrsool.bean.NotificationRow;
import com.mrsool.bean.Order;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.StaticLabelBean;
import com.mrsool.bean.UpdateInfoBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.bean.XmppDetails;
import com.mrsool.chat.AdvanceWebviewActivity;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.complaint.ComplaintDetailActivity;
import com.mrsool.coupon.MyCouponsActivity;
import com.mrsool.createorder.OrderSentActivity;
import com.mrsool.order.C11007j.C11019k;
import com.mrsool.order.C11035n;
import com.mrsool.order.C11042o.C11052i;
import com.mrsool.order.C11056p;
import com.mrsool.order.C11071t;
import com.mrsool.p409me.C10908g;
import com.mrsool.p416s.C11190d;
import com.mrsool.p418u.C11559c;
import com.mrsool.p418u.C11560d;
import com.mrsool.p423v.C11730j;
import com.mrsool.p424w.C11741a;
import com.mrsool.shop.AnnouncementActivity;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.socket.LocationService;
import com.mrsool.stores.C11540g;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.p420b0.C11573b;
import com.mrsool.utils.p420b0.C11584e;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import java.util.Locale;
import org.jcodec.codecs.common.biari.MQEncoder;
import org.json.JSONException;
import org.json.JSONObject;
import p053b.p072g.p073b.C2128a;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends C10797g implements C5140l, C11052i, C11019k, C11071t, C11573b, C11056p {

    /* renamed from: g1 */
    public static C10829h f27244g1 = null;

    /* renamed from: h1 */
    public static boolean f27245h1 = false;

    /* renamed from: i1 */
    public static AHBottomNavigation f27246i1;

    /* renamed from: j1 */
    public static C11560d f27247j1;

    /* renamed from: k1 */
    public static C10943o f27248k1;

    /* renamed from: l1 */
    public static C11559c f27249l1;

    /* renamed from: m1 */
    public static C10943o f27250m1;

    /* renamed from: n1 */
    public static C5887x f27251n1;

    /* renamed from: o1 */
    public static C5887x f27252o1;
    /* access modifiers changed from: private */

    /* renamed from: p1 */
    public static StaticLabelBean f27253p1 = new StaticLabelBean();

    /* renamed from: A0 */
    C2899f f27254A0;

    /* renamed from: B0 */
    public C1382h f27255B0;

    /* renamed from: C0 */
    private Fragment f27256C0;

    /* renamed from: D0 */
    private AppSingleton f27257D0;

    /* renamed from: E0 */
    public FrameLayout f27258E0;

    /* renamed from: F0 */
    private double f27259F0 = 0.001d;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public boolean f27260G0 = false;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public boolean f27261H0 = false;

    /* renamed from: I0 */
    private boolean f27262I0 = false;

    /* renamed from: J0 */
    private final int f27263J0 = 556;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public LastAnnouncementRating f27264K0;

    /* renamed from: L0 */
    private FirebaseAnalytics f27265L0;

    /* renamed from: M0 */
    private int f27266M0 = 0;

    /* renamed from: N0 */
    private NotificationManager f27267N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public ViewGroup f27268O0;
    /* access modifiers changed from: private */

    /* renamed from: P0 */
    public C11584e f27269P0;

    /* renamed from: Q0 */
    private C6009d f27270Q0;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public UpdateInfoBean f27271R0;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public ImageView f27272S0;

    /* renamed from: T0 */
    private ImageView f27273T0;

    /* renamed from: U0 */
    private LinearLayout f27274U0;

    /* renamed from: V0 */
    private View f27275V0;

    /* renamed from: W0 */
    private final String f27276W0 = "updateDeviceInfo";
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public int f27277X0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public int f27278Y0 = 3;

    /* renamed from: Z0 */
    private boolean f27279Z0 = false;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public Handler f27280a1;

    /* renamed from: b1 */
    Runnable f27281b1 = new C10206k();

    /* renamed from: c1 */
    private OnGlobalLayoutListener f27282c1 = new C10198c0();

    /* renamed from: d1 */
    private BroadcastReceiver f27283d1 = new C10203h();

    /* renamed from: e1 */
    private BroadcastReceiver f27284e1 = new C10212q();

    /* renamed from: f1 */
    private BroadcastReceiver f27285f1 = new C10213r();

    /* renamed from: r0 */
    private AHBottomNavigationViewPager f27286r0;

    /* renamed from: s0 */
    private Location f27287s0;

    /* renamed from: t0 */
    private Location f27288t0;

    /* renamed from: u0 */
    private Location f27289u0;

    /* renamed from: v0 */
    private LocationRequest f27290v0;

    /* renamed from: w0 */
    private C11669t f27291w0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public boolean f27292x0 = false;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public boolean f27293y0 = false;

    /* renamed from: z0 */
    private int f27294z0 = 0;

    /* renamed from: com.mrsool.HomeActivity$a */
    class C10193a implements C2899f {
        C10193a() {
        }

        /* renamed from: a */
        public boolean mo11557a(int i, boolean z) {
            if (HomeActivity.this.f29642a.mo23620g()) {
                HomeActivity.this.m47501j(i);
                if (i == 0) {
                    HomeActivity.this.m47521r0();
                } else if (i == 1) {
                    if (!HomeActivity.this.f29642a.mo23503Y()) {
                        HomeActivity.this.m47517p0();
                        HomeActivity.this.f29642a.mo23473E(C11644i.f33237Y3);
                        HomeActivity.this.f29642a.mo23473E(C11644i.f33245Z3);
                    } else {
                        HomeActivity.this.m47505k(0);
                    }
                } else if (i == 2) {
                    if (!HomeActivity.this.f29642a.mo23503Y()) {
                        HomeActivity.this.m47519q0();
                    } else {
                        HomeActivity.this.m47505k(0);
                    }
                } else if (i == HomeActivity.this.f27277X0) {
                    if (!HomeActivity.this.f29642a.mo23503Y()) {
                        HomeActivity.this.m47513n0();
                    } else {
                        HomeActivity.this.m47505k(0);
                    }
                } else if (i == HomeActivity.this.f27278Y0) {
                    if (!HomeActivity.this.f29642a.mo23503Y()) {
                        HomeActivity.this.m47515o0();
                    } else {
                        HomeActivity.this.m47505k(0);
                    }
                }
                return true;
            }
            HomeActivity.this.f29642a.mo23641m0();
            return false;
        }
    }

    /* renamed from: com.mrsool.HomeActivity$a0 */
    class C10194a0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27296a;

        C10194a0(Dialog dialog) {
            this.f27296a = dialog;
        }

        public void onClick(View view) {
            this.f27296a.dismiss();
        }
    }

    /* renamed from: com.mrsool.HomeActivity$b */
    class C10195b implements C2898e {
        C10195b() {
        }

        /* renamed from: a */
        public void mo11556a(int i) {
        }
    }

    /* renamed from: com.mrsool.HomeActivity$b0 */
    class C10196b0 implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27299a;

        C10196b0(Dialog dialog) {
            this.f27299a = dialog;
        }

        public void onClick(View view) {
            this.f27299a.dismiss();
            if (HomeActivity.this.f29642a.mo23584b(LocationService.class)) {
                HomeActivity.this.m47527u0();
                C0727a.m4239a((Activity) HomeActivity.this);
                HomeActivity.this.finish();
            } else {
                HomeActivity.this.m47527u0();
                C0727a.m4239a((Activity) HomeActivity.this);
                HomeActivity.this.finish();
            }
            C11644i.f33216V6 = true;
            C5887x.f17106r = null;
        }
    }

    /* renamed from: com.mrsool.HomeActivity$c */
    class C10197c implements Runnable {
        C10197c() {
        }

        public void run() {
            if (HomeActivity.this.f29642a.mo23500V()) {
                HomeActivity.this.m47508l0();
            } else {
                C5880q.m25751b("GPS is not available");
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$c0 */
    class C10198c0 implements OnGlobalLayoutListener {
        C10198c0() {
        }

        public void onGlobalLayout() {
            Rect rect = new Rect();
            HomeActivity.this.f27268O0.getWindowVisibleDisplayFrame(rect);
            int height = HomeActivity.this.f27268O0.getRootView().getHeight() - (rect.bottom - rect.top);
            StringBuilder sb = new StringBuilder();
            sb.append("Keyboard ");
            sb.append(height);
            sb.append("  >  ");
            sb.append(HomeActivity.this.getResources().getDimension(C10232R.dimen.dp_100));
            C5880q.m25751b(sb.toString());
            if (((float) height) > HomeActivity.this.getResources().getDimension(C10232R.dimen.dp_100) && HomeActivity.this.f29642a.mo23497S()) {
                HomeActivity.this.mo38430K();
                C5880q.m25751b("Keyboard opens...");
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$d */
    class C10199d implements C11673d {
        C10199d() {
        }

        /* renamed from: a */
        public void mo36513a() {
            HomeActivity.this.m47488e0();
        }

        /* renamed from: b */
        public void mo36514b() {
            if (HomeActivity.this.f29642a.mo23502X() && HomeActivity.this.f29642a.mo23500V()) {
                HomeActivity.this.f27280a1 = new Handler();
                HomeActivity.this.f27280a1.postDelayed(HomeActivity.this.f27281b1, 4000);
                HomeActivity.this.m47486e(true);
                HomeActivity.this.m47537z0();
                C5881v D = HomeActivity.this.f29642a.mo23470D();
                HomeActivity homeActivity = HomeActivity.this;
                D.mo23449a(C11644i.f33295f0, homeActivity.f29642a.mo23522a((Context) homeActivity));
                HomeActivity.this.m47440T();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$e */
    class C10200e implements Callback<UpdateInfoBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f27304a;

        C10200e(boolean z) {
            this.f27304a = z;
        }

        public void onFailure(Call<UpdateInfoBean> call, Throwable th) {
            try {
                if (HomeActivity.this.f29642a != null) {
                    HomeActivity.this.f29642a.mo23492O();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UpdateInfoBean> call, Response<UpdateInfoBean> response) {
            try {
                if (HomeActivity.this.f29642a != null) {
                    HomeActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful() && ((UpdateInfoBean) response.body()).getCode() <= 300) {
                        HomeActivity.this.f29642a.mo23632j0();
                        HomeActivity.this.f27271R0 = (UpdateInfoBean) response.body();
                        HomeActivity.this.f29642a.mo23468C().mo23448a("isupdated", Boolean.valueOf(true));
                        HomeActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33282d5, Boolean.valueOf(HomeActivity.this.f27271R0.isTerms_accepted()));
                        HomeActivity.this.f29642a.mo23468C().mo23447a(C11644i.f33291e5, HomeActivity.this.f27271R0.getCurrent_terms_version());
                        C11644i.f33277d0 = HomeActivity.this.f27271R0.getApp_update_alert_text();
                        String a = HomeActivity.this.f29642a.mo23528a(response.body());
                        String str = "updateDeviceInfo";
                        if (!TextUtils.isEmpty(a)) {
                            HomeActivity.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                            HomeActivity.this.f29642a.mo23553a((C11056p) HomeActivity.this);
                        } else {
                            HomeActivity.this.mo36511f(str);
                        }
                        HomeActivity.this.m47480d(this.f27304a);
                        if (HomeActivity.this.f27271R0.isApp_update_required()) {
                            HomeActivity.this.f27260G0 = true;
                            HomeActivity.this.f29642a.mo23473E(C11644i.f33458y4);
                            if (HomeActivity.this.f27261H0) {
                                HomeActivity.this.f29642a.mo23493O(HomeActivity.this.getResources().getString(C10232R.string.msg_updateChecker));
                            }
                        }
                        HomeActivity.this.m47492f(HomeActivity.this.f27271R0.isTrackUser());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$f */
    class C10201f implements Callback<UserDetail> {
        C10201f() {
        }

        public void onFailure(Call<UserDetail> call, Throwable th) {
            try {
                HomeActivity.this.f29642a.mo23492O();
                HomeActivity.this.f29642a.mo23653q0();
                StringBuilder sb = new StringBuilder();
                sb.append("callGetUserDetailAPI onFailure");
                sb.append(th.toString());
                C5880q.m25753d(sb.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x01d4, code lost:
            if (r3.f27306a.getIntent().getExtras() != null) goto L_0x01d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x01f4, code lost:
            if (r3.f27306a.f29642a.mo23468C().mo23450a(r5) != false) goto L_0x020c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call<com.mrsool.bean.UserDetail> r4, retrofit2.Response<com.mrsool.bean.UserDetail> r5) {
            /*
                r3 = this;
                java.lang.String r4 = "user_name"
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r0 = r0.f29642a     // Catch:{ Exception -> 0x0281 }
                if (r0 == 0) goto L_0x028c
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r0 = r0.f29642a     // Catch:{ Exception -> 0x0281 }
                r0.mo23492O()     // Catch:{ Exception -> 0x0281 }
                boolean r0 = r5.isSuccessful()     // Catch:{ Exception -> 0x0281 }
                if (r0 == 0) goto L_0x0271
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getCode()     // Catch:{ Exception -> 0x0281 }
                r1 = 300(0x12c, float:4.2E-43)
                if (r0 > r1) goto L_0x025d
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33072D6 = r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                r0.m47442V()     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnMyActiveOrderCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33061C3 = r0     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnMyInActiveOrderCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33069D3 = r0     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnMyActiveDeliveriesCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33077E3 = r0     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnMyInActiveDeliveriesCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33085F3 = r0     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnNotificationListCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33093G3 = r0     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r0 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r0 = (com.mrsool.bean.UserDetail) r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0281 }
                int r0 = r0.getPnMyorderTotalCount()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33101H3 = r0     // Catch:{ Exception -> 0x0281 }
                int r0 = com.mrsool.utils.C11644i.f33061C3     // Catch:{ Exception -> 0x0281 }
                int r1 = com.mrsool.utils.C11644i.f33077E3     // Catch:{ Exception -> 0x0281 }
                int r0 = r0 + r1
                com.mrsool.utils.C11644i.f33045A3 = r0     // Catch:{ Exception -> 0x0281 }
                int r0 = com.mrsool.utils.C11644i.f33069D3     // Catch:{ Exception -> 0x0281 }
                int r1 = com.mrsool.utils.C11644i.f33085F3     // Catch:{ Exception -> 0x0281 }
                int r0 = r0 + r1
                com.mrsool.utils.C11644i.f33053B3 = r0     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r0 = r0.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = "user_profile"
                java.lang.Object r2 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r2 = (com.mrsool.bean.UserDetail) r2     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r2 = r2.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r2 = r2.getVProfilePic()     // Catch:{ Exception -> 0x0281 }
                r0.mo23449a(r1, r2)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r0 = r0.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = r1.getVFullName()     // Catch:{ Exception -> 0x0281 }
                r0.mo23449a(r4, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r0 = r0.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r0 = r0.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = r1.getVFullName()     // Catch:{ Exception -> 0x0281 }
                r0.mo23449a(r4, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "user_rating"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.Double r1 = r1.getFAverageRating()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0281 }
                r4.mo23449a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "gender"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = r1.getvGender()     // Catch:{ Exception -> 0x0281 }
                r4.mo23449a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "birthyear"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = r1.getvBirthYear()     // Catch:{ Exception -> 0x0281 }
                r4.mo23449a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "show_pending_tab"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.Boolean r1 = r1.getShowOrderWaitingTab()     // Catch:{ Exception -> 0x0281 }
                r4.mo23448a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "user_email"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = r1.getVEmail()     // Catch:{ Exception -> 0x0281 }
                r4.mo23449a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "id_announcement"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.Boolean r1 = r1.getbAnnouncement()     // Catch:{ Exception -> 0x0281 }
                r4.mo23448a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r0 = "is_courier"
                java.lang.Object r1 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r1 = (com.mrsool.bean.UserDetail) r1     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r1 = r1.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.Boolean r1 = r1.getIs_courier()     // Catch:{ Exception -> 0x0281 }
                r4.mo23448a(r0, r1)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r5 = (com.mrsool.bean.UserDetail) r5     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.User r5 = r5.getUser()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r5 = r5.getVProfilePic()     // Catch:{ Exception -> 0x0281 }
                r4.mo36530m(r5)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r5 = "is_clevertap_pushed"
                r0 = 1
                if (r4 == 0) goto L_0x01d6
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x0281 }
                android.os.Bundle r4 = r4.getExtras()     // Catch:{ Exception -> 0x0281 }
                if (r4 == 0) goto L_0x01f6
            L_0x01d6:
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x0281 }
                android.os.Bundle r4 = r4.getExtras()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r1 = com.mrsool.utils.C11644i.f33407s1     // Catch:{ Exception -> 0x0281 }
                boolean r4 = r4.containsKey(r1)     // Catch:{ Exception -> 0x0281 }
                if (r4 == 0) goto L_0x01f6
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                boolean r4 = r4.mo23450a(r5)     // Catch:{ Exception -> 0x0281 }
                if (r4 != 0) goto L_0x020c
            L_0x01f6:
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                r4.mo23621g0()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.v r4 = r4.mo23468C()     // Catch:{ Exception -> 0x0281 }
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0281 }
                r4.mo23448a(r5, r1)     // Catch:{ Exception -> 0x0281 }
            L_0x020c:
                com.aurelhubert.ahbottomnavigation.AHBottomNavigation r4 = com.mrsool.HomeActivity.f27246i1     // Catch:{ Exception -> 0x0281 }
                int r5 = com.mrsool.utils.C11644i.f33101H3     // Catch:{ Exception -> 0x0281 }
                r1 = 0
                if (r5 <= 0) goto L_0x0216
                int r5 = com.mrsool.utils.C11644i.f33101H3     // Catch:{ Exception -> 0x0281 }
                goto L_0x0217
            L_0x0216:
                r5 = 0
            L_0x0217:
                r4.mo11496b(r5, r0)     // Catch:{ Exception -> 0x0281 }
                com.aurelhubert.ahbottomnavigation.AHBottomNavigation r4 = com.mrsool.HomeActivity.f27246i1     // Catch:{ Exception -> 0x0281 }
                int r5 = com.mrsool.utils.C11644i.f33093G3     // Catch:{ Exception -> 0x0281 }
                if (r5 <= 0) goto L_0x0222
                int r1 = com.mrsool.utils.C11644i.f33093G3     // Catch:{ Exception -> 0x0281 }
            L_0x0222:
                r5 = 2
                r4.mo11496b(r1, r5)     // Catch:{ Exception -> 0x0281 }
                int r4 = com.mrsool.utils.C11644i.f33093G3     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.C11644i.f33112I6 = r4     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                r4.m47474c(r0)     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                r4.m47433A0()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                boolean r4 = r4.mo23502X()     // Catch:{ Exception -> 0x0281 }
                if (r4 == 0) goto L_0x0255
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                android.content.Intent r4 = r4.getIntent()     // Catch:{ Exception -> 0x0281 }
                java.lang.String r5 = "call_from"
                boolean r4 = r4.hasExtra(r5)     // Catch:{ Exception -> 0x0281 }
                if (r4 != 0) goto L_0x0255
                boolean r4 = com.mrsool.utils.C11644i.f33453y     // Catch:{ Exception -> 0x0281 }
                if (r4 != 0) goto L_0x0255
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                r4.m47496g0()     // Catch:{ Exception -> 0x0281 }
            L_0x0255:
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                r4.mo23659s0()     // Catch:{ Exception -> 0x0281 }
                goto L_0x028c
            L_0x025d:
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                com.mrsool.HomeActivity r0 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                java.lang.Object r5 = r5.body()     // Catch:{ Exception -> 0x0281 }
                com.mrsool.bean.UserDetail r5 = (com.mrsool.bean.UserDetail) r5     // Catch:{ Exception -> 0x0281 }
                java.lang.String r5 = r5.getMessage()     // Catch:{ Exception -> 0x0281 }
                r4.mo23576b(r0, r5)     // Catch:{ Exception -> 0x0281 }
                goto L_0x028c
            L_0x0271:
                int r4 = r5.code()     // Catch:{ Exception -> 0x0281 }
                r5 = 401(0x191, float:5.62E-43)
                if (r4 != r5) goto L_0x028c
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this     // Catch:{ Exception -> 0x0281 }
                com.mrsool.utils.x r4 = r4.f29642a     // Catch:{ Exception -> 0x0281 }
                r4.mo23613e0()     // Catch:{ Exception -> 0x0281 }
                goto L_0x028c
            L_0x0281:
                r4 = move-exception
                r4.printStackTrace()
                com.mrsool.HomeActivity r4 = com.mrsool.HomeActivity.this
                com.mrsool.utils.x r4 = r4.f29642a
                r4.mo23492O()
            L_0x028c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.HomeActivity.C10201f.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* renamed from: com.mrsool.HomeActivity$g */
    class C10202g extends C2550c {
        C10202g(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            HomeActivity.this.f27272S0.setScaleType(ScaleType.CENTER_CROP);
            HomeActivity.f27246i1.setProfilePic(HomeActivity.this.f29642a.mo23567b(bitmap));
        }
    }

    /* renamed from: com.mrsool.HomeActivity$h */
    class C10203h extends BroadcastReceiver {
        C10203h() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!HomeActivity.this.isFinishing() && HomeActivity.f27246i1 != null) {
                Bundle extras = intent.getExtras();
                if (intent.getAction().equalsIgnoreCase(C11644i.f33109I3)) {
                    if (extras.getString(C11644i.f33359m1).equalsIgnoreCase(C11644i.f33239Y5)) {
                        if (!C11644i.f33269c1 || C11644i.f33226X0) {
                            AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                            int i = C11644i.f33101H3;
                            if (i <= 0) {
                                i = 0;
                            }
                            aHBottomNavigation.mo11496b(i, 1);
                        } else {
                            AHBottomNavigation aHBottomNavigation2 = HomeActivity.f27246i1;
                            int i2 = C11644i.f33101H3;
                            if (i2 <= 0) {
                                i2 = 0;
                            }
                            aHBottomNavigation2.mo11496b(i2, 1);
                            HomeActivity.this.f29642a.mo23473E(C11644i.f33181R3);
                            HomeActivity.this.f29642a.mo23473E(C11644i.f33205U3);
                            HomeActivity.this.f29642a.mo23473E(C11644i.f33189S3);
                            HomeActivity.this.f29642a.mo23473E(C11644i.f33197T3);
                            C11559c cVar = HomeActivity.f27249l1;
                            if (cVar != null) {
                                cVar.mo38792t();
                            }
                        }
                        if (C11644i.f33093G3 == 0 || !C11644i.f33242Z0) {
                            AHBottomNavigation aHBottomNavigation3 = HomeActivity.f27246i1;
                            int i3 = C11644i.f33093G3;
                            if (i3 <= 0) {
                                i3 = 0;
                            }
                            aHBottomNavigation3.mo11496b(i3, 2);
                        } else {
                            C11560d dVar = HomeActivity.f27247j1;
                            if (dVar != null) {
                                dVar.mo39686t();
                            }
                            AHBottomNavigation aHBottomNavigation4 = HomeActivity.f27246i1;
                            int i4 = C11644i.f33093G3;
                            if (i4 <= 0) {
                                i4 = 0;
                            }
                            aHBottomNavigation4.mo11496b(i4, 2);
                        }
                    } else if (extras.getString(C11644i.f33359m1).equalsIgnoreCase(C11644i.f33301f6)) {
                        HomeActivity.this.m47454a(intent);
                    } else if (C11644i.f33093G3 == 0 || !C11644i.f33242Z0) {
                        AHBottomNavigation aHBottomNavigation5 = HomeActivity.f27246i1;
                        int i5 = C11644i.f33093G3;
                        if (i5 <= 0) {
                            i5 = 0;
                        }
                        aHBottomNavigation5.mo11496b(i5, 2);
                    } else {
                        C11560d dVar2 = HomeActivity.f27247j1;
                        if (dVar2 != null) {
                            dVar2.mo39686t();
                        }
                        AHBottomNavigation aHBottomNavigation6 = HomeActivity.f27246i1;
                        int i6 = C11644i.f33093G3;
                        if (i6 <= 0) {
                            i6 = 0;
                        }
                        aHBottomNavigation6.mo11496b(i6, 2);
                    }
                    if (!extras.containsKey(C11644i.f33314h1) || !C11644i.f33226X0 || !C11644i.f33194T0.equalsIgnoreCase(extras.getString("order_id"))) {
                        HomeActivity.this.m47478d(extras);
                        HomeActivity.this.m47446Z();
                    }
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33281d4)) {
                    HomeActivity.this.f29642a.mo23658s(intent.getExtras().getString("id"));
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33344k4)) {
                    if (HomeActivity.this.f29642a.mo23620g()) {
                        C5880q.m25751b("update_device_info : Called from BROADCAST_REFRESH_LOCATION_CHANGED");
                        HomeActivity.this.m47474c(false);
                        HomeActivity.this.f29642a.mo23473E(C11644i.f33290e4);
                        C11644i.f33177R = false;
                    }
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33362m4)) {
                    if (HomeActivity.this.f29642a.mo23620g()) {
                        HomeActivity.this.f29642a.mo23626i();
                    }
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33370n4)) {
                    C11694e.INSTANCE.mo40209e();
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33434v4)) {
                    HomeActivity.this.m47454a(intent);
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33450x4)) {
                    HomeActivity.this.m47474c(false);
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33118J4)) {
                    HomeActivity.this.m47473c(extras);
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33046A4)) {
                    if (HomeActivity.this.f29642a.mo23648p().latitude != 0.0d && HomeActivity.this.f29642a.mo23648p().longitude != 0.0d) {
                        Location location = new Location("current");
                        location.setLatitude(HomeActivity.this.f29642a.mo23648p().latitude);
                        location.setLongitude(HomeActivity.this.f29642a.mo23648p().longitude);
                        HomeActivity.this.onLocationChanged(location);
                    }
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33272c4)) {
                    try {
                        HomeActivity.this.mo36530m(C11644i.f33072D6.getUser().getVProfilePic());
                    } catch (Exception unused) {
                    }
                } else if (intent.getAction().equalsIgnoreCase(C11644i.f33213V3)) {
                    HomeActivity.this.m47523s0();
                }
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$i */
    class C10204i implements Runnable {
        C10204i() {
        }

        public void run() {
            HomeActivity.this.m47537z0();
            HomeActivity.this.m47508l0();
        }
    }

    /* renamed from: com.mrsool.HomeActivity$j */
    class C10205j implements Callback<NotificationList> {
        C10205j() {
        }

        public void onFailure(Call<NotificationList> call, Throwable th) {
        }

        public void onResponse(Call<NotificationList> call, Response<NotificationList> response) {
            try {
                if (HomeActivity.this.f29642a != null) {
                    HomeActivity.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        if (((NotificationList) response.body()).getCode().intValue() <= 300) {
                            C11644i.f33144M6 = true;
                            NotificationList notificationList = (NotificationList) response.body();
                            C11644i.f33460y6.clear();
                            C11644i.f33460y6.addAll(((NotificationList) response.body()).getNotifications());
                            int i = 0;
                            C11644i.f33093G3 = 0;
                            for (int i2 = 0; i2 < C11644i.f33460y6.size(); i2++) {
                                if (!((NotificationRow) C11644i.f33460y6.get(i2)).getRead().booleanValue()) {
                                    C11644i.f33093G3++;
                                }
                            }
                            C11644i.f33112I6 = C11644i.f33093G3;
                            AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                            if (C11644i.f33093G3 > 0) {
                                i = C11644i.f33093G3;
                            }
                            aHBottomNavigation.mo11496b(i, 2);
                            C2128a.m11089a((Context) HomeActivity.this).mo9219a(new Intent(C11644i.f33263b4));
                        }
                    } else if (HomeActivity.this.f29642a != null) {
                        HomeActivity.this.f29642a.mo23615f(response.message(), HomeActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$k */
    class C10206k implements Runnable {
        C10206k() {
        }

        public void run() {
            try {
                if (HomeActivity.this.f27269P0 != null && !HomeActivity.this.f27292x0) {
                    HomeActivity.this.f27269P0.mo39759f();
                    HomeActivity.this.m47440T();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$l */
    class C10207l implements Runnable {
        C10207l() {
        }

        public void run() {
            try {
                HomeActivity.f27246i1.setCurrentItem(0);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$m */
    class C10208m implements Callback<LastAnnouncementRating> {
        C10208m() {
        }

        public void onFailure(Call<LastAnnouncementRating> call, Throwable th) {
        }

        public void onResponse(Call<LastAnnouncementRating> call, Response<LastAnnouncementRating> response) {
            if (response.isSuccessful()) {
                HomeActivity.this.f27264K0 = (LastAnnouncementRating) response.body();
                if (HomeActivity.this.f27264K0.getCode().intValue() <= 300) {
                    String id = HomeActivity.this.f27264K0.getAnnouncement().getId();
                    String str = C11644i.f33199T5;
                    if (id != null) {
                        if (!HomeActivity.this.getString(C10232R.string.lbl_push_notification).equalsIgnoreCase(HomeActivity.this.getIntent().getStringExtra(str)) && !C11644i.f33129L) {
                            Intent intent = new Intent(HomeActivity.this, AnnouncementActivity.class);
                            intent.putExtra(C11644i.f33463z1, HomeActivity.this.f27264K0.getAnnouncement().getImage());
                            intent.putExtra(C11644i.f33391q1, HomeActivity.this.f27264K0.getAnnouncement().getTitle());
                            intent.putExtra(C11644i.f33243Z1, HomeActivity.this.f27264K0.getAnnouncement().getDescription());
                            String str2 = C11644i.f33367n1;
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            sb.append(HomeActivity.this.f27264K0.getAnnouncement().getId());
                            intent.putExtra(str2, sb.toString());
                            intent.putExtra("action_button_type", HomeActivity.this.f27264K0.getAnnouncement().getAction_button_type());
                            intent.putExtra("action_button_name", HomeActivity.this.f27264K0.getAnnouncement().getAction_button_name());
                            intent.putExtra("action_button_value", HomeActivity.this.f27264K0.getAnnouncement().getAction_button_value());
                            intent.putExtra("shouldUpgrade", HomeActivity.this.f27260G0);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("shouldUpgrade : ");
                            sb2.append(HomeActivity.this.f27260G0);
                            C5880q.m25751b(sb2.toString());
                            intent.putExtra(str, "homeActivity");
                            HomeActivity.this.startActivityForResult(intent, 1009);
                        }
                    } else if (HomeActivity.this.f27264K0.getOrder().getId() == null) {
                        HomeActivity.this.f27261H0 = true;
                        if (HomeActivity.this.f27260G0) {
                            HomeActivity homeActivity = HomeActivity.this;
                            homeActivity.f29642a.mo23493O(homeActivity.getResources().getString(C10232R.string.msg_updateChecker));
                        }
                    } else if (!HomeActivity.this.getString(C10232R.string.lbl_push_notification).equalsIgnoreCase(HomeActivity.this.getIntent().getStringExtra(str))) {
                        HomeActivity.this.m47435B0();
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$n */
    class C10209n implements Callback<DefaultBean> {
        C10209n() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C5880q.m25751b("onFailure");
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (!response.isSuccessful()) {
                C5880q.m25751b("Something is wrong");
            } else if (((DefaultBean) response.body()).getCode().intValue() < 300) {
                C5880q.m25751b("Data sent successfully...");
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$o */
    class C10210o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27315a;

        C10210o(Dialog dialog) {
            this.f27315a = dialog;
        }

        public void onClick(View view) {
            HomeActivity.this.m47463a0();
            this.f27315a.dismiss();
        }
    }

    /* renamed from: com.mrsool.HomeActivity$p */
    class C10211p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27317a;

        C10211p(Dialog dialog) {
            this.f27317a = dialog;
        }

        public void onClick(View view) {
            HomeActivity.this.m47529v0();
            this.f27317a.dismiss();
        }
    }

    /* renamed from: com.mrsool.HomeActivity$q */
    class C10212q extends BroadcastReceiver {
        C10212q() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (((action.hashCode() == -2111925895 && action.equals(C11644i.f33126K4)) ? (char) 0 : 65535) == 0) {
                HomeActivity.this.mo36519N();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$r */
    class C10213r extends BroadcastReceiver {
        C10213r() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
                HomeActivity.this.m47477c0();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$s */
    class C10214s implements Runnable {
        C10214s() {
        }

        public void run() {
            if (!HomeActivity.this.f27271R0.isTerms_accepted() && !HomeActivity.this.f27293y0) {
                HomeActivity.this.f27293y0 = true;
                Intent intent = new Intent(HomeActivity.this, TermsAndConditionActivity.class);
                intent.putExtra(C11644i.f33391q1, HomeActivity.this.getString(C10232R.string.lbl_terms_condition));
                intent.putExtra(C11644i.f33383p1, "https://s.mrsool.co/terms.html");
                intent.putExtra(C11644i.f33067D1, C11644i.f33384p2);
                if (C11644i.f33453y) {
                    HomeActivity.this.startActivityForResult(intent, 1012);
                } else {
                    HomeActivity.this.startActivity(intent);
                }
            } else if (HomeActivity.this.f29642a.mo23498T()) {
                HomeActivity.this.mo36521P();
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$t */
    class C10215t implements Callback<ComplaintTokenBean> {

        /* renamed from: a */
        final /* synthetic */ String f27322a;

        C10215t(String str) {
            this.f27322a = str;
        }

        public void onFailure(Call<ComplaintTokenBean> call, Throwable th) {
            if (!HomeActivity.this.isFinishing()) {
                C5887x xVar = HomeActivity.this.f29642a;
                if (xVar != null) {
                    xVar.mo23653q0();
                }
            }
        }

        public void onResponse(Call<ComplaintTokenBean> call, Response<ComplaintTokenBean> response) {
            try {
                HomeActivity.this.f29642a.mo23492O();
                if (response.isSuccessful() && ((ComplaintTokenBean) response.body()).getCode().intValue() <= 300 && !TextUtils.isEmpty(((ComplaintTokenBean) response.body()).getToken())) {
                    Intent intent = new Intent(HomeActivity.this, AdvanceWebviewActivity.class);
                    intent.putExtra(C11644i.f33391q1, HomeActivity.this.getResources().getString(C10232R.string.lbl_my_filed_complaint));
                    intent.putExtra(C11644i.f33383p1, HomeActivity.this.f29642a.mo23572b(((ComplaintTokenBean) response.body()).getToken(), this.f27322a));
                    HomeActivity.this.startActivity(intent);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$u */
    class C10216u implements Callback<StaticLabelBean> {
        C10216u() {
        }

        public void onFailure(Call<StaticLabelBean> call, Throwable th) {
            try {
                if (HomeActivity.this.f29642a != null && !HomeActivity.this.isFinishing()) {
                    HomeActivity.this.f29642a.mo23492O();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<StaticLabelBean> call, Response<StaticLabelBean> response) {
            if (!HomeActivity.this.isFinishing()) {
                C5887x xVar = HomeActivity.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    if (!response.isSuccessful()) {
                        return;
                    }
                    if (((StaticLabelBean) response.body()).getCode().intValue() <= 300) {
                        HomeActivity.f27253p1 = (StaticLabelBean) response.body();
                        return;
                    }
                    C5887x xVar2 = HomeActivity.this.f29642a;
                    if (xVar2 != null) {
                        xVar2.mo23485K(((StaticLabelBean) response.body()).getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$v */
    class C10217v implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27325a;

        C10217v(Dialog dialog) {
            this.f27325a = dialog;
        }

        public void onClick(View view) {
            this.f27325a.dismiss();
            HomeActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33175Q5, Boolean.valueOf(true));
        }
    }

    /* renamed from: com.mrsool.HomeActivity$w */
    class C10218w implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27327a;

        C10218w(Dialog dialog) {
            this.f27327a = dialog;
        }

        public void onClick(View view) {
            this.f27327a.dismiss();
            HomeActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33167P5, Boolean.valueOf(true));
        }
    }

    /* renamed from: com.mrsool.HomeActivity$x */
    class C10219x implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27329a;

        C10219x(Dialog dialog) {
            this.f27329a = dialog;
        }

        public void onClick(View view) {
            this.f27329a.dismiss();
            HomeActivity.this.f29642a.mo23468C().mo23448a(C11644i.f33159O5, Boolean.valueOf(true));
            if (HomeActivity.this.f29642a.mo23502X()) {
                C5887x.m25817f((Context) HomeActivity.this);
            }
        }
    }

    /* renamed from: com.mrsool.HomeActivity$y */
    class C10220y implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f27331a;

        C10220y(Dialog dialog) {
            this.f27331a = dialog;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f27331a.dismiss();
            }
            return true;
        }
    }

    /* renamed from: com.mrsool.HomeActivity$z */
    class C10221z implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Intent f27333a;

        C10221z(Intent intent) {
            this.f27333a = intent;
        }

        public void run() {
            Intent intent = new Intent(HomeActivity.this, ChatActivityNew.class);
            intent.putExtra(C11644i.f33199T5, HomeActivity.this.getString(C10232R.string.lbl_push_notification));
            String str = C11644i.f33314h1;
            intent.putExtra(str, this.f27333a.getStringExtra(str));
            intent.addFlags(805306368);
            HomeActivity.this.startActivityForResult(intent, C11644i.f33058C0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m47433A0() {
        if (this.f27279Z0 && VERSION.SDK_INT >= 23) {
            Intent intent = new Intent();
            String packageName = getPackageName();
            if (!((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(packageName)) {
                intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                StringBuilder sb = new StringBuilder();
                sb.append("package:");
                sb.append(packageName);
                intent.setData(Uri.parse(sb.toString()));
                startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public void m47435B0() {
        mo38433a(m47449a(this.f27264K0.getOrder()), true);
        if (this.f27260G0) {
            this.f29642a.mo23493O(getResources().getString(C10232R.string.msg_updateChecker));
        }
    }

    /* renamed from: C0 */
    private void m47437C0() {
        C11584e eVar = this.f27269P0;
        if (eVar != null) {
            eVar.mo39759f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m47440T() {
        this.f27269P0 = C11584e.m52207a((Activity) this);
        this.f27269P0.mo39750a((C11573b) this);
        this.f27269P0.mo39753b(500);
        this.f27269P0.mo39754b(false);
        this.f27269P0.mo39751a(true);
        this.f27269P0.mo39747a();
    }

    /* renamed from: U */
    private void m47441U() {
        this.f27269P0 = C11584e.m52207a((Activity) this);
        this.f27269P0.mo39750a((C11573b) this);
        this.f27269P0.mo39753b(C11644i.f33421u * 1000);
        this.f27269P0.mo39754b(true);
        this.f27269P0.mo39751a(true);
        this.f27269P0.mo39747a();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m47442V() {
        try {
            C6009d J = C6009d.m27463J();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11644i.f33072D6.getUser().getIUserId());
            J.mo24805d(sb.toString());
        } catch (Exception unused) {
        }
    }

    /* renamed from: W */
    private void m47443W() {
        String str = "";
        JSONObject jSONObject = new JSONObject();
        try {
            String string = getResources().getString(C10232R.string.brach_event_param_user_id);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29642a.mo23476G());
            jSONObject.put(string, sb.toString());
            String string2 = getResources().getString(C10232R.string.brach_event_param_channel);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(m47493f0());
            jSONObject.put(string2, sb2.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        C6009d.m27516c(getApplicationContext()).mo24767a(getResources().getString(C10232R.string.branch_event_user_signin), jSONObject);
    }

    /* renamed from: X */
    private void m47444X() {
        if (!this.f27292x0) {
            m47529v0();
        }
    }

    /* renamed from: Y */
    private void m47445Y() {
        C11687c.m52645a(this.f29642a).getUserDetail(String.valueOf(this.f29642a.mo23468C().mo23459f("user_id"))).enqueue(new C10201f());
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m47446Z() {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f29642a.mo23648p().latitude);
        hashMap.put("user_lat", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f29642a.mo23648p().longitude);
        hashMap.put("user_long", sb2.toString());
        C11687c.m52645a(this.f29642a).notificationList(String.valueOf(this.f29642a.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C10205j());
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m47463a0() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        startActivityForResult(intent, 556);
    }

    /* renamed from: b0 */
    private void m47471b0() {
        try {
            this.f27267N0 = (NotificationManager) getSystemService("notification");
            this.f27267N0.cancel(300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m47477c0() {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23612e()) {
            try {
                new Handler().postDelayed(new C10204i(), 1000);
                if (C5887x.f17106r != null && C5887x.f17106r.isShowing()) {
                    C5887x.f17106r.dismiss();
                    C5887x.f17106r = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d0 */
    private void m47483d0() {
        try {
            if (VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
                String string = getResources().getString(C10232R.string.notification_channel_id);
                if (notificationManager == null || notificationManager.getNotificationChannel(string) == null) {
                    String string2 = getResources().getString(C10232R.string.notification_channel_name);
                    String string3 = getResources().getString(C10232R.string.notification_channel_description);
                    NotificationChannel notificationChannel = new NotificationChannel(string, string2, 3);
                    notificationChannel.setDescription(string3);
                    notificationChannel.enableLights(true);
                    notificationChannel.setSound(this.f29642a.mo23660t(), null);
                    notificationChannel.setLightColor(C0886a.f4059c);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m47488e0() {
        boolean z;
        boolean z2 = true;
        this.f27266M0++;
        int i = this.f27266M0;
        if (i == 1) {
            if (VERSION.SDK_INT >= 23) {
                String str = "android.permission.ACCESS_FINE_LOCATION";
                z = this.f29642a.mo23663u(str) != 0 ? shouldShowRequestPermissionRationale(str) : true;
                String str2 = "android.permission.READ_PHONE_STATE";
                if (this.f29642a.mo23663u(str2) != 0) {
                    z2 = shouldShowRequestPermissionRationale(str2);
                }
            } else {
                z = true;
            }
            if (!z || !z2) {
                mo36522Q();
            } else {
                mo36523R();
            }
        } else if (i > 1) {
            mo36522Q();
        }
    }

    /* renamed from: f0 */
    private String m47493f0() {
        if (this.f29642a.mo23468C().mo23450a(C11644i.f33222W4)) {
            return "Mobile";
        }
        if (this.f29642a.mo23468C().mo23450a(C11644i.f33206U4)) {
            return "Facebook";
        }
        return this.f29642a.mo23468C().mo23450a(C11644i.f33214V4) ? "Google" : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m47496g0() {
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", this.f29642a.mo23468C().mo23459f(C11644i.f33443w5));
        C5882b.m25774a(this.f29642a).getLastAnnouncementRating(this.f29642a.mo23476G(), hashMap).enqueue(new C10208m());
    }

    /* renamed from: h0 */
    private String m47498h0() {
        String str = "android.permission.ACCESS_FINE_LOCATION";
        String str2 = "android.permission.READ_PHONE_STATE";
        if (this.f29642a.mo23663u(str) != 0 && this.f29642a.mo23663u(str2) != 0) {
            return getResources().getString(C10232R.string.lbl_location_read_phone_permission_dailog);
        }
        if (this.f29642a.mo23663u(str) != 0) {
            return getResources().getString(C10232R.string.lbl_location_permission_dailog);
        }
        if (this.f29642a.mo23663u(str2) != 0) {
            return getResources().getString(C10232R.string.lbl_read_phone_permission_dialog);
        }
        return getResources().getString(C10232R.string.lbl_location_read_phone_permission_dailog);
    }

    /* renamed from: i0 */
    public static StaticLabelBean m47500i0() {
        return f27253p1;
    }

    /* renamed from: j0 */
    private void m47503j0() {
        if (!isFinishing() && this.f29642a.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("language", this.f29642a.mo23645o());
            C11687c.m52645a(this.f29642a).getStaticLabels(hashMap).enqueue(new C10216u());
        }
    }

    /* renamed from: k0 */
    private void m47506k0() {
        if (!this.f27292x0) {
            this.f27292x0 = true;
            m47444X();
            Handler handler = this.f27280a1;
            if (handler != null) {
                handler.removeCallbacks(this.f27281b1);
            }
            this.f27272S0 = (ImageView) findViewById(C10232R.C10236id.ivDummy);
            this.f27275V0 = findViewById(C10232R.C10236id.vbottomShadow);
            if (this.f29642a.mo23663u("android.permission.ACCESS_FINE_LOCATION") == 0) {
                m47486e(false);
                if (C11644i.f33453y) {
                    this.f29642a.mo23581b(false);
                }
                f27246i1 = (AHBottomNavigation) findViewById(C10232R.C10236id.bottom_navigation);
                try {
                    f27246i1.mo11515i();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.f27286r0 = (AHBottomNavigationViewPager) findViewById(C10232R.C10236id.view_pager);
                this.f27286r0.setOffscreenPageLimit(4);
                f27244g1 = new C10829h(getSupportFragmentManager(), this.f27279Z0);
                this.f27286r0.setAdapter(f27244g1);
                this.f27268O0 = (ViewGroup) findViewById(C10232R.C10236id.llContainerMain);
                this.f27268O0.getViewTreeObserver().addOnGlobalLayoutListener(this.f27282c1);
                m47533x0();
                C2909b bVar = new C2909b((int) C10232R.string.bottom_menu_stores, (int) C10232R.C10235drawable.menu_stores, (int) C10232R.C10234color.white);
                C2909b bVar2 = new C2909b((int) C10232R.string.bottom_menu_orders, (int) C10232R.C10235drawable.menu_orders, (int) C10232R.C10234color.white);
                C2909b bVar3 = new C2909b((int) C10232R.string.bottom_menu_updates, (int) C10232R.C10235drawable.menu_updates, (int) C10232R.C10234color.White);
                C2909b bVar4 = new C2909b((int) C10232R.string.bottom_menu_courier, (int) C10232R.C10235drawable.menu_courier, (int) C10232R.C10234color.White);
                C2909b bVar5 = new C2909b((int) C10232R.string.bottom_menu_Me, (int) C10232R.C10235drawable.menu_me, (int) C10232R.C10234color.White);
                f27246i1.mo11485a(bVar);
                f27246i1.mo11485a(bVar2);
                f27246i1.mo11485a(bVar3);
                if (this.f27279Z0) {
                    f27246i1.mo11485a(bVar4);
                }
                f27246i1.mo11485a(bVar5);
                if (this.f29642a.mo23501W()) {
                    mo36530m(this.f29642a.mo23468C().mo23459f(C11644i.f33395q5));
                }
                this.f27275V0.setVisibility(0);
                if (C0962e0.m5515h0(findViewById(C10232R.C10236id.llContainerMain))) {
                    f27246i1.mo11484a(-1, false);
                    f27246i1.mo11484a(0, false);
                }
                boolean X = this.f29642a.mo23502X();
                String str = C11644i.f33199T5;
                if (X && this.f29642a.mo23585b0()) {
                    m47445Y();
                    if (getIntent().hasExtra(str) && getIntent().getStringExtra(str).equalsIgnoreCase(getString(C10232R.string.lbl_frg_notification))) {
                        f27246i1.mo11484a(2, false);
                        m47519q0();
                    } else if (!getIntent().hasExtra(str) || !getIntent().getStringExtra(str).equalsIgnoreCase(getString(C10232R.string.lbl_push_notification))) {
                        m47521r0();
                    } else {
                        if (m47464b(getIntent().getExtras()).booleanValue()) {
                            f27246i1.mo11484a(0, false);
                            m47521r0();
                        } else if (m47453a(getIntent().getExtras()).booleanValue()) {
                            f27246i1.mo11484a(3, false);
                            m47513n0();
                        } else {
                            f27246i1.mo11484a(1, false);
                            m47517p0();
                        }
                        C11644i.f33144M6 = false;
                    }
                } else if (getIntent().hasExtra(str) && getIntent().getStringExtra(str).equalsIgnoreCase(getString(C10232R.string.lbl_frg_notification))) {
                    m47519q0();
                } else if (!getIntent().hasExtra(str) || !getIntent().getStringExtra(str).equalsIgnoreCase(getString(C10232R.string.lbl_push_notification))) {
                    m47521r0();
                } else {
                    C11644i.f33144M6 = false;
                    m47517p0();
                }
                f27246i1.setOnTabSelectedListener(new C10193a());
                f27246i1.setOnNavigationPositionListener(new C10195b());
                if (!this.f29642a.mo23468C().mo23450a(C11644i.f33338j7)) {
                    m47503j0();
                }
            }
            C11584e eVar = this.f27269P0;
            if (eVar != null) {
                eVar.mo39759f();
            }
            m47441U();
            m47471b0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m47508l0() {
        m47444X();
    }

    /* renamed from: m0 */
    private boolean m47510m0() {
        if (this.f27271R0 == null) {
            return false;
        }
        XmppDetails I = this.f29642a.mo23480I();
        if (I == null || !I.getDomain().equalsIgnoreCase(this.f27271R0.getXmppDetails().getDomain()) || !I.getHost().equalsIgnoreCase(this.f27271R0.getXmppDetails().getHost()) || !I.getPort().equalsIgnoreCase(this.f27271R0.getXmppDetails().getPort()) || I.isTls() != this.f27271R0.getXmppDetails().isTls()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public void m47513n0() {
        if (this.f29642a.mo23502X()) {
            this.f27286r0.setCurrentItem(this.f27277X0, false);
            if (VERSION.SDK_INT >= 23) {
                C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
                C11730j.m52801b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m47515o0() {
        if (!m47512n(getString(C10232R.string.lbl_btab_me)) && this.f29642a.mo23502X()) {
            this.f27286r0.setCurrentItem(this.f27278Y0, false);
            if (VERSION.SDK_INT >= 23) {
                C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
                C11730j.m52801b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m47517p0() {
        if (!m47512n(getString(C10232R.string.lbl_btab_order)) && this.f29642a.mo23502X()) {
            this.f27286r0.setCurrentItem(1, false);
            if (VERSION.SDK_INT >= 23) {
                C11730j.m52796a(this);
                C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.colorPrimaryDark));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m47519q0() {
        if (!m47512n(getString(C10232R.string.lbl_btab_notification)) && this.f29642a.mo23502X()) {
            this.f27286r0.setCurrentItem(2, false);
            if (VERSION.SDK_INT >= 23) {
                C11730j.m52796a(this);
                C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.colorPrimaryDark));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m47521r0() {
        if (!m47512n(getString(C10232R.string.lbl_btab_shops)) && this.f29642a.mo23502X()) {
            this.f27286r0.setCurrentItem(0, false);
            if (VERSION.SDK_INT >= 23) {
                C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
                C11730j.m52801b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public void m47523s0() {
        if (f27246i1 != null) {
            if (this.f29642a.mo23502X()) {
                f27246i1.setCurrentItem(1);
            }
            this.f29642a.mo23473E(C11644i.f33205U3);
        }
    }

    /* renamed from: t0 */
    private void m47525t0() {
        if (this.f29642a.mo23502X()) {
            LocationData locationData = new LocationData(this.f29642a.mo23468C().mo23459f(C11644i.f33443w5), this.f29642a.mo23468C().mo23459f(C11644i.f33303g), this.f29642a.mo23468C().mo23459f(C11644i.f33312h), String.valueOf(System.currentTimeMillis()), this.f29642a.mo23476G());
            C5882b.m25775b().pushMessage(locationData).enqueue(new C10209n());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public void m47527u0() {
        int c = getSupportFragmentManager().mo6238c();
        if (c > 0) {
            for (int i = 0; i < c; i++) {
                this.f27255B0.mo6225a(getSupportFragmentManager().mo6233b(i).getId(), 1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m47529v0() {
        this.f27291w0.mo40036a(C11644i.f33339k, (C11673d) new C10199d());
    }

    /* renamed from: w0 */
    private void m47531w0() {
        m47483d0();
        try {
            Notification a = new C0779e(this, getResources().getString(C10232R.string.notification_channel_id)).mo4229b(C0770p.f3526h0).mo4234c((CharSequence) getResources().getString(C10232R.string.app_name)).mo4228b((CharSequence) getResources().getString(C10232R.string.msg_keep_alive_notification)).mo4253g((int) C10232R.C10235drawable.icon_push_small).mo4251f(true).mo4206a(BitmapFactory.decodeResource(getResources(), C10232R.mipmap.app_icon)).mo4217a(true).mo4235c(getResources().getString(C10232R.string.notification_channel_id)).mo4204a(PendingIntent.getActivity(this, (int) System.currentTimeMillis(), new Intent(this, SplashActivity.class), MQEncoder.CARRY_MASK)).mo4249f(1).mo4207a(this.f29642a.mo23660t()).mo4196a();
            this.f27267N0 = (NotificationManager) getSystemService("notification");
            if (this.f27267N0 != null) {
                this.f27267N0.notify(300, a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: x0 */
    private void m47533x0() {
        try {
            f27246i1.mo11481a((float) this.f29642a.mo23601d(12), (float) this.f29642a.mo23601d(12));
            f27246i1.setINDEX_PROFILE(this.f27278Y0);
            f27246i1.setBehaviorTranslationEnabled(true);
            f27246i1.setTitleTypeface(this.f29642a.mo23676z());
            f27246i1.setAccentColor(C10232R.C10234color.bg_drop_off);
            f27246i1.setInactiveColor(C10232R.C10234color.search_text_gray_lite);
            f27246i1.mo11483a(C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.sky_blue_color), C0841b.m4915a(getApplicationContext(), (int) C10232R.C10234color.search_text_gray_lite));
            f27246i1.setSelectedBackgroundVisible(true);
            f27246i1.setForceTint(true);
            f27246i1.setDefaultBackgroundResource(C10232R.C10235drawable.selector_bottombar_menu);
            f27246i1.setTitleState(TitleState.ALWAYS_SHOW);
            f27246i1.setColored(true);
            f27246i1.setBehaviorTranslationEnabled(true);
            if (this.f29642a.mo23496R()) {
                f27246i1.setLayoutDirection(1);
                f27246i1.setTextDirection(4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y0 */
    private void m47535y0() {
        this.f27279Z0 = this.f29642a.mo23499U();
        if (this.f27279Z0) {
            this.f27278Y0 = 4;
            this.f27277X0 = 3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m47537z0() {
        try {
            int J = this.f29642a.mo23482J();
            if (J != C11644i.f33200T6) {
                C11644i.f33200T6 = J;
                if (J == 2) {
                    C11644i.f33208U6 = 102;
                } else if (J == 3) {
                    C11644i.f33208U6 = 100;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: N */
    public void mo36519N() {
        if (C0841b.m4916a((Context) this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            C11584e eVar = this.f27269P0;
            if (eVar != null) {
                eVar.mo39752b();
            } else {
                Location location = new Location("current");
                location.setLatitude(this.f29642a.mo23648p().latitude);
                location.setLongitude(this.f29642a.mo23648p().longitude);
                mo36525a(location);
            }
        }
    }

    /* renamed from: O */
    public boolean mo36520O() {
        try {
            if (VERSION.SDK_INT < 23) {
                return !Secure.getString(getApplicationContext().getContentResolver(), "mock_location").equals(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            if (((AppOpsManager) getApplicationContext().getSystemService("appops")).checkOp("android:mock_location", Process.myUid(), C10830i.f29734b) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: P */
    public void mo36521P() {
        Intent intent = new Intent(this, MyCouponsActivity.class);
        intent.putExtra(C11644i.f33067D1, C11644i.f33384p2);
        startActivity(intent);
    }

    /* renamed from: Q */
    public void mo36522Q() {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setMaxLines(Integer.MAX_VALUE);
            textView2.setEllipsize(null);
            StringBuilder sb = new StringBuilder();
            sb.append(m47498h0());
            sb.append("");
            sb.append(getResources().getString(C10232R.string.lbl_navigate_to_setting));
            textView2.setText(sb.toString());
            textView.setText(C10232R.string.lbl_settings);
            textView.setOnClickListener(new C10210o(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: R */
    public void mo36523R() {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            dialog.setCancelable(false);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.app_name));
            textView2.setText(m47498h0());
            textView2.setMaxLines(Integer.MAX_VALUE);
            textView2.setEllipsize(null);
            textView.setOnClickListener(new C10211p(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: S */
    public void mo36524S() {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_ask_for_rating);
        dialog.setCancelable(false);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtLater)).setOnClickListener(new C10217v(dialog));
        ((TextView) dialog.findViewById(C10232R.C10236id.txtNoThanks)).setOnClickListener(new C10218w(dialog));
        ((TextView) dialog.findViewById(C10232R.C10236id.txtRateNow)).setOnClickListener(new C10219x(dialog));
        dialog.setOnKeyListener(new C10220y(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: b */
    public void mo36527b(Uri uri) {
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C11584e eVar = this.f27269P0;
        if (eVar != null) {
            eVar.mo39749a(i, i2, intent);
        }
        if (i2 == -1) {
            if (i != 99) {
                if (i != 111) {
                    if (i == 556) {
                        m47444X();
                    } else if (i == 1009) {
                        LastAnnouncementRating lastAnnouncementRating = this.f27264K0;
                        if (!(lastAnnouncementRating == null || lastAnnouncementRating.getOrder().getId() == null)) {
                            m47435B0();
                        }
                    } else if (i == 1012) {
                        if (C5854b.f16924f.equalsIgnoreCase(C11644i.f33057C)) {
                            mo36521P();
                        }
                    } else if (i != 1021 && i == 1022) {
                        f27246i1.mo11484a(1, false);
                        this.f29642a.mo23473E(C11644i.f33181R3);
                        this.f29642a.mo23473E(C11644i.f33205U3);
                        this.f29642a.mo23473E(C11644i.f33189S3);
                        this.f29642a.mo23473E(C11644i.f33197T3);
                    }
                } else if (this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
                    m47508l0();
                }
            } else if (this.f29642a.mo23502X() && this.f29642a.mo23500V()) {
                m47508l0();
            }
        }
        if (i2 == 0) {
            if (i == 556) {
                m47444X();
            }
            if (i != 222) {
                return;
            }
            if (this.f29642a.mo23502X()) {
                new Handler().postDelayed(new C10197c(), 1000);
            } else {
                C5880q.m25751b("gps is not enable");
            }
        }
    }

    public void onBackPressed() {
        try {
            if (!m47512n(getString(C10232R.string.lbl_frg_search))) {
                getSupportFragmentManager();
                int c = getSupportFragmentManager().mo6238c();
                StringBuilder sb = new StringBuilder();
                sb.append("onBackPressed");
                sb.append(c);
                C5880q.m25753d(sb.toString());
                if (this.f27286r0.getCurrentItem() != 0) {
                    f27246i1.setCurrentItem(0);
                } else {
                    mo36528k(getString(C10232R.string.msg_ask_to_exit));
                }
            } else {
                if (this.f27258E0.getVisibility() == 0) {
                    this.f27258E0.setVisibility(8);
                }
                getSupportFragmentManager().mo6246k();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_home);
        StrictMode.setThreadPolicy(new Builder().permitAll().build());
        this.f29642a.mo23638l0();
        if (this.f29642a.mo23584b(LocationService.class)) {
            stopService(new Intent(this, LocationService.class));
        }
        C11644i.f33216V6 = false;
        f27252o1 = new C5887x(this);
        this.f27257D0 = (AppSingleton) getApplicationContext();
        this.f27265L0 = FirebaseAnalytics.getInstance(this);
        C11644i.f33251a1 = true;
        f27251n1 = new C5887x(this);
        this.f27291w0 = new C11669t(this);
        this.f27255B0 = getSupportFragmentManager();
        this.f29642a.mo23553a((C11056p) this);
        this.f27258E0 = (FrameLayout) findViewById(C10232R.C10236id.contentContainer);
        this.f27258E0.setVisibility(8);
        OrderSentActivity.m48878a((C11071t) this);
        m47465b(getIntent());
        if (isTaskRoot() || !getIntent().hasCategory("android.intent.category.LAUNCHER") || getIntent().getAction() == null || !getIntent().getAction().equals("android.intent.action.MAIN")) {
            C5887x.f17106r = null;
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33109I3));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33281d4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33344k4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33362m4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33370n4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33434v4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33450x4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33118J4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33046A4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33272c4));
            C2128a.m11089a((Context) this).mo9218a(this.f27283d1, new IntentFilter(C11644i.f33213V3));
            registerReceiver(this.f27285f1, new IntentFilter("android.location.PROVIDERS_CHANGED"));
            C2128a.m11089a((Context) this).mo9218a(this.f27284e1, new IntentFilter(C11644i.f33126K4));
            m47535y0();
            this.f29642a.mo23635k0();
            if (this.f29642a.mo23502X()) {
                m47508l0();
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        m47437C0();
        C11644i.f33251a1 = false;
        this.f27292x0 = false;
        C11644i.f33113J = true;
        this.f29642a.mo23539a(this.f27283d1);
        unregisterReceiver(this.f27285f1);
        C11694e.INSTANCE.mo40209e();
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            try {
                if (this.f27288t0 == null) {
                    this.f27288t0 = location;
                }
                C5881v C = this.f29642a.mo23468C();
                String str = C11644i.f33321i;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(location.getAccuracy());
                C.mo23449a(str, sb.toString());
                C2128a.m11089a((Context) this).mo9219a(new Intent(C11644i.f33254a4));
                double b = (double) C5887x.m25805b(this.f27288t0.getLatitude(), this.f27288t0.getLongitude(), location.getLatitude(), location.getLongitude());
                if (C11644i.f33185S && b > ((double) C11644i.f33405s)) {
                    this.f27288t0 = location;
                    m47489f(location);
                }
                this.f29642a.mo23468C().mo23449a(C11644i.f33303g, this.f29642a.mo23523a(location));
                this.f29642a.mo23468C().mo23449a(C11644i.f33312h, this.f29642a.mo23570b(location));
                if (m47475c(location)) {
                    this.f29642a.mo23473E(C11644i.f33290e4);
                    if (this.f29642a.mo23620g()) {
                        m47506k0();
                        m47525t0();
                        m47474c(false);
                    } else {
                        C11644i.f33177R = true;
                    }
                    f27245h1 = true;
                    return;
                }
                f27245h1 = false;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m47465b(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        try {
            C11644i.f33251a1 = true;
            C11644i.f33260b1 = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        try {
            if (this.f27291w0 != null) {
                this.f27291w0.onRequestPermissionsResult(i, strArr, iArr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            C11644i.f33251a1 = true;
            C11644i.f33260b1 = true;
            String g = this.f29642a.mo23468C().mo23460g("language");
            if (!Locale.getDefault().getLanguage().equalsIgnoreCase(g)) {
                this.f29642a.mo23477G(g);
            }
            if (this.f29642a.mo23663u("android.permission.ACCESS_FINE_LOCATION") == 0 && this.f29642a.mo23663u("android.permission.READ_PHONE_STATE") == 0) {
                m47508l0();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    /* renamed from: s */
    public void mo36531s() {
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m47501j(int i) {
        if (i == 0) {
            C11644i.f33269c1 = false;
            C11644i.f33242Z0 = false;
        } else if (i == 1) {
            C11644i.f33269c1 = true;
            C11644i.f33242Z0 = false;
        } else if (i == 2) {
            C11644i.f33269c1 = false;
            C11644i.f33242Z0 = true;
        } else if (i == 3) {
            C11644i.f33269c1 = false;
            C11644i.f33242Z0 = false;
        }
    }

    /* renamed from: n */
    private boolean m47512n(String str) {
        Fragment a = getSupportFragmentManager().mo6221a((int) C10232R.C10236id.contentContainer);
        return str.equalsIgnoreCase(getString(C10232R.string.lbl_btab_shops)) ? a != null && (a instanceof C11540g) : str.equalsIgnoreCase(getString(C10232R.string.lbl_btab_order)) ? a != null && (a instanceof C11035n) : str.equalsIgnoreCase(getString(C10232R.string.lbl_btab_me)) ? a != null && (a instanceof C10908g) : str.equalsIgnoreCase(getString(C10232R.string.lbl_btab_courier)) ? a != null && (a instanceof C11190d) : str.equalsIgnoreCase(getString(C10232R.string.lbl_btab_notification)) && a != null && (a instanceof C11741a);
    }

    /* renamed from: A */
    public void mo36518A() {
        m47523s0();
    }

    /* renamed from: k */
    public void mo36528k(String str) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getString(C10232R.string.app_name));
        textView.setText(str);
        textView2.setOnClickListener(new C10194a0(dialog));
        textView3.setOnClickListener(new C10196b0(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: l */
    public void mo36529l(String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).getCourierWeblinkToken(this.f29642a.mo23476G(), hashMap).enqueue(new C10215t(str));
        }
    }

    /* renamed from: m */
    public void mo36530m(String str) {
        C2232l.m11649c(getApplicationContext()).mo9515a(str).mo9441j().m11415e((int) C10232R.C10235drawable.icon_mo_ac_small_user).mo9458b(new C10202g(this.f27272S0));
    }

    /* renamed from: t */
    public void mo36532t() {
        this.f29642a.mo23489M("Not getting location, please try again");
    }

    /* renamed from: c */
    private boolean m47475c(Location location) {
        if (this.f27287s0 == null) {
            this.f27287s0 = location;
        }
        if (((double) C5887x.m25805b(this.f27287s0.getLatitude(), this.f27287s0.getLongitude(), location.getLatitude(), location.getLongitude())) <= 250.0d) {
            return false;
        }
        this.f27287s0 = location;
        return true;
    }

    /* renamed from: d */
    private boolean m47481d(Location location) {
        if (this.f27289u0 == null) {
            this.f27289u0 = location;
        }
        if (((double) C5887x.m25805b(this.f27289u0.getLatitude(), this.f27289u0.getLongitude(), location.getLatitude(), location.getLongitude())) <= 500.0d) {
            return false;
        }
        this.f27289u0 = location;
        return true;
    }

    /* renamed from: e */
    public static boolean m47487e(Location location) {
        return VERSION.SDK_INT >= 18 && location != null && location.isFromMockProvider();
    }

    /* renamed from: f */
    private void m47489f(Location location) {
        Intent intent = new Intent(C11644i.f33335j4);
        intent.putExtra("latitude", location.getLatitude());
        intent.putExtra("longitude", location.getLongitude());
        C2128a.m11089a((Context) this).mo9219a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m47486e(boolean z) {
        if (this.f27274U0 == null) {
            this.f27274U0 = (LinearLayout) findViewById(C10232R.C10236id.llFetchLocationPb);
        }
        this.f27274U0.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    private void m47465b(Intent intent) {
        String str = C11644i.f33199T5;
        try {
            if (intent.hasExtra(str) && intent.getStringExtra(str).equalsIgnoreCase(getString(C10232R.string.lbl_push_notification))) {
                String stringExtra = intent.getStringExtra(C11644i.f33359m1);
                char c = 65535;
                switch (stringExtra.hashCode()) {
                    case -1403061077:
                        if (stringExtra.equals("complaint")) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1354814997:
                        if (stringExtra.equals(C11644i.f33265b6)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3052376:
                        if (stringExtra.equals(C11644i.f33274c6)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3529462:
                        if (stringExtra.equals(C11644i.f33247Z5)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 106006350:
                        if (stringExtra.equals(C11644i.f33239Y5)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 156781895:
                        if (stringExtra.equals(C11644i.f33301f6)) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1984153269:
                        if (stringExtra.equals("service")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        Intent intent2 = new Intent(this, ChatActivityNew.class);
                        intent2.putExtra(str, getString(C10232R.string.lbl_push_notification));
                        intent2.putExtra(C11644i.f33314h1, intent.getStringExtra(C11644i.f33314h1));
                        intent2.addFlags(805306368);
                        startActivity(intent2);
                        return;
                    case 1:
                        f27246i1.setCurrentItem(3);
                        m47513n0();
                        return;
                    case 2:
                        f27246i1.setCurrentItem(3);
                        m47513n0();
                        return;
                    case 3:
                        new Handler().postDelayed(new C10221z(intent), 100);
                        return;
                    case 4:
                        Intent intent3 = new Intent(this, ShopDetailActivity.class);
                        intent3.putExtra(str, getString(C10232R.string.lbl_frg_notification_common));
                        intent3.putExtra(C11644i.f33367n1, intent.getStringExtra(C11644i.f33367n1));
                        intent3.addFlags(805306368);
                        startActivity(intent3);
                        return;
                    case 5:
                        if (intent.getStringExtra(C11644i.f33279d2).equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                            mo36529l(intent.getStringExtra(C11644i.f33051B1));
                            return;
                        }
                        Intent intent4 = new Intent(this, ComplaintDetailActivity.class);
                        intent4.putExtra(C11644i.f33439w1, intent.getStringExtra(C11644i.f33051B1));
                        startActivity(intent4);
                        return;
                    case 6:
                        m47454a(intent);
                        return;
                    default:
                        return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m47474c(boolean z) {
        C5887x xVar = this.f29642a;
        if (xVar != null && !xVar.mo23504Z().booleanValue()) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", this.f29642a.mo23468C().mo23459f("user_id"));
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(C3868i.f12248b);
            sb.append(Build.MODEL);
            hashMap.put("vDeviceVersion", String.valueOf(sb.toString()));
            String str = "vOSVersion";
            hashMap.put(str, String.valueOf(VERSION.SDK_INT));
            hashMap.put(str, String.valueOf(VERSION.SDK_INT));
            hashMap.put("vPlatform", C11644i.f33264b5);
            hashMap.put("vAppVersion", String.valueOf(this.f29642a.mo23633k()));
            C5881v C = this.f29642a.mo23468C();
            String str2 = C11644i.f33419t5;
            hashMap.put("vDeviceToken", C.mo23459f(str2) != null ? this.f29642a.mo23468C().mo23459f(str2) : C11644i.f33273c5);
            hashMap.put("vLanguage", this.f29642a.mo23478H());
            StringBuilder sb2 = new StringBuilder();
            String str3 = "";
            sb2.append(str3);
            sb2.append(C5887x.m25816e((Context) this));
            hashMap.put("inst_package_name", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(C5887x.m25813d((Context) this));
            hashMap.put("app_sign", sb3.toString());
            C5881v C2 = this.f29642a.mo23468C();
            String str4 = C11644i.f33303g;
            if (C2.mo23459f(str4) != null) {
                hashMap.put("latitude", this.f29642a.mo23468C().mo23459f(str4));
                hashMap.put("longitude", this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
            }
            hashMap.put("device_id", this.f29642a.mo23669w());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("UpdateDeviceInfo()==>");
            sb4.append(hashMap);
            C5880q.m25751b(sb4.toString());
            C11687c.m52645a(this.f29642a).UpdateDeviceInfo(hashMap).enqueue(new C10200e(z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m47478d(Bundle bundle) {
        if (bundle.getString(C11644i.f33359m1).equalsIgnoreCase(C11644i.f33247Z5) || bundle.getString(C11644i.f33359m1).equalsIgnoreCase("service")) {
            this.f29642a.mo23473E(C11644i.f33150N4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m47492f(boolean z) {
        if (z) {
            this.f29642a.mo23671w0();
        }
    }

    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36511f(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -502838835: goto L_0x0029;
                case 466096198: goto L_0x001f;
                case 605598949: goto L_0x0015;
                case 740520869: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "AppRateNReview"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0033
            r5 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "StoreRateNReview"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0033
            r5 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "RateNReview"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0033
            r5 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "updateDeviceInfo"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0033
            r5 = 0
            goto L_0x0034
        L_0x0033:
            r5 = -1
        L_0x0034:
            if (r5 == 0) goto L_0x004a
            if (r5 == r3) goto L_0x0045
            if (r5 == r2) goto L_0x0041
            if (r5 == r1) goto L_0x003d
            goto L_0x0052
        L_0x003d:
            r4.mo36524S()
            goto L_0x0052
        L_0x0041:
            r4.mo38431L()
            goto L_0x0052
        L_0x0045:
            r5 = 0
            r4.mo38436i(r5)
            goto L_0x0052
        L_0x004a:
            com.mrsool.HomeActivity$s r5 = new com.mrsool.HomeActivity$s
            r5.<init>()
            r4.runOnUiThread(r5)
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.HomeActivity.mo36511f(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m47480d(boolean z) {
        String str = "Connected xmpp is :";
        String str2 = "|";
        if (this.f27271R0 != null) {
            if (z) {
                C11694e.INSTANCE.mo40209e();
            }
            C11694e.SERVICE = this.f27271R0.getXmppDetails().getDomain();
            C11694e.HOST = this.f27271R0.getXmppDetails().getHost();
            C11694e.PORT = Integer.parseInt(TextUtils.isEmpty(this.f27271R0.getXmppDetails().getPort()) ? C11644i.f33340k0 : this.f27271R0.getXmppDetails().getPort());
            C11694e.IS_TLS = Boolean.valueOf(this.f27271R0.getXmppDetails().isTls());
            C11644i.f33322i0 = C11694e.SERVICE;
            C11644i.f33331j0 = C11694e.HOST;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11694e.PORT);
            C11644i.f33340k0 = sb.toString();
            C11644i.f33349l0 = C11694e.IS_TLS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(C11694e.SERVICE);
            sb2.append(str2);
            sb2.append(C11694e.HOST);
            sb2.append(str2);
            sb2.append(C11694e.PORT);
            sb2.append(str2);
            sb2.append(C11694e.IS_TLS);
            C5880q.m25751b(sb2.toString());
            if (!C11694e.INSTANCE.mo40213h()) {
                this.f29642a.mo23626i();
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(C11694e.SERVICE);
        sb3.append(str2);
        sb3.append(C11694e.HOST);
        sb3.append(str2);
        sb3.append(C11694e.PORT);
        sb3.append(str2);
        sb3.append(C11694e.IS_TLS);
        C5880q.m25751b(sb3.toString());
    }

    /* renamed from: a */
    public static void m47459a(C10943o oVar) {
        f27248k1 = oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m47454a(Intent intent) {
        if (!C11644i.f33129L) {
            Intent intent2 = new Intent(this, AnnouncementActivity.class);
            String str = C11644i.f33463z1;
            intent2.putExtra(str, intent.getStringExtra(str));
            String str2 = C11644i.f33391q1;
            intent2.putExtra(str2, intent.getStringExtra(str2));
            String str3 = C11644i.f33243Z1;
            intent2.putExtra(str3, intent.getStringExtra(str3));
            String str4 = C11644i.f33367n1;
            intent2.putExtra(str4, intent.getStringExtra(str4));
            intent2.putExtra("shouldUpgrade", this.f27260G0);
            intent2.putExtra(C11644i.f33199T5, "push");
            startActivity(intent2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m47505k(int i) {
        new Handler().postDelayed(new C10207l(), 100);
    }

    /* renamed from: a */
    private Boolean m47453a(Bundle bundle) {
        boolean z = false;
        if (bundle.containsKey(C11644i.f33359m1)) {
            String string = bundle.getString(C11644i.f33359m1);
            if (string != null) {
                if (string.equalsIgnoreCase(C11644i.f33247Z5) || string.equalsIgnoreCase("service")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: a */
    public static void m47461a(C11560d dVar) {
        f27247j1 = dVar;
    }

    /* renamed from: a */
    public static void m47460a(C11559c cVar) {
        f27249l1 = cVar;
    }

    @TargetApi(23)
    /* renamed from: a */
    private void m47462a(String str, int i) {
        if (shouldShowRequestPermissionRationale(str)) {
            requestPermissions(new String[]{str}, i);
            return;
        }
        requestPermissions(new String[]{str}, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m47473c(Bundle bundle) {
        if (!bundle.containsKey(C11644i.f33124K2)) {
            return;
        }
        if (bundle.getBoolean(C11644i.f33124K2)) {
            m47441U();
        } else {
            m47437C0();
        }
    }

    /* renamed from: a */
    private Order m47449a(LastUnRatedOrder lastUnRatedOrder) {
        Order order = new Order();
        order.setiOrderId(lastUnRatedOrder.getId());
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(lastUnRatedOrder.getCourier_id());
        order.setiCourierId(sb.toString());
        order.setvCourierName(lastUnRatedOrder.getCourier_name());
        order.setvCourierPic(lastUnRatedOrder.getCourier_pic());
        order.setfCourierRatings(lastUnRatedOrder.getCourier_ratings());
        order.setTxDescription(lastUnRatedOrder.getDescription());
        order.setvShopName(lastUnRatedOrder.getShop_name());
        order.setiBuyerId(this.f29642a.mo23476G());
        order.setvShopId(str);
        C5887x xVar = this.f29642a;
        order.setvBuyerName(xVar.mo23646o(xVar.mo23468C().mo23459f("user_name")));
        return order;
    }

    /* renamed from: b */
    private Boolean m47464b(Bundle bundle) {
        if (bundle.containsKey(C11644i.f33359m1)) {
            String string = bundle.getString(C11644i.f33359m1);
            if (string != null) {
                return Boolean.valueOf(string.equalsIgnoreCase(C11644i.f33301f6));
            }
        }
        return Boolean.valueOf(false);
    }

    /* renamed from: b */
    public static void m47469b(C10943o oVar) {
        f27248k1 = oVar;
    }

    /* renamed from: b */
    public void mo36526b(Location location) {
        if (location != null) {
            if (this.f27287s0 == null) {
                this.f27287s0 = location;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("CHAT_MESSAGE onLocationUpdate(");
            sb.append(location.getLatitude());
            sb.append("|");
            sb.append(location.getLongitude());
            sb.append(")");
            C5880q.m25751b(sb.toString());
            this.f29642a.mo23468C().mo23449a(C11644i.f33303g, this.f29642a.mo23523a(location));
            this.f29642a.mo23468C().mo23449a(C11644i.f33312h, this.f29642a.mo23570b(location));
            this.f29642a.mo23570b(location);
            m47506k0();
            onLocationChanged(location);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Location is :");
        sb2.append(location);
        C5880q.m25751b(sb2.toString());
    }

    /* renamed from: a */
    public void mo36525a(Location location) {
        if (location != null) {
            C5881v C = this.f29642a.mo23468C();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(location.getLatitude());
            C.mo23449a(C11644i.f33303g, sb.toString());
            C5881v C2 = this.f29642a.mo23468C();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(location.getLongitude());
            C2.mo23449a(C11644i.f33312h, sb2.toString());
            C10943o oVar = f27248k1;
            if (oVar != null) {
                oVar.mo37677v();
            }
        }
    }
}
