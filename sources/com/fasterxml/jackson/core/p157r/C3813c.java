package com.fasterxml.jackson.core.p157r;

import com.fasterxml.jackson.core.C3789e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.r.c */
/* compiled from: InputAccessor */
public interface C3813c {

    /* renamed from: com.fasterxml.jackson.core.r.c$a */
    /* compiled from: InputAccessor */
    public static class C3814a implements C3813c {

        /* renamed from: a */
        protected final InputStream f11965a;

        /* renamed from: b */
        protected final byte[] f11966b;

        /* renamed from: c */
        protected final int f11967c;

        /* renamed from: d */
        protected int f11968d;

        /* renamed from: e */
        protected int f11969e;

        public C3814a(InputStream inputStream, byte[] bArr) {
            this.f11965a = inputStream;
            this.f11966b = bArr;
            this.f11967c = 0;
            this.f11969e = 0;
            this.f11968d = 0;
        }

        /* renamed from: a */
        public byte mo16864a() throws IOException {
            if (this.f11969e < this.f11968d || mo16865b()) {
                byte[] bArr = this.f11966b;
                int i = this.f11969e;
                this.f11969e = i + 1;
                return bArr[i];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed auto-detect: could not read more than ");
            sb.append(this.f11969e);
            sb.append(" bytes (max buffer size: ");
            sb.append(this.f11966b.length);
            sb.append(")");
            throw new EOFException(sb.toString());
        }

        /* renamed from: b */
        public boolean mo16865b() throws IOException {
            int i = this.f11969e;
            if (i < this.f11968d) {
                return true;
            }
            InputStream inputStream = this.f11965a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f11966b;
            int length = bArr.length - i;
            if (length < 1) {
                return false;
            }
            int read = inputStream.read(bArr, i, length);
            if (read <= 0) {
                return false;
            }
            this.f11968d += read;
            return true;
        }

        public void reset() {
            this.f11969e = this.f11967c;
        }

        /* renamed from: a */
        public C3812b mo16867a(C3789e eVar, C3815d dVar) {
            InputStream inputStream = this.f11965a;
            byte[] bArr = this.f11966b;
            int i = this.f11967c;
            C3812b bVar = new C3812b(inputStream, bArr, i, this.f11968d - i, eVar, dVar);
            return bVar;
        }

        public C3814a(byte[] bArr) {
            this.f11965a = null;
            this.f11966b = bArr;
            this.f11967c = 0;
            this.f11968d = bArr.length;
        }

        public C3814a(byte[] bArr, int i, int i2) {
            this.f11965a = null;
            this.f11966b = bArr;
            this.f11969e = i;
            this.f11967c = i;
            this.f11968d = i + i2;
        }
    }

    /* renamed from: a */
    byte mo16864a() throws IOException;

    /* renamed from: b */
    boolean mo16865b() throws IOException;

    void reset();
}
