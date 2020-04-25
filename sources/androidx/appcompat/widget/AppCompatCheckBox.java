package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1123n;

public class AppCompatCheckBox extends CheckBox implements C1123n, C0955c0 {

    /* renamed from: N */
    private final C0554v f1611N;

    /* renamed from: a */
    private final C0506h f1612a;

    /* renamed from: b */
    private final C0489e f1613b;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0554v vVar = this.f1611N;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0506h hVar = this.f1612a;
        return hVar != null ? hVar.mo2654a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportButtonTintList() {
        C0506h hVar = this.f1612a;
        if (hVar != null) {
            return hVar.mo2659b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportButtonTintMode() {
        C0506h hVar = this.f1612a;
        if (hVar != null) {
            return hVar.mo2660c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0506h hVar = this.f1612a;
        if (hVar != null) {
            hVar.mo2661d();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f1613b;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintList(@C0195i0 ColorStateList colorStateList) {
        C0506h hVar = this.f1612a;
        if (hVar != null) {
            hVar.mo2656a(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportButtonTintMode(@C0195i0 Mode mode) {
        C0506h hVar = this.f1612a;
        if (hVar != null) {
            hVar.mo2657a(mode);
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f1612a = new C0506h(this);
        this.f1612a.mo2658a(attributeSet, i);
        this.f1613b = new C0489e(this);
        this.f1613b.mo2531a(attributeSet, i);
        this.f1611N = new C0554v(this);
        this.f1611N.mo2962a(attributeSet, i);
    }

    public void setButtonDrawable(@C0213q int i) {
        setButtonDrawable(C0242a.m1109c(getContext(), i));
    }
}
