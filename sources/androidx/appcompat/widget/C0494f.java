package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1107b;
import androidx.core.widget.C1120m;

/* renamed from: androidx.appcompat.widget.f */
/* compiled from: AppCompatButton */
public class C0494f extends Button implements C0955c0, C1107b {

    /* renamed from: a */
    private final C0489e f1974a;

    /* renamed from: b */
    private final C0554v f1975b;

    public C0494f(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C1107b.f4906c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            return vVar.mo2968c();
        }
        return -1;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (C1107b.f4906c) {
            return super.getAutoSizeMinTextSize();
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            return vVar.mo2969d();
        }
        return -1;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (C1107b.f4906c) {
            return super.getAutoSizeStepGranularity();
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            return vVar.mo2970e();
        }
        return -1;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (C1107b.f4906c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0554v vVar = this.f1975b;
        return vVar != null ? vVar.mo2971f() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeTextType() {
        int i = 0;
        if (C1107b.f4906c) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            return vVar.mo2972g();
        }
        return 0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2965a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0554v vVar = this.f1975b;
        if (vVar != null && !C1107b.f4906c && vVar.mo2975j()) {
            this.f1975b.mo2967b();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C1107b.f4906c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2957a(i, i2, i3, i4);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@C0193h0 int[] iArr, int i) throws IllegalArgumentException {
        if (C1107b.f4906c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2966a(iArr, i);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (C1107b.f4906c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2955a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2964a(z);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f1974a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2958a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (C1107b.f4906c) {
            super.setTextSize(i, f);
            return;
        }
        C0554v vVar = this.f1975b;
        if (vVar != null) {
            vVar.mo2956a(i, f);
        }
    }

    public C0494f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.buttonStyle);
    }

    public C0494f(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f1974a = new C0489e(this);
        this.f1974a.mo2531a(attributeSet, i);
        this.f1975b = new C0554v(this);
        this.f1975b.mo2962a(attributeSet, i);
        this.f1975b.mo2954a();
    }
}
