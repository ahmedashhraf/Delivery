package com.mrsool.shop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.bean.shopDetailPendingOrder;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.shop.f */
/* compiled from: PendingOrdersAdapter */
public class C11238f extends C1638g<C11239a> {

    /* renamed from: c */
    private Context f31262c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f31263d;

    /* renamed from: e */
    private C5887x f31264e = new C5887x(this.f31262c);

    /* renamed from: f */
    private List<shopDetailPendingOrder> f31265f;

    /* renamed from: com.mrsool.shop.f$a */
    /* compiled from: PendingOrdersAdapter */
    public class C11239a extends C1635d0 {

        /* renamed from: A0 */
        TextView f31266A0;

        /* renamed from: B0 */
        TextView f31267B0;

        /* renamed from: C0 */
        TextView f31268C0;

        /* renamed from: D0 */
        TextView f31269D0;

        /* renamed from: E0 */
        TextView f31270E0;

        /* renamed from: F0 */
        ImageView f31271F0;

        /* renamed from: G0 */
        ImageView f31272G0;

        /* renamed from: H0 */
        ImageView f31273H0;

        /* renamed from: I0 */
        ImageView f31274I0;

        /* renamed from: J0 */
        ImageView f31275J0;

        /* renamed from: K0 */
        ImageView f31276K0;

        /* renamed from: L0 */
        ImageView f31277L0;

        /* renamed from: M0 */
        FrameLayout f31278M0;

        /* renamed from: N0 */
        FrameLayout f31279N0;

        /* renamed from: O0 */
        FrameLayout f31280O0;

        /* renamed from: P0 */
        FrameLayout f31281P0;

        /* renamed from: Q0 */
        public LinearLayout f31282Q0;

        /* renamed from: R0 */
        public LinearLayout f31283R0;

        /* renamed from: S0 */
        LinearLayout f31284S0;

        /* renamed from: T0 */
        LinearLayout f31285T0;

        /* renamed from: s0 */
        TextView f31287s0;

        /* renamed from: t0 */
        TextView f31288t0;

        /* renamed from: u0 */
        TextView f31289u0;

        /* renamed from: v0 */
        TextView f31290v0;

        /* renamed from: w0 */
        TextView f31291w0;

        /* renamed from: x0 */
        TextView f31292x0;

        /* renamed from: y0 */
        TextView f31293y0;

        /* renamed from: z0 */
        TextView f31294z0;

        /* renamed from: com.mrsool.shop.f$a$a */
        /* compiled from: PendingOrdersAdapter */
        class C11240a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C11238f f31295a;

            C11240a(C11238f fVar) {
                this.f31295a = fVar;
            }

            public void onClick(View view) {
                C11238f.this.f31263d.mo37847a(C11239a.this.mo7273f());
            }
        }

        public C11239a(View view) {
            super(view);
            this.f31287s0 = (TextView) view.findViewById(C10232R.C10236id.txyShopTitle);
            this.f31288t0 = (TextView) view.findViewById(C10232R.C10236id.tvShopAddress);
            this.f31289u0 = (TextView) view.findViewById(C10232R.C10236id.txtShopDistance);
            this.f31290v0 = (TextView) view.findViewById(C10232R.C10236id.tvPickupKM);
            this.f31291w0 = (TextView) view.findViewById(C10232R.C10236id.tvDropOffKM);
            this.f31292x0 = (TextView) view.findViewById(C10232R.C10236id.tvDropOffCount);
            this.f31271F0 = (ImageView) view.findViewById(C10232R.C10236id.imgShopIcon);
            this.f31278M0 = (FrameLayout) view.findViewById(C10232R.C10236id.flDropOff);
            this.f31279N0 = (FrameLayout) view.findViewById(C10232R.C10236id.flDropOffMultiple);
            this.f31283R0 = (LinearLayout) view.findViewById(C10232R.C10236id.llDropOffStatus);
            this.f31282Q0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f31284S0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOnlyDropOffStatus);
            this.f31293y0 = (TextView) view.findViewById(C10232R.C10236id.tvOnlyDropOffCount);
            this.f31280O0 = (FrameLayout) view.findViewById(C10232R.C10236id.flOnlyDropOffMultiple);
            this.f31281P0 = (FrameLayout) view.findViewById(C10232R.C10236id.flOnlyDropOff);
            this.f31294z0 = (TextView) view.findViewById(C10232R.C10236id.tvonlyDropOffKM);
            this.f31266A0 = (TextView) view.findViewById(C10232R.C10236id.tvDest1);
            this.f31267B0 = (TextView) view.findViewById(C10232R.C10236id.tvDest2);
            this.f31268C0 = (TextView) view.findViewById(C10232R.C10236id.tvDest3);
            this.f31272G0 = (ImageView) view.findViewById(C10232R.C10236id.ivDest1);
            this.f31273H0 = (ImageView) view.findViewById(C10232R.C10236id.ivDest2);
            this.f31274I0 = (ImageView) view.findViewById(C10232R.C10236id.ivDest3);
            this.f31275J0 = (ImageView) view.findViewById(C10232R.C10236id.ivDest12);
            this.f31269D0 = (TextView) view.findViewById(C10232R.C10236id.tvDest12);
            this.f31276K0 = (ImageView) view.findViewById(C10232R.C10236id.imgMyOrder);
            this.f31285T0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOfferSubmitted);
            this.f31270E0 = (TextView) view.findViewById(C10232R.C10236id.tvDest22);
            this.f31277L0 = (ImageView) view.findViewById(C10232R.C10236id.ivDest22);
            this.f31282Q0.setOnClickListener(new C11240a(C11238f.this));
        }
    }

    C11238f(Context context, List<shopDetailPendingOrder> list, C11725f fVar) {
        this.f31262c = context;
        this.f31265f = list;
        this.f31263d = fVar;
    }

    /* renamed from: g */
    private boolean m50835g(int i) {
        return !((shopDetailPendingOrder) this.f31265f.get(i)).getShowPickupPin().booleanValue();
    }

    /* renamed from: a */
    public void mo39074a(List<shopDetailPendingOrder> list) {
        this.f31265f = list;
    }

    /* renamed from: a */
    public void mo7330b(C11239a aVar, int i) {
        aVar.f31276K0.setVisibility(((shopDetailPendingOrder) this.f31265f.get(i)).getWhosOrder() == 1 ? 0 : 8);
        aVar.f31285T0.setVisibility(((shopDetailPendingOrder) this.f31265f.get(i)).getOfferSubmitted().booleanValue() ? 0 : 8);
        if (m50832a((shopDetailPendingOrder) this.f31265f.get(i)) == 2) {
            aVar.f31283R0.setVisibility(8);
            aVar.f31284S0.setVisibility(0);
            if (((shopDetailPendingOrder) this.f31265f.get(i)).getBundledOrder().booleanValue()) {
                aVar.f31284S0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order_dropoff);
                aVar.f31281P0.setVisibility(8);
                aVar.f31280O0.setVisibility(0);
            } else {
                aVar.f31284S0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order);
                aVar.f31281P0.setVisibility(0);
                aVar.f31280O0.setVisibility(8);
                if (!((shopDetailPendingOrder) this.f31265f.get(i)).getShowYouPin().booleanValue()) {
                    aVar.f31275J0.setImageResource(C10232R.C10235drawable.ic_package_sky_blue);
                    aVar.f31269D0.setText(this.f31262c.getResources().getString(C10232R.string.lbl_pickup_new));
                }
                if (!((shopDetailPendingOrder) this.f31265f.get(i)).getShowDropoffPin().booleanValue()) {
                    aVar.f31277L0.setImageResource(C10232R.C10235drawable.ic_package_sky_blue);
                    aVar.f31270E0.setText(this.f31262c.getResources().getString(C10232R.string.lbl_pickup_new));
                }
            }
        } else {
            aVar.f31283R0.setVisibility(0);
            aVar.f31284S0.setVisibility(8);
            if (((shopDetailPendingOrder) this.f31265f.get(i)).getBundledOrder().booleanValue()) {
                aVar.f31283R0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order_dropoff);
                aVar.f31278M0.setVisibility(8);
                aVar.f31279N0.setVisibility(0);
            } else {
                aVar.f31283R0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order);
                aVar.f31278M0.setVisibility(0);
                aVar.f31279N0.setVisibility(8);
            }
        }
        aVar.f31287s0.setText(((shopDetailPendingOrder) this.f31265f.get(i)).getVFullName());
        aVar.f31288t0.setText(((shopDetailPendingOrder) this.f31265f.get(i)).getOrder_description());
        TextView textView = aVar.f31290v0;
        StringBuilder sb = new StringBuilder();
        sb.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistanceCourierShop());
        String str = C3868i.f12248b;
        sb.append(str);
        sb.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
        textView.setText(sb.toString());
        TextView textView2 = aVar.f31291w0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistanceShopBuyer());
        sb2.append(str);
        sb2.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
        textView2.setText(sb2.toString());
        TextView textView3 = aVar.f31292x0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistanceShopBuyer());
        sb3.append(str);
        sb3.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
        textView3.setText(sb3.toString());
        if (m50832a((shopDetailPendingOrder) this.f31265f.get(i)) == 2) {
            if (((shopDetailPendingOrder) this.f31265f.get(i)).getShowYouPin().booleanValue() && ((shopDetailPendingOrder) this.f31265f.get(i)).getShowPickupPin().booleanValue()) {
                TextView textView4 = aVar.f31294z0;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistanceCourierShop());
                sb4.append(str);
                sb4.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
                textView4.setText(sb4.toString());
            } else if (((shopDetailPendingOrder) this.f31265f.get(i)).getShowYouPin().booleanValue() && ((shopDetailPendingOrder) this.f31265f.get(i)).getShowDropoffPin().booleanValue()) {
                TextView textView5 = aVar.f31294z0;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistance_courier_buyer());
                sb5.append(str);
                sb5.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
                textView5.setText(sb5.toString());
            } else if (((shopDetailPendingOrder) this.f31265f.get(i)).getShowPickupPin().booleanValue() && ((shopDetailPendingOrder) this.f31265f.get(i)).getShowDropoffPin().booleanValue()) {
                TextView textView6 = aVar.f31294z0;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((shopDetailPendingOrder) this.f31265f.get(i)).getDistanceShopBuyer());
                sb6.append(str);
                sb6.append(this.f31262c.getResources().getString(C10232R.string.lbl_distance));
                textView6.setText(sb6.toString());
            }
        }
        aVar.f31289u0.setText(((shopDetailPendingOrder) this.f31265f.get(i)).getVExpireIn());
        C2232l.m11649c(this.f31262c.getApplicationContext()).mo9515a(((shopDetailPendingOrder) this.f31265f.get(i)).getVProfilePic()).m11491c((int) C10232R.C10235drawable.icon_push_small).m11496d().m11482b(0.2f).m11500e((int) C10232R.C10235drawable.hint_userpic).mo9424a(aVar.f31271F0);
    }

    /* renamed from: b */
    public C11239a m50840b(ViewGroup viewGroup, int i) {
        return new C11239a(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_pending_orders, viewGroup, false));
    }

    /* renamed from: b */
    private void m50834b(shopDetailPendingOrder shopdetailpendingorder) {
        m50832a(shopdetailpendingorder);
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f31265f.size();
    }

    /* renamed from: a */
    private int m50832a(shopDetailPendingOrder shopdetailpendingorder) {
        return (!shopdetailpendingorder.getShowYouPin().booleanValue() || !shopdetailpendingorder.getShowPickupPin().booleanValue() || !shopdetailpendingorder.getShowDropoffPin().booleanValue()) ? 2 : 3;
    }
}
