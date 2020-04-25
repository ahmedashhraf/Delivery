package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.io.b0 */
/* compiled from: MultiReader */
class C8347b0 extends Reader {

    /* renamed from: a */
    private final Iterator<? extends C8377j> f22244a;

    /* renamed from: b */
    private Reader f22245b;

    C8347b0(Iterator<? extends C8377j> it) throws IOException {
        this.f22244a = it;
        m39715a();
    }

    /* renamed from: a */
    private void m39715a() throws IOException {
        close();
        if (this.f22244a.hasNext()) {
            this.f22245b = ((C8377j) this.f22244a.next()).mo31462d();
        }
    }

    public void close() throws IOException {
        Reader reader = this.f22245b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f22245b = null;
            }
        }
    }

    public int read(@C5952h char[] cArr, int i, int i2) throws IOException {
        Reader reader = this.f22245b;
        if (reader == null) {
            return -1;
        }
        int read = reader.read(cArr, i, i2);
        if (read != -1) {
            return read;
        }
        m39715a();
        return read(cArr, i, i2);
    }

    public boolean ready() throws IOException {
        Reader reader = this.f22245b;
        return reader != null && reader.ready();
    }

    public long skip(long j) throws IOException {
        C7397x.m35671a(j >= 0, (Object) "n is negative");
        if (j > 0) {
            while (true) {
                Reader reader = this.f22245b;
                if (reader == null) {
                    break;
                }
                long skip = reader.skip(j);
                if (skip > 0) {
                    return skip;
                }
                m39715a();
            }
        }
        return 0;
    }
}
