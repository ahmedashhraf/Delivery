package com.google.common.p190io;

import com.google.common.base.C5786c0;
import com.google.common.base.C5822s;
import com.google.common.base.C5831y;
import com.google.common.base.C7397x;
import com.google.common.collect.C7859g3;
import com.google.common.collect.C7987k6;
import com.google.common.collect.C8309z3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p276c.C6558k;
import p076c.p112d.p148d.p276c.C6562l;

@C2775a
/* renamed from: com.google.common.io.r */
/* compiled from: Files */
public final class C8401r {

    /* renamed from: a */
    private static final int f22304a = 10000;

    /* renamed from: b */
    private static final C7987k6<File> f22305b = new C8403b();

    /* renamed from: com.google.common.io.r$a */
    /* compiled from: Files */
    static class C8402a implements C8423w<List<String>> {

        /* renamed from: a */
        final List<String> f22306a = C8309z3.m39648a();

        C8402a() {
        }

        /* renamed from: a */
        public boolean mo31447a(String str) {
            this.f22306a.add(str);
            return true;
        }

        public List<String> getResult() {
            return this.f22306a;
        }
    }

    /* renamed from: com.google.common.io.r$b */
    /* compiled from: Files */
    static class C8403b extends C7987k6<File> {
        C8403b() {
        }

        /* renamed from: a */
        public Iterable<File> mo30744b(File file) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    return Collections.unmodifiableList(Arrays.asList(listFiles));
                }
            }
            return Collections.emptyList();
        }

        public String toString() {
            return "Files.fileTreeTraverser()";
        }
    }

    /* renamed from: com.google.common.io.r$c */
    /* compiled from: Files */
    private static final class C8404c extends C8352e {

        /* renamed from: a */
        private final File f22307a;

        /* renamed from: b */
        private final C7859g3<C8400q> f22308b;

        /* synthetic */ C8404c(File file, C8400q[] qVarArr, C8402a aVar) {
            this(file, qVarArr);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Files.asByteSink(");
            sb.append(this.f22307a);
            sb.append(", ");
            sb.append(this.f22308b);
            sb.append(")");
            return sb.toString();
        }

        private C8404c(File file, C8400q... qVarArr) {
            this.f22307a = (File) C7397x.m35664a(file);
            this.f22308b = C7859g3.m37508a((E[]) qVarArr);
        }

        /* renamed from: c */
        public FileOutputStream m39970c() throws IOException {
            return new FileOutputStream(this.f22307a, this.f22308b.contains(C8400q.APPEND));
        }
    }

    /* renamed from: com.google.common.io.r$d */
    /* compiled from: Files */
    private static final class C8405d extends C8358f {

        /* renamed from: c */
        private final File f22309c;

        /* synthetic */ C8405d(File file, C8402a aVar) {
            this(file);
        }

        /* renamed from: e */
        public byte[] mo31460e() throws IOException {
            C8390m a = C8390m.m39900a();
            try {
                FileInputStream fileInputStream = (FileInputStream) a.mo31523a(m39972d());
                byte[] a2 = C8401r.m39943a((InputStream) fileInputStream, fileInputStream.getChannel().size());
                a.close();
                return a2;
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }

        /* renamed from: f */
        public long mo31461f() throws IOException {
            if (this.f22309c.isFile()) {
                return this.f22309c.length();
            }
            throw new FileNotFoundException(this.f22309c.toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Files.asByteSource(");
            sb.append(this.f22309c);
            sb.append(")");
            return sb.toString();
        }

        private C8405d(File file) {
            this.f22309c = (File) C7397x.m35664a(file);
        }

        /* renamed from: d */
        public FileInputStream m39972d() throws IOException {
            return new FileInputStream(this.f22309c);
        }
    }

    /* renamed from: com.google.common.io.r$e */
    /* compiled from: Files */
    private enum C8406e implements C5831y<File> {
        IS_DIRECTORY {
            /* renamed from: a */
            public boolean apply(File file) {
                return file.isDirectory();
            }

            public String toString() {
                return "Files.isDirectory()";
            }
        },
        IS_FILE {
            /* renamed from: a */
            public boolean apply(File file) {
                return file.isFile();
            }

            public String toString() {
                return "Files.isFile()";
            }
        };
    }

    private C8401r() {
    }

    /* renamed from: a */
    public static C8358f m39923a(File file) {
        return new C8405d(file, null);
    }

    /* renamed from: b */
    public static BufferedReader m39946b(File file, Charset charset) throws FileNotFoundException {
        C7397x.m35664a(file);
        C7397x.m35664a(charset);
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
    }

    @Deprecated
    /* renamed from: c */
    public static C8421u<InputStreamReader> m39952c(File file, Charset charset) {
        return C8383k.m39875a(m39925a(file, charset));
    }

    /* renamed from: d */
    public static BufferedWriter m39958d(File file, Charset charset) throws FileNotFoundException {
        C7397x.m35664a(file);
        C7397x.m35664a(charset);
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
    }

    @Deprecated
    /* renamed from: e */
    public static C8349c0<FileOutputStream> m39959e(File file) {
        return m39921a(file, false);
    }

    /* renamed from: f */
    public static byte[] m39962f(File file) throws IOException {
        return m39923a(file).mo31460e();
    }

    /* renamed from: g */
    public static void m39964g(File file) throws IOException {
        C7397x.m35664a(file);
        if (!file.createNewFile() && !file.setLastModified(System.currentTimeMillis())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to update modification time of ");
            sb.append(file);
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: h */
    public static String m39965h(File file, Charset charset) throws IOException {
        return m39925a(file, charset).mo31500e();
    }

    /* renamed from: a */
    static byte[] m39943a(InputStream inputStream, long j) throws IOException {
        if (j <= 2147483647L) {
            return j == 0 ? C8366g.m39810a(inputStream) : C8366g.m39811a(inputStream, (int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("file is too large to fit in a byte array: ");
        sb.append(j);
        sb.append(" bytes");
        throw new OutOfMemoryError(sb.toString());
    }

    /* renamed from: c */
    public static void m39955c(File file, File file2) throws IOException {
        C7397x.m35664a(file);
        C7397x.m35664a(file2);
        C7397x.m35672a(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (!file.renameTo(file2)) {
            m39936a(file, file2);
            if (!file.delete()) {
                String str = "Unable to delete ";
                if (!file2.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(file);
                throw new IOException(sb2.toString());
            }
        }
    }

    @Deprecated
    /* renamed from: e */
    public static C8349c0<OutputStreamWriter> m39960e(File file, Charset charset) {
        return m39920a(file, charset, false);
    }

    /* renamed from: f */
    public static String m39961f(File file, Charset charset) throws IOException {
        return m39925a(file, charset).mo31501f();
    }

    /* renamed from: a */
    public static C8352e m39922a(File file, C8400q... qVarArr) {
        return new C8404c(file, qVarArr, null);
    }

    /* renamed from: b */
    public static void m39949b(CharSequence charSequence, File file, Charset charset) throws IOException {
        m39924a(file, charset, new C8400q[0]).mo31491a(charSequence);
    }

    @Deprecated
    /* renamed from: d */
    public static C8421u<FileInputStream> m39957d(File file) {
        return C8366g.m39799a(m39923a(file));
    }

    /* renamed from: g */
    public static List<String> m39963g(File file, Charset charset) throws IOException {
        return (List) m39928a(file, charset, (C8423w<T>) new C8402a<T>());
    }

    /* renamed from: a */
    public static C8377j m39925a(File file, Charset charset) {
        return m39923a(file).mo31454a(charset);
    }

    /* renamed from: b */
    public static boolean m39950b(File file, File file2) throws IOException {
        C7397x.m35664a(file);
        C7397x.m35664a(file2);
        if (file == file2 || file.equals(file2)) {
            return true;
        }
        long length = file.length();
        long length2 = file2.length();
        if (length == 0 || length2 == 0 || length == length2) {
            return m39923a(file).mo31457a(m39923a(file2));
        }
        return false;
    }

    /* renamed from: d */
    public static C5831y<File> m39956d() {
        return C8406e.IS_FILE;
    }

    /* renamed from: a */
    public static C8376i m39924a(File file, Charset charset, C8400q... qVarArr) {
        return m39922a(file, qVarArr).mo31442a(charset);
    }

    @Deprecated
    /* renamed from: a */
    public static C8349c0<FileOutputStream> m39921a(File file, boolean z) {
        return C8366g.m39793a(m39922a(file, m39944a(z)));
    }

    /* renamed from: a */
    private static C8400q[] m39944a(boolean z) {
        if (!z) {
            return new C8400q[0];
        }
        return new C8400q[]{C8400q.APPEND};
    }

    @Deprecated
    /* renamed from: a */
    public static C8349c0<OutputStreamWriter> m39920a(File file, Charset charset, boolean z) {
        return C8383k.m39872a(m39924a(file, charset, m39944a(z)));
    }

    @Deprecated
    /* renamed from: a */
    public static void m39933a(C8421u<? extends InputStream> uVar, File file) throws IOException {
        C8366g.m39798a(uVar).mo31450a(m39922a(file, new C8400q[0]));
    }

    /* renamed from: a */
    public static void m39942a(byte[] bArr, File file) throws IOException {
        m39922a(file, new C8400q[0]).mo31443a(bArr);
    }

    /* renamed from: b */
    public static void m39948b(File file) throws IOException {
        C7397x.m35664a(file);
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to create parent directories of ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }
    }

    /* renamed from: c */
    public static MappedByteBuffer m39954c(File file) throws IOException {
        C7397x.m35664a(file);
        return m39930a(file, MapMode.READ_ONLY);
    }

    @Deprecated
    /* renamed from: a */
    public static void m39935a(File file, C8349c0<? extends OutputStream> c0Var) throws IOException {
        m39923a(file).mo31450a(C8366g.m39797a(c0Var));
    }

    /* renamed from: a */
    public static void m39937a(File file, OutputStream outputStream) throws IOException {
        m39923a(file).mo31451a(outputStream);
    }

    /* renamed from: c */
    public static String m39953c(String str) {
        String str2;
        C7397x.m35664a(str);
        String str3 = ".";
        if (str.length() == 0) {
            return str3;
        }
        Iterable<String> a = C5786c0.m25366b('/').mo23072a().mo23075a((CharSequence) str);
        ArrayList arrayList = new ArrayList();
        for (String str4 : a) {
            if (!str4.equals(str3)) {
                String str5 = "..";
                if (!str4.equals(str5)) {
                    arrayList.add(str4);
                } else if (arrayList.size() <= 0 || ((String) arrayList.get(arrayList.size() - 1)).equals(str5)) {
                    arrayList.add(str5);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        String a2 = C5822s.m25522a('/').mo23119a((Iterable<?>) arrayList);
        String str6 = "/";
        if (str.charAt(0) == '/') {
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append(a2);
            str2 = sb.toString();
        } else {
            str2 = a2;
        }
        while (str2.startsWith("/../")) {
            str2 = str2.substring(3);
        }
        if (str2.equals("/..")) {
            str2 = str6;
        } else if ("".equals(str2)) {
            str2 = str3;
        }
        return str2;
    }

    /* renamed from: a */
    public static void m39936a(File file, File file2) throws IOException {
        C7397x.m35672a(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        m39923a(file).mo31450a(m39922a(file2, new C8400q[0]));
    }

    @Deprecated
    /* renamed from: a */
    public static <R extends Readable & Closeable> void m39934a(C8421u<R> uVar, File file, Charset charset) throws IOException {
        C8383k.m39874a(uVar).mo31495a(m39924a(file, charset, new C8400q[0]));
    }

    /* renamed from: b */
    public static String m39947b(String str) {
        C7397x.m35664a(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf == -1 ? name : name.substring(0, lastIndexOf);
    }

    /* renamed from: a */
    public static void m39940a(CharSequence charSequence, File file, Charset charset) throws IOException {
        m39941a(charSequence, file, charset, true);
    }

    /* renamed from: a */
    private static void m39941a(CharSequence charSequence, File file, Charset charset, boolean z) throws IOException {
        m39924a(file, charset, m39944a(z)).mo31491a(charSequence);
    }

    @Deprecated
    /* renamed from: a */
    public static <W extends Appendable & Closeable> void m39938a(File file, Charset charset, C8349c0<W> c0Var) throws IOException {
        m39925a(file, charset).mo31495a(C8383k.m39873a(c0Var));
    }

    /* renamed from: a */
    public static void m39939a(File file, Charset charset, Appendable appendable) throws IOException {
        m39925a(file, charset).mo31496a(appendable);
    }

    /* renamed from: b */
    public static C7987k6<File> m39945b() {
        return f22305b;
    }

    /* renamed from: a */
    public static File m39926a() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("-");
        String sb2 = sb.toString();
        for (int i = 0; i < 10000; i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(i);
            File file2 = new File(file, sb3.toString());
            if (file2.mkdir()) {
                return file2;
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Failed to create directory within 10000 attempts (tried ");
        sb4.append(sb2);
        sb4.append("0 to ");
        sb4.append(sb2);
        sb4.append(9999);
        sb4.append(')');
        throw new IllegalStateException(sb4.toString());
    }

    /* renamed from: a */
    public static <T> T m39928a(File file, Charset charset, C8423w<T> wVar) throws IOException {
        return C8383k.m39883a(m39952c(file, charset), wVar);
    }

    /* renamed from: a */
    public static <T> T m39927a(File file, C8350d<T> dVar) throws IOException {
        return C8366g.m39805a(m39957d(file), dVar);
    }

    /* renamed from: a */
    public static C6558k m39919a(File file, C6562l lVar) throws IOException {
        return m39923a(file).mo31452a(lVar);
    }

    /* renamed from: a */
    public static MappedByteBuffer m39930a(File file, MapMode mapMode) throws IOException {
        C7397x.m35664a(file);
        C7397x.m35664a(mapMode);
        if (file.exists()) {
            return m39931a(file, mapMode, file.length());
        }
        throw new FileNotFoundException(file.toString());
    }

    /* renamed from: c */
    public static C5831y<File> m39951c() {
        return C8406e.IS_DIRECTORY;
    }

    /* renamed from: a */
    public static MappedByteBuffer m39931a(File file, MapMode mapMode, long j) throws FileNotFoundException, IOException {
        C7397x.m35664a(file);
        C7397x.m35664a(mapMode);
        C8390m a = C8390m.m39900a();
        try {
            MappedByteBuffer a2 = m39932a((RandomAccessFile) a.mo31523a(new RandomAccessFile(file, mapMode == MapMode.READ_ONLY ? AckRequest.ELEMENT : "rw")), mapMode, j);
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static MappedByteBuffer m39932a(RandomAccessFile randomAccessFile, MapMode mapMode, long j) throws IOException {
        C8390m a = C8390m.m39900a();
        try {
            MappedByteBuffer map = ((FileChannel) a.mo31523a(randomAccessFile.getChannel())).map(mapMode, 0, j);
            a.close();
            return map;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public static String m39929a(String str) {
        C7397x.m35664a(str);
        String name = new File(str).getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return name.substring(lastIndexOf + 1);
    }
}
