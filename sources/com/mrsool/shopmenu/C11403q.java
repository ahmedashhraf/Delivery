package com.mrsool.shopmenu;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.swiperefreshlayout.widget.C1817b;
import com.jackandphantom.circularimageview.RoundedImage;
import com.mrsool.C10232R;
import com.mrsool.p423v.C11725f;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.shopmenu.q */
/* compiled from: CustomExpandableListAdapter */
public class C11403q extends BaseExpandableListAdapter {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C11725f f32069N;

    /* renamed from: O */
    private C5887x f32070O;

    /* renamed from: a */
    private Context f32071a;

    /* renamed from: b */
    private ArrayList<MenuCategoryBean> f32072b;

    /* renamed from: com.mrsool.shopmenu.q$a */
    /* compiled from: CustomExpandableListAdapter */
    class C11404a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MenuItemBean f32074a;

        /* renamed from: b */
        final /* synthetic */ int f32075b;

        C11404a(MenuItemBean menuItemBean, int i) {
            this.f32074a = menuItemBean;
            this.f32075b = i;
        }

        public void onClick(View view) {
            if (this.f32074a.getErrorMessage().equals("")) {
                C11403q.this.m51578b(this.f32075b, this.f32074a.getId());
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.q$b */
    /* compiled from: CustomExpandableListAdapter */
    class C11405b implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ Dialog f32076N;

        /* renamed from: a */
        final /* synthetic */ int f32078a;

        /* renamed from: b */
        final /* synthetic */ String f32079b;

        C11405b(int i, String str, Dialog dialog) {
            this.f32078a = i;
            this.f32079b = str;
            this.f32076N = dialog;
        }

        public void onClick(View view) {
            C11403q.this.m51576a(this.f32078a, this.f32079b);
            C11403q.this.notifyDataSetChanged();
            C11403q.this.f32069N.mo38064e(this.f32078a);
            this.f32076N.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.q$c */
    /* compiled from: CustomExpandableListAdapter */
    class C11406c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32080a;

        C11406c(Dialog dialog) {
            this.f32080a = dialog;
        }

        public void onClick(View view) {
            this.f32080a.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.q$d */
    /* compiled from: CustomExpandableListAdapter */
    public static class C11407d extends C1635d0 {

        /* renamed from: s0 */
        TextView f32082s0;

        /* renamed from: t0 */
        TextView f32083t0;

        /* renamed from: u0 */
        ImageView f32084u0;

        /* renamed from: v0 */
        LinearLayout f32085v0;

        public C11407d(View view) {
            super(view);
            this.f32082s0 = (TextView) view.findViewById(C10232R.C10236id.tvBookMarkName);
            this.f32083t0 = (TextView) view.findViewById(C10232R.C10236id.tvLocation);
            this.f32084u0 = (ImageView) view.findViewById(C10232R.C10236id.ivDelete);
            this.f32085v0 = (LinearLayout) view.findViewById(C10232R.C10236id.llMain);
        }
    }

    public C11403q(Context context, C11725f fVar) {
        this.f32069N = fVar;
        this.f32071a = context;
        this.f32070O = new C5887x(context);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        int i3 = i;
        int i4 = i2;
        MenuItemBean child = getChild(i, i2);
        View inflate = view == null ? ((LayoutInflater) this.f32071a.getSystemService("layout_inflater")).inflate(C10232R.layout.row_menu_child, null) : view;
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvName);
        TextView textView2 = (TextView) inflate.findViewById(C10232R.C10236id.tvCalories);
        inflate.findViewById(C10232R.C10236id.viewBottomDivider);
        View findViewById = inflate.findViewById(C10232R.C10236id.viewBottomDivider1);
        TextView textView3 = (TextView) inflate.findViewById(C10232R.C10236id.tvDetail);
        TextView textView4 = (TextView) inflate.findViewById(C10232R.C10236id.tvCurrency);
        TextView textView5 = (TextView) inflate.findViewById(C10232R.C10236id.tvAmount);
        RoundedImage roundedImage = (RoundedImage) inflate.findViewById(C10232R.C10236id.ivItem);
        RoundedImage roundedImage2 = (RoundedImage) inflate.findViewById(C10232R.C10236id.ivItem1);
        roundedImage.setRoundedRadius((int) this.f32071a.getResources().getDimension(C10232R.dimen.dp_4));
        roundedImage2.setRoundedRadius((int) this.f32071a.getResources().getDimension(C10232R.dimen.dp_4));
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llCount);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C10232R.C10236id.llDetail);
        TextView textView6 = (TextView) inflate.findViewById(C10232R.C10236id.tvCount);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivClose);
        View view2 = findViewById;
        ImageView imageView2 = (ImageView) inflate.findViewById(C10232R.C10236id.ivCalories);
        TextView textView7 = (TextView) inflate.findViewById(C10232R.C10236id.tvError);
        View view3 = inflate;
        int childOrderCount = ((MenuCategoryBean) this.f32072b.get(i3)).getChildOrderCount(i4);
        String str = "";
        TextView textView8 = textView2;
        if (childOrderCount > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(childOrderCount);
            textView6.setText(sb.toString());
            linearLayout.setVisibility(0);
            frameLayout.setBackgroundColor(C0841b.m4915a(this.f32071a, (int) C10232R.C10234color.alpha_gray_color_2));
        } else {
            linearLayout.setVisibility(8);
            frameLayout.setBackgroundColor(C0841b.m4915a(this.f32071a, (int) C10232R.C10234color.white));
        }
        if (!child.getErrorMessage().equals(str)) {
            roundedImage.setAlpha(0.4f);
            textView.setAlpha(0.4f);
            textView5.setAlpha(0.4f);
            textView4.setAlpha(0.4f);
            textView7.setVisibility(0);
            textView7.setText(child.getErrorMessage());
            textView3.setVisibility(8);
        } else {
            roundedImage.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            textView5.setAlpha(1.0f);
            textView4.setAlpha(1.0f);
            textView7.setVisibility(8);
            textView3.setVisibility(0);
        }
        imageView.setOnClickListener(new C11404a(child, i3));
        C2232l.m11649c(this.f32071a).mo9515a(child.getPhotoUrl()).m11491c((int) C10232R.C10235drawable.img_placeholder).m11496d().mo9424a((ImageView) roundedImage);
        textView.setText(child.getName());
        textView3.setText(child.getShortDesc());
        textView5.setText(child.getPrice());
        textView4.setText(child.getCurrency());
        textView5.setVisibility(child.shouldHidePriceZero() ? 8 : 0);
        textView4.setVisibility(child.shouldHidePriceZero() ? 8 : 0);
        if (!TextUtils.isEmpty(child.getCalories())) {
            TextView textView9 = textView8;
            textView9.setVisibility(0);
            imageView2.setVisibility(0);
            textView9.setText(child.getCalories());
        } else {
            TextView textView10 = textView8;
            imageView2.setVisibility(8);
            textView10.setVisibility(8);
        }
        if (((MenuCategoryBean) this.f32072b.get(i3)).getArrayListMenuItems().size() - 1 == i2 && i3 == this.f32072b.size() - 1) {
            view2.setVisibility(0);
        } else {
            view2.setVisibility(8);
        }
        return view3;
    }

    public int getChildrenCount(int i) {
        return ((MenuCategoryBean) this.f32072b.get(i)).getArrayListMenuItems().size();
    }

    public int getGroupCount() {
        ArrayList<MenuCategoryBean> arrayList = this.f32072b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        MenuCategoryBean group = getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f32071a.getSystemService("layout_inflater")).inflate(C10232R.layout.row_menu_category_parent, null);
        }
        TextView textView = (TextView) view.findViewById(C10232R.C10236id.listTitle);
        TextView textView2 = (TextView) view.findViewById(C10232R.C10236id.tvCount);
        view.findViewById(C10232R.C10236id.bottomView);
        View findViewById = view.findViewById(C10232R.C10236id.topView);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C10232R.C10236id.flCount);
        ImageView imageView = (ImageView) view.findViewById(C10232R.C10236id.ivArrow);
        if (group.getOrderCount() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(group.getOrderCount());
            textView2.setText(sb.toString());
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
        }
        if (z) {
            imageView.setScaleY(-1.0f);
        } else {
            imageView.setScaleY(1.0f);
        }
        if (i == 0) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
        }
        textView.setText(group.getCategoryName());
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m51578b(int i, String str) {
        Dialog dialog = new Dialog(this.f32071a);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f32070O;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvDelete)).setOnClickListener(new C11405b(i, str, dialog));
        textView.setOnClickListener(new C11406c(dialog));
        if (this.f32071a != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    public MenuItemBean getChild(int i, int i2) {
        return (MenuItemBean) ((MenuCategoryBean) this.f32072b.get(i)).getArrayListMenuItems().get(i2);
    }

    public MenuCategoryBean getGroup(int i) {
        return (MenuCategoryBean) this.f32072b.get(i);
    }

    /* renamed from: a */
    public void mo39465a(ArrayList<MenuCategoryBean> arrayList) {
        this.f32072b = arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51576a(int i, String str) {
        int i2 = 0;
        while (i2 < ((MenuCategoryBean) this.f32072b.get(i)).getArrayListUsersMenuItems().size()) {
            if (((MenuItemBean) ((MenuCategoryBean) this.f32072b.get(i)).getArrayListUsersMenuItems().get(i2)).getId().equals(str)) {
                ((MenuCategoryBean) this.f32072b.get(i)).getArrayListUsersMenuItems().remove(i2);
                i2--;
            }
            i2++;
        }
    }

    /* renamed from: a */
    private C1817b m51573a() {
        C1817b bVar = new C1817b(this.f32071a);
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(this.f32071a.getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* renamed from: a */
    private void m51575a(int i, int i2) {
        MenuItemBean menuItemBean = (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().get(i2);
        menuItemBean.setSelected(false);
        for (int i3 = 0; i3 < menuItemBean.getArrayListVariety().size(); i3++) {
            ((MenuVarietyBean) menuItemBean.getArrayListVariety().get(i3)).setSelected(false);
        }
        for (int i4 = 0; i4 < menuItemBean.getArrayListAddons().size(); i4++) {
            for (int i5 = 0; i5 < ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i4)).getMenuAddonOptions().size(); i5++) {
                ((MenuAddonsOptionsBean) ((MenuAddonsBean) menuItemBean.getArrayListAddons().get(i4)).getMenuAddonOptions().get(i5)).setSelected(false);
            }
        }
    }
}
