package androidx.core.p034l;

import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.r */
/* compiled from: NestedScrollingChild */
public interface C1048r {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @C0195i0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}
