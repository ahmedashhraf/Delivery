package omrecorder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: omrecorder.n */
/* compiled from: Wav */
final class C15062n extends C15033a {
    public C15062n(C15044h hVar, File file) {
        super(hVar, file);
    }

    /* renamed from: e */
    private void m66738e() throws IOException {
        RandomAccessFile a = m66737a(this.f43754b);
        a.seek(0);
        a.write(new C15063o(this.f43753a.mo46701a(), this.f43754b.length()).mo46718a());
        a.close();
    }

    /* renamed from: a */
    public void mo46684a() {
        try {
            super.mo46684a();
            m66738e();
        } catch (IOException e) {
            throw new RuntimeException("Error in applying wav header", e);
        }
    }

    /* renamed from: a */
    private RandomAccessFile m66737a(File file) {
        try {
            return new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
