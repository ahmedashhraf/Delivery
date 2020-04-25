package com.instabug.featuresrequest.p370c;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.c.f */
/* compiled from: ListviewUtils */
public class C9543f {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25238a;

    /* renamed from: a */
    public static void m44641a(ListView listView) {
        boolean[] a = m44642a();
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            a[1] = true;
            return;
        }
        a[2] = true;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(listView.getWidth(), Integer.MIN_VALUE);
        a[3] = true;
        a[4] = true;
        int i = 0;
        int i2 = 0;
        while (i < adapter.getCount()) {
            a[5] = true;
            View view = adapter.getView(i, null, listView);
            a[6] = true;
            view.measure(makeMeasureSpec, MeasureSpec.makeMeasureSpec(0, 0));
            a[7] = true;
            i2 += view.getMeasuredHeight();
            i++;
            a[8] = true;
        }
        LayoutParams layoutParams = listView.getLayoutParams();
        a[9] = true;
        layoutParams.height = i2 + (listView.getDividerHeight() * (adapter.getCount() - 1));
        a[10] = true;
        listView.setLayoutParams(layoutParams);
        a[11] = true;
        listView.requestLayout();
        a[12] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44642a() {
        boolean[] zArr = f25238a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8232270325242397266L, "com/instabug/featuresrequest/utils/ListviewUtils", 13);
        f25238a = a;
        return a;
    }
}
