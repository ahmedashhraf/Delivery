package com.mrsool.shopmenu;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0841b;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.mrsool.C10232R;
import com.mrsool.p423v.C11725f;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;

/* renamed from: com.mrsool.shopmenu.r */
/* compiled from: CustomExpandableListAddMenuAdapter */
public class C11408r extends BaseExpandableListAdapter {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public C11725f f32086N;

    /* renamed from: O */
    private C5887x f32087O;

    /* renamed from: P */
    private String f32088P;

    /* renamed from: a */
    private Context f32089a;

    /* renamed from: b */
    private ArrayList<MenuAddonsBean> f32090b;

    /* renamed from: com.mrsool.shopmenu.r$a */
    /* compiled from: CustomExpandableListAddMenuAdapter */
    class C11409a implements OnClickListener {

        /* renamed from: N */
        final /* synthetic */ Dialog f32091N;

        /* renamed from: a */
        final /* synthetic */ int f32093a;

        /* renamed from: b */
        final /* synthetic */ String f32094b;

        C11409a(int i, String str, Dialog dialog) {
            this.f32093a = i;
            this.f32094b = str;
            this.f32091N = dialog;
        }

        public void onClick(View view) {
            C11408r.this.m51582a(this.f32093a, this.f32094b);
            C11408r.this.notifyDataSetChanged();
            C11408r.this.f32086N.mo38064e(this.f32093a);
            this.f32091N.dismiss();
        }
    }

    /* renamed from: com.mrsool.shopmenu.r$b */
    /* compiled from: CustomExpandableListAddMenuAdapter */
    class C11410b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f32095a;

        C11410b(Dialog dialog) {
            this.f32095a = dialog;
        }

        public void onClick(View view) {
            this.f32095a.dismiss();
        }
    }

    public C11408r(Context context, String str, C11725f fVar) {
        String str2 = "SAR";
        this.f32088P = str2;
        this.f32086N = fVar;
        this.f32089a = context;
        this.f32088P = str;
        if (this.f32088P.equals("")) {
            this.f32088P = str2;
        }
        this.f32087O = new C5887x(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m51582a(int i, String str) {
    }

    /* renamed from: b */
    private void m51584b(int i, String str) {
        Dialog dialog = new Dialog(this.f32089a);
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_delete_cart_item);
        dialog.setCancelable(true);
        C5887x xVar = this.f32087O;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvCancel);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvDelete)).setOnClickListener(new C11409a(i, str, dialog));
        textView.setOnClickListener(new C11410b(dialog));
        if (this.f32089a != null && !dialog.isShowing()) {
            dialog.show();
        }
    }

    public Object getChild(int i, int i2) {
        if (((MenuAddonsBean) this.f32090b.get(i)).getType() == 0) {
            return ((MenuAddonsBean) this.f32090b.get(i)).getmVarietiesArray().get(i2);
        }
        return ((MenuAddonsBean) this.f32090b.get(i)).getMenuAddonOptions().get(i2);
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        View view2;
        int i3 = i;
        String str = "layout_inflater";
        String str2 = "";
        if (((MenuAddonsBean) this.f32090b.get(i3)).getType() == 0) {
            MenuVarietyBean menuVarietyBean = (MenuVarietyBean) getChild(i, i2);
            view2 = ((LayoutInflater) this.f32089a.getSystemService(str)).inflate(C10232R.layout.row_menu_varients, null);
            TextView textView = (TextView) view2.findViewById(C10232R.C10236id.tvName);
            TextView textView2 = (TextView) view2.findViewById(C10232R.C10236id.tvCalories);
            ImageView imageView = (ImageView) view2.findViewById(C10232R.C10236id.ivCalories);
            ImageView imageView2 = (ImageView) view2.findViewById(C10232R.C10236id.ivCheckmark);
            TextView textView3 = (TextView) view2.findViewById(C10232R.C10236id.tvAmount);
            TextView textView4 = (TextView) view2.findViewById(C10232R.C10236id.tvCurrency);
            TextView textView5 = (TextView) view2.findViewById(C10232R.C10236id.tvDescription);
            TextView textView6 = (TextView) view2.findViewById(C10232R.C10236id.tvError);
            view2.findViewById(C10232R.C10236id.viewBottomDivider);
            if (this.f32087O.mo23496R()) {
                this.f32087O.mo23608d(textView5);
            }
            textView.setText(menuVarietyBean.getName());
            this.f32087O.mo23582b(textView);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(menuVarietyBean.getPrice());
            textView3.setText(sb.toString());
            textView4.setText(this.f32088P);
            if (!TextUtils.isEmpty(menuVarietyBean.getCalories())) {
                textView2.setText(menuVarietyBean.getCalories());
                textView2.setVisibility(0);
                imageView.setVisibility(0);
            } else {
                textView2.setVisibility(8);
                imageView.setVisibility(8);
            }
            textView.setSelected(menuVarietyBean.getSelected());
            imageView2.setSelected(menuVarietyBean.getSelected());
            textView3.setSelected(menuVarietyBean.getSelected());
            textView4.setSelected(menuVarietyBean.getSelected());
            textView2.setSelected(menuVarietyBean.getSelected());
            imageView.setSelected(menuVarietyBean.getSelected());
            textView6.setVisibility(8);
        } else {
            view2 = ((LayoutInflater) this.f32089a.getSystemService(str)).inflate(C10232R.layout.row_menu_addons, null);
            ImageView imageView3 = (ImageView) view2.findViewById(C10232R.C10236id.ivCheckMark);
            TextView textView7 = (TextView) view2.findViewById(C10232R.C10236id.tvName);
            ImageView imageView4 = (ImageView) view2.findViewById(C10232R.C10236id.ivCalories);
            TextView textView8 = (TextView) view2.findViewById(C10232R.C10236id.tvCalories);
            TextView textView9 = (TextView) view2.findViewById(C10232R.C10236id.tvAmount);
            TextView textView10 = (TextView) view2.findViewById(C10232R.C10236id.tvCurrency);
            TextView textView11 = (TextView) view2.findViewById(C10232R.C10236id.tvDescription);
            TextView textView12 = (TextView) view2.findViewById(C10232R.C10236id.tvError);
            View findViewById = view2.findViewById(C10232R.C10236id.viewBottomDivider);
            if (this.f32087O.mo23496R()) {
                this.f32087O.mo23577b((View) textView11);
            }
            if (((MenuAddonsBean) this.f32090b.get(i3)).getMenuAddonOptions().size() == 0) {
                MenuAddonsBean group = getGroup(i);
                textView7.setText(group.getName());
                this.f32087O.mo23582b(textView7);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(group.getPrice());
                textView9.setText(sb2.toString());
                textView10.setText(this.f32088P);
                if (!TextUtils.isEmpty(group.getCalories())) {
                    textView8.setText(group.getCalories());
                    textView8.setVisibility(0);
                    imageView4.setVisibility(0);
                } else {
                    textView8.setVisibility(8);
                    imageView4.setVisibility(8);
                }
                if (TextUtils.isEmpty(group.getErrorMessage()) && group.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    group.setSelected(false);
                    view2.setEnabled(false);
                } else if (!TextUtils.isEmpty(group.getErrorMessage()) && group.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    group.setSelected(false);
                    view2.setEnabled(false);
                    textView12.setText(group.getErrorMessage());
                } else if (!TextUtils.isEmpty(group.getErrorMessage())) {
                    textView12.setText(group.getErrorMessage());
                }
                textView7.setSelected(group.isSelected());
                imageView3.setSelected(group.isSelected());
                textView9.setSelected(group.isSelected());
                textView10.setSelected(group.isSelected());
                textView8.setSelected(group.isSelected());
                imageView4.setSelected(group.isSelected());
                findViewById.setVisibility(8);
            } else {
                MenuAddonsOptionsBean menuAddonsOptionsBean = (MenuAddonsOptionsBean) getChild(i, i2);
                textView7.setText(menuAddonsOptionsBean.getName());
                View view3 = findViewById;
                this.f32087O.mo23582b(textView7);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(menuAddonsOptionsBean.getPrice());
                textView9.setText(sb3.toString());
                textView10.setText(this.f32088P);
                if (!TextUtils.isEmpty(menuAddonsOptionsBean.getCalories())) {
                    textView8.setText(menuAddonsOptionsBean.getCalories());
                    textView8.setVisibility(0);
                    imageView4.setVisibility(0);
                } else {
                    textView8.setVisibility(8);
                    imageView4.setVisibility(8);
                }
                if (TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    menuAddonsOptionsBean.setSelected(false);
                    view2.setEnabled(false);
                } else if (!TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    menuAddonsOptionsBean.setSelected(false);
                    view2.setEnabled(false);
                    textView12.setText(menuAddonsOptionsBean.getErrorMessage());
                } else if (!TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage())) {
                    textView12.setText(menuAddonsOptionsBean.getErrorMessage());
                }
                textView7.setSelected(menuAddonsOptionsBean.isSelected());
                imageView3.setSelected(menuAddonsOptionsBean.isSelected());
                textView9.setSelected(menuAddonsOptionsBean.isSelected());
                textView10.setSelected(menuAddonsOptionsBean.isSelected());
                textView8.setSelected(menuAddonsOptionsBean.isSelected());
                imageView4.setSelected(menuAddonsOptionsBean.isSelected());
                if (i2 == ((MenuAddonsBean) this.f32090b.get(i3)).getMenuAddonOptions().size() - 1) {
                    view3.setVisibility(8);
                } else {
                    view3.setVisibility(0);
                }
            }
        }
        return view2;
    }

    public int getChildrenCount(int i) {
        if (((MenuAddonsBean) this.f32090b.get(i)).getType() == 0) {
            return ((MenuAddonsBean) this.f32090b.get(i)).getmVarietiesArray().size();
        }
        if (((MenuAddonsBean) this.f32090b.get(i)).getMenuAddonOptions().size() == 0) {
            return 1;
        }
        return ((MenuAddonsBean) this.f32090b.get(i)).getMenuAddonOptions().size();
    }

    public int getGroupCount() {
        ArrayList<MenuAddonsBean> arrayList = this.f32090b;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        MenuAddonsBean group = getGroup(i);
        if (view == null) {
            view = ((LayoutInflater) this.f32089a.getSystemService("layout_inflater")).inflate(C10232R.layout.row_menu_parent, null);
        }
        TextView textView = (TextView) view.findViewById(C10232R.C10236id.listTitle);
        TextView textView2 = (TextView) view.findViewById(C10232R.C10236id.tvMaxOptions);
        View findViewById = view.findViewById(C10232R.C10236id.viewTopDivider);
        ImageView imageView = (ImageView) view.findViewById(C10232R.C10236id.ivArrow);
        textView.setText(group.getTitle());
        if (z) {
            findViewById.setVisibility(0);
            imageView.setScaleY(-1.0f);
        } else {
            findViewById.setVisibility(8);
            imageView.setScaleY(1.0f);
        }
        String str = "";
        if (group.getMaxAllowedOption() > 0 && group.getMinAllowedOption() > 0) {
            textView2.setVisibility(0);
            String string = this.f32089a.getResources().getString(C10232R.string.lbl_option_min_max);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(group.getMinAllowedOption());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(group.getMaxAllowedOption());
            textView2.setText(String.format(string, new Object[]{sb.toString(), sb2.toString()}));
        } else if (group.getMaxAllowedOption() > 0) {
            textView2.setVisibility(0);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(group.getMaxAllowedOption());
            sb3.append(C3868i.f12248b);
            sb3.append(this.f32089a.getResources().getString(C10232R.string.lbl_option_max));
            textView2.setText(sb3.toString());
        } else if (group.getMinAllowedOption() > 0) {
            textView2.setVisibility(0);
            String string2 = this.f32089a.getResources().getString(C10232R.string.lbl_option_min);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append(group.getMinAllowedOption());
            textView2.setText(String.format(string2, new Object[]{sb4.toString()}));
        } else {
            textView2.setVisibility(8);
        }
        if (group.isValidationError()) {
            textView.setTextColor(C0841b.m4915a(this.f32089a, (int) C10232R.C10234color.red_lite_3));
            textView2.setTextColor(C0841b.m4915a(this.f32089a, (int) C10232R.C10234color.red_lite_3));
        } else {
            textView.setTextColor(C0841b.m4915a(this.f32089a, (int) C10232R.C10234color.shops_title_text_gray));
            textView2.setTextColor(C0841b.m4915a(this.f32089a, (int) C10232R.C10234color.search_text_gray));
        }
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }

    public MenuAddonsBean getGroup(int i) {
        return (MenuAddonsBean) this.f32090b.get(i);
    }

    /* renamed from: a */
    public void mo39479a(ArrayList<MenuAddonsBean> arrayList) {
        this.f32090b = arrayList;
    }
}
