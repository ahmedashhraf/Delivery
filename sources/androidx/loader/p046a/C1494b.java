package androidx.loader.p046a;

import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0650i;
import androidx.core.p033k.C0935c;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1467n;
import androidx.lifecycle.C1468o;
import androidx.lifecycle.C1477t;
import androidx.lifecycle.C1478u;
import androidx.lifecycle.C1478u.C1480b;
import androidx.lifecycle.C1483v;
import androidx.loader.p046a.C1492a.C1493a;
import androidx.loader.p047b.C1502c;
import androidx.loader.p047b.C1502c.C1505c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: androidx.loader.a.b */
/* compiled from: LoaderManagerImpl */
class C1494b extends C1492a {

    /* renamed from: c */
    static final String f5742c = "LoaderManager";

    /* renamed from: d */
    static boolean f5743d = false;
    @C0193h0

    /* renamed from: a */
    private final C1459i f5744a;
    @C0193h0

    /* renamed from: b */
    private final C1497c f5745b;

    /* renamed from: androidx.loader.a.b$a */
    /* compiled from: LoaderManagerImpl */
    public static class C1495a<D> extends C1467n<D> implements C1505c<D> {

        /* renamed from: l */
        private final int f5746l;
        @C0195i0

        /* renamed from: m */
        private final Bundle f5747m;
        @C0193h0

        /* renamed from: n */
        private final C1502c<D> f5748n;

        /* renamed from: o */
        private C1459i f5749o;

        /* renamed from: p */
        private C1496b<D> f5750p;

        /* renamed from: q */
        private C1502c<D> f5751q;

        C1495a(int i, @C0195i0 Bundle bundle, @C0193h0 C1502c<D> cVar, @C0195i0 C1502c<D> cVar2) {
            this.f5746l = i;
            this.f5747m = bundle;
            this.f5748n = cVar;
            this.f5751q = cVar2;
            this.f5748n.mo6612a(i, this);
        }

        /* access modifiers changed from: 0000 */
        @C0193h0
        @C0187e0
        /* renamed from: a */
        public C1502c<D> mo6554a(@C0193h0 C1459i iVar, @C0193h0 C1493a<D> aVar) {
            C1496b<D> bVar = new C1496b<>(this.f5748n, aVar);
            mo6478a(iVar, bVar);
            C1496b<D> bVar2 = this.f5750p;
            if (bVar2 != null) {
                mo6482b((C1468o<? super D>) bVar2);
            }
            this.f5749o = iVar;
            this.f5750p = bVar;
            return this.f5748n;
        }

        /* renamed from: b */
        public void mo6482b(@C0193h0 C1468o<? super D> oVar) {
            super.mo6482b(oVar);
            this.f5749o = null;
            this.f5750p = null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo6486e() {
            if (C1494b.f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                sb.toString();
            }
            this.f5748n.mo6629t();
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo6487f() {
            if (C1494b.f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                sb.toString();
            }
            this.f5748n.mo6631u();
        }

        /* access modifiers changed from: 0000 */
        @C0193h0
        /* renamed from: g */
        public C1502c<D> mo6558g() {
            return this.f5748n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public boolean mo6559h() {
            boolean z = false;
            if (!mo6484c()) {
                return false;
            }
            C1496b<D> bVar = this.f5750p;
            if (bVar != null && !bVar.mo6563a()) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo6560i() {
            C1459i iVar = this.f5749o;
            C1496b<D> bVar = this.f5750p;
            if (iVar != null && bVar != null) {
                super.mo6482b((C1468o<? super T>) bVar);
                mo6478a(iVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f5746l);
            sb.append(" : ");
            C0935c.m5324a(this.f5748n, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* renamed from: b */
        public void mo6483b(D d) {
            super.mo6483b(d);
            C1502c<D> cVar = this.f5751q;
            if (cVar != null) {
                cVar.mo6627r();
                this.f5751q = null;
            }
        }

        /* access modifiers changed from: 0000 */
        @C0187e0
        /* renamed from: a */
        public C1502c<D> mo6555a(boolean z) {
            if (C1494b.f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                sb.toString();
            }
            this.f5748n.mo6616b();
            this.f5748n.mo6611a();
            C1496b<D> bVar = this.f5750p;
            if (bVar != null) {
                mo6482b((C1468o<? super D>) bVar);
                if (z) {
                    bVar.mo6564b();
                }
            }
            this.f5748n.mo6614a((C1505c<D>) this);
            if ((bVar == null || bVar.mo6563a()) && !z) {
                return this.f5748n;
            }
            this.f5748n.mo6627r();
            return this.f5751q;
        }

        /* renamed from: a */
        public void mo6556a(@C0193h0 C1502c<D> cVar, @C0195i0 D d) {
            if (C1494b.f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                sb.toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo6483b(d);
                return;
            }
            boolean z = C1494b.f5743d;
            mo6480a(d);
        }

        /* renamed from: a */
        public void mo6557a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f5746l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f5747m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f5748n);
            C1502c<D> cVar = this.f5748n;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "  ";
            sb.append(str2);
            cVar.mo6579a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f5750p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f5750p);
                C1496b<D> bVar = this.f5750p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                bVar.mo6562a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo6558g().mo6610a(mo6475a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo6484c());
        }
    }

    /* renamed from: androidx.loader.a.b$b */
    /* compiled from: LoaderManagerImpl */
    static class C1496b<D> implements C1468o<D> {
        @C0193h0

        /* renamed from: a */
        private final C1502c<D> f5752a;
        @C0193h0

        /* renamed from: b */
        private final C1493a<D> f5753b;

        /* renamed from: c */
        private boolean f5754c = false;

        C1496b(@C0193h0 C1502c<D> cVar, @C0193h0 C1493a<D> aVar) {
            this.f5752a = cVar;
            this.f5753b = aVar;
        }

        /* renamed from: a */
        public void mo5554a(@C0195i0 D d) {
            if (C1494b.f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f5752a);
                sb.append(": ");
                sb.append(this.f5752a.mo6610a(d));
                sb.toString();
            }
            this.f5753b.mo6552a(this.f5752a, d);
            this.f5754c = true;
        }

        /* access modifiers changed from: 0000 */
        @C0187e0
        /* renamed from: b */
        public void mo6564b() {
            if (this.f5754c) {
                if (C1494b.f5743d) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f5752a);
                    sb.toString();
                }
                this.f5753b.mo6551a(this.f5752a);
            }
        }

        public String toString() {
            return this.f5753b.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6563a() {
            return this.f5754c;
        }

        /* renamed from: a */
        public void mo6562a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f5754c);
        }
    }

    /* renamed from: androidx.loader.a.b$c */
    /* compiled from: LoaderManagerImpl */
    static class C1497c extends C1477t {

        /* renamed from: e */
        private static final C1480b f5755e = new C1498a();

        /* renamed from: c */
        private C0650i<C1495a> f5756c = new C0650i<>();

        /* renamed from: d */
        private boolean f5757d = false;

        /* renamed from: androidx.loader.a.b$c$a */
        /* compiled from: LoaderManagerImpl */
        static class C1498a implements C1480b {
            C1498a() {
            }

            @C0193h0
            /* renamed from: a */
            public <T extends C1477t> T mo6379a(@C0193h0 Class<T> cls) {
                return new C1497c();
            }
        }

        C1497c() {
        }

        @C0193h0
        /* renamed from: a */
        static C1497c m7790a(C1483v vVar) {
            return (C1497c) new C1478u(vVar, f5755e).mo6536a(C1497c.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo6569b(int i) {
            this.f5756c.mo3401f(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo6570c() {
            this.f5757d = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo6571d() {
            int d = this.f5756c.mo3395d();
            for (int i = 0; i < d; i++) {
                if (((C1495a) this.f5756c.mo3404h(i)).mo6559h()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo6572e() {
            return this.f5757d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo6573f() {
            int d = this.f5756c.mo3395d();
            for (int i = 0; i < d; i++) {
                ((C1495a) this.f5756c.mo3404h(i)).mo6560i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo6574g() {
            this.f5757d = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6567a(int i, @C0193h0 C1495a aVar) {
            this.f5756c.mo3392c(i, aVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo6367b() {
            super.mo6367b();
            int d = this.f5756c.mo3395d();
            for (int i = 0; i < d; i++) {
                ((C1495a) this.f5756c.mo3404h(i)).mo6555a(true);
            }
            this.f5756c.mo3389b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <D> C1495a<D> mo6566a(int i) {
            return (C1495a) this.f5756c.mo3391c(i);
        }

        /* renamed from: a */
        public void mo6568a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5756c.mo3395d() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f5756c.mo3395d(); i++) {
                    C1495a aVar = (C1495a) this.f5756c.mo3404h(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5756c.mo3398e(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo6557a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }
    }

    C1494b(@C0193h0 C1459i iVar, @C0193h0 C1483v vVar) {
        this.f5744a = iVar;
        this.f5745b = C1497c.m7790a(vVar);
    }

    /* JADX INFO: finally extract failed */
    @C0193h0
    @C0187e0
    /* renamed from: a */
    private <D> C1502c<D> m7767a(int i, @C0195i0 Bundle bundle, @C0193h0 C1493a<D> aVar, @C0195i0 C1502c<D> cVar) {
        try {
            this.f5745b.mo6574g();
            C1502c a = aVar.mo6550a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                C1495a aVar2 = new C1495a(i, bundle, a, cVar);
                if (f5743d) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                    sb2.toString();
                }
                this.f5745b.mo6567a(i, aVar2);
                this.f5745b.mo6570c();
                return aVar2.mo6554a(this.f5744a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f5745b.mo6570c();
            throw th;
        }
    }

    @C0193h0
    @C0187e0
    /* renamed from: b */
    public <D> C1502c<D> mo6548b(int i, @C0195i0 Bundle bundle, @C0193h0 C1493a<D> aVar) {
        if (this.f5745b.mo6572e()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("restartLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                sb.toString();
            }
            C1495a a = this.f5745b.mo6566a(i);
            C1502c cVar = null;
            if (a != null) {
                cVar = a.mo6555a(false);
            }
            return m7767a(i, bundle, aVar, cVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0935c.m5324a(this.f5744a, sb);
        sb.append("}}");
        return sb.toString();
    }

    @C0195i0
    /* renamed from: b */
    public <D> C1502c<D> mo6547b(int i) {
        if (!this.f5745b.mo6572e()) {
            C1495a a = this.f5745b.mo6566a(i);
            if (a != null) {
                return a.mo6558g();
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    @C0193h0
    @C0187e0
    /* renamed from: a */
    public <D> C1502c<D> mo6543a(int i, @C0195i0 Bundle bundle, @C0193h0 C1493a<D> aVar) {
        if (this.f5745b.mo6572e()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C1495a a = this.f5745b.mo6566a(i);
            if (f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                sb.toString();
            }
            if (a == null) {
                return m7767a(i, bundle, aVar, null);
            }
            if (f5743d) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a);
                sb2.toString();
            }
            return a.mo6554a(this.f5744a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: b */
    public void mo6549b() {
        this.f5745b.mo6573f();
    }

    @C0187e0
    /* renamed from: a */
    public void mo6544a(int i) {
        if (this.f5745b.mo6572e()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (f5743d) {
                StringBuilder sb = new StringBuilder();
                sb.append("destroyLoader in ");
                sb.append(this);
                sb.append(" of ");
                sb.append(i);
                sb.toString();
            }
            C1495a a = this.f5745b.mo6566a(i);
            if (a != null) {
                a.mo6555a(true);
                this.f5745b.mo6569b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo6545a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f5745b.mo6568a(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public boolean mo6546a() {
        return this.f5745b.mo6571d();
    }
}
