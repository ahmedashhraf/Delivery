package com.mrsool.order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
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
import com.mrsool.socket.LocationService;
import com.mrsool.utils.AppSingleton;
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

/* renamed from: com.mrsool.order.j */
/* compiled from: MyDeliveriesFragment */
public class C11007j extends Fragment {

    /* renamed from: e0 */
    public static OnClickListener f30415e0;

    /* renamed from: f0 */
    public static OnClickListener f30416f0;

    /* renamed from: g0 */
    public static OnClickListener f30417g0;

    /* renamed from: N */
    private C11023k f30418N;

    /* renamed from: O */
    private View f30419O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public RecyclerView f30420P;

    /* renamed from: Q */
    private RecyclerView f30421Q;

    /* renamed from: R */
    private WrapContentLinearLayoutManager f30422R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C5887x f30423S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public AppSingleton f30424T;

    /* renamed from: U */
    private Toolbar f30425U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f30426V;

    /* renamed from: W */
    private TextView f30427W;

    /* renamed from: X */
    private TextView f30428X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public ProgressBar f30429Y;

    /* renamed from: Z */
    private TextView f30430Z;

    /* renamed from: a */
    private C11019k f30431a;

    /* renamed from: a0 */
    private LinearLayout f30432a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C10996h f30433b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public boolean f30434b0 = false;

    /* renamed from: c0 */
    private int f30435c0;

    /* renamed from: d0 */
    public BroadcastReceiver f30436d0 = new C11008a();

    /* renamed from: com.mrsool.order.j$a */
    /* compiled from: MyDeliveriesFragment */
    class C11008a extends BroadcastReceiver {

        /* renamed from: com.mrsool.order.j$a$a */
        /* compiled from: MyDeliveriesFragment */
        class C11009a implements Runnable {
            C11009a() {
            }

            public void run() {
                C11007j.this.m50132B();
            }
        }

        C11008a() {
        }

        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                char c = 65535;
                int i = 0;
                switch (action.hashCode()) {
                    case -1464282144:
                        if (action.equals(C11644i.f33094G4)) {
                            c = 5;
                            break;
                        }
                        break;
                    case -1419500238:
                        if (action.equals(C11644i.f33070D4)) {
                            c = 3;
                            break;
                        }
                        break;
                    case -959793035:
                        if (action.equals(C11644i.f33245Z3)) {
                            c = 2;
                            break;
                        }
                        break;
                    case -383579142:
                        if (action.equals(C11644i.f33229X3)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 784473508:
                        if (action.equals(C11644i.f33189S3)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1435953244:
                        if (action.equals(C11644i.f33086F4)) {
                            c = 4;
                            break;
                        }
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        C11035n.f30514a0 = false;
                        C11007j.this.getActivity().runOnUiThread(new C11009a());
                    } else if (c == 2) {
                        C11007j.this.m50132B();
                    } else if (c != 3) {
                        if (c != 4) {
                            if (c == 5) {
                                if (intent.getExtras().containsKey(C11644i.f33314h1) && !TextUtils.isEmpty(intent.getExtras().getString(C11644i.f33314h1))) {
                                    while (i < C11644i.f33056B6.size()) {
                                        if (((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId().equalsIgnoreCase(intent.getExtras().getString(C11644i.f33314h1))) {
                                            ((MyOrdersActive) C11644i.f33056B6.get(i)).setTrack_order(intent.getExtras().getBoolean(C11644i.f33171Q1));
                                            C11007j.this.f30423S.mo23549a(C11007j.this.f30420P);
                                            C11007j.this.f30433b.mo7341e();
                                            ((MyOrdersActive) C11644i.f33056B6.get(i)).setAutostop_tracking(true);
                                            C11007j.this.m50156z();
                                            return;
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else if (intent.getExtras().containsKey(C11644i.f33314h1) && !TextUtils.isEmpty(intent.getExtras().getString(C11644i.f33314h1))) {
                            while (i < C11644i.f33056B6.size()) {
                                if (((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId().equalsIgnoreCase(intent.getExtras().getString(C11644i.f33314h1))) {
                                    ((MyOrdersActive) C11644i.f33056B6.get(i)).setTrack_order(intent.getExtras().getBoolean(C11644i.f33171Q1));
                                    C11007j.this.f30423S.mo23549a(C11007j.this.f30420P);
                                    C11007j.this.f30433b.mo7341e();
                                    C11007j.this.m50140a(C11644i.f33457y3, intent.getExtras().getString(C11644i.f33314h1));
                                    return;
                                }
                                i++;
                            }
                        }
                    } else if (intent.getExtras().containsKey(C11644i.f33314h1) && !TextUtils.isEmpty(intent.getExtras().getString(C11644i.f33314h1))) {
                        while (i < C11644i.f33056B6.size()) {
                            if (((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId().equalsIgnoreCase(intent.getExtras().getString(C11644i.f33314h1))) {
                                ((MyOrdersActive) C11644i.f33056B6.get(i)).setTrack_order(intent.getExtras().getBoolean(C11644i.f33171Q1));
                                C11007j.this.f30423S.mo23549a(C11007j.this.f30420P);
                                C11007j.this.f30433b.mo7341e();
                                C11007j.this.m50156z();
                                return;
                            }
                            i++;
                        }
                    }
                } else if (C11007j.this.f30423S.mo23502X()) {
                    C11007j.this.m50154x();
                } else {
                    C11007j.this.f30429Y.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.j$b */
    /* compiled from: MyDeliveriesFragment */
    class C11010b implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ String f30439a;

        C11010b(String str) {
            this.f30439a = str;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (C11007j.this.f30423S == null) {
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (C11007j.this.f30423S != null && C11007j.this.getActivity() != null && response.isSuccessful() && ((DefaultBean) response.body()).getCode().intValue() < 300) {
                this.f30439a.equalsIgnoreCase(C11644i.f33194T0);
            }
        }
    }

    /* renamed from: com.mrsool.order.j$c */
    /* compiled from: MyDeliveriesFragment */
    class C11011c implements C11558b {
        C11011c() {
        }

        /* renamed from: a */
        public void mo38773a(int i) {
            try {
                C11007j.this.m50134a(i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.j$d */
    /* compiled from: MyDeliveriesFragment */
    class C11012d implements C11558b {
        C11012d() {
        }

        /* renamed from: a */
        public void mo38773a(int i) {
            C11007j.this.m50147c(i);
        }
    }

    /* renamed from: com.mrsool.order.j$e */
    /* compiled from: MyDeliveriesFragment */
    class C11013e implements Callback<MyOrders> {
        C11013e() {
        }

        public void onFailure(Call<MyOrders> call, Throwable th) {
            C11007j.this.f30434b0 = true;
            try {
                if (C11007j.this.f30423S != null) {
                    C5880q.m25753d("onFailure callMyDeliveries");
                    C11007j.this.f30423S.mo23492O();
                    C11007j.this.f30423S.mo23591c((Context) C11007j.this.getActivity());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<MyOrders> call, Response<MyOrders> response) {
            String str = "welcome_";
            try {
                C11644i.f33128K6 = true;
                C11007j.this.f30434b0 = true;
                if (C11007j.this.f30423S == null) {
                    return;
                }
                if (response.isSuccessful()) {
                    C11007j.this.f30429Y.setVisibility(8);
                    C11644i.f33144M6 = true;
                    C11644i.f33056B6.clear();
                    C11644i.f33064C6.clear();
                    C11644i.f33056B6.addAll(((MyOrders) response.body()).getActive());
                    C11644i.f33064C6.addAll(((MyOrders) response.body()).getInactive());
                    C11644i.f33077E3 = 0;
                    for (int i = 0; i < C11644i.f33056B6.size(); i++) {
                        if (((MyOrdersActive) C11644i.f33056B6.get(i)).getUnread().intValue() > 0) {
                            C11644i.f33077E3++;
                        }
                    }
                    C11644i.f33085F3 = 0;
                    for (int i2 = 0; i2 < C11644i.f33064C6.size(); i2++) {
                        if (((MyOrdersInactive) C11644i.f33064C6.get(i2)).getUnread().intValue() > 0) {
                            C11644i.f33085F3++;
                        }
                        SharedPreferences b = C11007j.this.f30423S.mo23470D().mo23451b();
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(((MyOrdersInactive) C11644i.f33064C6.get(i2)).getIOrderId());
                        if (b.contains(sb.toString())) {
                            Editor edit = C11007j.this.f30423S.mo23470D().mo23451b().edit();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(((MyOrdersInactive) C11644i.f33064C6.get(i2)).getIOrderId());
                            edit.remove(sb2.toString()).apply();
                        }
                    }
                    C11007j.this.m50156z();
                    C11007j.this.m50132B();
                } else if (C11007j.this.f30423S != null && C11007j.this.f30424T != null) {
                    C11007j.this.f30423S.mo23576b((Context) C11007j.this.getActivity(), response.message());
                } else if (response.code() == 401) {
                    C11007j.this.f30423S.mo23613e0();
                }
            } catch (Exception e) {
                e.printStackTrace();
                C11007j.this.f30434b0 = true;
            }
        }
    }

    /* renamed from: com.mrsool.order.j$f */
    /* compiled from: MyDeliveriesFragment */
    class C11014f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f30444a;

        C11014f(int i) {
            this.f30444a = i;
        }

        public void run() {
            C11007j.this.m50141a(false, this.f30444a);
        }
    }

    /* renamed from: com.mrsool.order.j$g */
    /* compiled from: MyDeliveriesFragment */
    class C11015g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f30446a;

        C11015g(int i) {
            this.f30446a = i;
        }

        public void run() {
            C11007j.this.m50141a(true, this.f30446a);
        }
    }

    /* renamed from: com.mrsool.order.j$h */
    /* compiled from: MyDeliveriesFragment */
    class C11016h implements Callback<DefaultBean> {
        C11016h() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            try {
                C5880q.m25753d("onFailure callReadMessage");
                if (C11007j.this.f30423S != null && C11007j.this.isAdded()) {
                    C11007j.this.f30423S.mo23492O();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            try {
                if (C11007j.this.f30423S != null && C11007j.this.isAdded() && response.isSuccessful()) {
                    C11007j.this.isAdded();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.order.j$i */
    /* compiled from: MyDeliveriesFragment */
    class C11017i implements Runnable {
        C11017i() {
        }

        public void run() {
            if (C11007j.this.isAdded()) {
                if (C11035n.f30513Z) {
                    C11035n.m50188a(C11644i.f33061C3, C11644i.f33077E3);
                } else {
                    C11035n.m50188a(C11644i.f33069D3, C11644i.f33085F3);
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.j$j */
    /* compiled from: MyDeliveriesFragment */
    class C11018j implements Callback<DefaultBean> {

        /* renamed from: a */
        final /* synthetic */ String f30450a;

        C11018j(String str) {
            this.f30450a = str;
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (C11007j.this.f30423S == null) {
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (C11007j.this.f30423S != null && C11007j.this.getActivity() != null && response.isSuccessful() && ((DefaultBean) response.body()).getCode().intValue() < 300) {
                if (this.f30450a.equalsIgnoreCase(C11644i.f33457y3)) {
                    if (!C11007j.this.f30423S.mo23584b(LocationService.class)) {
                        C11007j.this.mo38770w();
                    }
                } else if (this.f30450a.equalsIgnoreCase(C11644i.f33465z3)) {
                    C11007j.this.getActivity().stopService(new Intent(C11007j.this.getActivity(), LocationService.class));
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.j$k */
    /* compiled from: MyDeliveriesFragment */
    public interface C11019k {
        /* renamed from: b */
        void mo36527b(Uri uri);
    }

    /* renamed from: com.mrsool.order.j$l */
    /* compiled from: MyDeliveriesFragment */
    public class C11020l implements OnClickListener {

        /* renamed from: a */
        private final Context f30452a;

        /* synthetic */ C11020l(C11007j jVar, Context context, C11008a aVar) {
            this(context);
        }

        public void onClick(View view) {
        }

        private C11020l(Context context) {
            this.f30452a = context;
        }
    }

    /* renamed from: com.mrsool.order.j$m */
    /* compiled from: MyDeliveriesFragment */
    public class C11021m implements OnClickListener {

        /* renamed from: a */
        private final Context f30454a;

        /* synthetic */ C11021m(C11007j jVar, Context context, C11008a aVar) {
            this(context);
        }

        public void onClick(View view) {
        }

        private C11021m(Context context) {
            this.f30454a = context;
        }
    }

    /* renamed from: com.mrsool.order.j$n */
    /* compiled from: MyDeliveriesFragment */
    public class C11022n implements OnClickListener {

        /* renamed from: a */
        private final Context f30456a;

        /* synthetic */ C11022n(C11007j jVar, Context context, C11008a aVar) {
            this(context);
        }

        public void onClick(View view) {
            if (C11007j.this.f30426V.getText().toString().equalsIgnoreCase(C11007j.this.getString(C10232R.string.lbl_active_order))) {
                C11007j.this.f30426V.setText(C11007j.this.getString(C10232R.string.lbl_inactive_order));
                C11035n.f30513Z = false;
            } else {
                C11007j.this.f30426V.setText(C11007j.this.getString(C10232R.string.lbl_active_order));
                C11035n.f30513Z = true;
            }
            C11007j.this.m50132B();
            StringBuilder sb = new StringBuilder();
            sb.append("onClick : My Deliveries : ");
            sb.append(C11007j.this.f30426V.getText().toString());
            C5880q.m25753d(sb.toString());
        }

        private C11022n(Context context) {
            this.f30456a = context;
        }
    }

    /* renamed from: A */
    private void m50131A() {
        new Handler().postDelayed(new C11017i(), 100);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m50132B() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f30433b != null) {
                this.f30423S.mo23549a(this.f30420P);
                this.f30433b.mo7341e();
            }
            if (this.f30418N != null) {
                this.f30423S.mo23549a(this.f30421Q);
                this.f30418N.mo7341e();
            }
            C5880q.m25753d("updateView MY DELIVERIES  ");
            boolean z = C11035n.f30513Z;
            String str4 = "updateView MY DELIVERIES >> HAVE ARRAY ";
            String str5 = "updateView MY DELIVERIES >> NO RESULT";
            String str6 = AppEventsConstants.EVENT_PARAM_VALUE_NO;
            String str7 = "";
            if (z) {
                C5880q.m25753d("updateView MY DELIVERIES >> ACTIVE ");
                this.f30429Y.setVisibility(8);
                if (C11644i.f33056B6.size() == 0) {
                    this.f30430Z.setText(getString(C10232R.string.hint_no_active_deliveries_found));
                    this.f30432a0.setVisibility(0);
                    this.f30420P.setVisibility(8);
                    this.f30421Q.setVisibility(8);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str5);
                    sb.append(C11644i.f33056B6.size());
                    C5880q.m25753d(sb.toString());
                    C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                    C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                    if (C11644i.f33053B3 > 0) {
                        this.f30427W.setVisibility(0);
                        TextView textView = this.f30427W;
                        if (C11644i.f33053B3 > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str7);
                            sb2.append(C11644i.f33053B3);
                            str3 = sb2.toString();
                        } else {
                            str3 = str6;
                        }
                        textView.setText(str3);
                    } else {
                        this.f30427W.setText(str7);
                        this.f30427W.setVisibility(8);
                    }
                    m50131A();
                    m50135a(C11644i.f33045A3, C11644i.f33053B3);
                    C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                    HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                } else {
                    this.f30432a0.setVisibility(8);
                    this.f30420P.setVisibility(0);
                    this.f30421Q.setVisibility(8);
                    C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                    C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                    m50131A();
                    m50135a(C11644i.f33045A3, C11644i.f33053B3);
                    C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                    HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str4);
                    sb3.append(C11644i.f33056B6.size());
                    C5880q.m25753d(sb3.toString());
                }
            } else {
                C5880q.m25753d("updateView MY DELIVERIES >> IN ACTIVE ");
                this.f30429Y.setVisibility(8);
                if (C11644i.f33064C6.size() == 0) {
                    this.f30430Z.setText(getString(C10232R.string.hint_no_inactive_deliveries_found));
                    this.f30432a0.setVisibility(0);
                    this.f30420P.setVisibility(8);
                    this.f30421Q.setVisibility(8);
                    C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                    C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                    if (C11644i.f33045A3 > 0) {
                        this.f30427W.setVisibility(0);
                        TextView textView2 = this.f30427W;
                        if (C11644i.f33045A3 > 0) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str7);
                            sb4.append(C11644i.f33045A3);
                            str2 = sb4.toString();
                        } else {
                            str2 = str6;
                        }
                        textView2.setText(str2);
                    } else {
                        this.f30427W.setText(str7);
                        this.f30427W.setVisibility(8);
                    }
                    m50131A();
                    m50135a(C11644i.f33045A3, C11644i.f33053B3);
                    C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                    HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str5);
                    sb5.append(C11644i.f33064C6.size());
                    C5880q.m25753d(sb5.toString());
                } else {
                    this.f30432a0.setVisibility(8);
                    this.f30421Q.setVisibility(0);
                    this.f30420P.setVisibility(8);
                    C11644i.f33045A3 = C11644i.f33061C3 + C11644i.f33077E3;
                    C11644i.f33053B3 = C11644i.f33069D3 + C11644i.f33085F3;
                    if (C11644i.f33045A3 > 0) {
                        this.f30427W.setVisibility(0);
                        TextView textView3 = this.f30427W;
                        if (C11644i.f33045A3 > 0) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str7);
                            sb6.append(C11644i.f33045A3);
                            str = sb6.toString();
                        } else {
                            str = str6;
                        }
                        textView3.setText(str);
                    } else {
                        this.f30427W.setText(str7);
                        this.f30427W.setVisibility(8);
                    }
                    m50131A();
                    m50135a(C11644i.f33045A3, C11644i.f33053B3);
                    C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                    HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str4);
                    sb7.append(C11644i.f33064C6.size());
                    C5880q.m25753d(sb7.toString());
                }
            }
            try {
                if (C11035n.f30513Z) {
                    if (C11644i.f33053B3 > 0) {
                        this.f30428X.setVisibility(0);
                        TextView textView4 = this.f30428X;
                        if (C11644i.f33053B3 > 0) {
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append(str7);
                            sb8.append(C11644i.f33053B3);
                            str6 = sb8.toString();
                        }
                        textView4.setText(str6);
                        return;
                    }
                    this.f30428X.setText(str7);
                    this.f30428X.setVisibility(8);
                } else if (C11644i.f33045A3 > 0) {
                    this.f30428X.setVisibility(0);
                    TextView textView5 = this.f30428X;
                    if (C11644i.f33045A3 > 0) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str7);
                        sb9.append(C11644i.f33045A3);
                        str6 = sb9.toString();
                    }
                    textView5.setText(str6);
                } else {
                    this.f30428X.setText(str7);
                    this.f30428X.setVisibility(8);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m50154x() {
        C5887x xVar = this.f30423S;
        if (xVar == null || !xVar.mo23566a0()) {
            this.f30434b0 = false;
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30423S.mo23648p().latitude);
            hashMap.put("user_lat", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.f30423S.mo23648p().longitude);
            hashMap.put("user_long", sb2.toString());
            C5882b.m25774a(this.f30423S).myDeliveries(String.valueOf(this.f30423S.mo23468C().mo23459f("user_id")), hashMap).enqueue(new C11013e());
        }
    }

    /* renamed from: y */
    private void m50155y() {
        this.f30423S = new C5887x(getActivity());
        this.f30424T = (AppSingleton) getActivity().getApplicationContext();
        f30416f0 = new C11020l(this, getActivity(), null);
        f30417g0 = new C11021m(this, getActivity(), null);
        this.f30432a0 = (LinearLayout) this.f30419O.findViewById(C10232R.C10236id.layNDF);
        this.f30430Z = (TextView) this.f30419O.findViewById(C10232R.C10236id.txtNDF);
        this.f30420P = (RecyclerView) this.f30419O.findViewById(C10232R.C10236id.rvMyDeliveriessActive);
        this.f30422R = new WrapContentLinearLayoutManager(getActivity());
        this.f30422R.mo7000l(1);
        this.f30420P.setLayoutManager(this.f30422R);
        this.f30420P.setItemAnimator(this.f30423S.mo23672x());
        this.f30420P.setVisibility(8);
        this.f30433b = new C10996h(C11644i.f33056B6, getActivity().getApplicationContext());
        this.f30420P.setAdapter(this.f30433b);
        this.f30433b.mo38760a((C11558b) new C11011c());
        this.f30421Q = (RecyclerView) this.f30419O.findViewById(C10232R.C10236id.rvMyDeliveriessInActive);
        this.f30422R = new WrapContentLinearLayoutManager(getActivity());
        this.f30422R.mo7000l(1);
        this.f30421Q.setLayoutManager(this.f30422R);
        this.f30421Q.setItemAnimator(this.f30423S.mo23672x());
        this.f30418N = new C11023k(C11644i.f33064C6, getActivity());
        this.f30421Q.setAdapter(this.f30418N);
        this.f30418N.mo38781a((C11558b) new C11012d());
        this.f30421Q.setVisibility(8);
        this.f30425U = (Toolbar) getActivity().findViewById(C10232R.C10236id.tborder);
        this.f30426V = (TextView) this.f30425U.findViewById(C10232R.C10236id.txtTitle);
        this.f30427W = (TextView) this.f30425U.findViewById(C10232R.C10236id.txtTabBadgeCount);
        this.f30428X = (TextView) this.f30425U.findViewById(C10232R.C10236id.txtTabBadgeCountReverse);
        f30415e0 = new C11022n(this, getActivity(), null);
        this.f30429Y = (ProgressBar) this.f30419O.findViewById(C10232R.C10236id.pgLoadMore);
        if (!this.f30423S.mo23502X()) {
            this.f30429Y.setVisibility(8);
        } else if (!C11644i.f33128K6) {
            this.f30429Y.setVisibility(0);
            m50154x();
        } else {
            this.f30429Y.setVisibility(8);
            m50132B();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m50156z() {
        boolean z = false;
        for (int i = 0; i < C11644i.f33056B6.size(); i++) {
            if (((MyOrdersActive) C11644i.f33056B6.get(i)).isAutostart_tracking()) {
                m50145b(C11644i.f33457y3, ((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId());
                ((MyOrdersActive) C11644i.f33056B6.get(i)).setTrack_order(true);
                z = true;
            }
            if (((MyOrdersActive) C11644i.f33056B6.get(i)).isTrack_order()) {
                z = true;
            }
            if (((MyOrdersActive) C11644i.f33056B6.get(i)).isAutostop_tracking()) {
                m50145b(C11644i.f33465z3, ((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId());
                ((MyOrdersActive) C11644i.f33056B6.get(i)).setTrack_order(false);
            }
        }
        if (z) {
            if (!this.f30423S.mo23584b(LocationService.class)) {
                mo38770w();
            }
        } else if (this.f30423S.mo23584b(LocationService.class)) {
            getActivity().stopService(new Intent(getActivity(), LocationService.class));
        }
        this.f30423S.mo23549a(this.f30420P);
        this.f30433b.mo7341e();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C11019k) {
            this.f30431a = (C11019k) context;
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
        this.f30419O = layoutInflater.inflate(C10232R.layout.fragment_my_deliveries, viewGroup, false);
        m50155y();
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33189S3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33229X3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33245Z3));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33070D4));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33078E4));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33086F4));
        C2128a.m11089a((Context) getActivity()).mo9218a(this.f30436d0, new IntentFilter(C11644i.f33094G4));
        return this.f30419O;
    }

    public void onDestroy() {
        super.onDestroy();
        C2128a.m11089a((Context) getActivity()).mo9217a(this.f30436d0);
        C5880q.m25751b("MyDeliveriesFragment Destroyed");
    }

    public void onDetach() {
        super.onDetach();
        this.f30431a = null;
    }

    public void onResume() {
        super.onResume();
        C5880q.m25751b("onresume mydeliveries");
        C11035n.f30514a0 = false;
        StringBuilder sb = new StringBuilder();
        sb.append("updateView MY DELIVERIES >> VISIBLE  = true & isActive = ");
        sb.append(C11035n.f30513Z);
        C5880q.m25753d(sb.toString());
        if (this.f30434b0) {
            m50132B();
        }
    }

    /* renamed from: w */
    public void mo38770w() {
        try {
            if (this.f30423S.mo23495Q()) {
                getActivity().startForegroundService(new Intent(getActivity(), LocationService.class));
            } else {
                getActivity().startService(new Intent(getActivity(), LocationService.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50147c(int i) {
        if (this.f30423S.mo23502X() && this.f30423S.mo23497S()) {
            try {
                if (C11644i.f33064C6.size() > i) {
                    Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                    intent.putExtra("order_id", ((MyOrdersInactive) C11644i.f33064C6.get(i)).getIOrderId());
                    intent.putExtra("shop_name", ((MyOrdersInactive) C11644i.f33064C6.get(i)).getVShopName());
                    intent.putExtra("position", i);
                    intent.putExtra("is_buyer", true);
                    intent.putExtra("order_status", ((MyOrdersInactive) C11644i.f33064C6.get(i)).getOrderStatus());
                    intent.putExtra(C11644i.f33199T5, getString(C10232R.string.lbl_my_delivery));
                    intent.putExtra(C11644i.f33227X1, ((MyOrdersInactive) C11644i.f33064C6.get(i)).getUnread());
                    startActivity(intent);
                }
                if (C11644i.f33064C6.size() > i) {
                    if (((MyOrdersInactive) C11644i.f33064C6.get(i)).getUnread().intValue() > 0) {
                        C11644i.f33085F3--;
                        m50135a(C11644i.f33045A3, C11644i.f33085F3);
                        C11644i.f33101H3 = 0;
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        HomeActivity.f27246i1.mo11496b(C11644i.f33101H3 > 0 ? C11644i.f33101H3 : 0, 1);
                        m50139a(((MyOrdersInactive) C11644i.f33064C6.get(i)).getIOrderId(), i, false);
                        new Handler().postDelayed(new C11014f(i), 300);
                    }
                    m50131A();
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
    public void mo38769b(Uri uri) {
        C11019k kVar = this.f30431a;
        if (kVar != null) {
            kVar.mo36527b(uri);
        }
    }

    /* renamed from: b */
    private void m50145b(String str, String str2) {
        C5887x xVar = this.f30423S;
        if (xVar != null && xVar.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", this.f30423S.mo23476G());
            hashMap.put("auth_token", this.f30423S.mo23640m());
            hashMap.put("status", str);
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            sb.append(str3);
            sb.append(this.f30423S.mo23648p().latitude);
            hashMap.put("current_latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f30423S.mo23648p().longitude);
            hashMap.put("current_longitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("start/stop : ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C5882b.m25774a(this.f30423S).updateTrackingStatus(str2, hashMap).enqueue(new C11010b(str2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50134a(int i) {
        if (this.f30423S.mo23502X() && this.f30423S.mo23497S()) {
            try {
                if (C11644i.f33056B6.size() > i) {
                    Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                    intent.putExtra("order_id", ((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId());
                    intent.putExtra("shop_name", ((MyOrdersActive) C11644i.f33056B6.get(i)).getVShopName());
                    intent.putExtra("position", i);
                    intent.putExtra("is_buyer", true);
                    intent.putExtra("order_status", ((MyOrdersActive) C11644i.f33056B6.get(i)).getOrderStatus());
                    intent.putExtra(C11644i.f33171Q1, ((MyOrdersActive) C11644i.f33056B6.get(i)).isTrack_order());
                    intent.putExtra(C11644i.f33227X1, ((MyOrdersActive) C11644i.f33056B6.get(i)).getUnread());
                    startActivityForResult(intent, 113);
                }
                if (C11644i.f33056B6.size() > i) {
                    if (((MyOrdersActive) C11644i.f33056B6.get(i)).getUnread().intValue() > 0) {
                        C11644i.f33077E3--;
                        m50135a(C11644i.f33077E3, C11644i.f33053B3);
                        int i2 = 0;
                        C11644i.f33101H3 = 0;
                        C11644i.f33101H3 = C11644i.f33061C3 + C11644i.f33069D3 + C11644i.f33077E3 + C11644i.f33085F3;
                        AHBottomNavigation aHBottomNavigation = HomeActivity.f27246i1;
                        if (C11644i.f33101H3 > 0) {
                            i2 = C11644i.f33101H3;
                        }
                        aHBottomNavigation.mo11496b(i2, 1);
                        m50139a(((MyOrdersActive) C11644i.f33056B6.get(i)).getIOrderId(), i, true);
                        new Handler().postDelayed(new C11015g(i), 300);
                    }
                    m50131A();
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
    public void m50141a(boolean z, int i) {
        Integer valueOf = Integer.valueOf(0);
        if (z) {
            if (i < C11644i.f33056B6.size()) {
                ((MyOrdersActive) C11644i.f33056B6.get(i)).setUnread(valueOf);
                this.f30420P.setAdapter(this.f30433b);
                this.f30423S.mo23549a(this.f30420P);
                this.f30433b.mo7341e();
            }
        } else if (i < C11644i.f33064C6.size()) {
            ((MyOrdersInactive) C11644i.f33064C6.get(i)).setUnread(valueOf);
            this.f30421Q.setAdapter(this.f30418N);
            this.f30423S.mo23549a(this.f30421Q);
            this.f30418N.mo7341e();
        }
    }

    /* renamed from: a */
    private void m50139a(String str, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("iOrderId", str);
        hashMap.put("iToUserId", this.f30423S.mo23468C().mo23459f("user_id"));
        C5882b.m25774a(this.f30423S).readChatMessage(str, hashMap).enqueue(new C11016h());
    }

    /* renamed from: a */
    private void m50135a(int i, int i2) {
        Intent intent = new Intent(C11644i.f33221W3);
        intent.putExtra("active", i);
        intent.putExtra("inactive", i2);
        C2128a.m11089a((Context) getActivity()).mo9219a(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50140a(String str, String str2) {
        C5887x xVar = this.f30423S;
        if (xVar != null && xVar.mo23502X()) {
            HashMap hashMap = new HashMap();
            hashMap.put("iCourierId", this.f30423S.mo23476G());
            hashMap.put("auth_token", this.f30423S.mo23640m());
            hashMap.put("status", str);
            StringBuilder sb = new StringBuilder();
            String str3 = "";
            sb.append(str3);
            sb.append(this.f30423S.mo23648p().latitude);
            hashMap.put("current_latitude", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(this.f30423S.mo23648p().longitude);
            hashMap.put("current_longitude", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("start/stop : ");
            sb3.append(hashMap);
            C5880q.m25751b(sb3.toString());
            C5882b.m25774a(this.f30423S).updateTrackingStatus(str2, hashMap).enqueue(new C11018j(str));
        }
    }
}
