package android.support.p003v4.media;

import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ItemCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: android.support.v4.media.b */
/* compiled from: MediaBrowserCompatApi23 */
class C0066b {

    /* renamed from: android.support.v4.media.b$a */
    /* compiled from: MediaBrowserCompatApi23 */
    interface C0067a {
        /* renamed from: a */
        void mo78a(Parcel parcel);

        /* renamed from: a */
        void mo79a(@C0193h0 String str);
    }

    /* renamed from: android.support.v4.media.b$b */
    /* compiled from: MediaBrowserCompatApi23 */
    static class C0068b<T extends C0067a> extends ItemCallback {

        /* renamed from: a */
        protected final T f229a;

        public C0068b(T t) {
            this.f229a = t;
        }

        public void onError(@C0193h0 String str) {
            this.f229a.mo79a(str);
        }

        public void onItemLoaded(MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f229a.mo78a((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f229a.mo78a(obtain);
        }
    }

    private C0066b() {
    }

    /* renamed from: a */
    public static Object m238a(C0067a aVar) {
        return new C0068b(aVar);
    }

    /* renamed from: a */
    public static void m239a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (ItemCallback) obj2);
    }
}
