package android.support.p003v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.a */
/* compiled from: MediaBrowserCompatApi21 */
class C0060a {

    /* renamed from: a */
    static final String f226a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* renamed from: android.support.v4.media.a$a */
    /* compiled from: MediaBrowserCompatApi21 */
    interface C0061a {
        /* renamed from: c */
        void mo70c();

        /* renamed from: e */
        void mo71e();

        /* renamed from: f */
        void mo72f();
    }

    /* renamed from: android.support.v4.media.a$b */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0062b<T extends C0061a> extends ConnectionCallback {

        /* renamed from: a */
        protected final T f227a;

        public C0062b(T t) {
            this.f227a = t;
        }

        public void onConnected() {
            this.f227a.mo71e();
        }

        public void onConnectionFailed() {
            this.f227a.mo72f();
        }

        public void onConnectionSuspended() {
            this.f227a.mo70c();
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0063c {
        private C0063c() {
        }

        /* renamed from: a */
        public static Object m234a(Object obj) {
            return ((MediaItem) obj).getDescription();
        }

        /* renamed from: b */
        public static int m235b(Object obj) {
            return ((MediaItem) obj).getFlags();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    /* compiled from: MediaBrowserCompatApi21 */
    interface C0064d {
        /* renamed from: a */
        void mo138a(@C0193h0 String str);

        /* renamed from: a */
        void mo139a(@C0193h0 String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$e */
    /* compiled from: MediaBrowserCompatApi21 */
    static class C0065e<T extends C0064d> extends SubscriptionCallback {

        /* renamed from: a */
        protected final T f228a;

        public C0065e(T t) {
            this.f228a = t;
        }

        public void onChildrenLoaded(@C0193h0 String str, List<MediaItem> list) {
            this.f228a.mo139a(str, list);
        }

        public void onError(@C0193h0 String str) {
            this.f228a.mo138a(str);
        }
    }

    private C0060a() {
    }

    /* renamed from: a */
    public static Object m220a(C0061a aVar) {
        return new C0062b(aVar);
    }

    /* renamed from: b */
    public static void m225b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m226c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static String m227d(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: e */
    public static ComponentName m228e(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: f */
    public static Object m229f(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: g */
    public static boolean m230g(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: a */
    public static Object m219a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static void m222a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: a */
    public static Object m221a(C0064d dVar) {
        return new C0065e(dVar);
    }

    /* renamed from: a */
    public static void m224a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (SubscriptionCallback) obj2);
    }

    /* renamed from: a */
    public static void m223a(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }
}
