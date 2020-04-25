package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;

/* renamed from: c.d.b.a.g.c */
/* compiled from: BackOff */
public interface C6365c {

    /* renamed from: a */
    public static final long f17781a = -1;

    /* renamed from: b */
    public static final C6365c f17782b = new C6366a();

    /* renamed from: c */
    public static final C6365c f17783c = new C6367b();

    /* renamed from: c.d.b.a.g.c$a */
    /* compiled from: BackOff */
    static class C6366a implements C6365c {
        C6366a() {
        }

        /* renamed from: a */
        public long mo25702a() throws IOException {
            return 0;
        }

        public void reset() throws IOException {
        }
    }

    /* renamed from: c.d.b.a.g.c$b */
    /* compiled from: BackOff */
    static class C6367b implements C6365c {
        C6367b() {
        }

        /* renamed from: a */
        public long mo25702a() throws IOException {
            return -1;
        }

        public void reset() throws IOException {
        }
    }

    /* renamed from: a */
    long mo25702a() throws IOException;

    void reset() throws IOException;
}
