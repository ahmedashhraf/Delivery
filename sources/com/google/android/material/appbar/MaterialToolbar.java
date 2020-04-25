package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.Toolbar;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.theme.p307a.C7109a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: E0 */
    private static final int f16004E0 = C5582R.style.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m24398a(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C6978j jVar = new C6978j();
            jVar.mo27790a(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            jVar.mo27789a(context);
            jVar.mo27799b(C0962e0.m5551r(this));
            C0962e0.m5440a((View) this, (Drawable) jVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33513a((View) this);
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C6982k.m33514a((View) this, f);
    }

    public MaterialToolbar(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.toolbarStyle);
    }

    public MaterialToolbar(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16004E0), attributeSet, i);
        m24398a(getContext());
    }
}
