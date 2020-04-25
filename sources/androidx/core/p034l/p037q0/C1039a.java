package androidx.core.p034l.p037q0;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.l.q0.a */
/* compiled from: EditorInfoCompat */
public final class C1039a {

    /* renamed from: a */
    public static final int f4663a = 16777216;

    /* renamed from: b */
    public static final int f4664b = Integer.MIN_VALUE;

    /* renamed from: c */
    private static final String[] f4665c = new String[0];

    /* renamed from: d */
    private static final String f4666d = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: e */
    private static final String f4667e = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";

    /* renamed from: a */
    public static void m6071a(@C0193h0 EditorInfo editorInfo, @C0195i0 String[] strArr) {
        if (VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray(f4666d, strArr);
        editorInfo.extras.putStringArray(f4667e, strArr);
    }

    /* renamed from: b */
    static int m6073b(EditorInfo editorInfo) {
        if (VERSION.SDK_INT >= 25) {
            return 1;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return 0;
        }
        boolean containsKey = bundle.containsKey(f4666d);
        boolean containsKey2 = editorInfo.extras.containsKey(f4667e);
        if (containsKey && containsKey2) {
            return 4;
        }
        if (containsKey) {
            return 3;
        }
        if (containsKey2) {
            return 2;
        }
        return 0;
    }

    @C0193h0
    /* renamed from: a */
    public static String[] m6072a(EditorInfo editorInfo) {
        if (VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr == null) {
                strArr = f4665c;
            }
            return strArr;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f4665c;
        }
        String[] stringArray = bundle.getStringArray(f4666d);
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray(f4667e);
        }
        if (stringArray == null) {
            stringArray = f4665c;
        }
        return stringArray;
    }
}
