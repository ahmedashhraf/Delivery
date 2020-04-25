package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.C0279a.C0281b;
import androidx.appcompat.app.C0279a.C0283d;
import androidx.appcompat.app.C0279a.C0284e;
import androidx.appcompat.app.C0279a.C0285f;
import androidx.appcompat.app.C0279a.C0286g;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.p011d.C0337a;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.p011d.C0348h;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0384m;
import androidx.appcompat.view.menu.C0395s;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.C0401d;
import androidx.appcompat.widget.C0523l0;
import androidx.appcompat.widget.C0566z;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0996j0;
import androidx.core.p034l.C0998k0;
import androidx.core.p034l.C1000l0;
import androidx.fragment.app.C1376c;
import androidx.fragment.app.C1406n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.app.n */
/* compiled from: WindowDecorActionBar */
public class C0313n extends C0279a implements C0401d {

    /* renamed from: O */
    private static final String f956O = "WindowDecorActionBar";

    /* renamed from: P */
    private static final Interpolator f957P = new AccelerateInterpolator();

    /* renamed from: Q */
    private static final Interpolator f958Q = new DecelerateInterpolator();

    /* renamed from: R */
    private static final int f959R = -1;

    /* renamed from: S */
    private static final long f960S = 100;

    /* renamed from: T */
    private static final long f961T = 200;

    /* renamed from: U */
    static final /* synthetic */ boolean f962U = false;

    /* renamed from: A */
    private ArrayList<C0283d> f963A = new ArrayList<>();

    /* renamed from: B */
    private boolean f964B;

    /* renamed from: C */
    private int f965C = 0;

    /* renamed from: D */
    boolean f966D = true;

    /* renamed from: E */
    boolean f967E;

    /* renamed from: F */
    boolean f968F;

    /* renamed from: G */
    private boolean f969G;

    /* renamed from: H */
    private boolean f970H = true;

    /* renamed from: I */
    C0348h f971I;

    /* renamed from: J */
    private boolean f972J;

    /* renamed from: K */
    boolean f973K;

    /* renamed from: L */
    final C0996j0 f974L = new C0314a();

    /* renamed from: M */
    final C0996j0 f975M = new C0315b();

    /* renamed from: N */
    final C1000l0 f976N = new C0316c();

    /* renamed from: i */
    Context f977i;

    /* renamed from: j */
    private Context f978j;

    /* renamed from: k */
    private Activity f979k;

    /* renamed from: l */
    private Dialog f980l;

    /* renamed from: m */
    ActionBarOverlayLayout f981m;

    /* renamed from: n */
    ActionBarContainer f982n;

    /* renamed from: o */
    C0566z f983o;

    /* renamed from: p */
    ActionBarContextView f984p;

    /* renamed from: q */
    View f985q;

    /* renamed from: r */
    C0523l0 f986r;

    /* renamed from: s */
    private ArrayList<C0318e> f987s = new ArrayList<>();

    /* renamed from: t */
    private C0318e f988t;

    /* renamed from: u */
    private int f989u = -1;

    /* renamed from: v */
    private boolean f990v;

    /* renamed from: w */
    C0317d f991w;

    /* renamed from: x */
    C0338b f992x;

    /* renamed from: y */
    C0339a f993y;

    /* renamed from: z */
    private boolean f994z;

    /* renamed from: androidx.appcompat.app.n$a */
    /* compiled from: WindowDecorActionBar */
    class C0314a extends C0998k0 {
        C0314a() {
        }

        /* renamed from: b */
        public void mo865b(View view) {
            C0313n nVar = C0313n.this;
            if (nVar.f966D) {
                View view2 = nVar.f985q;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    C0313n.this.f982n.setTranslationY(0.0f);
                }
            }
            C0313n.this.f982n.setVisibility(8);
            C0313n.this.f982n.setTransitioning(false);
            C0313n nVar2 = C0313n.this;
            nVar2.f971I = null;
            nVar2.mo1108E();
            ActionBarOverlayLayout actionBarOverlayLayout = C0313n.this.f981m;
            if (actionBarOverlayLayout != null) {
                C0962e0.m5563v0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.n$b */
    /* compiled from: WindowDecorActionBar */
    class C0315b extends C0998k0 {
        C0315b() {
        }

        /* renamed from: b */
        public void mo865b(View view) {
            C0313n nVar = C0313n.this;
            nVar.f971I = null;
            nVar.f982n.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.n$c */
    /* compiled from: WindowDecorActionBar */
    class C0316c implements C1000l0 {
        C0316c() {
        }

        /* renamed from: a */
        public void mo1120a(View view) {
            ((View) C0313n.this.f982n.getParent()).invalidate();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.n$d */
    /* compiled from: WindowDecorActionBar */
    public class C0317d extends C0338b implements C0371a {

        /* renamed from: N */
        private final Context f998N;

        /* renamed from: O */
        private final C0370g f999O;

        /* renamed from: P */
        private C0339a f1000P;

        /* renamed from: Q */
        private WeakReference<View> f1001Q;

        public C0317d(Context context, C0339a aVar) {
            this.f998N = context;
            this.f1000P = aVar;
            this.f999O = new C0370g(context).mo1593d(1);
            this.f999O.mo1561a((C0371a) this);
        }

        /* renamed from: a */
        public void mo1121a() {
            C0313n nVar = C0313n.this;
            if (nVar.f991w == this) {
                if (!C0313n.m1610a(nVar.f967E, nVar.f968F, false)) {
                    C0313n nVar2 = C0313n.this;
                    nVar2.f992x = this;
                    nVar2.f993y = this.f1000P;
                } else {
                    this.f1000P.mo874a(this);
                }
                this.f1000P = null;
                C0313n.this.mo1117l(false);
                C0313n.this.f984p.mo1865i();
                C0313n.this.f983o.mo2939r().sendAccessibilityEvent(32);
                C0313n nVar3 = C0313n.this;
                nVar3.f981m.setHideOnContentScrollEnabled(nVar3.f973K);
                C0313n.this.f991w = null;
            }
        }

        /* renamed from: a */
        public void mo1124a(C0370g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo1125a(C0395s sVar) {
        }

        /* renamed from: b */
        public void mo1130b(CharSequence charSequence) {
            C0313n.this.f984p.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo1132c() {
            return this.f999O;
        }

        /* renamed from: d */
        public MenuInflater mo1133d() {
            return new C0345g(this.f998N);
        }

        /* renamed from: e */
        public CharSequence mo1134e() {
            return C0313n.this.f984p.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo1135g() {
            return C0313n.this.f984p.getTitle();
        }

        /* renamed from: i */
        public void mo1136i() {
            if (C0313n.this.f991w == this) {
                this.f999O.mo1630t();
                try {
                    this.f1000P.mo877b(this, this.f999O);
                } finally {
                    this.f999O.mo1623s();
                }
            }
        }

        /* renamed from: j */
        public boolean mo1137j() {
            return C0313n.this.f984p.mo1866j();
        }

        /* renamed from: l */
        public boolean mo1138l() {
            this.f999O.mo1630t();
            try {
                return this.f1000P.mo875a((C0338b) this, (Menu) this.f999O);
            } finally {
                this.f999O.mo1623s();
            }
        }

        /* renamed from: b */
        public void mo1129b(int i) {
            mo1130b((CharSequence) C0313n.this.f977i.getResources().getString(i));
        }

        /* renamed from: b */
        public View mo1128b() {
            WeakReference<View> weakReference = this.f1001Q;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo1131b(C0395s sVar) {
            if (this.f1000P == null) {
                return false;
            }
            if (!sVar.hasVisibleItems()) {
                return true;
            }
            new C0384m(C0313n.this.mo983r(), sVar).mo1779f();
            return true;
        }

        /* renamed from: a */
        public void mo1123a(View view) {
            C0313n.this.f984p.setCustomView(view);
            this.f1001Q = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo1126a(CharSequence charSequence) {
            C0313n.this.f984p.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo1122a(int i) {
            mo1126a((CharSequence) C0313n.this.f977i.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo1127a(boolean z) {
            super.mo1127a(z);
            C0313n.this.f984p.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, MenuItem menuItem) {
            C0339a aVar = this.f1000P;
            if (aVar != null) {
                return aVar.mo876a((C0338b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
            if (this.f1000P != null) {
                mo1136i();
                C0313n.this.f984p.mo1864h();
            }
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.n$e */
    /* compiled from: WindowDecorActionBar */
    public class C0318e extends C0285f {

        /* renamed from: b */
        private C0286g f1003b;

        /* renamed from: c */
        private Object f1004c;

        /* renamed from: d */
        private Drawable f1005d;

        /* renamed from: e */
        private CharSequence f1006e;

        /* renamed from: f */
        private CharSequence f1007f;

        /* renamed from: g */
        private int f1008g = -1;

        /* renamed from: h */
        private View f1009h;

        public C0318e() {
        }

        /* renamed from: a */
        public C0285f mo999a(Object obj) {
            this.f1004c = obj;
            return this;
        }

        /* renamed from: b */
        public View mo1001b() {
            return this.f1009h;
        }

        /* renamed from: c */
        public Drawable mo1004c() {
            return this.f1005d;
        }

        /* renamed from: d */
        public int mo1006d() {
            return this.f1008g;
        }

        /* renamed from: e */
        public Object mo1008e() {
            return this.f1004c;
        }

        /* renamed from: f */
        public CharSequence mo1009f() {
            return this.f1006e;
        }

        /* renamed from: g */
        public void mo1010g() {
            C0313n.this.mo944c((C0285f) this);
        }

        /* renamed from: h */
        public C0286g mo1140h() {
            return this.f1003b;
        }

        /* renamed from: a */
        public C0285f mo997a(C0286g gVar) {
            this.f1003b = gVar;
            return this;
        }

        /* renamed from: b */
        public C0285f mo1002b(int i) {
            return mo996a(LayoutInflater.from(C0313n.this.mo983r()).inflate(i, null));
        }

        /* renamed from: c */
        public C0285f mo1005c(int i) {
            return mo995a(C0242a.m1109c(C0313n.this.f977i, i));
        }

        /* renamed from: d */
        public C0285f mo1007d(int i) {
            return mo1003b(C0313n.this.f977i.getResources().getText(i));
        }

        /* renamed from: e */
        public void mo1139e(int i) {
            this.f1008g = i;
        }

        /* renamed from: a */
        public C0285f mo996a(View view) {
            this.f1009h = view;
            int i = this.f1008g;
            if (i >= 0) {
                C0313n.this.f986r.mo2765d(i);
            }
            return this;
        }

        /* renamed from: b */
        public C0285f mo1003b(CharSequence charSequence) {
            this.f1006e = charSequence;
            int i = this.f1008g;
            if (i >= 0) {
                C0313n.this.f986r.mo2765d(i);
            }
            return this;
        }

        /* renamed from: a */
        public C0285f mo995a(Drawable drawable) {
            this.f1005d = drawable;
            int i = this.f1008g;
            if (i >= 0) {
                C0313n.this.f986r.mo2765d(i);
            }
            return this;
        }

        /* renamed from: a */
        public C0285f mo994a(int i) {
            return mo998a(C0313n.this.f977i.getResources().getText(i));
        }

        /* renamed from: a */
        public C0285f mo998a(CharSequence charSequence) {
            this.f1007f = charSequence;
            int i = this.f1008g;
            if (i >= 0) {
                C0313n.this.f986r.mo2765d(i);
            }
            return this;
        }

        /* renamed from: a */
        public CharSequence mo1000a() {
            return this.f1007f;
        }
    }

    public C0313n(Activity activity, boolean z) {
        this.f979k = activity;
        View decorView = activity.getWindow().getDecorView();
        m1613c(decorView);
        if (!z) {
            this.f985q = decorView.findViewById(16908290);
        }
    }

    /* renamed from: H */
    private void m1605H() {
        if (this.f988t != null) {
            mo944c((C0285f) null);
        }
        this.f987s.clear();
        C0523l0 l0Var = this.f986r;
        if (l0Var != null) {
            l0Var.mo2758a();
        }
        this.f989u = -1;
    }

    /* renamed from: I */
    private void m1606I() {
        if (this.f986r == null) {
            C0523l0 l0Var = new C0523l0(this.f977i);
            if (this.f964B) {
                l0Var.setVisibility(0);
                this.f983o.mo2905a(l0Var);
            } else {
                if (mo976m() == 2) {
                    l0Var.setVisibility(0);
                    ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
                    if (actionBarOverlayLayout != null) {
                        C0962e0.m5563v0(actionBarOverlayLayout);
                    }
                } else {
                    l0Var.setVisibility(8);
                }
                this.f982n.setTabContainer(l0Var);
            }
            this.f986r = l0Var;
        }
    }

    /* renamed from: J */
    private void m1607J() {
        if (this.f969G) {
            this.f969G = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m1615p(false);
        }
    }

    /* renamed from: K */
    private boolean m1608K() {
        return C0962e0.m5540n0(this.f982n);
    }

    /* renamed from: L */
    private void m1609L() {
        if (!this.f969G) {
            this.f969G = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m1615p(false);
        }
    }

    /* renamed from: a */
    static boolean m1610a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private C0566z m1611b(View view) {
        if (view instanceof C0566z) {
            return (C0566z) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    private void m1613c(View view) {
        this.f981m = (ActionBarOverlayLayout) view.findViewById(C0238R.C0241id.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f983o = m1611b(view.findViewById(C0238R.C0241id.action_bar));
        this.f984p = (ActionBarContextView) view.findViewById(C0238R.C0241id.action_context_bar);
        this.f982n = (ActionBarContainer) view.findViewById(C0238R.C0241id.action_bar_container);
        C0566z zVar = this.f983o;
        if (zVar == null || this.f984p == null || this.f982n == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0313n.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f977i = zVar.mo2914c();
        boolean z = (this.f983o.mo2948t() & 4) != 0;
        if (z) {
            this.f990v = true;
        }
        C0337a a = C0337a.m1868a(this.f977i);
        mo970j(a.mo1311a() || z);
        m1614o(a.mo1316f());
        TypedArray obtainStyledAttributes = this.f977i.obtainStyledAttributes(null, C0238R.styleable.ActionBar, C0238R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0238R.styleable.ActionBar_hideOnContentScroll, false)) {
            mo967i(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo921a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: o */
    private void m1614o(boolean z) {
        this.f964B = z;
        if (!this.f964B) {
            this.f983o.mo2905a((C0523l0) null);
            this.f982n.setTabContainer(this.f986r);
        } else {
            this.f982n.setTabContainer(null);
            this.f983o.mo2905a(this.f986r);
        }
        boolean z2 = true;
        boolean z3 = mo976m() == 2;
        C0523l0 l0Var = this.f986r;
        if (l0Var != null) {
            if (z3) {
                l0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
                if (actionBarOverlayLayout != null) {
                    C0962e0.m5563v0(actionBarOverlayLayout);
                }
            } else {
                l0Var.setVisibility(8);
            }
        }
        this.f983o.mo2912b(!this.f964B && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f981m;
        if (this.f964B || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: B */
    public void mo917B() {
        m1605H();
    }

    /* renamed from: C */
    public boolean mo918C() {
        ViewGroup r = this.f983o.mo2939r();
        if (r == null || r.hasFocus()) {
            return false;
        }
        r.requestFocus();
        return true;
    }

    /* renamed from: D */
    public void mo919D() {
        if (this.f967E) {
            this.f967E = false;
            m1615p(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public void mo1108E() {
        C0339a aVar = this.f993y;
        if (aVar != null) {
            aVar.mo874a(this.f992x);
            this.f992x = null;
            this.f993y = null;
        }
    }

    /* renamed from: F */
    public boolean mo1109F() {
        return this.f983o.mo2922e();
    }

    /* renamed from: G */
    public boolean mo1110G() {
        return this.f983o.mo2926g();
    }

    /* renamed from: a */
    public void mo921a(float f) {
        C0962e0.m5472b((View) this.f982n, f);
    }

    /* renamed from: b */
    public void mo1114b() {
    }

    /* renamed from: d */
    public void mo947d(int i) {
        mo925a(LayoutInflater.from(mo983r()).inflate(i, this.f983o.mo2939r(), false));
    }

    /* renamed from: e */
    public void mo952e(Drawable drawable) {
    }

    /* renamed from: e */
    public void mo953e(boolean z) {
        mo922a(z ? 16 : 0, 16);
    }

    /* renamed from: f */
    public void mo957f(boolean z) {
        mo922a(z ? 2 : 0, 2);
    }

    /* renamed from: g */
    public void mo961g(boolean z) {
        mo922a(z ? 8 : 0, 8);
    }

    /* renamed from: h */
    public void mo964h(boolean z) {
        mo922a(z ? 1 : 0, 1);
    }

    /* renamed from: i */
    public float mo965i() {
        return C0962e0.m5551r(this.f982n);
    }

    /* renamed from: j */
    public void mo970j(boolean z) {
        this.f983o.mo2907a(z);
    }

    /* renamed from: k */
    public void mo973k(boolean z) {
        this.f972J = z;
        if (!z) {
            C0348h hVar = this.f971I;
            if (hVar != null) {
                hVar.mo1368a();
            }
        }
    }

    /* renamed from: l */
    public void mo975l(int i) {
        int q = this.f983o.mo2938q();
        if (q == 1) {
            this.f983o.mo2915c(i);
        } else if (q == 2) {
            mo944c((C0285f) this.f987s.get(i));
        } else {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: m */
    public void mo977m(int i) {
        mo940b((CharSequence) this.f977i.getString(i));
    }

    /* renamed from: n */
    public void mo979n(int i) {
        mo945c((CharSequence) this.f977i.getString(i));
    }

    /* renamed from: p */
    public CharSequence mo981p() {
        return this.f983o.mo2940s();
    }

    /* renamed from: q */
    public int mo982q() {
        return this.f987s.size();
    }

    /* renamed from: r */
    public Context mo983r() {
        if (this.f978j == null) {
            TypedValue typedValue = new TypedValue();
            this.f977i.getTheme().resolveAttribute(C0238R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f978j = new ContextThemeWrapper(this.f977i, i);
            } else {
                this.f978j = this.f977i;
            }
        }
        return this.f978j;
    }

    /* renamed from: s */
    public CharSequence mo984s() {
        return this.f983o.getTitle();
    }

    /* renamed from: t */
    public void mo985t() {
        if (!this.f967E) {
            this.f967E = true;
            m1615p(false);
        }
    }

    /* renamed from: v */
    public boolean mo987v() {
        return this.f981m.mo1894c();
    }

    /* renamed from: w */
    public boolean mo988w() {
        int j = mo968j();
        return this.f970H && (j == 0 || mo971k() < j);
    }

    /* renamed from: x */
    public boolean mo989x() {
        C0566z zVar = this.f983o;
        return zVar != null && zVar.mo2935n();
    }

    /* renamed from: y */
    public C0285f mo990y() {
        return new C0318e();
    }

    /* renamed from: p */
    private void m1615p(boolean z) {
        if (m1610a(this.f967E, this.f968F, this.f969G)) {
            if (!this.f970H) {
                this.f970H = true;
                mo1119n(z);
            }
        } else if (this.f970H) {
            this.f970H = false;
            mo1118m(z);
        }
    }

    /* renamed from: a */
    public void mo923a(Configuration configuration) {
        m1614o(C0337a.m1868a(this.f977i).mo1316f());
    }

    /* renamed from: e */
    public void mo951e(int i) {
        if ((i & 4) != 0) {
            this.f990v = true;
        }
        this.f983o.mo2908b(i);
    }

    /* renamed from: f */
    public void mo956f(Drawable drawable) {
        this.f982n.setStackedBackground(drawable);
    }

    /* renamed from: g */
    public View mo959g() {
        return this.f983o.mo2933l();
    }

    /* renamed from: h */
    public int mo962h() {
        return this.f983o.mo2948t();
    }

    /* renamed from: i */
    public void mo967i(boolean z) {
        if (!z || this.f981m.mo1912l()) {
            this.f973K = z;
            this.f981m.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: j */
    public int mo968j() {
        return this.f982n.getHeight();
    }

    /* renamed from: m */
    public int mo976m() {
        return this.f983o.mo2938q();
    }

    /* renamed from: n */
    public void mo1119n(boolean z) {
        C0348h hVar = this.f971I;
        if (hVar != null) {
            hVar.mo1368a();
        }
        this.f982n.setVisibility(0);
        if (this.f965C != 0 || (!this.f972J && !z)) {
            this.f982n.setAlpha(1.0f);
            this.f982n.setTranslationY(0.0f);
            if (this.f966D) {
                View view = this.f985q;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f975M.mo865b(null);
        } else {
            this.f982n.setTranslationY(0.0f);
            float f = (float) (-this.f982n.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f982n.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f982n.setTranslationY(f);
            C0348h hVar2 = new C0348h();
            C0990i0 o = C0962e0.m5428a(this.f982n).mo4851o(0.0f);
            o.mo4828a(this.f976N);
            hVar2.mo1365a(o);
            if (this.f966D) {
                View view2 = this.f985q;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    hVar2.mo1365a(C0962e0.m5428a(this.f985q).mo4851o(0.0f));
                }
            }
            hVar2.mo1364a(f958Q);
            hVar2.mo1363a(250);
            hVar2.mo1367a(this.f975M);
            this.f971I = hVar2;
            hVar2.mo1370c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
        if (actionBarOverlayLayout != null) {
            C0962e0.m5563v0(actionBarOverlayLayout);
        }
    }

    /* renamed from: a */
    public void mo1112a(int i) {
        this.f965C = i;
    }

    /* renamed from: f */
    public void mo955f(int i) {
        if (i == 0 || this.f981m.mo1912l()) {
            this.f981m.setActionBarHideOffset(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    /* renamed from: g */
    public void mo960g(int i) {
        this.f983o.mo2925g(i);
    }

    /* renamed from: h */
    public void mo963h(int i) {
        this.f983o.mo2923f(i);
    }

    /* renamed from: j */
    public void mo969j(int i) {
        this.f983o.setLogo(i);
    }

    /* renamed from: m */
    public void mo1118m(boolean z) {
        C0348h hVar = this.f971I;
        if (hVar != null) {
            hVar.mo1368a();
        }
        if (this.f965C != 0 || (!this.f972J && !z)) {
            this.f974L.mo865b(null);
            return;
        }
        this.f982n.setAlpha(1.0f);
        this.f982n.setTransitioning(true);
        C0348h hVar2 = new C0348h();
        float f = (float) (-this.f982n.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f982n.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0990i0 o = C0962e0.m5428a(this.f982n).mo4851o(f);
        o.mo4828a(this.f976N);
        hVar2.mo1365a(o);
        if (this.f966D) {
            View view = this.f985q;
            if (view != null) {
                hVar2.mo1365a(C0962e0.m5428a(view).mo4851o(f));
            }
        }
        hVar2.mo1364a(f957P);
        hVar2.mo1363a(250);
        hVar2.mo1367a(this.f974L);
        this.f971I = hVar2;
        hVar2.mo1370c();
    }

    /* renamed from: a */
    public void mo928a(C0283d dVar) {
        this.f963A.add(dVar);
    }

    /* renamed from: d */
    public void mo950d(boolean z) {
        mo922a(z ? 4 : 0, 4);
    }

    /* renamed from: k */
    public int mo971k() {
        return this.f981m.getActionBarHideOffset();
    }

    /* renamed from: a */
    public void mo922a(int i, int i2) {
        int t = this.f983o.mo2948t();
        if ((i2 & 4) != 0) {
            this.f990v = true;
        }
        this.f983o.mo2908b((i & i2) | ((i2 ^ -1) & t));
    }

    /* renamed from: d */
    public void mo949d(CharSequence charSequence) {
        this.f983o.setWindowTitle(charSequence);
    }

    /* renamed from: k */
    public void mo972k(int i) {
        int q = this.f983o.mo2938q();
        if (q == 2) {
            this.f989u = mo978n();
            mo944c((C0285f) null);
            this.f986r.setVisibility(8);
        }
        if (q != i && !this.f964B) {
            ActionBarOverlayLayout actionBarOverlayLayout = this.f981m;
            if (actionBarOverlayLayout != null) {
                C0962e0.m5563v0(actionBarOverlayLayout);
            }
        }
        this.f983o.mo2921e(i);
        boolean z = false;
        if (i == 2) {
            m1606I();
            this.f986r.setVisibility(0);
            int i2 = this.f989u;
            if (i2 != -1) {
                mo975l(i2);
                this.f989u = -1;
            }
        }
        this.f983o.mo2912b(i == 2 && !this.f964B);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f981m;
        if (i == 2 && !this.f964B) {
            z = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: l */
    public void mo1117l(boolean z) {
        C0990i0 i0Var;
        C0990i0 i0Var2;
        if (z) {
            m1609L();
        } else {
            m1607J();
        }
        if (m1608K()) {
            if (z) {
                i0Var = this.f983o.mo2897a(4, (long) f960S);
                i0Var2 = this.f984p.mo1848a(0, f961T);
            } else {
                i0Var2 = this.f983o.mo2897a(0, (long) f961T);
                i0Var = this.f984p.mo1848a(8, f960S);
            }
            C0348h hVar = new C0348h();
            hVar.mo1366a(i0Var, i0Var2);
            hVar.mo1370c();
        } else if (z) {
            this.f983o.setVisibility(4);
            this.f984p.setVisibility(0);
        } else {
            this.f983o.setVisibility(0);
            this.f984p.setVisibility(8);
        }
    }

    /* renamed from: d */
    public void mo1116d() {
        C0348h hVar = this.f971I;
        if (hVar != null) {
            hVar.mo1368a();
            this.f971I = null;
        }
    }

    /* renamed from: f */
    public boolean mo958f() {
        C0566z zVar = this.f983o;
        if (zVar == null || !zVar.mo2934m()) {
            return false;
        }
        this.f983o.collapseActionView();
        return true;
    }

    /* renamed from: i */
    public void mo966i(int i) {
        this.f983o.setIcon(i);
    }

    /* renamed from: b */
    public void mo938b(C0283d dVar) {
        this.f963A.remove(dVar);
    }

    /* renamed from: a */
    public void mo924a(Drawable drawable) {
        this.f982n.setPrimaryBackground(drawable);
    }

    /* renamed from: b */
    public void mo941b(boolean z) {
        if (z != this.f994z) {
            this.f994z = z;
            int size = this.f963A.size();
            for (int i = 0; i < size; i++) {
                ((C0283d) this.f963A.get(i)).mo992a(z);
            }
        }
    }

    /* renamed from: a */
    public C0338b mo920a(C0339a aVar) {
        C0317d dVar = this.f991w;
        if (dVar != null) {
            dVar.mo1121a();
        }
        this.f981m.setHideOnContentScrollEnabled(false);
        this.f984p.mo1867k();
        C0317d dVar2 = new C0317d(this.f984p.getContext(), aVar);
        if (!dVar2.mo1138l()) {
            return null;
        }
        this.f991w = dVar2;
        dVar2.mo1136i();
        this.f984p.mo1850a((C0338b) dVar2);
        mo1117l(true);
        this.f984p.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: d */
    public void mo948d(Drawable drawable) {
        this.f983o.mo2909b(drawable);
    }

    /* renamed from: b */
    public void mo940b(CharSequence charSequence) {
        this.f983o.mo2911b(charSequence);
    }

    /* renamed from: b */
    private void m1612b(C0285f fVar, int i) {
        C0318e eVar = (C0318e) fVar;
        if (eVar.mo1140h() != null) {
            eVar.mo1139e(i);
            this.f987s.add(i, eVar);
            int size = this.f987s.size();
            while (true) {
                i++;
                if (i < size) {
                    ((C0318e) this.f987s.get(i)).mo1139e(i);
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
    }

    /* renamed from: o */
    public C0285f mo980o() {
        return this.f988t;
    }

    public C0313n(Dialog dialog) {
        this.f980l = dialog;
        m1613c(dialog.getWindow().getDecorView());
    }

    /* renamed from: l */
    public int mo974l() {
        int q = this.f983o.mo2938q();
        if (q == 1) {
            return this.f983o.mo2951w();
        }
        if (q != 2) {
            return 0;
        }
        return this.f987s.size();
    }

    /* renamed from: a */
    public void mo929a(C0285f fVar) {
        mo932a(fVar, this.f987s.isEmpty());
    }

    /* renamed from: b */
    public void mo939b(C0285f fVar) {
        mo942c(fVar.mo1006d());
    }

    /* renamed from: a */
    public void mo930a(C0285f fVar, int i) {
        mo931a(fVar, i, this.f987s.isEmpty());
    }

    /* renamed from: b */
    public void mo937b(Drawable drawable) {
        this.f983o.mo2920d(drawable);
    }

    /* renamed from: c */
    public void mo945c(CharSequence charSequence) {
        this.f983o.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo932a(C0285f fVar, boolean z) {
        m1606I();
        this.f986r.mo2761a(fVar, z);
        m1612b(fVar, this.f987s.size());
        if (z) {
            mo944c(fVar);
        }
    }

    /* renamed from: b */
    public C0285f mo936b(int i) {
        return (C0285f) this.f987s.get(i);
    }

    /* renamed from: c */
    public void mo942c(int i) {
        if (this.f986r != null) {
            C0318e eVar = this.f988t;
            int d = eVar != null ? eVar.mo1006d() : this.f989u;
            this.f986r.mo2764c(i);
            C0318e eVar2 = (C0318e) this.f987s.remove(i);
            if (eVar2 != null) {
                eVar2.mo1139e(-1);
            }
            int size = this.f987s.size();
            for (int i2 = i; i2 < size; i2++) {
                ((C0318e) this.f987s.get(i2)).mo1139e(i2);
            }
            if (d == i) {
                mo944c((C0285f) this.f987s.isEmpty() ? null : (C0318e) this.f987s.get(Math.max(0, i - 1)));
            }
        }
    }

    /* renamed from: a */
    public void mo931a(C0285f fVar, int i, boolean z) {
        m1606I();
        this.f986r.mo2760a(fVar, i, z);
        m1612b(fVar, i);
        if (z) {
            mo944c(fVar);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public C0313n(View view) {
        m1613c(view);
    }

    /* renamed from: a */
    public void mo1113a(boolean z) {
        this.f966D = z;
    }

    /* renamed from: a */
    public void mo1111a() {
        if (this.f968F) {
            this.f968F = false;
            m1615p(true);
        }
    }

    /* renamed from: c */
    public void mo944c(C0285f fVar) {
        int i = -1;
        if (mo976m() != 2) {
            if (fVar != null) {
                i = fVar.mo1006d();
            }
            this.f989u = i;
            return;
        }
        C1406n i2 = (!(this.f979k instanceof C1376c) || this.f983o.mo2939r().isInEditMode()) ? null : ((C1376c) this.f979k).getSupportFragmentManager().mo6224a().mo6411i();
        C0318e eVar = this.f988t;
        if (eVar != fVar) {
            C0523l0 l0Var = this.f986r;
            if (fVar != null) {
                i = fVar.mo1006d();
            }
            l0Var.setTabSelected(i);
            C0318e eVar2 = this.f988t;
            if (eVar2 != null) {
                eVar2.mo1140h().mo1012b(this.f988t, i2);
            }
            this.f988t = (C0318e) fVar;
            C0318e eVar3 = this.f988t;
            if (eVar3 != null) {
                eVar3.mo1140h().mo1011a(this.f988t, i2);
            }
        } else if (eVar != null) {
            eVar.mo1140h().mo1013c(this.f988t, i2);
            this.f986r.mo2759a(fVar.mo1006d());
        }
        if (i2 != null && !i2.mo6107k()) {
            i2.mo6097e();
        }
    }

    /* renamed from: n */
    public int mo978n() {
        int q = this.f983o.mo2938q();
        if (q == 1) {
            return this.f983o.mo2949u();
        }
        int i = -1;
        if (q != 2) {
            return -1;
        }
        C0318e eVar = this.f988t;
        if (eVar != null) {
            i = eVar.mo1006d();
        }
        return i;
    }

    /* renamed from: a */
    public void mo933a(CharSequence charSequence) {
        this.f983o.mo2906a(charSequence);
    }

    /* renamed from: a */
    public void mo925a(View view) {
        this.f983o.mo2902a(view);
    }

    /* renamed from: a */
    public void mo926a(View view, C0281b bVar) {
        view.setLayoutParams(bVar);
        this.f983o.mo2902a(view);
    }

    /* renamed from: a */
    public void mo927a(SpinnerAdapter spinnerAdapter, C0284e eVar) {
        this.f983o.mo2903a(spinnerAdapter, (OnItemSelectedListener) new C0302i(eVar));
    }

    /* renamed from: a */
    public boolean mo934a(int i, KeyEvent keyEvent) {
        C0317d dVar = this.f991w;
        if (dVar == null) {
            return false;
        }
        Menu c = dVar.mo1132c();
        if (c == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: c */
    public void mo1115c() {
        if (!this.f968F) {
            this.f968F = true;
            m1615p(true);
        }
    }

    /* renamed from: c */
    public void mo943c(Drawable drawable) {
        this.f983o.setIcon(drawable);
    }

    /* renamed from: c */
    public void mo946c(boolean z) {
        if (!this.f990v) {
            mo950d(z);
        }
    }
}
