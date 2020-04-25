package androidx.core.p018c;

import android.graphics.PointF;
import androidx.annotation.C0193h0;
import androidx.core.p033k.C0944i;

/* renamed from: androidx.core.c.e */
/* compiled from: PathSegment */
public final class C0826e {

    /* renamed from: a */
    private final PointF f3917a;

    /* renamed from: b */
    private final float f3918b;

    /* renamed from: c */
    private final PointF f3919c;

    /* renamed from: d */
    private final float f3920d;

    public C0826e(@C0193h0 PointF pointF, float f, @C0193h0 PointF pointF2, float f2) {
        this.f3917a = (PointF) C0944i.m5338a(pointF, (Object) "start == null");
        this.f3918b = f;
        this.f3919c = (PointF) C0944i.m5338a(pointF2, (Object) "end == null");
        this.f3920d = f2;
    }

    @C0193h0
    /* renamed from: a */
    public PointF mo4463a() {
        return this.f3919c;
    }

    /* renamed from: b */
    public float mo4464b() {
        return this.f3920d;
    }

    @C0193h0
    /* renamed from: c */
    public PointF mo4465c() {
        return this.f3917a;
    }

    /* renamed from: d */
    public float mo4466d() {
        return this.f3918b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0826e)) {
            return false;
        }
        C0826e eVar = (C0826e) obj;
        if (Float.compare(this.f3918b, eVar.f3918b) != 0 || Float.compare(this.f3920d, eVar.f3920d) != 0 || !this.f3917a.equals(eVar.f3917a) || !this.f3919c.equals(eVar.f3919c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f3917a.hashCode() * 31;
        float f = this.f3918b;
        int i = 0;
        int floatToIntBits = (((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f3919c.hashCode()) * 31;
        float f2 = this.f3920d;
        if (f2 != 0.0f) {
            i = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PathSegment{start=");
        sb.append(this.f3917a);
        sb.append(", startFraction=");
        sb.append(this.f3918b);
        sb.append(", end=");
        sb.append(this.f3919c);
        sb.append(", endFraction=");
        sb.append(this.f3920d);
        sb.append('}');
        return sb.toString();
    }
}
