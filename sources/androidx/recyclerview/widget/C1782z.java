package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: androidx.recyclerview.widget.z */
/* compiled from: ScrollbarHelper */
class C1782z {
    private C1782z() {
    }

    /* renamed from: a */
    static int m9639a(State state, C1775w wVar, View view, View view2, C1651o oVar, boolean z, boolean z2) {
        int i;
        if (oVar.mo7467e() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(oVar.mo7496p(view), oVar.mo7496p(view2));
        int max = Math.max(oVar.mo7496p(view), oVar.mo7496p(view2));
        if (z2) {
            i = Math.max(0, (state.getItemCount() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(wVar.mo8012a(view2) - wVar.mo8019d(view))) / ((float) (Math.abs(oVar.mo7496p(view) - oVar.mo7496p(view2)) + 1)))) + ((float) (wVar.mo8025g() - wVar.mo8019d(view))));
    }

    /* renamed from: b */
    static int m9640b(State state, C1775w wVar, View view, View view2, C1651o oVar, boolean z) {
        if (oVar.mo7467e() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return state.getItemCount();
        }
        return (int) ((((float) (wVar.mo8012a(view2) - wVar.mo8019d(view))) / ((float) (Math.abs(oVar.mo7496p(view) - oVar.mo7496p(view2)) + 1))) * ((float) state.getItemCount()));
    }

    /* renamed from: a */
    static int m9638a(State state, C1775w wVar, View view, View view2, C1651o oVar, boolean z) {
        if (oVar.mo7467e() == 0 || state.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo7496p(view) - oVar.mo7496p(view2)) + 1;
        }
        return Math.min(wVar.mo8026h(), wVar.mo8012a(view2) - wVar.mo8019d(view));
    }
}
