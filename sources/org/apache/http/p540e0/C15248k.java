package org.apache.http.p540e0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: org.apache.http.e0.k */
/* compiled from: SerializableEntity */
public class C15248k extends C15238a {

    /* renamed from: O */
    private byte[] f44173O;

    /* renamed from: P */
    private Serializable f44174P;

    public C15248k(Serializable serializable, boolean z) throws IOException {
        if (serializable == null) {
            throw new IllegalArgumentException("Source object may not be null");
        } else if (z) {
            m67538a(serializable);
        } else {
            this.f44174P = serializable;
        }
    }

    /* renamed from: a */
    private void m67538a(Serializable serializable) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.flush();
        this.f44173O = byteArrayOutputStream.toByteArray();
    }

    public InputStream getContent() throws IOException, IllegalStateException {
        if (this.f44173O == null) {
            m67538a(this.f44174P);
        }
        return new ByteArrayInputStream(this.f44173O);
    }

    public long getContentLength() {
        byte[] bArr = this.f44173O;
        if (bArr == null) {
            return -1;
        }
        return (long) bArr.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return this.f44173O == null;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            byte[] bArr = this.f44173O;
            if (bArr == null) {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(this.f44174P);
                objectOutputStream.flush();
                return;
            }
            outputStream.write(bArr);
            outputStream.flush();
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }
}
