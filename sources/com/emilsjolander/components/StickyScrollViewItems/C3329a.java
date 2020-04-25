package com.emilsjolander.components.StickyScrollViewItems;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.emilsjolander.components.StickyScrollViewItems.a */
/* compiled from: StickyScrollView */
public class C3329a extends ScrollView {

    /* renamed from: W */
    public static final String f11756W = "sticky";

    /* renamed from: a0 */
    public static final String f11757a0 = "-nonconstant";

    /* renamed from: b0 */
    public static final String f11758b0 = "-hastransparancy";

    /* renamed from: c0 */
    private static final int f11759c0 = 10;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public float f11760N;

    /* renamed from: O */
    private int f11761O;

    /* renamed from: P */
    private boolean f11762P;

    /* renamed from: Q */
    private boolean f11763Q;

    /* renamed from: R */
    private boolean f11764R;

    /* renamed from: S */
    private int f11765S;

    /* renamed from: T */
    private Drawable f11766T;

    /* renamed from: U */
    private final Runnable f11767U;

    /* renamed from: V */
    private boolean f11768V;

    /* renamed from: a */
    private ArrayList<View> f11769a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public View f11770b;

    /* renamed from: com.emilsjolander.components.StickyScrollViewItems.a$a */
    /* compiled from: StickyScrollView */
    class C3330a implements Runnable {
        C3330a() {
        }

        public void run() {
            if (C3329a.this.f11770b != null) {
                C3329a aVar = C3329a.this;
                int a = aVar.m15710c(aVar.f11770b);
                C3329a aVar2 = C3329a.this;
                int b = aVar2.m15708b(aVar2.f11770b);
                C3329a aVar3 = C3329a.this;
                C3329a.this.invalidate(a, b, aVar3.m15713d(aVar3.f11770b), (int) (((float) C3329a.this.getScrollY()) + ((float) C3329a.this.f11770b.getHeight()) + C3329a.this.f11760N));
            }
            C3329a.this.postDelayed(this, 16);
        }
    }

    public C3329a(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m15713d(View view) {
        int right = view.getRight();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            right += view.getRight();
        }
        return right;
    }

    /* renamed from: e */
    private void m15716e() {
        if (m15715e(this.f11770b).contains(f11758b0)) {
            m15719h(this.f11770b);
        }
        this.f11770b = null;
        removeCallbacks(this.f11767U);
    }

    /* renamed from: f */
    private int m15717f(View view) {
        int top = view.getTop();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            top += view.getTop();
        }
        return top;
    }

    /* renamed from: g */
    private void m15718g(View view) {
        if (VERSION.SDK_INT >= 11) {
            view.setAlpha(0.0f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(0);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: h */
    private void m15719h(View view) {
        if (VERSION.SDK_INT >= 11) {
            view.setAlpha(1.0f);
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(0);
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: i */
    private void m15720i(View view) {
        this.f11770b = view;
        if (m15715e(this.f11770b).contains(f11758b0)) {
            m15718g(this.f11770b);
        }
        if (((String) this.f11770b.getTag()).contains(f11757a0)) {
            post(this.f11767U);
        }
    }

    public void addView(View view) {
        super.addView(view);
        m15706a(view);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f11770b != null) {
            canvas.save();
            canvas.translate((float) (getPaddingLeft() + this.f11761O), ((float) getScrollY()) + this.f11760N + ((float) (this.f11763Q ? getPaddingTop() : 0)));
            canvas.clipRect(0.0f, this.f11763Q ? -this.f11760N : 0.0f, (float) (getWidth() - this.f11761O), (float) (this.f11770b.getHeight() + this.f11765S + 1));
            if (this.f11766T != null) {
                this.f11766T.setBounds(0, this.f11770b.getHeight(), this.f11770b.getWidth(), this.f11770b.getHeight() + this.f11765S);
                this.f11766T.draw(canvas);
            }
            canvas.clipRect(0.0f, this.f11763Q ? -this.f11760N : 0.0f, (float) getWidth(), (float) this.f11770b.getHeight());
            if (m15715e(this.f11770b).contains(f11758b0)) {
                m15719h(this.f11770b);
                this.f11770b.draw(canvas);
                m15718g(this.f11770b);
            } else {
                this.f11770b.draw(canvas);
            }
            canvas.restore();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 0) {
            this.f11762P = true;
        }
        if (this.f11762P) {
            this.f11762P = this.f11770b != null;
            if (this.f11762P) {
                if (motionEvent.getY() > ((float) this.f11770b.getHeight()) + this.f11760N || motionEvent.getX() < ((float) m15710c(this.f11770b)) || motionEvent.getX() > ((float) m15713d(this.f11770b))) {
                    z = false;
                }
                this.f11762P = z;
            }
        } else if (this.f11770b == null) {
            this.f11762P = false;
        }
        if (this.f11762P) {
            motionEvent.offsetLocation(0.0f, ((((float) getScrollY()) + this.f11760N) - ((float) m15717f(this.f11770b))) * -1.0f);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f11764R) {
            this.f11763Q = true;
        }
        m15714d();
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m15712c();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f11762P) {
            motionEvent.offsetLocation(0.0f, (((float) getScrollY()) + this.f11760N) - ((float) m15717f(this.f11770b)));
        }
        if (motionEvent.getAction() == 0) {
            this.f11768V = false;
        }
        if (this.f11768V) {
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            super.onTouchEvent(obtain);
            this.f11768V = false;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f11768V = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.f11763Q = z;
        this.f11764R = true;
    }

    public void setShadowHeight(int i) {
        this.f11765S = i;
    }

    public C3329a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842880);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m15710c(View view) {
        int left = view.getLeft();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            left += view.getLeft();
        }
        return left;
    }

    public C3329a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11767U = new C3330a();
        this.f11768V = true;
        mo13129b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3328R.styleable.StickyScrollView, i, 0);
        this.f11765S = obtainStyledAttributes.getDimensionPixelSize(0, (int) ((context.getResources().getDisplayMetrics().density * 10.0f) + 0.5f));
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        if (resourceId != -1) {
            this.f11766T = context.getResources().getDrawable(resourceId);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public void mo13123a() {
        m15714d();
    }

    public void addView(View view, int i) {
        super.addView(view, i);
        m15706a(view);
    }

    /* renamed from: b */
    public void mo13129b() {
        this.f11769a = new ArrayList<>();
    }

    /* renamed from: a */
    private void m15706a(View view) {
        boolean z = view instanceof ViewGroup;
        String str = f11756W;
        if (z) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                String e = m15715e(viewGroup.getChildAt(i));
                if (e != null && e.contains(str)) {
                    this.f11769a.add(viewGroup.getChildAt(i));
                } else if (viewGroup.getChildAt(i) instanceof ViewGroup) {
                    m15706a(viewGroup.getChildAt(i));
                }
            }
            return;
        }
        String str2 = (String) view.getTag();
        if (str2 != null && str2.contains(str)) {
            this.f11769a.add(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m15708b(View view) {
        int bottom = view.getBottom();
        while (view.getParent() != getChildAt(0)) {
            view = (View) view.getParent();
            bottom += view.getBottom();
        }
        return bottom;
    }

    /* renamed from: d */
    private void m15714d() {
        if (this.f11770b != null) {
            m15716e();
        }
        this.f11769a.clear();
        m15706a(getChildAt(0));
        m15712c();
        invalidate();
    }

    /* renamed from: e */
    private String m15715e(View view) {
        return String.valueOf(view.getTag());
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        m15706a(view);
    }

    /* renamed from: c */
    private void m15712c() {
        float f;
        Iterator it = this.f11769a.iterator();
        View view = null;
        View view2 = null;
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            View view3 = (View) it.next();
            int f2 = (m15717f(view3) - getScrollY()) + (this.f11763Q ? 0 : getPaddingTop());
            if (f2 <= 0) {
                if (view != null) {
                    int f3 = m15717f(view) - getScrollY();
                    if (!this.f11763Q) {
                        i = getPaddingTop();
                    }
                    if (f2 <= f3 + i) {
                    }
                }
                view = view3;
            } else {
                if (view2 != null) {
                    int f4 = m15717f(view2) - getScrollY();
                    if (!this.f11763Q) {
                        i = getPaddingTop();
                    }
                    if (f2 >= f4 + i) {
                    }
                }
                view2 = view3;
            }
        }
        if (view != null) {
            if (view2 == null) {
                f = 0.0f;
            } else {
                f = (float) Math.min(0, ((m15717f(view2) - getScrollY()) + (this.f11763Q ? 0 : getPaddingTop())) - view.getHeight());
            }
            this.f11760N = f;
            View view4 = this.f11770b;
            if (view != view4) {
                if (view4 != null) {
                    m15716e();
                }
                this.f11761O = m15710c(view);
                m15720i(view);
            }
        } else if (this.f11770b != null) {
            m15716e();
        }
    }

    public void addView(View view, int i, int i2) {
        super.addView(view, i, i2);
        m15706a(view);
    }

    public void addView(View view, LayoutParams layoutParams) {
        super.addView(view, layoutParams);
        m15706a(view);
    }
}
