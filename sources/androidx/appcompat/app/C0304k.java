package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0279a.C0281b;
import androidx.appcompat.app.C0279a.C0283d;
import androidx.appcompat.app.C0279a.C0284e;
import androidx.appcompat.app.C0279a.C0285f;
import androidx.appcompat.p011d.C0350i;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.widget.C0551u0;
import androidx.appcompat.widget.C0566z;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0464f;
import androidx.core.p034l.C0962e0;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.k */
/* compiled from: ToolbarActionBar */
class C0304k extends C0279a {

    /* renamed from: i */
    C0566z f915i;

    /* renamed from: j */
    boolean f916j;

    /* renamed from: k */
    Callback f917k;

    /* renamed from: l */
    private boolean f918l;

    /* renamed from: m */
    private boolean f919m;

    /* renamed from: n */
    private ArrayList<C0283d> f920n = new ArrayList<>();

    /* renamed from: o */
    private final Runnable f921o = new C0305a();

    /* renamed from: p */
    private final C0464f f922p = new C0306b();

    /* renamed from: androidx.appcompat.app.k$a */
    /* compiled from: ToolbarActionBar */
    class C0305a implements Runnable {
        C0305a() {
        }

        public void run() {
            C0304k.this.mo1102F();
        }
    }

    /* renamed from: androidx.appcompat.app.k$b */
    /* compiled from: ToolbarActionBar */
    class C0306b implements C0464f {
        C0306b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0304k.this.f917k.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.k$c */
    /* compiled from: ToolbarActionBar */
    private final class C0307c implements C0387a {

        /* renamed from: a */
        private boolean f925a;

        C0307c() {
        }

        /* renamed from: a */
        public boolean mo873a(C0370g gVar) {
            Callback callback = C0304k.this.f917k;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }

        /* renamed from: a */
        public void mo872a(C0370g gVar, boolean z) {
            if (!this.f925a) {
                this.f925a = true;
                C0304k.this.f915i.mo2932k();
                Callback callback = C0304k.this.f917k;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.f925a = false;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.k$d */
    /* compiled from: ToolbarActionBar */
    private final class C0308d implements C0371a {
        C0308d() {
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
            C0304k kVar = C0304k.this;
            if (kVar.f917k == null) {
                return;
            }
            if (kVar.f915i.mo2913b()) {
                C0304k.this.f917k.onPanelClosed(108, gVar);
            } else if (C0304k.this.f917k.onPreparePanel(0, null, gVar)) {
                C0304k.this.f917k.onMenuOpened(108, gVar);
            }
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.app.k$e */
    /* compiled from: ToolbarActionBar */
    private class C0309e extends C0350i {
        public C0309e(Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0304k.this.f915i.mo2914c());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0304k kVar = C0304k.this;
                if (!kVar.f916j) {
                    kVar.f915i.mo2918d();
                    C0304k.this.f916j = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0304k(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f915i = new C0551u0(toolbar, false);
        this.f917k = new C0309e(callback);
        this.f915i.setWindowCallback(this.f917k);
        toolbar.setOnMenuItemClickListener(this.f922p);
        this.f915i.setWindowTitle(charSequence);
    }

    /* renamed from: G */
    private Menu m1518G() {
        if (!this.f918l) {
            this.f915i.mo2904a((C0387a) new C0307c(), (C0371a) new C0308d());
            this.f918l = true;
        }
        return this.f915i.mo2936o();
    }

    /* renamed from: A */
    public boolean mo916A() {
        return this.f915i.mo2931j();
    }

    /* renamed from: B */
    public void mo917B() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: C */
    public boolean mo918C() {
        ViewGroup r = this.f915i.mo2939r();
        if (r == null || r.hasFocus()) {
            return false;
        }
        r.requestFocus();
        return true;
    }

    /* renamed from: D */
    public void mo919D() {
        this.f915i.setVisibility(0);
    }

    /* renamed from: E */
    public Callback mo1101E() {
        return this.f917k;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public void mo1102F() {
        Menu G = m1518G();
        C0370g gVar = G instanceof C0370g ? (C0370g) G : null;
        if (gVar != null) {
            gVar.mo1630t();
        }
        try {
            G.clear();
            if (!this.f917k.onCreatePanelMenu(0, G) || !this.f917k.onPreparePanel(0, null, G)) {
                G.clear();
            }
            if (gVar != null) {
                gVar.mo1623s();
            }
        } catch (Throwable th) {
            if (gVar != null) {
                gVar.mo1623s();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo925a(View view) {
        mo926a(view, new C0281b(-2, -2));
    }

    /* renamed from: b */
    public void mo937b(Drawable drawable) {
        this.f915i.mo2920d(drawable);
    }

    /* renamed from: c */
    public void mo943c(Drawable drawable) {
        this.f915i.setIcon(drawable);
    }

    /* renamed from: c */
    public void mo946c(boolean z) {
    }

    /* renamed from: d */
    public void mo947d(int i) {
        mo925a(LayoutInflater.from(this.f915i.mo2914c()).inflate(i, this.f915i.mo2939r(), false));
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: e */
    public void mo951e(int i) {
        mo922a(i, -1);
    }

    /* renamed from: e */
    public void mo952e(Drawable drawable) {
    }

    /* renamed from: f */
    public void mo956f(Drawable drawable) {
    }

    /* renamed from: f */
    public void mo957f(boolean z) {
        mo922a(z ? 2 : 0, 2);
    }

    /* renamed from: g */
    public void mo960g(int i) {
        this.f915i.mo2925g(i);
    }

    /* renamed from: h */
    public void mo963h(int i) {
        this.f915i.mo2923f(i);
    }

    /* renamed from: i */
    public void mo966i(int i) {
        this.f915i.setIcon(i);
    }

    /* renamed from: j */
    public void mo969j(int i) {
        this.f915i.setLogo(i);
    }

    /* renamed from: j */
    public void mo970j(boolean z) {
    }

    /* renamed from: k */
    public void mo972k(int i) {
        if (i != 2) {
            this.f915i.mo2921e(i);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }

    /* renamed from: k */
    public void mo973k(boolean z) {
    }

    /* renamed from: l */
    public int mo974l() {
        return 0;
    }

    /* renamed from: l */
    public void mo975l(int i) {
        if (this.f915i.mo2938q() == 1) {
            this.f915i.mo2915c(i);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }

    /* renamed from: m */
    public int mo976m() {
        return 0;
    }

    /* renamed from: m */
    public void mo977m(int i) {
        C0566z zVar = this.f915i;
        zVar.mo2911b(i != 0 ? zVar.mo2914c().getText(i) : null);
    }

    /* renamed from: n */
    public int mo978n() {
        return -1;
    }

    /* renamed from: n */
    public void mo979n(int i) {
        C0566z zVar = this.f915i;
        zVar.setTitle(i != 0 ? zVar.mo2914c().getText(i) : null);
    }

    /* renamed from: o */
    public C0285f mo980o() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: p */
    public CharSequence mo981p() {
        return this.f915i.mo2940s();
    }

    /* renamed from: q */
    public int mo982q() {
        return 0;
    }

    /* renamed from: r */
    public Context mo983r() {
        return this.f915i.mo2914c();
    }

    /* renamed from: s */
    public CharSequence mo984s() {
        return this.f915i.getTitle();
    }

    /* renamed from: t */
    public void mo985t() {
        this.f915i.setVisibility(8);
    }

    /* renamed from: u */
    public boolean mo986u() {
        this.f915i.mo2939r().removeCallbacks(this.f921o);
        C0962e0.m5451a((View) this.f915i.mo2939r(), this.f921o);
        return true;
    }

    /* renamed from: w */
    public boolean mo988w() {
        return this.f915i.mo2896a() == 0;
    }

    /* renamed from: x */
    public boolean mo989x() {
        return super.mo989x();
    }

    /* renamed from: y */
    public C0285f mo990y() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public void mo991z() {
        this.f915i.mo2939r().removeCallbacks(this.f921o);
    }

    /* renamed from: a */
    public void mo926a(View view, C0281b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f915i.mo2902a(view);
    }

    /* renamed from: b */
    public void mo940b(CharSequence charSequence) {
        this.f915i.mo2911b(charSequence);
    }

    /* renamed from: c */
    public void mo945c(CharSequence charSequence) {
        this.f915i.setTitle(charSequence);
    }

    /* renamed from: e */
    public void mo953e(boolean z) {
        mo922a(z ? 16 : 0, 16);
    }

    /* renamed from: f */
    public boolean mo958f() {
        if (!this.f915i.mo2934m()) {
            return false;
        }
        this.f915i.collapseActionView();
        return true;
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
        return C0962e0.m5551r(this.f915i.mo2939r());
    }

    /* renamed from: j */
    public int mo968j() {
        return this.f915i.getHeight();
    }

    /* renamed from: b */
    public void mo939b(C0285f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: c */
    public void mo942c(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: d */
    public void mo948d(Drawable drawable) {
        this.f915i.mo2909b(drawable);
    }

    /* renamed from: e */
    public boolean mo954e() {
        return this.f915i.mo2930i();
    }

    /* renamed from: g */
    public View mo959g() {
        return this.f915i.mo2933l();
    }

    /* renamed from: h */
    public int mo962h() {
        return this.f915i.mo2948t();
    }

    /* renamed from: a */
    public void mo921a(float f) {
        C0962e0.m5472b((View) this.f915i.mo2939r(), f);
    }

    /* renamed from: b */
    public C0285f mo936b(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: c */
    public void mo944c(C0285f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: d */
    public void mo949d(CharSequence charSequence) {
        this.f915i.setWindowTitle(charSequence);
    }

    /* renamed from: a */
    public void mo933a(CharSequence charSequence) {
        this.f915i.mo2906a(charSequence);
    }

    /* renamed from: b */
    public void mo938b(C0283d dVar) {
        this.f920n.remove(dVar);
    }

    /* renamed from: d */
    public void mo950d(boolean z) {
        mo922a(z ? 4 : 0, 4);
    }

    /* renamed from: a */
    public void mo923a(Configuration configuration) {
        super.mo923a(configuration);
    }

    /* renamed from: b */
    public void mo941b(boolean z) {
        if (z != this.f919m) {
            this.f919m = z;
            int size = this.f920n.size();
            for (int i = 0; i < size; i++) {
                ((C0283d) this.f920n.get(i)).mo992a(z);
            }
        }
    }

    /* renamed from: a */
    public void mo927a(SpinnerAdapter spinnerAdapter, C0284e eVar) {
        this.f915i.mo2903a(spinnerAdapter, (OnItemSelectedListener) new C0302i(eVar));
    }

    /* renamed from: a */
    public void mo922a(int i, int i2) {
        this.f915i.mo2908b((i & i2) | ((i2 ^ -1) & this.f915i.mo2948t()));
    }

    /* renamed from: a */
    public void mo924a(@C0195i0 Drawable drawable) {
        this.f915i.mo2899a(drawable);
    }

    /* renamed from: a */
    public void mo929a(C0285f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo932a(C0285f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo930a(C0285f fVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo931a(C0285f fVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public boolean mo935a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo916A();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo934a(int i, KeyEvent keyEvent) {
        Menu G = m1518G();
        if (G == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        G.setQwertyMode(z);
        return G.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo928a(C0283d dVar) {
        this.f920n.add(dVar);
    }
}
