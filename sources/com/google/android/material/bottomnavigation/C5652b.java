package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.bottomnavigation.b */
/* compiled from: BottomNavigationMenu */
public final class C5652b extends C0370g {

    /* renamed from: R */
    public static final int f16219R = 5;

    public C5652b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1552a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo1630t();
            MenuItem a = super.mo1552a(i, i2, i3, charSequence);
            if (a instanceof C0375j) {
                ((C0375j) a).mo1645c(true);
            }
            mo1623s();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @C0193h0
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
