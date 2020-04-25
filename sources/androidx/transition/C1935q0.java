package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* renamed from: androidx.transition.q0 */
/* compiled from: ViewGroupOverlayApi18 */
class C1935q0 implements C1938r0 {

    /* renamed from: a */
    private final ViewGroupOverlay f7443a;

    C1935q0(@C0193h0 ViewGroup viewGroup) {
        this.f7443a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo8448a(@C0193h0 Drawable drawable) {
        this.f7443a.add(drawable);
    }

    /* renamed from: b */
    public void mo8449b(@C0193h0 Drawable drawable) {
        this.f7443a.remove(drawable);
    }

    /* renamed from: a */
    public void mo8446a(@C0193h0 View view) {
        this.f7443a.add(view);
    }

    /* renamed from: b */
    public void mo8447b(@C0193h0 View view) {
        this.f7443a.remove(view);
    }
}
