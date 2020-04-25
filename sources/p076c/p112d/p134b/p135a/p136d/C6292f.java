package p076c.p112d.p134b.p135a.p136d;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p076c.p112d.p134b.p135a.p143g.C6372e0;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6386j0;

/* renamed from: c.d.b.a.d.f */
/* compiled from: JsonObjectParser */
public class C6292f implements C6372e0 {

    /* renamed from: a */
    private final C6290d f17635a;

    /* renamed from: b */
    private final Set<String> f17636b;

    /* renamed from: c.d.b.a.d.f$a */
    /* compiled from: JsonObjectParser */
    public static class C6293a {

        /* renamed from: a */
        final C6290d f17637a;

        /* renamed from: b */
        Collection<String> f17638b = C6386j0.m29689a();

        public C6293a(C6290d dVar) {
            this.f17637a = (C6290d) C6381h0.m29663a(dVar);
        }

        /* renamed from: a */
        public C6292f mo25509a() {
            return new C6292f(this);
        }

        /* renamed from: b */
        public final C6290d mo25510b() {
            return this.f17637a;
        }

        /* renamed from: c */
        public final Collection<String> mo25511c() {
            return this.f17638b;
        }

        /* renamed from: a */
        public C6293a mo25508a(Collection<String> collection) {
            this.f17638b = collection;
            return this;
        }
    }

    public C6292f(C6290d dVar) {
        this(new C6293a(dVar));
    }

    /* renamed from: a */
    public <T> T mo25503a(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        return mo25504a(inputStream, charset, (Type) cls);
    }

    /* renamed from: b */
    public Set<String> mo25507b() {
        return Collections.unmodifiableSet(this.f17636b);
    }

    protected C6292f(C6293a aVar) {
        this.f17635a = aVar.f17637a;
        this.f17636b = new HashSet(aVar.f17638b);
    }

    /* renamed from: a */
    public Object mo25504a(InputStream inputStream, Charset charset, Type type) throws IOException {
        C6294g a = this.f17635a.mo25142a(inputStream, charset);
        m29192a(a);
        return a.mo25514a(type, true);
    }

    /* renamed from: a */
    public <T> T mo25505a(Reader reader, Class<T> cls) throws IOException {
        return mo25506a(reader, (Type) cls);
    }

    /* renamed from: a */
    public Object mo25506a(Reader reader, Type type) throws IOException {
        C6294g a = this.f17635a.mo25143a(reader);
        m29192a(a);
        return a.mo25514a(type, true);
    }

    /* renamed from: a */
    public final C6290d mo25502a() {
        return this.f17635a;
    }

    /* renamed from: a */
    private void m29192a(C6294g gVar) throws IOException {
        if (!this.f17636b.isEmpty()) {
            try {
                C6381h0.m29668a((gVar.mo25516a(this.f17636b) == null || gVar.mo25173e() == C6296j.END_OBJECT) ? false : true, "wrapper key(s) not found: %s", this.f17636b);
            } catch (Throwable th) {
                gVar.mo25169a();
                throw th;
            }
        }
    }
}
