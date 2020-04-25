package androidx.core.p034l;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.View;
import androidx.core.p024e.p025b.C0887b;

/* renamed from: androidx.core.l.n */
/* compiled from: MenuItemCompat */
public final class C1003n {

    /* renamed from: a */
    private static final String f4446a = "MenuItemCompat";
    @Deprecated

    /* renamed from: b */
    public static final int f4447b = 0;
    @Deprecated

    /* renamed from: c */
    public static final int f4448c = 1;
    @Deprecated

    /* renamed from: d */
    public static final int f4449d = 2;
    @Deprecated

    /* renamed from: e */
    public static final int f4450e = 4;
    @Deprecated

    /* renamed from: f */
    public static final int f4451f = 8;

    /* renamed from: androidx.core.l.n$a */
    /* compiled from: MenuItemCompat */
    static class C1004a implements OnActionExpandListener {

        /* renamed from: a */
        final /* synthetic */ C1005b f4452a;

        C1004a(C1005b bVar) {
            this.f4452a = bVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f4452a.onMenuItemActionCollapse(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f4452a.onMenuItemActionExpand(menuItem);
        }
    }

    @Deprecated
    /* renamed from: androidx.core.l.n$b */
    /* compiled from: MenuItemCompat */
    public interface C1005b {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    private C1003n() {
    }

    @Deprecated
    /* renamed from: a */
    public static MenuItem m5733a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    @Deprecated
    /* renamed from: b */
    public static void m5743b(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: c */
    public static C0950b m5746c(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).mo1423a();
        }
        return null;
    }

    @Deprecated
    /* renamed from: d */
    public static View m5747d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: e */
    public static int m5748e(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getAlphabeticModifiers();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }

    /* renamed from: f */
    public static CharSequence m5749f(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getContentDescription();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }

    /* renamed from: g */
    public static ColorStateList m5750g(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getIconTintList();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }

    /* renamed from: h */
    public static Mode m5751h(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getIconTintMode();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }

    /* renamed from: i */
    public static int m5752i(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getNumericModifiers();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }

    /* renamed from: j */
    public static CharSequence m5753j(MenuItem menuItem) {
        if (menuItem instanceof C0887b) {
            return ((C0887b) menuItem).getTooltipText();
        }
        if (VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }

    @Deprecated
    /* renamed from: k */
    public static boolean m5754k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Deprecated
    /* renamed from: a */
    public static MenuItem m5732a(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m5745b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    /* renamed from: a */
    public static MenuItem m5734a(MenuItem menuItem, C0950b bVar) {
        return menuItem instanceof C0887b ? ((C0887b) menuItem).mo1422a(bVar) : menuItem;
    }

    /* renamed from: b */
    public static void m5744b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m5741a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    /* renamed from: a */
    public static MenuItem m5735a(MenuItem menuItem, C1005b bVar) {
        return menuItem.setOnActionExpandListener(new C1004a(bVar));
    }

    /* renamed from: a */
    public static void m5740a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m5742b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m5736a(MenuItem menuItem, char c, char c2, int i, int i2) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setShortcut(c, c2, i, i2);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setShortcut(c, c2, i, i2);
        }
    }

    /* renamed from: a */
    public static void m5737a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m5738a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m5739a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof C0887b) {
            ((C0887b) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
