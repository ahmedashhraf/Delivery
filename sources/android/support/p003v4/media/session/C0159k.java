package android.support.p003v4.media.session;

import android.media.session.PlaybackState;
import android.media.session.PlaybackState.Builder;
import android.media.session.PlaybackState.CustomAction;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

@RequiresApi(22)
/* renamed from: android.support.v4.media.session.k */
/* compiled from: PlaybackStateCompatApi22 */
class C0159k {
    private C0159k() {
    }

    /* renamed from: a */
    public static Bundle m1078a(Object obj) {
        return ((PlaybackState) obj).getExtras();
    }

    /* renamed from: a */
    public static Object m1079a(int i, long j, long j2, float f, long j3, CharSequence charSequence, long j4, List<Object> list, long j5, Bundle bundle) {
        Builder builder = new Builder();
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
        builder.setExtras(bundle);
        return builder.build();
    }
}
