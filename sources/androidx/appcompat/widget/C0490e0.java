package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p076c.p112d.p148d.p150g.C6637f;
import p212io.branch.referral.C14130h;

/* renamed from: androidx.appcompat.widget.e0 */
/* compiled from: LinearLayoutCompat */
public class C0490e0 extends ViewGroup {

    /* renamed from: d0 */
    public static final int f1945d0 = 0;

    /* renamed from: e0 */
    public static final int f1946e0 = 1;

    /* renamed from: f0 */
    public static final int f1947f0 = 0;

    /* renamed from: g0 */
    public static final int f1948g0 = 1;

    /* renamed from: h0 */
    public static final int f1949h0 = 2;

    /* renamed from: i0 */
    public static final int f1950i0 = 4;

    /* renamed from: j0 */
    private static final int f1951j0 = 4;

    /* renamed from: k0 */
    private static final int f1952k0 = 0;

    /* renamed from: l0 */
    private static final int f1953l0 = 1;

    /* renamed from: m0 */
    private static final int f1954m0 = 2;

    /* renamed from: n0 */
    private static final int f1955n0 = 3;

    /* renamed from: o0 */
    private static final String f1956o0 = "androidx.appcompat.widget.LinearLayoutCompat";

    /* renamed from: N */
    private int f1957N;

    /* renamed from: O */
    private int f1958O;

    /* renamed from: P */
    private int f1959P;

    /* renamed from: Q */
    private int f1960Q;

    /* renamed from: R */
    private float f1961R;

    /* renamed from: S */
    private boolean f1962S;

    /* renamed from: T */
    private int[] f1963T;

    /* renamed from: U */
    private int[] f1964U;

    /* renamed from: V */
    private Drawable f1965V;

    /* renamed from: W */
    private int f1966W;

    /* renamed from: a */
    private boolean f1967a;

    /* renamed from: a0 */
    private int f1968a0;

    /* renamed from: b */
    private int f1969b;

    /* renamed from: b0 */
    private int f1970b0;

    /* renamed from: c0 */
    private int f1971c0;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.widget.e0$a */
    /* compiled from: LinearLayoutCompat */
    public @interface C0491a {
    }

    /* renamed from: androidx.appcompat.widget.e0$b */
    /* compiled from: LinearLayoutCompat */
    public static class C0492b extends MarginLayoutParams {

        /* renamed from: a */
        public float f1972a;

        /* renamed from: b */
        public int f1973b;

        public C0492b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1973b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0238R.styleable.LinearLayoutCompat_Layout);
            this.f1972a = obtainStyledAttributes.getFloat(C0238R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f1973b = obtainStyledAttributes.getInt(C0238R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C0492b(int i, int i2) {
            super(i, i2);
            this.f1973b = -1;
            this.f1972a = 0.0f;
        }

        public C0492b(int i, int i2, float f) {
            super(i, i2);
            this.f1973b = -1;
            this.f1972a = f;
        }

        public C0492b(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1973b = -1;
        }

        public C0492b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1973b = -1;
        }

        public C0492b(C0492b bVar) {
            super(bVar);
            this.f1973b = -1;
            this.f1972a = bVar.f1972a;
            this.f1973b = bVar.f1973b;
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.widget.e0$c */
    /* compiled from: LinearLayoutCompat */
    public @interface C0493c {
    }

    public C0490e0(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    private void m2664c(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), C6637f.f18605b);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo2537a(i3);
            if (a.getVisibility() != 8) {
                C0492b bVar = (C0492b) a.getLayoutParams();
                if (bVar.height == -1) {
                    int i4 = bVar.width;
                    bVar.width = a.getMeasuredWidth();
                    measureChildWithMargins(a, i2, 0, makeMeasureSpec, 0);
                    bVar.width = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m2665d(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), C6637f.f18605b);
        for (int i3 = 0; i3 < i; i3++) {
            View a = mo2537a(i3);
            if (a.getVisibility() != 8) {
                C0492b bVar = (C0492b) a.getLayoutParams();
                if (bVar.width == -1) {
                    int i4 = bVar.height;
                    bVar.height = a.getMeasuredHeight();
                    measureChildWithMargins(a, makeMeasureSpec, 0, i2, 0);
                    bVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2535a(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2536a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2540a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C0567z0.m3141a(this);
        for (int i5 = 0; i5 < virtualChildCount; i5++) {
            View a2 = mo2537a(i5);
            if (!(a2 == null || a2.getVisibility() == 8 || !mo2548b(i5))) {
                C0492b bVar = (C0492b) a2.getLayoutParams();
                if (a) {
                    i4 = a2.getRight() + bVar.rightMargin;
                } else {
                    i4 = (a2.getLeft() - bVar.leftMargin) - this.f1966W;
                }
                mo2547b(canvas, i4);
            }
        }
        if (mo2548b(virtualChildCount)) {
            View a3 = mo2537a(virtualChildCount - 1);
            if (a3 != null) {
                C0492b bVar2 = (C0492b) a3.getLayoutParams();
                if (a) {
                    i3 = a3.getLeft() - bVar2.leftMargin;
                    i2 = this.f1966W;
                } else {
                    i = a3.getRight() + bVar2.rightMargin;
                    mo2547b(canvas, i);
                }
            } else if (a) {
                i = getPaddingLeft();
                mo2547b(canvas, i);
            } else {
                i3 = getWidth() - getPaddingRight();
                i2 = this.f1966W;
            }
            i = i3 - i2;
            mo2547b(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2543b(View view) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2546b(Canvas canvas) {
        int i;
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View a = mo2537a(i2);
            if (!(a == null || a.getVisibility() == 8 || !mo2548b(i2))) {
                mo2541a(canvas, (a.getTop() - ((C0492b) a.getLayoutParams()).topMargin) - this.f1968a0);
            }
        }
        if (mo2548b(virtualChildCount)) {
            View a2 = mo2537a(virtualChildCount - 1);
            if (a2 == null) {
                i = (getHeight() - getPaddingBottom()) - this.f1968a0;
            } else {
                i = a2.getBottom() + ((C0492b) a2.getLayoutParams()).bottomMargin;
            }
            mo2541a(canvas, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo2549c(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0492b;
    }

    /* renamed from: e */
    public boolean mo2550e() {
        return this.f1967a;
    }

    /* renamed from: f */
    public boolean mo2551f() {
        return this.f1962S;
    }

    public int getBaseline() {
        if (this.f1969b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i = this.f1969b;
        if (childCount > i) {
            View childAt = getChildAt(i);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i2 = this.f1957N;
                if (this.f1958O == 1) {
                    int i3 = this.f1959P & 112;
                    if (i3 != 48) {
                        if (i3 == 16) {
                            i2 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1960Q) / 2;
                        } else if (i3 == 80) {
                            i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1960Q;
                        }
                    }
                }
                return i2 + ((C0492b) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1969b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1969b;
    }

    public Drawable getDividerDrawable() {
        return this.f1965V;
    }

    public int getDividerPadding() {
        return this.f1971c0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f1966W;
    }

    public int getGravity() {
        return this.f1959P;
    }

    public int getOrientation() {
        return this.f1958O;
    }

    public int getShowDividers() {
        return this.f1970b0;
    }

    /* access modifiers changed from: 0000 */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1961R;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1965V != null) {
            if (this.f1958O == 1) {
                mo2546b(canvas);
            } else {
                mo2540a(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f1956o0);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f1956o0);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1958O == 1) {
            mo2545b(i, i2, i3, i4);
        } else {
            mo2539a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1958O == 1) {
            mo2544b(i, i2);
        } else {
            mo2538a(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1967a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f1969b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1965V) {
            this.f1965V = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1966W = drawable.getIntrinsicWidth();
                this.f1968a0 = drawable.getIntrinsicHeight();
            } else {
                this.f1966W = 0;
                this.f1968a0 = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1971c0 = i;
    }

    public void setGravity(int i) {
        if (this.f1959P != i) {
            if ((8388615 & i) == 0) {
                i |= C0984g.f4394b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1959P = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & C0984g.f4396d;
        int i3 = this.f1959P;
        if ((8388615 & i3) != i2) {
            this.f1959P = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1962S = z;
    }

    public void setOrientation(int i) {
        if (this.f1958O != i) {
            this.f1958O = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1970b0) {
            requestLayout();
        }
        this.f1970b0 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1959P;
        if ((i3 & 112) != i2) {
            this.f1959P = i2 | (i3 & C14130h.f41560o);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1961R = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C0490e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public C0492b generateDefaultLayoutParams() {
        int i = this.f1958O;
        if (i == 0) {
            return new C0492b(-2, -2);
        }
        if (i == 1) {
            return new C0492b(-1, -2);
        }
        return null;
    }

    public C0490e0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1967a = true;
        this.f1969b = -1;
        this.f1957N = 0;
        this.f1959P = BadgeDrawable.f16065c0;
        C0549t0 a = C0549t0.m2910a(context, attributeSet, C0238R.styleable.LinearLayoutCompat, i, 0);
        int d = a.mo2880d(C0238R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (d >= 0) {
            setOrientation(d);
        }
        int d2 = a.mo2880d(C0238R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (d2 >= 0) {
            setGravity(d2);
        }
        boolean a2 = a.mo2871a(C0238R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.f1961R = a.mo2872b(C0238R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1969b = a.mo2880d(C0238R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1962S = a.mo2871a(C0238R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo2875b(C0238R.styleable.LinearLayoutCompat_divider));
        this.f1970b0 = a.mo2880d(C0238R.styleable.LinearLayoutCompat_showDividers, 0);
        this.f1971c0 = a.mo2876c(C0238R.styleable.LinearLayoutCompat_dividerPadding, 0);
        a.mo2887f();
    }

    public C0492b generateLayoutParams(AttributeSet attributeSet) {
        return new C0492b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0492b generateLayoutParams(LayoutParams layoutParams) {
        return new C0492b(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2547b(Canvas canvas, int i) {
        this.f1965V.setBounds(i, getPaddingTop() + this.f1971c0, this.f1966W + i, (getHeight() - getPaddingBottom()) - this.f1971c0);
        this.f1965V.draw(canvas);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2541a(Canvas canvas, int i) {
        this.f1965V.setBounds(getPaddingLeft() + this.f1971c0, i, (getWidth() - getPaddingRight()) - this.f1971c0, this.f1968a0 + i);
        this.f1965V.draw(canvas);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY})
    /* renamed from: b */
    public boolean mo2548b(int i) {
        boolean z = false;
        if (i == 0) {
            if ((this.f1970b0 & 1) != 0) {
                z = true;
            }
            return z;
        } else if (i == getChildCount()) {
            if ((this.f1970b0 & 4) != 0) {
                z = true;
            }
            return z;
        } else {
            if ((this.f1970b0 & 2) != 0) {
                int i2 = i - 1;
                while (true) {
                    if (i2 < 0) {
                        break;
                    } else if (getChildAt(i2).getVisibility() != 8) {
                        z = true;
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo2537a(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2538a(int r39, int r40) {
        /*
            r38 = this;
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = 0
            r7.f1960Q = r10
            int r11 = r38.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r39)
            int r13 = android.view.View.MeasureSpec.getMode(r40)
            int[] r0 = r7.f1963T
            r14 = 4
            if (r0 == 0) goto L_0x001e
            int[] r0 = r7.f1964U
            if (r0 != 0) goto L_0x0026
        L_0x001e:
            int[] r0 = new int[r14]
            r7.f1963T = r0
            int[] r0 = new int[r14]
            r7.f1964U = r0
        L_0x0026:
            int[] r15 = r7.f1963T
            int[] r6 = r7.f1964U
            r16 = 3
            r5 = -1
            r15[r16] = r5
            r17 = 2
            r15[r17] = r5
            r18 = 1
            r15[r18] = r5
            r15[r10] = r5
            r6[r16] = r5
            r6[r17] = r5
            r6[r18] = r5
            r6[r10] = r5
            boolean r4 = r7.f1967a
            boolean r3 = r7.f1962S
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 != r2) goto L_0x004c
            r19 = 1
            goto L_0x004e
        L_0x004c:
            r19 = 0
        L_0x004e:
            r20 = 0
            r0 = 0
            r1 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 1
            r28 = 0
        L_0x0061:
            r29 = r6
            r5 = 8
            if (r1 >= r11) goto L_0x0202
            android.view.View r6 = r7.mo2537a(r1)
            if (r6 != 0) goto L_0x007c
            int r5 = r7.f1960Q
            int r6 = r7.mo2549c(r1)
            int r5 = r5 + r6
            r7.f1960Q = r5
        L_0x0076:
            r33 = r3
            r37 = r4
            goto L_0x01f2
        L_0x007c:
            int r10 = r6.getVisibility()
            if (r10 != r5) goto L_0x0088
            int r5 = r7.mo2536a(r6, r1)
            int r1 = r1 + r5
            goto L_0x0076
        L_0x0088:
            boolean r5 = r7.mo2548b(r1)
            if (r5 == 0) goto L_0x0095
            int r5 = r7.f1960Q
            int r10 = r7.f1966W
            int r5 = r5 + r10
            r7.f1960Q = r5
        L_0x0095:
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            r10 = r5
            androidx.appcompat.widget.e0$b r10 = (androidx.appcompat.widget.C0490e0.C0492b) r10
            float r5 = r10.f1972a
            float r32 = r0 + r5
            if (r12 != r2) goto L_0x00eb
            int r0 = r10.width
            if (r0 != 0) goto L_0x00eb
            float r0 = r10.f1972a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00eb
            if (r19 == 0) goto L_0x00b9
            int r0 = r7.f1960Q
            int r5 = r10.leftMargin
            int r2 = r10.rightMargin
            int r5 = r5 + r2
            int r0 = r0 + r5
            r7.f1960Q = r0
            goto L_0x00c7
        L_0x00b9:
            int r0 = r7.f1960Q
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r5 = r10.rightMargin
            int r2 = r2 + r5
            int r0 = java.lang.Math.max(r0, r2)
            r7.f1960Q = r0
        L_0x00c7:
            if (r4 == 0) goto L_0x00dc
            r0 = 0
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r6.measure(r2, r2)
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r31 = -2
            goto L_0x0167
        L_0x00dc:
            r35 = r1
            r33 = r3
            r37 = r4
            r3 = r6
            r1 = 1073741824(0x40000000, float:2.0)
            r24 = 1
            r31 = -2
            goto L_0x0169
        L_0x00eb:
            int r0 = r10.width
            if (r0 != 0) goto L_0x00fa
            float r0 = r10.f1972a
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fa
            r5 = -2
            r10.width = r5
            r2 = 0
            goto L_0x00fd
        L_0x00fa:
            r5 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00fd:
            int r0 = (r32 > r20 ? 1 : (r32 == r20 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            int r0 = r7.f1960Q
            r30 = r0
            goto L_0x0108
        L_0x0106:
            r30 = 0
        L_0x0108:
            r34 = 0
            r0 = r38
            r35 = r1
            r1 = r6
            r36 = r2
            r2 = r35
            r33 = r3
            r3 = r39
            r37 = r4
            r4 = r30
            r9 = -1
            r30 = -2
            r5 = r40
            r30 = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            r6 = r34
            r0.mo2542a(r1, r2, r3, r4, r5, r6)
            r0 = r36
            if (r0 == r9) goto L_0x0131
            r10.width = r0
        L_0x0131:
            int r0 = r30.getMeasuredWidth()
            if (r19 == 0) goto L_0x014a
            int r1 = r7.f1960Q
            int r2 = r10.leftMargin
            int r2 = r2 + r0
            int r3 = r10.rightMargin
            int r2 = r2 + r3
            r3 = r30
            int r4 = r7.mo2543b(r3)
            int r2 = r2 + r4
            int r1 = r1 + r2
            r7.f1960Q = r1
            goto L_0x0161
        L_0x014a:
            r3 = r30
            int r1 = r7.f1960Q
            int r2 = r1 + r0
            int r4 = r10.leftMargin
            int r2 = r2 + r4
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r7.mo2543b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1960Q = r1
        L_0x0161:
            if (r33 == 0) goto L_0x0167
            int r14 = java.lang.Math.max(r0, r14)
        L_0x0167:
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0169:
            if (r13 == r1) goto L_0x0174
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x0174
            r0 = 1
            r28 = 1
            goto L_0x0175
        L_0x0174:
            r0 = 0
        L_0x0175:
            int r2 = r10.topMargin
            int r4 = r10.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredHeight()
            int r4 = r4 + r2
            int r5 = r3.getMeasuredState()
            r6 = r26
            int r5 = android.view.View.combineMeasuredStates(r6, r5)
            if (r37 == 0) goto L_0x01b4
            int r6 = r3.getBaseline()
            r9 = -1
            if (r6 == r9) goto L_0x01b4
            int r9 = r10.f1973b
            if (r9 >= 0) goto L_0x0198
            int r9 = r7.f1959P
        L_0x0198:
            r9 = r9 & 112(0x70, float:1.57E-43)
            r25 = 4
            int r9 = r9 >> 4
            r9 = r9 & -2
            int r9 = r9 >> 1
            r1 = r15[r9]
            int r1 = java.lang.Math.max(r1, r6)
            r15[r9] = r1
            r1 = r29[r9]
            int r6 = r4 - r6
            int r1 = java.lang.Math.max(r1, r6)
            r29[r9] = r1
        L_0x01b4:
            r1 = r21
            int r1 = java.lang.Math.max(r1, r4)
            if (r27 == 0) goto L_0x01c3
            int r6 = r10.height
            r9 = -1
            if (r6 != r9) goto L_0x01c3
            r6 = 1
            goto L_0x01c4
        L_0x01c3:
            r6 = 0
        L_0x01c4:
            float r9 = r10.f1972a
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 <= 0) goto L_0x01d5
            if (r0 == 0) goto L_0x01cd
            goto L_0x01ce
        L_0x01cd:
            r2 = r4
        L_0x01ce:
            r10 = r23
            int r23 = java.lang.Math.max(r10, r2)
            goto L_0x01e2
        L_0x01d5:
            r10 = r23
            if (r0 == 0) goto L_0x01da
            r4 = r2
        L_0x01da:
            r2 = r22
            int r22 = java.lang.Math.max(r2, r4)
            r23 = r10
        L_0x01e2:
            r10 = r35
            int r0 = r7.mo2536a(r3, r10)
            int r0 = r0 + r10
            r21 = r1
            r26 = r5
            r27 = r6
            r1 = r0
            r0 = r32
        L_0x01f2:
            int r1 = r1 + 1
            r9 = r40
            r6 = r29
            r3 = r33
            r4 = r37
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = -1
            r10 = 0
            goto L_0x0061
        L_0x0202:
            r33 = r3
            r37 = r4
            r1 = r21
            r2 = r22
            r10 = r23
            r6 = r26
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -2
            int r3 = r7.f1960Q
            if (r3 <= 0) goto L_0x0223
            boolean r3 = r7.mo2548b(r11)
            if (r3 == 0) goto L_0x0223
            int r3 = r7.f1960Q
            int r4 = r7.f1966W
            int r3 = r3 + r4
            r7.f1960Q = r3
        L_0x0223:
            r3 = r15[r18]
            r4 = -1
            if (r3 != r4) goto L_0x0239
            r3 = 0
            r5 = r15[r3]
            if (r5 != r4) goto L_0x0239
            r3 = r15[r17]
            if (r3 != r4) goto L_0x0239
            r3 = r15[r16]
            if (r3 == r4) goto L_0x0236
            goto L_0x0239
        L_0x0236:
            r23 = r6
            goto L_0x026a
        L_0x0239:
            r3 = r15[r16]
            r4 = 0
            r5 = r15[r4]
            r9 = r15[r18]
            r4 = r15[r17]
            int r4 = java.lang.Math.max(r9, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r3, r4)
            r4 = r29[r16]
            r5 = 0
            r9 = r29[r5]
            r5 = r29[r18]
            r23 = r6
            r6 = r29[r17]
            int r5 = java.lang.Math.max(r5, r6)
            int r5 = java.lang.Math.max(r9, r5)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + r4
            int r1 = java.lang.Math.max(r1, r3)
        L_0x026a:
            if (r33 == 0) goto L_0x02cd
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r12 == r3) goto L_0x0272
            if (r12 != 0) goto L_0x02cd
        L_0x0272:
            r3 = 0
            r7.f1960Q = r3
            r3 = 0
        L_0x0276:
            if (r3 >= r11) goto L_0x02cd
            android.view.View r4 = r7.mo2537a(r3)
            if (r4 != 0) goto L_0x0288
            int r4 = r7.f1960Q
            int r5 = r7.mo2549c(r3)
            int r4 = r4 + r5
            r7.f1960Q = r4
            goto L_0x0295
        L_0x0288:
            int r5 = r4.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0298
            int r4 = r7.mo2536a(r4, r3)
            int r3 = r3 + r4
        L_0x0295:
            r22 = r1
            goto L_0x02c8
        L_0x0298:
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.appcompat.widget.e0$b r5 = (androidx.appcompat.widget.C0490e0.C0492b) r5
            if (r19 == 0) goto L_0x02b1
            int r6 = r7.f1960Q
            int r9 = r5.leftMargin
            int r9 = r9 + r14
            int r5 = r5.rightMargin
            int r9 = r9 + r5
            int r4 = r7.mo2543b(r4)
            int r9 = r9 + r4
            int r6 = r6 + r9
            r7.f1960Q = r6
            goto L_0x0295
        L_0x02b1:
            int r6 = r7.f1960Q
            int r9 = r6 + r14
            r22 = r1
            int r1 = r5.leftMargin
            int r9 = r9 + r1
            int r1 = r5.rightMargin
            int r9 = r9 + r1
            int r1 = r7.mo2543b(r4)
            int r9 = r9 + r1
            int r1 = java.lang.Math.max(r6, r9)
            r7.f1960Q = r1
        L_0x02c8:
            int r3 = r3 + 1
            r1 = r22
            goto L_0x0276
        L_0x02cd:
            r22 = r1
            int r1 = r7.f1960Q
            int r3 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r3 = r3 + r4
            int r1 = r1 + r3
            r7.f1960Q = r1
            int r1 = r7.f1960Q
            int r3 = r38.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r3)
            r3 = 0
            int r1 = android.view.View.resolveSizeAndState(r1, r8, r3)
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r3 = r3 & r1
            int r4 = r7.f1960Q
            int r3 = r3 - r4
            if (r24 != 0) goto L_0x0340
            if (r3 == 0) goto L_0x02fc
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x02fc
            goto L_0x0340
        L_0x02fc:
            int r0 = java.lang.Math.max(r2, r10)
            if (r33 == 0) goto L_0x0338
            r2 = 1073741824(0x40000000, float:2.0)
            if (r12 == r2) goto L_0x0338
            r2 = 0
        L_0x0307:
            if (r2 >= r11) goto L_0x0338
            android.view.View r3 = r7.mo2537a(r2)
            if (r3 == 0) goto L_0x0335
            int r5 = r3.getVisibility()
            r6 = 8
            if (r5 != r6) goto L_0x0318
            goto L_0x0335
        L_0x0318:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.e0$b r5 = (androidx.appcompat.widget.C0490e0.C0492b) r5
            float r5 = r5.f1972a
            int r5 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r5 <= 0) goto L_0x0335
            r5 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r9 = r3.getMeasuredHeight()
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r5)
            r3.measure(r6, r9)
        L_0x0335:
            int r2 = r2 + 1
            goto L_0x0307
        L_0x0338:
            r3 = r40
            r26 = r11
            r2 = r22
            goto L_0x04e2
        L_0x0340:
            float r5 = r7.f1961R
            int r6 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r6 <= 0) goto L_0x0347
            r0 = r5
        L_0x0347:
            r5 = -1
            r15[r16] = r5
            r15[r17] = r5
            r15[r18] = r5
            r6 = 0
            r15[r6] = r5
            r29[r16] = r5
            r29[r17] = r5
            r29[r18] = r5
            r29[r6] = r5
            r7.f1960Q = r6
            r10 = r2
            r9 = r23
            r6 = -1
            r2 = r0
            r0 = 0
        L_0x0361:
            if (r0 >= r11) goto L_0x0489
            android.view.View r14 = r7.mo2537a(r0)
            if (r14 == 0) goto L_0x0478
            int r5 = r14.getVisibility()
            r4 = 8
            if (r5 != r4) goto L_0x0373
            goto L_0x0478
        L_0x0373:
            android.view.ViewGroup$LayoutParams r5 = r14.getLayoutParams()
            androidx.appcompat.widget.e0$b r5 = (androidx.appcompat.widget.C0490e0.C0492b) r5
            float r4 = r5.f1972a
            int r23 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r23 <= 0) goto L_0x03dc
            float r8 = (float) r3
            float r8 = r8 * r4
            float r8 = r8 / r2
            int r8 = (int) r8
            float r2 = r2 - r4
            int r3 = r3 - r8
            int r4 = r38.getPaddingTop()
            int r23 = r38.getPaddingBottom()
            int r4 = r4 + r23
            r23 = r2
            int r2 = r5.topMargin
            int r4 = r4 + r2
            int r2 = r5.bottomMargin
            int r4 = r4 + r2
            int r2 = r5.height
            r24 = r3
            r26 = r11
            r11 = -1
            r3 = r40
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r3, r4, r2)
            int r4 = r5.width
            if (r4 != 0) goto L_0x03ba
            r4 = 1073741824(0x40000000, float:2.0)
            if (r12 == r4) goto L_0x03ae
            goto L_0x03bc
        L_0x03ae:
            if (r8 <= 0) goto L_0x03b1
            goto L_0x03b2
        L_0x03b1:
            r8 = 0
        L_0x03b2:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
            goto L_0x03cc
        L_0x03ba:
            r4 = 1073741824(0x40000000, float:2.0)
        L_0x03bc:
            int r30 = r14.getMeasuredWidth()
            int r8 = r30 + r8
            if (r8 >= 0) goto L_0x03c5
            r8 = 0
        L_0x03c5:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r4)
            r14.measure(r8, r2)
        L_0x03cc:
            int r2 = r14.getMeasuredState()
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r4
            int r9 = android.view.View.combineMeasuredStates(r9, r2)
            r2 = r23
            r4 = r24
            goto L_0x03e2
        L_0x03dc:
            r4 = r3
            r26 = r11
            r11 = -1
            r3 = r40
        L_0x03e2:
            if (r19 == 0) goto L_0x03ff
            int r8 = r7.f1960Q
            int r23 = r14.getMeasuredWidth()
            int r11 = r5.leftMargin
            int r23 = r23 + r11
            int r11 = r5.rightMargin
            int r23 = r23 + r11
            int r11 = r7.mo2543b(r14)
            int r23 = r23 + r11
            int r8 = r8 + r23
            r7.f1960Q = r8
            r23 = r2
            goto L_0x0419
        L_0x03ff:
            int r8 = r7.f1960Q
            int r11 = r14.getMeasuredWidth()
            int r11 = r11 + r8
            r23 = r2
            int r2 = r5.leftMargin
            int r11 = r11 + r2
            int r2 = r5.rightMargin
            int r11 = r11 + r2
            int r2 = r7.mo2543b(r14)
            int r11 = r11 + r2
            int r2 = java.lang.Math.max(r8, r11)
            r7.f1960Q = r2
        L_0x0419:
            r2 = 1073741824(0x40000000, float:2.0)
            if (r13 == r2) goto L_0x0424
            int r2 = r5.height
            r8 = -1
            if (r2 != r8) goto L_0x0424
            r2 = 1
            goto L_0x0425
        L_0x0424:
            r2 = 0
        L_0x0425:
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            int r8 = r8 + r11
            int r11 = r14.getMeasuredHeight()
            int r11 = r11 + r8
            int r6 = java.lang.Math.max(r6, r11)
            if (r2 == 0) goto L_0x0436
            goto L_0x0437
        L_0x0436:
            r8 = r11
        L_0x0437:
            int r2 = java.lang.Math.max(r10, r8)
            if (r27 == 0) goto L_0x0444
            int r8 = r5.height
            r10 = -1
            if (r8 != r10) goto L_0x0445
            r8 = 1
            goto L_0x0446
        L_0x0444:
            r10 = -1
        L_0x0445:
            r8 = 0
        L_0x0446:
            if (r37 == 0) goto L_0x0470
            int r14 = r14.getBaseline()
            if (r14 == r10) goto L_0x0470
            int r5 = r5.f1973b
            if (r5 >= 0) goto L_0x0454
            int r5 = r7.f1959P
        L_0x0454:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r24 = 4
            int r5 = r5 >> 4
            r5 = r5 & -2
            int r5 = r5 >> 1
            r10 = r15[r5]
            int r10 = java.lang.Math.max(r10, r14)
            r15[r5] = r10
            r10 = r29[r5]
            int r11 = r11 - r14
            int r10 = java.lang.Math.max(r10, r11)
            r29[r5] = r10
            goto L_0x0472
        L_0x0470:
            r24 = 4
        L_0x0472:
            r10 = r2
            r27 = r8
            r2 = r23
            goto L_0x047f
        L_0x0478:
            r4 = r3
            r26 = r11
            r24 = 4
            r3 = r40
        L_0x047f:
            int r0 = r0 + 1
            r8 = r39
            r3 = r4
            r11 = r26
            r5 = -1
            goto L_0x0361
        L_0x0489:
            r3 = r40
            r26 = r11
            int r0 = r7.f1960Q
            int r2 = r38.getPaddingLeft()
            int r4 = r38.getPaddingRight()
            int r2 = r2 + r4
            int r0 = r0 + r2
            r7.f1960Q = r0
            r0 = r15[r18]
            r2 = -1
            if (r0 != r2) goto L_0x04b0
            r0 = 0
            r4 = r15[r0]
            if (r4 != r2) goto L_0x04b0
            r0 = r15[r17]
            if (r0 != r2) goto L_0x04b0
            r0 = r15[r16]
            if (r0 == r2) goto L_0x04ae
            goto L_0x04b0
        L_0x04ae:
            r0 = r6
            goto L_0x04de
        L_0x04b0:
            r0 = r15[r16]
            r2 = 0
            r4 = r15[r2]
            r5 = r15[r18]
            r8 = r15[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r4 = java.lang.Math.max(r4, r5)
            int r0 = java.lang.Math.max(r0, r4)
            r4 = r29[r16]
            r2 = r29[r2]
            r5 = r29[r18]
            r8 = r29[r17]
            int r5 = java.lang.Math.max(r5, r8)
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r6, r0)
        L_0x04de:
            r2 = r0
            r23 = r9
            r0 = r10
        L_0x04e2:
            if (r27 != 0) goto L_0x04e9
            r4 = 1073741824(0x40000000, float:2.0)
            if (r13 == r4) goto L_0x04e9
            goto L_0x04ea
        L_0x04e9:
            r0 = r2
        L_0x04ea:
            int r2 = r38.getPaddingTop()
            int r4 = r38.getPaddingBottom()
            int r2 = r2 + r4
            int r0 = r0 + r2
            int r2 = r38.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r0, r2)
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r23 & r2
            r1 = r1 | r2
            int r2 = r23 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r3, r2)
            r7.setMeasuredDimension(r1, r0)
            if (r28 == 0) goto L_0x0513
            r0 = r39
            r1 = r26
            r7.m2664c(r1, r0)
        L_0x0513:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0490e0.mo2538a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x032e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2544b(int r34, int r35) {
        /*
            r33 = this;
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = 0
            r7.f1960Q = r10
            int r11 = r33.getVirtualChildCount()
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = android.view.View.MeasureSpec.getMode(r35)
            int r14 = r7.f1969b
            boolean r15 = r7.f1962S
            r16 = 0
            r17 = 1
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r18 = 0
            r19 = 1
            r20 = 0
        L_0x002a:
            r10 = 8
            r22 = r4
            if (r6 >= r11) goto L_0x019d
            android.view.View r4 = r7.mo2537a(r6)
            if (r4 != 0) goto L_0x0047
            int r4 = r7.f1960Q
            int r10 = r7.mo2549c(r6)
            int r4 = r4 + r10
            r7.f1960Q = r4
            r23 = r11
            r4 = r22
        L_0x0043:
            r22 = r13
            goto L_0x0191
        L_0x0047:
            r24 = r1
            int r1 = r4.getVisibility()
            if (r1 != r10) goto L_0x005b
            int r1 = r7.mo2536a(r4, r6)
            int r6 = r6 + r1
            r23 = r11
            r4 = r22
            r1 = r24
            goto L_0x0043
        L_0x005b:
            boolean r1 = r7.mo2548b(r6)
            if (r1 == 0) goto L_0x0068
            int r1 = r7.f1960Q
            int r10 = r7.f1968a0
            int r1 = r1 + r10
            r7.f1960Q = r1
        L_0x0068:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            r10 = r1
            androidx.appcompat.widget.e0$b r10 = (androidx.appcompat.widget.C0490e0.C0492b) r10
            float r1 = r10.f1972a
            float r25 = r0 + r1
            r1 = 1073741824(0x40000000, float:2.0)
            if (r13 != r1) goto L_0x00a6
            int r0 = r10.height
            if (r0 != 0) goto L_0x00a6
            float r0 = r10.f1972a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = r7.f1960Q
            int r1 = r10.topMargin
            int r1 = r1 + r0
            r26 = r2
            int r2 = r10.bottomMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r7.f1960Q = r0
            r0 = r3
            r3 = r4
            r31 = r5
            r23 = r11
            r8 = r24
            r30 = r26
            r18 = 1
            r11 = r6
            r32 = r22
            r22 = r13
            r13 = r32
            goto L_0x0118
        L_0x00a6:
            r26 = r2
            int r0 = r10.height
            if (r0 != 0) goto L_0x00b7
            float r0 = r10.f1972a
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            r0 = -2
            r10.height = r0
            r2 = 0
            goto L_0x00b9
        L_0x00b7:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00b9:
            r27 = 0
            int r0 = (r25 > r16 ? 1 : (r25 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            int r0 = r7.f1960Q
            r28 = r0
            goto L_0x00c6
        L_0x00c4:
            r28 = 0
        L_0x00c6:
            r0 = r33
            r8 = r24
            r23 = 1073741824(0x40000000, float:2.0)
            r1 = r4
            r29 = r2
            r30 = r26
            r2 = r6
            r9 = r3
            r3 = r34
            r24 = r4
            r23 = r11
            r11 = 1073741824(0x40000000, float:2.0)
            r32 = r22
            r22 = r13
            r13 = r32
            r4 = r27
            r31 = r5
            r5 = r35
            r11 = r6
            r6 = r28
            r0.mo2542a(r1, r2, r3, r4, r5, r6)
            r0 = r29
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x00f5
            r10.height = r0
        L_0x00f5:
            int r0 = r24.getMeasuredHeight()
            int r1 = r7.f1960Q
            int r2 = r1 + r0
            int r3 = r10.topMargin
            int r2 = r2 + r3
            int r3 = r10.bottomMargin
            int r2 = r2 + r3
            r3 = r24
            int r4 = r7.mo2543b(r3)
            int r2 = r2 + r4
            int r1 = java.lang.Math.max(r1, r2)
            r7.f1960Q = r1
            if (r15 == 0) goto L_0x0117
            int r0 = java.lang.Math.max(r0, r9)
            goto L_0x0118
        L_0x0117:
            r0 = r9
        L_0x0118:
            if (r14 < 0) goto L_0x0122
            int r6 = r11 + 1
            if (r14 != r6) goto L_0x0122
            int r1 = r7.f1960Q
            r7.f1957N = r1
        L_0x0122:
            if (r11 >= r14) goto L_0x0133
            float r1 = r10.f1972a
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x012b
            goto L_0x0133
        L_0x012b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r12 == r1) goto L_0x0140
            int r1 = r10.width
            r2 = -1
            if (r1 != r2) goto L_0x0140
            r1 = 1
            r20 = 1
            goto L_0x0141
        L_0x0140:
            r1 = 0
        L_0x0141:
            int r2 = r10.leftMargin
            int r4 = r10.rightMargin
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 + r2
            r5 = r30
            int r5 = java.lang.Math.max(r5, r4)
            int r6 = r3.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r8, r6)
            if (r19 == 0) goto L_0x0162
            int r8 = r10.width
            r9 = -1
            if (r8 != r9) goto L_0x0162
            r8 = 1
            goto L_0x0163
        L_0x0162:
            r8 = 0
        L_0x0163:
            float r9 = r10.f1972a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0175
            if (r1 == 0) goto L_0x016c
            goto L_0x016d
        L_0x016c:
            r2 = r4
        L_0x016d:
            int r4 = java.lang.Math.max(r13, r2)
            r13 = r4
            r1 = r31
            goto L_0x017f
        L_0x0175:
            if (r1 == 0) goto L_0x0178
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            r1 = r31
            int r1 = java.lang.Math.max(r1, r2)
        L_0x017f:
            int r2 = r7.mo2536a(r3, r11)
            int r2 = r2 + r11
            r3 = r0
            r19 = r8
            r4 = r13
            r0 = r25
            r32 = r5
            r5 = r1
            r1 = r6
            r6 = r2
            r2 = r32
        L_0x0191:
            int r6 = r6 + 1
            r8 = r34
            r9 = r35
            r13 = r22
            r11 = r23
            goto L_0x002a
        L_0x019d:
            r8 = r1
            r9 = r3
            r1 = r5
            r23 = r11
            r5 = r2
            r32 = r22
            r22 = r13
            r13 = r32
            int r2 = r7.f1960Q
            if (r2 <= 0) goto L_0x01bd
            r2 = r23
            boolean r3 = r7.mo2548b(r2)
            if (r3 == 0) goto L_0x01bf
            int r3 = r7.f1960Q
            int r4 = r7.f1968a0
            int r3 = r3 + r4
            r7.f1960Q = r3
            goto L_0x01bf
        L_0x01bd:
            r2 = r23
        L_0x01bf:
            r3 = r22
            if (r15 == 0) goto L_0x020e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r4) goto L_0x01c9
            if (r3 != 0) goto L_0x020e
        L_0x01c9:
            r4 = 0
            r7.f1960Q = r4
            r4 = 0
        L_0x01cd:
            if (r4 >= r2) goto L_0x020e
            android.view.View r6 = r7.mo2537a(r4)
            if (r6 != 0) goto L_0x01df
            int r6 = r7.f1960Q
            int r11 = r7.mo2549c(r4)
            int r6 = r6 + r11
            r7.f1960Q = r6
            goto L_0x0209
        L_0x01df:
            int r11 = r6.getVisibility()
            if (r11 != r10) goto L_0x01eb
            int r6 = r7.mo2536a(r6, r4)
            int r4 = r4 + r6
            goto L_0x0209
        L_0x01eb:
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            androidx.appcompat.widget.e0$b r11 = (androidx.appcompat.widget.C0490e0.C0492b) r11
            int r14 = r7.f1960Q
            int r21 = r14 + r9
            int r10 = r11.topMargin
            int r21 = r21 + r10
            int r10 = r11.bottomMargin
            int r21 = r21 + r10
            int r6 = r7.mo2543b(r6)
            int r6 = r21 + r6
            int r6 = java.lang.Math.max(r14, r6)
            r7.f1960Q = r6
        L_0x0209:
            int r4 = r4 + 1
            r10 = 8
            goto L_0x01cd
        L_0x020e:
            int r4 = r7.f1960Q
            int r6 = r33.getPaddingTop()
            int r10 = r33.getPaddingBottom()
            int r6 = r6 + r10
            int r4 = r4 + r6
            r7.f1960Q = r4
            int r4 = r7.f1960Q
            int r6 = r33.getSuggestedMinimumHeight()
            int r4 = java.lang.Math.max(r4, r6)
            r6 = r35
            r10 = r9
            r9 = 0
            int r4 = android.view.View.resolveSizeAndState(r4, r6, r9)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r4
            int r11 = r7.f1960Q
            int r9 = r9 - r11
            if (r18 != 0) goto L_0x027f
            if (r9 == 0) goto L_0x023e
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x023e
            goto L_0x027f
        L_0x023e:
            int r0 = java.lang.Math.max(r1, r13)
            if (r15 == 0) goto L_0x027a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x027a
            r1 = 0
        L_0x0249:
            if (r1 >= r2) goto L_0x027a
            android.view.View r3 = r7.mo2537a(r1)
            if (r3 == 0) goto L_0x0277
            int r9 = r3.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x025a
            goto L_0x0277
        L_0x025a:
            android.view.ViewGroup$LayoutParams r9 = r3.getLayoutParams()
            androidx.appcompat.widget.e0$b r9 = (androidx.appcompat.widget.C0490e0.C0492b) r9
            float r9 = r9.f1972a
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0277
            int r9 = r3.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            r3.measure(r9, r13)
        L_0x0277:
            int r1 = r1 + 1
            goto L_0x0249
        L_0x027a:
            r11 = r34
            r1 = r8
            goto L_0x0372
        L_0x027f:
            float r10 = r7.f1961R
            int r11 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0286
            r0 = r10
        L_0x0286:
            r10 = 0
            r7.f1960Q = r10
            r11 = r0
            r0 = 0
            r32 = r8
            r8 = r1
            r1 = r32
        L_0x0290:
            if (r0 >= r2) goto L_0x0361
            android.view.View r13 = r7.mo2537a(r0)
            int r14 = r13.getVisibility()
            r15 = 8
            if (r14 != r15) goto L_0x02a4
            r21 = r11
            r11 = r34
            goto L_0x035a
        L_0x02a4:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.appcompat.widget.e0$b r14 = (androidx.appcompat.widget.C0490e0.C0492b) r14
            float r10 = r14.f1972a
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x0305
            float r15 = (float) r9
            float r15 = r15 * r10
            float r15 = r15 / r11
            int r15 = (int) r15
            float r11 = r11 - r10
            int r9 = r9 - r15
            int r10 = r33.getPaddingLeft()
            int r18 = r33.getPaddingRight()
            int r10 = r10 + r18
            r18 = r9
            int r9 = r14.leftMargin
            int r10 = r10 + r9
            int r9 = r14.rightMargin
            int r10 = r10 + r9
            int r9 = r14.width
            r21 = r11
            r11 = r34
            int r9 = android.view.ViewGroup.getChildMeasureSpec(r11, r10, r9)
            int r10 = r14.height
            if (r10 != 0) goto L_0x02e8
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == r10) goto L_0x02dc
            goto L_0x02ea
        L_0x02dc:
            if (r15 <= 0) goto L_0x02df
            goto L_0x02e0
        L_0x02df:
            r15 = 0
        L_0x02e0:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
            goto L_0x02fa
        L_0x02e8:
            r10 = 1073741824(0x40000000, float:2.0)
        L_0x02ea:
            int r23 = r13.getMeasuredHeight()
            int r15 = r23 + r15
            if (r15 >= 0) goto L_0x02f3
            r15 = 0
        L_0x02f3:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r10)
            r13.measure(r9, r15)
        L_0x02fa:
            int r9 = r13.getMeasuredState()
            r9 = r9 & -256(0xffffffffffffff00, float:NaN)
            int r1 = android.view.View.combineMeasuredStates(r1, r9)
            goto L_0x030c
        L_0x0305:
            r10 = r11
            r11 = r34
            r18 = r9
            r21 = r10
        L_0x030c:
            int r9 = r14.leftMargin
            int r10 = r14.rightMargin
            int r9 = r9 + r10
            int r10 = r13.getMeasuredWidth()
            int r10 = r10 + r9
            int r5 = java.lang.Math.max(r5, r10)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r12 == r15) goto L_0x0327
            int r15 = r14.width
            r23 = r1
            r1 = -1
            if (r15 != r1) goto L_0x032a
            r15 = 1
            goto L_0x032b
        L_0x0327:
            r23 = r1
            r1 = -1
        L_0x032a:
            r15 = 0
        L_0x032b:
            if (r15 == 0) goto L_0x032e
            goto L_0x032f
        L_0x032e:
            r9 = r10
        L_0x032f:
            int r8 = java.lang.Math.max(r8, r9)
            if (r19 == 0) goto L_0x033b
            int r9 = r14.width
            if (r9 != r1) goto L_0x033b
            r9 = 1
            goto L_0x033c
        L_0x033b:
            r9 = 0
        L_0x033c:
            int r10 = r7.f1960Q
            int r15 = r13.getMeasuredHeight()
            int r15 = r15 + r10
            int r1 = r14.topMargin
            int r15 = r15 + r1
            int r1 = r14.bottomMargin
            int r15 = r15 + r1
            int r1 = r7.mo2543b(r13)
            int r15 = r15 + r1
            int r1 = java.lang.Math.max(r10, r15)
            r7.f1960Q = r1
            r19 = r9
            r9 = r18
            r1 = r23
        L_0x035a:
            int r0 = r0 + 1
            r11 = r21
            r10 = 0
            goto L_0x0290
        L_0x0361:
            r11 = r34
            int r0 = r7.f1960Q
            int r3 = r33.getPaddingTop()
            int r9 = r33.getPaddingBottom()
            int r3 = r3 + r9
            int r0 = r0 + r3
            r7.f1960Q = r0
            r0 = r8
        L_0x0372:
            if (r19 != 0) goto L_0x0379
            r3 = 1073741824(0x40000000, float:2.0)
            if (r12 == r3) goto L_0x0379
            goto L_0x037a
        L_0x0379:
            r0 = r5
        L_0x037a:
            int r3 = r33.getPaddingLeft()
            int r5 = r33.getPaddingRight()
            int r3 = r3 + r5
            int r0 = r0 + r3
            int r3 = r33.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r0 = android.view.View.resolveSizeAndState(r0, r11, r1)
            r7.setMeasuredDimension(r0, r4)
            if (r20 == 0) goto L_0x0398
            r7.m2665d(r2, r6)
        L_0x0398:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0490e0.mo2544b(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2545b(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f1959P;
        int i11 = i10 & 112;
        int i12 = i10 & C0984g.f4396d;
        if (i11 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - this.f1960Q) / 2);
        } else if (i11 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - this.f1960Q;
        }
        int i13 = 0;
        while (i13 < virtualChildCount) {
            View a = mo2537a(i13);
            if (a == null) {
                i5 += mo2549c(i13);
            } else if (a.getVisibility() != 8) {
                int measuredWidth = a.getMeasuredWidth();
                int measuredHeight = a.getMeasuredHeight();
                C0492b bVar = (C0492b) a.getLayoutParams();
                int i14 = bVar.f1973b;
                if (i14 < 0) {
                    i14 = i12;
                }
                int a2 = C0984g.m5636a(i14, C0962e0.m5566x(this)) & 7;
                if (a2 == 1) {
                    i7 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + bVar.leftMargin;
                    i6 = bVar.rightMargin;
                    i8 = i7 - i6;
                } else if (a2 != 5) {
                    i8 = bVar.leftMargin + paddingLeft;
                } else {
                    i7 = paddingRight - measuredWidth;
                    i6 = bVar.rightMargin;
                    i8 = i7 - i6;
                }
                int i15 = i8;
                if (mo2548b(i13)) {
                    i5 += this.f1968a0;
                }
                int i16 = i5 + bVar.topMargin;
                C0492b bVar2 = bVar;
                m2663a(a, i15, i16 + mo2535a(a), measuredWidth, measuredHeight);
                i13 += mo2536a(a, i13);
                i5 = i16 + measuredHeight + bVar2.bottomMargin + mo2543b(a);
            }
            i13++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2542a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2539a(int r25, int r26, int r27, int r28) {
        /*
            r24 = this;
            r6 = r24
            boolean r0 = androidx.appcompat.widget.C0567z0.m3141a(r24)
            int r7 = r24.getPaddingTop()
            int r1 = r28 - r26
            int r2 = r24.getPaddingBottom()
            int r8 = r1 - r2
            int r1 = r1 - r7
            int r2 = r24.getPaddingBottom()
            int r9 = r1 - r2
            int r10 = r24.getVirtualChildCount()
            int r1 = r6.f1959P
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r1
            r11 = r1 & 112(0x70, float:1.57E-43)
            boolean r12 = r6.f1967a
            int[] r13 = r6.f1963T
            int[] r14 = r6.f1964U
            int r1 = androidx.core.p034l.C0962e0.m5566x(r24)
            int r1 = androidx.core.p034l.C0984g.m5636a(r2, r1)
            r15 = 2
            r5 = 1
            if (r1 == r5) goto L_0x004b
            r2 = 5
            if (r1 == r2) goto L_0x003f
            int r1 = r24.getPaddingLeft()
            goto L_0x0056
        L_0x003f:
            int r1 = r24.getPaddingLeft()
            int r1 = r1 + r27
            int r1 = r1 - r25
            int r2 = r6.f1960Q
            int r1 = r1 - r2
            goto L_0x0056
        L_0x004b:
            int r1 = r24.getPaddingLeft()
            int r2 = r27 - r25
            int r3 = r6.f1960Q
            int r2 = r2 - r3
            int r2 = r2 / r15
            int r1 = r1 + r2
        L_0x0056:
            r2 = 0
            if (r0 == 0) goto L_0x0060
            int r0 = r10 + -1
            r16 = r0
            r17 = -1
            goto L_0x0064
        L_0x0060:
            r16 = 0
            r17 = 1
        L_0x0064:
            r3 = 0
        L_0x0065:
            if (r3 >= r10) goto L_0x0140
            int r0 = r17 * r3
            int r2 = r16 + r0
            android.view.View r0 = r6.mo2537a(r2)
            if (r0 != 0) goto L_0x0078
            int r0 = r6.mo2549c(r2)
            int r1 = r1 + r0
            goto L_0x012a
        L_0x0078:
            int r5 = r0.getVisibility()
            r15 = 8
            if (r5 == r15) goto L_0x0128
            int r15 = r0.getMeasuredWidth()
            int r5 = r0.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r18 = r0.getLayoutParams()
            r4 = r18
            androidx.appcompat.widget.e0$b r4 = (androidx.appcompat.widget.C0490e0.C0492b) r4
            r18 = r3
            if (r12 == 0) goto L_0x00a0
            int r3 = r4.height
            r19 = r10
            r10 = -1
            if (r3 == r10) goto L_0x00a2
            int r3 = r0.getBaseline()
            goto L_0x00a3
        L_0x00a0:
            r19 = r10
        L_0x00a2:
            r3 = -1
        L_0x00a3:
            int r10 = r4.f1973b
            if (r10 >= 0) goto L_0x00a8
            r10 = r11
        L_0x00a8:
            r10 = r10 & 112(0x70, float:1.57E-43)
            r20 = r11
            r11 = 16
            if (r10 == r11) goto L_0x00e4
            r11 = 48
            if (r10 == r11) goto L_0x00d4
            r11 = 80
            if (r10 == r11) goto L_0x00bd
            r3 = r7
            r11 = -1
        L_0x00ba:
            r21 = 1
            goto L_0x00f2
        L_0x00bd:
            int r10 = r8 - r5
            int r11 = r4.bottomMargin
            int r10 = r10 - r11
            r11 = -1
            if (r3 == r11) goto L_0x00d2
            int r21 = r0.getMeasuredHeight()
            int r21 = r21 - r3
            r3 = 2
            r22 = r14[r3]
            int r22 = r22 - r21
            int r10 = r10 - r22
        L_0x00d2:
            r3 = r10
            goto L_0x00ba
        L_0x00d4:
            r11 = -1
            int r10 = r4.topMargin
            int r10 = r10 + r7
            r21 = 1
            if (r3 == r11) goto L_0x00e2
            r22 = r13[r21]
            int r22 = r22 - r3
            int r10 = r10 + r22
        L_0x00e2:
            r3 = r10
            goto L_0x00f2
        L_0x00e4:
            r11 = -1
            r21 = 1
            int r3 = r9 - r5
            r10 = 2
            int r3 = r3 / r10
            int r3 = r3 + r7
            int r10 = r4.topMargin
            int r3 = r3 + r10
            int r10 = r4.bottomMargin
            int r3 = r3 - r10
        L_0x00f2:
            boolean r10 = r6.mo2548b(r2)
            if (r10 == 0) goto L_0x00fb
            int r10 = r6.f1966W
            int r1 = r1 + r10
        L_0x00fb:
            int r10 = r4.leftMargin
            int r10 = r10 + r1
            int r1 = r6.mo2535a(r0)
            int r22 = r10 + r1
            r1 = r0
            r0 = r24
            r25 = r1
            r11 = r2
            r2 = r22
            r22 = r7
            r23 = -1
            r7 = r4
            r4 = r15
            r0.m2663a(r1, r2, r3, r4, r5)
            int r0 = r7.rightMargin
            int r15 = r15 + r0
            r0 = r25
            int r1 = r6.mo2543b(r0)
            int r15 = r15 + r1
            int r10 = r10 + r15
            int r0 = r6.mo2536a(r0, r11)
            int r3 = r18 + r0
            r1 = r10
            goto L_0x0134
        L_0x0128:
            r18 = r3
        L_0x012a:
            r22 = r7
            r19 = r10
            r20 = r11
            r21 = 1
            r23 = -1
        L_0x0134:
            int r3 = r3 + 1
            r10 = r19
            r11 = r20
            r7 = r22
            r5 = 1
            r15 = 2
            goto L_0x0065
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0490e0.mo2539a(int, int, int, int):void");
    }

    /* renamed from: a */
    private void m2663a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }
}
