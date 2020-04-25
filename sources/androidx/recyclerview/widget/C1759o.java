package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.view.View;
import androidx.core.p034l.C0962e0;
import androidx.recyclerview.C1614R;

/* renamed from: androidx.recyclerview.widget.o */
/* compiled from: ItemTouchUIUtilImpl */
class C1759o implements C1758n {

    /* renamed from: a */
    static final C1758n f6839a = new C1759o();

    C1759o() {
    }

    /* renamed from: a */
    private static float m9486a(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float r = C0962e0.m5551r(childAt);
                if (r > f) {
                    f = r;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo7981a(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    /* renamed from: b */
    public void mo7983b(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (VERSION.SDK_INT >= 21 && z && view.getTag(C1614R.C1617id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C0962e0.m5551r(view));
            C0962e0.m5472b(view, m9486a(recyclerView, view) + 1.0f);
            view.setTag(C1614R.C1617id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    /* renamed from: b */
    public void mo7984b(View view) {
    }

    /* renamed from: a */
    public void mo7982a(View view) {
        if (VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(C1614R.C1617id.item_touch_helper_previous_elevation);
            if (tag instanceof Float) {
                C0962e0.m5472b(view, ((Float) tag).floatValue());
            }
            view.setTag(C1614R.C1617id.item_touch_helper_previous_elevation, null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
}
