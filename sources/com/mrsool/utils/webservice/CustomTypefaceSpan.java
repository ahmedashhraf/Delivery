package com.mrsool.utils.webservice;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

public class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: a */
    private final Typeface f33648a;

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f33648a = typeface;
    }

    /* renamed from: a */
    private static void m52643a(Paint paint, Typeface typeface) {
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
        m52643a(textPaint, this.f33648a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m52643a(textPaint, this.f33648a);
    }
}
