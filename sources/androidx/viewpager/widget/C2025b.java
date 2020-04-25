package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;

/* renamed from: androidx.viewpager.widget.b */
/* compiled from: PagerTabStrip */
public class C2025b extends C2028c {

    /* renamed from: A0 */
    private static final int f7772A0 = 32;

    /* renamed from: B0 */
    private static final int f7773B0 = 64;

    /* renamed from: C0 */
    private static final int f7774C0 = 1;

    /* renamed from: D0 */
    private static final int f7775D0 = 32;

    /* renamed from: w0 */
    private static final String f7776w0 = "PagerTabStrip";

    /* renamed from: x0 */
    private static final int f7777x0 = 3;

    /* renamed from: y0 */
    private static final int f7778y0 = 6;

    /* renamed from: z0 */
    private static final int f7779z0 = 16;

    /* renamed from: g0 */
    private int f7780g0;

    /* renamed from: h0 */
    private int f7781h0;

    /* renamed from: i0 */
    private int f7782i0;

    /* renamed from: j0 */
    private int f7783j0;

    /* renamed from: k0 */
    private int f7784k0;

    /* renamed from: l0 */
    private int f7785l0;

    /* renamed from: m0 */
    private final Paint f7786m0;

    /* renamed from: n0 */
    private final Rect f7787n0;

    /* renamed from: o0 */
    private int f7788o0;

    /* renamed from: p0 */
    private boolean f7789p0;

    /* renamed from: q0 */
    private boolean f7790q0;

    /* renamed from: r0 */
    private int f7791r0;

    /* renamed from: s0 */
    private boolean f7792s0;

    /* renamed from: t0 */
    private float f7793t0;

    /* renamed from: u0 */
    private float f7794u0;

    /* renamed from: v0 */
    private int f7795v0;

    /* renamed from: androidx.viewpager.widget.b$a */
    /* compiled from: PagerTabStrip */
    class C2026a implements OnClickListener {
        C2026a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = C2025b.this.f7812a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    /* renamed from: androidx.viewpager.widget.b$b */
    /* compiled from: PagerTabStrip */
    class C2027b implements OnClickListener {
        C2027b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = C2025b.this.f7812a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public C2025b(@C0193h0 Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8899a(int i, float f, boolean z) {
        Rect rect = this.f7787n0;
        int height = getHeight();
        int i2 = height - this.f7781h0;
        rect.set(this.f7802N.getLeft() - this.f7785l0, i2, this.f7802N.getRight() + this.f7785l0, height);
        super.mo8899a(i, f, z);
        this.f7788o0 = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f7802N.getLeft() - this.f7785l0, i2, this.f7802N.getRight() + this.f7785l0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f7789p0;
    }

    /* access modifiers changed from: 0000 */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f7784k0);
    }

    @C0198k
    public int getTabIndicatorColor() {
        return this.f7780g0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f7802N.getLeft() - this.f7785l0;
        int right = this.f7802N.getRight() + this.f7785l0;
        int i = height - this.f7781h0;
        this.f7786m0.setColor((this.f7788o0 << 24) | (this.f7780g0 & C0962e0.f4342s));
        float f = (float) height;
        canvas.drawRect((float) left, (float) i, (float) right, f, this.f7786m0);
        if (this.f7789p0) {
            this.f7786m0.setColor(-16777216 | (this.f7780g0 & C0962e0.f4342s));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f7791r0), (float) (getWidth() - getPaddingRight()), f, this.f7786m0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f7792s0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f7793t0 = x;
            this.f7794u0 = y;
            this.f7792s0 = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x - this.f7793t0) > ((float) this.f7795v0) || Math.abs(y - this.f7794u0) > ((float) this.f7795v0))) {
                this.f7792s0 = true;
            }
        } else if (x < ((float) (this.f7802N.getLeft() - this.f7785l0))) {
            ViewPager viewPager = this.f7812a;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x > ((float) (this.f7802N.getRight() + this.f7785l0))) {
            ViewPager viewPager2 = this.f7812a;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    public void setBackgroundColor(@C0198k int i) {
        super.setBackgroundColor(i);
        if (!this.f7790q0) {
            this.f7789p0 = (i & C0962e0.f4343t) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f7790q0) {
            this.f7789p0 = drawable == null;
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        if (!this.f7790q0) {
            this.f7789p0 = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f7789p0 = z;
        this.f7790q0 = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        int i5 = this.f7782i0;
        if (i4 < i5) {
            i4 = i5;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@C0198k int i) {
        this.f7780g0 = i;
        this.f7786m0.setColor(this.f7780g0);
        invalidate();
    }

    public void setTabIndicatorColorResource(@C0202m int i) {
        setTabIndicatorColor(C0841b.m4915a(getContext(), i));
    }

    public void setTextSpacing(int i) {
        int i2 = this.f7783j0;
        if (i < i2) {
            i = i2;
        }
        super.setTextSpacing(i);
    }

    public C2025b(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7786m0 = new Paint();
        this.f7787n0 = new Rect();
        this.f7788o0 = 255;
        this.f7789p0 = false;
        this.f7790q0 = false;
        this.f7780g0 = this.f7815b0;
        this.f7786m0.setColor(this.f7780g0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f7781h0 = (int) ((3.0f * f) + 0.5f);
        this.f7782i0 = (int) ((6.0f * f) + 0.5f);
        this.f7783j0 = (int) (64.0f * f);
        this.f7785l0 = (int) ((16.0f * f) + 0.5f);
        this.f7791r0 = (int) ((1.0f * f) + 0.5f);
        this.f7784k0 = (int) ((f * 32.0f) + 0.5f);
        this.f7795v0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f7814b.setFocusable(true);
        this.f7814b.setOnClickListener(new C2026a());
        this.f7803O.setFocusable(true);
        this.f7803O.setOnClickListener(new C2027b());
        if (getBackground() == null) {
            this.f7789p0 = true;
        }
    }
}
