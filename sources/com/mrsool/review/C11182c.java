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
import com.fasterxml.jackson.core.p162w.C3868i;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.C10232R;
import com.mrsool.newBean.ReviewBean;
import com.mrsool.p423v.C11725f;
import com.mrsool.stores.C11527b;
import com.mrsool.utils.C11644i;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.review.c */
/* compiled from: UserReviewAdapter */
public class C11182c extends C1638g<C1635d0> {

    /* renamed from: c */
    private List<ReviewBean> f30975c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f30976d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f30977e;

    /* renamed from: com.mrsool.review.c$a */
    /* compiled from: UserReviewAdapter */
    class C11183a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11186d f30979a;

        /* renamed from: b */
        final /* synthetic */ int f30980b;

        C11183a(C11186d dVar, int i) {
            this.f30979a = dVar;
            this.f30980b = i;
        }

        public void onClick(View view) {
            ImageView imageView = this.f30979a.f30986A0;
            imageView.setSelected(!imageView.isSelected());
            if (C11182c.this.f30976d != null) {
                C11182c.this.f30976d.mo38989g(this.f30980b);
            }
        }
    }

    /* renamed from: com.mrsool.review.c$b */
    /* compiled from: UserReviewAdapter */
    class C11184b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30981a;

        C11184b(int i) {
            this.f30981a = i;
        }

        public void onClick(View view) {
            if (C11182c.this.f30976d != null) {
                C11182c.this.f30976d.mo37847a(this.f30981a);
            }
        }
    }

    /* renamed from: com.mrsool.review.c$c */
    /* compiled from: UserReviewAdapter */
    class C11185c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11186d f30984a;

        /* renamed from: b */
        final /* synthetic */ int f30985b;

        C11185c(C11186d dVar, int i) {
            this.f30984a = dVar;
            this.f30985b = i;
        }

        public void onClick(View view) {
            ImageView imageView = this.f30984a.f31003z0;
            imageView.setSelected(!imageView.isSelected());
            if (C11182c.this.f30976d != null) {
                C11182c.this.f30976d.mo38988f(this.f30985b);
            }
        }
    }

    /* renamed from: com.mrsool.review.c$d */
    /* compiled from: UserReviewAdapter */
    class C11186d extends C1635d0 {

        /* renamed from: A0 */
        ImageView f30986A0;

        /* renamed from: B0 */
        ImageView f30987B0;

        /* renamed from: C0 */
        ImageView f30988C0;

        /* renamed from: D0 */
        RatingBar f30989D0;

        /* renamed from: E0 */
        LinearLayout f30990E0;

        /* renamed from: F0 */
        LinearLayout f30991F0;

        /* renamed from: G0 */
        RoundedImage f30992G0;

        /* renamed from: H0 */
        ImageView f30993H0;

        /* renamed from: I0 */
        FrameLayout f30994I0;

        /* renamed from: s0 */
        TextView f30996s0;

        /* renamed from: t0 */
        TextView f30997t0;

        /* renamed from: u0 */
        TextView f30998u0;

        /* renamed from: v0 */
        TextView f30999v0;

        /* renamed from: w0 */
        TextView f31000w0;

        /* renamed from: x0 */
        TextView f31001x0;

        /* renamed from: y0 */
        TextView f31002y0;

        /* renamed from: z0 */
        ImageView f31003z0;

        public C11186d(View view) {
            super(view);
            this.f30989D0 = (RatingBar) view.findViewById(C10232R.C10236id.ratingBar);
            this.f31000w0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f30997t0 = (TextView) view.findViewById(C10232R.C10236id.tvMore);
            this.f31000w0.setPadding(0, (int) C11182c.this.f30977e.getResources().getDimension(C10232R.dimen.dp_3), 0, 0);
            this.f31001x0 = (TextView) view.findViewById(C10232R.C10236id.tvUserRating);
            this.f30996s0 = (TextView) view.findViewById(C10232R.C10236id.tvDescription);
            this.f31002y0 = (TextView) view.findViewById(C10232R.C10236id.tvReviewCount);
            this.f30998u0 = (TextView) view.findViewById(C10232R.C10236id.tvUpCount);
            this.f30999v0 = (TextView) view.findViewById(C10232R.C10236id.tvDownCount);
            this.f30992G0 = (RoundedImage) view.findViewById(C10232R.C10236id.ivUser);
            this.f30992G0.setVisibility(8);
            this.f30993H0 = (ImageView) view.findViewById(C10232R.C10236id.ivShop);
            this.f30993H0.setVisibility(0);
            this.f30986A0 = (ImageView) view.findViewById(C10232R.C10236id.ivThumbsDown);
            this.f31003z0 = (ImageView) view.findViewById(C10232R.C10236id.ivThumbsUp);
            this.f30987B0 = (ImageView) view.findViewById(C10232R.C10236id.ivMenu);
            this.f30990E0 = (LinearLayout) view.findViewById(C10232R.C10236id.llThumbsDown);
            this.f30991F0 = (LinearLayout) view.findViewById(C10232R.C10236id.llThumbsUp);
            this.f30994I0 = (FrameLayout) view.findViewById(C10232R.C10236id.flBorder);
            this.f30988C0 = (ImageView) view.findViewById(C10232R.C10236id.ivFeatured);
        }
    }

    C11182c(Context context, List<ReviewBean> list, C11725f fVar) {
        this.f30977e = context;
        this.f30975c = list;
        this.f30976d = fVar;
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return this.f30975c.get(i) == null ? 1 : 0;
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C11186d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_review, viewGroup, false));
        }
        if (i == 1) {
            return new C11527b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.layout_loading_item, viewGroup, false));
        }
        return null;
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C11186d) {
            C11186d dVar = (C11186d) d0Var;
            C2232l.m11649c(this.f30977e).mo9515a(((ReviewBean) this.f30975c.get(i)).getServicePic()).mo9424a(dVar.f30993H0);
            dVar.f30989D0.setRating(((ReviewBean) this.f30975c.get(i)).getRating());
            dVar.f31001x0.setText(String.valueOf((int) ((ReviewBean) this.f30975c.get(i)).getRating()));
            dVar.f30996s0.setText(((ReviewBean) this.f30975c.get(i)).getReview());
            dVar.f31000w0.setText(((ReviewBean) this.f30975c.get(i)).getServiceName());
            TextView textView = dVar.f30998u0;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((ReviewBean) this.f30975c.get(i)).getUpvote());
            textView.setText(sb.toString());
            TextView textView2 = dVar.f30999v0;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(((ReviewBean) this.f30975c.get(i)).getDownvote());
            textView2.setText(sb2.toString());
            dVar.f31003z0.setSelected(((ReviewBean) this.f30975c.get(i)).getUserAction().equals(C11644i.f33355l6));
            dVar.f30986A0.setSelected(((ReviewBean) this.f30975c.get(i)).getUserAction().equals(C11644i.f33346k6));
            dVar.f31002y0.setText(((ReviewBean) this.f30975c.get(i)).getTime());
            if (((ReviewBean) this.f30975c.get(i)).isFeatured()) {
                dVar.f30994I0.setBackgroundResource(C10232R.C10235drawable.bg_shadow_featired_review2);
                dVar.f30988C0.setVisibility(0);
            } else {
                dVar.f30994I0.setBackgroundResource(C10232R.C10235drawable.bg_shadow_coupons_padding);
                dVar.f30988C0.setVisibility(8);
            }
            LinearLayout linearLayout = dVar.f30991F0;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(((ReviewBean) this.f30975c.get(i)).getUpvote());
            String str2 = C3868i.f12248b;
            sb3.append(str2);
            sb3.append(this.f30977e.getString(C10232R.string.lbl_upvote));
            linearLayout.setContentDescription(sb3.toString());
            LinearLayout linearLayout2 = dVar.f30990E0;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(((ReviewBean) this.f30975c.get(i)).getDownvote());
            sb4.append(str2);
            sb4.append(this.f30977e.getString(C10232R.string.lbl_downvote));
            linearLayout2.setContentDescription(sb4.toString());
            dVar.f30990E0.setOnClickListener(new C11183a(dVar, i));
            dVar.f30987B0.setOnClickListener(new C11184b(i));
            dVar.f30991F0.setOnClickListener(new C11185c(dVar, i));
        }
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30975c.size();
    }
}
