package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g.C0371a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.s */
/* compiled from: SubMenuBuilder */
public class C0395s extends C0370g implements SubMenu {

    /* renamed from: R */
    private C0370g f1460R;

    /* renamed from: S */
    private C0375j f1461S;

    public C0395s(Context context, C0370g gVar, C0375j jVar) {
        super(context);
        this.f1460R = gVar;
        this.f1461S = jVar;
    }

    /* renamed from: a */
    public void mo1561a(C0371a aVar) {
        this.f1460R.mo1561a(aVar);
    }

    /* renamed from: b */
    public boolean mo1584b(C0375j jVar) {
        return this.f1460R.mo1584b(jVar);
    }

    /* renamed from: e */
    public void mo1600e(boolean z) {
        this.f1460R.mo1600e(z);
    }

    public MenuItem getItem() {
        return this.f1461S;
    }

    /* renamed from: n */
    public C0370g mo1614n() {
        return this.f1460R.mo1614n();
    }

    /* renamed from: p */
    public boolean mo1616p() {
        return this.f1460R.mo1616p();
    }

    /* renamed from: q */
    public boolean mo1619q() {
        return this.f1460R.mo1619q();
    }

    /* renamed from: r */
    public boolean mo1620r() {
        return this.f1460R.mo1620r();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1460R.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo1553a(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1555a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1554a(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1461S.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1460R.setQwertyMode(z);
    }

    /* renamed from: u */
    public Menu mo1820u() {
        return this.f1460R;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1568a(C0370g gVar, MenuItem menuItem) {
        return super.mo1568a(gVar, menuItem) || this.f1460R.mo1568a(gVar, menuItem);
    }

    /* renamed from: e */
    public String mo1599e() {
        C0375j jVar = this.f1461S;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo1599e());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo1598e(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1602f(i);
    }

    public SubMenu setIcon(int i) {
        this.f1461S.setIcon(i);
        return this;
    }

    /* renamed from: a */
    public boolean mo1569a(C0375j jVar) {
        return this.f1460R.mo1569a(jVar);
    }
}
