package com.google.common.p190io;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2778d;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.io.l */
/* compiled from: Closeables */
public final class C8389l {
    @C2778d

    /* renamed from: a */
    static final Logger f22285a = Logger.getLogger(C8389l.class.getName());

    private C8389l() {
    }

    /* renamed from: a */
    public static void m39897a(@C5952h Closeable closeable, boolean z) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (z) {
                    f22285a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m39898a(@C5952h InputStream inputStream) {
        try {
            m39897a(inputStream, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static void m39899a(@C5952h Reader reader) {
        try {
            m39897a(reader, true);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
