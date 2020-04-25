package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.Result;
import android.support.p003v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import androidx.media.C1570h.C1572b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(26)
/* renamed from: androidx.media.i */
/* compiled from: MediaBrowserServiceCompatApi26 */
class C1573i {

    /* renamed from: a */
    private static final String f6039a = "MBSCompatApi26";

    /* renamed from: b */
    static Field f6040b;

    /* renamed from: androidx.media.i$a */
    /* compiled from: MediaBrowserServiceCompatApi26 */
    static class C1574a extends C1571a {
        C1574a(Context context, C1576c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            ((C1576c) this.f6037a).mo6743a(str, new C1575b(result), bundle);
        }
    }

    /* renamed from: androidx.media.i$b */
    /* compiled from: MediaBrowserServiceCompatApi26 */
    static class C1575b {

        /* renamed from: a */
        Result f6041a;

        C1575b(Result result) {
            this.f6041a = result;
        }

        /* renamed from: a */
        public void mo6789a(List<Parcel> list, int i) {
            try {
                C1573i.f6040b.setInt(this.f6041a, i);
            } catch (IllegalAccessException unused) {
            }
            this.f6041a.sendResult(mo6787a(list));
        }

        /* renamed from: a */
        public void mo6788a() {
            this.f6041a.detach();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<MediaItem> mo6787a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }
    }

    /* renamed from: androidx.media.i$c */
    /* compiled from: MediaBrowserServiceCompatApi26 */
    public interface C1576c extends C1572b {
        /* renamed from: a */
        void mo6743a(String str, C1575b bVar, Bundle bundle);
    }

    static {
        try {
            f6040b = Result.class.getDeclaredField("mFlags");
            f6040b.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
    }

    private C1573i() {
    }

    /* renamed from: a */
    public static Object m8059a(Context context, C1576c cVar) {
        return new C1574a(context, cVar);
    }

    /* renamed from: a */
    public static void m8060a(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }

    /* renamed from: a */
    public static Bundle m8058a(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }
}
