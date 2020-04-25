package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.content.C0841b;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.C0983f0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuBuilder */
public class C0370g implements C0886a {

    /* renamed from: M */
    private static final String f1332M = "MenuBuilder";

    /* renamed from: N */
    private static final String f1333N = "android:menu:presenters";

    /* renamed from: O */
    private static final String f1334O = "android:menu:actionviewstates";

    /* renamed from: P */
    private static final String f1335P = "android:menu:expandedactionview";

    /* renamed from: Q */
    private static final int[] f1336Q = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    View f1337A;

    /* renamed from: B */
    private SparseArray<Parcelable> f1338B;

    /* renamed from: C */
    private boolean f1339C = false;

    /* renamed from: D */
    private boolean f1340D = false;

    /* renamed from: E */
    private boolean f1341E = false;

    /* renamed from: F */
    private boolean f1342F = false;

    /* renamed from: G */
    private boolean f1343G = false;

    /* renamed from: H */
    private ArrayList<C0375j> f1344H = new ArrayList<>();

    /* renamed from: I */
    private CopyOnWriteArrayList<WeakReference<C0386n>> f1345I = new CopyOnWriteArrayList<>();

    /* renamed from: J */
    private C0375j f1346J;

    /* renamed from: K */
    private boolean f1347K = false;

    /* renamed from: L */
    private boolean f1348L;

    /* renamed from: l */
    private final Context f1349l;

    /* renamed from: m */
    private final Resources f1350m;

    /* renamed from: n */
    private boolean f1351n;

    /* renamed from: o */
    private boolean f1352o;

    /* renamed from: p */
    private C0371a f1353p;

    /* renamed from: q */
    private ArrayList<C0375j> f1354q;

    /* renamed from: r */
    private ArrayList<C0375j> f1355r;

    /* renamed from: s */
    private boolean f1356s;

    /* renamed from: t */
    private ArrayList<C0375j> f1357t;

    /* renamed from: u */
    private ArrayList<C0375j> f1358u;

    /* renamed from: v */
    private boolean f1359v;

    /* renamed from: w */
    private int f1360w = 0;

    /* renamed from: x */
    private ContextMenuInfo f1361x;

    /* renamed from: y */
    CharSequence f1362y;

    /* renamed from: z */
    Drawable f1363z;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0371a {
        /* renamed from: a */
        void mo796a(C0370g gVar);

        /* renamed from: a */
        boolean mo803a(C0370g gVar, MenuItem menuItem);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0372b {
        /* renamed from: a */
        boolean mo1412a(C0375j jVar);
    }

    public C0370g(Context context) {
        this.f1349l = context;
        this.f1350m = context.getResources();
        this.f1354q = new ArrayList<>();
        this.f1355r = new ArrayList<>();
        this.f1356s = true;
        this.f1357t = new ArrayList<>();
        this.f1358u = new ArrayList<>();
        this.f1359v = true;
        m2067g(true);
    }

    /* renamed from: e */
    private void m2063e(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f1333N);
        if (sparseParcelableArray != null && !this.f1345I.isEmpty()) {
            Iterator it = this.f1345I.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    int id = nVar.getId();
                    if (id > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(id);
                        if (parcelable != null) {
                            nVar.mo1505a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m2065f(boolean z) {
        if (!this.f1345I.isEmpty()) {
            mo1630t();
            Iterator it = this.f1345I.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    nVar.mo1489a(z);
                }
            }
            mo1623s();
        }
    }

    /* renamed from: g */
    private static int m2066g(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1336Q;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void mo1562a(C0386n nVar) {
        mo1563a(nVar, this.f1349l);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo1552a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1349l.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo1582b(C0386n nVar) {
        Iterator it = this.f1345I.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0386n nVar2 = (C0386n) weakReference.get();
            if (nVar2 == null || nVar2 == nVar) {
                this.f1345I.remove(weakReference);
            }
        }
    }

    /* renamed from: c */
    public void mo1587c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(f1335P, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0395s) item.getSubMenu()).mo1587c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1599e(), sparseArray);
        }
    }

    public void clear() {
        C0375j jVar = this.f1346J;
        if (jVar != null) {
            mo1569a(jVar);
        }
        this.f1354q.clear();
        mo1583b(true);
    }

    public void clearHeader() {
        this.f1363z = null;
        this.f1362y = null;
        this.f1337A = null;
        mo1583b(false);
    }

    public void close() {
        mo1565a(true);
    }

    /* renamed from: d */
    public C0370g mo1593d(int i) {
        this.f1360w = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo1599e() {
        return f1334O;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0375j jVar = (C0375j) this.f1354q.get(i2);
            if (jVar.getItemId() == i) {
                return jVar;
            }
            if (jVar.hasSubMenu()) {
                MenuItem findItem = jVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f1354q.get(i);
    }

    /* renamed from: h */
    public Drawable mo1606h() {
        return this.f1363z;
    }

    public boolean hasVisibleItems() {
        if (this.f1348L) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0375j) this.f1354q.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public CharSequence mo1608i() {
        return this.f1362y;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1556a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public View mo1610j() {
        return this.f1337A;
    }

    /* renamed from: k */
    public ArrayList<C0375j> mo1611k() {
        mo1585c();
        return this.f1358u;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo1612l() {
        return this.f1342F;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Resources mo1613m() {
        return this.f1350m;
    }

    /* renamed from: n */
    public C0370g mo1614n() {
        return this;
    }

    @C0193h0
    /* renamed from: o */
    public ArrayList<C0375j> mo1615o() {
        if (!this.f1356s) {
            return this.f1355r;
        }
        this.f1355r.clear();
        int size = this.f1354q.size();
        for (int i = 0; i < size; i++) {
            C0375j jVar = (C0375j) this.f1354q.get(i);
            if (jVar.isVisible()) {
                this.f1355r.add(jVar);
            }
        }
        this.f1356s = false;
        this.f1359v = true;
        return this.f1355r;
    }

    /* renamed from: p */
    public boolean mo1616p() {
        return this.f1347K;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo1566a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0375j a = mo1556a(i, keyEvent);
        boolean a2 = a != null ? mo1566a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo1565a(true);
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo1619q() {
        return this.f1351n;
    }

    /* renamed from: r */
    public boolean mo1620r() {
        return this.f1352o;
    }

    public void removeGroup(int i) {
        int a = mo1550a(i);
        if (a >= 0) {
            int size = this.f1354q.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0375j) this.f1354q.get(a)).getGroupId() != i) {
                    mo1583b(true);
                } else {
                    m2061a(a, false);
                    i2 = i3;
                }
            }
            mo1583b(true);
        }
    }

    public void removeItem(int i) {
        m2061a(mo1579b(i), true);
    }

    /* renamed from: s */
    public void mo1623s() {
        this.f1339C = false;
        if (this.f1340D) {
            this.f1340D = false;
            mo1583b(this.f1341E);
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1354q.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0375j jVar = (C0375j) this.f1354q.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.mo1645c(z2);
                jVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1347K = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1354q.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0375j jVar = (C0375j) this.f1354q.get(i2);
            if (jVar.getGroupId() == i) {
                jVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f1354q.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0375j jVar = (C0375j) this.f1354q.get(i2);
            if (jVar.getGroupId() == i && jVar.mo1649e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1583b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1351n = z;
        mo1583b(false);
    }

    public int size() {
        return this.f1354q.size();
    }

    /* renamed from: t */
    public void mo1630t() {
        if (!this.f1339C) {
            this.f1339C = true;
            this.f1340D = false;
            this.f1341E = false;
        }
    }

    /* renamed from: a */
    public void mo1563a(C0386n nVar, Context context) {
        this.f1345I.add(new WeakReference(nVar));
        nVar.mo1484a(context, this);
        this.f1359v = true;
    }

    public MenuItem add(int i) {
        return mo1552a(0, 0, 0, this.f1350m.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1350m.getString(i));
    }

    /* renamed from: d */
    public void mo1595d(Bundle bundle) {
        m2064f(bundle);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1552a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0375j jVar = (C0375j) mo1552a(i, i2, i3, charSequence);
        C0395s sVar = new C0395s(this.f1349l, this, jVar);
        jVar.mo1642a(sVar);
        return sVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo1596d(C0375j jVar) {
        this.f1356s = true;
        mo1583b(true);
    }

    /* renamed from: g */
    private void m2067g(boolean z) {
        boolean z2 = true;
        if (!z || this.f1350m.getConfiguration().keyboard == 1 || !C0983f0.m5635d(ViewConfiguration.get(this.f1349l), this.f1349l)) {
            z2 = false;
        }
        this.f1352o = z2;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo1552a(i, i2, i3, this.f1350m.getString(i4));
    }

    /* renamed from: b */
    public void mo1581b(Bundle bundle) {
        m2063e(bundle);
    }

    /* renamed from: a */
    private boolean m2062a(C0395s sVar, C0386n nVar) {
        boolean z = false;
        if (this.f1345I.isEmpty()) {
            return false;
        }
        if (nVar != null) {
            z = nVar.mo1494a(sVar);
        }
        Iterator it = this.f1345I.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0386n nVar2 = (C0386n) weakReference.get();
            if (nVar2 == null) {
                this.f1345I.remove(weakReference);
            } else if (!z) {
                z = nVar2.mo1494a(sVar);
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo1580b() {
        this.f1339C = true;
        clear();
        clearHeader();
        this.f1345I.clear();
        this.f1339C = false;
        this.f1340D = false;
        this.f1341E = false;
        mo1583b(true);
    }

    /* renamed from: d */
    public ArrayList<C0375j> mo1594d() {
        mo1585c();
        return this.f1357t;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1350m.getString(i4));
    }

    /* renamed from: d */
    public void mo1597d(boolean z) {
        this.f1348L = z;
    }

    /* renamed from: f */
    private void m2064f(Bundle bundle) {
        if (!this.f1345I.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f1345I.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    int id = nVar.getId();
                    if (id > 0) {
                        Parcelable c = nVar.mo1512c();
                        if (c != null) {
                            sparseArray.put(id, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray(f1333N, sparseArray);
        }
    }

    /* renamed from: g */
    public C0375j mo1604g() {
        return this.f1346J;
    }

    /* renamed from: e */
    public void mo1600e(boolean z) {
        if (this.f1352o != z) {
            m2067g(z);
            mo1583b(false);
        }
    }

    /* renamed from: a */
    public void mo1558a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1599e());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0395s) item.getSubMenu()).mo1558a(bundle);
                }
            }
            int i2 = bundle.getInt(f1335P);
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0370g mo1598e(int i) {
        m2060a(0, null, i, null, null);
        return this;
    }

    /* renamed from: b */
    public int mo1579b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0375j) this.f1354q.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public void mo1586c(int i) {
        m2061a(i, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo1588c(C0375j jVar) {
        this.f1359v = true;
        mo1583b(true);
    }

    /* renamed from: b */
    public void mo1583b(boolean z) {
        if (!this.f1339C) {
            if (z) {
                this.f1356s = true;
                this.f1359v = true;
            }
            m2065f(z);
            return;
        }
        this.f1340D = true;
        if (z) {
            this.f1341E = true;
        }
    }

    /* renamed from: c */
    public void mo1585c() {
        ArrayList o = mo1615o();
        if (this.f1359v) {
            Iterator it = this.f1345I.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    z |= nVar.mo1490a();
                }
            }
            if (z) {
                this.f1357t.clear();
                this.f1358u.clear();
                int size = o.size();
                for (int i = 0; i < size; i++) {
                    C0375j jVar = (C0375j) o.get(i);
                    if (jVar.mo1672k()) {
                        this.f1357t.add(jVar);
                    } else {
                        this.f1358u.add(jVar);
                    }
                }
            } else {
                this.f1357t.clear();
                this.f1358u.clear();
                this.f1358u.addAll(mo1615o());
            }
            this.f1359v = false;
        }
    }

    /* renamed from: f */
    public Context mo1601f() {
        return this.f1349l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0370g mo1602f(int i) {
        m2060a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: b */
    public boolean mo1584b(C0375j jVar) {
        boolean z = false;
        if (this.f1345I.isEmpty()) {
            return false;
        }
        mo1630t();
        Iterator it = this.f1345I.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0386n nVar = (C0386n) weakReference.get();
            if (nVar == null) {
                this.f1345I.remove(weakReference);
            } else {
                z = nVar.mo1497b(this, jVar);
                if (z) {
                    break;
                }
            }
        }
        mo1623s();
        if (z) {
            this.f1346J = jVar;
        }
        return z;
    }

    /* renamed from: a */
    public void mo1561a(C0371a aVar) {
        this.f1353p = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo1552a(int i, int i2, int i3, CharSequence charSequence) {
        int g = m2066g(i3);
        C0375j a = m2059a(i, i2, i3, g, charSequence, this.f1360w);
        ContextMenuInfo contextMenuInfo = this.f1361x;
        if (contextMenuInfo != null) {
            a.mo1641a(contextMenuInfo);
        }
        ArrayList<C0375j> arrayList = this.f1354q;
        arrayList.add(m2058a(arrayList, g), a);
        mo1583b(true);
        return a;
    }

    /* renamed from: a */
    private C0375j m2059a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0375j jVar = new C0375j(this, i, i2, i3, i4, charSequence, i5);
        return jVar;
    }

    /* renamed from: a */
    private void m2061a(int i, boolean z) {
        if (i >= 0 && i < this.f1354q.size()) {
            this.f1354q.remove(i);
            if (z) {
                mo1583b(true);
            }
        }
    }

    /* renamed from: c */
    public void mo1589c(boolean z) {
        this.f1342F = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1560a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1354q.size();
        mo1630t();
        for (int i = 0; i < size; i++) {
            C0375j jVar = (C0375j) this.f1354q.get(i);
            if (jVar.getGroupId() == groupId && jVar.mo1673l() && jVar.isCheckable()) {
                jVar.mo1644b(jVar == menuItem);
            }
        }
        mo1623s();
    }

    /* renamed from: a */
    public int mo1550a(int i) {
        return mo1551a(i, 0);
    }

    /* renamed from: a */
    public int mo1551a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0375j) this.f1354q.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1568a(C0370g gVar, MenuItem menuItem) {
        C0371a aVar = this.f1353p;
        return aVar != null && aVar.mo803a(gVar, menuItem);
    }

    /* renamed from: a */
    public void mo1557a() {
        C0371a aVar = this.f1353p;
        if (aVar != null) {
            aVar.mo796a(this);
        }
    }

    /* renamed from: a */
    private static int m2058a(ArrayList<C0375j> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0375j) arrayList.get(size)).mo1650f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1564a(List<C0375j> list, int i, KeyEvent keyEvent) {
        boolean q = mo1619q();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1354q.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0375j jVar = (C0375j) this.f1354q.get(i2);
                if (jVar.hasSubMenu()) {
                    ((C0370g) jVar.getSubMenu()).mo1564a(list, i, keyEvent);
                }
                char alphabeticShortcut = q ? jVar.getAlphabeticShortcut() : jVar.getNumericShortcut();
                if (((modifiers & C0886a.f4061e) == ((q ? jVar.getAlphabeticModifiers() : jVar.getNumericModifiers()) & C0886a.f4061e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (q && alphabeticShortcut == 8 && i == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0375j mo1556a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0375j> arrayList = this.f1344H;
        arrayList.clear();
        mo1564a((List<C0375j>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0375j) arrayList.get(0);
        }
        boolean q = mo1619q();
        for (int i2 = 0; i2 < size; i2++) {
            C0375j jVar = (C0375j) arrayList.get(i2);
            if (q) {
                c = jVar.getAlphabeticShortcut();
            } else {
                c = jVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (q && c == 8 && i == 67))) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1566a(MenuItem menuItem, int i) {
        return mo1567a(menuItem, (C0386n) null, i);
    }

    /* renamed from: a */
    public boolean mo1567a(MenuItem menuItem, C0386n nVar, int i) {
        C0375j jVar = (C0375j) menuItem;
        if (jVar == null || !jVar.isEnabled()) {
            return false;
        }
        boolean j = jVar.mo1671j();
        C0950b a = jVar.mo1423a();
        boolean z = a != null && a.mo1752b();
        if (jVar.mo1666i()) {
            j |= jVar.expandActionView();
            if (j) {
                mo1565a(true);
            }
        } else if (jVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo1565a(false);
            }
            if (!jVar.hasSubMenu()) {
                jVar.mo1642a(new C0395s(mo1601f(), this, jVar));
            }
            C0395s sVar = (C0395s) jVar.getSubMenu();
            if (z) {
                a.mo1751a((SubMenu) sVar);
            }
            j |= m2062a(sVar, nVar);
            if (!j) {
                mo1565a(true);
            }
        } else if ((i & 1) == 0) {
            mo1565a(true);
        }
        return j;
    }

    /* renamed from: a */
    public final void mo1565a(boolean z) {
        if (!this.f1343G) {
            this.f1343G = true;
            Iterator it = this.f1345I.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    nVar.mo1486a(this, z);
                }
            }
            this.f1343G = false;
        }
    }

    /* renamed from: a */
    private void m2060a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m = mo1613m();
        if (view != null) {
            this.f1337A = view;
            this.f1362y = null;
            this.f1363z = null;
        } else {
            if (i > 0) {
                this.f1362y = m.getText(i);
            } else if (charSequence != null) {
                this.f1362y = charSequence;
            }
            if (i2 > 0) {
                this.f1363z = C0841b.m4928c(mo1601f(), i2);
            } else if (drawable != null) {
                this.f1363z = drawable;
            }
            this.f1337A = null;
        }
        mo1583b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0370g mo1555a(CharSequence charSequence) {
        m2060a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0370g mo1553a(Drawable drawable) {
        m2060a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0370g mo1554a(View view) {
        m2060a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public void mo1559a(ContextMenuInfo contextMenuInfo) {
        this.f1361x = contextMenuInfo;
    }

    /* renamed from: a */
    public boolean mo1569a(C0375j jVar) {
        boolean z = false;
        if (!this.f1345I.isEmpty() && this.f1346J == jVar) {
            mo1630t();
            Iterator it = this.f1345I.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0386n nVar = (C0386n) weakReference.get();
                if (nVar == null) {
                    this.f1345I.remove(weakReference);
                } else {
                    z = nVar.mo1493a(this, jVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1623s();
            if (z) {
                this.f1346J = null;
            }
        }
        return z;
    }
}
