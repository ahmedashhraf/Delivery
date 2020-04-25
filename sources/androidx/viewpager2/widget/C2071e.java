package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0199k0;
import androidx.core.p033k.C0944i;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2.C2062m;

/* renamed from: androidx.viewpager2.widget.e */
/* compiled from: MarginPageTransformer */
public final class C2071e implements C2062m {

    /* renamed from: a */
    private final int f7912a;

    public C2071e(@C0199k0 int i) {
        C0944i.m5336a(i, "Margin must be non-negative");
        this.f7912a = i;
    }

    /* renamed from: a */
    public void mo9019a(@C0193h0 View view, float f) {
        ViewPager2 a = m10787a(view);
        float f2 = ((float) this.f7912a) * f;
        if (a.getOrientation() == 0) {
            if (a.mo8966e()) {
                f2 = -f2;
            }
            view.setTranslationX(f2);
            return;
        }
        view.setTranslationY(f2);
    }

    /* renamed from: a */
    private ViewPager2 m10787a(@C0193h0 View view) {
        ViewParent parent = view.getParent();
        ViewParent parent2 = parent.getParent();
        if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
            return (ViewPager2) parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
}
