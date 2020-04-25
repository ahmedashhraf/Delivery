package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import androidx.annotation.C0213q;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.core.widget.C1120m;

/* renamed from: androidx.appcompat.widget.g */
/* compiled from: AppCompatCheckedTextView */
public class C0504g extends CheckedTextView {

    /* renamed from: b */
    private static final int[] f2030b = {16843016};

    /* renamed from: a */
    private final C0554v f2031a;

    public C0504g(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0554v vVar = this.f2031a;
        if (vVar != null) {
            vVar.mo2954a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0520k.m2807a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(@C0213q int i) {
        setCheckMarkDrawable(C0242a.m1109c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1120m.m6382b((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0554v vVar = this.f2031a;
        if (vVar != null) {
            vVar.mo2958a(context, i);
        }
    }

    public C0504g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0504g(Context context, AttributeSet attributeSet, int i) {
        super(C0543q0.m2895b(context), attributeSet, i);
        this.f2031a = new C0554v(this);
        this.f2031a.mo2962a(attributeSet, i);
        this.f2031a.mo2954a();
        C0549t0 a = C0549t0.m2910a(getContext(), attributeSet, f2030b, i, 0);
        setCheckMarkDrawable(a.mo2875b(0));
        a.mo2887f();
    }
}
