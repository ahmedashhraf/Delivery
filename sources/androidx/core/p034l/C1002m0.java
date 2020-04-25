package androidx.core.p034l;

import android.os.Build.VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.C0193h0;
import androidx.annotation.C0225w;

/* renamed from: androidx.core.l.m0 */
/* compiled from: WindowCompat */
public final class C1002m0 {

    /* renamed from: a */
    public static final int f4443a = 8;

    /* renamed from: b */
    public static final int f4444b = 9;

    /* renamed from: c */
    public static final int f4445c = 10;

    private C1002m0() {
    }

    @C0193h0
    /* renamed from: a */
    public static <T extends View> T m5731a(@C0193h0 Window window, @C0225w int i) {
        if (VERSION.SDK_INT >= 28) {
            return window.requireViewById(i);
        }
        T findViewById = window.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }
}
