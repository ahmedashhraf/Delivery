package com.instabug.bug.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instabug.bug.C9231R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class CorneredImageView extends ImageView {

    /* renamed from: P */
    private static transient /* synthetic */ boolean[] f24623P;

    /* renamed from: N */
    private int f24624N;

    /* renamed from: O */
    private int f24625O;

    /* renamed from: a */
    private final RectF f24626a;

    /* renamed from: b */
    private final Path f24627b;

    /* renamed from: com.instabug.bug.view.CorneredImageView$a */
    public static class C9298a extends Drawable {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f24628c;

        /* renamed from: a */
        public Paint f24629a = new Paint();

        /* renamed from: b */
        public Rect f24630b;

        public C9298a(int i, int i2) {
            boolean[] a = m43579a();
            a[0] = true;
            a[1] = true;
            this.f24629a.setColor(i);
            a[2] = true;
            this.f24629a.setStrokeWidth((float) i2);
            a[3] = true;
            this.f24629a.setStyle(Style.STROKE);
            a[4] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43579a() {
            boolean[] zArr = f24628c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6257480594004141751L, "com/instabug/bug/view/CorneredImageView$Border", 10);
            f24628c = a;
            return a;
        }

        public void draw(Canvas canvas) {
            boolean[] a = m43579a();
            canvas.drawRect(this.f24630b, this.f24629a);
            a[6] = true;
        }

        public int getOpacity() {
            m43579a()[9] = true;
            return -1;
        }

        public void onBoundsChange(Rect rect) {
            boolean[] a = m43579a();
            this.f24630b = rect;
            a[5] = true;
        }

        public void setAlpha(int i) {
            m43579a()[7] = true;
        }

        public void setColorFilter(ColorFilter colorFilter) {
            m43579a()[8] = true;
        }
    }

    public CorneredImageView(Context context) {
        boolean[] b = m43578b();
        this(context, null);
        b[0] = true;
    }

    /* renamed from: a */
    private void m43576a() {
        boolean[] b = m43578b();
        this.f24627b.rewind();
        if (((float) this.f24624N) < 1.0f) {
            b[24] = true;
        } else if (this.f24625O == 0) {
            b[25] = true;
        } else {
            b[26] = true;
            int width = getWidth();
            b[27] = true;
            int height = getHeight();
            int i = this.f24624N;
            float f = (float) (i * 2);
            b[28] = true;
            this.f24626a.set((float) (-i), (float) (-i), (float) i, (float) i);
            b[29] = true;
            if (m43577a(1)) {
                b[30] = true;
                this.f24626a.offsetTo(0.0f, 0.0f);
                b[31] = true;
                this.f24627b.arcTo(this.f24626a, 180.0f, 90.0f);
                b[32] = true;
            } else {
                this.f24627b.moveTo(0.0f, 0.0f);
                b[33] = true;
            }
            if (m43577a(2)) {
                b[34] = true;
                this.f24626a.offsetTo(((float) width) - f, 0.0f);
                b[35] = true;
                this.f24627b.arcTo(this.f24626a, 270.0f, 90.0f);
                b[36] = true;
            } else {
                this.f24627b.lineTo((float) width, 0.0f);
                b[37] = true;
            }
            if (m43577a(4)) {
                b[38] = true;
                this.f24626a.offsetTo(((float) width) - f, ((float) height) - f);
                b[39] = true;
                this.f24627b.arcTo(this.f24626a, 0.0f, 90.0f);
                b[40] = true;
            } else {
                this.f24627b.lineTo((float) width, (float) height);
                b[41] = true;
            }
            if (m43577a(8)) {
                b[42] = true;
                this.f24626a.offsetTo(0.0f, ((float) height) - f);
                b[43] = true;
                this.f24627b.arcTo(this.f24626a, 90.0f, 90.0f);
                b[44] = true;
            } else {
                this.f24627b.lineTo(0.0f, (float) height);
                b[45] = true;
            }
            this.f24627b.close();
            b[46] = true;
        }
        b[47] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m43578b() {
        boolean[] zArr = f24623P;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4824111198514870923L, "com/instabug/bug/view/CorneredImageView", 51);
        f24623P = a;
        return a;
    }

    public int getRadius() {
        boolean[] b = m43578b();
        int i = this.f24624N;
        b[12] = true;
        return i;
    }

    public int getRoundedCorners() {
        boolean[] b = m43578b();
        int i = this.f24625O;
        b[13] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] b = m43578b();
        if (this.f24627b.isEmpty()) {
            b[20] = true;
        } else {
            b[21] = true;
            canvas.clipPath(this.f24627b);
            b[22] = true;
        }
        super.onDraw(canvas);
        b[23] = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] b = m43578b();
        super.onSizeChanged(i, i2, i3, i4);
        b[18] = true;
        m43576a();
        b[19] = true;
    }

    public void setCornerRadius(int i) {
        boolean[] b = m43578b();
        this.f24624N = i;
        b[9] = true;
        m43576a();
        b[10] = true;
        invalidate();
        b[11] = true;
    }

    public void setRoundedCorners(int i) {
        boolean[] b = m43578b();
        this.f24625O = i;
        b[14] = true;
        m43576a();
        b[15] = true;
        setBackgroundDrawable(new C9298a(0, 10));
        b[16] = true;
        invalidate();
        b[17] = true;
    }

    public CorneredImageView(Context context, AttributeSet attributeSet) {
        boolean[] b = m43578b();
        this(context, attributeSet, 0);
        b[1] = true;
    }

    public CorneredImageView(Context context, AttributeSet attributeSet, int i) {
        boolean[] b = m43578b();
        super(context, attributeSet, i);
        b[2] = true;
        this.f24626a = new RectF();
        b[3] = true;
        this.f24627b = new Path();
        b[4] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9231R.styleable.CorneredImageView);
        b[5] = true;
        this.f24624N = obtainStyledAttributes.getDimensionPixelSize(C9231R.styleable.CorneredImageView_ib_bug_cornerRadius, 0);
        b[6] = true;
        this.f24625O = obtainStyledAttributes.getInt(C9231R.styleable.CorneredImageView_ib_bug_roundedCorners, 0);
        b[7] = true;
        obtainStyledAttributes.recycle();
        b[8] = true;
    }

    /* renamed from: a */
    private boolean m43577a(int i) {
        boolean z;
        boolean[] b = m43578b();
        if ((this.f24625O & i) == i) {
            b[48] = true;
            z = true;
        } else {
            z = false;
            b[49] = true;
        }
        b[50] = true;
        return z;
    }
}
