package com.mrsool.shopmenu.expandable;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.bignerdranch.expandablerecyclerview.C2927b;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.C10232R;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.utils.C5887x;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.shopmenu.expandable.b */
/* compiled from: ItemViewHolderNew */
public class C11316b extends C2927b {

    /* renamed from: A0 */
    private TextView f31670A0;

    /* renamed from: B0 */
    private View f31671B0;

    /* renamed from: C0 */
    private RoundedImage f31672C0;

    /* renamed from: D0 */
    private LinearLayout f31673D0;

    /* renamed from: E0 */
    private FrameLayout f31674E0;

    /* renamed from: F0 */
    private ImageView f31675F0;

    /* renamed from: G0 */
    private ImageView f31676G0;

    /* renamed from: H0 */
    private C5887x f31677H0;

    /* renamed from: u0 */
    private TextView f31678u0;

    /* renamed from: v0 */
    private TextView f31679v0;

    /* renamed from: w0 */
    private TextView f31680w0;

    /* renamed from: x0 */
    private TextView f31681x0;

    /* renamed from: y0 */
    private TextView f31682y0;

    /* renamed from: z0 */
    private TextView f31683z0;

    /* renamed from: com.mrsool.shopmenu.expandable.b$a */
    /* compiled from: ItemViewHolderNew */
    class C11317a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MenuItemBean f31685a;

        /* renamed from: b */
        final /* synthetic */ int f31686b;

        C11317a(MenuItemBean menuItemBean, int i) {
            this.f31685a = menuItemBean;
            this.f31686b = i;
        }

        public void onClick(View view) {
            if (this.f31685a.getErrorMessage().equals("")) {
                C11316b.this.m51208b(this.f31686b, this.f31685a.getId());
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.b$b */
    /* compiled from: ItemViewHolderNew */
    class C11318b implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ Dialog f31687N;

        /* renamed from: a */
        final /* synthetic */ int f31689a;

        /* renamed from: b */
        final /* synthetic */ String f31690b;

        C11318b(int i, String str, Dialog dialog) {
            this.f31689a = i;
            this.f31690b = str;
            this.f31687N = dialog;
        }

        public void onClick(View view) {
            C11316b.this.m51206a(this.f31689a, this.f31690b);
            this.f31687N.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.expandable.b$c */
    /* compiled from: ItemViewHolderNew */
    class C11319c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f31691a;

        C11319c(Dialog dialog) {
            this.f31691a = dialog;
        }

        public void onClick(View view) {
            this.f31691a.dismiss();
        }
    }

    public C11316b(View view) {
        super(view);
        this.f31678u0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
        this.f31679v0 = (TextView) view.findViewById(C10232R.C10236id.tvCalories);
        this.f31671B0 = view.findViewById(C10232R.C10236id.viewBottomDivider);
        this.f31680w0 = (TextView) view.findViewById(C10232R.C10236id.tvDetail);
        this.f31681x0 = (TextView) view.findViewById(C10232R.C10236id.tvCurrency);
        this.f31682y0 = (TextView) view.findViewById(C10232R.C10236id.tvAmount);
        this.f31672C0 = (RoundedImage) view.findViewById(C10232R.C10236id.ivItem);
        this.f31673D0 = (LinearLayout) view.findViewById(C10232R.C10236id.llCount);
        this.f31674E0 = (FrameLayout) view.findViewById(C10232R.C10236id.llDetail);
        this.f31683z0 = (TextView) view.findViewById(C10232R.C10236id.tvCount);
        this.f31675F0 = (ImageView) view.findViewById(C10232R.C10236id.ivClose);
        this.f31676G0 = (ImageView) view.findViewById(C10232R.C10236id.ivCalories);
        this.f31670A0 = (TextView) view.findViewById(C10232R.C10236id.tvError);
        this.f31677H0 = new C5887x(view.getContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51206a(int i, String str) {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51208b(int i, String str) {
        Dialog dialog = new Dialog(this.f6294a.getContext());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f31677H0;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvDelete)).setOnClickListener(new C11318b(i, str, dialog));
        textView.setOnClickListener(new C11319c(dialog));
        if (this.f6294a.getContext() != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* renamed from: a */
    public void mo39384a(MenuItemBean menuItemBean, int i, int i2) {
        if (i2 > 0) {
            this.f31683z0.setText(String.valueOf(i2));
            this.f31673D0.setVisibility(0);
            this.f31674E0.setBackgroundColor(C0841b.m4915a(this.f6294a.getContext(), (int) C10232R.C10234color.alpha_gray_color_2));
        } else {
            this.f31673D0.setVisibility(8);
            this.f31674E0.setBackgroundColor(C0841b.m4915a(this.f6294a.getContext(), (int) C10232R.C10234color.white));
        }
        if (!menuItemBean.getErrorMessage().equals("")) {
            this.f31672C0.setAlpha(0.4f);
            this.f31678u0.setAlpha(0.4f);
            this.f31682y0.setAlpha(0.4f);
            this.f31681x0.setAlpha(0.4f);
            this.f31670A0.setVisibility(0);
            this.f31670A0.setText(menuItemBean.getErrorMessage());
            this.f31680w0.setVisibility(8);
        } else {
            this.f31672C0.setAlpha(1.0f);
            this.f31678u0.setAlpha(1.0f);
            this.f31682y0.setAlpha(1.0f);
            this.f31681x0.setAlpha(1.0f);
            this.f31670A0.setVisibility(8);
            this.f31680w0.setVisibility(0);
        }
        this.f31675F0.setOnClickListener(new C11317a(menuItemBean, i));
        C2232l.m11649c(this.f6294a.getContext()).mo9515a(menuItemBean.getPhotoUrl()).m11500e((int) C10232R.C10235drawable.bg_menu_item).m11496d().mo9424a((ImageView) this.f31672C0);
        this.f31678u0.setText(menuItemBean.getName());
        this.f31680w0.setText(menuItemBean.getShortDesc());
        this.f31682y0.setText(menuItemBean.getPrice());
        this.f31681x0.setText(menuItemBean.getCurrency());
        if (!TextUtils.isEmpty(menuItemBean.getCalories())) {
            this.f31679v0.setVisibility(0);
            this.f31676G0.setVisibility(0);
            this.f31679v0.setText(menuItemBean.getCalories());
            return;
        }
        this.f31676G0.setVisibility(8);
        this.f31679v0.setVisibility(8);
    }
}
