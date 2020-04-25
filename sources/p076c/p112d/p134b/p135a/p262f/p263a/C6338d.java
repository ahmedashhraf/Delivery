package p076c.p112d.p134b.p135a.p262f.p263a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7259d0;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;

@C2766f
/* renamed from: c.d.b.a.f.a.d */
/* compiled from: MockHttpTransport */
public class C6338d extends C7253a0 {

    /* renamed from: c */
    private Set<String> f17714c;

    /* renamed from: d */
    private C6341f f17715d;

    /* renamed from: e */
    private C6342g f17716e;

    @C2766f
    /* renamed from: c.d.b.a.f.a.d$a */
    /* compiled from: MockHttpTransport */
    public static class C6339a {

        /* renamed from: a */
        Set<String> f17717a;

        /* renamed from: b */
        C6341f f17718b;

        /* renamed from: c */
        C6342g f17719c;

        /* renamed from: a */
        public C6338d mo25643a() {
            return new C6338d(this);
        }

        /* renamed from: b */
        public final C6341f mo25644b() {
            return this.f17718b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C6342g mo25645c() {
            return this.f17719c;
        }

        /* renamed from: d */
        public final Set<String> mo25646d() {
            return this.f17717a;
        }

        /* renamed from: a */
        public final C6339a mo25642a(Set<String> set) {
            this.f17717a = set;
            return this;
        }

        /* renamed from: a */
        public final C6339a mo25640a(C6341f fVar) {
            C6381h0.m29670b(this.f17719c == null, "Cannnot set a low level HTTP request when a low level HTTP response has been set.");
            this.f17718b = fVar;
            return this;
        }

        /* renamed from: a */
        public final C6339a mo25641a(C6342g gVar) {
            C6381h0.m29670b(this.f17718b == null, "Cannot set a low level HTTP response when a low level HTTP request has been set.");
            this.f17719c = gVar;
            return this;
        }
    }

    public C6338d() {
    }

    @Deprecated
    /* renamed from: f */
    public static C6339a m29490f() {
        return new C6339a();
    }

    /* renamed from: a */
    public boolean mo25637a(String str) throws IOException {
        Set<String> set = this.f17714c;
        return set == null || set.contains(str);
    }

    /* renamed from: d */
    public final C6341f mo25638d() {
        return this.f17715d;
    }

    /* renamed from: e */
    public final Set<String> mo25639e() {
        Set<String> set = this.f17714c;
        if (set == null) {
            return null;
        }
        return Collections.unmodifiableSet(set);
    }

    protected C6338d(C6339a aVar) {
        this.f17714c = aVar.f17717a;
        this.f17715d = aVar.f17718b;
        this.f17716e = aVar.f17719c;
    }

    /* renamed from: a */
    public C7259d0 mo25360a(String str, String str2) throws IOException {
        C6381h0.m29668a(mo25637a(str), "HTTP method %s not supported", str);
        C6341f fVar = this.f17715d;
        if (fVar != null) {
            return fVar;
        }
        C6341f fVar2 = new C6341f(str2);
        C6342g gVar = this.f17716e;
        if (gVar != null) {
            fVar2.mo25649a(gVar);
        }
        return fVar2;
    }
}
