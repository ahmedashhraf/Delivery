package com.google.common.p190io;

import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;

@C2775a
/* renamed from: com.google.common.io.s */
/* compiled from: Flushables */
public final class C8409s {

    /* renamed from: a */
    private static final Logger f22310a = Logger.getLogger(C8409s.class.getName());

    private C8409s() {
    }

    /* renamed from: a */
    public static void m39978a(Flushable flushable, boolean z) throws IOException {
        try {
            flushable.flush();
        } catch (IOException e) {
            if (z) {
                f22310a.log(Level.WARNING, "IOException thrown while flushing Flushable.", e);
                return;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static void m39977a(Flushable flushable) {
        try {
            m39978a(flushable, true);
        } catch (IOException e) {
            f22310a.log(Level.SEVERE, "IOException should not have been thrown.", e);
        }
    }
}
