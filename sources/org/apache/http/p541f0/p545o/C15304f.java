package org.apache.http.p541f0.p545o;

import com.facebook.appevents.AppEventsConstants;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.p546g0.C15322f;

/* renamed from: org.apache.http.f0.o.f */
/* compiled from: ChunkedOutputStream */
public class C15304f extends OutputStream {

    /* renamed from: N */
    private int f44336N;

    /* renamed from: O */
    private boolean f44337O;

    /* renamed from: P */
    private boolean f44338P;

    /* renamed from: a */
    private final C15322f f44339a;

    /* renamed from: b */
    private byte[] f44340b;

    public C15304f(C15322f fVar, int i) throws IOException {
        this.f44336N = 0;
        this.f44337O = false;
        this.f44338P = false;
        this.f44340b = new byte[i];
        this.f44339a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo47381a(byte[] bArr, int i, int i2) throws IOException {
        this.f44339a.mo47272a(Integer.toHexString(this.f44336N + i2));
        this.f44339a.write(this.f44340b, 0, this.f44336N);
        this.f44339a.write(bArr, i, i2);
        this.f44339a.mo47272a("");
        this.f44336N = 0;
    }

    public void close() throws IOException {
        if (!this.f44338P) {
            this.f44338P = true;
            mo47380a();
            this.f44339a.flush();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo47383d() throws IOException {
        int i = this.f44336N;
        if (i > 0) {
            this.f44339a.mo47272a(Integer.toHexString(i));
            this.f44339a.write(this.f44340b, 0, this.f44336N);
            this.f44339a.mo47272a("");
            this.f44336N = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo47384e() throws IOException {
        this.f44339a.mo47272a(AppEventsConstants.EVENT_PARAM_VALUE_NO);
        this.f44339a.mo47272a("");
    }

    public void flush() throws IOException {
        mo47383d();
        this.f44339a.flush();
    }

    public void write(int i) throws IOException {
        if (!this.f44338P) {
            byte[] bArr = this.f44340b;
            int i2 = this.f44336N;
            bArr[i2] = (byte) i;
            this.f44336N = i2 + 1;
            if (this.f44336N == bArr.length) {
                mo47383d();
                return;
            }
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }

    /* renamed from: a */
    public void mo47380a() throws IOException {
        if (!this.f44337O) {
            mo47383d();
            mo47384e();
            this.f44337O = true;
        }
    }

    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public C15304f(C15322f fVar) throws IOException {
        this(fVar, 2048);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f44338P) {
            byte[] bArr2 = this.f44340b;
            int length = bArr2.length;
            int i3 = this.f44336N;
            if (i2 >= length - i3) {
                mo47381a(bArr, i, i2);
                return;
            }
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.f44336N += i2;
            return;
        }
        throw new IOException("Attempted write to closed stream.");
    }
}
