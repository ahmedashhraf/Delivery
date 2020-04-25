package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.app.k */
/* compiled from: DialogCompat */
public class C0752k {
    private C0752k() {
    }

    @C0193h0
    /* renamed from: a */
    public static View m4319a(@C0193h0 Dialog dialog, int i) {
        if (VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
