package com.mrsool.utils;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f32725a;

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f32725a = typeface;
    }

    /* renamed from: a */
    private static void m52110a(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int style = i & (typeface.getStyle() ^ -1);
        if ((style & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        m52110a(textPaint, this.f32725a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m52110a(textPaint, this.f32725a);
    }
}
