package android.support.p003v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaController.TransportControls;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.session.c */
/* compiled from: MediaControllerCompatApi21 */
class C0137c {

    /* renamed from: android.support.v4.media.session.c$a */
    /* compiled from: MediaControllerCompatApi21 */
    public interface C0138a {
        /* renamed from: a */
        void mo286a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo287a(CharSequence charSequence);

        /* renamed from: a */
        void mo288a(Object obj);

        /* renamed from: a */
        void mo289a(String str, Bundle bundle);

        /* renamed from: b */
        void mo290b(Bundle bundle);

        /* renamed from: b */
        void mo291b(Object obj);

        /* renamed from: b */
        void mo292b(List<?> list);

        /* renamed from: v */
        void mo293v();
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* compiled from: MediaControllerCompatApi21 */
    static class C0139b<T extends C0138a> extends Callback {

        /* renamed from: a */
        protected final T f590a;

        public C0139b(T t) {
            this.f590a = t;
        }

        public void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f590a.mo286a(playbackInfo.getPlaybackType(), C0140c.m994c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            this.f590a.mo290b(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f590a.mo288a((Object) mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f590a.mo291b((Object) playbackState);
        }

        public void onQueueChanged(List<QueueItem> list) {
            this.f590a.mo292b(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f590a.mo287a(charSequence);
        }

        public void onSessionDestroyed() {
            this.f590a.mo293v();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m514b(bundle);
            this.f590a.mo289a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c */
    /* compiled from: MediaControllerCompatApi21 */
    public static class C0140c {

        /* renamed from: a */
        private static final int f591a = 4;

        /* renamed from: b */
        private static final int f592b = 6;

        /* renamed from: c */
        private static final int f593c = 7;

        private C0140c() {
        }

        /* renamed from: a */
        public static AudioAttributes m992a(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m993b(Object obj) {
            return ((PlaybackInfo) obj).getCurrentVolume();
        }

        /* renamed from: c */
        public static int m994c(Object obj) {
            return m991a(m992a(obj));
        }

        /* renamed from: d */
        public static int m995d(Object obj) {
            return ((PlaybackInfo) obj).getMaxVolume();
        }

        /* renamed from: e */
        public static int m996e(Object obj) {
            return ((PlaybackInfo) obj).getPlaybackType();
        }

        /* renamed from: f */
        public static int m997f(Object obj) {
            return ((PlaybackInfo) obj).getVolumeControl();
        }

        /* renamed from: a */
        private static int m991a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$d */
    /* compiled from: MediaControllerCompatApi21 */
    public static class C0141d {
        private C0141d() {
        }

        /* renamed from: a */
        public static void m999a(Object obj, long j) {
            ((TransportControls) obj).seekTo(j);
        }

        /* renamed from: b */
        public static void m1002b(Object obj) {
            ((TransportControls) obj).pause();
        }

        /* renamed from: c */
        public static void m1005c(Object obj) {
            ((TransportControls) obj).play();
        }

        /* renamed from: d */
        public static void m1007d(Object obj) {
            ((TransportControls) obj).rewind();
        }

        /* renamed from: e */
        public static void m1008e(Object obj) {
            ((TransportControls) obj).skipToNext();
        }

        /* renamed from: f */
        public static void m1009f(Object obj) {
            ((TransportControls) obj).skipToPrevious();
        }

        /* renamed from: g */
        public static void m1010g(Object obj) {
            ((TransportControls) obj).stop();
        }

        /* renamed from: a */
        public static void m998a(Object obj) {
            ((TransportControls) obj).fastForward();
        }

        /* renamed from: b */
        public static void m1004b(Object obj, String str, Bundle bundle) {
            ((TransportControls) obj).playFromSearch(str, bundle);
        }

        /* renamed from: c */
        public static void m1006c(Object obj, String str, Bundle bundle) {
            ((TransportControls) obj).sendCustomAction(str, bundle);
        }

        /* renamed from: a */
        public static void m1000a(Object obj, Object obj2) {
            ((TransportControls) obj).setRating((Rating) obj2);
        }

        /* renamed from: b */
        public static void m1003b(Object obj, long j) {
            ((TransportControls) obj).skipToQueueItem(j);
        }

        /* renamed from: a */
        public static void m1001a(Object obj, String str, Bundle bundle) {
            ((TransportControls) obj).playFromMediaId(str, bundle);
        }
    }

    private C0137c() {
    }

    /* renamed from: a */
    public static Object m963a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: b */
    public static long m971b(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    /* renamed from: c */
    public static Object m973c(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    /* renamed from: d */
    public static String m974d(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    /* renamed from: e */
    public static Object m975e(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    /* renamed from: f */
    public static Object m976f(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    /* renamed from: g */
    public static List<Object> m977g(Object obj) {
        List queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    /* renamed from: h */
    public static CharSequence m978h(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    /* renamed from: i */
    public static int m979i(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    /* renamed from: j */
    public static PendingIntent m980j(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    /* renamed from: k */
    public static Object m981k(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    /* renamed from: l */
    public static Object m982l(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    /* renamed from: a */
    public static Object m964a(C0138a aVar) {
        return new C0139b(aVar);
    }

    /* renamed from: b */
    public static void m972b(Object obj, int i, int i2) {
        ((MediaController) obj).setVolumeTo(i, i2);
    }

    /* renamed from: a */
    public static void m968a(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((Callback) obj2, handler);
    }

    /* renamed from: a */
    public static void m967a(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((Callback) obj2);
    }

    /* renamed from: a */
    public static void m965a(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    /* renamed from: a */
    public static Object m962a(Activity activity) {
        return activity.getMediaController();
    }

    /* renamed from: a */
    public static Bundle m961a(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    /* renamed from: a */
    public static boolean m970a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m966a(Object obj, int i, int i2) {
        ((MediaController) obj).adjustVolume(i, i2);
    }

    /* renamed from: a */
    public static void m969a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
