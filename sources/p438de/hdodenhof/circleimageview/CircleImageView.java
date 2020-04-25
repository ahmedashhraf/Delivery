package p438de.hdodenhof.circleimageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import androidx.annotation.RequiresApi;

/* renamed from: de.hdodenhof.circleimageview.CircleImageView */
public class CircleImageView extends ImageView {

    /* renamed from: i0 */
    private static final ScaleType f35189i0 = ScaleType.CENTER_CROP;

    /* renamed from: j0 */
    private static final Config f35190j0 = Config.ARGB_8888;

    /* renamed from: k0 */
    private static final int f35191k0 = 2;

    /* renamed from: l0 */
    private static final int f35192l0 = 0;

    /* renamed from: m0 */
    private static final int f35193m0 = -16777216;

    /* renamed from: n0 */
    private static final int f35194n0 = 0;

    /* renamed from: o0 */
    private static final boolean f35195o0 = false;

    /* renamed from: N */
    private final Matrix f35196N;

    /* renamed from: O */
    private final Paint f35197O;

    /* renamed from: P */
    private final Paint f35198P;

    /* renamed from: Q */
    private final Paint f35199Q;

    /* renamed from: R */
    private int f35200R;

    /* renamed from: S */
    private int f35201S;

    /* renamed from: T */
    private int f35202T;

    /* renamed from: U */
    private Bitmap f35203U;

    /* renamed from: V */
    private BitmapShader f35204V;

    /* renamed from: W */
    private int f35205W;

    /* renamed from: a */
    private final RectF f35206a;

    /* renamed from: a0 */
    private int f35207a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final RectF f35208b;

    /* renamed from: b0 */
    private float f35209b0;

    /* renamed from: c0 */
    private float f35210c0;

    /* renamed from: d0 */
    private ColorFilter f35211d0;

    /* renamed from: e0 */
    private boolean f35212e0;

    /* renamed from: f0 */
    private boolean f35213f0;

    /* renamed from: g0 */
    private boolean f35214g0;

    /* renamed from: h0 */
    private boolean f35215h0;

    @RequiresApi(api = 21)
    /* renamed from: de.hdodenhof.circleimageview.CircleImageView$b */
    private class C12196b extends ViewOutlineProvider {
        private C12196b() {
        }

        public void getOutline(View view, Outline outline) {
            Rect rect = new Rect();
            CircleImageView.this.f35208b.roundOut(rect);
            outline.setRoundRect(rect, ((float) rect.width()) / 2.0f);
        }
    }

    public CircleImageView(Context context) {
        super(context);
        this.f35206a = new RectF();
        this.f35208b = new RectF();
        this.f35196N = new Matrix();
        this.f35197O = new Paint();
        this.f35198P = new Paint();
        this.f35199Q = new Paint();
        this.f35200R = -16777216;
        this.f35201S = 0;
        this.f35202T = 0;
        m54839e();
    }

    /* renamed from: c */
    private void m54837c() {
        this.f35197O.setColorFilter(this.f35211d0);
    }

    /* renamed from: d */
    private RectF m54838d() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(width, height);
        float paddingLeft = ((float) getPaddingLeft()) + (((float) (width - min)) / 2.0f);
        float paddingTop = ((float) getPaddingTop()) + (((float) (height - min)) / 2.0f);
        float f = (float) min;
        return new RectF(paddingLeft, paddingTop, paddingLeft + f, f + paddingTop);
    }

    /* renamed from: e */
    private void m54839e() {
        super.setScaleType(f35189i0);
        this.f35212e0 = true;
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C12196b());
        }
        if (this.f35213f0) {
            m54841g();
            this.f35213f0 = false;
        }
    }

    /* renamed from: f */
    private void m54840f() {
        if (this.f35215h0) {
            this.f35203U = null;
        } else {
            this.f35203U = m54834a(getDrawable());
        }
        m54841g();
    }

    /* renamed from: g */
    private void m54841g() {
        if (!this.f35212e0) {
            this.f35213f0 = true;
        } else if (getWidth() != 0 || getHeight() != 0) {
            Bitmap bitmap = this.f35203U;
            if (bitmap == null) {
                invalidate();
                return;
            }
            TileMode tileMode = TileMode.CLAMP;
            this.f35204V = new BitmapShader(bitmap, tileMode, tileMode);
            this.f35197O.setAntiAlias(true);
            this.f35197O.setShader(this.f35204V);
            this.f35198P.setStyle(Style.STROKE);
            this.f35198P.setAntiAlias(true);
            this.f35198P.setColor(this.f35200R);
            this.f35198P.setStrokeWidth((float) this.f35201S);
            this.f35199Q.setStyle(Style.FILL);
            this.f35199Q.setAntiAlias(true);
            this.f35199Q.setColor(this.f35202T);
            this.f35207a0 = this.f35203U.getHeight();
            this.f35205W = this.f35203U.getWidth();
            this.f35208b.set(m54838d());
            this.f35210c0 = Math.min((this.f35208b.height() - ((float) this.f35201S)) / 2.0f, (this.f35208b.width() - ((float) this.f35201S)) / 2.0f);
            this.f35206a.set(this.f35208b);
            if (!this.f35214g0) {
                int i = this.f35201S;
                if (i > 0) {
                    this.f35206a.inset(((float) i) - 1.0f, ((float) i) - 1.0f);
                }
            }
            this.f35209b0 = Math.min(this.f35206a.height() / 2.0f, this.f35206a.width() / 2.0f);
            m54837c();
            m54842h();
            invalidate();
        }
    }

    /* renamed from: h */
    private void m54842h() {
        float f;
        float f2;
        this.f35196N.set(null);
        float f3 = 0.0f;
        if (((float) this.f35205W) * this.f35206a.height() > this.f35206a.width() * ((float) this.f35207a0)) {
            f2 = this.f35206a.height() / ((float) this.f35207a0);
            f = (this.f35206a.width() - (((float) this.f35205W) * f2)) * 0.5f;
        } else {
            f2 = this.f35206a.width() / ((float) this.f35205W);
            f3 = (this.f35206a.height() - (((float) this.f35207a0) * f2)) * 0.5f;
            f = 0.0f;
        }
        this.f35196N.setScale(f2, f2);
        Matrix matrix = this.f35196N;
        float f4 = (float) ((int) (f + 0.5f));
        RectF rectF = this.f35206a;
        matrix.postTranslate(f4 + rectF.left, ((float) ((int) (f3 + 0.5f))) + rectF.top);
        this.f35204V.setLocalMatrix(this.f35196N);
    }

    /* renamed from: b */
    public boolean mo41746b() {
        return this.f35215h0;
    }

    public int getBorderColor() {
        return this.f35200R;
    }

    public int getBorderWidth() {
        return this.f35201S;
    }

    public int getCircleBackgroundColor() {
        return this.f35202T;
    }

    public ColorFilter getColorFilter() {
        return this.f35211d0;
    }

    public ScaleType getScaleType() {
        return f35189i0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f35215h0) {
            super.onDraw(canvas);
        } else if (this.f35203U != null) {
            if (this.f35202T != 0) {
                canvas.drawCircle(this.f35206a.centerX(), this.f35206a.centerY(), this.f35209b0, this.f35199Q);
            }
            canvas.drawCircle(this.f35206a.centerX(), this.f35206a.centerY(), this.f35209b0, this.f35197O);
            if (this.f35201S > 0) {
                canvas.drawCircle(this.f35208b.centerX(), this.f35208b.centerY(), this.f35210c0, this.f35198P);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m54841g();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f35215h0) {
            return super.onTouchEvent(motionEvent);
        }
        return m54836a(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }

    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(@C0198k int i) {
        if (i != this.f35200R) {
            this.f35200R = i;
            this.f35198P.setColor(this.f35200R);
            invalidate();
        }
    }

    public void setBorderOverlay(boolean z) {
        if (z != this.f35214g0) {
            this.f35214g0 = z;
            m54841g();
        }
    }

    public void setBorderWidth(int i) {
        if (i != this.f35201S) {
            this.f35201S = i;
            m54841g();
        }
    }

    public void setCircleBackgroundColor(@C0198k int i) {
        if (i != this.f35202T) {
            this.f35202T = i;
            this.f35199Q.setColor(i);
            invalidate();
        }
    }

    public void setCircleBackgroundColorResource(@C0202m int i) {
        setCircleBackgroundColor(getContext().getResources().getColor(i));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != this.f35211d0) {
            this.f35211d0 = colorFilter;
            m54837c();
            invalidate();
        }
    }

    public void setDisableCircularTransformation(boolean z) {
        if (this.f35215h0 != z) {
            this.f35215h0 = z;
            m54840f();
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m54840f();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m54840f();
    }

    public void setImageResource(@C0213q int i) {
        super.setImageResource(i);
        m54840f();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m54840f();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        m54841g();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        m54841g();
    }

    public void setScaleType(ScaleType scaleType) {
        if (scaleType != f35189i0) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        }
    }

    /* renamed from: a */
    public boolean mo41745a() {
        return this.f35214g0;
    }

    /* renamed from: a */
    private Bitmap m54834a(Drawable drawable) {
        Bitmap bitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, f35190j0);
            } else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f35190j0);
            }
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private boolean m54836a(float f, float f2) {
        boolean z = true;
        if (this.f35208b.isEmpty()) {
            return true;
        }
        if (Math.pow((double) (f - this.f35208b.centerX()), 2.0d) + Math.pow((double) (f2 - this.f35208b.centerY()), 2.0d) > Math.pow((double) this.f35210c0, 2.0d)) {
            z = false;
        }
        return z;
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35206a = new RectF();
        this.f35208b = new RectF();
        this.f35196N = new Matrix();
        this.f35197O = new Paint();
        this.f35198P = new Paint();
        this.f35199Q = new Paint();
        this.f35200R = -16777216;
        this.f35201S = 0;
        this.f35202T = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12197R.styleable.CircleImageView, i, 0);
        this.f35201S = obtainStyledAttributes.getDimensionPixelSize(C12197R.styleable.CircleImageView_civ_border_width, 0);
        this.f35200R = obtainStyledAttributes.getColor(C12197R.styleable.CircleImageView_civ_border_color, -16777216);
        this.f35214g0 = obtainStyledAttributes.getBoolean(C12197R.styleable.CircleImageView_civ_border_overlay, false);
        this.f35202T = obtainStyledAttributes.getColor(C12197R.styleable.CircleImageView_civ_circle_background_color, 0);
        obtainStyledAttributes.recycle();
        m54839e();
    }
}
