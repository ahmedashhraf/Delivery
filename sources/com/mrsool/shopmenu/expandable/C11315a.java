package com.mrsool.shopmenu.expandable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import com.bignerdranch.expandablerecyclerview.C2928c;
import com.mrsool.C10232R;
import com.mrsool.shopmenu.bean.MenuItemBean;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.shopmenu.expandable.a */
/* compiled from: ExpandableMenuItemAdapterNew */
public class C11315a extends C2928c<C11320c, MenuItemBean, C11369f, C11316b> {

    /* renamed from: n */
    private LayoutInflater f31669n;

    public C11315a(Context context, List<C11320c> list) {
        super(list);
        this.f31669n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @C0193h0
    /* renamed from: c */
    public C11316b m51203c(@C0193h0 ViewGroup viewGroup, int i) {
        return new C11316b(this.f31669n.inflate(C10232R.layout.row_menu_child, viewGroup, false));
    }

    @C0193h0
    /* renamed from: d */
    public C11369f m51205d(@C0193h0 ViewGroup viewGroup, int i) {
        return new C11369f(this.f31669n.inflate(C10232R.layout.row_menu_category_parent, viewGroup, false));
    }

    /* renamed from: a */
    public void mo11616a(@C0193h0 C11369f fVar, int i, @C0193h0 C11320c cVar) {
        fVar.mo39419a(((C11320c) mo11633h().get(i)).mo39388c(), fVar.mo11658H(), i);
    }

    /* renamed from: a */
    public void mo11614a(@C0193h0 C11316b bVar, int i, int i2, @C0193h0 MenuItemBean menuItemBean) {
        bVar.mo39384a((MenuItemBean) ((C11320c) mo11633h().get(i)).mo11675a().get(i2), i, m51197a(((C11320c) mo11633h().get(i)).mo39388c().getArrayListMenuItems(), i2));
    }

    /* renamed from: a */
    private int m51197a(ArrayList<MenuItemBean> arrayList, int i) {
        if (arrayList == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((MenuItemBean) arrayList.get(i3)).getChildPosition() == i) {
                i2 += ((MenuItemBean) arrayList.get(i3)).getOrderCount();
            }
        }
        return i2;
    }
}
