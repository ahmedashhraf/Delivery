package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.core.app.m */
/* compiled from: JobIntentService */
public abstract class C0758m extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, C0767h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0762d> mCompatQueue;
    C0767h mCompatWorkEnqueuer;
    C0759a mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    C0760b mJobImpl;
    boolean mStopped = false;

    /* renamed from: androidx.core.app.m$a */
    /* compiled from: JobIntentService */
    final class C0759a extends AsyncTask<Void, Void, Void> {
        C0759a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0763e dequeueWork = C0758m.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                C0758m.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.mo4151e();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            C0758m.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            C0758m.this.processorFinished();
        }
    }

    /* renamed from: androidx.core.app.m$b */
    /* compiled from: JobIntentService */
    interface C0760b {
        /* renamed from: a */
        IBinder mo4145a();

        /* renamed from: b */
        C0763e mo4146b();
    }

    /* renamed from: androidx.core.app.m$c */
    /* compiled from: JobIntentService */
    static final class C0761c extends C0767h {

        /* renamed from: d */
        private final Context f3463d;

        /* renamed from: e */
        private final WakeLock f3464e;

        /* renamed from: f */
        private final WakeLock f3465f;

        /* renamed from: g */
        boolean f3466g;

        /* renamed from: h */
        boolean f3467h;

        C0761c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3463d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.f3464e = powerManager.newWakeLock(1, sb.toString());
            this.f3464e.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f3465f = powerManager.newWakeLock(1, sb2.toString());
            this.f3465f.setReferenceCounted(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4148a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3480a);
            if (this.f3463d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3466g) {
                        this.f3466g = true;
                        if (!this.f3467h) {
                            this.f3464e.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo4149b() {
            synchronized (this) {
                if (!this.f3467h) {
                    this.f3467h = true;
                    this.f3465f.acquire(600000);
                    this.f3464e.release();
                }
            }
        }

        /* renamed from: c */
        public void mo4150c() {
            synchronized (this) {
                this.f3466g = false;
            }
        }

        /* renamed from: a */
        public void mo4147a() {
            synchronized (this) {
                if (this.f3467h) {
                    if (this.f3466g) {
                        this.f3464e.acquire(60000);
                    }
                    this.f3467h = false;
                    this.f3465f.release();
                }
            }
        }
    }

    /* renamed from: androidx.core.app.m$d */
    /* compiled from: JobIntentService */
    final class C0762d implements C0763e {

        /* renamed from: a */
        final Intent f3468a;

        /* renamed from: b */
        final int f3469b;

        C0762d(Intent intent, int i) {
            this.f3468a = intent;
            this.f3469b = i;
        }

        /* renamed from: e */
        public void mo4151e() {
            C0758m.this.stopSelf(this.f3469b);
        }

        public Intent getIntent() {
            return this.f3468a;
        }
    }

    /* renamed from: androidx.core.app.m$e */
    /* compiled from: JobIntentService */
    interface C0763e {
        /* renamed from: e */
        void mo4151e();

        Intent getIntent();
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.app.m$f */
    /* compiled from: JobIntentService */
    static final class C0764f extends JobServiceEngine implements C0760b {

        /* renamed from: d */
        static final String f3471d = "JobServiceEngineImpl";

        /* renamed from: e */
        static final boolean f3472e = false;

        /* renamed from: a */
        final C0758m f3473a;

        /* renamed from: b */
        final Object f3474b = new Object();

        /* renamed from: c */
        JobParameters f3475c;

        /* renamed from: androidx.core.app.m$f$a */
        /* compiled from: JobIntentService */
        final class C0765a implements C0763e {

            /* renamed from: a */
            final JobWorkItem f3476a;

            C0765a(JobWorkItem jobWorkItem) {
                this.f3476a = jobWorkItem;
            }

            /* renamed from: e */
            public void mo4151e() {
                synchronized (C0764f.this.f3474b) {
                    if (C0764f.this.f3475c != null) {
                        C0764f.this.f3475c.completeWork(this.f3476a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f3476a.getIntent();
            }
        }

        C0764f(C0758m mVar) {
            super(mVar);
            this.f3473a = mVar;
        }

        /* renamed from: a */
        public IBinder mo4145a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3473a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.C0758m.C0764f.C0765a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.C0758m.C0763e mo4146b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3474b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3475c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f3475c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.m r2 = r3.f3473a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.m$f$a r0 = new androidx.core.app.m$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0758m.C0764f.mo4146b():androidx.core.app.m$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3475c = jobParameters;
            this.f3473a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f3473a.doStopCurrentWork();
            synchronized (this.f3474b) {
                this.f3475c = null;
            }
            return doStopCurrentWork;
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.app.m$g */
    /* compiled from: JobIntentService */
    static final class C0766g extends C0767h {

        /* renamed from: d */
        private final JobInfo f3478d;

        /* renamed from: e */
        private final JobScheduler f3479e;

        C0766g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo4155a(i);
            this.f3478d = new Builder(i, this.f3480a).setOverrideDeadline(0).build();
            this.f3479e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4148a(Intent intent) {
            this.f3479e.enqueue(this.f3478d, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.m$h */
    /* compiled from: JobIntentService */
    static abstract class C0767h {

        /* renamed from: a */
        final ComponentName f3480a;

        /* renamed from: b */
        boolean f3481b;

        /* renamed from: c */
        int f3482c;

        C0767h(ComponentName componentName) {
            this.f3480a = componentName;
        }

        /* renamed from: a */
        public void mo4147a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4155a(int i) {
            if (!this.f3481b) {
                this.f3481b = true;
                this.f3482c = i;
            } else if (this.f3482c != i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.f3482c);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo4148a(Intent intent);

        /* renamed from: b */
        public void mo4149b() {
        }

        /* renamed from: c */
        public void mo4150c() {
        }
    }

    public C0758m() {
        if (VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(@C0193h0 Context context, @C0193h0 Class cls, int i, @C0193h0 Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    static C0767h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        C0767h hVar;
        C0767h hVar2 = (C0767h) sClassWorkEnqueuer.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new C0761c(context, componentName);
        } else if (z) {
            hVar = new C0766g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0767h hVar3 = hVar;
        sClassWorkEnqueuer.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: 0000 */
    public C0763e dequeueWork() {
        C0760b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo4146b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            C0763e eVar = (C0763e) this.mCompatQueue.remove(0);
            return eVar;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean doStopCurrentWork() {
        C0759a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    /* access modifiers changed from: 0000 */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C0759a();
            C0767h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z) {
                hVar.mo4149b();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(@C0193h0 Intent intent) {
        C0760b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo4145a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0764f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0762d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo4147a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(@C0193h0 Intent intent);

    public int onStartCommand(@C0195i0 Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo4150c();
        synchronized (this.mCompatQueue) {
            ArrayList<C0762d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0762d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void processorFinished() {
        ArrayList<C0762d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                if (this.mCompatQueue != null && this.mCompatQueue.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo4147a();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(@C0193h0 Context context, @C0193h0 ComponentName componentName, int i, @C0193h0 Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C0767h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo4155a(i);
                workEnqueuer.mo4148a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
