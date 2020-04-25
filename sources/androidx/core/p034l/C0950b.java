package androidx.core.p034l;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.core.l.b */
/* compiled from: ActionProvider */
public abstract class C0950b {

    /* renamed from: d */
    private static final String f4286d = "ActionProvider(support)";

    /* renamed from: a */
    private final Context f4287a;

    /* renamed from: b */
    private C0951a f4288b;

    /* renamed from: c */
    private C0952b f4289c;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.core.l.b$a */
    /* compiled from: ActionProvider */
    public interface C0951a {
        /* renamed from: b */
        void mo1949b(boolean z);
    }

    /* renamed from: androidx.core.l.b$b */
    /* compiled from: ActionProvider */
    public interface C0952b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0950b(Context context) {
        this.f4287a = context;
    }

    /* renamed from: a */
    public Context mo4765a() {
        return this.f4287a;
    }

    /* renamed from: a */
    public void mo1751a(SubMenu subMenu) {
    }

    /* renamed from: b */
    public boolean mo1752b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo1757c() {
        return true;
    }

    /* renamed from: d */
    public abstract View mo1753d();

    /* renamed from: e */
    public boolean mo1754e() {
        return false;
    }

    /* renamed from: f */
    public boolean mo1758f() {
        return false;
    }

    /* renamed from: g */
    public void mo1759g() {
        if (this.f4289c != null && mo1758f()) {
            this.f4289c.onActionProviderVisibilityChanged(mo1757c());
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public void mo4768h() {
        this.f4289c = null;
        this.f4288b = null;
    }

    /* renamed from: a */
    public View mo1755a(MenuItem menuItem) {
        return mo1753d();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo4767a(boolean z) {
        C0951a aVar = this.f4288b;
        if (aVar != null) {
            aVar.mo1949b(z);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo4766a(C0951a aVar) {
        this.f4288b = aVar;
    }

    /* renamed from: a */
    public void mo1756a(C0952b bVar) {
        if (!(this.f4289c == null || bVar == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            sb.toString();
        }
        this.f4289c = bVar;
    }
}
