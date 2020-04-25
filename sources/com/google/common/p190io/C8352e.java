package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.google.common.io.e */
/* compiled from: ByteSink */
public abstract class C8352e implements C8349c0<OutputStream> {

    /* renamed from: com.google.common.io.e$b */
    /* compiled from: ByteSink */
    private final class C8354b extends C8376i {

        /* renamed from: a */
        private final Charset f22247a;

        /* renamed from: c */
        public Writer mo31445c() throws IOException {
            return new OutputStreamWriter(C8352e.this.mo23251c(), this.f22247a);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C8352e.this.toString());
            sb.append(".asCharSink(");
            sb.append(this.f22247a);
            sb.append(")");
            return sb.toString();
        }

        private C8354b(Charset charset) {
            this.f22247a = (Charset) C7397x.m35664a(charset);
        }
    }

    protected C8352e() {
    }

    /* renamed from: b */
    public OutputStream mo31444b() throws IOException {
        OutputStream c = mo23251c();
        return c instanceof BufferedOutputStream ? (BufferedOutputStream) c : new BufferedOutputStream(c);
    }

    /* renamed from: c */
    public abstract OutputStream mo23251c() throws IOException;

    /* renamed from: a */
    public C8376i mo31442a(Charset charset) {
        return new C8354b(charset);
    }

    @Deprecated
    /* renamed from: a */
    public final OutputStream m39722a() throws IOException {
        return mo23251c();
    }

    /* renamed from: a */
    public void mo31443a(byte[] bArr) throws IOException {
        C7397x.m35664a(bArr);
        C8390m a = C8390m.m39900a();
        try {
            OutputStream outputStream = (OutputStream) a.mo31523a(mo23251c());
            outputStream.write(bArr);
            outputStream.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public long mo31441a(InputStream inputStream) throws IOException {
        C7397x.m35664a(inputStream);
        C8390m a = C8390m.m39900a();
        try {
            OutputStream outputStream = (OutputStream) a.mo31523a(mo23251c());
            long a2 = C8366g.m39788a(inputStream, outputStream);
            outputStream.flush();
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
