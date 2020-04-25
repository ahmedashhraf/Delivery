package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;

final class CloseImageView extends AppCompatImageView {

    /* renamed from: a */
    private final int f10891a = m14665a(40);

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context) {
        super(context);
        setId(199272);
    }

    /* renamed from: a */
    private int m14665a(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (decodeResource != null) {
                canvas.drawBitmap(Bitmap.createScaledBitmap(decodeResource, this.f10891a, this.f10891a, true), 0.0f, 0.0f, new Paint());
            } else {
                C3111h1.m14938f("Unable to find inapp notif close button image");
            }
        } catch (Throwable th) {
            C3111h1.m14941f("Error displaying the inapp notif close button image:", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f10891a;
        setMeasuredDimension(i3, i3);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setId(199272);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setId(199272);
    }
}
