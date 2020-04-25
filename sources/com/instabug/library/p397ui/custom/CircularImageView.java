package com.instabug.library.p397ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.C0198k;
import androidx.annotation.C0202m;
import androidx.annotation.C0213q;
import com.instabug.library.C9700R;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.ui.custom.CircularImageView */
public class CircularImageView extends ImageView {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final Config BITMAP_CONFIG = Config.ARGB_8888;
    private static final int COLORDRAWABLE_DIMENSION = 2;
    private static final int DEFAULT_BORDER_COLOR = -16777216;
    private static final boolean DEFAULT_BORDER_OVERLAY = false;
    private static final int DEFAULT_BORDER_WIDTH = 0;
    private static final int DEFAULT_FILL_COLOR = 0;
    private static final ScaleType SCALE_TYPE = ScaleType.CENTER_CROP;
    private Bitmap mBitmap;
    private int mBitmapHeight;
    private final Paint mBitmapPaint;
    private BitmapShader mBitmapShader;
    private int mBitmapWidth;
    private int mBorderColor;
    private boolean mBorderOverlay;
    private final Paint mBorderPaint;
    private float mBorderRadius;
    private final RectF mBorderRect;
    private int mBorderWidth;
    private ColorFilter mColorFilter;
    private float mDrawableRadius;
    private final RectF mDrawableRect;
    private int mFillColor;
    private final Paint mFillPaint;
    private boolean mReady;
    private boolean mSetupPending;
    private final Matrix mShaderMatrix;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1884765937808695441L, "com/instabug/library/ui/custom/CircularImageView", C13959t.f40839S1);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[129] = true;
    }

    public CircularImageView(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context);
        $jacocoInit[0] = true;
        this.mDrawableRect = new RectF();
        $jacocoInit[1] = true;
        this.mBorderRect = new RectF();
        $jacocoInit[2] = true;
        this.mShaderMatrix = new Matrix();
        $jacocoInit[3] = true;
        this.mBitmapPaint = new Paint();
        $jacocoInit[4] = true;
        this.mBorderPaint = new Paint();
        $jacocoInit[5] = true;
        this.mFillPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mFillColor = 0;
        $jacocoInit[6] = true;
        init();
        $jacocoInit[7] = true;
    }

    private Bitmap getBitmapFromDrawable(Drawable drawable) {
        Bitmap bitmap;
        boolean[] $jacocoInit = $jacocoInit();
        if (drawable == null) {
            $jacocoInit[81] = true;
            return null;
        } else if (!(drawable instanceof BitmapDrawable)) {
            $jacocoInit[82] = true;
            try {
                if (drawable instanceof ColorDrawable) {
                    $jacocoInit[85] = true;
                    bitmap = Bitmap.createBitmap(2, 2, BITMAP_CONFIG);
                    $jacocoInit[86] = true;
                } else {
                    bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), BITMAP_CONFIG);
                    $jacocoInit[87] = true;
                }
                Canvas canvas = new Canvas(bitmap);
                $jacocoInit[88] = true;
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                $jacocoInit[89] = true;
                drawable.draw(canvas);
                $jacocoInit[90] = true;
                return bitmap;
            } catch (Exception e) {
                $jacocoInit[91] = true;
                e.printStackTrace();
                $jacocoInit[92] = true;
                return null;
            }
        } else {
            $jacocoInit[83] = true;
            Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
            $jacocoInit[84] = true;
            return bitmap2;
        }
    }

    private void init() {
        boolean[] $jacocoInit = $jacocoInit();
        super.setScaleType(SCALE_TYPE);
        this.mReady = true;
        if (!this.mSetupPending) {
            $jacocoInit[23] = true;
        } else {
            $jacocoInit[24] = true;
            setup();
            this.mSetupPending = false;
            $jacocoInit[25] = true;
        }
        $jacocoInit[26] = true;
    }

    private void setup() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.mReady) {
            this.mSetupPending = true;
            $jacocoInit[93] = true;
            return;
        }
        if (getWidth() != 0) {
            $jacocoInit[94] = true;
        } else if (getHeight() != 0) {
            $jacocoInit[95] = true;
        } else {
            $jacocoInit[96] = true;
            return;
        }
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null) {
            $jacocoInit[97] = true;
            invalidate();
            $jacocoInit[98] = true;
            return;
        }
        TileMode tileMode = TileMode.CLAMP;
        this.mBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        $jacocoInit[99] = true;
        this.mBitmapPaint.setAntiAlias(true);
        $jacocoInit[100] = true;
        this.mBitmapPaint.setShader(this.mBitmapShader);
        $jacocoInit[101] = true;
        this.mBorderPaint.setStyle(Style.STROKE);
        $jacocoInit[102] = true;
        this.mBorderPaint.setAntiAlias(true);
        $jacocoInit[103] = true;
        this.mBorderPaint.setColor(this.mBorderColor);
        $jacocoInit[104] = true;
        this.mBorderPaint.setStrokeWidth((float) this.mBorderWidth);
        $jacocoInit[105] = true;
        this.mFillPaint.setStyle(Style.FILL);
        $jacocoInit[106] = true;
        this.mFillPaint.setAntiAlias(true);
        $jacocoInit[107] = true;
        this.mFillPaint.setColor(this.mFillColor);
        $jacocoInit[108] = true;
        this.mBitmapHeight = this.mBitmap.getHeight();
        $jacocoInit[109] = true;
        this.mBitmapWidth = this.mBitmap.getWidth();
        $jacocoInit[110] = true;
        this.mBorderRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        $jacocoInit[111] = true;
        this.mBorderRadius = Math.min((this.mBorderRect.height() - ((float) this.mBorderWidth)) / 2.0f, (this.mBorderRect.width() - ((float) this.mBorderWidth)) / 2.0f);
        $jacocoInit[112] = true;
        this.mDrawableRect.set(this.mBorderRect);
        if (this.mBorderOverlay) {
            $jacocoInit[113] = true;
        } else {
            $jacocoInit[114] = true;
            RectF rectF = this.mDrawableRect;
            int i = this.mBorderWidth;
            rectF.inset((float) i, (float) i);
            $jacocoInit[115] = true;
        }
        this.mDrawableRadius = Math.min(this.mDrawableRect.height() / 2.0f, this.mDrawableRect.width() / 2.0f);
        $jacocoInit[116] = true;
        updateShaderMatrix();
        $jacocoInit[117] = true;
        invalidate();
        $jacocoInit[118] = true;
    }

    private void updateShaderMatrix() {
        float f;
        float f2;
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[119] = true;
        this.mShaderMatrix.set(null);
        $jacocoInit[120] = true;
        float f3 = 0.0f;
        if (((float) this.mBitmapWidth) * this.mDrawableRect.height() > this.mDrawableRect.width() * ((float) this.mBitmapHeight)) {
            $jacocoInit[121] = true;
            f2 = this.mDrawableRect.height() / ((float) this.mBitmapHeight);
            $jacocoInit[122] = true;
            f = (this.mDrawableRect.width() - (((float) this.mBitmapWidth) * f2)) * 0.5f;
            $jacocoInit[123] = true;
        } else {
            f2 = this.mDrawableRect.width() / ((float) this.mBitmapWidth);
            $jacocoInit[124] = true;
            float height = (this.mDrawableRect.height() - (((float) this.mBitmapHeight) * f2)) * 0.5f;
            $jacocoInit[125] = true;
            f3 = height;
            f = 0.0f;
        }
        this.mShaderMatrix.setScale(f2, f2);
        $jacocoInit[126] = true;
        Matrix matrix = this.mShaderMatrix;
        float f4 = (float) ((int) (f + 0.5f));
        RectF rectF = this.mDrawableRect;
        matrix.postTranslate(f4 + rectF.left, ((float) ((int) (f3 + 0.5f))) + rectF.top);
        $jacocoInit[127] = true;
        this.mBitmapShader.setLocalMatrix(this.mShaderMatrix);
        $jacocoInit[128] = true;
    }

    public int getBorderColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.mBorderColor;
        $jacocoInit[44] = true;
        return i;
    }

    public int getBorderWidth() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.mBorderWidth;
        $jacocoInit[56] = true;
        return i;
    }

    public int getFillColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.mFillColor;
        $jacocoInit[50] = true;
        return i;
    }

    public ScaleType getScaleType() {
        boolean[] $jacocoInit = $jacocoInit();
        ScaleType scaleType = SCALE_TYPE;
        $jacocoInit[27] = true;
        return scaleType;
    }

    public boolean isBorderOverlay() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.mBorderOverlay;
        $jacocoInit[60] = true;
        return z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.mBitmap == null) {
            $jacocoInit[34] = true;
            return;
        }
        if (this.mFillColor == 0) {
            $jacocoInit[35] = true;
        } else {
            $jacocoInit[36] = true;
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.mDrawableRadius, this.mFillPaint);
            $jacocoInit[37] = true;
        }
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.mDrawableRadius, this.mBitmapPaint);
        if (this.mBorderWidth == 0) {
            $jacocoInit[38] = true;
        } else {
            $jacocoInit[39] = true;
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.mBorderRadius, this.mBorderPaint);
            $jacocoInit[40] = true;
        }
        $jacocoInit[41] = true;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] $jacocoInit = $jacocoInit();
        super.onSizeChanged(i, i2, i3, i4);
        $jacocoInit[42] = true;
        setup();
        $jacocoInit[43] = true;
    }

    public void setAdjustViewBounds(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!z) {
            $jacocoInit[33] = true;
            return;
        }
        $jacocoInit[31] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("adjustViewBounds not supported.");
        $jacocoInit[32] = true;
        throw illegalArgumentException;
    }

    public void setBorderColor(@C0198k int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i == this.mBorderColor) {
            $jacocoInit[45] = true;
            return;
        }
        this.mBorderColor = i;
        $jacocoInit[46] = true;
        this.mBorderPaint.setColor(this.mBorderColor);
        $jacocoInit[47] = true;
        invalidate();
        $jacocoInit[48] = true;
    }

    public void setBorderColorResource(@C0202m int i) {
        boolean[] $jacocoInit = $jacocoInit();
        setBorderColor(getContext().getResources().getColor(i));
        $jacocoInit[49] = true;
    }

    public void setBorderOverlay(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        if (z == this.mBorderOverlay) {
            $jacocoInit[61] = true;
            return;
        }
        this.mBorderOverlay = z;
        $jacocoInit[62] = true;
        setup();
        $jacocoInit[63] = true;
    }

    public void setBorderWidth(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i == this.mBorderWidth) {
            $jacocoInit[57] = true;
            return;
        }
        this.mBorderWidth = i;
        $jacocoInit[58] = true;
        setup();
        $jacocoInit[59] = true;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        boolean[] $jacocoInit = $jacocoInit();
        if (colorFilter == this.mColorFilter) {
            $jacocoInit[77] = true;
            return;
        }
        this.mColorFilter = colorFilter;
        $jacocoInit[78] = true;
        this.mBitmapPaint.setColorFilter(this.mColorFilter);
        $jacocoInit[79] = true;
        invalidate();
        $jacocoInit[80] = true;
    }

    public void setFillColor(@C0198k int i) {
        boolean[] $jacocoInit = $jacocoInit();
        if (i == this.mFillColor) {
            $jacocoInit[51] = true;
            return;
        }
        this.mFillColor = i;
        $jacocoInit[52] = true;
        this.mFillPaint.setColor(i);
        $jacocoInit[53] = true;
        invalidate();
        $jacocoInit[54] = true;
    }

    public void setFillColorResource(@C0202m int i) {
        boolean[] $jacocoInit = $jacocoInit();
        setFillColor(getContext().getResources().getColor(i));
        $jacocoInit[55] = true;
    }

    public void setImageBitmap(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageBitmap(bitmap);
        this.mBitmap = bitmap;
        $jacocoInit[64] = true;
        setup();
        $jacocoInit[65] = true;
    }

    public void setImageDrawable(Drawable drawable) {
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageDrawable(drawable);
        $jacocoInit[66] = true;
        this.mBitmap = getBitmapFromDrawable(drawable);
        $jacocoInit[67] = true;
        setup();
        $jacocoInit[68] = true;
    }

    public void setImageResource(@C0213q int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageResource(i);
        $jacocoInit[69] = true;
        this.mBitmap = getBitmapFromDrawable(getDrawable());
        $jacocoInit[70] = true;
        setup();
        $jacocoInit[71] = true;
    }

    public void setImageURI(Uri uri) {
        Bitmap bitmap;
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageURI(uri);
        $jacocoInit[72] = true;
        if (uri != null) {
            bitmap = getBitmapFromDrawable(getDrawable());
            $jacocoInit[73] = true;
        } else {
            bitmap = null;
            $jacocoInit[74] = true;
        }
        this.mBitmap = bitmap;
        $jacocoInit[75] = true;
        setup();
        $jacocoInit[76] = true;
    }

    public void setScaleType(ScaleType scaleType) {
        boolean[] $jacocoInit = $jacocoInit();
        if (scaleType == SCALE_TYPE) {
            $jacocoInit[30] = true;
            return;
        }
        $jacocoInit[28] = true;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[]{scaleType}));
        $jacocoInit[29] = true;
        throw illegalArgumentException;
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, attributeSet, 0);
        $jacocoInit[8] = true;
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        $jacocoInit[9] = true;
        this.mDrawableRect = new RectF();
        $jacocoInit[10] = true;
        this.mBorderRect = new RectF();
        $jacocoInit[11] = true;
        this.mShaderMatrix = new Matrix();
        $jacocoInit[12] = true;
        this.mBitmapPaint = new Paint();
        $jacocoInit[13] = true;
        this.mBorderPaint = new Paint();
        $jacocoInit[14] = true;
        this.mFillPaint = new Paint();
        this.mBorderColor = -16777216;
        this.mBorderWidth = 0;
        this.mFillColor = 0;
        $jacocoInit[15] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9700R.styleable.CircleImageView, i, 0);
        $jacocoInit[16] = true;
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(C9700R.styleable.CircleImageView_ibg_civ_border_width, 0);
        $jacocoInit[17] = true;
        this.mBorderColor = obtainStyledAttributes.getColor(C9700R.styleable.CircleImageView_ibg_civ_border_color, -16777216);
        $jacocoInit[18] = true;
        this.mBorderOverlay = obtainStyledAttributes.getBoolean(C9700R.styleable.CircleImageView_ibg_civ_border_overlay, false);
        $jacocoInit[19] = true;
        this.mFillColor = obtainStyledAttributes.getColor(C9700R.styleable.CircleImageView_ibg_civ_fill_color, 0);
        $jacocoInit[20] = true;
        obtainStyledAttributes.recycle();
        $jacocoInit[21] = true;
        init();
        $jacocoInit[22] = true;
    }
}
