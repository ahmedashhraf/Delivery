package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: androidx.transition.v0 */
/* compiled from: ViewOverlayApi18 */
class C1949v0 implements C1951w0 {

    /* renamed from: a */
    private final ViewOverlay f7472a;

    C1949v0(@C0193h0 View view) {
        this.f7472a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo8448a(@C0193h0 Drawable drawable) {
        this.f7472a.add(drawable);
    }

    /* renamed from: b */
    public void mo8449b(@C0193h0 Drawable drawable) {
        this.f7472a.remove(drawable);
    }
}
