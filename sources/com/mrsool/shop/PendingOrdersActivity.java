package com.mrsool.shop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.bean.shopDetailPendingOrder;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a.C11599a;
import java.util.ArrayList;
import java.util.List;
import p053b.p072g.p073b.C2128a;

public class PendingOrdersActivity extends C0295d implements OnClickListener {

    /* renamed from: W */
    public static OnClickListener f31085W;

    /* renamed from: N */
    private WrapContentLinearLayoutManager f31086N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public List<shopDetailPendingOrder> f31087O = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public C5887x f31088P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public AppSingleton f31089Q;

    /* renamed from: R */
    private ImageView f31090R;

    /* renamed from: S */
    private TextView f31091S;

    /* renamed from: T */
    private TextView f31092T;

    /* renamed from: U */
    private LinearLayout f31093U;

    /* renamed from: V */
    private BroadcastReceiver f31094V = new C11206b();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11238f f31095a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public RecyclerView f31096b;

    /* renamed from: com.mrsool.shop.PendingOrdersActivity$a */
    class C11205a extends C11725f {
        C11205a() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            PendingOrdersActivity.this.m50703h(i);
        }
    }

    /* renamed from: com.mrsool.shop.PendingOrdersActivity$b */
    class C11206b extends BroadcastReceiver {
        C11206b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase(C11644i.f33165P3)) {
                PendingOrdersActivity pendingOrdersActivity = PendingOrdersActivity.this;
                pendingOrdersActivity.f31087O = pendingOrdersActivity.f31089Q.f16955b.getOrders();
                if (PendingOrdersActivity.this.f31095a != null) {
                    PendingOrdersActivity.this.f31095a.mo39074a(PendingOrdersActivity.this.f31087O);
                    PendingOrdersActivity.this.f31095a.mo7341e();
                }
            }
            PendingOrdersActivity.this.m50694E();
        }
    }

    /* renamed from: com.mrsool.shop.PendingOrdersActivity$c */
    public interface C11207c {
        /* renamed from: b */
        void mo39033b(Uri uri);
    }

    /* renamed from: com.mrsool.shop.PendingOrdersActivity$d */
    public class C11208d implements OnClickListener {

        /* renamed from: a */
        private final Context f31099a;

        /* synthetic */ C11208d(PendingOrdersActivity pendingOrdersActivity, Context context, C11205a aVar) {
            this(context);
        }

        public void onClick(View view) {
            try {
                if (PendingOrdersActivity.this.f31088P.mo23502X() && PendingOrdersActivity.this.f31088P.mo23500V() && !PendingOrdersActivity.this.isFinishing()) {
                    if (PendingOrdersActivity.this.f31088P.mo23497S()) {
                        int childLayoutPosition = PendingOrdersActivity.this.f31096b.getChildLayoutPosition(view);
                        if (PendingOrdersActivity.this.f31087O.size() > childLayoutPosition && PendingOrdersActivity.this.f31087O.size() > 0 && PendingOrdersActivity.this.f31088P.mo23502X() && !PendingOrdersActivity.this.f31088P.mo23503Y()) {
                            Intent intent = new Intent(PendingOrdersActivity.this, ChatActivityNew.class);
                            intent.putExtra("order_id", String.valueOf(((shopDetailPendingOrder) PendingOrdersActivity.this.f31087O.get(childLayoutPosition)).getIOrderId()));
                            intent.putExtra("position", childLayoutPosition);
                            intent.putExtra("is_buyer", false);
                            intent.putExtra(C11644i.f33199T5, PendingOrdersActivity.this.getResources().getString(C10232R.string.lbl_shop_detail));
                            PendingOrdersActivity.this.startActivity(intent);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private C11208d(Context context) {
            this.f31099a = context;
        }
    }

    /* renamed from: C */
    private void m50692C() {
        this.f31088P = new C5887x(this);
        this.f31089Q = (AppSingleton) getApplicationContext();
        f31085W = new C11208d(this, this, null);
        this.f31090R = (ImageView) findViewById(C10232R.C10236id.ivBack);
        this.f31090R.setOnClickListener(this);
        this.f31091S = (TextView) findViewById(C10232R.C10236id.tvTitle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey(C11644i.f33391q1)) {
            this.f31091S.setText(extras.getString(C11644i.f33391q1));
        }
        this.f31096b = (RecyclerView) findViewById(C10232R.C10236id.rvPendingOrder);
        this.f31086N = new WrapContentLinearLayoutManager(this);
        this.f31086N.mo7000l(1);
        this.f31096b.setLayoutManager(this.f31086N);
        this.f31096b.setItemAnimator(this.f31088P.mo23672x());
        this.f31093U = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f31092T = (TextView) findViewById(C10232R.C10236id.txtNDF);
        this.f31087O = this.f31089Q.f16955b.getOrders();
        m50694E();
        this.f31095a = new C11238f(this, this.f31087O, new C11205a());
        this.f31096b.setAdapter(this.f31095a);
        if (this.f31088P.mo23496R()) {
            this.f31088P.mo23545a(this.f31090R);
        }
        C2128a.m11089a((Context) this).mo9218a(this.f31094V, new IntentFilter(C11644i.f33165P3));
        this.f31088P.mo23473E(C11644i.f33157O3);
    }

    /* renamed from: D */
    private boolean m50693D() {
        try {
            return this.f31089Q.f16955b.getShop().getbIsPickupAvailable() == null || this.f31089Q.f16955b.getShop().getbIsPickupAvailable().intValue() == 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m50694E() {
        this.f31092T.setText(TextUtils.isEmpty(this.f31089Q.f16955b.getMessage()) ? getString(C10232R.string.hint_no_pending_order_found) : this.f31089Q.f16955b.getMessage());
        if (this.f31087O.size() == 0) {
            this.f31093U.setVisibility(0);
            this.f31096b.setVisibility(8);
            return;
        }
        this.f31093U.setVisibility(8);
        this.f31096b.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m50703h(int i) {
        try {
            if (this.f31088P.mo23502X() && this.f31088P.mo23500V() && !isFinishing()) {
                if (this.f31088P.mo23497S()) {
                    if (this.f31087O.size() > i && this.f31087O.size() > 0 && this.f31088P.mo23502X() && !this.f31088P.mo23503Y()) {
                        Intent intent = new Intent(this, ChatActivityNew.class);
                        intent.putExtra(C11644i.f33314h1, String.valueOf(((shopDetailPendingOrder) this.f31087O.get(i)).getIOrderId()));
                        intent.putExtra(C11644i.f33332j1, i);
                        intent.putExtra("count", this.f31087O.size());
                        intent.putExtra("is_buyer", false);
                        intent.putExtra(C11644i.f33258b, C11599a.SERVICEWAITINGORDERTAB.mo39842d());
                        intent.putExtra(C11644i.f33199T5, getResources().getString(C10232R.string.lbl_shop_detail));
                        startActivity(intent);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onClick(View view) {
        if (view.equals(this.f31090R)) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_pending_orders);
        m50692C();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        try {
            super.onDestroy();
            C2128a.m11089a((Context) this).mo9217a(this.f31094V);
        } catch (NullPointerException unused) {
        }
    }

    public void onResume() {
        C5880q.m25751b("onResume PendingOrdersFragment");
        super.onResume();
    }
}
