package p076c.p082c.p083a.p088u.p095j;

import android.net.Uri;
import com.facebook.common.util.UriUtil;

/* renamed from: c.c.a.u.j.a */
/* compiled from: AssetUriParser */
final class C2391a {

    /* renamed from: a */
    private static final String f9346a = "android_asset";

    /* renamed from: b */
    private static final String f9347b = "file:///android_asset/";

    /* renamed from: c */
    private static final int f9348c = 22;

    private C2391a() {
    }

    /* renamed from: a */
    public static boolean m12217a(Uri uri) {
        if (!UriUtil.LOCAL_FILE_SCHEME.equals(uri.getScheme()) || uri.getPathSegments().isEmpty()) {
            return false;
        }
        return f9346a.equals(uri.getPathSegments().get(0));
    }

    /* renamed from: b */
    public static String m12218b(Uri uri) {
        return uri.toString().substring(f9348c);
    }
}
