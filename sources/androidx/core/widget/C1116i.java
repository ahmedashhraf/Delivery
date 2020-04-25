package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.widget.i */
/* compiled from: ListViewCompat */
public final class C1116i {
    private C1116i() {
    }

    /* renamed from: a */
    public static boolean m6342a(@C0193h0 ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(i);
        }
        int childCount = listView.getChildCount();
        boolean z = false;
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            int bottom = listView.getChildAt(childCount - 1).getBottom();
            if (firstVisiblePosition + childCount < listView.getCount() || bottom > listView.getHeight() - listView.getListPaddingBottom()) {
                z = true;
            }
            return z;
        }
        int top = listView.getChildAt(0).getTop();
        if (firstVisiblePosition > 0 || top < listView.getListPaddingTop()) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public static void m6343b(@C0193h0 ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
        } else {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            if (firstVisiblePosition != -1) {
                View childAt = listView.getChildAt(0);
                if (childAt != null) {
                    listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                }
            }
        }
    }
}