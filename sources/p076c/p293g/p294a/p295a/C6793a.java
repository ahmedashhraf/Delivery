package p076c.p293g.p294a.p295a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p205i.p471b.p472a.p473a.C13928b;

@Deprecated
/* renamed from: c.g.a.a.a */
/* compiled from: RT */
public final class C6793a {
    private C6793a() {
    }

    /* renamed from: a */
    public static void m32470a(File file, boolean z, boolean z2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file, z);
        try {
            fileOutputStream.write(C13928b.m59861a().mo44037a(false));
        } finally {
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public static synchronized void m32469a(File file, boolean z) throws IOException {
        synchronized (C6793a.class) {
            m32470a(file, true, z);
        }
    }
}
