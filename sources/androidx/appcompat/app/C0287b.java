package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0214q0;
import androidx.appcompat.p008b.p009a.C0332d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p034l.C0984g;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout.C1311d;

/* renamed from: androidx.appcompat.app.b */
/* compiled from: ActionBarDrawerToggle */
public class C0287b implements C1311d {

    /* renamed from: a */
    private final C0289b f868a;

    /* renamed from: b */
    private final DrawerLayout f869b;

    /* renamed from: c */
    private C0332d f870c;

    /* renamed from: d */
    private boolean f871d;

    /* renamed from: e */
    private Drawable f872e;

    /* renamed from: f */
    boolean f873f;

    /* renamed from: g */
    private boolean f874g;

    /* renamed from: h */
    private final int f875h;

    /* renamed from: i */
    private final int f876i;

    /* renamed from: j */
    OnClickListener f877j;

    /* renamed from: k */
    private boolean f878k;

    /* renamed from: androidx.appcompat.app.b$a */
    /* compiled from: ActionBarDrawerToggle */
    class C0288a implements OnClickListener {
        C0288a() {
        }

        public void onClick(View view) {
            C0287b bVar = C0287b.this;
            if (bVar.f873f) {
                bVar.mo1034g();
                return;
            }
            OnClickListener onClickListener = bVar.f877j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0289b {
        /* renamed from: a */
        Drawable mo867a();

        /* renamed from: a */
        void mo868a(@C0214q0 int i);

        /* renamed from: a */
        void mo869a(Drawable drawable, @C0214q0 int i);

        /* renamed from: b */
        boolean mo870b();

        /* renamed from: c */
        Context mo871c();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0290c {
        @C0195i0
        C0289b getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.b$d */
    /* compiled from: ActionBarDrawerToggle */
    private static class C0291d implements C0289b {

        /* renamed from: a */
        private final Activity f880a;

        /* renamed from: b */
        private C0294a f881b;

        C0291d(Activity activity) {
            this.f880a = activity;
        }

        /* renamed from: a */
        public Drawable mo867a() {
            if (VERSION.SDK_INT < 18) {
                return C0293c.m1467a(this.f880a);
            }
            TypedArray obtainStyledAttributes = mo871c().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: b */
        public boolean mo870b() {
            ActionBar actionBar = this.f880a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        /* renamed from: c */
        public Context mo871c() {
            ActionBar actionBar = this.f880a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f880a;
        }

        /* renamed from: a */
        public void mo869a(Drawable drawable, int i) {
            ActionBar actionBar = this.f880a.getActionBar();
            if (actionBar == null) {
                return;
            }
            if (VERSION.SDK_INT >= 18) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
                return;
            }
            actionBar.setDisplayShowHomeEnabled(true);
            this.f881b = C0293c.m1468a(this.f880a, drawable, i);
            actionBar.setDisplayShowHomeEnabled(false);
        }

        /* renamed from: a */
        public void mo868a(int i) {
            if (VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f880a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f881b = C0293c.m1469a(this.f881b, this.f880a, i);
        }
    }

    /* renamed from: androidx.appcompat.app.b$e */
    /* compiled from: ActionBarDrawerToggle */
    static class C0292e implements C0289b {

        /* renamed from: a */
        final Toolbar f882a;

        /* renamed from: b */
        final Drawable f883b;

        /* renamed from: c */
        final CharSequence f884c;

        C0292e(Toolbar toolbar) {
            this.f882a = toolbar;
            this.f883b = toolbar.getNavigationIcon();
            this.f884c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public void mo869a(Drawable drawable, @C0214q0 int i) {
            this.f882a.setNavigationIcon(drawable);
            mo868a(i);
        }

        /* renamed from: b */
        public boolean mo870b() {
            return true;
        }

        /* renamed from: c */
        public Context mo871c() {
            return this.f882a.getContext();
        }

        /* renamed from: a */
        public void mo868a(@C0214q0 int i) {
            if (i == 0) {
                this.f882a.setNavigationContentDescription(this.f884c);
            } else {
                this.f882a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: a */
        public Drawable mo867a() {
            return this.f883b;
        }
    }

    public C0287b(Activity activity, DrawerLayout drawerLayout, @C0214q0 int i, @C0214q0 int i2) {
        this(activity, null, drawerLayout, null, i, i2);
    }

    /* renamed from: a */
    public void mo1015a(int i) {
    }

    /* renamed from: a */
    public void mo1016a(Configuration configuration) {
        if (!this.f874g) {
            this.f872e = mo1025b();
        }
        mo1033f();
    }

    /* renamed from: b */
    public void mo1028b(boolean z) {
        this.f871d = z;
        if (!z) {
            m1430a(0.0f);
        }
    }

    /* renamed from: c */
    public void mo1030c(int i) {
        mo1017a(i != 0 ? this.f869b.getResources().getDrawable(i) : null);
    }

    /* renamed from: d */
    public boolean mo1031d() {
        return this.f873f;
    }

    /* renamed from: e */
    public boolean mo1032e() {
        return this.f871d;
    }

    /* renamed from: f */
    public void mo1033f() {
        if (this.f869b.mo5748e((int) C0984g.f4394b)) {
            m1430a(1.0f);
        } else {
            m1430a(0.0f);
        }
        if (this.f873f) {
            mo1018a((Drawable) this.f870c, this.f869b.mo5748e((int) C0984g.f4394b) ? this.f876i : this.f875h);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo1034g() {
        int c = this.f869b.mo5736c((int) C0984g.f4394b);
        if (this.f869b.mo5750f((int) C0984g.f4394b) && c != 2) {
            this.f869b.mo5712a((int) C0984g.f4394b);
        } else if (c != 1) {
            this.f869b.mo5751g((int) C0984g.f4394b);
        }
    }

    public C0287b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, @C0214q0 int i, @C0214q0 int i2) {
        this(activity, toolbar, drawerLayout, null, i, i2);
    }

    C0287b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C0332d dVar, @C0214q0 int i, @C0214q0 int i2) {
        this.f871d = true;
        this.f873f = true;
        this.f878k = false;
        if (toolbar != null) {
            this.f868a = new C0292e(toolbar);
            toolbar.setNavigationOnClickListener(new C0288a());
        } else if (activity instanceof C0290c) {
            this.f868a = ((C0290c) activity).getDrawerToggleDelegate();
        } else {
            this.f868a = new C0291d(activity);
        }
        this.f869b = drawerLayout;
        this.f875h = i;
        this.f876i = i2;
        if (dVar == null) {
            this.f870c = new C0332d(this.f868a.mo871c());
        } else {
            this.f870c = dVar;
        }
        this.f872e = mo1025b();
    }

    /* renamed from: b */
    public void mo1027b(View view) {
        m1430a(0.0f);
        if (this.f873f) {
            mo1026b(this.f875h);
        }
    }

    /* renamed from: c */
    public OnClickListener mo1029c() {
        return this.f877j;
    }

    /* renamed from: a */
    public boolean mo1024a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f873f) {
            return false;
        }
        mo1034g();
        return true;
    }

    /* renamed from: a */
    public void mo1017a(Drawable drawable) {
        if (drawable == null) {
            this.f872e = mo1025b();
            this.f874g = false;
        } else {
            this.f872e = drawable;
            this.f874g = true;
        }
        if (!this.f873f) {
            mo1018a(this.f872e, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1026b(int i) {
        this.f868a.mo868a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Drawable mo1025b() {
        return this.f868a.mo867a();
    }

    /* renamed from: a */
    public void mo1023a(boolean z) {
        if (z != this.f873f) {
            if (z) {
                mo1018a((Drawable) this.f870c, this.f869b.mo5748e((int) C0984g.f4394b) ? this.f876i : this.f875h);
            } else {
                mo1018a(this.f872e, 0);
            }
            this.f873f = z;
        }
    }

    @C0193h0
    /* renamed from: a */
    public C0332d mo1014a() {
        return this.f870c;
    }

    /* renamed from: a */
    public void mo1022a(@C0193h0 C0332d dVar) {
        this.f870c = dVar;
        mo1033f();
    }

    /* renamed from: a */
    public void mo1021a(View view, float f) {
        if (this.f871d) {
            m1430a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m1430a(0.0f);
        }
    }

    /* renamed from: a */
    public void mo1020a(View view) {
        m1430a(1.0f);
        if (this.f873f) {
            mo1026b(this.f876i);
        }
    }

    /* renamed from: a */
    public void mo1019a(OnClickListener onClickListener) {
        this.f877j = onClickListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1018a(Drawable drawable, int i) {
        if (!this.f878k && !this.f868a.mo870b()) {
            this.f878k = true;
        }
        this.f868a.mo869a(drawable, i);
    }

    /* renamed from: a */
    private void m1430a(float f) {
        if (f == 1.0f) {
            this.f870c.mo1282b(true);
        } else if (f == 0.0f) {
            this.f870c.mo1282b(false);
        }
        this.f870c.mo1291f(f);
    }
}
