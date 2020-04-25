package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import androidx.core.p038os.C1058b;

/* renamed from: androidx.core.content.a */
/* compiled from: ContentResolverCompat */
public final class C0840a {
    private C0840a() {
    }

    /* renamed from: a */
    public static Cursor m4914a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C1058b bVar) {
        Object obj;
        if (VERSION.SDK_INT >= 16) {
            if (bVar != null) {
                try {
                    obj = bVar.mo5201b();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new androidx.core.p038os.OperationCanceledException();
                    }
                    throw e;
                }
            } else {
                obj = null;
            }
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
        if (bVar != null) {
            bVar.mo5203d();
        }
        return contentResolver.query(uri, strArr, str, strArr2, str2);
    }
}
