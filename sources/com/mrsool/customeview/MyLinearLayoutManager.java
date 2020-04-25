package com.mrsool.customeview;

import android.content.Context;
import android.view.View.MeasureSpec;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;

public class MyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: O */
    private int[] f29313O = new int[2];

    public MyLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    private void m49299a(C1664w wVar, int i, int i2, int i3, int[] iArr) {
    }

    /* renamed from: a */
    public void mo7419a(C1664w wVar, State state, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < mo7483j(); i5++) {
            m49299a(wVar, i5, MeasureSpec.makeMeasureSpec(i5, 0), MeasureSpec.makeMeasureSpec(i5, 0), this.f29313O);
            if (mo6963R() == 0) {
                int[] iArr = this.f29313O;
                i4 += iArr[0];
                if (i5 == 0) {
                    i3 = iArr[1];
                }
            } else {
                int[] iArr2 = this.f29313O;
                i3 += iArr2[1];
                if (i5 == 0) {
                    i4 = iArr2[0];
                }
            }
        }
        if (i3 >= size2 || i4 >= size) {
            super.mo7419a(wVar, state, i, i2);
            return;
        }
        if (mode == 1073741824) {
            i4 = size;
        }
        if (mode2 == 1073741824) {
            i3 = size2;
        }
        mo7454c(i4, i3);
    }
}
