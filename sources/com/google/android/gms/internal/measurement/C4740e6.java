package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import androidx.annotation.C0195i0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.measurement.e6 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C4740e6 {
    @C0195i0

    /* renamed from: b */
    private static final Method f14056b = m20045a();
    @C0195i0

    /* renamed from: c */
    private static final Method f14057c = m20046b();

    /* renamed from: a */
    private final JobScheduler f14058a;

    private C4740e6(JobScheduler jobScheduler) {
        this.f14058a = jobScheduler;
    }

    @C0195i0
    /* renamed from: a */
    private static Method m20045a() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, String.class, Integer.TYPE, String.class});
            } catch (NoSuchMethodException unused) {
                boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: b */
    private static Method m20046b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m20047c() {
        Method method = f14057c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                boolean isLoggable = Log.isLoggable("JobSchedulerCompat", 6);
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final int m20043a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f14056b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f14058a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return this.f14058a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m20044a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (f14056b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) {
            return jobScheduler.schedule(jobInfo);
        }
        return new C4740e6(jobScheduler).m20043a(jobInfo, str, m20047c(), str2);
    }
}
