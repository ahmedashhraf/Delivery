package kotlin.p508io;

import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.internal.FacebookRequestErrorClassification;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C14737p0;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import org.apache.http.cookie.C15222a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a(\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a(\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, mo24990d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/io/FilesKt")
/* renamed from: kotlin.io.n */
/* compiled from: Utils.kt */
class C14713n extends C14712m {

    /* renamed from: kotlin.io.n$a */
    /* compiled from: Utils.kt */
    static final class C14714a extends C14448i0 implements C6084p {

        /* renamed from: a */
        public static final C14714a f42960a = new C14714a();

        C14714a() {
            super(2);
        }

        @C6003d
        /* renamed from: a */
        public final Void mo24962d(@C6003d File file, @C6003d IOException iOException) {
            C14445h0.m62478f(file, "<anonymous parameter 0>");
            C14445h0.m62478f(iOException, "exception");
            throw iOException;
        }
    }

    /* renamed from: kotlin.io.n$b */
    /* compiled from: Utils.kt */
    static final class C14715b extends C14448i0 implements C6084p<File, IOException, C14737p0> {

        /* renamed from: a */
        final /* synthetic */ C6084p f42961a;

        C14715b(C6084p pVar) {
            this.f42961a = pVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo45969a(@C6003d File file, @C6003d IOException iOException) {
            C14445h0.m62478f(file, "f");
            C14445h0.m62478f(iOException, "e");
            if (((C14718p) this.f42961a.mo24962d(file, iOException)) == C14718p.TERMINATE) {
                throw new C14720r(file);
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo24962d(Object obj, Object obj2) {
            mo45969a((File) obj, (IOException) obj2);
            return C14737p0.f42983a;
        }
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ File m63803a(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m63802a(str, str2, file);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ File m63813b(String str, String str2, File file, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "tmp";
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            file = null;
        }
        return m63812b(str, str2, file);
    }

    @C6004e
    /* renamed from: c */
    public static final File m63814c(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, "base");
        String i = m63824i(file, file2);
        if (i != null) {
            return new File(i);
        }
        return null;
    }

    @C6003d
    /* renamed from: d */
    public static final File m63816d(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, "base");
        String i = m63824i(file, file2);
        return i != null ? new File(i) : file;
    }

    @C6003d
    /* renamed from: e */
    public static final File m63818e(@C6003d File file, @C6003d File file2) {
        File file3;
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, Constants.PATH_TYPE_RELATIVE);
        if (C14709k.m63764c(file2)) {
            return file2;
        }
        String file4 = file.toString();
        C14445h0.m62453a((Object) file4, "baseName");
        if ((file4.length() == 0) || C6112z.m28032b((CharSequence) file4, File.separatorChar, false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(file4);
            sb.append(file2);
            file3 = new File(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file4);
            sb2.append(File.separatorChar);
            sb2.append(file2);
            file3 = new File(sb2.toString());
        }
        return file3;
    }

    @C6003d
    /* renamed from: f */
    public static final File m63819f(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, Constants.PATH_TYPE_RELATIVE);
        C14698f d = C14709k.m63765d(file);
        return m63818e(m63818e(d.mo45953c(), d.mo45957f() == 0 ? new File("..") : d.mo45950a(0, d.mo45957f() - 1)), file2);
    }

    /* renamed from: g */
    public static final boolean m63820g(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, FacebookRequestErrorClassification.KEY_OTHER);
        C14698f d = C14709k.m63765d(file);
        C14698f d2 = C14709k.m63765d(file2);
        boolean z = false;
        if (!C14445h0.m62463a((Object) d.mo45953c(), (Object) d2.mo45953c())) {
            return false;
        }
        if (d.mo45957f() >= d2.mo45957f()) {
            z = d.mo45955e().subList(0, d2.mo45957f()).equals(d2.mo45955e());
        }
        return z;
    }

    @C6003d
    /* renamed from: h */
    public static final String m63821h(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, "base");
        String i = m63824i(file, file2);
        if (i != null) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("this and base files have different roots: ");
        sb.append(file);
        sb.append(" and ");
        sb.append(file2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    @C6003d
    /* renamed from: i */
    public static final String m63823i(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        String name = file.getName();
        C14445h0.m62453a((Object) name, "name");
        return C6112z.m28009b(name, '.', "");
    }

    @C6003d
    /* renamed from: j */
    public static final String m63825j(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        char c = File.separatorChar;
        String str = C15222a.f44141w;
        if (c != '/') {
            String path = file.getPath();
            C14445h0.m62453a((Object) path, str);
            return C6111y.m27877a(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        C14445h0.m62453a((Object) path2, str);
        return path2;
    }

    @C6003d
    /* renamed from: k */
    public static final String m63826k(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        String name = file.getName();
        C14445h0.m62453a((Object) name, "name");
        return C6112z.m28072e(name, ".", (String) null, 2, (Object) null);
    }

    @C6003d
    /* renamed from: l */
    public static final File m63827l(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        C14698f d = C14709k.m63765d(file);
        File c = d.mo45953c();
        List a = m63804a(d.mo45955e());
        String str = File.separator;
        C14445h0.m62453a((Object) str, "File.separator");
        return m63811b(c, C14848z.m65690a(a, str, null, null, 0, null, null, 62, null));
    }

    @C6003d
    /* renamed from: a */
    public static final File m63802a(@C6003d String str, @C6004e String str2, @C6004e File file) {
        C14445h0.m62478f(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            C14445h0.m62453a((Object) createTempFile, "dir");
            return createTempFile;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to create temporary directory ");
        sb.append(createTempFile);
        sb.append('.');
        throw new IOException(sb.toString());
    }

    @C6003d
    /* renamed from: b */
    public static final File m63812b(@C6003d String str, @C6004e String str2, @C6004e File file) {
        C14445h0.m62478f(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        C14445h0.m62453a((Object) createTempFile, "File.createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    @C6003d
    /* renamed from: c */
    public static final File m63815c(@C6003d File file, @C6003d String str) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, Constants.PATH_TYPE_RELATIVE);
        return m63819f(file, new File(str));
    }

    /* renamed from: d */
    public static final boolean m63817d(@C6003d File file, @C6003d String str) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, FacebookRequestErrorClassification.KEY_OTHER);
        return m63820g(file, new File(str));
    }

    /* renamed from: h */
    public static final boolean m63822h(@C6003d File file) {
        C14445h0.m62478f(file, "$receiver");
        Iterator it = C14712m.m63798e(file).iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: i */
    private static final String m63824i(@C6003d File file, File file2) {
        C14698f a = m63805a(C14709k.m63765d(file));
        C14698f a2 = m63805a(C14709k.m63765d(file2));
        if (!C14445h0.m62463a((Object) a.mo45953c(), (Object) a2.mo45953c())) {
            return null;
        }
        int f = a2.mo45957f();
        int f2 = a.mo45957f();
        int i = 0;
        int min = Math.min(f2, f);
        while (i < min && C14445h0.m62463a((Object) (File) a.mo45955e().get(i), (Object) (File) a2.mo45955e().get(i))) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = f - 1;
        if (i2 >= i) {
            while (true) {
                String str = "..";
                if (!C14445h0.m62463a((Object) ((File) a2.mo45955e().get(i2)).getName(), (Object) str)) {
                    sb.append(str);
                    if (i2 != i) {
                        sb.append(File.separatorChar);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2--;
                } else {
                    return null;
                }
            }
        }
        if (i < f2) {
            if (i < f) {
                sb.append(File.separatorChar);
            }
            List c = C14848z.m65737c((Iterable<? extends T>) a.mo45955e(), i);
            String str2 = File.separator;
            C14445h0.m62453a((Object) str2, "File.separator");
            C14848z.m65679a(c, sb, str2, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }

    @C6003d
    /* renamed from: b */
    public static final File m63810b(@C6003d File file, @C6003d File file2) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, "base");
        return new File(m63821h(file, file2));
    }

    @C6003d
    /* renamed from: b */
    public static final File m63811b(@C6003d File file, @C6003d String str) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, Constants.PATH_TYPE_RELATIVE);
        return m63818e(file, new File(str));
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ File m63801a(File file, File file2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 8192;
        }
        return m63800a(file, file2, z, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0066, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0069, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006a, code lost:
        kotlin.p508io.C14693b.m63699a((java.io.Closeable) r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        throw r7;
     */
    @p205i.p209c.p210a.C6003d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File m63800a(@p205i.p209c.p210a.C6003d java.io.File r6, @p205i.p209c.p210a.C6003d java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r6, r0)
            java.lang.String r0 = "target"
            kotlin.p214b1.p216u.C14445h0.m62478f(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x006e
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002d
            r0 = 1
            if (r8 != 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            boolean r8 = r7.delete()
            if (r8 != 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            kotlin.io.FileAlreadyExistsException r8 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002d:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0042
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003a
            goto L_0x005f
        L_0x003a:
            kotlin.io.FileSystemException r8 = new kotlin.io.FileSystemException
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0042:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004b
            r8.mkdirs()
        L_0x004b:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0067 }
            r6.<init>(r7)     // Catch:{ all -> 0x0067 }
            kotlin.p508io.C14691a.m63669a(r8, r6, r9)     // Catch:{ all -> 0x0060 }
            r9 = 0
            kotlin.p508io.C14693b.m63699a(r6, r9)     // Catch:{ all -> 0x0067 }
            kotlin.p508io.C14693b.m63699a(r8, r9)
        L_0x005f:
            return r7
        L_0x0060:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r9 = move-exception
            kotlin.p508io.C14693b.m63699a(r6, r7)     // Catch:{ all -> 0x0067 }
            throw r9     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r7 = move-exception
            kotlin.p508io.C14693b.m63699a(r8, r6)
            throw r7
        L_0x006e:
            kotlin.io.NoSuchFileException r7 = new kotlin.io.NoSuchFileException
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14713n.m63800a(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m63808a(File file, File file2, boolean z, C6084p pVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            pVar = C14714a.f42960a;
        }
        return m63807a(file, file2, z, pVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a0 A[Catch:{ r -> 0x00e4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m63807a(@p205i.p209c.p210a.C6003d java.io.File r11, @p205i.p209c.p210a.C6003d java.io.File r12, boolean r13, @p205i.p209c.p210a.C6003d kotlin.p214b1.p215t.C6084p<? super java.io.File, ? super java.io.IOException, ? extends kotlin.p508io.C14718p> r14) {
        /*
            java.lang.String r0 = "$receiver"
            kotlin.p214b1.p216u.C14445h0.m62478f(r11, r0)
            java.lang.String r0 = "target"
            kotlin.p214b1.p216u.C14445h0.m62478f(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.p214b1.p216u.C14445h0.m62478f(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0030
            kotlin.io.NoSuchFileException r12 = new kotlin.io.NoSuchFileException
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.mo24962d(r11, r12)
            kotlin.io.p r11 = (kotlin.p508io.C14718p) r11
            kotlin.io.p r12 = kotlin.p508io.C14718p.TERMINATE
            if (r11 == r12) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = 0
        L_0x002f:
            return r1
        L_0x0030:
            kotlin.io.g r0 = kotlin.p508io.C14712m.m63799f(r11)     // Catch:{ r -> 0x00e4 }
            kotlin.io.n$b r3 = new kotlin.io.n$b     // Catch:{ r -> 0x00e4 }
            r3.<init>(r14)     // Catch:{ r -> 0x00e4 }
            kotlin.io.g r0 = r0.mo45962a(r3)     // Catch:{ r -> 0x00e4 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ r -> 0x00e4 }
        L_0x0041:
            boolean r3 = r0.hasNext()     // Catch:{ r -> 0x00e4 }
            if (r3 == 0) goto L_0x00e3
            java.lang.Object r3 = r0.next()     // Catch:{ r -> 0x00e4 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ r -> 0x00e4 }
            boolean r4 = r3.exists()     // Catch:{ r -> 0x00e4 }
            if (r4 != 0) goto L_0x006a
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch:{ r -> 0x00e4 }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ r -> 0x00e4 }
            java.lang.Object r3 = r14.mo24962d(r3, r10)     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r3 = (kotlin.p508io.C14718p) r3     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r4 = kotlin.p508io.C14718p.TERMINATE     // Catch:{ r -> 0x00e4 }
            if (r3 != r4) goto L_0x0041
            return r2
        L_0x006a:
            java.lang.String r4 = m63821h(r3, r11)     // Catch:{ r -> 0x00e4 }
            java.io.File r5 = new java.io.File     // Catch:{ r -> 0x00e4 }
            r5.<init>(r12, r4)     // Catch:{ r -> 0x00e4 }
            boolean r4 = r5.exists()     // Catch:{ r -> 0x00e4 }
            if (r4 == 0) goto L_0x00b2
            boolean r4 = r3.isDirectory()     // Catch:{ r -> 0x00e4 }
            if (r4 == 0) goto L_0x0085
            boolean r4 = r5.isDirectory()     // Catch:{ r -> 0x00e4 }
            if (r4 != 0) goto L_0x00b2
        L_0x0085:
            if (r13 != 0) goto L_0x0089
        L_0x0087:
            r4 = 1
            goto L_0x009e
        L_0x0089:
            boolean r4 = r5.isDirectory()     // Catch:{ r -> 0x00e4 }
            if (r4 == 0) goto L_0x0096
            boolean r4 = m63822h(r5)     // Catch:{ r -> 0x00e4 }
            if (r4 != 0) goto L_0x009d
            goto L_0x0087
        L_0x0096:
            boolean r4 = r5.delete()     // Catch:{ r -> 0x00e4 }
            if (r4 != 0) goto L_0x009d
            goto L_0x0087
        L_0x009d:
            r4 = 0
        L_0x009e:
            if (r4 == 0) goto L_0x00b2
            kotlin.io.FileAlreadyExistsException r4 = new kotlin.io.FileAlreadyExistsException     // Catch:{ r -> 0x00e4 }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ r -> 0x00e4 }
            java.lang.Object r3 = r14.mo24962d(r5, r4)     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r3 = (kotlin.p508io.C14718p) r3     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r4 = kotlin.p508io.C14718p.TERMINATE     // Catch:{ r -> 0x00e4 }
            if (r3 != r4) goto L_0x0041
            return r2
        L_0x00b2:
            boolean r4 = r3.isDirectory()     // Catch:{ r -> 0x00e4 }
            if (r4 == 0) goto L_0x00bc
            r5.mkdirs()     // Catch:{ r -> 0x00e4 }
            goto L_0x0041
        L_0x00bc:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = m63801a(r4, r5, r6, r7, r8, r9)     // Catch:{ r -> 0x00e4 }
            long r4 = r4.length()     // Catch:{ r -> 0x00e4 }
            long r6 = r3.length()     // Catch:{ r -> 0x00e4 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0041
            java.io.IOException r4 = new java.io.IOException     // Catch:{ r -> 0x00e4 }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ r -> 0x00e4 }
            java.lang.Object r3 = r14.mo24962d(r3, r4)     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r3 = (kotlin.p508io.C14718p) r3     // Catch:{ r -> 0x00e4 }
            kotlin.io.p r4 = kotlin.p508io.C14718p.TERMINATE     // Catch:{ r -> 0x00e4 }
            if (r3 != r4) goto L_0x0041
            return r2
        L_0x00e3:
            return r1
        L_0x00e4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14713n.m63807a(java.io.File, java.io.File, boolean, kotlin.b1.t.p):boolean");
    }

    /* renamed from: a */
    public static final boolean m63806a(@C6003d File file, @C6003d File file2) {
        boolean z;
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(file2, FacebookRequestErrorClassification.KEY_OTHER);
        C14698f d = C14709k.m63765d(file);
        C14698f d2 = C14709k.m63765d(file2);
        if (d2.mo45958g()) {
            return C14445h0.m62463a((Object) file, (Object) file2);
        }
        int f = d.mo45957f() - d2.mo45957f();
        if (f < 0) {
            z = false;
        } else {
            z = d.mo45955e().subList(f, d.mo45957f()).equals(d2.mo45955e());
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m63809a(@C6003d File file, @C6003d String str) {
        C14445h0.m62478f(file, "$receiver");
        C14445h0.m62478f(str, FacebookRequestErrorClassification.KEY_OTHER);
        return m63806a(file, new File(str));
    }

    /* renamed from: a */
    private static final C14698f m63805a(@C6003d C14698f fVar) {
        return new C14698f(fVar.mo45953c(), m63804a(fVar.mo45955e()));
    }

    /* renamed from: a */
    private static final List<File> m63804a(@C6003d List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (name != null) {
                int hashCode = name.hashCode();
                if (hashCode != 46) {
                    if (hashCode == 1472) {
                        String str = "..";
                        if (name.equals(str)) {
                            if (arrayList.isEmpty() || !(!C14445h0.m62463a((Object) ((File) C14848z.m65809m((List<? extends T>) arrayList)).getName(), (Object) str))) {
                                arrayList.add(file);
                            } else {
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                } else if (name.equals(".")) {
                }
            }
            arrayList.add(file);
        }
        return arrayList;
    }
}
