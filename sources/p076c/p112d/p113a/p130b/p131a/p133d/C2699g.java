package p076c.p112d.p113a.p130b.p131a.p133d;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.play.core.internal.C5732a0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: c.d.a.b.a.d.g */
public final class C2699g {

    /* renamed from: a */
    private final File f9820a;

    /* renamed from: b */
    private final long f9821b;

    public C2699g(Context context) throws IOException, NameNotFoundException {
        this(context.getFilesDir(), (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
    }

    private C2699g(File file, long j) {
        String absolutePath = file.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 82);
        sb.append("FileStorage: initializing (files directory = ");
        sb.append(absolutePath);
        sb.append(", versionCode = ");
        sb.append(j);
        sb.append(")");
        sb.toString();
        this.f9820a = file;
        this.f9821b = j;
    }

    /* renamed from: c */
    private static File m13094c(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (file.isDirectory()) {
                return file;
            }
            String str = "Unable to create directory: ";
            String valueOf = String.valueOf(file.getAbsolutePath());
            throw new IOException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        } else if (file.isDirectory()) {
            return file;
        } else {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: d */
    private static void m13095d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File d : listFiles) {
                    m13095d(d);
                }
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: f */
    private final File m13096f() throws IOException {
        return m13094c(new File(m13097g(), "verified-splits"));
    }

    /* renamed from: g */
    private final File m13097g() throws IOException {
        return m13094c(new File(m13099h(), Long.toString(this.f9821b)));
    }

    /* renamed from: g */
    private final File m13098g(String str) throws IOException {
        return m13094c(new File(m13101i(), str));
    }

    /* renamed from: h */
    private final File m13099h() throws IOException {
        return m13094c(new File(this.f9820a, "splitcompat"));
    }

    /* renamed from: h */
    private static String m13100h(String str) {
        String valueOf = String.valueOf(str);
        String str2 = ".apk";
        return str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
    }

    /* renamed from: i */
    private final File m13101i() throws IOException {
        return m13094c(new File(m13097g(), "native-libraries"));
    }

    /* renamed from: a */
    public final File mo10367a(File file) throws IOException {
        return new File(m13096f(), file.getName());
    }

    /* renamed from: a */
    public final File mo10368a(String str) throws IOException {
        return new File(mo10374c(), m13100h(str));
    }

    /* renamed from: a */
    public final File mo10369a(String str, String str2) throws IOException {
        return new File(m13098g(str), str2);
    }

    /* renamed from: a */
    public final void mo10370a() throws IOException {
        File h = m13099h();
        String[] list = h.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f9821b))) {
                    File file = new File(h, str);
                    String valueOf = String.valueOf(file);
                    long j = this.f9821b;
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(valueOf);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    sb.toString();
                    m13095d(file);
                }
            }
        }
    }

    /* renamed from: b */
    public final File mo10371b() throws IOException {
        return new File(m13097g(), "lock.tmp");
    }

    /* renamed from: b */
    public final File mo10372b(String str) throws IOException {
        return new File(m13096f(), m13100h(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo10373b(File file) throws IOException {
        C5732a0.m25205a(file.getParentFile().getParentFile().equals(m13101i()), (Object) "File to remove is not a native library");
        m13095d(file);
    }

    /* renamed from: c */
    public final File mo10374c() throws IOException {
        return m13094c(new File(m13097g(), "unverified-splits"));
    }

    /* renamed from: c */
    public final File mo10375c(String str) throws IOException {
        return m13094c(new File(m13094c(new File(m13097g(), "dex")), str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<C2711s> mo10376d() throws IOException {
        File f = m13096f();
        HashSet hashSet = new HashSet();
        File[] listFiles = f.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile() && file.getName().endsWith(".apk")) {
                    String name = file.getName();
                    hashSet.add(new C2695c(file, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo10377d(String str) throws IOException {
        m13095d(m13098g(str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final List<String> mo10378e() throws IOException {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = m13101i().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final Set<File> mo10379e(String str) throws IOException {
        HashSet hashSet = new HashSet();
        File[] listFiles = m13098g(str).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (file.isFile()) {
                    hashSet.add(file);
                }
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo10380f(String str) throws IOException {
        m13095d(mo10372b(str));
    }
}
