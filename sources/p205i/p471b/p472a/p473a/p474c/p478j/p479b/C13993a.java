package p205i.p471b.p472a.p473a.p474c.p478j.p479b;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import p205i.p471b.p472a.p473a.p474c.p475i.C13944e;
import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13946g;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.C13995a;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.C13996b;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.C13997c;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e.C14002a;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f.C14016b;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f.C14025k;
import p205i.p471b.p472a.p473a.p474c.p478j.p480c.p483f.C14028n;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14033d;

/* renamed from: i.b.a.a.c.j.b.a */
/* compiled from: Instrumenter */
public class C13993a {

    /* renamed from: a */
    private final C14033d f41139a;

    /* renamed from: b */
    private final C14028n f41140b = new C14028n();

    /* renamed from: i.b.a.a.c.j.b.a$a */
    /* compiled from: Instrumenter */
    class C13994a extends C13946g {
        C13994a(C13944e eVar, int i) {
            super(eVar, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public String mo44122b(String str, String str2) {
            throw new IllegalStateException();
        }
    }

    public C13993a(C14033d dVar) {
        this.f41139a = dVar;
    }

    /* renamed from: c */
    private int m60348c(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        int b = mo44288b(new GZIPInputStream(inputStream), gZIPOutputStream, str);
        gZIPOutputStream.finish();
        return b;
    }

    /* renamed from: d */
    private int m60349d(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int b = mo44288b(C13997c.m60369a(inputStream), byteArrayOutputStream, str);
        C13997c.m60370a(byteArrayOutputStream.toByteArray(), outputStream);
        return b;
    }

    /* renamed from: e */
    private int m60350e(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        int i = 0;
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!this.f41140b.mo44317a(name)) {
                    zipOutputStream.putNextEntry(new ZipEntry(name));
                    if (!this.f41140b.mo44318a(name, zipInputStream, zipOutputStream)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("@");
                        sb.append(name);
                        i += mo44288b(zipInputStream, zipOutputStream, sb.toString());
                    }
                    zipOutputStream.closeEntry();
                }
            } else {
                zipOutputStream.finish();
                return i;
            }
        }
    }

    /* renamed from: a */
    public void mo44284a(boolean z) {
        this.f41140b.mo44316a(z);
    }

    /* renamed from: b */
    public int mo44288b(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        C13995a aVar = new C13995a(inputStream);
        int b = aVar.mo44290b();
        if (b == -889275714) {
            mo44283a(aVar.mo44289a(), outputStream, str);
            return 1;
        } else if (b == -889270259) {
            return m60349d(aVar.mo44289a(), outputStream, str);
        } else {
            if (b == 529203200) {
                return m60348c(aVar.mo44289a(), outputStream, str);
            }
            if (b == 1347093252) {
                return m60350e(aVar.mo44289a(), outputStream, str);
            }
            m60347a(aVar.mo44289a(), outputStream);
            return 0;
        }
    }

    /* renamed from: a */
    public byte[] mo44285a(C13944e eVar) {
        C13994a aVar = new C13994a(eVar, 0);
        eVar.mo44079a((C13945f) new C14002a(new C14016b(C14025k.m60501a(eVar, this.f41139a), aVar), true), 8);
        return aVar.mo44126c();
    }

    /* renamed from: a */
    public byte[] mo44287a(byte[] bArr, String str) throws IOException {
        try {
            if (!C13996b.m60367c(bArr)) {
                return mo44285a(new C13944e(bArr));
            }
            byte[] a = mo44285a(new C13944e(C13996b.m60365a(bArr)));
            C13996b.m60368d(a);
            return a;
        } catch (RuntimeException e) {
            throw m60346a(str, e);
        }
    }

    /* renamed from: a */
    public byte[] mo44286a(InputStream inputStream, String str) throws IOException {
        try {
            return mo44287a(C13996b.m60364a(inputStream), str);
        } catch (RuntimeException e) {
            throw m60346a(str, e);
        }
    }

    /* renamed from: a */
    public void mo44283a(InputStream inputStream, OutputStream outputStream, String str) throws IOException {
        try {
            outputStream.write(mo44287a(C13996b.m60364a(inputStream), str));
        } catch (RuntimeException e) {
            throw m60346a(str, e);
        }
    }

    /* renamed from: a */
    private IOException m60346a(String str, RuntimeException runtimeException) {
        IOException iOException = new IOException(String.format("Error while instrumenting class %s.", new Object[]{str}));
        iOException.initCause(runtimeException);
        return iOException;
    }

    /* renamed from: a */
    private void m60347a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
