package p053b.p061c.p062b;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.C0195i0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: b.c.b.c */
/* compiled from: RawDocumentFile */
class C2104c extends C2102a {

    /* renamed from: c */
    private File f7989c;

    C2104c(@C0195i0 C2102a aVar, File file) {
        super(aVar);
        this.f7989c = file;
    }

    @C0195i0
    /* renamed from: a */
    public C2102a mo9116a(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".");
            sb.append(extensionFromMimeType);
            str2 = sb.toString();
        }
        File file = new File(this.f7989c, str2);
        try {
            file.createNewFile();
            return new C2104c(this, file);
        } catch (IOException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to createFile: ");
            sb2.append(e);
            sb2.toString();
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo9119b() {
        return this.f7989c.canWrite();
    }

    /* renamed from: c */
    public boolean mo9120c() {
        m10922b(this.f7989c);
        return this.f7989c.delete();
    }

    /* renamed from: d */
    public boolean mo9122d() {
        return this.f7989c.exists();
    }

    /* renamed from: e */
    public String mo9123e() {
        return this.f7989c.getName();
    }

    @C0195i0
    /* renamed from: g */
    public String mo9125g() {
        if (this.f7989c.isDirectory()) {
            return null;
        }
        return m10923d(this.f7989c.getName());
    }

    /* renamed from: h */
    public Uri mo9126h() {
        return Uri.fromFile(this.f7989c);
    }

    /* renamed from: i */
    public boolean mo9127i() {
        return this.f7989c.isDirectory();
    }

    /* renamed from: j */
    public boolean mo9128j() {
        return this.f7989c.isFile();
    }

    /* renamed from: k */
    public boolean mo9129k() {
        return false;
    }

    /* renamed from: l */
    public long mo9130l() {
        return this.f7989c.lastModified();
    }

    /* renamed from: m */
    public long mo9131m() {
        return this.f7989c.length();
    }

    /* renamed from: n */
    public C2102a[] mo9132n() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f7989c.listFiles();
        if (listFiles != null) {
            for (File cVar : listFiles) {
                arrayList.add(new C2104c(this, cVar));
            }
        }
        return (C2102a[]) arrayList.toArray(new C2102a[arrayList.size()]);
    }

    /* renamed from: b */
    private static boolean m10922b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                z &= m10922b(file2);
            }
            if (!file2.delete()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to delete ");
                sb.append(file2);
                sb.toString();
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    private static String m10923d(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    /* renamed from: c */
    public boolean mo9121c(String str) {
        File file = new File(this.f7989c.getParentFile(), str);
        if (!this.f7989c.renameTo(file)) {
            return false;
        }
        this.f7989c = file;
        return true;
    }

    @C0195i0
    /* renamed from: a */
    public C2102a mo9115a(String str) {
        File file = new File(this.f7989c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new C2104c(this, file);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo9117a() {
        return this.f7989c.canRead();
    }
}
