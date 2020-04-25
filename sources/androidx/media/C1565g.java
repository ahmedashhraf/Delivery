package androidx.media;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.service.media.MediaBrowserService.BrowserRoot;
import android.service.media.MediaBrowserService.Result;
import android.support.p003v4.media.session.MediaSessionCompat;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: androidx.media.g */
/* compiled from: MediaBrowserServiceCompatApi21 */
class C1565g {

    /* renamed from: androidx.media.g$a */
    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class C1566a {

        /* renamed from: a */
        final String f6035a;

        /* renamed from: b */
        final Bundle f6036b;

        C1566a(String str, Bundle bundle) {
            this.f6035a = str;
            this.f6036b = bundle;
        }
    }

    /* renamed from: androidx.media.g$b */
    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class C1567b extends MediaBrowserService {

        /* renamed from: a */
        final C1569d f6037a;

        C1567b(Context context, C1569d dVar) {
            attachBaseContext(context);
            this.f6037a = dVar;
        }

        public BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            C1566a a = this.f6037a.mo6730a(str, i, bundle == null ? null : new Bundle(bundle));
            if (a == null) {
                return null;
            }
            return new BrowserRoot(a.f6035a, a.f6036b);
        }

        public void onLoadChildren(String str, Result<List<MediaItem>> result) {
            this.f6037a.mo6734b(str, new C1568c(result));
        }
    }

    /* renamed from: androidx.media.g$c */
    /* compiled from: MediaBrowserServiceCompatApi21 */
    static class C1568c<T> {

        /* renamed from: a */
        Result f6038a;

        C1568c(Result result) {
            this.f6038a = result;
        }

        /* renamed from: a */
        public void mo6784a(T t) {
            if (t instanceof List) {
                this.f6038a.sendResult(mo6782a((List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f6038a.sendResult(MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f6038a.sendResult(null);
            }
        }

        /* renamed from: a */
        public void mo6783a() {
            this.f6038a.detach();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<MediaItem> mo6782a(List<Parcel> list) {
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

    /* renamed from: androidx.media.g$d */
    /* compiled from: MediaBrowserServiceCompatApi21 */
    public interface C1569d {
        /* renamed from: a */
        C1566a mo6730a(String str, int i, Bundle bundle);

        /* renamed from: b */
        void mo6734b(String str, C1568c<List<Parcel>> cVar);
    }

    private C1565g() {
    }

    /* renamed from: a */
    public static Object m8047a(Context context, C1569d dVar) {
        return new C1567b(context, dVar);
    }

    /* renamed from: a */
    public static void m8048a(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: a */
    public static IBinder m8046a(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: a */
    public static void m8049a(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((Token) obj2);
    }

    /* renamed from: a */
    public static void m8050a(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }
}
