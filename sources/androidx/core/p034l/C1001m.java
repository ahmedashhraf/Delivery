package androidx.core.p034l;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.p024e.p025b.C0886a;

/* renamed from: androidx.core.l.m */
/* compiled from: MenuCompat */
public final class C1001m {
    private C1001m() {
    }

    @Deprecated
    /* renamed from: a */
    public static void m5730a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m5729a(Menu menu, boolean z) {
        if (menu instanceof C0886a) {
            ((C0886a) menu).setGroupDividerEnabled(z);
        } else if (VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(z);
        }
    }
}
