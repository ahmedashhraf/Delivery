package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.WebView;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.clevertap.android.sdk.c0 */
/* compiled from: CTInAppWebView */
class C3074c0 extends WebView {

    /* renamed from: N */
    private int f10988N;

    /* renamed from: O */
    private int f10989O;

    /* renamed from: P */
    final Point f10990P = new Point();

    /* renamed from: a */
    private int f10991a;

    /* renamed from: b */
    private int f10992b;

    @SuppressLint({"ResourceType"})
    public C3074c0(Context context, int i, int i2, int i3, int i4) {
        super(context);
        this.f10991a = i;
        this.f10992b = i2;
        this.f10988N = i3;
        this.f10989O = i4;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
        setOverScrollMode(2);
        setBackgroundColor(0);
        setId(188293);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12212a() {
        int i = this.f10991a;
        if (i != 0) {
            this.f10990P.x = (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
        } else {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.f10990P.x = (int) (((float) (displayMetrics.widthPixels * this.f10988N)) / 100.0f);
        }
        int i2 = this.f10992b;
        if (i2 != 0) {
            this.f10990P.y = (int) TypedValue.applyDimension(1, (float) i2, getResources().getDisplayMetrics());
            return;
        }
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        this.f10990P.y = (int) (((float) (displayMetrics2.heightPixels * this.f10989O)) / 100.0f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo12212a();
        Point point = this.f10990P;
        setMeasuredDimension(point.x, point.y);
    }

    public boolean performClick() {
        return super.performClick();
    }
}
