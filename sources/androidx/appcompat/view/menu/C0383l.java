package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.appcompat.view.menu.l */
/* compiled from: MenuPopup */
abstract class C0383l implements C0391q, C0386n, OnItemClickListener {

    /* renamed from: a */
    private Rect f1421a;

    C0383l() {
    }

    /* renamed from: b */
    protected static boolean m2175b(C0370g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo1504a(int i);

    /* renamed from: a */
    public void mo1484a(@C0193h0 Context context, @C0195i0 C0370g gVar) {
    }

    /* renamed from: a */
    public void mo1765a(Rect rect) {
        this.f1421a = rect;
    }

    /* renamed from: a */
    public abstract void mo1506a(View view);

    /* renamed from: a */
    public abstract void mo1507a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo1508a(C0370g gVar);

    /* renamed from: a */
    public boolean mo1493a(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo1510b(int i);

    /* renamed from: b */
    public abstract void mo1511b(boolean z);

    /* renamed from: b */
    public boolean mo1497b(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: c */
    public abstract void mo1513c(int i);

    /* renamed from: c */
    public abstract void mo1514c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo1517e() {
        return true;
    }

    /* renamed from: g */
    public Rect mo1766g() {
        return this.f1421a;
    }

    public int getId() {
        return 0;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m2174a(listAdapter).f1330a.mo1567a((MenuItem) listAdapter.getItem(i), (C0386n) this, mo1517e() ? 0 : 4);
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    /* renamed from: a */
    protected static int m2173a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: a */
    protected static C0369f m2174a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0369f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0369f) listAdapter;
    }
}
