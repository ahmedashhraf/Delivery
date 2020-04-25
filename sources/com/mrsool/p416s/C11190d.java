package com.mrsool.p416s;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0986h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1467n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout.C1814j;
import com.google.android.material.button.MaterialButton;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.NotificationBean;
import com.mrsool.bean.OnlineScreenLabels;
import com.mrsool.bean.PendingOrderListBean;
import com.mrsool.bean.PendingOrderNotificationBean;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5881v;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a.C11599a;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.s.d */
/* compiled from: CourierPendingOrdersFragment */
public class C11190d extends Fragment implements OnClickListener {

    /* renamed from: N */
    private RecyclerView f31009N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public TextView f31010O;

    /* renamed from: P */
    private TextView f31011P;

    /* renamed from: Q */
    private TextView f31012Q;

    /* renamed from: R */
    private LinearLayout f31013R;

    /* renamed from: S */
    private LinearLayout f31014S;

    /* renamed from: T */
    private LinearLayout f31015T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public MaterialButton f31016U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C11196e f31017V;

    /* renamed from: W */
    private ProgressBar f31018W;

    /* renamed from: X */
    private ImageView f31019X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public int f31020Y = 0;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public SwipeRefreshLayout f31021Z;

    /* renamed from: a */
    private View f31022a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public boolean f31023a0 = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C5887x f31024b;

    /* renamed from: b0 */
    private Group f31025b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public TextView f31026c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public MaterialButton f31027d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public TextView f31028e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public TextView f31029f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public TextView f31030g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public MaterialButton f31031h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public OnlineScreenLabels f31032i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public Dialog f31033j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public ArrayList<PendingOrderNotificationBean> f31034k0 = new ArrayList<>();

    /* renamed from: l0 */
    private BroadcastReceiver f31035l0 = new C11193c();

    /* renamed from: com.mrsool.s.d$a */
    /* compiled from: CourierPendingOrdersFragment */
    class C11191a implements C1814j {
        C11191a() {
        }

        /* renamed from: a */
        public void mo8147a() {
            if (!C11190d.this.f31023a0) {
                C11190d.this.m50662w();
            }
        }
    }

    /* renamed from: com.mrsool.s.d$b */
    /* compiled from: CourierPendingOrdersFragment */
    class C11192b extends C11725f {
        C11192b() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C11190d.this.m50636a(i);
        }
    }

    /* renamed from: com.mrsool.s.d$c */
    /* compiled from: CourierPendingOrdersFragment */
    class C11193c extends BroadcastReceiver {
        C11193c() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            if (intent.getAction().equalsIgnoreCase(C11644i.f33442w4) || intent.getAction().equalsIgnoreCase(C11644i.f33150N4)) {
                C11190d.this.m50662w();
            }
        }
    }

    /* renamed from: com.mrsool.s.d$d */
    /* compiled from: CourierPendingOrdersFragment */
    class C11194d implements Callback<PendingOrderListBean> {
        C11194d() {
        }

        public void onFailure(Call<PendingOrderListBean> call, Throwable th) {
            C11190d.this.f31023a0 = false;
            C11190d.this.f31021Z.setRefreshing(false);
            try {
                if (C11190d.this.f31024b != null && C11190d.this.isAdded()) {
                    C11190d.this.f31024b.mo23492O();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<PendingOrderListBean> call, Response<PendingOrderListBean> response) {
            C11190d.this.f31023a0 = false;
            C11190d.this.f31021Z.setRefreshing(false);
            if (C11190d.this.isAdded() && C11190d.this.f31024b != null) {
                C11190d.this.f31024b.mo23492O();
                if (!response.isSuccessful()) {
                    return;
                }
                if (((PendingOrderListBean) response.body()).getCode().intValue() <= 300) {
                    if (!((PendingOrderListBean) response.body()).getUserStats().getOrderNotification()) {
                        C11190d.this.f31020Y = 1;
                    } else if (((PendingOrderListBean) response.body()).getNotifications().size() <= 0) {
                        C11190d.this.f31020Y = 2;
                    } else {
                        C11190d.this.f31020Y = 0;
                    }
                    C11190d.this.f31034k0.clear();
                    C11190d.this.f31034k0.addAll(((PendingOrderListBean) response.body()).getNotifications());
                    C11190d.this.f31017V.mo7341e();
                    TextView p = C11190d.this.f31010O;
                    String string = C11190d.this.getString(C10232R.string.lbl_pending_orders_hurry_up);
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(C11190d.this.f31034k0.size());
                    p.setText(String.format(string, new Object[]{sb.toString()}));
                    try {
                        if (!(((PendingOrderListBean) response.body()).getUserStats() == null || ((PendingOrderListBean) response.body()).getUserStats().getOnlineScreenLabels() == null)) {
                            C11190d.this.f31032i0 = ((PendingOrderListBean) response.body()).getUserStats().getOnlineScreenLabels();
                            C11190d.this.f31031h0.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getOfflineButton()));
                            C11190d.this.f31028e0.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getOffline1()));
                            C11190d.this.f31029f0.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getNerabyNotif()));
                            C11190d.this.f31016U.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getOnline2()));
                            C11190d.this.f31030g0.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getOfferSubmitNotif()));
                            C11190d.this.f31027d0.setText(C11190d.this.f31024b.mo23471D(C11190d.this.f31032i0.getConfirmButton()));
                        }
                        if (!(((PendingOrderListBean) response.body()).getUserStats() == null || ((PendingOrderListBean) response.body()).getUserStats().getTooltipRes() == null)) {
                            C11190d.this.f31026c0.setText(C11190d.this.m50635a(C11190d.this.f31024b.mo23471D(((PendingOrderListBean) response.body()).getUserStats().getTooltipRes().getLabel()), ((PendingOrderListBean) response.body()).getUserStats().getTooltipRes().getHighlight()));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    C11190d.this.m50632B();
                } else if (C11190d.this.f31024b != null) {
                    C11190d.this.f31024b.mo23475F(((PendingOrderListBean) response.body()).getMessage());
                }
            }
        }
    }

    /* renamed from: com.mrsool.s.d$e */
    /* compiled from: CourierPendingOrdersFragment */
    class C11195e implements Callback<NotificationBean> {
        C11195e() {
        }

        public void onFailure(Call<NotificationBean> call, Throwable th) {
            C11190d.this.m50648d(false);
            if (C11190d.this.f31033j0 != null && C11190d.this.f31033j0.isShowing()) {
                C11190d.this.f31033j0.dismiss();
            }
        }

        public void onResponse(Call<NotificationBean> call, Response<NotificationBean> response) {
            if (response.isSuccessful()) {
                int i = 0;
                C11190d.this.m50648d(false);
                if (((NotificationBean) response.body()).getCode().intValue() <= 300) {
                    C11190d dVar = C11190d.this;
                    if (dVar.f31034k0.size() <= 0) {
                        i = 2;
                    }
                    dVar.f31020Y = i;
                    C11190d.this.m50632B();
                    C11190d.this.m50662w();
                } else if (C11190d.this.f31033j0 != null && C11190d.this.f31033j0.isShowing()) {
                    C11190d.this.f31033j0.dismiss();
                }
            }
        }
    }

    /* renamed from: A */
    private void m50631A() {
        try {
            this.f31033j0 = this.f31024b.mo23508a((int) C10232R.layout.dialog_go_offline, true);
            TextView textView = (TextView) this.f31033j0.findViewById(C10232R.C10236id.tvTitleOffline);
            TextView textView2 = (TextView) this.f31033j0.findViewById(C10232R.C10236id.tvWarnOffline);
            MaterialButton materialButton = (MaterialButton) this.f31033j0.findViewById(C10232R.C10236id.btnCancel);
            MaterialButton materialButton2 = (MaterialButton) this.f31033j0.findViewById(C10232R.C10236id.btnYesOffline);
            TextView textView3 = (TextView) this.f31033j0.findViewById(C10232R.C10236id.tvOfflineDesc);
            ProgressBar progressBar = (ProgressBar) this.f31033j0.findViewById(C10232R.C10236id.pbOffline);
            C1467n nVar = new C1467n();
            textView2.setText(this.f31032i0.getConfirmationNotif());
            textView3.setText(this.f31032i0.getOrderStoppedNotif());
            textView.setText(this.f31032i0.getOnline1());
            materialButton2.setText(this.f31032i0.getOffline2());
            materialButton2.setOnClickListener(new C11189c(this, nVar));
            materialButton.setOnClickListener(new C11187a(this));
            nVar.mo6478a(getViewLifecycleOwner(), new C11188b(progressBar, materialButton2));
            this.f31033j0.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m50632B() {
        try {
            int i = this.f31020Y;
            boolean z = true;
            if (i == 0) {
                this.f31014S.setVisibility(8);
                this.f31015T.setVisibility(0);
                this.f31010O.setVisibility(0);
                this.f31013R.setVisibility(8);
                HomeActivity.f27246i1.mo11496b(this.f31034k0.size(), 3);
                this.f31021Z.setEnabled(true);
                this.f31031h0.setVisibility(0);
            } else if (i == 1) {
                this.f31014S.setVisibility(0);
                C5887x.m25802a((View) this.f31009N, false);
                this.f31015T.setVisibility(0);
                this.f31013R.setVisibility(8);
                HomeActivity.f27246i1.mo11496b(0, 3);
                this.f31021Z.setEnabled(false);
                if (this.f31034k0.size() > 0) {
                    this.f31010O.setVisibility(0);
                } else {
                    this.f31010O.setVisibility(8);
                }
                this.f31031h0.setVisibility(8);
                if (this.f31033j0 != null && this.f31033j0.isShowing()) {
                    this.f31033j0.dismiss();
                }
            } else if (i == 2) {
                this.f31014S.setVisibility(8);
                C5887x.m25802a((View) this.f31009N, true);
                this.f31015T.setVisibility(8);
                this.f31013R.setVisibility(0);
                HomeActivity.f27246i1.mo11496b(0, 3);
                this.f31021Z.setEnabled(true);
                this.f31031h0.setVisibility(0);
            }
            if (this.f31024b.mo23468C().mo23450a(C11644i.f33311g7) || this.f31020Y == 1) {
                z = false;
            }
            m50646c(z);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m50662w() {
        if (isAdded() && this.f31024b.mo23502X()) {
            C5881v C = this.f31024b.mo23468C();
            String str = C11644i.f33303g;
            if (C.mo23459f(str) != null) {
                C5881v C2 = this.f31024b.mo23468C();
                String str2 = C11644i.f33312h;
                if (C2.mo23459f(str2) != null) {
                    this.f31023a0 = true;
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_lat", String.valueOf(this.f31024b.mo23468C().mo23459f(str)));
                    hashMap.put("user_long", String.valueOf(this.f31024b.mo23468C().mo23459f(str2)));
                    hashMap.put("language", String.valueOf(this.f31024b.mo23645o()));
                    hashMap.put("current_user_id", this.f31024b.mo23476G());
                    hashMap.put("auth_token", this.f31024b.mo23640m());
                    C11687c.m52645a(this.f31024b).getCourierPendingOrders2(this.f31024b.mo23468C().mo23459f("user_id"), hashMap).enqueue(new C11194d());
                }
            }
        }
    }

    /* renamed from: x */
    private void m50663x() {
        this.f31024b = new C5887x(getActivity());
        this.f31010O = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvOrderCount);
        this.f31009N = (RecyclerView) this.f31022a.findViewById(C10232R.C10236id.rvCoPendingOrder);
        this.f31016U = (MaterialButton) this.f31022a.findViewById(C10232R.C10236id.btnOnline);
        this.f31013R = (LinearLayout) this.f31022a.findViewById(C10232R.C10236id.llNoData);
        this.f31014S = (LinearLayout) this.f31022a.findViewById(C10232R.C10236id.llNotification);
        this.f31015T = (LinearLayout) this.f31022a.findViewById(C10232R.C10236id.llList);
        this.f31018W = (ProgressBar) this.f31022a.findViewById(C10232R.C10236id.pgEnableNotification);
        this.f31011P = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvyikes);
        this.f31012Q = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvSitTight);
        m50664y();
        this.f31025b0 = (Group) this.f31022a.findViewById(C10232R.C10236id.cgToolTip);
        this.f31026c0 = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvTooltipMessage);
        this.f31027d0 = (MaterialButton) this.f31022a.findViewById(C10232R.C10236id.btnTooltipDone);
        this.f31027d0.setOnClickListener(this);
        this.f31031h0 = (MaterialButton) this.f31022a.findViewById(C10232R.C10236id.btnOffline);
        this.f31028e0 = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvOfflineTitle);
        this.f31029f0 = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvNearBy);
        this.f31030g0 = (TextView) this.f31022a.findViewById(C10232R.C10236id.tvOfferSubmit);
        this.f31021Z = (SwipeRefreshLayout) this.f31022a.findViewById(C10232R.C10236id.pullToRefresh);
        this.f31021Z.setColorSchemeColors(-16776961, C0986h.f4419u, -16776961);
        this.f31021Z.setColorSchemeColors(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.colorAccent));
        this.f31021Z.setOnRefreshListener(new C11191a());
        if (VERSION.SDK_INT >= 21) {
            this.f31024b.mo23592c(this.f31022a.findViewById(C10232R.C10236id.llMain));
        }
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(1);
        this.f31009N.setLayoutManager(wrapContentLinearLayoutManager);
        this.f31009N.setItemAnimator(this.f31024b.mo23672x());
        this.f31017V = new C11196e(getActivity(), this.f31034k0, new C11192b());
        this.f31009N.setAdapter(this.f31017V);
        this.f31016U.setOnClickListener(this);
        this.f31031h0.setOnClickListener(this);
        m50662w();
        this.f31024b.mo23540a(this.f31035l0, C11644i.f33442w4);
        this.f31024b.mo23540a(this.f31035l0, C11644i.f33150N4);
    }

    /* renamed from: y */
    private void m50664y() {
        if (this.f31024b.mo23496R()) {
            this.f31011P.setText(" يا للهول! 😅");
            this.f31012Q.setText(" لحظة من فضلك! 👌");
            return;
        }
        this.f31011P.setText("Yikes... 😅");
        this.f31012Q.setText(" Sit tight! 👌");
    }

    /* renamed from: z */
    private void m50665z() {
        this.f31024b.mo23468C().mo23448a(C11644i.f33311g7, Boolean.valueOf(true));
        m50646c(false);
    }

    public void onClick(View view) {
        if (view.equals(this.f31016U)) {
            m50639a(true, null);
        } else if (view == this.f31031h0) {
            m50665z();
            m50631A();
        } else if (view == this.f31027d0) {
            m50665z();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31022a = layoutInflater.inflate(C10232R.layout.fragment_courier_pending_orders, viewGroup, false);
        return this.f31022a;
    }

    public void onResume() {
        C5880q.m25751b("onResume PendingOrdersFragment");
        super.onResume();
        m50662w();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m50663x();
    }

    /* renamed from: c */
    private void m50646c(boolean z) {
        boolean z2 = false;
        this.f31025b0.setVisibility(z ? 0 : 8);
        this.f31025b0.animate().alpha(z ? 1.0f : 0.0f).setDuration(500).setListener(null);
        RecyclerView recyclerView = this.f31009N;
        if (!z && this.f31014S.getVisibility() == 8) {
            z2 = true;
        }
        C5887x.m25802a((View) recyclerView, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50648d(boolean z) {
        if (z) {
            this.f31018W.setVisibility(0);
            this.f31016U.setAlpha(0.5f);
            return;
        }
        this.f31018W.setVisibility(8);
        this.f31016U.setAlpha(1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50636a(int i) {
        try {
            if ((this.f31024b.mo23497S() || (this.f31024b.mo23502X() && this.f31024b.mo23500V())) && this.f31034k0.size() > 0 && i >= 0 && this.f31034k0.size() > i) {
                Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                intent.putExtra(C11644i.f33314h1, ((PendingOrderNotificationBean) this.f31034k0.get(i)).getOrderId());
                intent.putExtra(C11644i.f33258b, C11599a.COURIERTAB.mo39842d());
                intent.putExtra(C11644i.f33332j1, i);
                intent.putExtra("count", this.f31034k0.size());
                startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo39021a(C1467n nVar, View view) {
        m50639a(false, nVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo39020a(View view) {
        this.f31033j0.dismiss();
    }

    /* renamed from: a */
    static /* synthetic */ void m50637a(ProgressBar progressBar, MaterialButton materialButton, Boolean bool) {
        int i = 0;
        progressBar.setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            i = 4;
        }
        materialButton.setVisibility(i);
    }

    /* renamed from: a */
    private void m50639a(boolean z, C1467n<Boolean> nVar) {
        if (this.f31024b.mo23502X() && this.f31024b.mo23497S()) {
            m50648d(true);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f31024b.mo23476G());
            hashMap.put("auth_token", this.f31024b.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("vDeviceToken", this.f31024b.mo23468C().mo23459f(C11644i.f33419t5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(z);
            hashMap.put("bNotification", sb.toString());
            if (nVar != null) {
                nVar.mo6483b(Boolean.valueOf(true));
            }
            C11687c.m52645a(this.f31024b).updateNotificationStatus(this.f31024b.mo23476G(), hashMap).enqueue(new C11195e());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public CharSequence m50635a(String str, List<String> list) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(-1), 0, str.length(), 33);
        for (int i = 0; i < list.size(); i++) {
            int i2 = -1;
            while (true) {
                int indexOf = str.indexOf((String) list.get(i), i2 + 1);
                if (indexOf == -1) {
                    break;
                }
                System.out.println(indexOf);
                spannableString.setSpan(new ForegroundColorSpan(C0841b.m4915a(requireContext(), (int) C10232R.C10234color.white)), indexOf, ((String) list.get(i)).length() + indexOf, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, ((String) list.get(i)).length() + indexOf, 33);
                i2 = indexOf + 1;
            }
        }
        return TextUtils.concat(new CharSequence[]{spannableString});
    }
}
