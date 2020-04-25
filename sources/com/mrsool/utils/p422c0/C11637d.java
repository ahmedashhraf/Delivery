package com.mrsool.utils.p422c0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0195i0;
import com.mrsool.C10232R;
import com.mrsool.utils.p422c0.C11618a.C11620b;
import com.mrsool.utils.p422c0.C11618a.C11623e;

/* renamed from: com.mrsool.utils.c0.d */
/* compiled from: TooltipTextDrawable */
class C11637d extends Drawable {

    /* renamed from: m */
    public static final float f33023m = 1.4f;

    /* renamed from: n */
    public static final float f33024n = 255.0f;

    /* renamed from: o */
    static final String f33025o = "TooltipTextDrawable";

    /* renamed from: a */
    private final RectF f33026a;

    /* renamed from: b */
    private final Path f33027b;

    /* renamed from: c */
    private final Point f33028c = new Point();

    /* renamed from: d */
    private final Rect f33029d = new Rect();

    /* renamed from: e */
    private final Paint f33030e;

    /* renamed from: f */
    private final Paint f33031f;

    /* renamed from: g */
    private final float f33032g;

    /* renamed from: h */
    private final float f33033h;

    /* renamed from: i */
    private Point f33034i;

    /* renamed from: j */
    private int f33035j = 0;

    /* renamed from: k */
    private int f33036k = 0;

    /* renamed from: l */
    private C11623e f33037l;

    public C11637d(Context context, C11620b bVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C10232R.styleable.TooltipLayout, bVar.f32914n, bVar.f32913m);
        this.f33033h = (float) obtainStyledAttributes.getDimensionPixelSize(4, 4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(10, 2);
        int color = obtainStyledAttributes.getColor(3, 0);
        int color2 = obtainStyledAttributes.getColor(9, 0);
        this.f33032g = obtainStyledAttributes.getFloat(2, 1.4f);
        obtainStyledAttributes.recycle();
        this.f33026a = new RectF();
        if (color != 0) {
            this.f33030e = new Paint(1);
            this.f33030e.setColor(color);
            this.f33030e.setStyle(Style.FILL);
        } else {
            this.f33030e = null;
        }
        if (color2 != 0) {
            this.f33031f = new Paint(1);
            this.f33031f.setColor(color2);
            this.f33031f.setStyle(Style.STROKE);
            this.f33031f.setStrokeWidth((float) dimensionPixelSize);
        } else {
            this.f33031f = null;
        }
        this.f33027b = new Path();
    }

    /* renamed from: a */
    public void mo39978a(C11623e eVar, int i, @C0195i0 Point point) {
        if (eVar != this.f33037l || i != this.f33035j || !C11639f.m52472a(this.f33034i, point)) {
            this.f33037l = eVar;
            this.f33035j = i;
            this.f33036k = (int) (((float) i) / this.f33032g);
            if (point != null) {
                this.f33034i = new Point(point);
            } else {
                this.f33034i = null;
            }
            if (!getBounds().isEmpty()) {
                mo39977a(getBounds());
                invalidateSelf();
            }
        }
    }

    public void draw(Canvas canvas) {
        Paint paint = this.f33030e;
        if (paint != null) {
            canvas.drawPath(this.f33027b, paint);
        }
        Paint paint2 = this.f33031f;
        if (paint2 != null) {
            canvas.drawPath(this.f33027b, paint2);
        }
    }

    public int getAlpha() {
        return this.f33030e.getAlpha();
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        copyBounds(this.f33029d);
        Rect rect = this.f33029d;
        int i = this.f33035j;
        rect.inset(i, i);
        outline.setRoundRect(this.f33029d, mo39976a());
        if (getAlpha() < 255) {
            outline.setAlpha(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo39977a(rect);
    }

    public void setAlpha(int i) {
        this.f33030e.setAlpha(i);
        this.f33031f.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo39977a(Rect rect) {
        int i = rect.left;
        int i2 = this.f33035j;
        int i3 = i + i2;
        int i4 = rect.top + i2;
        int i5 = rect.right - i2;
        int i6 = rect.bottom - i2;
        float f = (float) i6;
        float f2 = this.f33033h;
        float f3 = f - f2;
        float f4 = (float) i5;
        float f5 = f4 - f2;
        float f6 = (float) i4;
        float f7 = f6 + f2;
        float f8 = (float) i3;
        float f9 = f2 + f8;
        if (this.f33034i == null || this.f33037l == null) {
            this.f33026a.set(f8, f6, f4, f);
            Path path = this.f33027b;
            RectF rectF = this.f33026a;
            float f10 = this.f33033h;
            path.addRoundRect(rectF, f10, f10, Direction.CW);
            return;
        }
        m52463a(rect, i3, i4, i5, i6, f3, f5, f7, f9);
    }

    /* renamed from: a */
    private void m52463a(Rect rect, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        int i5;
        Rect rect2;
        Rect rect3 = rect;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        Point point = this.f33028c;
        Point point2 = this.f33034i;
        C11623e eVar = this.f33037l;
        C11623e eVar2 = eVar;
        int i10 = i9;
        int i11 = i8;
        boolean a = m52464a(i, i2, i3, i4, f, f2, f3, f4, point, point2, eVar2, this.f33036k);
        int i12 = i4;
        m52462a(i6, i7, i11, i12, this.f33028c);
        this.f33027b.reset();
        float f5 = (float) i6;
        float f6 = (float) i7;
        this.f33027b.moveTo(this.f33033h + f5, f6);
        if (!a || this.f33037l != C11623e.BOTTOM) {
            i5 = i12;
            rect2 = rect;
        } else {
            this.f33027b.lineTo((float) ((this.f33028c.x + i6) - this.f33036k), f6);
            i5 = i12;
            rect2 = rect;
            this.f33027b.lineTo((float) (this.f33028c.x + i6), (float) rect2.top);
            this.f33027b.lineTo((float) (this.f33028c.x + i6 + this.f33036k), f6);
        }
        float f7 = (float) i11;
        this.f33027b.lineTo(f7 - this.f33033h, f6);
        this.f33027b.quadTo(f7, f6, f7, this.f33033h + f6);
        if (a && this.f33037l == C11623e.LEFT) {
            this.f33027b.lineTo(f7, (float) ((this.f33028c.y + i7) - this.f33036k));
            this.f33027b.lineTo((float) rect2.right, (float) (this.f33028c.y + i7));
            this.f33027b.lineTo(f7, (float) (this.f33028c.y + i7 + this.f33036k));
        }
        float f8 = (float) i5;
        this.f33027b.lineTo(f7, f8 - this.f33033h);
        this.f33027b.quadTo(f7, f8, f7 - this.f33033h, f8);
        if (a && this.f33037l == C11623e.TOP) {
            this.f33027b.lineTo((float) (this.f33028c.x + i6 + this.f33036k), f8);
            this.f33027b.lineTo((float) (this.f33028c.x + i6), (float) rect2.bottom);
            this.f33027b.lineTo((float) ((this.f33028c.x + i6) - this.f33036k), f8);
        }
        this.f33027b.lineTo(this.f33033h + f5, f8);
        this.f33027b.quadTo(f5, f8, f5, f8 - this.f33033h);
        if (a && this.f33037l == C11623e.RIGHT) {
            this.f33027b.lineTo(f5, (float) (this.f33028c.y + i7 + this.f33036k));
            this.f33027b.lineTo((float) rect2.left, (float) (this.f33028c.y + i7));
            this.f33027b.lineTo(f5, (float) ((this.f33028c.y + i7) - this.f33036k));
        }
        this.f33027b.lineTo(f5, this.f33033h + f6);
        this.f33027b.quadTo(f5, f6, this.f33033h + f5, f6);
    }

    /* renamed from: a */
    private static boolean m52464a(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, Point point, Point point2, C11623e eVar, int i5) {
        point.set(point2.x, point2.y);
        if (eVar == C11623e.RIGHT || eVar == C11623e.LEFT) {
            int i6 = point.y;
            if (i6 >= i2 && i6 <= i4) {
                if (((float) (i2 + i6 + i5)) > f) {
                    point.y = (int) ((f - ((float) i5)) - ((float) i2));
                    return true;
                } else if (((float) ((i6 + i2) - i5)) >= f3) {
                    return true;
                } else {
                    point.y = (int) ((f3 + ((float) i5)) - ((float) i2));
                    return true;
                }
            }
        } else {
            int i7 = point.x;
            if (i7 >= i && i7 <= i3 && i7 >= i && i7 <= i3) {
                if (((float) (i + i7 + i5)) > f2) {
                    point.x = (int) ((f2 - ((float) i5)) - ((float) i));
                    return true;
                } else if (((float) ((i7 + i) - i5)) >= f4) {
                    return true;
                } else {
                    point.x = (int) ((f4 + ((float) i5)) - ((float) i));
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m52462a(int i, int i2, int i3, int i4, Point point) {
        int i5 = point.y;
        if (i5 < i2) {
            point.y = i2;
        } else if (i5 > i4) {
            point.y = i4;
        }
        if (point.x < i) {
            point.x = i;
        }
        if (point.x > i3) {
            point.x = i3;
        }
    }

    /* renamed from: a */
    public float mo39976a() {
        return this.f33033h;
    }
}
