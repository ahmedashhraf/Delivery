package com.mrsool.shopmenu;

import android.content.Context;
import android.text.TextUtils;
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
import com.mrsool.C10232R;
import com.mrsool.p423v.C11725f;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.shopmenu.u */
/* compiled from: MenuOrderItemAdapter */
public class C11415u extends C1638g<C11420e> {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C11725f f32113c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public List<MenuItemBean> f32114d;

    /* renamed from: e */
    private C5887x f32115e;

    /* renamed from: f */
    private Context f32116f;

    /* renamed from: com.mrsool.shopmenu.u$a */
    /* compiled from: MenuOrderItemAdapter */
    class C11416a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f32117a;

        C11416a(int i) {
            this.f32117a = i;
        }

        public void onClick(View view) {
            C11415u.this.f32113c.mo39126b(this.f32117a);
        }
    }

    /* renamed from: com.mrsool.shopmenu.u$b */
    /* compiled from: MenuOrderItemAdapter */
    class C11417b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f32119a;

        C11417b(int i) {
            this.f32119a = i;
        }

        public void onClick(View view) {
            C11415u.this.f32113c.mo39127d(this.f32119a);
        }
    }

    /* renamed from: com.mrsool.shopmenu.u$c */
    /* compiled from: MenuOrderItemAdapter */
    class C11418c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MenuItemBean f32122a;

        /* renamed from: b */
        final /* synthetic */ int f32123b;

        C11418c(MenuItemBean menuItemBean, int i) {
            this.f32122a = menuItemBean;
            this.f32123b = i;
        }

        public void onClick(View view) {
            if (this.f32122a.getErrorType().equals(C11411s.REMOVE)) {
                C11415u.this.f32113c.mo38064e(this.f32123b);
            } else {
                C11415u.this.f32113c.mo39128h(this.f32123b);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.u$d */
    /* compiled from: MenuOrderItemAdapter */
    class C11419d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11420e f32125a;

        /* renamed from: b */
        final /* synthetic */ int f32126b;

        C11419d(C11420e eVar, int i) {
            this.f32125a = eVar;
            this.f32126b = i;
        }

        public void onClick(View view) {
            if (this.f32125a.f32129C0.getAlpha() == 1.0f && this.f32125a.f32140y0.getVisibility() != 0) {
                ((MenuItemBean) C11415u.this.f32114d.get(this.f32126b)).setEditVisible(!((MenuItemBean) C11415u.this.f32114d.get(this.f32126b)).isEditVisible());
                if (((MenuItemBean) C11415u.this.f32114d.get(this.f32126b)).isEditVisible()) {
                    this.f32125a.f32138w0.setMaxLines(1000);
                    this.f32125a.f32129C0.setScaleY(-1.0f);
                    this.f32125a.f32139x0.setVisibility(0);
                } else {
                    this.f32125a.f32138w0.setMaxLines(1);
                    this.f32125a.f32139x0.setVisibility(4);
                    this.f32125a.f32129C0.setScaleY(1.0f);
                }
                C11415u.this.f32113c.mo37847a(this.f32126b);
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.u$e */
    /* compiled from: MenuOrderItemAdapter */
    public static class C11420e extends C1635d0 {

        /* renamed from: A0 */
        LinearLayout f32127A0;

        /* renamed from: B0 */
        LinearLayout f32128B0;

        /* renamed from: C0 */
        ImageView f32129C0;

        /* renamed from: D0 */
        ImageView f32130D0;

        /* renamed from: E0 */
        View f32131E0;

        /* renamed from: F0 */
        View f32132F0;

        /* renamed from: G0 */
        View f32133G0;

        /* renamed from: s0 */
        TextView f32134s0;

        /* renamed from: t0 */
        TextView f32135t0;

        /* renamed from: u0 */
        TextView f32136u0;

        /* renamed from: v0 */
        TextView f32137v0;

        /* renamed from: w0 */
        TextView f32138w0;

        /* renamed from: x0 */
        TextView f32139x0;

        /* renamed from: y0 */
        TextView f32140y0;

        /* renamed from: z0 */
        LinearLayout f32141z0;

        public C11420e(View view) {
            super(view);
            this.f32137v0 = (TextView) view.findViewById(C10232R.C10236id.ivName);
            this.f32134s0 = (TextView) view.findViewById(C10232R.C10236id.tvOrderCount);
            this.f32135t0 = (TextView) view.findViewById(C10232R.C10236id.tvAmount);
            this.f32136u0 = (TextView) view.findViewById(C10232R.C10236id.tvCurrency);
            this.f32129C0 = (ImageView) view.findViewById(C10232R.C10236id.ivArrow);
            this.f32127A0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPlus);
            this.f32141z0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMinus);
            this.f32128B0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
            this.f32138w0 = (TextView) view.findViewById(C10232R.C10236id.tvDetail);
            this.f32139x0 = (TextView) view.findViewById(C10232R.C10236id.tvEdit);
            this.f32131E0 = view.findViewById(C10232R.C10236id.viewTop);
            this.f32132F0 = view.findViewById(C10232R.C10236id.viewBottom);
            this.f32133G0 = view.findViewById(C10232R.C10236id.viewLine);
            this.f32130D0 = (ImageView) view.findViewById(C10232R.C10236id.ivDelete);
            this.f32140y0 = (TextView) view.findViewById(C10232R.C10236id.tvError);
        }
    }

    public C11415u(Context context, ArrayList<MenuItemBean> arrayList, C11725f fVar) {
        this.f32114d = arrayList;
        this.f32113c = fVar;
        this.f32115e = new C5887x(context);
        this.f32116f = context;
    }

    /* renamed from: a */
    public void mo39498a(List<MenuItemBean> list) {
        this.f32114d = list;
    }

    /* renamed from: a */
    public void mo7330b(C11420e eVar, int i) {
        int i2 = 8;
        eVar.f32131E0.setVisibility(8);
        eVar.f32132F0.setVisibility(8);
        eVar.f32133G0.setVisibility(8);
        if (this.f32115e.mo23496R()) {
            eVar.f32137v0.setTextDirection(4);
            eVar.f32139x0.setTextDirection(4);
        }
        if (this.f32114d.size() == 1) {
            eVar.f32131E0.setVisibility(0);
            eVar.f32132F0.setVisibility(0);
            eVar.f32128B0.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_center);
        } else if (i == 0) {
            eVar.f32133G0.setVisibility(0);
            eVar.f32131E0.setVisibility(0);
            eVar.f32128B0.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_top);
        } else if (i == this.f32114d.size() - 1) {
            eVar.f32132F0.setVisibility(0);
            eVar.f32128B0.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_bottom);
        } else {
            eVar.f32128B0.setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_square);
            eVar.f32133G0.setVisibility(0);
        }
        MenuItemBean menuItemBean = (MenuItemBean) this.f32114d.get(i);
        if (menuItemBean.getOrderCount() > 1) {
            eVar.f32130D0.setImageResource(C10232R.C10235drawable.img_item_minus);
        } else {
            eVar.f32130D0.setImageResource(C10232R.C10235drawable.img_item_delete);
        }
        if (menuItemBean.getErrorType().equals(C11411s.REMOVE)) {
            eVar.f32139x0.setText(this.f32116f.getString(C10232R.string.lbl_remove));
            eVar.f32139x0.setTextColor(C0841b.m4915a(this.f32116f, (int) C10232R.C10234color.red_lite_2));
        } else {
            eVar.f32139x0.setText(this.f32116f.getString(C10232R.string.lbl_edit));
            eVar.f32139x0.setTextColor(C0841b.m4915a(this.f32116f, (int) C10232R.C10234color.sky_blue_color));
        }
        String str = "";
        if (menuItemBean.getVarietyDisplay().equals(str)) {
            eVar.f32138w0.setMaxLines(1);
            eVar.f32139x0.setVisibility(4);
            eVar.f32129C0.setVisibility(4);
            eVar.f32129C0.setScaleY(1.0f);
            eVar.f32129C0.setAlpha(0.5f);
        } else {
            eVar.f32129C0.setVisibility(0);
            eVar.f32129C0.setAlpha(1.0f);
            if (menuItemBean.isEditVisible()) {
                eVar.f32138w0.setMaxLines(1000);
                eVar.f32139x0.setVisibility(0);
                eVar.f32129C0.setScaleY(-1.0f);
            } else {
                eVar.f32138w0.setMaxLines(1);
                eVar.f32139x0.setVisibility(4);
                eVar.f32129C0.setScaleY(1.0f);
            }
        }
        if (TextUtils.isEmpty(menuItemBean.getErrorMessage())) {
            eVar.f32140y0.setVisibility(8);
        } else {
            eVar.f32140y0.setVisibility(0);
            if (menuItemBean.isEditVisible()) {
                eVar.f32138w0.setMaxLines(1000);
                eVar.f32139x0.setVisibility(0);
                eVar.f32129C0.setScaleY(-1.0f);
            } else {
                eVar.f32138w0.setMaxLines(1);
                eVar.f32139x0.setVisibility(4);
                eVar.f32129C0.setScaleY(1.0f);
            }
        }
        if (menuItemBean.getVarietyDisplay().equals(str)) {
            eVar.f32138w0.setVisibility(8);
        } else {
            eVar.f32138w0.setVisibility(0);
        }
        eVar.f32138w0.setText(menuItemBean.getVarietyDisplay());
        eVar.f32140y0.setText(menuItemBean.getErrorMessage());
        eVar.f32137v0.setText(menuItemBean.getName());
        TextView textView = eVar.f32134s0;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(menuItemBean.getOrderCount());
        textView.setText(sb.toString());
        TextView textView2 = eVar.f32135t0;
        double itemPrice = menuItemBean.getItemPrice();
        double orderCount = (double) menuItemBean.getOrderCount();
        Double.isNaN(orderCount);
        textView2.setText(C5887x.m25809b(Double.valueOf(itemPrice * orderCount)));
        eVar.f32136u0.setText(menuItemBean.getCurrency());
        eVar.f32135t0.setVisibility(menuItemBean.shouldHidePriceZero() ? 8 : 0);
        TextView textView3 = eVar.f32136u0;
        if (!menuItemBean.shouldHidePriceZero()) {
            i2 = 0;
        }
        textView3.setVisibility(i2);
        eVar.f32127A0.setOnClickListener(new C11416a(i));
        eVar.f32141z0.setOnClickListener(new C11417b(i));
        eVar.f32139x0.setOnClickListener(new C11418c(menuItemBean, i));
        eVar.f32128B0.setOnClickListener(new C11419d(eVar, i));
    }

    /* renamed from: b */
    public C11420e m51596b(ViewGroup viewGroup, int i) {
        return new C11420e(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_menu_order_items, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<MenuItemBean> list = this.f32114d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
