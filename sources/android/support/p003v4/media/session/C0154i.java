package android.support.p003v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.p003v4.media.session.C0151h.C0152a;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

@RequiresApi(24)
/* renamed from: android.support.v4.media.session.i */
/* compiled from: MediaSessionCompatApi24 */
class C0154i {

    /* renamed from: a */
    private static final String f596a = "MediaSessionCompatApi24";

    /* renamed from: android.support.v4.media.session.i$a */
    /* compiled from: MediaSessionCompatApi24 */
    public interface C0155a extends C0152a {
        /* renamed from: a */
        void mo430a(Uri uri, Bundle bundle);

        /* renamed from: a */
        void mo431a(String str, Bundle bundle);

        /* renamed from: e */
        void mo432e();

        /* renamed from: e */
        void mo433e(String str, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.session.i$b */
    /* compiled from: MediaSessionCompatApi24 */
    static class C0156b<T extends C0155a> extends C0153b<T> {
        public C0156b(T t) {
            super(t);
        }

        public void onPrepare() {
            ((C0155a) this.f595a).mo432e();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0155a) this.f595a).mo431a(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0155a) this.f595a).mo433e(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0155a) this.f595a).mo430a(uri, bundle);
        }
    }

    private C0154i() {
    }

    /* renamed from: a */
    public static Object m1057a(C0155a aVar) {
        return new C0156b(aVar);
    }

    /* renamed from: a */
    public static String m1058a(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
