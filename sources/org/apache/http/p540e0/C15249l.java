package org.apache.http.p540e0;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: org.apache.http.e0.l */
/* compiled from: StringEntity */
public class C15249l extends C15238a implements Cloneable {

    /* renamed from: O */
    protected final byte[] f44175O;

    public C15249l(String str, String str2) throws UnsupportedEncodingException {
        if (str != null) {
            if (str2 == null) {
                str2 = "ISO-8859-1";
            }
            this.f44175O = str.getBytes(str2);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("text/plain; charset=");
            stringBuffer.append(str2);
            mo47162b(stringBuffer.toString());
            return;
        }
        throw new IllegalArgumentException("Source string may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public InputStream getContent() throws IOException {
        return new ByteArrayInputStream(this.f44175O);
    }

    public long getContentLength() {
        return (long) this.f44175O.length;
    }

    public boolean isRepeatable() {
        return true;
    }

    public boolean isStreaming() {
        return false;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            outputStream.write(this.f44175O);
            outputStream.flush();
            return;
        }
        throw new IllegalArgumentException("Output stream may not be null");
    }

    public C15249l(String str) throws UnsupportedEncodingException {
        this(str, null);
    }
}
