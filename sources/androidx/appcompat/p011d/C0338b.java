package androidx.appcompat.p011d;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;

/* renamed from: androidx.appcompat.d.b */
/* compiled from: ActionMode */
public abstract class C0338b {

    /* renamed from: a */
    private Object f1111a;

    /* renamed from: b */
    private boolean f1112b;

    /* renamed from: androidx.appcompat.d.b$a */
    /* compiled from: ActionMode */
    public interface C0339a {
        /* renamed from: a */
        void mo874a(C0338b bVar);

        /* renamed from: a */
        boolean mo875a(C0338b bVar, Menu menu);

        /* renamed from: a */
        boolean mo876a(C0338b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo877b(C0338b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract void mo1121a();

    /* renamed from: a */
    public abstract void mo1122a(int i);

    /* renamed from: a */
    public abstract void mo1123a(View view);

    /* renamed from: a */
    public abstract void mo1126a(CharSequence charSequence);

    /* renamed from: a */
    public void mo1318a(Object obj) {
        this.f1111a = obj;
    }

    /* renamed from: b */
    public abstract View mo1128b();

    /* renamed from: b */
    public abstract void mo1129b(int i);

    /* renamed from: b */
    public abstract void mo1130b(CharSequence charSequence);

    /* renamed from: c */
    public abstract Menu mo1132c();

    /* renamed from: d */
    public abstract MenuInflater mo1133d();

    /* renamed from: e */
    public abstract CharSequence mo1134e();

    /* renamed from: f */
    public Object mo1319f() {
        return this.f1111a;
    }

    /* renamed from: g */
    public abstract CharSequence mo1135g();

    /* renamed from: h */
    public boolean mo1320h() {
        return this.f1112b;
    }

    /* renamed from: i */
    public abstract void mo1136i();

    /* renamed from: j */
    public boolean mo1137j() {
        return false;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: k */
    public boolean mo1321k() {
        return true;
    }

    /* renamed from: a */
    public void mo1127a(boolean z) {
        this.f1112b = z;
    }
}
