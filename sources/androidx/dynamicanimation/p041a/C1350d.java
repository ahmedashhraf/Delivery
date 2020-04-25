package androidx.dynamicanimation.p041a;

import android.util.FloatProperty;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.dynamicanimation.a.d */
/* compiled from: FloatPropertyCompat */
public abstract class C1350d<T> {

    /* renamed from: a */
    final String f5311a;

    /* renamed from: androidx.dynamicanimation.a.d$a */
    /* compiled from: FloatPropertyCompat */
    static class C1351a extends C1350d<T> {

        /* renamed from: b */
        final /* synthetic */ FloatProperty f5312b;

        C1351a(String str, FloatProperty floatProperty) {
            this.f5312b = floatProperty;
            super(str);
        }

        /* renamed from: a */
        public float mo5821a(T t) {
            return ((Float) this.f5312b.get(t)).floatValue();
        }

        /* renamed from: a */
        public void mo5823a(T t, float f) {
            this.f5312b.setValue(t, f);
        }
    }

    public C1350d(String str) {
        this.f5311a = str;
    }

    @RequiresApi(24)
    /* renamed from: a */
    public static <T> C1350d<T> m7122a(FloatProperty<T> floatProperty) {
        return new C1351a(floatProperty.getName(), floatProperty);
    }

    /* renamed from: a */
    public abstract float mo5821a(T t);

    /* renamed from: a */
    public abstract void mo5823a(T t, float f);
}
