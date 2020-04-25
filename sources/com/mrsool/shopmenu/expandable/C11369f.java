package com.mrsool.shopmenu.expandable;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bignerdranch.expandablerecyclerview.C2931d;
import com.mrsool.C10232R;
import com.mrsool.shopmenu.bean.MenuCategoryBean;

/* renamed from: com.mrsool.shopmenu.expandable.f */
/* compiled from: TitleViewHolderNew */
public class C11369f extends C2931d {

    /* renamed from: A0 */
    private FrameLayout f31922A0;

    /* renamed from: B0 */
    private ImageView f31923B0;

    /* renamed from: w0 */
    private TextView f31924w0;

    /* renamed from: x0 */
    private TextView f31925x0;

    /* renamed from: y0 */
    private View f31926y0;

    /* renamed from: z0 */
    private View f31927z0;

    public C11369f(View view) {
        super(view);
        this.f31924w0 = (TextView) view.findViewById(C10232R.C10236id.listTitle);
        this.f31925x0 = (TextView) view.findViewById(C10232R.C10236id.tvCount);
        this.f31926y0 = view.findViewById(C10232R.C10236id.viewTopDivider);
        this.f31927z0 = view.findViewById(C10232R.C10236id.topView);
        this.f31922A0 = (FrameLayout) view.findViewById(C10232R.C10236id.flCount);
        this.f31923B0 = (ImageView) view.findViewById(C10232R.C10236id.ivArrow);
    }

    /* renamed from: a */
    public void mo39419a(MenuCategoryBean menuCategoryBean, boolean z, int i) {
        if (menuCategoryBean.getOrderCount() > 0) {
            TextView textView = this.f31925x0;
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(menuCategoryBean.getOrderCount());
            textView.setText(sb.toString());
            this.f31922A0.setVisibility(0);
        } else {
            this.f31922A0.setVisibility(8);
        }
        if (z) {
            this.f31923B0.setScaleY(-1.0f);
        } else {
            this.f31923B0.setScaleY(1.0f);
        }
        if (i == 0) {
            this.f31927z0.setVisibility(8);
        } else {
            this.f31927z0.setVisibility(0);
        }
        this.f31924w0.setText(menuCategoryBean.getCategoryName());
    }
}
