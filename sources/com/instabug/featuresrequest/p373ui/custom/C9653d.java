package com.instabug.featuresrequest.p373ui.custom;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.d */
/* compiled from: InstaToastManager */
class C9653d {

    /* renamed from: e */
    private static C9653d f25586e;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f25587f;

    /* renamed from: a */
    private final Object f25588a = new Object();

    /* renamed from: b */
    private final Handler f25589b;

    /* renamed from: c */
    private C9656c f25590c;

    /* renamed from: d */
    private C9656c f25591d;

    /* renamed from: com.instabug.featuresrequest.ui.custom.d$a */
    /* compiled from: InstaToastManager */
    class C9654a implements Callback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25592b;

        /* renamed from: a */
        final /* synthetic */ C9653d f25593a;

        C9654a(C9653d dVar) {
            boolean[] a = m45140a();
            this.f25593a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45140a() {
            boolean[] zArr = f25592b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(619540238305220523L, "com/instabug/featuresrequest/ui/custom/InstaToastManager$1", 3);
            f25592b = a;
            return a;
        }

        public boolean handleMessage(Message message) {
            boolean[] a = m45140a();
            if (message.what != 0) {
                a[2] = true;
                return false;
            }
            C9653d.m45126a(this.f25593a, (C9656c) message.obj);
            a[1] = true;
            return true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.d$b */
    /* compiled from: InstaToastManager */
    interface C9655b {
        /* renamed from: b */
        void mo34530b(int i);

        /* renamed from: d */
        void mo34531d();
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.d$c */
    /* compiled from: InstaToastManager */
    private static class C9656c {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25594c;

        /* renamed from: a */
        private final WeakReference<C9655b> f25595a;

        /* renamed from: b */
        private int f25596b;

        C9656c(int i, C9655b bVar) {
            boolean[] a = m45145a();
            a[0] = true;
            this.f25595a = new WeakReference<>(bVar);
            this.f25596b = i;
            a[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ int m45143a(C9656c cVar, int i) {
            boolean[] a = m45145a();
            cVar.f25596b = i;
            a[7] = true;
            return i;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45145a() {
            boolean[] zArr = f25594c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6012746679376395537L, "com/instabug/featuresrequest/ui/custom/InstaToastManager$SnackbarRecord", 10);
            f25594c = a;
            return a;
        }

        /* renamed from: b */
        static /* synthetic */ int m45146b(C9656c cVar) {
            boolean[] a = m45145a();
            int i = cVar.f25596b;
            a[9] = true;
            return i;
        }

        /* renamed from: a */
        static /* synthetic */ WeakReference m45144a(C9656c cVar) {
            boolean[] a = m45145a();
            WeakReference<C9655b> weakReference = cVar.f25595a;
            a[8] = true;
            return weakReference;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo34543a(C9655b bVar) {
            boolean z;
            boolean[] a = m45145a();
            if (bVar == null) {
                a[2] = true;
            } else if (this.f25595a.get() != bVar) {
                a[3] = true;
            } else {
                a[4] = true;
                z = true;
                a[6] = true;
                return z;
            }
            z = false;
            a[5] = true;
            a[6] = true;
            return z;
        }
    }

    private C9653d() {
        boolean[] c = m45130c();
        c[4] = true;
        c[5] = true;
        this.f25589b = new Handler(Looper.getMainLooper(), new C9654a(this));
        c[6] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45126a(C9653d dVar, C9656c cVar) {
        boolean[] c = m45130c();
        dVar.m45129b(cVar);
        c[99] = true;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m45130c() {
        boolean[] zArr = f25587f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3101030660036892004L, "com/instabug/featuresrequest/ui/custom/InstaToastManager", 100);
        f25587f = a;
        return a;
    }

    /* renamed from: f */
    private boolean m45131f(C9655b bVar) {
        boolean z;
        boolean[] c = m45130c();
        C9656c cVar = this.f25590c;
        if (cVar == null) {
            c[74] = true;
        } else if (!cVar.mo34543a(bVar)) {
            c[75] = true;
        } else {
            c[76] = true;
            z = true;
            c[78] = true;
            return z;
        }
        z = false;
        c[77] = true;
        c[78] = true;
        return z;
    }

    /* renamed from: g */
    private boolean m45132g(C9655b bVar) {
        boolean z;
        boolean[] c = m45130c();
        C9656c cVar = this.f25591d;
        if (cVar == null) {
            c[79] = true;
        } else if (!cVar.mo34543a(bVar)) {
            c[80] = true;
        } else {
            c[81] = true;
            z = true;
            c[83] = true;
            return z;
        }
        z = false;
        c[82] = true;
        c[83] = true;
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo34538b(C9655b bVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[37] = true;
                if (!m45131f(bVar)) {
                    c[38] = true;
                } else {
                    c[39] = true;
                    m45125a(this.f25590c);
                    c[40] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    c[41] = true;
                    throw th;
                }
            }
        }
        c[42] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo34539c(C9655b bVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[43] = true;
                if (!m45131f(bVar)) {
                    c[44] = true;
                } else {
                    c[45] = true;
                    this.f25589b.removeCallbacksAndMessages(this.f25590c);
                    c[46] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    c[47] = true;
                    throw th;
                }
            }
        }
        c[48] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public void mo34540d(C9655b bVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[49] = true;
                if (!m45131f(bVar)) {
                    c[50] = true;
                } else {
                    c[51] = true;
                    m45125a(this.f25590c);
                    c[52] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    c[53] = true;
                    throw th;
                }
            }
        }
        c[54] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public boolean mo34541e(C9655b bVar) {
        boolean z;
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[58] = true;
                if (m45131f(bVar)) {
                    c[59] = true;
                } else if (m45132g(bVar)) {
                    c[60] = true;
                } else {
                    z = false;
                    c[62] = true;
                }
                c[61] = true;
                z = true;
            } catch (Throwable th) {
                while (true) {
                    c[64] = true;
                    throw th;
                }
            }
        }
        c[63] = true;
        return z;
    }

    /* renamed from: a */
    static synchronized C9653d m45124a() {
        C9653d dVar;
        synchronized (C9653d.class) {
            boolean[] c = m45130c();
            if (f25586e != null) {
                c[0] = true;
            } else {
                c[1] = true;
                f25586e = new C9653d();
                c[2] = true;
            }
            dVar = f25586e;
            c[3] = true;
        }
        return dVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo34535a(int i, C9655b bVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[7] = true;
                if (!m45131f(bVar)) {
                    c[8] = true;
                    if (m45132g(bVar)) {
                        c[13] = true;
                        C9656c.m45143a(this.f25591d, i);
                        c[14] = true;
                    } else {
                        this.f25591d = new C9656c(i, bVar);
                        c[15] = true;
                    }
                    if (this.f25590c == null) {
                        c[16] = true;
                    } else if (!m45127a(this.f25590c, 4)) {
                        c[17] = true;
                    } else {
                        c[18] = true;
                        return;
                    }
                    this.f25590c = null;
                    c[19] = true;
                    m45128b();
                    c[21] = true;
                    return;
                }
                c[9] = true;
                C9656c.m45143a(this.f25590c, i);
                c[10] = true;
                this.f25589b.removeCallbacksAndMessages(this.f25590c);
                c[11] = true;
                m45125a(this.f25590c);
                c[12] = true;
            } catch (Throwable th) {
                while (true) {
                    c[20] = true;
                    throw th;
                }
            }
        }
    }

    /* renamed from: b */
    private void m45128b() {
        boolean[] c = m45130c();
        C9656c cVar = this.f25591d;
        if (cVar == null) {
            c[65] = true;
        } else {
            this.f25590c = cVar;
            this.f25591d = null;
            c[66] = true;
            C9655b bVar = (C9655b) C9656c.m45144a(this.f25590c).get();
            if (bVar != null) {
                c[67] = true;
                bVar.mo34531d();
                c[68] = true;
            } else {
                this.f25590c = null;
                c[69] = true;
            }
        }
        c[70] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private void m45129b(C9656c cVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[92] = true;
                if (this.f25590c == cVar) {
                    c[93] = true;
                } else if (this.f25591d != cVar) {
                    c[94] = true;
                } else {
                    c[95] = true;
                }
                m45127a(cVar, 2);
                c[96] = true;
            } catch (Throwable th) {
                while (true) {
                    c[97] = true;
                    throw th;
                }
            }
        }
        c[98] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo34537a(C9655b bVar, int i) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[22] = true;
                if (m45131f(bVar)) {
                    c[23] = true;
                    m45127a(this.f25590c, i);
                    c[24] = true;
                } else if (!m45132g(bVar)) {
                    c[25] = true;
                } else {
                    c[26] = true;
                    m45127a(this.f25591d, i);
                    c[27] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    c[28] = true;
                    throw th;
                }
            }
        }
        c[29] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo34536a(C9655b bVar) {
        boolean[] c = m45130c();
        synchronized (this.f25588a) {
            try {
                c[30] = true;
                if (!m45131f(bVar)) {
                    c[31] = true;
                } else {
                    this.f25590c = null;
                    if (this.f25591d == null) {
                        c[32] = true;
                    } else {
                        c[33] = true;
                        m45128b();
                        c[34] = true;
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    c[35] = true;
                    throw th;
                }
            }
        }
        c[36] = true;
    }

    /* renamed from: a */
    private boolean m45127a(C9656c cVar, int i) {
        boolean[] c = m45130c();
        C9655b bVar = (C9655b) C9656c.m45144a(cVar).get();
        if (bVar != null) {
            c[71] = true;
            bVar.mo34530b(i);
            c[72] = true;
            return true;
        }
        c[73] = true;
        return false;
    }

    /* renamed from: a */
    private void m45125a(C9656c cVar) {
        boolean[] c = m45130c();
        if (C9656c.m45146b(cVar) == -2) {
            c[84] = true;
            return;
        }
        int i = 2750;
        c[85] = true;
        if (C9656c.m45146b(cVar) > 0) {
            c[86] = true;
            i = C9656c.m45146b(cVar);
            c[87] = true;
        } else if (C9656c.m45146b(cVar) != -1) {
            c[88] = true;
        } else {
            i = ConnectionResult.f12762k0;
            c[89] = true;
        }
        this.f25589b.removeCallbacksAndMessages(cVar);
        c[90] = true;
        Handler handler = this.f25589b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        c[91] = true;
    }
}
