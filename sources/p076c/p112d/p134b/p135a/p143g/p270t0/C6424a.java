package p076c.p112d.p134b.p135a.p143g.p270t0;

import java.io.IOException;
import java.io.Serializable;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

/* renamed from: c.d.b.a.g.t0.a */
/* compiled from: AbstractDataStore */
public abstract class C6424a<V extends Serializable> implements C6427d<V> {

    /* renamed from: a */
    private final C6428e f17898a;

    /* renamed from: b */
    private final String f17899b;

    protected C6424a(C6428e eVar, String str) {
        this.f17898a = (C6428e) C6381h0.m29663a(eVar);
        this.f17899b = (String) C6381h0.m29663a(str);
    }

    /* renamed from: a */
    public C6428e mo25858a() {
        return this.f17898a;
    }

    /* renamed from: d */
    public boolean mo25860d(String str) throws IOException {
        return mo25867b(str) != null;
    }

    public final String getId() {
        return this.f17899b;
    }

    public boolean isEmpty() throws IOException {
        return size() == 0;
    }

    public int size() throws IOException {
        return keySet().size();
    }

    /* renamed from: a */
    public boolean mo25859a(V v) throws IOException {
        return values().contains(v);
    }
}
