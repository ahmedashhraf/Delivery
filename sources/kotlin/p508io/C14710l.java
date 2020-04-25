package kotlin.p508io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p217i1.C14664f;
import p205i.p209c.p210a.C6003d;
import p212io.fabric.sdk.android.services.network.HttpRequest;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u001a?\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\bø\u0001\u0000¢\u0006\u0002\u0010,\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\b\u0002\b\n\u0006\b\u0011(+0\u0001¨\u00061"}, mo24990d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "Requires newer compiler version to be inlined correctly.", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.l */
/* compiled from: FileReadWrite.kt */
class C14710l extends C14709k {

    /* renamed from: kotlin.io.l$a */
    /* compiled from: FileReadWrite.kt */
    static final class C14711a extends C14448i0 implements C6080l<String, C14737p0> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f42959a;

        C14711a(ArrayList arrayList) {
            this.f42959a = arrayList;
            super(1);
        }

        /* renamed from: a */
        public final void mo45967a(@C6003d String str) {
            C14445h0.m62478f(str, "it");
            this.f42959a.add(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45967a((String) obj);
            return C14737p0.f42983a;
        }
    }

    @C6041f
    /* renamed from: a */
    private static final BufferedReader m63766a(@C6003d File file, Charset charset, int i) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @C6041f
    /* renamed from: b */
    private static final BufferedWriter m63777b(@C6003d File file, Charset charset, int i) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    @C6003d
    /* renamed from: c */
    public static final String m63786c(@C6003d File file, @C6003d Charset charset) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(charset, HttpRequest.f42450O);
        return new String(m63794g(file), charset);
    }

    @C6041f
    /* renamed from: d */
    private static final InputStreamReader m63788d(@C6003d File file, Charset charset) {
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @C6041f
    /* renamed from: e */
    private static final OutputStreamWriter m63791e(@C6003d File file, Charset charset) {
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    @C6041f
    /* renamed from: f */
    private static final FileOutputStream m63793f(@C6003d File file) {
        return new FileOutputStream(file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        throw r1;
     */
    @p205i.p209c.p210a.C6003d
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m63794g(@p205i.p209c.p210a.C6003d java.io.File r7) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r7, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r7)
            r1 = 0
            long r2 = r7.length()     // Catch:{ all -> 0x005b }
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r4 = (long) r4     // Catch:{ all -> 0x005b }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0037
            int r7 = (int) r2     // Catch:{ all -> 0x005b }
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x005b }
        L_0x001a:
            if (r7 <= 0) goto L_0x0026
            int r3 = r0.read(r2, r1, r7)     // Catch:{ all -> 0x005b }
            if (r3 >= 0) goto L_0x0023
            goto L_0x0026
        L_0x0023:
            int r7 = r7 - r3
            int r1 = r1 + r3
            goto L_0x001a
        L_0x0026:
            if (r7 != 0) goto L_0x0029
            goto L_0x0032
        L_0x0029:
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = "java.util.Arrays.copyOf(this, newSize)"
            kotlin.p214b1.p216u.C14445h0.m62453a(r2, r7)     // Catch:{ all -> 0x005b }
        L_0x0032:
            r7 = 0
            kotlin.p508io.C14693b.m63699a(r0, r7)
            return r2
        L_0x0037:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x005b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r4.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r5 = "File "
            r4.append(r5)     // Catch:{ all -> 0x005b }
            r4.append(r7)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = " is too big ("
            r4.append(r7)     // Catch:{ all -> 0x005b }
            r4.append(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = " bytes) to fit in memory."
            r4.append(r7)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x005b }
            r1.<init>(r7)     // Catch:{ all -> 0x005b }
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            kotlin.p508io.C14693b.m63699a(r0, r7)
            goto L_0x0063
        L_0x0062:
            throw r1
        L_0x0063:
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63794g(java.io.File):byte[]");
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ BufferedReader m63767a(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C14664f.f42876a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @C6041f
    /* renamed from: b */
    static /* synthetic */ BufferedWriter m63778b(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C14664f.f42876a;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m63787c(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return m63786c(file, charset);
    }

    @C6041f
    /* renamed from: d */
    static /* synthetic */ InputStreamReader m63789d(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @C6041f
    /* renamed from: e */
    static /* synthetic */ OutputStreamWriter m63792e(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    @C6041f
    /* renamed from: a */
    private static final PrintWriter m63768a(@C6003d File file, Charset charset) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r0, r1);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63785b(@p205i.p209c.p210a.C6003d java.io.File r1, @p205i.p209c.p210a.C6003d byte[] r2) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r1, r0)
            java.lang.String r0 = "array"
            kotlin.p214b1.p216u.C14445h0.m62478f(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            kotlin.p0 r1 = kotlin.C14737p0.f42983a     // Catch:{ all -> 0x0019 }
            r1 = 0
            kotlin.p508io.C14693b.m63699a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            kotlin.p508io.C14693b.m63699a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63785b(java.io.File, byte[]):void");
    }

    @C6041f
    /* renamed from: e */
    private static final FileInputStream m63790e(@C6003d File file) {
        return new FileInputStream(file);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ PrintWriter m63769a(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    /* renamed from: b */
    public static final void m63783b(@C6003d File file, @C6003d String str, @C6003d Charset charset) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, "text");
        C14445h0.m62478f(charset, HttpRequest.f42450O);
        byte[] bytes = str.getBytes(charset);
        C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        m63785b(file, bytes);
    }

    /* renamed from: b */
    public static /* synthetic */ void m63784b(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C14664f.f42876a;
        }
        m63783b(file, str, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r0, r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63776a(@p205i.p209c.p210a.C6003d java.io.File r2, @p205i.p209c.p210a.C6003d byte[] r3) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r2, r0)
            java.lang.String r0 = "array"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x001a }
            kotlin.p0 r2 = kotlin.C14737p0.f42983a     // Catch:{ all -> 0x001a }
            r2 = 0
            kotlin.p508io.C14693b.m63699a(r0, r2)
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            kotlin.p508io.C14693b.m63699a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63776a(java.io.File, byte[]):void");
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ List m63782b(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        return m63781b(file, charset);
    }

    /* renamed from: a */
    public static final void m63771a(@C6003d File file, @C6003d String str, @C6003d Charset charset) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, "text");
        C14445h0.m62478f(charset, HttpRequest.f42450O);
        byte[] bytes = str.getBytes(charset);
        C14445h0.m62453a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        m63776a(file, bytes);
    }

    @C6003d
    /* renamed from: b */
    public static final List<String> m63781b(@C6003d File file, @C6003d Charset charset) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(charset, HttpRequest.f42450O);
        ArrayList arrayList = new ArrayList();
        m63773a(file, charset, (C6080l<? super String, C14737p0>) new C14711a<Object,C14737p0>(arrayList));
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63772a(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C14664f.f42876a;
        }
        m63771a(file, str, charset);
    }

    /* renamed from: a */
    public static final void m63775a(@C6003d File file, @C6003d C6084p<? super byte[], ? super Integer, C14737p0> pVar) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(pVar, "action");
        m63770a(file, 4096, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        kotlin.p214b1.p216u.C14427e0.m62417b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (kotlin.p213a1.C14402l.m62371a(1, 1, 0) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        kotlin.p214b1.p216u.C14427e0.m62414a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        throw r3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m63780b(java.io.File r1, java.nio.charset.Charset r2, kotlin.p214b1.p215t.C6080l r3, int r4, java.lang.Object r5) {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.nio.charset.Charset r2 = kotlin.p217i1.C14664f.f42876a
        L_0x0006:
            java.lang.String r4 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r1, r4)
            java.lang.String r4 = "charset"
            kotlin.p214b1.p216u.C14445h0.m62478f(r2, r4)
            java.lang.String r4 = "block"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r4)
            r4 = 8192(0x2000, float:1.14794E-41)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r0, r2)
            boolean r2 = r1 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0028
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1
            goto L_0x002e
        L_0x0028:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r1, r4)
            r1 = r2
        L_0x002e:
            r2 = 0
            r4 = 0
            kotlin.g1.m r0 = kotlin.p508io.C14721s.m63843a(r1)     // Catch:{ all -> 0x004c }
            java.lang.Object r3 = r3.invoke(r0)     // Catch:{ all -> 0x004c }
            kotlin.p214b1.p216u.C14427e0.m62417b(r5)
            boolean r4 = kotlin.p213a1.C14402l.m62371a(r5, r5, r4)
            if (r4 == 0) goto L_0x0045
            kotlin.p508io.C14693b.m63699a(r1, r2)
            goto L_0x0048
        L_0x0045:
            r1.close()
        L_0x0048:
            kotlin.p214b1.p216u.C14427e0.m62414a(r5)
            return r3
        L_0x004c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004e }
        L_0x004e:
            r3 = move-exception
            kotlin.p214b1.p216u.C14427e0.m62417b(r5)
            boolean r4 = kotlin.p213a1.C14402l.m62371a(r5, r5, r4)
            if (r4 != 0) goto L_0x005c
            r1.close()     // Catch:{ all -> 0x005f }
            goto L_0x005f
        L_0x005c:
            kotlin.p508io.C14693b.m63699a(r1, r2)
        L_0x005f:
            kotlin.p214b1.p216u.C14427e0.m62414a(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63780b(java.io.File, java.nio.charset.Charset, kotlin.b1.t.l, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        throw r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m63770a(@p205i.p209c.p210a.C6003d java.io.File r1, int r2, @p205i.p209c.p210a.C6003d kotlin.p214b1.p215t.C6084p<? super byte[], ? super java.lang.Integer, kotlin.C14737p0> r3) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r1, r0)
            java.lang.String r0 = "action"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r0)
            r0 = 512(0x200, float:7.175E-43)
            int r2 = kotlin.p504e1.C14534q.m62902a(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x002c }
            if (r1 > 0) goto L_0x0024
            kotlin.p0 r1 = kotlin.C14737p0.f42983a     // Catch:{ all -> 0x002c }
            r1 = 0
            kotlin.p508io.C14693b.m63699a(r0, r1)
            return
        L_0x0024:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002c }
            r3.mo24962d(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0017
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            kotlin.p508io.C14693b.m63699a(r0, r1)
            goto L_0x0034
        L_0x0033:
            throw r2
        L_0x0034:
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63770a(java.io.File, int, kotlin.b1.t.p):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        kotlin.p214b1.p216u.C14427e0.m62417b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (kotlin.p213a1.C14402l.m62371a(1, 1, 0) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0057, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        kotlin.p214b1.p216u.C14427e0.m62414a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw r5;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m63779b(@p205i.p209c.p210a.C6003d java.io.File r3, @p205i.p209c.p210a.C6003d java.nio.charset.Charset r4, @p205i.p209c.p210a.C6003d kotlin.p214b1.p215t.C6080l<? super kotlin.p506g1.C14594m<java.lang.String>, ? extends T> r5) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.p214b1.p216u.C14445h0.m62478f(r4, r0)
            java.lang.String r0 = "block"
            kotlin.p214b1.p216u.C14445h0.m62478f(r5, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r3.<init>(r0, r4)
            boolean r4 = r3 instanceof java.io.BufferedReader
            if (r4 == 0) goto L_0x0020
            java.io.BufferedReader r3 = (java.io.BufferedReader) r3
            goto L_0x0028
        L_0x0020:
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r0 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r3, r0)
            r3 = r4
        L_0x0028:
            r4 = 0
            r0 = 0
            r1 = 1
            kotlin.g1.m r2 = kotlin.p508io.C14721s.m63843a(r3)     // Catch:{ all -> 0x0047 }
            java.lang.Object r5 = r5.invoke(r2)     // Catch:{ all -> 0x0047 }
            kotlin.p214b1.p216u.C14427e0.m62417b(r1)
            boolean r0 = kotlin.p213a1.C14402l.m62371a(r1, r1, r0)
            if (r0 == 0) goto L_0x0040
            kotlin.p508io.C14693b.m63699a(r3, r4)
            goto L_0x0043
        L_0x0040:
            r3.close()
        L_0x0043:
            kotlin.p214b1.p216u.C14427e0.m62414a(r1)
            return r5
        L_0x0047:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r5 = move-exception
            kotlin.p214b1.p216u.C14427e0.m62417b(r1)
            boolean r0 = kotlin.p213a1.C14402l.m62371a(r1, r1, r0)
            if (r0 != 0) goto L_0x0057
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0057:
            kotlin.p508io.C14693b.m63699a(r3, r4)
        L_0x005a:
            kotlin.p214b1.p216u.C14427e0.m62414a(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14710l.m63779b(java.io.File, java.nio.charset.Charset, kotlin.b1.t.l):java.lang.Object");
    }

    /* renamed from: a */
    public static /* synthetic */ void m63774a(File file, Charset charset, C6080l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C14664f.f42876a;
        }
        m63773a(file, charset, lVar);
    }

    /* renamed from: a */
    public static final void m63773a(@C6003d File file, @C6003d Charset charset, @C6003d C6080l<? super String, C14737p0> lVar) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(charset, HttpRequest.f42450O);
        C14445h0.m62478f(lVar, "action");
        C14721s.m63844a((Reader) new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }
}
