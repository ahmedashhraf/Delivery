package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;

/* renamed from: io.fabric.sdk.android.p.c.b */
/* compiled from: EnabledEventsStrategy */
public abstract class C14280b<T> implements C14293i<T> {

    /* renamed from: f */
    static final int f42125f = -1;

    /* renamed from: a */
    protected final Context f42126a;

    /* renamed from: b */
    protected final C14282d<T> f42127b;

    /* renamed from: c */
    final ScheduledExecutorService f42128c;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f42129d;

    /* renamed from: e */
    volatile int f42130e = -1;

    public C14280b(Context context, ScheduledExecutorService scheduledExecutorService, C14282d<T> dVar) {
        this.f42126a = context;
        this.f42128c = scheduledExecutorService;
        this.f42127b = dVar;
        this.f42129d = new AtomicReference<>();
    }

    /* renamed from: a */
    public void mo45201a(T t) {
        C14248i.m61829c(this.f42126a, t.toString());
        try {
            this.f42127b.writeEvent(t);
        } catch (IOException e) {
            C14248i.m61813a(this.f42126a, "Failed to write event.", (Throwable) e);
        }
        scheduleTimeBasedRollOverIfNeeded();
    }

    /* renamed from: b */
    public int mo45206b() {
        return this.f42130e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo45207c() {
        C14295k a = mo45200a();
        if (a == null) {
            C14248i.m61829c(this.f42126a, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C14248i.m61829c(this.f42126a, "Sending all files");
        List batchOfFilesToSend = this.f42127b.getBatchOfFilesToSend();
        int i = 0;
        while (true) {
            try {
                if (batchOfFilesToSend.size() <= 0) {
                    break;
                }
                C14248i.m61829c(this.f42126a, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
                boolean send = a.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.f42127b.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.f42127b.getBatchOfFilesToSend();
            } catch (Exception e) {
                Context context = this.f42126a;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C14248i.m61813a(context, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.f42127b.deleteOldestInRollOverIfOverMax();
        }
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.f42129d.get() != null) {
            C14248i.m61829c(this.f42126a, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.f42129d.get()).cancel(false);
            this.f42129d.set(null);
        }
    }

    public void deleteAllEvents() {
        this.f42127b.deleteAllEventsFiles();
    }

    public boolean rollFileOver() {
        try {
            return this.f42127b.rollFileOver();
        } catch (IOException e) {
            C14248i.m61813a(this.f42126a, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.f42130e != -1) {
            mo45205a((long) this.f42130e, (long) this.f42130e);
        }
    }

    public void sendEvents() {
        mo45207c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45204a(int i) {
        this.f42130e = i;
        mo45205a(0, (long) this.f42130e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo45205a(long j, long j2) {
        if (this.f42129d.get() == null) {
            C14298n nVar = new C14298n(this.f42126a, this);
            Context context = this.f42126a;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C14248i.m61829c(context, sb.toString());
            try {
                this.f42129d.set(this.f42128c.scheduleAtFixedRate(nVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C14248i.m61813a(this.f42126a, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }
}
