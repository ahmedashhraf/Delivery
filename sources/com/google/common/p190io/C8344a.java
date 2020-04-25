package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import p201f.p202a.C5952h;

/* renamed from: com.google.common.io.a */
/* compiled from: AppendableWriter */
class C8344a extends Writer {

    /* renamed from: a */
    private final Appendable f22240a;

    /* renamed from: b */
    private boolean f22241b;

    C8344a(Appendable appendable) {
        this.f22240a = (Appendable) C7397x.m35664a(appendable);
    }

    /* renamed from: a */
    private void m39713a() throws IOException {
        if (this.f22241b) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    public void close() throws IOException {
        this.f22241b = true;
        Appendable appendable = this.f22240a;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public void flush() throws IOException {
        m39713a();
        Appendable appendable = this.f22240a;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    public void write(char[] cArr, int i, int i2) throws IOException {
        m39713a();
        this.f22240a.append(new String(cArr, i, i2));
    }

    public void write(int i) throws IOException {
        m39713a();
        this.f22240a.append((char) i);
    }

    public Writer append(char c) throws IOException {
        m39713a();
        this.f22240a.append(c);
        return this;
    }

    public void write(@C5952h String str) throws IOException {
        m39713a();
        this.f22240a.append(str);
    }

    public Writer append(@C5952h CharSequence charSequence) throws IOException {
        m39713a();
        this.f22240a.append(charSequence);
        return this;
    }

    public void write(@C5952h String str, int i, int i2) throws IOException {
        m39713a();
        this.f22240a.append(str, i, i2 + i);
    }

    public Writer append(@C5952h CharSequence charSequence, int i, int i2) throws IOException {
        m39713a();
        this.f22240a.append(charSequence, i, i2);
        return this;
    }
}
