package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0370g.C0372b;
import androidx.appcompat.widget.C0549t0;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements C0372b, C0388o, OnItemClickListener {

    /* renamed from: N */
    private static final int[] f1209N = {16842964, 16843049};

    /* renamed from: a */
    private C0370g f1210a;

    /* renamed from: b */
    private int f1211b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    /* renamed from: a */
    public void mo1411a(C0370g gVar) {
        this.f1210a = gVar;
    }

    public int getWindowAnimations() {
        return this.f1211b;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo1412a((C0375j) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0549t0 a = C0549t0.m2910a(context, attributeSet, f1209N, i, 0);
        if (a.mo2892j(0)) {
            setBackgroundDrawable(a.mo2875b(0));
        }
        if (a.mo2892j(1)) {
            setDivider(a.mo2875b(1));
        }
        a.mo2887f();
    }

    /* renamed from: a */
    public boolean mo1412a(C0375j jVar) {
        return this.f1210a.mo1566a((MenuItem) jVar, 0);
    }
}
