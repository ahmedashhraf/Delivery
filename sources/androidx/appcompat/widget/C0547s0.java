package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0193h0;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s0 */
/* compiled from: TintResources */
class C0547s0 extends C0519j0 {

    /* renamed from: b */
    private final WeakReference<Context> f2184b;

    public C0547s0(@C0193h0 Context context, @C0193h0 Resources resources) {
        super(resources);
        this.f2184b = new WeakReference<>(context);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f2184b.get();
        if (!(drawable == null || context == null)) {
            ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i, drawable);
        }
        return drawable;
    }
}
