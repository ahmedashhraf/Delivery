package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.OnHierarchyChangeListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.widget.C1120m;
import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.C3879b.C3880a;
import com.futuremind.recyclerviewfastscroll.p163e.C3884b;
import com.futuremind.recyclerviewfastscroll.p163e.C3885c;

public class FastScroller extends LinearLayout {

    /* renamed from: c0 */
    private static final int f12267c0 = -1;

    /* renamed from: N */
    private View f12268N;

    /* renamed from: O */
    private View f12269O;

    /* renamed from: P */
    private TextView f12270P;

    /* renamed from: Q */
    private int f12271Q;

    /* renamed from: R */
    private int f12272R;

    /* renamed from: S */
    private int f12273S;

    /* renamed from: T */
    private int f12274T;

    /* renamed from: U */
    private int f12275U;

    /* renamed from: V */
    private int f12276V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f12277W;

    /* renamed from: a */
    private final C3879b f12278a;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public C3885c f12279a0;

    /* renamed from: b */
    private RecyclerView f12280b;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C3881c f12281b0;

    /* renamed from: com.futuremind.recyclerviewfastscroll.FastScroller$a */
    class C3871a implements OnHierarchyChangeListener {
        C3871a() {
        }

        public void onChildViewAdded(View view, View view2) {
            FastScroller.this.m16944e();
        }

        public void onChildViewRemoved(View view, View view2) {
            FastScroller.this.m16944e();
        }
    }

    /* renamed from: com.futuremind.recyclerviewfastscroll.FastScroller$b */
    class C3872b implements OnTouchListener {
        C3872b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            FastScroller.this.requestDisallowInterceptTouchEvent(true);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                if (FastScroller.this.f12281b0 != null && motionEvent.getAction() == 0) {
                    FastScroller.this.f12279a0.mo17174f();
                }
                FastScroller.this.f12277W = true;
                float a = FastScroller.this.m16934a(motionEvent);
                FastScroller.this.setScrollerPosition(a);
                FastScroller.this.setRecyclerViewPosition(a);
                return true;
            } else if (motionEvent.getAction() != 1) {
                return false;
            } else {
                FastScroller.this.f12277W = false;
                if (FastScroller.this.f12281b0 != null) {
                    FastScroller.this.f12279a0.mo17175g();
                }
                return true;
            }
        }
    }

    public FastScroller(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m16943d() {
        this.f12269O.setOnTouchListener(new C3872b());
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m16944e() {
        if (this.f12280b.getAdapter() == null || this.f12280b.getAdapter().mo7325b() == 0 || this.f12280b.getChildAt(0) == null || m16945f() || this.f12276V != 0) {
            super.setVisibility(4);
        } else {
            super.setVisibility(0);
        }
    }

    /* renamed from: f */
    private boolean m16945f() {
        boolean z = true;
        if (mo17139a()) {
            if (this.f12280b.getChildAt(0).getHeight() * this.f12280b.getAdapter().mo7325b() > this.f12280b.getHeight()) {
                z = false;
            }
            return z;
        }
        if (this.f12280b.getChildAt(0).getWidth() * this.f12280b.getAdapter().mo7325b() > this.f12280b.getWidth()) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        RecyclerView recyclerView = this.f12280b;
        if (recyclerView != null) {
            int b = recyclerView.getAdapter().mo7325b();
            int a = (int) C3882d.m16956a(0.0f, (float) (b - 1), (float) ((int) (f * ((float) b))));
            this.f12280b.scrollToPosition(a);
            C3881c cVar = this.f12281b0;
            if (cVar != null) {
                TextView textView = this.f12270P;
                if (textView != null) {
                    textView.setText(cVar.mo17158a(a));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public C3885c getViewProvider() {
        return this.f12279a0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m16943d();
        this.f12271Q = this.f12279a0.mo17164b();
        m16942c();
        this.f12278a.mo17155a(this.f12280b);
    }

    public void setBubbleColor(int i) {
        this.f12273S = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.f12274T = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.f12272R = i;
        invalidate();
    }

    public void setOrientation(int i) {
        this.f12275U = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.f12280b = recyclerView;
        if (recyclerView.getAdapter() instanceof C3881c) {
            this.f12281b0 = (C3881c) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.f12278a);
        m16944e();
        recyclerView.setOnHierarchyChangeListener(new C3871a());
    }

    /* access modifiers changed from: 0000 */
    public void setScrollerPosition(float f) {
        if (mo17139a()) {
            this.f12268N.setY(C3882d.m16956a(0.0f, (float) (getHeight() - this.f12268N.getHeight()), (((float) (getHeight() - this.f12269O.getHeight())) * f) + ((float) this.f12271Q)));
            this.f12269O.setY(C3882d.m16956a(0.0f, (float) (getHeight() - this.f12269O.getHeight()), f * ((float) (getHeight() - this.f12269O.getHeight()))));
            return;
        }
        this.f12268N.setX(C3882d.m16956a(0.0f, (float) (getWidth() - this.f12268N.getWidth()), (((float) (getWidth() - this.f12269O.getWidth())) * f) + ((float) this.f12271Q)));
        this.f12269O.setX(C3882d.m16956a(0.0f, (float) (getWidth() - this.f12269O.getWidth()), f * ((float) (getWidth() - this.f12269O.getWidth()))));
    }

    public void setViewProvider(C3885c cVar) {
        removeAllViews();
        this.f12279a0 = cVar;
        cVar.mo17170a(this);
        this.f12268N = cVar.mo17163a((ViewGroup) this);
        this.f12269O = cVar.mo17165b(this);
        this.f12270P = cVar.mo17167k();
        addView(this.f12268N);
        addView(this.f12269O);
    }

    public void setVisibility(int i) {
        this.f12276V = i;
        m16944e();
    }

    public FastScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m16942c() {
        int i = this.f12273S;
        if (i != -1) {
            m16936a((View) this.f12270P, i);
        }
        int i2 = this.f12272R;
        if (i2 != -1) {
            m16936a(this.f12269O, i2);
        }
        int i3 = this.f12274T;
        if (i3 != -1) {
            C1120m.m6391e(this.f12270P, i3);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo17140b() {
        return this.f12269O != null && !this.f12277W && this.f12280b.getChildCount() > 0;
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12278a = new C3879b(this);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3873R.styleable.fastscroll__fastScroller, C3873R.attr.fastscroll__style, 0);
        try {
            this.f12273S = obtainStyledAttributes.getColor(C3873R.styleable.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.f12272R = obtainStyledAttributes.getColor(C3873R.styleable.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.f12274T = obtainStyledAttributes.getResourceId(C3873R.styleable.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            obtainStyledAttributes.recycle();
            this.f12276V = getVisibility();
            setViewProvider(new C3884b());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo17138a(C3880a aVar) {
        this.f12278a.mo17156a(aVar);
    }

    /* renamed from: a */
    private void m16936a(View view, int i) {
        Drawable i2 = C0892a.m5161i(view.getBackground());
        if (i2 != null) {
            C0892a.m5154b(i2.mutate(), i);
            C3882d.m16958a(view, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public float m16934a(MotionEvent motionEvent) {
        float rawX;
        int width;
        int width2;
        if (mo17139a()) {
            rawX = motionEvent.getRawY() - C3882d.m16959b(this.f12269O);
            width = getHeight();
            width2 = this.f12269O.getHeight();
        } else {
            rawX = motionEvent.getRawX() - C3882d.m16957a(this.f12269O);
            width = getWidth();
            width2 = this.f12269O.getWidth();
        }
        return rawX / ((float) (width - width2));
    }

    /* renamed from: a */
    public boolean mo17139a() {
        return this.f12275U == 1;
    }
}
