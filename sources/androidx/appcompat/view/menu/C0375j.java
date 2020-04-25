package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p024e.p025b.C0887b;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.C0950b.C0952b;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.j */
/* compiled from: MenuItemImpl */
public final class C0375j implements C0887b {

    /* renamed from: Q */
    private static final String f1368Q = "MenuItemImpl";

    /* renamed from: R */
    private static final int f1369R = 3;

    /* renamed from: S */
    private static final int f1370S = 1;

    /* renamed from: T */
    private static final int f1371T = 2;

    /* renamed from: U */
    private static final int f1372U = 4;

    /* renamed from: V */
    private static final int f1373V = 8;

    /* renamed from: W */
    private static final int f1374W = 16;

    /* renamed from: X */
    private static final int f1375X = 32;

    /* renamed from: Y */
    static final int f1376Y = 0;

    /* renamed from: A */
    private Runnable f1377A;

    /* renamed from: B */
    private OnMenuItemClickListener f1378B;

    /* renamed from: C */
    private CharSequence f1379C;

    /* renamed from: D */
    private CharSequence f1380D;

    /* renamed from: E */
    private ColorStateList f1381E = null;

    /* renamed from: F */
    private Mode f1382F = null;

    /* renamed from: G */
    private boolean f1383G = false;

    /* renamed from: H */
    private boolean f1384H = false;

    /* renamed from: I */
    private boolean f1385I = false;

    /* renamed from: J */
    private int f1386J = 16;

    /* renamed from: K */
    private int f1387K = 0;

    /* renamed from: L */
    private View f1388L;

    /* renamed from: M */
    private C0950b f1389M;

    /* renamed from: N */
    private OnActionExpandListener f1390N;

    /* renamed from: O */
    private boolean f1391O = false;

    /* renamed from: P */
    private ContextMenuInfo f1392P;

    /* renamed from: l */
    private final int f1393l;

    /* renamed from: m */
    private final int f1394m;

    /* renamed from: n */
    private final int f1395n;

    /* renamed from: o */
    private final int f1396o;

    /* renamed from: p */
    private CharSequence f1397p;

    /* renamed from: q */
    private CharSequence f1398q;

    /* renamed from: r */
    private Intent f1399r;

    /* renamed from: s */
    private char f1400s;

    /* renamed from: t */
    private int f1401t = 4096;

    /* renamed from: u */
    private char f1402u;

    /* renamed from: v */
    private int f1403v = 4096;

    /* renamed from: w */
    private Drawable f1404w;

    /* renamed from: x */
    private int f1405x = 0;

    /* renamed from: y */
    C0370g f1406y;

    /* renamed from: z */
    private C0395s f1407z;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemImpl */
    class C0376a implements C0952b {
        C0376a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0375j jVar = C0375j.this;
            jVar.f1406y.mo1596d(jVar);
        }
    }

    C0375j(C0370g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1406y = gVar;
        this.f1393l = i2;
        this.f1394m = i;
        this.f1395n = i3;
        this.f1396o = i4;
        this.f1397p = charSequence;
        this.f1387K = i5;
    }

    /* renamed from: a */
    public MenuItem mo1639a(Runnable runnable) {
        this.f1377A = runnable;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1644b(boolean z) {
        int i = this.f1386J;
        this.f1386J = (z ? 2 : 0) | (i & -3);
        if (i != this.f1386J) {
            this.f1406y.mo1583b(false);
        }
    }

    /* renamed from: c */
    public void mo1645c(boolean z) {
        this.f1386J = (z ? 4 : 0) | (this.f1386J & -5);
    }

    public boolean collapseActionView() {
        if ((this.f1387K & 8) == 0) {
            return false;
        }
        if (this.f1388L == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f1390N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1406y.mo1569a(this);
        }
        return false;
    }

    /* renamed from: d */
    public void mo1646d() {
        this.f1406y.mo1588c(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Runnable mo1648e() {
        return this.f1377A;
    }

    public boolean expandActionView() {
        if (!mo1666i()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f1390N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1406y.mo1584b(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1650f() {
        return this.f1396o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public char mo1651g() {
        return this.f1406y.mo1619q() ? this.f1402u : this.f1400s;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1388L;
        if (view != null) {
            return view;
        }
        C0950b bVar = this.f1389M;
        if (bVar == null) {
            return null;
        }
        this.f1388L = bVar.mo1755a((MenuItem) this);
        return this.f1388L;
    }

    public int getAlphabeticModifiers() {
        return this.f1403v;
    }

    public char getAlphabeticShortcut() {
        return this.f1402u;
    }

    public CharSequence getContentDescription() {
        return this.f1379C;
    }

    public int getGroupId() {
        return this.f1394m;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1404w;
        if (drawable != null) {
            return m2132a(drawable);
        }
        if (this.f1405x == 0) {
            return null;
        }
        Drawable c = C0242a.m1109c(this.f1406y.mo1601f(), this.f1405x);
        this.f1405x = 0;
        this.f1404w = c;
        return m2132a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f1381E;
    }

    public Mode getIconTintMode() {
        return this.f1382F;
    }

    public Intent getIntent() {
        return this.f1399r;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f1393l;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f1392P;
    }

    public int getNumericModifiers() {
        return this.f1401t;
    }

    public char getNumericShortcut() {
        return this.f1400s;
    }

    public int getOrder() {
        return this.f1395n;
    }

    public SubMenu getSubMenu() {
        return this.f1407z;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1397p;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1398q;
        if (charSequence == null) {
            charSequence = this.f1397p;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f1380D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public String mo1664h() {
        char g = mo1651g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f1406y.mo1601f().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1406y.mo1601f()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0238R.string.abc_prepend_shortcut_label));
        }
        int i = this.f1406y.mo1619q() ? this.f1403v : this.f1401t;
        m2133a(sb, i, 65536, resources.getString(C0238R.string.abc_menu_meta_shortcut_label));
        m2133a(sb, i, 4096, resources.getString(C0238R.string.abc_menu_ctrl_shortcut_label));
        m2133a(sb, i, 2, resources.getString(C0238R.string.abc_menu_alt_shortcut_label));
        m2133a(sb, i, 1, resources.getString(C0238R.string.abc_menu_shift_shortcut_label));
        m2133a(sb, i, 4, resources.getString(C0238R.string.abc_menu_sym_shortcut_label));
        m2133a(sb, i, 8, resources.getString(C0238R.string.abc_menu_function_shortcut_label));
        if (g == 8) {
            sb.append(resources.getString(C0238R.string.abc_menu_delete_shortcut_label));
        } else if (g == 10) {
            sb.append(resources.getString(C0238R.string.abc_menu_enter_shortcut_label));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C0238R.string.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f1407z != null;
    }

    /* renamed from: i */
    public boolean mo1666i() {
        if ((this.f1387K & 8) == 0) {
            return false;
        }
        if (this.f1388L == null) {
            C0950b bVar = this.f1389M;
            if (bVar != null) {
                this.f1388L = bVar.mo1755a((MenuItem) this);
            }
        }
        if (this.f1388L != null) {
            return true;
        }
        return false;
    }

    public boolean isActionViewExpanded() {
        return this.f1391O;
    }

    public boolean isCheckable() {
        return (this.f1386J & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1386J & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1386J & 16) != 0;
    }

    public boolean isVisible() {
        C0950b bVar = this.f1389M;
        boolean z = true;
        if (bVar == null || !bVar.mo1758f()) {
            if ((this.f1386J & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f1386J & 8) != 0 || !this.f1389M.mo1757c()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo1671j() {
        OnMenuItemClickListener onMenuItemClickListener = this.f1378B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0370g gVar = this.f1406y;
        if (gVar.mo1568a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f1377A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1399r != null) {
            try {
                this.f1406y.mo1601f().startActivity(this.f1399r);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        C0950b bVar = this.f1389M;
        if (bVar == null || !bVar.mo1754e()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo1672k() {
        return (this.f1386J & 32) == 32;
    }

    /* renamed from: l */
    public boolean mo1673l() {
        return (this.f1386J & 4) != 0;
    }

    /* renamed from: m */
    public boolean mo1674m() {
        return (this.f1387K & 1) == 1;
    }

    /* renamed from: n */
    public boolean mo1675n() {
        return this.f1406y.mo1612l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo1676o() {
        return this.f1406y.mo1620r() && mo1651g() != 0;
    }

    /* renamed from: p */
    public boolean mo1677p() {
        return (this.f1387K & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1402u == c) {
            return this;
        }
        this.f1402u = Character.toLowerCase(c);
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1386J;
        this.f1386J = z | (i & true) ? 1 : 0;
        if (i != this.f1386J) {
            this.f1406y.mo1583b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1386J & 4) != 0) {
            this.f1406y.mo1560a((MenuItem) this);
        } else {
            mo1644b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1386J |= 16;
        } else {
            this.f1386J &= -17;
        }
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1405x = 0;
        this.f1404w = drawable;
        this.f1385I = true;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setIconTintList(@C0195i0 ColorStateList colorStateList) {
        this.f1381E = colorStateList;
        this.f1383G = true;
        this.f1385I = true;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f1382F = mode;
        this.f1384H = true;
        this.f1385I = true;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1399r = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1400s == c) {
            return this;
        }
        this.f1400s = c;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f1390N = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1378B = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1400s = c;
        this.f1402u = Character.toLowerCase(c2);
        this.f1406y.mo1583b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1387K = i;
            this.f1406y.mo1588c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1397p = charSequence;
        this.f1406y.mo1583b(false);
        C0395s sVar = this.f1407z;
        if (sVar != null) {
            sVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1398q = charSequence;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1649e(z)) {
            this.f1406y.mo1596d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f1397p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    private static void m2133a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: c */
    public boolean mo1425c() {
        return (this.f1387K & 2) == 2;
    }

    /* renamed from: d */
    public void mo1647d(boolean z) {
        if (z) {
            this.f1386J |= 32;
        } else {
            this.f1386J &= -33;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo1649e(boolean z) {
        int i = this.f1386J;
        this.f1386J = (z ? 0 : 8) | (i & -9);
        if (i != this.f1386J) {
            return true;
        }
        return false;
    }

    public C0887b setContentDescription(CharSequence charSequence) {
        this.f1379C = charSequence;
        this.f1406y.mo1583b(false);
        return this;
    }

    public C0887b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public C0887b setTooltipText(CharSequence charSequence) {
        this.f1380D = charSequence;
        this.f1406y.mo1583b(false);
        return this;
    }

    /* renamed from: a */
    public void mo1642a(C0395s sVar) {
        this.f1407z = sVar;
        sVar.setHeaderTitle(getTitle());
    }

    public C0887b setActionView(View view) {
        this.f1388L = view;
        this.f1389M = null;
        if (view != null && view.getId() == -1) {
            int i = this.f1393l;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f1406y.mo1588c(this);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1402u == c && this.f1403v == i) {
            return this;
        }
        this.f1402u = Character.toLowerCase(c);
        this.f1403v = KeyEvent.normalizeMetaState(i);
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1400s == c && this.f1401t == i) {
            return this;
        }
        this.f1400s = c;
        this.f1401t = KeyEvent.normalizeMetaState(i);
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1400s = c;
        this.f1401t = KeyEvent.normalizeMetaState(i);
        this.f1402u = Character.toLowerCase(c2);
        this.f1403v = KeyEvent.normalizeMetaState(i2);
        this.f1406y.mo1583b(false);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo1640a(C0389a aVar) {
        if (aVar == null || !aVar.mo1389a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    /* renamed from: b */
    public boolean mo1424b() {
        return !mo1425c() && !mo1674m();
    }

    public MenuItem setIcon(int i) {
        this.f1404w = null;
        this.f1405x = i;
        this.f1385I = true;
        this.f1406y.mo1583b(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1406y.mo1601f().getString(i));
    }

    /* renamed from: a */
    private Drawable m2132a(Drawable drawable) {
        if (drawable != null && this.f1385I && (this.f1383G || this.f1384H)) {
            drawable = C0892a.m5161i(drawable).mutate();
            if (this.f1383G) {
                C0892a.m5146a(drawable, this.f1381E);
            }
            if (this.f1384H) {
                C0892a.m5149a(drawable, this.f1382F);
            }
            this.f1385I = false;
        }
        return drawable;
    }

    public C0887b setActionView(int i) {
        Context f = this.f1406y.mo1601f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1641a(ContextMenuInfo contextMenuInfo) {
        this.f1392P = contextMenuInfo;
    }

    /* renamed from: a */
    public C0950b mo1423a() {
        return this.f1389M;
    }

    /* renamed from: a */
    public C0887b mo1422a(C0950b bVar) {
        C0950b bVar2 = this.f1389M;
        if (bVar2 != null) {
            bVar2.mo4768h();
        }
        this.f1388L = null;
        this.f1389M = bVar;
        this.f1406y.mo1583b(true);
        C0950b bVar3 = this.f1389M;
        if (bVar3 != null) {
            bVar3.mo1756a((C0952b) new C0376a());
        }
        return this;
    }

    /* renamed from: a */
    public void mo1643a(boolean z) {
        this.f1391O = z;
        this.f1406y.mo1583b(false);
    }
}
