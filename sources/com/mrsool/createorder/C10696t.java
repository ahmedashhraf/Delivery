package com.mrsool.createorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.card.MaterialCardView;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.createorder.t */
/* compiled from: PaymentTypeAdapter */
public class C10696t extends C1638g<C10698b> {

    /* renamed from: c */
    private int f29303c = -1;

    /* renamed from: d */
    private List<PaymentListBean> f29304d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11725f f29305e;

    /* renamed from: f */
    private Context f29306f;

    /* renamed from: com.mrsool.createorder.t$a */
    /* compiled from: PaymentTypeAdapter */
    class C10697a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29307a;

        C10697a(int i) {
            this.f29307a = i;
        }

        public void onClick(View view) {
            if (C10696t.this.f29305e != null) {
                C10696t.this.f29305e.mo37847a(this.f29307a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.t$b */
    /* compiled from: PaymentTypeAdapter */
    public static class C10698b extends C1635d0 {

        /* renamed from: s0 */
        TextView f29309s0;

        /* renamed from: t0 */
        MaterialCardView f29310t0;

        /* renamed from: u0 */
        ImageView f29311u0;

        /* renamed from: v0 */
        ImageView f29312v0;

        public C10698b(View view) {
            super(view);
            this.f29309s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethod);
            this.f29312v0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethod);
            this.f29310t0 = (MaterialCardView) view.findViewById(C10232R.C10236id.mcvCoupon);
            this.f29311u0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheck);
        }
    }

    public C10696t(Context context, List<PaymentListBean> list, C11725f fVar) {
        this.f29306f = context;
        this.f29304d = list;
        this.f29305e = fVar;
    }

    /* renamed from: g */
    public void mo38102g(int i) {
        this.f29303c = i;
    }

    /* renamed from: a */
    public void mo7330b(C10698b bVar, int i) {
        if (i == this.f29303c) {
            bVar.f29310t0.setStrokeWidth(C5887x.m25794a(2, this.f29306f));
            bVar.f29310t0.setStrokeColor(C0841b.m4915a(this.f29306f, (int) C10232R.C10234color.sky_blue_color));
            bVar.f29311u0.setVisibility(0);
        } else {
            bVar.f29310t0.setStrokeColor(C0841b.m4915a(this.f29306f, (int) C10232R.C10234color.order_place_holder_bg));
            bVar.f29310t0.setStrokeWidth(C5887x.m25794a(1, this.f29306f));
            bVar.f29311u0.setVisibility(8);
        }
        bVar.f29309s0.setText(((PaymentListBean) this.f29304d.get(i)).getName());
        C2232l.m11649c(bVar.f6294a.getContext()).mo9515a(((PaymentListBean) this.f29304d.get(i)).getPaymentIconUrl()).mo9424a(bVar.f29312v0);
        bVar.f29310t0.setOnClickListener(new C10697a(i));
    }

    /* renamed from: b */
    public C10698b m49280b(ViewGroup viewGroup, int i) {
        return new C10698b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_type, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f29304d.size();
    }
}
