package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p149a.C2777c;

@C2776b(emulated = true)
/* renamed from: com.google.common.io.t */
/* compiled from: GwtWorkarounds */
final class C8410t {

    /* renamed from: com.google.common.io.t$a */
    /* compiled from: GwtWorkarounds */
    static class C8411a implements C8419i {

        /* renamed from: a */
        final /* synthetic */ Reader f22311a;

        C8411a(Reader reader) {
            this.f22311a = reader;
        }

        public void close() throws IOException {
            this.f22311a.close();
        }

        public int read() throws IOException {
            return this.f22311a.read();
        }
    }

    /* renamed from: com.google.common.io.t$b */
    /* compiled from: GwtWorkarounds */
    static class C8412b implements C8419i {

        /* renamed from: a */
        int f22312a = 0;

        /* renamed from: b */
        final /* synthetic */ CharSequence f22313b;

        C8412b(CharSequence charSequence) {
            this.f22313b = charSequence;
        }

        public void close() {
            this.f22312a = this.f22313b.length();
        }

        public int read() {
            if (this.f22312a >= this.f22313b.length()) {
                return -1;
            }
            CharSequence charSequence = this.f22313b;
            int i = this.f22312a;
            this.f22312a = i + 1;
            return charSequence.charAt(i);
        }
    }

    /* renamed from: com.google.common.io.t$c */
    /* compiled from: GwtWorkarounds */
    static class C8413c extends InputStream {

        /* renamed from: a */
        final /* synthetic */ C8417g f22314a;

        C8413c(C8417g gVar) {
            this.f22314a = gVar;
        }

        public void close() throws IOException {
            this.f22314a.close();
        }

        public int read() throws IOException {
            return this.f22314a.read();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            C7397x.m35664a(bArr);
            C7397x.m35675b(i, i + i2, bArr.length);
            if (i2 == 0) {
                return 0;
            }
            int read = read();
            if (read == -1) {
                return -1;
            }
            bArr[i] = (byte) read;
            for (int i3 = 1; i3 < i2; i3++) {
                int read2 = read();
                if (read2 == -1) {
                    return i3;
                }
                bArr[i + i3] = (byte) read2;
            }
            return i2;
        }
    }

    /* renamed from: com.google.common.io.t$d */
    /* compiled from: GwtWorkarounds */
    static class C8414d extends OutputStream {

        /* renamed from: a */
        final /* synthetic */ C8418h f22315a;

        C8414d(C8418h hVar) {
            this.f22315a = hVar;
        }

        public void close() throws IOException {
            this.f22315a.close();
        }

        public void flush() throws IOException {
            this.f22315a.flush();
        }

        public void write(int i) throws IOException {
            this.f22315a.mo23265a((byte) i);
        }
    }

    /* renamed from: com.google.common.io.t$e */
    /* compiled from: GwtWorkarounds */
    static class C8415e implements C8420j {

        /* renamed from: a */
        final /* synthetic */ Writer f22316a;

        C8415e(Writer writer) {
            this.f22316a = writer;
        }

        /* renamed from: a */
        public void mo23255a(char c) throws IOException {
            this.f22316a.append(c);
        }

        public void close() throws IOException {
            this.f22316a.close();
        }

        public void flush() throws IOException {
            this.f22316a.flush();
        }
    }

    /* renamed from: com.google.common.io.t$f */
    /* compiled from: GwtWorkarounds */
    static class C8416f implements C8420j {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f22317a;

        C8416f(StringBuilder sb) {
            this.f22317a = sb;
        }

        /* renamed from: a */
        public void mo23255a(char c) {
            this.f22317a.append(c);
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            return this.f22317a.toString();
        }
    }

    /* renamed from: com.google.common.io.t$g */
    /* compiled from: GwtWorkarounds */
    interface C8417g {
        void close() throws IOException;

        int read() throws IOException;
    }

    /* renamed from: com.google.common.io.t$h */
    /* compiled from: GwtWorkarounds */
    interface C8418h {
        /* renamed from: a */
        void mo23265a(byte b) throws IOException;

        void close() throws IOException;

        void flush() throws IOException;
    }

    /* renamed from: com.google.common.io.t$i */
    /* compiled from: GwtWorkarounds */
    interface C8419i {
        void close() throws IOException;

        int read() throws IOException;
    }

    /* renamed from: com.google.common.io.t$j */
    /* compiled from: GwtWorkarounds */
    interface C8420j {
        /* renamed from: a */
        void mo23255a(char c) throws IOException;

        void close() throws IOException;

        void flush() throws IOException;
    }

    private C8410t() {
    }

    @C2777c("Reader")
    /* renamed from: a */
    static C8419i m39979a(Reader reader) {
        C7397x.m35664a(reader);
        return new C8411a(reader);
    }

    /* renamed from: a */
    static C8419i m39980a(CharSequence charSequence) {
        C7397x.m35664a(charSequence);
        return new C8412b(charSequence);
    }

    @C2777c("InputStream")
    /* renamed from: a */
    static InputStream m39983a(C8417g gVar) {
        C7397x.m35664a(gVar);
        return new C8413c(gVar);
    }

    @C2777c("OutputStream")
    /* renamed from: a */
    static OutputStream m39984a(C8418h hVar) {
        C7397x.m35664a(hVar);
        return new C8414d(hVar);
    }

    @C2777c("Writer")
    /* renamed from: a */
    static C8420j m39982a(Writer writer) {
        C7397x.m35664a(writer);
        return new C8415e(writer);
    }

    /* renamed from: a */
    static C8420j m39981a(int i) {
        return new C8416f(new StringBuilder(i));
    }
}
