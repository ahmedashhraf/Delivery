package android.support.p003v4.media.session;

import android.media.session.MediaController.TransportControls;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* renamed from: android.support.v4.media.session.e */
/* compiled from: MediaControllerCompatApi24 */
class C0144e {

    /* renamed from: android.support.v4.media.session.e$a */
    /* compiled from: MediaControllerCompatApi24 */
    public static class C0145a {
        private C0145a() {
        }

        /* renamed from: a */
        public static void m1012a(Object obj) {
            ((TransportControls) obj).prepare();
        }

        /* renamed from: b */
        public static void m1015b(Object obj, String str, Bundle bundle) {
            ((TransportControls) obj).prepareFromSearch(str, bundle);
        }

        /* renamed from: a */
        public static void m1014a(Object obj, String str, Bundle bundle) {
            ((TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        /* renamed from: a */
        public static void m1013a(Object obj, Uri uri, Bundle bundle) {
            ((TransportControls) obj).prepareFromUri(uri, bundle);
        }
    }

    private C0144e() {
    }
}
