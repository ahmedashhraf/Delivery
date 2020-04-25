package com.mrsool.shopmenu;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.List;

/* renamed from: com.mrsool.shopmenu.x */
/* compiled from: VarientListAdapter */
public class C11454x extends C1638g<C11456b> {

    /* renamed from: c */
    private Context f32266c;

    /* renamed from: d */
    private List<MenuVarietyBean> f32267d;

    /* renamed from: e */
    private C5887x f32268e;

    /* renamed from: f */
    private C11457c f32269f;

    /* renamed from: g */
    private String f32270g;

    /* renamed from: h */
    private int f32271h = -1;

    /* renamed from: com.mrsool.shopmenu.x$a */
    /* compiled from: VarientListAdapter */
    class C11455a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f32272a;

        C11455a(int i) {
            this.f32272a = i;
        }

        public void onClick(View view) {
            C11454x.this.m51735g(this.f32272a);
        }
    }

    /* renamed from: com.mrsool.shopmenu.x$b */
    /* compiled from: VarientListAdapter */
    public static class C11456b extends C1635d0 {

        /* renamed from: s0 */
        TextView f32274s0;

        /* renamed from: t0 */
        TextView f32275t0;

        /* renamed from: u0 */
        TextView f32276u0;

        /* renamed from: v0 */
        TextView f32277v0;

        /* renamed from: w0 */
        TextView f32278w0;

        /* renamed from: x0 */
        ImageView f32279x0;

        /* renamed from: y0 */
        RelativeLayout f32280y0;

        public C11456b(View view) {
            super(view);
            this.f32274s0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
            this.f32279x0 = (ImageView) view.findViewById(C10232R.C10236id.ivCheckmark);
            this.f32275t0 = (TextView) view.findViewById(C10232R.C10236id.tvAmount);
            this.f32276u0 = (TextView) view.findViewById(C10232R.C10236id.tvCurrency);
            this.f32280y0 = (RelativeLayout) view.findViewById(C10232R.C10236id.rlMain);
            this.f32277v0 = (TextView) view.findViewById(C10232R.C10236id.tvError);
            this.f32278w0 = (TextView) view.findViewById(C10232R.C10236id.tvCalories);
        }
    }

    /* renamed from: com.mrsool.shopmenu.x$c */
    /* compiled from: VarientListAdapter */
    public interface C11457c {
        /* renamed from: a */
        void mo39105a(int i);
    }

    public C11454x(List<MenuVarietyBean> list, Context context, String str) {
        this.f32266c = context;
        this.f32267d = list;
        this.f32268e = new C5887x(context);
        this.f32270g = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m51735g(int i) {
        if (!((MenuVarietyBean) this.f32267d.get(i)).getSelected()) {
            ((MenuVarietyBean) this.f32267d.get(i)).setSelected(true);
            mo7337d(i);
            int i2 = this.f32271h;
            if (i2 != -1) {
                ((MenuVarietyBean) this.f32267d.get(i2)).setSelected(false);
                mo7337d(this.f32271h);
            }
            this.f32271h = i;
            this.f32269f.mo39105a(i);
        }
    }

    /* renamed from: f */
    public C11457c mo39526f() {
        return this.f32269f;
    }

    /* renamed from: a */
    public void mo7330b(C11456b bVar, int i) {
        MenuVarietyBean menuVarietyBean = (MenuVarietyBean) this.f32267d.get(i);
        bVar.f32274s0.setText(menuVarietyBean.getName());
        this.f32268e.mo23582b(bVar.f32274s0);
        bVar.f32275t0.setText(this.f32268e.mo23649p(C5887x.m25809b(Double.valueOf(menuVarietyBean.getPrice()))));
        bVar.f32276u0.setText(this.f32270g);
        if (!TextUtils.isEmpty(menuVarietyBean.getCalories())) {
            bVar.f32278w0.setText(menuVarietyBean.getCalories());
        }
        bVar.f32274s0.setSelected(menuVarietyBean.getSelected());
        bVar.f32279x0.setSelected(menuVarietyBean.getSelected());
        bVar.f32275t0.setSelected(menuVarietyBean.getSelected());
        bVar.f32276u0.setSelected(menuVarietyBean.getSelected());
        bVar.f32278w0.setSelected(menuVarietyBean.getSelected());
        bVar.f32277v0.setVisibility(8);
        if (this.f32271h == -1 && menuVarietyBean.getSelected()) {
            this.f32271h = i;
        }
        if (TextUtils.isEmpty(menuVarietyBean.getErrorMessage()) && menuVarietyBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
            m51730a(i, bVar, true, true, false);
        } else if (!TextUtils.isEmpty(menuVarietyBean.getErrorMessage()) && menuVarietyBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
            m51730a(i, bVar, true, true, true);
        } else if (!TextUtils.isEmpty(menuVarietyBean.getErrorMessage())) {
            m51730a(i, bVar, false, false, true);
        }
        bVar.f32280y0.setOnClickListener(new C11455a(i));
        this.f32268e.mo23608d(bVar.f32274s0, bVar.f32278w0);
    }

    /* renamed from: b */
    public C11456b m51740b(ViewGroup viewGroup, int i) {
        return new C11456b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_varients, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<MenuVarietyBean> list = this.f32267d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: b */
    private void m51734b(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(this.f32266c.getResources().getColorStateList(C10232R.C10234color.bg_menu_text_price_red));
            }
        }
    }

    /* renamed from: a */
    private void m51732a(boolean z, TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setSelected(z);
            }
        }
    }

    /* renamed from: a */
    private void m51730a(int i, C11456b bVar, boolean z, boolean z2, boolean z3) {
        if (z3) {
            m51734b(bVar.f32274s0, bVar.f32275t0, bVar.f32276u0, bVar.f32278w0);
        } else {
            m51733a(bVar.f32274s0, bVar.f32275t0, bVar.f32276u0, bVar.f32278w0);
        }
        m51732a(true, bVar.f32274s0, bVar.f32275t0, bVar.f32276u0, bVar.f32278w0);
        if (z3) {
            bVar.f32277v0.setVisibility(0);
            bVar.f32277v0.setText(((MenuVarietyBean) this.f32267d.get(i)).getErrorMessage());
        }
        if (z) {
            bVar.f32280y0.setEnabled(false);
            this.f32268e.mo23557a(false, (View) bVar.f32280y0, !z3);
        }
        if (z2) {
            bVar.f32279x0.setSelected(false);
            ((MenuVarietyBean) this.f32267d.get(i)).setSelected(false);
        }
        if (!z3 && z) {
            m51732a(false, bVar.f32274s0, bVar.f32275t0, bVar.f32276u0, bVar.f32278w0);
        }
    }

    /* renamed from: a */
    public void mo39525a(C11457c cVar) {
        this.f32269f = cVar;
    }

    /* renamed from: a */
    private void m51733a(TextView... textViewArr) {
        for (TextView textView : textViewArr) {
            if (textView != null) {
                textView.setTextColor(this.f32266c.getResources().getColorStateList(C10232R.C10234color.bg_menu_text_price_blue));
            }
        }
    }
}
