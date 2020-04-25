package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.core.app.C0770p;
import com.google.android.gms.common.util.C4484g;
import com.google.android.gms.internal.measurement.C4740e6;

/* renamed from: com.google.android.gms.measurement.internal.u8 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
public final class C5418u8 extends C5429v8 {

    /* renamed from: d */
    private final AlarmManager f15514d = ((AlarmManager) mo21206e().getSystemService(C0770p.f3528i0));

    /* renamed from: e */
    private final C5222d f15515e;

    /* renamed from: f */
    private Integer f15516f;

    protected C5418u8(C5461y8 y8Var) {
        super(y8Var);
        this.f15515e = new C5407t8(this, y8Var.mo21865s(), y8Var);
    }

    @TargetApi(24)
    /* renamed from: w */
    private final void m23559w() {
        JobScheduler jobScheduler = (JobScheduler) mo21206e().getSystemService("jobscheduler");
        int x = m23560x();
        mo21205d().mo21528C().mo21550a("Cancelling job. JobID", Integer.valueOf(x));
        jobScheduler.cancel(x);
    }

    /* renamed from: x */
    private final int m23560x() {
        if (this.f15516f == null) {
            String str = "measurement";
            String valueOf = String.valueOf(mo21206e().getPackageName());
            this.f15516f = Integer.valueOf((valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).hashCode());
        }
        return this.f15516f.intValue();
    }

    /* renamed from: y */
    private final PendingIntent m23561y() {
        Context e = mo21206e();
        return PendingIntent.getBroadcast(e, 0, new Intent().setClassName(e, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ C5342n9 mo21189B() {
        return super.mo21189B();
    }

    /* renamed from: a */
    public final void mo21727a(long j) {
        mo21739s();
        mo21189B();
        Context e = mo21206e();
        if (!C5249f4.m22764a(e)) {
            mo21205d().mo21527A().mo21549a("Receiver not registered/enabled");
        }
        if (!C5254f9.m22829a(e, false)) {
            mo21205d().mo21527A().mo21549a("Service not registered/enabled");
        }
        mo21728v();
        long d = mo21208g().mo18572d() + j;
        if (j < Math.max(0, ((Long) C5310l.f15192E.mo21225a(null)).longValue()) && !this.f15515e.mo21223b()) {
            mo21205d().mo21528C().mo21549a("Scheduling upload with DelayedRunnable");
            this.f15515e.mo21222a(j);
        }
        mo21189B();
        if (VERSION.SDK_INT >= 24) {
            mo21205d().mo21528C().mo21549a("Scheduling upload with JobScheduler");
            Context e2 = mo21206e();
            ComponentName componentName = new ComponentName(e2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int x = m23560x();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            JobInfo build = new Builder(x, componentName).setMinimumLatency(j).setOverrideDeadline(j << 1).setExtras(persistableBundle).build();
            mo21205d().mo21528C().mo21550a("Scheduling job. JobID", Integer.valueOf(x));
            C4740e6.m20044a(e2, build, "com.google.android.gms", "UploadAlarm");
            return;
        }
        mo21205d().mo21528C().mo21549a("Scheduling upload with AlarmManager");
        this.f15514d.setInexactRepeating(2, d, Math.max(((Long) C5310l.f15277z.mo21225a(null)).longValue(), j), m23561y());
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo21201b() {
        super.mo21201b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C5326m4 mo21203c() {
        return super.mo21203c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C5303k3 mo21205d() {
        return super.mo21205d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Context mo21206e() {
        return super.mo21206e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo21207f() {
        super.mo21207f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C4484g mo21208g() {
        return super.mo21208g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo21209h() {
        super.mo21209h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C5244f mo21210i() {
        return super.mo21210i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C5281i3 mo21211j() {
        return super.mo21211j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C5254f9 mo21212k() {
        return super.mo21212k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C5446x3 mo21213l() {
        return super.mo21213l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C5386r9 mo21214m() {
        return super.mo21214m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C5320l9 mo21215n() {
        return super.mo21215n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C5221c9 mo21216o() {
        return super.mo21216o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C5397s9 mo21217p() {
        return super.mo21217p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C5293j4 mo21218q() {
        return super.mo21218q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final boolean mo21219u() {
        this.f15514d.cancel(m23561y());
        if (VERSION.SDK_INT >= 24) {
            m23559w();
        }
        return false;
    }

    /* renamed from: v */
    public final void mo21728v() {
        mo21739s();
        this.f15514d.cancel(m23561y());
        this.f15515e.mo21224c();
        if (VERSION.SDK_INT >= 24) {
            m23559w();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21196a() {
        super.mo21196a();
    }
}
