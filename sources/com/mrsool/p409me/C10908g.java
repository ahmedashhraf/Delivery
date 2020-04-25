package com.mrsool.p409me;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.fragment.app.Fragment;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.MainActivity;
import com.mrsool.bean.CourierBadgeBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.UserDetail;
import com.mrsool.coupon.AddNewCouponActivity;
import com.mrsool.coupon.MyCouponsActivity;
import com.mrsool.p409me.C10881d.C10888f;
import com.mrsool.p409me.C10889e.C10896f;
import com.mrsool.review.UserReviewListActivity;
import com.mrsool.socket.LocationService;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C11694e;
import com.mrsool.utils.webservice.C5882b;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.g */
/* compiled from: MeFragment */
public class C10908g extends Fragment implements OnClickListener {

    /* renamed from: A0 */
    private String f30000A0 = "SAR";

    /* renamed from: B0 */
    private TextView f30001B0;

    /* renamed from: C0 */
    private TextView f30002C0;

    /* renamed from: D0 */
    private TextView f30003D0;

    /* renamed from: E0 */
    private TextView f30004E0;

    /* renamed from: F0 */
    private BroadcastReceiver f30005F0 = new C10911c();

    /* renamed from: N */
    private C11669t f30006N;

    /* renamed from: O */
    private AppSingleton f30007O;

    /* renamed from: P */
    private View f30008P;

    /* renamed from: Q */
    private RatingBar f30009Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public TextView f30010R;

    /* renamed from: S */
    private TextView f30011S;

    /* renamed from: T */
    private TextView f30012T;

    /* renamed from: U */
    private TextView f30013U;

    /* renamed from: V */
    private TextView f30014V;

    /* renamed from: W */
    private TextView f30015W;

    /* renamed from: X */
    private TextView f30016X;

    /* renamed from: Y */
    private TextView f30017Y;

    /* renamed from: Z */
    private TextView f30018Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f30019a;

    /* renamed from: a0 */
    private TextView f30020a0;

    /* renamed from: b */
    private Context f30021b;

    /* renamed from: b0 */
    private TextView f30022b0;

    /* renamed from: c0 */
    private TextView f30023c0;

    /* renamed from: d0 */
    private ImageView f30024d0;

    /* renamed from: e0 */
    private ImageView f30025e0;

    /* renamed from: f0 */
    private ImageView f30026f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public ImageView f30027g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public ImageView f30028h0;

    /* renamed from: i0 */
    private ImageView f30029i0;

    /* renamed from: j0 */
    private LinearLayout f30030j0;

    /* renamed from: k0 */
    private LinearLayout f30031k0;

    /* renamed from: l0 */
    private RelativeLayout f30032l0;

    /* renamed from: m0 */
    private RelativeLayout f30033m0;

    /* renamed from: n0 */
    private RelativeLayout f30034n0;

    /* renamed from: o0 */
    private RelativeLayout f30035o0;

    /* renamed from: p0 */
    private RelativeLayout f30036p0;

    /* renamed from: q0 */
    private RelativeLayout f30037q0;

    /* renamed from: r0 */
    private RelativeLayout f30038r0;

    /* renamed from: s0 */
    private RelativeLayout f30039s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public RelativeLayout f30040t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public ProgressBar f30041u0;
    /* access modifiers changed from: private */

    /* renamed from: v0 */
    public String f30042v0 = C5887x.m25783B0();
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public String f30043w0 = C5887x.m25782A0();

    /* renamed from: x0 */
    private final String f30044x0 = "verified";

    /* renamed from: y0 */
    private final String f30045y0 = "not_verified";

    /* renamed from: z0 */
    private final String f30046z0 = "";

    /* renamed from: com.mrsool.me.g$a */
    /* compiled from: MeFragment */
    class C10909a extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f30047R;

        C10909a(ImageView imageView, ImageView imageView2) {
            this.f30047R = imageView2;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            try {
                this.f30047R.setScaleType(ScaleType.CENTER_CROP);
                Resources resources = C10908g.this.getResources();
                C10908g.this.f30019a;
                C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
                a.mo4601b(true);
                this.f30047R.setImageDrawable(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.g$b */
    /* compiled from: MeFragment */
    class C10910b implements Callback<DefaultBean> {
        C10910b() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            try {
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("callGetUserDetailAPI");
                    sb.append(th.getMessage());
                    C5880q.m25753d(sb.toString());
                    C10908g.this.f30019a.mo23492O();
                    C10908g.this.f30019a.mo23576b((Context) C10908g.this.getActivity(), C10908g.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            String str = C11644i.f33419t5;
            try {
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    C10908g.this.f30019a.mo23492O();
                    if (!response.isSuccessful() || !C10908g.this.isAdded()) {
                        if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                            C10908g.this.f30019a.mo23576b((Context) C10908g.this.getActivity(), response.message());
                        }
                        if (response.code() == 401) {
                            C10908g.this.f30019a.mo23613e0();
                            return;
                        }
                        return;
                    }
                    String f = C10908g.this.f30019a.mo23468C().mo23459f(str);
                    C10908g.this.f30019a.mo23468C().mo23445a();
                    C5882b.f17031c = null;
                    C11687c.f33764c = null;
                    C10908g.this.m49874w();
                    if (C10908g.this.f30019a.mo23584b(LocationService.class)) {
                        C10908g.this.getActivity().stopService(new Intent(C10908g.this.getActivity(), LocationService.class));
                    }
                    C11694e.m52677u().mo40209e();
                    C10908g.this.f30019a.mo23468C().mo23449a(str, f);
                    Intent intent = new Intent(C10908g.this.getActivity(), MainActivity.class);
                    intent.addFlags(67108864);
                    intent.addFlags(268435456);
                    intent.addFlags(32768);
                    C10908g.this.startActivity(intent);
                    C10908g.this.getActivity().finish();
                }
            } catch (Exception e) {
                C10908g.this.f30019a.mo23492O();
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.g$c */
    /* compiled from: MeFragment */
    class C10911c extends BroadcastReceiver {
        C10911c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                java.lang.String r6 = r7.getAction()
                int r0 = r6.hashCode()
                r1 = -1165142841(0xffffffffba8d54c7, float:-0.0010782712)
                r2 = 0
                r3 = 2
                r4 = 1
                if (r0 == r1) goto L_0x002f
                r1 = -608943255(0xffffffffdbb44369, float:-1.01479228E17)
                if (r0 == r1) goto L_0x0025
                r1 = 718818535(0x2ad84ce7, float:3.842267E-13)
                if (r0 == r1) goto L_0x001b
                goto L_0x0039
            L_0x001b:
                java.lang.String r0 = "broadcast_notificationOnOff"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 2
                goto L_0x003a
            L_0x0025:
                java.lang.String r0 = "profile_pic_changed"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 0
                goto L_0x003a
            L_0x002f:
                java.lang.String r0 = "broadcast_refresh_profile"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 1
                goto L_0x003a
            L_0x0039:
                r6 = -1
            L_0x003a:
                if (r6 == 0) goto L_0x0060
                if (r6 == r4) goto L_0x005a
                if (r6 == r3) goto L_0x0041
                goto L_0x0080
            L_0x0041:
                com.mrsool.me.g r6 = com.mrsool.p409me.C10908g.this
                android.widget.ImageView r6 = r6.f30027g0
                java.lang.String r0 = "isOn"
                boolean r7 = r7.getBooleanExtra(r0, r2)
                if (r7 == 0) goto L_0x0053
                r7 = 2131231607(0x7f080377, float:1.80793E38)
                goto L_0x0056
            L_0x0053:
                r7 = 2131231608(0x7f080378, float:1.8079302E38)
            L_0x0056:
                r6.setImageResource(r7)
                goto L_0x0080
            L_0x005a:
                com.mrsool.me.g r6 = com.mrsool.p409me.C10908g.this
                r6.m49846L()
                goto L_0x0080
            L_0x0060:
                com.mrsool.me.g r6 = com.mrsool.p409me.C10908g.this
                r6.m49845K()
                com.mrsool.me.g r6 = com.mrsool.p409me.C10908g.this
                android.widget.TextView r6 = r6.f30010R
                com.mrsool.bean.UserDetail r7 = com.mrsool.utils.C11644i.f33072D6
                com.mrsool.bean.User r7 = r7.getUser()
                java.lang.String r7 = r7.getVFullName()
                java.lang.String r0 = "\""
                java.lang.String r1 = " "
                java.lang.String r7 = r7.replace(r0, r1)
                r6.setText(r7)
            L_0x0080:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p409me.C10908g.C10911c.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.mrsool.me.g$d */
    /* compiled from: MeFragment */
    class C10912d extends C2550c {
        C10912d(ImageView imageView) {
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            try {
                C10908g.this.f30028h0.setScaleType(ScaleType.CENTER_CROP);
                Resources resources = C10908g.this.getResources();
                C10908g.this.f30019a;
                C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
                a.mo4601b(true);
                C10908g.this.f30028h0.setImageDrawable(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.g$e */
    /* compiled from: MeFragment */
    class C10913e implements C10896f {

        /* renamed from: a */
        final /* synthetic */ C10889e f30052a;

        C10913e(C10889e eVar) {
            this.f30052a = eVar;
        }

        /* renamed from: a */
        public void mo38526a(String str) {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33758a3, str);
            C10908g.this.m49860b(hashMap, null, this.f30052a);
        }
    }

    /* renamed from: com.mrsool.me.g$f */
    /* compiled from: MeFragment */
    class C10914f implements C10888f {

        /* renamed from: a */
        final /* synthetic */ C10881d f30054a;

        C10914f(C10881d dVar) {
            this.f30054a = dVar;
        }

        /* renamed from: a */
        public void mo38515a(String str, String str2) {
            HashMap hashMap = new HashMap();
            hashMap.put(C11687c.f33763b3, str2);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(C11687c.f33768c3, str);
            C10908g.this.m49860b(hashMap, hashMap2, this.f30054a);
        }
    }

    /* renamed from: com.mrsool.me.g$g */
    /* compiled from: MeFragment */
    class C10915g implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ Map f30056a;

        /* renamed from: b */
        final /* synthetic */ Map f30057b;

        /* renamed from: c */
        final /* synthetic */ Object f30058c;

        C10915g(Map map, Map map2, Object obj) {
            this.f30056a = map;
            this.f30057b = map2;
            this.f30058c = obj;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            C10908g.this.f30019a.mo23492O();
            C10908g.this.f30019a.mo23653q0();
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            C10908g.this.f30019a.mo23492O();
            if (!response.isSuccessful()) {
                C10908g.this.f30019a.mo23615f(((DefaultBean) response.body()).getMessage(), C10908g.this.getResources().getString(C10232R.string.app_name));
            } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                C10908g.this.m49860b(this.f30056a, this.f30057b, this.f30058c);
            } else {
                C10908g.this.f30019a.mo23615f(((DefaultBean) response.body()).getMessage(), C10908g.this.getResources().getString(C10232R.string.app_name));
            }
        }
    }

    /* renamed from: com.mrsool.me.g$h */
    /* compiled from: MeFragment */
    class C10916h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30060a;

        C10916h(Dialog dialog) {
            this.f30060a = dialog;
        }

        public void onClick(View view) {
            this.f30060a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.g$i */
    /* compiled from: MeFragment */
    class C10917i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30062a;

        C10917i(Dialog dialog) {
            this.f30062a = dialog;
        }

        public void onClick(View view) {
            this.f30062a.dismiss();
            C10908g.this.m49835A();
        }
    }

    /* renamed from: com.mrsool.me.g$j */
    /* compiled from: MeFragment */
    class C10918j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30064a;

        C10918j(Dialog dialog) {
            this.f30064a = dialog;
        }

        public void onClick(View view) {
            this.f30064a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.g$k */
    /* compiled from: MeFragment */
    class C10919k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30066a;

        C10919k(Dialog dialog) {
            this.f30066a = dialog;
        }

        public void onClick(View view) {
            this.f30066a.dismiss();
            if (C10908g.this.f30019a != null) {
                C10908g.this.f30019a.mo23677z(C10908g.this.f30042v0);
            }
        }
    }

    /* renamed from: com.mrsool.me.g$l */
    /* compiled from: MeFragment */
    class C10920l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30068a;

        C10920l(Dialog dialog) {
            this.f30068a = dialog;
        }

        public void onClick(View view) {
            this.f30068a.dismiss();
        }
    }

    /* renamed from: com.mrsool.me.g$m */
    /* compiled from: MeFragment */
    class C10921m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30070a;

        C10921m(Dialog dialog) {
            this.f30070a = dialog;
        }

        public void onClick(View view) {
            this.f30070a.dismiss();
            if (C10908g.this.f30019a != null) {
                C10908g.this.f30019a.mo23677z(C10908g.this.f30043w0);
            }
        }
    }

    /* renamed from: com.mrsool.me.g$n */
    /* compiled from: MeFragment */
    class C10922n implements Callback<UserDetail> {
        C10922n() {
        }

        public void onFailure(Call<UserDetail> call, Throwable th) {
            try {
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("callGetUserDetailAPI");
                    sb.append(th.getMessage());
                    C5880q.m25753d(sb.toString());
                    C10908g.this.f30041u0.setVisibility(8);
                    C10908g.this.f30019a.mo23591c((Context) C10908g.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<UserDetail> call, Response<UserDetail> response) {
            try {
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    C10908g.this.f30041u0.setVisibility(8);
                    if (!response.isSuccessful() || !C10908g.this.isAdded()) {
                        if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                            C10908g.this.f30019a.mo23576b((Context) C10908g.this.getActivity(), response.message());
                        }
                    } else if (((UserDetail) response.body()).getCode() <= 300) {
                        C11644i.f33072D6 = (UserDetail) response.body();
                        C10908g.this.m49851Q();
                    } else {
                        C10908g.this.f30019a.mo23576b((Context) C10908g.this.getActivity(), ((UserDetail) response.body()).getMessage());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.g$o */
    /* compiled from: MeFragment */
    class C10923o implements Callback<UserDetail> {
        C10923o() {
        }

        public void onFailure(Call<UserDetail> call, Throwable th) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("error message :>> ");
                sb.append(th.getMessage());
                C5880q.m25751b(sb.toString());
                C5880q.m25751b("error ");
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("callGetUserDetailAPI");
                    sb2.append(th.getMessage());
                    C5880q.m25753d(sb2.toString());
                    C10908g.this.f30041u0.setVisibility(8);
                    C10908g.this.f30019a.mo23591c((Context) C10908g.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0094 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(retrofit2.Call<com.mrsool.bean.UserDetail> r3, retrofit2.Response<com.mrsool.bean.UserDetail> r4) {
            /*
                r2 = this;
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00ed
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                boolean r3 = r3.isAdded()     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00ed
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                android.widget.ProgressBar r3 = r3.f30041u0     // Catch:{ Exception -> 0x00e9 }
                r0 = 8
                r3.setVisibility(r0)     // Catch:{ Exception -> 0x00e9 }
                boolean r3 = r4.isSuccessful()     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00b4
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                boolean r3 = r3.isAdded()     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00b4
                java.lang.Object r3 = r4.body()     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.bean.UserDetail r3 = (com.mrsool.bean.UserDetail) r3     // Catch:{ Exception -> 0x00e9 }
                int r3 = r3.getCode()     // Catch:{ Exception -> 0x00e9 }
                r1 = 300(0x12c, float:4.2E-43)
                if (r3 > r1) goto L_0x009a
                java.lang.Object r3 = r4.body()     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.bean.UserDetail r3 = (com.mrsool.bean.UserDetail) r3     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.C11644i.f33072D6 = r3     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                android.widget.RelativeLayout r3 = r3.f30040t0     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.bean.UserDetail r4 = com.mrsool.utils.C11644i.f33072D6     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.bean.User r4 = r4.getUser()     // Catch:{ Exception -> 0x00e9 }
                boolean r4 = r4.shouldShowCourierBadge()     // Catch:{ Exception -> 0x00e9 }
                if (r4 == 0) goto L_0x0052
                r0 = 0
            L_0x0052:
                r3.setVisibility(r0)     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.c.a r3 = com.mrsool.utils.p421c.C11598a.m52263f()     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.me.g r4 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                androidx.fragment.app.c r4 = r4.getActivity()     // Catch:{ Exception -> 0x00e9 }
                r3.mo39810a(r4)     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x0094 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x0094 }
                com.mrsool.utils.v r3 = r3.mo23468C()     // Catch:{ Exception -> 0x0094 }
                java.lang.String r4 = "is_verified"
                com.mrsool.bean.UserDetail r0 = com.mrsool.utils.C11644i.f33072D6     // Catch:{ Exception -> 0x0094 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0094 }
                java.lang.Boolean r0 = r0.getVerified()     // Catch:{ Exception -> 0x0094 }
                r3.mo23448a(r4, r0)     // Catch:{ Exception -> 0x0094 }
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x0094 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x0094 }
                com.mrsool.utils.v r3 = r3.mo23468C()     // Catch:{ Exception -> 0x0094 }
                java.lang.String r4 = "gender"
                com.mrsool.bean.UserDetail r0 = com.mrsool.utils.C11644i.f33072D6     // Catch:{ Exception -> 0x0094 }
                com.mrsool.bean.User r0 = r0.getUser()     // Catch:{ Exception -> 0x0094 }
                java.lang.String r0 = r0.getvGender()     // Catch:{ Exception -> 0x0094 }
                r3.mo23449a(r4, r0)     // Catch:{ Exception -> 0x0094 }
            L_0x0094:
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                r3.m49851Q()     // Catch:{ Exception -> 0x00e9 }
                goto L_0x00ed
            L_0x009a:
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.me.g r0 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                androidx.fragment.app.c r0 = r0.getActivity()     // Catch:{ Exception -> 0x00e9 }
                java.lang.Object r4 = r4.body()     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.bean.UserDetail r4 = (com.mrsool.bean.UserDetail) r4     // Catch:{ Exception -> 0x00e9 }
                java.lang.String r4 = r4.getMessage()     // Catch:{ Exception -> 0x00e9 }
                r3.mo23576b(r0, r4)     // Catch:{ Exception -> 0x00e9 }
                goto L_0x00ed
            L_0x00b4:
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00d7
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                boolean r3 = r3.isAdded()     // Catch:{ Exception -> 0x00e9 }
                if (r3 == 0) goto L_0x00d7
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.me.g r0 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                androidx.fragment.app.c r0 = r0.getActivity()     // Catch:{ Exception -> 0x00e9 }
                java.lang.String r1 = r4.message()     // Catch:{ Exception -> 0x00e9 }
                r3.mo23576b(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            L_0x00d7:
                int r3 = r4.code()     // Catch:{ Exception -> 0x00e9 }
                r4 = 401(0x191, float:5.62E-43)
                if (r3 != r4) goto L_0x00ed
                com.mrsool.me.g r3 = com.mrsool.p409me.C10908g.this     // Catch:{ Exception -> 0x00e9 }
                com.mrsool.utils.x r3 = r3.f30019a     // Catch:{ Exception -> 0x00e9 }
                r3.mo23613e0()     // Catch:{ Exception -> 0x00e9 }
                goto L_0x00ed
            L_0x00e9:
                r3 = move-exception
                r3.printStackTrace()
            L_0x00ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p409me.C10908g.C10923o.onResponse(retrofit2.Call, retrofit2.Response):void");
        }
    }

    /* renamed from: com.mrsool.me.g$p */
    /* compiled from: MeFragment */
    class C10924p implements Callback<CourierBadgeBean> {
        C10924p() {
        }

        public void onFailure(Call<CourierBadgeBean> call, Throwable th) {
            try {
                if (C10908g.this.f30019a != null && C10908g.this.isAdded()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("callGetUserDetailAPI");
                    sb.append(th.getMessage());
                    C5880q.m25753d(sb.toString());
                    C10908g.this.f30019a.mo23492O();
                    C10908g.this.f30019a.mo23576b((Context) C10908g.this.getActivity(), C10908g.this.getString(C10232R.string.msg_error_server_issue));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CourierBadgeBean> call, Response<CourierBadgeBean> response) {
            try {
                if (C10908g.this.isAdded()) {
                    C10908g.this.f30019a.mo23492O();
                    if (!response.isSuccessful()) {
                        C10908g.this.f30019a.mo23487L(response.message());
                    } else if (((CourierBadgeBean) response.body()).getCode().intValue() <= 300) {
                        C10908g.this.m49862c((CourierBadgeBean) response.body());
                    } else {
                        C10908g.this.f30019a.mo23487L(((CourierBadgeBean) response.body()).getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m49835A() {
        C5880q.m25753d("=================  callGetUserDetailAPI =================");
        C5887x xVar = this.f30019a;
        if (xVar != null) {
            xVar.mo23619g(getResources().getString(C10232R.string.app_name), getResources().getString(C10232R.string.lbl_dg_loader_please_wait));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("auth_token", this.f30019a.mo23640m());
        C11687c.m52645a(this.f30019a).LogOut(String.valueOf(this.f30019a.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C10910b());
    }

    /* renamed from: B */
    private void m49836B() {
    }

    /* renamed from: C */
    private int m49837C() {
        C5881v C = this.f30019a.mo23468C();
        String str = C11644i.f33451x5;
        if (C.mo23459f(str).equalsIgnoreCase(C11644i.f33087F5)) {
            return C10232R.C10235drawable.ic_male_profile_place_holder;
        }
        return this.f30019a.mo23468C().mo23459f(str).equalsIgnoreCase(C11644i.f33095G5) ? C10232R.C10235drawable.ic_female_profile_place_holder : C10232R.C10235drawable.ic_profile_place_holder;
    }

    /* renamed from: D */
    private void m49838D() {
        this.f30019a = new C5887x(getActivity());
        this.f30007O = (AppSingleton) getActivity().getApplicationContext();
        this.f30006N = new C11669t(getActivity());
        this.f30021b = this.f30008P.getContext();
        if (VERSION.SDK_INT >= 21) {
            this.f30019a.mo23592c(this.f30008P.findViewById(C10232R.C10236id.llMain));
        }
        m49849O();
        this.f30041u0 = (ProgressBar) this.f30008P.findViewById(C10232R.C10236id.pgMe);
        this.f30030j0 = (LinearLayout) this.f30008P.findViewById(C10232R.C10236id.llTwitter);
        this.f30031k0 = (LinearLayout) this.f30008P.findViewById(C10232R.C10236id.llAddCoupon);
        this.f30031k0.setOnClickListener(this);
        this.f30030j0.setOnClickListener(this);
        this.f30028h0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.imgPicIamge);
        this.f30028h0.setOnClickListener(this);
        this.f30029i0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightCoupons);
        this.f30011S = (TextView) this.f30008P.findViewById(C10232R.C10236id.txtMeHowToVerify);
        this.f30010R = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeName);
        this.f30016X = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeAccountBal);
        this.f30013U = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeTotalDeliveryRev);
        this.f30014V = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeTotalBillPaid);
        this.f30015W = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeOrdersCount);
        this.f30012T = (TextView) this.f30008P.findViewById(C10232R.C10236id.tvCustomerFeedbackCnt);
        this.f30018Z = (TextView) this.f30008P.findViewById(C10232R.C10236id.txtMeAccountVerified);
        this.f30022b0 = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeCouponCount);
        this.f30023c0 = (TextView) this.f30008P.findViewById(C10232R.C10236id.tvMyReviewsCnt);
        this.f30017Y = (TextView) this.f30008P.findViewById(C10232R.C10236id.textMeHowToPay);
        this.f30017Y.setOnClickListener(this);
        this.f30011S.setOnClickListener(this);
        this.f30024d0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivLogout);
        this.f30024d0.setOnClickListener(this);
        this.f30025e0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivAcStatus);
        this.f30026f0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivStatusWaning);
        this.f30027g0 = (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivNotificationBell);
        this.f30027g0.setOnClickListener(this);
        this.f30039s0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlPaymentMethod);
        this.f30039s0.setOnClickListener(this);
        this.f30040t0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlMrsoolId);
        this.f30040t0.setOnClickListener(this);
        this.f30032l0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rvMyreviews);
        this.f30032l0.setOnClickListener(this);
        this.f30033m0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlNoifications);
        this.f30033m0.setOnClickListener(this);
        this.f30034n0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlSettings);
        this.f30034n0.setOnClickListener(this);
        this.f30035o0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlDeliveryRevenue);
        this.f30036p0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlTotalBilledI);
        this.f30037q0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlCoupons);
        this.f30037q0.setOnClickListener(this);
        this.f30038r0 = (RelativeLayout) this.f30008P.findViewById(C10232R.C10236id.rlCustomerFeedback);
        this.f30038r0.setOnClickListener(this);
        this.f30009Q = (RatingBar) this.f30008P.findViewById(C10232R.C10236id.ratingBar_bill);
        if (this.f30019a.mo23478H().equalsIgnoreCase(C11644i.f33183R5)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30042v0);
            String str = "?lang=en";
            sb.append(str);
            this.f30042v0 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f30043w0);
            sb2.append(str);
            this.f30043w0 = sb2.toString();
        }
        String str2 = "http://";
        String str3 = "https://";
        if (!this.f30042v0.startsWith(str2) && !this.f30042v0.startsWith(str3)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str2);
            sb3.append(this.f30042v0);
            this.f30042v0 = sb3.toString();
        }
        if (!this.f30043w0.startsWith(str2) && !this.f30043w0.startsWith(str3)) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(this.f30043w0);
            this.f30043w0 = sb4.toString();
        }
        this.f30019a.mo23575b(this.f30005F0, C11644i.f33272c4, C11644i.f33326i4, C11644i.f33442w4);
        m49846L();
        if (this.f30019a.mo23496R()) {
            this.f30019a.mo23608d(this.f30012T, this.f30023c0, this.f30022b0, this.f30010R);
        }
    }

    /* renamed from: E */
    private void m49839E() {
        startActivity(new Intent(getActivity(), AddNewCouponActivity.class));
    }

    /* renamed from: F */
    private void m49840F() {
        startActivity(new Intent(getActivity(), MyCouponsActivity.class));
    }

    /* renamed from: G */
    private void m49841G() {
        Intent intent = new Intent(getActivity(), NotificationSettingActivity.class);
        intent.setFlags(67108864);
        intent.setFlags(268435456);
        intent.setFlags(32768);
        startActivityForResult(intent, 1008);
    }

    /* renamed from: H */
    private void m49842H() {
        if (C11644i.f33072D6 != null) {
            Intent intent = new Intent(getActivity(), SettingsActivity.class);
            String vFullName = C11644i.f33072D6.getUser().getVFullName();
            String str = C3868i.f12248b;
            String str2 = "\"";
            String str3 = "user_name";
            String str4 = "";
            if (vFullName != null) {
                intent.putExtra(str3, C11644i.f33072D6.getUser().getVFullName().replace(str2, str));
            } else {
                intent.putExtra(str3, str4);
            }
            String str5 = "user_email";
            if (C11644i.f33072D6.getUser().getVEmail() != null) {
                intent.putExtra(str5, C11644i.f33072D6.getUser().getVEmail().replace(str2, str));
            } else {
                intent.putExtra(str5, str4);
            }
            String vPhone = C11644i.f33072D6.getUser().getVPhone();
            String str6 = C11644i.f33387p5;
            if (vPhone != null) {
                intent.putExtra(str6, C11644i.f33072D6.getUser().getVPhone());
            } else {
                intent.putExtra(str6, str4);
            }
            String vProfilePic = C11644i.f33072D6.getUser().getVProfilePic();
            String str7 = C11644i.f33395q5;
            if (vProfilePic != null) {
                intent.putExtra(str7, C11644i.f33072D6.getUser().getVProfilePic());
            } else {
                intent.putExtra(str7, str4);
            }
            getActivity().startActivity(intent);
        }
    }

    /* renamed from: I */
    private void m49843I() {
        Intent intent = new Intent(getActivity(), UserFeedbackActivity.class);
        intent.putExtra(C11644i.f33067D1, C11644i.f33075E1);
        getActivity().startActivity(intent);
    }

    /* renamed from: J */
    private boolean m49844J() {
        UserDetail userDetail = C11644i.f33072D6;
        if (userDetail == null || userDetail.getUser() == null || C11644i.f33072D6.getUser().getbAnnouncement().booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m49845K() {
        if (!getActivity().isFinishing()) {
            ((HomeActivity) getActivity()).mo36530m(C11644i.f33072D6.getUser().getVProfilePic());
            C2232l.m11649c(this.f30021b).mo9515a(C11644i.f33072D6.getUser().getVProfilePic()).mo9441j().m11415e((int) C10232R.C10235drawable.user_profile).m11411d().mo9458b(new C10912d(this.f30028h0));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m49846L() {
        if (!this.f30019a.mo23502X() || !isAdded()) {
            if (isAdded()) {
                m49851Q();
            }
            this.f30041u0.setVisibility(8);
            return;
        }
        m49877z();
    }

    /* renamed from: M */
    private void m49847M() {
        if (C11644i.f33072D6.getUser().getCoupon_count() == null || C11644i.f33072D6.getUser().getCoupon_count().intValue() != 0) {
            this.f30031k0.setVisibility(8);
            this.f30029i0.setVisibility(0);
            this.f30022b0.setVisibility(0);
            TextView textView = this.f30022b0;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11644i.f33072D6.getUser().getCoupon_count());
            textView.setText(sb.toString());
            return;
        }
        this.f30029i0.setVisibility(8);
        this.f30031k0.setVisibility(0);
        this.f30022b0.setVisibility(8);
    }

    /* renamed from: N */
    private void m49848N() {
        this.f30023c0.setText(C11644i.f33072D6.getUser().getServiceReviewsCount());
    }

    /* renamed from: O */
    private void m49849O() {
        this.f30019a.mo23561a((ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightReview), (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightFeed), (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightCoupons), (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightNotification), (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightSetting), (ImageView) this.f30008P.findViewById(C10232R.C10236id.ivArRightPM));
    }

    /* renamed from: P */
    private void m49850P() {
        if (C11644i.f33072D6.getUser().getVerification_status().equalsIgnoreCase("verified")) {
            this.f30018Z.setText(getResources().getString(C10232R.string.lbl_edit_p_account_is_verified));
            this.f30018Z.setTextColor(getResources().getColor(C10232R.C10234color.sky_blue_color));
            this.f30025e0.setBackgroundResource(C10232R.C10235drawable.ic_ac_verified);
            this.f30011S.setText(getResources().getString(C10232R.string.lbl_edit_what_verify));
            this.f30011S.setTextColor(getResources().getColor(C10232R.C10234color.Black));
            this.f30026f0.setVisibility(8);
            return;
        }
        this.f30025e0.setVisibility(8);
        this.f30018Z.setVisibility(8);
        this.f30011S.setVisibility(8);
        this.f30026f0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m49851Q() {
        UserDetail userDetail = C11644i.f33072D6;
        if (userDetail != null) {
            if (!TextUtils.isEmpty(userDetail.getUser().getCurrency())) {
                this.f30000A0 = C11644i.f33072D6.getUser().getCurrency();
            }
            String vFullName = C11644i.f33072D6.getUser().getVFullName();
            String str = C3868i.f12248b;
            if (vFullName != null) {
                this.f30010R.setText(C11644i.f33072D6.getUser().getVFullName().replace("\"", str));
            }
            String str2 = "user_name";
            String str3 = "";
            if (this.f30019a.mo23468C().mo23459f(str2) == null || this.f30019a.mo23468C().mo23459f(str2).length() == 0) {
                this.f30019a.mo23468C().mo23449a(str2, C11644i.f33072D6.getUser().getVFullName() != null ? C11644i.f33072D6.getUser().getVFullName() : str3);
            }
            String str4 = "user_email";
            if (this.f30019a.mo23468C().mo23459f(str4) == null || this.f30019a.mo23468C().mo23459f(str4).length() == 0) {
                this.f30019a.mo23468C().mo23449a(str4, C11644i.f33072D6.getUser().getVFullName() != null ? C11644i.f33072D6.getUser().getVEmail() : str3);
            }
            C5881v C = this.f30019a.mo23468C();
            String str5 = C11644i.f33387p5;
            if (C.mo23459f(str5) == null || this.f30019a.mo23468C().mo23459f(str5).length() == 0) {
                this.f30019a.mo23468C().mo23449a(str5, C11644i.f33072D6.getUser().getVFullName() != null ? C11644i.f33072D6.getUser().getVPhone() : str3);
            }
            TextView textView = this.f30016X;
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(C11644i.f33072D6.getUser().getFAccountBalance());
            sb.append(str);
            sb.append(this.f30000A0);
            textView.setText(sb.toString());
            if (C11644i.f33072D6.getUser().getFTotalDeliveryRevenue().doubleValue() > 0.0d) {
                this.f30035o0.setVisibility(0);
                TextView textView2 = this.f30013U;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(C11644i.f33072D6.getUser().getFTotalDeliveryRevenue());
                sb2.append(str);
                sb2.append(this.f30000A0);
                textView2.setText(sb2.toString());
            } else {
                this.f30035o0.setVisibility(8);
            }
            TextView textView3 = this.f30015W;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(C11644i.f33072D6.getUser().getITotalOrderDelivered());
            sb3.append(str);
            sb3.append(getString(C10232R.string.bottom_menu_orders));
            textView3.setText(sb3.toString());
            TextView textView4 = this.f30012T;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(C11644i.f33072D6.getUser().getFeedbackCount());
            textView4.setText(sb4.toString());
            if (C11644i.f33072D6.getUser() == null || !C11644i.f33072D6.getUser().getShowHowToPay().booleanValue()) {
                this.f30016X.setTextColor(getResources().getColor(C10232R.C10234color.dialog_btn_color));
                this.f30017Y.setVisibility(8);
            } else {
                try {
                    this.f30016X.setTextColor(getResources().getColor(C10232R.C10234color.red_lite_2));
                    this.f30017Y.setVisibility(0);
                    this.f30017Y.setOnClickListener(this);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            m49850P();
            m49848N();
            if (C11644i.f33072D6.getUser().getVProfilePic() != null) {
                m49845K();
            }
            RatingBar ratingBar = this.f30009Q;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str3);
            sb5.append(C11644i.f33072D6.getUser().getFAverageRating());
            ratingBar.setRating(Float.parseFloat(sb5.toString()));
            this.f30027g0.setImageResource(m49844J() ? C10232R.C10235drawable.ic_bell_notification : C10232R.C10235drawable.ic_bell_notification_silent);
            m49847M();
        }
    }

    /* renamed from: c */
    private void m49863c(boolean z) {
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m49874w() {
        C11644i.f33460y6.clear();
        C11644i.f33468z6.clear();
        C11644i.f33048A6.clear();
        C11644i.f33056B6.clear();
        C11644i.f33064C6.clear();
        C11644i.f33072D6 = null;
        C11644i.f33080E6 = 1;
        C11644i.f33112I6 = 0;
        C11644i.f33136L6 = false;
        C11644i.f33144M6 = false;
        C11694e.INSTANCE.mo40209e();
    }

    /* renamed from: x */
    private void m49875x() {
        if (this.f30019a.mo23502X()) {
            this.f30019a.mo23665u0();
            C11687c.m52645a(this.f30019a).getCourierBadgeBean(this.f30019a.mo23476G()).enqueue(new C10924p());
        }
    }

    /* renamed from: y */
    private void m49876y() {
        C5880q.m25753d(" =================  callGetUserDetailAPI ================= ");
        C11687c.m52645a(this.f30019a).getUserDetail(String.valueOf(this.f30019a.mo23468C().mo23459f("user_id"))).enqueue(new C10922n());
    }

    /* renamed from: z */
    private void m49877z() {
        C5880q.m25753d(" =================  callGetUserDetailAPI ================= ");
        C5887x xVar = this.f30019a;
        if (xVar == null || !xVar.mo23566a0()) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30019a.mo23648p().latitude);
            hashMap.put("user_lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30019a.mo23648p().longitude);
            hashMap.put("user_long", sb2.toString());
            C11687c.m52645a(this.f30019a).getUserUpdatedDetail(String.valueOf(this.f30019a.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C10923o());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        String str = "android.intent.extra.ringtone.PICKED_URI";
        if (i2 == -1 && i == 5) {
            Uri uri = (Uri) intent.getParcelableExtra(str);
        }
        if (i2 == -1) {
            if (i == 5) {
                Uri uri2 = (Uri) intent.getParcelableExtra(str);
                StringBuilder sb = new StringBuilder();
                sb.append("ringtone :");
                sb.append(uri2);
                C5880q.m25751b(sb.toString());
            } else if (i == 777) {
                String str2 = "image_path";
                if (intent.getExtras().getString(str2) != null) {
                    this.f30019a.mo23481I(intent.getExtras().getString(str2));
                    C5887x xVar = this.f30019a;
                    xVar.mo23579b(new File(xVar.mo23488M()));
                    C5887x xVar2 = this.f30019a;
                    xVar2.mo23605d(xVar2.mo23511a(xVar2.mo23486L()));
                    if (this.f30019a.mo23484K().getWidth() == 0 || this.f30019a.mo23484K().getHeight() == 0) {
                        this.f30019a.mo23491N(getString(C10232R.string.error_upload_image));
                    } else {
                        this.f30019a.mo23573b((int) C14330v.f42355w);
                        C2232l.m11649c(getActivity().getApplicationContext()).mo9511a(new File(intent.getExtras().getString(str2))).mo9441j().mo9424a(this.f30028h0);
                    }
                }
            } else if (i == 1004) {
                m49846L();
            } else if (i == 1008) {
                m49846L();
            }
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.ivLogout /*2131362809*/:
                mo38539i(getResources().getString(C10232R.string.msg_ask_to_logout));
                return;
            case C10232R.C10236id.ivNotificationBell /*2131362823*/:
                if (this.f30019a.mo23497S()) {
                    m49841G();
                    return;
                }
                return;
            case C10232R.C10236id.llAddCoupon /*2131362956*/:
                if (this.f30019a.mo23497S()) {
                    m49839E();
                    return;
                }
                return;
            case C10232R.C10236id.llTwitter /*2131363185*/:
                try {
                    this.f30019a.mo23542a((Context) getActivity(), getResources().getString(C10232R.string.telegram_url));
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            case C10232R.C10236id.rlCoupons /*2131363457*/:
                if (this.f30019a.mo23497S()) {
                    m49840F();
                    return;
                }
                return;
            case C10232R.C10236id.rlCustomerFeedback /*2131363458*/:
                if (this.f30019a.mo23497S()) {
                    m49843I();
                    return;
                }
                return;
            case C10232R.C10236id.rlMrsoolId /*2131363482*/:
                if (this.f30019a.mo23497S()) {
                    m49875x();
                    return;
                }
                return;
            case C10232R.C10236id.rlPaymentMethod /*2131363486*/:
                startActivity(new Intent(getActivity(), PaymentMethodListActivity.class));
                return;
            case C10232R.C10236id.rlSettings /*2131363492*/:
                if (this.f30019a.mo23497S()) {
                    m49842H();
                    return;
                }
                return;
            case C10232R.C10236id.rvMyreviews /*2131363531*/:
                if (this.f30019a.mo23497S()) {
                    startActivity(new Intent(getActivity(), UserReviewListActivity.class));
                    return;
                }
                return;
            case C10232R.C10236id.textMeHowToPay /*2131363699*/:
                mo38537g(getResources().getString(C10232R.string.msg_how_to_pay));
                return;
            case C10232R.C10236id.txtMeHowToVerify /*2131364101*/:
                UserDetail userDetail = C11644i.f33072D6;
                if (userDetail == null) {
                    return;
                }
                if (userDetail.getUser().getVerification_status().equalsIgnoreCase("verified")) {
                    this.f30019a.mo23615f(getString(C10232R.string.msg_account_verified), getString(C10232R.string.lbl_edit_p_account_is_verified));
                    return;
                } else {
                    mo38538h(getResources().getString(C10232R.string.msg_info_verification));
                    return;
                }
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f30008P = layoutInflater.inflate(C10232R.layout.fragment_btab_me_revised, viewGroup, false);
        m49838D();
        return this.f30008P;
    }

    public void onDestroy() {
        super.onDestroy();
        C5887x xVar = this.f30019a;
        if (xVar != null) {
            xVar.mo23539a(this.f30005F0);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f30006N;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        super.onResume();
        m49846L();
        if (VERSION.SDK_INT >= 21) {
            this.f30019a.mo23592c(this.f30008P.findViewById(C10232R.C10236id.llMain));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49862c(CourierBadgeBean courierBadgeBean) {
        CourierBadgeBean courierBadgeBean2 = courierBadgeBean;
        Dialog a = this.f30019a.mo23508a((int) C10232R.layout.dialog_mrsool_id, true);
        TextView textView = (TextView) a.findViewById(C10232R.C10236id.TvbadgeHeader);
        TextView textView2 = (TextView) a.findViewById(C10232R.C10236id.tvUserFullName);
        TextView textView3 = (TextView) a.findViewById(C10232R.C10236id.tvOrderCount);
        TextView textView4 = (TextView) a.findViewById(C10232R.C10236id.tvStatus);
        TextView textView5 = (TextView) a.findViewById(C10232R.C10236id.tvLblStatus);
        TextView textView6 = (TextView) a.findViewById(C10232R.C10236id.tvLblDate);
        TextView textView7 = (TextView) a.findViewById(C10232R.C10236id.tvActivatedDate);
        TextView textView8 = (TextView) a.findViewById(C10232R.C10236id.tvLblNationalId);
        TextView textView9 = (TextView) a.findViewById(C10232R.C10236id.tvNationalId);
        TextView textView10 = (TextView) a.findViewById(C10232R.C10236id.tvLblSponser);
        this.f30001B0 = (TextView) a.findViewById(C10232R.C10236id.tvSponserName);
        this.f30002C0 = (TextView) a.findViewById(C10232R.C10236id.tvSponserAdd);
        TextView textView11 = (TextView) a.findViewById(C10232R.C10236id.tvLblValidToDate);
        this.f30003D0 = (TextView) a.findViewById(C10232R.C10236id.tvValidDate);
        this.f30004E0 = (TextView) a.findViewById(C10232R.C10236id.tvDateAdd);
        ImageView imageView = (ImageView) a.findViewById(C10232R.C10236id.imgPicIamge);
        TextView textView12 = (TextView) a.findViewById(C10232R.C10236id.tvBadgeFooter);
        RatingBar ratingBar = (RatingBar) a.findViewById(C10232R.C10236id.rbCourier);
        TextView textView13 = textView11;
        TextView textView14 = textView10;
        ImageView imageView2 = (ImageView) a.findViewById(C10232R.C10236id.ivCar);
        RelativeLayout relativeLayout = (RelativeLayout) a.findViewById(C10232R.C10236id.rlDateUntil);
        RelativeLayout relativeLayout2 = (RelativeLayout) a.findViewById(C10232R.C10236id.rlSponser);
        ((FrameLayout) a.findViewById(C10232R.C10236id.flClose)).setOnClickListener(new C10879b(a));
        this.f30002C0.setOnClickListener(new C10880c(this, courierBadgeBean2));
        this.f30004E0.setOnClickListener(new C10878a(this, courierBadgeBean2));
        C2232l.m11649c(this.f30021b).mo9515a(courierBadgeBean.getProfilePictureUrl()).mo9441j().m11415e((int) C10232R.C10235drawable.user_profile).m11411d().mo9458b(new C10909a(imageView, imageView));
        textView.setText(courierBadgeBean.getBadgeHeader());
        textView2.setText(courierBadgeBean.getFullName());
        ratingBar.setRating(courierBadgeBean.getRating().floatValue());
        textView3.setText(courierBadgeBean.getOrdersNumber());
        textView5.setText(courierBadgeBean.getStatusLabel());
        textView4.setText(courierBadgeBean.getStatusValue());
        textView6.setText(courierBadgeBean.getBadgeDateLabel());
        textView7.setText(courierBadgeBean.getBadgeDateValue());
        textView8.setText(courierBadgeBean.getCourierIdLabel());
        textView9.setText(courierBadgeBean.getCourierIdValue());
        textView14.setText(courierBadgeBean.getSponsorLabel());
        textView13.setText(courierBadgeBean.getValidUntilLabel());
        this.f30003D0.setText(courierBadgeBean.getValidUntilValue());
        textView12.setText(courierBadgeBean.getBadgeFooter());
        if (this.f30019a.mo23496R()) {
            this.f30019a.mo23545a(imageView2);
        }
        if (courierBadgeBean.getShowSponsorSection()) {
            relativeLayout2.setVisibility(0);
            if (courierBadgeBean.getShowAddSponsor()) {
                this.f30001B0.setText(courierBadgeBean.getSponsorValueNotAvailableLabel());
                this.f30001B0.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.red_lite_3));
                this.f30002C0.setVisibility(0);
            } else {
                this.f30001B0.setText(courierBadgeBean.getSponsorValue());
                this.f30002C0.setVisibility(8);
                this.f30001B0.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.light_black));
            }
        } else {
            relativeLayout2.setVisibility(4);
        }
        if (courierBadgeBean.getShowValidUntilSection()) {
            relativeLayout.setVisibility(0);
            if (courierBadgeBean.getShowAddValidUntil()) {
                this.f30003D0.setText(courierBadgeBean.getValueUntilValueNotAvailableLabel());
                this.f30003D0.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.red_lite_3));
                this.f30004E0.setVisibility(0);
            } else {
                this.f30003D0.setText(courierBadgeBean.getValidUntilValue());
                this.f30003D0.setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.light_black));
                this.f30004E0.setVisibility(8);
            }
        } else {
            relativeLayout.setVisibility(4);
        }
        a.show();
    }

    /* renamed from: b */
    public /* synthetic */ void mo38536b(CourierBadgeBean courierBadgeBean, View view) {
        if (this.f30019a.mo23497S()) {
            m49859b(courierBadgeBean);
        }
    }

    /* renamed from: g */
    public void mo38537g(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getResources().getString(C10232R.string.lbl_how_to_pay_h));
        textView.setText(str);
        textView3.setText(getResources().getString(C10232R.string.lbl_how_to_pay_h));
        textView2.setText(getResources().getText(C10232R.string.lbl_dg_title_cancel));
        textView2.setOnClickListener(new C10920l(dialog));
        textView3.setOnClickListener(new C10921m(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: h */
    public void mo38538h(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getString(C10232R.string.lbl_edit_p_account_not_verified));
        textView.setText(str);
        textView3.setText(getResources().getString(C10232R.string.lbl_me_veriry_me));
        textView2.setText(getResources().getText(C10232R.string.lbl_me_cancel));
        textView2.setOnClickListener(new C10918j(dialog));
        textView3.setOnClickListener(new C10919k(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: i */
    public void mo38539i(String str) {
        Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(getString(C10232R.string.lbl_me_logout));
        textView.setText(str);
        textView3.setText(getResources().getString(C10232R.string.lbl_dg_title_yes));
        textView2.setText(getResources().getText(C10232R.string.lbl_dg_title_no));
        textView2.setOnClickListener(new C10916h(dialog));
        textView3.setOnClickListener(new C10917i(dialog));
        if (isAdded()) {
            dialog.show();
        }
    }

    /* renamed from: b */
    private void m49859b(CourierBadgeBean courierBadgeBean) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_header", courierBadgeBean.getAddValueUntilPopupHeaderLabel());
        bundle.putString("extra_placeholder", courierBadgeBean.getAddValueUntilPopupPlaceholderLabel());
        bundle.putString("extra_btnlabel", courierBadgeBean.getAddValueUntilPopupButtonLabel());
        C10881d dVar = new C10881d(getContext(), bundle);
        dVar.mo38507a((C10888f) new C10914f(dVar));
        dVar.mo38509c();
    }

    /* renamed from: a */
    public /* synthetic */ void mo38535a(CourierBadgeBean courierBadgeBean, View view) {
        if (this.f30019a.mo23497S()) {
            m49853a(courierBadgeBean);
        }
    }

    /* renamed from: a */
    private void m49853a(CourierBadgeBean courierBadgeBean) {
        Bundle bundle = new Bundle();
        bundle.putString("extra_header", courierBadgeBean.getAddSponsorPopupHeaderLabel());
        bundle.putString("extra_placeholder", courierBadgeBean.getAddSponsorPopupPlaceholderLabel());
        bundle.putString("extra_btnlabel", courierBadgeBean.getAddSponsorPopupButtonLabel());
        C10889e eVar = new C10889e(getContext(), bundle);
        eVar.mo38517a((C10896f) new C10913e(eVar));
        eVar.mo38519c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m49860b(Map<String, String> map, Map<String, String> map2, Object obj) {
        if (map2 != null) {
            String str = C11687c.f33768c3;
            if (map2.containsKey(str)) {
                TextView textView = this.f30004E0;
                if (!(textView == null || this.f30003D0 == null)) {
                    textView.setVisibility(8);
                    this.f30003D0.setText((CharSequence) map2.get(str));
                    this.f30003D0.setTextColor(C0841b.m4915a(getContext(), (int) C10232R.C10234color.text_color_5b));
                }
                if (obj instanceof C10881d) {
                    ((C10881d) obj).mo38506a();
                    return;
                }
                return;
            }
        }
        String str2 = C11687c.f33758a3;
        if (map.containsKey(str2)) {
            TextView textView2 = this.f30002C0;
            if (!(textView2 == null || this.f30001B0 == null)) {
                textView2.setVisibility(8);
                this.f30001B0.setText((CharSequence) map.get(str2));
                this.f30001B0.setTextColor(C0841b.m4915a(getContext(), (int) C10232R.C10234color.text_color_5b));
            }
            if (obj instanceof C10889e) {
                ((C10889e) obj).mo38516a();
            }
        }
    }

    /* renamed from: a */
    private void m49857a(Map<String, String> map, Map<String, String> map2, Object obj) {
        this.f30019a.mo23665u0();
        C11687c.m52645a(this.f30019a).addCourierSponsor(this.f30019a.mo23476G(), map).enqueue(new C10915g(map, map2, obj));
    }
}
