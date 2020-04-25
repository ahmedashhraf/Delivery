package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.view.menu.C0388o.C0389a;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuAdapter */
public class C0369f extends BaseAdapter {

    /* renamed from: N */
    private boolean f1326N;

    /* renamed from: O */
    private final boolean f1327O;

    /* renamed from: P */
    private final LayoutInflater f1328P;

    /* renamed from: Q */
    private final int f1329Q;

    /* renamed from: a */
    C0370g f1330a;

    /* renamed from: b */
    private int f1331b = -1;

    public C0369f(C0370g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1327O = z;
        this.f1328P = layoutInflater;
        this.f1330a = gVar;
        this.f1329Q = i;
        mo1541a();
    }

    /* renamed from: a */
    public void mo1542a(boolean z) {
        this.f1326N = z;
    }

    /* renamed from: b */
    public C0370g mo1543b() {
        return this.f1330a;
    }

    /* renamed from: c */
    public boolean mo1544c() {
        return this.f1326N;
    }

    public int getCount() {
        ArrayList k = this.f1327O ? this.f1330a.mo1611k() : this.f1330a.mo1615o();
        if (this.f1331b < 0) {
            return k.size();
        }
        return k.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1328P.inflate(this.f1329Q, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1330a.mo1616p() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0389a aVar = (C0389a) view;
        if (this.f1326N) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1387a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo1541a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1541a() {
        C0375j g = this.f1330a.mo1604g();
        if (g != null) {
            ArrayList k = this.f1330a.mo1611k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (((C0375j) k.get(i)) == g) {
                    this.f1331b = i;
                    return;
                }
            }
        }
        this.f1331b = -1;
    }

    public C0375j getItem(int i) {
        ArrayList k = this.f1327O ? this.f1330a.mo1611k() : this.f1330a.mo1615o();
        int i2 = this.f1331b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0375j) k.get(i);
    }
}
