package androidx.core.p034l;

import android.view.View;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.l.v */
/* compiled from: NestedScrollingParent */
public interface C1052v {
    int getNestedScrollAxes();

    boolean onNestedFling(@C0193h0 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@C0193h0 View view, float f, float f2);

    void onNestedPreScroll(@C0193h0 View view, int i, int i2, @C0193h0 int[] iArr);

    void onNestedScroll(@C0193h0 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@C0193h0 View view, @C0193h0 View view2, int i);

    boolean onStartNestedScroll(@C0193h0 View view, @C0193h0 View view2, int i);

    void onStopNestedScroll(@C0193h0 View view);
}
