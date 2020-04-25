package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o.C0389a;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.e */
/* compiled from: ListMenuPresenter */
public class C0367e implements C0386n, OnItemClickListener {

    /* renamed from: V */
    private static final String f1312V = "ListMenuPresenter";

    /* renamed from: W */
    public static final String f1313W = "android:menu:list";

    /* renamed from: N */
    C0370g f1314N;

    /* renamed from: O */
    ExpandedMenuView f1315O;

    /* renamed from: P */
    int f1316P;

    /* renamed from: Q */
    int f1317Q;

    /* renamed from: R */
    int f1318R;

    /* renamed from: S */
    private C0387a f1319S;

    /* renamed from: T */
    C0368a f1320T;

    /* renamed from: U */
    private int f1321U;

    /* renamed from: a */
    Context f1322a;

    /* renamed from: b */
    LayoutInflater f1323b;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* compiled from: ListMenuPresenter */
    private class C0368a extends BaseAdapter {

        /* renamed from: a */
        private int f1324a = -1;

        public C0368a() {
            mo1535a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1535a() {
            C0375j g = C0367e.this.f1314N.mo1604g();
            if (g != null) {
                ArrayList k = C0367e.this.f1314N.mo1611k();
                int size = k.size();
                for (int i = 0; i < size; i++) {
                    if (((C0375j) k.get(i)) == g) {
                        this.f1324a = i;
                        return;
                    }
                }
            }
            this.f1324a = -1;
        }

        public int getCount() {
            int size = C0367e.this.f1314N.mo1611k().size() - C0367e.this.f1316P;
            return this.f1324a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0367e eVar = C0367e.this;
                view = eVar.f1323b.inflate(eVar.f1318R, viewGroup, false);
            }
            ((C0389a) view).mo1387a(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo1535a();
            super.notifyDataSetChanged();
        }

        public C0375j getItem(int i) {
            ArrayList k = C0367e.this.f1314N.mo1611k();
            int i2 = i + C0367e.this.f1316P;
            int i3 = this.f1324a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0375j) k.get(i2);
        }
    }

    public C0367e(Context context, int i) {
        this(i, 0);
        this.f1322a = context;
        this.f1323b = LayoutInflater.from(this.f1322a);
    }

    /* renamed from: a */
    public void mo1484a(Context context, C0370g gVar) {
        int i = this.f1317Q;
        if (i != 0) {
            this.f1322a = new ContextThemeWrapper(context, i);
            this.f1323b = LayoutInflater.from(this.f1322a);
        } else if (this.f1322a != null) {
            this.f1322a = context;
            if (this.f1323b == null) {
                this.f1323b = LayoutInflater.from(this.f1322a);
            }
        }
        this.f1314N = gVar;
        C0368a aVar = this.f1320T;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1493a(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: b */
    public ListAdapter mo1530b() {
        if (this.f1320T == null) {
            this.f1320T = new C0368a();
        }
        return this.f1320T;
    }

    /* renamed from: b */
    public boolean mo1497b(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo1512c() {
        if (this.f1315O == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo1532b(bundle);
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1533d() {
        return this.f1316P;
    }

    public int getId() {
        return this.f1321U;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1314N.mo1567a((MenuItem) this.f1320T.getItem(i), (C0386n) this, 0);
    }

    public C0367e(int i, int i2) {
        this.f1318R = i;
        this.f1317Q = i2;
    }

    /* renamed from: b */
    public void mo1531b(int i) {
        this.f1316P = i;
        if (this.f1315O != null) {
            mo1489a(false);
        }
    }

    /* renamed from: b */
    public void mo1532b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f1315O;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f1313W, sparseArray);
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        if (this.f1315O == null) {
            this.f1315O = (ExpandedMenuView) this.f1323b.inflate(C0238R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1320T == null) {
                this.f1320T = new C0368a();
            }
            this.f1315O.setAdapter(this.f1320T);
            this.f1315O.setOnItemClickListener(this);
        }
        return this.f1315O;
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        C0368a aVar = this.f1320T;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
        this.f1319S = aVar;
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new C0373h(sVar).mo1632a((IBinder) null);
        C0387a aVar = this.f1319S;
        if (aVar != null) {
            aVar.mo873a(sVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        C0387a aVar = this.f1319S;
        if (aVar != null) {
            aVar.mo872a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo1529a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f1313W);
        if (sparseParcelableArray != null) {
            this.f1315O.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: a */
    public void mo1528a(int i) {
        this.f1321U = i;
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
        mo1529a((Bundle) parcelable);
    }
}
