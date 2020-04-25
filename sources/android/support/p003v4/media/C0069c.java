package android.support.p003v4.media;

import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import android.support.p003v4.media.session.MediaSessionCompat;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(26)
/* renamed from: android.support.v4.media.c */
/* compiled from: MediaBrowserCompatApi26 */
class C0069c {

    /* renamed from: android.support.v4.media.c$a */
    /* compiled from: MediaBrowserCompatApi26 */
    interface C0070a extends C0064d {
        /* renamed from: a */
        void mo140a(@C0193h0 String str, @C0193h0 Bundle bundle);

        /* renamed from: a */
        void mo141a(@C0193h0 String str, List<?> list, @C0193h0 Bundle bundle);
    }

    /* renamed from: android.support.v4.media.c$b */
    /* compiled from: MediaBrowserCompatApi26 */
    static class C0071b<T extends C0070a> extends C0065e<T> {
        C0071b(T t) {
            super(t);
        }

        public void onChildrenLoaded(@C0193h0 String str, List<MediaItem> list, @C0193h0 Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0070a) this.f228a).mo141a(str, list, bundle);
        }

        public void onError(@C0193h0 String str, @C0193h0 Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C0070a) this.f228a).mo140a(str, bundle);
        }
    }

    private C0069c() {
    }

    /* renamed from: a */
    static Object m242a(C0070a aVar) {
        return new C0071b(aVar);
    }

    /* renamed from: a */
    public static void m243a(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (SubscriptionCallback) obj2);
    }

    /* renamed from: a */
    public static void m244a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (SubscriptionCallback) obj2);
    }
}
