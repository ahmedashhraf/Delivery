package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.transition.p */
/* compiled from: GhostViewHolder */
class C1932p extends FrameLayout {
    @C0193h0

    /* renamed from: a */
    private ViewGroup f7433a;

    /* renamed from: b */
    private boolean f7434b = true;

    C1932p(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f7433a = viewGroup;
        this.f7433a.setTag(C1822R.C1825id.ghost_view_holder, this);
        C1940s0.m10233a(this.f7433a).mo8446a(this);
    }

    /* renamed from: a */
    static C1932p m10201a(@C0193h0 ViewGroup viewGroup) {
        return (C1932p) viewGroup.getTag(C1822R.C1825id.ghost_view_holder);
    }

    public void onViewAdded(View view) {
        if (this.f7434b) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f7433a.setTag(C1822R.C1825id.ghost_view_holder, null);
            C1940s0.m10233a(this.f7433a).mo8447b(this);
            this.f7434b = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8442a() {
        if (this.f7434b) {
            C1940s0.m10233a(this.f7433a).mo8447b(this);
            C1940s0.m10233a(this.f7433a).mo8446a(this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8443a(C1936r rVar) {
        ArrayList arrayList = new ArrayList();
        m10202a(rVar.f7444N, arrayList);
        int a = m10200a(arrayList);
        if (a < 0 || a >= getChildCount()) {
            addView(rVar);
        } else {
            addView(rVar, a);
        }
    }

    /* renamed from: a */
    private int m10200a(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m10202a(((C1936r) getChildAt(i2)).f7444N, arrayList2);
            if (m10204a(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m10204a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            boolean z = false;
            if (arrayList.get(0) == arrayList2.get(0)) {
                int min = Math.min(arrayList.size(), arrayList2.size());
                for (int i = 1; i < min; i++) {
                    View view = (View) arrayList.get(i);
                    View view2 = (View) arrayList2.get(i);
                    if (view != view2) {
                        return m10203a(view, view2);
                    }
                }
                if (arrayList2.size() == min) {
                    z = true;
                }
                return z;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m10202a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m10202a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: a */
    private static boolean m10203a(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        boolean z = false;
        boolean z2 = true;
        if (VERSION.SDK_INT < 21 || view.getZ() == view2.getZ()) {
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(C1940s0.m10232a(viewGroup, i));
                if (childAt == view) {
                    z2 = false;
                    break;
                } else if (childAt == view2) {
                    break;
                } else {
                    i++;
                }
            }
            return z2;
        }
        if (view.getZ() > view2.getZ()) {
            z = true;
        }
        return z;
    }
}
