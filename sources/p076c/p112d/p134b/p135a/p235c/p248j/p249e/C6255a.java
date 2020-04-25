package p076c.p112d.p134b.p135a.p235c.p248j.p249e;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7308w;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6292f;
import p076c.p112d.p134b.p135a.p136d.C6292f.C6293a;
import p076c.p112d.p134b.p135a.p235c.p248j.C6249a;
import p076c.p112d.p134b.p135a.p235c.p248j.C6249a.C6250a;
import p076c.p112d.p134b.p135a.p235c.p248j.C6254d;

/* renamed from: c.d.b.a.c.j.e.a */
/* compiled from: AbstractGoogleJsonClient */
public abstract class C6255a extends C6249a {

    /* renamed from: c.d.b.a.c.j.e.a$a */
    /* compiled from: AbstractGoogleJsonClient */
    public static abstract class C6256a extends C6250a {
        protected C6256a(C7253a0 a0Var, C6290d dVar, String str, String str2, C7308w wVar, boolean z) {
            Collection collection;
            C6293a aVar = new C6293a(dVar);
            if (z) {
                collection = Arrays.asList(new String[]{"data", "error"});
            } else {
                collection = Collections.emptySet();
            }
            super(a0Var, str, str2, aVar.mo25508a(collection).mo25509a(), wVar);
        }

        /* renamed from: a */
        public abstract C6255a m29026a();

        /* renamed from: k */
        public final C6290d mo25476k() {
            return m29036e().mo25502a();
        }

        /* renamed from: b */
        public C6256a m29028b(boolean z) {
            return (C6256a) super.mo25428b(z);
        }

        /* renamed from: d */
        public C6256a m29034d(String str) {
            return (C6256a) super.mo25433d(str);
        }

        /* renamed from: e */
        public final C6292f m29036e() {
            return (C6292f) super.mo25435e();
        }

        /* renamed from: c */
        public C6256a m29031c(String str) {
            return (C6256a) super.mo25430c(str);
        }

        /* renamed from: c */
        public C6256a m29032c(boolean z) {
            return (C6256a) super.mo25431c(z);
        }

        /* renamed from: a */
        public C6256a m29022a(C6254d dVar) {
            return (C6256a) super.mo25422a(dVar);
        }

        /* renamed from: a */
        public C6256a m29023a(C7308w wVar) {
            return (C6256a) super.mo25423a(wVar);
        }

        /* renamed from: a */
        public C6256a m29024a(String str) {
            return (C6256a) super.mo25424a(str);
        }

        /* renamed from: a */
        public C6256a m29025a(boolean z) {
            return (C6256a) super.mo25425a(z);
        }
    }

    protected C6255a(C6256a aVar) {
        super(aVar);
    }

    /* renamed from: k */
    public final C6290d mo25475k() {
        return m29015e().mo25502a();
    }

    /* renamed from: e */
    public C6292f m29015e() {
        return (C6292f) super.mo25416e();
    }
}
