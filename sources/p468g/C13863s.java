package p468g;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;
import p470h.C13887c;
import p470h.C13892d;

/* renamed from: g.s */
/* compiled from: FormBody */
public final class C13863s extends C13817d0 {

    /* renamed from: c */
    private static final C13872x f40194c = C13872x.m59360a("application/x-www-form-urlencoded");

    /* renamed from: a */
    private final List<String> f40195a;

    /* renamed from: b */
    private final List<String> f40196b;

    /* renamed from: g.s$a */
    /* compiled from: FormBody */
    public static final class C13864a {

        /* renamed from: a */
        private final List<String> f40197a;

        /* renamed from: b */
        private final List<String> f40198b;

        /* renamed from: c */
        private final Charset f40199c;

        public C13864a() {
            this(null);
        }

        /* renamed from: a */
        public C13864a mo43599a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.f40197a.add(C13868v.m59269a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f40199c));
                String str4 = str2;
                this.f40198b.add(C13868v.m59269a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f40199c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        /* renamed from: b */
        public C13864a mo43601b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                String str3 = str;
                this.f40197a.add(C13868v.m59269a(str3, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f40199c));
                String str4 = str2;
                this.f40198b.add(C13868v.m59269a(str4, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, this.f40199c));
                return this;
            } else {
                throw new NullPointerException("value == null");
            }
        }

        public C13864a(Charset charset) {
            this.f40197a = new ArrayList();
            this.f40198b = new ArrayList();
            this.f40199c = charset;
        }

        /* renamed from: a */
        public C13863s mo43600a() {
            return new C13863s(this.f40197a, this.f40198b);
        }
    }

    C13863s(List<String> list, List<String> list2) {
        this.f40195a = C14910b.m66049a(list);
        this.f40196b = C14910b.m66049a(list2);
    }

    /* renamed from: a */
    public int mo43594a() {
        return this.f40195a.size();
    }

    /* renamed from: b */
    public String mo43596b(int i) {
        return (String) this.f40196b.get(i);
    }

    /* renamed from: c */
    public String mo43597c(int i) {
        return C13868v.m59270a(mo43595a(i), true);
    }

    public long contentLength() {
        return m59220a(null, true);
    }

    public C13872x contentType() {
        return f40194c;
    }

    /* renamed from: d */
    public String mo43598d(int i) {
        return C13868v.m59270a(mo43596b(i), true);
    }

    public void writeTo(C13892d dVar) throws IOException {
        m59220a(dVar, false);
    }

    /* renamed from: a */
    public String mo43595a(int i) {
        return (String) this.f40195a.get(i);
    }

    /* renamed from: a */
    private long m59220a(@C5952h C13892d dVar, boolean z) {
        C13887c cVar;
        if (z) {
            cVar = new C13887c();
        } else {
            cVar = dVar.mo43867b();
        }
        int size = this.f40195a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                cVar.writeByte(38);
            }
            cVar.m59515a((String) this.f40195a.get(i));
            cVar.writeByte(61);
            cVar.m59515a((String) this.f40196b.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = cVar.size();
        cVar.mo43879d();
        return size2;
    }
}
