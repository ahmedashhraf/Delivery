package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: androidx.transition.v */
/* compiled from: ObjectAnimatorUtils */
class C1948v {
    private C1948v() {
    }

    /* renamed from: a */
    static <T> ObjectAnimator m10254a(T t, Property<T, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1952x(property, path), new float[]{0.0f, 1.0f});
    }
}
