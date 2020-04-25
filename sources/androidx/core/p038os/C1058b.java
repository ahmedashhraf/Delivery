package androidx.core.p038os;

import android.os.Build.VERSION;
import android.os.CancellationSignal;
import androidx.annotation.C0195i0;

/* renamed from: androidx.core.os.b */
/* compiled from: CancellationSignal */
public final class C1058b {

    /* renamed from: a */
    private boolean f4724a;

    /* renamed from: b */
    private C1059a f4725b;

    /* renamed from: c */
    private Object f4726c;

    /* renamed from: d */
    private boolean f4727d;

    /* renamed from: androidx.core.os.b$a */
    /* compiled from: CancellationSignal */
    public interface C1059a {
        void onCancel();
    }

    /* renamed from: e */
    private void m6148e() {
        while (this.f4727d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r0.onCancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (android.os.Build.VERSION.SDK_INT < 16) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        ((android.os.CancellationSignal) r1).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f4727d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0033, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r4.f4727d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0039, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5199a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f4724a     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            return
        L_0x0007:
            r0 = 1
            r4.f4724a = r0     // Catch:{ all -> 0x003e }
            r4.f4727d = r0     // Catch:{ all -> 0x003e }
            androidx.core.os.b$a r0 = r4.f4725b     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r4.f4726c     // Catch:{ all -> 0x003e }
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            r2 = 0
            if (r0 == 0) goto L_0x001a
            r0.onCancel()     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r0 = move-exception
            goto L_0x0028
        L_0x001a:
            if (r1 == 0) goto L_0x0033
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 16
            if (r0 < r3) goto L_0x0033
            android.os.CancellationSignal r1 = (android.os.CancellationSignal) r1     // Catch:{ all -> 0x0018 }
            r1.cancel()     // Catch:{ all -> 0x0018 }
            goto L_0x0033
        L_0x0028:
            monitor-enter(r4)
            r4.f4727d = r2     // Catch:{ all -> 0x0030 }
            r4.notifyAll()     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0030 }
            throw r0
        L_0x0033:
            monitor-enter(r4)
            r4.f4727d = r2     // Catch:{ all -> 0x003b }
            r4.notifyAll()     // Catch:{ all -> 0x003b }
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p038os.C1058b.mo5199a():void");
    }

    @C0195i0
    /* renamed from: b */
    public Object mo5201b() {
        Object obj;
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f4726c == null) {
                this.f4726c = new CancellationSignal();
                if (this.f4724a) {
                    ((CancellationSignal) this.f4726c).cancel();
                }
            }
            obj = this.f4726c;
        }
        return obj;
    }

    /* renamed from: c */
    public boolean mo5202c() {
        boolean z;
        synchronized (this) {
            z = this.f4724a;
        }
        return z;
    }

    /* renamed from: d */
    public void mo5203d() {
        if (mo5202c()) {
            throw new OperationCanceledException();
        }
    }

    /* renamed from: a */
    public void mo5200a(@C0195i0 C1059a aVar) {
        synchronized (this) {
            m6148e();
            if (this.f4725b != aVar) {
                this.f4725b = aVar;
                if (this.f4724a) {
                    if (aVar != null) {
                        aVar.onCancel();
                    }
                }
            }
        }
    }
}
