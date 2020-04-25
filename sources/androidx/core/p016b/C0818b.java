package androidx.core.p016b;

import android.text.TextUtils;

@Deprecated
/* renamed from: androidx.core.b.b */
/* compiled from: DatabaseUtilsCompat */
public final class C0818b {
    private C0818b() {
    }

    @Deprecated
    /* renamed from: a */
    public static String m4778a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(str);
        sb.append(") AND (");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public static String[] m4779a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
