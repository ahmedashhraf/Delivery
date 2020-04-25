package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.browser.C0578R;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP})
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a */
    private final int f2401a = getResources().getDimensionPixelOffset(C0578R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: b */
    private final int f2402b = getResources().getDimensionPixelOffset(C0578R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2401a * 2), this.f2402b), C6637f.f18605b), i2);
    }
}
