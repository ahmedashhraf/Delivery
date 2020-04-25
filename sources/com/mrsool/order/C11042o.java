package com.mrsool.order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.facebook.appevents.AppEventsConstants;
import com.mrsool.C10232R;
import com.mrsool.HomeActivity;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.MyOrders;
import com.mrsool.bean.MyOrdersActive;
import com.mrsool.bean.MyOrdersInactive;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.p418u.C11558b;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11571b;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C5882b;
import java.util.HashMap;
import p053b.p072g.p073b.C2128a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.order.o */
/* compiled from: MyOrdersFragment */
public class C11042o extends Fragment {

    /* renamed from: e0 */
    public static OnClickListener f30546e0;

    /* renamed from: f0 */
    public static OnClickListener f30547f0;

    /* renamed from: g0 */
    public static OnClickListener f30548g0;

    /* renamed from: N */
    private C11029l f30549N;

    /* renamed from: O */
    private View f30550O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public RecyclerView f30551P;

    /* renamed from: Q */
    private RecyclerView f30552Q;

    /* renamed from: R */
    private WrapContentLinearLayoutManager f30553R;

    /* renamed from: S */
    private WrapContentLinearLayoutManager f30554S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C5887x f30555T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public AppSingleton f30556U;

    /* renamed from: V */
    private Toolbar f30557V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public TextView f30558W;

    /* renamed from: X */
    private TextView f30559X;

    /* renamed from: Y */
    private TextView f30560Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ProgressBar f30561Z;

    /* renamed from: a */
    private C11052i f30562a;

    /* renamed from: a0 */
    private TextView f30563a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C11002i f30564b;

    /* renamed from: b0 */
    private LinearLayout f30565b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public boolean f30566c0 = false;

    /* renamed from: d0 */
    public BroadcastReceiver f30567d0 = new C11043a();

    /* renamed from: com.mrsool.order.o$a */
    /* compiled from: MyOrdersFragment */
    class C11043a extends BroadcastReceiver {

        /* renamed from: com.mrsool.order.o$a$a */
        /* compiled from: MyOrdersFragment */
        class C11044a implements Runnable {
            C11044a() {
            }

            public void run() {
                C11042o.this.m50216A();
            }
        }

        C11043a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                char c = 65535;
                switch (action.hashCode()) {
                    case -2052949597:
                        if (action.equals(C11644i.f33237Y3)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1419500238:
                        if (action.equals(C11644i.f33070D4)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -383579142:
                        if (action.equals(C11644i.f33229X3)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 871257022:
                        if (action.equals(C11644i.f33181R3)) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        C11035n.f30514a0 = true;
                        C11042o.this.getActivity().runOnUiThread(new C11044a());
                    } else if (c == 2) {
                        C11042o.this.m50216A();
                    } else if (c == 3) {
                        if (intent.getExtras().containsKey(C11644i.f33314h1) && !TextUtils.isEmpty(intent.getExtras().getString(C11644i.f33314h1))) {
                            for (int i = 0; i < C11644i.f33468z6.size(); i++) {
                                if (((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId().equalsIgnoreCase(intent.getExtras().getString(C11644i.f33314h1))) {
                                    ((MyOrdersActive) C11644i.f33468z6.get(i)).setTrack_order(intent.getExtras().getBoolean(C11644i.f33171Q1));
                                    C11042o.this.f30555T.mo23549a(C11042o.this.f30551P);
                                    C11042o.this.f30564b.mo7341e();
                                }
                            }
                        }
                    }
                } else if (C11042o.this.f30555T.mo23502X()) {
                    C11042o.this.m50236x();
                } else {
                    C11042o.this.f30561Z.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.o$b */
    /* compiled from: MyOrdersFragment */
    class C11045b implements C11558b {
        C11045b() {
        }

        /* renamed from: a */
        public void mo38773a(int i) {
            C11042o.this.m50218a(i);
        }
    }

    /* renamed from: com.mrsool.order.o$c */
    /* compiled from: MyOrdersFragment */
    class C11046c implements C11558b {
        C11046c() {
        }

        /* renamed from: a */
        public void mo38773a(int i) {
            try {
                C11042o.this.m50228c(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.o$d */
    /* compiled from: MyOrdersFragment */
    class C11047d implements Callback<MyOrders> {
        C11047d() {
        }

        public void onFailure(Call<MyOrders> call, Throwable th) {
            C11042o.this.f30566c0 = true;
            try {
                if (C11042o.this.f30555T != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onFailure callMyOrders");
                    sb.append(th);
                    C5880q.m25753d(sb.toString());
                    C11042o.this.f30555T.mo23492O();
                    C11042o.this.f30555T.mo23591c((Context) C11042o.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<MyOrders> call, Response<MyOrders> response) {
            try {
                C11644i.f33120J6 = true;
                C11042o.this.f30566c0 = true;
                if (C11042o.this.f30555T == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    C11644i.f33144M6 = true;
                    C11644i.f33468z6.clear();
                    C11644i.f33048A6.clear();
                    C11644i.f33468z6.addAll(((MyOrders) response.body()).getActive());
                    C11644i.f33048A6.addAll(((MyOrders) response.body()).getInactive());
                    C11644i.f33061C3 = 0;
                    for (int i = 0; i < C11644i.f33468z6.size(); i++) {
                        if (((MyOrdersActive) C11644i.f33468z6.get(i)).getUnread().intValue() > 0) {
                            C11644i.f33061C3++;
                        }
                    }
                    C11644i.f33069D3 = 0;
                    for (int i2 = 0; i2 < C11644i.f33048A6.size(); i2++) {
                        if (((MyOrdersInactive) C11644i.f33048A6.get(i2)).getUnread().intValue() > 0) {
                            C11644i.f33069D3++;
                        }
                    }
                    C11042o.this.m50216A();
                    C11042o.this.m50235w();
                } else if (C11042o.this.f30555T != null && C11042o.this.f30556U != null) {
                    C11042o.this.f30555T.mo23576b((Context) C11042o.this.getActivity(), response.message());
                } else if (response.code() == 401) {
                    C11042o.this.f30555T.mo23613e0();
                }
            } catch (Exception e) {
                e.printStackTrace();
                C11042o.this.f30566c0 = true;
            }
        }
    }

    /* renamed from: com.mrsool.order.o$e */
    /* compiled from: MyOrdersFragment */
    class C11048e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f30573a;

        C11048e(int i) {
            this.f30573a = i;
        }

        public void run() {
            C11042o.this.m50223a(true, this.f30573a);
        }
    }

    /* renamed from: com.mrsool.order.o$f */
    /* compiled from: MyOrdersFragment */
    class C11049f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f30575a;

        C11049f(int i) {
            this.f30575a = i;
        }

        public void run() {
            C11042o.this.m50223a(false, this.f30575a);
        }
    }

    /* renamed from: com.mrsool.order.o$g */
    /* compiled from: MyOrdersFragment */
    class C11050g implements Callback<DefaultBean> {
        C11050g() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            try {
                if (C11042o.this.f30555T != null && C11042o.this.isAdded()) {
                    C11042o.this.f30555T.mo23492O();
                    C11042o.this.f30555T.mo23591c((Context) C11042o.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                if (C11042o.this.f30555T != null && C11042o.this.isAdded() && response.isSuccessful()) {
                    C11042o.this.isAdded();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.o$h */
    /* compiled from: MyOrdersFragment */
    class C11051h implements Runnable {
        C11051h() {
        }

        public void run() {
            if (C11042o.this.isAdded()) {
                if (C11035n.f30513Z) {
                    C11035n.m50188a(C11644i.f33061C3, C11644i.f33077E3);
                } else {
                    C11035n.m50188a(C11644i.f33069D3, C11644i.f33085F3);
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.o$i */
    /* compiled from: MyOrdersFragment */
    public interface C11052i {
        /* renamed from: b */
        void mo36527b(Uri uri);
    }

    /* renamed from: com.mrsool.order.o$j */
    /* compiled from: MyOrdersFragment */
    public class C11053j implements OnClickListener {

        /* renamed from: a */
        private final Context f30579a;

        /* synthetic */ C11053j(C11042o oVar, Context context, C11043a aVar) {
            this(context);
        }

        public void onClick(View view) {
            if (C11042o.this.f30558W.getText().toString().equalsIgnoreCase(C11042o.this.getString(C10232R.string.lbl_active_order))) {
                C11042o.this.f30558W.setText(C11042o.this.getString(C10232R.string.lbl_inactive_order));
                C11035n.f30513Z = false;
            } else {
                C11042o.this.f30558W.setText(C11042o.this.getString(C10232R.string.lbl_active_order));
                C11035n.f30513Z = true;
            }
            C11042o.this.m50216A();
        }

        private C11053j(Context context) {
            this.f30579a = context;
        }
    }

    /* renamed from: com.mrsool.order.o$k */
    /* compiled from: MyOrdersFragment */
    public class C11054k implements OnClickListener {

        /* renamed from: a */
        private final Context f30581a;

        /* synthetic */ C11054k(C11042o oVar, Context context, C11043a aVar) {
            this(context);
        }

        public void onClick(View view) {
        }

        private C11054k(Context context) {
            this.f30581a = context;
        }
    }

    /* renamed from: com.mrsool.order.o$l */
    /* compiled from: MyOrdersFragment */
    public class C11055l implements OnClickListener {

        /* renamed from: a */
        private final Context f30583a;

        /* synthetic */ C11055l(C11042o oVar, Context context, C11043a aVar) {
            this(context);
        }

        public void onClick(View view) {
        }

        private C11055l(Context context) {
            this.f30583a = context;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m50216A() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f30564b != null) {
                this.f30555T.mo23549a(this.f30551P);
                this.f30564b.mo7341e();
                if (this.f30549N != null) {
                    this.f30555T.mo23549a(this.f30552Q);
                    this.f30549N.mo7341e();
                }
                boolean z = C11035n.f30513Z;
                String str4 = "updateView MY ORDER >> HAVE ARRAY ";
                String str5 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
                String str6 = "";
                if (z) {
                    C5880q.m25753d("updateView MY ORDER >> ACTIVE ");
                    this.f30561Z.setVisibility(8);
                    if (C11644i.f33468z6.size() == 0) {
                        this.f30551P.setVisibility(8);
                        this.f30552Q.setVisibility(8);
                        this.f30563a0.setText(getString(C10232R.string.hint_no_active_order_found));
                        this.f30565b0.setVisibility(0);
                        C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                        C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                        if (C11644i.f33053B3 > 0) {
                            this.f30559X.setVisibility(0);
                            TextView textView = this.f30559X;
                            if (C11644i.f33053B3 > 0) {
                                StringBuilder sb = new StringBuilder();
                                sb.append(str6);
                                sb.append(C11644i.f33053B3);
                                str3 = sb.toString();
                            } else {
                                str3 = str5;
                            }
                            textView.setText(str3);
                        } else {
                            this.f30559X.setText(str6);
                            this.f30559X.setVisibility(8);
                        }
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        m50238z();
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    } else {
                        this.f30565b0.setVisibility(8);
                        C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                        C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                        m50238z();
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Order count : ");
                        sb2.append(C11644i.f33061C3);
                        C5880q.m25751b(sb2.toString());
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                        this.f30551P.setVisibility(0);
                        this.f30552Q.setVisibility(8);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str4);
                        sb3.append(C11644i.f33468z6.size());
                        C5880q.m25753d(sb3.toString());
                    }
                } else {
                    this.f30561Z.setVisibility(8);
                    if (C11644i.f33048A6.size() == 0) {
                        this.f30563a0.setText(getString(C10232R.string.hint_no_inactive_order_found));
                        this.f30565b0.setVisibility(0);
                        this.f30551P.setVisibility(8);
                        this.f30552Q.setVisibility(8);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("updateView MY ORDER >> NO RESULT");
                        sb4.append(C11644i.f33048A6.size());
                        C5880q.m25753d(sb4.toString());
                        C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                        C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                        if (C11644i.f33045A3 > 0) {
                            this.f30559X.setVisibility(0);
                            TextView textView2 = this.f30559X;
                            if (C11644i.f33045A3 > 0) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(str6);
                                sb5.append(C11644i.f33045A3);
                                str2 = sb5.toString();
                            } else {
                                str2 = str5;
                            }
                            textView2.setText(str2);
                        } else {
                            this.f30559X.setText(str6);
                            this.f30559X.setVisibility(8);
                        }
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                        m50238z();
                    } else {
                        this.f30565b0.setVisibility(8);
                        this.f30552Q.setVisibility(0);
                        this.f30551P.setVisibility(8);
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str4);
                        sb6.append(C11644i.f33048A6.size());
                        C5880q.m25753d(sb6.toString());
                        C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                        C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                        if (C11644i.f33045A3 > 0) {
                            this.f30559X.setVisibility(0);
                            TextView textView3 = this.f30559X;
                            if (C11644i.f33045A3 > 0) {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str6);
                                sb7.append(C11644i.f33045A3);
                                str = sb7.toString();
                            } else {
                                str = str5;
                            }
                            textView3.setText(str);
                        } else {
                            this.f30559X.setText(str6);
                            this.f30559X.setVisibility(8);
                        }
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        m50238z();
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    }
                }
                try {
                    if (C11035n.f30513Z) {
                        if (C11644i.f33053B3 > 0) {
                            this.f30560Y.setVisibility(0);
                            TextView textView4 = this.f30560Y;
                            if (C11644i.f33053B3 > 0) {
                                StringBuilder sb8 = new StringBuilder();
                                sb8.append(str6);
                                sb8.append(C11644i.f33053B3);
                                str5 = sb8.toString();
                            }
                            textView4.setText(str5);
                            return;
                        }
                        this.f30560Y.setText(str6);
                        this.f30560Y.setVisibility(8);
                    } else if (C11644i.f33045A3 > 0) {
                        this.f30560Y.setVisibility(0);
                        TextView textView5 = this.f30560Y;
                        if (C11644i.f33045A3 > 0) {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append(str6);
                            sb9.append(C11644i.f33045A3);
                            str5 = sb9.toString();
                        }
                        textView5.setText(str5);
                    } else {
                        this.f30560Y.setText(str6);
                        this.f30560Y.setVisibility(8);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m50235w() {
        new C11571b(getActivity()).mo39716a();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m50236x() {
        C5887x xVar = this.f30555T;
        if (xVar == null || !xVar.mo23566a0()) {
            this.f30566c0 = false;
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30555T.mo23648p().latitude);
            hashMap.put("user_lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30555T.mo23648p().longitude);
            hashMap.put("user_long", sb2.toString());
            C5882b.m25774a(this.f30555T).myOrders(String.valueOf(this.f30555T.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C11047d());
        }
    }

    /* renamed from: y */
    private void m50237y() {
        this.f30555T = new C5887x(getActivity());
        this.f30556U = (AppSingleton) getActivity().getApplicationContext();
        C11035n.f30514a0 = true;
        f30547f0 = new C11054k(this, getActivity(), null);
        f30548g0 = new C11055l(this, getActivity(), null);
        this.f30565b0 = (LinearLayout) this.f30550O.findViewById(C10232R.C10236id.layNDF);
        this.f30563a0 = (TextView) this.f30550O.findViewById(C10232R.C10236id.txtNDF);
        this.f30551P = (RecyclerView) this.f30550O.findViewById(C10232R.C10236id.rvMyOrdersActive);
        this.f30553R = new WrapContentLinearLayoutManager(getActivity());
        this.f30553R.mo7000l(1);
        this.f30551P.setLayoutManager(this.f30553R);
        this.f30551P.setItemAnimator(this.f30555T.mo23672x());
        this.f30564b = new C11002i(C11644i.f33468z6, getActivity());
        this.f30551P.setAdapter(this.f30564b);
        this.f30564b.mo38765a((C11558b) new C11045b());
        this.f30551P.setVisibility(8);
        this.f30552Q = (RecyclerView) this.f30550O.findViewById(C10232R.C10236id.rvMyOrdersInActive);
        this.f30554S = new WrapContentLinearLayoutManager(getActivity());
        this.f30554S.mo7000l(1);
        this.f30552Q.setLayoutManager(this.f30554S);
        this.f30552Q.setItemAnimator(this.f30555T.mo23672x());
        this.f30549N = new C11029l(C11644i.f33048A6, getActivity());
        this.f30552Q.setAdapter(this.f30549N);
        this.f30549N.mo38786a((C11558b) new C11046c());
        this.f30552Q.setVisibility(8);
        this.f30557V = (Toolbar) getActivity().findViewById(C10232R.C10236id.tborder);
        this.f30558W = (TextView) this.f30557V.findViewById(C10232R.C10236id.txtTitle);
        this.f30559X = (TextView) this.f30557V.findViewById(C10232R.C10236id.txtTabBadgeCount);
        this.f30560Y = (TextView) this.f30557V.findViewById(C10232R.C10236id.txtTabBadgeCountReverse);
        f30546e0 = new C11053j(this, getActivity(), null);
        this.f30561Z = (ProgressBar) this.f30550O.findViewById(C10232R.C10236id.pgLoadMore);
        if (!this.f30555T.mo23502X()) {
            this.f30561Z.setVisibility(8);
        } else if (!C11644i.f33120J6) {
            this.f30561Z.setVisibility(0);
            m50236x();
        } else {
            this.f30561Z.setVisibility(8);
            m50216A();
        }
    }

    /* renamed from: z */
    private void m50238z() {
        new Handler().postDelayed(new C11051h(), 100);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C11052i) {
            this.f30562a = (C11052i) context;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.toString());
        sb.append(" must implement OnFragmentInteractionListener");
        throw new RuntimeException(sb.toString());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f30550O = layoutInflater.inflate(C10232R.layout.fragment_my_orders, viewGroup, false);
        return this.f30550O;
    }

    public void onDestroy() {
        super.onDestroy();
        C2128a.m11089a((Context) getActivity()).mo9217a(this.f30567d0);
        C5880q.m25751b("MyOrdersFragment Destroyed");
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
        this.f30562a = null;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C11035n.f30514a0 = true;
        if (this.f30566c0) {
            m50216A();
        }
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m50237y();
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30567d0, new IntentFilter(C11644i.f33181R3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30567d0, new IntentFilter(C11644i.f33229X3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30567d0, new IntentFilter(C11644i.f33237Y3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30567d0, new IntentFilter(C11644i.f33070D4));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50228c(int i) {
        if (this.f30555T.mo23502X() && this.f30555T.mo23497S()) {
            try {
                if (C11644i.f33048A6.size() > i) {
                    Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                    intent.putExtra(C11644i.f33314h1, ((MyOrdersInactive) C11644i.f33048A6.get(i)).getIOrderId());
                    intent.putExtra(C11644i.f33323i1, ((MyOrdersInactive) C11644i.f33048A6.get(i)).getVShopName());
                    intent.putExtra(C11644i.f33332j1, i);
                    intent.putExtra("order_status", ((MyOrdersInactive) C11644i.f33048A6.get(i)).getOrderStatus());
                    intent.putExtra("is_buyer", true);
                    intent.putExtra(C11644i.f33227X1, ((MyOrdersInactive) C11644i.f33048A6.get(i)).getUnread());
                    startActivity(intent);
                }
                if (C11644i.f33048A6.size() > i) {
                    if (((MyOrdersInactive) C11644i.f33048A6.get(i)).getUnread().intValue() > 0) {
                        C11644i.f33069D3--;
                        C11644i.f33053B3--;
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        C11644i.f33101H3 = 0;
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                        m50222a(((MyOrdersInactive) C11644i.f33048A6.get(i)).getIOrderId(), i, false);
                        new Handler().postDelayed(new C11049f(i), 300);
                    }
                    m50238z();
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("IndexOutOfBoundException:");
                sb.append(e.getMessage());
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* renamed from: b */
    public void mo38802b(Uri uri) {
        C11052i iVar = this.f30562a;
        if (iVar != null) {
            iVar.mo36527b(uri);
        }
    }

    /* renamed from: a */
    private void m50219a(int i, int i2) {
        Intent intent = new Intent(C11644i.f33221W3);
        intent.putExtra("active", i);
        intent.putExtra("inactive", i2);
        C2128a.m11089a((Context) getActivity()).mo9219a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50218a(int i) {
        if (this.f30555T.mo23502X() && this.f30555T.mo23497S()) {
            try {
                if (C11644i.f33468z6.size() > i) {
                    Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                    intent.putExtra(C11644i.f33314h1, ((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId());
                    intent.putExtra(C11644i.f33323i1, ((MyOrdersActive) C11644i.f33468z6.get(i)).getVShopName());
                    intent.putExtra(C11644i.f33332j1, i);
                    intent.putExtra("is_buyer", true);
                    intent.putExtra("order_status", ((MyOrdersActive) C11644i.f33468z6.get(i)).getOrderStatus());
                    intent.putExtra(C11644i.f33227X1, ((MyOrdersActive) C11644i.f33468z6.get(i)).getUnread());
                    startActivityForResult(intent, 113);
                }
                if (C11644i.f33468z6.size() > i) {
                    if (((MyOrdersActive) C11644i.f33468z6.get(i)).getUnread().intValue() > 0) {
                        C11644i.f33061C3--;
                        C11644i.f33045A3--;
                        m50219a(C11644i.f33045A3, C11644i.f33053B3);
                        int i2 = 0;
                        C11644i.f33101H3 = 0;
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                        if (C11644i.f33101H3 > 0) {
                            i2 = C11644i.f33101H3;
                        }
                        aHBottomNavigation.mo11496b(i2, 1);
                        m50222a(((MyOrdersActive) C11644i.f33468z6.get(i)).getIOrderId(), i, true);
                        new Handler().postDelayed(new C11048e(i), 300);
                    }
                    m50238z();
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("IndexOutOfBoundException:");
                sb.append(e.getMessage());
                C5880q.m25751b(sb.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50223a(boolean z, int i) {
        Integer valueOf = Integer.valueOf(0);
        if (z) {
            if (i < C11644i.f33468z6.size()) {
                ((MyOrdersActive) C11644i.f33468z6.get(i)).setUnread(valueOf);
                this.f30551P.setAdapter(this.f30564b);
                this.f30555T.mo23549a(this.f30551P);
                this.f30564b.mo7341e();
            }
        } else if (i < C11644i.f33048A6.size()) {
            ((MyOrdersInactive) C11644i.f33048A6.get(i)).setUnread(valueOf);
            this.f30552Q.setAdapter(this.f30549N);
            this.f30555T.mo23549a(this.f30552Q);
            this.f30549N.mo7341e();
        }
    }

    /* renamed from: a */
    private void m50222a(String str, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("iOrderId", str);
        hashMap.put("iToUserId", this.f30555T.mo23468C().mo23459f("user_id"));
        C5882b.m25774a(this.f30555T).readChatMessage(str, hashMap).enqueue(new C11050g());
    }
}
