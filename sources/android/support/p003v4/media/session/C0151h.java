package android.support.p003v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.session.h */
/* compiled from: MediaSessionCompatApi23 */
class C0151h {

    /* renamed from: android.support.v4.media.session.h$a */
    /* compiled from: MediaSessionCompatApi23 */
    public interface C0152a extends C0147a {
        /* renamed from: b */
        void mo429b(Uri uri, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.h$b */
    /* compiled from: MediaSessionCompatApi23 */
    static class C0153b<T extends C0152a> extends C0148b<T> {
        public C0153b(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0152a) this.f595a).mo429b(uri, bundle);
        }
    }

    private C0151h() {
    }

    /* renamed from: a */
    public static Object m1055a(C0152a aVar) {
        return new C0153b(aVar);
    }
}
