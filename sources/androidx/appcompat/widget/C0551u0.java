package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.view.menu.C0357a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.widget.Toolbar.C0463e;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0996j0;
import androidx.core.p034l.C0998k0;
import com.google.android.material.badge.BadgeDrawable;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.u0 */
/* compiled from: ToolbarWidgetWrapper */
public class C0551u0 implements C0566z {

    /* renamed from: s */
    private static final String f2196s = "ToolbarWidgetWrapper";

    /* renamed from: t */
    private static final int f2197t = 3;

    /* renamed from: u */
    private static final long f2198u = 200;

    /* renamed from: a */
    Toolbar f2199a;

    /* renamed from: b */
    private int f2200b;

    /* renamed from: c */
    private View f2201c;

    /* renamed from: d */
    private Spinner f2202d;

    /* renamed from: e */
    private View f2203e;

    /* renamed from: f */
    private Drawable f2204f;

    /* renamed from: g */
    private Drawable f2205g;

    /* renamed from: h */
    private Drawable f2206h;

    /* renamed from: i */
    private boolean f2207i;

    /* renamed from: j */
    CharSequence f2208j;

    /* renamed from: k */
    private CharSequence f2209k;

    /* renamed from: l */
    private CharSequence f2210l;

    /* renamed from: m */
    Callback f2211m;

    /* renamed from: n */
    boolean f2212n;

    /* renamed from: o */
    private ActionMenuPresenter f2213o;

    /* renamed from: p */
    private int f2214p;

    /* renamed from: q */
    private int f2215q;

    /* renamed from: r */
    private Drawable f2216r;

    /* renamed from: androidx.appcompat.widget.u0$a */
    /* compiled from: ToolbarWidgetWrapper */
    class C0552a implements OnClickListener {

        /* renamed from: a */
        final C0357a f2217a;

        C0552a() {
            C0357a aVar = new C0357a(C0551u0.this.f2199a.getContext(), 0, 16908332, 0, 0, C0551u0.this.f2208j);
            this.f2217a = aVar;
        }

        public void onClick(View view) {
            C0551u0 u0Var = C0551u0.this;
            Callback callback = u0Var.f2211m;
            if (callback != null && u0Var.f2212n) {
                callback.onMenuItemSelected(0, this.f2217a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.u0$b */
    /* compiled from: ToolbarWidgetWrapper */
    class C0553b extends C0998k0 {

        /* renamed from: a */
        private boolean f2219a = false;

        /* renamed from: b */
        final /* synthetic */ int f2220b;

        C0553b(int i) {
            this.f2220b = i;
        }

        /* renamed from: a */
        public void mo2465a(View view) {
            this.f2219a = true;
        }

        /* renamed from: b */
        public void mo865b(View view) {
            if (!this.f2219a) {
                C0551u0.this.f2199a.setVisibility(this.f2220b);
            }
        }

        /* renamed from: c */
        public void mo866c(View view) {
            C0551u0.this.f2199a.setVisibility(0);
        }
    }

    public C0551u0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0238R.string.abc_action_bar_up_description, C0238R.C0240drawable.abc_ic_ab_back_material);
    }

    /* renamed from: A */
    private void m2944A() {
        if ((this.f2200b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2210l)) {
            this.f2199a.setNavigationContentDescription(this.f2215q);
        } else {
            this.f2199a.setNavigationContentDescription(this.f2210l);
        }
    }

    /* renamed from: B */
    private void m2945B() {
        if ((this.f2200b & 4) != 0) {
            Toolbar toolbar = this.f2199a;
            Drawable drawable = this.f2206h;
            if (drawable == null) {
                drawable = this.f2216r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f2199a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: C */
    private void m2946C() {
        Drawable drawable;
        int i = this.f2200b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2205g;
            if (drawable == null) {
                drawable = this.f2204f;
            }
        } else {
            drawable = this.f2204f;
        }
        this.f2199a.setLogo(drawable);
    }

    /* renamed from: y */
    private int m2948y() {
        if (this.f2199a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2216r = this.f2199a.getNavigationIcon();
        return 15;
    }

    /* renamed from: z */
    private void m2949z() {
        if (this.f2202d == null) {
            this.f2202d = new AppCompatSpinner(mo2914c(), null, C0238R.attr.actionDropDownStyle);
            this.f2202d.setLayoutParams(new C0463e(-2, -2, 8388627));
        }
    }

    /* renamed from: a */
    public void mo2898a(int i) {
        if (i != this.f2215q) {
            this.f2215q = i;
            if (TextUtils.isEmpty(this.f2199a.getNavigationContentDescription())) {
                mo2925g(this.f2215q);
            }
        }
    }

    /* renamed from: a */
    public void mo2907a(boolean z) {
    }

    /* renamed from: b */
    public void mo2911b(CharSequence charSequence) {
        this.f2209k = charSequence;
        if ((this.f2200b & 8) != 0) {
            this.f2199a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public Context mo2914c() {
        return this.f2199a.getContext();
    }

    public void collapseActionView() {
        this.f2199a.mo2358c();
    }

    /* renamed from: d */
    public void mo2918d() {
        this.f2212n = true;
    }

    /* renamed from: e */
    public boolean mo2922e() {
        return this.f2204f != null;
    }

    /* renamed from: f */
    public boolean mo2924f() {
        return this.f2199a.mo2357b();
    }

    /* renamed from: g */
    public boolean mo2926g() {
        return this.f2205g != null;
    }

    public int getHeight() {
        return this.f2199a.getHeight();
    }

    public CharSequence getTitle() {
        return this.f2199a.getTitle();
    }

    /* renamed from: h */
    public boolean mo2929h() {
        return this.f2199a.mo2397h();
    }

    /* renamed from: i */
    public boolean mo2930i() {
        return this.f2199a.mo2363g();
    }

    /* renamed from: j */
    public boolean mo2931j() {
        return this.f2199a.mo2401l();
    }

    /* renamed from: k */
    public void mo2932k() {
        this.f2199a.mo2360d();
    }

    /* renamed from: l */
    public View mo2933l() {
        return this.f2203e;
    }

    /* renamed from: m */
    public boolean mo2934m() {
        return this.f2199a.mo2362f();
    }

    /* renamed from: n */
    public boolean mo2935n() {
        return this.f2199a.mo2399j();
    }

    /* renamed from: o */
    public Menu mo2936o() {
        return this.f2199a.getMenu();
    }

    /* renamed from: p */
    public boolean mo2937p() {
        return this.f2201c != null;
    }

    /* renamed from: q */
    public int mo2938q() {
        return this.f2214p;
    }

    /* renamed from: r */
    public ViewGroup mo2939r() {
        return this.f2199a;
    }

    /* renamed from: s */
    public CharSequence mo2940s() {
        return this.f2199a.getSubtitle();
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C0242a.m1109c(mo2914c(), i) : null);
    }

    public void setLogo(int i) {
        mo2909b(i != 0 ? C0242a.m1109c(mo2914c(), i) : null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2207i = true;
        m2947c(charSequence);
    }

    public void setVisibility(int i) {
        this.f2199a.setVisibility(i);
    }

    public void setWindowCallback(Callback callback) {
        this.f2211m = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2207i) {
            m2947c(charSequence);
        }
    }

    /* renamed from: t */
    public int mo2948t() {
        return this.f2200b;
    }

    /* renamed from: u */
    public int mo2949u() {
        Spinner spinner = this.f2202d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* renamed from: v */
    public void mo2950v() {
    }

    /* renamed from: w */
    public int mo2951w() {
        Spinner spinner = this.f2202d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    /* renamed from: x */
    public void mo2952x() {
    }

    public C0551u0(Toolbar toolbar, boolean z, int i, int i2) {
        this.f2214p = 0;
        this.f2215q = 0;
        this.f2199a = toolbar;
        this.f2208j = toolbar.getTitle();
        this.f2209k = toolbar.getSubtitle();
        this.f2207i = this.f2208j != null;
        this.f2206h = toolbar.getNavigationIcon();
        C0549t0 a = C0549t0.m2910a(toolbar.getContext(), null, C0238R.styleable.ActionBar, C0238R.attr.actionBarStyle, 0);
        this.f2216r = a.mo2875b(C0238R.styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence g = a.mo2889g(C0238R.styleable.ActionBar_title);
            if (!TextUtils.isEmpty(g)) {
                setTitle(g);
            }
            CharSequence g2 = a.mo2889g(C0238R.styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(g2)) {
                mo2911b(g2);
            }
            Drawable b = a.mo2875b(C0238R.styleable.ActionBar_logo);
            if (b != null) {
                mo2909b(b);
            }
            Drawable b2 = a.mo2875b(C0238R.styleable.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f2206h == null) {
                Drawable drawable = this.f2216r;
                if (drawable != null) {
                    mo2920d(drawable);
                }
            }
            mo2908b(a.mo2880d(C0238R.styleable.ActionBar_displayOptions, 0));
            int g3 = a.mo2888g(C0238R.styleable.ActionBar_customNavigationLayout, 0);
            if (g3 != 0) {
                mo2902a(LayoutInflater.from(this.f2199a.getContext()).inflate(g3, this.f2199a, false));
                mo2908b(this.f2200b | 16);
            }
            int f = a.mo2885f(C0238R.styleable.ActionBar_height, 0);
            if (f > 0) {
                LayoutParams layoutParams = this.f2199a.getLayoutParams();
                layoutParams.height = f;
                this.f2199a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo2874b(C0238R.styleable.ActionBar_contentInsetStart, -1);
            int b4 = a.mo2874b(C0238R.styleable.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f2199a.mo2355b(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g4 = a.mo2888g(C0238R.styleable.ActionBar_titleTextStyle, 0);
            if (g4 != 0) {
                Toolbar toolbar2 = this.f2199a;
                toolbar2.mo2356b(toolbar2.getContext(), g4);
            }
            int g5 = a.mo2888g(C0238R.styleable.ActionBar_subtitleTextStyle, 0);
            if (g5 != 0) {
                Toolbar toolbar3 = this.f2199a;
                toolbar3.mo2352a(toolbar3.getContext(), g5);
            }
            int g6 = a.mo2888g(C0238R.styleable.ActionBar_popupTheme, 0);
            if (g6 != 0) {
                this.f2199a.setPopupTheme(g6);
            }
        } else {
            this.f2200b = m2948y();
        }
        a.mo2887f();
        mo2898a(i);
        this.f2210l = this.f2199a.getNavigationContentDescription();
        this.f2199a.setNavigationOnClickListener(new C0552a());
    }

    /* renamed from: c */
    private void m2947c(CharSequence charSequence) {
        this.f2208j = charSequence;
        if ((this.f2200b & 8) != 0) {
            this.f2199a.setTitle(charSequence);
        }
    }

    /* renamed from: d */
    public void mo2919d(int i) {
        C0990i0 a = mo2897a(i, (long) f2198u);
        if (a != null) {
            a.mo4840e();
        }
    }

    /* renamed from: e */
    public void mo2921e(int i) {
        int i2 = this.f2214p;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.f2202d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f2199a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f2202d);
                    }
                }
            } else if (i2 == 2) {
                View view = this.f2201c;
                if (view != null) {
                    ViewParent parent2 = view.getParent();
                    Toolbar toolbar2 = this.f2199a;
                    if (parent2 == toolbar2) {
                        toolbar2.removeView(this.f2201c);
                    }
                }
            }
            this.f2214p = i;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                m2949z();
                this.f2199a.addView(this.f2202d, 0);
            } else if (i == 2) {
                View view2 = this.f2201c;
                if (view2 != null) {
                    this.f2199a.addView(view2, 0);
                    C0463e eVar = (C0463e) this.f2201c.getLayoutParams();
                    eVar.width = -2;
                    eVar.height = -2;
                    eVar.f866a = BadgeDrawable.f16067e0;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid navigation mode ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* renamed from: f */
    public void mo2923f(int i) {
        mo2920d(i != 0 ? C0242a.m1109c(mo2914c(), i) : null);
    }

    /* renamed from: g */
    public void mo2925g(int i) {
        mo2906a((CharSequence) i == 0 ? null : mo2914c().getString(i));
    }

    public void setIcon(Drawable drawable) {
        this.f2204f = drawable;
        m2946C();
    }

    /* renamed from: b */
    public void mo2909b(Drawable drawable) {
        this.f2205g = drawable;
        m2946C();
    }

    /* renamed from: d */
    public void mo2920d(Drawable drawable) {
        this.f2206h = drawable;
        m2945B();
    }

    /* renamed from: a */
    public void mo2901a(Menu menu, C0387a aVar) {
        if (this.f2213o == null) {
            this.f2213o = new ActionMenuPresenter(this.f2199a.getContext());
            this.f2213o.mo1483a(C0238R.C0241id.action_menu_presenter);
        }
        this.f2213o.mo1488a(aVar);
        this.f2199a.mo2353a((C0370g) menu, this.f2213o);
    }

    /* renamed from: c */
    public void mo2915c(int i) {
        Spinner spinner = this.f2202d;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    /* renamed from: b */
    public boolean mo2913b() {
        return this.f2199a.mo2398i();
    }

    /* renamed from: b */
    public void mo2908b(int i) {
        int i2 = this.f2200b ^ i;
        this.f2200b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2944A();
                }
                m2945B();
            }
            if ((i2 & 3) != 0) {
                m2946C();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2199a.setTitle(this.f2208j);
                    this.f2199a.setSubtitle(this.f2209k);
                } else {
                    this.f2199a.setTitle((CharSequence) null);
                    this.f2199a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f2203e;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f2199a.addView(view);
                } else {
                    this.f2199a.removeView(view);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo2916c(Drawable drawable) {
        if (this.f2216r != drawable) {
            this.f2216r = drawable;
            m2945B();
        }
    }

    /* renamed from: a */
    public void mo2905a(C0523l0 l0Var) {
        View view = this.f2201c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f2199a;
            if (parent == toolbar) {
                toolbar.removeView(this.f2201c);
            }
        }
        this.f2201c = l0Var;
        if (l0Var != null && this.f2214p == 2) {
            this.f2199a.addView(this.f2201c, 0);
            C0463e eVar = (C0463e) this.f2201c.getLayoutParams();
            eVar.width = -2;
            eVar.height = -2;
            eVar.f866a = BadgeDrawable.f16067e0;
            l0Var.setAllowCollapse(true);
        }
    }

    /* renamed from: b */
    public void mo2912b(boolean z) {
        this.f2199a.setCollapsible(z);
    }

    /* renamed from: a */
    public void mo2903a(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener) {
        m2949z();
        this.f2202d.setAdapter(spinnerAdapter);
        this.f2202d.setOnItemSelectedListener(onItemSelectedListener);
    }

    /* renamed from: b */
    public void mo2910b(SparseArray<Parcelable> sparseArray) {
        this.f2199a.restoreHierarchyState(sparseArray);
    }

    /* renamed from: a */
    public void mo2902a(View view) {
        View view2 = this.f2203e;
        if (!(view2 == null || (this.f2200b & 16) == 0)) {
            this.f2199a.removeView(view2);
        }
        this.f2203e = view;
        if (view != null && (this.f2200b & 16) != 0) {
            this.f2199a.addView(this.f2203e);
        }
    }

    /* renamed from: a */
    public C0990i0 mo2897a(int i, long j) {
        return C0962e0.m5428a(this.f2199a).mo4824a(i == 0 ? 1.0f : 0.0f).mo4825a(j).mo4827a((C0996j0) new C0553b(i));
    }

    /* renamed from: a */
    public void mo2906a(CharSequence charSequence) {
        this.f2210l = charSequence;
        m2944A();
    }

    /* renamed from: a */
    public void mo2900a(SparseArray<Parcelable> sparseArray) {
        this.f2199a.saveHierarchyState(sparseArray);
    }

    /* renamed from: a */
    public void mo2899a(Drawable drawable) {
        C0962e0.m5440a((View) this.f2199a, drawable);
    }

    /* renamed from: a */
    public int mo2896a() {
        return this.f2199a.getVisibility();
    }

    /* renamed from: a */
    public void mo2904a(C0387a aVar, C0371a aVar2) {
        this.f2199a.mo2354a(aVar, aVar2);
    }
}
