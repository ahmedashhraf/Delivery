package android.support.p003v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes.Builder;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.session.f */
/* compiled from: MediaSessionCompatApi21 */
class C0146f {

    /* renamed from: a */
    static final String f594a = "MediaSessionCompatApi21";

    /* renamed from: android.support.v4.media.session.f$a */
    /* compiled from: MediaSessionCompatApi21 */
    interface C0147a {
        /* renamed from: a */
        void mo413a();

        /* renamed from: a */
        void mo414a(long j);

        /* renamed from: a */
        void mo415a(Object obj);

        /* renamed from: a */
        void mo416a(Object obj, Bundle bundle);

        /* renamed from: a */
        void mo417a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo418a(Intent intent);

        /* renamed from: b */
        void mo419b();

        /* renamed from: b */
        void mo420b(long j);

        /* renamed from: b */
        void mo421b(String str, Bundle bundle);

        /* renamed from: c */
        void mo422c();

        /* renamed from: c */
        void mo423c(String str, Bundle bundle);

        /* renamed from: d */
        void mo424d();

        /* renamed from: d */
        void mo425d(String str, Bundle bundle);

        /* renamed from: f */
        void mo426f();

        void onPause();

        void onStop();
    }

    /* renamed from: android.support.v4.media.session.f$b */
    /* compiled from: MediaSessionCompatApi21 */
    static class C0148b<T extends C0147a> extends Callback {

        /* renamed from: a */
        protected final T f595a;

        public C0148b(T t) {
            this.f595a = t;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m514b(bundle);
            this.f595a.mo417a(str, bundle, resultReceiver);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            this.f595a.mo425d(str, bundle);
        }

        public void onFastForward() {
            this.f595a.mo426f();
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.f595a.mo418a(intent) || super.onMediaButtonEvent(intent);
        }

        public void onPause() {
            this.f595a.onPause();
        }

        public void onPlay() {
            this.f595a.mo422c();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            this.f595a.mo423c(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            this.f595a.mo421b(str, bundle);
        }

        public void onRewind() {
            this.f595a.mo419b();
        }

        public void onSeekTo(long j) {
            this.f595a.mo420b(j);
        }

        public void onSetRating(Rating rating) {
            this.f595a.mo415a((Object) rating);
        }

        public void onSkipToNext() {
            this.f595a.mo413a();
        }

        public void onSkipToPrevious() {
            this.f595a.mo424d();
        }

        public void onSkipToQueueItem(long j) {
            this.f595a.mo414a(j);
        }

        public void onStop() {
            this.f595a.onStop();
        }
    }

    /* renamed from: android.support.v4.media.session.f$c */
    /* compiled from: MediaSessionCompatApi21 */
    static class C0149c {
        private C0149c() {
        }

        /* renamed from: a */
        public static Object m1052a(Object obj, long j) {
            return new QueueItem((MediaDescription) obj, j);
        }

        /* renamed from: b */
        public static long m1053b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }

        /* renamed from: a */
        public static Object m1051a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }
    }

    private C0146f() {
    }

    /* renamed from: a */
    public static Object m1017a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: b */
    public static void m1028b(Object obj, int i) {
        Builder builder = new Builder();
        builder.setLegacyStreamType(i);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    /* renamed from: c */
    public static void m1032c(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    /* renamed from: d */
    public static void m1034d(Object obj) {
        ((MediaSession) obj).release();
    }

    /* renamed from: e */
    public static Object m1035e(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    /* renamed from: f */
    public static Object m1036f(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    /* renamed from: a */
    public static Object m1018a(C0147a aVar) {
        return new C0148b(aVar);
    }

    /* renamed from: c */
    public static boolean m1033c(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    /* renamed from: a */
    public static void m1024a(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((Callback) obj2, handler);
    }

    /* renamed from: a */
    public static void m1019a(Object obj, int i) {
        ((MediaSession) obj).setFlags(i);
    }

    /* renamed from: b */
    public static void m1030b(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    /* renamed from: a */
    public static void m1027a(Object obj, boolean z) {
        ((MediaSession) obj).setActive(z);
    }

    /* renamed from: b */
    public static void m1029b(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    /* renamed from: a */
    public static void m1025a(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    /* renamed from: b */
    public static boolean m1031b(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            if (declaredField.get(obj) != null) {
                return true;
            }
            return false;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static Parcelable m1016a(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    /* renamed from: a */
    public static void m1023a(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    /* renamed from: a */
    public static void m1020a(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: a */
    public static void m1026a(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    /* renamed from: a */
    public static void m1022a(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    /* renamed from: a */
    public static void m1021a(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }
}
