package omrecorder;

import android.media.AudioRecord;
import java.io.IOException;
import java.io.OutputStream;
import omrecorder.C15035b.C15036a;
import omrecorder.C15035b.C15037b;
import omrecorder.C15056j.C15057a;
import omrecorder.C15064p.C15065a;

/* renamed from: omrecorder.h */
/* compiled from: PullTransport */
public interface C15044h {

    /* renamed from: omrecorder.h$a */
    /* compiled from: PullTransport */
    public static abstract class C15045a implements C15044h {

        /* renamed from: a */
        final C15051i f43777a;

        /* renamed from: b */
        final C15050d f43778b;

        /* renamed from: c */
        private final C15061m f43779c = new C15061m();

        /* renamed from: omrecorder.h$a$a */
        /* compiled from: PullTransport */
        class C15046a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15057a f43781a;

            /* renamed from: b */
            final /* synthetic */ long f43782b;

            C15046a(C15057a aVar, long j) {
                this.f43781a = aVar;
                this.f43782b = j;
            }

            public void run() {
                this.f43781a.mo46716a(this.f43782b);
            }
        }

        /* renamed from: omrecorder.h$a$b */
        /* compiled from: PullTransport */
        class C15047b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C15035b f43783a;

            C15047b(C15035b bVar) {
                this.f43783a = bVar;
            }

            public void run() {
                C15045a.this.f43778b.mo10520a(this.f43783a);
            }
        }

        C15045a(C15051i iVar, C15050d dVar) {
            this.f43777a = iVar;
            this.f43778b = dVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46704a(AudioRecord audioRecord, int i, OutputStream outputStream) throws IOException {
        }

        /* renamed from: a */
        public void mo46702a(OutputStream outputStream) throws IOException {
            mo46704a(this.f43777a.mo46710b(), this.f43777a.mo46712f(), outputStream);
        }

        public void stop() {
            this.f43777a.mo46709a(false);
            this.f43777a.mo46713a().stop();
            this.f43777a.mo46713a().release();
        }

        /* renamed from: a */
        public C15051i mo46701a() {
            return this.f43777a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46706a(C15057a aVar, long j) {
            this.f43779c.execute(new C15046a(aVar, j));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46705a(C15035b bVar) {
            this.f43779c.execute(new C15047b(bVar));
        }
    }

    /* renamed from: omrecorder.h$b */
    /* compiled from: PullTransport */
    public static final class C15048b extends C15045a {

        /* renamed from: d */
        private final C15064p f43785d;

        public C15048b(C15051i iVar, C15064p pVar) {
            this(iVar, null, pVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46704a(AudioRecord audioRecord, int i, OutputStream outputStream) throws IOException {
            C15036a aVar = new C15036a(new byte[i]);
            while (this.f43777a.mo46711d()) {
                aVar.mo46689a(audioRecord.read(aVar.mo46690a(), 0, i));
                if (!(-3 == aVar.mo46691b() || -2 == aVar.mo46691b())) {
                    if (this.f43778b != null) {
                        mo46705a((C15035b) aVar);
                    }
                    this.f43785d.mo46719a(aVar, outputStream);
                }
            }
        }

        public C15048b(C15051i iVar, C15050d dVar, C15064p pVar) {
            super(iVar, dVar);
            this.f43785d = pVar;
        }

        public C15048b(C15051i iVar, C15050d dVar) {
            this(iVar, dVar, new C15065a());
        }

        public C15048b(C15051i iVar) {
            this(iVar, null, new C15065a());
        }
    }

    /* renamed from: omrecorder.h$c */
    /* compiled from: PullTransport */
    public static final class C15049c extends C15045a {

        /* renamed from: d */
        private final long f43786d;

        /* renamed from: e */
        private final C15057a f43787e;

        /* renamed from: f */
        private final C15064p f43788f;

        /* renamed from: g */
        private long f43789g;

        /* renamed from: h */
        private int f43790h;

        public C15049c(C15051i iVar, C15050d dVar, C15057a aVar, long j) {
            this(iVar, dVar, new C15065a(), aVar, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo46704a(AudioRecord audioRecord, int i, OutputStream outputStream) throws IOException {
            C15037b bVar = new C15037b(new short[i]);
            while (this.f43777a.mo46711d()) {
                short[] c = bVar.mo46692c();
                bVar.mo46689a(audioRecord.read(c, 0, c.length));
                if (!(-3 == bVar.mo46691b() || -2 == bVar.mo46691b())) {
                    if (this.f43778b != null) {
                        mo46705a((C15035b) bVar);
                    }
                    if (bVar.mo46694e() > -1) {
                        this.f43788f.mo46719a(bVar, outputStream);
                        this.f43789g = 0;
                        this.f43790h++;
                    } else {
                        if (this.f43789g == 0) {
                            this.f43789g = System.currentTimeMillis();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = this.f43789g;
                        long j2 = currentTimeMillis - j;
                        if (j == 0 || j2 <= this.f43786d) {
                            this.f43788f.mo46719a(bVar, outputStream);
                        } else if (j2 > 1000 && this.f43790h >= 3) {
                            this.f43790h = 0;
                            C15057a aVar = this.f43787e;
                            if (aVar != null) {
                                mo46706a(aVar, j2);
                            }
                        }
                    }
                }
            }
        }

        public C15049c(C15051i iVar, C15050d dVar, C15064p pVar, C15057a aVar, long j) {
            super(iVar, dVar);
            this.f43789g = 0;
            this.f43790h = 0;
            this.f43788f = pVar;
            this.f43787e = aVar;
            this.f43786d = j;
        }

        public C15049c(C15051i iVar, C15064p pVar, C15057a aVar, long j) {
            this(iVar, null, pVar, aVar, j);
        }

        public C15049c(C15051i iVar, C15057a aVar, long j) {
            this(iVar, null, new C15065a(), aVar, j);
        }

        public C15049c(C15051i iVar, C15057a aVar) {
            this(iVar, null, new C15065a(), aVar, 200);
        }

        public C15049c(C15051i iVar) {
            this(iVar, null, new C15065a(), null, 200);
        }
    }

    /* renamed from: omrecorder.h$d */
    /* compiled from: PullTransport */
    public interface C15050d {
        /* renamed from: a */
        void mo10520a(C15035b bVar);
    }

    /* renamed from: a */
    C15051i mo46701a();

    /* renamed from: a */
    void mo46702a(OutputStream outputStream) throws IOException;

    void stop();
}
