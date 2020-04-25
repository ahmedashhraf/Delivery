package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.C0188f;
import androidx.annotation.C0189f0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0384m;
import androidx.appcompat.view.menu.C0391q;

/* renamed from: androidx.appcompat.widget.i0 */
/* compiled from: PopupMenu */
public class C0512i0 {

    /* renamed from: a */
    private final Context f2056a;

    /* renamed from: b */
    private final C0370g f2057b;

    /* renamed from: c */
    private final View f2058c;

    /* renamed from: d */
    final C0384m f2059d;

    /* renamed from: e */
    C0517e f2060e;

    /* renamed from: f */
    C0516d f2061f;

    /* renamed from: g */
    private OnTouchListener f2062g;

    /* renamed from: androidx.appcompat.widget.i0$a */
    /* compiled from: PopupMenu */
    class C0513a implements C0371a {
        C0513a() {
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, MenuItem menuItem) {
            C0517e eVar = C0512i0.this.f2060e;
            if (eVar != null) {
                return eVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$b */
    /* compiled from: PopupMenu */
    class C0514b implements OnDismissListener {
        C0514b() {
        }

        public void onDismiss() {
            C0512i0 i0Var = C0512i0.this;
            C0516d dVar = i0Var.f2061f;
            if (dVar != null) {
                dVar.mo2688a(i0Var);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$c */
    /* compiled from: PopupMenu */
    class C0515c extends C0486d0 {
        C0515c(View view) {
            super(view);
        }

        /* renamed from: a */
        public C0391q mo1408a() {
            return C0512i0.this.f2059d.mo1776c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo1409b() {
            C0512i0.this.mo2686g();
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo1967c() {
            C0512i0.this.mo2676a();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.i0$d */
    /* compiled from: PopupMenu */
    public interface C0516d {
        /* renamed from: a */
        void mo2688a(C0512i0 i0Var);
    }

    /* renamed from: androidx.appcompat.widget.i0$e */
    /* compiled from: PopupMenu */
    public interface C0517e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0512i0(@C0193h0 Context context, @C0193h0 View view) {
        this(context, view, 0);
    }

    /* renamed from: a */
    public void mo2677a(@C0189f0 int i) {
        mo2684e().inflate(i, this.f2057b);
    }

    /* renamed from: b */
    public void mo2681b(int i) {
        this.f2059d.mo1769a(i);
    }

    /* renamed from: c */
    public int mo2682c() {
        return this.f2059d.mo1768a();
    }

    @C0193h0
    /* renamed from: d */
    public Menu mo2683d() {
        return this.f2057b;
    }

    @C0193h0
    /* renamed from: e */
    public MenuInflater mo2684e() {
        return new C0345g(this.f2056a);
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public ListView mo2685f() {
        if (!this.f2059d.mo1777d()) {
            return null;
        }
        return this.f2059d.mo1774b();
    }

    /* renamed from: g */
    public void mo2686g() {
        this.f2059d.mo1779f();
    }

    public C0512i0(@C0193h0 Context context, @C0193h0 View view, int i) {
        this(context, view, i, C0238R.attr.popupMenuStyle, 0);
    }

    /* renamed from: a */
    public void mo2676a() {
        this.f2059d.dismiss();
    }

    @C0193h0
    /* renamed from: b */
    public OnTouchListener mo2680b() {
        if (this.f2062g == null) {
            this.f2062g = new C0515c(this.f2058c);
        }
        return this.f2062g;
    }

    public C0512i0(@C0193h0 Context context, @C0193h0 View view, int i, @C0188f int i2, @C0216r0 int i3) {
        this.f2056a = context;
        this.f2058c = view;
        this.f2057b = new C0370g(context);
        this.f2057b.mo1561a((C0371a) new C0513a());
        C0384m mVar = new C0384m(context, this.f2057b, view, false, i2, i3);
        this.f2059d = mVar;
        this.f2059d.mo1769a(i);
        this.f2059d.mo1772a((OnDismissListener) new C0514b());
    }

    /* renamed from: a */
    public void mo2679a(@C0195i0 C0517e eVar) {
        this.f2060e = eVar;
    }

    /* renamed from: a */
    public void mo2678a(@C0195i0 C0516d dVar) {
        this.f2061f = dVar;
    }
}
