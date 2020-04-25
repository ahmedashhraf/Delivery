package p470h;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p201f.p202a.C5952h;

/* renamed from: h.p */
/* compiled from: Okio */
public final class C13906p {

    /* renamed from: a */
    static final Logger f40387a = Logger.getLogger(C13906p.class.getName());

    /* renamed from: h.p$a */
    /* compiled from: Okio */
    class C13907a implements C13924z {

        /* renamed from: a */
        final /* synthetic */ C13885b0 f40388a;

        /* renamed from: b */
        final /* synthetic */ OutputStream f40389b;

        C13907a(C13885b0 b0Var, OutputStream outputStream) {
            this.f40388a = b0Var;
            this.f40389b = outputStream;
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            C13893d0.m59606a(cVar.f40340b, 0, j);
            while (j > 0) {
                this.f40388a.mo43831e();
                C13921w wVar = cVar.f40339a;
                int min = (int) Math.min(j, (long) (wVar.f40428c - wVar.f40427b));
                this.f40389b.write(wVar.f40426a, wVar.f40427b, min);
                wVar.f40427b += min;
                long j2 = (long) min;
                j -= j2;
                cVar.f40340b -= j2;
                if (wVar.f40427b == wVar.f40428c) {
                    cVar.f40339a = wVar.mo44032b();
                    C13922x.m59827a(wVar);
                }
            }
        }

        public void close() throws IOException {
            this.f40389b.close();
        }

        public void flush() throws IOException {
            this.f40389b.flush();
        }

        public C13885b0 timeout() {
            return this.f40388a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("sink(");
            sb.append(this.f40389b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: h.p$b */
    /* compiled from: Okio */
    class C13908b implements C13883a0 {

        /* renamed from: a */
        final /* synthetic */ C13885b0 f40390a;

        /* renamed from: b */
        final /* synthetic */ InputStream f40391b;

        C13908b(C13885b0 b0Var, InputStream inputStream) {
            this.f40390a = b0Var;
            this.f40391b = inputStream;
        }

        public void close() throws IOException {
            this.f40391b.close();
        }

        public long read(C13887c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.f40390a.mo43831e();
                    C13921w e = cVar.mo43883e(1);
                    int read = this.f40391b.read(e.f40426a, e.f40428c, (int) Math.min(j, (long) (8192 - e.f40428c)));
                    if (read == -1) {
                        return -1;
                    }
                    e.f40428c += read;
                    long j2 = (long) read;
                    cVar.f40340b += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (C13906p.m59746a(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
            }
        }

        public C13885b0 timeout() {
            return this.f40390a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("source(");
            sb.append(this.f40391b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: h.p$c */
    /* compiled from: Okio */
    class C13909c implements C13924z {
        C13909c() {
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            cVar.skip(j);
        }

        public void close() throws IOException {
        }

        public void flush() throws IOException {
        }

        public C13885b0 timeout() {
            return C13885b0.f40333d;
        }
    }

    /* renamed from: h.p$d */
    /* compiled from: Okio */
    class C13910d extends C13879a {

        /* renamed from: l */
        final /* synthetic */ Socket f40392l;

        C13910d(Socket socket) {
            this.f40392l = socket;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo43812b(@C5952h IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo43303i() {
            String str = "Failed to close timed out socket ";
            try {
                this.f40392l.close();
            } catch (Exception e) {
                Logger logger = C13906p.f40387a;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.f40392l);
                logger.log(level, sb.toString(), e);
            } catch (AssertionError e2) {
                if (C13906p.m59746a(e2)) {
                    Logger logger2 = C13906p.f40387a;
                    Level level2 = Level.WARNING;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(this.f40392l);
                    logger2.log(level2, sb2.toString(), e2);
                    return;
                }
                throw e2;
            }
        }
    }

    private C13906p() {
    }

    /* renamed from: a */
    public static C13894e m59739a(C13883a0 a0Var) {
        return new C13919v(a0Var);
    }

    @IgnoreJRERequirement
    /* renamed from: b */
    public static C13883a0 m59748b(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return m59736a(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    /* renamed from: c */
    public static C13883a0 m59750c(File file) throws FileNotFoundException {
        if (file != null) {
            return m59736a((InputStream) new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static C13892d m59738a(C13924z zVar) {
        return new C13917u(zVar);
    }

    /* renamed from: a */
    public static C13924z m59742a(OutputStream outputStream) {
        return m59743a(outputStream, new C13885b0());
    }

    /* renamed from: b */
    public static C13924z m59749b(File file) throws FileNotFoundException {
        if (file != null) {
            return m59742a((OutputStream) new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    private static C13879a m59751c(Socket socket) {
        return new C13910d(socket);
    }

    /* renamed from: a */
    private static C13924z m59743a(OutputStream outputStream, C13885b0 b0Var) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (b0Var != null) {
            return new C13907a(b0Var, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: b */
    public static C13883a0 m59747b(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            C13879a c = m59751c(socket);
            return c.mo43808a(m59737a(socket.getInputStream(), (C13885b0) c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* renamed from: a */
    public static C13924z m59744a(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            C13879a c = m59751c(socket);
            return c.mo43809a(m59743a(socket.getOutputStream(), (C13885b0) c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static C13883a0 m59736a(InputStream inputStream) {
        return m59737a(inputStream, new C13885b0());
    }

    /* renamed from: a */
    private static C13883a0 m59737a(InputStream inputStream, C13885b0 b0Var) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (b0Var != null) {
            return new C13908b(b0Var, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: a */
    public static C13924z m59741a(File file) throws FileNotFoundException {
        if (file != null) {
            return m59742a((OutputStream) new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    public static C13924z m59745a(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return m59742a(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    /* renamed from: a */
    public static C13924z m59740a() {
        return new C13909c();
    }

    /* renamed from: a */
    static boolean m59746a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
