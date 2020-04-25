package androidx.core.p033k;

import android.os.Build.VERSION;
import androidx.annotation.C0195i0;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: androidx.core.k.e */
/* compiled from: ObjectsCompat */
public class C0937e {
    private C0937e() {
    }

    /* renamed from: a */
    public static boolean m5328a(@C0195i0 Object obj, @C0195i0 Object obj2) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m5326a(@C0195i0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: a */
    public static int m5327a(@C0195i0 Object... objArr) {
        if (VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
