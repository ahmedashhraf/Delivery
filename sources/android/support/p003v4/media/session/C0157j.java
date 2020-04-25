package android.support.p003v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.CustomAction;
import android.media.session.PlaybackState.CustomAction.Builder;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.session.j */
/* compiled from: PlaybackStateCompatApi21 */
class C0157j {

    /* renamed from: android.support.v4.media.session.j$a */
    /* compiled from: PlaybackStateCompatApi21 */
    static final class C0158a {
        private C0158a() {
        }

        /* renamed from: a */
        public static String m1074a(Object obj) {
            return ((CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m1075b(Object obj) {
            return ((CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m1076c(Object obj) {
            return ((CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m1077d(Object obj) {
            return ((CustomAction) obj).getName();
        }

        /* renamed from: a */
        public static Object m1073a(String str, CharSequence charSequence, int i, Bundle bundle) {
            Builder builder = new Builder(str, charSequence, i);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    private C0157j() {
    }

    /* renamed from: a */
    public static long m1063a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m1065b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m1066c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m1067d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m1068e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m1069f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m1070g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m1071h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m1072i(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    /* renamed from: a */
    public static Object m1064a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i, j, f, j4);
        long j6 = j2;
        builder.setBufferedPosition(j2);
        long j7 = j3;
        builder.setActions(j3);
        builder.setErrorMessage(charSequence);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j5);
        return builder.build();
    }
}
