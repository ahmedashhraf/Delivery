package p212io.fabric.sdk.android.p493p.p496c;

import android.content.Context;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14269u;

/* renamed from: io.fabric.sdk.android.p.c.m */
/* compiled from: QueueFileEventStorage */
public class C14297m implements C14291g {

    /* renamed from: a */
    private final Context f42144a;

    /* renamed from: b */
    private final File f42145b;

    /* renamed from: c */
    private final String f42146c;

    /* renamed from: d */
    private final File f42147d;

    /* renamed from: e */
    private C14269u f42148e = new C14269u(this.f42147d);

    /* renamed from: f */
    private File f42149f;

    public C14297m(Context context, File file, String str, String str2) throws IOException {
        this.f42144a = context;
        this.f42145b = file;
        this.f42146c = str2;
        this.f42147d = new File(this.f42145b, str);
        m61967g();
    }

    /* renamed from: g */
    private void m61967g() {
        this.f42149f = new File(this.f42145b, this.f42146c);
        if (!this.f42149f.exists()) {
            this.f42149f.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo45233a(byte[] bArr) throws IOException {
        this.f42148e.mo45181a(bArr);
    }

    /* renamed from: b */
    public boolean mo45235b() {
        return this.f42148e.mo45186d();
    }

    /* renamed from: c */
    public List<File> mo45236c() {
        return Arrays.asList(this.f42149f.listFiles());
    }

    /* renamed from: d */
    public File mo45237d() {
        return this.f42149f;
    }

    /* renamed from: e */
    public File mo45238e() {
        return this.f42145b;
    }

    /* renamed from: f */
    public void mo45239f() {
        try {
            this.f42148e.close();
        } catch (IOException unused) {
        }
        this.f42147d.delete();
    }

    /* renamed from: a */
    public int mo45229a() {
        return this.f42148e.mo45188f();
    }

    /* renamed from: a */
    public void mo45231a(String str) throws IOException {
        this.f42148e.close();
        m61966a(this.f42147d, new File(this.f42149f, str));
        this.f42148e = new C14269u(this.f42147d);
    }

    /* renamed from: a */
    private void m61966a(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        String str = "Failed to close output stream";
        String str2 = "Failed to close file input stream";
        OutputStream outputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                outputStream = mo45240a(file2);
                C14248i.m61817a((InputStream) fileInputStream, outputStream, new byte[1024]);
                C14248i.m61815a((Closeable) fileInputStream, str2);
                C14248i.m61815a((Closeable) outputStream, str);
                file.delete();
            } catch (Throwable th) {
                th = th;
                C14248i.m61815a((Closeable) fileInputStream, str2);
                C14248i.m61815a((Closeable) outputStream, str);
                file.delete();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            C14248i.m61815a((Closeable) fileInputStream, str2);
            C14248i.m61815a((Closeable) outputStream, str);
            file.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public OutputStream mo45240a(File file) throws IOException {
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public List<File> mo45230a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f42149f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo45232a(List<File> list) {
        for (File file : list) {
            C14248i.m61829c(this.f42144a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: a */
    public boolean mo45234a(int i, int i2) {
        return this.f42148e.mo45183a(i, i2);
    }
}
