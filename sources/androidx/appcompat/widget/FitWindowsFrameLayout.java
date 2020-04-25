package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.widget.C0483c0.C0484a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements C0483c0 {

    /* renamed from: a */
    private C0484a f1664a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        C0484a aVar = this.f1664a;
        if (aVar != null) {
            aVar.mo861a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C0484a aVar) {
        this.f1664a = aVar;
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
