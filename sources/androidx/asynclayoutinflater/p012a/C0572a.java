package androidx.asynclayoutinflater.p012a;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0222u0;
import androidx.core.p033k.C0940h.C0943c;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: androidx.asynclayoutinflater.a.a */
/* compiled from: AsyncLayoutInflater */
public final class C0572a {

    /* renamed from: e */
    private static final String f2295e = "AsyncLayoutInflater";

    /* renamed from: a */
    LayoutInflater f2296a;

    /* renamed from: b */
    Handler f2297b;

    /* renamed from: c */
    C0576d f2298c;

    /* renamed from: d */
    private Callback f2299d = new C0573a();

    /* renamed from: androidx.asynclayoutinflater.a.a$a */
    /* compiled from: AsyncLayoutInflater */
    class C0573a implements Callback {
        C0573a() {
        }

        public boolean handleMessage(Message message) {
            C0575c cVar = (C0575c) message.obj;
            if (cVar.f2305d == null) {
                cVar.f2305d = C0572a.this.f2296a.inflate(cVar.f2304c, cVar.f2303b, false);
            }
            cVar.f2306e.mo3016a(cVar.f2305d, cVar.f2304c, cVar.f2303b);
            C0572a.this.f2298c.mo3014b(cVar);
            return true;
        }
    }

    /* renamed from: androidx.asynclayoutinflater.a.a$b */
    /* compiled from: AsyncLayoutInflater */
    private static class C0574b extends LayoutInflater {

        /* renamed from: a */
        private static final String[] f2301a = {"android.widget.", "android.webkit.", "android.app."};

        C0574b(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new C0574b(context);
        }

        /* access modifiers changed from: protected */
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = f2301a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: androidx.asynclayoutinflater.a.a$c */
    /* compiled from: AsyncLayoutInflater */
    private static class C0575c {

        /* renamed from: a */
        C0572a f2302a;

        /* renamed from: b */
        ViewGroup f2303b;

        /* renamed from: c */
        int f2304c;

        /* renamed from: d */
        View f2305d;

        /* renamed from: e */
        C0577e f2306e;

        C0575c() {
        }
    }

    /* renamed from: androidx.asynclayoutinflater.a.a$d */
    /* compiled from: AsyncLayoutInflater */
    private static class C0576d extends Thread {

        /* renamed from: N */
        private static final C0576d f2307N = new C0576d();

        /* renamed from: a */
        private ArrayBlockingQueue<C0575c> f2308a = new ArrayBlockingQueue<>(10);

        /* renamed from: b */
        private C0943c<C0575c> f2309b = new C0943c<>(10);

        static {
            f2307N.start();
        }

        private C0576d() {
        }

        /* renamed from: c */
        public static C0576d m3144c() {
            return f2307N;
        }

        /* renamed from: a */
        public C0575c mo3011a() {
            C0575c cVar = (C0575c) this.f2309b.mo4743a();
            return cVar == null ? new C0575c() : cVar;
        }

        /* renamed from: b */
        public void mo3013b() {
            try {
                C0575c cVar = (C0575c) this.f2308a.take();
                try {
                    cVar.f2305d = cVar.f2302a.f2296a.inflate(cVar.f2304c, cVar.f2303b, false);
                } catch (RuntimeException unused) {
                }
                Message.obtain(cVar.f2302a.f2297b, 0, cVar).sendToTarget();
            } catch (InterruptedException unused2) {
            }
        }

        public void run() {
            while (true) {
                mo3013b();
            }
        }

        /* renamed from: a */
        public void mo3012a(C0575c cVar) {
            try {
                this.f2308a.put(cVar);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        /* renamed from: b */
        public void mo3014b(C0575c cVar) {
            cVar.f2306e = null;
            cVar.f2302a = null;
            cVar.f2303b = null;
            cVar.f2304c = 0;
            cVar.f2305d = null;
            this.f2309b.release(cVar);
        }
    }

    /* renamed from: androidx.asynclayoutinflater.a.a$e */
    /* compiled from: AsyncLayoutInflater */
    public interface C0577e {
        /* renamed from: a */
        void mo3016a(@C0193h0 View view, @C0183c0 int i, @C0195i0 ViewGroup viewGroup);
    }

    public C0572a(@C0193h0 Context context) {
        this.f2296a = new C0574b(context);
        this.f2297b = new Handler(this.f2299d);
        this.f2298c = C0576d.m3144c();
    }

    @C0222u0
    /* renamed from: a */
    public void mo3007a(@C0183c0 int i, @C0195i0 ViewGroup viewGroup, @C0193h0 C0577e eVar) {
        if (eVar != null) {
            C0575c a = this.f2298c.mo3011a();
            a.f2302a = this;
            a.f2304c = i;
            a.f2303b = viewGroup;
            a.f2306e = eVar;
            this.f2298c.mo3012a(a);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
