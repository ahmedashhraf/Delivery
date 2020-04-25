package com.mrsool.utils.p422c0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: com.mrsool.utils.c0.f */
/* compiled from: Utils */
final class C11639f {
    private C11639f() {
    }

    @C0195i0
    /* renamed from: a */
    static Activity m52469a(@C0195i0 Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m52469a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: a */
    static void m52470a(String str, int i, String str2, Object... objArr) {
    }

    /* renamed from: a */
    static boolean m52472a(@C0195i0 Object obj, @C0195i0 Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    static boolean m52471a(@C0193h0 Rect rect, @C0193h0 Rect rect2, int i) {
        return rect.contains(rect2.left + i, rect2.top + i, rect2.right - i, rect2.bottom - i);
    }
}
