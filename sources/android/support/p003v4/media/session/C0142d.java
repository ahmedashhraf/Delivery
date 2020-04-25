package android.support.p003v4.media.session;

import android.media.session.MediaController.TransportControls;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.session.d */
/* compiled from: MediaControllerCompatApi23 */
class C0142d {

    /* renamed from: android.support.v4.media.session.d$a */
    /* compiled from: MediaControllerCompatApi23 */
    public static class C0143a {
        private C0143a() {
        }

        /* renamed from: a */
        public static void m1011a(Object obj, Uri uri, Bundle bundle) {
            ((TransportControls) obj).playFromUri(uri, bundle);
        }
    }

    private C0142d() {
    }
}
