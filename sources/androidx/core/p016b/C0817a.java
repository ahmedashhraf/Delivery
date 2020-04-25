package androidx.core.p016b;

import android.database.CursorWindow;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.b.a */
/* compiled from: CursorWindowCompat */
public final class C0817a {
    private C0817a() {
    }

    @C0193h0
    /* renamed from: a */
    public static CursorWindow m4777a(@C0195i0 String str, long j) {
        int i = VERSION.SDK_INT;
        if (i >= 28) {
            return new CursorWindow(str, j);
        }
        if (i >= 15) {
            return new CursorWindow(str);
        }
        return new CursorWindow(false);
    }
}
