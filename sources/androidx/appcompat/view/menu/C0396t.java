package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p024e.p025b.C0888c;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.t */
/* compiled from: SubMenuWrapperICS */
class C0396t extends C0390p implements SubMenu {

    /* renamed from: p */
    private final C0888c f1462p;

    C0396t(Context context, C0888c cVar) {
        super(context, cVar);
        this.f1462p = cVar;
    }

    public void clearHeader() {
        this.f1462p.clearHeader();
    }

    public MenuItem getItem() {
        return mo1499a(this.f1462p.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f1462p.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f1462p.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f1462p.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f1462p.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1462p.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1462p.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1462p.setIcon(drawable);
        return this;
    }
}
