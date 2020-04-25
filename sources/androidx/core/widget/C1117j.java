package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.widget.j */
/* compiled from: PopupMenuCompat */
public final class C1117j {
    private C1117j() {
    }

    @C0195i0
    /* renamed from: a */
    public static OnTouchListener m6344a(@C0193h0 Object obj) {
        if (VERSION.SDK_INT >= 19) {
            return ((PopupMenu) obj).getDragToOpenListener();
        }
        return null;
    }
}
