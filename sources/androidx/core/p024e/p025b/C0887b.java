package androidx.core.p024e.p025b;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0950b;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.e.b.b */
/* compiled from: SupportMenuItem */
public interface C0887b extends MenuItem {

    /* renamed from: g */
    public static final int f4063g = 0;

    /* renamed from: h */
    public static final int f4064h = 1;

    /* renamed from: i */
    public static final int f4065i = 2;

    /* renamed from: j */
    public static final int f4066j = 4;

    /* renamed from: k */
    public static final int f4067k = 8;

    /* renamed from: a */
    C0887b mo1422a(C0950b bVar);

    /* renamed from: a */
    C0950b mo1423a();

    /* renamed from: b */
    boolean mo1424b();

    /* renamed from: c */
    boolean mo1425c();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    C0887b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    C0887b setTooltipText(CharSequence charSequence);
}
