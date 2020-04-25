package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1120m;

/* renamed from: androidx.appcompat.widget.d */
/* compiled from: AppCompatAutoCompleteTextView */
public class C0485d extends AutoCompleteTextView implements C0955c0 {

    /* renamed from: N */
    private static final int[] f1925N = {16843126};

    /* renamed from: a */
    private final C0489e f1926a;

    /* renamed from: b */
    private final C0554v f1927b;

    public C0485d(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0554v vVar = this.f1927b;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0520k.m2807a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(@C0213q int i) {
        setDropDownBackgroundDrawable(C0242a.m1109c(getContext(), i));
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f1926a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0554v vVar = this.f1927b;
        if (vVar != null) {
            vVar.mo2958a(context, i);
        }
    }

    public C0485d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.autoCompleteTextViewStyle);
    }

    public C0485d(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        C0549t0 a = C0549t0.m2910a(getContext(), attributeSet, f1925N, i, 0);
        if (a.mo2892j(0)) {
            setDropDownBackgroundDrawable(a.mo2875b(0));
        }
        a.mo2887f();
        this.f1926a = new C0489e(this);
        this.f1926a.mo2531a(attributeSet, i);
        this.f1927b = new C0554v(this);
        this.f1927b.mo2962a(attributeSet, i);
        this.f1927b.mo2954a();
    }
}
