package androidx.appcompat.p011d;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0384m;
import androidx.appcompat.view.menu.C0395s;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.d.e */
/* compiled from: StandaloneActionMode */
public class C0342e extends C0338b implements C0371a {

    /* renamed from: N */
    private Context f1118N;

    /* renamed from: O */
    private ActionBarContextView f1119O;

    /* renamed from: P */
    private C0339a f1120P;

    /* renamed from: Q */
    private WeakReference<View> f1121Q;

    /* renamed from: R */
    private boolean f1122R;

    /* renamed from: S */
    private boolean f1123S;

    /* renamed from: T */
    private C0370g f1124T;

    public C0342e(Context context, ActionBarContextView actionBarContextView, C0339a aVar, boolean z) {
        this.f1118N = context;
        this.f1119O = actionBarContextView;
        this.f1120P = aVar;
        this.f1124T = new C0370g(actionBarContextView.getContext()).mo1593d(1);
        this.f1124T.mo1561a((C0371a) this);
        this.f1123S = z;
    }

    /* renamed from: a */
    public void mo1333a(C0370g gVar, boolean z) {
    }

    /* renamed from: a */
    public void mo1334a(C0395s sVar) {
    }

    /* renamed from: a */
    public void mo1126a(CharSequence charSequence) {
        this.f1119O.setSubtitle(charSequence);
    }

    /* renamed from: b */
    public void mo1130b(CharSequence charSequence) {
        this.f1119O.setTitle(charSequence);
    }

    /* renamed from: c */
    public Menu mo1132c() {
        return this.f1124T;
    }

    /* renamed from: d */
    public MenuInflater mo1133d() {
        return new C0345g(this.f1119O.getContext());
    }

    /* renamed from: e */
    public CharSequence mo1134e() {
        return this.f1119O.getSubtitle();
    }

    /* renamed from: g */
    public CharSequence mo1135g() {
        return this.f1119O.getTitle();
    }

    /* renamed from: i */
    public void mo1136i() {
        this.f1120P.mo877b(this, this.f1124T);
    }

    /* renamed from: j */
    public boolean mo1137j() {
        return this.f1119O.mo1866j();
    }

    /* renamed from: k */
    public boolean mo1321k() {
        return this.f1123S;
    }

    /* renamed from: a */
    public void mo1122a(int i) {
        mo1126a((CharSequence) this.f1118N.getString(i));
    }

    /* renamed from: b */
    public void mo1129b(int i) {
        mo1130b((CharSequence) this.f1118N.getString(i));
    }

    /* renamed from: a */
    public void mo1127a(boolean z) {
        super.mo1127a(z);
        this.f1119O.setTitleOptional(z);
    }

    /* renamed from: b */
    public View mo1128b() {
        WeakReference<View> weakReference = this.f1121Q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* renamed from: b */
    public boolean mo1335b(C0395s sVar) {
        if (!sVar.hasVisibleItems()) {
            return true;
        }
        new C0384m(this.f1119O.getContext(), sVar).mo1779f();
        return true;
    }

    /* renamed from: a */
    public void mo1123a(View view) {
        this.f1119O.setCustomView(view);
        this.f1121Q = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo1121a() {
        if (!this.f1122R) {
            this.f1122R = true;
            this.f1119O.sendAccessibilityEvent(32);
            this.f1120P.mo874a(this);
        }
    }

    /* renamed from: a */
    public boolean mo803a(C0370g gVar, MenuItem menuItem) {
        return this.f1120P.mo876a((C0338b) this, menuItem);
    }

    /* renamed from: a */
    public void mo796a(C0370g gVar) {
        mo1136i();
        this.f1119O.mo1864h();
    }
}
