package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.b */
/* compiled from: SnackbarManager */
class C7041b {

    /* renamed from: e */
    static final int f19834e = 0;

    /* renamed from: f */
    private static final int f19835f = 1500;

    /* renamed from: g */
    private static final int f19836g = 2750;

    /* renamed from: h */
    private static C7041b f19837h;
    @C0193h0

    /* renamed from: a */
    private final Object f19838a = new Object();
    @C0193h0

    /* renamed from: b */
    private final Handler f19839b = new Handler(Looper.getMainLooper(), new C7042a());
    @C0195i0

    /* renamed from: c */
    private C7044c f19840c;
    @C0195i0

    /* renamed from: d */
    private C7044c f19841d;

    /* renamed from: com.google.android.material.snackbar.b$a */
    /* compiled from: SnackbarManager */
    class C7042a implements Callback {
        C7042a() {
        }

        public boolean handleMessage(@C0193h0 Message message) {
            if (message.what != 0) {
                return false;
            }
            C7041b.this.mo28083a((C7044c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b */
    /* compiled from: SnackbarManager */
    interface C7043b {
        /* renamed from: a */
        void mo28031a(int i);

        /* renamed from: b */
        void mo28032b();
    }

    /* renamed from: com.google.android.material.snackbar.b$c */
    /* compiled from: SnackbarManager */
    private static class C7044c {
        @C0193h0

        /* renamed from: a */
        final WeakReference<C7043b> f19843a;

        /* renamed from: b */
        int f19844b;

        /* renamed from: c */
        boolean f19845c;

        C7044c(int i, C7043b bVar) {
            this.f19843a = new WeakReference<>(bVar);
            this.f19844b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo28091a(@C0195i0 C7043b bVar) {
            return bVar != null && this.f19843a.get() == bVar;
        }
    }

    private C7041b() {
    }

    /* renamed from: a */
    static C7041b m33857a() {
        if (f19837h == null) {
            f19837h = new C7041b();
        }
        return f19837h;
    }

    /* renamed from: g */
    private boolean m33861g(C7043b bVar) {
        C7044c cVar = this.f19840c;
        return cVar != null && cVar.mo28091a(bVar);
    }

    /* renamed from: h */
    private boolean m33862h(C7043b bVar) {
        C7044c cVar = this.f19841d;
        return cVar != null && cVar.mo28091a(bVar);
    }

    /* renamed from: b */
    public boolean mo28085b(C7043b bVar) {
        boolean z;
        synchronized (this.f19838a) {
            if (!m33861g(bVar)) {
                if (!m33862h(bVar)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: c */
    public void mo28086c(C7043b bVar) {
        synchronized (this.f19838a) {
            if (m33861g(bVar)) {
                this.f19840c = null;
                if (this.f19841d != null) {
                    m33859b();
                }
            }
        }
    }

    /* renamed from: d */
    public void mo28087d(C7043b bVar) {
        synchronized (this.f19838a) {
            if (m33861g(bVar)) {
                m33860b(this.f19840c);
            }
        }
    }

    /* renamed from: e */
    public void mo28088e(C7043b bVar) {
        synchronized (this.f19838a) {
            if (m33861g(bVar) && !this.f19840c.f19845c) {
                this.f19840c.f19845c = true;
                this.f19839b.removeCallbacksAndMessages(this.f19840c);
            }
        }
    }

    /* renamed from: f */
    public void mo28089f(C7043b bVar) {
        synchronized (this.f19838a) {
            if (m33861g(bVar) && this.f19840c.f19845c) {
                this.f19840c.f19845c = false;
                m33860b(this.f19840c);
            }
        }
    }

    /* renamed from: b */
    private void m33859b() {
        C7044c cVar = this.f19841d;
        if (cVar != null) {
            this.f19840c = cVar;
            this.f19841d = null;
            C7043b bVar = (C7043b) this.f19840c.f19843a.get();
            if (bVar != null) {
                bVar.mo28032b();
            } else {
                this.f19840c = null;
            }
        }
    }

    /* renamed from: a */
    public void mo28081a(int i, C7043b bVar) {
        synchronized (this.f19838a) {
            if (m33861g(bVar)) {
                this.f19840c.f19844b = i;
                this.f19839b.removeCallbacksAndMessages(this.f19840c);
                m33860b(this.f19840c);
                return;
            }
            if (m33862h(bVar)) {
                this.f19841d.f19844b = i;
            } else {
                this.f19841d = new C7044c(i, bVar);
            }
            if (this.f19840c == null || !m33858a(this.f19840c, 4)) {
                this.f19840c = null;
                m33859b();
            }
        }
    }

    /* renamed from: b */
    private void m33860b(@C0193h0 C7044c cVar) {
        int i = cVar.f19844b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : f19836g;
            }
            this.f19839b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f19839b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: a */
    public void mo28082a(C7043b bVar, int i) {
        synchronized (this.f19838a) {
            if (m33861g(bVar)) {
                m33858a(this.f19840c, i);
            } else if (m33862h(bVar)) {
                m33858a(this.f19841d, i);
            }
        }
    }

    /* renamed from: a */
    public boolean mo28084a(C7043b bVar) {
        boolean g;
        synchronized (this.f19838a) {
            g = m33861g(bVar);
        }
        return g;
    }

    /* renamed from: a */
    private boolean m33858a(@C0193h0 C7044c cVar, int i) {
        C7043b bVar = (C7043b) cVar.f19843a.get();
        if (bVar == null) {
            return false;
        }
        this.f19839b.removeCallbacksAndMessages(cVar);
        bVar.mo28031a(i);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28083a(@C0193h0 C7044c cVar) {
        synchronized (this.f19838a) {
            if (this.f19840c == cVar || this.f19841d == cVar) {
                m33858a(cVar, 2);
            }
        }
    }
}
