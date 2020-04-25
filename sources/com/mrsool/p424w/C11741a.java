package com.mrsool.p424w;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0894c;
import androidx.core.graphics.drawable.C0895d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import androidx.recyclerview.widget.RecyclerView.C1660t;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.chauthai.swipereveallayout.C2991b;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.chauthai.swipereveallayout.SwipeRevealLayout.C2989e;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.CTEventBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.NotificationList;
import com.mrsool.bean.NotificationRow;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.complaint.ComplaintDetailActivity;
import com.mrsool.p418u.C11560d;
import com.mrsool.shop.AnnouncementActivity;
import com.mrsool.shop.C11237e;
import com.mrsool.shop.ShopDetailActivity;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.utils.C11643h;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import com.mrsool.utils.webservice.C5882b;
import java.util.ArrayList;
import java.util.HashMap;
import p053b.p072g.p073b.C2128a;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p108y.p110j.C2550c;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.w.a */
/* compiled from: NotificationFragment */
public class C11741a extends Fragment implements C11560d {

    /* renamed from: Y */
    public static OnClickListener f33949Y;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C11750i f33950N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public RecyclerView f33951O;

    /* renamed from: P */
    private WrapContentLinearLayoutManager f33952P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public ProgressBar f33953Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ProgressBar f33954R;

    /* renamed from: S */
    private TextView f33955S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public TextView f33956T;

    /* renamed from: U */
    private LinearLayout f33957U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ProgressBar f33958V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public ArrayList<NotificationRow> f33959W = new ArrayList<>();

    /* renamed from: X */
    private BroadcastReceiver f33960X = new C11742a();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f33961a;

    /* renamed from: b */
    private View f33962b;

    /* renamed from: com.mrsool.w.a$a */
    /* compiled from: NotificationFragment */
    class C11742a extends BroadcastReceiver {
        C11742a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33263b4)) {
                C11741a.this.f33961a.mo23549a(C11741a.this.f33951O);
                C11741a.this.m52854x();
                C11741a.this.m52855y();
            } else if (intent.getAction().equalsIgnoreCase(C11644i.f33378o4)) {
                ArrayList<NotificationRow> arrayList = C11644i.f33460y6;
                arrayList.add(arrayList.get(0));
                C11741a.this.f33961a.mo23549a(C11741a.this.f33951O);
                C11741a.this.f33950N.mo7341e();
            }
        }
    }

    /* renamed from: com.mrsool.w.a$b */
    /* compiled from: NotificationFragment */
    class C11743b implements Callback<NotificationList> {
        C11743b() {
        }

        public void onFailure(Call<NotificationList> call, Throwable th) {
            try {
                if (C11741a.this.f33961a != null && C11741a.this.isAdded()) {
                    C11741a.this.f33958V.setVisibility(8);
                    C11741a.this.f33954R.setVisibility(8);
                    C11741a.this.f33961a.mo23492O();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<NotificationList> call, Response<NotificationList> response) {
            try {
                if (C11741a.this.f33961a != null && C11741a.this.isAdded()) {
                    C11741a.this.f33961a.mo23492O();
                    C11741a.this.f33958V.setVisibility(8);
                    C11741a.this.f33954R.setVisibility(8);
                    if (response.isSuccessful() && C11741a.this.isAdded()) {
                        C11644i.f33144M6 = true;
                        C11644i.f33460y6.clear();
                        C11644i.f33460y6.addAll(((NotificationList) response.body()).getNotifications());
                        C11741a.this.m52854x();
                        C11741a.this.f33956T.setText(TextUtils.isEmpty(((NotificationList) response.body()).getMessage()) ? C11741a.this.getString(C10232R.string.hint_no_more_result) : ((NotificationList) response.body()).getMessage());
                        C11741a.this.m52826C();
                        C11741a.this.m52855y();
                        if (((NotificationList) response.body()).getCode().intValue() <= 300) {
                            C11741a.this.f33951O.setVisibility(0);
                        }
                        C11741a.this.f33953Q.setVisibility(8);
                        C11741a.this.f33954R.setVisibility(8);
                    } else if (response.code() == 401) {
                        C11741a.this.f33961a.mo23613e0();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.w.a$c */
    /* compiled from: NotificationFragment */
    class C11744c implements C11756b {
        C11744c() {
        }

        /* renamed from: a */
        public void mo40256a(int i) {
            if (C11741a.this.f33961a.mo23502X()) {
                C11741a.this.m52829a(i);
            }
        }

        /* renamed from: b */
        public void mo40257b(int i) {
            C11741a.this.m52848h(i);
        }
    }

    /* renamed from: com.mrsool.w.a$d */
    /* compiled from: NotificationFragment */
    class C11745d implements Callback<DefaultBean> {
        C11745d() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
        }
    }

    /* renamed from: com.mrsool.w.a$e */
    /* compiled from: NotificationFragment */
    class C11746e extends C2550c {

        /* renamed from: R */
        final /* synthetic */ ImageView f33967R;

        C11746e(ImageView imageView, ImageView imageView2) {
            this.f33967R = imageView2;
            super(imageView);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo10023a(Bitmap bitmap) {
            try {
                Resources resources = C11741a.this.getResources();
                C11741a.this.f33961a;
                C0894c a = C0895d.m5185a(resources, C5887x.m25815e(bitmap));
                a.mo4601b(true);
                this.f33967R.setImageDrawable(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.w.a$f */
    /* compiled from: NotificationFragment */
    class C11747f implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ int f33969a;

        C11747f(int i) {
            this.f33969a = i;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            try {
                if (C11741a.this.f33961a != null && !C11741a.this.getActivity().isFinishing()) {
                    if (C11741a.this.isAdded()) {
                        C11741a.this.f33961a.mo23492O();
                        C11741a.this.f33961a.mo23653q0();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (C11741a.this.f33961a != null) {
                try {
                    if (response.isSuccessful()) {
                        if (((DefaultBean) response.body()).getCode().intValue() < 300) {
                            if (C11741a.this.f33959W != null && C11741a.this.f33959W.size() > 0 && this.f33969a < C11741a.this.f33959W.size()) {
                                if (!((NotificationRow) C11741a.this.f33959W.get(this.f33969a)).getRead().booleanValue() && C11644i.f33093G3 > 0) {
                                    C11644i.f33093G3--;
                                    C11644i.f33112I6 = C11644i.f33093G3;
                                    HomeActivity.f27246i1.mo11496b(C11644i.f33093G3 > 0 ? C11644i.f33093G3 : 0, 2);
                                }
                                C11741a.this.f33959W.remove(this.f33969a);
                            }
                            C11741a.this.m52855y();
                        } else if (!C11741a.this.getActivity().isFinishing() && C11741a.this.isAdded()) {
                            C11741a.this.f33961a.mo23615f(((DefaultBean) response.body()).getMessage(), C11741a.this.getString(C10232R.string.app_name));
                        }
                    } else if (!C11741a.this.getActivity().isFinishing() && C11741a.this.isAdded()) {
                        C11741a.this.f33961a.mo23615f(response.message(), C11741a.this.getString(C10232R.string.app_name));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.mrsool.w.a$g */
    /* compiled from: NotificationFragment */
    static class C11748g extends C1635d0 {

        /* renamed from: s0 */
        public ProgressBar f33971s0;

        public C11748g(View view) {
            super(view);
            this.f33971s0 = (ProgressBar) view.findViewById(C10232R.C10236id.pgBar);
        }
    }

    /* renamed from: com.mrsool.w.a$h */
    /* compiled from: NotificationFragment */
    static class C11749h extends C1635d0 {

        /* renamed from: s0 */
        public TextView f33972s0;

        /* renamed from: t0 */
        public TextView f33973t0;

        /* renamed from: u0 */
        public ImageView f33974u0;

        /* renamed from: v0 */
        public SwipeRevealLayout f33975v0;

        /* renamed from: w0 */
        public FrameLayout f33976w0;

        /* renamed from: x0 */
        public FrameLayout f33977x0;

        public C11749h(View view) {
            super(view);
            this.f33972s0 = (TextView) view.findViewById(C10232R.C10236id.txtNotTitle);
            this.f33973t0 = (TextView) view.findViewById(C10232R.C10236id.txtNotTime);
            this.f33974u0 = (ImageView) view.findViewById(C10232R.C10236id.imgPic);
            this.f33975v0 = (SwipeRevealLayout) view.findViewById(C10232R.C10236id.swipe_layout);
            this.f33976w0 = (FrameLayout) view.findViewById(C10232R.C10236id.flDelete);
            this.f33977x0 = (FrameLayout) view.findViewById(C10232R.C10236id.flNotification);
        }
    }

    /* renamed from: com.mrsool.w.a$i */
    /* compiled from: NotificationFragment */
    class C11750i extends C1638g<C1635d0> {

        /* renamed from: c */
        private final int f33978c = 0;

        /* renamed from: d */
        private final int f33979d = 1;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C11237e f33980e;

        /* renamed from: f */
        private final C2991b f33981f = new C2991b();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public boolean f33982g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f33983h = 5;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f33984i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f33985j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public String f33986k = "";

        /* renamed from: l */
        ArrayList<NotificationRow> f33987l = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: m */
        public C11756b f33988m;

        /* renamed from: com.mrsool.w.a$i$a */
        /* compiled from: NotificationFragment */
        class C11751a extends C1660t {

            /* renamed from: a */
            final /* synthetic */ C11741a f33990a;

            /* renamed from: b */
            final /* synthetic */ WrapContentLinearLayoutManager f33991b;

            C11751a(C11741a aVar, WrapContentLinearLayoutManager wrapContentLinearLayoutManager) {
                this.f33990a = aVar;
                this.f33991b = wrapContentLinearLayoutManager;
            }

            /* renamed from: a */
            public void mo7532a(RecyclerView recyclerView, int i, int i2) {
                super.mo7532a(recyclerView, i, i2);
                C11750i.this.f33985j = this.f33991b.mo7483j();
                C11750i.this.f33984i = this.f33991b.mo6961P();
                if (!C11750i.this.f33982g && C11750i.this.f33985j <= C11750i.this.f33984i + C11750i.this.f33983h) {
                    if (C11750i.this.f33980e != null) {
                        C11750i.this.f33980e.mo39072a();
                    }
                    C11750i.this.f33982g = true;
                }
            }
        }

        /* renamed from: com.mrsool.w.a$i$b */
        /* compiled from: NotificationFragment */
        class C11752b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f33993a;

            C11752b(int i) {
                this.f33993a = i;
            }

            public void onClick(View view) {
                C11750i.this.f33988m.mo40256a(this.f33993a);
                C11750i.this.mo40259f();
            }
        }

        /* renamed from: com.mrsool.w.a$i$c */
        /* compiled from: NotificationFragment */
        class C11753c implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ int f33995a;

            C11753c(int i) {
                this.f33995a = i;
            }

            public void onClick(View view) {
                C11750i.this.f33988m.mo40257b(this.f33995a);
            }
        }

        /* renamed from: com.mrsool.w.a$i$d */
        /* compiled from: NotificationFragment */
        class C11754d implements C2989e {

            /* renamed from: a */
            final /* synthetic */ NotificationRow f33997a;

            C11754d(NotificationRow notificationRow) {
                this.f33997a = notificationRow;
            }

            /* renamed from: a */
            public void mo11814a(SwipeRevealLayout swipeRevealLayout) {
                C11750i iVar = C11750i.this;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.f33997a.getiNotificationId());
                iVar.f33986k = sb.toString();
            }

            /* renamed from: a */
            public void mo11815a(SwipeRevealLayout swipeRevealLayout, float f) {
            }

            /* renamed from: b */
            public void mo11816b(SwipeRevealLayout swipeRevealLayout) {
            }
        }

        public C11750i(ArrayList<NotificationRow> arrayList) {
            this.f33981f.mo11820a(true);
            this.f33987l.addAll(arrayList);
            C11741a.this.f33951O.addOnScrollListener(new C11751a(C11741a.this, (WrapContentLinearLayoutManager) C11741a.this.f33951O.getLayoutManager()));
        }

        /* renamed from: g */
        public C11756b mo40260g() {
            return this.f33988m;
        }

        /* renamed from: h */
        public void mo40261h() {
            this.f33982g = false;
        }

        /* renamed from: c */
        public int mo7333c(int i) {
            return this.f33987l.get(i) == null ? 1 : 0;
        }

        /* renamed from: f */
        public void mo40259f() {
            this.f33981f.mo11819a(this.f33986k);
        }

        /* renamed from: b */
        public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C11749h(LayoutInflater.from(C11741a.this.getActivity()).inflate(C10232R.layout.row_notification, viewGroup, false));
            }
            return null;
        }

        /* renamed from: a */
        public void mo40258a(C11756b bVar) {
            this.f33988m = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e4, code lost:
            if (r2.equals(com.mrsool.utils.C11644i.f33239Y5) != false) goto L_0x0106;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo7330b(androidx.recyclerview.widget.RecyclerView.C1635d0 r11, int r12) {
            /*
                r10 = this;
                boolean r0 = r11 instanceof com.mrsool.p424w.C11741a.C11749h
                r1 = 1
                if (r0 == 0) goto L_0x01ce
                java.util.ArrayList<com.mrsool.bean.NotificationRow> r0 = r10.f33987l
                java.lang.Object r0 = r0.get(r12)
                com.mrsool.bean.NotificationRow r0 = (com.mrsool.bean.NotificationRow) r0
                com.mrsool.w.a$h r11 = (com.mrsool.p424w.C11741a.C11749h) r11
                com.chauthai.swipereveallayout.b r2 = r10.f33981f
                com.chauthai.swipereveallayout.SwipeRevealLayout r3 = r11.f33975v0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = ""
                r4.append(r5)
                java.lang.String r6 = r0.getiNotificationId()
                r4.append(r6)
                java.lang.String r4 = r4.toString()
                r2.mo11818a(r3, r4)
                java.lang.String r2 = r0.getType()
                java.lang.String r3 = "announcement"
                boolean r2 = r2.equalsIgnoreCase(r3)
                r3 = 0
                if (r2 == 0) goto L_0x0054
                com.chauthai.swipereveallayout.b r2 = r10.f33981f
                java.lang.String[] r4 = new java.lang.String[r1]
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                java.lang.String r7 = r0.getiNotificationId()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r4[r3] = r6
                r2.mo11821a(r4)
            L_0x0054:
                java.lang.Boolean r2 = r0.getRead()
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x006c
                android.widget.TextView r2 = r11.f33972s0
                r4 = 1058642330(0x3f19999a, float:0.6)
                r2.setAlpha(r4)
                android.widget.TextView r2 = r11.f33973t0
                r2.setAlpha(r4)
                goto L_0x0078
            L_0x006c:
                android.widget.TextView r2 = r11.f33972s0
                r4 = 1065353216(0x3f800000, float:1.0)
                r2.setAlpha(r4)
                android.widget.TextView r2 = r11.f33973t0
                r2.setAlpha(r4)
            L_0x0078:
                android.widget.TextView r2 = r11.f33972s0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r5)
                java.lang.String r5 = r0.getMessage()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r2.setText(r4)
                android.widget.TextView r2 = r11.f33973t0
                java.lang.String r4 = r0.getTimeAt()
                r2.setText(r4)
                java.lang.String r2 = r0.getType()
                r4 = 2131231973(0x7f0804e5, float:1.8080042E38)
                if (r2 == 0) goto L_0x0175
                java.lang.String r2 = r0.getType()
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0175
                java.lang.Object r2 = r0.getPic()
                if (r2 == 0) goto L_0x0175
                java.lang.Object r2 = r0.getPic()
                java.lang.String r2 = r2.toString()
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0175
                java.lang.String r2 = r0.getType()
                r5 = -1
                int r6 = r2.hashCode()
                r7 = 4
                r8 = 3
                r9 = 2
                switch(r6) {
                    case -1354814997: goto L_0x00fb;
                    case 3052376: goto L_0x00f1;
                    case 3529462: goto L_0x00e7;
                    case 106006350: goto L_0x00de;
                    case 957939245: goto L_0x00d4;
                    default: goto L_0x00d3;
                }
            L_0x00d3:
                goto L_0x0105
            L_0x00d4:
                java.lang.String r3 = "courier"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0105
                r3 = 4
                goto L_0x0106
            L_0x00de:
                java.lang.String r6 = "order"
                boolean r2 = r2.equals(r6)
                if (r2 == 0) goto L_0x0105
                goto L_0x0106
            L_0x00e7:
                java.lang.String r3 = "shop"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0105
                r3 = 3
                goto L_0x0106
            L_0x00f1:
                java.lang.String r3 = "chat"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0105
                r3 = 2
                goto L_0x0106
            L_0x00fb:
                java.lang.String r3 = "common"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x0105
                r3 = 1
                goto L_0x0106
            L_0x0105:
                r3 = -1
            L_0x0106:
                r2 = 2131231510(0x7f080316, float:1.8079103E38)
                if (r3 == 0) goto L_0x0165
                if (r3 == r1) goto L_0x0155
                if (r3 == r9) goto L_0x0145
                if (r3 == r8) goto L_0x0135
                if (r3 == r7) goto L_0x0124
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r3 = r0.getPic()
                java.lang.String r3 = r3.toString()
                android.widget.ImageView r4 = r11.f33974u0
                r1.m52834a(r3, r2, r2, r4)
                goto L_0x01af
            L_0x0124:
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r3 = r0.getPic()
                java.lang.String r3 = r3.toString()
                android.widget.ImageView r4 = r11.f33974u0
                r1.m52834a(r3, r2, r2, r4)
                goto L_0x01af
            L_0x0135:
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r2 = r0.getPic()
                java.lang.String r2 = r2.toString()
                android.widget.ImageView r3 = r11.f33974u0
                r1.m52834a(r2, r4, r4, r3)
                goto L_0x01af
            L_0x0145:
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r3 = r0.getPic()
                java.lang.String r3 = r3.toString()
                android.widget.ImageView r4 = r11.f33974u0
                r1.m52834a(r3, r2, r2, r4)
                goto L_0x01af
            L_0x0155:
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r3 = r0.getPic()
                java.lang.String r3 = r3.toString()
                android.widget.ImageView r4 = r11.f33974u0
                r1.m52834a(r3, r2, r2, r4)
                goto L_0x01af
            L_0x0165:
                com.mrsool.w.a r1 = com.mrsool.p424w.C11741a.this
                java.lang.Object r3 = r0.getPic()
                java.lang.String r3 = r3.toString()
                android.widget.ImageView r4 = r11.f33974u0
                r1.m52834a(r3, r2, r2, r4)
                goto L_0x01af
            L_0x0175:
                com.mrsool.w.a r2 = com.mrsool.p424w.C11741a.this
                androidx.fragment.app.c r2 = r2.getActivity()
                android.content.Context r2 = r2.getApplicationContext()
                c.c.a.q r2 = p076c.p082c.p083a.C2232l.m11649c(r2)
                java.lang.Object r5 = r0.getPic()
                c.c.a.g r2 = r2.mo9514a(r5)
                com.bumptech.glide.load.resource.bitmap.e[] r1 = new com.bumptech.glide.load.resource.bitmap.C2964e[r1]
                com.mrsool.utils.h r5 = new com.mrsool.utils.h
                com.mrsool.w.a r6 = com.mrsool.p424w.C11741a.this
                androidx.fragment.app.c r6 = r6.getActivity()
                r5.<init>(r6)
                r1[r3] = r5
                c.c.a.f r1 = r2.mo9454a(r1)
                c.c.a.f r1 = r1.m11496d()
                c.c.a.f r1 = r1.m11491c(r4)
                c.c.a.f r1 = r1.m11500e(r4)
                android.widget.ImageView r2 = r11.f33974u0
                r1.mo9424a(r2)
            L_0x01af:
                android.widget.FrameLayout r1 = r11.f33976w0
                com.mrsool.w.a$i$b r2 = new com.mrsool.w.a$i$b
                r2.<init>(r12)
                r1.setOnClickListener(r2)
                android.widget.FrameLayout r1 = r11.f33977x0
                com.mrsool.w.a$i$c r2 = new com.mrsool.w.a$i$c
                r2.<init>(r12)
                r1.setOnClickListener(r2)
                com.chauthai.swipereveallayout.SwipeRevealLayout r11 = r11.f33975v0
                com.mrsool.w.a$i$d r12 = new com.mrsool.w.a$i$d
                r12.<init>(r0)
                r11.setSwipeListener(r12)
                goto L_0x01d9
            L_0x01ce:
                boolean r12 = r11 instanceof com.mrsool.p424w.C11741a.C11748g
                if (r12 == 0) goto L_0x01d9
                com.mrsool.w.a$g r11 = (com.mrsool.p424w.C11741a.C11748g) r11
                android.widget.ProgressBar r11 = r11.f33971s0
                r11.setIndeterminate(r1)
            L_0x01d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.p424w.C11741a.C11750i.mo7330b(androidx.recyclerview.widget.RecyclerView$d0, int):void");
        }

        /* renamed from: b */
        public int mo7325b() {
            return this.f33987l.size();
        }
    }

    /* renamed from: com.mrsool.w.a$j */
    /* compiled from: NotificationFragment */
    public class C11755j implements OnClickListener {

        /* renamed from: a */
        private final Context f33999a;

        /* synthetic */ C11755j(C11741a aVar, Context context, C11742a aVar2) {
            this(context);
        }

        public void onClick(View view) {
            C11741a.this.m52848h(C11741a.this.f33951O.getChildLayoutPosition(view));
        }

        private C11755j(Context context) {
            this.f33999a = context;
        }
    }

    /* renamed from: A */
    private void m52824A() {
        this.f33961a = new C5887x(getActivity());
        f33949Y = new C11755j(this, getActivity(), null);
        this.f33953Q = (ProgressBar) this.f33962b.findViewById(C10232R.C10236id.pg1);
        this.f33954R = (ProgressBar) this.f33962b.findViewById(C10232R.C10236id.pgLoadMore);
        this.f33958V = (ProgressBar) this.f33962b.findViewById(C10232R.C10236id.pgRefresh);
        if (VERSION.SDK_INT >= 21) {
            this.f33961a.mo23592c(this.f33962b.findViewById(C10232R.C10236id.lltbTXT));
        }
        this.f33957U = (LinearLayout) this.f33962b.findViewById(C10232R.C10236id.layNDF);
        this.f33956T = (TextView) this.f33962b.findViewById(C10232R.C10236id.txtNDF);
        this.f33955S = (TextView) this.f33962b.findViewById(C10232R.C10236id.txtTitle);
        this.f33955S.setText(getString(C10232R.string.lbl_notifications));
        m52827D();
        m52856z();
        m52825B();
    }

    /* renamed from: B */
    private void m52825B() {
        this.f33961a.mo23540a(this.f33960X, C11644i.f33263b4);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m52826C() {
        int i = 0;
        C11644i.f33093G3 = 0;
        for (int i2 = 0; i2 < this.f33959W.size(); i2++) {
            if (!((NotificationRow) this.f33959W.get(i2)).getRead().booleanValue()) {
                C11644i.f33093G3++;
            }
        }
        C11644i.f33112I6 = C11644i.f33093G3;
        AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
        int i3 = C11644i.f33093G3;
        if (i3 > 0) {
            i = i3;
        }
        aHBottomNavigation.mo11496b(i, 2);
    }

    /* renamed from: D */
    private void m52827D() {
        this.f33951O = (RecyclerView) this.f33962b.findViewById(C10232R.C10236id.rvNotification);
        this.f33952P = new WrapContentLinearLayoutManager(getActivity());
        this.f33952P.mo7000l(1);
        this.f33951O.setLayoutManager(this.f33952P);
        this.f33951O.setItemAnimator(null);
        m52854x();
        this.f33950N = new C11750i(this.f33959W);
        this.f33951O.setAdapter(this.f33950N);
    }

    /* renamed from: w */
    private void m52853w() {
        C5887x xVar = this.f33961a;
        if (xVar == null || !xVar.mo23566a0()) {
            this.f33958V.setVisibility(0);
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f33961a.mo23648p().latitude);
            hashMap.put("user_lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f33961a.mo23648p().longitude);
            hashMap.put("user_long", sb2.toString());
            C11687c.m52645a(this.f33961a).notificationList(String.valueOf(this.f33961a.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C11743b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m52854x() {
        ArrayList<NotificationRow> arrayList = this.f33959W;
        if (arrayList != null) {
            arrayList.clear();
            this.f33959W.addAll(C11644i.f33460y6);
            return;
        }
        this.f33959W = new ArrayList<>();
        this.f33959W.addAll(C11644i.f33460y6);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public void m52855y() {
        this.f33950N = new C11750i(this.f33959W);
        this.f33951O.setAdapter(this.f33950N);
        if (this.f33959W.size() == 0) {
            this.f33957U.setVisibility(0);
            this.f33951O.setVisibility(8);
        } else {
            this.f33957U.setVisibility(8);
            this.f33951O.setVisibility(0);
        }
        this.f33950N.mo40258a((C11756b) new C11744c());
    }

    /* renamed from: z */
    private void m52856z() {
        if (!this.f33961a.mo23502X()) {
            this.f33953Q.setVisibility(8);
        } else if (this.f33961a.mo23468C().mo23459f(C11644i.f33303g) == null || this.f33961a.mo23468C().mo23459f(C11644i.f33312h) == null) {
            this.f33961a.mo23576b((Context) getActivity(), getString(C10232R.string.msg_error_location_not_found));
            this.f33953Q.setVisibility(8);
        } else {
            m52853w();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f33962b = layoutInflater.inflate(C10232R.layout.fragment_btab_notification, viewGroup, false);
        HomeActivity.m47461a((C11560d) this);
        m52824A();
        return this.f33962b;
    }

    public void onDestroy() {
        super.onDestroy();
        C11644i.f33242Z0 = false;
    }

    public void onDestroyView() {
        super.onDestroyView();
        C2128a.m11089a((Context) getActivity()).mo9217a(this.f33960X);
    }

    public void onPause() {
        super.onPause();
        this.f33950N.mo40259f();
        C11644i.f33242Z0 = false;
    }

    public void onResume() {
        super.onResume();
        m52853w();
    }

    /* renamed from: t */
    public void mo39686t() {
        onResume();
        if (!this.f33961a.mo23502X()) {
            this.f33953Q.setVisibility(8);
        } else if (this.f33961a.mo23468C().mo23459f(C11644i.f33303g) == null || this.f33961a.mo23468C().mo23459f(C11644i.f33312h) == null) {
            this.f33961a.mo23576b((Context) getActivity(), getString(C10232R.string.msg_error_location_not_found));
            this.f33953Q.setVisibility(8);
        } else {
            m52853w();
        }
    }

    /* renamed from: c */
    private void m52839c(int i) {
        Intent intent = new Intent(getActivity(), AnnouncementActivity.class);
        intent.putExtra(C11644i.f33199T5, getString(C10232R.string.lbl_frg_notification));
        intent.putExtra(C11644i.f33367n1, ((NotificationRow) this.f33959W.get(i)).getId());
        startActivity(intent);
    }

    /* renamed from: e */
    private void m52841e(int i) {
        if (((NotificationRow) this.f33959W.get(i)).isCourier()) {
            ((HomeActivity) getActivity()).mo36529l(((NotificationRow) this.f33959W.get(i)).getId());
            return;
        }
        Intent intent = new Intent(getActivity(), ComplaintDetailActivity.class);
        intent.putExtra(C11644i.f33439w1, ((NotificationRow) this.f33959W.get(i)).getId());
        startActivity(intent);
    }

    /* renamed from: f */
    private void m52844f(int i) {
        Intent intent = new Intent(getActivity(), ChatActivityNew.class);
        intent.putExtra(C11644i.f33199T5, getString(C10232R.string.lbl_frg_notification));
        intent.putExtra(C11644i.f33314h1, ((NotificationRow) this.f33959W.get(i)).getId());
        startActivity(intent);
    }

    /* renamed from: g */
    private void m52846g(int i) {
        CTEventBean cTEventBean = new CTEventBean(getResources().getString(C10232R.string.ct_event_param_value_notification), ((NotificationRow) this.f33959W.get(i)).getId());
        Intent intent = new Intent(getActivity(), ShopDetailPackageActivity.class);
        intent.putExtra(C11644i.f33199T5, getString(C10232R.string.lbl_frg_notification));
        intent.putExtra(C11644i.f33367n1, ((NotificationRow) this.f33959W.get(i)).getId());
        intent.putExtra(C11644i.f33207U5, cTEventBean);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m52848h(int i) {
        if (this.f33961a.mo23502X() && this.f33961a.mo23497S()) {
            try {
                if (this.f33959W.size() > i) {
                    m52849i(i);
                    m52837b(((NotificationRow) this.f33959W.get(i)).getType(), i);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("IndexOutOfBoundException:");
                sb.append(e.getMessage());
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* renamed from: i */
    private void m52849i(int i) {
        if (!((NotificationRow) this.f33959W.get(i)).getRead().booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(((NotificationRow) this.f33959W.get(i)).getiNotificationId());
            m52833a(sb.toString(), i);
            int i2 = C11644i.f33093G3;
            if (i2 > 0) {
                C11644i.f33093G3 = i2 - 1;
                C11644i.f33112I6 = C11644i.f33093G3;
                AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                int i3 = C11644i.f33093G3;
                if (i3 <= 0) {
                    i3 = 0;
                }
                aHBottomNavigation.mo11496b(i3, 2);
            }
            if (isAdded() && this.f33950N != null) {
                ((NotificationRow) this.f33959W.get(i)).setRead(Boolean.valueOf(true));
                this.f33951O.stopScroll();
                this.f33961a.mo23549a(this.f33951O);
                m52855y();
            }
        }
    }

    /* renamed from: b */
    private void m52837b(String str, int i) {
        if (this.f33961a.mo23502X() && this.f33959W.size() > 0 && i >= 0 && !TextUtils.isEmpty(((NotificationRow) this.f33959W.get(i)).getId())) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1403061077:
                    if (str.equals("complaint")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1354814997:
                    if (str.equals(C11644i.f33265b6)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3529462:
                    if (str.equals(C11644i.f33247Z5)) {
                        c = 0;
                        break;
                    }
                    break;
                case 106006350:
                    if (str.equals(C11644i.f33239Y5)) {
                        c = 1;
                        break;
                    }
                    break;
                case 156781895:
                    if (str.equals(C11644i.f33301f6)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984153269:
                    if (str.equals("service")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                m52830a(i, false);
            } else if (c == 1) {
                m52844f(i);
            } else if (c == 2) {
                m52830a(i, true);
            } else if (c == 3) {
                m52841e(i);
            } else if (c == 4) {
                m52846g(i);
            } else if (c == 5) {
                m52839c(i);
            }
        }
    }

    /* renamed from: a */
    private void m52830a(int i, boolean z) {
        String string = getResources().getString(C10232R.string.ct_event_param_value_notification);
        StringBuilder sb = new StringBuilder();
        sb.append("Notification - ");
        sb.append(((NotificationRow) this.f33959W.get(i)).getId());
        CTEventBean cTEventBean = new CTEventBean(string, sb.toString());
        Intent intent = new Intent(getActivity(), ShopDetailActivity.class);
        intent.putExtra(C11644i.f33199T5, getString(z ? C10232R.string.lbl_frg_notification_common : C10232R.string.lbl_frg_notification));
        intent.putExtra(C11644i.f33367n1, ((NotificationRow) this.f33959W.get(i)).getId());
        intent.putExtra(C11644i.f33207U5, cTEventBean);
        startActivity(intent);
    }

    /* renamed from: a */
    private void m52833a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("iNotificationId", str);
        String str2 = "user_id";
        hashMap.put("iUserId", this.f33961a.mo23468C().mo23459f(str2));
        C5882b.m25774a(this.f33961a).readNotification(String.valueOf(this.f33961a.mo23468C().mo23459f(str2)), hashMap).enqueue(new C11745d());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52834a(String str, int i, int i2, ImageView imageView) {
        C2232l.m11649c(getActivity().getApplicationContext()).mo9515a(str).mo9441j().m11411d().m11405c(i).m11415e(i2).mo9423a(new C11643h(getActivity().getApplicationContext())).mo9458b(new C11746e(imageView, imageView));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m52829a(int i) {
        if (this.f33959W.size() != 0 && i < this.f33959W.size()) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f33961a.mo23476G());
            hashMap.put("current_user_id", sb.toString());
            hashMap.put("auth_token", this.f33961a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(((NotificationRow) this.f33959W.get(i)).getiNotificationId());
            hashMap.put("notification_id", sb2.toString());
            C5882b.m25774a(this.f33961a).deleteNotification(this.f33961a.mo23476G(), hashMap).enqueue(new C11747f(i));
        }
    }
}
