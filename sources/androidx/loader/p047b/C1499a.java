package androidx.loader.p047b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p033k.C0946k;
import androidx.core.p038os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: androidx.loader.b.a */
/* compiled from: AsyncTaskLoader */
public abstract class C1499a<D> extends C1502c<D> {

    /* renamed from: p */
    static final String f5758p = "AsyncTaskLoader";

    /* renamed from: q */
    static final boolean f5759q = false;

    /* renamed from: j */
    private final Executor f5760j;

    /* renamed from: k */
    volatile C1500a f5761k;

    /* renamed from: l */
    volatile C1500a f5762l;

    /* renamed from: m */
    long f5763m;

    /* renamed from: n */
    long f5764n;

    /* renamed from: o */
    Handler f5765o;

    /* renamed from: androidx.loader.b.a$a */
    /* compiled from: AsyncTaskLoader */
    final class C1500a extends C1506d<Void, Void, D> implements Runnable {

        /* renamed from: b0 */
        private final CountDownLatch f5766b0 = new CountDownLatch(1);

        /* renamed from: c0 */
        boolean f5767c0;

        C1500a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6590b(D d) {
            try {
                C1499a.this.mo6578a(this, d);
            } finally {
                this.f5766b0.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo6591c(D d) {
            try {
                C1499a.this.mo6580b(this, d);
            } finally {
                this.f5766b0.countDown();
            }
        }

        /* renamed from: f */
        public void mo6592f() {
            try {
                this.f5766b0.await();
            } catch (InterruptedException unused) {
            }
        }

        public void run() {
            this.f5767c0 = false;
            C1499a.this.mo6585x();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo6588a(Void... voidArr) {
            try {
                return C1499a.this.mo6575A();
            } catch (OperationCanceledException e) {
                if (mo6644c()) {
                    return null;
                }
                throw e;
            }
        }
    }

    public C1499a(@C0193h0 Context context) {
        this(context, C1506d.f5793W);
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: A */
    public D mo6575A() {
        return mo6587z();
    }

    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: B */
    public void mo6576B() {
        C1500a aVar = this.f5761k;
        if (aVar != null) {
            aVar.mo6592f();
        }
    }

    /* renamed from: a */
    public void mo6577a(long j) {
        this.f5763m = j;
        if (j != 0) {
            this.f5765o = new Handler();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6580b(C1500a aVar, D d) {
        if (this.f5761k != aVar) {
            mo6578a(aVar, d);
        } else if (mo6622h()) {
            mo6581c(d);
        } else {
            mo6617c();
            this.f5764n = SystemClock.uptimeMillis();
            this.f5761k = null;
            mo6604b(d);
        }
    }

    /* renamed from: c */
    public void mo6581c(@C0195i0 D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo6582l() {
        if (this.f5761k == null) {
            return false;
        }
        if (!this.f5781e) {
            this.f5784h = true;
        }
        if (this.f5762l != null) {
            if (this.f5761k.f5767c0) {
                this.f5761k.f5767c0 = false;
                this.f5765o.removeCallbacks(this.f5761k);
            }
            this.f5761k = null;
            return false;
        } else if (this.f5761k.f5767c0) {
            this.f5761k.f5767c0 = false;
            this.f5765o.removeCallbacks(this.f5761k);
            this.f5761k = null;
            return false;
        } else {
            boolean a = this.f5761k.mo6640a(false);
            if (a) {
                this.f5762l = this.f5761k;
                mo6584w();
            }
            this.f5761k = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo6583n() {
        super.mo6583n();
        mo6616b();
        this.f5761k = new C1500a<>();
        mo6585x();
    }

    /* renamed from: w */
    public void mo6584w() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public void mo6585x() {
        if (this.f5762l == null && this.f5761k != null) {
            if (this.f5761k.f5767c0) {
                this.f5761k.f5767c0 = false;
                this.f5765o.removeCallbacks(this.f5761k);
            }
            if (this.f5763m <= 0 || SystemClock.uptimeMillis() >= this.f5764n + this.f5763m) {
                this.f5761k.mo6636a(this.f5760j, (Params[]) null);
            } else {
                this.f5761k.f5767c0 = true;
                this.f5765o.postAtTime(this.f5761k, this.f5764n + this.f5763m);
            }
        }
    }

    /* renamed from: y */
    public boolean mo6586y() {
        return this.f5762l != null;
    }

    @C0195i0
    /* renamed from: z */
    public abstract D mo6587z();

    private C1499a(@C0193h0 Context context, @C0193h0 Executor executor) {
        super(context);
        this.f5764n = -10000;
        this.f5760j = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6578a(C1500a aVar, D d) {
        mo6581c(d);
        if (this.f5762l == aVar) {
            mo6628s();
            this.f5764n = SystemClock.uptimeMillis();
            this.f5762l = null;
            mo6618d();
            mo6585x();
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo6579a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo6579a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.f5761k != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f5761k);
            printWriter.print(str2);
            printWriter.println(this.f5761k.f5767c0);
        }
        if (this.f5762l != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f5762l);
            printWriter.print(str2);
            printWriter.println(this.f5762l.f5767c0);
        }
        if (this.f5763m != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0946k.m5347a(this.f5763m, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0946k.m5346a(this.f5764n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
