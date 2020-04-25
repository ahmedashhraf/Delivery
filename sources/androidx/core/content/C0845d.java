package androidx.core.content;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.ArrayList;
import p205i.p489f.C14069f;

/* renamed from: androidx.core.content.d */
/* compiled from: MimeTypeFilter */
public final class C0845d {
    private C0845d() {
    }

    /* renamed from: a */
    private static boolean m4939a(@C0193h0 String[] strArr, @C0193h0 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        } else if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        } else if (strArr.length != 2) {
            return false;
        } else {
            String str = strArr2[0];
            String str2 = C14069f.f41343G;
            if (!str2.equals(str) && !strArr2[0].equals(strArr[0])) {
                return false;
            }
            if (str2.equals(strArr2[1]) || strArr2[1].equals(strArr[1])) {
                return true;
            }
            return false;
        }
    }

    @C0193h0
    /* renamed from: b */
    public static String[] m4940b(@C0195i0 String[] strArr, @C0193h0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "/";
        String[] split = str.split(str2);
        for (String str3 : strArr) {
            if (m4939a(str3.split(str2), split)) {
                arrayList.add(str3);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m4938a(@C0195i0 String str, @C0193h0 String str2) {
        if (str == null) {
            return false;
        }
        String str3 = "/";
        return m4939a(str.split(str3), str2.split(str3));
    }

    @C0195i0
    /* renamed from: a */
    public static String m4936a(@C0195i0 String str, @C0193h0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String str2 = "/";
        String[] split = str.split(str2);
        for (String str3 : strArr) {
            if (m4939a(split, str3.split(str2))) {
                return str3;
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: a */
    public static String m4937a(@C0195i0 String[] strArr, @C0193h0 String str) {
        if (strArr == null) {
            return null;
        }
        String str2 = "/";
        String[] split = str.split(str2);
        for (String str3 : strArr) {
            if (m4939a(str3.split(str2), split)) {
                return str3;
            }
        }
        return null;
    }
}
