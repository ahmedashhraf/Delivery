package omrecorder;

import android.os.Handler;
import android.os.Looper;

/* renamed from: omrecorder.m */
/* compiled from: UiThread */
final class C15061m implements C15060l {

    /* renamed from: a */
    private static final Handler f43797a = new Handler(Looper.getMainLooper());

    C15061m() {
    }

    public void execute(Runnable runnable) {
        f43797a.post(runnable);
    }
}
