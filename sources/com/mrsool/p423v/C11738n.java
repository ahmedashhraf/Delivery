package com.mrsool.p423v;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: com.mrsool.v.n */
/* compiled from: VerticalImageSpan */
public class C11738n extends ImageSpan {
    public C11738n(Drawable drawable) {
        super(drawable);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent;
        canvas.translate(f, (float) (((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2)));
        drawable.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int i6 = (bounds.bottom - bounds.top) / 2;
            fontMetricsInt.ascent = i5 - i6;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = i5 + i6;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
        return bounds.right;
    }
}
