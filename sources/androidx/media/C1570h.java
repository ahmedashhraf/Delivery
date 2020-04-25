package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Parcel;
import android.service.media.MediaBrowserService.Result;
import androidx.annotation.RequiresApi;
import androidx.media.C1565g.C1569d;

@RequiresApi(23)
/* renamed from: androidx.media.h */
/* compiled from: MediaBrowserServiceCompatApi23 */
class C1570h {

    /* renamed from: androidx.media.h$a */
    /* compiled from: MediaBrowserServiceCompatApi23 */
    static class C1571a extends C1567b {
        C1571a(Context context, C1572b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, Result<MediaItem> result) {
            ((C1572b) this.f6037a).mo6741a(str, new C1568c(result));
        }
    }

    /* renamed from: androidx.media.h$b */
    /* compiled from: MediaBrowserServiceCompatApi23 */
    public interface C1572b extends C1569d {
        /* renamed from: a */
        void mo6741a(String str, C1568c<Parcel> cVar);
    }

    private C1570h() {
    }

    /* renamed from: a */
    public static Object m8056a(Context context, C1572b bVar) {
        return new C1571a(context, bVar);
    }
}
