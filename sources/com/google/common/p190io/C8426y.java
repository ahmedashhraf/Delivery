package com.google.common.p190io;

import com.google.common.base.C7397x;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p150g.C6641g;

@C2775a
/* renamed from: com.google.common.io.y */
/* compiled from: LittleEndianDataInputStream */
public final class C8426y extends FilterInputStream implements DataInput {
    public C8426y(InputStream inputStream) {
        super((InputStream) C7397x.m35664a(inputStream));
    }

    /* renamed from: a */
    private byte m39998a() throws IOException, EOFException {
        int read = this.in.read();
        if (-1 != read) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public boolean readBoolean() throws IOException {
        return readUnsignedByte() != 0;
    }

    public byte readByte() throws IOException {
        return (byte) readUnsignedByte();
    }

    public char readChar() throws IOException {
        return (char) readUnsignedShort();
    }

    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr) throws IOException {
        C8366g.m39807a((InputStream) this, bArr);
    }

    public int readInt() throws IOException {
        byte a = m39998a();
        byte a2 = m39998a();
        return C6637f.m31655a(m39998a(), m39998a(), a2, a);
    }

    public String readLine() {
        throw new UnsupportedOperationException("readLine is not supported");
    }

    public long readLong() throws IOException {
        byte a = m39998a();
        byte a2 = m39998a();
        byte a3 = m39998a();
        byte a4 = m39998a();
        byte a5 = m39998a();
        byte a6 = m39998a();
        return C6641g.m31694a(m39998a(), m39998a(), a6, a5, a4, a3, a2, a);
    }

    public short readShort() throws IOException {
        return (short) readUnsignedShort();
    }

    public String readUTF() throws IOException {
        return new DataInputStream(this.in).readUTF();
    }

    public int readUnsignedByte() throws IOException {
        int read = this.in.read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException();
    }

    public int readUnsignedShort() throws IOException {
        return C6637f.m31655a(0, 0, m39998a(), m39998a());
    }

    public int skipBytes(int i) throws IOException {
        return (int) this.in.skip((long) i);
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        C8366g.m39818b(this, bArr, i, i2);
    }
}
