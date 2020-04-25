package com.mrsool.p416s;

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
import com.mrsool.bean.PendingOrderNotificationBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.s.e */
/* compiled from: PendingOrderAdapter */
public class C11196e extends C1638g<C11197a> {

    /* renamed from: c */
    private Context f31041c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f31042d;

    /* renamed from: e */
    private C5887x f31043e = new C5887x(this.f31041c);

    /* renamed from: f */
    private ArrayList<PendingOrderNotificationBean> f31044f;

    /* renamed from: com.mrsool.s.e$a */
    /* compiled from: PendingOrderAdapter */
    public class C11197a extends C1635d0 {

        /* renamed from: A0 */
        ImageView f31045A0;

        /* renamed from: B0 */
        FrameLayout f31046B0;

        /* renamed from: C0 */
        FrameLayout f31047C0;

        /* renamed from: D0 */
        FrameLayout f31048D0;

        /* renamed from: E0 */
        FrameLayout f31049E0;

        /* renamed from: F0 */
        public LinearLayout f31050F0;

        /* renamed from: G0 */
        public LinearLayout f31051G0;

        /* renamed from: H0 */
        LinearLayout f31052H0;

        /* renamed from: s0 */
        TextView f31054s0;

        /* renamed from: t0 */
        TextView f31055t0;

        /* renamed from: u0 */
        TextView f31056u0;

        /* renamed from: v0 */
        TextView f31057v0;

        /* renamed from: w0 */
        TextView f31058w0;

        /* renamed from: x0 */
        TextView f31059x0;

        /* renamed from: y0 */
        TextView f31060y0;

        /* renamed from: z0 */
        TextView f31061z0;

        /* renamed from: com.mrsool.s.e$a$a */
        /* compiled from: PendingOrderAdapter */
        class C11198a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C11196e f31062a;

            C11198a(C11196e eVar) {
                this.f31062a = eVar;
            }

            public void onClick(View view) {
                C11196e.this.f31042d.mo37847a(C11197a.this.mo7273f());
            }
        }

        public C11197a(View view) {
            super(view);
            this.f31054s0 = (TextView) view.findViewById(C10232R.C10236id.txyShopTitle);
            this.f31055t0 = (TextView) view.findViewById(C10232R.C10236id.tvShopAddress);
            this.f31056u0 = (TextView) view.findViewById(C10232R.C10236id.txtShopDistance);
            this.f31057v0 = (TextView) view.findViewById(C10232R.C10236id.tvPickupKM);
            this.f31058w0 = (TextView) view.findViewById(C10232R.C10236id.tvDropOffKM);
            this.f31059x0 = (TextView) view.findViewById(C10232R.C10236id.tvDropOffCount);
            this.f31045A0 = (ImageView) view.findViewById(C10232R.C10236id.imgShopIcon);
            this.f31046B0 = (FrameLayout) view.findViewById(C10232R.C10236id.flDropOff);
            this.f31047C0 = (FrameLayout) view.findViewById(C10232R.C10236id.flDropOffMultiple);
            this.f31051G0 = (LinearLayout) view.findViewById(C10232R.C10236id.llDropOffStatus);
            this.f31050F0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f31052H0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOnlyDropOffStatus);
            this.f31060y0 = (TextView) view.findViewById(C10232R.C10236id.tvOnlyDropOffCount);
            this.f31048D0 = (FrameLayout) view.findViewById(C10232R.C10236id.flOnlyDropOffMultiple);
            this.f31049E0 = (FrameLayout) view.findViewById(C10232R.C10236id.flOnlyDropOff);
            this.f31061z0 = (TextView) view.findViewById(C10232R.C10236id.tvonlyDropOffKM);
            this.f31050F0.setOnClickListener(new C11198a(C11196e.this));
        }
    }

    C11196e(Context context, ArrayList<PendingOrderNotificationBean> arrayList, C11725f fVar) {
        this.f31041c = context;
        this.f31044f = arrayList;
        this.f31042d = fVar;
    }

    /* renamed from: g */
    private boolean m50671g(int i) {
        return ((PendingOrderNotificationBean) this.f31044f.get(i)).getType().equalsIgnoreCase(C11644i.f33253a3) && ((PendingOrderNotificationBean) this.f31044f.get(i)).getDistPickupDropoff().doubleValue() == 0.0d;
    }

    /* renamed from: a */
    public void mo7330b(C11197a aVar, int i) {
        if (m50671g(i)) {
            aVar.f31051G0.setVisibility(8);
            aVar.f31052H0.setVisibility(0);
            if (((PendingOrderNotificationBean) this.f31044f.get(i)).getBundledOrder().booleanValue()) {
                aVar.f31052H0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order_dropoff);
                aVar.f31049E0.setVisibility(8);
                aVar.f31048D0.setVisibility(0);
            } else {
                aVar.f31052H0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order);
                aVar.f31049E0.setVisibility(0);
                aVar.f31048D0.setVisibility(8);
            }
        } else {
            aVar.f31051G0.setVisibility(0);
            aVar.f31052H0.setVisibility(8);
            if (((PendingOrderNotificationBean) this.f31044f.get(i)).getBundledOrder().booleanValue()) {
                aVar.f31051G0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order_dropoff);
                aVar.f31046B0.setVisibility(8);
                aVar.f31047C0.setVisibility(0);
            } else {
                aVar.f31051G0.setBackgroundResource(C10232R.C10235drawable.bg_pending_order);
                aVar.f31046B0.setVisibility(0);
                aVar.f31047C0.setVisibility(8);
            }
        }
        aVar.f31054s0.setText(((PendingOrderNotificationBean) this.f31044f.get(i)).getName());
        aVar.f31055t0.setText(((PendingOrderNotificationBean) this.f31044f.get(i)).getMessage());
        TextView textView = aVar.f31057v0;
        StringBuilder sb = new StringBuilder();
        sb.append(((PendingOrderNotificationBean) this.f31044f.get(i)).getDistUserPickup());
        String str = C3868i.f12248b;
        sb.append(str);
        sb.append(this.f31041c.getResources().getString(C10232R.string.lbl_distance));
        textView.setText(sb.toString());
        TextView textView2 = aVar.f31058w0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((PendingOrderNotificationBean) this.f31044f.get(i)).getDistPickupDropoff());
        sb2.append(str);
        sb2.append(this.f31041c.getResources().getString(C10232R.string.lbl_distance));
        textView2.setText(sb2.toString());
        TextView textView3 = aVar.f31059x0;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(((PendingOrderNotificationBean) this.f31044f.get(i)).getDistPickupDropoff());
        sb3.append(str);
        sb3.append(this.f31041c.getResources().getString(C10232R.string.lbl_distance));
        textView3.setText(sb3.toString());
        if (m50671g(i)) {
            TextView textView4 = aVar.f31061z0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(((PendingOrderNotificationBean) this.f31044f.get(i)).getDistUserPickup());
            sb4.append(str);
            sb4.append(this.f31041c.getResources().getString(C10232R.string.lbl_distance));
            textView4.setText(sb4.toString());
        }
        aVar.f31056u0.setText(((PendingOrderNotificationBean) this.f31044f.get(i)).getTimeAt());
        C2232l.m11649c(this.f31041c.getApplicationContext()).mo9515a(((PendingOrderNotificationBean) this.f31044f.get(i)).getPic()).m11491c((int) C10232R.C10235drawable.icon_push_small).m11496d().m11500e((int) C10232R.C10235drawable.shop_place_holder_white).mo9424a(aVar.f31045A0);
    }

    /* renamed from: b */
    public C11197a m50675b(ViewGroup viewGroup, int i) {
        return new C11197a(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_courier_pending_order, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f31044f.size();
    }
}
