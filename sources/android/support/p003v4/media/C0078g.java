package android.support.p003v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@RequiresApi(21)
/* renamed from: android.support.v4.media.g */
/* compiled from: ParceledListSliceAdapterApi21 */
class C0078g {

    /* renamed from: a */
    private static Constructor f230a;

    static {
        try {
            f230a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(new Class[]{List.class});
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private C0078g() {
    }

    /* renamed from: a */
    static Object m281a(List<MediaItem> list) {
        try {
            return f230a.newInstance(new Object[]{list});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }
    }
}
