package com.mrsool.review;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.RatingReasonBean;
import com.mrsool.p423v.C11725f;
import java.util.List;

/* renamed from: com.mrsool.review.a */
/* compiled from: ReasonAdapter */
public class C11174a extends C1638g<C11176b> {

    /* renamed from: c */
    private List<RatingReasonBean> f30942c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11725f f30943d;

    /* renamed from: e */
    private Context f30944e;

    /* renamed from: com.mrsool.review.a$a */
    /* compiled from: ReasonAdapter */
    class C11175a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30945a;

        C11175a(int i) {
            this.f30945a = i;
        }

        public void onClick(View view) {
            if (C11174a.this.f30943d != null) {
                C11174a.this.f30943d.mo37847a(this.f30945a);
            }
        }
    }

    /* renamed from: com.mrsool.review.a$b */
    /* compiled from: ReasonAdapter */
    public static class C11176b extends C1635d0 {

        /* renamed from: s0 */
        TextView f30947s0;

        public C11176b(View view) {
            super(view);
            this.f30947s0 = (TextView) view.findViewById(C10232R.C10236id.tvReason);
        }
    }

    public C11174a(Context context, List<RatingReasonBean> list, C11725f fVar) {
        this.f30944e = context;
        this.f30942c = list;
        this.f30943d = fVar;
    }

    /* renamed from: a */
    public void mo7330b(C11176b bVar, int i) {
        if (((RatingReasonBean) this.f30942c.get(i)).getSelected()) {
            bVar.f30947s0.setTextColor(C0841b.m4915a(this.f30944e, (int) C10232R.C10234color.white));
            bVar.f30947s0.setBackgroundResource(C10232R.C10235drawable.bg_sky_blue_10);
        } else {
            bVar.f30947s0.setTextColor(C0841b.m4915a(this.f30944e, (int) C10232R.C10234color.shops_title_text_gray));
            bVar.f30947s0.setBackgroundResource(C10232R.C10235drawable.border_reason);
        }
        bVar.f30947s0.setText(((RatingReasonBean) this.f30942c.get(i)).getName());
        bVar.f30947s0.setOnClickListener(new C11175a(i));
    }

    /* renamed from: b */
    public C11176b m50617b(ViewGroup viewGroup, int i) {
        return new C11176b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_reason, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        return this.f30942c.size();
    }
}
