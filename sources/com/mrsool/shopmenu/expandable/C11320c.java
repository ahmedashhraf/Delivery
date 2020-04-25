package com.mrsool.shopmenu.expandable;

import com.bignerdranch.expandablerecyclerview.p152e.C2934b;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import java.util.List;

/* renamed from: com.mrsool.shopmenu.expandable.c */
/* compiled from: MenuExpandItem */
public class C11320c implements C2934b<MenuItemBean> {

    /* renamed from: a */
    private List<MenuItemBean> f31693a;

    /* renamed from: b */
    private MenuCategoryBean f31694b;

    public C11320c(MenuCategoryBean menuCategoryBean, List<MenuItemBean> list) {
        this.f31693a = list;
        this.f31694b = menuCategoryBean;
    }

    /* renamed from: a */
    public List<MenuItemBean> mo11675a() {
        return this.f31693a;
    }

    /* renamed from: b */
    public boolean mo11676b() {
        return true;
    }

    /* renamed from: c */
    public MenuCategoryBean mo39388c() {
        return this.f31694b;
    }
}
