package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.x */
/* compiled from: PathProperty */
class C1952x<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f7473a;

    /* renamed from: b */
    private final PathMeasure f7474b;

    /* renamed from: c */
    private final float f7475c;

    /* renamed from: d */
    private final float[] f7476d = new float[2];

    /* renamed from: e */
    private final PointF f7477e = new PointF();

    /* renamed from: f */
    private float f7478f;

    C1952x(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f7473a = property;
        this.f7474b = new PathMeasure(path, false);
        this.f7475c = this.f7474b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f7478f = f.floatValue();
        this.f7474b.getPosTan(this.f7475c * f.floatValue(), this.f7476d, null);
        PointF pointF = this.f7477e;
        float[] fArr = this.f7476d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f7473a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f7478f);
    }
}
