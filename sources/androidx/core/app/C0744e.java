package androidx.core.app;

import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;

/* renamed from: androidx.core.app.e */
/* compiled from: AlarmManagerCompat */
public final class C0744e {
    private C0744e() {
    }

    /* renamed from: a */
    public static void m4300a(@C0193h0 AlarmManager alarmManager, long j, @C0193h0 PendingIntent pendingIntent, @C0193h0 PendingIntent pendingIntent2) {
        if (VERSION.SDK_INT >= 21) {
            alarmManager.setAlarmClock(new AlarmClockInfo(j, pendingIntent), pendingIntent2);
        } else {
            m4301b(alarmManager, 0, j, pendingIntent2);
        }
    }

    /* renamed from: b */
    public static void m4301b(@C0193h0 AlarmManager alarmManager, int i, long j, @C0193h0 PendingIntent pendingIntent) {
        if (VERSION.SDK_INT >= 19) {
            alarmManager.setExact(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    /* renamed from: c */
    public static void m4302c(@C0193h0 AlarmManager alarmManager, int i, long j, @C0193h0 PendingIntent pendingIntent) {
        if (VERSION.SDK_INT >= 23) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            m4301b(alarmManager, i, j, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m4299a(@C0193h0 AlarmManager alarmManager, int i, long j, @C0193h0 PendingIntent pendingIntent) {
        if (VERSION.SDK_INT >= 23) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }
}
