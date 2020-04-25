package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0955c0;
import androidx.core.widget.C1120m;

/* renamed from: androidx.appcompat.widget.j */
/* compiled from: AppCompatEditText */
public class C0518j extends EditText implements C0955c0 {

    /* renamed from: N */
    private final C0550u f2066N;

    /* renamed from: a */
    private final C0489e f2067a;

    /* renamed from: b */
    private final C0554v f2068b;

    public C0518j(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            eVar.mo2526a();
        }
        C0554v vVar = this.f2068b;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public ColorStateList getSupportBackgroundTintList() {
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            return eVar.mo2532b();
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    @C0195i0
    public Mode getSupportBackgroundTintMode() {
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            return eVar.mo2534c();
        }
        return null;
    }

    @RequiresApi(api = 26)
    @C0193h0
    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0550u uVar = this.f2066N;
            if (uVar != null) {
                return uVar.mo2894a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0520k.m2807a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            eVar.mo2530a(drawable);
        }
    }

    public void setBackgroundResource(@C0213q int i) {
        super.setBackgroundResource(i);
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            eVar.mo2527a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            eVar.mo2533b(colorStateList);
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@C0195i0 Mode mode) {
        C0489e eVar = this.f2067a;
        if (eVar != null) {
            eVar.mo2529a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0554v vVar = this.f2068b;
        if (vVar != null) {
            vVar.mo2958a(context, i);
        }
    }

    @RequiresApi(api = 26)
    public void setTextClassifier(@C0195i0 TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0550u uVar = this.f2066N;
            if (uVar != null) {
                uVar.mo2895a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public C0518j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.editTextStyle);
    }

    @C0195i0
    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C0518j(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f2067a = new C0489e(this);
        this.f2067a.mo2531a(attributeSet, i);
        this.f2068b = new C0554v(this);
        this.f2068b.mo2962a(attributeSet, i);
        this.f2068b.mo2954a();
        this.f2066N = new C0550u(this);
    }
}
