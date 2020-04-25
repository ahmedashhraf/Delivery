package androidx.appcompat.p008b.p009a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0215r;
import androidx.appcompat.C0238R;
import androidx.core.graphics.drawable.C0892a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: androidx.appcompat.b.a.d */
/* compiled from: DrawerArrowDrawable */
public class C0332d extends Drawable {

    /* renamed from: m */
    public static final int f1087m = 0;

    /* renamed from: n */
    public static final int f1088n = 1;

    /* renamed from: o */
    public static final int f1089o = 2;

    /* renamed from: p */
    public static final int f1090p = 3;

    /* renamed from: q */
    private static final float f1091q = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    private final Paint f1092a = new Paint();

    /* renamed from: b */
    private float f1093b;

    /* renamed from: c */
    private float f1094c;

    /* renamed from: d */
    private float f1095d;

    /* renamed from: e */
    private float f1096e;

    /* renamed from: f */
    private boolean f1097f;

    /* renamed from: g */
    private final Path f1098g = new Path();

    /* renamed from: h */
    private final int f1099h;

    /* renamed from: i */
    private boolean f1100i = false;

    /* renamed from: j */
    private float f1101j;

    /* renamed from: k */
    private float f1102k;

    /* renamed from: l */
    private int f1103l = 2;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.appcompat.b.a.d$a */
    /* compiled from: DrawerArrowDrawable */
    public @interface C0333a {
    }

    public C0332d(Context context) {
        this.f1092a.setStyle(Style.STROKE);
        this.f1092a.setStrokeJoin(Join.MITER);
        this.f1092a.setStrokeCap(Cap.BUTT);
        this.f1092a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0238R.styleable.DrawerArrowToggle, C0238R.attr.drawerArrowStyle, C0238R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        mo1277a(obtainStyledAttributes.getColor(C0238R.styleable.DrawerArrowToggle_color, 0));
        mo1286d(obtainStyledAttributes.getDimension(C0238R.styleable.DrawerArrowToggle_thickness, 0.0f));
        mo1278a(obtainStyledAttributes.getBoolean(C0238R.styleable.DrawerArrowToggle_spinBars, true));
        mo1289e((float) Math.round(obtainStyledAttributes.getDimension(C0238R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0f)));
        this.f1099h = obtainStyledAttributes.getDimensionPixelSize(C0238R.styleable.DrawerArrowToggle_drawableSize, 0);
        this.f1094c = (float) Math.round(obtainStyledAttributes.getDimension(C0238R.styleable.DrawerArrowToggle_barLength, 0.0f));
        this.f1093b = (float) Math.round(obtainStyledAttributes.getDimension(C0238R.styleable.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f1095d = obtainStyledAttributes.getDimension(C0238R.styleable.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static float m1829a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void mo1276a(float f) {
        if (this.f1093b != f) {
            this.f1093b = f;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo1280b(float f) {
        if (this.f1095d != f) {
            this.f1095d = f;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public float mo1283c() {
        return this.f1094c;
    }

    /* renamed from: d */
    public void mo1286d(float f) {
        if (this.f1092a.getStrokeWidth() != f) {
            this.f1092a.setStrokeWidth(f);
            double d = (double) (f / 2.0f);
            double cos = Math.cos((double) f1091q);
            Double.isNaN(d);
            this.f1102k = (float) (d * cos);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f1103l;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? C0892a.m5157e(this) == 0 : C0892a.m5157e(this) == 1))) {
            z = true;
        }
        float f = this.f1093b;
        float a = m1829a(this.f1094c, (float) Math.sqrt((double) (f * f * 2.0f)), this.f1101j);
        float a2 = m1829a(this.f1094c, this.f1095d, this.f1101j);
        float round = (float) Math.round(m1829a(0.0f, this.f1102k, this.f1101j));
        float a3 = m1829a(0.0f, f1091q, this.f1101j);
        double d = (double) a;
        float a4 = m1829a(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f1101j);
        double d2 = (double) a3;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        boolean z2 = z;
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f1098g.rewind();
        float a5 = m1829a(this.f1096e + this.f1092a.getStrokeWidth(), -this.f1102k, this.f1101j);
        float f2 = (-a2) / 2.0f;
        this.f1098g.moveTo(f2 + round, 0.0f);
        this.f1098g.rLineTo(a2 - (round * 2.0f), 0.0f);
        this.f1098g.moveTo(f2, a5);
        this.f1098g.rLineTo(round2, round3);
        this.f1098g.moveTo(f2, -a5);
        this.f1098g.rLineTo(round2, -round3);
        this.f1098g.close();
        canvas.save();
        float strokeWidth = this.f1092a.getStrokeWidth();
        float height = ((float) bounds.height()) - (3.0f * strokeWidth);
        float f3 = this.f1096e;
        canvas2.translate((float) bounds.centerX(), ((float) ((((int) (height - (2.0f * f3))) / 4) * 2)) + (strokeWidth * 1.5f) + f3);
        if (this.f1097f) {
            canvas2.rotate(a4 * ((float) (this.f1100i ^ z2 ? -1 : 1)));
        } else if (z2) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f1098g, this.f1092a);
        canvas.restore();
    }

    @C0198k
    /* renamed from: e */
    public int mo1288e() {
        return this.f1092a.getColor();
    }

    /* renamed from: f */
    public int mo1290f() {
        return this.f1103l;
    }

    /* renamed from: g */
    public float mo1292g() {
        return this.f1096e;
    }

    public int getIntrinsicHeight() {
        return this.f1099h;
    }

    public int getIntrinsicWidth() {
        return this.f1099h;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final Paint mo1296h() {
        return this.f1092a;
    }

    @C0215r(from = 0.0d, mo670to = 1.0d)
    /* renamed from: i */
    public float mo1297i() {
        return this.f1101j;
    }

    /* renamed from: j */
    public boolean mo1298j() {
        return this.f1097f;
    }

    public void setAlpha(int i) {
        if (i != this.f1092a.getAlpha()) {
            this.f1092a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1092a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: c */
    public void mo1284c(float f) {
        if (this.f1094c != f) {
            this.f1094c = f;
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public void mo1289e(float f) {
        if (f != this.f1096e) {
            this.f1096e = f;
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo1291f(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        if (this.f1101j != f) {
            this.f1101j = f;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public float mo1275a() {
        return this.f1093b;
    }

    /* renamed from: b */
    public float mo1279b() {
        return this.f1095d;
    }

    /* renamed from: a */
    public void mo1277a(@C0198k int i) {
        if (i != this.f1092a.getColor()) {
            this.f1092a.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo1281b(int i) {
        if (i != this.f1103l) {
            this.f1103l = i;
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public float mo1285d() {
        return this.f1092a.getStrokeWidth();
    }

    /* renamed from: a */
    public void mo1278a(boolean z) {
        if (this.f1097f != z) {
            this.f1097f = z;
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public void mo1282b(boolean z) {
        if (this.f1100i != z) {
            this.f1100i = z;
            invalidateSelf();
        }
    }
}
