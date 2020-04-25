package com.mrsool.p425y;

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
import com.mrsool.C10232R;
import com.mrsool.bean.CancelReasonBean;
import java.util.List;

/* renamed from: com.mrsool.y.c */
/* compiled from: ShowReasonListAdapter */
public class C11761c extends C1638g<C11763b> {

    /* renamed from: c */
    private Context f34010c;

    /* renamed from: d */
    private List<CancelReasonBean> f34011d;

    /* renamed from: e */
    int f34012e = -1;

    /* renamed from: com.mrsool.y.c$a */
    /* compiled from: ShowReasonListAdapter */
    class C11762a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11763b f34013a;

        C11762a(C11763b bVar) {
            this.f34013a = bVar;
        }

        public void onClick(View view) {
            C11761c.this.mo40270g(this.f34013a.mo7273f());
        }
    }

    /* renamed from: com.mrsool.y.c$b */
    /* compiled from: ShowReasonListAdapter */
    public static class C11763b extends C1635d0 {

        /* renamed from: s0 */
        TextView f34015s0;

        /* renamed from: t0 */
        ImageView f34016t0;

        public C11763b(View view) {
            super(view);
            this.f34015s0 = (TextView) view.findViewById(C10232R.C10236id.tvReason);
            this.f34016t0 = (ImageView) view.findViewById(C10232R.C10236id.ivSelectedReason);
        }
    }

    public C11761c(List<CancelReasonBean> list, Context context) {
        this.f34010c = context;
        this.f34011d = list;
    }

    /* renamed from: a */
    public void mo7330b(C11763b bVar, int i) {
        bVar.f34015s0.setText(((CancelReasonBean) this.f34011d.get(i)).getReason());
        bVar.f34016t0.setVisibility(this.f34012e == i ? 0 : 8);
        bVar.f34015s0.setTextColor(C0841b.m4915a(this.f34010c, this.f34012e == i ? C10232R.C10234color.sky_blue_color : C10232R.C10234color.text_color_5b));
        bVar.f6294a.setOnClickListener(new C11762a(bVar));
    }

    /* renamed from: f */
    public int mo40269f() {
        return this.f34012e;
    }

    /* renamed from: g */
    public void mo40270g(int i) {
        this.f34012e = i;
        mo7341e();
    }

    /* renamed from: b */
    public C11763b m52897b(ViewGroup viewGroup, int i) {
        return new C11763b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_order_reasons, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<CancelReasonBean> list = this.f34011d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
