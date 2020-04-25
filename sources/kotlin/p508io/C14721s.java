package kotlin.p508io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p217i1.C14664f;
import kotlin.p506g1.C14594m;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\b\u001a5\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\bø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0002\b\n\u0006\b\u0011(\u001e0\u0001¨\u0006 "}, mo24990d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlin-stdlib"}, mo24991k = 2, mo24992mv = {1, 1, 10})
@C6055e(name = "TextStreamsKt")
/* renamed from: kotlin.io.s */
/* compiled from: ReadWrite.kt */
public final class C14721s {

    /* renamed from: kotlin.io.s$a */
    /* compiled from: ReadWrite.kt */
    static final class C14722a extends C14448i0 implements C6080l<String, C14737p0> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f42966a;

        C14722a(ArrayList arrayList) {
            this.f42966a = arrayList;
            super(1);
        }

        /* renamed from: a */
        public final void mo45973a(@C6003d String str) {
            C14445h0.m62478f(str, "it");
            this.f42966a.add(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45973a((String) obj);
            return C14737p0.f42983a;
        }
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedReader m63835a(@C6003d Reader reader, int i) {
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        kotlin.p214b1.p216u.C14427e0.m62417b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (kotlin.p213a1.C14402l.m62371a(1, 1, 0) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        kotlin.p214b1.p216u.C14427e0.m62414a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m63846b(@p205i.p209c.p210a.C6003d java.io.Reader r4, @p205i.p209c.p210a.C6003d kotlin.p214b1.p215t.C6080l<? super kotlin.p506g1.C14594m<java.lang.String>, ? extends T> r5) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r4, r0)
            java.lang.String r0 = "block"
            kotlin.p214b1.p216u.C14445h0.m62478f(r5, r0)
            boolean r0 = r4 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r1)
            r4 = r0
        L_0x0019:
            r0 = 0
            r1 = 0
            r2 = 1
            kotlin.g1.m r3 = m63843a(r4)     // Catch:{ all -> 0x0038 }
            java.lang.Object r5 = r5.invoke(r3)     // Catch:{ all -> 0x0038 }
            kotlin.p214b1.p216u.C14427e0.m62417b(r2)
            boolean r1 = kotlin.p213a1.C14402l.m62371a(r2, r2, r1)
            if (r1 == 0) goto L_0x0031
            kotlin.p508io.C14693b.m63699a(r4, r0)
            goto L_0x0034
        L_0x0031:
            r4.close()
        L_0x0034:
            kotlin.p214b1.p216u.C14427e0.m62414a(r2)
            return r5
        L_0x0038:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            kotlin.p214b1.p216u.C14427e0.m62417b(r2)
            boolean r1 = kotlin.p213a1.C14402l.m62371a(r2, r2, r1)
            if (r1 != 0) goto L_0x0048
            r4.close()     // Catch:{ all -> 0x004b }
            goto L_0x004b
        L_0x0048:
            kotlin.p508io.C14693b.m63699a(r4, r5)
        L_0x004b:
            kotlin.p214b1.p216u.C14427e0.m62414a(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14721s.m63846b(java.io.Reader, kotlin.b1.t.l):java.lang.Object");
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedWriter m63837a(@C6003d Writer writer, int i) {
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    @C6003d
    /* renamed from: b */
    public static final String m63847b(@C6003d Reader reader) {
        C14445h0.m62478f(reader, "$receiver");
        StringWriter stringWriter = new StringWriter();
        m63834a(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C14445h0.m62453a((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @C6003d
    /* renamed from: a */
    public static final List<String> m63842a(@C6003d Reader reader) {
        C14445h0.m62478f(reader, "$receiver");
        ArrayList arrayList = new ArrayList();
        m63844a(reader, (C6080l<? super String, C14737p0>) new C14722a<Object,C14737p0>(arrayList));
        return arrayList;
    }

    @C6041f
    /* renamed from: a */
    private static final StringReader m63839a(@C6003d String str) {
        return new StringReader(str);
    }

    @C6003d
    /* renamed from: a */
    public static final C14594m<String> m63843a(@C6003d BufferedReader bufferedReader) {
        C14445h0.m62478f(bufferedReader, "$receiver");
        return C14596o.m63181a((C14594m<? extends T>) new C14716o<Object>(bufferedReader));
    }

    /* renamed from: a */
    public static /* synthetic */ long m63834a(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m63833a(reader, writer, i);
    }

    /* renamed from: a */
    public static final long m63833a(@C6003d Reader reader, @C6003d Writer writer, int i) {
        C14445h0.m62478f(reader, "$receiver");
        C14445h0.m62478f(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    @C6041f
    /* renamed from: a */
    private static final String m63840a(@C6003d URL url, Charset charset) {
        return new String(m63845a(url), charset);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ String m63841a(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return new String(m63845a(url), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r3, r0);
     */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m63845a(@p205i.p209c.p210a.C6003d java.net.URL r3) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r0)
            java.io.InputStream r3 = r3.openStream()
            java.lang.String r0 = "it"
            kotlin.p214b1.p216u.C14445h0.m62453a(r3, r0)     // Catch:{ all -> 0x0019 }
            r0 = 0
            r1 = 1
            r2 = 0
            byte[] r0 = kotlin.p508io.C14691a.m63689b(r3, r0, r1, r2)     // Catch:{ all -> 0x0019 }
            kotlin.p508io.C14693b.m63699a(r3, r2)
            return r0
        L_0x0019:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001b }
        L_0x001b:
            r1 = move-exception
            kotlin.p508io.C14693b.m63699a(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14721s.m63845a(java.net.URL):byte[]");
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedReader m63836a(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedWriter m63838a(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63844a(@p205i.p209c.p210a.C6003d java.io.Reader r3, @p205i.p209c.p210a.C6003d kotlin.p214b1.p215t.C6080l<? super java.lang.String, kotlin.C14737p0> r4) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r0)
            java.lang.String r0 = "action"
            kotlin.p214b1.p216u.C14445h0.m62478f(r4, r0)
            boolean r0 = r3 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r1)
            r3 = r0
        L_0x0019:
            r0 = 0
            kotlin.g1.m r1 = m63843a(r3)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0030
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0036 }
            r4.invoke(r2)     // Catch:{ all -> 0x0036 }
            goto L_0x0022
        L_0x0030:
            kotlin.p0 r4 = kotlin.C14737p0.f42983a     // Catch:{ all -> 0x0036 }
            kotlin.p508io.C14693b.m63699a(r3, r0)
            return
        L_0x0036:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            kotlin.p508io.C14693b.m63699a(r3, r4)
            goto L_0x003e
        L_0x003d:
            throw r0
        L_0x003e:
            goto L_0x003d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14721s.m63844a(java.io.Reader, kotlin.b1.t.l):void");
    }
}
