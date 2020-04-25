package omrecorder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: omrecorder.a */
/* compiled from: AbstractRecorder */
public abstract class C15033a implements C15056j {

    /* renamed from: a */
    protected final C15044h f43753a;

    /* renamed from: b */
    protected final File f43754b;

    /* renamed from: c */
    private final ExecutorService f43755c = Executors.newSingleThreadExecutor();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public OutputStream f43756d;

    /* renamed from: e */
    private final Runnable f43757e = new C15034a();

    /* renamed from: omrecorder.a$a */
    /* compiled from: AbstractRecorder */
    class C15034a implements Runnable {
        C15034a() {
        }

        public void run() {
            try {
                C15033a.this.f43753a.mo46702a(C15033a.this.f43756d);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (IllegalStateException e2) {
                throw new RuntimeException("AudioRecord state has uninitialized state", e2);
            }
        }
    }

    protected C15033a(C15044h hVar, File file) {
        this.f43753a = hVar;
        this.f43754b = file;
    }

    /* renamed from: b */
    public void mo46685b() {
        this.f43753a.mo46701a().mo46709a(true);
        this.f43755c.submit(this.f43757e);
    }

    /* renamed from: c */
    public void mo46686c() {
        this.f43756d = m66664a(this.f43754b);
        this.f43755c.submit(this.f43757e);
    }

    /* renamed from: d */
    public void mo46687d() {
        this.f43753a.mo46701a().mo46709a(false);
    }

    /* renamed from: a */
    private OutputStream m66664a(File file) {
        if (file != null) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("could not build OutputStream from this file ");
                sb.append(file.getName());
                throw new RuntimeException(sb.toString(), e);
            }
        } else {
            throw new RuntimeException("file is null !");
        }
    }

    /* renamed from: a */
    public void mo46684a() throws IOException {
        this.f43753a.stop();
        this.f43756d.flush();
        this.f43756d.close();
    }
}
