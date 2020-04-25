package p076c.p291f.p292a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;
import java.util.Map;
import p076c.p112d.p148d.p279f.C6610c;

/* renamed from: c.f.a.c */
/* compiled from: Part */
public interface C6784c {

    /* renamed from: c.f.a.c$b */
    /* compiled from: Part */
    public static class C6786b {

        /* renamed from: k */
        private static final int f18871k = 4096;

        /* renamed from: a */
        private String f18872a;

        /* renamed from: b */
        int f18873b;

        /* renamed from: c */
        private String f18874c;

        /* renamed from: d */
        private String f18875d;

        /* renamed from: e */
        private String f18876e;

        /* renamed from: f */
        private File f18877f;

        /* renamed from: g */
        private InputStream f18878g;

        /* renamed from: h */
        private byte[] f18879h;

        /* renamed from: i */
        private C6780b f18880i;

        /* renamed from: j */
        private boolean f18881j = false;

        /* renamed from: c.f.a.c$b$a */
        /* compiled from: Part */
        static final class C6787a extends C6789c {

            /* renamed from: b */
            private final byte[] f18882b;

            C6787a(Map<String, String> map, byte[] bArr) {
                super(map);
                this.f18882b = bArr;
            }

            /* renamed from: a */
            public void mo27057a(OutputStream outputStream) throws IOException {
                outputStream.write(this.f18882b);
            }
        }

        /* renamed from: c.f.a.c$b$b */
        /* compiled from: Part */
        private static final class C6788b extends C6789c {

            /* renamed from: b */
            private final File f18883b;

            /* renamed from: c */
            private final byte[] f18884c;

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[SYNTHETIC, Splitter:B:12:0x0017] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo27057a(java.io.OutputStream r4) throws java.io.IOException {
                /*
                    r3 = this;
                    r0 = 0
                    java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0014 }
                    java.io.File r2 = r3.f18883b     // Catch:{ all -> 0x0014 }
                    r1.<init>(r2)     // Catch:{ all -> 0x0014 }
                    byte[] r0 = r3.f18884c     // Catch:{ all -> 0x0011 }
                    p076c.p291f.p292a.C6792d.m32465a(r1, r4, r0)     // Catch:{ all -> 0x0011 }
                    r1.close()     // Catch:{ IOException -> 0x0010 }
                L_0x0010:
                    return
                L_0x0011:
                    r4 = move-exception
                    r0 = r1
                    goto L_0x0015
                L_0x0014:
                    r4 = move-exception
                L_0x0015:
                    if (r0 == 0) goto L_0x001a
                    r0.close()     // Catch:{ IOException -> 0x001a }
                L_0x001a:
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: p076c.p291f.p292a.C6784c.C6786b.C6788b.mo27057a(java.io.OutputStream):void");
            }

            private C6788b(Map<String, String> map, File file) {
                super(map);
                this.f18884c = new byte[4096];
                this.f18883b = file;
            }
        }

        /* renamed from: c.f.a.c$b$c */
        /* compiled from: Part */
        private static abstract class C6789c implements C6784c {

            /* renamed from: a */
            private final Map<String, String> f18885a;

            protected C6789c(Map<String, String> map) {
                this.f18885a = map;
            }

            /* renamed from: a */
            public Map<String, String> mo27056a() {
                return this.f18885a;
            }
        }

        /* renamed from: c.f.a.c$b$d */
        /* compiled from: Part */
        private static final class C6790d extends C6789c {

            /* renamed from: b */
            private final C6784c f18886b;

            protected C6790d(Map<String, String> map, C6784c cVar) {
                super(map);
                this.f18886b = cVar;
            }

            /* renamed from: a */
            public void mo27057a(OutputStream outputStream) throws IOException {
                this.f18886b.mo27057a(outputStream);
            }
        }

        /* renamed from: c.f.a.c$b$e */
        /* compiled from: Part */
        private static final class C6791e extends C6789c {

            /* renamed from: b */
            private final InputStream f18887b;

            /* renamed from: c */
            private final byte[] f18888c;

            /* renamed from: a */
            public void mo27057a(OutputStream outputStream) throws IOException {
                C6792d.m32465a(this.f18887b, outputStream, this.f18888c);
            }

            private C6791e(Map<String, String> map, InputStream inputStream) {
                super(map);
                this.f18888c = new byte[4096];
                this.f18887b = inputStream;
            }
        }

        /* renamed from: b */
        private void m32447b() {
            if (!this.f18881j) {
                this.f18881j = true;
                return;
            }
            throw new IllegalStateException("Only one body per part.");
        }

        /* renamed from: a */
        public C6786b mo27063a(int i) {
            if (i > 0) {
                C6792d.m32464a(this.f18873b, "Length header already set.");
                this.f18873b = i;
                return this;
            }
            throw new IllegalStateException("Length must be greater than zero.");
        }

        /* renamed from: c */
        public C6786b mo27071c(String str) {
            C6792d.m32467a(str, "Encoding must not be empty.");
            C6792d.m32468b(this.f18875d, "Encoding header already set.");
            this.f18875d = str;
            return this;
        }

        /* renamed from: d */
        public C6786b mo27072d(String str) {
            C6792d.m32467a(str, "Language must not be empty.");
            C6792d.m32468b(this.f18874c, "Language header already set.");
            this.f18874c = str;
            return this;
        }

        /* renamed from: e */
        public C6786b mo27073e(String str) {
            C6792d.m32467a(str, "Type must not be empty.");
            C6792d.m32468b(this.f18872a, "Type header already set.");
            C6792d.m32468b(this.f18880i, "Type cannot be set with multipart body.");
            this.f18872a = str;
            return this;
        }

        /* renamed from: a */
        public C6786b mo27065a(File file) {
            C6792d.m32466a((Object) file, "File body must not be null.");
            m32447b();
            this.f18877f = file;
            return this;
        }

        /* renamed from: b */
        public C6786b mo27070b(String str) {
            C6792d.m32467a(str, "Disposition must not be empty.");
            C6792d.m32468b(this.f18876e, "Disposition header already set.");
            this.f18876e = str;
            return this;
        }

        /* renamed from: a */
        public C6786b mo27066a(InputStream inputStream) {
            C6792d.m32466a((Object) inputStream, "Stream body must not be null.");
            m32447b();
            this.f18878g = inputStream;
            return this;
        }

        /* renamed from: a */
        public C6786b mo27067a(String str) {
            C6792d.m32466a((Object) str, "String body must not be null.");
            m32447b();
            try {
                byte[] bytes = str.getBytes("UTF-8");
                this.f18879h = bytes;
                this.f18873b = bytes.length;
                return this;
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to convert input to UTF-8: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        }

        /* renamed from: a */
        public C6786b mo27068a(byte[] bArr) {
            C6792d.m32466a((Object) bArr, "Byte array body must not be null.");
            m32447b();
            this.f18879h = bArr;
            this.f18873b = bArr.length;
            return this;
        }

        /* renamed from: a */
        public C6786b mo27064a(C6780b bVar) {
            C6792d.m32466a((Object) bVar, "Multipart body must not be null.");
            if (this.f18872a == null) {
                m32447b();
                this.f18872a = null;
                this.f18880i = bVar;
                return this;
            }
            throw new IllegalStateException("Content type must not be explicitly set for multipart body.");
        }

        /* renamed from: a */
        public C6784c mo27069a() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.f18876e;
            if (str != null) {
                linkedHashMap.put(C6610c.f18396R, str);
            }
            String str2 = this.f18872a;
            if (str2 != null) {
                linkedHashMap.put("Content-Type", str2);
            }
            int i = this.f18873b;
            if (i != 0) {
                linkedHashMap.put("Content-Length", Integer.toString(i));
            }
            String str3 = this.f18874c;
            if (str3 != null) {
                linkedHashMap.put(C6610c.f18398T, str3);
            }
            String str4 = this.f18875d;
            if (str4 != null) {
                linkedHashMap.put("Content-Transfer-Encoding", str4);
            }
            byte[] bArr = this.f18879h;
            if (bArr != null) {
                return new C6787a(linkedHashMap, bArr);
            }
            InputStream inputStream = this.f18878g;
            if (inputStream != null) {
                return new C6791e(linkedHashMap, inputStream);
            }
            File file = this.f18877f;
            if (file != null) {
                return new C6788b(linkedHashMap, file);
            }
            C6780b bVar = this.f18880i;
            if (bVar != null) {
                linkedHashMap.putAll(bVar.mo27056a());
                return new C6790d(linkedHashMap, this.f18880i);
            }
            throw new IllegalStateException("Part required body to be set.");
        }
    }

    /* renamed from: a */
    Map<String, String> mo27056a();

    /* renamed from: a */
    void mo27057a(OutputStream outputStream) throws IOException;
}
