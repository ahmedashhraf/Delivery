package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p024e.p025b.C0887b;
import androidx.core.p034l.C0950b;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0357a implements C0887b {

    /* renamed from: H */
    private static final int f1231H = 0;

    /* renamed from: I */
    private static final int f1232I = 1;

    /* renamed from: J */
    private static final int f1233J = 2;

    /* renamed from: K */
    private static final int f1234K = 4;

    /* renamed from: L */
    private static final int f1235L = 8;

    /* renamed from: M */
    private static final int f1236M = 16;

    /* renamed from: A */
    private CharSequence f1237A;

    /* renamed from: B */
    private CharSequence f1238B;

    /* renamed from: C */
    private ColorStateList f1239C = null;

    /* renamed from: D */
    private Mode f1240D = null;

    /* renamed from: E */
    private boolean f1241E = false;

    /* renamed from: F */
    private boolean f1242F = false;

    /* renamed from: G */
    private int f1243G = 16;

    /* renamed from: l */
    private final int f1244l;

    /* renamed from: m */
    private final int f1245m;

    /* renamed from: n */
    private final int f1246n;

    /* renamed from: o */
    private final int f1247o;

    /* renamed from: p */
    private CharSequence f1248p;

    /* renamed from: q */
    private CharSequence f1249q;

    /* renamed from: r */
    private Intent f1250r;

    /* renamed from: s */
    private char f1251s;

    /* renamed from: t */
    private int f1252t = 4096;

    /* renamed from: u */
    private char f1253u;

    /* renamed from: v */
    private int f1254v = 4096;

    /* renamed from: w */
    private Drawable f1255w;

    /* renamed from: x */
    private int f1256x = 0;

    /* renamed from: y */
    private Context f1257y;

    /* renamed from: z */
    private OnMenuItemClickListener f1258z;

    public C0357a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1257y = context;
        this.f1244l = i2;
        this.f1245m = i;
        this.f1246n = i3;
        this.f1247o = i4;
        this.f1248p = charSequence;
    }

    /* renamed from: e */
    private void m1978e() {
        if (this.f1255w == null) {
            return;
        }
        if (this.f1241E || this.f1242F) {
            this.f1255w = C0892a.m5161i(this.f1255w);
            this.f1255w = this.f1255w.mutate();
            if (this.f1241E) {
                C0892a.m5146a(this.f1255w, this.f1239C);
            }
            if (this.f1242F) {
                C0892a.m5149a(this.f1255w, this.f1240D);
            }
        }
    }

    /* renamed from: a */
    public C0357a mo1421a(boolean z) {
        this.f1243G = (z ? 4 : 0) | (this.f1243G & -5);
        return this;
    }

    /* renamed from: a */
    public C0950b mo1423a() {
        return null;
    }

    /* renamed from: b */
    public boolean mo1424b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1425c() {
        return true;
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public boolean mo1427d() {
        OnMenuItemClickListener onMenuItemClickListener = this.f1258z;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        Intent intent = this.f1250r;
        if (intent == null) {
            return false;
        }
        this.f1257y.startActivity(intent);
        return true;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1254v;
    }

    public char getAlphabeticShortcut() {
        return this.f1253u;
    }

    public CharSequence getContentDescription() {
        return this.f1237A;
    }

    public int getGroupId() {
        return this.f1245m;
    }

    public Drawable getIcon() {
        return this.f1255w;
    }

    public ColorStateList getIconTintList() {
        return this.f1239C;
    }

    public Mode getIconTintMode() {
        return this.f1240D;
    }

    public Intent getIntent() {
        return this.f1250r;
    }

    public int getItemId() {
        return this.f1244l;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1252t;
    }

    public char getNumericShortcut() {
        return this.f1251s;
    }

    public int getOrder() {
        return this.f1247o;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1248p;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1249q;
        return charSequence != null ? charSequence : this.f1248p;
    }

    public CharSequence getTooltipText() {
        return this.f1238B;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1243G & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1243G & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1243G & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1243G & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1253u = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1243G = z | (this.f1243G & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1243G = (z ? 2 : 0) | (this.f1243G & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1243G = (z ? 16 : 0) | (this.f1243G & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1255w = drawable;
        this.f1256x = 0;
        m1978e();
        return this;
    }

    public MenuItem setIconTintList(@C0195i0 ColorStateList colorStateList) {
        this.f1239C = colorStateList;
        this.f1241E = true;
        m1978e();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f1240D = mode;
        this.f1242F = true;
        m1978e();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1250r = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1251s = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1258z = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1251s = c;
        this.f1253u = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1248p = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1249q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1243G & 8;
        if (z) {
            i = 0;
        }
        this.f1243G = i2 | i;
        return this;
    }

    /* renamed from: a */
    public C0887b mo1422a(C0950b bVar) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1253u = Character.toLowerCase(c);
        this.f1254v = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C0887b setContentDescription(CharSequence charSequence) {
        this.f1237A = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1251s = c;
        this.f1252t = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C0887b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1248p = this.f1257y.getResources().getString(i);
        return this;
    }

    public C0887b setTooltipText(CharSequence charSequence) {
        this.f1238B = charSequence;
        return this;
    }

    public C0887b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1251s = c;
        this.f1252t = KeyEvent.normalizeMetaState(i);
        this.f1253u = Character.toLowerCase(c2);
        this.f1254v = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C0887b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setIcon(int i) {
        this.f1256x = i;
        this.f1255w = C0841b.m4928c(this.f1257y, i);
        m1978e();
        return this;
    }
}
