package com.mrsool.offer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.newBean.BundleOrderBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;

/* renamed from: com.mrsool.offer.e */
/* compiled from: OfferAdapter */
public class C10965e extends C1638g<C10966a> {

    /* renamed from: c */
    private Context f30224c;

    /* renamed from: d */
    private C5887x f30225d = new C5887x(this.f30224c);

    /* renamed from: e */
    private ArrayList<BundleOrderBean> f30226e;

    /* renamed from: com.mrsool.offer.e$a */
    /* compiled from: OfferAdapter */
    public class C10966a extends C1635d0 {

        /* renamed from: s0 */
        TextView f30227s0;

        /* renamed from: t0 */
        TextView f30228t0;

        /* renamed from: u0 */
        TextView f30229u0;

        /* renamed from: v0 */
        ImageView f30230v0;

        /* renamed from: w0 */
        ImageView f30231w0;

        /* renamed from: x0 */
        ImageView f30232x0;

        /* renamed from: y0 */
        View f30233y0;

        public C10966a(View view) {
            super(view);
            this.f30227s0 = (TextView) view.findViewById(C10232R.C10236id.tvTitle);
            this.f30228t0 = (TextView) view.findViewById(C10232R.C10236id.tvAddress);
            this.f30229u0 = (TextView) view.findViewById(C10232R.C10236id.tvDistance);
            this.f30230v0 = (ImageView) view.findViewById(C10232R.C10236id.ivIcon);
            this.f30231w0 = (ImageView) view.findViewById(C10232R.C10236id.ivLeftDot);
            this.f30232x0 = (ImageView) view.findViewById(C10232R.C10236id.ivRightDot);
            this.f30233y0 = view.findViewById(C10232R.C10236id.viewDivider);
        }
    }

    public C10965e(Context context, ArrayList<BundleOrderBean> arrayList) {
        this.f30224c = context;
        this.f30226e = arrayList;
    }

    /* renamed from: a */
    public void mo7330b(C10966a aVar, int i) {
        if (this.f30226e.size() == 1) {
            aVar.f30231w0.setVisibility(8);
            aVar.f30232x0.setVisibility(8);
            aVar.f30233y0.setVisibility(8);
        } else if (i == 0) {
            aVar.f30233y0.setVisibility(0);
            aVar.f30231w0.setVisibility(8);
            aVar.f30232x0.setVisibility(0);
        } else if (i == this.f30226e.size() - 1) {
            aVar.f30233y0.setVisibility(8);
            aVar.f30231w0.setVisibility(0);
            aVar.f30232x0.setVisibility(8);
        } else {
            aVar.f30233y0.setVisibility(0);
            aVar.f30231w0.setVisibility(0);
            aVar.f30232x0.setVisibility(0);
        }
        aVar.f30227s0.setText(((BundleOrderBean) this.f30226e.get(i)).getTitle());
        aVar.f30228t0.setText(((BundleOrderBean) this.f30226e.get(i)).getDropoffAddress());
        aVar.f30229u0.setText(String.format(this.f30224c.getResources().getString(C10232R.string.lbl_distance_value), new Object[]{((BundleOrderBean) this.f30226e.get(i)).getDistFromPreviousLoc().toString()}));
        aVar.f30230v0.setImageResource(((BundleOrderBean) this.f30226e.get(i)).getIcon());
    }

    /* renamed from: b */
    public C10966a m50007b(ViewGroup viewGroup, int i) {
        return new C10966a(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_offer_step, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30226e.size();
    }
}
