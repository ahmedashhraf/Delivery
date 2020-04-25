package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.widget.C0475c.C0481f;
import androidx.core.p034l.C0950b;

/* renamed from: androidx.appcompat.widget.m0 */
/* compiled from: ShareActionProvider */
public class C0530m0 extends C0950b {

    /* renamed from: k */
    private static final int f2113k = 4;

    /* renamed from: l */
    public static final String f2114l = "share_history.xml";

    /* renamed from: e */
    private int f2115e = 4;

    /* renamed from: f */
    private final C0533c f2116f = new C0533c();

    /* renamed from: g */
    final Context f2117g;

    /* renamed from: h */
    String f2118h = f2114l;

    /* renamed from: i */
    C0531a f2119i;

    /* renamed from: j */
    private C0481f f2120j;

    /* renamed from: androidx.appcompat.widget.m0$a */
    /* compiled from: ShareActionProvider */
    public interface C0531a {
        /* renamed from: a */
        boolean mo2805a(C0530m0 m0Var, Intent intent);
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    /* compiled from: ShareActionProvider */
    private class C0532b implements C0481f {
        C0532b() {
        }

        /* renamed from: a */
        public boolean mo2512a(C0475c cVar, Intent intent) {
            C0530m0 m0Var = C0530m0.this;
            C0531a aVar = m0Var.f2119i;
            if (aVar != null) {
                aVar.mo2805a(m0Var, intent);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    /* compiled from: ShareActionProvider */
    private class C0533c implements OnMenuItemClickListener {
        C0533c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0530m0 m0Var = C0530m0.this;
            Intent a = C0475c.m2615a(m0Var.f2117g, m0Var.f2118h).mo2492a(menuItem.getItemId());
            if (a != null) {
                String action = a.getAction();
                if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                    C0530m0.this.mo2804b(a);
                }
                C0530m0.this.f2117g.startActivity(a);
            }
            return true;
        }
    }

    public C0530m0(Context context) {
        super(context);
        this.f2117g = context;
    }

    /* renamed from: i */
    private void m2843i() {
        if (this.f2119i != null) {
            if (this.f2120j == null) {
                this.f2120j = new C0532b();
            }
            C0475c.m2615a(this.f2117g, this.f2118h).mo2495a(this.f2120j);
        }
    }

    /* renamed from: a */
    public void mo2802a(C0531a aVar) {
        this.f2119i = aVar;
        m2843i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2804b(Intent intent) {
        if (VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }

    /* renamed from: b */
    public boolean mo1752b() {
        return true;
    }

    /* renamed from: d */
    public View mo1753d() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f2117g);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C0475c.m2615a(this.f2117g, this.f2118h));
        }
        TypedValue typedValue = new TypedValue();
        this.f2117g.getTheme().resolveAttribute(C0238R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C0242a.m1109c(this.f2117g, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C0238R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C0238R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    /* renamed from: a */
    public void mo1751a(SubMenu subMenu) {
        subMenu.clear();
        C0475c a = C0475c.m2615a(this.f2117g, this.f2118h);
        PackageManager packageManager = this.f2117g.getPackageManager();
        int a2 = a.mo2490a();
        int min = Math.min(a2, this.f2115e);
        for (int i = 0; i < min; i++) {
            ResolveInfo b = a.mo2497b(i);
            subMenu.add(0, i, i, b.loadLabel(packageManager)).setIcon(b.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2116f);
        }
        if (min < a2) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f2117g.getString(C0238R.string.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < a2; i2++) {
                ResolveInfo b2 = a.mo2497b(i2);
                addSubMenu.add(0, i2, i2, b2.loadLabel(packageManager)).setIcon(b2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f2116f);
            }
        }
    }

    /* renamed from: a */
    public void mo2803a(String str) {
        this.f2118h = str;
        m2843i();
    }

    /* renamed from: a */
    public void mo2801a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                mo2804b(intent);
            }
        }
        C0475c.m2615a(this.f2117g, this.f2118h).mo2493a(intent);
    }
}
