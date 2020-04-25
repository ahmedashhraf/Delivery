package androidx.appcompat.p011d;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.p011d.C0338b.C0339a;
import androidx.appcompat.view.menu.C0377k;
import androidx.appcompat.view.menu.C0390p;
import androidx.collection.C0649h;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p024e.p025b.C0887b;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.d.f */
/* compiled from: SupportActionModeWrapper */
public class C0343f extends ActionMode {

    /* renamed from: a */
    final Context f1125a;

    /* renamed from: b */
    final C0338b f1126b;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.d.f$a */
    /* compiled from: SupportActionModeWrapper */
    public static class C0344a implements C0339a {

        /* renamed from: a */
        final Callback f1127a;

        /* renamed from: b */
        final Context f1128b;

        /* renamed from: c */
        final ArrayList<C0343f> f1129c = new ArrayList<>();

        /* renamed from: d */
        final C0649h<Menu, Menu> f1130d = new C0649h<>();

        public C0344a(Context context, Callback callback) {
            this.f1128b = context;
            this.f1127a = callback;
        }

        /* renamed from: a */
        public boolean mo875a(C0338b bVar, Menu menu) {
            return this.f1127a.onCreateActionMode(mo1353b(bVar), m1925a(menu));
        }

        /* renamed from: b */
        public boolean mo877b(C0338b bVar, Menu menu) {
            return this.f1127a.onPrepareActionMode(mo1353b(bVar), m1925a(menu));
        }

        /* renamed from: a */
        public boolean mo876a(C0338b bVar, MenuItem menuItem) {
            return this.f1127a.onActionItemClicked(mo1353b(bVar), new C0377k(this.f1128b, (C0887b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo1353b(C0338b bVar) {
            int size = this.f1129c.size();
            for (int i = 0; i < size; i++) {
                C0343f fVar = (C0343f) this.f1129c.get(i);
                if (fVar != null && fVar.f1126b == bVar) {
                    return fVar;
                }
            }
            C0343f fVar2 = new C0343f(this.f1128b, bVar);
            this.f1129c.add(fVar2);
            return fVar2;
        }

        /* renamed from: a */
        public void mo874a(C0338b bVar) {
            this.f1127a.onDestroyActionMode(mo1353b(bVar));
        }

        /* renamed from: a */
        private Menu m1925a(Menu menu) {
            Menu menu2 = (Menu) this.f1130d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0390p pVar = new C0390p(this.f1128b, (C0886a) menu);
            this.f1130d.put(menu, pVar);
            return pVar;
        }
    }

    public C0343f(Context context, C0338b bVar) {
        this.f1125a = context;
        this.f1126b = bVar;
    }

    public void finish() {
        this.f1126b.mo1121a();
    }

    public View getCustomView() {
        return this.f1126b.mo1128b();
    }

    public Menu getMenu() {
        return new C0390p(this.f1125a, (C0886a) this.f1126b.mo1132c());
    }

    public MenuInflater getMenuInflater() {
        return this.f1126b.mo1133d();
    }

    public CharSequence getSubtitle() {
        return this.f1126b.mo1134e();
    }

    public Object getTag() {
        return this.f1126b.mo1319f();
    }

    public CharSequence getTitle() {
        return this.f1126b.mo1135g();
    }

    public boolean getTitleOptionalHint() {
        return this.f1126b.mo1320h();
    }

    public void invalidate() {
        this.f1126b.mo1136i();
    }

    public boolean isTitleOptional() {
        return this.f1126b.mo1137j();
    }

    public void setCustomView(View view) {
        this.f1126b.mo1123a(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1126b.mo1126a(charSequence);
    }

    public void setTag(Object obj) {
        this.f1126b.mo1318a(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1126b.mo1130b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1126b.mo1127a(z);
    }

    public void setSubtitle(int i) {
        this.f1126b.mo1122a(i);
    }

    public void setTitle(int i) {
        this.f1126b.mo1129b(i);
    }
}
