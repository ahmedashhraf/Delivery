package com.mrsool.p409me;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.jackandphantom.circularimageview.CircleImage;
import com.mrsool.C10232R;
import com.mrsool.bean.Feedback;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.me.j */
/* compiled from: UserFeedbackAdapter */
public class C10938j extends C1638g<C10939a> {

    /* renamed from: c */
    private Context f30106c;

    /* renamed from: d */
    private List<Feedback> f30107d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C5887x f30108e;

    /* renamed from: f */
    private int f30109f = 0;

    /* renamed from: g */
    private int f30110g = 1;

    /* renamed from: com.mrsool.me.j$a */
    /* compiled from: UserFeedbackAdapter */
    public class C10939a extends C1635d0 {

        /* renamed from: s0 */
        TextView f30111s0;

        /* renamed from: t0 */
        TextView f30112t0;

        /* renamed from: u0 */
        TextView f30113u0;

        /* renamed from: v0 */
        CircleImage f30114v0;

        /* renamed from: w0 */
        RatingBar f30115w0;

        /* renamed from: x0 */
        LinearLayout f30116x0;

        public C10939a(View view) {
            super(view);
            this.f30111s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f30113u0 = (TextView) view.findViewById(C10232R.C10236id.tvDescription);
            this.f30112t0 = (TextView) view.findViewById(C10232R.C10236id.tvUserRating);
            this.f30114v0 = (CircleImage) view.findViewById(C10232R.C10236id.ivUser);
            this.f30115w0 = (RatingBar) view.findViewById(C10232R.C10236id.ratingBar);
            this.f30116x0 = (LinearLayout) view.findViewById(C10232R.C10236id.llDescription);
            if (C10938j.this.f30108e.mo23496R()) {
                C10938j.this.f30108e.mo23608d(this.f30111s0, this.f30113u0);
            }
        }
    }

    public C10938j(List<Feedback> list, Context context) {
        this.f30106c = context;
        this.f30107d = list;
        this.f30108e = new C5887x(this.f30106c);
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        List<Feedback> list = this.f30107d;
        if (list == null) {
            return this.f30109f;
        }
        if (!TextUtils.isEmpty(((Feedback) list.get(i)).getTxReview())) {
            return this.f30109f;
        }
        return this.f30110g;
    }

    /* renamed from: a */
    public void mo7330b(C10939a aVar, int i) {
        Feedback feedback = (Feedback) this.f30107d.get(i);
        if (!TextUtils.isEmpty(feedback.getTxReview())) {
            aVar.f30113u0.setText(feedback.getTxReview());
        }
        aVar.f30115w0.setRating(feedback.getFRating().floatValue());
        TextView textView = aVar.f30112t0;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(feedback.getFRating());
        textView.setText(sb.toString());
        aVar.f30111s0.setText(feedback.getIRaterName());
        C2232l.m11649c(this.f30106c.getApplicationContext()).mo9515a(feedback.getvRaterPic()).m11500e((int) C10232R.C10235drawable.ic_profile_place_holder).mo9424a((ImageView) aVar.f30114v0);
    }

    /* renamed from: b */
    public C10939a m49911b(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_user_feedback_no_desc, viewGroup, false);
        if (i == this.f30109f) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_user_feedback, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_user_feedback_no_desc, viewGroup, false);
        }
        return new C10939a(view);
    }

    /* renamed from: b */
    public int mo7325b() {
        List<Feedback> list = this.f30107d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
