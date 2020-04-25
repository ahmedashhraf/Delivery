package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p011d.C0340c;
import androidx.core.p024e.p025b.C0887b;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.C0950b.C0952b;
import java.lang.reflect.Method;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.k */
/* compiled from: MenuItemWrapperICS */
public class C0377k extends C0359c implements MenuItem {

    /* renamed from: q */
    static final String f1409q = "MenuItemWrapper";

    /* renamed from: o */
    private final C0887b f1410o;

    /* renamed from: p */
    private Method f1411p;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0378a extends C0950b {

        /* renamed from: e */
        final ActionProvider f1412e;

        C0378a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1412e = actionProvider;
        }

        /* renamed from: a */
        public void mo1751a(SubMenu subMenu) {
            this.f1412e.onPrepareSubMenu(C0377k.this.mo1500a(subMenu));
        }

        /* renamed from: b */
        public boolean mo1752b() {
            return this.f1412e.hasSubMenu();
        }

        /* renamed from: d */
        public View mo1753d() {
            return this.f1412e.onCreateActionView();
        }

        /* renamed from: e */
        public boolean mo1754e() {
            return this.f1412e.onPerformDefaultAction();
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.appcompat.view.menu.k$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0379b extends C0378a implements VisibilityListener {

        /* renamed from: g */
        private C0952b f1414g;

        C0379b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo1755a(MenuItem menuItem) {
            return this.f1412e.onCreateActionView(menuItem);
        }

        /* renamed from: c */
        public boolean mo1757c() {
            return this.f1412e.isVisible();
        }

        /* renamed from: f */
        public boolean mo1758f() {
            return this.f1412e.overridesItemVisibility();
        }

        /* renamed from: g */
        public void mo1759g() {
            this.f1412e.refreshVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0952b bVar = this.f1414g;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        /* renamed from: a */
        public void mo1756a(C0952b bVar) {
            this.f1414g = bVar;
            this.f1412e.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0380c extends FrameLayout implements C0340c {

        /* renamed from: a */
        final CollapsibleActionView f1416a;

        C0380c(View view) {
            super(view.getContext());
            this.f1416a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo1761a() {
            return (View) this.f1416a;
        }

        /* renamed from: c */
        public void mo1322c() {
            this.f1416a.onActionViewExpanded();
        }

        /* renamed from: d */
        public void mo1323d() {
            this.f1416a.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0381d implements OnActionExpandListener {

        /* renamed from: a */
        private final OnActionExpandListener f1417a;

        C0381d(OnActionExpandListener onActionExpandListener) {
            this.f1417a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1417a.onMenuItemActionCollapse(C0377k.this.mo1499a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1417a.onMenuItemActionExpand(C0377k.this.mo1499a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0382e implements OnMenuItemClickListener {

        /* renamed from: a */
        private final OnMenuItemClickListener f1419a;

        C0382e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f1419a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1419a.onMenuItemClick(C0377k.this.mo1499a(menuItem));
        }
    }

    public C0377k(Context context, C0887b bVar) {
        super(context);
        if (bVar != null) {
            this.f1410o = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo1696a(boolean z) {
        try {
            if (this.f1411p == null) {
                this.f1411p = this.f1410o.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1411p.invoke(this.f1410o, new Object[]{Boolean.valueOf(z)});
        } catch (Exception unused) {
        }
    }

    public boolean collapseActionView() {
        return this.f1410o.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1410o.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0950b a = this.f1410o.mo1423a();
        if (a instanceof C0378a) {
            return ((C0378a) a).f1412e;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1410o.getActionView();
        return actionView instanceof C0380c ? ((C0380c) actionView).mo1761a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1410o.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1410o.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1410o.getContentDescription();
    }

    public int getGroupId() {
        return this.f1410o.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1410o.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1410o.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f1410o.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1410o.getIntent();
    }

    public int getItemId() {
        return this.f1410o.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f1410o.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1410o.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1410o.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1410o.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo1500a(this.f1410o.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1410o.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1410o.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1410o.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f1410o.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1410o.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1410o.isCheckable();
    }

    public boolean isChecked() {
        return this.f1410o.isChecked();
    }

    public boolean isEnabled() {
        return this.f1410o.isEnabled();
    }

    public boolean isVisible() {
        return this.f1410o.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0950b bVar;
        if (VERSION.SDK_INT >= 16) {
            bVar = new C0379b(this.f1269l, actionProvider);
        } else {
            bVar = new C0378a(this.f1269l, actionProvider);
        }
        C0887b bVar2 = this.f1410o;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo1422a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0380c(view);
        }
        this.f1410o.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1410o.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1410o.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1410o.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1410o.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1410o.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1410o.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1410o.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f1410o.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1410o.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1410o.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f1410o.setOnActionExpandListener(onActionExpandListener != null ? new C0381d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1410o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0382e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1410o.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1410o.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1410o.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1410o.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1410o.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1410o.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1410o.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1410o.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1410o.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1410o.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1410o.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1410o.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1410o.setActionView(i);
        View actionView = this.f1410o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1410o.setActionView((View) new C0380c(actionView));
        }
        return this;
    }
}
