package androidx.core.p018c;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.c.a */
/* compiled from: BitmapCompat */
public final class C0820a {
    private C0820a() {
    }

    /* renamed from: a */
    public static void m4782a(@C0193h0 Bitmap bitmap, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(z);
        }
    }

    /* renamed from: b */
    public static boolean m4783b(@C0193h0 Bitmap bitmap) {
        if (VERSION.SDK_INT >= 18) {
            return bitmap.hasMipMap();
        }
        return false;
    }

    /* renamed from: a */
    public static int m4781a(@C0193h0 Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }
}
