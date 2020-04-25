package androidx.core.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListPopupWindow;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.widget.g */
/* compiled from: ListPopupWindowCompat */
public final class C1114g {
    private C1114g() {
    }

    @Deprecated
    /* renamed from: a */
    public static OnTouchListener m6338a(Object obj, View view) {
        return m6337a((ListPopupWindow) obj, view);
    }

    @C0195i0
    /* renamed from: a */
    public static OnTouchListener m6337a(@C0193h0 ListPopupWindow listPopupWindow, @C0193h0 View view) {
        if (VERSION.SDK_INT >= 19) {
            return listPopupWindow.createDragToOpenListener(view);
        }
        return null;
    }
}
