package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: androidx.transition.z */
/* compiled from: PropertyValuesHolderUtils */
class C1958z {
    private C1958z() {
    }

    /* renamed from: a */
    static PropertyValuesHolder m10284a(Property<?, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, null, path);
        }
        return PropertyValuesHolder.ofFloat(new C1952x(property, path), new float[]{0.0f, 1.0f});
    }
}
