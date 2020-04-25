package com.jackandphantom.circularimageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Media;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.core.p034l.C0962e0;
import java.io.IOException;

public class CircleImage extends ImageView {

    /* renamed from: f0 */
    private static final ScaleType f27057f0 = ScaleType.FIT_XY;

    /* renamed from: N */
    private Paint f27058N;

    /* renamed from: O */
    private Paint f27059O;

    /* renamed from: P */
    private Paint f27060P;

    /* renamed from: Q */
    private int f27061Q;

    /* renamed from: R */
    private float f27062R;

    /* renamed from: S */
    private BitmapShader f27063S;

    /* renamed from: T */
    private int f27064T;

    /* renamed from: U */
    private Matrix f27065U;

    /* renamed from: V */
    private final float f27066V;

    /* renamed from: W */
    private int f27067W;

    /* renamed from: a */
    private int f27068a;

    /* renamed from: a0 */
    private int f27069a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f27070b;

    /* renamed from: b0 */
    private int f27071b0;

    /* renamed from: c0 */
    private int f27072c0;

    /* renamed from: d0 */
    private boolean f27073d0;

    /* renamed from: e0 */
    private Context f27074e0;

    /* renamed from: com.jackandphantom.circularimageview.CircleImage$a */
    class C10160a implements C10168b {
        C10160a() {
        }

        /* renamed from: a */
        public void mo36392a(Bitmap bitmap) {
            CircleImage.this.f27070b = bitmap;
            CircleImage.this.m47228c();
        }
    }

    public CircleImage(Context context) {
        super(context);
        this.f27058N = new Paint();
        this.f27059O = new Paint();
        this.f27060P = new Paint();
        this.f27061Q = C0962e0.f4343t;
        this.f27065U = new Matrix();
        this.f27066V = 10.0f;
        this.f27074e0 = context;
    }

    /* renamed from: b */
    private void m47227b() {
        float f;
        float f2;
        this.f27065U.set(null);
        float f3 = 0.0f;
        if (this.f27069a0 * getHeight() > this.f27071b0 * getWidth()) {
            f2 = ((float) getHeight()) / ((float) this.f27071b0);
            f = (((float) getWidth()) - (((float) this.f27069a0) * f2)) * 0.5f;
        } else {
            f2 = ((float) getWidth()) / ((float) this.f27069a0);
            f3 = (((float) getHeight()) - (((float) this.f27071b0) * f2)) * 0.5f;
            f = 0.0f;
        }
        this.f27065U.setScale(f2, f2);
        Matrix matrix = this.f27065U;
        int i = (int) (f + 0.5f);
        int i2 = this.f27068a;
        matrix.postTranslate((float) (i + i2), (float) (((int) (f3 + 0.5f)) + i2));
        this.f27063S.setLocalMatrix(this.f27065U);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m47228c() {
        if (this.f27070b != null && getWidth() != 0 && getHeight() != 0) {
            this.f27059O.setAntiAlias(true);
            this.f27060P.setAntiAlias(true);
            this.f27060P.setColor(this.f27072c0);
            this.f27060P.setStyle(Style.STROKE);
            this.f27060P.setStrokeWidth((float) this.f27068a);
            this.f27058N.setStyle(Style.STROKE);
            this.f27058N.setStrokeWidth((float) this.f27068a);
            this.f27058N.setColor(-3355444);
            this.f27069a0 = this.f27070b.getWidth();
            this.f27071b0 = this.f27070b.getHeight();
            Bitmap bitmap = this.f27070b;
            TileMode tileMode = TileMode.CLAMP;
            this.f27063S = new BitmapShader(bitmap, tileMode, tileMode);
            this.f27059O.setShader(this.f27063S);
            setLayerType(1, null);
            this.f27064T = Math.min((getWidth() - this.f27068a) / 2, (getHeight() - this.f27068a) / 2);
            this.f27067W = Math.min((getWidth() - (this.f27068a * 2)) / 2, (getHeight() - (this.f27068a * 2)) / 2);
            if (this.f27073d0) {
                float f = (float) this.f27064T;
                float f2 = this.f27062R;
                this.f27064T = (int) (f - f2);
                this.f27067W = (int) (((float) this.f27067W) - f2);
                this.f27060P.setShadowLayer(f2, 0.0f, 3.0f, this.f27061Q);
            }
            m47227b();
            invalidate();
        }
    }

    public boolean getAddShadow() {
        return this.f27073d0;
    }

    public int getBorderColor() {
        return this.f27072c0;
    }

    public int getBorderWidth() {
        return this.f27068a;
    }

    public int getShadowColor() {
        return this.f27061Q;
    }

    public float getShadowRadius() {
        return this.f27062R;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f27064T, this.f27060P);
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) this.f27067W, this.f27059O);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m47228c();
    }

    public void setAddShadow(boolean z) {
        this.f27073d0 = z;
    }

    public void setBorderColor(int i) {
        this.f27072c0 = i;
        m47228c();
    }

    public void setBorderWidth(int i) {
        this.f27068a = i;
        m47228c();
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f27070b = bitmap;
        m47228c();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m47225a(drawable);
        m47228c();
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        m47225a(getDrawable());
        m47228c();
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f27070b = m47222a(uri);
        m47228c();
    }

    public void setShadowColor(int i) {
        this.f27061Q = i;
    }

    public void setShadowRadius(float f) {
        this.f27062R = f;
    }

    /* renamed from: a */
    private Bitmap m47222a(Uri uri) {
        try {
            return Media.getBitmap(this.f27074e0.getContentResolver(), uri);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private void m47225a(Drawable drawable) {
        if (drawable != null) {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            drawable.draw(canvas);
            this.f27070b = createBitmap;
        }
    }

    public CircleImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.f27074e0 = context;
    }

    public CircleImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27058N = new Paint();
        this.f27059O = new Paint();
        this.f27060P = new Paint();
        this.f27061Q = C0962e0.f4343t;
        this.f27065U = new Matrix();
        this.f27066V = 10.0f;
        this.f27074e0 = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10161R.styleable.CircleImage, i, 0);
        this.f27068a = obtainStyledAttributes.getDimensionPixelSize(C10161R.styleable.CircleImage_border_width, 0);
        this.f27072c0 = obtainStyledAttributes.getColor(C10161R.styleable.CircleImage_border_color, -1);
        this.f27073d0 = obtainStyledAttributes.getBoolean(C10161R.styleable.CircleImage_add_shadow, false);
        this.f27061Q = obtainStyledAttributes.getColor(C10161R.styleable.CircleImage_shadow_color, C0962e0.f4343t);
        this.f27062R = obtainStyledAttributes.getFloat(C10161R.styleable.CircleImage_shadow_radius, 10.0f);
        obtainStyledAttributes.recycle();
        m47228c();
    }

    /* renamed from: a */
    private void m47224a() {
        if (VERSION.SDK_INT >= 11) {
            setLayerType(1, this.f27060P);
        }
        Paint paint = this.f27060P;
        float f = this.f27062R;
        paint.setShadowLayer(f, 0.0f, f / 2.0f, this.f27061Q);
    }

    /* renamed from: a */
    public void mo36375a(String str) {
        C10166b bVar = new C10166b(this.f27074e0);
        bVar.mo36397a(str);
        bVar.mo36398a((C10168b) new C10160a());
    }
}
