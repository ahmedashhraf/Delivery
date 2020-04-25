package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1761q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1627a0;
import androidx.recyclerview.widget.RecyclerView.State;

/* renamed from: com.google.android.material.datepicker.o */
/* compiled from: SmoothCalendarLayoutManager */
class C6838o extends LinearLayoutManager {

    /* renamed from: O */
    private static final float f19047O = 100.0f;

    /* renamed from: com.google.android.material.datepicker.o$a */
    /* compiled from: SmoothCalendarLayoutManager */
    class C6839a extends C1761q {
        C6839a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo7730a(DisplayMetrics displayMetrics) {
            return C6838o.f19047O / ((float) displayMetrics.densityDpi);
        }
    }

    C6838o(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: a */
    public void mo6982a(RecyclerView recyclerView, State state, int i) {
        C6839a aVar = new C6839a(recyclerView.getContext());
        aVar.mo7225d(i);
        mo7447b((C1627a0) aVar);
    }
}
