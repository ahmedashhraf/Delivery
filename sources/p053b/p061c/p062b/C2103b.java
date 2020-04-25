package p053b.p061c.p062b;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: b.c.b.b */
/* compiled from: DocumentsContractApi19 */
class C2103b {

    /* renamed from: a */
    private static final String f7987a = "DocumentFile";

    /* renamed from: b */
    private static final int f7988b = 512;

    private C2103b() {
    }

    /* renamed from: a */
    public static boolean m10910a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m10915f(context, uri));
    }

    /* renamed from: b */
    public static boolean m10911b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String f = m10915f(context, uri);
        int a = m10906a(context, uri, "flags", 0);
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        if ((a & 4) != 0) {
            return true;
        }
        if ("vnd.android.document/directory".equals(f) && (a & 8) != 0) {
            return true;
        }
        if (TextUtils.isEmpty(f) || (a & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m10912c(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = true;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() <= 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            sb.toString();
            return false;
        } finally {
            m10909a(cursor);
        }
    }

    /* renamed from: d */
    public static long m10913d(Context context, Uri uri) {
        return m10907a(context, uri, "flags", 0);
    }

    @C0195i0
    /* renamed from: e */
    public static String m10914e(Context context, Uri uri) {
        return m10908a(context, uri, "_display_name", (String) null);
    }

    @C0195i0
    /* renamed from: f */
    private static String m10915f(Context context, Uri uri) {
        return m10908a(context, uri, "mime_type", (String) null);
    }

    @C0195i0
    /* renamed from: g */
    public static String m10916g(Context context, Uri uri) {
        String f = m10915f(context, uri);
        if ("vnd.android.document/directory".equals(f)) {
            return null;
        }
        return f;
    }

    /* renamed from: h */
    public static boolean m10917h(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m10915f(context, uri));
    }

    /* renamed from: i */
    public static boolean m10918i(Context context, Uri uri) {
        String f = m10915f(context, uri);
        return !"vnd.android.document/directory".equals(f) && !TextUtils.isEmpty(f);
    }

    /* renamed from: j */
    public static boolean m10919j(Context context, Uri uri) {
        boolean z = false;
        if (!DocumentsContract.isDocumentUri(context, uri)) {
            return false;
        }
        if ((m10913d(context, uri) & 512) != 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: k */
    public static long m10920k(Context context, Uri uri) {
        return m10907a(context, uri, "last_modified", 0);
    }

    /* renamed from: l */
    public static long m10921l(Context context, Uri uri) {
        return m10907a(context, uri, "_size", 0);
    }

    @C0195i0
    /* renamed from: a */
    private static String m10908a(Context context, Uri uri, String str, @C0195i0 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            m10909a(cursor);
            return str2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            sb.toString();
            return str2;
        } finally {
            m10909a(cursor);
        }
    }

    /* renamed from: a */
    private static int m10906a(Context context, Uri uri, String str, int i) {
        return (int) m10907a(context, uri, str, (long) i);
    }

    /* renamed from: a */
    private static long m10907a(Context context, Uri uri, String str, long j) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            m10909a(cursor);
            return j;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed query: ");
            sb.append(e);
            sb.toString();
            return j;
        } finally {
            m10909a(cursor);
        }
    }

    /* renamed from: a */
    private static void m10909a(@C0195i0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
