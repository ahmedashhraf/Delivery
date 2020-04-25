package com.mrsool.createorder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.card.MaterialCardView;
import com.mrsool.C10232R;
import com.mrsool.bean.DiscountOptionBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.utils.C5887x;
import java.util.List;

/* renamed from: com.mrsool.createorder.p */
/* compiled from: CouponAdapter */
public class C10648p extends C1638g<C10651c> {

    /* renamed from: c */
    private List<DiscountOptionBean> f29083c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f29084d;

    /* renamed from: e */
    private Context f29085e;

    /* renamed from: com.mrsool.createorder.p$a */
    /* compiled from: CouponAdapter */
    class C10649a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29086a;

        C10649a(int i) {
            this.f29086a = i;
        }

        public void onClick(View view) {
            if (C10648p.this.f29084d != null) {
                C10648p.this.f29084d.mo37847a(this.f29086a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.p$b */
    /* compiled from: CouponAdapter */
    class C10650b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29088a;

        C10650b(int i) {
            this.f29088a = i;
        }

        public void onClick(View view) {
            if (C10648p.this.f29084d != null) {
                C10648p.this.f29084d.mo38063c(this.f29088a);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.p$c */
    /* compiled from: CouponAdapter */
    public static class C10651c extends C1635d0 {

        /* renamed from: s0 */
        TextView f29090s0;

        /* renamed from: t0 */
        TextView f29091t0;

        /* renamed from: u0 */
        TextView f29092u0;

        /* renamed from: v0 */
        LinearLayout f29093v0;

        /* renamed from: w0 */
        LinearLayout f29094w0;

        /* renamed from: x0 */
        MaterialCardView f29095x0;

        /* renamed from: y0 */
        ImageView f29096y0;

        public C10651c(View view) {
            super(view);
            this.f29090s0 = (TextView) view.findViewById(C10232R.C10236id.tvAmount);
            this.f29091t0 = (TextView) view.findViewById(C10232R.C10236id.tvType);
            this.f29092u0 = (TextView) view.findViewById(C10232R.C10236id.tvDetail);
            this.f29093v0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f29094w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llAdd);
            this.f29095x0 = (MaterialCardView) view.findViewById(C10232R.C10236id.mcvCoupon);
            this.f29096y0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheck);
        }
    }

    public C10648p(Context context, List<DiscountOptionBean> list, C11725f fVar) {
        this.f29085e = context;
        this.f29083c = list;
        this.f29084d = fVar;
    }

    /* renamed from: a */
    public void mo7330b(C10651c cVar, int i) {
        if (i < this.f29083c.size()) {
            if (((DiscountOptionBean) this.f29083c.get(i)).isDefualtValue()) {
                cVar.f29095x0.setStrokeWidth(C5887x.m25794a(2, this.f29085e));
                cVar.f29095x0.setStrokeColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.sky_blue_color));
                cVar.f29090s0.setTextColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.sky_blue_color));
                cVar.f29091t0.setTextColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.sky_blue_color));
                cVar.f29096y0.setVisibility(0);
            } else {
                cVar.f29095x0.setStrokeColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.order_place_holder_bg));
                cVar.f29091t0.setTextColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.shops_title_text_gray));
                cVar.f29090s0.setTextColor(C0841b.m4915a(this.f29085e, (int) C10232R.C10234color.shops_title_text_gray));
                cVar.f29095x0.setStrokeWidth(C5887x.m25794a(1, this.f29085e));
                cVar.f29096y0.setVisibility(8);
            }
            cVar.f29092u0.setText(((DiscountOptionBean) this.f29083c.get(i)).getLabel());
            cVar.f29090s0.setText(((DiscountOptionBean) this.f29083c.get(i)).getAmount());
            cVar.f29091t0.setText(((DiscountOptionBean) this.f29083c.get(i)).getCurrency());
            cVar.f29094w0.setVisibility(8);
            cVar.f29093v0.setVisibility(0);
            cVar.f29095x0.setOnClickListener(new C10649a(i));
        } else {
            cVar.f29093v0.setVisibility(8);
            cVar.f29094w0.setVisibility(8);
        }
        cVar.f29094w0.setOnClickListener(new C10650b(i));
    }

    /* renamed from: b */
    public C10651c m49095b(ViewGroup viewGroup, int i) {
        return new C10651c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_coupon, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f29083c.size();
    }
}
