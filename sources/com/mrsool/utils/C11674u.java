package com.mrsool.utils;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.material.tabs.TabLayout;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.mrsool.utils.u */
/* compiled from: ScrollbarUtils */
public class C11674u {

    /* renamed from: a */
    private Context f33587a;

    /* renamed from: a */
    private void m52584a(boolean z, ExpandableListView expandableListView, int i, TabLayout tabLayout) {
        ExpandableListView expandableListView2 = expandableListView;
        int i2 = i;
        TabLayout tabLayout2 = tabLayout;
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i3 = 0;
        int i4 = 0;
        while (i3 < expandableListAdapter.getGroupCount()) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView2);
            groupView.measure(makeMeasureSpec, 0);
            int measuredHeight = groupView.getMeasuredHeight() + i4;
            groupView.getMeasuredHeight();
            int i5 = measuredHeight;
            if (expandableListView2.isGroupExpanded(i3)) {
                for (int i6 = 0; i6 < expandableListAdapter.getChildrenCount(i3); i6++) {
                    View childView = expandableListAdapter.getChildView(i3, i6, false, null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i5 += childView.getMeasuredHeight();
                    childView.getMeasuredHeight();
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Scroll=");
            sb.append(i2);
            sb.append("   item=");
            sb.append(i3);
            sb.append("   start=");
            sb.append(i4);
            sb.append("   end=");
            sb.append(i5);
            sb.toString();
            if (i2 >= i4 && i2 <= i5 && i3 != tabLayout.getSelectedTabPosition()) {
                tabLayout2.mo28123d(tabLayout2.mo28096a(i3));
            }
            i3++;
            i4 = i5;
        }
    }
}
