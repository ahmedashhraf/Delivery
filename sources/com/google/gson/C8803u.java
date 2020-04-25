package com.google.gson;

import com.google.gson.p321x.p322m.C8865e;
import com.google.gson.p321x.p322m.C8867f;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.google.gson.u */
/* compiled from: TypeAdapter */
public abstract class C8803u<T> {

    /* renamed from: com.google.gson.u$a */
    /* compiled from: TypeAdapter */
    class C8804a extends C8803u<T> {
        C8804a() {
        }

        /* renamed from: a */
        public void mo32288a(C8799d dVar, T t) throws IOException {
            if (t == null) {
                dVar.mo32456B();
            } else {
                C8803u.this.mo32288a(dVar, t);
            }
        }

        /* renamed from: a */
        public T mo32287a(C8795a aVar) throws IOException {
            if (aVar.peek() != C8798c.NULL) {
                return C8803u.this.mo32287a(aVar);
            }
            aVar.mo32441L();
            return null;
        }
    }

    /* renamed from: a */
    public abstract T mo32287a(C8795a aVar) throws IOException;

    /* renamed from: a */
    public abstract void mo32288a(C8799d dVar, T t) throws IOException;

    /* renamed from: a */
    public final void mo32484a(Writer writer, T t) throws IOException {
        mo32288a(new C8799d(writer), t);
    }

    /* renamed from: b */
    public final C8787l mo32485b(T t) {
        try {
            C8867f fVar = new C8867f();
            mo32288a((C8799d) fVar, t);
            return fVar.mo32615F();
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C8803u<T> mo32479a() {
        return new C8804a();
    }

    /* renamed from: a */
    public final String mo32483a(T t) {
        StringWriter stringWriter = new StringWriter();
        try {
            mo32484a((Writer) stringWriter, t);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final T mo32481a(Reader reader) throws IOException {
        return mo32287a(new C8795a(reader));
    }

    /* renamed from: a */
    public final T mo32482a(String str) throws IOException {
        return mo32481a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public final T mo32480a(C8787l lVar) {
        try {
            return mo32287a((C8795a) new C8865e(lVar));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }
}
