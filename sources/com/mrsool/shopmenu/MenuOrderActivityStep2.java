package com.mrsool.shopmenu;

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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0841b;
import androidx.core.widget.C1113f;
import androidx.fragment.app.C1382h;
import androidx.recyclerview.widget.RecyclerView;
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
import com.mrsool.bean.PostOrder;
import com.mrsool.bean.SavedBookmarkedBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ShopDetails;
import com.mrsool.createorder.C10641n;
import com.mrsool.createorder.OrderSentActivity;
import com.mrsool.createorder.PicOrderLocationActivityRevisedOrder;
import com.mrsool.customeview.CustomeTextViewRobotoRegular;
import com.mrsool.customeview.WheelViewNew;
import com.mrsool.customeview.WheelViewNew.C10750e;
import com.mrsool.customeview.WheelViewNew.C10751f;
import com.mrsool.newBean.BranchBean;
import com.mrsool.newBean.UploadImageBean;
import com.mrsool.order.C11056p;
import com.mrsool.p417t.C11547a;
import com.mrsool.p417t.C11551e;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11728i;
import com.mrsool.p423v.C11738n;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11600b;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p421c.C11614c;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p212io.branch.referral.C6009d;
import p438de.hdodenhof.circleimageview.CircleImageView;
import p468g.C13817d0;
import p468g.C13872x;
import p468g.C13873y.C13875b;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c;
import smartdevelop.p561ir.eram.showcaseviewlib.C15792c.C15800h;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15801a;
import smartdevelop.p561ir.eram.showcaseviewlib.p562d.C15802b;

public class MenuOrderActivityStep2 extends C11412t implements OnClickListener, C11377m, C11056p {

    /* renamed from: A0 */
    private int f31513A0;

    /* renamed from: A1 */
    private TextView f31514A1;

    /* renamed from: B0 */
    private int f31515B0;

    /* renamed from: B1 */
    private TextView f31516B1;

    /* renamed from: C0 */
    private final int f31517C0;

    /* renamed from: C1 */
    private ImageView f31518C1;

    /* renamed from: D0 */
    private final int f31519D0;

    /* renamed from: D1 */
    private ImageView f31520D1;

    /* renamed from: E0 */
    private final int f31521E0;

    /* renamed from: E1 */
    private ImageView f31522E1;

    /* renamed from: F0 */
    private String f31523F0;

    /* renamed from: F1 */
    private ImageView f31524F1;

    /* renamed from: G0 */
    private String f31525G0;

    /* renamed from: G1 */
    private ImageView f31526G1;
    /* access modifiers changed from: private */

    /* renamed from: H0 */
    public int f31527H0;

    /* renamed from: H1 */
    private ImageView f31528H1;
    /* access modifiers changed from: private */

    /* renamed from: I0 */
    public int f31529I0;

    /* renamed from: I1 */
    private TextView f31530I1;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public int f31531J0;

    /* renamed from: J1 */
    public C15792c f31532J1;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public String f31533K0;

    /* renamed from: K1 */
    public C15792c f31534K1;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public String f31535L0;

    /* renamed from: L1 */
    private boolean f31536L1;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public String f31537M0;

    /* renamed from: M1 */
    private Handler f31538M1;

    /* renamed from: N0 */
    private float f31539N0;

    /* renamed from: N1 */
    private SpannableStringBuilder f31540N1;

    /* renamed from: O0 */
    private float f31541O0;

    /* renamed from: O1 */
    private boolean f31542O1;

    /* renamed from: P0 */
    private float f31543P0;

    /* renamed from: P1 */
    private String f31544P1;

    /* renamed from: Q0 */
    private Boolean f31545Q0;

    /* renamed from: Q1 */
    private String f31546Q1;

    /* renamed from: R0 */
    public BookmarkPlaceBean f31547R0;

    /* renamed from: R1 */
    private String f31548R1;

    /* renamed from: S0 */
    public BookmarkPlaceBean f31549S0;

    /* renamed from: S1 */
    boolean f31550S1;

    /* renamed from: T0 */
    public BookmarkPlaceBean f31551T0;

    /* renamed from: T1 */
    boolean f31552T1;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public List<String> f31553U0;

    /* renamed from: U1 */
    int f31554U1;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public List<String> f31555V0;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public int f31556W0;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public Dialog f31557X0;

    /* renamed from: Y0 */
    private C10641n f31558Y0;

    /* renamed from: Z0 */
    private TextView f31559Z0;

    /* renamed from: a0 */
    private final String f31560a0 = "placeNewOrder";

    /* renamed from: a1 */
    private TextView f31561a1;

    /* renamed from: b0 */
    private final String f31562b0 = "checkDiscountOptions";

    /* renamed from: b1 */
    private ImageView f31563b1;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public C11617f f31564c0;

    /* renamed from: c1 */
    private ImageView f31565c1;

    /* renamed from: d0 */
    private String f31566d0;
    /* access modifiers changed from: private */

    /* renamed from: d1 */
    public CheckDiscountBean f31567d1;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public boolean f31568e0;
    /* access modifiers changed from: private */

    /* renamed from: e1 */
    public SupportMapFragment f31569e1;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public PostOrder f31570f0;
    /* access modifiers changed from: private */

    /* renamed from: f1 */
    public GoogleMap f31571f1;

    /* renamed from: g0 */
    public String f31572g0;

    /* renamed from: g1 */
    private Marker f31573g1;

    /* renamed from: h0 */
    public String f31574h0;

    /* renamed from: h1 */
    private Marker f31575h1;

    /* renamed from: i0 */
    public String f31576i0;

    /* renamed from: i1 */
    private Marker f31577i1;

    /* renamed from: j0 */
    public String f31578j0;
    /* access modifiers changed from: private */

    /* renamed from: j1 */
    public ArrayList<Marker> f31579j1;

    /* renamed from: k0 */
    public String f31580k0;

    /* renamed from: k1 */
    private ProgressBar f31581k1;

    /* renamed from: l0 */
    public String f31582l0;
    /* access modifiers changed from: private */

    /* renamed from: l1 */
    public int f31583l1;

    /* renamed from: m0 */
    public String f31584m0;
    /* access modifiers changed from: private */

    /* renamed from: m1 */
    public int f31585m1;

    /* renamed from: n0 */
    public String f31586n0;

    /* renamed from: n1 */
    String f31587n1;

    /* renamed from: o0 */
    public String f31588o0;
    /* access modifiers changed from: private */

    /* renamed from: o1 */
    public Bitmap f31589o1;

    /* renamed from: p0 */
    public String f31590p0;

    /* renamed from: p1 */
    private ImageView f31591p1;

    /* renamed from: q0 */
    public String f31592q0;

    /* renamed from: q1 */
    private ImageView f31593q1;

    /* renamed from: r0 */
    public TextView f31594r0;

    /* renamed from: r1 */
    private TextView f31595r1;

    /* renamed from: s0 */
    public TextView f31596s0;
    /* access modifiers changed from: private */

    /* renamed from: s1 */
    public String f31597s1;

    /* renamed from: t0 */
    private LinearLayout f31598t0;

    /* renamed from: t1 */
    public int f31599t1;

    /* renamed from: u0 */
    private LinearLayout f31600u0;

    /* renamed from: u1 */
    public String f31601u1;

    /* renamed from: v0 */
    private LinearLayout f31602v0;

    /* renamed from: v1 */
    public String f31603v1;

    /* renamed from: w0 */
    private LinearLayout f31604w0;

    /* renamed from: w1 */
    public String f31605w1;

    /* renamed from: x0 */
    private LinearLayout f31606x0;

    /* renamed from: x1 */
    public boolean f31607x1;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public int f31608y0;

    /* renamed from: y1 */
    public ArrayList<UploadImageBean> f31609y1;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public int f31610z0;

    /* renamed from: z1 */
    private C11614c f31611z1;

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$a */
    class C11291a implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MaterialButton f31612a;

        C11291a(MaterialButton materialButton) {
            this.f31612a = materialButton;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f31612a.setEnabled(charSequence.length() > 2);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$b */
    class C11292b implements Callback<SavedBookmarkedBean> {

        /* renamed from: a */
        final /* synthetic */ int f31614a;

        C11292b(int i) {
            this.f31614a = i;
        }

        public void onFailure(Call<SavedBookmarkedBean> call, Throwable th) {
            C5887x xVar = MenuOrderActivityStep2.this.f29642a;
            if (xVar != null) {
                xVar.mo23492O();
            }
        }

        public void onResponse(Call<SavedBookmarkedBean> call, Response<SavedBookmarkedBean> response) {
            if (MenuOrderActivityStep2.this.f29642a != null) {
                if (!response.isSuccessful()) {
                    C5887x xVar = MenuOrderActivityStep2.this.f29642a;
                    if (xVar != null) {
                        xVar.mo23615f(response.message(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                    }
                } else if (((SavedBookmarkedBean) response.body()).getCode().intValue() <= 300) {
                    MenuOrderActivityStep2.this.f29642a.mo23491N(((SavedBookmarkedBean) response.body()).getMessage());
                    int i = this.f31614a;
                    if (i == 1) {
                        MenuOrderActivityStep2.this.f31537M0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                        menuOrderActivityStep2.f31531J0 = menuOrderActivityStep2.m51085a(menuOrderActivityStep2.f31567d1.getBookmarks().getDelivery(), MenuOrderActivityStep2.this.f31537M0);
                        MenuOrderActivityStep2.this.mo39494a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 1, false, false);
                    } else if (i == 2) {
                        MenuOrderActivityStep2.this.f31535L0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        MenuOrderActivityStep2 menuOrderActivityStep22 = MenuOrderActivityStep2.this;
                        menuOrderActivityStep22.f31529I0 = menuOrderActivityStep22.m51085a(menuOrderActivityStep22.f31567d1.getBookmarks().getPickup(), MenuOrderActivityStep2.this.f31535L0);
                        MenuOrderActivityStep2.this.mo39494a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 2, false, false);
                    } else if (i == 3) {
                        MenuOrderActivityStep2.this.f31533K0 = ((SavedBookmarkedBean) response.body()).getBookmark().getId();
                        MenuOrderActivityStep2 menuOrderActivityStep23 = MenuOrderActivityStep2.this;
                        menuOrderActivityStep23.f31527H0 = menuOrderActivityStep23.m51085a(menuOrderActivityStep23.f31567d1.getBookmarks().getDropoff(), MenuOrderActivityStep2.this.f31533K0);
                        MenuOrderActivityStep2.this.mo39494a(false, true, ((SavedBookmarkedBean) response.body()).getBookmark().getId(), 3, false, false);
                    }
                } else {
                    MenuOrderActivityStep2.this.f29642a.mo23615f(((SavedBookmarkedBean) response.body()).getMessage(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$c */
    class C11293c extends C11725f {

        /* renamed from: a */
        final /* synthetic */ boolean f31616a;

        C11293c(boolean z) {
            this.f31616a = z;
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C15792c cVar = MenuOrderActivityStep2.this.f31532J1;
            if (cVar != null) {
                cVar.mo51999a();
            }
            MenuOrderActivityStep2.this.m51134f0();
            if (this.f31616a) {
                MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                menuOrderActivityStep2.f31549S0 = (BookmarkPlaceBean) menuOrderActivityStep2.f31567d1.getBookmarks().getPickup().get(i);
                MenuOrderActivityStep2.this.f31549S0.setBookmark(true);
                MenuOrderActivityStep2.this.f31529I0 = i;
                MenuOrderActivityStep2 menuOrderActivityStep22 = MenuOrderActivityStep2.this;
                menuOrderActivityStep22.f31535L0 = menuOrderActivityStep22.f31549S0.getId();
                MenuOrderActivityStep2.this.m51121c(true, true, true, true);
                return;
            }
            MenuOrderActivityStep2 menuOrderActivityStep23 = MenuOrderActivityStep2.this;
            if (menuOrderActivityStep23.f32098T) {
                menuOrderActivityStep23.f31551T0 = (BookmarkPlaceBean) menuOrderActivityStep23.f31567d1.getBookmarks().getDropoff().get(i);
                MenuOrderActivityStep2.this.f31551T0.setBookmark(true);
                MenuOrderActivityStep2.this.f31527H0 = i;
                MenuOrderActivityStep2 menuOrderActivityStep24 = MenuOrderActivityStep2.this;
                menuOrderActivityStep24.f31533K0 = menuOrderActivityStep24.f31551T0.getId();
                MenuOrderActivityStep2.this.m51114b(true, true, true, true);
                return;
            }
            menuOrderActivityStep23.f31547R0 = (BookmarkPlaceBean) menuOrderActivityStep23.f31567d1.getBookmarks().getDelivery().get(i);
            MenuOrderActivityStep2.this.f31547R0.setBookmark(true);
            MenuOrderActivityStep2.this.f31531J0 = i;
            MenuOrderActivityStep2 menuOrderActivityStep25 = MenuOrderActivityStep2.this;
            menuOrderActivityStep25.f31537M0 = menuOrderActivityStep25.f31547R0.getId();
            MenuOrderActivityStep2.this.m51105a(true, true, true, true);
        }

        /* renamed from: e */
        public void mo38064e(int i) {
            if (this.f31616a) {
                MenuOrderActivityStep2.this.mo39145b(2, i);
                return;
            }
            MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
            if (menuOrderActivityStep2.f32098T) {
                menuOrderActivityStep2.mo39145b(3, i);
            } else {
                menuOrderActivityStep2.mo39145b(1, i);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$d */
    class C11294d implements C10751f {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f31618a;

        C11294d(WheelViewNew wheelViewNew) {
            this.f31618a = wheelViewNew;
        }

        /* renamed from: a */
        public void mo36638a(String str) {
            int d = MenuOrderActivityStep2.this.m51145j(str);
            if (d != -1) {
                this.f31618a.setSeletion(d);
                MenuOrderActivityStep2.this.f31556W0 = d;
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$e */
    class C11295e extends C10750e {
        C11295e() {
        }

        /* renamed from: a */
        public void mo36637a(int i, String str) {
            MenuOrderActivityStep2.this.f31556W0 = i - 1;
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$f */
    class C11296f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f31621a;

        C11296f(WheelViewNew wheelViewNew) {
            this.f31621a = wheelViewNew;
        }

        public void onClick(View view) {
            MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
            menuOrderActivityStep2.f31556W0 = menuOrderActivityStep2.f31556W0 + -1 >= 0 ? MenuOrderActivityStep2.this.f31556W0 - 1 : 0;
            this.f31621a.setSeletion(MenuOrderActivityStep2.this.f31556W0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$g */
    class C11297g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ WheelViewNew f31623a;

        C11297g(WheelViewNew wheelViewNew) {
            this.f31623a = wheelViewNew;
        }

        public void onClick(View view) {
            MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
            menuOrderActivityStep2.f31556W0 = menuOrderActivityStep2.f31556W0 + 1 <= MenuOrderActivityStep2.this.f31553U0.size() ? MenuOrderActivityStep2.this.f31556W0 + 1 : MenuOrderActivityStep2.this.f31553U0.size();
            this.f31623a.setSeletion(MenuOrderActivityStep2.this.f31556W0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$h */
    class C11298h implements OnClickListener {
        C11298h() {
        }

        public void onClick(View view) {
            if (MenuOrderActivityStep2.this.f31556W0 >= MenuOrderActivityStep2.this.f31553U0.size()) {
                MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                menuOrderActivityStep2.f31556W0 = menuOrderActivityStep2.f31553U0.size() - 1;
            }
            MenuOrderActivityStep2 menuOrderActivityStep22 = MenuOrderActivityStep2.this;
            menuOrderActivityStep22.f31572g0 = (String) menuOrderActivityStep22.f31555V0.get(MenuOrderActivityStep2.this.f31556W0);
            MenuOrderActivityStep2.this.m51137g0();
            MenuOrderActivityStep2.this.f31557X0.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$i */
    class C11299i implements OnClickListener {
        C11299i() {
        }

        public void onClick(View view) {
            MenuOrderActivityStep2.this.f31557X0.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$j */
    class C11300j implements Callback<PostOrder> {
        C11300j() {
        }

        public void onFailure(Call<PostOrder> call, Throwable th) {
            try {
                if (MenuOrderActivityStep2.this.f29642a != null) {
                    MenuOrderActivityStep2.this.f29642a.mo23492O();
                }
                MenuOrderActivityStep2.this.f29642a.mo23615f(MenuOrderActivityStep2.this.getString(C10232R.string.msg_error_server_issue), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<PostOrder> call, Response<PostOrder> response) {
            try {
                if (MenuOrderActivityStep2.this.f29642a != null) {
                    MenuOrderActivityStep2.this.f29642a.mo23492O();
                    if (response.isSuccessful()) {
                        if (((PostOrder) response.body()).getCode().intValue() >= 300) {
                            MenuOrderActivityStep2.this.f29642a.mo23615f(((PostOrder) response.body()).getMessage(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                            return;
                        }
                        MenuOrderActivityStep2.this.f31570f0 = (PostOrder) response.body();
                        C11644i.f33136L6 = false;
                        MenuOrderActivityStep2.this.m51113b(MenuOrderActivityStep2.this.f31597s1, MenuOrderActivityStep2.this.f31570f0.getiOrderId());
                        MenuOrderActivityStep2.this.m51081Y();
                        MenuOrderActivityStep2.this.m51080X();
                        MenuOrderActivityStep2.this.f31568e0 = true;
                        try {
                            C6009d.m27516c(MenuOrderActivityStep2.this.getApplicationContext()).mo24810e(MenuOrderActivityStep2.this.getResources().getString(C10232R.string.branch_event_submit_order));
                            if (C11644i.f33437w) {
                                MenuOrderActivityStep2.this.f31564c0.mo39870c(MenuOrderActivityStep2.this.f32098T ? MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getvTitle() : MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getVName(), MenuOrderActivityStep2.this.f31564c0.mo39860a(), String.valueOf(MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getDistance_courier_shop()));
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String a = MenuOrderActivityStep2.this.f29642a.mo23528a(response.body());
                        String str = "placeNewOrder";
                        if (!TextUtils.isEmpty(a)) {
                            MenuOrderActivityStep2.this.f29642a.mo23551a(new ServiceManualDataBean(str, a));
                        } else {
                            MenuOrderActivityStep2.this.mo36511f(str);
                        }
                    } else if (MenuOrderActivityStep2.this.f29642a != null) {
                        MenuOrderActivityStep2.this.f29642a.mo23615f(response.message(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$k */
    class C11301k implements Runnable {
        C11301k() {
        }

        public void run() {
            MenuOrderActivityStep2.this.m51147j(true);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$l */
    class C11302l implements Runnable {
        C11302l() {
        }

        public void run() {
            MenuOrderActivityStep2.this.m51147j(false);
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$m */
    class C11303m implements OnMapReadyCallback {
        C11303m() {
        }

        public void onMapReady(GoogleMap googleMap) {
            if (!MenuOrderActivityStep2.this.isFinishing()) {
                if (C0841b.m4916a((Context) MenuOrderActivityStep2.this, "android.permission.ACCESS_FINE_LOCATION") == 0 || C0841b.m4916a((Context) MenuOrderActivityStep2.this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                    menuOrderActivityStep2.f31571f1 = menuOrderActivityStep2.f29642a.mo23514a(googleMap, menuOrderActivityStep2.f31569e1, true, true);
                    MenuOrderActivityStep2.this.f31571f1.setMyLocationEnabled(false);
                    MenuOrderActivityStep2.this.f31571f1.getUiSettings().setMyLocationButtonEnabled(false);
                    CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(MenuOrderActivityStep2.this.f29642a.mo23648p());
                    CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                    MenuOrderActivityStep2.this.f31571f1.moveCamera(newLatLng);
                    MenuOrderActivityStep2.this.f31571f1.animateCamera(zoomTo);
                    MenuOrderActivityStep2.this.m51072P();
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$n */
    class C11304n extends C2557j<Bitmap> {
        C11304n() {
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            if (!MenuOrderActivityStep2.this.isFinishing()) {
                MenuOrderActivityStep2.this.f31589o1 = bitmap;
                for (int i = 0; i < MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getBranchList().size(); i++) {
                    if (((BranchBean) MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                        MarkerOptions markerOptions = new MarkerOptions();
                        MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                        MenuOrderActivityStep2.this.f31579j1.add(MenuOrderActivityStep2.this.f31571f1.addMarker(markerOptions.icon(BitmapDescriptorFactory.fromBitmap(menuOrderActivityStep2.mo39140a((Context) menuOrderActivityStep2, menuOrderActivityStep2.m51087a(bitmap, (BranchBean) menuOrderActivityStep2.f32097S.f16955b.getShop().getBranchList().get(i))))).position(new LatLng(((BranchBean) MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getBranchList().get(i)).getLatitude().doubleValue(), ((BranchBean) MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getBranchList().get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                    }
                }
                if (!MenuOrderActivityStep2.this.f32098T) {
                    BranchBean branchBean = new BranchBean();
                    branchBean.setIsSelected(1);
                    branchBean.setDistance(Double.valueOf(MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getDistance_courier_shop()));
                    branchBean.setvName(MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getVName());
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    MenuOrderActivityStep2 menuOrderActivityStep22 = MenuOrderActivityStep2.this;
                    MenuOrderActivityStep2.this.f31579j1.add(MenuOrderActivityStep2.this.f31571f1.addMarker(markerOptions2.icon(BitmapDescriptorFactory.fromBitmap(menuOrderActivityStep22.mo39140a((Context) menuOrderActivityStep22, menuOrderActivityStep22.m51087a(bitmap, branchBean)))).position(new LatLng(MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getLatitude().doubleValue(), MenuOrderActivityStep2.this.f32097S.f16955b.getShop().getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                }
                MenuOrderActivityStep2.this.m51140h0();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$o */
    class C11305o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Builder f31632a;

        C11305o(Builder builder) {
            this.f31632a = builder;
        }

        public void run() {
            try {
                if (MenuOrderActivityStep2.this.f31554U1 > 1) {
                    MenuOrderActivityStep2.this.f31571f1.setPadding(MenuOrderActivityStep2.this.f31585m1 / 4, (int) (((float) MenuOrderActivityStep2.this.f31583l1) / 1.5f), MenuOrderActivityStep2.this.f31585m1 / 4, 0);
                    MenuOrderActivityStep2.this.f31571f1.moveCamera(CameraUpdateFactory.newLatLngBounds(this.f31632a.build(), 100));
                } else if (MenuOrderActivityStep2.this.f31554U1 > 0) {
                    CameraUpdate zoomTo = CameraUpdateFactory.zoomTo(15.0f);
                    MenuOrderActivityStep2.this.f31571f1.moveCamera(CameraUpdateFactory.newLatLng(this.f31632a.build().getCenter()));
                    MenuOrderActivityStep2.this.f31571f1.animateCamera(zoomTo);
                } else {
                    CameraUpdate newLatLng = CameraUpdateFactory.newLatLng(MenuOrderActivityStep2.this.f29642a.mo23648p());
                    CameraUpdate zoomTo2 = CameraUpdateFactory.zoomTo(15.0f);
                    MenuOrderActivityStep2.this.f31571f1.moveCamera(newLatLng);
                    MenuOrderActivityStep2.this.f31571f1.animateCamera(zoomTo2);
                }
            } catch (Exception e) {
                MenuOrderActivityStep2.this.f31571f1.moveCamera(CameraUpdateFactory.zoomTo(17.0f));
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$p */
    class C11306p implements Callback<DeliveryTimeWindowBean> {

        /* renamed from: a */
        final /* synthetic */ boolean f31634a;

        /* renamed from: b */
        final /* synthetic */ boolean f31635b;

        C11306p(boolean z, boolean z2) {
            this.f31634a = z;
            this.f31635b = z2;
        }

        public void onFailure(Call<DeliveryTimeWindowBean> call, Throwable th) {
            if (!MenuOrderActivityStep2.this.isFinishing()) {
                C5887x xVar = MenuOrderActivityStep2.this.f29642a;
                if (xVar != null) {
                    xVar.mo23492O();
                    MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                    menuOrderActivityStep2.mo39495i(menuOrderActivityStep2.getString(C10232R.string.msg_error_server_issue));
                }
            }
        }

        public void onResponse(Call<DeliveryTimeWindowBean> call, Response<DeliveryTimeWindowBean> response) {
            if (!MenuOrderActivityStep2.this.isFinishing()) {
                C5887x xVar = MenuOrderActivityStep2.this.f29642a;
                if (xVar != null) {
                    if (this.f31634a && !this.f31635b) {
                        xVar.mo23492O();
                    }
                    MenuOrderActivityStep2 menuOrderActivityStep2 = MenuOrderActivityStep2.this;
                    if (menuOrderActivityStep2.f31607x1) {
                        menuOrderActivityStep2.mo39139N();
                    }
                    if (!response.isSuccessful()) {
                        MenuOrderActivityStep2.this.mo39495i(response.message());
                    } else if (((DeliveryTimeWindowBean) response.body()).getCode().intValue() <= 300) {
                        MenuOrderActivityStep2.this.f31567d1.setDelivery_time_options(((DeliveryTimeWindowBean) response.body()).getDeliveryTimeOptions());
                        if (!(MenuOrderActivityStep2.this.f32097S.f16955b.getShop().isManualBranchSelect() || ((DeliveryTimeWindowBean) response.body()).getAddressHash() == null || ((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude() == null)) {
                            ((DeliveryTimeWindowBean) response.body()).getAddressHash().setIsSelected(1);
                            if (MenuOrderActivityStep2.this.f31608y0 == 1) {
                                MenuOrderActivityStep2.this.f31578j0 = ((DeliveryTimeWindowBean) response.body()).getAddressHash().getvAddress();
                                MenuOrderActivityStep2.this.f31574h0 = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude());
                                MenuOrderActivityStep2.this.f31576i0 = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLongitude());
                                MenuOrderActivityStep2.this.f31549S0 = new BookmarkPlaceBean();
                                MenuOrderActivityStep2 menuOrderActivityStep22 = MenuOrderActivityStep2.this;
                                menuOrderActivityStep22.f31549S0.setLongitude(Double.valueOf(Double.parseDouble(menuOrderActivityStep22.f31576i0)));
                                MenuOrderActivityStep2 menuOrderActivityStep23 = MenuOrderActivityStep2.this;
                                menuOrderActivityStep23.f31549S0.setLatitude(Double.valueOf(Double.parseDouble(menuOrderActivityStep23.f31574h0)));
                                MenuOrderActivityStep2.this.f31549S0.setSubAddress("");
                                MenuOrderActivityStep2 menuOrderActivityStep24 = MenuOrderActivityStep2.this;
                                menuOrderActivityStep24.f31549S0.setAddress(menuOrderActivityStep24.f31578j0);
                                MenuOrderActivityStep2.this.f31549S0.setBookmark(false);
                                MenuOrderActivityStep2.this.m51097a(((DeliveryTimeWindowBean) response.body()).getAddressHash());
                            }
                            if (MenuOrderActivityStep2.this.f31610z0 == 1) {
                                MenuOrderActivityStep2.this.f31584m0 = ((DeliveryTimeWindowBean) response.body()).getAddressHash().getvAddress();
                                MenuOrderActivityStep2.this.f31580k0 = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLatitude());
                                MenuOrderActivityStep2.this.f31582l0 = String.valueOf(((DeliveryTimeWindowBean) response.body()).getAddressHash().getLongitude());
                                MenuOrderActivityStep2.this.m51097a(((DeliveryTimeWindowBean) response.body()).getAddressHash());
                            }
                        }
                        MenuOrderActivityStep2.this.m51136g(true);
                    } else {
                        MenuOrderActivityStep2.this.mo39495i(((DeliveryTimeWindowBean) response.body()).getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$q */
    class C11307q implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ int f31637N;

        /* renamed from: a */
        final /* synthetic */ Dialog f31639a;

        /* renamed from: b */
        final /* synthetic */ int f31640b;

        C11307q(Dialog dialog, int i, int i2) {
            this.f31639a = dialog;
            this.f31640b = i;
            this.f31637N = i2;
        }

        public void onClick(View view) {
            try {
                this.f31639a.dismiss();
                int i = this.f31640b;
                if (i == 1) {
                    MenuOrderActivityStep2.this.m51095a(1, String.valueOf(((BookmarkPlaceBean) MenuOrderActivityStep2.this.f31567d1.getBookmarks().getDelivery().get(this.f31637N)).getId()), this.f31637N);
                } else if (i == 2) {
                    MenuOrderActivityStep2.this.m51095a(2, String.valueOf(((BookmarkPlaceBean) MenuOrderActivityStep2.this.f31567d1.getBookmarks().getPickup().get(this.f31637N)).getId()), this.f31637N);
                } else if (i == 3) {
                    MenuOrderActivityStep2.this.m51095a(3, String.valueOf(((BookmarkPlaceBean) MenuOrderActivityStep2.this.f31567d1.getBookmarks().getDropoff().get(this.f31637N)).getId()), this.f31637N);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$r */
    class C11308r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31641a;

        C11308r(Dialog dialog) {
            this.f31641a = dialog;
        }

        public void onClick(View view) {
            this.f31641a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.MenuOrderActivityStep2$s */
    class C11309s implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ int f31643a;

        /* renamed from: b */
        final /* synthetic */ int f31644b;

        /* renamed from: c */
        final /* synthetic */ String f31645c;

        C11309s(int i, int i2, String str) {
            this.f31643a = i;
            this.f31644b = i2;
            this.f31645c = str;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            MenuOrderActivityStep2.this.f29642a.mo23492O();
            C5887x xVar = MenuOrderActivityStep2.this.f29642a;
            if (xVar != null) {
                xVar.mo23653q0();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (MenuOrderActivityStep2.this.f29642a != null) {
                if (!response.isSuccessful()) {
                    MenuOrderActivityStep2.this.f29642a.mo23492O();
                    C5887x xVar = MenuOrderActivityStep2.this.f29642a;
                    if (xVar != null) {
                        xVar.mo23615f(response.message(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                    }
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    MenuOrderActivityStep2.this.f29642a.mo23491N(((DefaultBean) response.body()).getMessage());
                    int i = this.f31643a;
                    String str = "-1";
                    if (i == 1) {
                        if (MenuOrderActivityStep2.this.f31531J0 == this.f31644b) {
                            MenuOrderActivityStep2.this.f31531J0 = -1;
                            MenuOrderActivityStep2.this.f31537M0 = str;
                            MenuOrderActivityStep2.this.f31547R0.setBookmark(false);
                        }
                        MenuOrderActivityStep2.this.mo39494a(false, true, this.f31645c, 1, false, false);
                    } else if (i == 2) {
                        if (MenuOrderActivityStep2.this.f31529I0 == this.f31644b) {
                            MenuOrderActivityStep2.this.f31529I0 = -1;
                            MenuOrderActivityStep2.this.f31535L0 = str;
                            MenuOrderActivityStep2.this.f31549S0.setBookmark(false);
                        }
                        MenuOrderActivityStep2.this.mo39494a(false, true, this.f31645c, 2, false, false);
                    } else if (i == 3) {
                        if (MenuOrderActivityStep2.this.f31527H0 == this.f31644b) {
                            MenuOrderActivityStep2.this.f31527H0 = -1;
                            MenuOrderActivityStep2.this.f31533K0 = str;
                            MenuOrderActivityStep2.this.f31551T0.setBookmark(false);
                        }
                        MenuOrderActivityStep2.this.mo39494a(false, true, this.f31645c, 3, false, false);
                    }
                } else {
                    MenuOrderActivityStep2.this.f29642a.mo23492O();
                    MenuOrderActivityStep2.this.f29642a.mo23615f(((DefaultBean) response.body()).getMessage(), MenuOrderActivityStep2.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    public MenuOrderActivityStep2() {
        String str = "";
        this.f31566d0 = str;
        this.f31568e0 = false;
        this.f31572g0 = null;
        this.f31586n0 = str;
        this.f31588o0 = str;
        this.f31590p0 = str;
        this.f31592q0 = str;
        this.f31517C0 = 1;
        this.f31519D0 = 2;
        this.f31521E0 = 3;
        this.f31523F0 = C3868i.f12248b;
        this.f31525G0 = str;
        this.f31527H0 = -1;
        this.f31529I0 = -1;
        this.f31531J0 = -1;
        String str2 = "-1";
        this.f31533K0 = str2;
        this.f31535L0 = str2;
        this.f31537M0 = str2;
        float f = C11644i.f33240Y6;
        this.f31539N0 = f;
        this.f31541O0 = f;
        this.f31543P0 = f;
        this.f31545Q0 = Boolean.valueOf(true);
        this.f31553U0 = new ArrayList();
        this.f31555V0 = new ArrayList();
        this.f31556W0 = 1;
        this.f31557X0 = null;
        this.f31583l1 = 1;
        this.f31585m1 = 1;
        this.f31599t1 = 3;
        this.f31601u1 = str;
        this.f31603v1 = str;
        this.f31605w1 = str;
        this.f31607x1 = true;
        this.f31536L1 = false;
        this.f31538M1 = new Handler();
        this.f31542O1 = false;
        this.f31544P1 = str;
        this.f31546Q1 = str;
        this.f31548R1 = str;
        this.f31554U1 = 0;
    }

    /* renamed from: O */
    private void m51071O() {
        String[] strArr = {"1 HOUR", "2 HOURS", "3 HOURS", "1 Day", "2 Days", "3 Days", "1 Week", "2 Weeks", "3 Weeks"};
        String[] strArr2 = {"1 ساعة", "2 ساعة", "3 ساعات", "1 يوم", "2 أيام", "3 أيام", "1 أسبوع", "2 أسابيع", "3 أسابيع"};
        String[] strArr3 = {"1:H", "2:H", "3:H", "1:D", "2:D", "3:D", "1:W", "2:W", "3:W"};
        for (int i = 0; i < strArr.length; i++) {
            if (C11644i.f33183R5.equalsIgnoreCase(this.f29642a.mo23478H())) {
                this.f31553U0.add(strArr[i]);
            } else {
                this.f31553U0.add(strArr2[i]);
            }
            this.f31555V0.add(strArr3[i]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m51072P() {
        if (!isFinishing()) {
            try {
                if (!(this.f31571f1 == null || this.f32097S == null || this.f29642a == null)) {
                    this.f31571f1.clear();
                    this.f31579j1 = new ArrayList<>();
                    String vShopPic = this.f32098T ? this.f32097S.f16955b.getShop().getvIcon() : this.f32097S.f16955b.getShop().getVShopPic();
                    if (vShopPic != null) {
                        if (!vShopPic.equals("")) {
                            C2232l.m11649c(getApplicationContext()).mo9515a(vShopPic).mo9441j().mo9458b(new C11304n());
                        }
                    }
                    for (int i = 0; i < this.f32097S.f16955b.getShop().getBranchList().size(); i++) {
                        if (((BranchBean) this.f32097S.f16955b.getShop().getBranchList().get(i)).getIsSelected() == 1) {
                            this.f31579j1.add(this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51087a((Bitmap) null, (BranchBean) this.f32097S.f16955b.getShop().getBranchList().get(i))))).position(new LatLng(((BranchBean) this.f32097S.f16955b.getShop().getBranchList().get(i)).getLatitude().doubleValue(), ((BranchBean) this.f32097S.f16955b.getShop().getBranchList().get(i)).getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                        }
                    }
                    if (!this.f32098T) {
                        BranchBean branchBean = new BranchBean();
                        branchBean.setIsSelected(1);
                        branchBean.setDistance(Double.valueOf(this.f32097S.f16955b.getShop().getDistance_courier_shop()));
                        branchBean.setvName(this.f32097S.f16955b.getShop().getVName());
                        this.f31579j1.add(this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51087a((Bitmap) null, branchBean)))).position(new LatLng(this.f32097S.f16955b.getShop().getLatitude().doubleValue(), this.f32097S.f16955b.getShop().getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                    }
                }
                if (this.f29642a.mo23502X()) {
                    mo39494a(true, false, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0, false, false);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: Q */
    private void m51073Q() {
        String str = "";
        if (this.f31598t0.getVisibility() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f31574h0);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f31576i0);
            m51104a(false, true, sb2, sb3.toString(), this.f31580k0, this.f31582l0, false);
        } else if (this.f31600u0.getVisibility() == 0) {
            if (this.f32098T) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(this.f31574h0);
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(this.f31576i0);
                m51104a(false, true, sb5, sb6.toString(), this.f31580k0, this.f31582l0, false);
                return;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(this.f32097S.f16955b.getShop().getLatitude());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(this.f32097S.f16955b.getShop().getLongitude());
            m51104a(false, true, sb8, sb9.toString(), this.f31580k0, this.f31582l0, false);
        } else if (this.f32098T) {
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            sb10.append(this.f31574h0);
            String sb11 = sb10.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str);
            sb12.append(this.f31576i0);
            m51104a(false, true, sb11, sb12.toString(), this.f31580k0, this.f31582l0, false);
        } else {
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(this.f32097S.f16955b.getShop().getLatitude());
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(str);
            sb15.append(this.f32097S.f16955b.getShop().getLongitude());
            m51104a(false, true, sb14, sb15.toString(), this.f31580k0, this.f31582l0, false);
        }
    }

    /* renamed from: R */
    private void m51074R() {
        String str = "";
        if (this.f29642a == null) {
            this.f29642a = new C5887x(this);
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            hashMap.put(C11687c.f33747Y0, this.f29642a.mo23622h(this.f31603v1));
            C5887x xVar = this.f29642a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f29642a.mo23468C().mo23459f("user_id"));
            hashMap.put("iBuyerId", xVar.mo23622h(String.valueOf(sb.toString())));
            C5887x xVar2 = this.f29642a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f32097S.f16954a.getShopId());
            hashMap.put("vShopId", xVar2.mo23622h(String.valueOf(sb2.toString())));
            hashMap.put(C11687c.f33675G0, this.f29642a.mo23622h(String.valueOf(this.f31597s1)));
            C5887x xVar3 = this.f29642a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.f31580k0);
            hashMap.put("latitude", xVar3.mo23622h(String.valueOf(sb3.toString())));
            C5887x xVar4 = this.f29642a;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f31582l0);
            hashMap.put("longitude", xVar4.mo23622h(String.valueOf(sb4.toString())));
            hashMap.put("language", this.f29642a.mo23622h(C11644i.f33183R5));
            C5887x xVar5 = this.f29642a;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append(this.f31584m0);
            hashMap.put("vAddress", xVar5.mo23622h(String.valueOf(sb5.toString())));
            String str2 = C11687c.f33683I0;
            C5887x xVar6 = this.f29642a;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(this.f31572g0);
            hashMap.put(str2, xVar6.mo23622h(String.valueOf(sb6.toString())));
            String str3 = C11687c.f33711P0;
            C5887x xVar7 = this.f29642a;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(this.f31599t1);
            hashMap.put(str3, xVar7.mo23622h(String.valueOf(sb7.toString())));
            hashMap.put("buyer_payment_option_id", this.f29642a.mo23622h(this.f31601u1));
            boolean z = this.f32098T;
            String str4 = C11687c.f33679H0;
            String str5 = C11687c.f33657B2;
            if (z) {
                String str6 = C11687c.f33727T0;
                C5887x xVar8 = this.f29642a;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(this.f32097S.f16955b.getShop().isManualBranchSelect());
                hashMap.put(str6, xVar8.mo23622h(String.valueOf(sb8.toString())));
                String str7 = C11687c.f33787g2;
                C5887x xVar9 = this.f29642a;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(this.f31578j0);
                hashMap.put(str7, xVar9.mo23622h(String.valueOf(sb9.toString())));
                String str8 = C11687c.f33792h2;
                C5887x xVar10 = this.f29642a;
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(this.f31574h0);
                hashMap.put(str8, xVar10.mo23622h(String.valueOf(sb10.toString())));
                String str9 = C11687c.f33796i2;
                C5887x xVar11 = this.f29642a;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(this.f31576i0);
                hashMap.put(str9, xVar11.mo23622h(String.valueOf(sb11.toString())));
                C5887x xVar12 = this.f29642a;
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(this.f31584m0);
                hashMap.put(str4, xVar12.mo23622h(sb12.toString()));
                String str10 = C11687c.f33653A2;
                C5887x xVar13 = this.f29642a;
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(this.f31590p0);
                hashMap.put(str10, xVar13.mo23622h(sb13.toString()));
                C5887x xVar14 = this.f29642a;
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(this.f31592q0);
                hashMap.put(str5, xVar14.mo23622h(sb14.toString()));
            } else {
                C5887x xVar15 = this.f29642a;
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(this.f31588o0);
                hashMap.put(str5, xVar15.mo23622h(sb15.toString()));
                C5887x xVar16 = this.f29642a;
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(this.f31586n0);
                hashMap.put(str4, xVar16.mo23622h(sb16.toString()));
            }
            int i = 0;
            while (i < MenuOrderActivityStep1.f31428g1.size()) {
                C13817d0 create = C13817d0.create(C13872x.m59361b("image/jpeg"), ((UploadImageBean) MenuOrderActivityStep1.f31428g1.get(i)).getImageFile());
                StringBuilder sb17 = new StringBuilder();
                sb17.append("images[");
                int i2 = i + 1;
                sb17.append(i2);
                sb17.append("]");
                arrayList.add(C13875b.m59383a(sb17.toString(), new File(((UploadImageBean) MenuOrderActivityStep1.f31428g1.get(i)).getImagePath()).getName(), create));
                i = i2;
            }
        } catch (Exception unused) {
        }
        StringBuilder sb18 = new StringBuilder();
        sb18.append("ordernow : ");
        sb18.append(hashMap);
        C5880q.m25751b(sb18.toString());
        Call placeNewOrderNew = C11687c.m52645a(this.f29642a).placeNewOrderNew(hashMap, arrayList);
        this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        placeNewOrderNew.enqueue(new C11300j());
    }

    /* renamed from: S */
    private void m51075S() {
        this.f31518C1.setVisibility(0);
        this.f31520D1.setVisibility(0);
        String str = "";
        if (this.f31559Z0.getText().toString().trim().equals(str)) {
            this.f31514A1.setVisibility(0);
            this.f31518C1.setVisibility(0);
            this.f31518C1.setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
        } else {
            this.f31514A1.setVisibility(8);
            this.f31518C1.setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.gray_3));
        }
        if (this.f31561a1.getText().toString().trim().equals(str)) {
            this.f31600u0.setVisibility(0);
            this.f31520D1.setVisibility(0);
            this.f31520D1.setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.sky_blue_color));
        } else {
            this.f31516B1.setVisibility(8);
            this.f31520D1.setColorFilter(C0841b.m4915a((Context) this, (int) C10232R.C10234color.gray_3));
        }
        if (this.f31565c1.getVisibility() == 0) {
            this.f31520D1.setVisibility(8);
        }
        if (this.f31563b1.getVisibility() == 0) {
            this.f31518C1.setVisibility(8);
        }
    }

    /* renamed from: T */
    private int m51076T() {
        int i = 0;
        while (i < this.f31567d1.getDelivery_time_options().size()) {
            try {
                if (((DeliveryTimeBean) this.f31567d1.getDelivery_time_options().get(i)).getValue().equalsIgnoreCase(this.f31572g0)) {
                    return i;
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    /* renamed from: U */
    private void m51077U() {
        this.f31581k1.setVisibility(8);
    }

    /* renamed from: V */
    private void m51078V() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.f31603v1 = intent.getStringExtra(C11687c.f33747Y0);
                this.f31597s1 = intent.getStringExtra(this.f32101W);
                this.f31599t1 = intent.getIntExtra(this.f32102X, 3);
                this.f31601u1 = intent.getStringExtra(this.f32103Y);
                this.f31587n1 = intent.getStringExtra(C11644i.f33431v1);
                this.f31608y0 = intent.getIntExtra(C11644i.f33464z2, 0);
                this.f31610z0 = intent.getIntExtra(C11644i.f33044A2, 0);
                this.f31513A0 = intent.getIntExtra(C11644i.f33052B2, 0);
                this.f31515B0 = intent.getIntExtra(C11644i.f33060C2, 0);
                if (this.f31587n1.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                    this.f32098T = false;
                } else if (this.f31587n1.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                    this.f32098T = true;
                }
                if (this.f31608y0 == 1) {
                    this.f31578j0 = intent.getStringExtra(C11644i.f33084F2);
                    this.f31574h0 = String.valueOf(intent.getDoubleExtra(C11644i.f33068D2, 0.0d));
                    this.f31576i0 = String.valueOf(intent.getDoubleExtra(C11644i.f33076E2, 0.0d));
                }
                if (this.f31610z0 == 1) {
                    this.f31584m0 = intent.getStringExtra(C11644i.f33108I2);
                    this.f31580k0 = String.valueOf(intent.getDoubleExtra(C11644i.f33092G2, 0.0d));
                    this.f31582l0 = String.valueOf(intent.getDoubleExtra(C11644i.f33100H2, 0.0d));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: W */
    private void m51079W() {
        this.f31611z1 = new C11614c(this);
        mo39493a((C11377m) this);
        m51078V();
        MapsInitializer.initialize(getApplicationContext());
        this.f31564c0 = new C11617f(this);
        this.f31566d0 = this.f31564c0.mo39860a();
        this.f31594r0 = (TextView) findViewById(C10232R.C10236id.tvTitle);
        if (this.f32098T) {
            this.f31594r0.setText(this.f32097S.f16955b.getShop().getvTitle());
        } else {
            this.f31594r0.setText(this.f32097S.f16955b.getShop().getVName());
        }
        this.f31593q1 = (ImageView) findViewById(C10232R.C10236id.ivBack);
        this.f31593q1.setOnClickListener(this);
        C1382h supportFragmentManager = getSupportFragmentManager();
        this.f31569e1 = (SupportMapFragment) supportFragmentManager.mo6221a((int) C10232R.C10236id.layMapContainer);
        if (this.f31569e1 == null) {
            this.f31569e1 = SupportMapFragment.newInstance();
            supportFragmentManager.mo6224a().mo6405b(C10232R.C10236id.layMapContainer, this.f31569e1).mo6100f();
        }
        m51071O();
        this.f31556W0 = 0;
        this.f31572g0 = (String) this.f31555V0.get(this.f31556W0);
        this.f31581k1 = (ProgressBar) findViewById(C10232R.C10236id.pgBarTime);
        this.f31591p1 = (ImageView) findViewById(C10232R.C10236id.bgSendOrder);
        this.f31591p1.setOnClickListener(this);
        this.f31595r1 = (TextView) findViewById(C10232R.C10236id.tvSendOrder);
        this.f31602v0 = (LinearLayout) findViewById(C10232R.C10236id.llDeliveryTime);
        this.f31598t0 = (LinearLayout) findViewById(C10232R.C10236id.llPickUpLocation);
        this.f31600u0 = (LinearLayout) findViewById(C10232R.C10236id.llDropOffLocation);
        this.f31596s0 = (TextView) findViewById(C10232R.C10236id.tvOrderTime);
        this.f31530I1 = (TextView) findViewById(C10232R.C10236id.tvDirectionTitle);
        this.f31522E1 = (ImageView) findViewById(C10232R.C10236id.ivDotLine);
        this.f31526G1 = (ImageView) findViewById(C10232R.C10236id.ivPickUp);
        this.f31528H1 = (ImageView) findViewById(C10232R.C10236id.ivArrowTime);
        this.f31524F1 = (ImageView) findViewById(C10232R.C10236id.ivDropUp);
        this.f31514A1 = (TextView) findViewById(C10232R.C10236id.tvPickLocationPickup);
        this.f31516B1 = (TextView) findViewById(C10232R.C10236id.tvPickLocationDropOff);
        this.f31518C1 = (ImageView) findViewById(C10232R.C10236id.ivPickLocationPickup);
        this.f31520D1 = (ImageView) findViewById(C10232R.C10236id.ivPickLocationDropOff);
        this.f31604w0 = (LinearLayout) findViewById(C10232R.C10236id.llPickUpLocationRoot);
        this.f31606x0 = (LinearLayout) findViewById(C10232R.C10236id.llDropOffLocationRoot);
        this.f31604w0 = (LinearLayout) findViewById(C10232R.C10236id.llPickUpLocationRoot);
        this.f31606x0 = (LinearLayout) findViewById(C10232R.C10236id.llDropOffLocationRoot);
        this.f31559Z0 = (TextView) findViewById(C10232R.C10236id.tvPickUpLocation);
        this.f31561a1 = (TextView) findViewById(C10232R.C10236id.txtDropOffLocation);
        this.f31598t0.setOnClickListener(this);
        this.f31600u0.setOnClickListener(this);
        this.f31563b1 = (ImageView) findViewById(C10232R.C10236id.ivPickUpStar);
        this.f31565c1 = (ImageView) findViewById(C10232R.C10236id.ivDropOffStar);
        this.f31563b1.setOnClickListener(this);
        this.f31565c1.setOnClickListener(this);
        if (this.f29642a.mo23496R()) {
            this.f29642a.mo23545a(this.f31593q1);
            this.f29642a.mo23608d(this.f31559Z0, this.f31561a1);
        }
        m51128d0();
        ShopDetails shopDetails = this.f32097S.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            finish();
            return;
        }
        this.f31602v0.setOnClickListener(this);
        try {
            if (this.f29642a.mo23624h() && this.f29642a.mo23502X() && this.f29642a.mo23500V() && this.f31571f1 == null) {
                this.f31569e1.getMapAsync(new C11303m());
            }
            if (this.f29642a != null && this.f29642a.mo23620g() && !C11694e.INSTANCE.mo40213h()) {
                this.f29642a.mo23626i();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f31542O1 = this.f29642a.mo23496R();
        if (this.f31542O1) {
            this.f29642a.mo23561a(this.f31520D1, this.f31528H1, this.f31518C1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m51080X() {
        C11598a f = C11598a.m52263f();
        String str = this.f31597s1;
        boolean z = true;
        boolean z2 = MenuOrderActivityStep1.f31428g1.size() > 0;
        if (this.f31599t1 == -1) {
            z = false;
        }
        f.mo39824a(str, z2, z, C11601c.Cash.mo39844d(), C11600b.MenuOrder.mo39843d(), this.f32097S.f16955b.getShop().isHasDiscount(), this.f29642a.mo23639m(this.f32097S.f16955b.getShop().getDiscountShortLabel()), this.f31578j0, this.f31584m0, this.f31572g0, 0, 0.0d, this.f32097S.f16955b.getShop().getVShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m51081Y() {
        String str = "";
        if (this.f31544P1.equals(str)) {
            this.f31544P1 = this.f31559Z0.getText().toString().trim();
        }
        if (this.f31546Q1.equals(str)) {
            this.f31546Q1 = this.f31561a1.getText().toString().trim();
        }
        if (this.f31548R1.equals(str)) {
            this.f31548R1 = this.f31596s0.getText().toString().trim();
        }
        C11598a.m52263f().mo39827a(!this.f31544P1.equals(this.f31559Z0.getText().toString().trim()), this.f31550S1, !this.f31546Q1.equals(this.f31561a1.getText().toString().trim()), this.f31552T1, !this.f31548R1.equals(this.f31596s0.getText().toString().trim()), this.f31596s0.getText().toString().trim(), this.f32097S.f16955b.getShop().getVShopId());
    }

    /* renamed from: Z */
    private void m51082Z() {
        if (this.f31545Q0.booleanValue()) {
            double parseDouble = Double.parseDouble(this.f29642a.mo23468C().mo23459f(C11644i.f33303g));
            double parseDouble2 = Double.parseDouble(this.f29642a.mo23468C().mo23459f(C11644i.f33312h));
            if (!(this.f32098T && this.f31608y0 == 0 && this.f31610z0 == 0)) {
                if (this.f31598t0.getVisibility() == 0 && this.f31598t0.isEnabled()) {
                    List c = m51119c(true);
                    int i = 0;
                    while (i < c.size()) {
                        int i2 = i;
                        float b = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c.get(i)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c.get(i)).getLongitude().doubleValue());
                        if (this.f31541O0 > b) {
                            this.f31541O0 = b;
                            this.f31529I0 = i2;
                            this.f31535L0 = ((BookmarkPlaceBean) c.get(i2)).getId();
                        }
                        i = i2 + 1;
                    }
                }
                if (this.f31600u0.getVisibility() == 0 && this.f31600u0.isEnabled()) {
                    List c2 = m51119c(false);
                    if (this.f32098T) {
                        for (int i3 = 0; i3 < c2.size(); i3++) {
                            float b2 = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c2.get(i3)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c2.get(i3)).getLongitude().doubleValue());
                            if (this.f31539N0 > b2) {
                                this.f31539N0 = b2;
                                this.f31527H0 = i3;
                                this.f31533K0 = ((BookmarkPlaceBean) c2.get(i3)).getId();
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < c2.size(); i4++) {
                            float b3 = C5887x.m25805b(parseDouble, parseDouble2, ((BookmarkPlaceBean) c2.get(i4)).getLatitude().doubleValue(), ((BookmarkPlaceBean) c2.get(i4)).getLongitude().doubleValue());
                            if (this.f31543P0 > b3) {
                                this.f31543P0 = b3;
                                this.f31531J0 = i4;
                                this.f31537M0 = ((BookmarkPlaceBean) c2.get(i4)).getId();
                            }
                        }
                    }
                }
            }
            if (this.f31529I0 != -1) {
                this.f31549S0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getPickup().get(this.f31529I0);
                this.f31574h0 = String.valueOf(this.f31549S0.getLatitude());
                this.f31576i0 = String.valueOf(this.f31549S0.getLongitude());
                this.f31549S0.setBookmark(true);
                m51121c(false, true, true, false);
            }
            if (this.f31527H0 != -1) {
                this.f31551T0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getDropoff().get(this.f31527H0);
                this.f31580k0 = String.valueOf(this.f31551T0.getLatitude());
                this.f31582l0 = String.valueOf(this.f31551T0.getLongitude());
                this.f31551T0.setBookmark(true);
                m51114b(false, true, true, false);
            }
            if (this.f31531J0 != -1) {
                this.f31547R0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getDelivery().get(this.f31531J0);
                this.f31580k0 = String.valueOf(this.f31547R0.getLatitude());
                this.f31582l0 = String.valueOf(this.f31547R0.getLongitude());
                this.f31547R0.setBookmark(true);
                m51105a(false, true, true, false);
            }
            if ((this.f31600u0.getVisibility() == 0 && this.f31527H0 == -1 && this.f31531J0 == -1) || (this.f31598t0.getVisibility() == 0 && this.f31529I0 == -1)) {
                this.f29642a.mo23492O();
                m51073Q();
            } else if (this.f31600u0.getVisibility() == 8 && this.f31598t0.getVisibility() == 8) {
                this.f29642a.mo23492O();
                m51073Q();
            } else {
                m51073Q();
            }
            mo39138M();
            this.f31545Q0 = Boolean.valueOf(false);
        }
    }

    /* renamed from: a0 */
    private void m51106a0() {
        boolean z;
        if (!TextUtils.isEmpty(this.f31572g0)) {
            int i = 0;
            while (true) {
                if (i >= this.f31567d1.getDelivery_time_options().size()) {
                    z = true;
                    break;
                } else if (((DeliveryTimeBean) this.f31567d1.getDelivery_time_options().get(i)).getValue().equalsIgnoreCase(this.f31572g0)) {
                    this.f31556W0 = i;
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                this.f31572g0 = (String) this.f31555V0.get(this.f31556W0);
                m51137g0();
                this.f31556W0 = 0;
            }
            if (this.f31596s0.getText().toString().trim().equals("")) {
                m51137g0();
            }
        }
    }

    /* renamed from: b0 */
    private void m51115b0() {
        if (this.f32097S.f16955b.getShop().getbIsPickupAvailable().intValue() == 0) {
            String str = "";
            this.f31578j0 = str;
            this.f31574h0 = str;
            this.f31576i0 = str;
        }
    }

    /* renamed from: c0 */
    private void m51123c0() {
        if (this.f31598t0.getVisibility() == 0) {
            if (m51119c(true).size() <= 0 && !this.f29642a.mo23468C().mo23450a(C11644i.f33320h7)) {
                this.f31538M1.postDelayed(new C11301k(), 2000);
            }
        } else if (this.f31600u0.getVisibility() == 0 && m51119c(false).size() <= 0 && !this.f29642a.mo23468C().mo23450a(C11644i.f33329i7)) {
            this.f31538M1.postDelayed(new C11302l(), 2000);
        }
    }

    /* renamed from: d0 */
    private void m51128d0() {
        boolean z = this.f31513A0 == 1;
        boolean z2 = !this.f32098T || this.f31515B0 == 1;
        boolean z3 = this.f31608y0 != 1;
        boolean z4 = this.f31610z0 != 1;
        this.f31598t0.setVisibility(z ? 0 : 8);
        this.f31600u0.setVisibility(z2 ? 0 : 8);
        this.f31598t0.setEnabled(z3);
        this.f31598t0.setClickable(z3);
        this.f31600u0.setEnabled(z4);
        this.f31600u0.setClickable(z4);
        if (!z || !z3) {
            LayoutParams layoutParams = (LayoutParams) this.f31600u0.getLayoutParams();
            layoutParams.removeRule(3);
            this.f31600u0.setLayoutParams(layoutParams);
            this.f31598t0.setVisibility(8);
            this.f31559Z0.setText(this.f31578j0);
            this.f31526G1.setVisibility(8);
            this.f31536L1 = true;
        } else {
            this.f31526G1.setVisibility(0);
            this.f31536L1 = false;
        }
        if (!z2 || !z4) {
            this.f31600u0.setVisibility(8);
            this.f31561a1.setText(this.f31584m0);
            this.f31524F1.setVisibility(8);
        } else {
            this.f31524F1.setVisibility(0);
        }
        m51075S();
        if (z3 && z4 && z2 && z) {
            this.f31530I1.setText(getString(C10232R.string.lbl_destinations));
            this.f31522E1.setVisibility(0);
        } else if (!z || !z3) {
            this.f31522E1.setVisibility(8);
        } else {
            this.f31530I1.setText(getString(C10232R.string.lbl_pickup_new));
            this.f31522E1.setVisibility(8);
        }
        if (!z3 && !z4) {
            this.f31526G1.setVisibility(8);
            this.f31524F1.setVisibility(8);
        }
        mo39138M();
        m51123c0();
    }

    /* renamed from: e0 */
    private void m51131e0() {
        Dialog dialog = this.f31557X0;
        if ((dialog == null || !dialog.isShowing()) && this.f31553U0.size() != 0) {
            View inflate = LayoutInflater.from(this).inflate(C10232R.layout.custom_wheel_view_new, null);
            ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.imgUp);
            ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.imgDown);
            TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.txtOk);
            TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.txtCancel);
            WheelViewNew wheelViewNew = (WheelViewNew) inflate.findViewById(C10232R.C10236id.wheel_view_wv);
            wheelViewNew.setSelectorCenterView(inflate.findViewById(C10232R.C10236id.vSelector));
            wheelViewNew.setOffset(1);
            wheelViewNew.setItems(this.f31553U0);
            this.f31556W0 = m51076T();
            wheelViewNew.setSeletion(this.f31556W0);
            this.f31557X0 = new Dialog(this);
            this.f31557X0.requestWindowFeature(1);
            this.f31557X0.setContentView(inflate);
            C5887x xVar = this.f29642a;
            if (xVar != null) {
                xVar.mo23535a(this.f31557X0);
            }
            if (!isFinishing()) {
                this.f31557X0.show();
            }
            wheelViewNew.setmOnWheelItemClickListner(new C11294d(wheelViewNew));
            wheelViewNew.setOnWheelViewListener(new C11295e());
            imageView.setOnClickListener(new C11296f(wheelViewNew));
            imageView2.setOnClickListener(new C11297g(wheelViewNew));
            textView.setOnClickListener(new C11298h());
            textView2.setOnClickListener(new C11299i());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m51134f0() {
        this.f31581k1.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m51137g0() {
        this.f31596s0.setText((CharSequence) this.f31553U0.get(this.f31556W0));
        this.f31596s0.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m51140h0() {
        Builder builder = new Builder();
        this.f31554U1 = 0;
        Iterator it = this.f31579j1.iterator();
        while (it.hasNext()) {
            builder.include(((Marker) it.next()).getPosition());
            this.f31554U1++;
        }
        Marker marker = this.f31573g1;
        if (marker != null) {
            builder.include(marker.getPosition());
            this.f31554U1++;
        }
        Marker marker2 = this.f31575h1;
        if (marker2 != null) {
            builder.include(marker2.getPosition());
            this.f31554U1++;
        }
        Marker marker3 = this.f31577i1;
        if (marker3 != null) {
            builder.include(marker3.getPosition());
            this.f31554U1++;
        }
        new Handler().postDelayed(new C11305o(builder), 10);
    }

    /* renamed from: i0 */
    private void m51143i0() {
        if (this.f32098T) {
            m51115b0();
        }
        if (this.f32098T && this.f32097S.f16955b.getShop().getbIsPickupAvailable().intValue() != 0) {
            String str = this.f31578j0;
            if (str == null || str.length() == 0) {
                this.f29642a.mo23615f(getString(C10232R.string.lbl_hint_pickup_address), getString(C10232R.string.app_name));
                return;
            }
        }
        if (this.f32098T) {
            String str2 = this.f31584m0;
            if (str2 == null || str2.length() == 0) {
                this.f29642a.mo23615f(getString(C10232R.string.lbl_hint_dropoff_address), getString(C10232R.string.app_name));
                return;
            }
        }
        if (!this.f32098T) {
            String str3 = this.f31584m0;
            if (str3 == null || str3.length() == 0) {
                this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_order_address), getString(C10232R.string.app_name));
                return;
            }
        }
        String str4 = this.f31572g0;
        if (str4 == null || str4.length() == 0) {
            this.f29642a.mo23615f(getString(C10232R.string.msg_error_invalid_order_time), getString(C10232R.string.app_name));
        } else {
            m51074R();
        }
    }

    /* renamed from: J */
    public /* synthetic */ void mo39135J() {
        this.f31532J1.mo52003e();
    }

    /* renamed from: K */
    public /* synthetic */ void mo39136K() {
        this.f31532J1.mo52003e();
    }

    /* renamed from: L */
    public /* synthetic */ void mo39137L() {
        this.f31532J1.mo52003e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r2.f31559Z0.getText().toString().trim().equals(r1) == false) goto L_0x001e;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39138M() {
        /*
            r2 = this;
            android.widget.LinearLayout r0 = r2.f31598t0     // Catch:{ Exception -> 0x0069 }
            int r0 = r0.getVisibility()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x001e
            android.widget.TextView r0 = r2.f31559Z0     // Catch:{ Exception -> 0x0069 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0069 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 != 0) goto L_0x003a
        L_0x001e:
            android.widget.LinearLayout r0 = r2.f31600u0     // Catch:{ Exception -> 0x0069 }
            int r0 = r0.getVisibility()     // Catch:{ Exception -> 0x0069 }
            if (r0 != 0) goto L_0x0052
            android.widget.TextView r0 = r2.f31561a1     // Catch:{ Exception -> 0x0069 }
            java.lang.CharSequence r0 = r0.getText()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x0069 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0069 }
            if (r0 == 0) goto L_0x0052
        L_0x003a:
            android.widget.TextView r0 = r2.f31595r1     // Catch:{ Exception -> 0x0069 }
            r1 = 2131099896(0x7f0600f8, float:1.7812158E38)
            int r1 = androidx.core.content.C0841b.m4915a(r2, r1)     // Catch:{ Exception -> 0x0069 }
            r0.setBackgroundColor(r1)     // Catch:{ Exception -> 0x0069 }
            android.widget.TextView r0 = r2.f31595r1     // Catch:{ Exception -> 0x0069 }
            r1 = 0
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x0069 }
            android.widget.ImageView r0 = r2.f31591p1     // Catch:{ Exception -> 0x0069 }
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x0069
        L_0x0052:
            android.widget.TextView r0 = r2.f31595r1     // Catch:{ Exception -> 0x0069 }
            r1 = 2131100187(0x7f06021b, float:1.7812748E38)
            int r1 = androidx.core.content.C0841b.m4915a(r2, r1)     // Catch:{ Exception -> 0x0069 }
            r0.setBackgroundColor(r1)     // Catch:{ Exception -> 0x0069 }
            android.widget.TextView r0 = r2.f31595r1     // Catch:{ Exception -> 0x0069 }
            r1 = 1
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x0069 }
            android.widget.ImageView r0 = r2.f31591p1     // Catch:{ Exception -> 0x0069 }
            r0.setEnabled(r1)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.shopmenu.MenuOrderActivityStep2.mo39138M():void");
    }

    /* renamed from: N */
    public void mo39139N() {
        this.f31607x1 = false;
        ShopDetails shopDetails = this.f32097S.f16955b;
        if (shopDetails != null && !shopDetails.getShop().isServiceShopOpen()) {
            this.f29642a.mo23487L(this.f32097S.f16955b.getShop().getShopNotOpenWarning());
        }
    }

    /* renamed from: b */
    public void mo39119b(Response<CheckDiscountBean> response) {
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
                m51134f0();
                if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                    this.f31531J0 = -1;
                    this.f31537M0 = str5;
                    this.f31580k0 = intent.getExtras().getString(str4);
                    this.f31582l0 = intent.getExtras().getString(str3);
                    this.f31584m0 = intent.getExtras().getString(str2);
                    this.f31586n0 = intent.getExtras().getString("selectedArea");
                    this.f31588o0 = intent.getExtras().getString(str);
                    if (this.f31547R0 == null) {
                        this.f31547R0 = new BookmarkPlaceBean();
                    }
                    this.f31547R0.setLongitude(Double.valueOf(Double.parseDouble(this.f31582l0)));
                    this.f31547R0.setLatitude(Double.valueOf(Double.parseDouble(this.f31580k0)));
                    this.f31547R0.setSubAddress(this.f31588o0);
                    this.f31547R0.setAddress(this.f31584m0);
                    this.f31547R0.setDeliveryArea(this.f31586n0);
                    this.f31547R0.setBookmark(false);
                    m51105a(true, true, true, true);
                    return;
                }
                mo39494a(true, false, intent.getExtras().getString(C11644i.f33415t1), 1, false, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 933 && i2 == -1) {
            m51134f0();
            if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                this.f31529I0 = -1;
                this.f31535L0 = str5;
                this.f31574h0 = intent.getExtras().getString(str4);
                this.f31576i0 = intent.getExtras().getString(str3);
                this.f31578j0 = intent.getExtras().getString(str2);
                this.f31590p0 = intent.getExtras().getString(str);
                if (this.f31549S0 == null) {
                    this.f31549S0 = new BookmarkPlaceBean();
                }
                this.f31549S0.setLongitude(Double.valueOf(Double.parseDouble(this.f31576i0)));
                this.f31549S0.setLatitude(Double.valueOf(Double.parseDouble(this.f31574h0)));
                this.f31549S0.setSubAddress(this.f31590p0);
                this.f31549S0.setAddress(this.f31578j0);
                this.f31549S0.setBookmark(false);
                m51121c(true, true, true, true);
                return;
            }
            mo39494a(true, false, intent.getExtras().getString(C11644i.f33415t1), 2, false, true);
        } else if (i == 866 && i2 == -1) {
            m51134f0();
            if (!intent.getExtras().getBoolean(C11644i.f33423u1)) {
                this.f31527H0 = -1;
                this.f31533K0 = str5;
                this.f31580k0 = intent.getExtras().getString(str4);
                this.f31582l0 = intent.getExtras().getString(str3);
                this.f31584m0 = intent.getExtras().getString(str2);
                this.f31592q0 = intent.getExtras().getString(str);
                if (this.f31551T0 == null) {
                    this.f31551T0 = new BookmarkPlaceBean();
                }
                this.f31551T0.setLongitude(Double.valueOf(Double.parseDouble(this.f31582l0)));
                this.f31551T0.setLatitude(Double.valueOf(Double.parseDouble(this.f31580k0)));
                this.f31551T0.setSubAddress(this.f31592q0);
                this.f31551T0.setAddress(this.f31584m0);
                this.f31551T0.setBookmark(false);
                m51114b(true, true, true, true);
                return;
            }
            mo39494a(true, false, intent.getExtras().getString(C11644i.f33415t1), 3, false, true);
        } else if (i == 1011 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public void onClick(View view) {
        String str = "";
        int i = 1;
        switch (view.getId()) {
            case C10232R.C10236id.bgSendOrder /*2131361933*/:
                m51143i0();
                return;
            case C10232R.C10236id.btnTooltipDone /*2131361987*/:
                C15792c cVar = this.f31534K1;
                if (cVar != null && cVar.mo52000b()) {
                    boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
                    this.f29642a.mo23468C().mo23448a(booleanValue ? C11644i.f33320h7 : C11644i.f33329i7, Boolean.valueOf(true));
                    this.f31534K1.mo51999a();
                    m51133f(booleanValue);
                    return;
                }
                return;
            case C10232R.C10236id.ivBack /*2131362731*/:
                onBackPressed();
                return;
            case C10232R.C10236id.ivDropOffStar /*2131362778*/:
                if (this.f32098T) {
                    i = 3;
                }
                m51110b(i, this.f31561a1.getText().toString());
                return;
            case C10232R.C10236id.ivPickUpStar /*2131362834*/:
                m51110b(2, this.f31559Z0.getText().toString());
                return;
            case C10232R.C10236id.llDeliveryTime /*2131363020*/:
                if (this.f31548R1.equals(str)) {
                    this.f31548R1 = this.f31596s0.getText().toString().trim();
                }
                if (this.f31581k1.getVisibility() == 8) {
                    m51131e0();
                    return;
                }
                return;
            case C10232R.C10236id.llDropOffLocation /*2131363037*/:
                this.f31552T1 = true;
                if (this.f31546Q1.equals(str)) {
                    this.f31546Q1 = this.f31561a1.getText().toString().trim();
                }
                if (m51119c(false).size() > 0) {
                    m51139h(false);
                    return;
                } else if (!this.f29642a.mo23468C().mo23450a(C11644i.f33329i7)) {
                    m51147j(false);
                    return;
                } else {
                    m51133f(false);
                    return;
                }
            case C10232R.C10236id.llLeft /*2131363064*/:
                onBackPressed();
                return;
            case C10232R.C10236id.llPickUpLocation /*2131363123*/:
                this.f31550S1 = true;
                if (this.f31544P1.equals(str)) {
                    this.f31544P1 = this.f31559Z0.getText().toString().trim();
                }
                if (m51119c(true).size() > 0) {
                    m51139h(true);
                    return;
                } else if (!this.f29642a.mo23468C().mo23450a(C11644i.f33320h7)) {
                    m51147j(true);
                    return;
                } else {
                    m51133f(true);
                    return;
                }
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_menu_create_order_2);
        m51079W();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (!this.f31568e0) {
            try {
                if (C11644i.f33437w) {
                    this.f31564c0.mo39863a(this.f32097S.f16955b.getShop().getVName(), this.f31566d0, String.valueOf(this.f32097S.f16955b.getShop().getDistance()), this.f31564c0.mo39860a());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (C11644i.f33302f7) {
            C11728i.m52794a(this);
        }
    }

    /* renamed from: e */
    private View m51130e(boolean z) {
        C11551e a = C11551e.m52070a(getLayoutInflater());
        a.f32699t0.setText(m51127d(z));
        a.f32695p0.setText(getString(C10232R.string.lbl_ok_got_it));
        a.f32695p0.setTag(Boolean.valueOf(z));
        a.f32695p0.setOnClickListener(this);
        return a.mo5538m();
    }

    /* renamed from: f */
    private void m51133f(boolean z) {
        if (z) {
            m51149k(2);
        } else if (this.f32098T) {
            m51149k(3);
        } else {
            m51149k(1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m51136g(boolean z) {
        CheckDiscountBean checkDiscountBean = this.f31567d1;
        if (checkDiscountBean != null && checkDiscountBean.getDelivery_time_options().size() > 1) {
            this.f31553U0.clear();
            this.f31555V0.clear();
            for (int i = 0; i < this.f31567d1.getDelivery_time_options().size(); i++) {
                this.f31553U0.add(((DeliveryTimeBean) this.f31567d1.getDelivery_time_options().get(i)).getText());
                this.f31555V0.add(((DeliveryTimeBean) this.f31567d1.getDelivery_time_options().get(i)).getValue());
            }
            if (z && this.f31572g0 == null) {
                this.f31556W0 = 0;
                this.f31572g0 = (String) this.f31555V0.get(this.f31556W0);
                m51137g0();
            }
            m51106a0();
        }
        m51077U();
    }

    /* renamed from: h */
    private void m51139h(boolean z) {
        C15792c cVar = this.f31532J1;
        if (cVar == null || !cVar.mo52000b()) {
            View inflate = LayoutInflater.from(this).inflate(C10232R.layout.dialog_location, null);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10232R.C10236id.rvLocation);
            ((LinearLayout) inflate.findViewById(C10232R.C10236id.llMap)).setOnClickListener(new C11374j(this, z));
            WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this);
            wrapContentLinearLayoutManager.mo7000l(1);
            recyclerView.setLayoutManager(wrapContentLinearLayoutManager);
            recyclerView.setItemAnimator(this.f29642a.mo23672x());
            this.f31558Y0 = new C10641n(m51119c(z), new C11293c(z));
            recyclerView.setAdapter(this.f31558Y0);
            this.f31532J1 = new C15800h(this).mo52021a(inflate).mo52031b((View) z ? this.f31604w0 : this.f31606x0).mo52023a(C15801a.outside).mo52024a(C15802b.center).mo52027a();
            this.f31532J1.mo52001c();
        }
    }

    /* renamed from: i */
    private void m51142i(boolean z) {
        ShopDetails shopDetails = this.f32097S.f16955b;
        if (shopDetails == null || shopDetails.getShop() == null) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m51147j(boolean z) {
        C15792c cVar = this.f31534K1;
        if (cVar != null && cVar.mo52000b()) {
            this.f31534K1.mo51999a();
        }
        this.f31534K1 = new C15800h(this).mo52035c(m51130e(z)).mo52031b((View) z ? this.f31604w0 : this.f31606x0).mo52023a(C15801a.none).mo52024a(C15802b.center).mo52027a();
        this.f31534K1.mo52001c();
    }

    /* renamed from: k */
    private void m51149k(int i) {
        String str = "p_lng";
        String str2 = "p_lat";
        String str3 = "location";
        if (i == 1) {
            Intent intent = new Intent(this, PicOrderLocationActivityRevisedOrder.class);
            if (this.f31582l0 != null) {
                intent.putExtra(str2, this.f31580k0);
                intent.putExtra(str, this.f31582l0);
            }
            intent.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_delivery_location));
            intent.putExtra(C11644i.f33155O1, true);
            intent.putExtra(str3, i);
            startActivityForResult(intent, C11644i.f33414t0);
            overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        } else if (i == 2) {
            Intent intent2 = new Intent(this, PicOrderLocationActivityRevisedOrder.class);
            String str4 = this.f31574h0;
            if (str4 != null) {
                intent2.putExtra(str2, str4);
                intent2.putExtra(str, this.f31576i0);
            }
            intent2.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_pickup_location));
            intent2.putExtra(C11644i.f33155O1, true);
            intent2.putExtra(str3, i);
            startActivityForResult(intent2, C11644i.f33422u0);
            overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        } else if (i == 3) {
            Intent intent3 = new Intent(this, PicOrderLocationActivityRevisedOrder.class);
            if (this.f31582l0 != null) {
                intent3.putExtra(str2, this.f31580k0);
                intent3.putExtra(str, this.f31582l0);
            }
            intent3.putExtra(C11644i.f33391q1, getString(C10232R.string.lbl_dropoff_location));
            intent3.putExtra(C11644i.f33155O1, true);
            intent3.putExtra(str3, i);
            startActivityForResult(intent3, C11644i.f33438w0);
            overridePendingTransition(C10232R.anim.slide_up_activity_new, C10232R.anim.slide_no_change);
        }
    }

    /* renamed from: d */
    private SpannableStringBuilder m51127d(boolean z) {
        SpannableStringBuilder spannableStringBuilder = this.f31540N1;
        if (spannableStringBuilder == null) {
            this.f31540N1 = new SpannableStringBuilder(getString(C10232R.string.lbl_you_can_select_your));
        } else {
            spannableStringBuilder.clear();
            this.f31540N1.append(getString(C10232R.string.lbl_you_can_select_your));
        }
        SpannableString spannableString = new SpannableString(getString(z ? C10232R.string.lbl_pickup : C10232R.string.lbl_drop_off));
        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
        SpannableStringBuilder spannableStringBuilder2 = this.f31540N1;
        String str = C3868i.f12248b;
        spannableStringBuilder2.append(str);
        this.f31540N1.append(spannableString);
        this.f31540N1.append(str);
        this.f31540N1.append(getString(C10232R.string.lbl_location_from_here));
        return this.f31540N1;
    }

    /* renamed from: c */
    private List<BookmarkPlaceBean> m51119c(boolean z) {
        List delivery;
        ArrayList arrayList = new ArrayList();
        if (z) {
            try {
                delivery = this.f31567d1.getBookmarks().getPickup();
            } catch (Exception unused) {
                return arrayList;
            }
        } else if (this.f32098T) {
            delivery = this.f31567d1.getBookmarks().getDropoff();
        } else {
            delivery = this.f31567d1.getBookmarks().getDelivery();
        }
        return delivery;
    }

    /* renamed from: b */
    public void mo39145b(int i, int i2) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
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
            textView2.setOnClickListener(new C11307q(dialog, i, i2));
            textView3.setOnClickListener(new C11308r(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36511f(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -574844939(0xffffffffddbc8ff5, float:-1.6984185E18)
            r2 = 1
            if (r0 == r1) goto L_0x001a
            r1 = 1331902389(0x4f6337b5, float:3.81207885E9)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "placeNewOrder"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "checkDiscountOptions"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == 0) goto L_0x0039
            if (r4 == r2) goto L_0x002a
            goto L_0x0039
        L_0x002a:
            com.mrsool.bean.PostOrder r4 = r3.f31570f0
            java.lang.String r4 = r4.getMessage()
            com.mrsool.bean.PostOrder r0 = r3.f31570f0
            java.lang.Boolean r0 = r0.getShowFailPopup()
            r3.mo39143a(r4, r0)
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.shopmenu.MenuOrderActivityStep2.mo36511f(java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m51121c(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31574h0 = this.f31549S0.getLatitude().toString();
        this.f31576i0 = this.f31549S0.getLongitude().toString();
        this.f31578j0 = this.f31549S0.getAddress();
        this.f31590p0 = this.f31549S0.getSubAddress();
        m51103a(true, this.f31549S0.isBookmark());
        String string = getString(C10232R.string.lbl_pickup);
        if (this.f31549S0.isBookmark()) {
            string = this.f31549S0.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("0 ");
            sb.append(this.f31549S0.getName());
            sb.append(" | ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m51146j(2));
            sb3.append(this.f31578j0);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append(sb4);
            SpannableString spannableString = new SpannableString(sb5.toString());
            Drawable c = C0841b.m4928c(this, C10232R.C10235drawable.img_yellow_star_fill);
            c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
            spannableString.setSpan(new C11738n(c), 0, 1, 34);
            spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
            spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
            this.f31559Z0.setText(spannableString);
        } else {
            TextView textView = this.f31559Z0;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m51146j(2));
            sb6.append(this.f31578j0);
            textView.setText(sb6.toString());
        }
        m51075S();
        if (!(this.f31571f1 == null || this.f32097S == null || this.f29642a == null)) {
            Marker marker = this.f31573g1;
            if (marker != null) {
                marker.remove();
            }
            this.f31573g1 = this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51089a(true, string)))).position(new LatLng(Double.parseDouble(this.f31574h0), Double.parseDouble(this.f31576i0))).anchor(0.5f, 1.0f));
            m51140h0();
        }
        if (z) {
            StringBuilder sb7 = new StringBuilder();
            String str = "";
            sb7.append(str);
            sb7.append(this.f31574h0);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(this.f31576i0);
            m51104a(z2, z3, sb8, sb9.toString(), this.f31580k0, this.f31582l0, z4);
        }
        mo39138M();
    }

    /* renamed from: j */
    private String m51146j(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !TextUtils.isEmpty(this.f31592q0)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f31592q0);
                    sb.append(this.f31523F0);
                    return sb.toString();
                }
            } else if (!TextUtils.isEmpty(this.f31590p0)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f31590p0);
                sb2.append(this.f31523F0);
                return sb2.toString();
            }
        } else if (!TextUtils.isEmpty(this.f31588o0)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f31588o0);
            sb3.append(this.f31523F0);
            return sb3.toString();
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public View m51087a(Bitmap bitmap, BranchBean branchBean) {
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
            boolean z = this.f31536L1;
            int i2 = C10232R.C10234color.color_green_2;
            circleImageView.setBorderColor(C0841b.m4915a((Context) this, z ? C10232R.C10234color.color_green_2 : C10232R.C10234color.sky_blue_color));
            a.f32681s0.setText(branchBean.getTitle());
            a.f32681s0.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            a.f32678p0.setBackgroundResource(this.f31536L1 ? C10232R.C10235drawable.bg_map_new_order_pin_pickup : C10232R.C10235drawable.bg_map_new_order_pin_dropoff);
            AppCompatImageView appCompatImageView2 = a.f32680r0;
            if (!this.f31536L1) {
                i2 = C10232R.C10234color.sky_blue_color;
            }
            C1113f.m6334a((ImageView) appCompatImageView2, ColorStateList.valueOf(C0841b.m4915a((Context) this, i2)));
        } catch (Exception unused) {
        }
        return a.mo5538m();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public int m51145j(String str) {
        for (int i = 0; i < this.f31553U0.size(); i++) {
            if (((String) this.f31553U0.get(i)).equalsIgnoreCase(str)) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int m51085a(List<BookmarkPlaceBean> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            if (((BookmarkPlaceBean) list.get(i)).getId().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m51110b(int i, String str) {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_bookmark_location);
        dialog.setCancelable(true);
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        MaterialButton materialButton = (MaterialButton) dialog.findViewById(C10232R.C10236id.tvSave);
        MaterialButton materialButton2 = (MaterialButton) dialog.findViewById(C10232R.C10236id.tvCancel);
        MaterialButton materialButton3 = (MaterialButton) dialog.findViewById(C10232R.C10236id.btnHome);
        MaterialButton materialButton4 = (MaterialButton) dialog.findViewById(C10232R.C10236id.btnOffice);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvAddress)).setText(str);
        EditText editText = (EditText) dialog.findViewById(C10232R.C10236id.edtTagName);
        materialButton.setOnClickListener(new C11373i(this, editText, dialog, i));
        materialButton2.setOnClickListener(new C11376l(dialog));
        materialButton3.setOnClickListener(new C11314e(this, dialog, i, materialButton3));
        materialButton4.setOnClickListener(new C11371g(this, dialog, i, materialButton4));
        editText.addTextChangedListener(new C11291a(materialButton));
        if (!isFinishing() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: a */
    private void m51104a(boolean z, boolean z2, String str, String str2, String str3, String str4, boolean z3) {
        if (!isFinishing()) {
            C5887x xVar = this.f29642a;
            if (xVar != null && xVar.mo23502X()) {
                if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    String str5 = "null";
                    if (!str.equalsIgnoreCase(str5) && !str2.equalsIgnoreCase(str5) && !str3.equalsIgnoreCase(str5) && !str4.equalsIgnoreCase(str5)) {
                        if (z && !z3) {
                            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("current_user_id", this.f29642a.mo23476G());
                        hashMap.put("auth_token", this.f29642a.mo23640m());
                        hashMap.put(C11687c.f33862z0, this.f32097S.f16955b.getShop().getVShopId());
                        hashMap.put(C11687c.f33727T0, String.valueOf(this.f32097S.f16955b.getShop().isManualBranchSelect()));
                        hashMap.put(C11687c.f33792h2, str);
                        hashMap.put(C11687c.f33796i2, str2);
                        hashMap.put(C11687c.f33800j2, str3);
                        hashMap.put(C11687c.f33804k2, str4);
                        StringBuilder sb = new StringBuilder();
                        sb.append("param: ");
                        sb.append(hashMap);
                        C5880q.m25751b(sb.toString());
                        C11687c.m52645a(this.f29642a).getDeliveryTimeWindow(hashMap).enqueue(new C11306p(z2, z3));
                        return;
                    }
                }
                if (z2 && !z3) {
                    this.f29642a.mo23492O();
                }
                m51077U();
                mo39138M();
            }
        }
    }

    /* renamed from: k */
    private boolean m51150k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f29642a.mo23615f(getResources().getString(C10232R.string.lbl_enter_name), getResources().getString(C10232R.string.app_name));
            return false;
        } else if (!this.f29642a.mo23497S()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51097a(BranchBean branchBean) {
        if (!isFinishing()) {
            try {
                if (this.f31579j1.size() >= 1) {
                    ((Marker) this.f31579j1.get(0)).remove();
                    this.f31579j1.set(0, this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51087a(this.f31589o1, branchBean)))).position(new LatLng(branchBean.getLatitude().doubleValue(), branchBean.getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                } else {
                    this.f31579j1.add(this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51087a(this.f31589o1, branchBean)))).position(new LatLng(branchBean.getLatitude().doubleValue(), branchBean.getLongitude().doubleValue())).anchor(0.5f, 1.0f)));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo39146b(Dialog dialog, int i, MaterialButton materialButton, View view) {
        dialog.dismiss();
        m51094a(i, materialButton.getText().toString());
        this.f29642a.mo23494P();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51114b(boolean z, boolean z2, boolean z3, boolean z4) {
        if (!isFinishing()) {
            this.f31580k0 = this.f31551T0.getLatitude().toString();
            this.f31582l0 = this.f31551T0.getLongitude().toString();
            this.f31584m0 = this.f31551T0.getAddress();
            this.f31592q0 = this.f31551T0.getSubAddress();
            m51103a(false, this.f31551T0.isBookmark());
            String string = getString(C10232R.string.lbl_delivery);
            if (this.f31551T0.isBookmark()) {
                string = this.f31551T0.getName();
                StringBuilder sb = new StringBuilder();
                sb.append("0 ");
                sb.append(this.f31551T0.getName());
                sb.append(" | ");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m51146j(3));
                sb3.append(this.f31584m0);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb2);
                sb5.append(sb4);
                SpannableString spannableString = new SpannableString(sb5.toString());
                Drawable c = C0841b.m4928c(this, C10232R.C10235drawable.img_yellow_star_fill);
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                spannableString.setSpan(new C11738n(c), 0, 1, 34);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
                this.f31561a1.setText(spannableString);
            } else {
                TextView textView = this.f31561a1;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(m51146j(3));
                sb6.append(this.f31584m0);
                textView.setText(sb6.toString());
            }
            this.f31561a1.setVisibility(0);
            if (!(this.f31571f1 == null || this.f32097S == null || this.f29642a == null)) {
                try {
                    if (this.f31575h1 != null) {
                        this.f31575h1.remove();
                    }
                    this.f31575h1 = this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51089a(false, string)))).position(new LatLng(Double.parseDouble(this.f31580k0), Double.parseDouble(this.f31582l0))).anchor(0.5f, 1.0f));
                    m51140h0();
                } catch (Exception unused) {
                }
            }
            m51075S();
            if (z) {
                StringBuilder sb7 = new StringBuilder();
                String str = "";
                sb7.append(str);
                sb7.append(this.f31574h0);
                String sb8 = sb7.toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(this.f31576i0);
                m51104a(z2, z3, sb8, sb9.toString(), this.f31580k0, this.f31582l0, z4);
            }
            mo39138M();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51095a(int i, String str, int i2) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put(C11687c.f33782f2, str);
            C11687c.m52645a(this.f29642a).callDeleteLocationBookmark(this.f29642a.mo23476G(), hashMap).enqueue(new C11309s(i, i2, str));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo39142a(EditText editText, Dialog dialog, int i, View view) {
        if (m51150k(editText.getText().toString().trim())) {
            dialog.dismiss();
            m51094a(i, editText.getText().toString().trim());
            this.f29642a.mo23494P();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo39141a(Dialog dialog, int i, MaterialButton materialButton, View view) {
        dialog.dismiss();
        m51094a(i, materialButton.getText().toString());
        this.f29642a.mo23494P();
    }

    /* renamed from: a */
    private void m51094a(int i, String str) {
        C5887x xVar = this.f29642a;
        if (xVar != null && xVar.mo23502X()) {
            this.f29642a.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("auth_token", this.f29642a.mo23640m());
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
                sb2.append(this.f31584m0);
                hashMap.put(str6, sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(this.f31580k0);
                hashMap.put(str5, sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(this.f31582l0);
                hashMap.put(str4, sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append(this.f31588o0);
                hashMap.put(str3, sb5.toString());
            } else if (i == 2) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str2);
                sb6.append(this.f31578j0);
                hashMap.put(str6, sb6.toString());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str2);
                sb7.append(this.f31574h0);
                hashMap.put(str5, sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                sb8.append(this.f31576i0);
                hashMap.put(str4, sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str2);
                sb9.append(this.f31590p0);
                hashMap.put(str3, sb9.toString());
            } else if (i == 3) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str2);
                sb10.append(this.f31584m0);
                hashMap.put(str6, sb10.toString());
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str2);
                sb11.append(this.f31580k0);
                hashMap.put(str5, sb11.toString());
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str2);
                sb12.append(this.f31582l0);
                hashMap.put(str4, sb12.toString());
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str2);
                sb13.append(this.f31592q0);
                hashMap.put(str3, sb13.toString());
            }
            C11687c.m52645a(this.f29642a).callSaveLocationBookmark(this.f29642a.mo23476G(), hashMap).enqueue(new C11292b(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51113b(String str, String str2) {
        try {
            this.f31611z1.mo39847a(this.f32097S.f16955b.getShop().getVShopId());
            this.f31611z1.mo39850a(this.f32097S.f16955b.getShop().getVShopId(), this.f32097S.f16955b.getShop().getVName(), str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo39144a(boolean z, View view) {
        this.f31532J1.mo51999a();
        m51133f(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51105a(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f31580k0 = this.f31547R0.getLatitude().toString();
        this.f31582l0 = this.f31547R0.getLongitude().toString();
        this.f31584m0 = this.f31547R0.getAddress();
        this.f31588o0 = this.f31547R0.getSubAddress();
        m51103a(false, this.f31547R0.isBookmark());
        String str = "";
        if (this.f31547R0.getDeliveryArea().equals(str)) {
            BookmarkPlaceBean bookmarkPlaceBean = this.f31547R0;
            bookmarkPlaceBean.setDeliveryArea(bookmarkPlaceBean.getAddress());
            this.f31586n0 = this.f31547R0.getAddress();
        }
        String string = getString(C10232R.string.lbl_delivery);
        if (this.f31547R0.isBookmark()) {
            string = this.f31547R0.getName();
            StringBuilder sb = new StringBuilder();
            sb.append("0 ");
            sb.append(this.f31547R0.getName());
            sb.append(" | ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m51146j(1));
            sb3.append(this.f31584m0);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append(sb4);
            SpannableString spannableString = new SpannableString(sb5.toString());
            Drawable c = C0841b.m4928c(this, C10232R.C10235drawable.img_yellow_star_fill);
            c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
            spannableString.setSpan(new C11738n(c), 0, 1, 34);
            spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.yellow_6)), 1, sb2.length() - 2, 33);
            spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a((Context) this, (int) C10232R.C10234color.light_gray_9)), sb2.length() - 2, sb2.length(), 33);
            this.f31561a1.setText(spannableString);
        } else {
            TextView textView = this.f31561a1;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(m51146j(1));
            sb6.append(this.f31584m0);
            textView.setText(sb6.toString());
        }
        m51075S();
        this.f31561a1.setVisibility(0);
        if (!(this.f31571f1 == null || this.f32097S == null || this.f29642a == null)) {
            Marker marker = this.f31577i1;
            if (marker != null) {
                marker.remove();
            }
            this.f31577i1 = this.f31571f1.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(mo39140a((Context) this, m51089a(false, string)))).position(new LatLng(Double.parseDouble(this.f31580k0), Double.parseDouble(this.f31582l0))).anchor(0.5f, 1.0f));
            m51140h0();
        }
        if (z) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str);
            sb7.append(this.f32097S.f16955b.getShop().getLatitude());
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(this.f32097S.f16955b.getShop().getLongitude());
            m51104a(z2, z3, sb8, sb9.toString(), this.f31580k0, this.f31582l0, z4);
        }
        mo39138M();
    }

    /* renamed from: a */
    public Bitmap mo39140a(Context context, View view) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        view.setLayoutParams(new LayoutParams(-2, -2));
        view.measure(displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.layout(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        view.buildDrawingCache();
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        if (this.f31583l1 < createBitmap.getHeight()) {
            this.f31583l1 = createBitmap.getHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("maxMarkerHeight : ");
            sb.append(this.f31583l1);
            sb.toString();
        }
        if (this.f31585m1 < createBitmap.getWidth()) {
            this.f31585m1 = createBitmap.getWidth();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("maxMarkerWidth : ");
            sb2.append(this.f31585m1);
            sb2.toString();
        }
        return createBitmap;
    }

    /* renamed from: a */
    private void m51103a(boolean z, boolean z2) {
        if (z && this.f31598t0.getVisibility() == 0 && this.f31598t0.isEnabled()) {
            this.f31563b1.setVisibility(0);
            if (z2) {
                this.f31563b1.setVisibility(8);
            }
        } else if (this.f31600u0.getVisibility() == 0 && this.f31600u0.isEnabled()) {
            this.f31565c1.setVisibility(0);
            if (z2) {
                this.f31565c1.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public void mo39117a(Response<CheckDiscountBean> response) {
        this.f31567d1 = (CheckDiscountBean) response.body();
        m51136g(false);
        m51082Z();
    }

    /* renamed from: a */
    public void mo39118a(Response<CheckDiscountBean> response, String str, int i) {
        this.f29642a.mo23492O();
        this.f31567d1.getBookmarks().setPickup(((CheckDiscountBean) response.body()).getBookmarks().getPickup());
        this.f31567d1.getBookmarks().setDropoff(((CheckDiscountBean) response.body()).getBookmarks().getDropoff());
        this.f31567d1.getBookmarks().setDelivery(((CheckDiscountBean) response.body()).getBookmarks().getDelivery());
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && this.f31600u0.getVisibility() == 0 && this.f31600u0.isEnabled()) {
                    if (this.f31567d1.getBookmarks().getDropoff().size() == 0) {
                        C15792c cVar = this.f31532J1;
                        if (cVar != null && cVar.mo52000b()) {
                            this.f31532J1.mo51999a();
                        }
                    }
                    C15792c cVar2 = this.f31532J1;
                    if (cVar2 != null && cVar2.mo52000b()) {
                        C10641n nVar = this.f31558Y0;
                        if (nVar != null) {
                            nVar.mo38037a(this.f31567d1.getBookmarks().getDropoff());
                            this.f31558Y0.mo7341e();
                            this.f31538M1.postDelayed(new C11370f(this), 500);
                        }
                    }
                }
            } else if (this.f31598t0.getVisibility() == 0 && this.f31598t0.isEnabled()) {
                if (this.f31567d1.getBookmarks().getPickup().size() == 0) {
                    C15792c cVar3 = this.f31532J1;
                    if (cVar3 != null && cVar3.mo52000b()) {
                        this.f31532J1.mo51999a();
                    }
                }
                C15792c cVar4 = this.f31532J1;
                if (cVar4 != null && cVar4.mo52000b()) {
                    C10641n nVar2 = this.f31558Y0;
                    if (nVar2 != null) {
                        nVar2.mo38037a(this.f31567d1.getBookmarks().getPickup());
                        this.f31558Y0.mo7341e();
                        this.f31538M1.postDelayed(new C11375k(this), 500);
                    }
                }
            }
        } else if (this.f31600u0.getVisibility() == 0 && this.f31600u0.isEnabled()) {
            if (this.f31567d1.getBookmarks().getDelivery().size() == 0) {
                C15792c cVar5 = this.f31532J1;
                if (cVar5 != null && cVar5.mo52000b()) {
                    this.f31532J1.mo51999a();
                }
            }
            C15792c cVar6 = this.f31532J1;
            if (cVar6 != null && cVar6.mo52000b()) {
                C10641n nVar3 = this.f31558Y0;
                if (nVar3 != null) {
                    nVar3.mo38037a(this.f31567d1.getBookmarks().getDelivery());
                    this.f31558Y0.mo7341e();
                    this.f31538M1.postDelayed(new C11372h(this), 500);
                }
            }
        }
        String str2 = "-1";
        if (this.f31598t0.getVisibility() == 0 && this.f31598t0.isEnabled()) {
            if (!this.f31535L0.equals(str2)) {
                this.f31529I0 = m51085a(this.f31567d1.getBookmarks().getPickup(), this.f31535L0);
            }
            if (this.f31529I0 != -1) {
                this.f31549S0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getPickup().get(this.f31529I0);
                this.f31549S0.setBookmark(true);
            } else {
                this.f31535L0 = str2;
                this.f31549S0.setBookmark(false);
            }
            m51121c(false, false, true, false);
        }
        if (this.f31600u0.getVisibility() == 0 && this.f31600u0.isEnabled()) {
            if (this.f32098T) {
                if (!this.f31533K0.equals(str2)) {
                    this.f31527H0 = m51085a(this.f31567d1.getBookmarks().getDropoff(), this.f31533K0);
                }
                if (this.f31527H0 != -1) {
                    this.f31551T0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getDropoff().get(this.f31527H0);
                    this.f31551T0.setBookmark(true);
                } else {
                    this.f31533K0 = str2;
                    this.f31551T0.setBookmark(false);
                }
                m51114b(false, false, true, false);
                return;
            }
            if (!this.f31537M0.equals(str2)) {
                this.f31531J0 = m51085a(this.f31567d1.getBookmarks().getDelivery(), this.f31537M0);
            }
            if (this.f31531J0 != -1) {
                this.f31547R0 = (BookmarkPlaceBean) this.f31567d1.getBookmarks().getDelivery().get(this.f31531J0);
                this.f31547R0.setBookmark(true);
            } else {
                this.f31537M0 = str2;
                this.f31547R0.setBookmark(false);
            }
            m51105a(false, false, true, false);
        }
    }

    /* renamed from: a */
    public void mo39143a(String str, Boolean bool) {
        setResult(-1);
        startActivityForResult(new Intent(this, OrderSentActivity.class), 1011);
        finish();
    }

    /* renamed from: a */
    private View m51089a(boolean z, String str) {
        C11547a a = C11547a.m52045a(getLayoutInflater());
        boolean R = this.f29642a.mo23496R();
        a.mo39684b(Boolean.valueOf(z));
        a.f32681s0.setText(str);
        int i = z ? C10232R.C10235drawable.ic_pin_pickup_new : C10232R.C10235drawable.ic_pin_dropoff_new;
        CustomeTextViewRobotoRegular customeTextViewRobotoRegular = a.f32681s0;
        int i2 = R ? 0 : i;
        if (!R) {
            i = 0;
        }
        customeTextViewRobotoRegular.setCompoundDrawablesWithIntrinsicBounds(i2, 0, i, 0);
        a.f32678p0.setBackgroundResource(z ? C10232R.C10235drawable.bg_map_new_order_pin_pickup : C10232R.C10235drawable.bg_map_new_order_pin_dropoff);
        C1113f.m6334a((ImageView) a.f32680r0, ColorStateList.valueOf(C0841b.m4915a((Context) this, z ? C10232R.C10234color.color_green_2 : C10232R.C10234color.sky_blue_color)));
        return a.mo5538m();
    }
}
