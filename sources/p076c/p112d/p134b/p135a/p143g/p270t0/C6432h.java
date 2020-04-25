package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: c.d.b.a.g.t0.h */
/* compiled from: MemoryDataStoreFactory */
public class C6432h extends C6425b {

    /* renamed from: c.d.b.a.g.t0.h$a */
    /* compiled from: MemoryDataStoreFactory */
    static class C6433a {

        /* renamed from: a */
        static final C6432h f17908a = new C6432h();

        C6433a() {
        }
    }

    /* renamed from: c.d.b.a.g.t0.h$b */
    /* compiled from: MemoryDataStoreFactory */
    static class C6434b<V extends Serializable> extends C6426c<V> {
        C6434b(C6432h hVar, String str) {
            super(hVar, str);
        }

        /* renamed from: a */
        public C6432h m29850a() {
            return (C6432h) super.mo25858a();
        }
    }

    /* renamed from: a */
    public static C6432h m29847a() {
        return C6433a.f17908a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <V extends Serializable> C6427d<V> mo25865b(String str) throws IOException {
        return new C6434b(this, str);
    }
}
