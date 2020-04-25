package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.C0193h0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p008b.p009a.C0331c;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0990i0;
import androidx.core.widget.C1115h;
import java.lang.reflect.Field;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: androidx.appcompat.widget.b0 */
/* compiled from: DropDownListView */
class C0472b0 extends ListView {

    /* renamed from: c0 */
    public static final int f1871c0 = -1;

    /* renamed from: d0 */
    public static final int f1872d0 = -1;

    /* renamed from: N */
    private int f1873N = 0;

    /* renamed from: O */
    private int f1874O = 0;

    /* renamed from: P */
    private int f1875P = 0;

    /* renamed from: Q */
    private int f1876Q;

    /* renamed from: R */
    private Field f1877R;

    /* renamed from: S */
    private C0473a f1878S;

    /* renamed from: T */
    private boolean f1879T;

    /* renamed from: U */
    private boolean f1880U;

    /* renamed from: V */
    private boolean f1881V;

    /* renamed from: W */
    private C0990i0 f1882W;

    /* renamed from: a */
    private final Rect f1883a = new Rect();

    /* renamed from: a0 */
    private C1115h f1884a0;

    /* renamed from: b */
    private int f1885b = 0;

    /* renamed from: b0 */
    C0474b f1886b0;

    /* renamed from: androidx.appcompat.widget.b0$a */
    /* compiled from: DropDownListView */
    private static class C0473a extends C0331c {

        /* renamed from: b */
        private boolean f1887b = true;

        C0473a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2486a(boolean z) {
            this.f1887b = z;
        }

        public void draw(Canvas canvas) {
            if (this.f1887b) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f1887b) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1887b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f1887b) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1887b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.b0$b */
    /* compiled from: DropDownListView */
    private class C0474b implements Runnable {
        C0474b() {
        }

        /* renamed from: a */
        public void mo2487a() {
            C0472b0 b0Var = C0472b0.this;
            b0Var.f1886b0 = null;
            b0Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void mo2488b() {
            C0472b0.this.post(this);
        }

        public void run() {
            C0472b0 b0Var = C0472b0.this;
            b0Var.f1886b0 = null;
            b0Var.drawableStateChanged();
        }
    }

    C0472b0(Context context, boolean z) {
        super(context, null, C0238R.attr.dropDownListViewStyle);
        this.f1880U = z;
        setCacheColorHint(0);
        try {
            this.f1877R = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1877R.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m2606b(int i, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        m2601a(i, view);
        if (z2) {
            Rect rect = this.f1883a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0892a.m5144a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: c */
    private void m2608c() {
        Drawable selector = getSelector();
        if (selector != null && m2607b() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0473a aVar = this.f1878S;
        if (aVar != null) {
            aVar.mo2486a(z);
        }
    }

    /* renamed from: a */
    public int mo2473a(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z) {
                    i2 = Math.max(0, i);
                    while (i2 < count && !adapter.isEnabled(i2)) {
                        i2++;
                    }
                } else {
                    int min = Math.min(i, count - 1);
                    while (i2 >= 0 && !adapter.isEnabled(i2)) {
                        min = i2 - 1;
                    }
                }
                if (i2 < 0 || i2 >= count) {
                    return -1;
                }
                return i2;
            } else if (i < 0 || i >= count) {
                return -1;
            } else {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        m2603a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.f1886b0 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            m2608c();
        }
    }

    public boolean hasFocus() {
        return this.f1880U || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f1880U || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f1880U || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f1880U && this.f1879T) || super.isInTouchMode();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f1886b0 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(@C0193h0 MotionEvent motionEvent) {
        if (VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1886b0 == null) {
            this.f1886b0 = new C0474b();
            this.f1886b0.mo2488b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2608c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1876Q = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0474b bVar = this.f1886b0;
        if (bVar != null) {
            bVar.mo2487a();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: 0000 */
    public void setListSelectionHidden(boolean z) {
        this.f1879T = z;
    }

    public void setSelector(Drawable drawable) {
        this.f1878S = drawable != null ? new C0473a(drawable) : null;
        super.setSelector(this.f1878S);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1885b = rect.left;
        this.f1873N = rect.top;
        this.f1874O = rect.right;
        this.f1875P = rect.bottom;
    }

    /* renamed from: b */
    private boolean m2607b() {
        return this.f1881V;
    }

    /* renamed from: a */
    public int mo2472a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = i7;
        View view = null;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < count; i11++) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                i6 = MeasureSpec.makeMeasureSpec(i12, C6637f.f18605b);
            } else {
                i6 = MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i6);
            view.forceLayout();
            if (i11 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i4) {
                if (i5 >= 0 && i11 > i5 && i10 > 0 && i8 != i4) {
                    i4 = i10;
                }
                return i4;
            }
            if (i5 >= 0 && i11 >= i5) {
                i10 = i8;
            }
        }
        return i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2474a(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x0014
            r9 = 3
            if (r0 == r9) goto L_0x0011
        L_0x000e:
            r9 = 0
            r3 = 1
            goto L_0x0046
        L_0x0011:
            r9 = 0
            r3 = 0
            goto L_0x0046
        L_0x0014:
            r3 = 1
            goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L_0x001e
            goto L_0x0011
        L_0x001e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L_0x0031
            r9 = 1
            goto L_0x0046
        L_0x0031:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m2605a(r3, r5, r4, r9)
            if (r0 != r2) goto L_0x000e
            r7.m2604a(r3, r5)
            goto L_0x000e
        L_0x0046:
            if (r3 == 0) goto L_0x004a
            if (r9 == 0) goto L_0x004d
        L_0x004a:
            r7.mo2667a()
        L_0x004d:
            if (r3 == 0) goto L_0x0065
            androidx.core.widget.h r9 = r7.f1884a0
            if (r9 != 0) goto L_0x005a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1884a0 = r9
        L_0x005a:
            androidx.core.widget.h r9 = r7.f1884a0
            r9.mo5325a(r2)
            androidx.core.widget.h r9 = r7.f1884a0
            r9.onTouch(r7, r8)
            goto L_0x006c
        L_0x0065:
            androidx.core.widget.h r8 = r7.f1884a0
            if (r8 == 0) goto L_0x006c
            r8.mo5325a(r1)
        L_0x006c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0472b0.mo2474a(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: a */
    private void m2604a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m2603a(Canvas canvas) {
        if (!this.f1883a.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.f1883a);
                selector.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    private void m2602a(int i, View view, float f, float f2) {
        m2606b(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0892a.m5144a(selector, f, f2);
        }
    }

    /* renamed from: a */
    private void m2601a(int i, View view) {
        Rect rect = this.f1883a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1885b;
        rect.top -= this.f1873N;
        rect.right += this.f1874O;
        rect.bottom += this.f1875P;
        try {
            boolean z = this.f1877R.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1877R.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void mo2667a() {
        this.f1881V = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1876Q - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0990i0 i0Var = this.f1882W;
        if (i0Var != null) {
            i0Var.mo4830a();
            this.f1882W = null;
        }
    }

    /* renamed from: a */
    private void m2605a(View view, int i, float f, float f2) {
        this.f1881V = true;
        if (VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f1876Q;
        if (i2 != -1) {
            View childAt = getChildAt(i2 - getFirstVisiblePosition());
            if (!(childAt == null || childAt == view || !childAt.isPressed())) {
                childAt.setPressed(false);
            }
        }
        this.f1876Q = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m2602a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }
}
