package com.google.gson;

import com.google.gson.p321x.C8850k;
import com.google.gson.stream.C8795a;
import com.google.gson.stream.C8798c;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* renamed from: com.google.gson.o */
/* compiled from: JsonParser */
public final class C8790o {
    /* renamed from: a */
    public C8787l mo32421a(String str) throws JsonSyntaxException {
        return mo32420a((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public C8787l mo32420a(Reader reader) throws JsonIOException, JsonSyntaxException {
        try {
            C8795a aVar = new C8795a(reader);
            C8787l a = mo32419a(aVar);
            if (!a.mo32391A()) {
                if (aVar.peek() != C8798c.END_DOCUMENT) {
                    throw new JsonSyntaxException("Did not consume the entire document.");
                }
            }
            return a;
        } catch (MalformedJsonException e) {
            throw new JsonSyntaxException((Throwable) e);
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (NumberFormatException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        }
    }

    /* renamed from: a */
    public C8787l mo32419a(C8795a aVar) throws JsonIOException, JsonSyntaxException {
        String str = " to Json";
        String str2 = "Failed parsing JSON source: ";
        boolean B = aVar.mo32434B();
        aVar.mo32445a(true);
        try {
            C8787l a = C8850k.m41444a(aVar);
            aVar.mo32445a(B);
            return a;
        } catch (StackOverflowError e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(aVar);
            sb.append(str);
            throw new JsonParseException(sb.toString(), e);
        } catch (OutOfMemoryError e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(aVar);
            sb2.append(str);
            throw new JsonParseException(sb2.toString(), e2);
        } catch (Throwable th) {
            aVar.mo32445a(B);
            throw th;
        }
    }
}
