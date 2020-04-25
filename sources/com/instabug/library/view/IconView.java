package com.instabug.library.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.C0198k;
import com.instabug.library.C9700R;
import com.instabug.library.settings.C9989a;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class IconView extends TextView {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final int ANDROID_ACTIONBAR_ICON_SIZE_DP = 24;
    public static final int ANDROID_ACTIONBAR_ICON_SIZE_PADDING_DP = 1;
    @C0198k
    int backgroundColor;
    private Typeface font;
    Paint paint;
    @C0198k
    int strokeColor;
    float strokeWidth;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6944406565430186566L, "com/instabug/library/view/IconView", 45);
        $jacocoData = a;
        return a;
    }

    public IconView(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, null);
        $jacocoInit[0] = true;
    }

    private void setActionBarPadding() {
        boolean[] $jacocoInit = $jacocoInit();
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 1.0f);
        $jacocoInit[24] = true;
        setPadding(convertDpToPx);
        $jacocoInit[25] = true;
    }

    private void setActionBarSize() {
        boolean[] $jacocoInit = $jacocoInit();
        setTextSize(1, 24.0f);
        $jacocoInit[23] = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] $jacocoInit = $jacocoInit();
        this.paint.setColor(this.backgroundColor);
        $jacocoInit[33] = true;
        this.paint.setStyle(Style.FILL);
        $jacocoInit[34] = true;
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float width2 = ((float) getWidth()) / 2.0f;
        $jacocoInit[35] = true;
        float height2 = ((float) getHeight()) / 2.0f;
        $jacocoInit[36] = true;
        canvas.drawCircle(width, height, Math.min(width2, height2) - (this.strokeWidth / 2.0f), this.paint);
        $jacocoInit[37] = true;
        this.paint.setStrokeWidth(this.strokeWidth);
        $jacocoInit[38] = true;
        this.paint.setColor(this.strokeColor);
        $jacocoInit[39] = true;
        this.paint.setStyle(Style.STROKE);
        $jacocoInit[40] = true;
        float width3 = ((float) getWidth()) / 2.0f;
        float height3 = ((float) getHeight()) / 2.0f;
        float width4 = ((float) getWidth()) / 2.0f;
        $jacocoInit[41] = true;
        float height4 = ((float) getHeight()) / 2.0f;
        $jacocoInit[42] = true;
        canvas.drawCircle(width3, height3, Math.min(width4, height4) - (this.strokeWidth / 2.0f), this.paint);
        $jacocoInit[43] = true;
        super.onDraw(canvas);
        $jacocoInit[44] = true;
    }

    public void setBackgroundColor(@C0198k int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.backgroundColor = i;
        $jacocoInit[27] = true;
        invalidate();
        $jacocoInit[28] = true;
    }

    public void setPadding(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        setPadding(i, i, i, i);
        $jacocoInit[26] = true;
    }

    public void setStrokeColor(@C0198k int i) {
        boolean[] $jacocoInit = $jacocoInit();
        this.strokeColor = i;
        $jacocoInit[31] = true;
        invalidate();
        $jacocoInit[32] = true;
    }

    public void setStrokeWidth(float f) {
        boolean[] $jacocoInit = $jacocoInit();
        this.strokeWidth = f;
        $jacocoInit[29] = true;
        invalidate();
        $jacocoInit[30] = true;
    }

    public IconView(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        this(context, attributeSet, 0);
        $jacocoInit[1] = true;
    }

    public IconView(Context context, AttributeSet attributeSet, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet, i);
        this.backgroundColor = 0;
        this.strokeWidth = 0.0f;
        this.strokeColor = 0;
        $jacocoInit[2] = true;
        if (isInEditMode()) {
            $jacocoInit[3] = true;
            return;
        }
        if (this.font != null) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            this.font = Typeface.createFromAsset(context.getAssets(), "font_icons.ttf");
            $jacocoInit[6] = true;
        }
        setTypeface(this.font);
        $jacocoInit[7] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9700R.styleable.IconView);
        $jacocoInit[8] = true;
        if (obtainStyledAttributes.hasValue(C9700R.styleable.IconView_android_textSize)) {
            $jacocoInit[9] = true;
        } else {
            $jacocoInit[10] = true;
            setActionBarSize();
            $jacocoInit[11] = true;
        }
        if (obtainStyledAttributes.hasValue(C9700R.styleable.IconView_android_padding)) {
            $jacocoInit[12] = true;
        } else {
            $jacocoInit[13] = true;
            setActionBarPadding();
            $jacocoInit[14] = true;
        }
        if (obtainStyledAttributes.hasValue(C9700R.styleable.IconView_android_textColor)) {
            $jacocoInit[15] = true;
        } else {
            $jacocoInit[16] = true;
            setTextColor(C9989a.m46428A().mo35743i());
            $jacocoInit[17] = true;
        }
        int i2 = obtainStyledAttributes.getInt(C9700R.styleable.IconView_instabug_icon, -1);
        if (i2 == -1) {
            $jacocoInit[18] = true;
        } else {
            $jacocoInit[19] = true;
            setText(C10030a.m46656a(i2));
            $jacocoInit[20] = true;
        }
        obtainStyledAttributes.recycle();
        $jacocoInit[21] = true;
        this.paint = new Paint(1);
        $jacocoInit[22] = true;
    }
}
