package androidx.core.p033k;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: androidx.core.k.a */
/* compiled from: AtomicFile */
public class C0933a {

    /* renamed from: a */
    private final File f4239a;

    /* renamed from: b */
    private final File f4240b;

    public C0933a(@C0193h0 File file) {
        this.f4239a = file;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".bak");
        this.f4240b = new File(sb.toString());
    }

    /* renamed from: a */
    public void mo4729a() {
        this.f4239a.delete();
        this.f4240b.delete();
    }

    @C0193h0
    /* renamed from: b */
    public File mo4731b() {
        return this.f4239a;
    }

    @C0193h0
    /* renamed from: c */
    public FileInputStream mo4733c() throws FileNotFoundException {
        if (this.f4240b.exists()) {
            this.f4239a.delete();
            this.f4240b.renameTo(this.f4239a);
        }
        return new FileInputStream(this.f4239a);
    }

    @C0193h0
    /* renamed from: d */
    public byte[] mo4734d() throws IOException {
        FileInputStream c = mo4733c();
        try {
            byte[] bArr = new byte[c.available()];
            int i = 0;
            while (true) {
                int read = c.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = c.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[(available + i)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            c.close();
        }
    }

    @C0193h0
    /* renamed from: e */
    public FileOutputStream mo4735e() throws IOException {
        if (this.f4239a.exists()) {
            if (this.f4240b.exists()) {
                this.f4239a.delete();
            } else if (!this.f4239a.renameTo(this.f4240b)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't rename file ");
                sb.append(this.f4239a);
                sb.append(" to backup file ");
                sb.append(this.f4240b);
                sb.toString();
            }
        }
        try {
            return new FileOutputStream(this.f4239a);
        } catch (FileNotFoundException unused) {
            if (this.f4239a.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f4239a);
                } catch (FileNotFoundException unused2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Couldn't create ");
                    sb2.append(this.f4239a);
                    throw new IOException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Couldn't create directory ");
                sb3.append(this.f4239a);
                throw new IOException(sb3.toString());
            }
        }
    }

    /* renamed from: b */
    public void mo4732b(@C0195i0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m5315c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f4240b.delete();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo4730a(@C0195i0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            m5315c(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f4239a.delete();
                this.f4240b.renameTo(this.f4239a);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    private static boolean m5315c(@C0193h0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }
}
