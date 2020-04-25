package com.fasterxml.jackson.core.p158s;

import com.fasterxml.jackson.core.C3802m;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/* renamed from: com.fasterxml.jackson.core.s.l */
/* compiled from: SerializedString */
public class C3827l implements C3802m, Serializable {

    /* renamed from: N */
    protected byte[] f12037N;

    /* renamed from: O */
    protected char[] f12038O;

    /* renamed from: P */
    protected transient String f12039P;

    /* renamed from: a */
    protected final String f12040a;

    /* renamed from: b */
    protected byte[] f12041b;

    public C3827l(String str) {
        if (str != null) {
            this.f12040a = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        this.f12039P = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this.f12040a);
    }

    /* renamed from: a */
    public final char[] mo16776a() {
        char[] cArr = this.f12038O;
        if (cArr != null) {
            return cArr;
        }
        char[] b = C3821f.m16294a().mo16896b(this.f12040a);
        this.f12038O = b;
        return b;
    }

    /* renamed from: b */
    public int mo16780b(char[] cArr, int i) {
        char[] cArr2 = this.f12038O;
        if (cArr2 == null) {
            cArr2 = C3821f.m16294a().mo16896b(this.f12040a);
            this.f12038O = cArr2;
        }
        int length = cArr2.length;
        if (i + length > cArr.length) {
            return -1;
        }
        System.arraycopy(cArr2, 0, cArr, i, length);
        return length;
    }

    /* renamed from: d */
    public final byte[] mo16781d() {
        byte[] bArr = this.f12041b;
        if (bArr != null) {
            return bArr;
        }
        byte[] c = C3821f.m16294a().mo16897c(this.f12040a);
        this.f12041b = c;
        return c;
    }

    /* renamed from: e */
    public final byte[] mo16782e() {
        byte[] bArr = this.f12037N;
        if (bArr != null) {
            return bArr;
        }
        byte[] a = C3821f.m16294a().mo16895a(this.f12040a);
        this.f12037N = a;
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C3827l.class) {
            return false;
        }
        return this.f12040a.equals(((C3827l) obj).f12040a);
    }

    /* renamed from: f */
    public final int mo16783f() {
        return this.f12040a.length();
    }

    public final String getValue() {
        return this.f12040a;
    }

    public final int hashCode() {
        return this.f12040a.hashCode();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new C3827l(this.f12039P);
    }

    public final String toString() {
        return this.f12040a;
    }

    /* renamed from: a */
    public int mo16774a(byte[] bArr, int i) {
        byte[] bArr2 = this.f12041b;
        if (bArr2 == null) {
            bArr2 = C3821f.m16294a().mo16897c(this.f12040a);
            this.f12041b = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    /* renamed from: b */
    public int mo16779b(byte[] bArr, int i) {
        byte[] bArr2 = this.f12037N;
        if (bArr2 == null) {
            bArr2 = C3821f.m16294a().mo16895a(this.f12040a);
            this.f12037N = bArr2;
        }
        int length = bArr2.length;
        if (i + length > bArr.length) {
            return -1;
        }
        System.arraycopy(bArr2, 0, bArr, i, length);
        return length;
    }

    /* renamed from: a */
    public int mo16775a(char[] cArr, int i) {
        String str = this.f12040a;
        int length = str.length();
        if (i + length > cArr.length) {
            return -1;
        }
        str.getChars(0, length, cArr, i);
        return length;
    }

    /* renamed from: b */
    public int mo16777b(OutputStream outputStream) throws IOException {
        byte[] bArr = this.f12037N;
        if (bArr == null) {
            bArr = C3821f.m16294a().mo16895a(this.f12040a);
            this.f12037N = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    /* renamed from: a */
    public int mo16772a(OutputStream outputStream) throws IOException {
        byte[] bArr = this.f12041b;
        if (bArr == null) {
            bArr = C3821f.m16294a().mo16897c(this.f12040a);
            this.f12041b = bArr;
        }
        int length = bArr.length;
        outputStream.write(bArr, 0, length);
        return length;
    }

    /* renamed from: b */
    public int mo16778b(ByteBuffer byteBuffer) {
        byte[] bArr = this.f12041b;
        if (bArr == null) {
            bArr = C3821f.m16294a().mo16897c(this.f12040a);
            this.f12041b = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }

    /* renamed from: a */
    public int mo16773a(ByteBuffer byteBuffer) {
        byte[] bArr = this.f12037N;
        if (bArr == null) {
            bArr = C3821f.m16294a().mo16895a(this.f12040a);
            this.f12037N = bArr;
        }
        int length = bArr.length;
        if (length > byteBuffer.remaining()) {
            return -1;
        }
        byteBuffer.put(bArr, 0, length);
        return length;
    }
}
