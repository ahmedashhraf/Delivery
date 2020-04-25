package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.appcompat.widget.v0 */
/* compiled from: TooltipCompat */
public class C0557v0 {
    private C0557v0() {
    }

    /* renamed from: a */
    public static void m3031a(@C0193h0 View view, @C0195i0 CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C0559w0.m3063a(view, charSequence);
        }
    }
}
