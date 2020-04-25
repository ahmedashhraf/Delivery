package okhttp3.internal.p518i;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p470h.C13883a0;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.i.a */
/* compiled from: FileSystem */
public interface C15000a {

    /* renamed from: a */
    public static final C15000a f43609a = new C15001a();

    /* renamed from: okhttp3.internal.i.a$a */
    /* compiled from: FileSystem */
    class C15001a implements C15000a {
        C15001a() {
        }

        /* renamed from: a */
        public C13883a0 mo46605a(File file) throws FileNotFoundException {
            return C13906p.m59750c(file);
        }

        /* renamed from: b */
        public C13924z mo46607b(File file) throws FileNotFoundException {
            try {
                return C13906p.m59749b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13906p.m59749b(file);
            }
        }

        /* renamed from: c */
        public void mo46608c(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo46608c(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("failed to delete ");
                        sb.append(file2);
                        throw new IOException(sb.toString());
                    }
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("not a readable directory: ");
            sb2.append(file);
            throw new IOException(sb2.toString());
        }

        /* renamed from: d */
        public boolean mo46609d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo46610e(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to delete ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
        }

        /* renamed from: f */
        public C13924z mo46611f(File file) throws FileNotFoundException {
            try {
                return C13906p.m59741a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C13906p.m59741a(file);
            }
        }

        /* renamed from: g */
        public long mo46612g(File file) {
            return file.length();
        }

        /* renamed from: a */
        public void mo46606a(File file, File file2) throws IOException {
            mo46610e(file2);
            if (!file.renameTo(file2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("failed to rename ");
                sb.append(file);
                sb.append(" to ");
                sb.append(file2);
                throw new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    C13883a0 mo46605a(File file) throws FileNotFoundException;

    /* renamed from: a */
    void mo46606a(File file, File file2) throws IOException;

    /* renamed from: b */
    C13924z mo46607b(File file) throws FileNotFoundException;

    /* renamed from: c */
    void mo46608c(File file) throws IOException;

    /* renamed from: d */
    boolean mo46609d(File file);

    /* renamed from: e */
    void mo46610e(File file) throws IOException;

    /* renamed from: f */
    C13924z mo46611f(File file) throws FileNotFoundException;

    /* renamed from: g */
    long mo46612g(File file);
}
