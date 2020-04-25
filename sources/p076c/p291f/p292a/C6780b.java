package p076c.p291f.p292a;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

/* renamed from: c.f.a.b */
/* compiled from: Multipart */
public final class C6780b implements C6784c {

    /* renamed from: a */
    private final List<C6784c> f18865a;

    /* renamed from: b */
    private final Map<String, String> f18866b;

    /* renamed from: c */
    private final String f18867c;

    /* renamed from: c.f.a.b$b */
    /* compiled from: Multipart */
    public static class C6782b {

        /* renamed from: a */
        private final String f18868a;

        /* renamed from: b */
        private final List<C6784c> f18869b;

        /* renamed from: c */
        private C6783c f18870c;

        public C6782b() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public C6782b mo27060a(C6783c cVar) {
            C6792d.m32466a((Object) cVar, "Type must not be null.");
            this.f18870c = cVar;
            return this;
        }

        public C6782b(String str) {
            this.f18869b = new ArrayList();
            this.f18870c = C6783c.MIXED;
            this.f18868a = str;
        }

        /* renamed from: a */
        public C6782b mo27061a(C6784c cVar) {
            C6792d.m32466a((Object) cVar, "Part must not be null.");
            this.f18869b.add(cVar);
            return this;
        }

        /* renamed from: a */
        public C6780b mo27062a() {
            if (!this.f18869b.isEmpty()) {
                return new C6780b(this.f18870c, this.f18869b, this.f18868a);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: c.f.a.b$c */
    /* compiled from: Multipart */
    public enum C6783c {
        MIXED("mixed"),
        ALTERNATIVE("alternative"),
        DIGEST("digest"),
        PARALLEL("parallel"),
        FORM("form-data");
        
        final String contentType;

        private C6783c(String str) {
            this.contentType = str;
        }
    }

    /* renamed from: a */
    public Map<String, String> mo27056a() {
        return this.f18866b;
    }

    private C6780b(C6783c cVar, List<C6784c> list, String str) {
        C6792d.m32466a((Object) cVar, "Multipart type must not be null.");
        this.f18865a = list;
        StringBuilder sb = new StringBuilder();
        sb.append("multipart/");
        sb.append(cVar.contentType);
        sb.append("; boundary=");
        sb.append(str);
        this.f18866b = Collections.singletonMap("Content-Type", sb.toString());
        this.f18867c = str;
    }

    /* renamed from: a */
    public void mo27057a(OutputStream outputStream) throws IOException {
        byte[] bytes = this.f18867c.getBytes("UTF-8");
        boolean z = true;
        for (C6784c cVar : this.f18865a) {
            m32439a(outputStream, bytes, z, false);
            m32438a(outputStream, cVar);
            z = false;
        }
        m32439a(outputStream, bytes, false, true);
    }

    /* renamed from: a */
    private static void m32439a(OutputStream outputStream, byte[] bArr, boolean z, boolean z2) throws IOException {
        if (!z) {
            outputStream.write(13);
            outputStream.write(10);
        }
        outputStream.write(45);
        outputStream.write(45);
        outputStream.write(bArr);
        if (z2) {
            outputStream.write(45);
            outputStream.write(45);
            return;
        }
        outputStream.write(13);
        outputStream.write(10);
    }

    /* renamed from: a */
    private static void m32438a(OutputStream outputStream, C6784c cVar) throws IOException {
        Map a = cVar.mo27056a();
        if (a != null) {
            for (Entry entry : a.entrySet()) {
                String str = "UTF-8";
                outputStream.write(((String) entry.getKey()).getBytes(str));
                outputStream.write(58);
                outputStream.write(32);
                outputStream.write(((String) entry.getValue()).getBytes(str));
                outputStream.write(13);
                outputStream.write(10);
            }
        }
        outputStream.write(13);
        outputStream.write(10);
        cVar.mo27057a(outputStream);
    }
}
