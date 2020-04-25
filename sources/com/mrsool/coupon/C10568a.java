package com.mrsool.coupon;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.CouponDetailBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.coupon.a */
/* compiled from: CouponListAdapter */
public class C10568a extends C1638g<C10569a> {

    /* renamed from: c */
    private Context f28737c;

    /* renamed from: d */
    private List<CouponDetailBean> f28738d = new ArrayList();

    /* renamed from: e */
    private C5887x f28739e;

    /* renamed from: com.mrsool.coupon.a$a */
    /* compiled from: CouponListAdapter */
    public static class C10569a extends C1635d0 {

        /* renamed from: s0 */
        TextView f28740s0;

        /* renamed from: t0 */
        TextView f28741t0;

        /* renamed from: u0 */
        TextView f28742u0;

        /* renamed from: v0 */
        TextView f28743v0;

        /* renamed from: w0 */
        TextView f28744w0;

        /* renamed from: x0 */
        TextView f28745x0;

        public C10569a(View view) {
            super(view);
            this.f28740s0 = (TextView) view.findViewById(C10232R.C10236id.txtCouponType);
            this.f28741t0 = (TextView) view.findViewById(C10232R.C10236id.txtAmount);
            this.f28742u0 = (TextView) view.findViewById(C10232R.C10236id.txtAmountType);
            this.f28743v0 = (TextView) view.findViewById(C10232R.C10236id.txtDiscountValidity);
            this.f28744w0 = (TextView) view.findViewById(C10232R.C10236id.txtCouponCode);
            this.f28745x0 = (TextView) view.findViewById(C10232R.C10236id.txtValid);
        }
    }

    public C10568a(List<CouponDetailBean> list, Context context) {
        this.f28737c = context;
        this.f28738d = list;
        this.f28739e = new C5887x(context);
    }

    /* renamed from: a */
    public void mo7330b(C10569a aVar, int i) {
        CouponDetailBean couponDetailBean = (CouponDetailBean) this.f28738d.get(i);
        TextView textView = aVar.f28740s0;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(couponDetailBean.getCoupon_name());
        textView.setText(sb.toString());
        TextView textView2 = aVar.f28741t0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(couponDetailBean.getCoupon_value());
        textView2.setText(sb2.toString());
        if (couponDetailBean.getCoupon_type().intValue() == 2) {
            aVar.f28742u0.setText("%");
        } else {
            TextView textView3 = aVar.f28742u0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(couponDetailBean.getCouponCurrency().trim());
            textView3.setText(sb3.toString());
        }
        if (couponDetailBean.getExpiration_date() > 0) {
            TextView textView4 = aVar.f28745x0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(this.f28737c.getResources().getString(C10232R.string.lbl_valid_upto));
            textView4.setText(sb4.toString());
            String a = this.f28739e.mo23521a(couponDetailBean.getExpiration_date() * 1000, C11644i.f33420t6);
            if (!TextUtils.isEmpty(a)) {
                TextView textView5 = aVar.f28743v0;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(a);
                textView5.setText(sb5.toString());
            } else {
                aVar.f28743v0.setText("-");
            }
        } else {
            TextView textView6 = aVar.f28745x0;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(this.f28737c.getResources().getString(C10232R.string.lbl_no_expiration_date));
            textView6.setText(sb6.toString());
            aVar.f28743v0.setText(str);
        }
        TextView textView7 = aVar.f28744w0;
        StringBuilder sb7 = new StringBuilder();
        sb7.append(str);
        sb7.append(couponDetailBean.getCoupon_number());
        textView7.setText(sb7.toString());
    }

    /* renamed from: b */
    public C10569a m48777b(ViewGroup viewGroup, int i) {
        return new C10569a(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_my_coupons, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<CouponDetailBean> list = this.f28738d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
