package androidx.activity;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.C0187e0;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.C1457g;
import java.lang.reflect.Field;

@RequiresApi(19)
final class ImmLeaksCleaner implements C1457g {

    /* renamed from: b */
    private static final int f612b = 0;

    /* renamed from: c */
    private static final int f613c = 1;

    /* renamed from: d */
    private static final int f614d = 2;

    /* renamed from: e */
    private static int f615e;

    /* renamed from: f */
    private static Field f616f;

    /* renamed from: g */
    private static Field f617g;

    /* renamed from: h */
    private static Field f618h;

    /* renamed from: a */
    private Activity f619a;

    ImmLeaksCleaner(Activity activity) {
        this.f619a = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        r3.isActive();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo632a(@androidx.annotation.C0193h0 androidx.lifecycle.C1459i r3, @androidx.annotation.C0193h0 androidx.lifecycle.Lifecycle.C1441a r4) {
        /*
            r2 = this;
            androidx.lifecycle.Lifecycle$a r3 = androidx.lifecycle.Lifecycle.C1441a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f615e
            if (r3 != 0) goto L_0x000c
            m1089a()
        L_0x000c:
            int r3 = f615e
            r4 = 1
            if (r3 != r4) goto L_0x004e
            android.app.Activity r3 = r2.f619a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f616f     // Catch:{ IllegalAccessException -> 0x004e }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x004e }
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f617g     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x004a, ClassCastException -> 0x0048 }
            if (r0 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0031:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0039
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0039:
            java.lang.reflect.Field r0 = f618h     // Catch:{ IllegalAccessException -> 0x0044 }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x0044 }
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            r3.isActive()
            goto L_0x004e
        L_0x0044:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r3 = move-exception
            goto L_0x004c
        L_0x0048:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004a:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            return
        L_0x004c:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.mo632a(androidx.lifecycle.i, androidx.lifecycle.Lifecycle$a):void");
    }

    @C0187e0
    /* renamed from: a */
    private static void m1089a() {
        try {
            f615e = 2;
            f617g = InputMethodManager.class.getDeclaredField("mServedView");
            f617g.setAccessible(true);
            f618h = InputMethodManager.class.getDeclaredField("mNextServedView");
            f618h.setAccessible(true);
            f616f = InputMethodManager.class.getDeclaredField("mH");
            f616f.setAccessible(true);
            f615e = 1;
        } catch (NoSuchFieldException unused) {
        }
    }
}
