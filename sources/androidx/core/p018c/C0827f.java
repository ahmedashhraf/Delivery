package androidx.core.p018c;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.C0193h0;
import androidx.annotation.C0215r;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: androidx.core.c.f */
/* compiled from: PathUtils */
public final class C0827f {
    private C0827f() {
    }

    @RequiresApi(26)
    @C0193h0
    /* renamed from: a */
    public static Collection<C0826e> m4834a(@C0193h0 Path path) {
        return m4835a(path, 0.5f);
    }

    @RequiresApi(26)
    @C0193h0
    /* renamed from: a */
    public static Collection<C0826e> m4835a(@C0193h0 Path path, @C0215r(from = 0.0d) float f) {
        float[] approximate = path.approximate(f);
        int length = approximate.length / 3;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = approximate[i2];
            float f3 = approximate[i2 + 1];
            float f4 = approximate[i2 + 2];
            float f5 = approximate[i3];
            float f6 = approximate[i3 + 1];
            float f7 = approximate[i3 + 2];
            if (!(f2 == f5 || (f3 == f6 && f4 == f7))) {
                arrayList.add(new C0826e(new PointF(f6, f7), f5, new PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }
}
