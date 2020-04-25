package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.C0188f;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.core.widget.C1118k;

/* renamed from: androidx.appcompat.widget.o */
/* compiled from: AppCompatPopupWindow */
class C0537o extends PopupWindow {

    /* renamed from: b */
    private static final boolean f2153b = (VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f2154a;

    public C0537o(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i) {
        super(context, attributeSet, i);
        m2878a(context, attributeSet, i, 0);
    }

    /* renamed from: a */
    private void m2878a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0549t0 a = C0549t0.m2910a(context, attributeSet, C0238R.styleable.PopupWindow, i, i2);
        if (a.mo2892j(C0238R.styleable.PopupWindow_overlapAnchor)) {
            m2879a(a.mo2871a(C0238R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo2875b(C0238R.styleable.PopupWindow_android_popupBackground));
        a.mo2887f();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f2153b && this.f2154a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f2153b && this.f2154a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public C0537o(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, @C0188f int i, @C0216r0 int i2) {
        super(context, attributeSet, i, i2);
        m2878a(context, attributeSet, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f2153b && this.f2154a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    /* renamed from: a */
    private void m2879a(boolean z) {
        if (f2153b) {
            this.f2154a = z;
        } else {
            C1118k.m6347a((PopupWindow) this, z);
        }
    }
}
