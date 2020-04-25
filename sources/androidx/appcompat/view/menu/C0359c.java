package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.C0635a;
import androidx.core.p024e.p025b.C0887b;
import androidx.core.p024e.p025b.C0888c;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.appcompat.view.menu.c */
/* compiled from: BaseMenuWrapper */
abstract class C0359c {

    /* renamed from: l */
    final Context f1269l;

    /* renamed from: m */
    private Map<C0887b, MenuItem> f1270m;

    /* renamed from: n */
    private Map<C0888c, SubMenu> f1271n;

    C0359c(Context context) {
        this.f1269l = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo1499a(MenuItem menuItem) {
        if (!(menuItem instanceof C0887b)) {
            return menuItem;
        }
        C0887b bVar = (C0887b) menuItem;
        if (this.f1270m == null) {
            this.f1270m = new C0635a();
        }
        MenuItem menuItem2 = (MenuItem) this.f1270m.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0377k kVar = new C0377k(this.f1269l, bVar);
        this.f1270m.put(bVar, kVar);
        return kVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1502b(int i) {
        Map<C0887b, MenuItem> map = this.f1270m;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1503d() {
        Map<C0887b, MenuItem> map = this.f1270m;
        if (map != null) {
            map.clear();
        }
        Map<C0888c, SubMenu> map2 = this.f1271n;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo1500a(SubMenu subMenu) {
        if (!(subMenu instanceof C0888c)) {
            return subMenu;
        }
        C0888c cVar = (C0888c) subMenu;
        if (this.f1271n == null) {
            this.f1271n = new C0635a();
        }
        SubMenu subMenu2 = (SubMenu) this.f1271n.get(cVar);
        if (subMenu2 == null) {
            subMenu2 = new C0396t(this.f1269l, cVar);
            this.f1271n.put(cVar, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1501a(int i) {
        Map<C0887b, MenuItem> map = this.f1270m;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }
}
