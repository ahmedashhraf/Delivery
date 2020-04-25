package com.instabug.library.p384h;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0225w;
import com.instabug.library.instacapture.p388a.C9821a;
import com.instabug.library.instacapture.screenshot.C9823a;
import com.instabug.library.p384h.p385c.C9818a;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.h.b */
/* compiled from: InstaCapture */
public final class C9814b {

    /* renamed from: c */
    private static C9814b f26019c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26020d;
    @C0193h0

    /* renamed from: a */
    private C9813a f26021a = new C9813a();

    /* renamed from: b */
    private C9823a f26022b;

    /* renamed from: com.instabug.library.h.b$a */
    /* compiled from: InstaCapture */
    class C9815a extends C13787e<Bitmap> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26023O;

        /* renamed from: N */
        final /* synthetic */ C9814b f26024N;

        /* renamed from: b */
        final /* synthetic */ C9816b f26025b;

        C9815a(C9814b bVar, C9816b bVar2) {
            boolean[] c = m45797c();
            this.f26024N = bVar;
            this.f26025b = bVar2;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m45797c() {
            boolean[] zArr = f26023O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5785408381659936206L, "com/instabug/library/instacapture/InstaCapture$1", 12);
            f26023O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m45797c();
            mo34940a((Bitmap) obj);
            c[11] = true;
        }

        public void onComplete() {
            m45797c()[1] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m45797c();
            C9818a.m45810b("Screenshot capture failed");
            c[2] = true;
            C9818a.m45808a(th);
            C9816b bVar = this.f26025b;
            if (bVar == null) {
                c[3] = true;
            } else {
                c[4] = true;
                bVar.mo34942a(th);
                c[5] = true;
            }
            c[6] = true;
        }

        /* renamed from: a */
        public void mo34940a(Bitmap bitmap) {
            boolean[] c = m45797c();
            C9816b bVar = this.f26025b;
            if (bVar == null) {
                c[7] = true;
            } else {
                c[8] = true;
                bVar.mo34941a(bitmap);
                c[9] = true;
            }
            c[10] = true;
        }
    }

    /* renamed from: com.instabug.library.h.b$b */
    /* compiled from: ScreenCaptureListener */
    public interface C9816b {
        /* renamed from: a */
        void mo34941a(Bitmap bitmap);

        /* renamed from: a */
        void mo34942a(Throwable th);

        /* renamed from: d */
        void mo34943d();
    }

    /* renamed from: com.instabug.library.h.b$c */
    /* compiled from: SimpleScreenCapturingListener */
    public class C9817c implements C9816b {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f26026a;

        public C9817c() {
            m45803a()[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45803a() {
            boolean[] zArr = f26026a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7634033988578125918L, "com/instabug/library/instacapture/listener/SimpleScreenCapturingListener", 4);
            f26026a = a;
            return a;
        }

        /* renamed from: a */
        public void mo34942a(Throwable th) {
            m45803a()[2] = true;
        }

        /* renamed from: d */
        public void mo34943d() {
            m45803a()[1] = true;
        }

        /* renamed from: a */
        public void mo34941a(Bitmap bitmap) {
            m45803a()[3] = true;
        }
    }

    private C9814b(@C0193h0 Activity activity) {
        boolean[] b = m45795b();
        b[0] = true;
        b[1] = true;
        this.f26021a.mo34938a(activity);
        b[2] = true;
        this.f26022b = m45792a();
        b[3] = true;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C9814b m45791a(@C0193h0 Activity activity) {
        boolean[] b = m45795b();
        synchronized (C9814b.class) {
            try {
                b[4] = true;
                if (f26019c == null) {
                    b[5] = true;
                    f26019c = new C9814b(activity);
                    b[6] = true;
                } else {
                    f26019c.m45794b(activity);
                    b[7] = true;
                }
            } catch (Throwable th) {
                while (true) {
                    b[8] = true;
                    throw th;
                }
            }
        }
        C9814b bVar = f26019c;
        b[9] = true;
        return bVar;
    }

    /* renamed from: b */
    private void m45794b(@C0193h0 Activity activity) {
        boolean[] b = m45795b();
        this.f26021a.mo34938a(activity);
        b[14] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45795b() {
        boolean[] zArr = f26020d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-6033281275640406409L, "com/instabug/library/instacapture/InstaCapture", 32);
        f26020d = a;
        return a;
    }

    /* renamed from: b */
    private C5923b0<Bitmap> m45793b(C9816b bVar, @C0225w @C0195i0 int... iArr) {
        boolean[] b = m45795b();
        Activity a = this.f26021a.mo34937a();
        if (a == null) {
            b[22] = true;
            C5923b0<Bitmap> a2 = C5923b0.m26128a((Throwable) new C9821a("Is your activity running?"));
            b[23] = true;
            return a2;
        }
        if (bVar == null) {
            b[24] = true;
        } else {
            b[25] = true;
            bVar.mo34943d();
            b[26] = true;
        }
        C5923b0 a3 = this.f26022b.mo34951a(a, iArr);
        b[27] = true;
        C5923b0<Bitmap> a4 = a3.mo23825a(C12304a.m55390a());
        b[28] = true;
        return a4;
    }

    /* renamed from: a */
    public void mo34939a(C9816b bVar, @C0225w @C0195i0 int... iArr) {
        boolean[] b = m45795b();
        if (this.f26022b != null) {
            b[15] = true;
        } else {
            b[16] = true;
            this.f26022b = m45792a();
            if (this.f26022b != null) {
                b[17] = true;
            } else if (bVar != null) {
                b[18] = true;
                bVar.mo34942a(new Throwable("screenshot provider is null"));
                b[19] = true;
            } else {
                b[20] = true;
                return;
            }
        }
        m45793b(bVar, iArr).mo23893a((C12280i0<? super T>) new C9815a<Object>(this, bVar));
        b[21] = true;
    }

    /* renamed from: a */
    private C9823a m45792a() {
        boolean[] b = m45795b();
        if (this.f26021a.mo34937a() == null) {
            b[29] = true;
            C9818a.m45810b("Is your activity running?");
            b[30] = true;
            return null;
        }
        C9823a aVar = new C9823a();
        b[31] = true;
        return aVar;
    }
}
