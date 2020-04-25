package com.google.common.p190io;

import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.collect.C8145s3;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.io.k */
/* compiled from: CharStreams */
public final class C8383k {

    /* renamed from: a */
    private static final int f22280a = 2048;

    /* renamed from: com.google.common.io.k$a */
    /* compiled from: CharStreams */
    static class C8384a implements C7380p<C8421u<? extends Reader>, C8377j> {
        C8384a() {
        }

        /* renamed from: a */
        public C8377j apply(C8421u<? extends Reader> uVar) {
            return C8383k.m39874a(uVar);
        }
    }

    /* renamed from: com.google.common.io.k$b */
    /* compiled from: CharStreams */
    static class C8385b extends Reader {

        /* renamed from: a */
        final /* synthetic */ Readable f22281a;

        C8385b(Readable readable) {
            this.f22281a = readable;
        }

        public void close() throws IOException {
            Readable readable = this.f22281a;
            if (readable instanceof Closeable) {
                ((Closeable) readable).close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            return read(CharBuffer.wrap(cArr, i, i2));
        }

        public int read(CharBuffer charBuffer) throws IOException {
            return this.f22281a.read(charBuffer);
        }
    }

    /* renamed from: com.google.common.io.k$c */
    /* compiled from: CharStreams */
    static class C8386c extends C8377j {

        /* renamed from: a */
        final /* synthetic */ C8421u f22282a;

        C8386c(C8421u uVar) {
            this.f22282a = uVar;
        }

        /* renamed from: d */
        public Reader mo31462d() throws IOException {
            return C8383k.m39880a((Readable) this.f22282a.mo31455a());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharStreams.asCharSource(");
            sb.append(this.f22282a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.k$d */
    /* compiled from: CharStreams */
    static class C8387d extends C8376i {

        /* renamed from: a */
        final /* synthetic */ C8349c0 f22283a;

        C8387d(C8349c0 c0Var) {
            this.f22283a = c0Var;
        }

        /* renamed from: c */
        public Writer mo31445c() throws IOException {
            return C8383k.m39882a((Appendable) this.f22283a.mo31437a());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CharStreams.asCharSink(");
            sb.append(this.f22283a);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.io.k$e */
    /* compiled from: CharStreams */
    private static final class C8388e extends Writer {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C8388e f22284a = new C8388e();

        private C8388e() {
        }

        public Writer append(char c) {
            return this;
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        public void write(int i) {
        }

        public void write(char[] cArr) {
            C7397x.m35664a(cArr);
        }

        public void write(char[] cArr, int i, int i2) {
            C7397x.m35675b(i, i2 + i, cArr.length);
        }

        public void write(String str) {
            C7397x.m35664a(str);
        }

        public Writer append(CharSequence charSequence) {
            C7397x.m35664a(charSequence);
            return this;
        }

        public void write(String str, int i, int i2) {
            C7397x.m35675b(i, i2 + i, str.length());
        }

        public Writer append(CharSequence charSequence, int i, int i2) {
            C7397x.m35675b(i, i2, charSequence.length());
            return this;
        }
    }

    private C8383k() {
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<StringReader> m39878a(String str) {
        return m39875a(C8377j.m39836a((CharSequence) str));
    }

    @Deprecated
    /* renamed from: b */
    public static <R extends Readable & Closeable> String m39887b(C8421u<R> uVar) throws IOException {
        return m39874a(uVar).mo31501f();
    }

    /* renamed from: c */
    public static String m39889c(Readable readable) throws IOException {
        return m39892d(readable).toString();
    }

    @Deprecated
    /* renamed from: d */
    public static <R extends Readable & Closeable> String m39891d(C8421u<R> uVar) throws IOException {
        return m39874a(uVar).mo31500e();
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<InputStreamReader> m39876a(C8421u<? extends InputStream> uVar, Charset charset) {
        return m39875a(C8366g.m39798a(uVar).mo31454a(charset));
    }

    /* renamed from: b */
    public static List<String> m39888b(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        C8424x xVar = new C8424x(readable);
        while (true) {
            String a = xVar.mo31568a();
            if (a == null) {
                return arrayList;
            }
            arrayList.add(a);
        }
    }

    @Deprecated
    /* renamed from: c */
    public static <R extends Readable & Closeable> List<String> m39890c(C8421u<R> uVar) throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            List<String> b = m39888b((Readable) a.mo31523a((Closeable) uVar.mo31455a()));
            a.close();
            return b;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: d */
    private static StringBuilder m39892d(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        m39870a(readable, (Appendable) sb);
        return sb;
    }

    @Deprecated
    /* renamed from: a */
    public static C8349c0<OutputStreamWriter> m39871a(C8349c0<? extends OutputStream> c0Var, Charset charset) {
        return m39872a(C8366g.m39797a(c0Var).mo31442a(charset));
    }

    @Deprecated
    /* renamed from: a */
    public static <W extends Appendable & Closeable> void m39886a(CharSequence charSequence, C8349c0<W> c0Var) throws IOException {
        m39873a(c0Var).mo31491a(charSequence);
    }

    @Deprecated
    /* renamed from: a */
    public static <R extends Readable & Closeable, W extends Appendable & Closeable> long m39868a(C8421u<R> uVar, C8349c0<W> c0Var) throws IOException {
        return m39874a(uVar).mo31495a(m39873a(c0Var));
    }

    @Deprecated
    /* renamed from: a */
    public static <R extends Readable & Closeable> long m39869a(C8421u<R> uVar, Appendable appendable) throws IOException {
        return m39874a(uVar).mo31496a(appendable);
    }

    /* renamed from: a */
    public static long m39870a(Readable readable, Appendable appendable) throws IOException {
        C7397x.m35664a(readable);
        C7397x.m35664a(appendable);
        CharBuffer allocate = CharBuffer.allocate(2048);
        long j = 0;
        while (readable.read(allocate) != -1) {
            allocate.flip();
            appendable.append(allocate);
            j += (long) allocate.remaining();
            allocate.clear();
        }
        return j;
    }

    /* renamed from: a */
    public static <T> T m39884a(Readable readable, C8423w<T> wVar) throws IOException {
        String a;
        C7397x.m35664a(readable);
        C7397x.m35664a(wVar);
        C8424x xVar = new C8424x(readable);
        do {
            a = xVar.mo31568a();
            if (a == null) {
                break;
            }
        } while (wVar.mo31447a(a));
        return wVar.getResult();
    }

    @Deprecated
    /* renamed from: a */
    public static <R extends Readable & Closeable, T> T m39883a(C8421u<R> uVar, C8423w<T> wVar) throws IOException {
        C7397x.m35664a(uVar);
        C7397x.m35664a(wVar);
        C8390m a = C8390m.m39900a();
        try {
            T a2 = m39884a((Readable) a.mo31523a((Closeable) uVar.mo31455a()), wVar);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<Reader> m39877a(Iterable<? extends C8421u<? extends Reader>> iterable) {
        C7397x.m35664a(iterable);
        return m39875a(C8377j.m39837a(C8145s3.m39001a(iterable, (C7380p<? super F, ? extends T>) new C8384a<Object,Object>())));
    }

    @Deprecated
    /* renamed from: a */
    public static C8421u<Reader> m39879a(C8421u<? extends Reader>... uVarArr) {
        return m39877a((Iterable<? extends C8421u<? extends Reader>>) Arrays.asList(uVarArr));
    }

    /* renamed from: a */
    public static void m39885a(Reader reader, long j) throws IOException {
        C7397x.m35664a(reader);
        while (j > 0) {
            long skip = reader.skip(j);
            if (skip != 0) {
                j -= skip;
            } else if (reader.read() != -1) {
                j--;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public static Writer m39881a() {
        return C8388e.f22284a;
    }

    /* renamed from: a */
    public static Writer m39882a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C8344a(appendable);
    }

    /* renamed from: a */
    static Reader m39880a(Readable readable) {
        C7397x.m35664a(readable);
        if (readable instanceof Reader) {
            return (Reader) readable;
        }
        return new C8385b(readable);
    }

    @Deprecated
    /* renamed from: a */
    public static C8377j m39874a(C8421u<? extends Readable> uVar) {
        C7397x.m35664a(uVar);
        return new C8386c(uVar);
    }

    @Deprecated
    /* renamed from: a */
    public static C8376i m39873a(C8349c0<? extends Appendable> c0Var) {
        C7397x.m35664a(c0Var);
        return new C8387d(c0Var);
    }

    /* renamed from: a */
    static <R extends Reader> C8421u<R> m39875a(C8377j jVar) {
        return (C8421u) C7397x.m35664a(jVar);
    }

    /* renamed from: a */
    static <W extends Writer> C8349c0<W> m39872a(C8376i iVar) {
        return (C8349c0) C7397x.m35664a(iVar);
    }
}
