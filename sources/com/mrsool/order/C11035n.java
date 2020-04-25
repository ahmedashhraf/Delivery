package com.mrsool.order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C1382h;
import androidx.fragment.app.C1405m;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.C2019j;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7056k;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.MyOrders;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.bean.MyOrdersInactive;
import com.mrsool.bean.OrderSpinnerBean;
import com.mrsool.p418u.C11559c;
import com.mrsool.p423v.C11718b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.webservice.C5882b;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.order.n */
/* compiled from: MyOrderTabFragment */
public class C11035n extends Fragment implements OnClickListener, C11559c {

    /* renamed from: Y */
    public static ViewPager f30512Y = null;

    /* renamed from: Z */
    public static boolean f30513Z = true;

    /* renamed from: a0 */
    public static boolean f30514a0 = true;

    /* renamed from: b0 */
    public static TabLayout f30515b0;

    /* renamed from: c0 */
    public static C7056k f30516c0;

    /* renamed from: d0 */
    public static C7056k f30517d0;

    /* renamed from: e0 */
    public static C11041f f30518e0;

    /* renamed from: f0 */
    private static Context f30519f0;

    /* renamed from: N */
    private TextView f30520N;

    /* renamed from: O */
    private TextView f30521O;

    /* renamed from: P */
    private TextView f30522P;

    /* renamed from: Q */
    private View f30523Q;

    /* renamed from: R */
    private Context f30524R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C5887x f30525S;

    /* renamed from: T */
    public ArrayList<OrderSpinnerBean> f30526T = new ArrayList<>();

    /* renamed from: U */
    public C10991f f30527U;

    /* renamed from: V */
    private Spinner f30528V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public String f30529W = "";

    /* renamed from: X */
    private BroadcastReceiver f30530X = new C11037b();

    /* renamed from: a */
    private Toolbar f30531a;

    /* renamed from: b */
    private ImageView f30532b;

    /* renamed from: com.mrsool.order.n$a */
    /* compiled from: MyOrderTabFragment */
    class C11036a implements C2019j {
        C11036a() {
        }

        /* renamed from: a */
        public void mo8878a(int i) {
        }

        /* renamed from: a */
        public void mo8879a(int i, float f, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPageScrolled");
            sb.append(i);
            C5880q.m25753d(sb.toString());
        }

        /* renamed from: c */
        public void mo8880c(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPageSelected");
            sb.append(i);
            C5880q.m25753d(sb.toString());
        }
    }

    /* renamed from: com.mrsool.order.n$b */
    /* compiled from: MyOrderTabFragment */
    class C11037b extends BroadcastReceiver {
        C11037b() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0076  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r6, android.content.Intent r7) {
            /*
                r5 = this;
                java.lang.String r6 = r7.getAction()
                int r0 = r6.hashCode()
                r1 = -678081093(0xffffffffd7954dbb, float:-3.28322165E14)
                r2 = 2
                r3 = 1
                r4 = 0
                if (r0 == r1) goto L_0x002f
                r1 = 825971937(0x313b54e1, float:2.726033E-9)
                if (r0 == r1) goto L_0x0025
                r1 = 1732606213(0x67457905, float:9.325386E23)
                if (r0 == r1) goto L_0x001b
                goto L_0x0039
            L_0x001b:
                java.lang.String r0 = "refresh_spinner_count"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 0
                goto L_0x003a
            L_0x0025:
                java.lang.String r0 = "refresh_myorder_from_tab"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 2
                goto L_0x003a
            L_0x002f:
                java.lang.String r0 = "refresh_myDelivery_from_tab"
                boolean r6 = r6.equals(r0)
                if (r6 == 0) goto L_0x0039
                r6 = 1
                goto L_0x003a
            L_0x0039:
                r6 = -1
            L_0x003a:
                if (r6 == 0) goto L_0x0076
                if (r6 == r3) goto L_0x005c
                if (r6 == r2) goto L_0x0042
                goto L_0x00c3
            L_0x0042:
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                com.mrsool.utils.x r6 = r6.f30525S
                if (r6 == 0) goto L_0x00c3
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                com.mrsool.utils.x r6 = r6.f30525S
                boolean r6 = r6.mo23502X()
                if (r6 == 0) goto L_0x00c3
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                r6.m50197d(r3)
                goto L_0x00c3
            L_0x005c:
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                com.mrsool.utils.x r6 = r6.f30525S
                if (r6 == 0) goto L_0x00c3
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                com.mrsool.utils.x r6 = r6.f30525S
                boolean r6 = r6.mo23502X()
                if (r6 == 0) goto L_0x00c3
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                r6.m50194c(r4)
                goto L_0x00c3
            L_0x0076:
                java.lang.String r6 = "active"
                int r6 = r7.getIntExtra(r6, r4)
                java.lang.String r0 = "inactive"
                int r7 = r7.getIntExtra(r0, r4)
                com.mrsool.order.n r0 = com.mrsool.order.C11035n.this
                java.util.ArrayList<com.mrsool.bean.OrderSpinnerBean> r0 = r0.f30526T
                java.lang.Object r0 = r0.get(r4)
                com.mrsool.bean.OrderSpinnerBean r0 = (com.mrsool.bean.OrderSpinnerBean) r0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ""
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.setCount(r6)
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                java.util.ArrayList<com.mrsool.bean.OrderSpinnerBean> r6 = r6.f30526T
                java.lang.Object r6 = r6.get(r3)
                com.mrsool.bean.OrderSpinnerBean r6 = (com.mrsool.bean.OrderSpinnerBean) r6
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r2)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r6.setCount(r7)
                com.mrsool.order.n r6 = com.mrsool.order.C11035n.this
                com.mrsool.order.f r6 = r6.f30527U
                r6.notifyDataSetChanged()
            L_0x00c3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.order.C11035n.C11037b.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.mrsool.order.n$c */
    /* compiled from: MyOrderTabFragment */
    class C11038c implements Callback<MyOrders> {

        /* renamed from: a */
        final /* synthetic */ boolean f30535a;

        C11038c(boolean z) {
            this.f30535a = z;
        }

        public void onFailure(Call<MyOrders> call, Throwable th) {
            try {
                if (C11035n.this.f30525S != null) {
                    C11035n.this.f30525S.mo23492O();
                    C11035n.this.f30525S.mo23591c((Context) C11035n.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<MyOrders> call, Response<MyOrders> response) {
            String str;
            try {
                if (C11035n.this.f30525S == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    C11644i.f33144M6 = true;
                    C11644i.f33056B6.clear();
                    C11644i.f33064C6.clear();
                    C11644i.f33056B6.addAll(((MyOrders) response.body()).getActive());
                    C11644i.f33064C6.addAll(((MyOrders) response.body()).getInactive());
                    C11644i.f33077E3 = 0;
                    int i = 0;
                    while (true) {
                        str = ",";
                        if (i >= C11644i.f33056B6.size()) {
                            break;
                        }
                        if (((MyOrdersActive) C11644i.f33056B6.get(i)).getUnread().intValue() > 0) {
                            C11644i.f33077E3++;
                        }
                        if (this.f30535a) {
                            C11035n nVar = C11035n.this;
                            StringBuilder sb = new StringBuilder();
                            sb.append(C11035n.this.f30529W);
                            sb.append(str);
                            sb.append(((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId());
                            nVar.f30529W = sb.toString();
                        }
                        i++;
                    }
                    C11644i.f33085F3 = 0;
                    for (int i2 = 0; i2 < C11644i.f33064C6.size(); i2++) {
                        if (((MyOrdersInactive) C11644i.f33064C6.get(i2)).getUnread().intValue() > 0) {
                            C11644i.f33085F3++;
                        }
                        if (this.f30535a) {
                            C11035n nVar2 = C11035n.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C11035n.this.f30529W);
                            sb2.append(str);
                            sb2.append(((MyOrdersInactive) C11644i.f33064C6.get(i2)).getIOrderId());
                            nVar2.f30529W = sb2.toString();
                        }
                    }
                    if (C11035n.this.m50201z()) {
                        C11035n.this.m50199x();
                    }
                    if (this.f30535a) {
                        if ((C11644i.f33468z6.size() <= 0 && C11644i.f33048A6.size() <= 0) || C11644i.f33056B6.size() <= 0) {
                            if (C11644i.f33064C6.size() <= 0) {
                                if (C11644i.f33468z6.size() <= 0) {
                                    if (C11644i.f33048A6.size() <= 0) {
                                        if (C11644i.f33056B6.size() <= 0) {
                                            if (C11644i.f33064C6.size() <= 0) {
                                                C11035n.this.m50193c(0);
                                                return;
                                            }
                                        }
                                        C11035n.this.m50193c(1);
                                        return;
                                    }
                                }
                                C11035n.this.m50193c(0);
                                return;
                            }
                        }
                        C11035n.this.m50193c(2);
                        return;
                    }
                    if (C11644i.f33056B6.size() <= 0) {
                        if (C11644i.f33064C6.size() <= 0) {
                            if (C11035n.f30518e0.mo8886a() > 1) {
                                C11035n.f30515b0.mo28115b(1);
                                C11035n.f30518e0.mo38801e(1);
                                return;
                            }
                            return;
                        }
                    }
                    if (C11035n.f30518e0.mo8886a() == 1) {
                        C11035n.f30518e0.mo38799a(new C11007j(), C11035n.this.getString(C10232R.string.lbl_tab_my_deliveries), 1);
                        C11035n.f30518e0.mo8894b();
                        C11035n.this.m50184A();
                    }
                } else if (response.code() == 401) {
                    C11035n.this.f30525S.mo23576b((Context) C11035n.this.getActivity(), response.message());
                    C11035n.this.f30525S.mo23613e0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.n$d */
    /* compiled from: MyOrderTabFragment */
    class C11039d implements Callback<MyOrders> {

        /* renamed from: a */
        final /* synthetic */ boolean f30537a;

        C11039d(boolean z) {
            this.f30537a = z;
        }

        public void onFailure(Call<MyOrders> call, Throwable th) {
            try {
                if (C11035n.this.f30525S != null) {
                    C11035n.this.f30525S.mo23492O();
                    C11035n.this.f30525S.mo23591c((Context) C11035n.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<MyOrders> call, Response<MyOrders> response) {
            String str;
            try {
                if (C11035n.this.f30525S == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    C11644i.f33144M6 = true;
                    C11644i.f33468z6.clear();
                    C11644i.f33048A6.clear();
                    C11644i.f33468z6.addAll(((MyOrders) response.body()).getActive());
                    C11644i.f33048A6.addAll(((MyOrders) response.body()).getInactive());
                    C11644i.f33061C3 = 0;
                    int i = 0;
                    while (true) {
                        str = ",";
                        if (i >= C11644i.f33468z6.size()) {
                            break;
                        }
                        if (((MyOrdersActive) C11644i.f33468z6.get(i)).getUnread().intValue() > 0) {
                            C11644i.f33061C3++;
                        }
                        if (this.f30537a) {
                            C11035n nVar = C11035n.this;
                            StringBuilder sb = new StringBuilder();
                            sb.append(C11035n.this.f30529W);
                            sb.append(str);
                            sb.append(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
                            nVar.f30529W = sb.toString();
                        }
                        i++;
                    }
                    C11644i.f33069D3 = 0;
                    for (int i2 = 0; i2 < C11644i.f33048A6.size(); i2++) {
                        if (((MyOrdersInactive) C11644i.f33048A6.get(i2)).getUnread().intValue() > 0) {
                            C11644i.f33069D3++;
                        }
                        if (this.f30537a) {
                            C11035n nVar2 = C11035n.this;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C11035n.this.f30529W);
                            sb2.append(str);
                            sb2.append(((MyOrdersInactive) C11644i.f33048A6.get(i2)).getIOrderId());
                            nVar2.f30529W = sb2.toString();
                        }
                    }
                    if (this.f30537a) {
                        C11035n.this.m50194c(this.f30537a);
                        return;
                    }
                    if (C11644i.f33468z6.size() <= 0) {
                        if (C11644i.f33048A6.size() <= 0) {
                            if (C11035n.f30518e0.mo8888a(0).toString().equalsIgnoreCase(C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_orders))) {
                                C11035n.f30515b0.mo28115b(0);
                                C11035n.f30518e0.mo38801e(0);
                                return;
                            }
                            return;
                        }
                    }
                    if (!C11035n.f30518e0.mo8888a(0).toString().equalsIgnoreCase(C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_orders))) {
                        C11035n.f30518e0.mo38799a(new C11042o(), C11035n.this.getString(C10232R.string.lbl_tab_my_orders), 0);
                        C11035n.f30518e0.mo8894b();
                        C11035n.this.m50184A();
                    }
                } else if (response.code() == 401) {
                    C11035n.this.f30525S.mo23576b((Context) C11035n.this.getActivity(), response.message());
                    C11035n.this.f30525S.mo23613e0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.n$e */
    /* compiled from: MyOrderTabFragment */
    public class C11040e implements OnItemSelectedListener, OnTouchListener {

        /* renamed from: a */
        int f30540a;

        /* renamed from: b */
        boolean f30541b = false;

        public C11040e() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f30540a == C10232R.C10236id.spActiveInactive && this.f30541b) {
                if (i == 0) {
                    C11035n.f30513Z = true;
                } else if (i == 1) {
                    C11035n.f30513Z = false;
                }
                C2128a.m11089a((Context) C11035n.this.getActivity()).mo9219a(new Intent(C11644i.f33229X3));
                this.f30541b = false;
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.f30540a = view.getId();
            this.f30541b = true;
            return false;
        }
    }

    /* renamed from: com.mrsool.order.n$f */
    /* compiled from: MyOrderTabFragment */
    class C11041f extends C1405m {

        /* renamed from: o */
        private final List<Fragment> f30542o = new ArrayList(2);

        /* renamed from: p */
        private final List<String> f30543p = new ArrayList(2);

        /* renamed from: q */
        private String[] f30544q = new String[2];

        public C11041f(C1382h hVar, int i) {
            super(hVar, 1);
            if (i == 0) {
                this.f30544q[0] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_orders);
                this.f30544q[1] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_deliveries);
            } else if (i == 1) {
                this.f30544q[0] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_deliveries);
                this.f30544q[1] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_orders);
            } else if (i == 2) {
                this.f30544q[0] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_orders);
                this.f30544q[1] = C11035n.this.getResources().getString(C10232R.string.lbl_tab_my_deliveries);
            }
        }

        /* renamed from: a */
        public int mo8886a() {
            return this.f30542o.size();
        }

        /* renamed from: a */
        public int mo8887a(Object obj) {
            return -2;
        }

        /* renamed from: c */
        public Fragment mo6390c(int i) {
            return (Fragment) this.f30542o.get(i);
        }

        /* renamed from: d */
        public View mo38800d(int i) {
            View inflate = C11035n.this.getActivity().getLayoutInflater().inflate(C10232R.layout.row_tab_layout_badge_count, null);
            ((TextView) inflate.findViewById(C10232R.C10236id.txtTabTitle)).setText((CharSequence) this.f30543p.get(i));
            return inflate;
        }

        /* renamed from: e */
        public void mo38801e(int i) {
            this.f30542o.remove(i);
            this.f30543p.remove(i);
            mo8894b();
        }

        /* renamed from: a */
        public void mo38798a(Fragment fragment, String str) {
            this.f30542o.add(fragment);
            this.f30543p.add(str);
        }

        /* renamed from: a */
        public void mo38799a(Fragment fragment, String str, int i) {
            this.f30542o.add(i, fragment);
            this.f30543p.add(i, str);
        }

        /* renamed from: a */
        public CharSequence mo8888a(int i) {
            return (CharSequence) this.f30543p.get(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m50184A() {
        for (int i = 0; i < f30515b0.getTabCount(); i++) {
            f30515b0.mo28096a(i).mo28191a(f30518e0.mo38800d(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m50199x() {
        StringBuilder sb = new StringBuilder();
        sb.append(" orderIds  : ");
        sb.append(this.f30529W);
        C5880q.m25754e(sb.toString());
        File[] listFiles = new File(Environment.getExternalStorageDirectory(), C11718b.m52722a(true)).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory() && !this.f30529W.contains(file.getName())) {
                    mo38790a(file);
                }
            }
        }
        File[] listFiles2 = new File(Environment.getExternalStorageDirectory(), C11718b.m52722a(false)).listFiles();
        if (listFiles2 != null) {
            for (File file2 : listFiles2) {
                if (file2.isDirectory() && !this.f30529W.contains(file2.getName())) {
                    mo38790a(file2);
                }
            }
        }
        this.f30525S.mo23470D().mo23449a(C11644i.f33204U2, new SimpleDateFormat(C11644i.f33420t6).format(new Date()));
    }

    /* renamed from: y */
    private void m50200y() {
        String str;
        String str2 = "";
        this.f30529W = str2;
        this.f30525S = new C5887x(getActivity());
        this.f30524R = this.f30523Q.getContext();
        this.f30531a = (Toolbar) this.f30523Q.findViewById(C10232R.C10236id.tborder);
        this.f30520N = (TextView) this.f30531a.findViewById(C10232R.C10236id.txtTitle);
        this.f30520N.setText(getString(C10232R.string.lbl_active_order));
        this.f30520N.setOnClickListener(this);
        if (VERSION.SDK_INT >= 21) {
            this.f30525S.mo23592c(this.f30523Q.findViewById(C10232R.C10236id.lltbOrder));
        }
        this.f30528V = (Spinner) this.f30531a.findViewById(C10232R.C10236id.spActiveInactive);
        mo38793w();
        this.f30521O = (TextView) this.f30531a.findViewById(C10232R.C10236id.txtTabBadgeCount);
        this.f30522P = (TextView) this.f30531a.findViewById(C10232R.C10236id.txtTabBadgeCountReverse);
        int i = C11644i.f33053B3;
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (i > 0) {
            this.f30521O.setVisibility(0);
            TextView textView = this.f30521O;
            if (C11644i.f33053B3 > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(C11644i.f33053B3);
                str = sb.toString();
            } else {
                str = str3;
            }
            textView.setText(str);
        } else {
            this.f30521O.setText(str2);
            this.f30521O.setVisibility(8);
        }
        if (C11644i.f33053B3 > 0) {
            this.f30522P.setVisibility(0);
            TextView textView2 = this.f30522P;
            if (C11644i.f33053B3 > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(C11644i.f33053B3);
                str3 = sb2.toString();
            }
            textView2.setText(str3);
        } else {
            this.f30522P.setText(str2);
            this.f30522P.setVisibility(8);
        }
        f30513Z = true;
        f30514a0 = true;
        f30512Y = (ViewPager) this.f30523Q.findViewById(C10232R.C10236id.vpShopsType);
        onAttachFragment(getParentFragment());
        f30512Y.addOnPageChangeListener(new C11036a());
        C5887x xVar = this.f30525S;
        if (xVar != null && xVar.mo23502X()) {
            m50197d(true);
        }
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30530X, new IntentFilter(C11644i.f33221W3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30530X, new IntentFilter(C11644i.f33197T3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30530X, new IntentFilter(C11644i.f33205U3));
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m50201z() {
        C5881v D = this.f30525S.mo23470D();
        String str = C11644i.f33204U2;
        if (D.mo23459f(str) == null) {
            return true;
        }
        try {
            if (TimeUnit.DAYS.convert(new Date().getTime() - new SimpleDateFormat(C11644i.f33420t6).parse(this.f30525S.mo23470D().mo23459f(str)).getTime(), TimeUnit.MILLISECONDS) >= ((long) C11644i.f33224W6)) {
                return true;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void onClick(View view) {
        view.equals(this.f30520N);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C11644i.f33269c1 = true;
        this.f30523Q = layoutInflater.inflate(C10232R.layout.fragment_btab_my_order, viewGroup, false);
        HomeActivity.m47460a((C11559c) this);
        f30519f0 = getActivity();
        C5880q.m25753d("onCreateView");
        return this.f30523Q;
    }

    public void onDestroy() {
        super.onDestroy();
        C11644i.f33269c1 = false;
    }

    public void onDestroyView() {
        try {
            C11042o oVar = (C11042o) f30518e0.mo6390c(0);
            if (oVar != null) {
                C2128a.m11089a((Context) getActivity()).mo9217a(oVar.f30567d0);
            }
            C11007j jVar = (C11007j) f30518e0.mo6390c(1);
            if (jVar != null) {
                C2128a.m11089a((Context) getActivity()).mo9217a(jVar.f30436d0);
            }
            f30515b0 = null;
            f30518e0 = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onDestroyView();
    }

    public void onPause() {
        super.onPause();
        C11644i.f33269c1 = false;
    }

    public void onResume() {
        super.onResume();
        C5880q.m25751b("onresume myorder");
        C11644i.f33269c1 = true;
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m50200y();
    }

    /* renamed from: t */
    public void mo38792t() {
    }

    /* renamed from: w */
    public void mo38793w() {
        String str;
        ArrayList<OrderSpinnerBean> arrayList = this.f30526T;
        String string = getResources().getString(C10232R.string.lbl_active_order);
        int i = C11644i.f33045A3;
        String str2 = "";
        String str3 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(C11644i.f33045A3);
            str = sb.toString();
        } else {
            str = str3;
        }
        arrayList.add(new OrderSpinnerBean(string, str));
        ArrayList<OrderSpinnerBean> arrayList2 = this.f30526T;
        String string2 = getResources().getString(C10232R.string.lbl_inactive_order);
        if (C11644i.f33053B3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(C11644i.f33053B3);
            str3 = sb2.toString();
        }
        arrayList2.add(new OrderSpinnerBean(string2, str3));
        this.f30527U = new C10991f(getActivity(), this.f30526T);
        this.f30528V.setAdapter(this.f30527U);
        C11040e eVar = new C11040e();
        this.f30528V.setOnItemSelectedListener(eVar);
        this.f30528V.setOnTouchListener(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50193c(int i) {
        if (f30512Y != null) {
            f30518e0 = new C11041f(getChildFragmentManager(), i);
            if (i == 0) {
                f30518e0.mo38798a(new C11042o(), getString(C10232R.string.lbl_tab_my_orders));
            } else if (i == 1) {
                f30518e0.mo38798a(new C11007j(), getString(C10232R.string.lbl_tab_my_deliveries));
            } else if (i == 2) {
                f30518e0.mo38798a(new C11042o(), getString(C10232R.string.lbl_tab_my_orders));
                f30518e0.mo38798a(new C11007j(), getString(C10232R.string.lbl_tab_my_deliveries));
            }
            f30512Y.setAdapter(f30518e0);
            f30512Y.setOffscreenPageLimit(2);
            f30515b0 = (TabLayout) this.f30523Q.findViewById(C10232R.C10236id.tabLayMyOrders);
            f30515b0.setupWithViewPager(f30512Y);
            m50184A();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50197d(boolean z) {
        C5887x xVar = this.f30525S;
        if (xVar == null || !xVar.mo23566a0()) {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30525S.mo23648p().latitude);
            hashMap.put("user_lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30525S.mo23648p().longitude);
            hashMap.put("user_long", sb2.toString());
            C5882b.m25774a(this.f30525S).myOrders(String.valueOf(this.f30525S.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C11039d(z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38790a(File file) {
        if (file.isDirectory()) {
            for (File a : file.listFiles()) {
                mo38790a(a);
            }
        }
        file.delete();
    }

    /* renamed from: a */
    private void m50187a(int i) {
        if (i == 0) {
            f30514a0 = true;
        } else {
            f30514a0 = false;
        }
        if (f30514a0) {
            this.f30520N.setOnClickListener(C11042o.f30546e0);
        } else {
            this.f30520N.setOnClickListener(C11007j.f30415e0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50194c(boolean z) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(this.f30525S.mo23648p().latitude);
        hashMap.put("user_lat", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f30525S.mo23648p().longitude);
        hashMap.put("user_long", sb2.toString());
        C5882b.m25774a(this.f30525S).myDeliveries(String.valueOf(this.f30525S.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C11038c(z));
    }

    /* renamed from: a */
    public static void m50188a(int i, int i2) {
        try {
            C7056k a = f30515b0.mo28096a(0);
            TextView textView = null;
            View c = a != null ? a.mo28197c() : null;
            TextView textView2 = c != null ? (TextView) c.findViewById(C10232R.C10236id.txtTabBadgeCount1) : null;
            String str = "";
            if (i <= 0) {
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.bringToFront();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                textView2.setText(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("txtCount0 is : ");
                sb2.append(textView2.getText().toString());
                C5880q.m25751b(sb2.toString());
            }
            C7056k a2 = f30515b0.mo28096a(1);
            View c2 = a2 != null ? a2.mo28197c() : null;
            if (c2 != null) {
                textView = (TextView) c2.findViewById(C10232R.C10236id.txtTabBadgeCount1);
            }
            if (i2 <= 0) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (textView != null) {
                textView.setVisibility(0);
                textView.bringToFront();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i2);
                textView.setText(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("txtCount1 is : ");
                sb4.append(textView.getText().toString());
                C5880q.m25751b(sb4.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
