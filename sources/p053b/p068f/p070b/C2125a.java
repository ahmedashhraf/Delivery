package p053b.p068f.p070b;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

@Deprecated
/* renamed from: b.f.b.a */
/* compiled from: WakefulBroadcastReceiver */
public abstract class C2125a extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f8471a = "androidx.contentpager.content.wakelockid";

    /* renamed from: b */
    private static final SparseArray<WakeLock> f8472b = new SparseArray<>();

    /* renamed from: c */
    private static int f8473c = 1;

    /* renamed from: a */
    public static boolean m11086a(Intent intent) {
        int intExtra = intent.getIntExtra(f8471a, 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f8472b) {
            WakeLock wakeLock = (WakeLock) f8472b.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f8472b.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            sb.toString();
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m11087b(Context context, Intent intent) {
        synchronized (f8472b) {
            int i = f8473c;
            f8473c++;
            if (f8473c <= 0) {
                f8473c = 1;
            }
            intent.putExtra(f8471a, i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f8472b.put(i, newWakeLock);
            return startService;
        }
    }
}
