package p076c.p112d.p134b.p135a.p136d;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C6406p0;
import p076c.p112d.p134b.p135a.p143g.C6413s;

/* renamed from: c.d.b.a.d.b */
/* compiled from: GenericJson */
public class C6288b extends C6413s implements Cloneable {

    /* renamed from: N */
    private C6290d f17633N;

    /* renamed from: a */
    public final void mo25489a(C6290d dVar) {
        this.f17633N = dVar;
    }

    /* renamed from: d */
    public final C6290d mo25490d() {
        return this.f17633N;
    }

    /* renamed from: e */
    public String mo25491e() throws IOException {
        C6290d dVar = this.f17633N;
        if (dVar != null) {
            return dVar.mo25499b(this);
        }
        return super.toString();
    }

    public String toString() {
        C6290d dVar = this.f17633N;
        if (dVar == null) {
            return super.toString();
        }
        try {
            return dVar.mo25500c(this);
        } catch (IOException e) {
            throw C6406p0.m29736a(e);
        }
    }

    /* renamed from: b */
    public C6288b m29152b(String str, Object obj) {
        return (C6288b) super.mo25098b(str, obj);
    }

    public C6288b clone() {
        return (C6288b) super.clone();
    }
}
