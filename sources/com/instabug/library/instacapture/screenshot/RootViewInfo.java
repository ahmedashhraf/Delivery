package com.instabug.library.instacapture.screenshot;

import android.view.View;
import android.view.WindowManager.LayoutParams;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class RootViewInfo {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private final LayoutParams layoutParams;
    private final int left;
    private final int top;
    private final View view;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(8371891482916257805L, "com/instabug/library/instacapture/screenshot/RootViewInfo", 6);
        $jacocoData = a;
        return a;
    }

    public RootViewInfo(View view2, LayoutParams layoutParams2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.view = view2;
        int[] iArr = new int[2];
        $jacocoInit[0] = true;
        view2.getLocationOnScreen(iArr);
        this.left = iArr[0];
        this.top = iArr[1];
        this.layoutParams = layoutParams2;
        $jacocoInit[1] = true;
    }

    public LayoutParams getLayoutParams() {
        boolean[] $jacocoInit = $jacocoInit();
        LayoutParams layoutParams2 = this.layoutParams;
        $jacocoInit[5] = true;
        return layoutParams2;
    }

    public int getLeft() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.left;
        $jacocoInit[4] = true;
        return i;
    }

    public int getTop() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.top;
        $jacocoInit[3] = true;
        return i;
    }

    public View getView() {
        boolean[] $jacocoInit = $jacocoInit();
        View view2 = this.view;
        $jacocoInit[2] = true;
        return view2;
    }
}
