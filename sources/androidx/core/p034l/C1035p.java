package androidx.core.p034l;

import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.p */
/* compiled from: NestedScrollingChild2 */
public interface C1035p extends C1048r {
    boolean dispatchNestedPreScroll(int i, int i2, @C0195i0 int[] iArr, @C0195i0 int[] iArr2, int i3);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @C0195i0 int[] iArr, int i5);

    boolean hasNestedScrollingParent(int i);

    boolean startNestedScroll(int i, int i2);

    void stopNestedScroll(int i);
}
