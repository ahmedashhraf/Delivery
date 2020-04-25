package p076c.p112d.p134b.p135a.p235c.p239e;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7255b0;
import com.google.api.client.http.C7256c;
import com.google.api.client.http.C7259d0;
import com.google.api.client.http.C7261e0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7309x;
import com.google.api.client.http.C7311z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p134b.p135a.p143g.C6382i;
import p076c.p112d.p134b.p135a.p262f.p263a.C6336b;

/* renamed from: c.d.b.a.c.e.c */
/* compiled from: BatchUnparsedResponse */
final class C6225c {

    /* renamed from: a */
    private final String f17522a;

    /* renamed from: b */
    private final List<C6224b<?, ?>> f17523b;

    /* renamed from: c */
    private final InputStream f17524c;

    /* renamed from: d */
    boolean f17525d = true;

    /* renamed from: e */
    List<C6224b<?, ?>> f17526e = new ArrayList();

    /* renamed from: f */
    boolean f17527f;

    /* renamed from: g */
    private int f17528g = 0;

    /* renamed from: h */
    private final boolean f17529h;

    /* renamed from: c.d.b.a.c.e.c$a */
    /* compiled from: BatchUnparsedResponse */
    class C6226a extends FilterInputStream {
        C6226a(InputStream inputStream) {
            super(inputStream);
        }

        public void close() {
        }
    }

    /* renamed from: c.d.b.a.c.e.c$b */
    /* compiled from: BatchUnparsedResponse */
    private static class C6227b extends C7259d0 {

        /* renamed from: e */
        private InputStream f17531e;

        /* renamed from: f */
        private int f17532f;

        /* renamed from: g */
        private List<String> f17533g;

        /* renamed from: h */
        private List<String> f17534h;

        C6227b(InputStream inputStream, int i, List<String> list, List<String> list2) {
            this.f17531e = inputStream;
            this.f17532f = i;
            this.f17533g = list;
            this.f17534h = list2;
        }

        /* renamed from: a */
        public C7261e0 mo25348a() {
            return new C6228c(this.f17531e, this.f17532f, this.f17533g, this.f17534h);
        }

        /* renamed from: a */
        public void mo25349a(String str, String str2) {
        }
    }

    /* renamed from: c.d.b.a.c.e.c$c */
    /* compiled from: BatchUnparsedResponse */
    private static class C6228c extends C7261e0 {

        /* renamed from: a */
        private InputStream f17535a;

        /* renamed from: b */
        private int f17536b;

        /* renamed from: c */
        private List<String> f17537c = new ArrayList();

        /* renamed from: d */
        private List<String> f17538d = new ArrayList();

        C6228c(InputStream inputStream, int i, List<String> list, List<String> list2) {
            this.f17535a = inputStream;
            this.f17536b = i;
            this.f17537c = list;
            this.f17538d = list2;
        }

        /* renamed from: a */
        public String mo25350a(int i) {
            return (String) this.f17537c.get(i);
        }

        /* renamed from: b */
        public InputStream mo25351b() {
            return this.f17535a;
        }

        /* renamed from: c */
        public String mo25353c() {
            return null;
        }

        /* renamed from: d */
        public long mo25354d() {
            return 0;
        }

        /* renamed from: e */
        public String mo25355e() {
            return null;
        }

        /* renamed from: f */
        public int mo25356f() {
            return this.f17537c.size();
        }

        /* renamed from: g */
        public String mo25357g() {
            return null;
        }

        /* renamed from: h */
        public int mo25358h() {
            return this.f17536b;
        }

        /* renamed from: i */
        public String mo25359i() {
            return null;
        }

        /* renamed from: b */
        public String mo25352b(int i) {
            return (String) this.f17538d.get(i);
        }
    }

    /* renamed from: c.d.b.a.c.e.c$d */
    /* compiled from: BatchUnparsedResponse */
    private static class C6229d extends C7253a0 {

        /* renamed from: c */
        private int f17539c;

        /* renamed from: d */
        private InputStream f17540d;

        /* renamed from: e */
        private List<String> f17541e;

        /* renamed from: f */
        private List<String> f17542f;

        C6229d(int i, InputStream inputStream, List<String> list, List<String> list2) {
            this.f17539c = i;
            this.f17540d = inputStream;
            this.f17541e = list;
            this.f17542f = list2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C7259d0 mo25360a(String str, String str2) {
            return new C6227b(this.f17540d, this.f17539c, this.f17541e, this.f17542f);
        }
    }

    C6225c(InputStream inputStream, String str, List<C6224b<?, ?>> list, boolean z) throws IOException {
        this.f17522a = str;
        this.f17523b = list;
        this.f17529h = z;
        this.f17524c = inputStream;
        m28821a(m28822b());
    }

    /* renamed from: b */
    private String m28822b() throws IOException {
        return m28823b(m28824c());
    }

    /* renamed from: c */
    private String m28824c() throws IOException {
        int read = this.f17524c.read();
        if (read == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (read != -1) {
            sb.append((char) read);
            if (read == 10) {
                break;
            }
            read = this.f17524c.read();
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25346a() throws IOException {
        String b;
        String str;
        String b2;
        InputStream inputStream;
        String c;
        this.f17528g++;
        do {
            b = m28822b();
            str = "";
            if (b == null) {
                break;
            }
        } while (!b.equals(str));
        int parseInt = Integer.parseInt(m28822b().split(C3868i.f12248b)[1]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long j = -1;
        while (true) {
            b2 = m28822b();
            if (b2 != null && !b2.equals(str)) {
                String[] split = b2.split(": ", 2);
                String str2 = split[0];
                String str3 = split[1];
                arrayList.add(str2);
                arrayList2.add(str3);
                if ("Content-Length".equalsIgnoreCase(str2.trim())) {
                    j = Long.parseLong(str3);
                }
            }
        }
        if (j == -1) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                c = m28824c();
                if (c == null || c.startsWith(this.f17522a)) {
                    inputStream = m28818a(byteArrayOutputStream.toByteArray());
                    b2 = m28823b(c);
                } else {
                    byteArrayOutputStream.write(c.getBytes("ISO-8859-1"));
                }
            }
            inputStream = m28818a(byteArrayOutputStream.toByteArray());
            b2 = m28823b(c);
        } else {
            inputStream = new C6226a(C6382i.m29674a(this.f17524c, j));
        }
        m28820a((C6224b) this.f17523b.get(this.f17528g - 1), parseInt, m28817a(parseInt, inputStream, arrayList, arrayList2));
        while (true) {
            if (inputStream.skip(j) <= 0 && inputStream.read() == -1) {
                break;
            }
        }
        if (j != -1) {
            b2 = m28822b();
        }
        while (b2 != null && b2.length() == 0) {
            b2 = m28822b();
        }
        m28821a(b2);
    }

    /* renamed from: b */
    private static String m28823b(String str) {
        if (str.endsWith("\r\n")) {
            return str.substring(0, str.length() - 2);
        }
        if (str.endsWith("\n")) {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    private <T, E> void m28820a(C6224b<T, E> bVar, int i, C7309x xVar) throws IOException {
        C6221a<T, E> aVar = bVar.f17518a;
        C7299q g = xVar.mo29150g();
        C7255b0 w = bVar.f17521d.mo29125w();
        C7256c c = bVar.f17521d.mo29099c();
        boolean z = false;
        this.f17527f = false;
        if (!C7311z.m35406b(i)) {
            C7295m e = bVar.f17521d.mo29105e();
            boolean z2 = this.f17529h && (e == null || e.mo25633a());
            boolean a = w != null ? w.mo25648a(bVar.f17521d, xVar, z2) : false;
            if (!a) {
                if (bVar.f17521d.mo29094a(xVar.mo29153j(), xVar.mo29150g())) {
                    z = true;
                } else if (z2 && c != null && c.mo28866a(xVar.mo29153j())) {
                    this.f17527f = true;
                }
            }
            if (z2 && (a || this.f17527f || z)) {
                this.f17526e.add(bVar);
            } else if (aVar != null) {
                aVar.mo25338b(m28819a(bVar.f17520c, xVar, bVar), g);
            }
        } else if (aVar != null) {
            aVar.mo25337a(m28819a(bVar.f17519b, xVar, bVar), g);
        }
    }

    /* renamed from: a */
    private <A, T, E> A m28819a(Class<A> cls, C7309x xVar, C6224b<T, E> bVar) throws IOException {
        if (cls == Void.class) {
            return null;
        }
        return bVar.f17521d.mo29115m().mo25503a(xVar.mo29145b(), xVar.mo29146c(), cls);
    }

    /* renamed from: a */
    private C7309x m28817a(int i, InputStream inputStream, List<String> list, List<String> list2) throws IOException {
        C7305u b = new C6229d(i, inputStream, list, list2).mo28859b().mo29136b(new C7274j(C6336b.f17709a), null);
        b.mo29101c(false);
        b.mo29108f(false);
        return b.mo29092a();
    }

    /* renamed from: a */
    private static InputStream m28818a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0 && bArr[length - 1] == 10) {
            length--;
        }
        if (length > 0 && bArr[length - 1] == 13) {
            length--;
        }
        return new ByteArrayInputStream(bArr, 0, length);
    }

    /* renamed from: a */
    private void m28821a(String str) throws IOException {
        if (str.equals(String.valueOf(this.f17522a).concat("--"))) {
            this.f17525d = false;
            this.f17524c.close();
        }
    }
}
