package androidx.core.p034l.p036p0;

import android.graphics.Path;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.l.p0.b */
/* compiled from: PathInterpolatorCompat */
public final class C1037b {
    private C1037b() {
    }

    /* renamed from: a */
    public static Interpolator m6070a(Path path) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(path);
        }
        return new C1036a(path);
    }

    /* renamed from: a */
    public static Interpolator m6068a(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2);
        }
        return new C1036a(f, f2);
    }

    /* renamed from: a */
    public static Interpolator m6069a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C1036a(f, f2, f3, f4);
    }
}
