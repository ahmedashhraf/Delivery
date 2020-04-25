package com.google.gson.p321x;

import com.google.gson.C8787l;
import com.google.gson.p321x.p322m.C8887n;
import com.google.gson.stream.C8799d;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.google.gson.x.k */
/* compiled from: Streams */
public final class C8850k {

    /* renamed from: com.google.gson.x.k$a */
    /* compiled from: Streams */
    private static final class C8851a extends Writer {

        /* renamed from: a */
        private final Appendable f23207a;

        /* renamed from: b */
        private final C8852a f23208b = new C8852a();

        /* renamed from: com.google.gson.x.k$a$a */
        /* compiled from: Streams */
        static class C8852a implements CharSequence {

            /* renamed from: a */
            char[] f23209a;

            C8852a() {
            }

            public char charAt(int i) {
                return this.f23209a[i];
            }

            public int length() {
                return this.f23209a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f23209a, i, i2 - i);
            }
        }

        C8851a(Appendable appendable) {
            this.f23207a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(char[] cArr, int i, int i2) throws IOException {
            C8852a aVar = this.f23208b;
            aVar.f23209a = cArr;
            this.f23207a.append(aVar, i, i2 + i);
        }

        public void write(int i) throws IOException {
            this.f23207a.append((char) i);
        }
    }

    private C8850k() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C8788m.f23032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C8787l m41444a(com.google.gson.stream.C8795a r2) throws com.google.gson.JsonParseException {
        /*
            r2.peek()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.u<com.google.gson.l> r1 = com.google.gson.p321x.p322m.C8887n.f23304X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo32287a(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.l r2 = (com.google.gson.C8787l) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.m r2 = com.google.gson.C8788m.f23032a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8850k.m41444a(com.google.gson.stream.a):com.google.gson.l");
    }

    /* renamed from: a */
    public static void m41446a(C8787l lVar, C8799d dVar) throws IOException {
        C8887n.f23304X.mo32288a(dVar, lVar);
    }

    /* renamed from: a */
    public static Writer m41445a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C8851a(appendable);
    }
}
