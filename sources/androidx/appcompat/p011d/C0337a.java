package androidx.appcompat.p011d;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.view.ViewConfiguration;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.d.a */
/* compiled from: ActionBarPolicy */
public class C0337a {

    /* renamed from: a */
    private Context f1110a;

    private C0337a(Context context) {
        this.f1110a = context;
    }

    /* renamed from: a */
    public static C0337a m1868a(Context context) {
        return new C0337a(context);
    }

    /* renamed from: b */
    public int mo1312b() {
        return this.f1110a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    /* renamed from: c */
    public int mo1313c() {
        Configuration configuration = this.f1110a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600 || ((i > 960 && i2 > 720) || (i > 720 && i2 > 960))) {
            return 5;
        }
        if (i >= 500 || ((i > 640 && i2 > 480) || (i > 480 && i2 > 640))) {
            return 4;
        }
        return i >= 360 ? 3 : 2;
    }

    /* renamed from: d */
    public int mo1314d() {
        return this.f1110a.getResources().getDimensionPixelSize(C0238R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    /* renamed from: e */
    public int mo1315e() {
        TypedArray obtainStyledAttributes = this.f1110a.obtainStyledAttributes(null, C0238R.styleable.ActionBar, C0238R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C0238R.styleable.ActionBar_height, 0);
        Resources resources = this.f1110a.getResources();
        if (!mo1316f()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C0238R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    /* renamed from: f */
    public boolean mo1316f() {
        return this.f1110a.getResources().getBoolean(C0238R.bool.abc_action_bar_embed_tabs);
    }

    /* renamed from: g */
    public boolean mo1317g() {
        if (VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f1110a).hasPermanentMenuKey();
    }

    /* renamed from: a */
    public boolean mo1311a() {
        return this.f1110a.getApplicationInfo().targetSdkVersion < 14;
    }
}
