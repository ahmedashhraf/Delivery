package android.support.p003v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.e */
/* compiled from: MediaDescriptionCompatApi23 */
class C0074e {

    /* renamed from: android.support.v4.media.e$a */
    /* compiled from: MediaDescriptionCompatApi23 */
    static class C0075a {
        private C0075a() {
        }

        /* renamed from: a */
        public static void m266a(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    private C0074e() {
    }

    /* renamed from: a */
    public static Uri m265a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
