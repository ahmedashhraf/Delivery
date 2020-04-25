package androidx.loader.p047b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.p033k.C0935c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.loader.b.c */
/* compiled from: Loader */
public class C1502c<D> {

    /* renamed from: a */
    int f5777a;

    /* renamed from: b */
    C1505c<D> f5778b;

    /* renamed from: c */
    C1504b<D> f5779c;

    /* renamed from: d */
    Context f5780d;

    /* renamed from: e */
    boolean f5781e = false;

    /* renamed from: f */
    boolean f5782f = false;

    /* renamed from: g */
    boolean f5783g = true;

    /* renamed from: h */
    boolean f5784h = false;

    /* renamed from: i */
    boolean f5785i = false;

    /* renamed from: androidx.loader.b.c$a */
    /* compiled from: Loader */
    public final class C1503a extends ContentObserver {
        public C1503a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C1502c.this.mo6626m();
        }
    }

    /* renamed from: androidx.loader.b.c$b */
    /* compiled from: Loader */
    public interface C1504b<D> {
        /* renamed from: a */
        void mo6635a(@C0193h0 C1502c<D> cVar);
    }

    /* renamed from: androidx.loader.b.c$c */
    /* compiled from: Loader */
    public interface C1505c<D> {
        /* renamed from: a */
        void mo6556a(@C0193h0 C1502c<D> cVar, @C0195i0 D d);
    }

    public C1502c(@C0193h0 Context context) {
        this.f5780d = context.getApplicationContext();
    }

    @C0187e0
    /* renamed from: a */
    public void mo6612a(int i, @C0193h0 C1505c<D> cVar) {
        if (this.f5778b == null) {
            this.f5778b = cVar;
            this.f5777a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @C0187e0
    /* renamed from: b */
    public void mo6604b(@C0195i0 D d) {
        C1505c<D> cVar = this.f5778b;
        if (cVar != null) {
            cVar.mo6556a(this, d);
        }
    }

    /* renamed from: c */
    public void mo6617c() {
        this.f5785i = false;
    }

    @C0187e0
    /* renamed from: d */
    public void mo6618d() {
        C1504b<D> bVar = this.f5779c;
        if (bVar != null) {
            bVar.mo6635a(this);
        }
    }

    @C0187e0
    /* renamed from: e */
    public void mo6619e() {
        mo6583n();
    }

    @C0193h0
    /* renamed from: f */
    public Context mo6620f() {
        return this.f5780d;
    }

    /* renamed from: g */
    public int mo6621g() {
        return this.f5777a;
    }

    /* renamed from: h */
    public boolean mo6622h() {
        return this.f5782f;
    }

    /* renamed from: i */
    public boolean mo6623i() {
        return this.f5783g;
    }

    /* renamed from: j */
    public boolean mo6624j() {
        return this.f5781e;
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: k */
    public void mo6625k() {
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: l */
    public boolean mo6582l() {
        return false;
    }

    @C0187e0
    /* renamed from: m */
    public void mo6626m() {
        if (this.f5781e) {
            mo6619e();
        } else {
            this.f5784h = true;
        }
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: n */
    public void mo6583n() {
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: o */
    public void mo6607o() {
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: p */
    public void mo6608p() {
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: q */
    public void mo6609q() {
    }

    @C0187e0
    /* renamed from: r */
    public void mo6627r() {
        mo6607o();
        this.f5783g = true;
        this.f5781e = false;
        this.f5782f = false;
        this.f5784h = false;
        this.f5785i = false;
    }

    /* renamed from: s */
    public void mo6628s() {
        if (this.f5785i) {
            mo6626m();
        }
    }

    @C0187e0
    /* renamed from: t */
    public final void mo6629t() {
        this.f5781e = true;
        this.f5783g = false;
        this.f5782f = false;
        mo6608p();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0935c.m5324a(this, sb);
        sb.append(" id=");
        sb.append(this.f5777a);
        sb.append("}");
        return sb.toString();
    }

    @C0187e0
    /* renamed from: u */
    public void mo6631u() {
        this.f5781e = false;
        mo6609q();
    }

    /* renamed from: v */
    public boolean mo6632v() {
        boolean z = this.f5784h;
        this.f5784h = false;
        this.f5785i |= z;
        return z;
    }

    @C0187e0
    /* renamed from: b */
    public void mo6615b(@C0193h0 C1504b<D> bVar) {
        C1504b<D> bVar2 = this.f5779c;
        if (bVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (bVar2 == bVar) {
            this.f5779c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @C0187e0
    /* renamed from: a */
    public void mo6614a(@C0193h0 C1505c<D> cVar) {
        C1505c<D> cVar2 = this.f5778b;
        if (cVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (cVar2 == cVar) {
            this.f5778b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    @C0187e0
    /* renamed from: b */
    public boolean mo6616b() {
        return mo6582l();
    }

    @C0187e0
    /* renamed from: a */
    public void mo6613a(@C0193h0 C1504b<D> bVar) {
        if (this.f5779c == null) {
            this.f5779c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    @C0187e0
    /* renamed from: a */
    public void mo6611a() {
        this.f5782f = true;
        mo6625k();
    }

    @C0193h0
    /* renamed from: a */
    public String mo6610a(@C0195i0 D d) {
        StringBuilder sb = new StringBuilder(64);
        C0935c.m5324a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public void mo6579a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f5777a);
        printWriter.print(" mListener=");
        printWriter.println(this.f5778b);
        if (this.f5781e || this.f5784h || this.f5785i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f5781e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f5784h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f5785i);
        }
        if (this.f5782f || this.f5783g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f5782f);
            printWriter.print(" mReset=");
            printWriter.println(this.f5783g);
        }
    }
}
