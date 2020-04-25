package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.common.io.i */
/* compiled from: CharSink */
public abstract class C8376i implements C8349c0<Writer> {
    protected C8376i() {
    }

    /* renamed from: b */
    public Writer mo31494b() throws IOException {
        Writer c = mo31445c();
        return c instanceof BufferedWriter ? (BufferedWriter) c : new BufferedWriter(c);
    }

    /* renamed from: c */
    public abstract Writer mo31445c() throws IOException;

    @Deprecated
    /* renamed from: a */
    public final Writer m39830a() throws IOException {
        return mo31445c();
    }

    /* renamed from: a */
    public void mo31491a(CharSequence charSequence) throws IOException {
        C7397x.m35664a(charSequence);
        C8390m a = C8390m.m39900a();
        try {
            Writer writer = (Writer) a.mo31523a(mo31445c());
            writer.append(charSequence);
            writer.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo31492a(Iterable<? extends CharSequence> iterable) throws IOException {
        mo31493a(iterable, System.getProperty("line.separator"));
    }

    /* renamed from: a */
    public void mo31493a(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        C7397x.m35664a(iterable);
        C7397x.m35664a(str);
        C8390m a = C8390m.m39900a();
        try {
            Writer writer = (Writer) a.mo31523a(mo31494b());
            for (CharSequence append : iterable) {
                writer.append(append).append(str);
            }
            writer.flush();
            a.close();
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }

    /* renamed from: a */
    public long mo31490a(Readable readable) throws IOException {
        C7397x.m35664a(readable);
        C8390m a = C8390m.m39900a();
        try {
            Writer writer = (Writer) a.mo31523a(mo31445c());
            long a2 = C8383k.m39870a(readable, (Appendable) writer);
            writer.flush();
            a.close();
            return a2;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
