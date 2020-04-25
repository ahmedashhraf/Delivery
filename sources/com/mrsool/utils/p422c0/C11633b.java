package com.mrsool.utils.p422c0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mrsool.C10232R;

/* renamed from: com.mrsool.utils.c0.b */
/* compiled from: TooltipOverlay */
public class C11633b extends ImageView {

    /* renamed from: a */
    private int f32999a;

    public C11633b(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m52445a(Context context, int i) {
        setImageDrawable(new C11634c(context, i));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, C10232R.styleable.TooltipOverlay);
        this.f32999a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public int getLayoutMargins() {
        return this.f32999a;
    }

    public C11633b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10232R.style.ToolTipOverlayDefaultStyle);
    }

    public C11633b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52445a(context, C10232R.style.ToolTipLayoutDefaultStyle);
    }

    public C11633b(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        m52445a(context, i2);
    }
}
