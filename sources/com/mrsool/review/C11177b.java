package com.mrsool.review;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.C10232R;
import com.mrsool.newBean.ReviewBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.stores.C11527b;
import com.mrsool.utils.C11644i;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.review.b */
/* compiled from: ServiceReviewAdapter */
public class C11177b extends C1638g<C1635d0> {

    /* renamed from: c */
    private List<ReviewBean> f30948c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f30949d;

    /* renamed from: e */
    private Context f30950e;

    /* renamed from: com.mrsool.review.b$a */
    /* compiled from: ServiceReviewAdapter */
    class C11178a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11181d f30952a;

        /* renamed from: b */
        final /* synthetic */ int f30953b;

        C11178a(C11181d dVar, int i) {
            this.f30952a = dVar;
            this.f30953b = i;
        }

        public void onClick(View view) {
            ImageView imageView = this.f30952a.f30959A0;
            imageView.setSelected(!imageView.isSelected());
            if (C11177b.this.f30949d != null) {
                C11177b.this.f30949d.mo38989g(this.f30953b);
            }
        }
    }

    /* renamed from: com.mrsool.review.b$b */
    /* compiled from: ServiceReviewAdapter */
    class C11179b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30954a;

        C11179b(int i) {
            this.f30954a = i;
        }

        public void onClick(View view) {
            if (C11177b.this.f30949d != null) {
                C11177b.this.f30949d.mo37847a(this.f30954a);
            }
        }
    }

    /* renamed from: com.mrsool.review.b$c */
    /* compiled from: ServiceReviewAdapter */
    class C11180c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11181d f30957a;

        /* renamed from: b */
        final /* synthetic */ int f30958b;

        C11180c(C11181d dVar, int i) {
            this.f30957a = dVar;
            this.f30958b = i;
        }

        public void onClick(View view) {
            ImageView imageView = this.f30957a.f30974z0;
            imageView.setSelected(!imageView.isSelected());
            if (C11177b.this.f30949d != null) {
                C11177b.this.f30949d.mo38988f(this.f30958b);
            }
        }
    }

    /* renamed from: com.mrsool.review.b$d */
    /* compiled from: ServiceReviewAdapter */
    public static class C11181d extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30959A0;

        /* renamed from: B0 */
        ImageView f30960B0;

        /* renamed from: C0 */
        ImageView f30961C0;

        /* renamed from: D0 */
        RatingBar f30962D0;

        /* renamed from: E0 */
        LinearLayout f30963E0;

        /* renamed from: F0 */
        LinearLayout f30964F0;

        /* renamed from: G0 */
        TextView f30965G0;

        /* renamed from: H0 */
        FrameLayout f30966H0;

        /* renamed from: s0 */
        TextView f30967s0;

        /* renamed from: t0 */
        TextView f30968t0;

        /* renamed from: u0 */
        TextView f30969u0;

        /* renamed from: v0 */
        TextView f30970v0;

        /* renamed from: w0 */
        TextView f30971w0;

        /* renamed from: x0 */
        TextView f30972x0;

        /* renamed from: y0 */
        RoundedImage f30973y0;

        /* renamed from: z0 */
        ImageView f30974z0;

        public C11181d(View view) {
            super(view);
            this.f30962D0 = (RatingBar) view.findViewById(C10232R.C10236id.ratingBar);
            this.f30970v0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f30967s0 = (TextView) view.findViewById(C10232R.C10236id.tvMore);
            this.f30972x0 = (TextView) view.findViewById(C10232R.C10236id.tvUserRating);
            this.f30965G0 = (TextView) view.findViewById(C10232R.C10236id.tvDescription);
            this.f30971w0 = (TextView) view.findViewById(C10232R.C10236id.tvReviewCount);
            this.f30968t0 = (TextView) view.findViewById(C10232R.C10236id.tvUpCount);
            this.f30969u0 = (TextView) view.findViewById(C10232R.C10236id.tvDownCount);
            this.f30973y0 = (RoundedImage) view.findViewById(C10232R.C10236id.ivUser);
            this.f30959A0 = (ImageView) view.findViewById(C10232R.C10236id.ivThumbsDown);
            this.f30974z0 = (ImageView) view.findViewById(C10232R.C10236id.ivThumbsUp);
            this.f30960B0 = (ImageView) view.findViewById(C10232R.C10236id.ivMenu);
            this.f30963E0 = (LinearLayout) view.findViewById(C10232R.C10236id.llThumbsDown);
            this.f30964F0 = (LinearLayout) view.findViewById(C10232R.C10236id.llThumbsUp);
            this.f30966H0 = (FrameLayout) view.findViewById(C10232R.C10236id.flBorder);
            this.f30961C0 = (ImageView) view.findViewById(C10232R.C10236id.ivFeatured);
        }
    }

    C11177b(Context context, List<ReviewBean> list, C11725f fVar) {
        this.f30950e = context;
        this.f30948c = list;
        this.f30949d = fVar;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C11181d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_review, viewGroup, false));
        }
        if (i == 1) {
            return new C11527b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.layout_loading_item, viewGroup, false));
        }
        return null;
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return this.f30948c.get(i) == null ? 1 : 0;
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C11181d) {
            C11181d dVar = (C11181d) d0Var;
            C2232l.m11649c(this.f30950e).mo9515a(((ReviewBean) this.f30948c.get(i)).getRaterPic()).mo9424a((ImageView) dVar.f30973y0);
            dVar.f30973y0.setRoundedRadius((int) this.f30950e.getResources().getDimension(C10232R.dimen.dp_24));
            dVar.f30962D0.setRating(((ReviewBean) this.f30948c.get(i)).getRating());
            dVar.f30972x0.setText(String.valueOf((int) ((ReviewBean) this.f30948c.get(i)).getRating()));
            dVar.f30965G0.setText(((ReviewBean) this.f30948c.get(i)).getReview());
            dVar.f30960B0.setVisibility(((ReviewBean) this.f30948c.get(i)).isOwner() ? 0 : 4);
            dVar.f30970v0.setText(((ReviewBean) this.f30948c.get(i)).getRaterName());
            TextView textView = dVar.f30968t0;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((ReviewBean) this.f30948c.get(i)).getUpvote());
            textView.setText(sb.toString());
            TextView textView2 = dVar.f30969u0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(((ReviewBean) this.f30948c.get(i)).getDownvote());
            textView2.setText(sb2.toString());
            dVar.f30974z0.setSelected(((ReviewBean) this.f30948c.get(i)).getUserAction().equals(C11644i.f33355l6));
            dVar.f30959A0.setSelected(((ReviewBean) this.f30948c.get(i)).getUserAction().equals(C11644i.f33346k6));
            dVar.f30971w0.setText(((ReviewBean) this.f30948c.get(i)).getTime());
            if (((ReviewBean) this.f30948c.get(i)).isFeatured()) {
                dVar.f30966H0.setBackgroundResource(C10232R.C10235drawable.bg_shadow_featired_review2);
                dVar.f30961C0.setVisibility(0);
            } else {
                dVar.f30966H0.setBackgroundResource(C10232R.C10235drawable.bg_shadow_coupons_padding);
                dVar.f30961C0.setVisibility(8);
            }
            dVar.f30963E0.setOnClickListener(new C11178a(dVar, i));
            dVar.f30960B0.setOnClickListener(new C11179b(i));
            dVar.f30964F0.setOnClickListener(new C11180c(dVar, i));
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30948c.size();
    }
}
