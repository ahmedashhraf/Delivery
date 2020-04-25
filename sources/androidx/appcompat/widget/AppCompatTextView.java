package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0199k0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0237z;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p018c.C0828g;
import androidx.core.p031j.C0913d;
import androidx.core.p031j.C0913d.C0914a;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1107b;
import androidx.core.widget.C1120m;
import androidx.core.widget.C1124o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements C0955c0, C1124o, C1107b {

    /* renamed from: N */
    private final C0550u f1648N;
    @C0195i0

    /* renamed from: O */
    private Future<C0913d> f1649O;

    /* renamed from: a */
    private final C0489e f1650a;

    /* renamed from: b */
    private final C0554v f1651b;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void mo1393e() {
        Future<C0913d> future = this.f1649O;
        if (future != null) {
            try {
                this.f1649O = null;
                C1120m.m6379a((TextView) this, (C0913d) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (C1107b.f4906c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            return vVar.mo2972g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C1120m.m6395i(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C1120m.m6396j(this);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1651b.mo2973h();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportCompoundDrawablesTintMode() {
        return this.f1651b.mo2974i();
    }

    public CharSequence getText() {
        mo1393e();
        return super.getText();
    }

    @RequiresApi(api = 26)
    @C0193h0
    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0550u uVar = this.f1648N;
            if (uVar != null) {
                return uVar.mo2894a();
            }
        }
        return super.getTextClassifier();
    }

    @C0193h0
    public C0914a getTextMetricsParamsCompat() {
        return C1120m.m6400n(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0520k.m2807a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2965a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo1393e();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0554v vVar = this.f1651b;
        if (vVar != null && !C1107b.f4906c && vVar.mo2975j()) {
            this.f1651b.mo2967b();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (C1107b.f4906c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
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
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2955a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setCompoundDrawables(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelative(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@C0195i0 Drawable drawable, @C0195i0 Drawable drawable2, @C0195i0 Drawable drawable3, @C0195i0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(@C0237z(from = 0) @C0199k0 int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1120m.m6383b((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(@C0237z(from = 0) @C0199k0 int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1120m.m6387c(this, i);
        }
    }

    public void setLineHeight(@C0237z(from = 0) @C0199k0 int i) {
        C1120m.m6388d(this, i);
    }

    public void setPrecomputedText(@C0193h0 C0913d dVar) {
        C1120m.m6379a((TextView) this, dVar);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f1650a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@C0195i0 ColorStateList colorStateList) {
        this.f1651b.mo2959a(colorStateList);
        this.f1651b.mo2954a();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@C0195i0 Mode mode) {
        this.f1651b.mo2960a(mode);
        this.f1651b.mo2954a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2958a(context, i);
        }
    }

    @RequiresApi(api = 26)
    public void setTextClassifier(@C0195i0 TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0550u uVar = this.f1648N;
            if (uVar != null) {
                uVar.mo2895a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(@C0195i0 Future<C0913d> future) {
        this.f1649O = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@C0193h0 C0914a aVar) {
        C1120m.m6378a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (C1107b.f4906c) {
            super.setTextSize(i, f);
            return;
        }
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2956a(i, f);
        }
    }

    public void setTypeface(@C0195i0 Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C0828g.m4837a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f1650a = new C0489e(this);
        this.f1650a.mo2531a(attributeSet, i);
        this.f1651b = new C0554v(this);
        this.f1651b.mo2962a(attributeSet, i);
        this.f1651b.mo2954a();
        this.f1648N = new C0550u(this);
    }

    @RequiresApi(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0242a.m1109c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0242a.m1109c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0242a.m1109c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0242a.m1109c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C0242a.m1109c(context, i) : null;
        Drawable c2 = i2 != 0 ? C0242a.m1109c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C0242a.m1109c(context, i3) : null;
        if (i4 != 0) {
            drawable = C0242a.m1109c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0554v vVar = this.f1651b;
        if (vVar != null) {
            vVar.mo2976k();
        }
    }
}
