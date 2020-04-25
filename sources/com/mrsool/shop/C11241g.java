package com.mrsool.shop;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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

/* renamed from: com.mrsool.shop.g */
/* compiled from: PendingOrdersFragment */
public class C11241g extends Fragment implements OnClickListener {

    /* renamed from: V */
    public static OnClickListener f31297V;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public RecyclerView f31298N;

    /* renamed from: O */
    private WrapContentLinearLayoutManager f31299O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public List<shopDetailPendingOrder> f31300P = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C5887x f31301Q;

    /* renamed from: R */
    private AppSingleton f31302R;

    /* renamed from: S */
    private FloatingActionButton f31303S;

    /* renamed from: T */
    private TextView f31304T;

    /* renamed from: U */
    private LinearLayout f31305U;

    /* renamed from: a */
    private C11238f f31306a;

    /* renamed from: b */
    private View f31307b;

    /* renamed from: com.mrsool.shop.g$a */
    /* compiled from: PendingOrdersFragment */
    class C11242a extends C11725f {
        C11242a() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C11241g.this.m50843a(i);
        }
    }

    /* renamed from: com.mrsool.shop.g$b */
    /* compiled from: PendingOrdersFragment */
    public class C11243b implements OnClickListener {

        /* renamed from: a */
        private final Context f31309a;

        /* synthetic */ C11243b(C11241g gVar, Context context, C11242a aVar) {
            this(context);
        }

        public void onClick(View view) {
            try {
                if (C11241g.this.f31301Q.mo23502X() && C11241g.this.f31301Q.mo23500V() && C11241g.this.isAdded()) {
                    if (C11241g.this.f31301Q.mo23497S()) {
                        int childLayoutPosition = C11241g.this.f31298N.getChildLayoutPosition(view);
                        if (C11241g.this.f31300P.size() > childLayoutPosition && C11241g.this.f31300P.size() > 0 && C11241g.this.f31301Q.mo23502X() && !C11241g.this.f31301Q.mo23503Y()) {
                            Intent intent = new Intent(C11241g.this.getActivity(), ChatActivityNew.class);
                            intent.putExtra("order_id", String.valueOf(((shopDetailPendingOrder) C11241g.this.f31300P.get(childLayoutPosition)).getIOrderId()));
                            intent.putExtra("position", childLayoutPosition);
                            intent.putExtra("is_buyer", false);
                            intent.putExtra(C11644i.f33199T5, C11241g.this.getResources().getString(C10232R.string.lbl_shop_detail));
                            C11241g.this.startActivity(intent);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private C11243b(Context context) {
            this.f31309a = context;
        }
    }

    /* renamed from: w */
    private void m50847w() {
        this.f31301Q = new C5887x(getActivity());
        this.f31302R = (AppSingleton) getActivity().getApplicationContext();
        f31297V = new C11243b(this, getActivity(), null);
        this.f31298N = (RecyclerView) this.f31307b.findViewById(C10232R.C10236id.rvPendingOrder);
        this.f31299O = new WrapContentLinearLayoutManager(getActivity());
        this.f31299O.mo7000l(1);
        this.f31298N.setLayoutManager(this.f31299O);
        this.f31298N.setItemAnimator(this.f31301Q.mo23672x());
        this.f31305U = (LinearLayout) this.f31307b.findViewById(C10232R.C10236id.layNDF);
        this.f31304T = (TextView) this.f31307b.findViewById(C10232R.C10236id.txtNDF);
        this.f31304T.setText(TextUtils.isEmpty(this.f31302R.f16955b.getMessage()) ? getString(C10232R.string.hint_no_pending_order_found) : this.f31302R.f16955b.getMessage());
        this.f31300P = this.f31302R.f16955b.getOrders();
        if (this.f31300P.size() == 0) {
            this.f31305U.setVisibility(0);
            this.f31298N.setVisibility(8);
        } else {
            this.f31305U.setVisibility(8);
            this.f31298N.setVisibility(0);
        }
        this.f31306a = new C11238f(getActivity(), this.f31300P, new C11242a());
        this.f31298N.setAdapter(this.f31306a);
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f31307b = layoutInflater.inflate(C10232R.layout.fragment_pending_orders, viewGroup, false);
        return this.f31307b;
    }

    public void onResume() {
        C5880q.m25751b("onResume PendingOrdersFragment");
        super.onResume();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m50847w();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50843a(int i) {
        try {
            if (this.f31301Q.mo23502X() && this.f31301Q.mo23500V() && isAdded()) {
                if (this.f31301Q.mo23497S()) {
                    if (this.f31300P.size() > i && this.f31300P.size() > 0 && this.f31301Q.mo23502X() && !this.f31301Q.mo23503Y()) {
                        Intent intent = new Intent(getActivity(), ChatActivityNew.class);
                        intent.putExtra(C11644i.f33314h1, String.valueOf(((shopDetailPendingOrder) this.f31300P.get(i)).getIOrderId()));
                        intent.putExtra(C11644i.f33332j1, i);
                        intent.putExtra("count", this.f31300P.size());
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
}
