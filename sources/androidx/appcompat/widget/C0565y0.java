package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.lang.ref.WeakReference;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.y0 */
/* compiled from: VectorEnabledTintResources */
public class C0565y0 extends Resources {

    /* renamed from: b */
    private static boolean f2290b = false;

    /* renamed from: c */
    public static final int f2291c = 20;

    /* renamed from: a */
    private final WeakReference<Context> f2292a;

    public C0565y0(@C0193h0 Context context, @C0193h0 Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2292a = new WeakReference<>(context);
    }

    /* renamed from: b */
    public static boolean m3091b() {
        return m3090a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo3005a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) throws NotFoundException {
        Context context = (Context) this.f2292a.get();
        if (context != null) {
            return ResourceManagerInternal.get().onDrawableLoadedFromResources(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* renamed from: a */
    public static void m3089a(boolean z) {
        f2290b = z;
    }

    /* renamed from: a */
    public static boolean m3090a() {
        return f2290b;
    }
}
