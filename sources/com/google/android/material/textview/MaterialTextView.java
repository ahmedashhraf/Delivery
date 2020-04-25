package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0218s0;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.C5582R;
import com.google.android.material.p302m.C6951b;
import com.google.android.material.p302m.C6952c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m34237a(@C0193h0 Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C5582R.styleable.MaterialTextAppearance);
        int a = m34235a(getContext(), obtainStyledAttributes, C5582R.styleable.MaterialTextAppearance_android_lineHeight, C5582R.styleable.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (a >= 0) {
            setLineHeight(a);
        }
    }

    public void setTextAppearance(@C0193h0 Context context, int i) {
        super.setTextAppearance(context, i);
        if (m34238a(context)) {
            m34237a(context.getTheme(), i);
        }
    }

    public MaterialTextView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        if (m34238a(context)) {
            Theme theme = context.getTheme();
            if (!m34239a(context, theme, attributeSet, i, i2)) {
                int a = m34236a(theme, attributeSet, i, i2);
                if (a != -1) {
                    m34237a(theme, a);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m34238a(Context context) {
        return C6951b.m33328a(context, C5582R.attr.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: a */
    private static int m34235a(@C0193h0 Context context, @C0193h0 TypedArray typedArray, @C0193h0 @C0218s0 int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C6952c.m33330a(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: a */
    private static boolean m34239a(@C0193h0 Context context, @C0193h0 Theme theme, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5582R.styleable.MaterialTextView, i, i2);
        int a = m34235a(context, obtainStyledAttributes, C5582R.styleable.MaterialTextView_android_lineHeight, C5582R.styleable.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (a != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static int m34236a(@C0193h0 Theme theme, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C5582R.styleable.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C5582R.styleable.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }
}
