package com.google.gson;

import com.google.gson.p321x.C8850k;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.gson.s */
/* compiled from: JsonStreamParser */
public final class C8794s implements Iterator<C8787l> {

    /* renamed from: a */
    private final C8795a f23036a;

    /* renamed from: b */
    private final Object f23037b;

    public C8794s(String str) {
        this((Reader) new StringReader(str));
    }

    public boolean hasNext() {
        boolean z;
        synchronized (this.f23037b) {
            try {
                z = this.f23036a.peek() != C8798c.END_DOCUMENT;
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C8794s(Reader reader) {
        this.f23036a = new C8795a(reader);
        this.f23036a.mo32445a(true);
        this.f23037b = new Object();
    }

    public C8787l next() throws JsonParseException {
        String str = "Failed parsing JSON source to Json";
        if (hasNext()) {
            try {
                return C8850k.m41444a(this.f23036a);
            } catch (StackOverflowError e) {
                throw new JsonParseException(str, e);
            } catch (OutOfMemoryError e2) {
                throw new JsonParseException(str, e2);
            } catch (JsonParseException e3) {
                e = e3;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }
}
