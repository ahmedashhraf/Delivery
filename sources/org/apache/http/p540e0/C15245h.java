package org.apache.http.p540e0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: org.apache.http.e0.h */
/* compiled from: FileEntity */
public class C15245h extends C15238a implements Cloneable {

    /* renamed from: O */
    protected final File f44167O;

    public C15245h(File file, String str) {
        if (file != null) {
            this.f44167O = file;
            mo47162b(str);
            return;
        }
        throw new IllegalArgumentException("File may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() throws IOException {
        return new FileInputStream(this.f44167O);
    }

    public long getContentLength() {
        return this.f44167O.length();
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            FileInputStream fileInputStream = new FileInputStream(this.f44167O);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } finally {
                fileInputStream.close();
            }
        } else {
            throw new IllegalArgumentException("Output stream may not be null");
        }
    }
}
